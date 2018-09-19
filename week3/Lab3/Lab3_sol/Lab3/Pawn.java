package Lab3;

public class Pawn extends ChessPiece {
    private static final int PAWN_IMPORTANCE = 1;
    private boolean hasBeenPromoted;
    private ChessPiece newPiece;

    public Pawn() {
        super(PAWN_IMPORTANCE);
        this.hasBeenPromoted = false;
    }

    @Override
    public String toString() {
        return "Pawn [hasBeenPromoted=" + hasBeenPromoted()
                + ", newPiece=" + newPiece + ", value=" + getValue() + "]";
    }

    @Override
    public void move() {
        System.out.println("forward 1");
    }

    public void promote(ChessPiece newPiece) {
        // If the piece is not a king or pawn, the pawn can be promoted
        if (!(newPiece instanceof King) && !(newPiece instanceof Pawn)) {
            setNewPiece(newPiece);
            setHasBeenPromoted(true);
        }
    }

    public ChessPiece getNewPiece() {
        return newPiece;
    }

    public void setNewPiece(ChessPiece newPiece) {
        if (newPiece != null) {
            this.newPiece = newPiece;
        }
    }

    public boolean hasBeenPromoted() {
        return hasBeenPromoted;
    }

    public void setHasBeenPromoted(boolean hasBeenPromoted) {
        this.hasBeenPromoted = hasBeenPromoted;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pawn)) {
            return false;
        }

        if (this.hasBeenPromoted != ((Pawn) obj).hasBeenPromoted) {
            return false;
        }

        if (this.newPiece == null) {
            if (((Pawn) obj).newPiece != null) {
                return false;
            }
        } else if (!newPiece.equals(((Pawn) obj).newPiece)) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + newPiece.hashCode();
        return result;
    }
}
