package dev.arydalex.Application.modules.responses;

public class LockResponse {

    private String lockId;
    private String lockName;
    private String lockDescription;
    private String lockImage;

    public String getLockId() {
        return lockId;
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

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    public void setLockDescription(String lockDescription) {
        this.lockDescription = lockDescription;
    }

    public void setLockImage(String lockImage) {
        this.lockImage = lockImage;
    }

    @Override
    public String toString() {
        return "LockResponse{" +
                "lockId='" + lockId + '\'' +
                ", lockName='" + lockName + '\'' +
                ", lockDescription='" + lockDescription + '\'' +
                ", lockImage='" + lockImage + '\'' +
                '}';
    }

}
