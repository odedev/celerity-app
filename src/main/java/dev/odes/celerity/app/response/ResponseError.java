package dev.odes.celerity.app.response;

public class ResponseError {
  private Object error;
  private String message;
  private Integer code;
  private Boolean isOk;

  public ResponseError(Object error) {
    this.error = error;
    this.message = null;
    this.code = 400;
    this.isOk = false;
  }

  public ResponseError(String message) {
    this.error = null;
    this.message = message;
    this.code = 400;
    this.isOk = false;
  }

  public ResponseError(Object error, String message) {
    this.error = error;
    this.message = message;
    this.code = 400;
    this.isOk = false;
  }
}
