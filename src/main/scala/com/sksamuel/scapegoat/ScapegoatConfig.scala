package com.sksamuel.scapegoat

import com.sksamuel.scapegoat.inspections._
import com.sksamuel.scapegoat.inspections.collections._
import com.sksamuel.scapegoat.inspections.controlflow._
import com.sksamuel.scapegoat.inspections.empty._
import com.sksamuel.scapegoat.inspections.equality._
import com.sksamuel.scapegoat.inspections.exception._
import com.sksamuel.scapegoat.inspections.imports.DuplicateImport
import com.sksamuel.scapegoat.inspections.inference._
import com.sksamuel.scapegoat.inspections.matching._
import com.sksamuel.scapegoat.inspections.math._
import com.sksamuel.scapegoat.inspections.naming._
import com.sksamuel.scapegoat.inspections.nulls._
import com.sksamuel.scapegoat.inspections.option._
import com.sksamuel.scapegoat.inspections.string._
import com.sksamuel.scapegoat.inspections.style._
import com.sksamuel.scapegoat.inspections.unneccesary._
import com.sksamuel.scapegoat.inspections.unsafe._

/**
 * @author Stephen Samuel */
object ScapegoatConfig extends App {

  def inspections: Seq[Inspection] =
    Seq(
      new ArrayEquals,
      new ArraysInFormat,
      new ArraysToString,
      new AsInstanceOf,
      new AvoidOperatorOverload,
      new AvoidSizeEqualsZero,
      new AvoidSizeNotEqualsZero,
      new AvoidToMinusOne,
      new BigDecimalDoubleConstructor,
      new BigDecimalScaleWithoutRoundingMode,
      new BoundedByFinalType,
      new BrokenOddness,
      new CatchException,
      new CatchFatal,
      new CatchNpe,
      new CatchThrowable,
      new ClassNames,
      new CollectionIndexOnNonIndexedSeq,
      new CollectionNamingConfusion,
      new CollectionNegativeIndex,
      new CollectionPromotionToAny,
      new ComparingFloatingPointTypes,
      new ComparingUnrelatedTypes,
      new ComparisonToEmptyList,
      new ComparisonToEmptySet,
      new ComparisonWithSelf,
      new ConstantIf,
      new DivideByOne,
      new DoubleNegation,
      new DuplicateImport,
      new DuplicateMapKey,
      new DuplicateSetValue,
      new EitherGet,
      new EmptyCaseClass,
      new EmptyFor,
      new EmptyIfBlock,
      new EmptyInterpolatedString,
      new EmptyMethod,
      new EmptySynchronizedBlock,
      new EmptyTryBlock,
      new EmptyWhileBlock,
      new ExistsSimplifiableToContains,
      new FilterDotHead,
      new FilterDotHeadOption,
      new FilterDotIsEmpty,
      new FilterDotSize,
      new FilterOptionAndGet,
      new FinalModifierOnCaseClass,
      new FinalizerWithoutSuper,
      new FindAndNotEqualsNoneReplaceWithExists,
      new FindDotIsDefined,
      new IllegalFormatString,
      new ImpossibleOptionSizeCondition,
      new IncorrectNumberOfArgsToFormat,
      new IncorrectlyNamedExceptions,
      new InvalidRegex,
      new IsInstanceOf,
      new JavaConversionsUse,
      new ListAppend,
      new ListSize,
      new LonelySealedTrait,
      new LooksLikeInterpolatedString,
      new MapGetAndGetOrElse,
      new MaxParameters,
      new MethodNames,
      new MethodReturningAny,
      new ModOne,
      new NanComparison,
      new NegationIsEmpty,
      new NegationNonEmpty,
      new NoOpOverride,
      new NullAssignment,
      new NullParameter,
      new ObjectNames,
      new OptionGet,
      new OptionSize,
      new ParameterlessMethodReturnsUnit,
      new PartialFunctionInsteadOfMatch,
      new PointlessTypeBounds,
      new PreferMapEmpty,
      new PreferSeqEmpty,
      new PreferSetEmpty,
      new ProductWithSerializableInferred,
      new PublicFinalizer,
      new RedundantFinalModifierOnMethod,
      new RedundantFinalModifierOnVar,
      new RedundantFinalizer,
      new RepeatedCaseBody,
      new RepeatedIfElseBody,
      new ReverseFunc,
      new ReverseTailReverse,
      new ReverseTakeReverse,
      new SimplifyBooleanExpression,
      new StripMarginOnRegex,
      new SubstringZero,
      new SuspiciousMatchOnClassObject,
      new SwallowedException,
      new SwapSortFilter,
      new UnsafeTraversableMethods,
      new TryGet,
      new TypeShadowing,
      new UnnecessaryConversion,
      new UnnecessaryIf,
      new UnnecessaryReturnUse,
      new UnreachableCatch,
      new UnsafeContains,
      new UnsafeStringContains,
      new UnusedMethodParameter,
      new UseCbrt,
      new UseExpM1,
      new UseLog10,
      new UseLog1P,
      new UseSqrt,
      new VariableShadowing,
      new VarClosure,
      new VarCouldBeVal,
      new WhileTrue,
      new ZeroNumerator
    )
}
