package kz.zsanzharrko.exception.game;

public final class GameStartException extends GameException {
  public GameStartException(String message, Throwable throwable) {
    super(message, throwable);
  }

  public GameStartException(String message) {
    super(message);
  }
}
