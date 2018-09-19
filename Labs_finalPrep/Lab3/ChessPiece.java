package Lab3;

public abstract class ChessPiece {
    private int value;

    public ChessPiece(int value) {
        this.value = value;
    }

    public abstract void move();

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ChessPiece [value=" + value + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChessPiece)) {
            return false;
        }
        if (this.value == ((ChessPiece) obj).value) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + this.value;
        return result;
    }
}
