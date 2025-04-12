import org.checkerframework.framework.source.SourceChecker;
import org.checkerframework.framework.type.GenericAnnotatedTypeFactory;

class InitializedFieldsAnnotatedTypeFactory {

  private void triggerProblem(
    Class<? extends SourceChecker> sourceCheckerClass,
     GenericAnnotatedTypeFactory<?,?,?,?> gatf,
     SourceChecker subchecker
   ) {

    // nothing bad happens when a normal sourceCheckerClass is passed.
    // this throws no errors.
    gatf.getTypeFactoryOfSubchecker(sourceCheckerClass);

    // however, when passing subchecker.getClass(), whose return type is precisely
    // Class<? extends SourceChecker>, the upper bound for the wildcard is TOP instead of bottom,
    // which results in an error in my type system
    gatf.getTypeFactoryOfSubchecker(subchecker.getClass());
  }
}
