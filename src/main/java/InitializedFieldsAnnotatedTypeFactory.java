// package org.checkerframework.common.initializedfields;

import org.checkerframework.framework.source.SourceChecker;
import org.checkerframework.framework.type.AnnotatedTypeFactory;

class InitializedFieldsAnnotatedTypeFactory {

  private void defaultValueIsOK() {
    GenericAnnotatedTypeFactory<?,?,?,?> gatf = null;
    Class<? extends SourceChecker> cl = null;
    SourceChecker subchecker = null;
    gatf.getTypeFactoryOfSubchecker(cl);
    gatf.getTypeFactoryOfSubchecker(subchecker.getClass());
  }
}
