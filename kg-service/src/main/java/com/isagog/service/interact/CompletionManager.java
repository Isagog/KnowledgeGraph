package com.isagog.service.interact;

import com.isagog.kg.model.InteractRecord;
import com.isagog.kg.model.InteractType;
import com.isagog.service.ServiceException;


import javax.annotation.Nonnull;
import java.util.List;

public interface CompletionManager {
    boolean loadIndex(List<String> indexFiles);

    List<InteractRecord> completeString(@Nonnull String hook, InteractType itype) throws ServiceException;

    List<InteractRecord> completeInContext(@Nonnull String hook, @Nonnull List<InteractRecord> context) throws ServiceException;
}
