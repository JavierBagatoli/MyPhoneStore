package com.example.MyPhoneStore.config;

import org.hibernate.envers.RevisionListener;

import com.example.MyPhoneStore.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) {
        final Revision revision = (Revision) revisionEntity;
    }

}
