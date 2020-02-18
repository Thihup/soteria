/*
 * Copyright (c) 2018, 2020 Payara Foundation and/or its affiliates and others.
 * All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */
package org.glassfish.soteria.cdi.spi.impl;

import jakarta.enterprise.inject.spi.Bean;
import jakarta.enterprise.inject.spi.BeanManager;

import org.glassfish.soteria.DefaultService;
import org.glassfish.soteria.cdi.spi.BeanDecorator;

/**
 * The default bean decorator.
 *
 * <p>
 * This decorator does nothing, but if CDI would ever get a portable API to decorate
 * beans that API would be used here.
 *
 * @author Arjan Tijms
 *
 */
public class DefaultBeanDecorator implements BeanDecorator, DefaultService {

    @Override
    public <T> Bean<T> decorateBean(Bean<T> decorableBean, Class<T> type, BeanManager beanManager) {
        return decorableBean;
    }

}
