import com.swirlds.platform.*;

import java.io.IOException;
import java.time.Instant;

public class HelloSwirldState implements SwirldState {

    @Override
    public void init(Platform platform, AddressBook addressBook) {

    }

    @Override
    public AddressBook getAddressBookCopy() {
        return null;
    }

    @Override
    public void copyFrom(SwirldState swirldState) {

    }

    @Override
    public void handleTransaction(long l, boolean b, Instant instant, byte[] bytes, Address address) {

    }

    @Override
    public void noMoreTransactions() {

    }

    @Override
    public FastCopyable copy() {
        return new HelloSwirldState();
    }

    @Override
    public void copyTo(FCDataOutputStream fcDataOutputStream) throws IOException {

    }

    @Override
    public void copyFrom(FCDataInputStream fcDataInputStream) throws IOException {

    }
}
