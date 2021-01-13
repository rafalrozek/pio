package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    private defaultCountingOutRhymer countingOutTemp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            getCountingOutTemp().countIn(super.countOut());

        int ret = getCountingOutTemp().countOut();

        while (!getCountingOutTemp().callCheck())
            countIn(getCountingOutTemp().countOut());

        return ret;
    }

    public defaultCountingOutRhymer getCountingOutTemp() {
        return countingOutTemp;
    }
}
