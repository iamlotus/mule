/*
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.db.domain.transaction;

import org.mule.api.transaction.Transaction;

/**
 * Manages transactions for the connector
 */
public interface DbTransactionManager
{

    /**
     * @return the active transaction if available
     */
    Transaction getTransaction();
}
