/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2016 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */
package com.github.javaparser.ast.expr;

import com.github.javaparser.ast.AllFieldsConstructor;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.visitor.CloneVisitor;
import com.github.javaparser.metamodel.ExpressionMetaModel;
import com.github.javaparser.metamodel.JavaParserMetaModel;
import javax.annotation.Generated;
import com.github.javaparser.TokenRange;
import java.util.function.Consumer;
import static com.github.javaparser.utils.CodeGenerationUtils.f;

/**
 * A base class for all expressions.
 *
 * @author Julio Vilmar Gesser
 */
public abstract class Expression extends Node {

    @AllFieldsConstructor
    public Expression() {
        this(null);
    }

    /**This constructor is used by the parser and is considered private.*/
    @Generated("com.github.javaparser.generator.core.node.MainConstructorGenerator")
    public Expression(TokenRange tokenRange) {
        super(tokenRange);
        customInitialization();
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.RemoveMethodGenerator")
    public boolean remove(Node node) {
        if (node == null)
            return false;
        return super.remove(node);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.CloneGenerator")
    public Expression clone() {
        return (Expression) accept(new CloneVisitor(), null);
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.GetMetaModelGenerator")
    public ExpressionMetaModel getMetaModel() {
        return JavaParserMetaModel.expressionMetaModel;
    }

    @Override
    @Generated("com.github.javaparser.generator.core.node.ReplaceMethodGenerator")
    public boolean replace(Node node, Node replacementNode) {
        if (node == null)
            return false;
        return super.replace(node, replacementNode);
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isAnnotationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public AnnotationExpr asAnnotationExpr() {
        throw new IllegalStateException(f("%s is not an AnnotationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isArrayAccessExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ArrayAccessExpr asArrayAccessExpr() {
        throw new IllegalStateException(f("%s is not an ArrayAccessExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isArrayCreationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ArrayCreationExpr asArrayCreationExpr() {
        throw new IllegalStateException(f("%s is not an ArrayCreationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isArrayInitializerExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ArrayInitializerExpr asArrayInitializerExpr() {
        throw new IllegalStateException(f("%s is not an ArrayInitializerExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isAssignExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public AssignExpr asAssignExpr() {
        throw new IllegalStateException(f("%s is not an AssignExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isBinaryExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public BinaryExpr asBinaryExpr() {
        throw new IllegalStateException(f("%s is not an BinaryExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isBooleanLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public BooleanLiteralExpr asBooleanLiteralExpr() {
        throw new IllegalStateException(f("%s is not an BooleanLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isCastExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public CastExpr asCastExpr() {
        throw new IllegalStateException(f("%s is not an CastExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isCharLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public CharLiteralExpr asCharLiteralExpr() {
        throw new IllegalStateException(f("%s is not an CharLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isClassExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ClassExpr asClassExpr() {
        throw new IllegalStateException(f("%s is not an ClassExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isConditionalExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ConditionalExpr asConditionalExpr() {
        throw new IllegalStateException(f("%s is not an ConditionalExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isDoubleLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public DoubleLiteralExpr asDoubleLiteralExpr() {
        throw new IllegalStateException(f("%s is not an DoubleLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isEnclosedExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public EnclosedExpr asEnclosedExpr() {
        throw new IllegalStateException(f("%s is not an EnclosedExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isFieldAccessExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public FieldAccessExpr asFieldAccessExpr() {
        throw new IllegalStateException(f("%s is not an FieldAccessExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isInstanceOfExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public InstanceOfExpr asInstanceOfExpr() {
        throw new IllegalStateException(f("%s is not an InstanceOfExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isIntegerLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public IntegerLiteralExpr asIntegerLiteralExpr() {
        throw new IllegalStateException(f("%s is not an IntegerLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLambdaExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LambdaExpr asLambdaExpr() {
        throw new IllegalStateException(f("%s is not an LambdaExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LiteralExpr asLiteralExpr() {
        throw new IllegalStateException(f("%s is not an LiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLiteralStringValueExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LiteralStringValueExpr asLiteralStringValueExpr() {
        throw new IllegalStateException(f("%s is not an LiteralStringValueExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isLongLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public LongLiteralExpr asLongLiteralExpr() {
        throw new IllegalStateException(f("%s is not an LongLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isMarkerAnnotationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public MarkerAnnotationExpr asMarkerAnnotationExpr() {
        throw new IllegalStateException(f("%s is not an MarkerAnnotationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isMethodCallExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public MethodCallExpr asMethodCallExpr() {
        throw new IllegalStateException(f("%s is not an MethodCallExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isMethodReferenceExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public MethodReferenceExpr asMethodReferenceExpr() {
        throw new IllegalStateException(f("%s is not an MethodReferenceExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isNameExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public NameExpr asNameExpr() {
        throw new IllegalStateException(f("%s is not an NameExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isNormalAnnotationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public NormalAnnotationExpr asNormalAnnotationExpr() {
        throw new IllegalStateException(f("%s is not an NormalAnnotationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isNullLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public NullLiteralExpr asNullLiteralExpr() {
        throw new IllegalStateException(f("%s is not an NullLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isObjectCreationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ObjectCreationExpr asObjectCreationExpr() {
        throw new IllegalStateException(f("%s is not an ObjectCreationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isSingleMemberAnnotationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public SingleMemberAnnotationExpr asSingleMemberAnnotationExpr() {
        throw new IllegalStateException(f("%s is not an SingleMemberAnnotationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isStringLiteralExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public StringLiteralExpr asStringLiteralExpr() {
        throw new IllegalStateException(f("%s is not an StringLiteralExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isSuperExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public SuperExpr asSuperExpr() {
        throw new IllegalStateException(f("%s is not an SuperExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isThisExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public ThisExpr asThisExpr() {
        throw new IllegalStateException(f("%s is not an ThisExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isTypeExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public TypeExpr asTypeExpr() {
        throw new IllegalStateException(f("%s is not an TypeExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isUnaryExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public UnaryExpr asUnaryExpr() {
        throw new IllegalStateException(f("%s is not an UnaryExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public boolean isVariableDeclarationExpr() {
        return false;
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public VariableDeclarationExpr asVariableDeclarationExpr() {
        throw new IllegalStateException(f("%s is not an VariableDeclarationExpr", this));
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifAnnotationExpr(Consumer<AnnotationExpr> action) {
        if (isAnnotationExpr()) {
            action.accept(asAnnotationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifArrayAccessExpr(Consumer<ArrayAccessExpr> action) {
        if (isArrayAccessExpr()) {
            action.accept(asArrayAccessExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifArrayCreationExpr(Consumer<ArrayCreationExpr> action) {
        if (isArrayCreationExpr()) {
            action.accept(asArrayCreationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifArrayInitializerExpr(Consumer<ArrayInitializerExpr> action) {
        if (isArrayInitializerExpr()) {
            action.accept(asArrayInitializerExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifAssignExpr(Consumer<AssignExpr> action) {
        if (isAssignExpr()) {
            action.accept(asAssignExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifBinaryExpr(Consumer<BinaryExpr> action) {
        if (isBinaryExpr()) {
            action.accept(asBinaryExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifBooleanLiteralExpr(Consumer<BooleanLiteralExpr> action) {
        if (isBooleanLiteralExpr()) {
            action.accept(asBooleanLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifCastExpr(Consumer<CastExpr> action) {
        if (isCastExpr()) {
            action.accept(asCastExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifCharLiteralExpr(Consumer<CharLiteralExpr> action) {
        if (isCharLiteralExpr()) {
            action.accept(asCharLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifClassExpr(Consumer<ClassExpr> action) {
        if (isClassExpr()) {
            action.accept(asClassExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifConditionalExpr(Consumer<ConditionalExpr> action) {
        if (isConditionalExpr()) {
            action.accept(asConditionalExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifDoubleLiteralExpr(Consumer<DoubleLiteralExpr> action) {
        if (isDoubleLiteralExpr()) {
            action.accept(asDoubleLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifEnclosedExpr(Consumer<EnclosedExpr> action) {
        if (isEnclosedExpr()) {
            action.accept(asEnclosedExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifFieldAccessExpr(Consumer<FieldAccessExpr> action) {
        if (isFieldAccessExpr()) {
            action.accept(asFieldAccessExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifInstanceOfExpr(Consumer<InstanceOfExpr> action) {
        if (isInstanceOfExpr()) {
            action.accept(asInstanceOfExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifIntegerLiteralExpr(Consumer<IntegerLiteralExpr> action) {
        if (isIntegerLiteralExpr()) {
            action.accept(asIntegerLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLambdaExpr(Consumer<LambdaExpr> action) {
        if (isLambdaExpr()) {
            action.accept(asLambdaExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLiteralExpr(Consumer<LiteralExpr> action) {
        if (isLiteralExpr()) {
            action.accept(asLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLiteralStringValueExpr(Consumer<LiteralStringValueExpr> action) {
        if (isLiteralStringValueExpr()) {
            action.accept(asLiteralStringValueExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifLongLiteralExpr(Consumer<LongLiteralExpr> action) {
        if (isLongLiteralExpr()) {
            action.accept(asLongLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifMarkerAnnotationExpr(Consumer<MarkerAnnotationExpr> action) {
        if (isMarkerAnnotationExpr()) {
            action.accept(asMarkerAnnotationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifMethodCallExpr(Consumer<MethodCallExpr> action) {
        if (isMethodCallExpr()) {
            action.accept(asMethodCallExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifMethodReferenceExpr(Consumer<MethodReferenceExpr> action) {
        if (isMethodReferenceExpr()) {
            action.accept(asMethodReferenceExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifNameExpr(Consumer<NameExpr> action) {
        if (isNameExpr()) {
            action.accept(asNameExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifNormalAnnotationExpr(Consumer<NormalAnnotationExpr> action) {
        if (isNormalAnnotationExpr()) {
            action.accept(asNormalAnnotationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifNullLiteralExpr(Consumer<NullLiteralExpr> action) {
        if (isNullLiteralExpr()) {
            action.accept(asNullLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifObjectCreationExpr(Consumer<ObjectCreationExpr> action) {
        if (isObjectCreationExpr()) {
            action.accept(asObjectCreationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifSingleMemberAnnotationExpr(Consumer<SingleMemberAnnotationExpr> action) {
        if (isSingleMemberAnnotationExpr()) {
            action.accept(asSingleMemberAnnotationExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifStringLiteralExpr(Consumer<StringLiteralExpr> action) {
        if (isStringLiteralExpr()) {
            action.accept(asStringLiteralExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifSuperExpr(Consumer<SuperExpr> action) {
        if (isSuperExpr()) {
            action.accept(asSuperExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifThisExpr(Consumer<ThisExpr> action) {
        if (isThisExpr()) {
            action.accept(asThisExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifTypeExpr(Consumer<TypeExpr> action) {
        if (isTypeExpr()) {
            action.accept(asTypeExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifUnaryExpr(Consumer<UnaryExpr> action) {
        if (isUnaryExpr()) {
            action.accept(asUnaryExpr());
        }
    }

    @Generated("com.github.javaparser.generator.core.node.TypeCastingGenerator")
    public void ifVariableDeclarationExpr(Consumer<VariableDeclarationExpr> action) {
        if (isVariableDeclarationExpr()) {
            action.accept(asVariableDeclarationExpr());
        }
    }
}
