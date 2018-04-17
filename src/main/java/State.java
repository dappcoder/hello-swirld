import com.swirlds.platform.*;

import java.io.IOException;
import java.time.Instant;

public class State implements SwirldState {

    /**
     * Initialize everything to reflect the consensus state at the start of history, before any transactions have happened.
     */
    @Override
    public void init(Platform platform, AddressBook addressBook) {

    }

    /**
     * Return a deep copy of the the current address book.
     */
    @Override
    public AddressBook getAddressBookCopy() {
        return null;
    }

    /**
     * Copy all of the consensus state from old to this.
     */
    @Override
    public void copyFrom(SwirldState oldState) {

    }

    /**
     * Given a transaction, update the state to reflect its effect.
     */
    @Override
    public void handleTransaction(long id, boolean isConsensus, Instant timestamp, byte[] transaction, Address address) {

    }

    /**
     * For a given SwirldState object, the Platform will call handleTransaction multiple times,
     * then call noMoreTransactions() once, then never call handleTransaction again.
     *
     * Good place to stop any threads that may have been created by handleTransaction
     */
    @Override
    public void noMoreTransactions() {

    }

    @Override
    public FastCopyable copy() {
        return new State();
    }

    /**
     * Serialize this to the given DataOutputStream.
     */
    @Override
    public void copyTo(FCDataOutputStream outputStream) throws IOException {

    }

    /**
     * Make this object be an exact copy of the object that was serialized to the given stream.
     */
    @Override
    public void copyFrom(FCDataInputStream inputStream) throws IOException {

    }
}
