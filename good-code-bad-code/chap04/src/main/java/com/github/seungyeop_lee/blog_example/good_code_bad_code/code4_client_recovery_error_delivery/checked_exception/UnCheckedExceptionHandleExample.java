package com.github.seungyeop_lee.blog_example.good_code_bad_code.code4_client_recovery_error_delivery.checked_exception;

public class UnCheckedExceptionHandleExample {
    private static class CatchByCase {
        Boolean isDataFileValid(byte[] fileContents) {
            try {
                DataFile.parse(fileContents);
                return true;
            } catch (InvalidEncodingException |
                     ParseException |
                     UnrecognizedDataKeyException e) {
                return false;
            }
        }
    }

    private static class CatchAll {
        Boolean isDataFileValid(byte[] fileContents) {
            try {
                DataFile.parse(fileContents);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    private static class DataFile {
        public static void parse(byte[] fileContents) {
        }
    }

    private static class InvalidEncodingException extends RuntimeException {
    }

    private static class ParseException extends RuntimeException {
    }

    private static class UnrecognizedDataKeyException extends RuntimeException {
    }
}
