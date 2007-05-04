package ru.astrans;

import ru.ifmo.rain.astrans.astransast.AstransastSwitch;

import ru.model.Result;

import ru.some.ast.Node;

public interface ITEResolver {
	Result runTransformation(Node astNode, AstransastSwitch transformer);
}