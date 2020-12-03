package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer countingOutTemp = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            countingOutTemp.countIn(super.countOut());

        int ret = countingOutTemp.countOut();

        while (!countingOutTemp.callCheck())
            countIn(countingOutTemp.countOut());

        return ret;
    }
}
