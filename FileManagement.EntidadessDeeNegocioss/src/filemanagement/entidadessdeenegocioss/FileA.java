/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filemanagement.entidadessdeenegocioss;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class FileA {
    
    private int id;
    private String nameFile;
    private String extension;
    private String mimeType;
    private Date creationDate;
    private byte[] files;
    private String url;
    private String typeStorage;

    public FileA() {
    }

    public FileA(int id, String nameFile, String extension, String mimeType, Date creationDate, byte[] files, String url, String typeStorage) {
        this.id = id;
        this.nameFile = nameFile;
        this.extension = extension;
        this.mimeType = mimeType;
        this.creationDate = creationDate;
        this.files = files;
        this.url = url;
        this.typeStorage = typeStorage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameFile() {
        return nameFile;
    }

    public void setNameFile(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public byte[] getFiles() {
        return files;
    }

    public void setFiles(byte[] files) {
        this.files = files;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTypeStorage() {
        return typeStorage;
    }

    public void setTypeStorage(String typeStorage) {
        this.typeStorage = typeStorage;
    }
    
    
}
