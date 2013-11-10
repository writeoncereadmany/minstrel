package com.writeoncereadmany.minstrel.scope;

/**
 * Created by tom on 10/11/2013.
 */
public class DeBruijnIndex {

    private final int depth;
    private final int position;

    public DeBruijnIndex(int depth, int position) {
        this.depth = depth;
        this.position = position;
    }

    public int getDepth() {
        return depth;
    }

    public int getPosition() {
        return position;
    }

    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(!(o instanceof DeBruijnIndex)) return false;
        DeBruijnIndex other = (DeBruijnIndex)o;
        return this.depth == other.getDepth() && this.position == other.getPosition();
    }

    public int hashCode()
    {
        return (depth * 31) + position;
    }
}
