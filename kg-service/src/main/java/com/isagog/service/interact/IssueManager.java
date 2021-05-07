package com.isagog.service.interact;

import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.IssueResponse;
import com.isagog.service.ServiceException;

import java.util.List;

public interface IssueManager {

     IssueResponse issue(List<InteractRecord> records, String kg) throws ServiceException;
}
