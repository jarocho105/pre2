/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.CargoConstantesFunciones;
import com.bydan.erp.nomina.util.CargoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CargoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CargoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CargoBeanSwingJInternalFrame extends CargoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CargoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Cargo> cargoValidator = new ClassValidator<Cargo>(Cargo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Cargo cargo;	
	public Cargo cargoAux;
	public Cargo cargoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Cargo cargoTotales;
	public Long idCargoActual;
	public Long iIdNuevoCargo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboCargo="";

	public List<Cargo> cargosForeignKey;

	public List<Cargo> getcargosForeignKey() {
		return cargosForeignKey;
	}

	public void setcargosForeignKey(List<Cargo> cargosForeignKey) {
		this.cargosForeignKey = cargosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cargo cargoForeignKey;

	public Cargo getcargoForeignKey() {
		return cargoForeignKey;
	}

	public void setcargoForeignKey(Cargo cargoForeignKey) {
		this.cargoForeignKey = cargoForeignKey;
	}

	public String sFinalQueryComboCuentaContable="";

	public List<CuentaContable> cuentacontablesForeignKey;

	public List<CuentaContable> getcuentacontablesForeignKey() {
		return cuentacontablesForeignKey;
	}

	public void setcuentacontablesForeignKey(List<CuentaContable> cuentacontablesForeignKey) {
		this.cuentacontablesForeignKey = cuentacontablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontableForeignKey;

	public CuentaContable getcuentacontableForeignKey() {
		return cuentacontableForeignKey;
	}

	public void setcuentacontableForeignKey(CuentaContable cuentacontableForeignKey) {
		this.cuentacontableForeignKey = cuentacontableForeignKey;
	}

	public String sFinalQueryComboNumeroPatronal="";

	public List<NumeroPatronal> numeropatronalsForeignKey;

	public List<NumeroPatronal> getnumeropatronalsForeignKey() {
		return numeropatronalsForeignKey;
	}

	public void setnumeropatronalsForeignKey(List<NumeroPatronal> numeropatronalsForeignKey) {
		this.numeropatronalsForeignKey = numeropatronalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public NumeroPatronal numeropatronalForeignKey;

	public NumeroPatronal getnumeropatronalForeignKey() {
		return numeropatronalForeignKey;
	}

	public void setnumeropatronalForeignKey(NumeroPatronal numeropatronalForeignKey) {
		this.numeropatronalForeignKey = numeropatronalForeignKey;
	}

	public String sFinalQueryComboTipoPago_NM="";

	public List<TipoPago_NM> tipopago_nmsForeignKey;

	public List<TipoPago_NM> gettipopago_nmsForeignKey() {
		return tipopago_nmsForeignKey;
	}

	public void settipopago_nmsForeignKey(List<TipoPago_NM> tipopago_nmsForeignKey) {
		this.tipopago_nmsForeignKey = tipopago_nmsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPago_NM tipopago_nmForeignKey;

	public TipoPago_NM gettipopago_nmForeignKey() {
		return tipopago_nmForeignKey;
	}

	public void settipopago_nmForeignKey(TipoPago_NM tipopago_nmForeignKey) {
		this.tipopago_nmForeignKey = tipopago_nmForeignKey;
	}

	public String sFinalQueryComboCargoGrupo="";

	public List<CargoGrupo> cargogruposForeignKey;

	public List<CargoGrupo> getcargogruposForeignKey() {
		return cargogruposForeignKey;
	}

	public void setcargogruposForeignKey(List<CargoGrupo> cargogruposForeignKey) {
		this.cargogruposForeignKey = cargogruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public CargoGrupo cargogrupoForeignKey;

	public CargoGrupo getcargogrupoForeignKey() {
		return cargogrupoForeignKey;
	}

	public void setcargogrupoForeignKey(CargoGrupo cargogrupoForeignKey) {
		this.cargogrupoForeignKey = cargogrupoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosAsistenciaMensual=false;

	public Boolean getIsTienePermisosAsistenciaMensual() {
		return isTienePermisosAsistenciaMensual;
	}

	public void setIsTienePermisosAsistenciaMensual(Boolean isTienePermisosAsistenciaMensual) {
		this.isTienePermisosAsistenciaMensual= isTienePermisosAsistenciaMensual;
	}


	public Boolean isTienePermisosEmpleadoEstructura=false;

	public Boolean getIsTienePermisosEmpleadoEstructura() {
		return isTienePermisosEmpleadoEstructura;
	}

	public void setIsTienePermisosEmpleadoEstructura(Boolean isTienePermisosEmpleadoEstructura) {
		this.isTienePermisosEmpleadoEstructura= isTienePermisosEmpleadoEstructura;
	}


	public Boolean isTienePermisosEmpleado=false;

	public Boolean getIsTienePermisosEmpleado() {
		return isTienePermisosEmpleado;
	}

	public void setIsTienePermisosEmpleado(Boolean isTienePermisosEmpleado) {
		this.isTienePermisosEmpleado= isTienePermisosEmpleado;
	}


	public Boolean isTienePermisosCargo=false;

	public Boolean getIsTienePermisosCargo() {
		return isTienePermisosCargo;
	}

	public void setIsTienePermisosCargo(Boolean isTienePermisosCargo) {
		this.isTienePermisosCargo= isTienePermisosCargo;
	}

	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoCargo;
	public Boolean isPermisoNuevoCargo;
	public Boolean isPermisoActualizarCargo;
	public Boolean isPermisoActualizarOriginalCargo;
	public Boolean isPermisoEliminarCargo;
	public Boolean isPermisoGuardarCambiosCargo;
	public Boolean isPermisoConsultaCargo;
	public Boolean isPermisoBusquedaCargo;
	public Boolean isPermisoReporteCargo;
	public Boolean isPermisoPaginacionMedioCargo;
	public Boolean isPermisoPaginacionAltoCargo;
	public Boolean isPermisoPaginacionTodoCargo;
	public Boolean isPermisoCopiarCargo;
	public Boolean isPermisoVerFormCargo;
	public Boolean isPermisoDuplicarCargo;
	public Boolean isPermisoOrdenCargo;
	
	public List<Cargo> cargosArbol;
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public CargoParameterReturnGeneral cargoReturnGeneral;
	public CargoParameterReturnGeneral cargoParameterGeneral;
	
	

	public AsistenciaMensualLogic asistenciamensualLogic=null;

	public AsistenciaMensualLogic getAsistenciaMensualLogic() {
		return asistenciamensualLogic;
	}

	public void setAsistenciaMensualLogic(AsistenciaMensualLogic asistenciamensualLogic) {
		this.asistenciamensualLogic = asistenciamensualLogic;
	}


	public EmpleadoEstructuraLogic empleadoestructuraLogic=null;

	public EmpleadoEstructuraLogic getEmpleadoEstructuraLogic() {
		return empleadoestructuraLogic;
	}

	public void setEmpleadoEstructuraLogic(EmpleadoEstructuraLogic empleadoestructuraLogic) {
		this.empleadoestructuraLogic = empleadoestructuraLogic;
	}


	public EmpleadoLogic empleadoLogic=null;

	public EmpleadoLogic getEmpleadoLogic() {
		return empleadoLogic;
	}

	public void setEmpleadoLogic(EmpleadoLogic empleadoLogic) {
		this.empleadoLogic = empleadoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCargo=false;
	public Boolean esParaAccionDesdeFormularioCargo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CargoSessionBeanAdditional cargoSessionBeanAdditional=null;
	
	public CargoSessionBeanAdditional getCargoSessionBeanAdditional() {
		return this.cargoSessionBeanAdditional;
	}
	
	public void setCargoSessionBeanAdditional(CargoSessionBeanAdditional cargoSessionBeanAdditional) {
		try {
			this.cargoSessionBeanAdditional=cargoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CargoBeanSwingJInternalFrameAdditional cargoBeanSwingJInternalFrameAdditional=null;
	//public class CargoBeanSwingJInternalFrame
	
	public CargoBeanSwingJInternalFrameAdditional getCargoBeanSwingJInternalFrameAdditional() {
		return this.cargoBeanSwingJInternalFrameAdditional;
	}
	
	public void setCargoBeanSwingJInternalFrameAdditional(CargoBeanSwingJInternalFrameAdditional cargoBeanSwingJInternalFrameAdditional) {
		try {
			this.cargoBeanSwingJInternalFrameAdditional=cargoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CargoLogic cargoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Cargo cargoBean;
	public CargoConstantesFunciones cargoConstantesFunciones;
	//public CargoParameterReturnGeneral cargoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public CuentaContableLogic cuentacontableLogic;
	public NumeroPatronalLogic numeropatronalLogic;
	public TipoPago_NMLogic tipopago_nmLogic;
	public CargoGrupoLogic cargogrupoLogic;
	
	//PARAMETROS
	
	
	//public List<Cargo> cargos;	
	//public List<Cargo> cargosEliminados;
	//public List<Cargo> cargosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCargo=false;
	public Boolean isVisibilidadCeldaDuplicarCargo=true;
	public Boolean isVisibilidadCeldaCopiarCargo=true;
	public Boolean isVisibilidadCeldaVerFormCargo=true;
	public Boolean isVisibilidadCeldaOrdenCargo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCargo=false;
	public Boolean isVisibilidadCeldaModificarCargo=false;
	public Boolean isVisibilidadCeldaActualizarCargo=false;
	public Boolean isVisibilidadCeldaEliminarCargo=false;
	public Boolean isVisibilidadCeldaCancelarCargo=false;
	public Boolean isVisibilidadCeldaGuardarCargo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCargo=false;	
	
	
	public Boolean isVisibilidadFK_IdCargo=false;
	public Boolean isVisibilidadFK_IdCargoGrupo=false;
	public Boolean isVisibilidadFK_IdCuentaContable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdNumeroPatronal=false;
	public Boolean isVisibilidadFK_IdTipoPago_NM=false;
	
	public Long getiIdNuevoCargo() {
		return this.iIdNuevoCargo;
	}

	public void setiIdNuevoCargo(Long iIdNuevoCargo) {
		this.iIdNuevoCargo = iIdNuevoCargo;
	}
	
	public Long getidCargoActual() {
		return this.idCargoActual;
	}

	public void setidCargoActual(Long idCargoActual) {
		this.idCargoActual = idCargoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Cargo getcargo() {
		return this.cargo;
	}

	public void setcargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public Cargo getcargoAux() {
		return this.cargoAux;
	}

	public void setcargoAux(Cargo cargoAux) {
		this.cargoAux = cargoAux;
	}				
	
	public Cargo getcargoAnterior() {
		return this.cargoAnterior;
	}

	public void setcargoAnterior(Cargo cargoAnterior) {
		this.cargoAnterior = cargoAnterior;
	}	
	
	public Cargo getcargoTotales() {
		return this.cargoTotales;
	}

	public void setcargoTotales(Cargo cargoTotales) {
		this.cargoTotales = cargoTotales;
	}	
	
	public Cargo getcargoBean() {
		return this.cargoBean;
	}

	public void setcargoBean(Cargo cargoBean) {
		this.cargoBean = cargoBean;
	}	
	
	public CargoParameterReturnGeneral getcargoReturnGeneral() {
		return this.cargoReturnGeneral;
	}

	public void setcargoReturnGeneral(CargoParameterReturnGeneral cargoReturnGeneral) {
		this.cargoReturnGeneral = cargoReturnGeneral;
	}	
	
	
	public Long id_cargoFK_IdCargo=-1L;

	public Long getid_cargoFK_IdCargo() {
		return this.id_cargoFK_IdCargo;
	}

	public void setid_cargoFK_IdCargo(Long id_cargoFK_IdCargo) {
		this.id_cargoFK_IdCargo = id_cargoFK_IdCargo;
	}

	public Long id_cargo_grupoFK_IdCargoGrupo=-1L;

	public Long getid_cargo_grupoFK_IdCargoGrupo() {
		return this.id_cargo_grupoFK_IdCargoGrupo;
	}

	public void setid_cargo_grupoFK_IdCargoGrupo(Long id_cargo_grupoFK_IdCargoGrupo) {
		this.id_cargo_grupoFK_IdCargoGrupo = id_cargo_grupoFK_IdCargoGrupo;
	}

	public Long id_cuenta_contableFK_IdCuentaContable=-1L;

	public Long getid_cuenta_contableFK_IdCuentaContable() {
		return this.id_cuenta_contableFK_IdCuentaContable;
	}

	public void setid_cuenta_contableFK_IdCuentaContable(Long id_cuenta_contableFK_IdCuentaContable) {
		this.id_cuenta_contableFK_IdCuentaContable = id_cuenta_contableFK_IdCuentaContable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_numero_patronalFK_IdNumeroPatronal=-1L;

	public Long getid_numero_patronalFK_IdNumeroPatronal() {
		return this.id_numero_patronalFK_IdNumeroPatronal;
	}

	public void setid_numero_patronalFK_IdNumeroPatronal(Long id_numero_patronalFK_IdNumeroPatronal) {
		this.id_numero_patronalFK_IdNumeroPatronal = id_numero_patronalFK_IdNumeroPatronal;
	}

	public Long id_tipo_pago__n_mFK_IdTipoPago_NM=-1L;

	public Long getid_tipo_pago__n_mFK_IdTipoPago_NM() {
		return this.id_tipo_pago__n_mFK_IdTipoPago_NM;
	}

	public void setid_tipo_pago__n_mFK_IdTipoPago_NM(Long id_tipo_pago__n_mFK_IdTipoPago_NM) {
		this.id_tipo_pago__n_mFK_IdTipoPago_NM = id_tipo_pago__n_mFK_IdTipoPago_NM;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CargoLogic getCargoLogic()	{		
		return cargoLogic;
	}

	public void setCargoLogic(CargoLogic cargoLogic) {
		this.cargoLogic = cargoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoCargo() {
		return isEsNuevoCargo;
	}

	public void setIsEsNuevoCargo(Boolean isEsNuevoCargo) {
		this.isEsNuevoCargo = isEsNuevoCargo;
	}

	public Boolean getEsParaAccionDesdeFormularioCargo() {
		return esParaAccionDesdeFormularioCargo;
	}
	
	public void setEsParaAccionDesdeFormularioCargo(Boolean esParaAccionDesdeFormularioCargo) {
		this.esParaAccionDesdeFormularioCargo = esParaAccionDesdeFormularioCargo;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(cargoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCargosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cargosForeignKey=new ArrayList<Cargo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CargoLogic cargoLogic=new CargoLogic();

			//cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cargoLogic.getCargoDataAccess().setIsForForeingKeyData(true);

					cargoLogic.getTodosCargosWithConnection(sFinalQuery,new Pagination());

					this.cargosForeignKey=cargoLogic.getCargos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCargo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getEntityWithConnection(cargoSessionBean.getlidCargoActual());
					this.cargosForeignKey.add(cargoLogic.getCargo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCuentaContablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablesForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(cargoSessionBean.getlidCuentaContableActual());
					this.cuentacontablesForeignKey.add(cuentacontableLogic.getCuentaContable());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosNumeroPatronalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			NumeroPatronalLogic numeropatronalLogic=new NumeroPatronalLogic();

			//numeropatronalLogic.getNumeroPatronalDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//numeropatronalLogic.getNumeroPatronalDataAccess().setIsForForeingKeyData(true);

					numeropatronalLogic.getTodosNumeroPatronalsWithConnection(sFinalQuery,new Pagination());

					this.numeropatronalsForeignKey=numeropatronalLogic.getNumeroPatronals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaNumeroPatronal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getEntityWithConnection(cargoSessionBean.getlidNumeroPatronalActual());
					this.numeropatronalsForeignKey.add(numeropatronalLogic.getNumeroPatronal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoPago_NMsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipopago_nmsForeignKey=new ArrayList<TipoPago_NM>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPago_NMLogic tipopago_nmLogic=new TipoPago_NMLogic();

			//tipopago_nmLogic.getTipoPago_NMDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPago_NM()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipopago_nmLogic.getTipoPago_NMDataAccess().setIsForForeingKeyData(true);

					tipopago_nmLogic.getTodosTipoPago_NMsWithConnection(sFinalQuery,new Pagination());

					this.tipopago_nmsForeignKey=tipopago_nmLogic.getTipoPago_NMs();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPago_NM(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipopago_nmLogic.getEntityWithConnection(cargoSessionBean.getlidTipoPago_NMActual());
					this.tipopago_nmsForeignKey.add(tipopago_nmLogic.getTipoPago_NM());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosCargoGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cargogruposForeignKey=new ArrayList<CargoGrupo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CargoGrupoLogic cargogrupoLogic=new CargoGrupoLogic();

			//cargogrupoLogic.getCargoGrupoDataAccess().setIsForForeingKeyData(true);

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargoGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cargogrupoLogic.getCargoGrupoDataAccess().setIsForForeingKeyData(true);

					cargogrupoLogic.getTodosCargoGruposWithConnection(sFinalQuery,new Pagination());

					this.cargogruposForeignKey=cargogrupoLogic.getCargoGrupos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCargoGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargogrupoLogic.getEntityWithConnection(cargoSessionBean.getlidCargoGrupoActual());
					this.cargogruposForeignKey.add(cargogrupoLogic.getCargoGrupo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCargo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCargoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaCargoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCargoGenerico!=null && jComboBoxid_empresaCargoGenerico.getItemCount()>0) {
					jComboBoxid_empresaCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCargoForeignKey(Long idCargoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cargoTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setCargo(cargoTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setSelectedItem(cargoTemp);
					}
				} else {
					//jComboBoxid_cargoCargo.setSelectedItem(cargoTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargoTemp!=null && jComboBoxid_cargoFK_IdCargoCargo!=null) {
						jComboBoxid_cargoFK_IdCargoCargo.setSelectedItem(cargoTemp);
					} else {
						if(jComboBoxid_cargoFK_IdCargoCargo!=null) {
							//jComboBoxid_cargoFK_IdCargoCargo.setSelectedItem(cargoTemp);
							if(jComboBoxid_cargoFK_IdCargoCargo.getItemCount()>0) {
								jComboBoxid_cargoFK_IdCargoCargo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCargoForeignKeyDescripcion(Long idCargoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}


			sDescripcion=CargoConstantesFunciones.getCargoDescripcion(cargoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCargoForeignKeyGenerico(Long idCargoSeleccionado,JComboBox jComboBoxid_cargoCargoGenerico)throws Exception
	{
		try
		{
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosForeignKey) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			if(cargoTemp!=null) {
				jComboBoxid_cargoCargoGenerico.setSelectedItem(cargoTemp);
			} else {
				if(jComboBoxid_cargoCargoGenerico!=null && jComboBoxid_cargoCargoGenerico.getItemCount()>0) {
					jComboBoxid_cargoCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableForeignKey(Long idCuentaContableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontableTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setCuentaContable(cuentacontableTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setSelectedItem(cuentacontableTemp);
					}
				} else {
					//jComboBoxid_cuenta_contableCargo.setSelectedItem(cuentacontableTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontableTemp!=null && jComboBoxid_cuenta_contableFK_IdCuentaContableCargo!=null) {
						jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setSelectedItem(cuentacontableTemp);
					} else {
						if(jComboBoxid_cuenta_contableFK_IdCuentaContableCargo!=null) {
							//jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setSelectedItem(cuentacontableTemp);
							if(jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.getItemCount()>0) {
								jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCuentaContableForeignKeyDescripcion(Long idCuentaContableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableForeignKeyGenerico(Long idCuentaContableSeleccionado,JComboBox jComboBoxid_cuenta_contableCargoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableTemp=null;

			for(CuentaContable cuentacontableAux:cuentacontablesForeignKey) {
				if(cuentacontableAux.getId()!=null && cuentacontableAux.getId().equals(idCuentaContableSeleccionado)) {
					cuentacontableTemp=cuentacontableAux;
					break;
				}
			}

			if(cuentacontableTemp!=null) {
				jComboBoxid_cuenta_contableCargoGenerico.setSelectedItem(cuentacontableTemp);
			} else {
				if(jComboBoxid_cuenta_contableCargoGenerico!=null && jComboBoxid_cuenta_contableCargoGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contableCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualNumeroPatronalForeignKey(Long idNumeroPatronalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(numeropatronalTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setNumeroPatronal(numeropatronalTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setSelectedItem(numeropatronalTemp);
					}
				} else {
					//jComboBoxid_numero_patronalCargo.setSelectedItem(numeropatronalTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdNumeroPatronal") || sFormularioTipoBusqueda.equals("Todos")){
					if(numeropatronalTemp!=null && jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo!=null) {
						jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setSelectedItem(numeropatronalTemp);
					} else {
						if(jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo!=null) {
							//jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setSelectedItem(numeropatronalTemp);
							if(jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.getItemCount()>0) {
								jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualNumeroPatronalForeignKeyDescripcion(Long idNumeroPatronalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}


			sDescripcion=NumeroPatronalConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualNumeroPatronalForeignKeyGenerico(Long idNumeroPatronalSeleccionado,JComboBox jComboBoxid_numero_patronalCargoGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsForeignKey) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}

			if(numeropatronalTemp!=null) {
				jComboBoxid_numero_patronalCargoGenerico.setSelectedItem(numeropatronalTemp);
			} else {
				if(jComboBoxid_numero_patronalCargoGenerico!=null && jComboBoxid_numero_patronalCargoGenerico.getItemCount()>0) {
					jComboBoxid_numero_patronalCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPago_NMForeignKey(Long idTipoPago_NMSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPago_NM  tipopago_nmTemp=null;

			for(TipoPago_NM tipopago_nmAux:tipopago_nmsForeignKey) {
				if(tipopago_nmAux.getId()!=null && tipopago_nmAux.getId().equals(idTipoPago_NMSeleccionado)) {
					tipopago_nmTemp=tipopago_nmAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipopago_nmTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setTipoPago_NM(tipopago_nmTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setSelectedItem(tipopago_nmTemp);
					}
				} else {
					//jComboBoxid_tipo_pago__n_mCargo.setSelectedItem(tipopago_nmTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPago_NM") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipopago_nmTemp!=null && jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo!=null) {
						jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setSelectedItem(tipopago_nmTemp);
					} else {
						if(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo!=null) {
							//jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setSelectedItem(tipopago_nmTemp);
							if(jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.getItemCount()>0) {
								jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoPago_NMForeignKeyDescripcion(Long idTipoPago_NMSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPago_NM  tipopago_nmTemp=null;

			for(TipoPago_NM tipopago_nmAux:tipopago_nmsForeignKey) {
				if(tipopago_nmAux.getId()!=null && tipopago_nmAux.getId().equals(idTipoPago_NMSeleccionado)) {
					tipopago_nmTemp=tipopago_nmAux;
					break;
				}
			}


			sDescripcion=TipoPago_NMConstantesFunciones.getTipoPago_NMDescripcion(tipopago_nmTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPago_NMForeignKeyGenerico(Long idTipoPago_NMSeleccionado,JComboBox jComboBoxid_tipo_pago__n_mCargoGenerico)throws Exception
	{
		try
		{
			TipoPago_NM  tipopago_nmTemp=null;

			for(TipoPago_NM tipopago_nmAux:tipopago_nmsForeignKey) {
				if(tipopago_nmAux.getId()!=null && tipopago_nmAux.getId().equals(idTipoPago_NMSeleccionado)) {
					tipopago_nmTemp=tipopago_nmAux;
					break;
				}
			}

			if(tipopago_nmTemp!=null) {
				jComboBoxid_tipo_pago__n_mCargoGenerico.setSelectedItem(tipopago_nmTemp);
			} else {
				if(jComboBoxid_tipo_pago__n_mCargoGenerico!=null && jComboBoxid_tipo_pago__n_mCargoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_pago__n_mCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCargoGrupoForeignKey(Long idCargoGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CargoGrupo  cargogrupoTemp=null;

			for(CargoGrupo cargogrupoAux:cargogruposForeignKey) {
				if(cargogrupoAux.getId()!=null && cargogrupoAux.getId().equals(idCargoGrupoSeleccionado)) {
					cargogrupoTemp=cargogrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cargogrupoTemp!=null) {

					if(this.cargo!=null) {
						this.cargo.setCargoGrupo(cargogrupoTemp);
					}

					if(this.jInternalFrameDetalleFormCargo!=null) {
						this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setSelectedItem(cargogrupoTemp);
					}
				} else {
					//jComboBoxid_cargo_grupoCargo.setSelectedItem(cargogrupoTemp);
					if(this.jInternalFrameDetalleFormCargo!=null) {
						if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.getItemCount()>0) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCargoGrupo") || sFormularioTipoBusqueda.equals("Todos")){
					if(cargogrupoTemp!=null && jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo!=null) {
						jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setSelectedItem(cargogrupoTemp);
					} else {
						if(jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo!=null) {
							//jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setSelectedItem(cargogrupoTemp);
							if(jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.getItemCount()>0) {
								jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualCargoGrupoForeignKeyDescripcion(Long idCargoGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CargoGrupo  cargogrupoTemp=null;

			for(CargoGrupo cargogrupoAux:cargogruposForeignKey) {
				if(cargogrupoAux.getId()!=null && cargogrupoAux.getId().equals(idCargoGrupoSeleccionado)) {
					cargogrupoTemp=cargogrupoAux;
					break;
				}
			}


			sDescripcion=CargoGrupoConstantesFunciones.getCargoGrupoDescripcion(cargogrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCargoGrupoForeignKeyGenerico(Long idCargoGrupoSeleccionado,JComboBox jComboBoxid_cargo_grupoCargoGenerico)throws Exception
	{
		try
		{
			CargoGrupo  cargogrupoTemp=null;

			for(CargoGrupo cargogrupoAux:cargogruposForeignKey) {
				if(cargogrupoAux.getId()!=null && cargogrupoAux.getId().equals(idCargoGrupoSeleccionado)) {
					cargogrupoTemp=cargogrupoAux;
					break;
				}
			}

			if(cargogrupoTemp!=null) {
				jComboBoxid_cargo_grupoCargoGenerico.setSelectedItem(cargogrupoTemp);
			} else {
				if(jComboBoxid_cargo_grupoCargoGenerico!=null && jComboBoxid_cargo_grupoCargoGenerico.getItemCount()>0) {
					jComboBoxid_cargo_grupoCargoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Cargo cargo,JComboBox jComboBoxid_empresaCargoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCargoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCargoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cargo.setid_empresa(empresaAux.getId());
				cargo.setempresa_descripcion(CargoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cargo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoForeignKey(Cargo cargo,JComboBox jComboBoxid_cargoCargoGenerico)throws Exception
	{
		try
		{
			Cargo  cargoAux=new Cargo();

			if(jComboBoxid_cargoCargoGenerico==null) {
				cargoAux=(Cargo)this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.getSelectedItem();
			} else {
				cargoAux=(Cargo)jComboBoxid_cargoCargoGenerico.getSelectedItem();
			}

			if(cargoAux!=null && cargoAux.getId()!=null) {
				cargo.setid_cargo(cargoAux.getId());
				cargo.setcargo_descripcion(CargoConstantesFunciones.getCargoDescripcion(cargoAux));
				cargo.setCargo(cargoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableForeignKey(Cargo cargo,JComboBox jComboBoxid_cuenta_contableCargoGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contableCargoGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contableCargoGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null && cuentacontableAux.getId()!=null) {
				cargo.setid_cuenta_contable(cuentacontableAux.getId());
				cargo.setcuentacontable_descripcion(CargoConstantesFunciones.getCuentaContableDescripcion(cuentacontableAux));
				cargo.setCuentaContable(cuentacontableAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarNumeroPatronalForeignKey(Cargo cargo,JComboBox jComboBoxid_numero_patronalCargoGenerico)throws Exception
	{
		try
		{
			NumeroPatronal  numeropatronalAux=new NumeroPatronal();

			if(jComboBoxid_numero_patronalCargoGenerico==null) {
				numeropatronalAux=(NumeroPatronal)this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.getSelectedItem();
			} else {
				numeropatronalAux=(NumeroPatronal)jComboBoxid_numero_patronalCargoGenerico.getSelectedItem();
			}

			if(numeropatronalAux!=null && numeropatronalAux.getId()!=null) {
				cargo.setid_numero_patronal(numeropatronalAux.getId());
				cargo.setnumeropatronal_descripcion(CargoConstantesFunciones.getNumeroPatronalDescripcion(numeropatronalAux));
				cargo.setNumeroPatronal(numeropatronalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPago_NMForeignKey(Cargo cargo,JComboBox jComboBoxid_tipo_pago__n_mCargoGenerico)throws Exception
	{
		try
		{
			TipoPago_NM  tipopago_nmAux=new TipoPago_NM();

			if(jComboBoxid_tipo_pago__n_mCargoGenerico==null) {
				tipopago_nmAux=(TipoPago_NM)this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.getSelectedItem();
			} else {
				tipopago_nmAux=(TipoPago_NM)jComboBoxid_tipo_pago__n_mCargoGenerico.getSelectedItem();
			}

			if(tipopago_nmAux!=null && tipopago_nmAux.getId()!=null) {
				cargo.setid_tipo_pago__n_m(tipopago_nmAux.getId());
				cargo.settipopago_nm_descripcion(CargoConstantesFunciones.getTipoPago_NMDescripcion(tipopago_nmAux));
				cargo.setTipoPago_NM(tipopago_nmAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCargoGrupoForeignKey(Cargo cargo,JComboBox jComboBoxid_cargo_grupoCargoGenerico)throws Exception
	{
		try
		{
			CargoGrupo  cargogrupoAux=new CargoGrupo();

			if(jComboBoxid_cargo_grupoCargoGenerico==null) {
				cargogrupoAux=(CargoGrupo)this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.getSelectedItem();
			} else {
				cargogrupoAux=(CargoGrupo)jComboBoxid_cargo_grupoCargoGenerico.getSelectedItem();
			}

			if(cargogrupoAux!=null && cargogrupoAux.getId()!=null) {
				cargo.setid_cargo_grupo(cargogrupoAux.getId());
				cargo.setcargogrupo_descripcion(CargoConstantesFunciones.getCargoGrupoDescripcion(cargogrupoAux));
				cargo.setCargoGrupo(cargogrupoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCargosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCargo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.addItem(cargo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCargo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargoFK_IdCargoCargo.removeAllItems();

							for(Cargo cargo:this.cargosForeignKey) {
								this.jComboBoxid_cargoFK_IdCargoCargo.addItem(cargo);
							}
						}

						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.addItem(cuentacontable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.removeAllItems();

							for(CuentaContable cuentacontable:this.cuentacontablesForeignKey) {
								this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.addItem(cuentacontable);
							}
						}

						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameNumeroPatronalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingNumeroPatronal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.addItem(numeropatronal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdNumeroPatronal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.removeAllItems();

							for(NumeroPatronal numeropatronal:this.numeropatronalsForeignKey) {
								this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.addItem(numeropatronal);
							}
						}

						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPago_NMsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPago_NM=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.removeAllItems();

							for(TipoPago_NM tipopago_nm:this.tipopago_nmsForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.addItem(tipopago_nm);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPago_NM") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.removeAllItems();

							for(TipoPago_NM tipopago_nm:this.tipopago_nmsForeignKey) {
								this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.addItem(tipopago_nm);
							}
						}

						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCargoGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCargoGrupo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) { 
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.removeAllItems();

							for(CargoGrupo cargogrupo:this.cargogruposForeignKey) {
								this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.addItem(cargogrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCargo!=null) { 
					}

					if(!CargoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCargoGrupo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.removeAllItems();

							for(CargoGrupo cargogrupo:this.cargogruposForeignKey) {
								this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.addItem(cargogrupo);
							}
						}

						if(!CargoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCargoForeignKey(Cargo cargo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setSelectedItem(cargo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargoFK_IdCargoCargo.setSelectedItem(cargo);
						} else {
							this.jComboBoxid_cargoFK_IdCargoCargo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableForeignKey(CuentaContable cuentacontable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setSelectedItem(cuentacontable);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setSelectedItem(cuentacontable);
						} else {
							this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameNumeroPatronalForeignKey(NumeroPatronal numeropatronal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setSelectedItem(numeropatronal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setSelectedItem(numeropatronal);
						} else {
							this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPago_NMForeignKey(TipoPago_NM tipopago_nm,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setSelectedItem(tipopago_nm);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setSelectedItem(tipopago_nm);
						} else {
							this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCargoGrupoForeignKey(CargoGrupo cargogrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setSelectedItem(cargogrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormCargo!=null) {
							this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setSelectedItem(cargogrupo);
						} else {
							this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCargo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CargoConstantesFunciones.refrescarForeignKeysDescripcionesCargo(this.cargoLogic.getCargos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CargoConstantesFunciones.refrescarForeignKeysDescripcionesCargo(this.cargos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Cargo.class));
		classes.add(new Classe(CuentaContable.class));
		classes.add(new Classe(NumeroPatronal.class));
		classes.add(new Classe(TipoPago_NM.class));
		classes.add(new Classe(CargoGrupo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cargoLogic.setCargos(this.cargos);
			cargoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public CargoParameterReturnGeneral getCargoParameterGeneral() {
		return this.cargoParameterGeneral;
	}
	
	public void setCargoParameterGeneral(CargoParameterReturnGeneral cargoParameterGeneral) {
		this.cargoParameterGeneral = cargoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoCargo() {
		return isPermisoTodoCargo;
	}

	public void setIsPermisoTodoCargo(Boolean isPermisoTodoCargo) {
		this.isPermisoTodoCargo = isPermisoTodoCargo;
	}

	public Boolean getIsPermisoNuevoCargo() {
		return isPermisoNuevoCargo;
	}

	public void setIsPermisoNuevoCargo(Boolean isPermisoNuevoCargo) {
		this.isPermisoNuevoCargo = isPermisoNuevoCargo;
	}

	public Boolean getIsPermisoActualizarCargo() {
		return isPermisoActualizarCargo;
	}

	public void setIsPermisoActualizarCargo(Boolean isPermisoActualizarCargo) {
		this.isPermisoActualizarCargo = isPermisoActualizarCargo;
	}

	public Boolean getIsPermisoEliminarCargo() {
		return isPermisoEliminarCargo;
	}

	public void setIsPermisoEliminarCargo(Boolean isPermisoEliminarCargo) {
		this.isPermisoEliminarCargo = isPermisoEliminarCargo;
	}

	public Boolean getIsPermisoGuardarCambiosCargo() {
		return isPermisoGuardarCambiosCargo;
	}

	public void setIsPermisoGuardarCambiosCargo(Boolean isPermisoGuardarCambiosCargo) {
		this.isPermisoGuardarCambiosCargo = isPermisoGuardarCambiosCargo;
	}
	
	public Boolean getIsPermisoConsultaCargo() {
		return isPermisoConsultaCargo;
	}

	public void setIsPermisoConsultaCargo(Boolean isPermisoConsultaCargo) {
		this.isPermisoConsultaCargo = isPermisoConsultaCargo;
	}

	public Boolean getIsPermisoBusquedaCargo() {
		return isPermisoBusquedaCargo;
	}

	public void setIsPermisoBusquedaCargo(Boolean isPermisoBusquedaCargo) {
		this.isPermisoBusquedaCargo = isPermisoBusquedaCargo;
	}

	public Boolean getIsPermisoReporteCargo() {
		return isPermisoReporteCargo;
	}

	public void setIsPermisoReporteCargo(Boolean isPermisoReporteCargo) {
		this.isPermisoReporteCargo = isPermisoReporteCargo;
	}
	
	public Boolean getIsPermisoPaginacionMedioCargo() {
		return isPermisoPaginacionMedioCargo;
	}

	public void setIsPermisoPaginacionMedioCargo(Boolean isPermisoPaginacionMedioCargo) {
		this.isPermisoPaginacionMedioCargo = isPermisoPaginacionMedioCargo;
	}
	
	public Boolean getIsPermisoPaginacionTodoCargo() {
		return isPermisoPaginacionTodoCargo;
	}

	public void setIsPermisoPaginacionTodoCargo(Boolean isPermisoPaginacionTodoCargo) {
		this.isPermisoPaginacionTodoCargo = isPermisoPaginacionTodoCargo;
	}
	
	public Boolean getIsPermisoPaginacionAltoCargo() {
		return isPermisoPaginacionAltoCargo;
	}

	public void setIsPermisoPaginacionAltoCargo(Boolean isPermisoPaginacionAltoCargo) {
		this.isPermisoPaginacionAltoCargo = isPermisoPaginacionAltoCargo;
	}
	
	public Boolean getIsPermisoCopiarCargo() {
		return isPermisoCopiarCargo;
	}

	public void setIsPermisoCopiarCargo(Boolean isPermisoCopiarCargo) {
		this.isPermisoCopiarCargo = isPermisoCopiarCargo;
	}
	
	public Boolean getIsPermisoVerFormCargo() {
		return isPermisoVerFormCargo;
	}

	public void setIsPermisoVerFormCargo(Boolean isPermisoVerFormCargo) {
		this.isPermisoVerFormCargo = isPermisoVerFormCargo;
	}
	
	public Boolean getIsPermisoDuplicarCargo() {
		return isPermisoDuplicarCargo;
	}

	public void setIsPermisoDuplicarCargo(Boolean isPermisoDuplicarCargo) {
		this.isPermisoDuplicarCargo = isPermisoDuplicarCargo;
	}
	
	public Boolean getIsPermisoOrdenCargo() {
		return isPermisoOrdenCargo;
	}

	public void setIsPermisoOrdenCargo(Boolean isPermisoOrdenCargo) {
		this.isPermisoOrdenCargo = isPermisoOrdenCargo;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoCargo() {
		return isVisibilidadCeldaNuevoCargo;
	}

	public void setIsVisibilidadCeldaNuevoCargo(Boolean isVisibilidadCeldaNuevoCargo) {
		this.isVisibilidadCeldaNuevoCargo = isVisibilidadCeldaNuevoCargo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCargo() {
		return isVisibilidadCeldaDuplicarCargo;
	}

	public void setIsVisibilidadCeldaDuplicarCargo(Boolean isVisibilidadCeldaDuplicarCargo) {
		this.isVisibilidadCeldaDuplicarCargo = isVisibilidadCeldaDuplicarCargo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCargo() {
		return isVisibilidadCeldaCopiarCargo;
	}

	public void setIsVisibilidadCeldaCopiarCargo(Boolean isVisibilidadCeldaCopiarCargo) {
		this.isVisibilidadCeldaCopiarCargo = isVisibilidadCeldaCopiarCargo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCargo() {
		return isVisibilidadCeldaVerFormCargo;
	}

	public void setIsVisibilidadCeldaVerFormCargo(Boolean isVisibilidadCeldaVerFormCargo) {
		this.isVisibilidadCeldaVerFormCargo = isVisibilidadCeldaVerFormCargo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCargo() {
		return isVisibilidadCeldaOrdenCargo;
	}

	public void setIsVisibilidadCeldaOrdenCargo(Boolean isVisibilidadCeldaOrdenCargo) {
		this.isVisibilidadCeldaOrdenCargo = isVisibilidadCeldaOrdenCargo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCargo() {
		return isVisibilidadCeldaNuevoRelacionesCargo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCargo(Boolean isVisibilidadCeldaNuevoRelacionesCargo) {
		this.isVisibilidadCeldaNuevoRelacionesCargo = isVisibilidadCeldaNuevoRelacionesCargo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCargo() {
		return isVisibilidadCeldaModificarCargo;
	}

	public void setIsVisibilidadCeldaModificarCargo(Boolean isVisibilidadCeldaModificarCargo) {
		this.isVisibilidadCeldaModificarCargo = isVisibilidadCeldaModificarCargo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCargo() {
		return isVisibilidadCeldaActualizarCargo;
	}

	public void setIsVisibilidadCeldaActualizarCargo(Boolean isVisibilidadCeldaActualizarCargo) {
		this.isVisibilidadCeldaActualizarCargo = isVisibilidadCeldaActualizarCargo;
	}

	public Boolean getIsVisibilidadCeldaEliminarCargo() {
		return isVisibilidadCeldaEliminarCargo;
	}

	public void setIsVisibilidadCeldaEliminarCargo(Boolean isVisibilidadCeldaEliminarCargo) {
		this.isVisibilidadCeldaEliminarCargo = isVisibilidadCeldaEliminarCargo;
	}

	public Boolean getIsVisibilidadCeldaCancelarCargo() {
		return isVisibilidadCeldaCancelarCargo;
	}

	public void setIsVisibilidadCeldaCancelarCargo(Boolean isVisibilidadCeldaCancelarCargo) {
		this.isVisibilidadCeldaCancelarCargo = isVisibilidadCeldaCancelarCargo;
	}

	public Boolean getIsVisibilidadCeldaGuardarCargo() {
		return isVisibilidadCeldaGuardarCargo;
	}

	public void setIsVisibilidadCeldaGuardarCargo(Boolean isVisibilidadCeldaGuardarCargo) {
		this.isVisibilidadCeldaGuardarCargo = isVisibilidadCeldaGuardarCargo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCargo() {
		return isVisibilidadCeldaGuardarCambiosCargo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCargo(Boolean isVisibilidadCeldaGuardarCambiosCargo) {
		this.isVisibilidadCeldaGuardarCambiosCargo = isVisibilidadCeldaGuardarCambiosCargo;
	}
		
	public CargoSessionBean getcargoSessionBean() {
		return this.cargoSessionBean;
	}
	
	public void setcargoSessionBean(CargoSessionBean cargoSessionBean) {
		this.cargoSessionBean=cargoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCargo() {
		return this.isVisibilidadFK_IdCargo;
	}

	public void setisVisibilidadFK_IdCargo(Boolean isVisibilidadFK_IdCargo) {
		this.isVisibilidadFK_IdCargo=isVisibilidadFK_IdCargo;
	}

	public Boolean getisVisibilidadFK_IdCargoGrupo() {
		return this.isVisibilidadFK_IdCargoGrupo;
	}

	public void setisVisibilidadFK_IdCargoGrupo(Boolean isVisibilidadFK_IdCargoGrupo) {
		this.isVisibilidadFK_IdCargoGrupo=isVisibilidadFK_IdCargoGrupo;
	}

	public Boolean getisVisibilidadFK_IdCuentaContable() {
		return this.isVisibilidadFK_IdCuentaContable;
	}

	public void setisVisibilidadFK_IdCuentaContable(Boolean isVisibilidadFK_IdCuentaContable) {
		this.isVisibilidadFK_IdCuentaContable=isVisibilidadFK_IdCuentaContable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdNumeroPatronal() {
		return this.isVisibilidadFK_IdNumeroPatronal;
	}

	public void setisVisibilidadFK_IdNumeroPatronal(Boolean isVisibilidadFK_IdNumeroPatronal) {
		this.isVisibilidadFK_IdNumeroPatronal=isVisibilidadFK_IdNumeroPatronal;
	}

	public Boolean getisVisibilidadFK_IdTipoPago_NM() {
		return this.isVisibilidadFK_IdTipoPago_NM;
	}

	public void setisVisibilidadFK_IdTipoPago_NM(Boolean isVisibilidadFK_IdTipoPago_NM) {
		this.isVisibilidadFK_IdTipoPago_NM=isVisibilidadFK_IdTipoPago_NM;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCargo(Cargo cargo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cargo,null);
				this.setActualParaGuardarCargoForeignKey(cargo,null);
				this.setActualParaGuardarCuentaContableForeignKey(cargo,null);
				this.setActualParaGuardarNumeroPatronalForeignKey(cargo,null);
				this.setActualParaGuardarTipoPago_NMForeignKey(cargo,null);
				this.setActualParaGuardarCargoGrupoForeignKey(cargo,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Cargo cargo,Cargo cargoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCargo(cargo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cargoAux.setId(cargo.getId());
		cargoAux.setVersionRow(cargo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCargo();
		
			int intSelectedRow = this.jTableDatosCargo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cargoValidator.getInvalidValues(this.cargo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cargoLogic.setDatosCliente(datosCliente);
			cargoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cargoAux=new  Cargo();
				
				cargoAux.setIsNew(true);
				cargoAux.setIsChanged(true);
				
				cargoAux.setCargoOriginal(this.cargo);
				
				cargoAux.setId(this.cargo.getId());	
				cargoAux.setVersionRow(this.cargo.getVersionRow());	
				cargoAux.setid_empresa(this.cargo.getid_empresa());	
				cargoAux.setid_cargo(this.cargo.getid_cargo());	
				cargoAux.setid_cuenta_contable(this.cargo.getid_cuenta_contable());	
				cargoAux.setid_numero_patronal(this.cargo.getid_numero_patronal());	
				cargoAux.setid_tipo_pago__n_m(this.cargo.getid_tipo_pago__n_m());	
				cargoAux.setid_cargo_grupo(this.cargo.getid_cargo_grupo());	
				cargoAux.setcodigo(this.cargo.getcodigo());	
				cargoAux.setnombre(this.cargo.getnombre());	
				cargoAux.setvalor_anticipo(this.cargo.getvalor_anticipo());	
				cargoAux.setporcentaje_anticipo(this.cargo.getporcentaje_anticipo());	
				cargoAux.setes_jefe(this.cargo.getes_jefe());	
				cargoAux.setes_anual(this.cargo.getes_anual());	
				cargoAux.setporcentaje(this.cargo.getporcentaje());	
				cargoAux.setvalor(this.cargo.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cargoAux,cargoLogic.getCargos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoAux,cargos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cargoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.saveCargos();//WithConnection
						//cargoLogic.getSetVersionRowCargos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargo,cargoAux);
					
					this.refrescarForeignKeysDescripcionesCargo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals().addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras().addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals.addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras.addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoLogic.saveCargoRelaciones(cargoAux,this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals(),this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras(),this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargoLogic.getSetVersionRowCargos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargo,cargoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals= new ArrayList<AsistenciaMensual>();
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras= new ArrayList<EmpleadoEstructura>();
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals());

							if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras());

							if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargoAux,cargoLogic.getCargos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargoAux,cargos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargo,cargoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cargoAux=new  Cargo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cargoSessionBean.getEsGuardarRelacionado() 
					|| (this.cargoSessionBean.getEsGuardarRelacionado() && this.cargo.getId()>=0)) {
						
					cargoAux.setIsNew(false);
				}
				
				cargoAux.setIsDeleted(false);
			
				cargoAux.setId(this.cargo.getId());	
				cargoAux.setVersionRow(this.cargo.getVersionRow());	
				cargoAux.setid_empresa(this.cargo.getid_empresa());	
				cargoAux.setid_cargo(this.cargo.getid_cargo());	
				cargoAux.setid_cuenta_contable(this.cargo.getid_cuenta_contable());	
				cargoAux.setid_numero_patronal(this.cargo.getid_numero_patronal());	
				cargoAux.setid_tipo_pago__n_m(this.cargo.getid_tipo_pago__n_m());	
				cargoAux.setid_cargo_grupo(this.cargo.getid_cargo_grupo());	
				cargoAux.setcodigo(this.cargo.getcodigo());	
				cargoAux.setnombre(this.cargo.getnombre());	
				cargoAux.setvalor_anticipo(this.cargo.getvalor_anticipo());	
				cargoAux.setporcentaje_anticipo(this.cargo.getporcentaje_anticipo());	
				cargoAux.setes_jefe(this.cargo.getes_jefe());	
				cargoAux.setes_anual(this.cargo.getes_anual());	
				cargoAux.setporcentaje(this.cargo.getporcentaje());	
				cargoAux.setvalor(this.cargo.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargoAux,cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoAux,cargos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cargoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.saveCargos();//WithConnection
						//cargoLogic.getSetVersionRowCargos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cargo,cargoAux);
					
					this.refrescarForeignKeysDescripcionesCargo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals().addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras().addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals.addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras.addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoLogic.saveCargoRelaciones(cargoAux,this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals(),this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras(),this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargoLogic.getSetVersionRowCargos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cargo,cargoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals= new ArrayList<AsistenciaMensual>();
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras= new ArrayList<EmpleadoEstructura>();
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals());

							if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras());

							if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cargoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cargoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cargoAux,cargoLogic.getCargos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cargoAux,cargos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cargo,cargoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cargoAux=new  Cargo();
				
				cargoAux.setIsNew(false);
				cargoAux.setIsChanged(false);
				
				cargoAux.setIsDeleted(true);
				
				cargoAux.setId(this.cargo.getId());	
				cargoAux.setVersionRow(this.cargo.getVersionRow());	
				cargoAux.setid_empresa(this.cargo.getid_empresa());	
				cargoAux.setid_cargo(this.cargo.getid_cargo());	
				cargoAux.setid_cuenta_contable(this.cargo.getid_cuenta_contable());	
				cargoAux.setid_numero_patronal(this.cargo.getid_numero_patronal());	
				cargoAux.setid_tipo_pago__n_m(this.cargo.getid_tipo_pago__n_m());	
				cargoAux.setid_cargo_grupo(this.cargo.getid_cargo_grupo());	
				cargoAux.setcodigo(this.cargo.getcodigo());	
				cargoAux.setnombre(this.cargo.getnombre());	
				cargoAux.setvalor_anticipo(this.cargo.getvalor_anticipo());	
				cargoAux.setporcentaje_anticipo(this.cargo.getporcentaje_anticipo());	
				cargoAux.setes_jefe(this.cargo.getes_jefe());	
				cargoAux.setes_anual(this.cargo.getes_anual());	
				cargoAux.setporcentaje(this.cargo.getporcentaje());	
				cargoAux.setvalor(this.cargo.getvalor());	
				
				if(this.cargoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cargoAux.getId()>=0) {	
						this.cargosEliminados.add(cargoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cargoAux,cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoAux,cargos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cargoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cargoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.saveCargos();//WithConnection
						//cargoLogic.getSetVersionRowCargos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals().addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras().addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados().addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals.addAll(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualsEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras.addAll(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructurasEliminados);
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados.addAll(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadosEliminados);
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cargoLogic.saveCargoRelaciones(cargoAux,this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals(),this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras(),this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados(),this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//cargoLogic.getSetVersionRowCargos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.setAsistenciaMensuals(new ArrayList<AsistenciaMensual>());
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.setEmpleadoEstructuras(new ArrayList<EmpleadoEstructura>());
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(new ArrayList<Empleado>());
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals= new ArrayList<AsistenciaMensual>();
							this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras= new ArrayList<EmpleadoEstructura>();
							this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados= new ArrayList<Empleado>();
							this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals());

							if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras());

							if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());

							if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							cargoAux.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.cargoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cargoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cargoAux,cargoLogic.getCargos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cargoAux,cargos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getCargos().addAll(this.cargosEliminados);
					
					cargoLogic.saveCargos();//WithConnection
					//cargoLogic.getSetVersionRowCargos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCargo();
				
				this.cargosEliminados= new ArrayList<Cargo>();		
			}
			
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
			//ACTUALIZA ARBOL
			this.getTodosCargoArbol();
			
			//TO_OPTIMIZE POR TIPO FK NO TODOS
			this.inicializarCombosForeignKeyCargoListas();
			
			this.cargarCombosForeignKeyCargo(false);
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cargo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cargo=cargoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessCargo();
      	}
		
	}	
	
	public void actualizarRelaciones(Cargo cargoLocal) throws Exception {
		
		if(this.cargoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				cargoLocal.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals());
				cargoLocal.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras());
				cargoLocal.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
				cargoLocal.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
			
			} else {
			
				cargoLocal.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensuals);
				cargoLocal.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuras);
				cargoLocal.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleados);
				cargoLocal.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Cargo cargoLocal) throws Exception {	
		if(this.cargoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cargoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CargoDetalleFormJInternalFrame.class)) {
				CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrameLocal=(CargoBeanSwingJInternalFrame) ((CargoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargo(cargoBeanSwingJInternalFrameLocal.getcargo(),true);
				cargoBeanSwingJInternalFrameLocal.actualizarLista(cargoBeanSwingJInternalFrameLocal.cargo,this.cargosForeignKey);

				cargoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargoBeanSwingJInternalFrameLocal.cargo);

				cargoLocal.setCargo(cargoBeanSwingJInternalFrameLocal.cargo);

				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey("Formulario");
				this.setActualCargoForeignKey(cargoBeanSwingJInternalFrameLocal.cargo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontableBeanSwingJInternalFrameLocal.actualizarLista(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablesForeignKey);

				cuentacontableBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				cargoLocal.setCuentaContable(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey("Formulario");
				this.setActualCuentaContableForeignKey(cuentacontableBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(NumeroPatronalDetalleFormJInternalFrame.class)) {
				NumeroPatronalBeanSwingJInternalFrame numeropatronalBeanSwingJInternalFrameLocal=(NumeroPatronalBeanSwingJInternalFrame) ((NumeroPatronalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				numeropatronalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.getnumeropatronal(),true);
				numeropatronalBeanSwingJInternalFrameLocal.actualizarLista(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal,this.numeropatronalsForeignKey);

				numeropatronalBeanSwingJInternalFrameLocal.actualizarRelaciones(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				cargoLocal.setNumeroPatronal(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal);

				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey("Formulario");
				this.setActualNumeroPatronalForeignKey(numeropatronalBeanSwingJInternalFrameLocal.numeropatronal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPago_NMDetalleFormJInternalFrame.class)) {
				TipoPago_NMBeanSwingJInternalFrame tipopago_nmBeanSwingJInternalFrameLocal=(TipoPago_NMBeanSwingJInternalFrame) ((TipoPago_NMDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipopago_nmBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPago_NM(tipopago_nmBeanSwingJInternalFrameLocal.gettipopago_nm(),true);
				tipopago_nmBeanSwingJInternalFrameLocal.actualizarLista(tipopago_nmBeanSwingJInternalFrameLocal.tipopago_nm,this.tipopago_nmsForeignKey);

				tipopago_nmBeanSwingJInternalFrameLocal.actualizarRelaciones(tipopago_nmBeanSwingJInternalFrameLocal.tipopago_nm);

				cargoLocal.setTipoPago_NM(tipopago_nmBeanSwingJInternalFrameLocal.tipopago_nm);

				this.addItemDefectoCombosForeignKeyTipoPago_NM();
				this.cargarCombosFrameTipoPago_NMsForeignKey("Formulario");
				this.setActualTipoPago_NMForeignKey(tipopago_nmBeanSwingJInternalFrameLocal.tipopago_nm.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CargoGrupoDetalleFormJInternalFrame.class)) {
				CargoGrupoBeanSwingJInternalFrame cargogrupoBeanSwingJInternalFrameLocal=(CargoGrupoBeanSwingJInternalFrame) ((CargoGrupoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cargogrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCargoGrupo(cargogrupoBeanSwingJInternalFrameLocal.getcargogrupo(),true);
				cargogrupoBeanSwingJInternalFrameLocal.actualizarLista(cargogrupoBeanSwingJInternalFrameLocal.cargogrupo,this.cargogruposForeignKey);

				cargogrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(cargogrupoBeanSwingJInternalFrameLocal.cargogrupo);

				cargoLocal.setCargoGrupo(cargogrupoBeanSwingJInternalFrameLocal.cargogrupo);

				this.addItemDefectoCombosForeignKeyCargoGrupo();
				this.cargarCombosFrameCargoGruposForeignKey("Formulario");
				this.setActualCargoGrupoForeignKey(cargogrupoBeanSwingJInternalFrameLocal.cargogrupo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCargoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCargo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cargoValidator.getInvalidValues(this.cargo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Cargo cargo,List<Cargo> cargos) throws Exception {
		try	{		
			CargoConstantesFunciones.actualizarLista(cargo,cargos,this.cargoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Cargo cargo,List<Cargo> cargos) throws Exception {
		try	{			
			CargoConstantesFunciones.actualizarSelectedLista(cargo,cargos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Cargo> cargosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cargosLocal=this.cargoLogic.getCargos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cargosLocal=this.cargos;
			}
			//ARCHITECTURE
		
			for(Cargo cargoLocal:cargosLocal) {
				if(this.permiteMantenimiento(cargoLocal) && cargoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+CargoConstantesFunciones.getCargoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_empresaCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDCARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_cargoCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDCUENTACONTABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_cuenta_contableCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDNUMEROPATRONAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_numero_patronalCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDTIPOPAGO_NM)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_tipo_pago__n_mCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.IDCARGOGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelid_cargo_grupoCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelcodigoCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelnombreCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.VALORANTICIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelvalor_anticipoCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.PORCENTAJEANTICIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelporcentaje_anticipoCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.ESJEFE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabeles_jefeCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.ESANUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabeles_anualCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelporcentajeCargo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CargoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelvalorCargo,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_empresaCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_cargoCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_cuenta_contableCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_numero_patronalCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_tipo_pago__n_mCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelid_cargo_grupoCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelcodigoCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelnombreCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelvalor_anticipoCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelporcentaje_anticipoCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabeles_jefeCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabeles_anualCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelporcentajeCargo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCargo.jLabelvalorCargo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AsistenciaMensual")) {
			if(this.cargo==null) {
				this.cargo= new Cargo();
			}

			if(this.cargoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCargo
				this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.getasistenciamensual().setCargo(this.cargo);
			}

			return;
		}
		 else  if(sTipo.equals("EmpleadoEstructura")) {
			if(this.cargo==null) {
				this.cargo= new Cargo();
			}

			if(this.cargoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCargo
				this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.getempleadoestructura().setCargo(this.cargo);
			}

			return;
		}
		 else  if(sTipo.equals("Empleado")) {
			if(this.cargo==null) {
				this.cargo= new Cargo();
			}

			if(this.cargoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCargo
				this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.getempleado().setCargo(this.cargo);
			}

			return;
		}
		 else  if(sTipo.equals("Cargo")) {
			if(this.cargo==null) {
				this.cargo= new Cargo();
			}

			if(this.cargoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCargo
				this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.getcargo().setCargo(this.cargo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCargo--;	
		
		
		this.cargoAux=new Cargo();
		
		this.cargoAux.setId(this.iIdNuevoCargo);
		this.cargoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cargoLogic.getCargos().add(this.cargoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cargos.add(this.cargoAux);
		}
		//ARCHITECTURE
		
		this.cargo=this.cargoAux;
		
		if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCargo(this.cargo);
			this.setVariablesObjetoActualToFormularioForeignKeyCargo(this.cargo);
		}
				
		//this.setDefaultControlesCargo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCargo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCargo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargo(this.cargoBean,this.cargo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CargoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cargoSessionBean.getConGuardarRelaciones()) {
			classes=CargoConstantesFunciones.getClassesRelationshipsOfCargo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cargoReturnGeneral=cargoLogic.procesarEventosCargosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargoLogic.getCargos(),this.cargo,this.cargoParameterGeneral,this.isEsNuevoCargo,classes);//this.cargoLogic.getCargo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCargo(this.cargoReturnGeneral,this.cargoBean,false);
		
		if(this.cargoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCargo(this.cargoReturnGeneral.getCargo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCargo(this.cargoReturnGeneral.getCargo());
		}
		
		if(this.cargoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCargo(this.cargoReturnGeneral.getCargo(),classes);//this.cargoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCargo(this.cargo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCargo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCargo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoBeanSwingJInternalFrameAdditional.RecargarFormCargo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCargo(false);
						
			if(cargoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.getEsGuardarRelacionado() && AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAsistenciaMensualActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.getEsGuardarRelacionado() && EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoEstructuraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargo();
			}
			
			this.actualizarVisualTableDatosCargo();
			
			this.jTableDatosCargo.setRowSelectionInterval(this.getIndiceNuevoCargo(), this.getIndiceNuevoCargo());
			
			this.seleccionarFilaTablaCargoActual();
						
			this.actualizarEstadoCeldasBotonesCargo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCargo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarcodigoCargo);
		this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarnombreCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarvalor_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarporcentaje_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activares_jefeCargo);
		this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activares_anualCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarporcentajeCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarvalorCargo);	
		//
		this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_empresaCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_cargoCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_cuenta_contableCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_numero_patronalCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_tipo_pago__n_mCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setEnabled(isHabilitar && this.cargoConstantesFunciones.activarid_cargo_grupoCargo);
	};
	
	public void setDefaultControlesCargo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCargo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cargoSessionBean.setConGuardarRelaciones(true);			
			this.cargoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.cargoSessionBean.setConGuardarRelaciones(false);			
			this.cargoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCargo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cargo cargoAux:this.cargoLogic.getCargos()) {
				if(cargoAux.getId().equals(this.iIdNuevoCargo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cargo cargoAux:this.cargos) {
				if(cargoAux.getId().equals(this.iIdNuevoCargo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualCargo(Cargo cargo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cargo cargoAux:this.cargoLogic.getCargos()) {
				if(cargoAux.getId().equals(cargo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cargo cargoAux:this.cargos) {
				if(cargoAux.getId().equals(cargo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalCargo(Cargo cargoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cargo cargoAux:this.cargoLogic.getCargos()) {
				if(cargoAux.getCargoOriginal().getId().equals(cargoOriginal.getId())) {
					existe=true;
					cargoOriginal.setId(cargoAux.getId());
					cargoOriginal.setVersionRow(cargoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cargo cargoAux:this.cargos) {
				if(cargoAux.getCargoOriginal().getId().equals(cargoOriginal.getId())) {
					existe=true;
					cargoOriginal.setId(cargoAux.getId());
					cargoOriginal.setVersionRow(cargoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCargo(Boolean esParaCancelar) throws Exception {
		cargosAux=new ArrayList<Cargo>();
		cargoAux=new Cargo();
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cargo cargoAux:this.cargoLogic.getCargos()) {
					if(cargoAux.getId()<0) {
						cargosAux.add(cargoAux);
					}		
				}
				this.iIdNuevoCargo=0L;
				this.cargoLogic.getCargos().removeAll(cargosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cargo cargoAux:this.cargos) {
					if(cargoAux.getId()<0) {
						cargosAux.add(cargoAux);
					}		
				}
				this.iIdNuevoCargo=0L;
				this.cargos.removeAll(cargosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCargo 
					&& this.cargoLogic.getCargos().size()>0
					) {
					cargoAux=this.cargoLogic.getCargos().get(this.cargoLogic.getCargos().size() - 1);
				
					if(cargoAux.getId()<0) {
						this.cargoLogic.getCargos().remove(cargoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCargo && this.cargos.size()>0) {
					cargoAux=this.cargos.get(this.cargos.size() - 1);
				
					if(cargoAux.getId()<0) {
						this.cargos.remove(cargoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCargo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cargo.getId()<0) {
				this.cargoLogic.getCargos().remove(this.cargo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cargo.getId()<0) {
				this.cargos.remove(this.cargo);
			}
		}			
	}
	
	public void setEstadosInicialesCargo(List<Cargo> cargosAux) throws Exception {
		CargoConstantesFunciones.setEstadosInicialesCargo(cargosAux);
	}
	
	public void setEstadosInicialesCargo(Cargo cargoAux) throws Exception {
		CargoConstantesFunciones.setEstadosInicialesCargo(cargoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCargoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCargoActual()) {
				if(!this.isEsNuevoCargo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCargo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCargoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cargo ?", "MANTENIMIENTO DE Cargo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Cargo cargo) throws Exception {
		CargoConstantesFunciones.seleccionarAsignar(this.cargo,cargo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCargo=this.isPermisoActualizarOriginalCargo;
			
			
			this.seleccionarAsignar(cargo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CargoConstantesFunciones.quitarEspaciosCargo(this.cargo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCargo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cargoSessionBean.setsFuncionBusquedaRapida(this.cargoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCargo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCargo(esParaCancelar);				
				this.cancelarNuevoCargo(esParaCancelar);								
			}
			
			this.cargo=new Cargo();
			
			this.inicializarCargo();
			
			this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCargo() throws Exception {
		try {
			CargoConstantesFunciones.inicializarCargo(this.cargo);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cargoLogic.getCargos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCargos(String sAccionBusqueda,List<Cargo> cargosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Cargo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CargoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CargoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Cargo"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Cargos");		
		parameters.put("busquedapor", CargoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(AsistenciaMensual.class));
			classes.add(new Classe(EmpleadoEstructura.class));
			classes.add(new Classe(Empleado.class));
			classes.add(new Classe(Cargo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CargoLogic cargoLogicAuxiliar=new CargoLogic();
					cargoLogicAuxiliar.setDatosCliente(cargoLogic.getDatosCliente());				
					cargoLogicAuxiliar.setCargos(cargosParaReportes);
					
					cargoLogicAuxiliar.cargarRelacionesLoteForeignKeyCargoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					cargosParaReportes=cargoLogicAuxiliar.getCargos();
					
					//cargoLogic.getNewConnexionToDeep();
					
					//for (Cargo cargo:cargosParaReportes) {
					//	cargoLogic.deepLoad(cargo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//cargoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//cargoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAsistenciaMensual = AuxiliarReportes.class.getResourceAsStream("AsistenciaMensualDetalleRelacionesDesign.jasper");
			parameters.put("subreport_asistenciamensual", reportFileAsistenciaMensual);

			InputStream reportFileEmpleadoEstructura = AuxiliarReportes.class.getResourceAsStream("EmpleadoEstructuraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleadoestructura", reportFileEmpleadoEstructura);

			InputStream reportFileEmpleado = AuxiliarReportes.class.getResourceAsStream("EmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_empleado", reportFileEmpleado);

			InputStream reportFileCargo = AuxiliarReportes.class.getResourceAsStream("CargoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargo", reportFileCargo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCargo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CargoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CargoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCargo=new JRBeanArrayDataSource(CargoJInternalFrame.TraerCargoBeans(cargosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCargo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CargoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CargoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CargoBean.TraerCargoBeans(cargosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCargoActionPerformed(null);
					//this.generarExcelReporteCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCargos(sAccionBusqueda,sTipoArchivoReporte,cargosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCargos(String sAccionBusqueda,String sTipoArchivoReporte,List<Cargo> cargosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cargos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Cargo cargo : cargosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CargoConstantesFunciones.generarExcelReporteDataCargo("NORMAL",row,workbook,cargo,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCargo(String sTipo,Row row,Workbook workbook) {
		
		CargoConstantesFunciones.generarExcelReporteHeaderCargo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCargos(String sAccionBusqueda,String sTipoArchivoReporte,List<Cargo> cargosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cargos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Cargo cargo : cargosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CargoConstantesFunciones.getCargoDescripcion(cargo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDCARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getcargo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getcuentacontable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getnumeropatronal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.gettipopago_nm_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_IDCARGOGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGOGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getcargogrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_VALORANTICIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_VALORANTICIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getvalor_anticipo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getporcentaje_anticipo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_ESJEFE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_ESJEFE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cargo.getes_jefe()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_ESANUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_ESANUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cargo.getes_anual()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CargoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CargoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cargo.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCargos(String sAccionBusqueda,String sTipoArchivoReporte,List<Cargo> cargosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Cargo> cargosRespaldo=null;
		
		classes=CargoConstantesFunciones.getClassesRelationshipsOfCargo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cargoLogic.setDatosCliente(this.datosCliente);
		this.cargoLogic.setDatosDeep(this.datosDeep);
		this.cargoLogic.setIsConDeep(true);
		
		cargosRespaldo=this.cargoLogic.getCargos();
		
		this.cargoLogic.setCargos(cargosParaReportes);	
		this.cargoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cargosParaReportes=this.cargoLogic.getCargos();
		this.cargoLogic.setCargos(cargosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Cargos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCargo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Cargo cargo : cargosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCargo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CargoConstantesFunciones.generarExcelReporteDataCargo("NORMAL",row,workbook,cargo,cellStyleDataAux);
		
			
			


				//AsistenciaMensual
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO))) {

				if(cargo.getAsistenciaMensuals()!=null && cargo.getAsistenciaMensuals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AsistenciaMensualConstantesFunciones.generarExcelReporteHeaderAsistenciaMensual("RELACIONADO",row,workbook);
				}

				if(cargo.getAsistenciaMensuals()!=null) {
					i2=0;
					for(AsistenciaMensual asistenciamensual : cargo.getAsistenciaMensuals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AsistenciaMensualConstantesFunciones.generarExcelReporteDataAsistenciaMensual("RELACIONADO",row,workbook,asistenciamensual,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//EmpleadoEstructura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO))) {

				if(cargo.getEmpleadoEstructuras()!=null && cargo.getEmpleadoEstructuras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoEstructuraConstantesFunciones.generarExcelReporteHeaderEmpleadoEstructura("RELACIONADO",row,workbook);
				}

				if(cargo.getEmpleadoEstructuras()!=null) {
					i2=0;
					for(EmpleadoEstructura empleadoestructura : cargo.getEmpleadoEstructuras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoEstructuraConstantesFunciones.generarExcelReporteDataEmpleadoEstructura("RELACIONADO",row,workbook,empleadoestructura,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Empleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(cargo.getEmpleados()!=null && cargo.getEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EmpleadoConstantesFunciones.generarExcelReporteHeaderEmpleado("RELACIONADO",row,workbook);
				}

				if(cargo.getEmpleados()!=null) {
					i2=0;
					for(Empleado empleado : cargo.getEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EmpleadoConstantesFunciones.generarExcelReporteDataEmpleado("RELACIONADO",row,workbook,empleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cargo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargoConstantesFunciones.SCLASSWEBTITULO))) {

				if(cargo.getCargos()!=null && cargo.getCargos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargoConstantesFunciones.generarExcelReporteHeaderCargo("RELACIONADO",row,workbook);
				}

				if(cargo.getCargos()!=null) {
					i2=0;
					for(Cargo cargoAutoRef : cargo.getCargos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargoConstantesFunciones.generarExcelReporteDataCargo("RELACIONADO",row,workbook,cargoAutoRef,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CargoConstantesFunciones.getCargoDescripcion(cargo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCargo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCargo() throws Exception {		
		this.startProcessCargo(true);
	}
	
	public void startProcessCargo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCargo ,this.jPanelParametrosReportesCargo, this.jScrollPanelDatosCargo,this.jPanelPaginacionCargo, this.jScrollPanelDatosEdicionCargo, this.jPanelAccionesCargo,this.jPanelAccionesFormularioCargo,this.jmenuBarCargo,this.jmenuBarDetalleCargo,this.jTtoolBarCargo,this.jTtoolBarDetalleCargo);		
		
		final JTabbedPane jTabbedPaneBusquedasCargo=this.jTabbedPaneBusquedasCargo; 
		
		final JPanel jPanelParametrosReportesCargo=this.jPanelParametrosReportesCargo;
		//final JScrollPane jScrollPanelDatosCargo=this.jScrollPanelDatosCargo;
		final JTable jTableDatosCargo=this.jTableDatosCargo;		
		final JPanel jPanelPaginacionCargo=this.jPanelPaginacionCargo;
		//final JScrollPane jScrollPanelDatosEdicionCargo=this.jScrollPanelDatosEdicionCargo;
		final JPanel jPanelAccionesCargo=this.jPanelAccionesCargo;
		
		JPanel jPanelCamposAuxiliarCargo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCargo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
			jPanelCamposAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jPanelCamposCargo;
			jPanelAccionesFormularioAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jPanelAccionesFormularioCargo;
		}
		
		final JPanel jPanelCamposCargo=jPanelCamposAuxiliarCargo;
		final JPanel jPanelAccionesFormularioCargo=jPanelAccionesFormularioAuxiliarCargo;
		
		
		final JMenuBar jmenuBarCargo=this.jmenuBarCargo;
		final JToolBar jTtoolBarCargo=this.jTtoolBarCargo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCargo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
			jmenuBarDetalleAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jmenuBarDetalleCargo;
			jTtoolBarDetalleAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jTtoolBarDetalleCargo;
		}
		
		final JMenuBar jmenuBarDetalleCargo=jmenuBarDetalleAuxiliarCargo;
		final JToolBar jTtoolBarDetalleCargo=jTtoolBarDetalleAuxiliarCargo;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargo;
			processRunnable.jTableDatos=jTableDatosCargo;
			processRunnable.jPanelCampos=jPanelCamposCargo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargo;
			processRunnable.jPanelAcciones=jPanelAccionesCargo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargo;
			
			
			processRunnable.jmenuBar=jmenuBarCargo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargo;
			processRunnable.jTtoolBar=jTtoolBarCargo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargo ,jPanelParametrosReportesCargo,jTableDatosCargo, /*jScrollPanelDatosCargo,*/jPanelCamposCargo,jPanelPaginacionCargo, /*jScrollPanelDatosEdicionCargo,*/ jPanelAccionesCargo,jPanelAccionesFormularioCargo,jmenuBarCargo,jmenuBarDetalleCargo,jTtoolBarCargo,jTtoolBarDetalleCargo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCargo ,jPanelParametrosReportesCargo, jScrollPanelDatosCargo,jPanelPaginacionCargo, jScrollPanelDatosEdicionCargo, jPanelAccionesCargo,jPanelAccionesFormularioCargo,jmenuBarCargo,jmenuBarDetalleCargo,jTtoolBarCargo,jTtoolBarDetalleCargo);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessCargo() {// throws Exception 
		this.finishProcessCargo(true);
	}
	
	public void finishProcessCargo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCargo ,this.jPanelParametrosReportesCargo, this.jScrollPanelDatosCargo,this.jPanelPaginacionCargo, this.jScrollPanelDatosEdicionCargo, this.jPanelAccionesCargo,this.jPanelAccionesFormularioCargo,this.jmenuBarCargo,this.jmenuBarDetalleCargo,this.jTtoolBarCargo,this.jTtoolBarDetalleCargo);		
		
		final JTabbedPane jTabbedPaneBusquedasCargo=this.jTabbedPaneBusquedasCargo; 
		
		final JPanel jPanelParametrosReportesCargo=this.jPanelParametrosReportesCargo;
		//final JScrollPane jScrollPanelDatosCargo=this.jScrollPanelDatosCargo;
		final JTable jTableDatosCargo=this.jTableDatosCargo;		
		final JPanel jPanelPaginacionCargo=this.jPanelPaginacionCargo;
		//final JScrollPane jScrollPanelDatosEdicionCargo=this.jScrollPanelDatosEdicionCargo;
		final JPanel jPanelAccionesCargo=this.jPanelAccionesCargo;
		
		JPanel jPanelCamposAuxiliarCargo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCargo=new JPanel();
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
			jPanelCamposAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jPanelCamposCargo;
			jPanelAccionesFormularioAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jPanelAccionesFormularioCargo;
		}
		
		final JPanel jPanelCamposCargo=jPanelCamposAuxiliarCargo;
		final JPanel jPanelAccionesFormularioCargo=jPanelAccionesFormularioAuxiliarCargo;
		
		
		final JMenuBar jmenuBarCargo=this.jmenuBarCargo;		
		final JToolBar jTtoolBarCargo=this.jTtoolBarCargo;
				
		JMenuBar jmenuBarDetalleAuxiliarCargo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCargo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
			jmenuBarDetalleAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jmenuBarDetalleCargo;
			jTtoolBarDetalleAuxiliarCargo=this.jInternalFrameDetalleFormCargo.jTtoolBarDetalleCargo;		
		}
		
		final JMenuBar jmenuBarDetalleCargo=jmenuBarDetalleAuxiliarCargo;
		final JToolBar jTtoolBarDetalleCargo=jTtoolBarDetalleAuxiliarCargo;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCargo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCargo;
			processRunnable.jTableDatos=jTableDatosCargo;
			processRunnable.jPanelCampos=jPanelCamposCargo;
			processRunnable.jPanelPaginacion=jPanelPaginacionCargo;
			processRunnable.jPanelAcciones=jPanelAccionesCargo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCargo;
			
			
			processRunnable.jmenuBar=jmenuBarCargo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCargo;
			processRunnable.jTtoolBar=jTtoolBarCargo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCargo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCargo ,jPanelParametrosReportesCargo, jTableDatosCargo,/*jScrollPanelDatosCargo,*/jPanelCamposCargo,jPanelPaginacionCargo, /*jScrollPanelDatosEdicionCargo,*/ jPanelAccionesCargo,jPanelAccionesFormularioCargo,jmenuBarCargo,jmenuBarDetalleCargo,jTtoolBarCargo,jTtoolBarDetalleCargo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCargo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCargo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCargo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCargo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCargo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCargo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCargo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCargo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCargo,esHabilitar,1,1);
		}
	}
	*/
	
	
	public void getTodosCargoArbol() throws Exception {	
		ArrayList<String> arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral);
		
		String  finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);
		
		this.pagination=new Pagination();
		
		this.pagination.setiFirstResult(-1);
		this.pagination.setiMaxResults(-1);
		
		this.cargarDatosCliente();
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			cargoLogic.getTodosCargos(finalQueryGlobal+"",this.pagination);//WithConnection
			this.cargosArbol=cargoLogic.getCargos();
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
	}
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cargoConstantesFunciones.getsFinalQueryCargo();
		String  finalQueryPaginacionTodos=this.cargoConstantesFunciones.getsFinalQueryCargo();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=CargoConstantesFunciones.getArrayColumnasGlobalesNoCargo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cargosEliminados= new ArrayList<Cargo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCargo();
		
				///*CargoSessionBean*/this.cargoSessionBean=new CargoSessionBean();
			
			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=CargoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CargoConstantesFunciones.getClassesForeignKeysOfCargo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cargo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cargosAux= new ArrayList<Cargo>();
			
				
			cargoLogic.setDatosCliente(this.datosCliente);
			cargoLogic.setDatosDeep(this.datosDeep);
			cargoLogic.setIsConDeep(true);
			
			
			cargoLogic.getCargoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cargoLogic.getTodosCargos(finalQueryGlobal,pagination);
					
					//cargoLogic.getTodosCargosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cargoLogic.getCargos()==null|| cargoLogic.getCargos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargosAux= new ArrayList<Cargo>();
							cargosAux.addAll(cargoLogic.getCargos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux= new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargoLogic.getTodosCargos(finalQueryGlobal+"",this.pagination);												
							
							//cargoLogic.getTodosCargosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCargos("Todos",cargoLogic.getCargos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cargoLogic.setCargos(new ArrayList<Cargo>());					
							cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCargo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCargo=this.idActual;
				
				} else if(this.idCargoActual!=null && this.idCargoActual!=0L) {
					idCargo=idCargoActual;
				}
				
					
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndicePorId(idCargo);
				
				this.cargos=new ArrayList<Cargo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cargoLogic.getEntity(idCargo);
					
					//cargoLogic.getEntityWithConnection(idCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.setCargos(new ArrayList<Cargo>());
					cargoLogic.getCargos().add(cargoLogic.getCargo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargos=new ArrayList<Cargo>();
					this.cargos.add(cargo);
				}
				
				if(cargoLogic.getCargo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCargo")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdCargo(finalQueryGlobal,pagination,id_cargoFK_IdCargo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargo(id_cargoFK_IdCargo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdCargo",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdCargo",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCargoGrupo")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargoGrupo(id_cargo_grupoFK_IdCargoGrupo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdCargoGrupo(finalQueryGlobal,pagination,id_cargo_grupoFK_IdCargoGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargoGrupo(id_cargo_grupoFK_IdCargoGrupo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargoGrupo(id_cargo_grupoFK_IdCargoGrupo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdCargoGrupo(finalQueryGlobal,pagination,id_cargo_grupoFK_IdCargoGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargoGrupo(id_cargo_grupoFK_IdCargoGrupo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCargoGrupo(id_cargo_grupoFK_IdCargoGrupo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdCargoGrupo",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdCargoGrupo",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContable")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdCuentaContable(finalQueryGlobal,pagination,id_cuenta_contableFK_IdCuentaContable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdCuentaContable(id_cuenta_contableFK_IdCuentaContable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdCuentaContable",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdCuentaContable",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdEmpresa",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdEmpresa",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdNumeroPatronal")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdNumeroPatronal(id_numero_patronalFK_IdNumeroPatronal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdNumeroPatronal(finalQueryGlobal,pagination,id_numero_patronalFK_IdNumeroPatronal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdNumeroPatronal(id_numero_patronalFK_IdNumeroPatronal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdNumeroPatronal(id_numero_patronalFK_IdNumeroPatronal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdNumeroPatronal(finalQueryGlobal,pagination,id_numero_patronalFK_IdNumeroPatronal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdNumeroPatronal(id_numero_patronalFK_IdNumeroPatronal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdNumeroPatronal(id_numero_patronalFK_IdNumeroPatronal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdNumeroPatronal",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdNumeroPatronal",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPago_NM")) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdTipoPago_NM(id_tipo_pago__n_mFK_IdTipoPago_NM);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cargoLogic.getCargosFK_IdTipoPago_NM(finalQueryGlobal,pagination,id_tipo_pago__n_mFK_IdTipoPago_NM);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdTipoPago_NM(id_tipo_pago__n_mFK_IdTipoPago_NM);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdTipoPago_NM(id_tipo_pago__n_mFK_IdTipoPago_NM);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cargoLogic.getCargos()==null||cargoLogic.getCargos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cargos==null|| cargos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cargosAux=new ArrayList<Cargo>();
						cargosAux.addAll(cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargosAux=new ArrayList<Cargo>();
							cargosAux.addAll(cargos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cargoLogic.getCargosFK_IdTipoPago_NM(finalQueryGlobal,pagination,id_tipo_pago__n_mFK_IdTipoPago_NM);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdTipoPago_NM(id_tipo_pago__n_mFK_IdTipoPago_NM);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CargoConstantesFunciones.getDetalleIndiceFK_IdTipoPago_NM(id_tipo_pago__n_mFK_IdTipoPago_NM);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCargos("FK_IdTipoPago_NM",cargoLogic.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCargos("FK_IdTipoPago_NM",cargos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoLogic.setCargos(new ArrayList<Cargo>());
						cargoLogic.getCargos().addAll(cargosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargos=new ArrayList<Cargo>();
							cargos.addAll(cargosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCargo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCargo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargoLogic.getCargos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cargoLogic.getCargos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cargos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Cargo cargo) {
		Boolean permite=true;
		
		if(this.cargo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CargoConstantesFunciones.getOrderByListaCargo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CargoConstantesFunciones.getOrderByListaCargo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cargo cargo:cargoLogic.getCargos()) {
				if(cargo.getsType().equals(Constantes2.S_TOTALES)) {
					cargoTotales=cargo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cargo cargo:this.cargos) {
				if(cargo.getsType().equals(Constantes2.S_TOTALES)) {
					cargoTotales=cargo;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.cargoAux=new Cargo();
			this.cargoAux.setsType(Constantes2.S_TOTALES);
			this.cargoAux.setIsNew(false);
			this.cargoAux.setIsChanged(false);
			this.cargoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CargoConstantesFunciones.TotalizarValoresFilaCargo(this.cargoLogic.getCargos(),this.cargoAux);
				
				this.cargoLogic.getCargos().add(this.cargoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CargoConstantesFunciones.TotalizarValoresFilaCargo(this.cargos,this.cargoAux);
				
				this.cargos.add(this.cargoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cargoTotales=new Cargo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargoLogic.getCargos().remove(cargoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cargos.remove(cargoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cargoTotales=new Cargo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Cargo cargo:cargoLogic.getCargos()) {
				if(cargo.getsType().equals(Constantes2.S_TOTALES)) {
					cargoTotales=cargo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoConstantesFunciones.TotalizarValoresFilaCargo(this.cargoLogic.getCargos(),cargoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Cargo cargo:this.cargos) {
				if(cargo.getsType().equals(Constantes2.S_TOTALES)) {
					cargoTotales=cargo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CargoConstantesFunciones.TotalizarValoresFilaCargo(this.cargos,cargoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCargosFK_IdCargo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargosFK_IdCargoGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdCargoGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargosFK_IdCuentaContable()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargosFK_IdNumeroPatronal()throws Exception {
		try {
			sAccionBusqueda="FK_IdNumeroPatronal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCargosFK_IdTipoPago_NM()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPago_NM";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCargosFK_IdCargo(String sFinalQuery,Long id_cargo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdCargo(sFinalQuery,this.pagination,id_cargo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargosFK_IdCargoGrupo(String sFinalQuery,Long id_cargo_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdCargoGrupo(sFinalQuery,this.pagination,id_cargo_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargosFK_IdCuentaContable(String sFinalQuery,Long id_cuenta_contable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdCuentaContable(sFinalQuery,this.pagination,id_cuenta_contable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargosFK_IdNumeroPatronal(String sFinalQuery,Long id_numero_patronal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdNumeroPatronal(sFinalQuery,this.pagination,id_numero_patronal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCargosFK_IdTipoPago_NM(String sFinalQuery,Long id_tipo_pago__n_m)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLogic.getCargosFK_IdTipoPago_NM(sFinalQuery,this.pagination,id_tipo_pago__n_m);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosCargo() {
		this.isPermisoTodoCargo=false;
		this.isPermisoNuevoCargo=false;
		this.isPermisoActualizarCargo=false;
		this.isPermisoActualizarOriginalCargo=false;
		this.isPermisoEliminarCargo=false;
		this.isPermisoGuardarCambiosCargo=false;
		this.isPermisoConsultaCargo=false;
		this.isPermisoBusquedaCargo=false;
		this.isPermisoReporteCargo=false;		
		this.isPermisoOrdenCargo=false;		
		this.isPermisoPaginacionMedioCargo=false;		
		this.isPermisoPaginacionAltoCargo=false;
		this.isPermisoPaginacionTodoCargo=false;
		this.isPermisoCopiarCargo=false;		
		this.isPermisoVerFormCargo=false;		
		this.isPermisoDuplicarCargo=false;		
		this.isPermisoOrdenCargo=false;		
	}
	
	public void setPermisosUsuarioCargo(Boolean isPermiso) {
		this.isPermisoTodoCargo=isPermiso;
		this.isPermisoNuevoCargo=isPermiso;
		this.isPermisoActualizarCargo=isPermiso;
		this.isPermisoActualizarOriginalCargo=isPermiso;
		this.isPermisoEliminarCargo=isPermiso;
		this.isPermisoGuardarCambiosCargo=isPermiso;
		this.isPermisoConsultaCargo=isPermiso;
		this.isPermisoBusquedaCargo=isPermiso;
		this.isPermisoReporteCargo=isPermiso;
		this.isPermisoOrdenCargo=isPermiso;		
		this.isPermisoPaginacionMedioCargo=isPermiso;		
		this.isPermisoPaginacionAltoCargo=isPermiso;		
		this.isPermisoPaginacionTodoCargo=isPermiso;		
		this.isPermisoCopiarCargo=isPermiso;		
		this.isPermisoVerFormCargo=isPermiso;		
		this.isPermisoDuplicarCargo=isPermiso;
		this.isPermisoOrdenCargo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCargo(Boolean isPermiso) {
		//this.isPermisoTodoCargo=isPermiso;
		this.isPermisoNuevoCargo=isPermiso;
		this.isPermisoActualizarCargo=isPermiso;
		this.isPermisoActualizarOriginalCargo=isPermiso;
		this.isPermisoEliminarCargo=isPermiso;
		this.isPermisoGuardarCambiosCargo=isPermiso;
		//this.isPermisoConsultaCargo=isPermiso;
		//this.isPermisoBusquedaCargo=isPermiso;
		//this.isPermisoReporteCargo=isPermiso;
		//this.isPermisoOrdenCargo=isPermiso;		
		//this.isPermisoPaginacionMedioCargo=isPermiso;		
		//this.isPermisoPaginacionAltoCargo=isPermiso;		
		//this.isPermisoPaginacionTodoCargo=isPermiso;		
		//this.isPermisoCopiarCargo=isPermiso;		
		//this.isPermisoDuplicarCargo=isPermiso;
		//this.isPermisoOrdenCargo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCargoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AsistenciaMensualConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
		if(CargoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAsistenciaMensual=false;
		this.isTienePermisosAsistenciaMensual=this.verificarGetPermisosUsuarioOpcionCargoClaseRelacionada(this.opcionsRelacionadas,AsistenciaMensualConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleadoEstructura=false;
		this.isTienePermisosEmpleadoEstructura=this.verificarGetPermisosUsuarioOpcionCargoClaseRelacionada(this.opcionsRelacionadas,EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEmpleado=false;
		this.isTienePermisosEmpleado=this.verificarGetPermisosUsuarioOpcionCargoClaseRelacionada(this.opcionsRelacionadas,EmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargo=false;
		this.isTienePermisosCargo=this.verificarGetPermisosUsuarioOpcionCargoClaseRelacionada(this.opcionsRelacionadas,CargoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCargo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCargoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAsistenciaMensual=conPermiso;
		this.isTienePermisosEmpleadoEstructura=conPermiso;
		this.isTienePermisosEmpleado=conPermiso;
		this.isTienePermisosCargo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCargoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCargoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCargoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAsistenciaMensual && this.jInternalFrameDetalleFormCargo!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.remove(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleadoEstructura && this.jInternalFrameDetalleFormCargo!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.remove(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEmpleado && this.jInternalFrameDetalleFormCargo!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.remove(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargo && this.jInternalFrameDetalleFormCargo!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.remove(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCargo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CargoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CargoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCargo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCargo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCargo=this.isPermisoActualizarCargo;
			this.isPermisoEliminarCargo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCargo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCargo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCargo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCargo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCargo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCargo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCargo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCargo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCargo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCargo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCargo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCargo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCargo.setToolTipText(this.jTableDatosCargo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCargo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCargo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CargoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(CargoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioCargo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAsistenciaMensual && this.cargoConstantesFunciones.mostrarAsistenciaMensualCargo && !CargoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Asistencia Mensual");
			reporte.setsDescripcion("Asistencia Mensual");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleadoEstructura && this.cargoConstantesFunciones.mostrarEmpleadoEstructuraCargo && !CargoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado Estructura");
			reporte.setsDescripcion("Empleado Estructura");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEmpleado && this.cargoConstantesFunciones.mostrarEmpleadoCargo && !CargoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Empleado");
			reporte.setsDescripcion("Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargo && this.cargoConstantesFunciones.mostrarCargoCargo && !CargoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cargo");
			reporte.setsDescripcion("Cargo");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyCargoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.cargosForeignKey=new ArrayList();
				this.cuentacontablesForeignKey=new ArrayList();
				this.numeropatronalsForeignKey=new ArrayList();
				this.tipopago_nmsForeignKey=new ArrayList();
				this.cargogruposForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCargoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CargoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCargoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyNumeroPatronalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPago_NMListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCargoGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCargoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CargoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNumeroPatronalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.numeropatronalsForeignKey==null||this.numeropatronalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=NumeroPatronalConstantesFunciones.getArrayColumnasGlobalesNumeroPatronal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NumeroPatronalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=NumeroPatronalConstantesFunciones.SFINALQUERY;

				this.cargarCombosNumeroPatronalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPago_NMListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipopago_nmsForeignKey==null||this.tipopago_nmsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPago_NMConstantesFunciones.getArrayColumnasGlobalesTipoPago_NM(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPago_NMConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPago_NMConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPago_NMsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCargoGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cargogruposForeignKey==null||this.cargogruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CargoGrupoConstantesFunciones.getArrayColumnasGlobalesCargoGrupo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoGrupoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CargoGrupoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCargoGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCargoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CargoParameterReturnGeneral cargoReturnGeneral=new CargoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_empresaCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_empresaCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalCargo="";

				if(((this.cargosForeignKey==null||this.cargosForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_cargoCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_cargoCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CargoConstantesFunciones.getArrayColumnasGlobalesCargo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCargo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoConstantesFunciones.TABLENAME);

						finalQueryGlobalCargo=Funciones.GetFinalQueryAppend(finalQueryGlobalCargo, "");
						finalQueryGlobalCargo+=CargoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCargosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCargo=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidCargoActual();
					}
				} else {
					finalQueryGlobalCargo="NONE";
				}


				String finalQueryGlobalCuentaContable="";

				if(((this.cuentacontablesForeignKey==null||this.cuentacontablesForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_cuenta_contableCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_cuenta_contableCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContable=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContable, "");
						finalQueryGlobalCuentaContable+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContable=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidCuentaContableActual();
					}
				} else {
					finalQueryGlobalCuentaContable="NONE";
				}


				String finalQueryGlobalNumeroPatronal="";

				if(((this.numeropatronalsForeignKey==null||this.numeropatronalsForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_numero_patronalCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_numero_patronalCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=NumeroPatronalConstantesFunciones.getArrayColumnasGlobalesNumeroPatronal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalNumeroPatronal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,NumeroPatronalConstantesFunciones.TABLENAME);

						finalQueryGlobalNumeroPatronal=Funciones.GetFinalQueryAppend(finalQueryGlobalNumeroPatronal, "");
						finalQueryGlobalNumeroPatronal+=NumeroPatronalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosNumeroPatronalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalNumeroPatronal=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidNumeroPatronalActual();
					}
				} else {
					finalQueryGlobalNumeroPatronal="NONE";
				}


				String finalQueryGlobalTipoPago_NM="";

				if(((this.tipopago_nmsForeignKey==null||this.tipopago_nmsForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_tipo_pago__n_mCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_tipo_pago__n_mCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPago_NM()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPago_NMConstantesFunciones.getArrayColumnasGlobalesTipoPago_NM(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPago_NM=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPago_NMConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPago_NM=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPago_NM, "");
						finalQueryGlobalTipoPago_NM+=TipoPago_NMConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPago_NMsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPago_NM=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidTipoPago_NMActual();
					}
				} else {
					finalQueryGlobalTipoPago_NM="NONE";
				}


				String finalQueryGlobalCargoGrupo="";

				if(((this.cargogruposForeignKey==null||this.cargogruposForeignKey.size()<=0) && this.cargoConstantesFunciones.cargarid_cargo_grupoCargo)
					 || (this.esRecargarFks && this.cargoConstantesFunciones.cargarid_cargo_grupoCargo)) {

					if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargoGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CargoGrupoConstantesFunciones.getArrayColumnasGlobalesCargoGrupo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCargoGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CargoGrupoConstantesFunciones.TABLENAME);

						finalQueryGlobalCargoGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalCargoGrupo, "");
						finalQueryGlobalCargoGrupo+=CargoGrupoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCargoGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCargoGrupo=" WHERE " + ConstantesSql.ID + "="+cargoSessionBean.getlidCargoGrupoActual();
					}
				} else {
					finalQueryGlobalCargoGrupo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cargoReturnGeneral=cargoLogic.cargarCombosLoteForeignKeyCargo(finalQueryGlobalEmpresa,finalQueryGlobalCargo,finalQueryGlobalCuentaContable,finalQueryGlobalNumeroPatronal,finalQueryGlobalTipoPago_NM,finalQueryGlobalCargoGrupo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cargoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalCargo.equals("NONE")) {
				this.cargosForeignKey=cargoReturnGeneral.getcargosForeignKey();
			}

			if(!finalQueryGlobalCuentaContable.equals("NONE")) {
				this.cuentacontablesForeignKey=cargoReturnGeneral.getcuentacontablesForeignKey();
			}

			if(!finalQueryGlobalNumeroPatronal.equals("NONE")) {
				this.numeropatronalsForeignKey=cargoReturnGeneral.getnumeropatronalsForeignKey();
			}

			if(!finalQueryGlobalTipoPago_NM.equals("NONE")) {
				this.tipopago_nmsForeignKey=cargoReturnGeneral.gettipopago_nmsForeignKey();
			}

			if(!finalQueryGlobalCargoGrupo.equals("NONE")) {
				this.cargogruposForeignKey=cargoReturnGeneral.getcargogruposForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCargo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyCargo();
			this.addItemDefectoCombosForeignKeyCuentaContable();
			this.addItemDefectoCombosForeignKeyNumeroPatronal();
			this.addItemDefectoCombosForeignKeyTipoPago_NM();
			this.addItemDefectoCombosForeignKeyCargoGrupo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCargo()throws Exception {
		try {

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargo()) {
				Cargo cargo=new Cargo();
				CargoConstantesFunciones.setCargoDescripcion(cargo,Constantes.SMENSAJE_ESCOJA_OPCION);
				cargo.setId(null);

				if(!CargoConstantesFunciones.ExisteEnLista(this.cargosForeignKey,cargo,true)) {

					this.cargosForeignKey.add(0,cargo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContable()throws Exception {
		try {

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContable()) {
				CuentaContable cuentacontable=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontable,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontable.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablesForeignKey,cuentacontable,true)) {

					this.cuentacontablesForeignKey.add(0,cuentacontable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyNumeroPatronal()throws Exception {
		try {

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionNumeroPatronal()) {
				NumeroPatronal numeropatronal=new NumeroPatronal();
				NumeroPatronalConstantesFunciones.setNumeroPatronalDescripcion(numeropatronal,Constantes.SMENSAJE_ESCOJA_OPCION);
				numeropatronal.setId(null);

				if(!NumeroPatronalConstantesFunciones.ExisteEnLista(this.numeropatronalsForeignKey,numeropatronal,true)) {

					this.numeropatronalsForeignKey.add(0,numeropatronal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoPago_NM()throws Exception {
		try {

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionTipoPago_NM()) {
				TipoPago_NM tipopago_nm=new TipoPago_NM();
				TipoPago_NMConstantesFunciones.setTipoPago_NMDescripcion(tipopago_nm,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipopago_nm.setId(null);

				if(!TipoPago_NMConstantesFunciones.ExisteEnLista(this.tipopago_nmsForeignKey,tipopago_nm,true)) {

					this.tipopago_nmsForeignKey.add(0,tipopago_nm);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCargoGrupo()throws Exception {
		try {

			if(!this.cargoSessionBean.getisBusquedaDesdeForeignKeySesionCargoGrupo()) {
				CargoGrupo cargogrupo=new CargoGrupo();
				CargoGrupoConstantesFunciones.setCargoGrupoDescripcion(cargogrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				cargogrupo.setId(null);

				if(!CargoGrupoConstantesFunciones.ExisteEnLista(this.cargogruposForeignKey,cargogrupo,true)) {

					this.cargogruposForeignKey.add(0,cargogrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCargo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCargo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCargo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCargo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCargo(Cargo cargo)throws Exception {	
		try {
			
			this.setActualCargoForeignKey(cargo.getid_cargo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(cargo.getid_cuenta_contable(),false,"Formulario");
			this.setActualNumeroPatronalForeignKey(cargo.getid_numero_patronal(),false,"Formulario");
			this.setActualTipoPago_NMForeignKey(cargo.getid_tipo_pago__n_m(),false,"Formulario");
			this.setActualCargoGrupoForeignKey(cargo.getid_cargo_grupo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCargo(Cargo cargo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCargo()throws Exception {	
		try {
			
			this.setActualCargoForeignKey(this.cargoConstantesFunciones.getid_cargo(),false,"Formulario");
			this.setActualCuentaContableForeignKey(this.cargoConstantesFunciones.getid_cuenta_contable(),false,"Formulario");
			this.setActualNumeroPatronalForeignKey(this.cargoConstantesFunciones.getid_numero_patronal(),false,"Formulario");
			this.setActualTipoPago_NMForeignKey(this.cargoConstantesFunciones.getid_tipo_pago__n_m(),false,"Formulario");
			this.setActualCargoGrupoForeignKey(this.cargoConstantesFunciones.getid_cargo_grupo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCargo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCargo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCargo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCargo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCargo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameCargosForeignKey("Todos");
			this.cargarCombosFrameCuentaContablesForeignKey("Todos");
			this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
			this.cargarCombosFrameTipoPago_NMsForeignKey("Todos");
			this.cargarCombosFrameCargoGruposForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCargo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPago_NMsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCargoGruposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCargo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo!=null && this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.getItemCount()>0) {
				this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public CargoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CargoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CargoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cargoSessionBean=new CargoSessionBean(); 
		this.cargoConstantesFunciones=new CargoConstantesFunciones(); 
		this.cargoBean=new Cargo();//(this.cargoConstantesFunciones); 		
		this.cargoReturnGeneral=new CargoParameterReturnGeneral(); 
		
		this.cargoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cargoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CargoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CargoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CargoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCargo(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.cargoConstantesFunciones=new CargoConstantesFunciones(); 
			this.cargoBean=new Cargo();//this.cargoConstantesFunciones); 			
			this.cargoReturnGeneral=new CargoParameterReturnGeneral(); 
		
			CargoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cargo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cargo=new Cargo();
			this.cargos = new ArrayList<Cargo>();
			this.cargosAux = new ArrayList<Cargo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic=new CargoLogic();
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			//this.cargoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cargoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCargo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCargo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargo);	
					}
					
					if(this.jInternalFrameImportacionCargo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCargo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCargo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCargo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCargo);
				this.jInternalFrameDetalleFormCargo.setVisible(false);
				this.jInternalFrameDetalleFormCargo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCargo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargo);
					this.jInternalFrameReporteDinamicoCargo.setVisible(false);
					this.jInternalFrameReporteDinamicoCargo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCargo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCargo);
					this.jInternalFrameImportacionCargo.setVisible(false);
					this.jInternalFrameImportacionCargo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCargo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCargo);
					this.jInternalFrameOrderByCargo.setVisible(false);
					this.jInternalFrameOrderByCargo.setSelected(false);				
				}
				
			}
			
			this.cargosArbol= new ArrayList<Cargo>();
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameTreeCargo);    		
			}
			
			this.jDesktopPane.add(this.jInternalFrameTreeCargo);
			this.jInternalFrameTreeCargo.setVisible(false);
	        this.jInternalFrameTreeCargo.setSelected(false);						
			
			if(!esParaBusquedaForeignKey) {
				this.getTodosCargoArbol();
			}			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCargoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CargoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.cargoReturnGeneral=new CargoParameterReturnGeneral();
			
			this.cargoParameterGeneral=new CargoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cargoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(CargoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cargoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AsistenciaMensualConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoEstructuraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargoSessionBean.getEsGuardarRelacionado(),this.cargoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CargoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cargoSessionBean.getEsGuardarRelacionado(),this.cargoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaDuplicarCargo=true;
			this.isVisibilidadCeldaCopiarCargo=true;
			this.isVisibilidadCeldaVerFormCargo=true;
			this.isVisibilidadCeldaOrdenCargo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=false;
			this.isVisibilidadCeldaGuardarCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			
			
			this.isVisibilidadFK_IdCargo=true;
			this.isVisibilidadFK_IdCargoGrupo=true;
			this.isVisibilidadFK_IdCuentaContable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdNumeroPatronal=true;
			this.isVisibilidadFK_IdTipoPago_NM=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCargo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCargo(false);
			
			this.setPermisosUsuarioCargo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoSessionBean.getEsGuardarRelacionado() 
				|| (this.cargoSessionBean.getEsGuardarRelacionado() && this.cargoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCargoClasesRelacionadas();
			}
			
			if(this.cargoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCargoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CargoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCargo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCargo();
			}
			
			if(!this.isPermisoBusquedaCargo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCargo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCargo,this.isPermisoPaginacionMedioCargo,this.isPermisoPaginacionTodoCargo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CargoConstantesFunciones.getTiposSeleccionarCargo());
				
				this.tiposColumnasSelect=CargoConstantesFunciones.getTiposSeleccionarCargo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCargo();				
				//this.tiposRelacionesSelect=CargoConstantesFunciones.getTiposRelacionesCargo(true);
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCargo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCargo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCargo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCargo() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			
			this.asistenciamensualLogic=new AsistenciaMensualLogic();
			this.empleadoestructuraLogic=new EmpleadoEstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.cuentacontableLogic=new CuentaContableLogic();
			this.numeropatronalLogic=new NumeroPatronalLogic();
			this.tipopago_nmLogic=new TipoPago_NMLogic();
			this.cargogrupoLogic=new CargoGrupoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cargoImplementable= (CargoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cargoImplementableHome= (CargoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CargoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cargos= new ArrayList<Cargo>();
			this.cargosEliminados= new ArrayList<Cargo>();
						
			this.isEsNuevoCargo=false;
			this.esParaAccionDesdeFormularioCargo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.cargosForeignKey=new ArrayList<Cargo>() ;
			this.cuentacontablesForeignKey=new ArrayList<CuentaContable>() ;
			this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>() ;
			this.tipopago_nmsForeignKey=new ArrayList<TipoPago_NM>() ;
			this.cargogruposForeignKey=new ArrayList<CargoGrupo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCargo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCargo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CargoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CargoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCargo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCargo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCargo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCargo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCargo();
			}
			
			CargoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCargo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCargo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCargo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCargo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Cargo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCargo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CargoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CargoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCargo")) {
				iIndex=this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCargo.getSelectedRow();	
				
				

				if(sTitle.equals("Asistencia Mensuales")) {
					if(!AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCargo();

						this.cargarParteTabPanelRelacionadaAsistenciaMensual(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Cargos")) {
					if(!CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCargo();

						this.cargarParteTabPanelRelacionadaCargo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleados")) {
					if(!EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCargo();

						this.cargarParteTabPanelRelacionadaEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Empleado Estructuras")) {
					if(!EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCargo();

						this.cargarParteTabPanelRelacionadaEmpleadoEstructura(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCargo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAsistenciaMensual(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCargo.cargarSessionConBeanSwingJInternalFrameAsistenciaMensual(false,true,iIndex);
		this.jButtonAsistenciaMensualActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAsistenciaMensual();

		//this.jTabbedPaneRelacionesCargo.updateUI();
		//this.jTabbedPaneRelacionesCargo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCargo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaCargo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCargo.cargarSessionConBeanSwingJInternalFrameCargo(false,true,iIndex);
		this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargo();

		//this.jTabbedPaneRelacionesCargo.updateUI();
		//this.jTabbedPaneRelacionesCargo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCargo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCargo.cargarSessionConBeanSwingJInternalFrameEmpleado(false,true,iIndex);
		this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleado();

		//this.jTabbedPaneRelacionesCargo.updateUI();
		//this.jTabbedPaneRelacionesCargo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCargo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEmpleadoEstructura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCargo.cargarSessionConBeanSwingJInternalFrameEmpleadoEstructura(false,true,iIndex);
		this.jButtonEmpleadoEstructuraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEmpleadoEstructura();

		//this.jTabbedPaneRelacionesCargo.updateUI();
		//this.jTabbedPaneRelacionesCargo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCargo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AsistenciaMensual")) {
				int row=this.jTableDatosCargo.getSelectedRow();
				jButtonAsistenciaMensualActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("EmpleadoEstructura")) {
				int row=this.jTableDatosCargo.getSelectedRow();
				jButtonEmpleadoEstructuraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Empleado")) {
				int row=this.jTableDatosCargo.getSelectedRow();
				jButtonEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cargo")) {
				int row=this.jTableDatosCargo.getSelectedRow();
				jButtonCargoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Asistencia Mensual")) {

					if(this.isTienePermisosAsistenciaMensual && this.cargoConstantesFunciones.mostrarAsistenciaMensualCargo && !CargoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Asistencia Mensuales"+"("+AsistenciaMensualConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Asistencia Mensuales");

						if(cargoConstantesFunciones.resaltarAsistenciaMensualCargo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cargoConstantesFunciones.resaltarAsistenciaMensualCargo);
						}

						jmenuItem.setEnabled(this.cargoConstantesFunciones.activarAsistenciaMensualCargo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AsistenciaMensual"));

						

						this.jInternalFrameDetalleFormCargo.jmenuDetalleCargo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado Estructura")) {

					if(this.isTienePermisosEmpleadoEstructura && this.cargoConstantesFunciones.mostrarEmpleadoEstructuraCargo && !CargoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleado Estructuras"+"("+EmpleadoEstructuraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleado Estructuras");

						if(cargoConstantesFunciones.resaltarEmpleadoEstructuraCargo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cargoConstantesFunciones.resaltarEmpleadoEstructuraCargo);
						}

						jmenuItem.setEnabled(this.cargoConstantesFunciones.activarEmpleadoEstructuraCargo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"EmpleadoEstructura"));

						

						this.jInternalFrameDetalleFormCargo.jmenuDetalleCargo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Empleado")) {

					if(this.isTienePermisosEmpleado && this.cargoConstantesFunciones.mostrarEmpleadoCargo && !CargoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Empleados"+"("+EmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Empleados");

						if(cargoConstantesFunciones.resaltarEmpleadoCargo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cargoConstantesFunciones.resaltarEmpleadoCargo);
						}

						jmenuItem.setEnabled(this.cargoConstantesFunciones.activarEmpleadoCargo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Empleado"));

						

						this.jInternalFrameDetalleFormCargo.jmenuDetalleCargo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cargo")) {

					if(this.isTienePermisosCargo && this.cargoConstantesFunciones.mostrarCargoCargo && !CargoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cargos"+"("+CargoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cargos");

						if(cargoConstantesFunciones.resaltarCargoCargo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(cargoConstantesFunciones.resaltarCargoCargo);
						}

						jmenuItem.setEnabled(this.cargoConstantesFunciones.activarCargoCargo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cargo"));

						

						this.jInternalFrameDetalleFormCargo.jmenuDetalleCargo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCargo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCargoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCargo();
		
		this.cargarCombosFrameForeignKeyCargo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCargo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCargo();
		}
	}
	
	

	public void cargarCombosForeignKeyCargo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCargoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCargo();
				this.cargarCombosFrameCargosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCargo(this.cargosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContable();
				this.cargarCombosFrameCuentaContablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContable(this.cuentacontablesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyNumeroPatronal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyNumeroPatronalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyNumeroPatronal();
				this.cargarCombosFrameNumeroPatronalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaNumeroPatronal(this.numeropatronalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPago_NM(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPago_NMListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPago_NM();
				this.cargarCombosFrameTipoPago_NMsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPago_NM(this.tipopago_nmsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCargoGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCargoGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCargoGrupo();
				this.cargarCombosFrameCargoGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCargoGrupo(this.cargogruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCargoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cargoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			
			if(jTableDatosCargo.getRowCount()>=1) {
				jTableDatosCargo.removeRowSelectionInterval(0, jTableDatosCargo.getRowCount()-1);						
			}
			
			this.isEsNuevoCargo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCargo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCargo(true);			
			//this.cargo=new Cargo();
			//this.cargo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargo() ;
			
			if(CargoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cargo);	
			this.actualizarInformacion("INFO_PADRE",false,this.cargo);				
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			if(this.cargoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Cargo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCargoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCargo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCargo.getSelectedRows().length;			
			}
			
			cargosSeleccionados=this.getCargosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCargo--;			
				//Cargo cargoAux= new Cargo();			
				//cargoAux.setId(this.iIdNuevoCargo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Cargo cargoOrigen=new Cargo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Cargo cargoOrigen : cargosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCargo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cargoOrigen =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cargoOrigen =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCargo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cargo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCargo(cargoOrigen,this.cargo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargoLogic.getCargos().add(this.cargoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargos.add(this.cargoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCargo(false);
				
				this.jTableDatosCargo.setRowSelectionInterval(this.getIndiceNuevoCargo(), this.getIndiceNuevoCargo());
				
				int iLastRow =  this.jTableDatosCargo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();									
		
			Cargo cargoOrigen=new Cargo();
			Cargo cargoDestino=new Cargo();
				
			cargosSeleccionados=this.getCargosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCargo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cargosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCargo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoOrigen =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargoOrigen =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cargoDestino =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cargoDestino =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cargoOrigen =cargosSeleccionados.get(0);
				cargoDestino =cargosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCargo(cargoOrigen,cargoDestino,true,false);
				
				cargoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cargoDestino,cargoLogic.getCargos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cargoDestino,cargos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCargo(false);
				
				//this.jTableDatosCargo.setRowSelectionInterval(this.getIndiceNuevoCargo(), this.getIndiceNuevoCargo());
				
				int iLastRow =  this.jTableDatosCargo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCargo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCargo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCargo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCargo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCargo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCargo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCargo.setVisible(!isVisible);
			this.jPanelPaginacionCargo.setVisible(!isVisible);
			this.jPanelAccionesCargo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCargo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCargo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCargo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCargo();
			
			this.abrirFrameOrderByCargo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCargo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCargo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCargo.isMaximum()) {
					this.jInternalFrameDetalleFormCargo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCargo.setSize(this.jInternalFrameDetalleFormCargo.iWidthFormulario,this.jInternalFrameDetalleFormCargo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCargo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCargo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCargo.isMaximum()) {
						this.jInternalFrameDetalleFormCargo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),CargoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),CargoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),CargoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAsistenciaMensual();
					}

					if(CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargo();
					}

					if(EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleado();
					}

					if(EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEmpleadoEstructura();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCargo.setVisible(true);
	        this.jInternalFrameDetalleFormCargo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCargo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCargo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCargo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargo,false,this);
				} else {
					this.jInternalFrameOrderByCargo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCargo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCargo);
				this.jInternalFrameOrderByCargo.setVisible(false);
				this.jInternalFrameOrderByCargo.setSelected(false);
				
				this.jInternalFrameOrderByCargo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargo"));
				
				this.inicializarActualizarBindingTablaOrderByCargo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCargo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCargo==null) {
				
				this.jInternalFrameImportacionCargo=new ImportacionJInternalFrame(CargoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCargo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCargo);
				this.jInternalFrameImportacionCargo.setVisible(false);
				this.jInternalFrameImportacionCargo.setSelected(false);


				this.jInternalFrameImportacionCargo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargo"));
				this.jInternalFrameImportacionCargo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargo"));
				this.jInternalFrameImportacionCargo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCargo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCargo==null) {
				this.jInternalFrameReporteDinamicoCargo=new ReporteDinamicoJInternalFrame(CargoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCargo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCargo);
				this.jInternalFrameReporteDinamicoCargo.setVisible(false);
				this.jInternalFrameReporteDinamicoCargo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCargo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargo"));
				this.jInternalFrameReporteDinamicoCargo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargo"));
				this.jInternalFrameReporteDinamicoCargo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAsistenciaMensual() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.jScrollPanelDatosAsistenciaMensual.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.jScrollPanelDatosAsistenciaMensual.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.jScrollPanelDatosAsistenciaMensual.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.jScrollPanelDatosAsistenciaMensual.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaCargo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEmpleadoEstructura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEstructura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCargo.jContentPaneDetalleCargo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEstructura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEstructura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEstructura.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCargo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCargo);
			
	       	this.jInternalFrameDetalleFormCargo.setVisible(false);
	        this.jInternalFrameDetalleFormCargo.setSelected(false);
			
			//this.jInternalFrameDetalleFormCargo.dispose();
			//this.jInternalFrameDetalleFormCargo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCargo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCargo.setVisible(true);
	        this.jInternalFrameReporteDinamicoCargo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCargo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCargo.setVisible(true);
	        this.jInternalFrameImportacionCargo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCargo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCargo.setVisible(true);
	        this.jInternalFrameOrderByCargo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCargo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCargo.setVisible(false);
	        this.jInternalFrameOrderByCargo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCargo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCargo.setVisible(false);
	        this.jInternalFrameReporteDinamicoCargo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCargo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCargo.setVisible(false);
	        this.jInternalFrameImportacionCargo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	 public void abrirFrameTreeCargo(String sTipoProceso) { //throws Exception	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameTreeCargo);
			
			this.jInternalFrameTreeCargo.setsTipoProceso(sTipoProceso);
			
			if(sTipoProceso.equals("BUSQUEDA_FK")) {
				this.jInternalFrameTreeCargo.sTipoBusqueda="Cargo";
			}
			
			this.jInternalFrameTreeCargo.setCargos(this.cargosArbol);
			this.jInternalFrameTreeCargo.CargarTreeCargo();
			
	       	this.jInternalFrameTreeCargo.setVisible(true);
	        this.jInternalFrameTreeCargo.setSelected(true);
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			e.getStackTrace();
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }
	}
	
	public void cerrarFrameTreeCargo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameTreeCargo);
			
	       	this.jInternalFrameTreeCargo.setVisible(false);
	        this.jInternalFrameTreeCargo.setSelected(false);
			
			//this.jInternalFrameTreeCargo.dispose();
			//this.jInternalFrameTreeCargo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
	    }
	}
	

				public void abrirFrameTreeCuentaContable(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContable";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
						TitledBorder titledBorderCuentaContable=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContable.setTitle(titledBorderCargo.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContable(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCargo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCargo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCargo(true);
			//this.isEsNuevoCargo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCargo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargo(false) ;
			
			if(cargoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.getEsGuardarRelacionado() && AsistenciaMensualJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAsistenciaMensualActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.getEsGuardarRelacionado() && EmpleadoEstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoEstructuraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado() && EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CargoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCargoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCargo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCargo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCargo(true);
			//this.isEsNuevoCargo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cargo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCargo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCargo(false) ;
			
			if(CargoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCargo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaCargo(List<Cargo> cargosForeignKey)throws Exception{
		TableColumn tableColumnCargo=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCARGO));
		TableCellEditor tableCellEditorCargo =tableColumnCargo.getCellEditor();

		CargoTableCell cargoTableCellFk=(CargoTableCell)tableCellEditorCargo;

		if(cargoTableCellFk!=null) {
			cargoTableCellFk.setcargosForeignKey(cargosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargoTableCellFk.setRowActual(intSelectedRow);
			//cargoTableCellFk.setcargosForeignKeyActual(cargosForeignKey);
		//}


		if(cargoTableCellFk!=null) {
			cargoTableCellFk.RecargarCargosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContable(List<CuentaContable> cuentacontablesForeignKey)throws Exception{
		TableColumn tableColumnCuentaContable=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCUENTACONTABLE));
		TableCellEditor tableCellEditorCuentaContable =tableColumnCuentaContable.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContable;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablesForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaNumeroPatronal(List<NumeroPatronal> numeropatronalsForeignKey)throws Exception{
		TableColumn tableColumnNumeroPatronal=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL));
		TableCellEditor tableCellEditorNumeroPatronal =tableColumnNumeroPatronal.getCellEditor();

		NumeroPatronalTableCell numeropatronalTableCellFk=(NumeroPatronalTableCell)tableCellEditorNumeroPatronal;

		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.setnumeropatronalsForeignKey(numeropatronalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//numeropatronalTableCellFk.setRowActual(intSelectedRow);
			//numeropatronalTableCellFk.setnumeropatronalsForeignKeyActual(numeropatronalsForeignKey);
		//}


		if(numeropatronalTableCellFk!=null) {
			numeropatronalTableCellFk.RecargarNumeroPatronalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPago_NM(List<TipoPago_NM> tipopago_nmsForeignKey)throws Exception{
		TableColumn tableColumnTipoPago_NM=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM));
		TableCellEditor tableCellEditorTipoPago_NM =tableColumnTipoPago_NM.getCellEditor();

		TipoPago_NMTableCell tipopago_nmTableCellFk=(TipoPago_NMTableCell)tableCellEditorTipoPago_NM;

		if(tipopago_nmTableCellFk!=null) {
			tipopago_nmTableCellFk.settipopago_nmsForeignKey(tipopago_nmsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipopago_nmTableCellFk.setRowActual(intSelectedRow);
			//tipopago_nmTableCellFk.settipopago_nmsForeignKeyActual(tipopago_nmsForeignKey);
		//}


		if(tipopago_nmTableCellFk!=null) {
			tipopago_nmTableCellFk.RecargarTipoPago_NMsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCargoGrupo(List<CargoGrupo> cargogruposForeignKey)throws Exception{
		TableColumn tableColumnCargoGrupo=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCARGOGRUPO));
		TableCellEditor tableCellEditorCargoGrupo =tableColumnCargoGrupo.getCellEditor();

		CargoGrupoTableCell cargogrupoTableCellFk=(CargoGrupoTableCell)tableCellEditorCargoGrupo;

		if(cargogrupoTableCellFk!=null) {
			cargogrupoTableCellFk.setcargogruposForeignKey(cargogruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCargo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cargogrupoTableCellFk.setRowActual(intSelectedRow);
			//cargogrupoTableCellFk.setcargogruposForeignKeyActual(cargogruposForeignKey);
		//}


		if(cargogrupoTableCellFk!=null) {
			cargogrupoTableCellFk.RecargarCargoGruposForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCargo(false);
			
			//if(!this.isEsNuevoCargo) {								
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				
			}
			
			if(this.permiteMantenimiento(this.cargo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCargo=true;
					this.inicializarActualizarBindingTablaCargo(false);
					this.isEsNuevoCargo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCargo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCargo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargo(false);
				
				this.habilitarDeshabilitarControlesCargo(false);
			
												
				
				if(CargoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCargo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCargoActionPerformed(evt,cargoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCargo(this.cargo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCargo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cargoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cargo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCargoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCargo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				this.cargo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				this.cargo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cargo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cargoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CargoModel) this.jTableDatosCargo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCargo=true;
				this.inicializarActualizarBindingTablaCargo(false);
				this.isEsNuevoCargo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCargo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargo(false);
				
				this.habilitarDeshabilitarControlesCargo(false);
				
				
				
				if(CargoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCargo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCargoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCargo.getRowCount()>=1) {
				jTableDatosCargo.removeRowSelectionInterval(0, jTableDatosCargo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCargo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCargo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCargo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCargo(false) ;
			
			this.isEsNuevoCargo=false;
			
			if(CargoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCargo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCargo(false);
				
				//SI ES MANUAL
				if(CargoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCargo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCargo--;			
			//Cargo cargoAux= new Cargo();			
			//cargoAux.setId(this.iIdNuevoCargo);
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCargo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
			
			this.cargo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cargoLogic.getCargos().add(this.cargoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cargos.add(this.cargoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCargo(false);
			
			this.jTableDatosCargo.setRowSelectionInterval(this.getIndiceNuevoCargo(), this.getIndiceNuevoCargo());
			
			int iLastRow =  this.jTableDatosCargo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCargo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCargo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCargo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCargo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargo(false);
			
			//SI ES MANUAL
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargo();
			}
			
			//this.abrirFrameTreeCargo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCargoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE CargoS ?", "MANTENIMIENTO DE Cargo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCargo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCargo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cargoReturnGeneral=cargoLogic.procesarImportacionCargosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cargoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCargoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCargoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCargo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCargo.setFileImportacion(this.jInternalFrameImportacionCargo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCargo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCargo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCargo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCargo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCargoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		

		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CargoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CargoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteCargos("Todos",cargosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_IDCARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cargo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cargo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cargo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cargo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_NumeroPatronal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_NumeroPatronal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_NumeroPatronal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_NumeroPatronal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPago_NM_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPago_NM_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPago_NM_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPago_NM_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_IDCARGOGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CargoGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CargoGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CargoGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CargoGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_VALORANTICIPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAnticipo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAnticipo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAnticipo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAnticipo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeAnticipo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeAnticipo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeAnticipo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeAnticipo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_ESJEFE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Jefe_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Jefe_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Jefe_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Jefe_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_ESANUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CargoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoCargo.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CargoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CargoConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoria="id_cargo";
					break;

				case CargoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoria="id_cuenta_contable";
					break;

				case CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoria="id_numero_patronal";
					break;

				case CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM:
					sNombreCampoCategoria="id_tipo_pago__n_m";
					break;

				case CargoConstantesFunciones.LABEL_IDCARGOGRUPO:
					sNombreCampoCategoria="id_cargo_grupo";
					break;

				case CargoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CargoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CargoConstantesFunciones.LABEL_VALORANTICIPO:
					sNombreCampoCategoria="valor_anticipo";
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO:
					sNombreCampoCategoria="porcentaje_anticipo";
					break;

				case CargoConstantesFunciones.LABEL_ESJEFE:
					sNombreCampoCategoria="es_jefe";
					break;

				case CargoConstantesFunciones.LABEL_ESANUAL:
					sNombreCampoCategoria="es_anual";
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case CargoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CargoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CargoConstantesFunciones.LABEL_IDCARGO:
					sNombreCampoCategoriaValor="id_cargo";
					break;

				case CargoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					sNombreCampoCategoriaValor="id_cuenta_contable";
					break;

				case CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					sNombreCampoCategoriaValor="id_numero_patronal";
					break;

				case CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM:
					sNombreCampoCategoriaValor="id_tipo_pago__n_m";
					break;

				case CargoConstantesFunciones.LABEL_IDCARGOGRUPO:
					sNombreCampoCategoriaValor="id_cargo_grupo";
					break;

				case CargoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CargoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CargoConstantesFunciones.LABEL_VALORANTICIPO:
					sNombreCampoCategoriaValor="valor_anticipo";
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO:
					sNombreCampoCategoriaValor="porcentaje_anticipo";
					break;

				case CargoConstantesFunciones.LABEL_ESJEFE:
					sNombreCampoCategoriaValor="es_jefe";
					break;

				case CargoConstantesFunciones.LABEL_ESANUAL:
					sNombreCampoCategoriaValor="es_anual";
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case CargoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCargo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCargo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CargoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CargoConstantesFunciones.LABEL_IDCARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cargo");
					break;

				case CargoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable");
					break;

				case CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Patronal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_numero_patronal");
					break;

				case CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Pago_ N M",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_pago__n_m");
					break;

				case CargoConstantesFunciones.LABEL_IDCARGOGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cargo Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cargo_grupo");
					break;

				case CargoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CargoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CargoConstantesFunciones.LABEL_VALORANTICIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Anticipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_anticipo");
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje Anticipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_anticipo");
					break;

				case CargoConstantesFunciones.LABEL_ESJEFE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Jefe",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_jefe");
					break;

				case CargoConstantesFunciones.LABEL_ESANUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Anual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_anual");
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case CargoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoCargoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Cargos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CargoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_IDCARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGO);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getcargo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_IDCUENTACONTABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getcuentacontable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getnumeropatronal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.gettipopago_nm_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_IDCARGOGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGOGRUPO);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getcargogrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_VALORANTICIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_VALORANTICIPO);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getvalor_anticipo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getporcentaje_anticipo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_ESJEFE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_ESJEFE);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getes_jefe());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_ESANUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_ESANUAL);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getes_anual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CargoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CargoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Cargo cargo:cargosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cargo.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelCargo(row);				
			//	iRow++;
			//}				
			
			//for(Cargo cargoAux:cargosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCargo(cargoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	public void jButtonArbolCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.abrirFrameTreeCargo("BUSQUEDA_NORMAL");
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargo(false);
			
			//SI ES MANUAL
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCargo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargo(false);
			
			//SI ES MANUAL
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCargoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCargo(false);
			
			//SI ES MANUAL
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCargo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCargo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCargo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCargo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCargo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCargo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCargo.setMinimumSize(dimensionMinimum);
		this.jTableDatosCargo.setMaximumSize(dimensionMaximum);
		this.jTableDatosCargo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCargo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCargo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCargo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCargo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCargo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCargo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCargo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CargoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CargoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCargo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCargo();
		
		this.inicializarActualizarBindingBotonesManualCargo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCargo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCargo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCargo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCargo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCargo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCargo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCargo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCargo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionNuevoCargo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionSinCerrarCargo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionSinMensajeCargo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCargo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCargo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCargo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCargo!=null) {
				this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionNuevoCargo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionSinCerrarCargo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCargo.jCheckBoxPostAccionSinMensajeCargo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCargo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCargo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCargo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCargo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCargo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCargo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCargo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCargo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCargo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCargo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCargo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCargo(Boolean esInicializar) throws Exception {
		try	{	
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCargo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCargo() throws Exception {
		try	{
			if(CargoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCargo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCargo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCargo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCargo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCargo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCargo.addItem(reporte);
			}
			
			
			if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCargo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCargo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCargo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCargo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCargo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCargo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCargo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCargo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargo!=null) {
				this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCargo!=null) {
				this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCargo!=null) {
				
				if(this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCargo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CargoConstantesFunciones.getTiposSeleccionarCargo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CargoConstantesFunciones.getTiposSeleccionarCargo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCargo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCargo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CargoConstantesFunciones.getTiposSeleccionarCargo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCargo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCargo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCargo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cargoFK_IdCargoCargo.getSelectedItem()!=null){this.id_cargoFK_IdCargo=((Cargo)this.jComboBoxid_cargoFK_IdCargoCargo.getSelectedItem()).getId();}
		if(this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.getSelectedItem()!=null){this.id_cargo_grupoFK_IdCargoGrupo=((CargoGrupo)this.jComboBoxid_cargo_grupoFK_IdCargoGrupoCargo.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.getSelectedItem()!=null){this.id_cuenta_contableFK_IdCuentaContable=((CuentaContable)this.jComboBoxid_cuenta_contableFK_IdCuentaContableCargo.getSelectedItem()).getId();}
		if(this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.getSelectedItem()!=null){this.id_numero_patronalFK_IdNumeroPatronal=((NumeroPatronal)this.jComboBoxid_numero_patronalFK_IdNumeroPatronalCargo.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.getSelectedItem()!=null){this.id_tipo_pago__n_mFK_IdTipoPago_NM=((TipoPago_NM)this.jComboBoxid_tipo_pago__n_mFK_IdTipoPago_NMCargo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCargo(Boolean esInicializar) throws Exception {				
		if(CargoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCargo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCargo() throws Exception {
		this.inicializarActualizarBindingTablaCargo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCargo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCargoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCargo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCargo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCargo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cargoLogic.getCargos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cargos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCargo.setModel(new CargoModel(this.cargoLogic.getCargos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCargo.setModel(new CargoModel(this.cargos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCargo!=null && this.jInternalFrameOrderByCargo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCargo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CargoConstantesFunciones.SCLASSWEBTITULO,cargoConstantesFunciones.resaltarSeleccionarCargo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CargoConstantesFunciones.SCLASSWEBTITULO,cargoConstantesFunciones.resaltarSeleccionarCargo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_ID));

		if(this.cargoConstantesFunciones.mostraridCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoConstantesFunciones.resaltaridCargo,this.cargoConstantesFunciones.activaridCargo,iSizeTabla,this,true,"idCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltaridCargo,this.cargoConstantesFunciones.activaridCargo,this,true,"idCargo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cargoConstantesFunciones.mostrarid_empresaCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cargoConstantesFunciones.resaltarid_empresaCargo,this,this.cargoConstantesFunciones.activarid_empresaCargo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cargoConstantesFunciones.resaltarid_empresaCargo,this,this.cargoConstantesFunciones.activarid_empresaCargo,false,"id_empresaCargo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCARGO));

		if(this.cargoConstantesFunciones.mostrarid_cargoCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDCARGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CargoTableCell(this.cargosForeignKey,this.cargoConstantesFunciones.resaltarid_cargoCargo,this,this.cargoConstantesFunciones.activarid_cargoCargo,iSizeTabla));
			tableColumn.setCellEditor(new CargoTableCell(this.cargosForeignKey,this.cargoConstantesFunciones.resaltarid_cargoCargo,this,this.cargoConstantesFunciones.activarid_cargoCargo,true,"id_cargoCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCUENTACONTABLE));

		if(this.cargoConstantesFunciones.mostrarid_cuenta_contableCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDCUENTACONTABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cargoConstantesFunciones.resaltarid_cuenta_contableCargo,this,this.cargoConstantesFunciones.activarid_cuenta_contableCargo,iSizeTabla));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablesForeignKey,this.cargoConstantesFunciones.resaltarid_cuenta_contableCargo,this,this.cargoConstantesFunciones.activarid_cuenta_contableCargo,true,"id_cuenta_contableCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL));

		if(this.cargoConstantesFunciones.mostrarid_numero_patronalCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.cargoConstantesFunciones.resaltarid_numero_patronalCargo,this,this.cargoConstantesFunciones.activarid_numero_patronalCargo,iSizeTabla));
			tableColumn.setCellEditor(new NumeroPatronalTableCell(this.numeropatronalsForeignKey,this.cargoConstantesFunciones.resaltarid_numero_patronalCargo,this,this.cargoConstantesFunciones.activarid_numero_patronalCargo,true,"id_numero_patronalCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM));

		if(this.cargoConstantesFunciones.mostrarid_tipo_pago__n_mCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPago_NMTableCell(this.tipopago_nmsForeignKey,this.cargoConstantesFunciones.resaltarid_tipo_pago__n_mCargo,this,this.cargoConstantesFunciones.activarid_tipo_pago__n_mCargo,iSizeTabla));
			tableColumn.setCellEditor(new TipoPago_NMTableCell(this.tipopago_nmsForeignKey,this.cargoConstantesFunciones.resaltarid_tipo_pago__n_mCargo,this,this.cargoConstantesFunciones.activarid_tipo_pago__n_mCargo,true,"id_tipo_pago__n_mCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_IDCARGOGRUPO));

		if(this.cargoConstantesFunciones.mostrarid_cargo_grupoCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_IDCARGOGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CargoGrupoTableCell(this.cargogruposForeignKey,this.cargoConstantesFunciones.resaltarid_cargo_grupoCargo,this,this.cargoConstantesFunciones.activarid_cargo_grupoCargo,iSizeTabla));
			tableColumn.setCellEditor(new CargoGrupoTableCell(this.cargogruposForeignKey,this.cargoConstantesFunciones.resaltarid_cargo_grupoCargo,this,this.cargoConstantesFunciones.activarid_cargo_grupoCargo,true,"id_cargo_grupoCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_CODIGO));

		if(this.cargoConstantesFunciones.mostrarcodigoCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargoConstantesFunciones.resaltarcodigoCargo,this.cargoConstantesFunciones.activarcodigoCargo,iSizeTabla,this,true,"codigoCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarcodigoCargo,this.cargoConstantesFunciones.activarcodigoCargo,this,true,"codigoCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_NOMBRE));

		if(this.cargoConstantesFunciones.mostrarnombreCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cargoConstantesFunciones.resaltarnombreCargo,this.cargoConstantesFunciones.activarnombreCargo,iSizeTabla,this,true,"nombreCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarnombreCargo,this.cargoConstantesFunciones.activarnombreCargo,this,true,"nombreCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_VALORANTICIPO));

		if(this.cargoConstantesFunciones.mostrarvalor_anticipoCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_VALORANTICIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoConstantesFunciones.resaltarvalor_anticipoCargo,this.cargoConstantesFunciones.activarvalor_anticipoCargo,iSizeTabla,this,true,"valor_anticipoCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarvalor_anticipoCargo,this.cargoConstantesFunciones.activarvalor_anticipoCargo,this,true,"valor_anticipoCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO));

		if(this.cargoConstantesFunciones.mostrarporcentaje_anticipoCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoConstantesFunciones.resaltarporcentaje_anticipoCargo,this.cargoConstantesFunciones.activarporcentaje_anticipoCargo,iSizeTabla,this,true,"porcentaje_anticipoCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarporcentaje_anticipoCargo,this.cargoConstantesFunciones.activarporcentaje_anticipoCargo,this,true,"porcentaje_anticipoCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_ESJEFE));

		if(this.cargoConstantesFunciones.mostrares_jefeCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_ESJEFE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cargoConstantesFunciones.resaltares_jefeCargo,this.cargoConstantesFunciones.activares_jefeCargo,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cargoConstantesFunciones.resaltares_jefeCargo,this.cargoConstantesFunciones.activares_jefeCargo,this,true,"es_jefeCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_ESANUAL));

		if(this.cargoConstantesFunciones.mostrares_anualCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_ESANUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cargoConstantesFunciones.resaltares_anualCargo,this.cargoConstantesFunciones.activares_anualCargo,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cargoConstantesFunciones.resaltares_anualCargo,this.cargoConstantesFunciones.activares_anualCargo,this,true,"es_anualCargo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.cargoConstantesFunciones.mostrarporcentajeCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoConstantesFunciones.resaltarporcentajeCargo,this.cargoConstantesFunciones.activarporcentajeCargo,iSizeTabla,this,true,"porcentajeCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarporcentajeCargo,this.cargoConstantesFunciones.activarporcentajeCargo,this,true,"porcentajeCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCargo,CargoConstantesFunciones.LABEL_VALOR));

		if(this.cargoConstantesFunciones.mostrarvalorCargo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CargoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cargoConstantesFunciones.resaltarvalorCargo,this.cargoConstantesFunciones.activarvalorCargo,iSizeTabla,this,true,"valorCargo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cargoConstantesFunciones.resaltarvalorCargo,this.cargoConstantesFunciones.activarvalorCargo,this,true,"valorCargo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CargoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cargoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAsistenciaMensual && this.cargoConstantesFunciones.mostrarAsistenciaMensualCargo && !CargoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Asistencia Mensuales");
				tableColumn.setHeaderValue("Asistencia Mensuales");
				tableColumn.setCellRenderer(new AsistenciaMensualTableCell(cargoConstantesFunciones.resaltarAsistenciaMensualCargo,this,this.cargoConstantesFunciones.activarAsistenciaMensualCargo));
				tableColumn.setCellEditor(new AsistenciaMensualTableCell(cargoConstantesFunciones.resaltarAsistenciaMensualCargo,this,this.cargoConstantesFunciones.activarAsistenciaMensualCargo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCargo.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleadoEstructura && this.cargoConstantesFunciones.mostrarEmpleadoEstructuraCargo && !CargoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleado Estructuras");
				tableColumn.setHeaderValue("Empleado Estructuras");
				tableColumn.setCellRenderer(new EmpleadoEstructuraTableCell(cargoConstantesFunciones.resaltarEmpleadoEstructuraCargo,this,this.cargoConstantesFunciones.activarEmpleadoEstructuraCargo));
				tableColumn.setCellEditor(new EmpleadoEstructuraTableCell(cargoConstantesFunciones.resaltarEmpleadoEstructuraCargo,this,this.cargoConstantesFunciones.activarEmpleadoEstructuraCargo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCargo.addColumn(tableColumn);
			}

			if(this.isTienePermisosEmpleado && this.cargoConstantesFunciones.mostrarEmpleadoCargo && !CargoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Empleados");
				tableColumn.setHeaderValue("Empleados");
				tableColumn.setCellRenderer(new EmpleadoTableCell(cargoConstantesFunciones.resaltarEmpleadoCargo,this,this.cargoConstantesFunciones.activarEmpleadoCargo));
				tableColumn.setCellEditor(new EmpleadoTableCell(cargoConstantesFunciones.resaltarEmpleadoCargo,this,this.cargoConstantesFunciones.activarEmpleadoCargo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCargo.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargo && this.cargoConstantesFunciones.mostrarCargoCargo && !CargoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cargos");
				tableColumn.setHeaderValue("Cargos");
				tableColumn.setCellRenderer(new CargoTableCell(cargoConstantesFunciones.resaltarCargoCargo,this,this.cargoConstantesFunciones.activarCargoCargo));
				tableColumn.setCellEditor(new CargoTableCell(cargoConstantesFunciones.resaltarCargoCargo,this,this.cargoConstantesFunciones.activarCargoCargo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCargo.addColumn(tableColumn);
			}
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCargo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCargo && this.isPermisoGuardarCambiosCargo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cargoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCargo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.cargoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosCargo.addColumn(tableColumn);
				}
			}
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosCargo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargo && this.isPermisoGuardarCambiosCargo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cargoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCargo && this.isPermisoGuardarCambiosCargo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCargo.moveColumn(this.jTableDatosCargo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCargo.moveColumn(this.jTableDatosCargo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.cargoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCargo.moveColumn(this.jTableDatosCargo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCargo.moveColumn(this.jTableDatosCargo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCargo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCargo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCargo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCargo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCargo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCargo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCargo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCargo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=cargoLogic.getCargos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cargos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosCargo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCargo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCargo();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoCargo=false;
					
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
				if(this.cargoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCargo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cargo.getsType().equals("DUPLICADO")
				   || this.cargo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCargo=true;
				
				} else {
					this.isEsNuevoCargo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cargoSessionBean.getEsGuardarRelacionado()) {
					if(this.cargo.getId()>=0 && !this.cargo.getIsNew()) {						
						this.isEsNuevoCargo=false;
						
					} else {
						this.isEsNuevoCargo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCargo(esRelaciones);						
				
				this.seleccionarCargo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cargo.getId()<0) {
					this.isEsNuevoCargo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCargo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCargo(evt,rowIndex);
				}	
				
				if(this.cargoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Cargo: " + this.dDif); 
					}
				}								
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCargo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cargo)) {
					if(this.cargo.getId()>0) {
						this.cargo.setIsDeleted(true);
						
						this.cargosEliminados.add(this.cargo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cargoLogic.getCargos().remove(this.cargo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cargos.remove(this.cargo);				
					}
					
					
					((CargoModel) this.jTableDatosCargo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCargo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCargo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCargo) {
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCargo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCargo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCargo(this.cargo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.cargoConstantesFunciones.cargarid_empresaCargo || this.cargoConstantesFunciones.event_dependid_empresaCargo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cargo.getid_empresa());
									//this.inicializarActualizarBindingCargo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cargo.getEmpresa()!=null) {
							this.empresasForeignKey.add(cargo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cargo.getid_empresa(),false,"Formulario");

					//Cargo
					if(!this.cargoConstantesFunciones.cargarid_cargoCargo || this.cargoConstantesFunciones.event_dependid_cargoCargo) {
						//this.cargarCombosCargosForeignKeyLista(" where id="+this.cargo.getid_cargo());
									//this.inicializarActualizarBindingCargo(false,false);
						this.cargosForeignKey=new ArrayList<Cargo>();

						if(cargo.getCargo()!=null) {
							this.cargosForeignKey.add(cargo.getCargo());
						}

						this.addItemDefectoCombosForeignKeyCargo();
						this.cargarCombosFrameCargosForeignKey("Todos");
					}
					this.setActualCargoForeignKey(this.cargo.getid_cargo(),false,"Formulario");

					//CuentaContable
					if(!this.cargoConstantesFunciones.cargarid_cuenta_contableCargo || this.cargoConstantesFunciones.event_dependid_cuenta_contableCargo) {
						//this.cargarCombosCuentaContablesForeignKeyLista(" where id="+this.cargo.getid_cuenta_contable());
									//this.inicializarActualizarBindingCargo(false,false);
						this.cuentacontablesForeignKey=new ArrayList<CuentaContable>();

						if(cargo.getCuentaContable()!=null) {
							this.cuentacontablesForeignKey.add(cargo.getCuentaContable());
						}

						this.addItemDefectoCombosForeignKeyCuentaContable();
						this.cargarCombosFrameCuentaContablesForeignKey("Todos");
					}
					this.setActualCuentaContableForeignKey(this.cargo.getid_cuenta_contable(),false,"Formulario");

					//NumeroPatronal
					if(!this.cargoConstantesFunciones.cargarid_numero_patronalCargo || this.cargoConstantesFunciones.event_dependid_numero_patronalCargo) {
						//this.cargarCombosNumeroPatronalsForeignKeyLista(" where id="+this.cargo.getid_numero_patronal());
									//this.inicializarActualizarBindingCargo(false,false);
						this.numeropatronalsForeignKey=new ArrayList<NumeroPatronal>();

						if(cargo.getNumeroPatronal()!=null) {
							this.numeropatronalsForeignKey.add(cargo.getNumeroPatronal());
						}

						this.addItemDefectoCombosForeignKeyNumeroPatronal();
						this.cargarCombosFrameNumeroPatronalsForeignKey("Todos");
					}
					this.setActualNumeroPatronalForeignKey(this.cargo.getid_numero_patronal(),false,"Formulario");

					//TipoPago_NM
					if(!this.cargoConstantesFunciones.cargarid_tipo_pago__n_mCargo || this.cargoConstantesFunciones.event_dependid_tipo_pago__n_mCargo) {
						//this.cargarCombosTipoPago_NMsForeignKeyLista(" where id="+this.cargo.getid_tipo_pago__n_m());
									//this.inicializarActualizarBindingCargo(false,false);
						this.tipopago_nmsForeignKey=new ArrayList<TipoPago_NM>();

						if(cargo.getTipoPago_NM()!=null) {
							this.tipopago_nmsForeignKey.add(cargo.getTipoPago_NM());
						}

						this.addItemDefectoCombosForeignKeyTipoPago_NM();
						this.cargarCombosFrameTipoPago_NMsForeignKey("Todos");
					}
					this.setActualTipoPago_NMForeignKey(this.cargo.getid_tipo_pago__n_m(),false,"Formulario");

					//CargoGrupo
					if(!this.cargoConstantesFunciones.cargarid_cargo_grupoCargo || this.cargoConstantesFunciones.event_dependid_cargo_grupoCargo) {
						//this.cargarCombosCargoGruposForeignKeyLista(" where id="+this.cargo.getid_cargo_grupo());
									//this.inicializarActualizarBindingCargo(false,false);
						this.cargogruposForeignKey=new ArrayList<CargoGrupo>();

						if(cargo.getCargoGrupo()!=null) {
							this.cargogruposForeignKey.add(cargo.getCargoGrupo());
						}

						this.addItemDefectoCombosForeignKeyCargoGrupo();
						this.cargarCombosFrameCargoGruposForeignKey("Todos");
					}
					this.setActualCargoGrupoForeignKey(this.cargo.getid_cargo_grupo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCargo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCargo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCargo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargo(Cargo cargo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCargo(cargo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCargo(Cargo cargo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCargo(cargo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCargo(cargo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCargo(cargo);
	}
	
	public void setVariablesObjetoActualToFormularioCargo(Cargo cargo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCargo.jLabelidCargo.setText(cargo.getId().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setText(cargo.getcodigo());
			this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setText(cargo.getnombre());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setText(cargo.getvalor_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setText(cargo.getporcentaje_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setSelected(cargo.getes_jefe());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setSelected(cargo.getes_anual());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setText(cargo.getporcentaje().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setText(cargo.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Cargo cargoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cargoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Cargo cargoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cargoLocal=this.cargo;
			} else {
				cargoLocal=this.cargoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cargoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCargo(cargoLocal,true);
					
					if(cargoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cargoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cargoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cargoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCargo(Cargo cargo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargo(cargo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCargo(cargo);
	}
	
	public void setVariablesFormularioToObjetoActualCargo(Cargo cargo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCargo(cargo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCargo(Cargo cargo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCargo.jLabelidCargo.getText()==null || this.jInternalFrameDetalleFormCargo.jLabelidCargo.getText()=="" || this.jInternalFrameDetalleFormCargo.jLabelidCargo.getText()=="Id") {
				this.jInternalFrameDetalleFormCargo.jLabelidCargo.setText("0");
			}

			if(conColumnasBase) {cargo.setId(Long.parseLong(this.jInternalFrameDetalleFormCargo.jLabelidCargo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelIdCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setcodigo(this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelcodigoCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setnombre(this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelnombreCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setvalor_anticipo(Double.parseDouble(this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_VALORANTICIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelvalor_anticipoCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setporcentaje_anticipo(Double.parseDouble(this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelporcentaje_anticipoCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setes_jefe(this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_ESJEFE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabeles_jefeCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setes_anual(this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_ESANUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabeles_anualCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelporcentajeCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cargo.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CargoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCargo.jLabelvalorCargo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCargo(Cargo cargoBean,Cargo cargo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cargoBean.getid_cargo()!=null && !cargoBean.getid_cargo().equals(-1L))) {cargo.setid_cargo(cargoBean.getid_cargo());}
			if(conDefault || (!conDefault && cargoBean.getid_cuenta_contable()!=null && !cargoBean.getid_cuenta_contable().equals(-1L))) {cargo.setid_cuenta_contable(cargoBean.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoBean.getid_numero_patronal()!=null && !cargoBean.getid_numero_patronal().equals(-1L))) {cargo.setid_numero_patronal(cargoBean.getid_numero_patronal());}
			if(conDefault || (!conDefault && cargoBean.getid_tipo_pago__n_m()!=null && !cargoBean.getid_tipo_pago__n_m().equals(-1L))) {cargo.setid_tipo_pago__n_m(cargoBean.getid_tipo_pago__n_m());}
			if(conDefault || (!conDefault && cargoBean.getid_cargo_grupo()!=null && !cargoBean.getid_cargo_grupo().equals(-1L))) {cargo.setid_cargo_grupo(cargoBean.getid_cargo_grupo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCargo(Cargo cargoOrigen,Cargo cargo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargoOrigen.getId()!=null && !cargoOrigen.getId().equals(0L))) {cargo.setId(cargoOrigen.getId());}}
			if(conDefault || (!conDefault && cargoOrigen.getid_cargo()!=null && !cargoOrigen.getid_cargo().equals(-1L))) {cargo.setid_cargo(cargoOrigen.getid_cargo());}
			if(conDefault || (!conDefault && cargoOrigen.getid_cuenta_contable()!=null && !cargoOrigen.getid_cuenta_contable().equals(-1L))) {cargo.setid_cuenta_contable(cargoOrigen.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoOrigen.getid_numero_patronal()!=null && !cargoOrigen.getid_numero_patronal().equals(-1L))) {cargo.setid_numero_patronal(cargoOrigen.getid_numero_patronal());}
			if(conDefault || (!conDefault && cargoOrigen.getid_tipo_pago__n_m()!=null && !cargoOrigen.getid_tipo_pago__n_m().equals(-1L))) {cargo.setid_tipo_pago__n_m(cargoOrigen.getid_tipo_pago__n_m());}
			if(conDefault || (!conDefault && cargoOrigen.getid_cargo_grupo()!=null && !cargoOrigen.getid_cargo_grupo().equals(-1L))) {cargo.setid_cargo_grupo(cargoOrigen.getid_cargo_grupo());}
			if(conDefault || (!conDefault && cargoOrigen.getcodigo()!=null && !cargoOrigen.getcodigo().equals(""))) {cargo.setcodigo(cargoOrigen.getcodigo());}
			if(conDefault || (!conDefault && cargoOrigen.getnombre()!=null && !cargoOrigen.getnombre().equals(""))) {cargo.setnombre(cargoOrigen.getnombre());}
			if(conDefault || (!conDefault && cargoOrigen.getvalor_anticipo()!=null && !cargoOrigen.getvalor_anticipo().equals(0.0))) {cargo.setvalor_anticipo(cargoOrigen.getvalor_anticipo());}
			if(conDefault || (!conDefault && cargoOrigen.getporcentaje_anticipo()!=null && !cargoOrigen.getporcentaje_anticipo().equals(0.0))) {cargo.setporcentaje_anticipo(cargoOrigen.getporcentaje_anticipo());}
			if(conDefault || (!conDefault && cargoOrigen.getes_jefe()!=null && !cargoOrigen.getes_jefe().equals(false))) {cargo.setes_jefe(cargoOrigen.getes_jefe());}
			if(conDefault || (!conDefault && cargoOrigen.getes_anual()!=null && !cargoOrigen.getes_anual().equals(false))) {cargo.setes_anual(cargoOrigen.getes_anual());}
			if(conDefault || (!conDefault && cargoOrigen.getporcentaje()!=null && !cargoOrigen.getporcentaje().equals(0.0))) {cargo.setporcentaje(cargoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && cargoOrigen.getvalor()!=null && !cargoOrigen.getvalor().equals(0.0))) {cargo.setvalor(cargoOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargo(Cargo cargo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargo.jLabelidCargo.setText(cargo.getId().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setText(cargo.getcodigo());
			this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setText(cargo.getnombre());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setText(cargo.getvalor_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setText(cargo.getporcentaje_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setSelected(cargo.getes_jefe());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setSelected(cargo.getes_anual());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setText(cargo.getporcentaje().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setText(cargo.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCargo(CargoBean cargoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCargo.jLabelidCargo.setText(cargoBean.getId().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setText(cargoBean.getcodigo());
			this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setText(cargoBean.getnombre());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setText(cargoBean.getvalor_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setText(cargoBean.getporcentaje_anticipo().toString());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setSelected(cargoBean.getes_jefe());
			this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setSelected(cargoBean.getes_anual());
			this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setText(cargoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setText(cargoBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCargo(CargoParameterReturnGeneral cargoReturnGeneral,CargoBean cargoBean,Boolean conDefault) throws Exception { 
		try {
			Cargo cargoLocal=new Cargo();
			
			cargoLocal=cargoReturnGeneral.getCargo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cargoLocal.getId()!=null && !cargoLocal.getId().equals(0L))) {cargoBean.setId(cargoLocal.getId());}}
			if(conDefault || (!conDefault && cargoLocal.getid_cargo()!=null && !cargoLocal.getid_cargo().equals(-1L))) {cargoBean.setid_cargo(cargoLocal.getid_cargo());}
			if(conDefault || (!conDefault && cargoLocal.getid_cuenta_contable()!=null && !cargoLocal.getid_cuenta_contable().equals(-1L))) {cargoBean.setid_cuenta_contable(cargoLocal.getid_cuenta_contable());}
			if(conDefault || (!conDefault && cargoLocal.getid_numero_patronal()!=null && !cargoLocal.getid_numero_patronal().equals(-1L))) {cargoBean.setid_numero_patronal(cargoLocal.getid_numero_patronal());}
			if(conDefault || (!conDefault && cargoLocal.getid_tipo_pago__n_m()!=null && !cargoLocal.getid_tipo_pago__n_m().equals(-1L))) {cargoBean.setid_tipo_pago__n_m(cargoLocal.getid_tipo_pago__n_m());}
			if(conDefault || (!conDefault && cargoLocal.getid_cargo_grupo()!=null && !cargoLocal.getid_cargo_grupo().equals(-1L))) {cargoBean.setid_cargo_grupo(cargoLocal.getid_cargo_grupo());}
			if(conDefault || (!conDefault && cargoLocal.getcodigo()!=null && !cargoLocal.getcodigo().equals(""))) {cargoBean.setcodigo(cargoLocal.getcodigo());}
			if(conDefault || (!conDefault && cargoLocal.getnombre()!=null && !cargoLocal.getnombre().equals(""))) {cargoBean.setnombre(cargoLocal.getnombre());}
			if(conDefault || (!conDefault && cargoLocal.getvalor_anticipo()!=null && !cargoLocal.getvalor_anticipo().equals(0.0))) {cargoBean.setvalor_anticipo(cargoLocal.getvalor_anticipo());}
			if(conDefault || (!conDefault && cargoLocal.getporcentaje_anticipo()!=null && !cargoLocal.getporcentaje_anticipo().equals(0.0))) {cargoBean.setporcentaje_anticipo(cargoLocal.getporcentaje_anticipo());}
			if(conDefault || (!conDefault && cargoLocal.getes_jefe()!=null && !cargoLocal.getes_jefe().equals(false))) {cargoBean.setes_jefe(cargoLocal.getes_jefe());}
			if(conDefault || (!conDefault && cargoLocal.getes_anual()!=null && !cargoLocal.getes_anual().equals(false))) {cargoBean.setes_anual(cargoLocal.getes_anual());}
			if(conDefault || (!conDefault && cargoLocal.getporcentaje()!=null && !cargoLocal.getporcentaje().equals(0.0))) {cargoBean.setporcentaje(cargoLocal.getporcentaje());}
			if(conDefault || (!conDefault && cargoLocal.getvalor()!=null && !cargoLocal.getvalor().equals(0.0))) {cargoBean.setvalor(cargoLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCargoGenerico(Long idCargoSeleccionado,JComboBox jComboBoxCargo,List<Cargo> cargosLocal)throws Exception {
		try {
			Cargo  cargoTemp=null;

			for(Cargo cargoAux:cargosLocal) {
				if(cargoAux.getId()!=null && cargoAux.getId().equals(idCargoSeleccionado)) {
					cargoTemp=cargoAux;
					break;
				}
			}

			jComboBoxCargo.setSelectedItem(cargoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCargoGenerico(JComboBox jComboBoxCargo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCargo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCargo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCargo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
				//AUTOREFERENCIADA
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
				
				jComboBoxCargo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCargo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Arbol"));			
				//AUTOREFERENCIADA
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		if(sTipo.equals("AsistenciaMensual")) {
			jButtonAsistenciaMensualActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("EmpleadoEstructura")) {
			jButtonEmpleadoEstructuraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Empleado")) {
			jButtonEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cargo")) {
			jButtonCargoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargo=(Cargo) cargoLogic.getCargos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargo =(Cargo) cargos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Cargo")) {
			//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.getcargo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.getcargo_descripcion();
			}
		}

		if(sTipo.equals("CuentaContable")) {
			//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.getcuentacontable_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.getcuentacontable_descripcion();
			}
		}

		if(sTipo.equals("NumeroPatronal")) {
			//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.getnumeropatronal_descripcion();
			} else {
				//sDescripcion=this.getActualNumeroPatronalForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.getnumeropatronal_descripcion();
			}
		}

		if(sTipo.equals("TipoPago_NM")) {
			//sDescripcion=this.getActualTipoPago_NMForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.gettipopago_nm_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPago_NMForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.gettipopago_nm_descripcion();
			}
		}

		if(sTipo.equals("CargoGrupo")) {
			//sDescripcion=this.getActualCargoGrupoForeignKeyDescripcion((Long)value);
			if(!cargo.getIsNew() && !cargo.getIsChanged() && !cargo.getIsDeleted()) {
				sDescripcion=cargo.getcargogrupo_descripcion();
			} else {
				//sDescripcion=this.getActualCargoGrupoForeignKeyDescripcion((Long)value);
				sDescripcion=cargo.getcargogrupo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Cargo cargoRow=new Cargo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargoRow=(Cargo) cargoLogic.getCargos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cargoRow=(Cargo) cargos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAsistenciaMensualActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Cargo cargo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCargo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo = (Cargo)this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cargo = (Cargo)this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cargo!=null) {
						this.cargo = cargo;
					} else {
						this.cargo = new Cargo();
					}
				}

				if(this.isTienePermisosAsistenciaMensual && this.permiteMantenimiento(this.cargo)) {
					AsistenciaMensualBeanSwingJInternalFrame asistenciamensualBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup=new AsistenciaMensualBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						asistenciamensualBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup;
					} else {
						asistenciamensualBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame;
					}

					List<Cargo> cargos=new ArrayList<Cargo>();
					cargos.add(this.cargo);
					if(!esRelacionado) {
						//asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setConGuardarRelaciones(false);
						//asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					asistenciamensualBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCargo.cargarAsistenciaMensualBeanSwingJInternalFrame(cargos,this.cargo,asistenciamensualBeanSwingJInternalFrame,/*conInicializar,*/asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.getConGuardarRelaciones(),asistenciamensualBeanSwingJInternalFrame.asistenciamensualSessionBean.getEsGuardarRelacionado());
					asistenciamensualBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						asistenciamensualBeanSwingJInternalFrame.actualizarEstadoPanelsAsistenciaMensual("no_relacionado");

						asistenciamensualBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AsistenciaMensualConstantesFunciones.ITAMANIOFILATABLA + (AsistenciaMensualConstantesFunciones.ITAMANIOFILATABLA/2));

						asistenciamensualBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
						TitledBorder titledBorderAsistenciaMensual=(TitledBorder)asistenciamensualBeanSwingJInternalFrame.jScrollPanelDatosAsistenciaMensual.getBorder();

						titledBorderAsistenciaMensual.setTitle(titledBorderCargo.getTitle() + " -> Asistencia Mensual");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,asistenciamensualBeanSwingJInternalFrame);
						}

						asistenciamensualBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(asistenciamensualBeanSwingJInternalFrame);

						asistenciamensualBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cargoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Asistencia Mensual",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoEstructuraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Cargo cargo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCargo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo = (Cargo)this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cargo = (Cargo)this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cargo!=null) {
						this.cargo = cargo;
					} else {
						this.cargo = new Cargo();
					}
				}

				if(this.isTienePermisosEmpleadoEstructura && this.permiteMantenimiento(this.cargo)) {
					EmpleadoEstructuraBeanSwingJInternalFrame empleadoestructuraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup=new EmpleadoEstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoestructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup;
					} else {
						empleadoestructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame;
					}

					List<Cargo> cargos=new ArrayList<Cargo>();
					cargos.add(this.cargo);
					if(!esRelacionado) {
						//empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setConGuardarRelaciones(false);
						//empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoestructuraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCargo.cargarEmpleadoEstructuraBeanSwingJInternalFrame(cargos,this.cargo,empleadoestructuraBeanSwingJInternalFrame,/*conInicializar,*/empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.getConGuardarRelaciones(),empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraSessionBean.getEsGuardarRelacionado());
					empleadoestructuraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoestructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoEstructura("no_relacionado");

						empleadoestructuraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoEstructuraConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoEstructuraConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoestructuraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
						TitledBorder titledBorderEmpleadoEstructura=(TitledBorder)empleadoestructuraBeanSwingJInternalFrame.jScrollPanelDatosEmpleadoEstructura.getBorder();

						titledBorderEmpleadoEstructura.setTitle(titledBorderCargo.getTitle() + " -> Empleado Estructura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoestructuraBeanSwingJInternalFrame);
						}

						empleadoestructuraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoestructuraBeanSwingJInternalFrame);

						empleadoestructuraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cargoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado Estructura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Cargo cargo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCargo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo = (Cargo)this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cargo = (Cargo)this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cargo!=null) {
						this.cargo = cargo;
					} else {
						this.cargo = new Cargo();
					}
				}

				if(this.isTienePermisosEmpleado && this.permiteMantenimiento(this.cargo)) {
					EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup;
					} else {
						empleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame;
					}

					List<Cargo> cargos=new ArrayList<Cargo>();
					cargos.add(this.cargo);
					if(!esRelacionado) {
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setConGuardarRelaciones(false);
						//empleadoBeanSwingJInternalFrame.empleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCargo.cargarEmpleadoBeanSwingJInternalFrame(cargos,this.cargo,empleadoBeanSwingJInternalFrame,/*conInicializar,*/empleadoBeanSwingJInternalFrame.empleadoSessionBean.getConGuardarRelaciones(),empleadoBeanSwingJInternalFrame.empleadoSessionBean.getEsGuardarRelacionado());
					empleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");

						empleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EmpleadoConstantesFunciones.ITAMANIOFILATABLA + (EmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						empleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
						TitledBorder titledBorderEmpleado=(TitledBorder)empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

						titledBorderEmpleado.setTitle(titledBorderCargo.getTitle() + " -> Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,empleadoBeanSwingJInternalFrame);
						}

						empleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(empleadoBeanSwingJInternalFrame);

						empleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cargoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Cargo cargo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCargo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo = (Cargo)this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.cargo = (Cargo)this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(cargo!=null) {
						this.cargo = cargo;
					} else {
						this.cargo = new Cargo();
					}
				}

				if(this.isTienePermisosCargo && this.permiteMantenimiento(this.cargo)) {
					CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup;
					} else {
						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame;
					}

					List<Cargo> cargos=new ArrayList<Cargo>();
					cargos.add(this.cargo);
					if(!esRelacionado) {
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setConGuardarRelaciones(false);
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCargo.cargarCargoBeanSwingJInternalFrame(cargos,this.cargo,cargoBeanSwingJInternalFrame,/*conInicializar,*/cargoBeanSwingJInternalFrame.cargoSessionBean.getConGuardarRelaciones(),cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado());
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");

						cargoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargoConstantesFunciones.ITAMANIOFILATABLA + (CargoConstantesFunciones.ITAMANIOFILATABLA/2));

						cargoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
						titledBorderCargo.setTitle(titledBorderCargo.getTitle() + " -> Cargo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargoBeanSwingJInternalFrame);
						}

						cargoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargoBeanSwingJInternalFrame);

						cargoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.cargoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cargo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCargo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo));			
			this.jButtonDuplicarCargo.setVisible((this.isVisibilidadCeldaDuplicarCargo && this.isPermisoDuplicarCargo));			
			this.jButtonCopiarCargo.setVisible((this.isVisibilidadCeldaCopiarCargo && this.isPermisoCopiarCargo));
			this.jButtonVerFormCargo.setVisible((this.isVisibilidadCeldaVerFormCargo && this.isPermisoVerFormCargo));
			
			this.jButtonAbrirOrderByCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));			
			
			this.jButtonNuevoRelacionesCargo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargo && this.isPermisoNuevoCargo));			
			this.jButtonNuevoGuardarCambiosCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo && this.isPermisoGuardarCambiosCargo));
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.jInternalFrameDetalleFormCargo.jButtonModificarCargo.setVisible((this.isVisibilidadCeldaModificarCargo && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.setVisible((this.isVisibilidadCeldaActualizarCargo && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.setVisible((this.isVisibilidadCeldaEliminarCargo && this.isPermisoEliminarCargo));
			this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.setVisible(this.isVisibilidadCeldaCancelarCargo);							
			this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.setVisible((this.isVisibilidadCeldaGuardarCargo && this.isPermisoGuardarCambiosCargo));			
			
			}
						
			this.jButtonGuardarCambiosTablaCargo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargo && this.isPermisoGuardarCambiosCargo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo));						
			this.jButtonDuplicarToolBarCargo.setVisible((this.isVisibilidadCeldaDuplicarCargo && this.isPermisoDuplicarCargo));						
			this.jButtonCopiarToolBarCargo.setVisible((this.isVisibilidadCeldaCopiarCargo && this.isPermisoCopiarCargo));			
			this.jButtonVerFormToolBarCargo.setVisible((this.isVisibilidadCeldaVerFormCargo && this.isPermisoVerFormCargo));			
			this.jButtonAbrirOrderByToolBarCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));
			this.jButtonNuevoRelacionesToolBarCargo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargo && this.isPermisoNuevoCargo));			
			this.jButtonNuevoGuardarCambiosToolBarCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo && this.isPermisoGuardarCambiosCargo));			
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.jInternalFrameDetalleFormCargo.jButtonModificarToolBarCargo.setVisible((this.isVisibilidadCeldaModificarCargo && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jButtonActualizarToolBarCargo.setVisible((this.isVisibilidadCeldaActualizarCargo  && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jButtonEliminarToolBarCargo.setVisible((this.isVisibilidadCeldaEliminarCargo && this.isPermisoEliminarCargo));
			this.jInternalFrameDetalleFormCargo.jButtonCancelarToolBarCargo.setVisible(this.isVisibilidadCeldaCancelarCargo);				
			this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosToolBarCargo.setVisible((this.isVisibilidadCeldaGuardarCargo && this.isPermisoGuardarCambiosCargo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCargo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargo && this.isPermisoGuardarCambiosCargo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo));			
			this.jMenuItemDuplicarCargo.setVisible((this.isVisibilidadCeldaDuplicarCargo && this.isPermisoDuplicarCargo));			
			this.jMenuItemCopiarCargo.setVisible((this.isVisibilidadCeldaCopiarCargo && this.isPermisoCopiarCargo));			
			this.jMenuItemVerFormCargo.setVisible((this.isVisibilidadCeldaVerFormCargo && this.isPermisoVerFormCargo));			
			this.jMenuItemAbrirOrderByCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));			
			//this.jMenuItemMostrarOcultarCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));
			this.jMenuItemDetalleAbrirOrderByCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));			
			//this.jMenuItemDetalleMostrarOcultarCargo.setVisible((this.isVisibilidadCeldaOrdenCargo && this.isPermisoOrdenCargo));			
			this.jMenuItemNuevoRelacionesCargo.setVisible((this.isVisibilidadCeldaNuevoRelacionesCargo && this.isPermisoNuevoCargo));			
			this.jMenuItemNuevoGuardarCambiosCargo.setVisible((this.isVisibilidadCeldaNuevoCargo && this.isPermisoNuevoCargo && this.isPermisoGuardarCambiosCargo));									
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.jInternalFrameDetalleFormCargo.jMenuItemModificarCargo.setVisible((this.isVisibilidadCeldaModificarCargo && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jMenuItemActualizarCargo.setVisible((this.isVisibilidadCeldaActualizarCargo && this.isPermisoActualizarCargo));	
			this.jInternalFrameDetalleFormCargo.jMenuItemEliminarCargo.setVisible((this.isVisibilidadCeldaEliminarCargo && this.isPermisoEliminarCargo));
			this.jInternalFrameDetalleFormCargo.jMenuItemCancelarCargo.setVisible(this.isVisibilidadCeldaCancelarCargo);				
			}
			
			this.jMenuItemGuardarCambiosCargo.setVisible((this.isVisibilidadCeldaGuardarCargo && this.isPermisoGuardarCambiosCargo));						
			this.jMenuItemGuardarCambiosTablaCargo.setVisible((this.isVisibilidadCeldaGuardarCambiosCargo && this.isPermisoGuardarCambiosCargo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCargo=this.jButtonNuevoCargo.isVisible();
			this.isVisibilidadCeldaDuplicarCargo=this.jButtonDuplicarCargo.isVisible();
			this.isVisibilidadCeldaCopiarCargo=this.jButtonCopiarCargo.isVisible();
			this.isVisibilidadCeldaVerFormCargo=this.jButtonVerFormCargo.isVisible();
			
			this.isVisibilidadCeldaOrdenCargo=this.jButtonAbrirOrderByCargo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCargo=this.jButtonNuevoRelacionesCargo.isVisible();
			this.isVisibilidadCeldaModificarCargo=this.jButtonModificarCargo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.isVisibilidadCeldaActualizarCargo=this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.isVisible();
			this.isVisibilidadCeldaEliminarCargo=this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.isVisible();
			this.isVisibilidadCeldaCancelarCargo=this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.isVisible();
			this.isVisibilidadCeldaGuardarCargo=this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCargo=this.jButtonGuardarCambiosTablaCargo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCargo=this.jButtonNuevoToolBarCargo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargo=this.jButtonNuevoRelacionesToolBarCargo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.isVisibilidadCeldaModificarCargo=this.jInternalFrameDetalleFormCargo.jButtonModificarToolBarCargo.isVisible();
			this.isVisibilidadCeldaActualizarCargo=this.jInternalFrameDetalleFormCargo.jButtonActualizarToolBarCargo.isVisible();
			this.isVisibilidadCeldaEliminarCargo=this.jInternalFrameDetalleFormCargo.jButtonEliminarToolBarCargo.isVisible();
			this.isVisibilidadCeldaCancelarCargo=this.jInternalFrameDetalleFormCargo.jButtonCancelarToolBarCargo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargo=this.jButtonGuardarCambiosToolBarCargo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargo=this.jButtonGuardarCambiosTablaToolBarCargo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCargo=this.jMenuItemNuevoCargo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCargo=this.jMenuItemNuevoRelacionesCargo.isVisible();
			
			if(this.jInternalFrameDetalleFormCargo!=null) {
			this.isVisibilidadCeldaModificarCargo=this.jInternalFrameDetalleFormCargo.jMenuItemModificarCargo.isVisible();
			this.isVisibilidadCeldaActualizarCargo=this.jInternalFrameDetalleFormCargo.jMenuItemActualizarCargo.isVisible();
			this.isVisibilidadCeldaEliminarCargo=this.jInternalFrameDetalleFormCargo.jMenuItemEliminarCargo.isVisible();
			this.isVisibilidadCeldaCancelarCargo=this.jInternalFrameDetalleFormCargo.jMenuItemCancelarCargo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCargo=this.jMenuItemGuardarCambiosCargo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCargo=this.jMenuItemGuardarCambiosTablaCargo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCargo(Boolean esInicializar) {
		if(CargoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cargoSessionBean.getConGuardarRelaciones()) {
				//if(this.cargoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCargo();
			}
			
			this.inicializarActualizarBindingBotonesManualCargo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCargo() {
		this.jButtonNuevoCargo.setVisible(this.isPermisoNuevoCargo);			
		this.jButtonDuplicarCargo.setVisible(this.isPermisoDuplicarCargo);			
		this.jButtonCopiarCargo.setVisible(this.isPermisoCopiarCargo);			
		this.jButtonVerFormCargo.setVisible(this.isPermisoVerFormCargo);			
		
		this.jButtonAbrirOrderByCargo.setVisible(this.isPermisoOrdenCargo);					
		
		this.jButtonNuevoRelacionesCargo.setVisible(this.isPermisoNuevoCargo);			
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonModificarCargo.setVisible(this.isPermisoActualizarCargo);	
			this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.setVisible(this.isPermisoActualizarCargo);	
			this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.setVisible(this.isPermisoEliminarCargo);
			this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.setVisible(this.isVisibilidadCeldaCancelarCargo);						
			this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.setVisible(this.isPermisoGuardarCambiosCargo);							
		}
		
		this.jButtonGuardarCambiosTablaCargo.setVisible(this.isPermisoActualizarCargo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCargo() {
		this.jInternalFrameDetalleFormCargo.jButtonModificarCargo.setVisible(this.isPermisoActualizarCargo);	
		this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.setVisible(this.isPermisoActualizarCargo);	
		this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.setVisible(this.isPermisoEliminarCargo);
		this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.setVisible(this.isVisibilidadCeldaCancelarCargo);							
		this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.setVisible((this.isVisibilidadCeldaGuardarCargo && this.isPermisoGuardarCambiosCargo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCargo() {
		if(CargoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCargo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCargo() {
	}
	
	public void jTableDatosCargoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCargo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cargo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCargo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cargo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCargo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cargo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargoCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargo=true;

			idTienePermisocargo=this.tienePermisosUsuarioEnPaginaWebCargo(CargoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.cargoBeanSwingJInternalFrame=new CargoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargoBeanSwingJInternalFrame.getCargoLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_cargo()!=null) {
					this.cargoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargoBeanSwingJInternalFrame.setIdActual(this.cargo.getid_cargo());
					this.cargoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo();
				}

				JInternalFrameBase jinternalFrame =this.cargoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBordercargo=(TitledBorder)this.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

				titledBordercargo.setTitle(titledBorderCargo.getTitle() + " -> Cargo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargoCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_cargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo = "+this.cargo.getid_cargo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contableCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontable=true;

			idTienePermisocuentacontable=this.tienePermisosUsuarioEnPaginaWebCargo(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontableBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_cuenta_contable()!=null) {
					this.cuentacontableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontableBeanSwingJInternalFrame.setIdActual(this.cargo.getid_cuenta_contable());
					this.cuentacontableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontableBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBordercuentacontable=(TitledBorder)this.cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontable.setTitle(titledBorderCargo.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contableCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_cuenta_contable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable = "+this.cargo.getid_cuenta_contable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_numero_patronalCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisonumeropatronal=true;

			idTienePermisonumeropatronal=this.tienePermisosUsuarioEnPaginaWebCargo(NumeroPatronalConstantesFunciones.CLASSNAME);

			if(idTienePermisonumeropatronal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.numeropatronalBeanSwingJInternalFrame=new NumeroPatronalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.numeropatronalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.numeropatronalBeanSwingJInternalFrame.getNumeroPatronalLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_numero_patronal()!=null) {
					this.numeropatronalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.numeropatronalBeanSwingJInternalFrame.setIdActual(this.cargo.getid_numero_patronal());
					this.numeropatronalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.numeropatronalBeanSwingJInternalFrame.inicializarActualizarBindingTablaNumeroPatronal();
				}

				JInternalFrameBase jinternalFrame =this.numeropatronalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBordernumeropatronal=(TitledBorder)this.numeropatronalBeanSwingJInternalFrame.jScrollPanelDatosNumeroPatronal.getBorder();

				titledBordernumeropatronal.setTitle(titledBorderCargo.getTitle() + " -> Numero Patronal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_numero_patronalCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_numero_patronal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_numero_patronal = "+this.cargo.getid_numero_patronal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_pago__n_mCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipopago_nm=true;

			idTienePermisotipopago_nm=this.tienePermisosUsuarioEnPaginaWebCargo(TipoPago_NMConstantesFunciones.CLASSNAME);

			if(idTienePermisotipopago_nm) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.tipopago_nmBeanSwingJInternalFrame=new TipoPago_NMBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipopago_nmBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipopago_nmBeanSwingJInternalFrame.getTipoPago_NMLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_tipo_pago__n_m()!=null) {
					this.tipopago_nmBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipopago_nmBeanSwingJInternalFrame.setIdActual(this.cargo.getid_tipo_pago__n_m());
					this.tipopago_nmBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipopago_nmBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipopago_nmBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPago_NM();
				}

				JInternalFrameBase jinternalFrame =this.tipopago_nmBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBordertipopago_nm=(TitledBorder)this.tipopago_nmBeanSwingJInternalFrame.jScrollPanelDatosTipoPago_NM.getBorder();

				titledBordertipopago_nm.setTitle(titledBorderCargo.getTitle() + " -> Tipo Pago_ N M");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_pago__n_mCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_tipo_pago__n_m()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_pago__n_m = "+this.cargo.getid_tipo_pago__n_m().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cargo_grupoCargoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocargogrupo=true;

			idTienePermisocargogrupo=this.tienePermisosUsuarioEnPaginaWebCargo(CargoGrupoConstantesFunciones.CLASSNAME);

			if(idTienePermisocargogrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCargo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCargo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);

				this.cargogrupoBeanSwingJInternalFrame=new CargoGrupoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cargogrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cargogrupoBeanSwingJInternalFrame.getCargoGrupoLogic().setConnexion(this.cargoLogic.getConnexion());

				if(this.cargo.getid_cargo_grupo()!=null) {
					this.cargogrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cargogrupoBeanSwingJInternalFrame.setIdActual(this.cargo.getid_cargo_grupo());
					this.cargogrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cargogrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cargogrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargoGrupo();
				}

				JInternalFrameBase jinternalFrame =this.cargogrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCargo=(TitledBorder)this.jScrollPanelDatosCargo.getBorder();
				TitledBorder titledBordercargogrupo=(TitledBorder)this.cargogrupoBeanSwingJInternalFrame.jScrollPanelDatosCargoGrupo.getBorder();

				titledBordercargogrupo.setTitle(titledBorderCargo.getTitle() + " -> Cargo Grupo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cargo_grupoCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getid_cargo_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cargo_grupo = "+this.cargo.getid_cargo_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cargo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cargo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_anticipoCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getvalor_anticipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_anticipo = "+this.cargo.getvalor_anticipo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_anticipoCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getporcentaje_anticipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_anticipo = "+this.cargo.getporcentaje_anticipo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_jefeCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getes_jefe()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_jefe = "+this.cargo.getes_jefe().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_anualCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getes_anual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_anual = "+this.cargo.getes_anual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.cargo.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCargoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCargo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCargo(this.getcargo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cargo==null) {
						this.cargo = new Cargo();
					}

					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);
				}

				if(this.cargo.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.cargo.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCargo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCargoCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdCargo();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCargoGrupoCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdCargoGrupo();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdCuentaContable();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdEmpresa();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdNumeroPatronalCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdNumeroPatronal();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPago_NMCargoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCargo(false,false);

			this.getCargosFK_IdTipoPago_NM();

			this.inicializarActualizarBindingCargo(false);

			//if(CargoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCargo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cargoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCargo() {
		if(this.jInternalFrameDetalleFormCargo!=null) {
		

		if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
			this.jInternalFrameDetalleFormCargo.setVisible(false);	    			
			this.jInternalFrameDetalleFormCargo.dispose();
			this.jInternalFrameDetalleFormCargo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCargo!=null) {
			this.jInternalFrameReporteDinamicoCargo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCargo.dispose();
			this.jInternalFrameReporteDinamicoCargo=null;
		}
		
		if(this.jInternalFrameImportacionCargo!=null) {
			this.jInternalFrameImportacionCargo.setVisible(false);	    			
			this.jInternalFrameImportacionCargo.dispose();
			this.jInternalFrameImportacionCargo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	public void closingTreeFrameCargo() {
		
		if(this.jInternalFrameTreeCargo!=null) {
			this.jInternalFrameTreeCargo.setVisible(false);	    			
			this.jInternalFrameTreeCargo.dispose();
			this.jInternalFrameTreeCargo=null;
		}
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCargo();
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			
			if(sTipo.equals("NuevoCargo")) {
				jButtonNuevoCargoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCargo")) {
				jButtonDuplicarCargoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCargo")) {
				jButtonCopiarCargoActionPerformed(evt);
			} else if(sTipo.equals("VerFormCargo")) {
				jButtonVerFormCargoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCargo")) {
				jButtonNuevoCargoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCargo")) {
				jButtonDuplicarCargoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCargo")) {
				jButtonNuevoCargoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCargo")) {
				jButtonDuplicarCargoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCargo")) {
				jButtonNuevoCargoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCargo")) {
				jButtonNuevoCargoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCargo")) {
				jButtonNuevoCargoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCargo")) {
				jButtonModificarCargoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCargo")) {
				jButtonModificarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCargo")) {
				jButtonModificarCargoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCargo")) {
				jButtonActualizarCargoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCargo")) {
				jButtonActualizarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCargo")) {
				jButtonActualizarCargoActionPerformed(evt);
			} else if(sTipo.equals("EliminarCargo")) {
				jButtonEliminarCargoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCargo")) {
				jButtonEliminarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCargo")) {
				jButtonEliminarCargoActionPerformed(evt);
			} else if(sTipo.equals("CancelarCargo")) {
				jButtonCancelarCargoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCargo")) {
				jButtonCancelarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCargo")) {
				jButtonCancelarCargoActionPerformed(evt);
			} else if(sTipo.equals("CerrarCargo")) {
				jButtonCerrarCargoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCargo")) {
				jButtonCerrarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCargo")) {
				jButtonCerrarCargoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCargo")) {
				jButtonMostrarOcultarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCargo")) {
				jButtonCancelarCargoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCargo")) {
				jButtonCopiarCargoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCargo")) {
				jButtonVerFormCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCargo")) {
				jButtonCopiarCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCargo")) {
				jButtonVerFormCargoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCargo")) {
				jButtonRecargarInformacionCargoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCargo")) {
				jButtonRecargarInformacionCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCargo")) {
				jButtonRecargarInformacionCargoActionPerformed(evt);
			}
			else if(sTipo.equals("ArbolCargo")) {
				jButtonArbolCargoActionPerformed(evt);
			} 
			else if(sTipo.equals("AnterioresCargo")) {
				jButtonAnterioresCargoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCargo")) {
				jButtonAnterioresCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCargo")) {
				jButtonAnterioresCargoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCargo")) {
				jButtonSiguientesCargoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCargo")) {
				jButtonSiguientesCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCargo")) {
				jButtonSiguientesCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCargo") || sTipo.equals("MenuItemDetalleAbrirOrderByCargo")) {
				jButtonAbrirOrderByCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCargo") || sTipo.equals("MenuItemDetalleMostrarOcultarCargo")) {
				jButtonMostrarOcultarCargoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCargo")) {
				jButtonNuevoGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCargo")) {
				jButtonNuevoGuardarCambiosCargoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCargo")) {
				jButtonNuevoGuardarCambiosCargoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCargo")) {
				jButtonCerrarReporteDinamicoCargoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCargo")) {
				jButtonGenerarReporteDinamicoCargoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCargo")) {
				
				jButtonGenerarExcelReporteDinamicoCargoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCargo")) {
				jButtonCerrarImportacionCargoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCargo")) {
				
				jButtonGenerarImportacionCargoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCargo")) {
				
				jButtonAbrirImportacionCargoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCargo")) {
				jComboBoxTiposAccionesCargoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCargo")) {
				jComboBoxTiposRelacionesCargoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCargo")) {
				jComboBoxTiposAccionesCargoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCargo")) {
				
				jComboBoxTiposSeleccionarCargoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCargo")) {
				jTextFieldValorCampoGeneralCargoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCargo")) {
				jButtonAbrirOrderByCargoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCargo")) {
				jButtonAbrirOrderByCargoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCargo")) {
				jButtonCerrarOrderByCargoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoBusqueda")) {
				this.jButtonidCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoUpdate")) {
				this.jButtonid_empresaCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoBusqueda")) {
				this.jButtonid_empresaCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCargoUpdate")) {
				this.jButtonid_cargoCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCargoBusqueda")) {
				this.jButtonid_cargoCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoUpdate")) {
				this.jButtonid_cuenta_contableCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoBusqueda")) {
				this.jButtonid_cuenta_contableCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalCargoUpdate")) {
				this.jButtonid_numero_patronalCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalCargoBusqueda")) {
				this.jButtonid_numero_patronalCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_pago__n_mCargoUpdate")) {
				this.jButtonid_tipo_pago__n_mCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_pago__n_mCargoBusqueda")) {
				this.jButtonid_tipo_pago__n_mCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargo_grupoCargoUpdate")) {
				this.jButtonid_cargo_grupoCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargo_grupoCargoBusqueda")) {
				this.jButtonid_cargo_grupoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCargoBusqueda")) {
				this.jButtoncodigoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargoBusqueda")) {
				this.jButtonnombreCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_anticipoCargoBusqueda")) {
				this.jButtonvalor_anticipoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_anticipoCargoBusqueda")) {
				this.jButtonporcentaje_anticipoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_jefeCargoBusqueda")) {
				this.jButtones_jefeCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_anualCargoBusqueda")) {
				this.jButtones_anualCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCargoBusqueda")) {
				this.jButtonporcentajeCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCargoBusqueda")) {
				this.jButtonvalorCargoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCargoCargo")) {
				this.jButtonFK_IdCargoCargoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCargoGrupoCargo")) {
				this.jButtonFK_IdCargoGrupoCargoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCargo")) {
				this.jButtonFK_IdCuentaContableCargoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdNumeroPatronalCargo")) {
				this.jButtonFK_IdNumeroPatronalCargoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPago_NMCargo")) {
				this.jButtonFK_IdTipoPago_NMCargoActionPerformed(evt);
			}
			
			;
			
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCargo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Cargo cargoLocal=null;
			
			if(!this.getEsControlTabla()) {
				cargoLocal=this.cargo;
			} else {
				cargoLocal=this.cargoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
							
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
								
						
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
								
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
							
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
								
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCargo")) {
					jCheckBoxSeleccionarTodosCargoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCargo")) {
					jCheckBoxSeleccionadosCargoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCargo")) {
					
				}
				
				


				
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
												
				
				


				
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCargoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cargo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cargo);
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Cargo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Cargo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCargoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cargoAnterior =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cargoAnterior =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCargo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCargoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCargo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cargo =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cargo =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cargo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCargo")) {
				
				}
				
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCargo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCargo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCargo")) {
			
			}
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCargo();
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			if(sTipo.equals("NuevoCargo")) {
				jButtonNuevoCargoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCargo")) {
				jButtonDuplicarCargoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCargo")) {
				jButtonCopiarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCargo")) {
				jButtonVerFormCargoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCargo")) {
				jButtonNuevoCargoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCargo")) {
				jButtonModificarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCargo")) {
				jButtonActualizarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCargo")) {
				jButtonEliminarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCargo")) {
				jButtonCancelarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCargo")) {
				jButtonCerrarCargoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCargo")) {
				jButtonGuardarCambiosCargoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCargo")) {
				jButtonNuevoGuardarCambiosCargoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCargo")) {
				jButtonAbrirOrderByCargoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCargo")) {
				jButtonRecargarInformacionCargoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCargo")) {
				jButtonAnterioresCargoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCargo")) {
				jButtonSiguientesCargoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCargoBusqueda")) {
				this.jButtonidCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCargoUpdate")) {
				this.jButtonid_empresaCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCargoBusqueda")) {
				this.jButtonid_empresaCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargoCargoUpdate")) {
				this.jButtonid_cargoCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargoCargoBusqueda")) {
				this.jButtonid_cargoCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoUpdate")) {
				this.jButtonid_cuenta_contableCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contableCargoBusqueda")) {
				this.jButtonid_cuenta_contableCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_numero_patronalCargoUpdate")) {
				this.jButtonid_numero_patronalCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_numero_patronalCargoBusqueda")) {
				this.jButtonid_numero_patronalCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_pago__n_mCargoUpdate")) {
				this.jButtonid_tipo_pago__n_mCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_pago__n_mCargoBusqueda")) {
				this.jButtonid_tipo_pago__n_mCargoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cargo_grupoCargoUpdate")) {
				this.jButtonid_cargo_grupoCargoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cargo_grupoCargoBusqueda")) {
				this.jButtonid_cargo_grupoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCargoBusqueda")) {
				this.jButtoncodigoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCargoBusqueda")) {
				this.jButtonnombreCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_anticipoCargoBusqueda")) {
				this.jButtonvalor_anticipoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_anticipoCargoBusqueda")) {
				this.jButtonporcentaje_anticipoCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_jefeCargoBusqueda")) {
				this.jButtones_jefeCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_anualCargoBusqueda")) {
				this.jButtones_anualCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCargoBusqueda")) {
				this.jButtonporcentajeCargoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCargoBusqueda")) {
				this.jButtonvalorCargoBusquedaActionPerformed(evt);
			}
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCargo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCargo")) {
				closingInternalFrameCargo();
				
			} else if(sTipo.equals("jButtonCancelarCargo")) {
				JInternalFrameBase jInternalFrameDetalleFormCargo = (JInternalFrameBase)evt.getSource();
	            	
	            CargoBeanSwingJInternalFrame jInternalFrameParent=(CargoBeanSwingJInternalFrame)jInternalFrameDetalleFormCargo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCargoActionPerformed(null);
			}
			
			CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cargo,new Object(),this.cargoParameterGeneral,this.cargoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCargo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCargo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCargo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cargo)) {
			if(!esControlTabla) {
				if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);			
				}
				
				if(this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCargo(this.cargo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargoReturnGeneral=cargoLogic.procesarEventosCargosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoLogic.getCargos(),this.cargo,this.cargoParameterGeneral,this.isEsNuevoCargo,classes);//this.cargoLogic.getCargo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCargo(this.cargoReturnGeneral,this.cargoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cargoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCargo(classes,this.cargoReturnGeneral,this.cargoBean,false);
					}
						
					if(this.cargoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCargo(this.cargoReturnGeneral.getCargo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCargo(this.cargoReturnGeneral.getCargo());	
					}
						
					if(this.cargoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCargo(this.cargoReturnGeneral.getCargo(),classes);//this.cargoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCargo(this.cargo,classes);//this.cargoBean);									
				}
			
				if(CargoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCargo(this.cargo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCargo(this.cargo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cargoAnterior!=null) {
						this.cargo=this.cargoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cargoReturnGeneral=cargoLogic.procesarEventosCargosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargoLogic.getCargos(),this.cargo,this.cargoParameterGeneral,this.isEsNuevoCargo,classes);//this.cargoLogic.getCargo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cargoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cargoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cargoReturnGeneral.getCargo(),cargoLogic.getCargos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cargoReturnGeneral.getCargo(),this.cargos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCargo.repaint();
				
				//((AbstractTableModel) this.jTableDatosCargo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCargo();
			}
		}
	}
	
	public void actualizarVisualTableDatosCargo() throws Exception {
		
		CargoModel cargoModel=(CargoModel)this.jTableDatosCargo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cargoModel.cargos=this.cargoLogic.getCargos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cargoModel.cargos=this.cargos;
		}
		
		
		((CargoModel) this.jTableDatosCargo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCargo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcargoAnterior(),this.cargoLogic.getCargos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcargoAnterior(),this.cargos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCargo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCargo(Cargo cargo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AsistenciaMensual.class)) {
					this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.setAsistenciaMensuals(cargo.getAsistenciaMensuals());
					this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaMensual(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEstructura.class)) {
					this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.setEmpleadoEstructuras(cargo.getEmpleadoEstructuras());
					this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(cargo.getEmpleados());
					this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(cargo.getCargos());
					this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargo,new Object(),generalEntityParameterGeneral,this.cargoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cargoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CargoConstantesFunciones.getClassesRelationshipsOfCargo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CargoConstantesFunciones.getClassesRelationshipsFromStringsOfCargo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCargo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CargoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cargo,new Object(),generalEntityParameterGeneral,this.cargoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CargoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCargo(CargoBean cargoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AsistenciaMensual.class)) {
					this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.setAsistenciaMensuals(cargo.getAsistenciaMensuals());
					this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.inicializarActualizarBindingTablaAsistenciaMensual(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEstructura.class)) {
					this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.setEmpleadoEstructuras(cargo.getEmpleadoEstructuras());
					this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.setEmpleados(cargo.getEmpleados());
					this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(cargo.getCargos());
					this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCargo(ArrayList<Classe> classes,CargoReturnGeneral cargoReturnGeneral,CargoBean cargoBean,Boolean conDefault) throws Exception {
		
			this.cargoBean.setAsistenciaMensuals(cargoReturnGeneral.getCargo().getAsistenciaMensuals());
			this.cargoBean.setEmpleadoEstructuras(cargoReturnGeneral.getCargo().getEmpleadoEstructuras());
			this.cargoBean.setEmpleados(cargoReturnGeneral.getCargo().getEmpleados());
			this.cargoBean.setCargos(cargoReturnGeneral.getCargo().getCargos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCargo(Cargo cargo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AsistenciaMensual.class)) {
					cargo.setAsistenciaMensuals(this.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.asistenciamensualLogic.getAsistenciaMensuals());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(EmpleadoEstructura.class)) {
					cargo.setEmpleadoEstructuras(this.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.empleadoestructuraLogic.getEmpleadoEstructuras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Empleado.class)) {
					cargo.setEmpleados(this.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.empleadoLogic.getEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					cargo.setCargos(this.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cargo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCargo = new CargoDetalleFormJInternalFrame(jDesktopPane,this.cargoSessionBean.getConGuardarRelaciones(),this.cargoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCargo);
		this.jInternalFrameDetalleFormCargo.setVisible(false);
		this.jInternalFrameDetalleFormCargo.setSelected(false);						
		
		this.jInternalFrameDetalleFormCargo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCargo.cargoLogic=this.cargoLogic;
		
		this.cargarCombosFrameForeignKeyCargo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCargo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCargo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCargo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCargo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCargo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargo"));
		
		this.jInternalFrameDetalleFormCargo.jButtonModificarCargo.addActionListener(new ButtonActionListener(this,"ModificarCargo"));

		
		this.jInternalFrameDetalleFormCargo.jButtonModificarToolBarCargo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargo"));
					
		this.jInternalFrameDetalleFormCargo.jMenuItemModificarCargo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargo"));		
		
		
		
		this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.addActionListener (new ButtonActionListener(this,"ActualizarCargo"));
		
		
		this.jInternalFrameDetalleFormCargo.jButtonActualizarToolBarCargo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargo"));
						
		this.jInternalFrameDetalleFormCargo.jMenuItemActualizarCargo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargo"));		
		
		
		
		this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.addActionListener (new ButtonActionListener(this,"EliminarCargo"));
		
		
		this.jInternalFrameDetalleFormCargo.jButtonEliminarToolBarCargo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargo"));
								
		this.jInternalFrameDetalleFormCargo.jMenuItemEliminarCargo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargo"));		
		
		
		
		this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.addActionListener (new ButtonActionListener(this,"CancelarCargo"));
		
		
		this.jInternalFrameDetalleFormCargo.jButtonCancelarToolBarCargo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargo"));
					
		this.jInternalFrameDetalleFormCargo.jMenuItemCancelarCargo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCargo.jMenuItemDetalleCerrarCargo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargo"));		
		
		
		
		this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosToolBarCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargo"));
		
		
		
		this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosToolBarCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargo"));
		
		
		
		this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonidCargoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtoncodigoCargoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonnombreCargoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalor_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"valor_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentaje_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_jefeCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_jefeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_anualCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_anualCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentajeCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalorCargoBusqueda.addActionListener(new ButtonActionListener(this,"valorCargoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCargo"));
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCargo"));
		}
		
		this.jTableDatosCargo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCargo"));
		
		this.jTableDatosCargo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCargo"));
		
		this.jButtonNuevoCargo.addActionListener(new ButtonActionListener(this,"NuevoCargo"));
		
		this.jButtonDuplicarCargo.addActionListener(new ButtonActionListener(this,"DuplicarCargo"));
		
		this.jButtonCopiarCargo.addActionListener(new ButtonActionListener(this,"CopiarCargo"));
		
		this.jButtonVerFormCargo.addActionListener(new ButtonActionListener(this,"VerFormCargo"));
		
		
		this.jButtonNuevoToolBarCargo.addActionListener(new ButtonActionListener(this,"NuevoToolBarCargo"));
			
		this.jButtonDuplicarToolBarCargo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCargo"));
			
		this.jMenuItemNuevoCargo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCargo"));
			
		this.jMenuItemDuplicarCargo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCargo"));		
		
		
		this.jButtonNuevoRelacionesCargo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCargo"));
		
		
		this.jButtonNuevoRelacionesToolBarCargo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCargo"));
			
		this.jMenuItemNuevoRelacionesCargo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCargo"));		
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonModificarCargo.addActionListener(new ButtonActionListener(this,"ModificarCargo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonModificarToolBarCargo.addActionListener(new ButtonActionListener(this,"ModificarToolBarCargo"));
			
			this.jInternalFrameDetalleFormCargo.jMenuItemModificarCargo.addActionListener(new ButtonActionListener(this,"MenuItemModificarCargo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCargo.jButtonActualizarCargo.addActionListener (new ButtonActionListener(this,"ActualizarCargo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonActualizarToolBarCargo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCargo"));
				
			this.jInternalFrameDetalleFormCargo.jMenuItemActualizarCargo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCargo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonEliminarCargo.addActionListener (new ButtonActionListener(this,"EliminarCargo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonEliminarToolBarCargo.addActionListener (new ButtonActionListener(this,"EliminarToolBarCargo"));
						
			this.jInternalFrameDetalleFormCargo.jMenuItemEliminarCargo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCargo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonCancelarCargo.addActionListener (new ButtonActionListener(this,"CancelarCargo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonCancelarToolBarCargo.addActionListener (new ButtonActionListener(this,"CancelarToolBarCargo"));
			
			this.jInternalFrameDetalleFormCargo.jMenuItemCancelarCargo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCargo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCargo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCargo"));		
		
		
		this.jButtonCerrarCargo.addActionListener (new ButtonActionListener(this,"CerrarCargo"));
		
		
		this.jButtonCerrarToolBarCargo.addActionListener (new ButtonActionListener(this,"CerrarToolBarCargo"));
			
		this.jMenuItemCerrarCargo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCargo"));
			
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jMenuItemDetalleCerrarCargo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCargo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosCargo"));
		}
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosToolBarCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCargo"));
		}
		
		this.jButtonCopiarToolBarCargo.addActionListener (new ButtonActionListener(this,"CopiarToolBarCargo"));
			
		this.jButtonVerFormToolBarCargo.addActionListener (new ButtonActionListener(this,"VerFormToolBarCargo"));
		
		this.jMenuItemGuardarCambiosCargo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCargo"));
			
		this.jMenuItemCopiarCargo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCargo"));		
		
		this.jMenuItemVerFormCargo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCargo"));		
		
		
		this.jButtonGuardarCambiosTablaCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCargo"));
			
		this.jMenuItemGuardarCambiosTablaCargo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCargo"));		
		
		
		
		this.jButtonRecargarInformacionCargo.addActionListener (new ButtonActionListener(this,"RecargarInformacionCargo"));
					
		this.jButtonRecargarInformacionToolBarCargo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCargo"));
		
		this.jMenuItemRecargarInformacionCargo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCargo"));		
		
		
		this.jButtonArbolCargo.addActionListener (new ButtonActionListener(this,"ArbolCargo"));
		
		this.jButtonAnterioresCargo.addActionListener (new ButtonActionListener(this,"AnterioresCargo"));
		
		
		this.jButtonAnterioresToolBarCargo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCargo"));
		
		this.jMenuItemAnterioresCargo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCargo"));		
		
		
		this.jButtonSiguientesCargo.addActionListener (new ButtonActionListener(this,"SiguientesCargo"));
		
		
		this.jButtonSiguientesToolBarCargo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCargo"));
			
		this.jMenuItemSiguientesCargo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCargo"));
			
		this.jMenuItemAbrirOrderByCargo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCargo"));
			
		this.jMenuItemMostrarOcultarCargo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCargo"));
			
		this.jMenuItemDetalleAbrirOrderByCargo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCargo"));
			
		this.jMenuItemDetalleMostarOcultarCargo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCargo"));		
		
		
		this.jButtonNuevoGuardarCambiosCargo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCargo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCargo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCargo"));
			
		this.jMenuItemNuevoGuardarCambiosCargo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCargo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCargo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCargo"));

		this.jCheckBoxSeleccionadosCargo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCargo"));
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCargo"));
		}
		
		
		this.jComboBoxTiposRelacionesCargo.addActionListener (new ButtonActionListener(this,"TiposRelacionesCargo"));
			
		this.jComboBoxTiposAccionesCargo.addActionListener (new ButtonActionListener(this,"TiposAccionesCargo"));
					
		this.jComboBoxTiposSeleccionarCargo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCargo"));
			
		this.jTextFieldValorCampoGeneralCargo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCargo"));		
		
		
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonidCargoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtoncodigoCargoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonnombreCargoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalor_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"valor_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentaje_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_jefeCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_jefeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_anualCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_anualCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentajeCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalorCargoBusqueda.addActionListener(new ButtonActionListener(this,"valorCargoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCargoCargo.addActionListener(new ButtonActionListener(this,"FK_IdCargoCargo"));

			this.jButtonFK_IdCargoGrupoCargo.addActionListener(new ButtonActionListener(this,"FK_IdCargoGrupoCargo"));

			this.jButtonFK_IdCuentaContableCargo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCargo"));

			this.jButtonFK_IdNumeroPatronalCargo.addActionListener(new ButtonActionListener(this,"FK_IdNumeroPatronalCargo"));

			this.jButtonFK_IdTipoPago_NMCargo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPago_NMCargo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCargo!=null) {
				this.jInternalFrameReporteDinamicoCargo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargo"));
				this.jInternalFrameReporteDinamicoCargo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargo"));
				this.jInternalFrameReporteDinamicoCargo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargo"));
			}
			
			//this.jButtonCerrarReporteDinamicoCargo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCargo"));				
			//this.jButtonGenerarReporteDinamicoCargo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCargo"));
			//this.jButtonGenerarExcelReporteDinamicoCargo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCargo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCargo!=null) {
				this.jInternalFrameImportacionCargo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCargo"));
				this.jInternalFrameImportacionCargo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCargo"));
				this.jInternalFrameImportacionCargo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCargo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCargo.addActionListener (new ButtonActionListener(this,"AbrirOrderByCargo"));
			
			this.jButtonAbrirOrderByToolBarCargo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCargo"));			
			
			if(this.jInternalFrameOrderByCargo!=null) {
				this.jInternalFrameOrderByCargo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCargo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCargo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCargo.jTabbedPaneRelacionesCargo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCargo"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameCargo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCargo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCargo = (JInternalFrameBase)event.getSource();
	            	
	            CargoBeanSwingJInternalFrame jInternalFrameParent=(CargoBeanSwingJInternalFrame)jInternalFrameDetalleFormCargo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCargoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCargo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCargoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCargo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCargo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCargo";
		inputMap = this.jButtonNuevoCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCargoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCargo";
		inputMap = this.jButtonNuevoRelacionesCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCargoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCargo";
		inputMap = this.jButtonModificarCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCargo";
		inputMap = this.jButtonActualizarCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCargo";
		inputMap = this.jButtonEliminarCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCargo";
		inputMap = this.jButtonCancelarCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCargo";
		inputMap = this.jButtonCerrarCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCargo";
		inputMap = this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCargo.jButtonGuardarCambiosCargo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCargoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonArbolCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonArbolCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCargo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCargoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCargo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCargoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCargo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCargoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCargo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCargoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonidCargoBusqueda.addActionListener(new ButtonActionListener(this,"idCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_empresaCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargoCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cuenta_contableCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contableCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoUpdate.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_numero_patronalCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_numero_patronalCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_tipo_pago__n_mCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_pago__n_mCargoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoUpdate.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonid_cargo_grupoCargoBusqueda.addActionListener(new ButtonActionListener(this,"id_cargo_grupoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtoncodigoCargoBusqueda.addActionListener(new ButtonActionListener(this,"codigoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonnombreCargoBusqueda.addActionListener(new ButtonActionListener(this,"nombreCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalor_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"valor_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentaje_anticipoCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_anticipoCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_jefeCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_jefeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtones_anualCargoBusqueda.addActionListener(new ButtonActionListener(this,"es_anualCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonporcentajeCargoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCargoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCargo.jButtonvalorCargoBusqueda.addActionListener(new ButtonActionListener(this,"valorCargoBusqueda"));
		
		
		this.jButtonFK_IdCargoCargo.addActionListener(new ButtonActionListener(this,"FK_IdCargoCargo"));

		this.jButtonFK_IdCargoGrupoCargo.addActionListener(new ButtonActionListener(this,"FK_IdCargoGrupoCargo"));

		this.jButtonFK_IdCuentaContableCargo.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCargo"));

		this.jButtonFK_IdNumeroPatronalCargo.addActionListener(new ButtonActionListener(this,"FK_IdNumeroPatronalCargo"));

		this.jButtonFK_IdTipoPago_NMCargo.addActionListener(new ButtonActionListener(this,"FK_IdTipoPago_NMCargo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCargo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCargoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCargoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCargo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCargo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Cargo cargoAux:this.cargoLogic.getCargos()) {
					cargoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cargo cargoAux:cargos) {
					cargoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCargoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cargo cargoAux:this.cargoLogic.getCargos()) {
						cargoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cargo cargoAux:cargos) {
						cargoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Cargo cargoAux:this.cargoLogic.getCargos()) {
					
						if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESJEFE)) {
							existe=true;
							cargoAux.setes_jefe(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESANUAL)) {
							existe=true;
							cargoAux.setes_anual(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cargo cargoAux:cargos) {
						
						if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESJEFE)) {
							existe=true;
							cargoAux.setes_jefe(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESANUAL)) {
							existe=true;
							cargoAux.setes_anual(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCargo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCargoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCargo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCargo.getSelectedRows();
			
			Cargo cargoLocal=new Cargo();
			
			//this.seleccionarTodosCargo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cargoLocal =(Cargo) this.cargoLogic.getCargos().toArray()[this.jTableDatosCargo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cargoLocal =(Cargo) this.cargos.toArray()[this.jTableDatosCargo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cargoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Cargo cargoAux:this.cargoLogic.getCargos()) {
						cargoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Cargo cargoAux:cargos) {
						cargoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCargo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCargo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCargo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCargo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCargoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCargoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCargoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCargo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCargo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Cargo cargoAux:this.cargoLogic.getCargos()) {
				
						if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cargoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_VALORANTICIPO)) {
							existe=true;
							cargoAux.setvalor_anticipo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO)) {
							existe=true;
							cargoAux.setporcentaje_anticipo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							cargoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cargoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cargo cargoAux:cargos) {
					
						if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cargoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cargoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_VALORANTICIPO)) {
							existe=true;
							cargoAux.setvalor_anticipo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO)) {
							existe=true;
							cargoAux.setporcentaje_anticipo(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							cargoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cargoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCargo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCargoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCargo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCargo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCargo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCargo) {				
					conSplash=true;//false;										
					
					//this.startProcessCargo(conSplash);
				
					this.generarReporteCargosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCargosSeleccionados();
				//this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargosSeleccionados(false);
				//this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCargosSeleccionados(true);
				//this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargo();
				
				this.exportarCargosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCargos();
				//this.importarCargos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCargo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCargosSeleccionados();
				//this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cargo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCargo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCargo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCargo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
				}	
			} 			
			else if(CargoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCargo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCargo(conSplash);
					
						//this.actualizarParametrosGeneralCargo();
						
						this.generarReporteProcesoAccionCargosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CargoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO CargoS SELECCIONADOS?", "MANTENIMIENTO DE Cargo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCargo();
				
						this.actualizarParametrosGeneralCargo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cargoReturnGeneral=cargoLogic.procesarAccionCargosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cargoLogic.getCargos(),this.cargoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCargoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCargo();
					
					CargoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCargoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCargo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCargo.jComboBoxTiposAccionesFormularioCargo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCargo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCargoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCargo();
			
			if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
			Cargo cargo=new Cargo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCargo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCargo.getSelectedItem();
			
			
			
			
			cargosSeleccionados=this.getCargosSeleccionados(true);
			//this.sTipoAccion;
			
			if(cargosSeleccionados.size()==1) {
				for(Cargo cargoAux:cargosSeleccionados) {
					cargo=cargoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Asistencia Mensual")) {
					jButtonAsistenciaMensualActionPerformed(null,rowIndex,true,false,cargo);
				}
				else if(this.sTipoRelacion.equals("Empleado Estructura")) {
					jButtonEmpleadoEstructuraActionPerformed(null,rowIndex,true,false,cargo);
				}
				else if(this.sTipoRelacion.equals("Empleado")) {
					jButtonEmpleadoActionPerformed(null,rowIndex,true,false,cargo);
				}
				else if(this.sTipoRelacion.equals("Cargo")) {
					jButtonCargoActionPerformed(null,rowIndex,true,false,cargo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCargo();
			
      		//this.finishProcessCargo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCargoReturnGeneral() throws Exception {
		if(this.cargoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cargoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cargoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cargoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cargoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cargoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCargo(false);
		}
		
		if(this.cargoReturnGeneral.getConRetornoLista() || this.cargoReturnGeneral.getConRetornoObjeto()) {
			if(this.cargoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargoLogic.setCargos(this.cargoReturnGeneral.getCargos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cargoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cargoLogic.setCargo(this.cargoReturnGeneral.getCargo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCargo(false);
		}
	}
	
	public void actualizarParametrosGeneralCargo() throws Exception {
		
		
	}
	
	public ArrayList<Cargo> getCargosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCargo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Cargo cargoAux:cargoLogic.getCargos()) {
					if(cargoAux.getIsSelected()) {
						cargosSeleccionados.add(cargoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Cargo cargoAux:this.cargos) {
					if(cargoAux.getIsSelected()) {
						cargosSeleccionados.add(cargoAux);				
					}
				}
			}
			
			if(cargosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cargosSeleccionados.addAll(this.cargoLogic.getCargos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cargosSeleccionados.addAll(this.cargos);				
					}
				}
			}
		} else {
			cargosSeleccionados.add(this.cargo);
		}
		
		return cargosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteCargosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCargosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCargosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCargosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCargosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cargo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCargos("Todos",cargosSeleccionados);
		
	}	
	
	public void generarReporteNormalCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCargos("Todos",cargosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCargosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCargos("Todos",cargosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCargo();
		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCargo();
		
		
		//this.generarReporteCargos("Todos",cargosSeleccionados ,cargoImplementable,cargoImplementableHome);
	}
	
	public void mostrarImportacionCargos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCargo();
		
		this.abrirFrameImportacionCargo();		
		
			
		//this.generarReporteCargos("Todos",cargosSeleccionados ,cargoImplementable,cargoImplementableHome);
	}
	
	public void importarCargos() throws Exception {		
	
	}
	
	public void exportarCargosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCargosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCargosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCargosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cargo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCargo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Cargo cargoAux:cargosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCargo(cargoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cargoAux.setsDetalleGeneralEntityReporte(cargoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCargo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CargoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDCARGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDCUENTACONTABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_IDCARGOGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_VALORANTICIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_ESJEFE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_ESANUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CargoConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCargo(Cargo cargo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cargo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getcargo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getcuentacontable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getnumeropatronal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.gettipopago_nm_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getcargogrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getvalor_anticipo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getporcentaje_anticipo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getes_jefe().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getes_anual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cargo.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Cargos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCargo(row);				
				iRow++;
			}				
			
			for(Cargo cargoAux:cargosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCargo(cargoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCargosSeleccionados() throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();		
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cargo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cargos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cargo");
			//elementRoot.appendChild(element);
		
			for(Cargo cargoAux:cargosSeleccionados) {
				element = document.createElement("cargo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCargo(cargoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cargoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cargo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCargo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_IDCARGOGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_VALORANTICIPO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJEANTICIPO);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_ESJEFE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_ESANUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(CargoConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCargo(Cargo cargo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getcargo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getcuentacontable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getnumeropatronal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.gettipopago_nm_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getcargogrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getvalor_anticipo());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getporcentaje_anticipo());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getes_jefe());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getes_anual());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(cargo.getvalor());				
	}
	
	public void setFilaDatosExportarXmlCargo(Cargo cargo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CargoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cargo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CargoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cargo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CargoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cargo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcargo_descripcion = document.createElement(CargoConstantesFunciones.IDCARGO);
		elementcargo_descripcion.appendChild(document.createTextNode(cargo.getcargo_descripcion()));
		element.appendChild(elementcargo_descripcion);

		Element elementcuentacontable_descripcion = document.createElement(CargoConstantesFunciones.IDCUENTACONTABLE);
		elementcuentacontable_descripcion.appendChild(document.createTextNode(cargo.getcuentacontable_descripcion()));
		element.appendChild(elementcuentacontable_descripcion);

		Element elementnumeropatronal_descripcion = document.createElement(CargoConstantesFunciones.IDNUMEROPATRONAL);
		elementnumeropatronal_descripcion.appendChild(document.createTextNode(cargo.getnumeropatronal_descripcion()));
		element.appendChild(elementnumeropatronal_descripcion);

		Element elementtipopago_nm_descripcion = document.createElement(CargoConstantesFunciones.IDTIPOPAGO_NM);
		elementtipopago_nm_descripcion.appendChild(document.createTextNode(cargo.gettipopago_nm_descripcion()));
		element.appendChild(elementtipopago_nm_descripcion);

		Element elementcargogrupo_descripcion = document.createElement(CargoConstantesFunciones.IDCARGOGRUPO);
		elementcargogrupo_descripcion.appendChild(document.createTextNode(cargo.getcargogrupo_descripcion()));
		element.appendChild(elementcargogrupo_descripcion);

		Element elementcodigo = document.createElement(CargoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cargo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CargoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cargo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementvalor_anticipo = document.createElement(CargoConstantesFunciones.VALORANTICIPO);
		elementvalor_anticipo.appendChild(document.createTextNode(cargo.getvalor_anticipo().toString().trim()));
		element.appendChild(elementvalor_anticipo);

		Element elementporcentaje_anticipo = document.createElement(CargoConstantesFunciones.PORCENTAJEANTICIPO);
		elementporcentaje_anticipo.appendChild(document.createTextNode(cargo.getporcentaje_anticipo().toString().trim()));
		element.appendChild(elementporcentaje_anticipo);

		Element elementes_jefe = document.createElement(CargoConstantesFunciones.ESJEFE);
		elementes_jefe.appendChild(document.createTextNode(cargo.getes_jefe().toString().trim()));
		element.appendChild(elementes_jefe);

		Element elementes_anual = document.createElement(CargoConstantesFunciones.ESANUAL);
		elementes_anual.appendChild(document.createTextNode(cargo.getes_anual().toString().trim()));
		element.appendChild(elementes_anual);

		Element elementporcentaje = document.createElement(CargoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(cargo.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementvalor = document.createElement(CargoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(cargo.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoCargosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Cargo> cargosSeleccionados=new ArrayList<Cargo>();
		
		cargosSeleccionados=this.getCargosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoCargo(cargosSeleccionados);
		
		this.generarReporteCargos("Todos",cargosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCargo(ArrayList<Cargo> cargosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Cargo cargoAux:cargosSeleccionados) {
				cargoAux.setsDetalleGeneralEntityReporte(cargoAux.toString());
			
				if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDCARGO)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getcargo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDCUENTACONTABLE)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getcuentacontable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDNUMEROPATRONAL)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getnumeropatronal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDTIPOPAGO_NM)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.gettipopago_nm_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_IDCARGOGRUPO)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getcargogrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(cargoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESJEFE)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cargoAux.getes_jefe()));
				}
				 else if(sTipoSeleccionar.equals(CargoConstantesFunciones.LABEL_ESANUAL)) {
					existe=true;
					cargoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cargoAux.getes_anual()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CargoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCargo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCargo=true;
				this.isVisibilidadCeldaNuevoRelacionesCargo=true;
				this.isVisibilidadCeldaGuardarCambiosCargo=true;
			}
			
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=true;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=true;
			this.isVisibilidadCeldaEliminarCargo=true;
			this.isVisibilidadCeldaCancelarCargo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=true;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCargo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargo=true;
			this.isVisibilidadCeldaGuardarCambiosCargo=true;
			this.isVisibilidadCeldaModificarCargo=false;
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=true;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
			this.isVisibilidadCeldaModificarCargo=true;
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
			this.isVisibilidadCeldaCancelarCargo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCargo=false;
				} else {
					this.isVisibilidadCeldaGuardarCargo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CargoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCargo=true;
			this.isVisibilidadCeldaNuevoRelacionesCargo=true;
			this.isVisibilidadCeldaGuardarCambiosCargo=true;
		} else {
			this.actualizarEstadoPanelsCargo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCargo=false;
			//this.isVisibilidadCeldaVerFormCargo=false;
			this.isVisibilidadCeldaDuplicarCargo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cargoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
		} else {
			this.isVisibilidadCeldaNuevoCargo=false;
			this.isVisibilidadCeldaGuardarCambiosCargo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cargoSessionBean.getEsGuardarRelacionado()) {
			if(!cargoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCargo=false;												
			}
			
			this.jButtonCerrarCargo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCargo=false;
		}
		
		if(!this.permiteMantenimiento(this.cargo)) {
			this.isVisibilidadCeldaActualizarCargo=false;
			this.isVisibilidadCeldaEliminarCargo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCargo() {
		this.isVisibilidadCeldaNuevoCargo=false;
		this.isVisibilidadCeldaGuardarCambiosCargo=false;
	}
	
	public void actualizarEstadoPanelsCargo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(false);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCargo!=null) {
				this.jScrollPanelDatosEdicionCargo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCargo!=null) {
				this.jScrollPanelDatosCargo.setVisible(true);
			}
			
			if(this.jPanelPaginacionCargo!=null) {
				this.jPanelPaginacionCargo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cargoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCargo!=null) {
					this.jTabbedPaneBusquedasCargo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cargoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCargo!=null) {
				this.jTabbedPaneBusquedasCargo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCargo!=null) {
				this.jPanelParametrosReportesCargo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCargo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCargo(Boolean isParaCargo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoNegation=!isParaCargo;

			this.isVisibilidadFK_IdCargo=isParaCargo;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaCargoNegation;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContable(Boolean isParaCuentaContable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableNegation=!isParaCuentaContable;

			this.isVisibilidadFK_IdCargo=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaCuentaContable;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaCuentaContableNegation;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}

	public void setVisibilidadBusquedasParaNumeroPatronal(Boolean isParaNumeroPatronal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaNumeroPatronalNegation=!isParaNumeroPatronal;

			this.isVisibilidadFK_IdCargo=isParaNumeroPatronalNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaNumeroPatronalNegation;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaNumeroPatronalNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaNumeroPatronal;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaNumeroPatronalNegation;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPago_NM(Boolean isParaTipoPago_NM){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPago_NMNegation=!isParaTipoPago_NM;

			this.isVisibilidadFK_IdCargo=isParaTipoPago_NMNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaTipoPago_NMNegation;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaTipoPago_NMNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaTipoPago_NMNegation;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaTipoPago_NM;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}

	public void setVisibilidadBusquedasParaCargoGrupo(Boolean isParaCargoGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCargoGrupoNegation=!isParaCargoGrupo;

			this.isVisibilidadFK_IdCargo=isParaCargoGrupoNegation;
			if(!this.isVisibilidadFK_IdCargo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoCargo);}

			this.isVisibilidadFK_IdCargoGrupo=isParaCargoGrupo;
			if(!this.isVisibilidadFK_IdCargoGrupo) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCargoGrupoCargo);}

			this.isVisibilidadFK_IdCuentaContable=isParaCargoGrupoNegation;
			if(!this.isVisibilidadFK_IdCuentaContable) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdCuentaContableCargo);}

			this.isVisibilidadFK_IdNumeroPatronal=isParaCargoGrupoNegation;
			if(!this.isVisibilidadFK_IdNumeroPatronal) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdNumeroPatronalCargo);}

			this.isVisibilidadFK_IdTipoPago_NM=isParaCargoGrupoNegation;
			if(!this.isVisibilidadFK_IdTipoPago_NM) {this.jTabbedPaneBusquedasCargo.remove(jPanelFK_IdTipoPago_NMCargo);}
		}
		
	}
	
	

	public String registrarSesionCargoParaAsistenciaMensuales() throws Exception {
		Boolean isPaginaPopupAsistenciaMensual=false;

		try {

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean==null) {
				this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean=new AsistenciaMensualSessionBean();
			}

			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setsPathNavegacionActual(cargoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AsistenciaMensualConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAsistenciaMensual=this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAsistenciaMensual(true);
			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAsistenciaMensual(CargoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
			this.jInternalFrameDetalleFormCargo.asistenciamensualSessionBean.setlidCargoActual(this.idCargoActual);

			cargoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargo(true);
			cargoSessionBean.setlIdCargoActualForeignKey(this.idCargoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCargoParaEmpleadoEstructuras() throws Exception {
		Boolean isPaginaPopupEmpleadoEstructura=false;

		try {

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean==null) {
				this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean=new EmpleadoEstructuraSessionBean();
			}

			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setsPathNavegacionActual(cargoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoEstructuraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleadoEstructura=this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleadoEstructura(true);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleadoEstructura(CargoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
			this.jInternalFrameDetalleFormCargo.empleadoestructuraSessionBean.setlidCargoActual(this.idCargoActual);

			cargoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargo(true);
			cargoSessionBean.setlIdCargoActualForeignKey(this.idCargoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCargoParaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCargo.empleadoSessionBean==null) {
				this.jInternalFrameDetalleFormCargo.empleadoSessionBean=new EmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setsPathNavegacionActual(cargoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEmpleado=this.jInternalFrameDetalleFormCargo.empleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(CargoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
			this.jInternalFrameDetalleFormCargo.empleadoSessionBean.setlidCargoActual(this.idCargoActual);

			cargoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargo(true);
			cargoSessionBean.setlIdCargoActualForeignKey(this.idCargoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCargoParaCargos() throws Exception {
		Boolean isPaginaPopupCargo=false;

		try {

			if(this.cargoSessionBean==null) {
				this.cargoSessionBean=new CargoSessionBean();
			}

			if(this.jInternalFrameDetalleFormCargo.cargoSessionBean==null) {
				this.jInternalFrameDetalleFormCargo.cargoSessionBean=new CargoSessionBean();
			}

			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setsPathNavegacionActual(cargoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargo=this.jInternalFrameDetalleFormCargo.cargoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargo(true);
			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo(CargoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setisBusquedaDesdeForeignKeySesionCargo(true);
			this.jInternalFrameDetalleFormCargo.cargoSessionBean.setlidCargoActual(this.idCargoActual);

			cargoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCargo(true);
			cargoSessionBean.setlIdCargoActualForeignKey(this.idCargoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CargoSessionBean cargoSessionBean=new CargoSessionBean();
		
		if(this.cargoSessionBean==null) {
			this.cargoSessionBean=new CargoSessionBean();
		}
		
		this.cargoSessionBean.setsUltimaBusquedaCargo(this.getsAccionBusqueda());
		this.cargoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cargoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
			cargoSessionBean.setid_cargo(this.getid_cargoFK_IdCargo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCargoGrupo")) {
			cargoSessionBean.setid_cargo_grupo(this.getid_cargo_grupoFK_IdCargoGrupo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
			cargoSessionBean.setid_cuenta_contable(this.getid_cuenta_contableFK_IdCuentaContable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cargoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdNumeroPatronal")) {
			cargoSessionBean.setid_numero_patronal(this.getid_numero_patronalFK_IdNumeroPatronal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPago_NM")) {
			cargoSessionBean.setid_tipo_pago__n_m(this.getid_tipo_pago__n_mFK_IdTipoPago_NM());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CargoSessionBean cargoSessionBean=new CargoSessionBean();
		
		if(this.cargoSessionBean==null) {
			this.cargoSessionBean=new CargoSessionBean();
		}
		
		if(this.cargoSessionBean.getsUltimaBusquedaCargo()!=null&&!this.cargoSessionBean.getsUltimaBusquedaCargo().equals("")) {
			this.setsAccionBusqueda(cargoSessionBean.getsUltimaBusquedaCargo());
			this.setiNumeroPaginacion(cargoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cargoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCargo")) {
				this.setid_cargoFK_IdCargo(cargoSessionBean.getid_cargo());
				cargoSessionBean.setid_cargo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCargoGrupo")) {
				this.setid_cargo_grupoFK_IdCargoGrupo(cargoSessionBean.getid_cargo_grupo());
				cargoSessionBean.setid_cargo_grupo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContable")) {
				this.setid_cuenta_contableFK_IdCuentaContable(cargoSessionBean.getid_cuenta_contable());
				cargoSessionBean.setid_cuenta_contable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cargoSessionBean.getid_empresa());
				cargoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdNumeroPatronal")) {
				this.setid_numero_patronalFK_IdNumeroPatronal(cargoSessionBean.getid_numero_patronal());
				cargoSessionBean.setid_numero_patronal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPago_NM")) {
				this.setid_tipo_pago__n_mFK_IdTipoPago_NM(cargoSessionBean.getid_tipo_pago__n_m());
				cargoSessionBean.setid_tipo_pago__n_m(-1L);
			}
		}
		
		this.cargoSessionBean.setsUltimaBusquedaCargo("");
		this.cargoSessionBean.setiNumeroPaginacion(CargoConstantesFunciones.INUMEROPAGINACION);
		this.cargoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCargo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCargo() {
		this.updateBorderResaltarBusquedasFormularioCargo();
		this.updateVisibilidadBusquedasFormularioCargo();
		this.updateHabilitarBusquedasFormularioCargo();
	}
	
	public void updateBorderResaltarBusquedasFormularioCargo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCargo.getComponents().length>0) {
	

		if(this.cargoConstantesFunciones.resaltarFK_IdCargoCargo!=null) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoCargo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCargoCargo);
			}
		}

		if(this.cargoConstantesFunciones.resaltarFK_IdCargoGrupoCargo!=null) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoGrupoCargo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCargoGrupoCargo);
			}
		}

		if(this.cargoConstantesFunciones.resaltarFK_IdCuentaContableCargo!=null) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCuentaContableCargo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCuentaContableCargo);
			}
		}

		if(this.cargoConstantesFunciones.resaltarFK_IdNumeroPatronalCargo!=null) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdNumeroPatronalCargo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdNumeroPatronalCargo);
			}
		}

		if(this.cargoConstantesFunciones.resaltarFK_IdTipoPago_NMCargo!=null) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdTipoPago_NMCargo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdTipoPago_NMCargo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCargo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCargo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoCargo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoConstantesFunciones.mostrarFK_IdCargoCargo);
			if(!this.cargoConstantesFunciones.mostrarFK_IdCargoCargo && index>-1) {
				this.jTabbedPaneBusquedasCargo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoGrupoCargo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoConstantesFunciones.mostrarFK_IdCargoGrupoCargo);
			if(!this.cargoConstantesFunciones.mostrarFK_IdCargoGrupoCargo && index>-1) {
				this.jTabbedPaneBusquedasCargo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCuentaContableCargo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoConstantesFunciones.mostrarFK_IdCuentaContableCargo);
			if(!this.cargoConstantesFunciones.mostrarFK_IdCuentaContableCargo && index>-1) {
				this.jTabbedPaneBusquedasCargo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdNumeroPatronalCargo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoConstantesFunciones.mostrarFK_IdNumeroPatronalCargo);
			if(!this.cargoConstantesFunciones.mostrarFK_IdNumeroPatronalCargo && index>-1) {
				this.jTabbedPaneBusquedasCargo.remove(index);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdTipoPago_NMCargo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cargoConstantesFunciones.mostrarFK_IdTipoPago_NMCargo);
			if(!this.cargoConstantesFunciones.mostrarFK_IdTipoPago_NMCargo && index>-1) {
				this.jTabbedPaneBusquedasCargo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCargo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCargo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoCargo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoConstantesFunciones.activarFK_IdCargoCargo);
				this.jTabbedPaneBusquedasCargo.setEnabledAt(index,this.cargoConstantesFunciones.activarFK_IdCargoCargo);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoGrupoCargo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoConstantesFunciones.activarFK_IdCargoGrupoCargo);
				this.jTabbedPaneBusquedasCargo.setEnabledAt(index,this.cargoConstantesFunciones.activarFK_IdCargoGrupoCargo);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCuentaContableCargo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoConstantesFunciones.activarFK_IdCuentaContableCargo);
				this.jTabbedPaneBusquedasCargo.setEnabledAt(index,this.cargoConstantesFunciones.activarFK_IdCuentaContableCargo);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdNumeroPatronalCargo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoConstantesFunciones.activarFK_IdNumeroPatronalCargo);
				this.jTabbedPaneBusquedasCargo.setEnabledAt(index,this.cargoConstantesFunciones.activarFK_IdNumeroPatronalCargo);
			}

			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdTipoPago_NMCargo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cargoConstantesFunciones.activarFK_IdTipoPago_NMCargo);
				this.jTabbedPaneBusquedasCargo.setEnabledAt(index,this.cargoConstantesFunciones.activarFK_IdTipoPago_NMCargo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCargo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCargo")) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoCargo);

			this.jTabbedPaneBusquedasCargo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);

			this.cargoConstantesFunciones.setResaltarFK_IdCargoCargo(resaltar);

			jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCargoCargo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCargoGrupo")) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCargoGrupoCargo);

			this.jTabbedPaneBusquedasCargo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);

			this.cargoConstantesFunciones.setResaltarFK_IdCargoGrupoCargo(resaltar);

			jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCargoGrupoCargo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContable")) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdCuentaContableCargo);

			this.jTabbedPaneBusquedasCargo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);

			this.cargoConstantesFunciones.setResaltarFK_IdCuentaContableCargo(resaltar);

			jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdCuentaContableCargo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdNumeroPatronal")) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdNumeroPatronalCargo);

			this.jTabbedPaneBusquedasCargo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);

			this.cargoConstantesFunciones.setResaltarFK_IdNumeroPatronalCargo(resaltar);

			jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdNumeroPatronalCargo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPago_NM")) {
			index= this.jTabbedPaneBusquedasCargo.indexOfComponent(this.jPanelFK_IdTipoPago_NMCargo);

			this.jTabbedPaneBusquedasCargo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCargo.getComponent(index);

			this.cargoConstantesFunciones.setResaltarFK_IdTipoPago_NMCargo(resaltar);

			jPanel.setBorder(this.cargoConstantesFunciones.resaltarFK_IdTipoPago_NMCargo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCargo.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioCargo() throws Exception {

		if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCargo();
		this.updateVisibilidadResaltarControlesFormularioCargo();
		this.updateHabilitarResaltarControlesFormularioCargo();
		
	}
	
	public void updateBorderResaltarControlesFormularioCargo() throws Exception {
		if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cargoConstantesFunciones.resaltaridCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jLabelidCargo.setBorder(this.cargoConstantesFunciones.resaltaridCargo);}
		if(this.cargoConstantesFunciones.resaltarid_empresaCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setBorder(this.cargoConstantesFunciones.resaltarid_empresaCargo);}
		if(this.cargoConstantesFunciones.resaltarid_cargoCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setBorder(this.cargoConstantesFunciones.resaltarid_cargoCargo);}
		if(this.cargoConstantesFunciones.resaltarid_cuenta_contableCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setBorder(this.cargoConstantesFunciones.resaltarid_cuenta_contableCargo);}
		if(this.cargoConstantesFunciones.resaltarid_numero_patronalCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setBorder(this.cargoConstantesFunciones.resaltarid_numero_patronalCargo);}
		if(this.cargoConstantesFunciones.resaltarid_tipo_pago__n_mCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setBorder(this.cargoConstantesFunciones.resaltarid_tipo_pago__n_mCargo);}
		if(this.cargoConstantesFunciones.resaltarid_cargo_grupoCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setBorder(this.cargoConstantesFunciones.resaltarid_cargo_grupoCargo);}
		if(this.cargoConstantesFunciones.resaltarcodigoCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setBorder(this.cargoConstantesFunciones.resaltarcodigoCargo);}
		if(this.cargoConstantesFunciones.resaltarnombreCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setBorder(this.cargoConstantesFunciones.resaltarnombreCargo);}
		if(this.cargoConstantesFunciones.resaltarvalor_anticipoCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setBorder(this.cargoConstantesFunciones.resaltarvalor_anticipoCargo);}
		if(this.cargoConstantesFunciones.resaltarporcentaje_anticipoCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setBorder(this.cargoConstantesFunciones.resaltarporcentaje_anticipoCargo);}
		if(this.cargoConstantesFunciones.resaltares_jefeCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setBorderPainted(true);this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setBorder(this.cargoConstantesFunciones.resaltares_jefeCargo);}
		if(this.cargoConstantesFunciones.resaltares_anualCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setBorderPainted(true);this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setBorder(this.cargoConstantesFunciones.resaltares_anualCargo);}
		if(this.cargoConstantesFunciones.resaltarporcentajeCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setBorder(this.cargoConstantesFunciones.resaltarporcentajeCargo);}
		if(this.cargoConstantesFunciones.resaltarvalorCargo!=null && this.jInternalFrameDetalleFormCargo!=null) {this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setBorder(this.cargoConstantesFunciones.resaltarvalorCargo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCargo() throws Exception {		
		if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
	
		//this.jInternalFrameDetalleFormCargo.jLabelidCargo.setVisible(this.cargoConstantesFunciones.mostraridCargo);
		this.jInternalFrameDetalleFormCargo.jPanelidCargo.setVisible(this.cargoConstantesFunciones.mostraridCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setVisible(this.cargoConstantesFunciones.mostrarid_empresaCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_empresaCargo.setVisible(this.cargoConstantesFunciones.mostrarid_empresaCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cargoCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_cargoCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cargoCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cuenta_contableCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_cuenta_contableCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cuenta_contableCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setVisible(this.cargoConstantesFunciones.mostrarid_numero_patronalCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_numero_patronalCargo.setVisible(this.cargoConstantesFunciones.mostrarid_numero_patronalCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setVisible(this.cargoConstantesFunciones.mostrarid_tipo_pago__n_mCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_tipo_pago__n_mCargo.setVisible(this.cargoConstantesFunciones.mostrarid_tipo_pago__n_mCargo);
		//this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cargo_grupoCargo);
		this.jInternalFrameDetalleFormCargo.jPanelid_cargo_grupoCargo.setVisible(this.cargoConstantesFunciones.mostrarid_cargo_grupoCargo);
		//this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setVisible(this.cargoConstantesFunciones.mostrarcodigoCargo);
		this.jInternalFrameDetalleFormCargo.jPanelcodigoCargo.setVisible(this.cargoConstantesFunciones.mostrarcodigoCargo);
		//this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setVisible(this.cargoConstantesFunciones.mostrarnombreCargo);
		this.jInternalFrameDetalleFormCargo.jPanelnombreCargo.setVisible(this.cargoConstantesFunciones.mostrarnombreCargo);
		//this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setVisible(this.cargoConstantesFunciones.mostrarvalor_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jPanelvalor_anticipoCargo.setVisible(this.cargoConstantesFunciones.mostrarvalor_anticipoCargo);
		//this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setVisible(this.cargoConstantesFunciones.mostrarporcentaje_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jPanelporcentaje_anticipoCargo.setVisible(this.cargoConstantesFunciones.mostrarporcentaje_anticipoCargo);
		//this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setVisible(this.cargoConstantesFunciones.mostrares_jefeCargo);
		this.jInternalFrameDetalleFormCargo.jPaneles_jefeCargo.setVisible(this.cargoConstantesFunciones.mostrares_jefeCargo);
		//this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setVisible(this.cargoConstantesFunciones.mostrares_anualCargo);
		this.jInternalFrameDetalleFormCargo.jPaneles_anualCargo.setVisible(this.cargoConstantesFunciones.mostrares_anualCargo);
		//this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setVisible(this.cargoConstantesFunciones.mostrarporcentajeCargo);
		this.jInternalFrameDetalleFormCargo.jPanelporcentajeCargo.setVisible(this.cargoConstantesFunciones.mostrarporcentajeCargo);
		//this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setVisible(this.cargoConstantesFunciones.mostrarvalorCargo);
		this.jInternalFrameDetalleFormCargo.jPanelvalorCargo.setVisible(this.cargoConstantesFunciones.mostrarvalorCargo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCargo() throws Exception {
		if(this.jInternalFrameDetalleFormCargo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCargo!=null) {
	
		this.jInternalFrameDetalleFormCargo.jLabelidCargo.setEnabled(this.cargoConstantesFunciones.activaridCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_empresaCargo.setEnabled(this.cargoConstantesFunciones.activarid_empresaCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cargoCargo.setEnabled(this.cargoConstantesFunciones.activarid_cargoCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cuenta_contableCargo.setEnabled(this.cargoConstantesFunciones.activarid_cuenta_contableCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_numero_patronalCargo.setEnabled(this.cargoConstantesFunciones.activarid_numero_patronalCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_tipo_pago__n_mCargo.setEnabled(this.cargoConstantesFunciones.activarid_tipo_pago__n_mCargo);
		this.jInternalFrameDetalleFormCargo.jComboBoxid_cargo_grupoCargo.setEnabled(this.cargoConstantesFunciones.activarid_cargo_grupoCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldcodigoCargo.setEnabled(this.cargoConstantesFunciones.activarcodigoCargo);
		this.jInternalFrameDetalleFormCargo.jTextAreanombreCargo.setEnabled(this.cargoConstantesFunciones.activarnombreCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldvalor_anticipoCargo.setEnabled(this.cargoConstantesFunciones.activarvalor_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldporcentaje_anticipoCargo.setEnabled(this.cargoConstantesFunciones.activarporcentaje_anticipoCargo);
		this.jInternalFrameDetalleFormCargo.jCheckBoxes_jefeCargo.setEnabled(this.cargoConstantesFunciones.activares_jefeCargo);
		this.jInternalFrameDetalleFormCargo.jCheckBoxes_anualCargo.setEnabled(this.cargoConstantesFunciones.activares_anualCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldporcentajeCargo.setEnabled(this.cargoConstantesFunciones.activarporcentajeCargo);
		this.jInternalFrameDetalleFormCargo.jTextFieldvalorCargo.setEnabled(this.cargoConstantesFunciones.activarvalorCargo);
		}
	}
	
		
}