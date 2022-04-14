package Elements;

import base.Base;
import wallker.Semantic;

import java.util.ArrayList;
import java.util.List;

public class Function extends Base {
    public FunctionHeader functionHeader;
    private List<Statement> statements;
    private ExpressionMath res;

    public Function(FunctionHeader functionHeader, List<Statement> statements, ExpressionMath res) {

        this.functionHeader = functionHeader;
        this.statements = statements;
        this.res = res;
        Semantic.checkCorrectReturnValue(res, statements, functionHeader.getType());
    }

    @Override
    public String toString() {
        StringBuilder p = new StringBuilder("\t");

        p.append(functionHeader.toString());
        p.append("{\n\t");
        for (Statement statement : statements) {
            p.append(statement.toString());
            p.append("\n\t");
        }
        p.append("return ").append(res.toString()).append(";");
        p.append("}\n\n\n");
        return p.toString();
    }
}