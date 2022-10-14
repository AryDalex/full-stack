package dev.arydalex.Application.modules.requests;

public class LockRequest {

    private String lockName;
    private String lockDescription;
    private String lockImage;

    public LockRequest() {
    }

    public String getLockName() {
        return lockName;
    }

    public String getLockDescription() {
        return lockDescription;
    }

    public String getLockImage() {
        return lockImage;
    }

    @Override
    public String toString() {
        return "LockRequest{" +
                "lockName='" + lockName + '\'' +
                ", lockDescription='" + lockDescription + '\'' +
                ", lockImage='" + lockImage + '\'' +
                '}';
    }

}
