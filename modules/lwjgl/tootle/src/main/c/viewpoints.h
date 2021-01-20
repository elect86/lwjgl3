/************************************************************************************//**
// Copyright (c) 2006-2015 Advanced Micro Devices, Inc. All rights reserved.
/// \author AMD Developer Tools Team
/// \file
****************************************************************************************/
#ifndef VIEWPOINTS_H
#define VIEWPOINTS_H

int nDefaultViewpoints = 642;

float pDefaultViewpoint[] =
{
    0.000000f, -0.525731f, 0.850651f,
    0.000000f, 0.525731f, 0.850651f,
    0.000000f, -0.525731f, -0.850651f,
    0.000000f, 0.525731f, -0.850651f,
    0.850651f, -0.000000f, 0.525731f,
    0.850651f, 0.000000f, -0.525731f,
    -0.850651f, -0.000000f, 0.525731f,
    -0.850651f, 0.000000f, -0.525731f,
    0.525731f, 0.850651f, 0.000000f,
    0.525731f, -0.850651f, 0.000000f,
    -0.525731f, 0.850651f, -0.000000f,
    -0.525731f, -0.850651f, 0.000000f,
    0.500000f, 0.309017f, 0.809017f,
    0.000000f, 0.000000f, 1.000000f,
    0.500000f, -0.309017f, 0.809017f,
    0.809017f, -0.500000f, 0.309017f,
    0.309017f, -0.809017f, 0.500000f,
    1.000000f, 0.000000f, 0.000000f,
    0.809017f, -0.500000f, -0.309017f,
    0.809017f, 0.500000f, -0.309017f,
    0.809017f, 0.500000f, 0.309017f,
    0.309017f, 0.809017f, 0.500000f,
    -0.309017f, 0.809017f, 0.500000f,
    -0.000000f, 1.000000f, 0.000000f,
    -0.309017f, 0.809017f, -0.500000f,
    0.309017f, 0.809017f, -0.500000f,
    0.500000f, 0.309017f, -0.809017f,
    0.000000f, 0.000000f, -1.000000f,
    0.500000f, -0.309017f, -0.809017f,
    -0.500000f, 0.309017f, -0.809017f,
    -0.500000f, -0.309017f, -0.809017f,
    -0.809017f, 0.500000f, -0.309017f,
    -0.809017f, 0.500000f, 0.309017f,
    -1.000000f, 0.000000f, 0.000000f,
    -0.809017f, -0.500000f, 0.309017f,
    -0.809017f, -0.500000f, -0.309017f,
    -0.500000f, -0.309017f, 0.809017f,
    -0.309017f, -0.809017f, 0.500000f,
    -0.500000f, 0.309017f, 0.809017f,
    0.000000f, -1.000000f, 0.000000f,
    -0.309017f, -0.809017f, -0.500000f,
    0.309017f, -0.809017f, -0.500000f,
    0.268204f, -0.153792f, 0.951007f,
    0.517044f, -0.000000f, 0.855959f,
    0.268204f, 0.153792f, 0.951007f,
    0.433963f, -0.587755f, 0.682803f,
    0.587755f, -0.682803f, 0.433963f,
    0.682803f, -0.433963f, 0.587755f,
    0.855959f, -0.517044f, 0.000000f,
    0.951007f, -0.268204f, -0.153792f,
    0.951007f, -0.268204f, 0.153792f,
    0.951007f, 0.268204f, 0.153792f,
    0.951007f, 0.268204f, -0.153792f,
    0.855959f, 0.517044f, -0.000000f,
    0.682803f, 0.433963f, 0.587755f,
    0.587755f, 0.682803f, 0.433963f,
    0.433963f, 0.587755f, 0.682803f,
    0.153792f, 0.951007f, 0.268204f,
    -0.153792f, 0.951007f, 0.268204f,
    0.000000f, 0.855959f, 0.517044f,
    0.153792f, 0.951007f, -0.268204f,
    0.000000f, 0.855959f, -0.517044f,
    -0.153792f, 0.951007f, -0.268204f,
    0.682803f, 0.433963f, -0.587755f,
    0.433963f, 0.587755f, -0.682803f,
    0.587755f, 0.682803f, -0.433963f,
    0.517044f, 0.000000f, -0.855959f,
    0.268204f, -0.153792f, -0.951007f,
    0.268204f, 0.153792f, -0.951007f,
    -0.268204f, -0.153792f, -0.951007f,
    -0.517044f, 0.000000f, -0.855959f,
    -0.268204f, 0.153792f, -0.951007f,
    -0.682803f, 0.433963f, -0.587755f,
    -0.587755f, 0.682803f, -0.433963f,
    -0.433963f, 0.587755f, -0.682803f,
    -0.951007f, 0.268204f, -0.153792f,
    -0.951007f, 0.268204f, 0.153792f,
    -0.855959f, 0.517044f, 0.000000f,
    -0.951007f, -0.268204f, -0.153792f,
    -0.855959f, -0.517044f, -0.000000f,
    -0.951007f, -0.268204f, 0.153792f,
    -0.587755f, -0.682803f, 0.433963f,
    -0.433963f, -0.587755f, 0.682803f,
    -0.682803f, -0.433963f, 0.587755f,
    -0.268204f, -0.153792f, 0.951007f,
    -0.268204f, 0.153792f, 0.951007f,
    -0.517044f, -0.000000f, 0.855959f,
    -0.682803f, 0.433963f, 0.587755f,
    -0.433963f, 0.587755f, 0.682803f,
    -0.587755f, 0.682803f, 0.433963f,
    0.153792f, -0.951007f, 0.268204f,
    0.000000f, -0.855959f, 0.517044f,
    -0.153792f, -0.951007f, 0.268204f,
    0.153792f, -0.951007f, -0.268204f,
    -0.153792f, -0.951007f, -0.268204f,
    -0.000000f, -0.855959f, -0.517044f,
    0.587755f, -0.682803f, -0.433963f,
    0.433963f, -0.587755f, -0.682803f,
    0.682803f, -0.433963f, -0.587755f,
    -0.682803f, -0.433963f, -0.587755f,
    -0.433963f, -0.587755f, -0.682803f,
    -0.587755f, -0.682803f, -0.433963f,
    0.000000f, -0.293869f, 0.955846f,
    0.240178f, -0.442307f, 0.864106f,
    0.715668f, -0.148438f, 0.682485f,
    0.715668f, 0.148438f, 0.682485f,
    0.240178f, 0.442307f, 0.864106f,
    0.000000f, 0.293869f, 0.955846f,
    0.148438f, -0.682485f, 0.715668f,
    0.442307f, -0.864106f, 0.240178f,
    0.682485f, -0.715668f, 0.148438f,
    0.864106f, -0.240178f, 0.442307f,
    0.682485f, -0.715668f, -0.148438f,
    0.864106f, -0.240178f, -0.442307f,
    0.955846f, 0.000000f, -0.293869f,
    0.955846f, 0.000000f, 0.293869f,
    0.864106f, 0.240178f, 0.442307f,
    0.864106f, 0.240178f, -0.442307f,
    0.682485f, 0.715668f, -0.148438f,
    0.682485f, 0.715668f, 0.148438f,
    0.442307f, 0.864106f, 0.240178f,
    0.148438f, 0.682485f, 0.715668f,
    0.293869f, 0.955846f, 0.000000f,
    -0.293869f, 0.955846f, 0.000000f,
    -0.442307f, 0.864106f, 0.240178f,
    -0.148438f, 0.682485f, 0.715668f,
    0.442307f, 0.864106f, -0.240178f,
    0.148438f, 0.682485f, -0.715668f,
    -0.148438f, 0.682485f, -0.715668f,
    -0.442307f, 0.864106f, -0.240178f,
    0.715668f, 0.148438f, -0.682485f,
    0.240178f, 0.442307f, -0.864106f,
    0.715668f, -0.148438f, -0.682485f,
    0.240178f, -0.442307f, -0.864106f,
    0.000000f, -0.293869f, -0.955846f,
    0.000000f, 0.293869f, -0.955846f,
    -0.240178f, -0.442307f, -0.864106f,
    -0.715668f, -0.148438f, -0.682485f,
    -0.715668f, 0.148438f, -0.682485f,
    -0.240178f, 0.442307f, -0.864106f,
    -0.864106f, 0.240178f, -0.442307f,
    -0.682485f, 0.715668f, -0.148438f,
    -0.955846f, 0.000000f, -0.293869f,
    -0.955846f, 0.000000f, 0.293869f,
    -0.864106f, 0.240178f, 0.442307f,
    -0.682485f, 0.715668f, 0.148438f,
    -0.864106f, -0.240178f, -0.442307f,
    -0.682485f, -0.715668f, -0.148438f,
    -0.682485f, -0.715668f, 0.148438f,
    -0.864106f, -0.240178f, 0.442307f,
    -0.442307f, -0.864106f, 0.240178f,
    -0.148438f, -0.682485f, 0.715668f,
    -0.240178f, -0.442307f, 0.864106f,
    -0.715668f, -0.148438f, 0.682485f,
    -0.240178f, 0.442307f, 0.864106f,
    -0.715668f, 0.148438f, 0.682485f,
    0.293869f, -0.955846f, 0.000000f,
    -0.293869f, -0.955846f, 0.000000f,
    0.442307f, -0.864106f, -0.240178f,
    -0.442307f, -0.864106f, -0.240178f,
    -0.148438f, -0.682485f, -0.715668f,
    0.148438f, -0.682485f, -0.715668f,
    0.397581f, 0.078279f, 0.914222f,
    0.270922f, 0.000000f, 0.962601f,
    0.397581f, -0.078279f, 0.914222f,
    0.643300f, -0.565020f, 0.516641f,
    0.565020f, -0.516641f, 0.643300f,
    0.516641f, -0.643300f, 0.565020f,
    0.962601f, -0.270922f, 0.000000f,
    0.914222f, -0.397581f, 0.078279f,
    0.914222f, -0.397581f, -0.078279f,
    0.914222f, 0.397581f, -0.078279f,
    0.914222f, 0.397581f, 0.078279f,
    0.962601f, 0.270922f, 0.000000f,
    0.516641f, 0.643300f, 0.565020f,
    0.565020f, 0.516641f, 0.643300f,
    0.643300f, 0.565020f, 0.516641f,
    -0.078279f, 0.914222f, 0.397581f,
    0.078279f, 0.914222f, 0.397581f,
    0.000000f, 0.962601f, 0.270922f,
    -0.078279f, 0.914222f, -0.397581f,
    0.000000f, 0.962601f, -0.270922f,
    0.078279f, 0.914222f, -0.397581f,
    0.516641f, 0.643300f, -0.565020f,
    0.643300f, 0.565020f, -0.516641f,
    0.565020f, 0.516641f, -0.643300f,
    0.270922f, 0.000000f, -0.962601f,
    0.397581f, 0.078279f, -0.914222f,
    0.397581f, -0.078279f, -0.914222f,
    -0.397581f, 0.078279f, -0.914222f,
    -0.270922f, 0.000000f, -0.962601f,
    -0.397581f, -0.078279f, -0.914222f,
    -0.516641f, 0.643300f, -0.565020f,
    -0.565020f, 0.516641f, -0.643300f,
    -0.643300f, 0.565020f, -0.516641f,
    -0.914222f, 0.397581f, 0.078279f,
    -0.914222f, 0.397581f, -0.078279f,
    -0.962601f, 0.270922f, 0.000000f,
    -0.914222f, -0.397581f, 0.078279f,
    -0.962601f, -0.270922f, 0.000000f,
    -0.914222f, -0.397581f, -0.078279f,
    -0.565020f, -0.516641f, 0.643300f,
    -0.643300f, -0.565020f, 0.516641f,
    -0.516641f, -0.643300f, 0.565020f,
    -0.397581f, 0.078279f, 0.914222f,
    -0.397581f, -0.078279f, 0.914222f,
    -0.270922f, 0.000000f, 0.962601f,
    -0.516641f, 0.643300f, 0.565020f,
    -0.643300f, 0.565020f, 0.516641f,
    -0.565020f, 0.516641f, 0.643300f,
    -0.078279f, -0.914222f, 0.397581f,
    0.000000f, -0.962601f, 0.270922f,
    0.078279f, -0.914222f, 0.397581f,
    -0.078279f, -0.914222f, -0.397581f,
    0.078279f, -0.914222f, -0.397581f,
    0.000000f, -0.962601f, -0.270922f,
    0.565020f, -0.516641f, -0.643300f,
    0.643300f, -0.565020f, -0.516641f,
    0.516641f, -0.643300f, -0.565020f,
    -0.516641f, -0.643300f, -0.565020f,
    -0.643300f, -0.565020f, -0.516641f,
    -0.565020f, -0.516641f, -0.643300f,
    0.126613f, -0.365148f, 0.922299f,
    0.258771f, -0.303162f, 0.917131f,
    0.133337f, -0.225640f, 0.965043f,
    0.717435f, -0.000000f, 0.696625f,
    0.623864f, 0.077522f, 0.777678f,
    0.623864f, -0.077523f, 0.777678f,
    0.126613f, 0.365148f, 0.922299f,
    0.133337f, 0.225640f, 0.965043f,
    0.258771f, 0.303162f, 0.917131f,
    0.204864f, -0.570012f, 0.795686f,
    0.293267f, -0.644341f, 0.706271f,
    0.341179f, -0.518907f, 0.783794f,
    0.570012f, -0.795686f, 0.204864f,
    0.644341f, -0.706271f, 0.293267f,
    0.518907f, -0.783794f, 0.341179f,
    0.795686f, -0.204864f, 0.570012f,
    0.706271f, -0.293267f, 0.644341f,
    0.783794f, -0.341179f, 0.518907f,
    0.696625f, -0.717435f, 0.000000f,
    0.777678f, -0.623864f, -0.077522f,
    0.777678f, -0.623864f, 0.077523f,
    0.922299f, -0.126613f, -0.365148f,
    0.965043f, -0.133337f, -0.225640f,
    0.917131f, -0.258771f, -0.303162f,
    0.922299f, -0.126613f, 0.365148f,
    0.917131f, -0.258771f, 0.303162f,
    0.965043f, -0.133337f, 0.225640f,
    0.922299f, 0.126613f, 0.365148f,
    0.965043f, 0.133337f, 0.225640f,
    0.917131f, 0.258771f, 0.303162f,
    0.922299f, 0.126613f, -0.365148f,
    0.917131f, 0.258771f, -0.303162f,
    0.965043f, 0.133337f, -0.225640f,
    0.696625f, 0.717435f, 0.000000f,
    0.777678f, 0.623864f, 0.077523f,
    0.777678f, 0.623864f, -0.077523f,
    0.795686f, 0.204864f, 0.570012f,
    0.783794f, 0.341179f, 0.518907f,
    0.706271f, 0.293267f, 0.644341f,
    0.570012f, 0.795686f, 0.204864f,
    0.518907f, 0.783794f, 0.341179f,
    0.644341f, 0.706271f, 0.293267f,
    0.204864f, 0.570012f, 0.795686f,
    0.341179f, 0.518907f, 0.783794f,
    0.293267f, 0.644341f, 0.706271f,
    0.365148f, 0.922299f, 0.126613f,
    0.225640f, 0.965043f, 0.133337f,
    0.303162f, 0.917131f, 0.258771f,
    -0.365148f, 0.922299f, 0.126613f,
    -0.303162f, 0.917131f, 0.258771f,
    -0.225640f, 0.965043f, 0.133337f,
    0.000000f, 0.696625f, 0.717435f,
    0.077523f, 0.777678f, 0.623864f,
    -0.077523f, 0.777678f, 0.623864f,
    0.365148f, 0.922299f, -0.126613f,
    0.303162f, 0.917131f, -0.258771f,
    0.225640f, 0.965043f, -0.133337f,
    0.000000f, 0.696625f, -0.717435f,
    -0.077522f, 0.777678f, -0.623864f,
    0.077523f, 0.777678f, -0.623864f,
    -0.365148f, 0.922299f, -0.126613f,
    -0.225640f, 0.965043f, -0.133337f,
    -0.303162f, 0.917131f, -0.258771f,
    0.795686f, 0.204864f, -0.570012f,
    0.706271f, 0.293267f, -0.644341f,
    0.783794f, 0.341179f, -0.518907f,
    0.204864f, 0.570012f, -0.795686f,
    0.293267f, 0.644341f, -0.706271f,
    0.341179f, 0.518907f, -0.783794f,
    0.570012f, 0.795686f, -0.204864f,
    0.644341f, 0.706271f, -0.293267f,
    0.518907f, 0.783794f, -0.341179f,
    0.717435f, 0.000000f, -0.696625f,
    0.623864f, -0.077523f, -0.777678f,
    0.623864f, 0.077523f, -0.777678f,
    0.126613f, -0.365148f, -0.922299f,
    0.133337f, -0.225640f, -0.965043f,
    0.258771f, -0.303162f, -0.917131f,
    0.126613f, 0.365148f, -0.922299f,
    0.258771f, 0.303162f, -0.917131f,
    0.133337f, 0.225640f, -0.965043f,
    -0.126613f, -0.365148f, -0.922299f,
    -0.258771f, -0.303162f, -0.917131f,
    -0.133337f, -0.225640f, -0.965043f,
    -0.717435f, 0.000000f, -0.696625f,
    -0.623864f, 0.077523f, -0.777678f,
    -0.623864f, -0.077523f, -0.777678f,
    -0.126613f, 0.365148f, -0.922299f,
    -0.133337f, 0.225640f, -0.965043f,
    -0.258771f, 0.303162f, -0.917131f,
    -0.795686f, 0.204864f, -0.570012f,
    -0.783794f, 0.341179f, -0.518907f,
    -0.706271f, 0.293267f, -0.644341f,
    -0.570012f, 0.795686f, -0.204864f,
    -0.518907f, 0.783794f, -0.341179f,
    -0.644341f, 0.706271f, -0.293267f,
    -0.204864f, 0.570012f, -0.795686f,
    -0.341179f, 0.518907f, -0.783794f,
    -0.293267f, 0.644341f, -0.706271f,
    -0.922299f, 0.126613f, -0.365148f,
    -0.965043f, 0.133337f, -0.225640f,
    -0.917131f, 0.258771f, -0.303162f,
    -0.922299f, 0.126613f, 0.365148f,
    -0.917131f, 0.258771f, 0.303162f,
    -0.965043f, 0.133337f, 0.225640f,
    -0.696625f, 0.717435f, 0.000000f,
    -0.777678f, 0.623864f, -0.077523f,
    -0.777678f, 0.623864f, 0.077523f,
    -0.922299f, -0.126613f, -0.365148f,
    -0.917131f, -0.258771f, -0.303162f,
    -0.965043f, -0.133337f, -0.225640f,
    -0.696625f, -0.717435f, 0.000000f,
    -0.777678f, -0.623864f, 0.077523f,
    -0.777678f, -0.623864f, -0.077523f,
    -0.922299f, -0.126613f, 0.365148f,
    -0.965043f, -0.133337f, 0.225640f,
    -0.917131f, -0.258771f, 0.303162f,
    -0.570012f, -0.795686f, 0.204864f,
    -0.518907f, -0.783794f, 0.341179f,
    -0.644341f, -0.706271f, 0.293267f,
    -0.204864f, -0.570012f, 0.795686f,
    -0.341179f, -0.518907f, 0.783794f,
    -0.293267f, -0.644341f, 0.706271f,
    -0.795686f, -0.204864f, 0.570012f,
    -0.783794f, -0.341179f, 0.518907f,
    -0.706271f, -0.293267f, 0.644341f,
    -0.126613f, -0.365148f, 0.922299f,
    -0.133337f, -0.225640f, 0.965043f,
    -0.258771f, -0.303162f, 0.917131f,
    -0.126613f, 0.365148f, 0.922299f,
    -0.258771f, 0.303162f, 0.917131f,
    -0.133337f, 0.225640f, 0.965043f,
    -0.717435f, 0.000000f, 0.696625f,
    -0.623864f, -0.077523f, 0.777678f,
    -0.623864f, 0.077523f, 0.777678f,
    -0.795686f, 0.204864f, 0.570012f,
    -0.706271f, 0.293267f, 0.644341f,
    -0.783794f, 0.341179f, 0.518907f,
    -0.204864f, 0.570012f, 0.795686f,
    -0.293267f, 0.644341f, 0.706271f,
    -0.341179f, 0.518907f, 0.783794f,
    -0.570012f, 0.795686f, 0.204864f,
    -0.644341f, 0.706271f, 0.293267f,
    -0.518907f, 0.783794f, 0.341179f,
    0.365148f, -0.922299f, 0.126613f,
    0.303162f, -0.917131f, 0.258771f,
    0.225640f, -0.965043f, 0.133337f,
    0.000000f, -0.696625f, 0.717435f,
    -0.077523f, -0.777678f, 0.623864f,
    0.077523f, -0.777678f, 0.623864f,
    -0.365148f, -0.922299f, 0.126613f,
    -0.225640f, -0.965043f, 0.133337f,
    -0.303162f, -0.917131f, 0.258771f,
    0.365148f, -0.922299f, -0.126613f,
    0.225640f, -0.965043f, -0.133337f,
    0.303162f, -0.917131f, -0.258771f,
    -0.365148f, -0.922299f, -0.126613f,
    -0.303162f, -0.917131f, -0.258771f,
    -0.225640f, -0.965043f, -0.133337f,
    0.000000f, -0.696625f, -0.717435f,
    0.077523f, -0.777678f, -0.623864f,
    -0.077523f, -0.777678f, -0.623864f,
    0.570012f, -0.795686f, -0.204864f,
    0.518907f, -0.783794f, -0.341179f,
    0.644341f, -0.706271f, -0.293267f,
    0.204864f, -0.570012f, -0.795686f,
    0.341179f, -0.518907f, -0.783794f,
    0.293267f, -0.644341f, -0.706271f,
    0.795686f, -0.204864f, -0.570012f,
    0.783794f, -0.341179f, -0.518907f,
    0.706271f, -0.293267f, -0.644341f,
    -0.795686f, -0.204864f, -0.570012f,
    -0.706271f, -0.293267f, -0.644341f,
    -0.783794f, -0.341179f, -0.518907f,
    -0.204864f, -0.570012f, -0.795686f,
    -0.293267f, -0.644341f, -0.706271f,
    -0.341179f, -0.518907f, -0.783794f,
    -0.570012f, -0.795686f, -0.204864f,
    -0.644341f, -0.706271f, -0.293267f,
    -0.518907f, -0.783794f, -0.341179f,
    0.513044f, 0.156641f, 0.843948f,
    0.390160f, 0.232588f, 0.890886f,
    0.136709f, 0.075947f, 0.987696f,
    0.136709f, -0.075947f, 0.987696f,
    0.390160f, -0.232588f, 0.890886f,
    0.513044f, -0.156641f, 0.843948f,
    0.707239f, -0.597535f, 0.377841f,
    0.754177f, -0.474651f, 0.453788f,
    0.597535f, -0.377841f, 0.707239f,
    0.474651f, -0.453788f, 0.754177f,
    0.377841f, -0.707239f, 0.597535f,
    0.453788f, -0.754177f, 0.474651f,
    0.987696f, -0.136709f, -0.075947f,
    0.987696f, -0.136709f, 0.075947f,
    0.890886f, -0.390160f, 0.232588f,
    0.843948f, -0.513044f, 0.156641f,
    0.843948f, -0.513044f, -0.156641f,
    0.890886f, -0.390160f, -0.232588f,
    0.890886f, 0.390160f, -0.232588f,
    0.843948f, 0.513044f, -0.156641f,
    0.843948f, 0.513044f, 0.156641f,
    0.890886f, 0.390160f, 0.232588f,
    0.987696f, 0.136709f, 0.075947f,
    0.987696f, 0.136709f, -0.075947f,
    0.453788f, 0.754177f, 0.474651f,
    0.377842f, 0.707239f, 0.597535f,
    0.474651f, 0.453788f, 0.754177f,
    0.597535f, 0.377841f, 0.707239f,
    0.754177f, 0.474651f, 0.453788f,
    0.707239f, 0.597535f, 0.377841f,
    -0.232588f, 0.890886f, 0.390160f,
    -0.156641f, 0.843948f, 0.513044f,
    0.156641f, 0.843948f, 0.513044f,
    0.232588f, 0.890886f, 0.390160f,
    0.075947f, 0.987696f, 0.136709f,
    -0.075947f, 0.987696f, 0.136709f,
    -0.156641f, 0.843948f, -0.513044f,
    -0.232588f, 0.890886f, -0.390160f,
    -0.075947f, 0.987696f, -0.136709f,
    0.075947f, 0.987696f, -0.136709f,
    0.232588f, 0.890886f, -0.390160f,
    0.156641f, 0.843948f, -0.513044f,
    0.377841f, 0.707239f, -0.597535f,
    0.453788f, 0.754177f, -0.474651f,
    0.707239f, 0.597535f, -0.377841f,
    0.754177f, 0.474651f, -0.453788f,
    0.597535f, 0.377841f, -0.707239f,
    0.474651f, 0.453788f, -0.754177f,
    0.136709f, -0.075947f, -0.987696f,
    0.136709f, 0.075947f, -0.987696f,
    0.390160f, 0.232588f, -0.890886f,
    0.513044f, 0.156641f, -0.843948f,
    0.513044f, -0.156641f, -0.843948f,
    0.390160f, -0.232588f, -0.890886f,
    -0.513044f, 0.156641f, -0.843948f,
    -0.390160f, 0.232588f, -0.890886f,
    -0.136709f, 0.075947f, -0.987696f,
    -0.136709f, -0.075947f, -0.987696f,
    -0.390160f, -0.232588f, -0.890886f,
    -0.513044f, -0.156641f, -0.843948f,
    -0.453788f, 0.754177f, -0.474651f,
    -0.377841f, 0.707239f, -0.597535f,
    -0.474651f, 0.453788f, -0.754177f,
    -0.597535f, 0.377841f, -0.707239f,
    -0.754177f, 0.474651f, -0.453788f,
    -0.707239f, 0.597535f, -0.377842f,
    -0.890886f, 0.390160f, 0.232588f,
    -0.843948f, 0.513044f, 0.156641f,
    -0.843948f, 0.513044f, -0.156641f,
    -0.890886f, 0.390160f, -0.232588f,
    -0.987696f, 0.136709f, -0.075947f,
    -0.987696f, 0.136709f, 0.075947f,
    -0.843948f, -0.513044f, 0.156641f,
    -0.890886f, -0.390160f, 0.232588f,
    -0.987696f, -0.136709f, 0.075947f,
    -0.987696f, -0.136709f, -0.075947f,
    -0.890886f, -0.390160f, -0.232588f,
    -0.843948f, -0.513044f, -0.156641f,
    -0.474651f, -0.453788f, 0.754177f,
    -0.597535f, -0.377842f, 0.707239f,
    -0.754177f, -0.474651f, 0.453788f,
    -0.707239f, -0.597535f, 0.377841f,
    -0.453788f, -0.754177f, 0.474651f,
    -0.377841f, -0.707239f, 0.597535f,
    -0.390160f, 0.232588f, 0.890886f,
    -0.513044f, 0.156641f, 0.843948f,
    -0.513044f, -0.156641f, 0.843948f,
    -0.390160f, -0.232588f, 0.890886f,
    -0.136709f, -0.075947f, 0.987696f,
    -0.136709f, 0.075947f, 0.987696f,
    -0.377841f, 0.707239f, 0.597535f,
    -0.453788f, 0.754177f, 0.474651f,
    -0.707239f, 0.597535f, 0.377841f,
    -0.754177f, 0.474651f, 0.453788f,
    -0.597535f, 0.377841f, 0.707239f,
    -0.474651f, 0.453788f, 0.754177f,
    -0.156641f, -0.843948f, 0.513044f,
    -0.232588f, -0.890886f, 0.390160f,
    -0.075947f, -0.987696f, 0.136709f,
    0.075947f, -0.987696f, 0.136709f,
    0.232588f, -0.890886f, 0.390160f,
    0.156641f, -0.843948f, 0.513044f,
    -0.232588f, -0.890886f, -0.390160f,
    -0.156641f, -0.843948f, -0.513044f,
    0.156641f, -0.843948f, -0.513044f,
    0.232588f, -0.890886f, -0.390160f,
    0.075947f, -0.987696f, -0.136709f,
    -0.075947f, -0.987696f, -0.136709f,
    0.474651f, -0.453788f, -0.754177f,
    0.597535f, -0.377841f, -0.707239f,
    0.754177f, -0.474651f, -0.453788f,
    0.707239f, -0.597535f, -0.377841f,
    0.453788f, -0.754177f, -0.474651f,
    0.377841f, -0.707239f, -0.597535f,
    -0.377841f, -0.707239f, -0.597535f,
    -0.453788f, -0.754177f, -0.474651f,
    -0.707239f, -0.597535f, -0.377841f,
    -0.754177f, -0.474651f, -0.453788f,
    -0.597535f, -0.377841f, -0.707239f,
    -0.474651f, -0.453788f, -0.754177f,
    0.000000f, -0.422350f, 0.906433f,
    0.111528f, -0.491278f, 0.863833f,
    0.372963f, -0.380535f, 0.846222f,
    0.000000f, -0.150031f, 0.988681f,
    0.794905f, -0.068928f, 0.602806f,
    0.794905f, 0.068928f, 0.602806f,
    0.615718f, 0.230504f, 0.753498f,
    0.615718f, -0.230504f, 0.753498f,
    0.111528f, 0.491278f, 0.863833f,
    0.000000f, 0.422350f, 0.906433f,
    0.000000f, 0.150031f, 0.988681f,
    0.372963f, 0.380535f, 0.846222f,
    0.068928f, -0.602806f, 0.794905f,
    0.230504f, -0.753498f, 0.615718f,
    0.491278f, -0.863833f, 0.111528f,
    0.602806f, -0.794905f, 0.068928f,
    0.753498f, -0.615718f, 0.230504f,
    0.380535f, -0.846222f, 0.372963f,
    0.863833f, -0.111528f, 0.491278f,
    0.846222f, -0.372963f, 0.380535f,
    0.602806f, -0.794905f, -0.068928f,
    0.753498f, -0.615718f, -0.230504f,
    0.863833f, -0.111528f, -0.491278f,
    0.906433f, 0.000000f, -0.422350f,
    0.988681f, 0.000000f, -0.150031f,
    0.846222f, -0.372963f, -0.380535f,
    0.906433f, 0.000000f, 0.422350f,
    0.988681f, 0.000000f, 0.150031f,
    0.863833f, 0.111528f, 0.491278f,
    0.846222f, 0.372963f, 0.380535f,
    0.863833f, 0.111528f, -0.491278f,
    0.846222f, 0.372963f, -0.380535f,
    0.602806f, 0.794905f, -0.068928f,
    0.602806f, 0.794905f, 0.068928f,
    0.753498f, 0.615718f, 0.230504f,
    0.753498f, 0.615718f, -0.230504f,
    0.491278f, 0.863833f, 0.111528f,
    0.380535f, 0.846222f, 0.372963f,
    0.068928f, 0.602806f, 0.794905f,
    0.230504f, 0.753498f, 0.615718f,
    0.422350f, 0.906433f, 0.000000f,
    0.150031f, 0.988681f, 0.000000f,
    -0.422350f, 0.906433f, 0.000000f,
    -0.491278f, 0.863833f, 0.111528f,
    -0.380535f, 0.846222f, 0.372963f,
    -0.150031f, 0.988681f, 0.000000f,
    -0.068928f, 0.602806f, 0.794905f,
    -0.230504f, 0.753498f, 0.615718f,
    0.491278f, 0.863833f, -0.111528f,
    0.380535f, 0.846222f, -0.372963f,
    0.068928f, 0.602806f, -0.794905f,
    -0.068928f, 0.602806f, -0.794905f,
    -0.230504f, 0.753498f, -0.615718f,
    0.230504f, 0.753498f, -0.615718f,
    -0.491278f, 0.863833f, -0.111528f,
    -0.380535f, 0.846222f, -0.372963f,
    0.794905f, 0.068928f, -0.602806f,
    0.615718f, 0.230504f, -0.753498f,
    0.111528f, 0.491278f, -0.863833f,
    0.372963f, 0.380535f, -0.846222f,
    0.794905f, -0.068928f, -0.602806f,
    0.615718f, -0.230504f, -0.753498f,
    0.111528f, -0.491278f, -0.863833f,
    0.000000f, -0.422350f, -0.906433f,
    0.000000f, -0.150031f, -0.988681f,
    0.372963f, -0.380535f, -0.846222f,
    0.000000f, 0.422350f, -0.906433f,
    0.000000f, 0.150031f, -0.988681f,
    -0.111528f, -0.491278f, -0.863833f,
    -0.372963f, -0.380535f, -0.846222f,
    -0.794905f, -0.068928f, -0.602806f,
    -0.794905f, 0.068928f, -0.602806f,
    -0.615718f, 0.230504f, -0.753498f,
    -0.615718f, -0.230504f, -0.753498f,
    -0.111528f, 0.491278f, -0.863833f,
    -0.372963f, 0.380535f, -0.846222f,
    -0.863833f, 0.111528f, -0.491278f,
    -0.846222f, 0.372963f, -0.380535f,
    -0.602806f, 0.794905f, -0.068928f,
    -0.753498f, 0.615718f, -0.230504f,
    -0.906433f, 0.000000f, -0.422350f,
    -0.988681f, 0.000000f, -0.150031f,
    -0.906433f, 0.000000f, 0.422350f,
    -0.863833f, 0.111528f, 0.491278f,
    -0.846222f, 0.372963f, 0.380535f,
    -0.988681f, 0.000000f, 0.150031f,
    -0.602806f, 0.794905f, 0.068928f,
    -0.753498f, 0.615718f, 0.230504f,
    -0.863833f, -0.111528f, -0.491278f,
    -0.846222f, -0.372963f, -0.380535f,
    -0.602806f, -0.794905f, -0.068928f,
    -0.602806f, -0.794905f, 0.068928f,
    -0.753498f, -0.615718f, 0.230504f,
    -0.753498f, -0.615718f, -0.230504f,
    -0.863833f, -0.111528f, 0.491278f,
    -0.846222f, -0.372963f, 0.380535f,
    -0.491278f, -0.863833f, 0.111528f,
    -0.380535f, -0.846222f, 0.372963f,
    -0.068928f, -0.602806f, 0.794905f,
    -0.111528f, -0.491278f, 0.863833f,
    -0.372963f, -0.380535f, 0.846222f,
    -0.230504f, -0.753498f, 0.615718f,
    -0.794905f, -0.068928f, 0.602806f,
    -0.615718f, -0.230504f, 0.753498f,
    -0.111528f, 0.491278f, 0.863833f,
    -0.372963f, 0.380535f, 0.846222f,
    -0.794905f, 0.068928f, 0.602806f,
    -0.615718f, 0.230504f, 0.753498f,
    0.422350f, -0.906433f, 0.000000f,
    0.150031f, -0.988681f, 0.000000f,
    -0.422350f, -0.906433f, 0.000000f,
    -0.150031f, -0.988681f, 0.000000f,
    0.491278f, -0.863833f, -0.111528f,
    0.380535f, -0.846222f, -0.372963f,
    -0.491278f, -0.863833f, -0.111528f,
    -0.380535f, -0.846222f, -0.372963f,
    -0.068928f, -0.602806f, -0.794905f,
    0.068928f, -0.602806f, -0.794905f,
    0.230504f, -0.753498f, -0.615718f,
    -0.230504f, -0.753498f, -0.615718f
};

#endif
