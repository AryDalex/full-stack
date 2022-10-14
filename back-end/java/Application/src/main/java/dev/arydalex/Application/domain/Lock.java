package dev.arydalex.Application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
public class Lock {

    @Id
    private String id;

    private String lockId;
    private String lockName;
    private String lockDescription;
    private String lockImage;
    private Date creationDate = new Date();

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

    public Date getCreationDate() {
        return creationDate;
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

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

}
