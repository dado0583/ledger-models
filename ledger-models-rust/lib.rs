pub mod fintekkers {
    pub mod models {
        pub mod portfolio {
            include!("fintekkers.models.portfolio.rs");
        }
        pub mod position {
            include!("fintekkers.models.position.rs");

        }
        pub mod price {
            include!("fintekkers.models.price.rs");
            
        }
        pub mod security {
            include!("fintekkers.models.security.rs");  
        }
        pub mod strategy {
            include!("fintekkers.models.strategy.rs");
            
        }
        pub mod transaction { 
            include!("fintekkers.models.transaction.rs");

        }
        pub mod util {
            include!("fintekkers.models.util.rs");

            pub mod lock {
                include!("fintekkers.models.util.lock.rs");
            }
        }
    }

    pub mod requests {
        pub mod portfolio {
            include!("fintekkers.requests.portfolio.rs");
        }
        pub mod position {
            include!("fintekkers.requests.position.rs");
        }
        pub mod price {
            
        }
        pub mod security {
            include!("fintekkers.requests.security.rs");
        }
        pub mod strategy {
            
        }
        pub mod transaction { 
            include!("fintekkers.requests.transaction.rs");

        }
        pub mod util {
            pub mod lock {
                include!("fintekkers.requests.util.lock.rs");
                
            }
            pub mod errors {
                include!("fintekkers.requests.util.errors.rs");
            }
            include!("fintekkers.requests.util.rs");
        }
        pub mod valuation {
            include!("fintekkers.requests.valuation.rs");
        }
    }

    pub mod services {
        pub mod lock_service {
            include!("fintekkers.services.lock_service.rs");
        }
        pub mod position_service {
            include!("fintekkers.services.position_service.rs");
        }
        pub mod security_service {
            include!("fintekkers.services.security_service.rs");
        }
        pub mod valuation_service {
            include!("fintekkers.services.valuation_service.rs");
        }
    }
}

#[cfg(test)]
mod tests {
    use prost_types::Timestamp;

    use crate::fintekkers;

    #[test]
    fn it_works() {

        let now_timestamp = Timestamp::default();
        let now_wrapped_timestap = Some(now_timestamp);

        let as_of_timestamp = fintekkers::models::util::LocalTimestampProto {
            time_zone: String::from("America/New_York"),
            timestamp: now_wrapped_timestap
        };

        let portfolio = fintekkers::models::portfolio::PortfolioProto { 
            as_of:  Some(as_of_timestamp),
            object_class: String::from("Portfolio"),
            version: String::from("0.0.1"),
            portfolio_name: String::from("PortfolioName"),
            is_link: false,
            uuid: None

        };

        assert_eq!(portfolio.portfolio_name, String::from("PortfolioName"))
    }
}