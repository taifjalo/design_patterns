package chain_of_responsibility;

// Create a program that handles different forms of customer feedback messages. Customer feedback can include compensation claims, contact requests, development suggestions, and general feedback. Each type of feedback requires different handling and response.
public enum MessageType {
    COMPENSATION_CLAIM,
    CONTACT_REQUEST,
    DEVELOPMENT_SUGGESTION,
    GENERAL_FEEDBACK
}
