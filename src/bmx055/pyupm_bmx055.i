// Include doxygen-generated documentation
%include "pyupm_doxy2swig.i"
%module pyupm_bmx055
%include "../upm.i"
%include "cpointer.i"
%include "../upm_vectortypes.i"

/* Send "int *" and "float *" to python as intp and floatp */
%pointer_functions(int, intp);
%pointer_functions(float, floatp);

%feature("autodoc", "3");

#ifdef DOXYGEN
%include "bmx055_doc.i"
#endif

%include "bmg160_defs.h"
%include "bma250e_defs.h"
%include "bmm150_defs.h"

%include "bmm150.hpp"
%{
    #include "bmm150.hpp"
%}

%include "bmx055.hpp"
%{
    #include "bmx055.hpp"
%}

%include "bmc150.hpp"
%{
    #include "bmc150.hpp"
%}

%include "bmi055.hpp"
%{
    #include "bmi055.hpp"
%}
