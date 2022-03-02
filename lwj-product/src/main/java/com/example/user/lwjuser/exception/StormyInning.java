package com.example.user.lwjuser.exception;

/**
 * 异常的限制  p271
 *
 * @author wejie110
 */
class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Foul, Strike;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    @Override
    public void event() {
    }

    @Override
    public void atBat() throws PopFoul {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul popFoul) {
            System.out.println("pop foul");
        } catch (RainedOut rainedOut) {
            System.out.println("RainedOut");
        } catch (BaseballException e) {
            System.out.println("BaseballException");
        }

        try {
            Inning i = new StormyInning();

            i.atBat();
        } catch (Foul foul) {
            System.out.println("foul");
        } catch (Strike strike) {
            System.out.println("strike");
        } catch (BaseballException e) {
            System.out.println("BaseballException");
        } catch (RainedOut rainedOut) {
            System.out.println("RainedOut");
        }
    }
}
