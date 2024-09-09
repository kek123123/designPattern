package main.structure.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        return Math.twiceOf(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        return Math.halfOf(f.doubleValue()).floatValue();
    }
}
