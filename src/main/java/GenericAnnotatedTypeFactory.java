package org.checkerframework.framework.type;

import org.checkerframework.framework.flow.CFAbstractAnalysis;
import org.checkerframework.framework.flow.CFAbstractStore;
import org.checkerframework.framework.flow.CFAbstractTransfer;
import org.checkerframework.framework.flow.CFAbstractValue;
import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.framework.source.SourceChecker;

/* If you move this file away from the src/main/java directory, mvn compile succeeds.
 * However, if it is present, it fails with the upper bound error.
 * I shrank the file down to the minimum. (With the full contents of the GenericAnnotatedTypeFactory.java
 * it also failed).
 */
public abstract class GenericAnnotatedTypeFactory<
        Value extends CFAbstractValue<Value>,
        Store extends CFAbstractStore<Value, Store>,
        TransferFunction extends CFAbstractTransfer<Value, Store, TransferFunction>,
        FlowAnalysis extends CFAbstractAnalysis<Value, Store, TransferFunction>>
    extends AnnotatedTypeFactory {

  protected GenericAnnotatedTypeFactory(BaseTypeChecker checker) {
    super(checker);
  }

  public final <T extends GenericAnnotatedTypeFactory<?, ?, ?, ?>> T getTypeFactoryOfSubchecker(
      Class<? extends SourceChecker> subCheckerClass) {
      return null;
  }
}
