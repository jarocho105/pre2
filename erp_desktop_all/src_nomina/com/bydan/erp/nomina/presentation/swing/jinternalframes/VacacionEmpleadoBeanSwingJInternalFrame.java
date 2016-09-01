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

import com.bydan.erp.nomina.util.VacacionEmpleadoConstantesFunciones;
import com.bydan.erp.nomina.util.VacacionEmpleadoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.VacacionEmpleadoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.VacacionEmpleadoBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VacacionEmpleadoBeanSwingJInternalFrame extends VacacionEmpleadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VacacionEmpleadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VacacionEmpleado> vacacionempleadoValidator = new ClassValidator<VacacionEmpleado>(VacacionEmpleado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VacacionEmpleado vacacionempleado;	
	public VacacionEmpleado vacacionempleadoAux;
	public VacacionEmpleado vacacionempleadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VacacionEmpleado vacacionempleadoTotales;
	public Long idVacacionEmpleadoActual;
	public Long iIdNuevoVacacionEmpleado=0L;
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

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboAnioPeriodo1="";

	public List<Anio> anioperiodo1sForeignKey;

	public List<Anio> getanioperiodo1sForeignKey() {
		return anioperiodo1sForeignKey;
	}

	public void setanioperiodo1sForeignKey(List<Anio> anioperiodo1sForeignKey) {
		this.anioperiodo1sForeignKey = anioperiodo1sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioperiodo1ForeignKey;

	public Anio getanioperiodo1ForeignKey() {
		return anioperiodo1ForeignKey;
	}

	public void setanioperiodo1ForeignKey(Anio anioperiodo1ForeignKey) {
		this.anioperiodo1ForeignKey = anioperiodo1ForeignKey;
	}

	public String sFinalQueryComboAnioPeriodo2="";

	public List<Anio> anioperiodo2sForeignKey;

	public List<Anio> getanioperiodo2sForeignKey() {
		return anioperiodo2sForeignKey;
	}

	public void setanioperiodo2sForeignKey(List<Anio> anioperiodo2sForeignKey) {
		this.anioperiodo2sForeignKey = anioperiodo2sForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioperiodo2ForeignKey;

	public Anio getanioperiodo2ForeignKey() {
		return anioperiodo2ForeignKey;
	}

	public void setanioperiodo2ForeignKey(Anio anioperiodo2ForeignKey) {
		this.anioperiodo2ForeignKey = anioperiodo2ForeignKey;
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
	
	public Boolean isPermisoTodoVacacionEmpleado;
	public Boolean isPermisoNuevoVacacionEmpleado;
	public Boolean isPermisoActualizarVacacionEmpleado;
	public Boolean isPermisoActualizarOriginalVacacionEmpleado;
	public Boolean isPermisoEliminarVacacionEmpleado;
	public Boolean isPermisoGuardarCambiosVacacionEmpleado;
	public Boolean isPermisoConsultaVacacionEmpleado;
	public Boolean isPermisoBusquedaVacacionEmpleado;
	public Boolean isPermisoReporteVacacionEmpleado;
	public Boolean isPermisoPaginacionMedioVacacionEmpleado;
	public Boolean isPermisoPaginacionAltoVacacionEmpleado;
	public Boolean isPermisoPaginacionTodoVacacionEmpleado;
	public Boolean isPermisoCopiarVacacionEmpleado;
	public Boolean isPermisoVerFormVacacionEmpleado;
	public Boolean isPermisoDuplicarVacacionEmpleado;
	public Boolean isPermisoOrdenVacacionEmpleado;
	
	
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
	
	public VacacionEmpleadoParameterReturnGeneral vacacionempleadoReturnGeneral;
	public VacacionEmpleadoParameterReturnGeneral vacacionempleadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVacacionEmpleado=false;
	public Boolean esParaAccionDesdeFormularioVacacionEmpleado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VacacionEmpleadoSessionBeanAdditional vacacionempleadoSessionBeanAdditional=null;
	
	public VacacionEmpleadoSessionBeanAdditional getVacacionEmpleadoSessionBeanAdditional() {
		return this.vacacionempleadoSessionBeanAdditional;
	}
	
	public void setVacacionEmpleadoSessionBeanAdditional(VacacionEmpleadoSessionBeanAdditional vacacionempleadoSessionBeanAdditional) {
		try {
			this.vacacionempleadoSessionBeanAdditional=vacacionempleadoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VacacionEmpleadoBeanSwingJInternalFrameAdditional vacacionempleadoBeanSwingJInternalFrameAdditional=null;
	//public class VacacionEmpleadoBeanSwingJInternalFrame
	
	public VacacionEmpleadoBeanSwingJInternalFrameAdditional getVacacionEmpleadoBeanSwingJInternalFrameAdditional() {
		return this.vacacionempleadoBeanSwingJInternalFrameAdditional;
	}
	
	public void setVacacionEmpleadoBeanSwingJInternalFrameAdditional(VacacionEmpleadoBeanSwingJInternalFrameAdditional vacacionempleadoBeanSwingJInternalFrameAdditional) {
		try {
			this.vacacionempleadoBeanSwingJInternalFrameAdditional=vacacionempleadoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VacacionEmpleadoLogic vacacionempleadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VacacionEmpleado vacacionempleadoBean;
	public VacacionEmpleadoConstantesFunciones vacacionempleadoConstantesFunciones;
	//public VacacionEmpleadoParameterReturnGeneral vacacionempleadoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public AnioLogic anioperiodo1Logic;
	public AnioLogic anioperiodo2Logic;
	
	//PARAMETROS
	
	
	//public List<VacacionEmpleado> vacacionempleados;	
	//public List<VacacionEmpleado> vacacionempleadosEliminados;
	//public List<VacacionEmpleado> vacacionempleadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaDuplicarVacacionEmpleado=true;
	public Boolean isVisibilidadCeldaCopiarVacacionEmpleado=true;
	public Boolean isVisibilidadCeldaVerFormVacacionEmpleado=true;
	public Boolean isVisibilidadCeldaOrdenVacacionEmpleado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaModificarVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaActualizarVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaEliminarVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaCancelarVacacionEmpleado=false;
	public Boolean isVisibilidadCeldaGuardarVacacionEmpleado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;	
	
	
	public Boolean isVisibilidadFK_IdAnioPeriodo1=false;
	public Boolean isVisibilidadFK_IdAnioPeriodo2=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoVacacionEmpleado() {
		return this.iIdNuevoVacacionEmpleado;
	}

	public void setiIdNuevoVacacionEmpleado(Long iIdNuevoVacacionEmpleado) {
		this.iIdNuevoVacacionEmpleado = iIdNuevoVacacionEmpleado;
	}
	
	public Long getidVacacionEmpleadoActual() {
		return this.idVacacionEmpleadoActual;
	}

	public void setidVacacionEmpleadoActual(Long idVacacionEmpleadoActual) {
		this.idVacacionEmpleadoActual = idVacacionEmpleadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VacacionEmpleado getvacacionempleado() {
		return this.vacacionempleado;
	}

	public void setvacacionempleado(VacacionEmpleado vacacionempleado) {
		this.vacacionempleado = vacacionempleado;
	}
	
	public VacacionEmpleado getvacacionempleadoAux() {
		return this.vacacionempleadoAux;
	}

	public void setvacacionempleadoAux(VacacionEmpleado vacacionempleadoAux) {
		this.vacacionempleadoAux = vacacionempleadoAux;
	}				
	
	public VacacionEmpleado getvacacionempleadoAnterior() {
		return this.vacacionempleadoAnterior;
	}

	public void setvacacionempleadoAnterior(VacacionEmpleado vacacionempleadoAnterior) {
		this.vacacionempleadoAnterior = vacacionempleadoAnterior;
	}	
	
	public VacacionEmpleado getvacacionempleadoTotales() {
		return this.vacacionempleadoTotales;
	}

	public void setvacacionempleadoTotales(VacacionEmpleado vacacionempleadoTotales) {
		this.vacacionempleadoTotales = vacacionempleadoTotales;
	}	
	
	public VacacionEmpleado getvacacionempleadoBean() {
		return this.vacacionempleadoBean;
	}

	public void setvacacionempleadoBean(VacacionEmpleado vacacionempleadoBean) {
		this.vacacionempleadoBean = vacacionempleadoBean;
	}	
	
	public VacacionEmpleadoParameterReturnGeneral getvacacionempleadoReturnGeneral() {
		return this.vacacionempleadoReturnGeneral;
	}

	public void setvacacionempleadoReturnGeneral(VacacionEmpleadoParameterReturnGeneral vacacionempleadoReturnGeneral) {
		this.vacacionempleadoReturnGeneral = vacacionempleadoReturnGeneral;
	}	
	
	
	public Long id_anio_periodo1FK_IdAnioPeriodo1=-1L;

	public Long getid_anio_periodo1FK_IdAnioPeriodo1() {
		return this.id_anio_periodo1FK_IdAnioPeriodo1;
	}

	public void setid_anio_periodo1FK_IdAnioPeriodo1(Long id_anio_periodo1FK_IdAnioPeriodo1) {
		this.id_anio_periodo1FK_IdAnioPeriodo1 = id_anio_periodo1FK_IdAnioPeriodo1;
	}

	public Long id_anio_periodo2FK_IdAnioPeriodo2=-1L;

	public Long getid_anio_periodo2FK_IdAnioPeriodo2() {
		return this.id_anio_periodo2FK_IdAnioPeriodo2;
	}

	public void setid_anio_periodo2FK_IdAnioPeriodo2(Long id_anio_periodo2FK_IdAnioPeriodo2) {
		this.id_anio_periodo2FK_IdAnioPeriodo2 = id_anio_periodo2FK_IdAnioPeriodo2;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VacacionEmpleadoLogic getVacacionEmpleadoLogic()	{		
		return vacacionempleadoLogic;
	}

	public void setVacacionEmpleadoLogic(VacacionEmpleadoLogic vacacionempleadoLogic) {
		this.vacacionempleadoLogic = vacacionempleadoLogic;
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
	
	public Boolean getIsEsNuevoVacacionEmpleado() {
		return isEsNuevoVacacionEmpleado;
	}

	public void setIsEsNuevoVacacionEmpleado(Boolean isEsNuevoVacacionEmpleado) {
		this.isEsNuevoVacacionEmpleado = isEsNuevoVacacionEmpleado;
	}

	public Boolean getEsParaAccionDesdeFormularioVacacionEmpleado() {
		return esParaAccionDesdeFormularioVacacionEmpleado;
	}
	
	public void setEsParaAccionDesdeFormularioVacacionEmpleado(Boolean esParaAccionDesdeFormularioVacacionEmpleado) {
		this.esParaAccionDesdeFormularioVacacionEmpleado = esParaAccionDesdeFormularioVacacionEmpleado;
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

			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			}

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(vacacionempleadoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			}

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(vacacionempleadoSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosAnioPeriodo1sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.anioperiodo1sForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			}

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo1()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioperiodo1Logic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.anioperiodo1sForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnioPeriodo1(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(vacacionempleadoSessionBean.getlidAnioPeriodo1Actual());
					this.anioperiodo1sForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosAnioPeriodo2sForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.anioperiodo2sForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			}

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo2()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioperiodo2Logic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.anioperiodo2sForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnioPeriodo2(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(vacacionempleadoSessionBean.getlidAnioPeriodo2Actual());
					this.anioperiodo2sForeignKey.add(anioLogic.getAnio());
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

					if(this.vacacionempleado!=null) {
						this.vacacionempleado.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVacacionEmpleado.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVacacionEmpleadoGenerico)throws Exception
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
				jComboBoxid_empresaVacacionEmpleadoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVacacionEmpleadoGenerico!=null && jComboBoxid_empresaVacacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empresaVacacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.vacacionempleado!=null) {
						this.vacacionempleado.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoVacacionEmpleado.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoVacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoVacacionEmpleadoGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoVacacionEmpleadoGenerico!=null && jComboBoxid_empleadoVacacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_empleadoVacacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioPeriodo1ForeignKey(Long idAnioPeriodo1Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioperiodo1Temp=null;

			for(Anio anioperiodo1Aux:anioperiodo1sForeignKey) {
				if(anioperiodo1Aux.getId()!=null && anioperiodo1Aux.getId().equals(idAnioPeriodo1Seleccionado)) {
					anioperiodo1Temp=anioperiodo1Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioperiodo1Temp!=null) {

					if(this.vacacionempleado!=null) {
						this.vacacionempleado.setAnioPeriodo1(anioperiodo1Temp);
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedItem(anioperiodo1Temp);
					}
				} else {
					//jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedItem(anioperiodo1Temp);
					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnioPeriodo1") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioperiodo1Temp!=null && jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado!=null) {
						jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setSelectedItem(anioperiodo1Temp);
					} else {
						if(jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado!=null) {
							//jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setSelectedItem(anioperiodo1Temp);
							if(jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.getItemCount()>0) {
								jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setSelectedIndex(0);
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

	public String getActualAnioPeriodo1ForeignKeyDescripcion(Long idAnioPeriodo1Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioperiodo1Temp=null;

			for(Anio anioperiodo1Aux:anioperiodo1sForeignKey) {
				if(anioperiodo1Aux.getId()!=null && anioperiodo1Aux.getId().equals(idAnioPeriodo1Seleccionado)) {
					anioperiodo1Temp=anioperiodo1Aux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioperiodo1Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioPeriodo1ForeignKeyGenerico(Long idAnioPeriodo1Seleccionado,JComboBox jComboBoxid_anio_periodo1VacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioperiodo1Temp=null;

			for(Anio anioperiodo1Aux:anioperiodo1sForeignKey) {
				if(anioperiodo1Aux.getId()!=null && anioperiodo1Aux.getId().equals(idAnioPeriodo1Seleccionado)) {
					anioperiodo1Temp=anioperiodo1Aux;
					break;
				}
			}

			if(anioperiodo1Temp!=null) {
				jComboBoxid_anio_periodo1VacacionEmpleadoGenerico.setSelectedItem(anioperiodo1Temp);
			} else {
				if(jComboBoxid_anio_periodo1VacacionEmpleadoGenerico!=null && jComboBoxid_anio_periodo1VacacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_anio_periodo1VacacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioPeriodo2ForeignKey(Long idAnioPeriodo2Seleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioperiodo2Temp=null;

			for(Anio anioperiodo2Aux:anioperiodo2sForeignKey) {
				if(anioperiodo2Aux.getId()!=null && anioperiodo2Aux.getId().equals(idAnioPeriodo2Seleccionado)) {
					anioperiodo2Temp=anioperiodo2Aux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioperiodo2Temp!=null) {

					if(this.vacacionempleado!=null) {
						this.vacacionempleado.setAnioPeriodo2(anioperiodo2Temp);
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedItem(anioperiodo2Temp);
					}
				} else {
					//jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedItem(anioperiodo2Temp);
					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.getItemCount()>0) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnioPeriodo2") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioperiodo2Temp!=null && jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado!=null) {
						jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setSelectedItem(anioperiodo2Temp);
					} else {
						if(jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado!=null) {
							//jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setSelectedItem(anioperiodo2Temp);
							if(jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.getItemCount()>0) {
								jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setSelectedIndex(0);
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

	public String getActualAnioPeriodo2ForeignKeyDescripcion(Long idAnioPeriodo2Seleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioperiodo2Temp=null;

			for(Anio anioperiodo2Aux:anioperiodo2sForeignKey) {
				if(anioperiodo2Aux.getId()!=null && anioperiodo2Aux.getId().equals(idAnioPeriodo2Seleccionado)) {
					anioperiodo2Temp=anioperiodo2Aux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioperiodo2Temp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioPeriodo2ForeignKeyGenerico(Long idAnioPeriodo2Seleccionado,JComboBox jComboBoxid_anio_periodo2VacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioperiodo2Temp=null;

			for(Anio anioperiodo2Aux:anioperiodo2sForeignKey) {
				if(anioperiodo2Aux.getId()!=null && anioperiodo2Aux.getId().equals(idAnioPeriodo2Seleccionado)) {
					anioperiodo2Temp=anioperiodo2Aux;
					break;
				}
			}

			if(anioperiodo2Temp!=null) {
				jComboBoxid_anio_periodo2VacacionEmpleadoGenerico.setSelectedItem(anioperiodo2Temp);
			} else {
				if(jComboBoxid_anio_periodo2VacacionEmpleadoGenerico!=null && jComboBoxid_anio_periodo2VacacionEmpleadoGenerico.getItemCount()>0) {
					jComboBoxid_anio_periodo2VacacionEmpleadoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VacacionEmpleado vacacionempleado,JComboBox jComboBoxid_empresaVacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVacacionEmpleadoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVacacionEmpleadoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vacacionempleado.setid_empresa(empresaAux.getId());
				vacacionempleado.setempresa_descripcion(VacacionEmpleadoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vacacionempleado.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(VacacionEmpleado vacacionempleado,JComboBox jComboBoxid_empleadoVacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoVacacionEmpleadoGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoVacacionEmpleadoGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				vacacionempleado.setid_empleado(empleadoAux.getId());
				vacacionempleado.setempleado_descripcion(VacacionEmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				vacacionempleado.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioPeriodo1ForeignKey(VacacionEmpleado vacacionempleado,JComboBox jComboBoxid_anio_periodo1VacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anio_periodo1VacacionEmpleadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anio_periodo1VacacionEmpleadoGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				vacacionempleado.setid_anio_periodo1(anioAux.getId());
				vacacionempleado.setanioperiodo1_descripcion(VacacionEmpleadoConstantesFunciones.getAnioPeriodo1Descripcion(anioAux));
				vacacionempleado.setAnioPeriodo1(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioPeriodo2ForeignKey(VacacionEmpleado vacacionempleado,JComboBox jComboBoxid_anio_periodo2VacacionEmpleadoGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anio_periodo2VacacionEmpleadoGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anio_periodo2VacacionEmpleadoGenerico.getSelectedItem();
			}

			if(anioAux!=null && anioAux.getId()!=null) {
				vacacionempleado.setid_anio_periodo2(anioAux.getId());
				vacacionempleado.setanioperiodo2_descripcion(VacacionEmpleadoConstantesFunciones.getAnioPeriodo2Descripcion(anioAux));
				vacacionempleado.setAnioPeriodo2(anioAux);			}
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

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
					}

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
					}

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.addItem(empleado);
							}
						}

						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAnioPeriodo1sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.removeAllItems();

							for(Anio anioperiodo1:this.anioperiodo1sForeignKey) {
								this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.addItem(anioperiodo1);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
					}

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnioPeriodo1") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.removeAllItems();

							for(Anio anioperiodo1:this.anioperiodo1sForeignKey) {
								this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.addItem(anioperiodo1);
							}
						}

						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAnioPeriodo2sForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.removeAllItems();

							for(Anio anioperiodo2:this.anioperiodo2sForeignKey) {
								this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.addItem(anioperiodo2);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { 
					}

					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnioPeriodo2") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.removeAllItems();

							for(Anio anioperiodo2:this.anioperiodo2sForeignKey) {
								this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.addItem(anioperiodo2);
							}
						}

						if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioPeriodo1ForeignKey(Anio anioperiodo1,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedItem(anioperiodo1);
						}
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setSelectedItem(anioperiodo1);
						} else {
							this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioPeriodo2ForeignKey(Anio anioperiodo2,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedItem(anioperiodo2);
						}
					} else {
						if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setSelectedItem(anioperiodo2);
						} else {
							this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVacacionEmpleado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VacacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesVacacionEmpleado(this.vacacionempleadoLogic.getVacacionEmpleados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VacacionEmpleadoConstantesFunciones.refrescarForeignKeysDescripcionesVacacionEmpleado(this.vacacionempleados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Anio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vacacionempleadoLogic.setVacacionEmpleados(this.vacacionempleados);
			vacacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VacacionEmpleadoParameterReturnGeneral getVacacionEmpleadoParameterGeneral() {
		return this.vacacionempleadoParameterGeneral;
	}
	
	public void setVacacionEmpleadoParameterGeneral(VacacionEmpleadoParameterReturnGeneral vacacionempleadoParameterGeneral) {
		this.vacacionempleadoParameterGeneral = vacacionempleadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVacacionEmpleado() {
		return isPermisoTodoVacacionEmpleado;
	}

	public void setIsPermisoTodoVacacionEmpleado(Boolean isPermisoTodoVacacionEmpleado) {
		this.isPermisoTodoVacacionEmpleado = isPermisoTodoVacacionEmpleado;
	}

	public Boolean getIsPermisoNuevoVacacionEmpleado() {
		return isPermisoNuevoVacacionEmpleado;
	}

	public void setIsPermisoNuevoVacacionEmpleado(Boolean isPermisoNuevoVacacionEmpleado) {
		this.isPermisoNuevoVacacionEmpleado = isPermisoNuevoVacacionEmpleado;
	}

	public Boolean getIsPermisoActualizarVacacionEmpleado() {
		return isPermisoActualizarVacacionEmpleado;
	}

	public void setIsPermisoActualizarVacacionEmpleado(Boolean isPermisoActualizarVacacionEmpleado) {
		this.isPermisoActualizarVacacionEmpleado = isPermisoActualizarVacacionEmpleado;
	}

	public Boolean getIsPermisoEliminarVacacionEmpleado() {
		return isPermisoEliminarVacacionEmpleado;
	}

	public void setIsPermisoEliminarVacacionEmpleado(Boolean isPermisoEliminarVacacionEmpleado) {
		this.isPermisoEliminarVacacionEmpleado = isPermisoEliminarVacacionEmpleado;
	}

	public Boolean getIsPermisoGuardarCambiosVacacionEmpleado() {
		return isPermisoGuardarCambiosVacacionEmpleado;
	}

	public void setIsPermisoGuardarCambiosVacacionEmpleado(Boolean isPermisoGuardarCambiosVacacionEmpleado) {
		this.isPermisoGuardarCambiosVacacionEmpleado = isPermisoGuardarCambiosVacacionEmpleado;
	}
	
	public Boolean getIsPermisoConsultaVacacionEmpleado() {
		return isPermisoConsultaVacacionEmpleado;
	}

	public void setIsPermisoConsultaVacacionEmpleado(Boolean isPermisoConsultaVacacionEmpleado) {
		this.isPermisoConsultaVacacionEmpleado = isPermisoConsultaVacacionEmpleado;
	}

	public Boolean getIsPermisoBusquedaVacacionEmpleado() {
		return isPermisoBusquedaVacacionEmpleado;
	}

	public void setIsPermisoBusquedaVacacionEmpleado(Boolean isPermisoBusquedaVacacionEmpleado) {
		this.isPermisoBusquedaVacacionEmpleado = isPermisoBusquedaVacacionEmpleado;
	}

	public Boolean getIsPermisoReporteVacacionEmpleado() {
		return isPermisoReporteVacacionEmpleado;
	}

	public void setIsPermisoReporteVacacionEmpleado(Boolean isPermisoReporteVacacionEmpleado) {
		this.isPermisoReporteVacacionEmpleado = isPermisoReporteVacacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionMedioVacacionEmpleado() {
		return isPermisoPaginacionMedioVacacionEmpleado;
	}

	public void setIsPermisoPaginacionMedioVacacionEmpleado(Boolean isPermisoPaginacionMedioVacacionEmpleado) {
		this.isPermisoPaginacionMedioVacacionEmpleado = isPermisoPaginacionMedioVacacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionTodoVacacionEmpleado() {
		return isPermisoPaginacionTodoVacacionEmpleado;
	}

	public void setIsPermisoPaginacionTodoVacacionEmpleado(Boolean isPermisoPaginacionTodoVacacionEmpleado) {
		this.isPermisoPaginacionTodoVacacionEmpleado = isPermisoPaginacionTodoVacacionEmpleado;
	}
	
	public Boolean getIsPermisoPaginacionAltoVacacionEmpleado() {
		return isPermisoPaginacionAltoVacacionEmpleado;
	}

	public void setIsPermisoPaginacionAltoVacacionEmpleado(Boolean isPermisoPaginacionAltoVacacionEmpleado) {
		this.isPermisoPaginacionAltoVacacionEmpleado = isPermisoPaginacionAltoVacacionEmpleado;
	}
	
	public Boolean getIsPermisoCopiarVacacionEmpleado() {
		return isPermisoCopiarVacacionEmpleado;
	}

	public void setIsPermisoCopiarVacacionEmpleado(Boolean isPermisoCopiarVacacionEmpleado) {
		this.isPermisoCopiarVacacionEmpleado = isPermisoCopiarVacacionEmpleado;
	}
	
	public Boolean getIsPermisoVerFormVacacionEmpleado() {
		return isPermisoVerFormVacacionEmpleado;
	}

	public void setIsPermisoVerFormVacacionEmpleado(Boolean isPermisoVerFormVacacionEmpleado) {
		this.isPermisoVerFormVacacionEmpleado = isPermisoVerFormVacacionEmpleado;
	}
	
	public Boolean getIsPermisoDuplicarVacacionEmpleado() {
		return isPermisoDuplicarVacacionEmpleado;
	}

	public void setIsPermisoDuplicarVacacionEmpleado(Boolean isPermisoDuplicarVacacionEmpleado) {
		this.isPermisoDuplicarVacacionEmpleado = isPermisoDuplicarVacacionEmpleado;
	}
	
	public Boolean getIsPermisoOrdenVacacionEmpleado() {
		return isPermisoOrdenVacacionEmpleado;
	}

	public void setIsPermisoOrdenVacacionEmpleado(Boolean isPermisoOrdenVacacionEmpleado) {
		this.isPermisoOrdenVacacionEmpleado = isPermisoOrdenVacacionEmpleado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVacacionEmpleado() {
		return isVisibilidadCeldaNuevoVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoVacacionEmpleado(Boolean isVisibilidadCeldaNuevoVacacionEmpleado) {
		this.isVisibilidadCeldaNuevoVacacionEmpleado = isVisibilidadCeldaNuevoVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVacacionEmpleado() {
		return isVisibilidadCeldaDuplicarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaDuplicarVacacionEmpleado(Boolean isVisibilidadCeldaDuplicarVacacionEmpleado) {
		this.isVisibilidadCeldaDuplicarVacacionEmpleado = isVisibilidadCeldaDuplicarVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVacacionEmpleado() {
		return isVisibilidadCeldaCopiarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaCopiarVacacionEmpleado(Boolean isVisibilidadCeldaCopiarVacacionEmpleado) {
		this.isVisibilidadCeldaCopiarVacacionEmpleado = isVisibilidadCeldaCopiarVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVacacionEmpleado() {
		return isVisibilidadCeldaVerFormVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaVerFormVacacionEmpleado(Boolean isVisibilidadCeldaVerFormVacacionEmpleado) {
		this.isVisibilidadCeldaVerFormVacacionEmpleado = isVisibilidadCeldaVerFormVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVacacionEmpleado() {
		return isVisibilidadCeldaOrdenVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaOrdenVacacionEmpleado(Boolean isVisibilidadCeldaOrdenVacacionEmpleado) {
		this.isVisibilidadCeldaOrdenVacacionEmpleado = isVisibilidadCeldaOrdenVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVacacionEmpleado() {
		return isVisibilidadCeldaNuevoRelacionesVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVacacionEmpleado(Boolean isVisibilidadCeldaNuevoRelacionesVacacionEmpleado) {
		this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado = isVisibilidadCeldaNuevoRelacionesVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVacacionEmpleado() {
		return isVisibilidadCeldaModificarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaModificarVacacionEmpleado(Boolean isVisibilidadCeldaModificarVacacionEmpleado) {
		this.isVisibilidadCeldaModificarVacacionEmpleado = isVisibilidadCeldaModificarVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVacacionEmpleado() {
		return isVisibilidadCeldaActualizarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaActualizarVacacionEmpleado(Boolean isVisibilidadCeldaActualizarVacacionEmpleado) {
		this.isVisibilidadCeldaActualizarVacacionEmpleado = isVisibilidadCeldaActualizarVacacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaEliminarVacacionEmpleado() {
		return isVisibilidadCeldaEliminarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaEliminarVacacionEmpleado(Boolean isVisibilidadCeldaEliminarVacacionEmpleado) {
		this.isVisibilidadCeldaEliminarVacacionEmpleado = isVisibilidadCeldaEliminarVacacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaCancelarVacacionEmpleado() {
		return isVisibilidadCeldaCancelarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaCancelarVacacionEmpleado(Boolean isVisibilidadCeldaCancelarVacacionEmpleado) {
		this.isVisibilidadCeldaCancelarVacacionEmpleado = isVisibilidadCeldaCancelarVacacionEmpleado;
	}

	public Boolean getIsVisibilidadCeldaGuardarVacacionEmpleado() {
		return isVisibilidadCeldaGuardarVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarVacacionEmpleado(Boolean isVisibilidadCeldaGuardarVacacionEmpleado) {
		this.isVisibilidadCeldaGuardarVacacionEmpleado = isVisibilidadCeldaGuardarVacacionEmpleado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVacacionEmpleado() {
		return isVisibilidadCeldaGuardarCambiosVacacionEmpleado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVacacionEmpleado(Boolean isVisibilidadCeldaGuardarCambiosVacacionEmpleado) {
		this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado = isVisibilidadCeldaGuardarCambiosVacacionEmpleado;
	}
		
	public VacacionEmpleadoSessionBean getvacacionempleadoSessionBean() {
		return this.vacacionempleadoSessionBean;
	}
	
	public void setvacacionempleadoSessionBean(VacacionEmpleadoSessionBean vacacionempleadoSessionBean) {
		this.vacacionempleadoSessionBean=vacacionempleadoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnioPeriodo1() {
		return this.isVisibilidadFK_IdAnioPeriodo1;
	}

	public void setisVisibilidadFK_IdAnioPeriodo1(Boolean isVisibilidadFK_IdAnioPeriodo1) {
		this.isVisibilidadFK_IdAnioPeriodo1=isVisibilidadFK_IdAnioPeriodo1;
	}

	public Boolean getisVisibilidadFK_IdAnioPeriodo2() {
		return this.isVisibilidadFK_IdAnioPeriodo2;
	}

	public void setisVisibilidadFK_IdAnioPeriodo2(Boolean isVisibilidadFK_IdAnioPeriodo2) {
		this.isVisibilidadFK_IdAnioPeriodo2=isVisibilidadFK_IdAnioPeriodo2;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(VacacionEmpleado vacacionempleado)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vacacionempleado,null);
				this.setActualParaGuardarEmpleadoForeignKey(vacacionempleado,null);
				this.setActualParaGuardarAnioPeriodo1ForeignKey(vacacionempleado,null);
				this.setActualParaGuardarAnioPeriodo2ForeignKey(vacacionempleado,null);
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
	
	public void bugActualizarReferenciaActual(VacacionEmpleado vacacionempleado,VacacionEmpleado vacacionempleadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVacacionEmpleado(vacacionempleado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vacacionempleadoAux.setId(vacacionempleado.getId());
		vacacionempleadoAux.setVersionRow(vacacionempleado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVacacionEmpleado();
		
			int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vacacionempleadoValidator.getInvalidValues(this.vacacionempleado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vacacionempleadoLogic.setDatosCliente(datosCliente);
			vacacionempleadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vacacionempleadoAux=new  VacacionEmpleado();
				
				vacacionempleadoAux.setIsNew(true);
				vacacionempleadoAux.setIsChanged(true);
				
				vacacionempleadoAux.setVacacionEmpleadoOriginal(this.vacacionempleado);
				
				vacacionempleadoAux.setId(this.vacacionempleado.getId());	
				vacacionempleadoAux.setVersionRow(this.vacacionempleado.getVersionRow());	
				vacacionempleadoAux.setid_empresa(this.vacacionempleado.getid_empresa());	
				vacacionempleadoAux.setid_empleado(this.vacacionempleado.getid_empleado());	
				vacacionempleadoAux.setid_anio_periodo1(this.vacacionempleado.getid_anio_periodo1());	
				vacacionempleadoAux.setid_anio_periodo2(this.vacacionempleado.getid_anio_periodo2());	
				vacacionempleadoAux.setnumero_veces(this.vacacionempleado.getnumero_veces());	
				vacacionempleadoAux.setfecha_estimada(this.vacacionempleado.getfecha_estimada());	
				vacacionempleadoAux.sethoras_vacaciones(this.vacacionempleado.gethoras_vacaciones());	
				vacacionempleadoAux.sethoras_tomados(this.vacacionempleado.gethoras_tomados());	
				vacacionempleadoAux.sethoras_pagados(this.vacacionempleado.gethoras_pagados());	
				vacacionempleadoAux.sethoras_adicionales(this.vacacionempleado.gethoras_adicionales());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vacacionempleadoAux,vacacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.saveVacacionEmpleados();//WithConnection
						//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesVacacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vacacionempleadoLogic.saveVacacionEmpleadoRelaciones(vacacionempleadoAux);//WithConnection
								//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vacacionempleadoAux,vacacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vacacionempleadoAux=new  VacacionEmpleado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado() 
					|| (this.vacacionempleadoSessionBean.getEsGuardarRelacionado() && this.vacacionempleado.getId()>=0)) {
						
					vacacionempleadoAux.setIsNew(false);
				}
				
				vacacionempleadoAux.setIsDeleted(false);
			
				vacacionempleadoAux.setId(this.vacacionempleado.getId());	
				vacacionempleadoAux.setVersionRow(this.vacacionempleado.getVersionRow());	
				vacacionempleadoAux.setid_empresa(this.vacacionempleado.getid_empresa());	
				vacacionempleadoAux.setid_empleado(this.vacacionempleado.getid_empleado());	
				vacacionempleadoAux.setid_anio_periodo1(this.vacacionempleado.getid_anio_periodo1());	
				vacacionempleadoAux.setid_anio_periodo2(this.vacacionempleado.getid_anio_periodo2());	
				vacacionempleadoAux.setnumero_veces(this.vacacionempleado.getnumero_veces());	
				vacacionempleadoAux.setfecha_estimada(this.vacacionempleado.getfecha_estimada());	
				vacacionempleadoAux.sethoras_vacaciones(this.vacacionempleado.gethoras_vacaciones());	
				vacacionempleadoAux.sethoras_tomados(this.vacacionempleado.gethoras_tomados());	
				vacacionempleadoAux.sethoras_pagados(this.vacacionempleado.gethoras_pagados());	
				vacacionempleadoAux.sethoras_adicionales(this.vacacionempleado.gethoras_adicionales());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vacacionempleadoAux,vacacionempleados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.saveVacacionEmpleados();//WithConnection
						//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);
					
					this.refrescarForeignKeysDescripcionesVacacionEmpleado();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vacacionempleadoLogic.saveVacacionEmpleadoRelaciones(vacacionempleadoAux);//WithConnection
								//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vacacionempleadoAux,vacacionempleados);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vacacionempleado,vacacionempleadoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vacacionempleadoAux=new  VacacionEmpleado();
				
				vacacionempleadoAux.setIsNew(false);
				vacacionempleadoAux.setIsChanged(false);
				
				vacacionempleadoAux.setIsDeleted(true);
				
				vacacionempleadoAux.setId(this.vacacionempleado.getId());	
				vacacionempleadoAux.setVersionRow(this.vacacionempleado.getVersionRow());	
				vacacionempleadoAux.setid_empresa(this.vacacionempleado.getid_empresa());	
				vacacionempleadoAux.setid_empleado(this.vacacionempleado.getid_empleado());	
				vacacionempleadoAux.setid_anio_periodo1(this.vacacionempleado.getid_anio_periodo1());	
				vacacionempleadoAux.setid_anio_periodo2(this.vacacionempleado.getid_anio_periodo2());	
				vacacionempleadoAux.setnumero_veces(this.vacacionempleado.getnumero_veces());	
				vacacionempleadoAux.setfecha_estimada(this.vacacionempleado.getfecha_estimada());	
				vacacionempleadoAux.sethoras_vacaciones(this.vacacionempleado.gethoras_vacaciones());	
				vacacionempleadoAux.sethoras_tomados(this.vacacionempleado.gethoras_tomados());	
				vacacionempleadoAux.sethoras_pagados(this.vacacionempleado.gethoras_pagados());	
				vacacionempleadoAux.sethoras_adicionales(this.vacacionempleado.gethoras_adicionales());	
				
				if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vacacionempleadoAux.getId()>=0) {	
						this.vacacionempleadosEliminados.add(vacacionempleadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vacacionempleadoAux,vacacionempleados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.saveVacacionEmpleados();//WithConnection
						//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vacacionempleadoLogic.saveVacacionEmpleadoRelaciones(vacacionempleadoAux);//WithConnection
								//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vacacionempleadoAux,vacacionempleadoLogic.getVacacionEmpleados());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vacacionempleadoAux,vacacionempleados);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getVacacionEmpleados().addAll(this.vacacionempleadosEliminados);
					
					vacacionempleadoLogic.saveVacacionEmpleados();//WithConnection
					//vacacionempleadoLogic.getSetVersionRowVacacionEmpleados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVacacionEmpleado();
				
				this.vacacionempleadosEliminados= new ArrayList<VacacionEmpleado>();		
			}
			
			if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vacacion Empleado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vacacionempleado=vacacionempleadoAux;
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
      		//this.finishProcessVacacionEmpleado();
      	}
		
	}	
	
	public void actualizarRelaciones(VacacionEmpleado vacacionempleadoLocal) throws Exception {
		
		if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VacacionEmpleado vacacionempleadoLocal) throws Exception {	
		if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vacacionempleadoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				vacacionempleadoLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioperiodo1BeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioperiodo1BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioperiodo1BeanSwingJInternalFrameLocal.getanio(),true);
				anioperiodo1BeanSwingJInternalFrameLocal.actualizarLista(anioperiodo1BeanSwingJInternalFrameLocal.anio,this.anioperiodo1sForeignKey);

				anioperiodo1BeanSwingJInternalFrameLocal.actualizarRelaciones(anioperiodo1BeanSwingJInternalFrameLocal.anio);

				vacacionempleadoLocal.setAnioPeriodo1(anioperiodo1BeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnioPeriodo1();
				this.cargarCombosFrameAnioPeriodo1sForeignKey("Formulario");
				this.setActualAnioPeriodo1ForeignKey(anioperiodo1BeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioperiodo2BeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioperiodo2BeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioperiodo2BeanSwingJInternalFrameLocal.getanio(),true);
				anioperiodo2BeanSwingJInternalFrameLocal.actualizarLista(anioperiodo2BeanSwingJInternalFrameLocal.anio,this.anioperiodo2sForeignKey);

				anioperiodo2BeanSwingJInternalFrameLocal.actualizarRelaciones(anioperiodo2BeanSwingJInternalFrameLocal.anio);

				vacacionempleadoLocal.setAnioPeriodo2(anioperiodo2BeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnioPeriodo2();
				this.cargarCombosFrameAnioPeriodo2sForeignKey("Formulario");
				this.setActualAnioPeriodo2ForeignKey(anioperiodo2BeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVacacionEmpleadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vacacionempleadoValidator.getInvalidValues(this.vacacionempleado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VacacionEmpleado vacacionempleado,List<VacacionEmpleado> vacacionempleados) throws Exception {
		try	{		
			VacacionEmpleadoConstantesFunciones.actualizarLista(vacacionempleado,vacacionempleados,this.vacacionempleadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VacacionEmpleado vacacionempleado,List<VacacionEmpleado> vacacionempleados) throws Exception {
		try	{			
			VacacionEmpleadoConstantesFunciones.actualizarSelectedLista(vacacionempleado,vacacionempleados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VacacionEmpleado> vacacionempleadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vacacionempleadosLocal=this.vacacionempleadoLogic.getVacacionEmpleados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vacacionempleadosLocal=this.vacacionempleados;
			}
			//ARCHITECTURE
		
			for(VacacionEmpleado vacacionempleadoLocal:vacacionempleadosLocal) {
				if(this.permiteMantenimiento(vacacionempleadoLocal) && vacacionempleadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VacacionEmpleadoConstantesFunciones.getVacacionEmpleadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_empresaVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_empleadoVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.IDANIOPERIODO1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_anio_periodo1VacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.IDANIOPERIODO2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_anio_periodo2VacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.NUMEROVECES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelnumero_vecesVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.FECHAESTIMADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelfecha_estimadaVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.HORASVACACIONES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_vacacionesVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.HORASTOMADOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_tomadosVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.HORASPAGADOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_pagadosVacacionEmpleado,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VacacionEmpleadoConstantesFunciones.HORASADICIONALES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_adicionalesVacacionEmpleado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_empresaVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_empleadoVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_anio_periodo1VacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelid_anio_periodo2VacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelnumero_vecesVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelfecha_estimadaVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_vacacionesVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_tomadosVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_pagadosVacacionEmpleado,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_adicionalesVacacionEmpleado,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVacacionEmpleado--;	
		
		
		this.vacacionempleadoAux=new VacacionEmpleado();
		
		this.vacacionempleadoAux.setId(this.iIdNuevoVacacionEmpleado);
		this.vacacionempleadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vacacionempleadoLogic.getVacacionEmpleados().add(this.vacacionempleadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vacacionempleados.add(this.vacacionempleadoAux);
		}
		//ARCHITECTURE
		
		this.vacacionempleado=this.vacacionempleadoAux;
		
		if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleado);
			this.setVariablesObjetoActualToFormularioForeignKeyVacacionEmpleado(this.vacacionempleado);
		}
				
		//this.setDefaultControlesVacacionEmpleado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVacacionEmpleado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVacacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVacacionEmpleado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVacacionEmpleado(this.vacacionempleadoBean,this.vacacionempleado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
			classes=VacacionEmpleadoConstantesFunciones.getClassesRelationshipsOfVacacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vacacionempleadoReturnGeneral=vacacionempleadoLogic.procesarEventosVacacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vacacionempleadoLogic.getVacacionEmpleados(),this.vacacionempleado,this.vacacionempleadoParameterGeneral,this.isEsNuevoVacacionEmpleado,classes);//this.vacacionempleadoLogic.getVacacionEmpleado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVacacionEmpleado(this.vacacionempleadoReturnGeneral,this.vacacionempleadoBean,false);
		
		if(this.vacacionempleadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado());
		}
		
		if(this.vacacionempleadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado(),classes);//this.vacacionempleadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVacacionEmpleado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVacacionEmpleado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarFormVacacionEmpleado(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVacacionEmpleado(false);
						
			if(vacacionempleadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVacacionEmpleado();
			}
			
			this.actualizarVisualTableDatosVacacionEmpleado();
			
			this.jTableDatosVacacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoVacacionEmpleado(), this.getIndiceNuevoVacacionEmpleado());
			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
						
			this.actualizarEstadoCeldasBotonesVacacionEmpleado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVacacionEmpleado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarnumero_vecesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarfecha_estimadaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarhoras_vacacionesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarhoras_tomadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarhoras_pagadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarhoras_adicionalesVacacionEmpleado);	
		//
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarid_empresaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarid_empleadoVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarid_anio_periodo1VacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setEnabled(isHabilitar && this.vacacionempleadoConstantesFunciones.activarid_anio_periodo2VacacionEmpleado);
	};
	
	public void setDefaultControlesVacacionEmpleado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVacacionEmpleado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vacacionempleadoSessionBean.setConGuardarRelaciones(true);			
			this.vacacionempleadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.setVisible(true);
			
					
		} else {
			//this.vacacionempleadoSessionBean.setConGuardarRelaciones(false);			
			this.vacacionempleadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVacacionEmpleado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
				if(vacacionempleadoAux.getId().equals(this.iIdNuevoVacacionEmpleado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleados) {
				if(vacacionempleadoAux.getId().equals(this.iIdNuevoVacacionEmpleado)) {
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
	
	public int getIndiceActualVacacionEmpleado(VacacionEmpleado vacacionempleado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
				if(vacacionempleadoAux.getId().equals(vacacionempleado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleados) {
				if(vacacionempleadoAux.getId().equals(vacacionempleado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVacacionEmpleado(VacacionEmpleado vacacionempleadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
				if(vacacionempleadoAux.getVacacionEmpleadoOriginal().getId().equals(vacacionempleadoOriginal.getId())) {
					existe=true;
					vacacionempleadoOriginal.setId(vacacionempleadoAux.getId());
					vacacionempleadoOriginal.setVersionRow(vacacionempleadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleados) {
				if(vacacionempleadoAux.getVacacionEmpleadoOriginal().getId().equals(vacacionempleadoOriginal.getId())) {
					existe=true;
					vacacionempleadoOriginal.setId(vacacionempleadoAux.getId());
					vacacionempleadoOriginal.setVersionRow(vacacionempleadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVacacionEmpleado(Boolean esParaCancelar) throws Exception {
		vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
		vacacionempleadoAux=new VacacionEmpleado();
		
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
					if(vacacionempleadoAux.getId()<0) {
						vacacionempleadosAux.add(vacacionempleadoAux);
					}		
				}
				this.iIdNuevoVacacionEmpleado=0L;
				this.vacacionempleadoLogic.getVacacionEmpleados().removeAll(vacacionempleadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleados) {
					if(vacacionempleadoAux.getId()<0) {
						vacacionempleadosAux.add(vacacionempleadoAux);
					}		
				}
				this.iIdNuevoVacacionEmpleado=0L;
				this.vacacionempleados.removeAll(vacacionempleadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVacacionEmpleado 
					&& this.vacacionempleadoLogic.getVacacionEmpleados().size()>0
					) {
					vacacionempleadoAux=this.vacacionempleadoLogic.getVacacionEmpleados().get(this.vacacionempleadoLogic.getVacacionEmpleados().size() - 1);
				
					if(vacacionempleadoAux.getId()<0) {
						this.vacacionempleadoLogic.getVacacionEmpleados().remove(vacacionempleadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVacacionEmpleado && this.vacacionempleados.size()>0) {
					vacacionempleadoAux=this.vacacionempleados.get(this.vacacionempleados.size() - 1);
				
					if(vacacionempleadoAux.getId()<0) {
						this.vacacionempleados.remove(vacacionempleadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVacacionEmpleado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vacacionempleado.getId()<0) {
				this.vacacionempleadoLogic.getVacacionEmpleados().remove(this.vacacionempleado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vacacionempleado.getId()<0) {
				this.vacacionempleados.remove(this.vacacionempleado);
			}
		}			
	}
	
	public void setEstadosInicialesVacacionEmpleado(List<VacacionEmpleado> vacacionempleadosAux) throws Exception {
		VacacionEmpleadoConstantesFunciones.setEstadosInicialesVacacionEmpleado(vacacionempleadosAux);
	}
	
	public void setEstadosInicialesVacacionEmpleado(VacacionEmpleado vacacionempleadoAux) throws Exception {
		VacacionEmpleadoConstantesFunciones.setEstadosInicialesVacacionEmpleado(vacacionempleadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVacacionEmpleadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVacacionEmpleadoActual()) {
				if(!this.isEsNuevoVacacionEmpleado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVacacionEmpleado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVacacionEmpleadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vacacion Empleado ?", "MANTENIMIENTO DE Vacacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VacacionEmpleado vacacionempleado) throws Exception {
		VacacionEmpleadoConstantesFunciones.seleccionarAsignar(this.vacacionempleado,vacacionempleado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVacacionEmpleado=this.isPermisoActualizarOriginalVacacionEmpleado;
			
			
			this.seleccionarAsignar(vacacionempleado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VacacionEmpleadoConstantesFunciones.quitarEspaciosVacacionEmpleado(this.vacacionempleado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVacacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vacacionempleadoSessionBean.setsFuncionBusquedaRapida(this.vacacionempleadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVacacionEmpleado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVacacionEmpleado(esParaCancelar);				
				this.cancelarNuevoVacacionEmpleado(esParaCancelar);								
			}
			
			this.vacacionempleado=new VacacionEmpleado();
			
			this.inicializarVacacionEmpleado();
			
			this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVacacionEmpleado() throws Exception {
		try {
			VacacionEmpleadoConstantesFunciones.inicializarVacacionEmpleado(this.vacacionempleado);
			
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
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vacacionempleadoLogic.getVacacionEmpleados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVacacionEmpleados(String sAccionBusqueda,List<VacacionEmpleado> vacacionempleadosParaReportes) throws Exception {
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
					sPathReporteFinal="VacacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VacacionEmpleadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VacacionEmpleadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VacacionEmpleado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vacacion Empleados");		
		parameters.put("busquedapor", VacacionEmpleadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVacacionEmpleado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VacacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VacacionEmpleadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVacacionEmpleado=new JRBeanArrayDataSource(VacacionEmpleadoJInternalFrame.TraerVacacionEmpleadoBeans(vacacionempleadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVacacionEmpleado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VacacionEmpleadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VacacionEmpleadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VacacionEmpleadoBean.TraerVacacionEmpleadoBeans(vacacionempleadosParaReportes).toArray()));
							
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
				this.generarExcelReporteVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVacacionEmpleadoActionPerformed(null);
					//this.generarExcelReporteVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVacacionEmpleados(sAccionBusqueda,sTipoArchivoReporte,vacacionempleadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVacacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<VacacionEmpleado> vacacionempleadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VacacionEmpleados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVacacionEmpleado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VacacionEmpleado vacacionempleado : vacacionempleadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VacacionEmpleadoConstantesFunciones.generarExcelReporteDataVacacionEmpleado("NORMAL",row,workbook,vacacionempleado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVacacionEmpleado(String sTipo,Row row,Workbook workbook) {
		
		VacacionEmpleadoConstantesFunciones.generarExcelReporteHeaderVacacionEmpleado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVacacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<VacacionEmpleado> vacacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VacacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VacacionEmpleado vacacionempleado : vacacionempleadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VacacionEmpleadoConstantesFunciones.getVacacionEmpleadoDescripcion(vacacionempleado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getanioperiodo1_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getanioperiodo2_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getnumero_veces());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.getfecha_estimada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.gethoras_vacaciones());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.gethoras_tomados());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.gethoras_pagados());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vacacionempleado.gethoras_adicionales());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVacacionEmpleados(String sAccionBusqueda,String sTipoArchivoReporte,List<VacacionEmpleado> vacacionempleadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VacacionEmpleado> vacacionempleadosRespaldo=null;
		
		classes=VacacionEmpleadoConstantesFunciones.getClassesRelationshipsOfVacacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vacacionempleadoLogic.setDatosCliente(this.datosCliente);
		this.vacacionempleadoLogic.setDatosDeep(this.datosDeep);
		this.vacacionempleadoLogic.setIsConDeep(true);
		
		vacacionempleadosRespaldo=this.vacacionempleadoLogic.getVacacionEmpleados();
		
		this.vacacionempleadoLogic.setVacacionEmpleados(vacacionempleadosParaReportes);	
		this.vacacionempleadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vacacionempleadosParaReportes=this.vacacionempleadoLogic.getVacacionEmpleados();
		this.vacacionempleadoLogic.setVacacionEmpleados(vacacionempleadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VacacionEmpleados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVacacionEmpleado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VacacionEmpleado vacacionempleado : vacacionempleadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVacacionEmpleado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VacacionEmpleadoConstantesFunciones.generarExcelReporteDataVacacionEmpleado("NORMAL",row,workbook,vacacionempleado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VacacionEmpleadoConstantesFunciones.getVacacionEmpleadoDescripcion(vacacionempleado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVacacionEmpleado() throws Exception {		
		this.startProcessVacacionEmpleado(true);
	}
	
	public void startProcessVacacionEmpleado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVacacionEmpleado ,this.jPanelParametrosReportesVacacionEmpleado, this.jScrollPanelDatosVacacionEmpleado,this.jPanelPaginacionVacacionEmpleado, this.jScrollPanelDatosEdicionVacacionEmpleado, this.jPanelAccionesVacacionEmpleado,this.jPanelAccionesFormularioVacacionEmpleado,this.jmenuBarVacacionEmpleado,this.jmenuBarDetalleVacacionEmpleado,this.jTtoolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasVacacionEmpleado=this.jTabbedPaneBusquedasVacacionEmpleado; 
		
		final JPanel jPanelParametrosReportesVacacionEmpleado=this.jPanelParametrosReportesVacacionEmpleado;
		//final JScrollPane jScrollPanelDatosVacacionEmpleado=this.jScrollPanelDatosVacacionEmpleado;
		final JTable jTableDatosVacacionEmpleado=this.jTableDatosVacacionEmpleado;		
		final JPanel jPanelPaginacionVacacionEmpleado=this.jPanelPaginacionVacacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionVacacionEmpleado=this.jScrollPanelDatosEdicionVacacionEmpleado;
		final JPanel jPanelAccionesVacacionEmpleado=this.jPanelAccionesVacacionEmpleado;
		
		JPanel jPanelCamposAuxiliarVacacionEmpleado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVacacionEmpleado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			jPanelCamposAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jPanelCamposVacacionEmpleado;
			jPanelAccionesFormularioAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jPanelAccionesFormularioVacacionEmpleado;
		}
		
		final JPanel jPanelCamposVacacionEmpleado=jPanelCamposAuxiliarVacacionEmpleado;
		final JPanel jPanelAccionesFormularioVacacionEmpleado=jPanelAccionesFormularioAuxiliarVacacionEmpleado;
		
		
		final JMenuBar jmenuBarVacacionEmpleado=this.jmenuBarVacacionEmpleado;
		final JToolBar jTtoolBarVacacionEmpleado=this.jTtoolBarVacacionEmpleado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVacacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVacacionEmpleado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jmenuBarDetalleVacacionEmpleado;
			jTtoolBarDetalleAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jTtoolBarDetalleVacacionEmpleado;
		}
		
		final JMenuBar jmenuBarDetalleVacacionEmpleado=jmenuBarDetalleAuxiliarVacacionEmpleado;
		final JToolBar jTtoolBarDetalleVacacionEmpleado=jTtoolBarDetalleAuxiliarVacacionEmpleado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVacacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVacacionEmpleado;
			processRunnable.jTableDatos=jTableDatosVacacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposVacacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionVacacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesVacacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVacacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarVacacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVacacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarVacacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVacacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVacacionEmpleado ,jPanelParametrosReportesVacacionEmpleado,jTableDatosVacacionEmpleado, /*jScrollPanelDatosVacacionEmpleado,*/jPanelCamposVacacionEmpleado,jPanelPaginacionVacacionEmpleado, /*jScrollPanelDatosEdicionVacacionEmpleado,*/ jPanelAccionesVacacionEmpleado,jPanelAccionesFormularioVacacionEmpleado,jmenuBarVacacionEmpleado,jmenuBarDetalleVacacionEmpleado,jTtoolBarVacacionEmpleado,jTtoolBarDetalleVacacionEmpleado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVacacionEmpleado ,jPanelParametrosReportesVacacionEmpleado, jScrollPanelDatosVacacionEmpleado,jPanelPaginacionVacacionEmpleado, jScrollPanelDatosEdicionVacacionEmpleado, jPanelAccionesVacacionEmpleado,jPanelAccionesFormularioVacacionEmpleado,jmenuBarVacacionEmpleado,jmenuBarDetalleVacacionEmpleado,jTtoolBarVacacionEmpleado,jTtoolBarDetalleVacacionEmpleado);
						
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
	
	public void finishProcessVacacionEmpleado() {// throws Exception 
		this.finishProcessVacacionEmpleado(true);
	}
	
	public void finishProcessVacacionEmpleado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVacacionEmpleado ,this.jPanelParametrosReportesVacacionEmpleado, this.jScrollPanelDatosVacacionEmpleado,this.jPanelPaginacionVacacionEmpleado, this.jScrollPanelDatosEdicionVacacionEmpleado, this.jPanelAccionesVacacionEmpleado,this.jPanelAccionesFormularioVacacionEmpleado,this.jmenuBarVacacionEmpleado,this.jmenuBarDetalleVacacionEmpleado,this.jTtoolBarVacacionEmpleado,this.jTtoolBarDetalleVacacionEmpleado);		
		
		final JTabbedPane jTabbedPaneBusquedasVacacionEmpleado=this.jTabbedPaneBusquedasVacacionEmpleado; 
		
		final JPanel jPanelParametrosReportesVacacionEmpleado=this.jPanelParametrosReportesVacacionEmpleado;
		//final JScrollPane jScrollPanelDatosVacacionEmpleado=this.jScrollPanelDatosVacacionEmpleado;
		final JTable jTableDatosVacacionEmpleado=this.jTableDatosVacacionEmpleado;		
		final JPanel jPanelPaginacionVacacionEmpleado=this.jPanelPaginacionVacacionEmpleado;
		//final JScrollPane jScrollPanelDatosEdicionVacacionEmpleado=this.jScrollPanelDatosEdicionVacacionEmpleado;
		final JPanel jPanelAccionesVacacionEmpleado=this.jPanelAccionesVacacionEmpleado;
		
		JPanel jPanelCamposAuxiliarVacacionEmpleado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVacacionEmpleado=new JPanel();
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			jPanelCamposAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jPanelCamposVacacionEmpleado;
			jPanelAccionesFormularioAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jPanelAccionesFormularioVacacionEmpleado;
		}
		
		final JPanel jPanelCamposVacacionEmpleado=jPanelCamposAuxiliarVacacionEmpleado;
		final JPanel jPanelAccionesFormularioVacacionEmpleado=jPanelAccionesFormularioAuxiliarVacacionEmpleado;
		
		
		final JMenuBar jmenuBarVacacionEmpleado=this.jmenuBarVacacionEmpleado;		
		final JToolBar jTtoolBarVacacionEmpleado=this.jTtoolBarVacacionEmpleado;
				
		JMenuBar jmenuBarDetalleAuxiliarVacacionEmpleado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVacacionEmpleado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			jmenuBarDetalleAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jmenuBarDetalleVacacionEmpleado;
			jTtoolBarDetalleAuxiliarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jTtoolBarDetalleVacacionEmpleado;		
		}
		
		final JMenuBar jmenuBarDetalleVacacionEmpleado=jmenuBarDetalleAuxiliarVacacionEmpleado;
		final JToolBar jTtoolBarDetalleVacacionEmpleado=jTtoolBarDetalleAuxiliarVacacionEmpleado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVacacionEmpleado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVacacionEmpleado;
			processRunnable.jTableDatos=jTableDatosVacacionEmpleado;
			processRunnable.jPanelCampos=jPanelCamposVacacionEmpleado;
			processRunnable.jPanelPaginacion=jPanelPaginacionVacacionEmpleado;
			processRunnable.jPanelAcciones=jPanelAccionesVacacionEmpleado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVacacionEmpleado;
			
			
			processRunnable.jmenuBar=jmenuBarVacacionEmpleado;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVacacionEmpleado;
			processRunnable.jTtoolBar=jTtoolBarVacacionEmpleado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVacacionEmpleado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVacacionEmpleado ,jPanelParametrosReportesVacacionEmpleado, jTableDatosVacacionEmpleado,/*jScrollPanelDatosVacacionEmpleado,*/jPanelCamposVacacionEmpleado,jPanelPaginacionVacacionEmpleado, /*jScrollPanelDatosEdicionVacacionEmpleado,*/ jPanelAccionesVacacionEmpleado,jPanelAccionesFormularioVacacionEmpleado,jmenuBarVacacionEmpleado,jmenuBarDetalleVacacionEmpleado,jTtoolBarVacacionEmpleado,jTtoolBarDetalleVacacionEmpleado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVacacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVacacionEmpleado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVacacionEmpleado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVacacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVacacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVacacionEmpleado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVacacionEmpleado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVacacionEmpleado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVacacionEmpleado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vacacionempleadoConstantesFunciones.getsFinalQueryVacacionEmpleado();
		String  finalQueryPaginacionTodos=this.vacacionempleadoConstantesFunciones.getsFinalQueryVacacionEmpleado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VacacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesNoVacacionEmpleado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VacacionEmpleadoConstantesFunciones.getArrayColumnasGlobalesVacacionEmpleado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VacacionEmpleadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vacacionempleadosEliminados= new ArrayList<VacacionEmpleado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVacacionEmpleado();
		
				///*VacacionEmpleadoSessionBean*/this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			
			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
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
					this.iNumeroPaginacion=VacacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VacacionEmpleadoConstantesFunciones.getClassesForeignKeysOfVacacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vacacionempleado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vacacionempleadosAux= new ArrayList<VacacionEmpleado>();
			
				
			vacacionempleadoLogic.setDatosCliente(this.datosCliente);
			vacacionempleadoLogic.setDatosDeep(this.datosDeep);
			vacacionempleadoLogic.setIsConDeep(true);
			
			
			vacacionempleadoLogic.getVacacionEmpleadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vacacionempleadoLogic.getTodosVacacionEmpleados(finalQueryGlobal,pagination);
					
					//vacacionempleadoLogic.getTodosVacacionEmpleadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vacacionempleadoLogic.getVacacionEmpleados()==null|| vacacionempleadoLogic.getVacacionEmpleados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vacacionempleadosAux= new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleadoLogic.getVacacionEmpleados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadosAux= new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vacacionempleadoLogic.getTodosVacacionEmpleados(finalQueryGlobal+"",this.pagination);												
							
							//vacacionempleadoLogic.getTodosVacacionEmpleadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVacacionEmpleados("Todos",vacacionempleadoLogic.getVacacionEmpleados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());					
							vacacionempleadoLogic.getVacacionEmpleados().addAll(vacacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleados=new ArrayList<VacacionEmpleado>();
							vacacionempleados.addAll(vacacionempleadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVacacionEmpleado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVacacionEmpleado=this.idActual;
				
				} else if(this.idVacacionEmpleadoActual!=null && this.idVacacionEmpleadoActual!=0L) {
					idVacacionEmpleado=idVacacionEmpleadoActual;
				}
				
					
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndicePorId(idVacacionEmpleado);
				
				this.vacacionempleados=new ArrayList<VacacionEmpleado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vacacionempleadoLogic.getEntity(idVacacionEmpleado);
					
					//vacacionempleadoLogic.getEntityWithConnection(idVacacionEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());
					vacacionempleadoLogic.getVacacionEmpleados().add(vacacionempleadoLogic.getVacacionEmpleado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleados=new ArrayList<VacacionEmpleado>();
					this.vacacionempleados.add(vacacionempleado);
				}
				
				if(vacacionempleadoLogic.getVacacionEmpleado()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnioPeriodo1")) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo1(id_anio_periodo1FK_IdAnioPeriodo1);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo1(finalQueryGlobal,pagination,id_anio_periodo1FK_IdAnioPeriodo1);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo1(id_anio_periodo1FK_IdAnioPeriodo1);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo1(id_anio_periodo1FK_IdAnioPeriodo1);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vacacionempleadoLogic.getVacacionEmpleados()==null||vacacionempleadoLogic.getVacacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vacacionempleados==null|| vacacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
						vacacionempleadosAux.addAll(vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo1(finalQueryGlobal,pagination,id_anio_periodo1FK_IdAnioPeriodo1);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo1(id_anio_periodo1FK_IdAnioPeriodo1);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo1(id_anio_periodo1FK_IdAnioPeriodo1);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVacacionEmpleados("FK_IdAnioPeriodo1",vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVacacionEmpleados("FK_IdAnioPeriodo1",vacacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());
						vacacionempleadoLogic.getVacacionEmpleados().addAll(vacacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleados=new ArrayList<VacacionEmpleado>();
							vacacionempleados.addAll(vacacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdAnioPeriodo2")) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo2(id_anio_periodo2FK_IdAnioPeriodo2);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo2(finalQueryGlobal,pagination,id_anio_periodo2FK_IdAnioPeriodo2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo2(id_anio_periodo2FK_IdAnioPeriodo2);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo2(id_anio_periodo2FK_IdAnioPeriodo2);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vacacionempleadoLogic.getVacacionEmpleados()==null||vacacionempleadoLogic.getVacacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vacacionempleados==null|| vacacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
						vacacionempleadosAux.addAll(vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo2(finalQueryGlobal,pagination,id_anio_periodo2FK_IdAnioPeriodo2);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo2(id_anio_periodo2FK_IdAnioPeriodo2);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdAnioPeriodo2(id_anio_periodo2FK_IdAnioPeriodo2);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVacacionEmpleados("FK_IdAnioPeriodo2",vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVacacionEmpleados("FK_IdAnioPeriodo2",vacacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());
						vacacionempleadoLogic.getVacacionEmpleados().addAll(vacacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleados=new ArrayList<VacacionEmpleado>();
							vacacionempleados.addAll(vacacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vacacionempleadoLogic.getVacacionEmpleados()==null||vacacionempleadoLogic.getVacacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vacacionempleados==null|| vacacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
						vacacionempleadosAux.addAll(vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVacacionEmpleados("FK_IdEmpleado",vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVacacionEmpleados("FK_IdEmpleado",vacacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());
						vacacionempleadoLogic.getVacacionEmpleados().addAll(vacacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleados=new ArrayList<VacacionEmpleado>();
							vacacionempleados.addAll(vacacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vacacionempleadoLogic.getVacacionEmpleados()==null||vacacionempleadoLogic.getVacacionEmpleados().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vacacionempleados==null|| vacacionempleados.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
						vacacionempleadosAux.addAll(vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadosAux=new ArrayList<VacacionEmpleado>();
							vacacionempleadosAux.addAll(vacacionempleados);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VacacionEmpleadoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVacacionEmpleados("FK_IdEmpresa",vacacionempleadoLogic.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVacacionEmpleados("FK_IdEmpresa",vacacionempleados);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoLogic.setVacacionEmpleados(new ArrayList<VacacionEmpleado>());
						vacacionempleadoLogic.getVacacionEmpleados().addAll(vacacionempleadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleados=new ArrayList<VacacionEmpleado>();
							vacacionempleados.addAll(vacacionempleadosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVacacionEmpleado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVacacionEmpleado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vacacionempleadoLogic.getVacacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vacacionempleados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vacacionempleadoLogic.getVacacionEmpleados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vacacionempleados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VacacionEmpleado vacacionempleado) {
		Boolean permite=true;
		
		if(this.vacacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VacacionEmpleadoConstantesFunciones.getOrderByListaVacacionEmpleado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VacacionEmpleadoConstantesFunciones.getOrderByListaVacacionEmpleado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VacacionEmpleado vacacionempleado:vacacionempleadoLogic.getVacacionEmpleados()) {
				if(vacacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					vacacionempleadoTotales=vacacionempleado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VacacionEmpleado vacacionempleado:this.vacacionempleados) {
				if(vacacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					vacacionempleadoTotales=vacacionempleado;
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
			this.vacacionempleadoAux=new VacacionEmpleado();
			this.vacacionempleadoAux.setsType(Constantes2.S_TOTALES);
			this.vacacionempleadoAux.setIsNew(false);
			this.vacacionempleadoAux.setIsChanged(false);
			this.vacacionempleadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VacacionEmpleadoConstantesFunciones.TotalizarValoresFilaVacacionEmpleado(this.vacacionempleadoLogic.getVacacionEmpleados(),this.vacacionempleadoAux);
				
				this.vacacionempleadoLogic.getVacacionEmpleados().add(this.vacacionempleadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VacacionEmpleadoConstantesFunciones.TotalizarValoresFilaVacacionEmpleado(this.vacacionempleados,this.vacacionempleadoAux);
				
				this.vacacionempleados.add(this.vacacionempleadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vacacionempleadoTotales=new VacacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vacacionempleadoLogic.getVacacionEmpleados().remove(vacacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vacacionempleados.remove(vacacionempleadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vacacionempleadoTotales=new VacacionEmpleado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VacacionEmpleado vacacionempleado:vacacionempleadoLogic.getVacacionEmpleados()) {
				if(vacacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					vacacionempleadoTotales=vacacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VacacionEmpleadoConstantesFunciones.TotalizarValoresFilaVacacionEmpleado(this.vacacionempleadoLogic.getVacacionEmpleados(),vacacionempleadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VacacionEmpleado vacacionempleado:this.vacacionempleados) {
				if(vacacionempleado.getsType().equals(Constantes2.S_TOTALES)) {
					vacacionempleadoTotales=vacacionempleado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VacacionEmpleadoConstantesFunciones.TotalizarValoresFilaVacacionEmpleado(this.vacacionempleados,vacacionempleadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVacacionEmpleadosFK_IdAnioPeriodo1()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnioPeriodo1";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVacacionEmpleadosFK_IdAnioPeriodo2()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnioPeriodo2";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVacacionEmpleadosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVacacionEmpleadosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVacacionEmpleadosFK_IdAnioPeriodo1(String sFinalQuery,Long id_anio_periodo1)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo1(sFinalQuery,this.pagination,id_anio_periodo1);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVacacionEmpleadosFK_IdAnioPeriodo2(String sFinalQuery,Long id_anio_periodo2)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLogic.getVacacionEmpleadosFK_IdAnioPeriodo2(sFinalQuery,this.pagination,id_anio_periodo2);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVacacionEmpleadosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVacacionEmpleadosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLogic.getVacacionEmpleadosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosVacacionEmpleado() {
		this.isPermisoTodoVacacionEmpleado=false;
		this.isPermisoNuevoVacacionEmpleado=false;
		this.isPermisoActualizarVacacionEmpleado=false;
		this.isPermisoActualizarOriginalVacacionEmpleado=false;
		this.isPermisoEliminarVacacionEmpleado=false;
		this.isPermisoGuardarCambiosVacacionEmpleado=false;
		this.isPermisoConsultaVacacionEmpleado=false;
		this.isPermisoBusquedaVacacionEmpleado=false;
		this.isPermisoReporteVacacionEmpleado=false;		
		this.isPermisoOrdenVacacionEmpleado=false;		
		this.isPermisoPaginacionMedioVacacionEmpleado=false;		
		this.isPermisoPaginacionAltoVacacionEmpleado=false;
		this.isPermisoPaginacionTodoVacacionEmpleado=false;
		this.isPermisoCopiarVacacionEmpleado=false;		
		this.isPermisoVerFormVacacionEmpleado=false;		
		this.isPermisoDuplicarVacacionEmpleado=false;		
		this.isPermisoOrdenVacacionEmpleado=false;		
	}
	
	public void setPermisosUsuarioVacacionEmpleado(Boolean isPermiso) {
		this.isPermisoTodoVacacionEmpleado=isPermiso;
		this.isPermisoNuevoVacacionEmpleado=isPermiso;
		this.isPermisoActualizarVacacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalVacacionEmpleado=isPermiso;
		this.isPermisoEliminarVacacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosVacacionEmpleado=isPermiso;
		this.isPermisoConsultaVacacionEmpleado=isPermiso;
		this.isPermisoBusquedaVacacionEmpleado=isPermiso;
		this.isPermisoReporteVacacionEmpleado=isPermiso;
		this.isPermisoOrdenVacacionEmpleado=isPermiso;		
		this.isPermisoPaginacionMedioVacacionEmpleado=isPermiso;		
		this.isPermisoPaginacionAltoVacacionEmpleado=isPermiso;		
		this.isPermisoPaginacionTodoVacacionEmpleado=isPermiso;		
		this.isPermisoCopiarVacacionEmpleado=isPermiso;		
		this.isPermisoVerFormVacacionEmpleado=isPermiso;		
		this.isPermisoDuplicarVacacionEmpleado=isPermiso;
		this.isPermisoOrdenVacacionEmpleado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVacacionEmpleado(Boolean isPermiso) {
		//this.isPermisoTodoVacacionEmpleado=isPermiso;
		this.isPermisoNuevoVacacionEmpleado=isPermiso;
		this.isPermisoActualizarVacacionEmpleado=isPermiso;
		this.isPermisoActualizarOriginalVacacionEmpleado=isPermiso;
		this.isPermisoEliminarVacacionEmpleado=isPermiso;
		this.isPermisoGuardarCambiosVacacionEmpleado=isPermiso;
		//this.isPermisoConsultaVacacionEmpleado=isPermiso;
		//this.isPermisoBusquedaVacacionEmpleado=isPermiso;
		//this.isPermisoReporteVacacionEmpleado=isPermiso;
		//this.isPermisoOrdenVacacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionMedioVacacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionAltoVacacionEmpleado=isPermiso;		
		//this.isPermisoPaginacionTodoVacacionEmpleado=isPermiso;		
		//this.isPermisoCopiarVacacionEmpleado=isPermiso;		
		//this.isPermisoDuplicarVacacionEmpleado=isPermiso;
		//this.isPermisoOrdenVacacionEmpleado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVacacionEmpleadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VacacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVacacionEmpleado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVacacionEmpleadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVacacionEmpleadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVacacionEmpleadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVacacionEmpleadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVacacionEmpleado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VacacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VacacionEmpleadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVacacionEmpleado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVacacionEmpleado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVacacionEmpleado=this.isPermisoActualizarVacacionEmpleado;
			this.isPermisoEliminarVacacionEmpleado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVacacionEmpleado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVacacionEmpleado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVacacionEmpleado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVacacionEmpleado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVacacionEmpleado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVacacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVacacionEmpleado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVacacionEmpleado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVacacionEmpleado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVacacionEmpleado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVacacionEmpleado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVacacionEmpleado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVacacionEmpleado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVacacionEmpleado.setToolTipText(this.jTableDatosVacacionEmpleado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVacacionEmpleado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVacacionEmpleado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VacacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VacacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVacacionEmpleado() throws Exception {
		Reporte reporte=null;
		
		
		
		
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
	public void inicializarCombosForeignKeyVacacionEmpleadoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.anioperiodo1sForeignKey=new ArrayList();
				this.anioperiodo2sForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVacacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VacacionEmpleadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVacacionEmpleadoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioPeriodo1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioPeriodo2Listas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioPeriodo1Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.anioperiodo1sForeignKey==null||this.anioperiodo1sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAnioPeriodo1sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioPeriodo2Listas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.anioperiodo2sForeignKey==null||this.anioperiodo2sForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAnioPeriodo2sForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVacacionEmpleadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VacacionEmpleadoParameterReturnGeneral vacacionempleadoReturnGeneral=new VacacionEmpleadoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vacacionempleadoConstantesFunciones.cargarid_empresaVacacionEmpleado)
					 || (this.esRecargarFks && this.vacacionempleadoConstantesFunciones.cargarid_empresaVacacionEmpleado)) {

					if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vacacionempleadoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.vacacionempleadoConstantesFunciones.cargarid_empleadoVacacionEmpleado)
					 || (this.esRecargarFks && this.vacacionempleadoConstantesFunciones.cargarid_empleadoVacacionEmpleado)) {

					if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+vacacionempleadoSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalAnioPeriodo1="";

				if(((this.anioperiodo1sForeignKey==null||this.anioperiodo1sForeignKey.size()<=0) && this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo1VacacionEmpleado)
					 || (this.esRecargarFks && this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo1VacacionEmpleado)) {

					if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo1()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnioPeriodo1=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnioPeriodo1=Funciones.GetFinalQueryAppend(finalQueryGlobalAnioPeriodo1, "");
						finalQueryGlobalAnioPeriodo1+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAnioPeriodo1sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnioPeriodo1=" WHERE " + ConstantesSql.ID + "="+vacacionempleadoSessionBean.getlidAnioPeriodo1Actual();
					}
				} else {
					finalQueryGlobalAnioPeriodo1="NONE";
				}


				String finalQueryGlobalAnioPeriodo2="";

				if(((this.anioperiodo2sForeignKey==null||this.anioperiodo2sForeignKey.size()<=0) && this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo2VacacionEmpleado)
					 || (this.esRecargarFks && this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo2VacacionEmpleado)) {

					if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo2()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnioPeriodo2=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnioPeriodo2=Funciones.GetFinalQueryAppend(finalQueryGlobalAnioPeriodo2, "");
						finalQueryGlobalAnioPeriodo2+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAnioPeriodo2sForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnioPeriodo2=" WHERE " + ConstantesSql.ID + "="+vacacionempleadoSessionBean.getlidAnioPeriodo2Actual();
					}
				} else {
					finalQueryGlobalAnioPeriodo2="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vacacionempleadoReturnGeneral=vacacionempleadoLogic.cargarCombosLoteForeignKeyVacacionEmpleado(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalAnioPeriodo1,finalQueryGlobalAnioPeriodo2);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vacacionempleadoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=vacacionempleadoReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalAnioPeriodo1.equals("NONE")) {
				this.anioperiodo1sForeignKey=vacacionempleadoReturnGeneral.getanioperiodo1sForeignKey();
			}

			if(!finalQueryGlobalAnioPeriodo2.equals("NONE")) {
				this.anioperiodo2sForeignKey=vacacionempleadoReturnGeneral.getanioperiodo2sForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVacacionEmpleado()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyAnioPeriodo1();
			this.addItemDefectoCombosForeignKeyAnioPeriodo2();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vacacionempleadoSessionBean==null) {
				this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
			}

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnioPeriodo1()throws Exception {
		try {

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo1()) {
				Anio anioperiodo1=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anioperiodo1,Constantes.SMENSAJE_ESCOJA_OPCION);
				anioperiodo1.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.anioperiodo1sForeignKey,anioperiodo1,true)) {

					this.anioperiodo1sForeignKey.add(0,anioperiodo1);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnioPeriodo2()throws Exception {
		try {

			if(!this.vacacionempleadoSessionBean.getisBusquedaDesdeForeignKeySesionAnioPeriodo2()) {
				Anio anioperiodo2=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anioperiodo2,Constantes.SMENSAJE_ESCOJA_OPCION);
				anioperiodo2.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.anioperiodo2sForeignKey,anioperiodo2,true)) {

					this.anioperiodo2sForeignKey.add(0,anioperiodo2);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVacacionEmpleado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVacacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVacacionEmpleado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.vacacionempleado.setfecha_estimada(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVacacionEmpleado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVacacionEmpleado(VacacionEmpleado vacacionempleado)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(vacacionempleado.getid_empleado(),false,"Formulario");
			this.setActualAnioPeriodo1ForeignKey(vacacionempleado.getid_anio_periodo1(),false,"Formulario");
			this.setActualAnioPeriodo2ForeignKey(vacacionempleado.getid_anio_periodo2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVacacionEmpleado(VacacionEmpleado vacacionempleado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVacacionEmpleado()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.vacacionempleadoConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualAnioPeriodo1ForeignKey(this.vacacionempleadoConstantesFunciones.getid_anio_periodo1(),false,"Formulario");
			this.setActualAnioPeriodo2ForeignKey(this.vacacionempleadoConstantesFunciones.getid_anio_periodo2(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVacacionEmpleado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVacacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVacacionEmpleado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVacacionEmpleado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVacacionEmpleado()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameAnioPeriodo1sForeignKey("Todos");
			this.cargarCombosFrameAnioPeriodo2sForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVacacionEmpleado(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAnioPeriodo1sForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAnioPeriodo2sForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVacacionEmpleado()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.getItemCount()>0) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public VacacionEmpleadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VacacionEmpleadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VacacionEmpleadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean(); 
		this.vacacionempleadoConstantesFunciones=new VacacionEmpleadoConstantesFunciones(); 
		this.vacacionempleadoBean=new VacacionEmpleado();//(this.vacacionempleadoConstantesFunciones); 		
		this.vacacionempleadoReturnGeneral=new VacacionEmpleadoParameterReturnGeneral(); 
		
		this.vacacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vacacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VacacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VacacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VacacionEmpleadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVacacionEmpleado(true);
			
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
			
			this.vacacionempleadoConstantesFunciones=new VacacionEmpleadoConstantesFunciones(); 
			this.vacacionempleadoBean=new VacacionEmpleado();//this.vacacionempleadoConstantesFunciones); 			
			this.vacacionempleadoReturnGeneral=new VacacionEmpleadoParameterReturnGeneral(); 
		
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vacacion Empleado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.vacacionempleado=new VacacionEmpleado();
			this.vacacionempleados = new ArrayList<VacacionEmpleado>();
			this.vacacionempleadosAux = new ArrayList<VacacionEmpleado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic=new VacacionEmpleadoLogic();
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.vacacionempleadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vacacionempleadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVacacionEmpleado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVacacionEmpleado);	
					}
					
					if(this.jInternalFrameImportacionVacacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVacacionEmpleado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVacacionEmpleado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVacacionEmpleado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVacacionEmpleado);
				this.jInternalFrameDetalleFormVacacionEmpleado.setVisible(false);
				this.jInternalFrameDetalleFormVacacionEmpleado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVacacionEmpleado);
					this.jInternalFrameReporteDinamicoVacacionEmpleado.setVisible(false);
					this.jInternalFrameReporteDinamicoVacacionEmpleado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVacacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVacacionEmpleado);
					this.jInternalFrameImportacionVacacionEmpleado.setVisible(false);
					this.jInternalFrameImportacionVacacionEmpleado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVacacionEmpleado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVacacionEmpleado);
					this.jInternalFrameOrderByVacacionEmpleado.setVisible(false);
					this.jInternalFrameOrderByVacacionEmpleado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVacacionEmpleadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VacacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vacacionempleadoReturnGeneral=new VacacionEmpleadoParameterReturnGeneral();
			
			this.vacacionempleadoParameterGeneral=new VacacionEmpleadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vacacionempleadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VacacionEmpleadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VacacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),this.vacacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VacacionEmpleadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),this.vacacionempleadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarVacacionEmpleado=true;
			this.isVisibilidadCeldaCopiarVacacionEmpleado=true;
			this.isVisibilidadCeldaVerFormVacacionEmpleado=true;
			this.isVisibilidadCeldaOrdenVacacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			
			
			this.isVisibilidadFK_IdAnioPeriodo1=true;
			this.isVisibilidadFK_IdAnioPeriodo2=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVacacionEmpleado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVacacionEmpleado(false);
			
			this.setPermisosUsuarioVacacionEmpleado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado() 
				|| (this.vacacionempleadoSessionBean.getEsGuardarRelacionado() && this.vacacionempleadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVacacionEmpleadoClasesRelacionadas();
			}
			
			if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVacacionEmpleadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVacacionEmpleado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVacacionEmpleado();
			}
			
			if(!this.isPermisoBusquedaVacacionEmpleado) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVacacionEmpleado,this.isPermisoPaginacionMedioVacacionEmpleado,this.isPermisoPaginacionTodoVacacionEmpleado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VacacionEmpleadoConstantesFunciones.getTiposSeleccionarVacacionEmpleado());
				
				this.tiposColumnasSelect=VacacionEmpleadoConstantesFunciones.getTiposSeleccionarVacacionEmpleado(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
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
			//if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVacacionEmpleado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVacacionEmpleado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVacacionEmpleado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVacacionEmpleado() ;
			
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
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.anioperiodo1Logic=new AnioLogic();
			this.anioperiodo2Logic=new AnioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				vacacionempleadoImplementable= (VacacionEmpleadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VacacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vacacionempleadoImplementableHome= (VacacionEmpleadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VacacionEmpleadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vacacionempleados= new ArrayList<VacacionEmpleado>();
			this.vacacionempleadosEliminados= new ArrayList<VacacionEmpleado>();
						
			this.isEsNuevoVacacionEmpleado=false;
			this.esParaAccionDesdeFormularioVacacionEmpleado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.anioperiodo1sForeignKey=new ArrayList<Anio>() ;
			this.anioperiodo2sForeignKey=new ArrayList<Anio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVacacionEmpleado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVacacionEmpleado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VacacionEmpleadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVacacionEmpleado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVacacionEmpleado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVacacionEmpleado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVacacionEmpleado();
			}
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVacacionEmpleado.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVacacionEmpleado.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVacacionEmpleado.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVacacionEmpleado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VacacionEmpleado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVacacionEmpleado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVacacionEmpleado")) {
				iIndex=this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVacacionEmpleado();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyVacacionEmpleado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVacacionEmpleado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVacacionEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVacacionEmpleadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVacacionEmpleado();
		
		this.cargarCombosFrameForeignKeyVacacionEmpleado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVacacionEmpleado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVacacionEmpleado();
		}
	}
	
	

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioPeriodo1(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioPeriodo1Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnioPeriodo1();
				this.cargarCombosFrameAnioPeriodo1sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnioPeriodo1(this.anioperiodo1sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioPeriodo2(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioPeriodo2Listas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnioPeriodo2();
				this.cargarCombosFrameAnioPeriodo2sForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnioPeriodo2(this.anioperiodo2sForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVacacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			
			if(jTableDatosVacacionEmpleado.getRowCount()>=1) {
				jTableDatosVacacionEmpleado.removeRowSelectionInterval(0, jTableDatosVacacionEmpleado.getRowCount()-1);						
			}
			
			this.isEsNuevoVacacionEmpleado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVacacionEmpleado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVacacionEmpleado(true);			
			//this.vacacionempleado=new VacacionEmpleado();
			//this.vacacionempleado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVacacionEmpleado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVacacionEmpleado() ;
			
			if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVacacionEmpleado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vacacionempleado);	
			this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);				
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VacacionEmpleado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVacacionEmpleadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVacacionEmpleado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVacacionEmpleado.getSelectedRows().length;			
			}
			
			vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVacacionEmpleado--;			
				//VacacionEmpleado vacacionempleadoAux= new VacacionEmpleado();			
				//vacacionempleadoAux.setId(this.iIdNuevoVacacionEmpleado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VacacionEmpleado vacacionempleadoOrigen=new VacacionEmpleado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VacacionEmpleado vacacionempleadoOrigen : vacacionempleadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vacacionempleadoOrigen =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vacacionempleadoOrigen =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVacacionEmpleado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vacacionempleado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVacacionEmpleado(vacacionempleadoOrigen,this.vacacionempleado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vacacionempleadoLogic.getVacacionEmpleados().add(this.vacacionempleadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vacacionempleados.add(this.vacacionempleadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
				
				this.jTableDatosVacacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoVacacionEmpleado(), this.getIndiceNuevoVacacionEmpleado());
				
				int iLastRow =  this.jTableDatosVacacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVacacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVacacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVacacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();									
		
			VacacionEmpleado vacacionempleadoOrigen=new VacacionEmpleado();
			VacacionEmpleado vacacionempleadoDestino=new VacacionEmpleado();
				
			vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVacacionEmpleado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vacacionempleadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVacacionEmpleado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoOrigen =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vacacionempleadoOrigen =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vacacionempleadoDestino =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vacacionempleadoDestino =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vacacionempleadoOrigen =vacacionempleadosSeleccionados.get(0);
				vacacionempleadoDestino =vacacionempleadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVacacionEmpleado(vacacionempleadoOrigen,vacacionempleadoDestino,true,false);
				
				vacacionempleadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vacacionempleadoDestino,vacacionempleadoLogic.getVacacionEmpleados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vacacionempleadoDestino,vacacionempleados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
				
				//this.jTableDatosVacacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoVacacionEmpleado(), this.getIndiceNuevoVacacionEmpleado());
				
				int iLastRow =  this.jTableDatosVacacionEmpleado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVacacionEmpleado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVacacionEmpleado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVacacionEmpleado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVacacionEmpleado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVacacionEmpleado.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVacacionEmpleado.setVisible(!isVisible);
			this.jPanelPaginacionVacacionEmpleado.setVisible(!isVisible);
			this.jPanelAccionesVacacionEmpleado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVacacionEmpleado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVacacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVacacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVacacionEmpleado();
			
			this.abrirFrameOrderByVacacionEmpleado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVacacionEmpleado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVacacionEmpleado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVacacionEmpleado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVacacionEmpleado.isMaximum()) {
					this.jInternalFrameDetalleFormVacacionEmpleado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVacacionEmpleado.setSize(this.jInternalFrameDetalleFormVacacionEmpleado.iWidthFormulario,this.jInternalFrameDetalleFormVacacionEmpleado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVacacionEmpleado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVacacionEmpleado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVacacionEmpleado.isMaximum()) {
						this.jInternalFrameDetalleFormVacacionEmpleado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVacacionEmpleado.jContentPaneDetalleVacacionEmpleado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVacacionEmpleado.jContentPaneDetalleVacacionEmpleado.getWidth(),VacacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVacacionEmpleado.jContentPaneDetalleVacacionEmpleado.getWidth(),VacacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVacacionEmpleado.jContentPaneDetalleVacacionEmpleado.getWidth(),VacacionEmpleadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVacacionEmpleado.setVisible(true);
	        this.jInternalFrameDetalleFormVacacionEmpleado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVacacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVacacionEmpleado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVacacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVacacionEmpleado,false,this);
				} else {
					this.jInternalFrameOrderByVacacionEmpleado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVacacionEmpleado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVacacionEmpleado);
				this.jInternalFrameOrderByVacacionEmpleado.setVisible(false);
				this.jInternalFrameOrderByVacacionEmpleado.setSelected(false);
				
				this.jInternalFrameOrderByVacacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVacacionEmpleado"));
				
				this.inicializarActualizarBindingTablaOrderByVacacionEmpleado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVacacionEmpleado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVacacionEmpleado==null) {
				
				this.jInternalFrameImportacionVacacionEmpleado=new ImportacionJInternalFrame(VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVacacionEmpleado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVacacionEmpleado);
				this.jInternalFrameImportacionVacacionEmpleado.setVisible(false);
				this.jInternalFrameImportacionVacacionEmpleado.setSelected(false);


				this.jInternalFrameImportacionVacacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVacacionEmpleado"));
				this.jInternalFrameImportacionVacacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVacacionEmpleado"));
				this.jInternalFrameImportacionVacacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVacacionEmpleado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVacacionEmpleado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVacacionEmpleado==null) {
				this.jInternalFrameReporteDinamicoVacacionEmpleado=new ReporteDinamicoJInternalFrame(VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVacacionEmpleado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVacacionEmpleado);
				this.jInternalFrameReporteDinamicoVacacionEmpleado.setVisible(false);
				this.jInternalFrameReporteDinamicoVacacionEmpleado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVacacionEmpleado"));
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVacacionEmpleado"));
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVacacionEmpleado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVacacionEmpleado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVacacionEmpleado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVacacionEmpleado);
			
	       	this.jInternalFrameDetalleFormVacacionEmpleado.setVisible(false);
	        this.jInternalFrameDetalleFormVacacionEmpleado.setSelected(false);
			
			//this.jInternalFrameDetalleFormVacacionEmpleado.dispose();
			//this.jInternalFrameDetalleFormVacacionEmpleado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVacacionEmpleado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVacacionEmpleado.setVisible(true);
	        this.jInternalFrameReporteDinamicoVacacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVacacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVacacionEmpleado.setVisible(true);
	        this.jInternalFrameImportacionVacacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVacacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVacacionEmpleado.setVisible(true);
	        this.jInternalFrameOrderByVacacionEmpleado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVacacionEmpleado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVacacionEmpleado.setVisible(false);
	        this.jInternalFrameOrderByVacacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVacacionEmpleado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVacacionEmpleado.setVisible(false);
	        this.jInternalFrameReporteDinamicoVacacionEmpleado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVacacionEmpleado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVacacionEmpleado.setVisible(false);
	        this.jInternalFrameImportacionVacacionEmpleado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVacacionEmpleado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVacacionEmpleado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVacacionEmpleado(true);
			//this.isEsNuevoVacacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVacacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVacacionEmpleado(false) ;
			
			if(vacacionempleadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVacacionEmpleado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVacacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVacacionEmpleadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVacacionEmpleado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVacacionEmpleado(true);
			//this.isEsNuevoVacacionEmpleado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vacacionempleado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVacacionEmpleado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVacacionEmpleado(false) ;
			
			if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVacacionEmpleado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVacacionEmpleado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVacacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnioPeriodo1(List<Anio> anioperiodo1sForeignKey)throws Exception{
		TableColumn tableColumnAnioPeriodo1=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1));
		TableCellEditor tableCellEditorAnioPeriodo1 =tableColumnAnioPeriodo1.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnioPeriodo1;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(anioperiodo1sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVacacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(anioperiodo1sForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnioPeriodo2(List<Anio> anioperiodo2sForeignKey)throws Exception{
		TableColumn tableColumnAnioPeriodo2=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2));
		TableCellEditor tableCellEditorAnioPeriodo2 =tableColumnAnioPeriodo2.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnioPeriodo2;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(anioperiodo2sForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVacacionEmpleado.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(anioperiodo2sForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVacacionEmpleado(false);
			
			//if(!this.isEsNuevoVacacionEmpleado) {								
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				
			}
			
			if(this.permiteMantenimiento(this.vacacionempleado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVacacionEmpleado=true;
					this.inicializarActualizarBindingTablaVacacionEmpleado(false);
					this.isEsNuevoVacacionEmpleado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVacacionEmpleado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVacacionEmpleado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVacacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVacacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesVacacionEmpleado(false);
			
												
				
				if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVacacionEmpleado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVacacionEmpleadoActionPerformed(evt,vacacionempleadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVacacionEmpleado(this.vacacionempleado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVacacionEmpleado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vacacionempleadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vacacionempleado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.vacacionempleado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				this.vacacionempleado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vacacionempleado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VacacionEmpleadoModel) this.jTableDatosVacacionEmpleado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVacacionEmpleado=true;
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
				this.isEsNuevoVacacionEmpleado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVacacionEmpleado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVacacionEmpleado(false);
				
				this.habilitarDeshabilitarControlesVacacionEmpleado(false);
				
				
				
				if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVacacionEmpleado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVacacionEmpleado.getRowCount()>=1) {
				jTableDatosVacacionEmpleado.removeRowSelectionInterval(0, jTableDatosVacacionEmpleado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVacacionEmpleado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVacacionEmpleado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVacacionEmpleado(false) ;
			
			this.isEsNuevoVacacionEmpleado=false;
			
			if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVacacionEmpleado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVacacionEmpleado(false);
				
				//SI ES MANUAL
				if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVacacionEmpleado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVacacionEmpleado--;			
			//VacacionEmpleado vacacionempleadoAux= new VacacionEmpleado();			
			//vacacionempleadoAux.setId(this.iIdNuevoVacacionEmpleado);
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVacacionEmpleado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
			
			this.vacacionempleado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vacacionempleadoLogic.getVacacionEmpleados().add(this.vacacionempleadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vacacionempleados.add(this.vacacionempleadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			
			this.jTableDatosVacacionEmpleado.setRowSelectionInterval(this.getIndiceNuevoVacacionEmpleado(), this.getIndiceNuevoVacacionEmpleado());
			
			int iLastRow =  this.jTableDatosVacacionEmpleado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVacacionEmpleado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVacacionEmpleado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVacacionEmpleado(false);
			
			//SI ES MANUAL
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVacacionEmpleado();
			}
			
			//this.abrirFrameTreeVacacionEmpleado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Vacacion EmpleadoS ?", "MANTENIMIENTO DE Vacacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVacacionEmpleado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVacacionEmpleado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vacacionempleadoReturnGeneral=vacacionempleadoLogic.procesarImportacionVacacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vacacionempleadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVacacionEmpleadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVacacionEmpleado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVacacionEmpleado.setFileImportacion(this.jInternalFrameImportacionVacacionEmpleado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVacacionEmpleado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVacacionEmpleado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVacacionEmpleado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVacacionEmpleado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		

		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VacacionEmpleadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VacacionEmpleadoBaseDesign.jrxml";
			
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
			
			this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AnioPeriodo1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AnioPeriodo1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AnioPeriodo1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AnioPeriodo1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_AnioPeriodo2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_AnioPeriodo2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_AnioPeriodo2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_AnioPeriodo2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroVeces_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroVeces_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroVeces_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroVeces_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEstimada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEstimada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEstimada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEstimada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasVacaciones_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasVacaciones_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasVacaciones_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasVacaciones_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasTomados_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasTomados_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasTomados_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasTomados_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasPagados_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasPagados_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasPagados_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasPagados_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rasAdicionales_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rasAdicionales_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rasAdicionales_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rasAdicionales_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1:
					sNombreCampoCategoria="id_anio_periodo1";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2:
					sNombreCampoCategoria="id_anio_periodo2";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES:
					sNombreCampoCategoria="numero_veces";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA:
					sNombreCampoCategoria="fecha_estimada";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES:
					sNombreCampoCategoria="horas_vacaciones";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS:
					sNombreCampoCategoria="horas_tomados";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS:
					sNombreCampoCategoria="horas_pagados";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES:
					sNombreCampoCategoria="horas_adicionales";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1:
					sNombreCampoCategoriaValor="id_anio_periodo1";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2:
					sNombreCampoCategoriaValor="id_anio_periodo2";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES:
					sNombreCampoCategoriaValor="numero_veces";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA:
					sNombreCampoCategoriaValor="fecha_estimada";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES:
					sNombreCampoCategoriaValor="horas_vacaciones";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS:
					sNombreCampoCategoriaValor="horas_tomados";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS:
					sNombreCampoCategoriaValor="horas_pagados";
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES:
					sNombreCampoCategoriaValor="horas_adicionales";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio Periodo1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio_periodo1");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio Periodo2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio_periodo2");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Veces",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_veces");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Estimada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_estimada");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Vacaciones",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_vacaciones");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Tomados",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_tomados");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Pagados",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_pagados");
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Horas Adicionales",sNombreCampoCategoria,sNombreCampoCategoriaValor,"horas_adicionales");
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
	
	public void jButtonGenerarExcelReporteDinamicoVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VacacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getanioperiodo1_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getanioperiodo2_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getnumero_veces());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.getfecha_estimada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.gethoras_vacaciones());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.gethoras_tomados());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.gethoras_pagados());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES);
					iRow++;

					for(VacacionEmpleado vacacionempleado:vacacionempleadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vacacionempleado.gethoras_adicionales());
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
			//	this.getFilaCabeceraExportarExcelVacacionEmpleado(row);				
			//	iRow++;
			//}				
			
			//for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVacacionEmpleado(vacacionempleadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVacacionEmpleado(false);
			
			//SI ES MANUAL
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVacacionEmpleado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVacacionEmpleado(false);
			
			//SI ES MANUAL
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVacacionEmpleado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVacacionEmpleado(false);
			
			//SI ES MANUAL
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVacacionEmpleado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVacacionEmpleado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVacacionEmpleado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVacacionEmpleado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVacacionEmpleado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVacacionEmpleado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVacacionEmpleado.setMinimumSize(dimensionMinimum);
		this.jTableDatosVacacionEmpleado.setMaximumSize(dimensionMaximum);
		this.jTableDatosVacacionEmpleado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVacacionEmpleado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVacacionEmpleado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVacacionEmpleado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVacacionEmpleado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVacacionEmpleado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVacacionEmpleado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVacacionEmpleado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVacacionEmpleado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVacacionEmpleado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVacacionEmpleado();
		
		this.inicializarActualizarBindingBotonesManualVacacionEmpleado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVacacionEmpleado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVacacionEmpleado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVacacionEmpleado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVacacionEmpleado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVacacionEmpleado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVacacionEmpleado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVacacionEmpleado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionNuevoVacacionEmpleado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionSinCerrarVacacionEmpleado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionSinMensajeVacacionEmpleado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVacacionEmpleado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVacacionEmpleado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVacacionEmpleado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionNuevoVacacionEmpleado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionSinCerrarVacacionEmpleado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVacacionEmpleado.jCheckBoxPostAccionSinMensajeVacacionEmpleado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVacacionEmpleado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVacacionEmpleado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVacacionEmpleado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVacacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVacacionEmpleado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVacacionEmpleado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVacacionEmpleado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVacacionEmpleado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVacacionEmpleado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVacacionEmpleado(Boolean esInicializar) throws Exception {
		try	{	
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVacacionEmpleado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVacacionEmpleado() throws Exception {
		try	{
			if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVacacionEmpleado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVacacionEmpleado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVacacionEmpleado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVacacionEmpleado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVacacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVacacionEmpleado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVacacionEmpleado.addItem(reporte);
			}
			
			
			if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVacacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVacacionEmpleado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVacacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVacacionEmpleado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVacacionEmpleado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVacacionEmpleado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVacacionEmpleado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVacacionEmpleado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVacacionEmpleado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
				
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VacacionEmpleadoConstantesFunciones.getTiposSeleccionarVacacionEmpleado(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VacacionEmpleadoConstantesFunciones.getTiposSeleccionarVacacionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VacacionEmpleadoConstantesFunciones.getTiposSeleccionarVacacionEmpleado(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVacacionEmpleado.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVacacionEmpleado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.getSelectedItem()!=null){this.id_anio_periodo1FK_IdAnioPeriodo1=((Anio)this.jComboBoxid_anio_periodo1FK_IdAnioPeriodo1VacacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.getSelectedItem()!=null){this.id_anio_periodo2FK_IdAnioPeriodo2=((Anio)this.jComboBoxid_anio_periodo2FK_IdAnioPeriodo2VacacionEmpleado.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoVacacionEmpleado.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVacacionEmpleado(Boolean esInicializar) throws Exception {				
		if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVacacionEmpleado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVacacionEmpleado() throws Exception {
		this.inicializarActualizarBindingTablaVacacionEmpleado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVacacionEmpleado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVacacionEmpleadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVacacionEmpleado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vacacionempleadoLogic.getVacacionEmpleados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vacacionempleados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVacacionEmpleado.setModel(new VacacionEmpleadoModel(this.vacacionempleadoLogic.getVacacionEmpleados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVacacionEmpleado.setModel(new VacacionEmpleadoModel(this.vacacionempleados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVacacionEmpleado!=null && this.jInternalFrameOrderByVacacionEmpleado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVacacionEmpleado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,vacacionempleadoConstantesFunciones.resaltarSeleccionarVacacionEmpleado,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VacacionEmpleadoConstantesFunciones.SCLASSWEBTITULO,vacacionempleadoConstantesFunciones.resaltarSeleccionarVacacionEmpleado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_ID));

		if(this.vacacionempleadoConstantesFunciones.mostraridVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltaridVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activaridVacacionEmpleado,iSizeTabla,this,true,"idVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltaridVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activaridVacacionEmpleado,this,true,"idVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vacacionempleadoConstantesFunciones.mostrarid_empresaVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_empresaVacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_empresaVacacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_empresaVacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_empresaVacacionEmpleado,false,"id_empresaVacacionEmpleado","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.vacacionempleadoConstantesFunciones.mostrarid_empleadoVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_empleadoVacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_empleadoVacacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_empleadoVacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_empleadoVacacionEmpleado,true,"id_empleadoVacacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1));

		if(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo1VacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.anioperiodo1sForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo1VacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_anio_periodo1VacacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.anioperiodo1sForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo1VacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_anio_periodo1VacacionEmpleado,true,"id_anio_periodo1VacacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2));

		if(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo2VacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.anioperiodo2sForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo2VacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_anio_periodo2VacacionEmpleado,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.anioperiodo2sForeignKey,this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo2VacacionEmpleado,this,this.vacacionempleadoConstantesFunciones.activarid_anio_periodo2VacacionEmpleado,true,"id_anio_periodo2VacacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES));

		if(this.vacacionempleadoConstantesFunciones.mostrarnumero_vecesVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltarnumero_vecesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarnumero_vecesVacacionEmpleado,iSizeTabla,this,true,"numero_vecesVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarnumero_vecesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarnumero_vecesVacacionEmpleado,this,true,"numero_vecesVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA));

		if(this.vacacionempleadoConstantesFunciones.mostrarfecha_estimadaVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vacacionempleadoConstantesFunciones.resaltarfecha_estimadaVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarfecha_estimadaVacacionEmpleado,iSizeTabla,this,true,"fecha_estimadaVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarfecha_estimadaVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarfecha_estimadaVacacionEmpleado,this,true,"fecha_estimadaVacacionEmpleado","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES));

		if(this.vacacionempleadoConstantesFunciones.mostrarhoras_vacacionesVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_vacacionesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_vacacionesVacacionEmpleado,iSizeTabla,this,true,"horas_vacacionesVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_vacacionesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_vacacionesVacacionEmpleado,this,true,"horas_vacacionesVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS));

		if(this.vacacionempleadoConstantesFunciones.mostrarhoras_tomadosVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_tomadosVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_tomadosVacacionEmpleado,iSizeTabla,this,true,"horas_tomadosVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_tomadosVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_tomadosVacacionEmpleado,this,true,"horas_tomadosVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS));

		if(this.vacacionempleadoConstantesFunciones.mostrarhoras_pagadosVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_pagadosVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_pagadosVacacionEmpleado,iSizeTabla,this,true,"horas_pagadosVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_pagadosVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_pagadosVacacionEmpleado,this,true,"horas_pagadosVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES));

		if(this.vacacionempleadoConstantesFunciones.mostrarhoras_adicionalesVacacionEmpleado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_adicionalesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_adicionalesVacacionEmpleado,iSizeTabla,this,true,"horas_adicionalesVacacionEmpleado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vacacionempleadoConstantesFunciones.resaltarhoras_adicionalesVacacionEmpleado,this.vacacionempleadoConstantesFunciones.activarhoras_adicionalesVacacionEmpleado,this,true,"horas_adicionalesVacacionEmpleado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VacacionEmpleadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVacacionEmpleado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVacacionEmpleado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVacacionEmpleado.addColumn(tableColumn);
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
			
			this.jTableDatosVacacionEmpleado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVacacionEmpleado.moveColumn(this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVacacionEmpleado.moveColumn(this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVacacionEmpleado.moveColumn(this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVacacionEmpleado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVacacionEmpleado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVacacionEmpleado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVacacionEmpleado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVacacionEmpleado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVacacionEmpleado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVacacionEmpleado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vacacionempleadoLogic.getVacacionEmpleados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vacacionempleados.size()-1;
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
		//this.jTableDatosVacacionEmpleado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVacacionEmpleado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVacacionEmpleado();
			
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
				
				//this.isEsNuevoVacacionEmpleado=false;
					
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
				if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVacacionEmpleado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVacacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVacacionEmpleado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vacacionempleado.getsType().equals("DUPLICADO")
				   || this.vacacionempleado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVacacionEmpleado=true;
				
				} else {
					this.isEsNuevoVacacionEmpleado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					if(this.vacacionempleado.getId()>=0 && !this.vacacionempleado.getIsNew()) {						
						this.isEsNuevoVacacionEmpleado=false;
						
					} else {
						this.isEsNuevoVacacionEmpleado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVacacionEmpleado(esRelaciones);						
				
				this.seleccionarVacacionEmpleado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vacacionempleado.getId()<0) {
					this.isEsNuevoVacacionEmpleado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVacacionEmpleado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVacacionEmpleado(evt,rowIndex);
				}	
				
				if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VacacionEmpleado: " + this.dDif); 
					}
				}								
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVacacionEmpleado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vacacionempleado)) {
					if(this.vacacionempleado.getId()>0) {
						this.vacacionempleado.setIsDeleted(true);
						
						this.vacacionempleadosEliminados.add(this.vacacionempleado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vacacionempleadoLogic.getVacacionEmpleados().remove(this.vacacionempleado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vacacionempleados.remove(this.vacacionempleado);				
					}
					
					
					((VacacionEmpleadoModel) this.jTableDatosVacacionEmpleado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVacacionEmpleado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVacacionEmpleado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVacacionEmpleado) {
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVacacionEmpleado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVacacionEmpleado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleado);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vacacionempleadoConstantesFunciones.cargarid_empresaVacacionEmpleado || this.vacacionempleadoConstantesFunciones.event_dependid_empresaVacacionEmpleado) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vacacionempleado.getid_empresa());
									//this.inicializarActualizarBindingVacacionEmpleado(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vacacionempleado.getEmpresa()!=null) {
							this.empresasForeignKey.add(vacacionempleado.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vacacionempleado.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.vacacionempleadoConstantesFunciones.cargarid_empleadoVacacionEmpleado || this.vacacionempleadoConstantesFunciones.event_dependid_empleadoVacacionEmpleado) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.vacacionempleado.getid_empleado());
									//this.inicializarActualizarBindingVacacionEmpleado(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(vacacionempleado.getEmpleado()!=null) {
							this.empleadosForeignKey.add(vacacionempleado.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.vacacionempleado.getid_empleado(),false,"Formulario");

					//AnioPeriodo1
					if(!this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo1VacacionEmpleado || this.vacacionempleadoConstantesFunciones.event_dependid_anio_periodo1VacacionEmpleado) {
						//this.cargarCombosAnioPeriodo1sForeignKeyLista(" where id="+this.vacacionempleado.getid_anio_periodo1());
									//this.inicializarActualizarBindingVacacionEmpleado(false,false);
						this.anioperiodo1sForeignKey=new ArrayList<Anio>();

						if(vacacionempleado.getAnioPeriodo1()!=null) {
							this.anioperiodo1sForeignKey.add(vacacionempleado.getAnioPeriodo1());
						}

						this.addItemDefectoCombosForeignKeyAnioPeriodo1();
						this.cargarCombosFrameAnioPeriodo1sForeignKey("Todos");
					}
					this.setActualAnioPeriodo1ForeignKey(this.vacacionempleado.getid_anio_periodo1(),false,"Formulario");

					//AnioPeriodo2
					if(!this.vacacionempleadoConstantesFunciones.cargarid_anio_periodo2VacacionEmpleado || this.vacacionempleadoConstantesFunciones.event_dependid_anio_periodo2VacacionEmpleado) {
						//this.cargarCombosAnioPeriodo2sForeignKeyLista(" where id="+this.vacacionempleado.getid_anio_periodo2());
									//this.inicializarActualizarBindingVacacionEmpleado(false,false);
						this.anioperiodo2sForeignKey=new ArrayList<Anio>();

						if(vacacionempleado.getAnioPeriodo2()!=null) {
							this.anioperiodo2sForeignKey.add(vacacionempleado.getAnioPeriodo2());
						}

						this.addItemDefectoCombosForeignKeyAnioPeriodo2();
						this.cargarCombosFrameAnioPeriodo2sForeignKey("Todos");
					}
					this.setActualAnioPeriodo2ForeignKey(this.vacacionempleado.getid_anio_periodo2(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVacacionEmpleado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVacacionEmpleado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVacacionEmpleado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVacacionEmpleado(VacacionEmpleado vacacionempleado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVacacionEmpleado(vacacionempleado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVacacionEmpleado(VacacionEmpleado vacacionempleado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVacacionEmpleado(vacacionempleado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVacacionEmpleado(vacacionempleado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVacacionEmpleado(vacacionempleado);
	}
	
	public void setVariablesObjetoActualToFormularioVacacionEmpleado(VacacionEmpleado vacacionempleado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setText(vacacionempleado.getId().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setText(vacacionempleado.getnumero_veces().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setDate(vacacionempleado.getfecha_estimada());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setText(vacacionempleado.gethoras_vacaciones().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setText(vacacionempleado.gethoras_tomados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setText(vacacionempleado.gethoras_pagados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setText(vacacionempleado.gethoras_adicionales().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VacacionEmpleado vacacionempleadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vacacionempleadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VacacionEmpleado vacacionempleadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vacacionempleadoLocal=this.vacacionempleado;
			} else {
				vacacionempleadoLocal=this.vacacionempleadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vacacionempleadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVacacionEmpleado(vacacionempleadoLocal,true);
					
					if(vacacionempleadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vacacionempleadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vacacionempleadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVacacionEmpleado(VacacionEmpleado vacacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVacacionEmpleado(vacacionempleado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(vacacionempleado);
	}
	
	public void setVariablesFormularioToObjetoActualVacacionEmpleado(VacacionEmpleado vacacionempleado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVacacionEmpleado(vacacionempleado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVacacionEmpleado(VacacionEmpleado vacacionempleado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.getText()==null || this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.getText()=="" || this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.getText()=="Id") {
				this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setText("0");
			}

			if(conColumnasBase) {vacacionempleado.setId(Long.parseLong(this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelIdVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.setnumero_veces(Integer.parseInt(this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelnumero_vecesVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.setfecha_estimada(this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelfecha_estimadaVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.sethoras_vacaciones(Double.parseDouble(this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_vacacionesVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.sethoras_tomados(Double.parseDouble(this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_tomadosVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.sethoras_pagados(Double.parseDouble(this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_pagadosVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vacacionempleado.sethoras_adicionales(Double.parseDouble(this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVacacionEmpleado.jLabelhoras_adicionalesVacacionEmpleado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVacacionEmpleado(VacacionEmpleado vacacionempleadoBean,VacacionEmpleado vacacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vacacionempleadoBean.getid_empleado()!=null && !vacacionempleadoBean.getid_empleado().equals(-1L))) {vacacionempleado.setid_empleado(vacacionempleadoBean.getid_empleado());}
			if(conDefault || (!conDefault && vacacionempleadoBean.getid_anio_periodo1()!=null && !vacacionempleadoBean.getid_anio_periodo1().equals(-1L))) {vacacionempleado.setid_anio_periodo1(vacacionempleadoBean.getid_anio_periodo1());}
			if(conDefault || (!conDefault && vacacionempleadoBean.getid_anio_periodo2()!=null && !vacacionempleadoBean.getid_anio_periodo2().equals(-1L))) {vacacionempleado.setid_anio_periodo2(vacacionempleadoBean.getid_anio_periodo2());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVacacionEmpleado(VacacionEmpleado vacacionempleadoOrigen,VacacionEmpleado vacacionempleado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vacacionempleadoOrigen.getId()!=null && !vacacionempleadoOrigen.getId().equals(0L))) {vacacionempleado.setId(vacacionempleadoOrigen.getId());}}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.getid_empleado()!=null && !vacacionempleadoOrigen.getid_empleado().equals(-1L))) {vacacionempleado.setid_empleado(vacacionempleadoOrigen.getid_empleado());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.getid_anio_periodo1()!=null && !vacacionempleadoOrigen.getid_anio_periodo1().equals(-1L))) {vacacionempleado.setid_anio_periodo1(vacacionempleadoOrigen.getid_anio_periodo1());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.getid_anio_periodo2()!=null && !vacacionempleadoOrigen.getid_anio_periodo2().equals(-1L))) {vacacionempleado.setid_anio_periodo2(vacacionempleadoOrigen.getid_anio_periodo2());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.getnumero_veces()!=null && !vacacionempleadoOrigen.getnumero_veces().equals(0))) {vacacionempleado.setnumero_veces(vacacionempleadoOrigen.getnumero_veces());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.getfecha_estimada()!=null && !vacacionempleadoOrigen.getfecha_estimada().equals(new Date()))) {vacacionempleado.setfecha_estimada(vacacionempleadoOrigen.getfecha_estimada());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.gethoras_vacaciones()!=null && !vacacionempleadoOrigen.gethoras_vacaciones().equals(0.0))) {vacacionempleado.sethoras_vacaciones(vacacionempleadoOrigen.gethoras_vacaciones());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.gethoras_tomados()!=null && !vacacionempleadoOrigen.gethoras_tomados().equals(0.0))) {vacacionempleado.sethoras_tomados(vacacionempleadoOrigen.gethoras_tomados());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.gethoras_pagados()!=null && !vacacionempleadoOrigen.gethoras_pagados().equals(0.0))) {vacacionempleado.sethoras_pagados(vacacionempleadoOrigen.gethoras_pagados());}
			if(conDefault || (!conDefault && vacacionempleadoOrigen.gethoras_adicionales()!=null && !vacacionempleadoOrigen.gethoras_adicionales().equals(0.0))) {vacacionempleado.sethoras_adicionales(vacacionempleadoOrigen.gethoras_adicionales());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVacacionEmpleado(VacacionEmpleado vacacionempleado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setText(vacacionempleado.getId().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setText(vacacionempleado.getnumero_veces().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setDate(vacacionempleado.getfecha_estimada());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setText(vacacionempleado.gethoras_vacaciones().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setText(vacacionempleado.gethoras_tomados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setText(vacacionempleado.gethoras_pagados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setText(vacacionempleado.gethoras_adicionales().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVacacionEmpleado(VacacionEmpleadoBean vacacionempleadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setText(vacacionempleadoBean.getId().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setText(vacacionempleadoBean.getnumero_veces().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setDate(vacacionempleadoBean.getfecha_estimada());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setText(vacacionempleadoBean.gethoras_vacaciones().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setText(vacacionempleadoBean.gethoras_tomados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setText(vacacionempleadoBean.gethoras_pagados().toString());
			this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setText(vacacionempleadoBean.gethoras_adicionales().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVacacionEmpleado(VacacionEmpleadoParameterReturnGeneral vacacionempleadoReturnGeneral,VacacionEmpleadoBean vacacionempleadoBean,Boolean conDefault) throws Exception { 
		try {
			VacacionEmpleado vacacionempleadoLocal=new VacacionEmpleado();
			
			vacacionempleadoLocal=vacacionempleadoReturnGeneral.getVacacionEmpleado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vacacionempleadoLocal.getId()!=null && !vacacionempleadoLocal.getId().equals(0L))) {vacacionempleadoBean.setId(vacacionempleadoLocal.getId());}}
			if(conDefault || (!conDefault && vacacionempleadoLocal.getid_empleado()!=null && !vacacionempleadoLocal.getid_empleado().equals(-1L))) {vacacionempleadoBean.setid_empleado(vacacionempleadoLocal.getid_empleado());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.getid_anio_periodo1()!=null && !vacacionempleadoLocal.getid_anio_periodo1().equals(-1L))) {vacacionempleadoBean.setid_anio_periodo1(vacacionempleadoLocal.getid_anio_periodo1());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.getid_anio_periodo2()!=null && !vacacionempleadoLocal.getid_anio_periodo2().equals(-1L))) {vacacionempleadoBean.setid_anio_periodo2(vacacionempleadoLocal.getid_anio_periodo2());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.getnumero_veces()!=null && !vacacionempleadoLocal.getnumero_veces().equals(0))) {vacacionempleadoBean.setnumero_veces(vacacionempleadoLocal.getnumero_veces());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.getfecha_estimada()!=null && !vacacionempleadoLocal.getfecha_estimada().equals(new Date()))) {vacacionempleadoBean.setfecha_estimada(vacacionempleadoLocal.getfecha_estimada());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.gethoras_vacaciones()!=null && !vacacionempleadoLocal.gethoras_vacaciones().equals(0.0))) {vacacionempleadoBean.sethoras_vacaciones(vacacionempleadoLocal.gethoras_vacaciones());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.gethoras_tomados()!=null && !vacacionempleadoLocal.gethoras_tomados().equals(0.0))) {vacacionempleadoBean.sethoras_tomados(vacacionempleadoLocal.gethoras_tomados());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.gethoras_pagados()!=null && !vacacionempleadoLocal.gethoras_pagados().equals(0.0))) {vacacionempleadoBean.sethoras_pagados(vacacionempleadoLocal.gethoras_pagados());}
			if(conDefault || (!conDefault && vacacionempleadoLocal.gethoras_adicionales()!=null && !vacacionempleadoLocal.gethoras_adicionales().equals(0.0))) {vacacionempleadoBean.sethoras_adicionales(vacacionempleadoLocal.gethoras_adicionales());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVacacionEmpleadoGenerico(Long idVacacionEmpleadoSeleccionado,JComboBox jComboBoxVacacionEmpleado,List<VacacionEmpleado> vacacionempleadosLocal)throws Exception {
		try {
			VacacionEmpleado  vacacionempleadoTemp=null;

			for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosLocal) {
				if(vacacionempleadoAux.getId()!=null && vacacionempleadoAux.getId().equals(idVacacionEmpleadoSeleccionado)) {
					vacacionempleadoTemp=vacacionempleadoAux;
					break;
				}
			}

			jComboBoxVacacionEmpleado.setSelectedItem(vacacionempleadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVacacionEmpleadoGenerico(JComboBox jComboBoxVacacionEmpleado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVacacionEmpleado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVacacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVacacionEmpleado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVacacionEmpleado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVacacionEmpleado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVacacionEmpleado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
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
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vacacionempleado=(VacacionEmpleado) vacacionempleadoLogic.getVacacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vacacionempleado =(VacacionEmpleado) vacacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vacacionempleado.getIsNew() && !vacacionempleado.getIsChanged() && !vacacionempleado.getIsDeleted()) {
				sDescripcion=vacacionempleado.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vacacionempleado.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!vacacionempleado.getIsNew() && !vacacionempleado.getIsChanged() && !vacacionempleado.getIsDeleted()) {
				sDescripcion=vacacionempleado.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=vacacionempleado.getempleado_descripcion();
			}
		}

		if(sTipo.equals("AnioPeriodo1")) {
			//sDescripcion=this.getActualAnioPeriodo1ForeignKeyDescripcion((Long)value);
			if(!vacacionempleado.getIsNew() && !vacacionempleado.getIsChanged() && !vacacionempleado.getIsDeleted()) {
				sDescripcion=vacacionempleado.getanioperiodo1_descripcion();
			} else {
				//sDescripcion=this.getActualAnioPeriodo1ForeignKeyDescripcion((Long)value);
				sDescripcion=vacacionempleado.getanioperiodo1_descripcion();
			}
		}

		if(sTipo.equals("AnioPeriodo2")) {
			//sDescripcion=this.getActualAnioPeriodo2ForeignKeyDescripcion((Long)value);
			if(!vacacionempleado.getIsNew() && !vacacionempleado.getIsChanged() && !vacacionempleado.getIsDeleted()) {
				sDescripcion=vacacionempleado.getanioperiodo2_descripcion();
			} else {
				//sDescripcion=this.getActualAnioPeriodo2ForeignKeyDescripcion((Long)value);
				sDescripcion=vacacionempleado.getanioperiodo2_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VacacionEmpleado vacacionempleadoRow=new VacacionEmpleado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vacacionempleadoRow=(VacacionEmpleado) vacacionempleadoLogic.getVacacionEmpleados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vacacionempleadoRow=(VacacionEmpleado) vacacionempleados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVacacionEmpleado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));			
			this.jButtonDuplicarVacacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarVacacionEmpleado && this.isPermisoDuplicarVacacionEmpleado));			
			this.jButtonCopiarVacacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarVacacionEmpleado && this.isPermisoCopiarVacacionEmpleado));
			this.jButtonVerFormVacacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormVacacionEmpleado && this.isPermisoVerFormVacacionEmpleado));
			
			this.jButtonAbrirOrderByVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));			
			
			this.jButtonNuevoRelacionesVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));			
			this.jButtonNuevoGuardarCambiosVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarVacacionEmpleado.setVisible((this.isVisibilidadCeldaModificarVacacionEmpleado && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarVacacionEmpleado && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarVacacionEmpleado && this.isPermisoEliminarVacacionEmpleado));
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarVacacionEmpleado);							
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));			
			
			}
						
			this.jButtonGuardarCambiosTablaVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));						
			this.jButtonDuplicarToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarVacacionEmpleado && this.isPermisoDuplicarVacacionEmpleado));						
			this.jButtonCopiarToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarVacacionEmpleado && this.isPermisoCopiarVacacionEmpleado));			
			this.jButtonVerFormToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormVacacionEmpleado && this.isPermisoVerFormVacacionEmpleado));			
			this.jButtonAbrirOrderByToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));
			this.jButtonNuevoRelacionesToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));			
			this.jButtonNuevoGuardarCambiosToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));			
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaModificarVacacionEmpleado && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarVacacionEmpleado  && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarVacacionEmpleado && this.isPermisoEliminarVacacionEmpleado));
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarToolBarVacacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarVacacionEmpleado);				
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));			
			this.jMenuItemDuplicarVacacionEmpleado.setVisible((this.isVisibilidadCeldaDuplicarVacacionEmpleado && this.isPermisoDuplicarVacacionEmpleado));			
			this.jMenuItemCopiarVacacionEmpleado.setVisible((this.isVisibilidadCeldaCopiarVacacionEmpleado && this.isPermisoCopiarVacacionEmpleado));			
			this.jMenuItemVerFormVacacionEmpleado.setVisible((this.isVisibilidadCeldaVerFormVacacionEmpleado && this.isPermisoVerFormVacacionEmpleado));			
			this.jMenuItemAbrirOrderByVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));			
			//this.jMenuItemMostrarOcultarVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));
			this.jMenuItemDetalleAbrirOrderByVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));			
			//this.jMenuItemDetalleMostrarOcultarVacacionEmpleado.setVisible((this.isVisibilidadCeldaOrdenVacacionEmpleado && this.isPermisoOrdenVacacionEmpleado));			
			this.jMenuItemNuevoRelacionesVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado));			
			this.jMenuItemNuevoGuardarCambiosVacacionEmpleado.setVisible((this.isVisibilidadCeldaNuevoVacacionEmpleado && this.isPermisoNuevoVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));									
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemModificarVacacionEmpleado.setVisible((this.isVisibilidadCeldaModificarVacacionEmpleado && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemActualizarVacacionEmpleado.setVisible((this.isVisibilidadCeldaActualizarVacacionEmpleado && this.isPermisoActualizarVacacionEmpleado));	
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemEliminarVacacionEmpleado.setVisible((this.isVisibilidadCeldaEliminarVacacionEmpleado && this.isPermisoEliminarVacacionEmpleado));
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemCancelarVacacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarVacacionEmpleado);				
			}
			
			this.jMenuItemGuardarCambiosVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));						
			this.jMenuItemGuardarCambiosTablaVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=this.jButtonNuevoVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaDuplicarVacacionEmpleado=this.jButtonDuplicarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaCopiarVacacionEmpleado=this.jButtonCopiarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaVerFormVacacionEmpleado=this.jButtonVerFormVacacionEmpleado.isVisible();
			
			this.isVisibilidadCeldaOrdenVacacionEmpleado=this.jButtonAbrirOrderByVacacionEmpleado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=this.jButtonNuevoRelacionesVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaModificarVacacionEmpleado=this.jButtonModificarVacacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.isVisibilidadCeldaActualizarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=this.jButtonGuardarCambiosTablaVacacionEmpleado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVacacionEmpleado=this.jButtonNuevoToolBarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=this.jButtonNuevoRelacionesToolBarVacacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarToolBarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarToolBarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarToolBarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarToolBarVacacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVacacionEmpleado=this.jButtonGuardarCambiosToolBarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVacacionEmpleado=this.jMenuItemNuevoVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=this.jMenuItemNuevoRelacionesVacacionEmpleado.isVisible();
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.isVisibilidadCeldaModificarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemModificarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaActualizarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemActualizarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaEliminarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemEliminarVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaCancelarVacacionEmpleado=this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemCancelarVacacionEmpleado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVacacionEmpleado=this.jMenuItemGuardarCambiosVacacionEmpleado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=this.jMenuItemGuardarCambiosTablaVacacionEmpleado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVacacionEmpleado(Boolean esInicializar) {
		if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
				//if(this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVacacionEmpleado();
			}
			
			this.inicializarActualizarBindingBotonesManualVacacionEmpleado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVacacionEmpleado() {
		this.jButtonNuevoVacacionEmpleado.setVisible(this.isPermisoNuevoVacacionEmpleado);			
		this.jButtonDuplicarVacacionEmpleado.setVisible(this.isPermisoDuplicarVacacionEmpleado);			
		this.jButtonCopiarVacacionEmpleado.setVisible(this.isPermisoCopiarVacacionEmpleado);			
		this.jButtonVerFormVacacionEmpleado.setVisible(this.isPermisoVerFormVacacionEmpleado);			
		
		this.jButtonAbrirOrderByVacacionEmpleado.setVisible(this.isPermisoOrdenVacacionEmpleado);					
		
		this.jButtonNuevoRelacionesVacacionEmpleado.setVisible(this.isPermisoNuevoVacacionEmpleado);			
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarVacacionEmpleado.setVisible(this.isPermisoActualizarVacacionEmpleado);	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.setVisible(this.isPermisoActualizarVacacionEmpleado);	
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.setVisible(this.isPermisoEliminarVacacionEmpleado);
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarVacacionEmpleado);						
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.setVisible(this.isPermisoGuardarCambiosVacacionEmpleado);							
		}
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.setVisible(this.isPermisoActualizarVacacionEmpleado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVacacionEmpleado() {
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarVacacionEmpleado.setVisible(this.isPermisoActualizarVacacionEmpleado);	
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.setVisible(this.isPermisoActualizarVacacionEmpleado);	
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.setVisible(this.isPermisoEliminarVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.setVisible(this.isVisibilidadCeldaCancelarVacacionEmpleado);							
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.setVisible((this.isVisibilidadCeldaGuardarVacacionEmpleado && this.isPermisoGuardarCambiosVacacionEmpleado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVacacionEmpleado() {
		if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVacacionEmpleado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVacacionEmpleado() {
	}
	
	public void jTableDatosVacacionEmpleadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVacacionEmpleado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vacacionempleado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVacacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVacacionEmpleado(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVacacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVacacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vacacionempleadoLogic.getConnexion());

				if(this.vacacionempleado.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vacacionempleado.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVacacionEmpleado=(TitledBorder)this.jScrollPanelDatosVacacionEmpleado.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVacacionEmpleado.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vacacionempleado.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoVacacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebVacacionEmpleado(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVacacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVacacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.vacacionempleadoLogic.getConnexion());

				if(this.vacacionempleado.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.vacacionempleado.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVacacionEmpleado=(TitledBorder)this.jScrollPanelDatosVacacionEmpleado.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderVacacionEmpleado.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.vacacionempleado.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anio_periodo1VacacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanioperiodo1=true;

			idTienePermisoanioperiodo1=this.tienePermisosUsuarioEnPaginaWebVacacionEmpleado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanioperiodo1) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVacacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVacacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);

				this.anioperiodo1BeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioperiodo1BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioperiodo1BeanSwingJInternalFrame.getAnioLogic().setConnexion(this.vacacionempleadoLogic.getConnexion());

				if(this.vacacionempleado.getid_anio_periodo1()!=null) {
					this.anioperiodo1BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioperiodo1BeanSwingJInternalFrame.setIdActual(this.vacacionempleado.getid_anio_periodo1());
					this.anioperiodo1BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioperiodo1BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioperiodo1BeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioperiodo1BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVacacionEmpleado=(TitledBorder)this.jScrollPanelDatosVacacionEmpleado.getBorder();
				TitledBorder titledBorderanioperiodo1=(TitledBorder)this.anioperiodo1BeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanioperiodo1.setTitle(titledBorderVacacionEmpleado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anio_periodo1VacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getid_anio_periodo1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio_periodo1 = "+this.vacacionempleado.getid_anio_periodo1().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anio_periodo2VacacionEmpleadoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanioperiodo2=true;

			idTienePermisoanioperiodo2=this.tienePermisosUsuarioEnPaginaWebVacacionEmpleado(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanioperiodo2) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVacacionEmpleado.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVacacionEmpleado.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);

				this.anioperiodo2BeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioperiodo2BeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioperiodo2BeanSwingJInternalFrame.getAnioLogic().setConnexion(this.vacacionempleadoLogic.getConnexion());

				if(this.vacacionempleado.getid_anio_periodo2()!=null) {
					this.anioperiodo2BeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioperiodo2BeanSwingJInternalFrame.setIdActual(this.vacacionempleado.getid_anio_periodo2());
					this.anioperiodo2BeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioperiodo2BeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioperiodo2BeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioperiodo2BeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVacacionEmpleado=(TitledBorder)this.jScrollPanelDatosVacacionEmpleado.getBorder();
				TitledBorder titledBorderanioperiodo2=(TitledBorder)this.anioperiodo2BeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanioperiodo2.setTitle(titledBorderVacacionEmpleado.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anio_periodo2VacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getid_anio_periodo2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio_periodo2 = "+this.vacacionempleado.getid_anio_periodo2().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_vecesVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getnumero_veces()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_veces = "+this.vacacionempleado.getnumero_veces().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_estimadaVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.getfecha_estimada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_estimada = '"+Funciones2.getStringPostgresDate(this.vacacionempleado.getfecha_estimada())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_vacacionesVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.gethoras_vacaciones()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_vacaciones = "+this.vacacionempleado.gethoras_vacaciones().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_tomadosVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.gethoras_tomados()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_tomados = "+this.vacacionempleado.gethoras_tomados().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_pagadosVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.gethoras_pagados()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_pagados = "+this.vacacionempleado.gethoras_pagados().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhoras_adicionalesVacacionEmpleadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.getvacacionempleado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vacacionempleado==null) {
						this.vacacionempleado = new VacacionEmpleado();
					}

					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);
				}

				if(this.vacacionempleado.gethoras_adicionales()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where horas_adicionales = "+this.vacacionempleado.gethoras_adicionales().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVacacionEmpleado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioPeriodo1VacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVacacionEmpleado(false,false);

			this.getVacacionEmpleadosFK_IdAnioPeriodo1();

			this.inicializarActualizarBindingVacacionEmpleado(false);

			//if(VacacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVacacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdAnioPeriodo2VacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVacacionEmpleado(false,false);

			this.getVacacionEmpleadosFK_IdAnioPeriodo2();

			this.inicializarActualizarBindingVacacionEmpleado(false);

			//if(VacacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVacacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVacacionEmpleado(false,false);

			this.getVacacionEmpleadosFK_IdEmpleado();

			this.inicializarActualizarBindingVacacionEmpleado(false);

			//if(VacacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVacacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVacacionEmpleadoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVacacionEmpleado(false,false);

			this.getVacacionEmpleadosFK_IdEmpresa();

			this.inicializarActualizarBindingVacacionEmpleado(false);

			//if(VacacionEmpleadoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVacacionEmpleado(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vacacionempleadoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVacacionEmpleado() {
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
			this.jInternalFrameDetalleFormVacacionEmpleado.setVisible(false);	    			
			this.jInternalFrameDetalleFormVacacionEmpleado.dispose();
			this.jInternalFrameDetalleFormVacacionEmpleado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
			this.jInternalFrameReporteDinamicoVacacionEmpleado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVacacionEmpleado.dispose();
			this.jInternalFrameReporteDinamicoVacacionEmpleado=null;
		}
		
		if(this.jInternalFrameImportacionVacacionEmpleado!=null) {
			this.jInternalFrameImportacionVacacionEmpleado.setVisible(false);	    			
			this.jInternalFrameImportacionVacacionEmpleado.dispose();
			this.jInternalFrameImportacionVacacionEmpleado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVacacionEmpleado();
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVacacionEmpleado")) {
				jButtonDuplicarVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVacacionEmpleado")) {
				jButtonCopiarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormVacacionEmpleado")) {
				jButtonVerFormVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVacacionEmpleado")) {
				jButtonDuplicarVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVacacionEmpleado")) {
				jButtonDuplicarVacacionEmpleadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVacacionEmpleado")) {
				jButtonModificarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVacacionEmpleado")) {
				jButtonModificarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVacacionEmpleado")) {
				jButtonModificarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVacacionEmpleado")) {
				jButtonActualizarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVacacionEmpleado")) {
				jButtonActualizarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVacacionEmpleado")) {
				jButtonActualizarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarVacacionEmpleado")) {
				jButtonEliminarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVacacionEmpleado")) {
				jButtonEliminarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVacacionEmpleado")) {
				jButtonEliminarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarVacacionEmpleado")) {
				jButtonCancelarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVacacionEmpleado")) {
				jButtonCancelarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVacacionEmpleado")) {
				jButtonCancelarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarVacacionEmpleado")) {
				jButtonCerrarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVacacionEmpleado")) {
				jButtonCerrarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVacacionEmpleado")) {
				jButtonCerrarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVacacionEmpleado")) {
				jButtonMostrarOcultarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVacacionEmpleado")) {
				jButtonCancelarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVacacionEmpleado")) {
				jButtonCopiarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVacacionEmpleado")) {
				jButtonVerFormVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVacacionEmpleado")) {
				jButtonCopiarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVacacionEmpleado")) {
				jButtonVerFormVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVacacionEmpleado")) {
				jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVacacionEmpleado")) {
				jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVacacionEmpleado")) {
				jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVacacionEmpleado")) {
				jButtonAnterioresVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVacacionEmpleado")) {
				jButtonAnterioresVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVacacionEmpleado")) {
				jButtonAnterioresVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVacacionEmpleado")) {
				jButtonSiguientesVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVacacionEmpleado")) {
				jButtonSiguientesVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVacacionEmpleado")) {
				jButtonSiguientesVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVacacionEmpleado") || sTipo.equals("MenuItemDetalleAbrirOrderByVacacionEmpleado")) {
				jButtonAbrirOrderByVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVacacionEmpleado") || sTipo.equals("MenuItemDetalleMostrarOcultarVacacionEmpleado")) {
				jButtonMostrarOcultarVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVacacionEmpleado")) {
				jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVacacionEmpleado")) {
				jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVacacionEmpleado")) {
				jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVacacionEmpleado")) {
				jButtonCerrarReporteDinamicoVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVacacionEmpleado")) {
				jButtonGenerarReporteDinamicoVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVacacionEmpleado")) {
				
				jButtonGenerarExcelReporteDinamicoVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVacacionEmpleado")) {
				jButtonCerrarImportacionVacacionEmpleadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVacacionEmpleado")) {
				
				jButtonGenerarImportacionVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVacacionEmpleado")) {
				
				jButtonAbrirImportacionVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVacacionEmpleado")) {
				jComboBoxTiposAccionesVacacionEmpleadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVacacionEmpleado")) {
				jComboBoxTiposRelacionesVacacionEmpleadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVacacionEmpleado")) {
				jComboBoxTiposAccionesVacacionEmpleadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVacacionEmpleado")) {
				
				jComboBoxTiposSeleccionarVacacionEmpleadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVacacionEmpleado")) {
				jTextFieldValorCampoGeneralVacacionEmpleadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVacacionEmpleado")) {
				jButtonAbrirOrderByVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVacacionEmpleado")) {
				jButtonAbrirOrderByVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVacacionEmpleado")) {
				jButtonCerrarOrderByVacacionEmpleadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVacacionEmpleadoBusqueda")) {
				this.jButtonidVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVacacionEmpleadoUpdate")) {
				this.jButtonid_empresaVacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVacacionEmpleadoBusqueda")) {
				this.jButtonid_empresaVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoVacacionEmpleadoUpdate")) {
				this.jButtonid_empleadoVacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoVacacionEmpleadoBusqueda")) {
				this.jButtonid_empleadoVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_periodo1VacacionEmpleadoUpdate")) {
				this.jButtonid_anio_periodo1VacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_periodo1VacacionEmpleadoBusqueda")) {
				this.jButtonid_anio_periodo1VacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_periodo2VacacionEmpleadoUpdate")) {
				this.jButtonid_anio_periodo2VacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_periodo2VacacionEmpleadoBusqueda")) {
				this.jButtonid_anio_periodo2VacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_vecesVacacionEmpleadoBusqueda")) {
				this.jButtonnumero_vecesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_estimadaVacacionEmpleadoBusqueda")) {
				this.jButtonfecha_estimadaVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_vacacionesVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_vacacionesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_tomadosVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_tomadosVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_pagadosVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_pagadosVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_adicionalesVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_adicionalesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioPeriodo1VacacionEmpleado")) {
				this.jButtonFK_IdAnioPeriodo1VacacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdAnioPeriodo2VacacionEmpleado")) {
				this.jButtonFK_IdAnioPeriodo2VacacionEmpleadoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoVacacionEmpleado")) {
				this.jButtonFK_IdEmpleadoVacacionEmpleadoActionPerformed(evt);
			}
			
			;
			
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVacacionEmpleado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VacacionEmpleado vacacionempleadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				vacacionempleadoLocal=this.vacacionempleado;
			} else {
				vacacionempleadoLocal=this.vacacionempleadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
							
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
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
			
			


			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
								
						
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
								
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
							
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
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
			
			


			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
								
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVacacionEmpleado")) {
					jCheckBoxSeleccionarTodosVacacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVacacionEmpleado")) {
					jCheckBoxSeleccionadosVacacionEmpleadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVacacionEmpleado")) {
					
				}
				
				


				
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
												
				
				


				
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
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
			
			


			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVacacionEmpleadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vacacionempleado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vacacionempleado);
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
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
				
				


				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VacacionEmpleado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VacacionEmpleado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVacacionEmpleadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vacacionempleadoAnterior =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVacacionEmpleado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVacacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVacacionEmpleado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vacacionempleado =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vacacionempleado =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vacacionempleado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVacacionEmpleado")) {
				
				}
				
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVacacionEmpleado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVacacionEmpleado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVacacionEmpleado")) {
			
			}
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVacacionEmpleado();
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			if(sTipo.equals("NuevoVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVacacionEmpleado")) {
				jButtonDuplicarVacacionEmpleadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVacacionEmpleado")) {
				jButtonCopiarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVacacionEmpleado")) {
				jButtonVerFormVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVacacionEmpleado")) {
				jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVacacionEmpleado")) {
				jButtonModificarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVacacionEmpleado")) {
				jButtonActualizarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVacacionEmpleado")) {
				jButtonEliminarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVacacionEmpleado")) {
				jButtonCancelarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVacacionEmpleado")) {
				jButtonCerrarVacacionEmpleadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVacacionEmpleado")) {
				jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVacacionEmpleado")) {
				jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVacacionEmpleado")) {
				jButtonAbrirOrderByVacacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVacacionEmpleado")) {
				jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVacacionEmpleado")) {
				jButtonAnterioresVacacionEmpleadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVacacionEmpleado")) {
				jButtonSiguientesVacacionEmpleadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVacacionEmpleadoBusqueda")) {
				this.jButtonidVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVacacionEmpleadoUpdate")) {
				this.jButtonid_empresaVacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVacacionEmpleadoBusqueda")) {
				this.jButtonid_empresaVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoVacacionEmpleadoUpdate")) {
				this.jButtonid_empleadoVacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoVacacionEmpleadoBusqueda")) {
				this.jButtonid_empleadoVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_periodo1VacacionEmpleadoUpdate")) {
				this.jButtonid_anio_periodo1VacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_periodo1VacacionEmpleadoBusqueda")) {
				this.jButtonid_anio_periodo1VacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anio_periodo2VacacionEmpleadoUpdate")) {
				this.jButtonid_anio_periodo2VacacionEmpleadoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anio_periodo2VacacionEmpleadoBusqueda")) {
				this.jButtonid_anio_periodo2VacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_vecesVacacionEmpleadoBusqueda")) {
				this.jButtonnumero_vecesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_estimadaVacacionEmpleadoBusqueda")) {
				this.jButtonfecha_estimadaVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_vacacionesVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_vacacionesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_tomadosVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_tomadosVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_pagadosVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_pagadosVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("horas_adicionalesVacacionEmpleadoBusqueda")) {
				this.jButtonhoras_adicionalesVacacionEmpleadoBusquedaActionPerformed(evt);
			}
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVacacionEmpleado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVacacionEmpleado")) {
				closingInternalFrameVacacionEmpleado();
				
			} else if(sTipo.equals("jButtonCancelarVacacionEmpleado")) {
				JInternalFrameBase jInternalFrameDetalleFormVacacionEmpleado = (JInternalFrameBase)evt.getSource();
	            	
	            VacacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(VacacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormVacacionEmpleado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVacacionEmpleadoActionPerformed(null);
			}
			
			VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vacacionempleado,new Object(),this.vacacionempleadoParameterGeneral,this.vacacionempleadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVacacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVacacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVacacionEmpleado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vacacionempleado)) {
			if(!esControlTabla) {
				if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);			
				}
				
				if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVacacionEmpleado(this.vacacionempleado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vacacionempleadoReturnGeneral=vacacionempleadoLogic.procesarEventosVacacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vacacionempleadoLogic.getVacacionEmpleados(),this.vacacionempleado,this.vacacionempleadoParameterGeneral,this.isEsNuevoVacacionEmpleado,classes);//this.vacacionempleadoLogic.getVacacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVacacionEmpleado(this.vacacionempleadoReturnGeneral,this.vacacionempleadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVacacionEmpleado(classes,this.vacacionempleadoReturnGeneral,this.vacacionempleadoBean,false);
					}
						
					if(this.vacacionempleadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado());	
					}
						
					if(this.vacacionempleadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado(),classes);//this.vacacionempleadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVacacionEmpleado(this.vacacionempleado,classes);//this.vacacionempleadoBean);									
				}
			
				if(VacacionEmpleadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVacacionEmpleado(this.vacacionempleado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVacacionEmpleado(this.vacacionempleado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vacacionempleadoAnterior!=null) {
						this.vacacionempleado=this.vacacionempleadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vacacionempleadoReturnGeneral=vacacionempleadoLogic.procesarEventosVacacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vacacionempleadoLogic.getVacacionEmpleados(),this.vacacionempleado,this.vacacionempleadoParameterGeneral,this.isEsNuevoVacacionEmpleado,classes);//this.vacacionempleadoLogic.getVacacionEmpleado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vacacionempleadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vacacionempleadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vacacionempleadoReturnGeneral.getVacacionEmpleado(),vacacionempleadoLogic.getVacacionEmpleados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vacacionempleadoReturnGeneral.getVacacionEmpleado(),this.vacacionempleados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVacacionEmpleado.repaint();
				
				//((AbstractTableModel) this.jTableDatosVacacionEmpleado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVacacionEmpleado();
			}
		}
	}
	
	public void actualizarVisualTableDatosVacacionEmpleado() throws Exception {
		
		VacacionEmpleadoModel vacacionempleadoModel=(VacacionEmpleadoModel)this.jTableDatosVacacionEmpleado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vacacionempleadoModel.vacacionempleados=this.vacacionempleadoLogic.getVacacionEmpleados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vacacionempleadoModel.vacacionempleados=this.vacacionempleados;
		}
		
		
		((VacacionEmpleadoModel) this.jTableDatosVacacionEmpleado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVacacionEmpleado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvacacionempleadoAnterior(),this.vacacionempleadoLogic.getVacacionEmpleados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvacacionempleadoAnterior(),this.vacacionempleados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVacacionEmpleado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVacacionEmpleado(VacacionEmpleado vacacionempleado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
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
										
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vacacionempleado,new Object(),generalEntityParameterGeneral,this.vacacionempleadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vacacionempleadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VacacionEmpleadoConstantesFunciones.getClassesRelationshipsOfVacacionEmpleado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VacacionEmpleadoConstantesFunciones.getClassesRelationshipsFromStringsOfVacacionEmpleado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVacacionEmpleado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VacacionEmpleadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vacacionempleado,new Object(),generalEntityParameterGeneral,this.vacacionempleadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVacacionEmpleado(VacacionEmpleadoBean vacacionempleadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVacacionEmpleado(ArrayList<Classe> classes,VacacionEmpleadoReturnGeneral vacacionempleadoReturnGeneral,VacacionEmpleadoBean vacacionempleadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVacacionEmpleado(VacacionEmpleado vacacionempleado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vacacionempleado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVacacionEmpleado = new VacacionEmpleadoDetalleFormJInternalFrame(jDesktopPane,this.vacacionempleadoSessionBean.getConGuardarRelaciones(),this.vacacionempleadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.setVisible(false);
		this.jInternalFrameDetalleFormVacacionEmpleado.setSelected(false);						
		
		this.jInternalFrameDetalleFormVacacionEmpleado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVacacionEmpleado.vacacionempleadoLogic=this.vacacionempleadoLogic;
		
		this.cargarCombosFrameForeignKeyVacacionEmpleado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVacacionEmpleado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVacacionEmpleado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVacacionEmpleado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVacacionEmpleado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVacacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVacacionEmpleado"));
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarVacacionEmpleado"));

		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarVacacionEmpleado"));
					
		this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemModificarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarVacacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarVacacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVacacionEmpleado"));
						
		this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemActualizarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVacacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarVacacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarVacacionEmpleado"));
								
		this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemEliminarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVacacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarVacacionEmpleado"));
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarVacacionEmpleado"));
					
		this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemCancelarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVacacionEmpleado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemDetalleCerrarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVacacionEmpleado"));		
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVacacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVacacionEmpleado"));
		
		
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVacacionEmpleado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonidVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonnumero_vecesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_vecesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonfecha_estimadaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_estimadaVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_tomadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_tomadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_pagadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_pagadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_adicionalesVacacionEmpleadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVacacionEmpleado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVacacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVacacionEmpleado"));
		}
		
		this.jTableDatosVacacionEmpleado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVacacionEmpleado"));
		
		this.jTableDatosVacacionEmpleado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVacacionEmpleado"));
		
		this.jButtonNuevoVacacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoVacacionEmpleado"));
		
		this.jButtonDuplicarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarVacacionEmpleado"));
		
		this.jButtonCopiarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"CopiarVacacionEmpleado"));
		
		this.jButtonVerFormVacacionEmpleado.addActionListener(new ButtonActionListener(this,"VerFormVacacionEmpleado"));
		
		
		this.jButtonNuevoToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoToolBarVacacionEmpleado"));
			
		this.jButtonDuplicarToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVacacionEmpleado"));
			
		this.jMenuItemNuevoVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVacacionEmpleado"));
			
		this.jMenuItemDuplicarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVacacionEmpleado"));		
		
		
		this.jButtonNuevoRelacionesVacacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVacacionEmpleado"));
		
		
		this.jButtonNuevoRelacionesToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVacacionEmpleado"));
			
		this.jMenuItemNuevoRelacionesVacacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVacacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarVacacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonModificarToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ModificarToolBarVacacionEmpleado"));
			
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemModificarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"MenuItemModificarVacacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"ActualizarVacacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonActualizarToolBarVacacionEmpleado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVacacionEmpleado"));
				
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemActualizarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVacacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarVacacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonEliminarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"EliminarToolBarVacacionEmpleado"));
						
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemEliminarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVacacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarVacacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonCancelarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CancelarToolBarVacacionEmpleado"));
			
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemCancelarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVacacionEmpleado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVacacionEmpleado"));		
		
		
		this.jButtonCerrarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarVacacionEmpleado"));
		
		
		this.jButtonCerrarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarToolBarVacacionEmpleado"));
			
		this.jMenuItemCerrarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVacacionEmpleado"));
			
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jMenuItemDetalleCerrarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVacacionEmpleado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosVacacionEmpleado"));
		}
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVacacionEmpleado"));
		}
		
		this.jButtonCopiarToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CopiarToolBarVacacionEmpleado"));
			
		this.jButtonVerFormToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"VerFormToolBarVacacionEmpleado"));
		
		this.jMenuItemGuardarCambiosVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVacacionEmpleado"));
			
		this.jMenuItemCopiarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVacacionEmpleado"));		
		
		this.jMenuItemVerFormVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVacacionEmpleado"));		
		
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVacacionEmpleado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVacacionEmpleado"));
			
		this.jMenuItemGuardarCambiosTablaVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVacacionEmpleado"));		
		
		
		
		this.jButtonRecargarInformacionVacacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionVacacionEmpleado"));
					
		this.jButtonRecargarInformacionToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVacacionEmpleado"));
		
		this.jMenuItemRecargarInformacionVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVacacionEmpleado"));		
		
		
		
		this.jButtonAnterioresVacacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresVacacionEmpleado"));
		
		
		this.jButtonAnterioresToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVacacionEmpleado"));
		
		this.jMenuItemAnterioresVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVacacionEmpleado"));		
		
		
		this.jButtonSiguientesVacacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesVacacionEmpleado"));
		
		
		this.jButtonSiguientesToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVacacionEmpleado"));
			
		this.jMenuItemSiguientesVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVacacionEmpleado"));
			
		this.jMenuItemAbrirOrderByVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVacacionEmpleado"));
			
		this.jMenuItemMostrarOcultarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVacacionEmpleado"));
			
		this.jMenuItemDetalleAbrirOrderByVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVacacionEmpleado"));
			
		this.jMenuItemDetalleMostarOcultarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVacacionEmpleado"));		
		
		
		this.jButtonNuevoGuardarCambiosVacacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVacacionEmpleado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVacacionEmpleado"));
			
		this.jMenuItemNuevoGuardarCambiosVacacionEmpleado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVacacionEmpleado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVacacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVacacionEmpleado"));

		this.jCheckBoxSeleccionadosVacacionEmpleado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVacacionEmpleado"));
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVacacionEmpleado"));
		}
		
		
		this.jComboBoxTiposRelacionesVacacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposRelacionesVacacionEmpleado"));
			
		this.jComboBoxTiposAccionesVacacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposAccionesVacacionEmpleado"));
					
		this.jComboBoxTiposSeleccionarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVacacionEmpleado"));
			
		this.jTextFieldValorCampoGeneralVacacionEmpleado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVacacionEmpleado"));		
		
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonidVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonnumero_vecesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_vecesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonfecha_estimadaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_estimadaVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_tomadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_tomadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_pagadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_pagadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_adicionalesVacacionEmpleadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioPeriodo1VacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo1VacacionEmpleado"));

			this.jButtonFK_IdAnioPeriodo2VacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo2VacacionEmpleado"));

			this.jButtonFK_IdEmpleadoVacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoVacacionEmpleado"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVacacionEmpleado!=null) {
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVacacionEmpleado"));
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVacacionEmpleado"));
				this.jInternalFrameReporteDinamicoVacacionEmpleado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVacacionEmpleado"));
			}
			
			//this.jButtonCerrarReporteDinamicoVacacionEmpleado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVacacionEmpleado"));				
			//this.jButtonGenerarReporteDinamicoVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVacacionEmpleado"));
			//this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVacacionEmpleado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVacacionEmpleado!=null) {
				this.jInternalFrameImportacionVacacionEmpleado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVacacionEmpleado"));
				this.jInternalFrameImportacionVacacionEmpleado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVacacionEmpleado"));
				this.jInternalFrameImportacionVacacionEmpleado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVacacionEmpleado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVacacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByVacacionEmpleado"));
			
			this.jButtonAbrirOrderByToolBarVacacionEmpleado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVacacionEmpleado"));			
			
			if(this.jInternalFrameOrderByVacacionEmpleado!=null) {
				this.jInternalFrameOrderByVacacionEmpleado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVacacionEmpleado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVacacionEmpleado.jTabbedPaneRelacionesVacacionEmpleado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVacacionEmpleado"));
		
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
            		closingInternalFrameVacacionEmpleado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVacacionEmpleado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVacacionEmpleado = (JInternalFrameBase)event.getSource();
	            	
	            VacacionEmpleadoBeanSwingJInternalFrame jInternalFrameParent=(VacacionEmpleadoBeanSwingJInternalFrame)jInternalFrameDetalleFormVacacionEmpleado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVacacionEmpleadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVacacionEmpleado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVacacionEmpleadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVacacionEmpleado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVacacionEmpleado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVacacionEmpleado";
		inputMap = this.jButtonNuevoVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVacacionEmpleado";
		inputMap = this.jButtonNuevoRelacionesVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVacacionEmpleadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVacacionEmpleado";
		inputMap = this.jButtonModificarVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVacacionEmpleado";
		inputMap = this.jButtonActualizarVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVacacionEmpleado";
		inputMap = this.jButtonEliminarVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVacacionEmpleado";
		inputMap = this.jButtonCancelarVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVacacionEmpleado";
		inputMap = this.jButtonCerrarVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVacacionEmpleado";
		inputMap = this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonGuardarCambiosVacacionEmpleado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVacacionEmpleadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVacacionEmpleado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVacacionEmpleadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVacacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVacacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVacacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVacacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVacacionEmpleado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVacacionEmpleadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonidVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"idVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empresaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_empleadoVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoVacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo1VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo1VacacionEmpleadoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoUpdate.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonid_anio_periodo2VacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"id_anio_periodo2VacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonnumero_vecesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"numero_vecesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonfecha_estimadaVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_estimadaVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_vacacionesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_vacacionesVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_tomadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_tomadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_pagadosVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_pagadosVacacionEmpleadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVacacionEmpleado.jButtonhoras_adicionalesVacacionEmpleadoBusqueda.addActionListener(new ButtonActionListener(this,"horas_adicionalesVacacionEmpleadoBusqueda"));
		
		
		this.jButtonFK_IdAnioPeriodo1VacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo1VacacionEmpleado"));

		this.jButtonFK_IdAnioPeriodo2VacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdAnioPeriodo2VacacionEmpleado"));

		this.jButtonFK_IdEmpleadoVacacionEmpleado.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoVacacionEmpleado"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVacacionEmpleado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVacacionEmpleadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVacacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVacacionEmpleado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVacacionEmpleado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
					vacacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VacacionEmpleado vacacionempleadoAux:vacacionempleados) {
					vacacionempleadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVacacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
						vacacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VacacionEmpleado vacacionempleadoAux:vacacionempleados) {
						vacacionempleadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VacacionEmpleado vacacionempleadoAux:vacacionempleados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVacacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVacacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVacacionEmpleadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVacacionEmpleado.getSelectedRows();
			
			VacacionEmpleado vacacionempleadoLocal=new VacacionEmpleado();
			
			//this.seleccionarTodosVacacionEmpleado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vacacionempleadoLocal =(VacacionEmpleado) this.vacacionempleadoLogic.getVacacionEmpleados().toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vacacionempleadoLocal =(VacacionEmpleado) this.vacacionempleados.toArray()[this.jTableDatosVacacionEmpleado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vacacionempleadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
						vacacionempleadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VacacionEmpleado vacacionempleadoAux:vacacionempleados) {
						vacacionempleadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVacacionEmpleado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVacacionEmpleado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVacacionEmpleado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVacacionEmpleadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVacacionEmpleadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVacacionEmpleadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVacacionEmpleado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleadoLogic.getVacacionEmpleados()) {
				
						if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES)) {
							existe=true;
							vacacionempleadoAux.setnumero_veces(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA)) {
							existe=true;
							vacacionempleadoAux.setfecha_estimada(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES)) {
							existe=true;
							vacacionempleadoAux.sethoras_vacaciones(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS)) {
							existe=true;
							vacacionempleadoAux.sethoras_tomados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS)) {
							existe=true;
							vacacionempleadoAux.sethoras_pagados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES)) {
							existe=true;
							vacacionempleadoAux.sethoras_adicionales(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VacacionEmpleado vacacionempleadoAux:vacacionempleados) {
					
						if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES)) {
							existe=true;
							vacacionempleadoAux.setnumero_veces(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA)) {
							existe=true;
							vacacionempleadoAux.setfecha_estimada(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES)) {
							existe=true;
							vacacionempleadoAux.sethoras_vacaciones(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS)) {
							existe=true;
							vacacionempleadoAux.sethoras_tomados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS)) {
							existe=true;
							vacacionempleadoAux.sethoras_pagados(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES)) {
							existe=true;
							vacacionempleadoAux.sethoras_adicionales(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVacacionEmpleadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVacacionEmpleado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVacacionEmpleado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVacacionEmpleado) {				
					conSplash=true;//false;										
					
					//this.startProcessVacacionEmpleado(conSplash);
				
					this.generarReporteVacacionEmpleadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVacacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVacacionEmpleadosSeleccionados(false);
				//this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVacacionEmpleadosSeleccionados(true);
				//this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVacacionEmpleado();
				
				this.exportarVacacionEmpleadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVacacionEmpleados();
				//this.importarVacacionEmpleados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVacacionEmpleado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVacacionEmpleadosSeleccionados();
				//this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vacacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVacacionEmpleado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVacacionEmpleado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVacacionEmpleado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
				}	
			} 			
			else if(VacacionEmpleadoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVacacionEmpleado) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVacacionEmpleado(conSplash);
					
						//this.actualizarParametrosGeneralVacacionEmpleado();
						
						this.generarReporteProcesoAccionVacacionEmpleadosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VacacionEmpleadoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Vacacion EmpleadoS SELECCIONADOS?", "MANTENIMIENTO DE Vacacion Empleado", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVacacionEmpleado();
				
						this.actualizarParametrosGeneralVacacionEmpleado();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vacacionempleadoReturnGeneral=vacacionempleadoLogic.procesarAccionVacacionEmpleadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vacacionempleadoLogic.getVacacionEmpleados(),this.vacacionempleadoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVacacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVacacionEmpleado();
					
					VacacionEmpleadoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVacacionEmpleadoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVacacionEmpleado.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxTiposAccionesFormularioVacacionEmpleado.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVacacionEmpleado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVacacionEmpleadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVacacionEmpleado();
			
			if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
			VacacionEmpleado vacacionempleado=new VacacionEmpleado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVacacionEmpleado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVacacionEmpleado.getSelectedItem();
			
			
			
			
			vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(vacacionempleadosSeleccionados.size()==1) {
				for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
					vacacionempleado=vacacionempleadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVacacionEmpleado();
			
      		//this.finishProcessVacacionEmpleado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVacacionEmpleadoReturnGeneral() throws Exception {
		if(this.vacacionempleadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vacacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vacacionempleadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vacacionempleadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vacacionempleadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vacacionempleadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVacacionEmpleado(false);
		}
		
		if(this.vacacionempleadoReturnGeneral.getConRetornoLista() || this.vacacionempleadoReturnGeneral.getConRetornoObjeto()) {
			if(this.vacacionempleadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vacacionempleadoLogic.setVacacionEmpleados(this.vacacionempleadoReturnGeneral.getVacacionEmpleados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vacacionempleadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vacacionempleadoLogic.setVacacionEmpleado(this.vacacionempleadoReturnGeneral.getVacacionEmpleado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVacacionEmpleado(false);
		}
	}
	
	public void actualizarParametrosGeneralVacacionEmpleado() throws Exception {
		
		
	}
	
	public ArrayList<VacacionEmpleado> getVacacionEmpleadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVacacionEmpleado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VacacionEmpleado vacacionempleadoAux:vacacionempleadoLogic.getVacacionEmpleados()) {
					if(vacacionempleadoAux.getIsSelected()) {
						vacacionempleadosSeleccionados.add(vacacionempleadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VacacionEmpleado vacacionempleadoAux:this.vacacionempleados) {
					if(vacacionempleadoAux.getIsSelected()) {
						vacacionempleadosSeleccionados.add(vacacionempleadoAux);				
					}
				}
			}
			
			if(vacacionempleadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vacacionempleadosSeleccionados.addAll(this.vacacionempleadoLogic.getVacacionEmpleados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vacacionempleadosSeleccionados.addAll(this.vacacionempleados);				
					}
				}
			}
		} else {
			vacacionempleadosSeleccionados.add(this.vacacionempleado);
		}
		
		return vacacionempleadosSeleccionados;
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
	
	public void generarReporteVacacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVacacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVacacionEmpleadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVacacionEmpleadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVacacionEmpleadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vacacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados);
		
	}	
	
	public void generarReporteNormalVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVacacionEmpleadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVacacionEmpleado();
		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVacacionEmpleado();
		
		
		//this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados ,vacacionempleadoImplementable,vacacionempleadoImplementableHome);
	}
	
	public void mostrarImportacionVacacionEmpleados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVacacionEmpleado();
		
		this.abrirFrameImportacionVacacionEmpleado();		
		
			
		//this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados ,vacacionempleadoImplementable,vacacionempleadoImplementableHome);
	}
	
	public void importarVacacionEmpleados() throws Exception {		
	
	}
	
	public void exportarVacacionEmpleadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVacacionEmpleadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVacacionEmpleadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVacacionEmpleadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vacacion Empleado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVacacionEmpleado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVacacionEmpleado(vacacionempleadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vacacionempleadoAux.setsDetalleGeneralEntityReporte(vacacionempleadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVacacionEmpleado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVacacionEmpleado(VacacionEmpleado vacacionempleado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vacacionempleado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getanioperiodo1_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getanioperiodo2_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getnumero_veces().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.getfecha_estimada().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.gethoras_vacaciones().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.gethoras_tomados().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.gethoras_pagados().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vacacionempleado.gethoras_adicionales().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VacacionEmpleados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVacacionEmpleado(row);				
				iRow++;
			}				
			
			for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVacacionEmpleado(vacacionempleadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVacacionEmpleadosSeleccionados() throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();		
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vacacionempleado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vacacionempleados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vacacionempleado");
			//elementRoot.appendChild(element);
		
			for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
				element = document.createElement("vacacionempleado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVacacionEmpleado(vacacionempleadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vacacion Empleado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVacacionEmpleado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASVACACIONES);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASTOMADOS);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASPAGADOS);
		cell = row.createCell(iColumn++);cell.setCellValue(VacacionEmpleadoConstantesFunciones.LABEL_HORASADICIONALES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVacacionEmpleado(VacacionEmpleado vacacionempleado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getanioperiodo1_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getanioperiodo2_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getnumero_veces());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.getfecha_estimada());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.gethoras_vacaciones());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.gethoras_tomados());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.gethoras_pagados());
		cell = row.createCell(iColumn++);cell.setCellValue(vacacionempleado.gethoras_adicionales());				
	}
	
	public void setFilaDatosExportarXmlVacacionEmpleado(VacacionEmpleado vacacionempleado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VacacionEmpleadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vacacionempleado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VacacionEmpleadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vacacionempleado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VacacionEmpleadoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vacacionempleado.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(VacacionEmpleadoConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(vacacionempleado.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementanioperiodo1_descripcion = document.createElement(VacacionEmpleadoConstantesFunciones.IDANIOPERIODO1);
		elementanioperiodo1_descripcion.appendChild(document.createTextNode(vacacionempleado.getanioperiodo1_descripcion()));
		element.appendChild(elementanioperiodo1_descripcion);

		Element elementanioperiodo2_descripcion = document.createElement(VacacionEmpleadoConstantesFunciones.IDANIOPERIODO2);
		elementanioperiodo2_descripcion.appendChild(document.createTextNode(vacacionempleado.getanioperiodo2_descripcion()));
		element.appendChild(elementanioperiodo2_descripcion);

		Element elementnumero_veces = document.createElement(VacacionEmpleadoConstantesFunciones.NUMEROVECES);
		elementnumero_veces.appendChild(document.createTextNode(vacacionempleado.getnumero_veces().toString().trim()));
		element.appendChild(elementnumero_veces);

		Element elementfecha_estimada = document.createElement(VacacionEmpleadoConstantesFunciones.FECHAESTIMADA);
		elementfecha_estimada.appendChild(document.createTextNode(vacacionempleado.getfecha_estimada().toString().trim()));
		element.appendChild(elementfecha_estimada);

		Element elementhoras_vacaciones = document.createElement(VacacionEmpleadoConstantesFunciones.HORASVACACIONES);
		elementhoras_vacaciones.appendChild(document.createTextNode(vacacionempleado.gethoras_vacaciones().toString().trim()));
		element.appendChild(elementhoras_vacaciones);

		Element elementhoras_tomados = document.createElement(VacacionEmpleadoConstantesFunciones.HORASTOMADOS);
		elementhoras_tomados.appendChild(document.createTextNode(vacacionempleado.gethoras_tomados().toString().trim()));
		element.appendChild(elementhoras_tomados);

		Element elementhoras_pagados = document.createElement(VacacionEmpleadoConstantesFunciones.HORASPAGADOS);
		elementhoras_pagados.appendChild(document.createTextNode(vacacionempleado.gethoras_pagados().toString().trim()));
		element.appendChild(elementhoras_pagados);

		Element elementhoras_adicionales = document.createElement(VacacionEmpleadoConstantesFunciones.HORASADICIONALES);
		elementhoras_adicionales.appendChild(document.createTextNode(vacacionempleado.gethoras_adicionales().toString().trim()));
		element.appendChild(elementhoras_adicionales);
	}
	
	public void generarReporteGroupGenericoVacacionEmpleadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados=new ArrayList<VacacionEmpleado>();
		
		vacacionempleadosSeleccionados=this.getVacacionEmpleadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVacacionEmpleado(vacacionempleadosSeleccionados);
		
		this.generarReporteVacacionEmpleados("Todos",vacacionempleadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVacacionEmpleado(ArrayList<VacacionEmpleado> vacacionempleadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VacacionEmpleado vacacionempleadoAux:vacacionempleadosSeleccionados) {
				vacacionempleadoAux.setsDetalleGeneralEntityReporte(vacacionempleadoAux.toString());
			
				if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(vacacionempleadoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(vacacionempleadoAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO1)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(vacacionempleadoAux.getanioperiodo1_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_IDANIOPERIODO2)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(vacacionempleadoAux.getanioperiodo2_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_NUMEROVECES)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(vacacionempleadoAux.getnumero_veces().toString());
				}
				 else if(sTipoSeleccionar.equals(VacacionEmpleadoConstantesFunciones.LABEL_FECHAESTIMADA)) {
					existe=true;
					vacacionempleadoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vacacionempleadoAux.getfecha_estimada()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VacacionEmpleadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVacacionEmpleado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVacacionEmpleado=true;
				this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=true;
				this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=true;
			}
			
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=true;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=true;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=true;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=true;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=true;
			this.isVisibilidadCeldaModificarVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=true;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
			this.isVisibilidadCeldaModificarVacacionEmpleado=true;
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
			this.isVisibilidadCeldaCancelarVacacionEmpleado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				} else {
					this.isVisibilidadCeldaGuardarVacacionEmpleado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VacacionEmpleadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVacacionEmpleado=true;
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=true;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=true;
		} else {
			this.actualizarEstadoPanelsVacacionEmpleado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVacacionEmpleado=false;
			//this.isVisibilidadCeldaVerFormVacacionEmpleado=false;
			this.isVisibilidadCeldaDuplicarVacacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vacacionempleadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
		} else {
			this.isVisibilidadCeldaNuevoVacacionEmpleado=false;
			this.isVisibilidadCeldaGuardarCambiosVacacionEmpleado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!vacacionempleadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;												
			}
			
			this.jButtonCerrarVacacionEmpleado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVacacionEmpleado=false;
		}
		
		if(!this.permiteMantenimiento(this.vacacionempleado)) {
			this.isVisibilidadCeldaActualizarVacacionEmpleado=false;
			this.isVisibilidadCeldaEliminarVacacionEmpleado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVacacionEmpleado() {
	}
	
	public void actualizarEstadoPanelsVacacionEmpleado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVacacionEmpleado!=null) {
				this.jScrollPanelDatosEdicionVacacionEmpleado.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVacacionEmpleado!=null) {
				this.jScrollPanelDatosVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelPaginacionVacacionEmpleado!=null) {
				this.jPanelPaginacionVacacionEmpleado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
					this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vacacionempleadoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVacacionEmpleado!=null) {
				this.jTabbedPaneBusquedasVacacionEmpleado.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVacacionEmpleado!=null) {
				this.jPanelParametrosReportesVacacionEmpleado.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnioPeriodo1=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnioPeriodo1) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo1VacacionEmpleado);}

			this.isVisibilidadFK_IdAnioPeriodo2=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnioPeriodo2) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo2VacacionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdEmpleadoVacacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnioPeriodo1=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnioPeriodo1) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo1VacacionEmpleado);}

			this.isVisibilidadFK_IdAnioPeriodo2=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnioPeriodo2) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo2VacacionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdEmpleadoVacacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnioPeriodo1(Boolean isParaAnioPeriodo1){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioPeriodo1Negation=!isParaAnioPeriodo1;

			this.isVisibilidadFK_IdAnioPeriodo1=isParaAnioPeriodo1;
			if(!this.isVisibilidadFK_IdAnioPeriodo1) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo1VacacionEmpleado);}

			this.isVisibilidadFK_IdAnioPeriodo2=isParaAnioPeriodo1Negation;
			if(!this.isVisibilidadFK_IdAnioPeriodo2) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo2VacacionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioPeriodo1Negation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdEmpleadoVacacionEmpleado);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnioPeriodo2(Boolean isParaAnioPeriodo2){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioPeriodo2Negation=!isParaAnioPeriodo2;

			this.isVisibilidadFK_IdAnioPeriodo1=isParaAnioPeriodo2Negation;
			if(!this.isVisibilidadFK_IdAnioPeriodo1) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo1VacacionEmpleado);}

			this.isVisibilidadFK_IdAnioPeriodo2=isParaAnioPeriodo2;
			if(!this.isVisibilidadFK_IdAnioPeriodo2) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdAnioPeriodo2VacacionEmpleado);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioPeriodo2Negation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasVacacionEmpleado.remove(jPanelFK_IdEmpleadoVacacionEmpleado);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VacacionEmpleadoSessionBean vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		
		if(this.vacacionempleadoSessionBean==null) {
			this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		}
		
		this.vacacionempleadoSessionBean.setsUltimaBusquedaVacacionEmpleado(this.getsAccionBusqueda());
		this.vacacionempleadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vacacionempleadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnioPeriodo1")) {
			vacacionempleadoSessionBean.setid_anio_periodo1(this.getid_anio_periodo1FK_IdAnioPeriodo1());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdAnioPeriodo2")) {
			vacacionempleadoSessionBean.setid_anio_periodo2(this.getid_anio_periodo2FK_IdAnioPeriodo2());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			vacacionempleadoSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vacacionempleadoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VacacionEmpleadoSessionBean vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		
		if(this.vacacionempleadoSessionBean==null) {
			this.vacacionempleadoSessionBean=new VacacionEmpleadoSessionBean();
		}
		
		if(this.vacacionempleadoSessionBean.getsUltimaBusquedaVacacionEmpleado()!=null&&!this.vacacionempleadoSessionBean.getsUltimaBusquedaVacacionEmpleado().equals("")) {
			this.setsAccionBusqueda(vacacionempleadoSessionBean.getsUltimaBusquedaVacacionEmpleado());
			this.setiNumeroPaginacion(vacacionempleadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vacacionempleadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnioPeriodo1")) {
				this.setid_anio_periodo1FK_IdAnioPeriodo1(vacacionempleadoSessionBean.getid_anio_periodo1());
				vacacionempleadoSessionBean.setid_anio_periodo1(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdAnioPeriodo2")) {
				this.setid_anio_periodo2FK_IdAnioPeriodo2(vacacionempleadoSessionBean.getid_anio_periodo2());
				vacacionempleadoSessionBean.setid_anio_periodo2(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(vacacionempleadoSessionBean.getid_empleado());
				vacacionempleadoSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vacacionempleadoSessionBean.getid_empresa());
				vacacionempleadoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.vacacionempleadoSessionBean.setsUltimaBusquedaVacacionEmpleado("");
		this.vacacionempleadoSessionBean.setiNumeroPaginacion(VacacionEmpleadoConstantesFunciones.INUMEROPAGINACION);
		this.vacacionempleadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVacacionEmpleado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVacacionEmpleado() {
		this.updateBorderResaltarBusquedasFormularioVacacionEmpleado();
		this.updateVisibilidadBusquedasFormularioVacacionEmpleado();
		this.updateHabilitarBusquedasFormularioVacacionEmpleado();
	}
	
	public void updateBorderResaltarBusquedasFormularioVacacionEmpleado() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVacacionEmpleado.getComponents().length>0) {
	

		if(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo1VacacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo1VacacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo1VacacionEmpleado);
			}
		}

		if(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo2VacacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo2VacacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo2VacacionEmpleado);
			}
		}

		if(this.vacacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoVacacionEmpleado!=null) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoVacacionEmpleado);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoVacacionEmpleado);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVacacionEmpleado() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVacacionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo1VacacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vacacionempleadoConstantesFunciones.mostrarFK_IdAnioPeriodo1VacacionEmpleado);
			if(!this.vacacionempleadoConstantesFunciones.mostrarFK_IdAnioPeriodo1VacacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasVacacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo2VacacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vacacionempleadoConstantesFunciones.mostrarFK_IdAnioPeriodo2VacacionEmpleado);
			if(!this.vacacionempleadoConstantesFunciones.mostrarFK_IdAnioPeriodo2VacacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasVacacionEmpleado.remove(index);
			}

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoVacacionEmpleado);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vacacionempleadoConstantesFunciones.mostrarFK_IdEmpleadoVacacionEmpleado);
			if(!this.vacacionempleadoConstantesFunciones.mostrarFK_IdEmpleadoVacacionEmpleado && index>-1) {
				this.jTabbedPaneBusquedasVacacionEmpleado.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVacacionEmpleado() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVacacionEmpleado.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo1VacacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vacacionempleadoConstantesFunciones.activarFK_IdAnioPeriodo1VacacionEmpleado);
				this.jTabbedPaneBusquedasVacacionEmpleado.setEnabledAt(index,this.vacacionempleadoConstantesFunciones.activarFK_IdAnioPeriodo1VacacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo2VacacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vacacionempleadoConstantesFunciones.activarFK_IdAnioPeriodo2VacacionEmpleado);
				this.jTabbedPaneBusquedasVacacionEmpleado.setEnabledAt(index,this.vacacionempleadoConstantesFunciones.activarFK_IdAnioPeriodo2VacacionEmpleado);
			}

			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoVacacionEmpleado);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vacacionempleadoConstantesFunciones.activarFK_IdEmpleadoVacacionEmpleado);
				this.jTabbedPaneBusquedasVacacionEmpleado.setEnabledAt(index,this.vacacionempleadoConstantesFunciones.activarFK_IdEmpleadoVacacionEmpleado);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVacacionEmpleado(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnioPeriodo1")) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo1VacacionEmpleado);

			this.jTabbedPaneBusquedasVacacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);

			this.vacacionempleadoConstantesFunciones.setResaltarFK_IdAnioPeriodo1VacacionEmpleado(resaltar);

			jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo1VacacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdAnioPeriodo2")) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdAnioPeriodo2VacacionEmpleado);

			this.jTabbedPaneBusquedasVacacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);

			this.vacacionempleadoConstantesFunciones.setResaltarFK_IdAnioPeriodo2VacacionEmpleado(resaltar);

			jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdAnioPeriodo2VacacionEmpleado);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasVacacionEmpleado.indexOfComponent(this.jPanelFK_IdEmpleadoVacacionEmpleado);

			this.jTabbedPaneBusquedasVacacionEmpleado.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVacacionEmpleado.getComponent(index);

			this.vacacionempleadoConstantesFunciones.setResaltarFK_IdEmpleadoVacacionEmpleado(resaltar);

			jPanel.setBorder(this.vacacionempleadoConstantesFunciones.resaltarFK_IdEmpleadoVacacionEmpleado);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVacacionEmpleado.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVacacionEmpleado() throws Exception {

		if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVacacionEmpleado();
		this.updateVisibilidadResaltarControlesFormularioVacacionEmpleado();
		this.updateHabilitarResaltarControlesFormularioVacacionEmpleado();
		
	}
	
	public void updateBorderResaltarControlesFormularioVacacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vacacionempleadoConstantesFunciones.resaltaridVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltaridVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarid_empresaVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarid_empresaVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarid_empleadoVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarid_empleadoVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo1VacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo1VacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo2VacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarid_anio_periodo2VacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarnumero_vecesVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarnumero_vecesVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarfecha_estimadaVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarfecha_estimadaVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarhoras_vacacionesVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarhoras_vacacionesVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarhoras_tomadosVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarhoras_tomadosVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarhoras_pagadosVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarhoras_pagadosVacacionEmpleado);}
		if(this.vacacionempleadoConstantesFunciones.resaltarhoras_adicionalesVacacionEmpleado!=null && this.jInternalFrameDetalleFormVacacionEmpleado!=null) {this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setBorder(this.vacacionempleadoConstantesFunciones.resaltarhoras_adicionalesVacacionEmpleado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVacacionEmpleado() throws Exception {		
		if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
	
		//this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostraridVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelidVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostraridVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_empresaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelid_empresaVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_empresaVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_empleadoVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelid_empleadoVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_empleadoVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo1VacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelid_anio_periodo1VacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo1VacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo2VacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelid_anio_periodo2VacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarid_anio_periodo2VacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarnumero_vecesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelnumero_vecesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarnumero_vecesVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarfecha_estimadaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelfecha_estimadaVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarfecha_estimadaVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_vacacionesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelhoras_vacacionesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_vacacionesVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_tomadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelhoras_tomadosVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_tomadosVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_pagadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelhoras_pagadosVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_pagadosVacacionEmpleado);
		//this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_adicionalesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jPanelhoras_adicionalesVacacionEmpleado.setVisible(this.vacacionempleadoConstantesFunciones.mostrarhoras_adicionalesVacacionEmpleado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVacacionEmpleado() throws Exception {
		if(this.jInternalFrameDetalleFormVacacionEmpleado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVacacionEmpleado!=null) {
	
		this.jInternalFrameDetalleFormVacacionEmpleado.jLabelidVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activaridVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empresaVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarid_empresaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_empleadoVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarid_empleadoVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo1VacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarid_anio_periodo1VacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jComboBoxid_anio_periodo2VacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarid_anio_periodo2VacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldnumero_vecesVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarnumero_vecesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jDateChooserfecha_estimadaVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarfecha_estimadaVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_vacacionesVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarhoras_vacacionesVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_tomadosVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarhoras_tomadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_pagadosVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarhoras_pagadosVacacionEmpleado);
		this.jInternalFrameDetalleFormVacacionEmpleado.jTextFieldhoras_adicionalesVacacionEmpleado.setEnabled(this.vacacionempleadoConstantesFunciones.activarhoras_adicionalesVacacionEmpleado);
		}
	}
	
		
}