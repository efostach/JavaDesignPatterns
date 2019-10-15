package com.efostach.behavioral.state;

public class TCPConnection {
    ConnectionState state;

    public void setState(ConnectionState state) {
        this.state = state;
    }

    public void changeState() {
        if (state instanceof Closed) {
            setState(new Listen());
        } else if (state instanceof Listen) {
            setState(new SynSent());
        } else if (state instanceof SynSent) {
            setState(new SynRcvd());
        } else if (state instanceof SynRcvd) {
            setState(new FinWait());
        } else if (state instanceof FinWait) {
            setState(new Established());
        } else if (state instanceof Established) {
            setState(new CloseWait());
        } else if (state instanceof CloseWait) {
            setState(new LastAck());
        } else if (state instanceof LastAck) {
            setState(new Closed());
        }
    }

    public void sentMessage() {
        state.sendMessage();
    }
}
