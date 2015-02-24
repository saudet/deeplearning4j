/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.nd4j.linalg.api.ops.impl.transforms;

import org.apache.commons.math3.util.FastMath;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;
import org.nd4j.linalg.api.ops.Op;
import org.nd4j.linalg.util.ComplexUtil;

/**
 * Rounding function
 * @author Adam Gibson
 */
public class Round extends BaseTransformOp {

    public Round(INDArray x, INDArray z) {
        super(x, z);
    }

    public Round(INDArray x, INDArray z, int n) {
        super(x, z, n);
    }

    public Round(INDArray x, INDArray y, INDArray z, int n) {
        super(x, y, z, n);
    }

    public Round(INDArray x) {
        super(x);
    }

    @Override
    public String name() {
        return "round";
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, double other) {
        return ComplexUtil.round(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, float other) {
        return ComplexUtil.round(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, IComplexNumber other) {
        return ComplexUtil.round(origin);
    }

    @Override
    public float op(float origin, float other) {
        return FastMath.round(origin);
    }

    @Override
    public double op(double origin, double other) {
        return FastMath.round(origin);
    }

    @Override
    public double op(double origin) {
        return FastMath.round(origin);
    }

    @Override
    public float op(float origin) {
        return FastMath.round(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin) {
       return ComplexUtil.round(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, double other, Object[] extraArgs) {
        return op(origin,other);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, float other, Object[] extraArgs) {
        return op(origin,other);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, IComplexNumber other, Object[] extraArgs) {
        return op(origin,other);
    }

    @Override
    public float op(float origin, float other, Object[] extraArgs) {
        return op(origin,other);
    }

    @Override
    public double op(double origin, double other, Object[] extraArgs) {
        return op(origin,other);
    }

    @Override
    public double op(double origin, Object[] extraArgs) {
        return op(origin);
    }

    @Override
    public float op(float origin, Object[] extraArgs) {
        return op(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, Object[] extraArgs) {
        return op(origin);
    }
    @Override
    public Op opForDimension(int index,int dimension) {
        if(y() != null)
            return new Round(x.vectorAlongDimension(index,dimension),y.vectorAlongDimension(index,dimension),z.vectorAlongDimension(index,dimension),x.length());
        else
            return new Round(x.vectorAlongDimension(index,dimension),z.vectorAlongDimension(index,dimension),x.length());

    }
}
