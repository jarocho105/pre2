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

import com.bydan.erp.nomina.util.NumeroPatronalConstantesFunciones;
import com.bydan.erp.nomina.util.NumeroPatronalParameterReturnGeneral;
//import com.bydan.erp.nomina.util.NumeroPatronalParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.NumeroPatronalBean;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class NumeroPatronalBeanSwingJInternalFrame extends NumeroPatronalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(NumeroPatronalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<NumeroPatronal> numeropatronalValidator = new ClassValidator<NumeroPatronal>(NumeroPatronal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public NumeroPatronal numeropatronal;	
	public NumeroPatronal numeropatronalAux;
	public NumeroPatronal numeropatronalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public NumeroPatronal numeropatronalTotales;
	public Long idNumeroPatronalActual;
	public Long iIdNuevoNumeroPatronal=0L;
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

	public String sFinalQueryComboProvincia="";

	public List<Provincia> provinciasForeignKey;

	public List<Provincia> getprovinciasForeignKey() {
		return provinciasForeignKey;
	}

	public void setprovinciasForeignKey(List<Provincia> provinciasForeignKey) {
		this.provinciasForeignKey = provinciasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Provincia provinciaForeignKey;

	public Provincia getprovinciaForeignKey() {
		return provinciaForeignKey;
	}

	public void setprovinciaForeignKey(Provincia provinciaForeignKey) {
		this.provinciaForeignKey = provinciaForeignKey;
	}

	public String sFinalQueryComboCanton="";

	public List<Canton> cantonsForeignKey;

	public List<Canton> getcantonsForeignKey() {
		return cantonsForeignKey;
	}

	public void setcantonsForeignKey(List<Canton> cantonsForeignKey) {
		this.cantonsForeignKey = cantonsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Canton cantonForeignKey;

	public Canton getcantonForeignKey() {
		return cantonForeignKey;
	}

	public void setcantonForeignKey(Canton cantonForeignKey) {
		this.cantonForeignKey = cantonForeignKey;
	}

	public String sFinalQueryComboParroquia="";

	public List<Parroquia> parroquiasForeignKey;

	public List<Parroquia> getparroquiasForeignKey() {
		return parroquiasForeignKey;
	}

	public void setparroquiasForeignKey(List<Parroquia> parroquiasForeignKey) {
		this.parroquiasForeignKey = parroquiasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Parroquia parroquiaForeignKey;

	public Parroquia getparroquiaForeignKey() {
		return parroquiaForeignKey;
	}

	public void setparroquiaForeignKey(Parroquia parroquiaForeignKey) {
		this.parroquiaForeignKey = parroquiaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
	}


	public Boolean isTienePermisosEstructura=false;

	public Boolean getIsTienePermisosEstructura() {
		return isTienePermisosEstructura;
	}

	public void setIsTienePermisosEstructura(Boolean isTienePermisosEstructura) {
		this.isTienePermisosEstructura= isTienePermisosEstructura;
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
	
	public Boolean isPermisoTodoNumeroPatronal;
	public Boolean isPermisoNuevoNumeroPatronal;
	public Boolean isPermisoActualizarNumeroPatronal;
	public Boolean isPermisoActualizarOriginalNumeroPatronal;
	public Boolean isPermisoEliminarNumeroPatronal;
	public Boolean isPermisoGuardarCambiosNumeroPatronal;
	public Boolean isPermisoConsultaNumeroPatronal;
	public Boolean isPermisoBusquedaNumeroPatronal;
	public Boolean isPermisoReporteNumeroPatronal;
	public Boolean isPermisoPaginacionMedioNumeroPatronal;
	public Boolean isPermisoPaginacionAltoNumeroPatronal;
	public Boolean isPermisoPaginacionTodoNumeroPatronal;
	public Boolean isPermisoCopiarNumeroPatronal;
	public Boolean isPermisoVerFormNumeroPatronal;
	public Boolean isPermisoDuplicarNumeroPatronal;
	public Boolean isPermisoOrdenNumeroPatronal;
	
	
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
	
	public NumeroPatronalParameterReturnGeneral numeropatronalReturnGeneral;
	public NumeroPatronalParameterReturnGeneral numeropatronalParameterGeneral;
	
	

	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}


	public EstructuraLogic estructuraLogic=null;

	public EstructuraLogic getEstructuraLogic() {
		return estructuraLogic;
	}

	public void setEstructuraLogic(EstructuraLogic estructuraLogic) {
		this.estructuraLogic = estructuraLogic;
	}


	public CargoLogic cargoLogic=null;

	public CargoLogic getCargoLogic() {
		return cargoLogic;
	}

	public void setCargoLogic(CargoLogic cargoLogic) {
		this.cargoLogic = cargoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoNumeroPatronal=false;
	public Boolean esParaAccionDesdeFormularioNumeroPatronal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected NumeroPatronalSessionBeanAdditional numeropatronalSessionBeanAdditional=null;
	
	public NumeroPatronalSessionBeanAdditional getNumeroPatronalSessionBeanAdditional() {
		return this.numeropatronalSessionBeanAdditional;
	}
	
	public void setNumeroPatronalSessionBeanAdditional(NumeroPatronalSessionBeanAdditional numeropatronalSessionBeanAdditional) {
		try {
			this.numeropatronalSessionBeanAdditional=numeropatronalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected NumeroPatronalBeanSwingJInternalFrameAdditional numeropatronalBeanSwingJInternalFrameAdditional=null;
	//public class NumeroPatronalBeanSwingJInternalFrame
	
	public NumeroPatronalBeanSwingJInternalFrameAdditional getNumeroPatronalBeanSwingJInternalFrameAdditional() {
		return this.numeropatronalBeanSwingJInternalFrameAdditional;
	}
	
	public void setNumeroPatronalBeanSwingJInternalFrameAdditional(NumeroPatronalBeanSwingJInternalFrameAdditional numeropatronalBeanSwingJInternalFrameAdditional) {
		try {
			this.numeropatronalBeanSwingJInternalFrameAdditional=numeropatronalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public NumeroPatronalLogic numeropatronalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public NumeroPatronal numeropatronalBean;
	public NumeroPatronalConstantesFunciones numeropatronalConstantesFunciones;
	//public NumeroPatronalParameterReturnGeneral numeropatronalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ProvinciaLogic provinciaLogic;
	public CantonLogic cantonLogic;
	public ParroquiaLogic parroquiaLogic;
	
	//PARAMETROS
	
	
	//public List<NumeroPatronal> numeropatronals;	
	//public List<NumeroPatronal> numeropatronalsEliminados;
	//public List<NumeroPatronal> numeropatronalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoNumeroPatronal=false;
	public Boolean isVisibilidadCeldaDuplicarNumeroPatronal=true;
	public Boolean isVisibilidadCeldaCopiarNumeroPatronal=true;
	public Boolean isVisibilidadCeldaVerFormNumeroPatronal=true;
	public Boolean isVisibilidadCeldaOrdenNumeroPatronal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
	public Boolean isVisibilidadCeldaModificarNumeroPatronal=false;
	public Boolean isVisibilidadCeldaActualizarNumeroPatronal=false;
	public Boolean isVisibilidadCeldaEliminarNumeroPatronal=false;
	public Boolean isVisibilidadCeldaCancelarNumeroPatronal=false;
	public Boolean isVisibilidadCeldaGuardarNumeroPatronal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;	
	
	
	public Boolean isVisibilidadFK_IdCanton=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdParroquia=false;
	public Boolean isVisibilidadFK_IdProvincia=false;
	
	public Long getiIdNuevoNumeroPatronal() {
		return this.iIdNuevoNumeroPatronal;
	}

	public void setiIdNuevoNumeroPatronal(Long iIdNuevoNumeroPatronal) {
		this.iIdNuevoNumeroPatronal = iIdNuevoNumeroPatronal;
	}
	
	public Long getidNumeroPatronalActual() {
		return this.idNumeroPatronalActual;
	}

	public void setidNumeroPatronalActual(Long idNumeroPatronalActual) {
		this.idNumeroPatronalActual = idNumeroPatronalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public NumeroPatronal getnumeropatronal() {
		return this.numeropatronal;
	}

	public void setnumeropatronal(NumeroPatronal numeropatronal) {
		this.numeropatronal = numeropatronal;
	}
	
	public NumeroPatronal getnumeropatronalAux() {
		return this.numeropatronalAux;
	}

	public void setnumeropatronalAux(NumeroPatronal numeropatronalAux) {
		this.numeropatronalAux = numeropatronalAux;
	}				
	
	public NumeroPatronal getnumeropatronalAnterior() {
		return this.numeropatronalAnterior;
	}

	public void setnumeropatronalAnterior(NumeroPatronal numeropatronalAnterior) {
		this.numeropatronalAnterior = numeropatronalAnterior;
	}	
	
	public NumeroPatronal getnumeropatronalTotales() {
		return this.numeropatronalTotales;
	}

	public void setnumeropatronalTotales(NumeroPatronal numeropatronalTotales) {
		this.numeropatronalTotales = numeropatronalTotales;
	}	
	
	public NumeroPatronal getnumeropatronalBean() {
		return this.numeropatronalBean;
	}

	public void setnumeropatronalBean(NumeroPatronal numeropatronalBean) {
		this.numeropatronalBean = numeropatronalBean;
	}	
	
	public NumeroPatronalParameterReturnGeneral getnumeropatronalReturnGeneral() {
		return this.numeropatronalReturnGeneral;
	}

	public void setnumeropatronalReturnGeneral(NumeroPatronalParameterReturnGeneral numeropatronalReturnGeneral) {
		this.numeropatronalReturnGeneral = numeropatronalReturnGeneral;
	}	
	
	
	public Long id_cantonFK_IdCanton=-1L;

	public Long getid_cantonFK_IdCanton() {
		return this.id_cantonFK_IdCanton;
	}

	public void setid_cantonFK_IdCanton(Long id_cantonFK_IdCanton) {
		this.id_cantonFK_IdCanton = id_cantonFK_IdCanton;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_parroquiaFK_IdParroquia=-1L;

	public Long getid_parroquiaFK_IdParroquia() {
		return this.id_parroquiaFK_IdParroquia;
	}

	public void setid_parroquiaFK_IdParroquia(Long id_parroquiaFK_IdParroquia) {
		this.id_parroquiaFK_IdParroquia = id_parroquiaFK_IdParroquia;
	}

	public Long id_provinciaFK_IdProvincia=-1L;

	public Long getid_provinciaFK_IdProvincia() {
		return this.id_provinciaFK_IdProvincia;
	}

	public void setid_provinciaFK_IdProvincia(Long id_provinciaFK_IdProvincia) {
		this.id_provinciaFK_IdProvincia = id_provinciaFK_IdProvincia;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public NumeroPatronalLogic getNumeroPatronalLogic()	{		
		return numeropatronalLogic;
	}

	public void setNumeroPatronalLogic(NumeroPatronalLogic numeropatronalLogic) {
		this.numeropatronalLogic = numeropatronalLogic;
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
	
	public Boolean getIsEsNuevoNumeroPatronal() {
		return isEsNuevoNumeroPatronal;
	}

	public void setIsEsNuevoNumeroPatronal(Boolean isEsNuevoNumeroPatronal) {
		this.isEsNuevoNumeroPatronal = isEsNuevoNumeroPatronal;
	}

	public Boolean getEsParaAccionDesdeFormularioNumeroPatronal() {
		return esParaAccionDesdeFormularioNumeroPatronal;
	}
	
	public void setEsParaAccionDesdeFormularioNumeroPatronal(Boolean esParaAccionDesdeFormularioNumeroPatronal) {
		this.esParaAccionDesdeFormularioNumeroPatronal = esParaAccionDesdeFormularioNumeroPatronal;
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

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(numeropatronalSessionBean.getlidEmpresaActual());
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

	public void cargarCombosProvinciasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.provinciasForeignKey=new ArrayList<Provincia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProvinciaLogic provinciaLogic=new ProvinciaLogic();

			//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//provinciaLogic.getProvinciaDataAccess().setIsForForeingKeyData(true);

					provinciaLogic.getTodosProvinciasWithConnection(sFinalQuery,new Pagination());

					this.provinciasForeignKey=provinciaLogic.getProvincias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProvincia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					provinciaLogic.getEntityWithConnection(numeropatronalSessionBean.getlidProvinciaActual());
					this.provinciasForeignKey.add(provinciaLogic.getProvincia());
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

	public void cargarCombosCantonsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cantonsForeignKey=new ArrayList<Canton>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CantonLogic cantonLogic=new CantonLogic();

			//cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cantonLogic.getCantonDataAccess().setIsForForeingKeyData(true);

					cantonLogic.getTodosCantonsWithConnection(sFinalQuery,new Pagination());

					this.cantonsForeignKey=cantonLogic.getCantons();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCanton(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cantonLogic.getEntityWithConnection(numeropatronalSessionBean.getlidCantonActual());
					this.cantonsForeignKey.add(cantonLogic.getCanton());
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

	public void cargarCombosParroquiasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.parroquiasForeignKey=new ArrayList<Parroquia>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ParroquiaLogic parroquiaLogic=new ParroquiaLogic();

			//parroquiaLogic.getParroquiaDataAccess().setIsForForeingKeyData(true);

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//parroquiaLogic.getParroquiaDataAccess().setIsForForeingKeyData(true);

					parroquiaLogic.getTodosParroquiasWithConnection(sFinalQuery,new Pagination());

					this.parroquiasForeignKey=parroquiaLogic.getParroquias();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaParroquia(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					parroquiaLogic.getEntityWithConnection(numeropatronalSessionBean.getlidParroquiaActual());
					this.parroquiasForeignKey.add(parroquiaLogic.getParroquia());
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

					if(this.numeropatronal!=null) {
						this.numeropatronal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaNumeroPatronal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaNumeroPatronalGenerico)throws Exception
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
				jComboBoxid_empresaNumeroPatronalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaNumeroPatronalGenerico!=null && jComboBoxid_empresaNumeroPatronalGenerico.getItemCount()>0) {
					jComboBoxid_empresaNumeroPatronalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProvinciaForeignKey(Long idProvinciaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(provinciaTemp!=null) {

					if(this.numeropatronal!=null) {
						this.numeropatronal.setProvincia(provinciaTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setSelectedItem(provinciaTemp);
					}
				} else {
					//jComboBoxid_provinciaNumeroPatronal.setSelectedItem(provinciaTemp);
					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){
					if(provinciaTemp!=null && jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal!=null) {
						jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setSelectedItem(provinciaTemp);
					} else {
						if(jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal!=null) {
							//jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setSelectedItem(provinciaTemp);
							if(jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.getItemCount()>0) {
								jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setSelectedIndex(0);
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

	public String getActualProvinciaForeignKeyDescripcion(Long idProvinciaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}


			sDescripcion=ProvinciaConstantesFunciones.getProvinciaDescripcion(provinciaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProvinciaForeignKeyGenerico(Long idProvinciaSeleccionado,JComboBox jComboBoxid_provinciaNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaTemp=null;

			for(Provincia provinciaAux:provinciasForeignKey) {
				if(provinciaAux.getId()!=null && provinciaAux.getId().equals(idProvinciaSeleccionado)) {
					provinciaTemp=provinciaAux;
					break;
				}
			}

			if(provinciaTemp!=null) {
				jComboBoxid_provinciaNumeroPatronalGenerico.setSelectedItem(provinciaTemp);
			} else {
				if(jComboBoxid_provinciaNumeroPatronalGenerico!=null && jComboBoxid_provinciaNumeroPatronalGenerico.getItemCount()>0) {
					jComboBoxid_provinciaNumeroPatronalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCantonForeignKey(Long idCantonSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cantonTemp!=null) {

					if(this.numeropatronal!=null) {
						this.numeropatronal.setCanton(cantonTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setSelectedItem(cantonTemp);
					}
				} else {
					//jComboBoxid_cantonNumeroPatronal.setSelectedItem(cantonTemp);
					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){
					if(cantonTemp!=null && jComboBoxid_cantonFK_IdCantonNumeroPatronal!=null) {
						jComboBoxid_cantonFK_IdCantonNumeroPatronal.setSelectedItem(cantonTemp);
					} else {
						if(jComboBoxid_cantonFK_IdCantonNumeroPatronal!=null) {
							//jComboBoxid_cantonFK_IdCantonNumeroPatronal.setSelectedItem(cantonTemp);
							if(jComboBoxid_cantonFK_IdCantonNumeroPatronal.getItemCount()>0) {
								jComboBoxid_cantonFK_IdCantonNumeroPatronal.setSelectedIndex(0);
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

	public String getActualCantonForeignKeyDescripcion(Long idCantonSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}


			sDescripcion=CantonConstantesFunciones.getCantonDescripcion(cantonTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCantonForeignKeyGenerico(Long idCantonSeleccionado,JComboBox jComboBoxid_cantonNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Canton  cantonTemp=null;

			for(Canton cantonAux:cantonsForeignKey) {
				if(cantonAux.getId()!=null && cantonAux.getId().equals(idCantonSeleccionado)) {
					cantonTemp=cantonAux;
					break;
				}
			}

			if(cantonTemp!=null) {
				jComboBoxid_cantonNumeroPatronalGenerico.setSelectedItem(cantonTemp);
			} else {
				if(jComboBoxid_cantonNumeroPatronalGenerico!=null && jComboBoxid_cantonNumeroPatronalGenerico.getItemCount()>0) {
					jComboBoxid_cantonNumeroPatronalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualParroquiaForeignKey(Long idParroquiaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(parroquiaTemp!=null) {

					if(this.numeropatronal!=null) {
						this.numeropatronal.setParroquia(parroquiaTemp);
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setSelectedItem(parroquiaTemp);
					}
				} else {
					//jComboBoxid_parroquiaNumeroPatronal.setSelectedItem(parroquiaTemp);
					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
						if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.getItemCount()>0) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdParroquia") || sFormularioTipoBusqueda.equals("Todos")){
					if(parroquiaTemp!=null && jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal!=null) {
						jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setSelectedItem(parroquiaTemp);
					} else {
						if(jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal!=null) {
							//jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setSelectedItem(parroquiaTemp);
							if(jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.getItemCount()>0) {
								jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setSelectedIndex(0);
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

	public String getActualParroquiaForeignKeyDescripcion(Long idParroquiaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}


			sDescripcion=ParroquiaConstantesFunciones.getParroquiaDescripcion(parroquiaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualParroquiaForeignKeyGenerico(Long idParroquiaSeleccionado,JComboBox jComboBoxid_parroquiaNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Parroquia  parroquiaTemp=null;

			for(Parroquia parroquiaAux:parroquiasForeignKey) {
				if(parroquiaAux.getId()!=null && parroquiaAux.getId().equals(idParroquiaSeleccionado)) {
					parroquiaTemp=parroquiaAux;
					break;
				}
			}

			if(parroquiaTemp!=null) {
				jComboBoxid_parroquiaNumeroPatronalGenerico.setSelectedItem(parroquiaTemp);
			} else {
				if(jComboBoxid_parroquiaNumeroPatronalGenerico!=null && jComboBoxid_parroquiaNumeroPatronalGenerico.getItemCount()>0) {
					jComboBoxid_parroquiaNumeroPatronalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(NumeroPatronal numeropatronal,JComboBox jComboBoxid_empresaNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaNumeroPatronalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaNumeroPatronalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				numeropatronal.setid_empresa(empresaAux.getId());
				numeropatronal.setempresa_descripcion(NumeroPatronalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				numeropatronal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProvinciaForeignKey(NumeroPatronal numeropatronal,JComboBox jComboBoxid_provinciaNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Provincia  provinciaAux=new Provincia();

			if(jComboBoxid_provinciaNumeroPatronalGenerico==null) {
				provinciaAux=(Provincia)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.getSelectedItem();
			} else {
				provinciaAux=(Provincia)jComboBoxid_provinciaNumeroPatronalGenerico.getSelectedItem();
			}

			if(provinciaAux!=null && provinciaAux.getId()!=null) {
				numeropatronal.setid_provincia(provinciaAux.getId());
				numeropatronal.setprovincia_descripcion(NumeroPatronalConstantesFunciones.getProvinciaDescripcion(provinciaAux));
				numeropatronal.setProvincia(provinciaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCantonForeignKey(NumeroPatronal numeropatronal,JComboBox jComboBoxid_cantonNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Canton  cantonAux=new Canton();

			if(jComboBoxid_cantonNumeroPatronalGenerico==null) {
				cantonAux=(Canton)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.getSelectedItem();
			} else {
				cantonAux=(Canton)jComboBoxid_cantonNumeroPatronalGenerico.getSelectedItem();
			}

			if(cantonAux!=null && cantonAux.getId()!=null) {
				numeropatronal.setid_canton(cantonAux.getId());
				numeropatronal.setcanton_descripcion(NumeroPatronalConstantesFunciones.getCantonDescripcion(cantonAux));
				numeropatronal.setCanton(cantonAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarParroquiaForeignKey(NumeroPatronal numeropatronal,JComboBox jComboBoxid_parroquiaNumeroPatronalGenerico)throws Exception
	{
		try
		{
			Parroquia  parroquiaAux=new Parroquia();

			if(jComboBoxid_parroquiaNumeroPatronalGenerico==null) {
				parroquiaAux=(Parroquia)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.getSelectedItem();
			} else {
				parroquiaAux=(Parroquia)jComboBoxid_parroquiaNumeroPatronalGenerico.getSelectedItem();
			}

			if(parroquiaAux!=null && parroquiaAux.getId()!=null) {
				numeropatronal.setid_parroquia(parroquiaAux.getId());
				numeropatronal.setparroquia_descripcion(NumeroPatronalConstantesFunciones.getParroquiaDescripcion(parroquiaAux));
				numeropatronal.setParroquia(parroquiaAux);			}
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

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
					}

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProvinciasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProvincia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.addItem(provincia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
					}

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProvincia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.removeAllItems();

							for(Provincia provincia:this.provinciasForeignKey) {
								this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.addItem(provincia);
							}
						}

						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCantonsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCanton=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.addItem(canton);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
					}

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCanton") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.removeAllItems();

							for(Canton canton:this.cantonsForeignKey) {
								this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.addItem(canton);
							}
						}

						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameParroquiasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingParroquia=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.removeAllItems();

							for(Parroquia parroquia:this.parroquiasForeignKey) {
								this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.addItem(parroquia);
							}
						}
					}

					if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { 
					}

					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdParroquia") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.removeAllItems();

							for(Parroquia parroquia:this.parroquiasForeignKey) {
								this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.addItem(parroquia);
							}
						}

						if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProvinciaForeignKey(Provincia provincia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setSelectedItem(provincia);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setSelectedItem(provincia);
						} else {
							this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCantonForeignKey(Canton canton,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setSelectedItem(canton);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.setSelectedItem(canton);
						} else {
							this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameParroquiaForeignKey(Parroquia parroquia,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setSelectedItem(parroquia);
						}
					} else {
						if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setSelectedItem(parroquia);
						} else {
							this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesNumeroPatronal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			NumeroPatronalConstantesFunciones.refrescarForeignKeysDescripcionesNumeroPatronal(this.numeropatronalLogic.getNumeroPatronals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			NumeroPatronalConstantesFunciones.refrescarForeignKeysDescripcionesNumeroPatronal(this.numeropatronals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Provincia.class));
		classes.add(new Classe(Canton.class));
		classes.add(new Classe(Parroquia.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//numeropatronalLogic.setNumeroPatronals(this.numeropatronals);
			numeropatronalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public NumeroPatronalParameterReturnGeneral getNumeroPatronalParameterGeneral() {
		return this.numeropatronalParameterGeneral;
	}
	
	public void setNumeroPatronalParameterGeneral(NumeroPatronalParameterReturnGeneral numeropatronalParameterGeneral) {
		this.numeropatronalParameterGeneral = numeropatronalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoNumeroPatronal() {
		return isPermisoTodoNumeroPatronal;
	}

	public void setIsPermisoTodoNumeroPatronal(Boolean isPermisoTodoNumeroPatronal) {
		this.isPermisoTodoNumeroPatronal = isPermisoTodoNumeroPatronal;
	}

	public Boolean getIsPermisoNuevoNumeroPatronal() {
		return isPermisoNuevoNumeroPatronal;
	}

	public void setIsPermisoNuevoNumeroPatronal(Boolean isPermisoNuevoNumeroPatronal) {
		this.isPermisoNuevoNumeroPatronal = isPermisoNuevoNumeroPatronal;
	}

	public Boolean getIsPermisoActualizarNumeroPatronal() {
		return isPermisoActualizarNumeroPatronal;
	}

	public void setIsPermisoActualizarNumeroPatronal(Boolean isPermisoActualizarNumeroPatronal) {
		this.isPermisoActualizarNumeroPatronal = isPermisoActualizarNumeroPatronal;
	}

	public Boolean getIsPermisoEliminarNumeroPatronal() {
		return isPermisoEliminarNumeroPatronal;
	}

	public void setIsPermisoEliminarNumeroPatronal(Boolean isPermisoEliminarNumeroPatronal) {
		this.isPermisoEliminarNumeroPatronal = isPermisoEliminarNumeroPatronal;
	}

	public Boolean getIsPermisoGuardarCambiosNumeroPatronal() {
		return isPermisoGuardarCambiosNumeroPatronal;
	}

	public void setIsPermisoGuardarCambiosNumeroPatronal(Boolean isPermisoGuardarCambiosNumeroPatronal) {
		this.isPermisoGuardarCambiosNumeroPatronal = isPermisoGuardarCambiosNumeroPatronal;
	}
	
	public Boolean getIsPermisoConsultaNumeroPatronal() {
		return isPermisoConsultaNumeroPatronal;
	}

	public void setIsPermisoConsultaNumeroPatronal(Boolean isPermisoConsultaNumeroPatronal) {
		this.isPermisoConsultaNumeroPatronal = isPermisoConsultaNumeroPatronal;
	}

	public Boolean getIsPermisoBusquedaNumeroPatronal() {
		return isPermisoBusquedaNumeroPatronal;
	}

	public void setIsPermisoBusquedaNumeroPatronal(Boolean isPermisoBusquedaNumeroPatronal) {
		this.isPermisoBusquedaNumeroPatronal = isPermisoBusquedaNumeroPatronal;
	}

	public Boolean getIsPermisoReporteNumeroPatronal() {
		return isPermisoReporteNumeroPatronal;
	}

	public void setIsPermisoReporteNumeroPatronal(Boolean isPermisoReporteNumeroPatronal) {
		this.isPermisoReporteNumeroPatronal = isPermisoReporteNumeroPatronal;
	}
	
	public Boolean getIsPermisoPaginacionMedioNumeroPatronal() {
		return isPermisoPaginacionMedioNumeroPatronal;
	}

	public void setIsPermisoPaginacionMedioNumeroPatronal(Boolean isPermisoPaginacionMedioNumeroPatronal) {
		this.isPermisoPaginacionMedioNumeroPatronal = isPermisoPaginacionMedioNumeroPatronal;
	}
	
	public Boolean getIsPermisoPaginacionTodoNumeroPatronal() {
		return isPermisoPaginacionTodoNumeroPatronal;
	}

	public void setIsPermisoPaginacionTodoNumeroPatronal(Boolean isPermisoPaginacionTodoNumeroPatronal) {
		this.isPermisoPaginacionTodoNumeroPatronal = isPermisoPaginacionTodoNumeroPatronal;
	}
	
	public Boolean getIsPermisoPaginacionAltoNumeroPatronal() {
		return isPermisoPaginacionAltoNumeroPatronal;
	}

	public void setIsPermisoPaginacionAltoNumeroPatronal(Boolean isPermisoPaginacionAltoNumeroPatronal) {
		this.isPermisoPaginacionAltoNumeroPatronal = isPermisoPaginacionAltoNumeroPatronal;
	}
	
	public Boolean getIsPermisoCopiarNumeroPatronal() {
		return isPermisoCopiarNumeroPatronal;
	}

	public void setIsPermisoCopiarNumeroPatronal(Boolean isPermisoCopiarNumeroPatronal) {
		this.isPermisoCopiarNumeroPatronal = isPermisoCopiarNumeroPatronal;
	}
	
	public Boolean getIsPermisoVerFormNumeroPatronal() {
		return isPermisoVerFormNumeroPatronal;
	}

	public void setIsPermisoVerFormNumeroPatronal(Boolean isPermisoVerFormNumeroPatronal) {
		this.isPermisoVerFormNumeroPatronal = isPermisoVerFormNumeroPatronal;
	}
	
	public Boolean getIsPermisoDuplicarNumeroPatronal() {
		return isPermisoDuplicarNumeroPatronal;
	}

	public void setIsPermisoDuplicarNumeroPatronal(Boolean isPermisoDuplicarNumeroPatronal) {
		this.isPermisoDuplicarNumeroPatronal = isPermisoDuplicarNumeroPatronal;
	}
	
	public Boolean getIsPermisoOrdenNumeroPatronal() {
		return isPermisoOrdenNumeroPatronal;
	}

	public void setIsPermisoOrdenNumeroPatronal(Boolean isPermisoOrdenNumeroPatronal) {
		this.isPermisoOrdenNumeroPatronal = isPermisoOrdenNumeroPatronal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoNumeroPatronal() {
		return isVisibilidadCeldaNuevoNumeroPatronal;
	}

	public void setIsVisibilidadCeldaNuevoNumeroPatronal(Boolean isVisibilidadCeldaNuevoNumeroPatronal) {
		this.isVisibilidadCeldaNuevoNumeroPatronal = isVisibilidadCeldaNuevoNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarNumeroPatronal() {
		return isVisibilidadCeldaDuplicarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaDuplicarNumeroPatronal(Boolean isVisibilidadCeldaDuplicarNumeroPatronal) {
		this.isVisibilidadCeldaDuplicarNumeroPatronal = isVisibilidadCeldaDuplicarNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarNumeroPatronal() {
		return isVisibilidadCeldaCopiarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaCopiarNumeroPatronal(Boolean isVisibilidadCeldaCopiarNumeroPatronal) {
		this.isVisibilidadCeldaCopiarNumeroPatronal = isVisibilidadCeldaCopiarNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormNumeroPatronal() {
		return isVisibilidadCeldaVerFormNumeroPatronal;
	}

	public void setIsVisibilidadCeldaVerFormNumeroPatronal(Boolean isVisibilidadCeldaVerFormNumeroPatronal) {
		this.isVisibilidadCeldaVerFormNumeroPatronal = isVisibilidadCeldaVerFormNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenNumeroPatronal() {
		return isVisibilidadCeldaOrdenNumeroPatronal;
	}

	public void setIsVisibilidadCeldaOrdenNumeroPatronal(Boolean isVisibilidadCeldaOrdenNumeroPatronal) {
		this.isVisibilidadCeldaOrdenNumeroPatronal = isVisibilidadCeldaOrdenNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesNumeroPatronal() {
		return isVisibilidadCeldaNuevoRelacionesNumeroPatronal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesNumeroPatronal(Boolean isVisibilidadCeldaNuevoRelacionesNumeroPatronal) {
		this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal = isVisibilidadCeldaNuevoRelacionesNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarNumeroPatronal() {
		return isVisibilidadCeldaModificarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaModificarNumeroPatronal(Boolean isVisibilidadCeldaModificarNumeroPatronal) {
		this.isVisibilidadCeldaModificarNumeroPatronal = isVisibilidadCeldaModificarNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarNumeroPatronal() {
		return isVisibilidadCeldaActualizarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaActualizarNumeroPatronal(Boolean isVisibilidadCeldaActualizarNumeroPatronal) {
		this.isVisibilidadCeldaActualizarNumeroPatronal = isVisibilidadCeldaActualizarNumeroPatronal;
	}

	public Boolean getIsVisibilidadCeldaEliminarNumeroPatronal() {
		return isVisibilidadCeldaEliminarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaEliminarNumeroPatronal(Boolean isVisibilidadCeldaEliminarNumeroPatronal) {
		this.isVisibilidadCeldaEliminarNumeroPatronal = isVisibilidadCeldaEliminarNumeroPatronal;
	}

	public Boolean getIsVisibilidadCeldaCancelarNumeroPatronal() {
		return isVisibilidadCeldaCancelarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaCancelarNumeroPatronal(Boolean isVisibilidadCeldaCancelarNumeroPatronal) {
		this.isVisibilidadCeldaCancelarNumeroPatronal = isVisibilidadCeldaCancelarNumeroPatronal;
	}

	public Boolean getIsVisibilidadCeldaGuardarNumeroPatronal() {
		return isVisibilidadCeldaGuardarNumeroPatronal;
	}

	public void setIsVisibilidadCeldaGuardarNumeroPatronal(Boolean isVisibilidadCeldaGuardarNumeroPatronal) {
		this.isVisibilidadCeldaGuardarNumeroPatronal = isVisibilidadCeldaGuardarNumeroPatronal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosNumeroPatronal() {
		return isVisibilidadCeldaGuardarCambiosNumeroPatronal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosNumeroPatronal(Boolean isVisibilidadCeldaGuardarCambiosNumeroPatronal) {
		this.isVisibilidadCeldaGuardarCambiosNumeroPatronal = isVisibilidadCeldaGuardarCambiosNumeroPatronal;
	}
		
	public NumeroPatronalSessionBean getnumeropatronalSessionBean() {
		return this.numeropatronalSessionBean;
	}
	
	public void setnumeropatronalSessionBean(NumeroPatronalSessionBean numeropatronalSessionBean) {
		this.numeropatronalSessionBean=numeropatronalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCanton() {
		return this.isVisibilidadFK_IdCanton;
	}

	public void setisVisibilidadFK_IdCanton(Boolean isVisibilidadFK_IdCanton) {
		this.isVisibilidadFK_IdCanton=isVisibilidadFK_IdCanton;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdParroquia() {
		return this.isVisibilidadFK_IdParroquia;
	}

	public void setisVisibilidadFK_IdParroquia(Boolean isVisibilidadFK_IdParroquia) {
		this.isVisibilidadFK_IdParroquia=isVisibilidadFK_IdParroquia;
	}

	public Boolean getisVisibilidadFK_IdProvincia() {
		return this.isVisibilidadFK_IdProvincia;
	}

	public void setisVisibilidadFK_IdProvincia(Boolean isVisibilidadFK_IdProvincia) {
		this.isVisibilidadFK_IdProvincia=isVisibilidadFK_IdProvincia;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(NumeroPatronal numeropatronal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(numeropatronal,null);
				this.setActualParaGuardarProvinciaForeignKey(numeropatronal,null);
				this.setActualParaGuardarCantonForeignKey(numeropatronal,null);
				this.setActualParaGuardarParroquiaForeignKey(numeropatronal,null);
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
	
	public void bugActualizarReferenciaActual(NumeroPatronal numeropatronal,NumeroPatronal numeropatronalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalNumeroPatronal(numeropatronal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		numeropatronalAux.setId(numeropatronal.getId());
		numeropatronalAux.setVersionRow(numeropatronal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessNumeroPatronal();
		
			int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = numeropatronalValidator.getInvalidValues(this.numeropatronal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			numeropatronalLogic.setDatosCliente(datosCliente);
			numeropatronalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				numeropatronalAux=new  NumeroPatronal();
				
				numeropatronalAux.setIsNew(true);
				numeropatronalAux.setIsChanged(true);
				
				numeropatronalAux.setNumeroPatronalOriginal(this.numeropatronal);
				
				numeropatronalAux.setId(this.numeropatronal.getId());	
				numeropatronalAux.setVersionRow(this.numeropatronal.getVersionRow());	
				numeropatronalAux.setid_empresa(this.numeropatronal.getid_empresa());	
				numeropatronalAux.setid_provincia(this.numeropatronal.getid_provincia());	
				numeropatronalAux.setid_canton(this.numeropatronal.getid_canton());	
				numeropatronalAux.setid_parroquia(this.numeropatronal.getid_parroquia());	
				numeropatronalAux.setnumero(this.numeropatronal.getnumero());	
				numeropatronalAux.setcodigo_actividad(this.numeropatronal.getcodigo_actividad());	
				numeropatronalAux.setapellido(this.numeropatronal.getapellido());	
				numeropatronalAux.setnombre(this.numeropatronal.getnombre());	
				numeropatronalAux.setcedula(this.numeropatronal.getcedula());	
				numeropatronalAux.settelefono(this.numeropatronal.gettelefono());	
				numeropatronalAux.setdescripcion(this.numeropatronal.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numeropatronalAux,numeropatronals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.saveNumeroPatronals();//WithConnection
						//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);
					
					this.refrescarForeignKeysDescripcionesNumeroPatronal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numeropatronalLogic.saveNumeroPatronalRelaciones(numeropatronalAux,this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(numeropatronalAux,numeropatronals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				numeropatronalAux=new  NumeroPatronal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.numeropatronalSessionBean.getEsGuardarRelacionado() 
					|| (this.numeropatronalSessionBean.getEsGuardarRelacionado() && this.numeropatronal.getId()>=0)) {
						
					numeropatronalAux.setIsNew(false);
				}
				
				numeropatronalAux.setIsDeleted(false);
			
				numeropatronalAux.setId(this.numeropatronal.getId());	
				numeropatronalAux.setVersionRow(this.numeropatronal.getVersionRow());	
				numeropatronalAux.setid_empresa(this.numeropatronal.getid_empresa());	
				numeropatronalAux.setid_provincia(this.numeropatronal.getid_provincia());	
				numeropatronalAux.setid_canton(this.numeropatronal.getid_canton());	
				numeropatronalAux.setid_parroquia(this.numeropatronal.getid_parroquia());	
				numeropatronalAux.setnumero(this.numeropatronal.getnumero());	
				numeropatronalAux.setcodigo_actividad(this.numeropatronal.getcodigo_actividad());	
				numeropatronalAux.setapellido(this.numeropatronal.getapellido());	
				numeropatronalAux.setnombre(this.numeropatronal.getnombre());	
				numeropatronalAux.setcedula(this.numeropatronal.getcedula());	
				numeropatronalAux.settelefono(this.numeropatronal.gettelefono());	
				numeropatronalAux.setdescripcion(this.numeropatronal.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numeropatronalAux,numeropatronals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.saveNumeroPatronals();//WithConnection
						//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);
					
					this.refrescarForeignKeysDescripcionesNumeroPatronal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numeropatronalLogic.saveNumeroPatronalRelaciones(numeropatronalAux,this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(numeropatronalAux,numeropatronals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.numeropatronal,numeropatronalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				numeropatronalAux=new  NumeroPatronal();
				
				numeropatronalAux.setIsNew(false);
				numeropatronalAux.setIsChanged(false);
				
				numeropatronalAux.setIsDeleted(true);
				
				numeropatronalAux.setId(this.numeropatronal.getId());	
				numeropatronalAux.setVersionRow(this.numeropatronal.getVersionRow());	
				numeropatronalAux.setid_empresa(this.numeropatronal.getid_empresa());	
				numeropatronalAux.setid_provincia(this.numeropatronal.getid_provincia());	
				numeropatronalAux.setid_canton(this.numeropatronal.getid_canton());	
				numeropatronalAux.setid_parroquia(this.numeropatronal.getid_parroquia());	
				numeropatronalAux.setnumero(this.numeropatronal.getnumero());	
				numeropatronalAux.setcodigo_actividad(this.numeropatronal.getcodigo_actividad());	
				numeropatronalAux.setapellido(this.numeropatronal.getapellido());	
				numeropatronalAux.setnombre(this.numeropatronal.getnombre());	
				numeropatronalAux.setcedula(this.numeropatronal.getcedula());	
				numeropatronalAux.settelefono(this.numeropatronal.gettelefono());	
				numeropatronalAux.setdescripcion(this.numeropatronal.getdescripcion());	
				
				if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.numeropatronalAux.getId()>=0) {	
						this.numeropatronalsEliminados.add(numeropatronalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numeropatronalAux,numeropatronals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.saveNumeroPatronals();//WithConnection
						//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras().addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos().addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras.addAll(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructurasEliminados);
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos.addAll(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.asistenciamensualBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoestructuraBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.empleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jInternalFrameDetalleFormCargo.cargoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								numeropatronalLogic.saveNumeroPatronalRelaciones(numeropatronalAux,this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras(),this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());//WithConnection
								//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(new ArrayList<Estructura>());
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(new ArrayList<Cargo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras= new ArrayList<Estructura>();
							this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos= new ArrayList<Cargo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());

							if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.quitarFilaTotales();}
							numeropatronalAux.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(numeropatronalAux,numeropatronalLogic.getNumeroPatronals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(numeropatronalAux,numeropatronals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNumeroPatronals().addAll(this.numeropatronalsEliminados);
					
					numeropatronalLogic.saveNumeroPatronals();//WithConnection
					//numeropatronalLogic.getSetVersionRowNumeroPatronals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesNumeroPatronal();
				
				this.numeropatronalsEliminados= new ArrayList<NumeroPatronal>();		
			}
			
			if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Numero Patronal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.numeropatronal=numeropatronalAux;
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
      		//this.finishProcessNumeroPatronal();
      	}
		
	}	
	
	public void actualizarRelaciones(NumeroPatronal numeropatronalLocal) throws Exception {
		
		if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				numeropatronalLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
				numeropatronalLocal.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());
				numeropatronalLocal.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
			
			} else {
			
				numeropatronalLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);
				numeropatronalLocal.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuras);
				numeropatronalLocal.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(NumeroPatronal numeropatronalLocal) throws Exception {	
		if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				numeropatronalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProvinciaDetalleFormJInternalFrame.class)) {
				ProvinciaBeanSwingJInternalFrame provinciaBeanSwingJInternalFrameLocal=(ProvinciaBeanSwingJInternalFrame) ((ProvinciaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				provinciaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProvincia(provinciaBeanSwingJInternalFrameLocal.getprovincia(),true);
				provinciaBeanSwingJInternalFrameLocal.actualizarLista(provinciaBeanSwingJInternalFrameLocal.provincia,this.provinciasForeignKey);

				provinciaBeanSwingJInternalFrameLocal.actualizarRelaciones(provinciaBeanSwingJInternalFrameLocal.provincia);

				numeropatronalLocal.setProvincia(provinciaBeanSwingJInternalFrameLocal.provincia);

				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey("Formulario");
				this.setActualProvinciaForeignKey(provinciaBeanSwingJInternalFrameLocal.provincia.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CantonDetalleFormJInternalFrame.class)) {
				CantonBeanSwingJInternalFrame cantonBeanSwingJInternalFrameLocal=(CantonBeanSwingJInternalFrame) ((CantonDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cantonBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCanton(cantonBeanSwingJInternalFrameLocal.getcanton(),true);
				cantonBeanSwingJInternalFrameLocal.actualizarLista(cantonBeanSwingJInternalFrameLocal.canton,this.cantonsForeignKey);

				cantonBeanSwingJInternalFrameLocal.actualizarRelaciones(cantonBeanSwingJInternalFrameLocal.canton);

				numeropatronalLocal.setCanton(cantonBeanSwingJInternalFrameLocal.canton);

				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey("Formulario");
				this.setActualCantonForeignKey(cantonBeanSwingJInternalFrameLocal.canton.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ParroquiaDetalleFormJInternalFrame.class)) {
				ParroquiaBeanSwingJInternalFrame parroquiaBeanSwingJInternalFrameLocal=(ParroquiaBeanSwingJInternalFrame) ((ParroquiaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				parroquiaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoParroquia(parroquiaBeanSwingJInternalFrameLocal.getparroquia(),true);
				parroquiaBeanSwingJInternalFrameLocal.actualizarLista(parroquiaBeanSwingJInternalFrameLocal.parroquia,this.parroquiasForeignKey);

				parroquiaBeanSwingJInternalFrameLocal.actualizarRelaciones(parroquiaBeanSwingJInternalFrameLocal.parroquia);

				numeropatronalLocal.setParroquia(parroquiaBeanSwingJInternalFrameLocal.parroquia);

				this.addItemDefectoCombosForeignKeyParroquia();
				this.cargarCombosFrameParroquiasForeignKey("Formulario");
				this.setActualParroquiaForeignKey(parroquiaBeanSwingJInternalFrameLocal.parroquia.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarNumeroPatronalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = numeropatronalValidator.getInvalidValues(this.numeropatronal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(NumeroPatronal numeropatronal,List<NumeroPatronal> numeropatronals) throws Exception {
		try	{		
			NumeroPatronalConstantesFunciones.actualizarLista(numeropatronal,numeropatronals,this.numeropatronalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(NumeroPatronal numeropatronal,List<NumeroPatronal> numeropatronals) throws Exception {
		try	{			
			NumeroPatronalConstantesFunciones.actualizarSelectedLista(numeropatronal,numeropatronals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<NumeroPatronal> numeropatronalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				numeropatronalsLocal=this.numeropatronalLogic.getNumeroPatronals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				numeropatronalsLocal=this.numeropatronals;
			}
			//ARCHITECTURE
		
			for(NumeroPatronal numeropatronalLocal:numeropatronalsLocal) {
				if(this.permiteMantenimiento(numeropatronalLocal) && numeropatronalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+NumeroPatronalConstantesFunciones.getNumeroPatronalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_empresaNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.IDPROVINCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_provinciaNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.IDCANTON)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_cantonNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.IDPARROQUIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_parroquiaNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnumeroNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.CODIGOACTIVIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcodigo_actividadNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelapellidoNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnombreNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.CEDULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcedulaNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabeltelefonoNumeroPatronal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(NumeroPatronalConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabeldescripcionNumeroPatronal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_empresaNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_provinciaNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_cantonNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelid_parroquiaNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnumeroNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcodigo_actividadNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelapellidoNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnombreNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcedulaNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabeltelefonoNumeroPatronal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormNumeroPatronal.jLabeldescripcionNumeroPatronal,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.numeropatronal==null) {
				this.numeropatronal= new NumeroPatronal();
			}

			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNumeroPatronal
				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setNumeroPatronal(this.numeropatronal);
			}

			return;
		}
		 else  if(sTipo.equals("Estructura")) {
			if(this.numeropatronal==null) {
				this.numeropatronal= new NumeroPatronal();
			}

			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNumeroPatronal
				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.getestructura().setNumeroPatronal(this.numeropatronal);
			}

			return;
		}
		 else  if(sTipo.equals("Cargo")) {
			if(this.numeropatronal==null) {
				this.numeropatronal= new NumeroPatronal();
			}

			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoNumeroPatronal
				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.getcargo().setNumeroPatronal(this.numeropatronal);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoNumeroPatronal--;	
		
		
		this.numeropatronalAux=new NumeroPatronal();
		
		this.numeropatronalAux.setId(this.iIdNuevoNumeroPatronal);
		this.numeropatronalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.numeropatronalLogic.getNumeroPatronals().add(this.numeropatronalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.numeropatronals.add(this.numeropatronalAux);
		}
		//ARCHITECTURE
		
		this.numeropatronal=this.numeropatronalAux;
		
		if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioNumeroPatronal(this.numeropatronal);
			this.setVariablesObjetoActualToFormularioForeignKeyNumeroPatronal(this.numeropatronal);
		}
				
		//this.setDefaultControlesNumeroPatronal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyNumeroPatronal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyNumeroPatronal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroPatronal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNumeroPatronal(this.numeropatronalBean,this.numeropatronal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(NumeroPatronalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
			classes=NumeroPatronalConstantesFunciones.getClassesRelationshipsOfNumeroPatronal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.numeropatronalReturnGeneral=numeropatronalLogic.procesarEventosNumeroPatronalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numeropatronalLogic.getNumeroPatronals(),this.numeropatronal,this.numeropatronalParameterGeneral,this.isEsNuevoNumeroPatronal,classes);//this.numeropatronalLogic.getNumeroPatronal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanNumeroPatronal(this.numeropatronalReturnGeneral,this.numeropatronalBean,false);
		
		if(this.numeropatronalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal());
		}
		
		if(this.numeropatronalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal(),classes);//this.numeropatronalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyNumeroPatronal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyNumeroPatronal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.RecargarFormNumeroPatronal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingNumeroPatronal(false);
						
			if(numeropatronalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado() && EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEstructuraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroPatronal();
			}
			
			this.actualizarVisualTableDatosNumeroPatronal();
			
			this.jTableDatosNumeroPatronal.setRowSelectionInterval(this.getIndiceNuevoNumeroPatronal(), this.getIndiceNuevoNumeroPatronal());
			
			this.seleccionarFilaTablaNumeroPatronalActual();
						
			this.actualizarEstadoCeldasBotonesNumeroPatronal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesNumeroPatronal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarnumeroNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarcodigo_actividadNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarapellidoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarnombreNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarcedulaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activartelefonoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activardescripcionNumeroPatronal);	
		//
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarid_empresaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarid_provinciaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarid_cantonNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setEnabled(isHabilitar && this.numeropatronalConstantesFunciones.activarid_parroquiaNumeroPatronal);
	};
	
	public void setDefaultControlesNumeroPatronal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoNumeroPatronal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.numeropatronalSessionBean.setConGuardarRelaciones(true);			
			this.numeropatronalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.numeropatronalSessionBean.setConGuardarRelaciones(false);			
			this.numeropatronalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoNumeroPatronal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
				if(numeropatronalAux.getId().equals(this.iIdNuevoNumeroPatronal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronals) {
				if(numeropatronalAux.getId().equals(this.iIdNuevoNumeroPatronal)) {
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
	
	public int getIndiceActualNumeroPatronal(NumeroPatronal numeropatronal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
				if(numeropatronalAux.getId().equals(numeropatronal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronals) {
				if(numeropatronalAux.getId().equals(numeropatronal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalNumeroPatronal(NumeroPatronal numeropatronalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
				if(numeropatronalAux.getNumeroPatronalOriginal().getId().equals(numeropatronalOriginal.getId())) {
					existe=true;
					numeropatronalOriginal.setId(numeropatronalAux.getId());
					numeropatronalOriginal.setVersionRow(numeropatronalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroPatronal numeropatronalAux:this.numeropatronals) {
				if(numeropatronalAux.getNumeroPatronalOriginal().getId().equals(numeropatronalOriginal.getId())) {
					existe=true;
					numeropatronalOriginal.setId(numeropatronalAux.getId());
					numeropatronalOriginal.setVersionRow(numeropatronalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosNumeroPatronal(Boolean esParaCancelar) throws Exception {
		numeropatronalsAux=new ArrayList<NumeroPatronal>();
		numeropatronalAux=new NumeroPatronal();
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
					if(numeropatronalAux.getId()<0) {
						numeropatronalsAux.add(numeropatronalAux);
					}		
				}
				this.iIdNuevoNumeroPatronal=0L;
				this.numeropatronalLogic.getNumeroPatronals().removeAll(numeropatronalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroPatronal numeropatronalAux:this.numeropatronals) {
					if(numeropatronalAux.getId()<0) {
						numeropatronalsAux.add(numeropatronalAux);
					}		
				}
				this.iIdNuevoNumeroPatronal=0L;
				this.numeropatronals.removeAll(numeropatronalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoNumeroPatronal 
					&& this.numeropatronalLogic.getNumeroPatronals().size()>0
					) {
					numeropatronalAux=this.numeropatronalLogic.getNumeroPatronals().get(this.numeropatronalLogic.getNumeroPatronals().size() - 1);
				
					if(numeropatronalAux.getId()<0) {
						this.numeropatronalLogic.getNumeroPatronals().remove(numeropatronalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoNumeroPatronal && this.numeropatronals.size()>0) {
					numeropatronalAux=this.numeropatronals.get(this.numeropatronals.size() - 1);
				
					if(numeropatronalAux.getId()<0) {
						this.numeropatronals.remove(numeropatronalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoNumeroPatronal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(numeropatronal.getId()<0) {
				this.numeropatronalLogic.getNumeroPatronals().remove(this.numeropatronal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(numeropatronal.getId()<0) {
				this.numeropatronals.remove(this.numeropatronal);
			}
		}			
	}
	
	public void setEstadosInicialesNumeroPatronal(List<NumeroPatronal> numeropatronalsAux) throws Exception {
		NumeroPatronalConstantesFunciones.setEstadosInicialesNumeroPatronal(numeropatronalsAux);
	}
	
	public void setEstadosInicialesNumeroPatronal(NumeroPatronal numeropatronalAux) throws Exception {
		NumeroPatronalConstantesFunciones.setEstadosInicialesNumeroPatronal(numeropatronalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarNumeroPatronalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarNumeroPatronalActual()) {
				if(!this.isEsNuevoNumeroPatronal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoNumeroPatronal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarNumeroPatronalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Numero Patronal ?", "MANTENIMIENTO DE Numero Patronal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(NumeroPatronal numeropatronal) throws Exception {
		NumeroPatronalConstantesFunciones.seleccionarAsignar(this.numeropatronal,numeropatronal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarNumeroPatronal=this.isPermisoActualizarOriginalNumeroPatronal;
			
			
			this.seleccionarAsignar(numeropatronal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			NumeroPatronalConstantesFunciones.quitarEspaciosNumeroPatronal(this.numeropatronal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesNumeroPatronal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.numeropatronalSessionBean.setsFuncionBusquedaRapida(this.numeropatronalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoNumeroPatronal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosNumeroPatronal(esParaCancelar);				
				this.cancelarNuevoNumeroPatronal(esParaCancelar);								
			}
			
			this.numeropatronal=new NumeroPatronal();
			
			this.inicializarNumeroPatronal();
			
			this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarNumeroPatronal() throws Exception {
		try {
			NumeroPatronalConstantesFunciones.inicializarNumeroPatronal(this.numeropatronal);
			
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
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.numeropatronalLogic.getNumeroPatronals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteNumeroPatronals(String sAccionBusqueda,List<NumeroPatronal> numeropatronalsParaReportes) throws Exception {
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
					sPathReporteFinal="NumeroPatronal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="NumeroPatronalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("NumeroPatronalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="NumeroPatronal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Numero Patronales");		
		parameters.put("busquedapor", NumeroPatronalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DatoGeneralEmpleado.class));
			classes.add(new Classe(Estructura.class));
			classes.add(new Classe(Cargo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					NumeroPatronalLogic numeropatronalLogicAuxiliar=new NumeroPatronalLogic();
					numeropatronalLogicAuxiliar.setDatosCliente(numeropatronalLogic.getDatosCliente());				
					numeropatronalLogicAuxiliar.setNumeroPatronals(numeropatronalsParaReportes);
					
					numeropatronalLogicAuxiliar.cargarRelacionesLoteForeignKeyNumeroPatronalWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					numeropatronalsParaReportes=numeropatronalLogicAuxiliar.getNumeroPatronals();
					
					//numeropatronalLogic.getNewConnexionToDeep();
					
					//for (NumeroPatronal numeropatronal:numeropatronalsParaReportes) {
					//	numeropatronalLogic.deepLoad(numeropatronal, false, DeepLoadType.INCLUDE, classes);
					//}						
					//numeropatronalLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//numeropatronalLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);

			InputStream reportFileEstructura = AuxiliarReportes.class.getResourceAsStream("EstructuraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_estructura", reportFileEstructura);

			InputStream reportFileCargo = AuxiliarReportes.class.getResourceAsStream("CargoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cargo", reportFileCargo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceNumeroPatronal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			NumeroPatronalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			NumeroPatronalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceNumeroPatronal=new JRBeanArrayDataSource(NumeroPatronalJInternalFrame.TraerNumeroPatronalBeans(numeropatronalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceNumeroPatronal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+NumeroPatronalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+NumeroPatronalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(NumeroPatronalBean.TraerNumeroPatronalBeans(numeropatronalsParaReportes).toArray()));
							
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
				this.generarExcelReporteNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoNumeroPatronalActionPerformed(null);
					//this.generarExcelReporteNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesNumeroPatronals(sAccionBusqueda,sTipoArchivoReporte,numeropatronalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteNumeroPatronals(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroPatronal> numeropatronalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroPatronals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNumeroPatronal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(NumeroPatronal numeropatronal : numeropatronalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			NumeroPatronalConstantesFunciones.generarExcelReporteDataNumeroPatronal("NORMAL",row,workbook,numeropatronal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderNumeroPatronal(String sTipo,Row row,Workbook workbook) {
		
		NumeroPatronalConstantesFunciones.generarExcelReporteHeaderNumeroPatronal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalNumeroPatronals(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroPatronal> numeropatronalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroPatronals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(NumeroPatronal numeropatronal : numeropatronalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(NumeroPatronalConstantesFunciones.getNumeroPatronalDescripcion(numeropatronal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getprovincia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_IDCANTON))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDCANTON);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getcanton_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getparroquia_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getcodigo_actividad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_CEDULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CEDULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getcedula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(numeropatronal.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesNumeroPatronals(String sAccionBusqueda,String sTipoArchivoReporte,List<NumeroPatronal> numeropatronalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<NumeroPatronal> numeropatronalsRespaldo=null;
		
		classes=NumeroPatronalConstantesFunciones.getClassesRelationshipsOfNumeroPatronal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.numeropatronalLogic.setDatosCliente(this.datosCliente);
		this.numeropatronalLogic.setDatosDeep(this.datosDeep);
		this.numeropatronalLogic.setIsConDeep(true);
		
		numeropatronalsRespaldo=this.numeropatronalLogic.getNumeroPatronals();
		
		this.numeropatronalLogic.setNumeroPatronals(numeropatronalsParaReportes);	
		this.numeropatronalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		numeropatronalsParaReportes=this.numeropatronalLogic.getNumeroPatronals();
		this.numeropatronalLogic.setNumeroPatronals(numeropatronalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("NumeroPatronals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderNumeroPatronal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(NumeroPatronal numeropatronal : numeropatronalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderNumeroPatronal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			NumeroPatronalConstantesFunciones.generarExcelReporteDataNumeroPatronal("NORMAL",row,workbook,numeropatronal,cellStyleDataAux);
		
			
			


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(numeropatronal.getDatoGeneralEmpleados()!=null && numeropatronal.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(numeropatronal.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : numeropatronal.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Estructura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(EstructuraConstantesFunciones.SCLASSWEBTITULO))) {

				if(numeropatronal.getEstructuras()!=null && numeropatronal.getEstructuras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(EstructuraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					EstructuraConstantesFunciones.generarExcelReporteHeaderEstructura("RELACIONADO",row,workbook);
				}

				if(numeropatronal.getEstructuras()!=null) {
					i2=0;
					for(Estructura estructura : numeropatronal.getEstructuras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						EstructuraConstantesFunciones.generarExcelReporteDataEstructura("RELACIONADO",row,workbook,estructura,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Cargo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CargoConstantesFunciones.SCLASSWEBTITULO))) {

				if(numeropatronal.getCargos()!=null && numeropatronal.getCargos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CargoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CargoConstantesFunciones.generarExcelReporteHeaderCargo("RELACIONADO",row,workbook);
				}

				if(numeropatronal.getCargos()!=null) {
					i2=0;
					for(Cargo cargo : numeropatronal.getCargos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CargoConstantesFunciones.generarExcelReporteDataCargo("RELACIONADO",row,workbook,cargo,cellStyleDataAuxHijo);
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
		cell.setCellValue(NumeroPatronalConstantesFunciones.getNumeroPatronalDescripcion(numeropatronal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroPatronal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessNumeroPatronal() throws Exception {		
		this.startProcessNumeroPatronal(true);
	}
	
	public void startProcessNumeroPatronal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasNumeroPatronal ,this.jPanelParametrosReportesNumeroPatronal, this.jScrollPanelDatosNumeroPatronal,this.jPanelPaginacionNumeroPatronal, this.jScrollPanelDatosEdicionNumeroPatronal, this.jPanelAccionesNumeroPatronal,this.jPanelAccionesFormularioNumeroPatronal,this.jmenuBarNumeroPatronal,this.jmenuBarDetalleNumeroPatronal,this.jTtoolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal);		
		
		final JTabbedPane jTabbedPaneBusquedasNumeroPatronal=this.jTabbedPaneBusquedasNumeroPatronal; 
		
		final JPanel jPanelParametrosReportesNumeroPatronal=this.jPanelParametrosReportesNumeroPatronal;
		//final JScrollPane jScrollPanelDatosNumeroPatronal=this.jScrollPanelDatosNumeroPatronal;
		final JTable jTableDatosNumeroPatronal=this.jTableDatosNumeroPatronal;		
		final JPanel jPanelPaginacionNumeroPatronal=this.jPanelPaginacionNumeroPatronal;
		//final JScrollPane jScrollPanelDatosEdicionNumeroPatronal=this.jScrollPanelDatosEdicionNumeroPatronal;
		final JPanel jPanelAccionesNumeroPatronal=this.jPanelAccionesNumeroPatronal;
		
		JPanel jPanelCamposAuxiliarNumeroPatronal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarNumeroPatronal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			jPanelCamposAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jPanelCamposNumeroPatronal;
			jPanelAccionesFormularioAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jPanelAccionesFormularioNumeroPatronal;
		}
		
		final JPanel jPanelCamposNumeroPatronal=jPanelCamposAuxiliarNumeroPatronal;
		final JPanel jPanelAccionesFormularioNumeroPatronal=jPanelAccionesFormularioAuxiliarNumeroPatronal;
		
		
		final JMenuBar jmenuBarNumeroPatronal=this.jmenuBarNumeroPatronal;
		final JToolBar jTtoolBarNumeroPatronal=this.jTtoolBarNumeroPatronal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarNumeroPatronal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNumeroPatronal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			jmenuBarDetalleAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jmenuBarDetalleNumeroPatronal;
			jTtoolBarDetalleAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jTtoolBarDetalleNumeroPatronal;
		}
		
		final JMenuBar jmenuBarDetalleNumeroPatronal=jmenuBarDetalleAuxiliarNumeroPatronal;
		final JToolBar jTtoolBarDetalleNumeroPatronal=jTtoolBarDetalleAuxiliarNumeroPatronal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNumeroPatronal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNumeroPatronal;
			processRunnable.jTableDatos=jTableDatosNumeroPatronal;
			processRunnable.jPanelCampos=jPanelCamposNumeroPatronal;
			processRunnable.jPanelPaginacion=jPanelPaginacionNumeroPatronal;
			processRunnable.jPanelAcciones=jPanelAccionesNumeroPatronal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNumeroPatronal;
			
			
			processRunnable.jmenuBar=jmenuBarNumeroPatronal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNumeroPatronal;
			processRunnable.jTtoolBar=jTtoolBarNumeroPatronal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNumeroPatronal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNumeroPatronal ,jPanelParametrosReportesNumeroPatronal,jTableDatosNumeroPatronal, /*jScrollPanelDatosNumeroPatronal,*/jPanelCamposNumeroPatronal,jPanelPaginacionNumeroPatronal, /*jScrollPanelDatosEdicionNumeroPatronal,*/ jPanelAccionesNumeroPatronal,jPanelAccionesFormularioNumeroPatronal,jmenuBarNumeroPatronal,jmenuBarDetalleNumeroPatronal,jTtoolBarNumeroPatronal,jTtoolBarDetalleNumeroPatronal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasNumeroPatronal ,jPanelParametrosReportesNumeroPatronal, jScrollPanelDatosNumeroPatronal,jPanelPaginacionNumeroPatronal, jScrollPanelDatosEdicionNumeroPatronal, jPanelAccionesNumeroPatronal,jPanelAccionesFormularioNumeroPatronal,jmenuBarNumeroPatronal,jmenuBarDetalleNumeroPatronal,jTtoolBarNumeroPatronal,jTtoolBarDetalleNumeroPatronal);
						
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
	
	public void finishProcessNumeroPatronal() {// throws Exception 
		this.finishProcessNumeroPatronal(true);
	}
	
	public void finishProcessNumeroPatronal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasNumeroPatronal ,this.jPanelParametrosReportesNumeroPatronal, this.jScrollPanelDatosNumeroPatronal,this.jPanelPaginacionNumeroPatronal, this.jScrollPanelDatosEdicionNumeroPatronal, this.jPanelAccionesNumeroPatronal,this.jPanelAccionesFormularioNumeroPatronal,this.jmenuBarNumeroPatronal,this.jmenuBarDetalleNumeroPatronal,this.jTtoolBarNumeroPatronal,this.jTtoolBarDetalleNumeroPatronal);		
		
		final JTabbedPane jTabbedPaneBusquedasNumeroPatronal=this.jTabbedPaneBusquedasNumeroPatronal; 
		
		final JPanel jPanelParametrosReportesNumeroPatronal=this.jPanelParametrosReportesNumeroPatronal;
		//final JScrollPane jScrollPanelDatosNumeroPatronal=this.jScrollPanelDatosNumeroPatronal;
		final JTable jTableDatosNumeroPatronal=this.jTableDatosNumeroPatronal;		
		final JPanel jPanelPaginacionNumeroPatronal=this.jPanelPaginacionNumeroPatronal;
		//final JScrollPane jScrollPanelDatosEdicionNumeroPatronal=this.jScrollPanelDatosEdicionNumeroPatronal;
		final JPanel jPanelAccionesNumeroPatronal=this.jPanelAccionesNumeroPatronal;
		
		JPanel jPanelCamposAuxiliarNumeroPatronal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarNumeroPatronal=new JPanel();
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			jPanelCamposAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jPanelCamposNumeroPatronal;
			jPanelAccionesFormularioAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jPanelAccionesFormularioNumeroPatronal;
		}
		
		final JPanel jPanelCamposNumeroPatronal=jPanelCamposAuxiliarNumeroPatronal;
		final JPanel jPanelAccionesFormularioNumeroPatronal=jPanelAccionesFormularioAuxiliarNumeroPatronal;
		
		
		final JMenuBar jmenuBarNumeroPatronal=this.jmenuBarNumeroPatronal;		
		final JToolBar jTtoolBarNumeroPatronal=this.jTtoolBarNumeroPatronal;
				
		JMenuBar jmenuBarDetalleAuxiliarNumeroPatronal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarNumeroPatronal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			jmenuBarDetalleAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jmenuBarDetalleNumeroPatronal;
			jTtoolBarDetalleAuxiliarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jTtoolBarDetalleNumeroPatronal;		
		}
		
		final JMenuBar jmenuBarDetalleNumeroPatronal=jmenuBarDetalleAuxiliarNumeroPatronal;
		final JToolBar jTtoolBarDetalleNumeroPatronal=jTtoolBarDetalleAuxiliarNumeroPatronal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasNumeroPatronal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesNumeroPatronal;
			processRunnable.jTableDatos=jTableDatosNumeroPatronal;
			processRunnable.jPanelCampos=jPanelCamposNumeroPatronal;
			processRunnable.jPanelPaginacion=jPanelPaginacionNumeroPatronal;
			processRunnable.jPanelAcciones=jPanelAccionesNumeroPatronal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioNumeroPatronal;
			
			
			processRunnable.jmenuBar=jmenuBarNumeroPatronal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleNumeroPatronal;
			processRunnable.jTtoolBar=jTtoolBarNumeroPatronal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleNumeroPatronal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasNumeroPatronal ,jPanelParametrosReportesNumeroPatronal, jTableDatosNumeroPatronal,/*jScrollPanelDatosNumeroPatronal,*/jPanelCamposNumeroPatronal,jPanelPaginacionNumeroPatronal, /*jScrollPanelDatosEdicionNumeroPatronal,*/ jPanelAccionesNumeroPatronal,jPanelAccionesFormularioNumeroPatronal,jmenuBarNumeroPatronal,jmenuBarDetalleNumeroPatronal,jTtoolBarNumeroPatronal,jTtoolBarDetalleNumeroPatronal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesNumeroPatronal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarNumeroPatronal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuNumeroPatronal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarNumeroPatronal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarNumeroPatronal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleNumeroPatronal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuNumeroPatronal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarNumeroPatronal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleNumeroPatronal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.numeropatronalConstantesFunciones.getsFinalQueryNumeroPatronal();
		String  finalQueryPaginacionTodos=this.numeropatronalConstantesFunciones.getsFinalQueryNumeroPatronal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=NumeroPatronalConstantesFunciones.getArrayColumnasGlobalesNoNumeroPatronal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=NumeroPatronalConstantesFunciones.getArrayColumnasGlobalesNumeroPatronal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,NumeroPatronalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.numeropatronalsEliminados= new ArrayList<NumeroPatronal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessNumeroPatronal();
		
				///*NumeroPatronalSessionBean*/this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			
			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
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
					this.iNumeroPaginacion=NumeroPatronalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=NumeroPatronalConstantesFunciones.getClassesForeignKeysOfNumeroPatronal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/numeropatronal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			numeropatronalsAux= new ArrayList<NumeroPatronal>();
			
				
			numeropatronalLogic.setDatosCliente(this.datosCliente);
			numeropatronalLogic.setDatosDeep(this.datosDeep);
			numeropatronalLogic.setIsConDeep(true);
			
			
			numeropatronalLogic.getNumeroPatronalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					numeropatronalLogic.getTodosNumeroPatronals(finalQueryGlobal,pagination);
					
					//numeropatronalLogic.getTodosNumeroPatronalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(numeropatronalLogic.getNumeroPatronals()==null|| numeropatronalLogic.getNumeroPatronals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numeropatronalsAux= new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronalLogic.getNumeroPatronals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalsAux= new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numeropatronalLogic.getTodosNumeroPatronals(finalQueryGlobal+"",this.pagination);												
							
							//numeropatronalLogic.getTodosNumeroPatronalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteNumeroPatronals("Todos",numeropatronalLogic.getNumeroPatronals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());					
							numeropatronalLogic.getNumeroPatronals().addAll(numeropatronalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronals=new ArrayList<NumeroPatronal>();
							numeropatronals.addAll(numeropatronalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idNumeroPatronal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idNumeroPatronal=this.idActual;
				
				} else if(this.idNumeroPatronalActual!=null && this.idNumeroPatronalActual!=0L) {
					idNumeroPatronal=idNumeroPatronalActual;
				}
				
					
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndicePorId(idNumeroPatronal);
				
				this.numeropatronals=new ArrayList<NumeroPatronal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					numeropatronalLogic.getEntity(idNumeroPatronal);
					
					//numeropatronalLogic.getEntityWithConnection(idNumeroPatronal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());
					numeropatronalLogic.getNumeroPatronals().add(numeropatronalLogic.getNumeroPatronal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronals=new ArrayList<NumeroPatronal>();
					this.numeropatronals.add(numeropatronal);
				}
				
				if(numeropatronalLogic.getNumeroPatronal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCanton")) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numeropatronalLogic.getNumeroPatronalsFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numeropatronalLogic.getNumeroPatronals()==null||numeropatronalLogic.getNumeroPatronals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numeropatronals==null|| numeropatronals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalsAux=new ArrayList<NumeroPatronal>();
						numeropatronalsAux.addAll(numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalsAux=new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numeropatronalLogic.getNumeroPatronalsFK_IdCanton(finalQueryGlobal,pagination,id_cantonFK_IdCanton);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdCanton(id_cantonFK_IdCanton);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroPatronals("FK_IdCanton",numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroPatronals("FK_IdCanton",numeropatronals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());
						numeropatronalLogic.getNumeroPatronals().addAll(numeropatronalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronals=new ArrayList<NumeroPatronal>();
							numeropatronals.addAll(numeropatronalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numeropatronalLogic.getNumeroPatronalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numeropatronalLogic.getNumeroPatronals()==null||numeropatronalLogic.getNumeroPatronals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numeropatronals==null|| numeropatronals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalsAux=new ArrayList<NumeroPatronal>();
						numeropatronalsAux.addAll(numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalsAux=new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numeropatronalLogic.getNumeroPatronalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroPatronals("FK_IdEmpresa",numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroPatronals("FK_IdEmpresa",numeropatronals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());
						numeropatronalLogic.getNumeroPatronals().addAll(numeropatronalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronals=new ArrayList<NumeroPatronal>();
							numeropatronals.addAll(numeropatronalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdParroquia")) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numeropatronalLogic.getNumeroPatronalsFK_IdParroquia(finalQueryGlobal,pagination,id_parroquiaFK_IdParroquia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numeropatronalLogic.getNumeroPatronals()==null||numeropatronalLogic.getNumeroPatronals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numeropatronals==null|| numeropatronals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalsAux=new ArrayList<NumeroPatronal>();
						numeropatronalsAux.addAll(numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalsAux=new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numeropatronalLogic.getNumeroPatronalsFK_IdParroquia(finalQueryGlobal,pagination,id_parroquiaFK_IdParroquia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdParroquia(id_parroquiaFK_IdParroquia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroPatronals("FK_IdParroquia",numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroPatronals("FK_IdParroquia",numeropatronals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());
						numeropatronalLogic.getNumeroPatronals().addAll(numeropatronalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronals=new ArrayList<NumeroPatronal>();
							numeropatronals.addAll(numeropatronalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProvincia")) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					numeropatronalLogic.getNumeroPatronalsFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=numeropatronalLogic.getNumeroPatronals()==null||numeropatronalLogic.getNumeroPatronals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=numeropatronals==null|| numeropatronals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalsAux=new ArrayList<NumeroPatronal>();
						numeropatronalsAux.addAll(numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalsAux=new ArrayList<NumeroPatronal>();
							numeropatronalsAux.addAll(numeropatronals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							numeropatronalLogic.getNumeroPatronalsFK_IdProvincia(finalQueryGlobal,pagination,id_provinciaFK_IdProvincia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=NumeroPatronalConstantesFunciones.getDetalleIndiceFK_IdProvincia(id_provinciaFK_IdProvincia);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteNumeroPatronals("FK_IdProvincia",numeropatronalLogic.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteNumeroPatronals("FK_IdProvincia",numeropatronals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalLogic.setNumeroPatronals(new ArrayList<NumeroPatronal>());
						numeropatronalLogic.getNumeroPatronals().addAll(numeropatronalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronals=new ArrayList<NumeroPatronal>();
							numeropatronals.addAll(numeropatronalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesNumeroPatronal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessNumeroPatronal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=numeropatronalLogic.getNumeroPatronals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numeropatronals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=numeropatronalLogic.getNumeroPatronals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=numeropatronals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(NumeroPatronal numeropatronal) {
		Boolean permite=true;
		
		if(this.numeropatronal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=NumeroPatronalConstantesFunciones.getOrderByListaNumeroPatronal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=NumeroPatronalConstantesFunciones.getOrderByListaNumeroPatronal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroPatronal numeropatronal:numeropatronalLogic.getNumeroPatronals()) {
				if(numeropatronal.getsType().equals(Constantes2.S_TOTALES)) {
					numeropatronalTotales=numeropatronal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroPatronal numeropatronal:this.numeropatronals) {
				if(numeropatronal.getsType().equals(Constantes2.S_TOTALES)) {
					numeropatronalTotales=numeropatronal;
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
			this.numeropatronalAux=new NumeroPatronal();
			this.numeropatronalAux.setsType(Constantes2.S_TOTALES);
			this.numeropatronalAux.setIsNew(false);
			this.numeropatronalAux.setIsChanged(false);
			this.numeropatronalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				NumeroPatronalConstantesFunciones.TotalizarValoresFilaNumeroPatronal(this.numeropatronalLogic.getNumeroPatronals(),this.numeropatronalAux);
				
				this.numeropatronalLogic.getNumeroPatronals().add(this.numeropatronalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				NumeroPatronalConstantesFunciones.TotalizarValoresFilaNumeroPatronal(this.numeropatronals,this.numeropatronalAux);
				
				this.numeropatronals.add(this.numeropatronalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		numeropatronalTotales=new NumeroPatronal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.numeropatronalLogic.getNumeroPatronals().remove(numeropatronalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.numeropatronals.remove(numeropatronalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		numeropatronalTotales=new NumeroPatronal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(NumeroPatronal numeropatronal:numeropatronalLogic.getNumeroPatronals()) {
				if(numeropatronal.getsType().equals(Constantes2.S_TOTALES)) {
					numeropatronalTotales=numeropatronal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NumeroPatronalConstantesFunciones.TotalizarValoresFilaNumeroPatronal(this.numeropatronalLogic.getNumeroPatronals(),numeropatronalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(NumeroPatronal numeropatronal:this.numeropatronals) {
				if(numeropatronal.getsType().equals(Constantes2.S_TOTALES)) {
					numeropatronalTotales=numeropatronal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				NumeroPatronalConstantesFunciones.TotalizarValoresFilaNumeroPatronal(this.numeropatronals,numeropatronalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getNumeroPatronalsFK_IdCanton()throws Exception {
		try {
			sAccionBusqueda="FK_IdCanton";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNumeroPatronalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNumeroPatronalsFK_IdParroquia()throws Exception {
		try {
			sAccionBusqueda="FK_IdParroquia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getNumeroPatronalsFK_IdProvincia()throws Exception {
		try {
			sAccionBusqueda="FK_IdProvincia";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getNumeroPatronalsFK_IdCanton(String sFinalQuery,Long id_canton)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getNumeroPatronalsFK_IdCanton(sFinalQuery,this.pagination,id_canton);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNumeroPatronalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getNumeroPatronalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNumeroPatronalsFK_IdParroquia(String sFinalQuery,Long id_parroquia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getNumeroPatronalsFK_IdParroquia(sFinalQuery,this.pagination,id_parroquia);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getNumeroPatronalsFK_IdProvincia(String sFinalQuery,Long id_provincia)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLogic.getNumeroPatronalsFK_IdProvincia(sFinalQuery,this.pagination,id_provincia);
				
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
	
	public void inicializarPermisosNumeroPatronal() {
		this.isPermisoTodoNumeroPatronal=false;
		this.isPermisoNuevoNumeroPatronal=false;
		this.isPermisoActualizarNumeroPatronal=false;
		this.isPermisoActualizarOriginalNumeroPatronal=false;
		this.isPermisoEliminarNumeroPatronal=false;
		this.isPermisoGuardarCambiosNumeroPatronal=false;
		this.isPermisoConsultaNumeroPatronal=false;
		this.isPermisoBusquedaNumeroPatronal=false;
		this.isPermisoReporteNumeroPatronal=false;		
		this.isPermisoOrdenNumeroPatronal=false;		
		this.isPermisoPaginacionMedioNumeroPatronal=false;		
		this.isPermisoPaginacionAltoNumeroPatronal=false;
		this.isPermisoPaginacionTodoNumeroPatronal=false;
		this.isPermisoCopiarNumeroPatronal=false;		
		this.isPermisoVerFormNumeroPatronal=false;		
		this.isPermisoDuplicarNumeroPatronal=false;		
		this.isPermisoOrdenNumeroPatronal=false;		
	}
	
	public void setPermisosUsuarioNumeroPatronal(Boolean isPermiso) {
		this.isPermisoTodoNumeroPatronal=isPermiso;
		this.isPermisoNuevoNumeroPatronal=isPermiso;
		this.isPermisoActualizarNumeroPatronal=isPermiso;
		this.isPermisoActualizarOriginalNumeroPatronal=isPermiso;
		this.isPermisoEliminarNumeroPatronal=isPermiso;
		this.isPermisoGuardarCambiosNumeroPatronal=isPermiso;
		this.isPermisoConsultaNumeroPatronal=isPermiso;
		this.isPermisoBusquedaNumeroPatronal=isPermiso;
		this.isPermisoReporteNumeroPatronal=isPermiso;
		this.isPermisoOrdenNumeroPatronal=isPermiso;		
		this.isPermisoPaginacionMedioNumeroPatronal=isPermiso;		
		this.isPermisoPaginacionAltoNumeroPatronal=isPermiso;		
		this.isPermisoPaginacionTodoNumeroPatronal=isPermiso;		
		this.isPermisoCopiarNumeroPatronal=isPermiso;		
		this.isPermisoVerFormNumeroPatronal=isPermiso;		
		this.isPermisoDuplicarNumeroPatronal=isPermiso;
		this.isPermisoOrdenNumeroPatronal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioNumeroPatronal(Boolean isPermiso) {
		//this.isPermisoTodoNumeroPatronal=isPermiso;
		this.isPermisoNuevoNumeroPatronal=isPermiso;
		this.isPermisoActualizarNumeroPatronal=isPermiso;
		this.isPermisoActualizarOriginalNumeroPatronal=isPermiso;
		this.isPermisoEliminarNumeroPatronal=isPermiso;
		this.isPermisoGuardarCambiosNumeroPatronal=isPermiso;
		//this.isPermisoConsultaNumeroPatronal=isPermiso;
		//this.isPermisoBusquedaNumeroPatronal=isPermiso;
		//this.isPermisoReporteNumeroPatronal=isPermiso;
		//this.isPermisoOrdenNumeroPatronal=isPermiso;		
		//this.isPermisoPaginacionMedioNumeroPatronal=isPermiso;		
		//this.isPermisoPaginacionAltoNumeroPatronal=isPermiso;		
		//this.isPermisoPaginacionTodoNumeroPatronal=isPermiso;		
		//this.isPermisoCopiarNumeroPatronal=isPermiso;		
		//this.isPermisoDuplicarNumeroPatronal=isPermiso;
		//this.isPermisoOrdenNumeroPatronal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioNumeroPatronalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(EstructuraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
		if(NumeroPatronalJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionNumeroPatronalClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosEstructura=false;
		this.isTienePermisosEstructura=this.verificarGetPermisosUsuarioOpcionNumeroPatronalClaseRelacionada(this.opcionsRelacionadas,EstructuraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCargo=false;
		this.isTienePermisosCargo=this.verificarGetPermisosUsuarioOpcionNumeroPatronalClaseRelacionada(this.opcionsRelacionadas,CargoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebNumeroPatronal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioNumeroPatronalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
		this.isTienePermisosEstructura=conPermiso;
		this.isTienePermisosCargo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioNumeroPatronalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionNumeroPatronalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioNumeroPatronalClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.remove(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosEstructura && this.jInternalFrameDetalleFormNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.remove(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCargo && this.jInternalFrameDetalleFormNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.remove(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioNumeroPatronal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(NumeroPatronalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, NumeroPatronalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoNumeroPatronal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarNumeroPatronal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalNumeroPatronal=this.isPermisoActualizarNumeroPatronal;
			this.isPermisoEliminarNumeroPatronal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosNumeroPatronal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaNumeroPatronal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaNumeroPatronal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoNumeroPatronal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteNumeroPatronal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNumeroPatronal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioNumeroPatronal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoNumeroPatronal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoNumeroPatronal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarNumeroPatronal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormNumeroPatronal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarNumeroPatronal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenNumeroPatronal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosNumeroPatronal.setToolTipText(this.jTableDatosNumeroPatronal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioNumeroPatronal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioNumeroPatronal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(NumeroPatronalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(NumeroPatronalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioNumeroPatronal() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDatoGeneralEmpleado && this.numeropatronalConstantesFunciones.mostrarDatoGeneralEmpleadoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosEstructura && this.numeropatronalConstantesFunciones.mostrarEstructuraNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Estructura");
			reporte.setsDescripcion("Estructura");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCargo && this.numeropatronalConstantesFunciones.mostrarCargoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {

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
	public void inicializarCombosForeignKeyNumeroPatronalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.provinciasForeignKey=new ArrayList();
				this.cantonsForeignKey=new ArrayList();
				this.parroquiasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyNumeroPatronalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(NumeroPatronalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyNumeroPatronalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyParroquiaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyProvinciaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProvinciaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCantonListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CantonConstantesFunciones.SFINALQUERY;

				this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParroquiaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.parroquiasForeignKey==null||this.parroquiasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ParroquiaConstantesFunciones.getArrayColumnasGlobalesParroquia(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParroquiaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ParroquiaConstantesFunciones.SFINALQUERY;

				this.cargarCombosParroquiasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyNumeroPatronalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			NumeroPatronalParameterReturnGeneral numeropatronalReturnGeneral=new NumeroPatronalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.numeropatronalConstantesFunciones.cargarid_empresaNumeroPatronal)
					 || (this.esRecargarFks && this.numeropatronalConstantesFunciones.cargarid_empresaNumeroPatronal)) {

					if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+numeropatronalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalProvincia="";

				if(((this.provinciasForeignKey==null||this.provinciasForeignKey.size()<=0) && this.numeropatronalConstantesFunciones.cargarid_provinciaNumeroPatronal)
					 || (this.esRecargarFks && this.numeropatronalConstantesFunciones.cargarid_provinciaNumeroPatronal)) {

					if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProvinciaConstantesFunciones.getArrayColumnasGlobalesProvincia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProvincia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProvinciaConstantesFunciones.TABLENAME);

						finalQueryGlobalProvincia=Funciones.GetFinalQueryAppend(finalQueryGlobalProvincia, "");
						finalQueryGlobalProvincia+=ProvinciaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProvinciasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProvincia=" WHERE " + ConstantesSql.ID + "="+numeropatronalSessionBean.getlidProvinciaActual();
					}
				} else {
					finalQueryGlobalProvincia="NONE";
				}


				String finalQueryGlobalCanton="";

				if(((this.cantonsForeignKey==null||this.cantonsForeignKey.size()<=0) && this.numeropatronalConstantesFunciones.cargarid_cantonNumeroPatronal)
					 || (this.esRecargarFks && this.numeropatronalConstantesFunciones.cargarid_cantonNumeroPatronal)) {

					if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CantonConstantesFunciones.getArrayColumnasGlobalesCanton(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCanton=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CantonConstantesFunciones.TABLENAME);

						finalQueryGlobalCanton=Funciones.GetFinalQueryAppend(finalQueryGlobalCanton, "");
						finalQueryGlobalCanton+=CantonConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCantonsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCanton=" WHERE " + ConstantesSql.ID + "="+numeropatronalSessionBean.getlidCantonActual();
					}
				} else {
					finalQueryGlobalCanton="NONE";
				}


				String finalQueryGlobalParroquia="";

				if(((this.parroquiasForeignKey==null||this.parroquiasForeignKey.size()<=0) && this.numeropatronalConstantesFunciones.cargarid_parroquiaNumeroPatronal)
					 || (this.esRecargarFks && this.numeropatronalConstantesFunciones.cargarid_parroquiaNumeroPatronal)) {

					if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ParroquiaConstantesFunciones.getArrayColumnasGlobalesParroquia(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalParroquia=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ParroquiaConstantesFunciones.TABLENAME);

						finalQueryGlobalParroquia=Funciones.GetFinalQueryAppend(finalQueryGlobalParroquia, "");
						finalQueryGlobalParroquia+=ParroquiaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosParroquiasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalParroquia=" WHERE " + ConstantesSql.ID + "="+numeropatronalSessionBean.getlidParroquiaActual();
					}
				} else {
					finalQueryGlobalParroquia="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				numeropatronalReturnGeneral=numeropatronalLogic.cargarCombosLoteForeignKeyNumeroPatronal(finalQueryGlobalEmpresa,finalQueryGlobalProvincia,finalQueryGlobalCanton,finalQueryGlobalParroquia);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=numeropatronalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalProvincia.equals("NONE")) {
				this.provinciasForeignKey=numeropatronalReturnGeneral.getprovinciasForeignKey();
			}

			if(!finalQueryGlobalCanton.equals("NONE")) {
				this.cantonsForeignKey=numeropatronalReturnGeneral.getcantonsForeignKey();
			}

			if(!finalQueryGlobalParroquia.equals("NONE")) {
				this.parroquiasForeignKey=numeropatronalReturnGeneral.getparroquiasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyNumeroPatronal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyProvincia();
			this.addItemDefectoCombosForeignKeyCanton();
			this.addItemDefectoCombosForeignKeyParroquia();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyProvincia()throws Exception {
		try {

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionProvincia()) {
				Provincia provincia=new Provincia();
				ProvinciaConstantesFunciones.setProvinciaDescripcion(provincia,Constantes.SMENSAJE_ESCOJA_OPCION);
				provincia.setId(null);

				if(!ProvinciaConstantesFunciones.ExisteEnLista(this.provinciasForeignKey,provincia,true)) {

					this.provinciasForeignKey.add(0,provincia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCanton()throws Exception {
		try {

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionCanton()) {
				Canton canton=new Canton();
				CantonConstantesFunciones.setCantonDescripcion(canton,Constantes.SMENSAJE_ESCOJA_OPCION);
				canton.setId(null);

				if(!CantonConstantesFunciones.ExisteEnLista(this.cantonsForeignKey,canton,true)) {

					this.cantonsForeignKey.add(0,canton);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyParroquia()throws Exception {
		try {

			if(!this.numeropatronalSessionBean.getisBusquedaDesdeForeignKeySesionParroquia()) {
				Parroquia parroquia=new Parroquia();
				ParroquiaConstantesFunciones.setParroquiaDescripcion(parroquia,Constantes.SMENSAJE_ESCOJA_OPCION);
				parroquia.setId(null);

				if(!ParroquiaConstantesFunciones.ExisteEnLista(this.parroquiasForeignKey,parroquia,true)) {

					this.parroquiasForeignKey.add(0,parroquia);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyNumeroPatronal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyNumeroPatronal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyNumeroPatronal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroPatronal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyNumeroPatronal(NumeroPatronal numeropatronal)throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(numeropatronal.getid_provincia(),false,"Formulario");
			this.setActualCantonForeignKey(numeropatronal.getid_canton(),false,"Formulario");
			this.setActualParroquiaForeignKey(numeropatronal.getid_parroquia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyNumeroPatronal(NumeroPatronal numeropatronal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyNumeroPatronal()throws Exception {	
		try {
			
			this.setActualProvinciaForeignKey(this.numeropatronalConstantesFunciones.getid_provincia(),false,"Formulario");
			this.setActualCantonForeignKey(this.numeropatronalConstantesFunciones.getid_canton(),false,"Formulario");
			this.setActualParroquiaForeignKey(this.numeropatronalConstantesFunciones.getid_parroquia(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyNumeroPatronal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyNumeroPatronal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyNumeroPatronal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroNumeroPatronal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyNumeroPatronal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameProvinciasForeignKey("Todos");
			this.cargarCombosFrameCantonsForeignKey("Todos");
			this.cargarCombosFrameParroquiasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyNumeroPatronal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameParroquiasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyNumeroPatronal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.getItemCount()>0) {
				this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public NumeroPatronalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public NumeroPatronalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public NumeroPatronalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.numeropatronalSessionBean=new NumeroPatronalSessionBean(); 
		this.numeropatronalConstantesFunciones=new NumeroPatronalConstantesFunciones(); 
		this.numeropatronalBean=new NumeroPatronal();//(this.numeropatronalConstantesFunciones); 		
		this.numeropatronalReturnGeneral=new NumeroPatronalParameterReturnGeneral(); 
		
		this.numeropatronalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.numeropatronalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public NumeroPatronalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public NumeroPatronalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public NumeroPatronalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessNumeroPatronal(true);
			
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
			
			this.numeropatronalConstantesFunciones=new NumeroPatronalConstantesFunciones(); 
			this.numeropatronalBean=new NumeroPatronal();//this.numeropatronalConstantesFunciones); 			
			this.numeropatronalReturnGeneral=new NumeroPatronalParameterReturnGeneral(); 
		
			NumeroPatronalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Numero Patronal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.numeropatronal=new NumeroPatronal();
			this.numeropatronals = new ArrayList<NumeroPatronal>();
			this.numeropatronalsAux = new ArrayList<NumeroPatronal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic=new NumeroPatronalLogic();
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			//this.numeropatronalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.numeropatronalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormNumeroPatronal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNumeroPatronal);	
					}
					
					if(this.jInternalFrameImportacionNumeroPatronal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNumeroPatronal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByNumeroPatronal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByNumeroPatronal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormNumeroPatronal);
				this.jInternalFrameDetalleFormNumeroPatronal.setVisible(false);
				this.jInternalFrameDetalleFormNumeroPatronal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNumeroPatronal);
					this.jInternalFrameReporteDinamicoNumeroPatronal.setVisible(false);
					this.jInternalFrameReporteDinamicoNumeroPatronal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionNumeroPatronal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionNumeroPatronal);
					this.jInternalFrameImportacionNumeroPatronal.setVisible(false);
					this.jInternalFrameImportacionNumeroPatronal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByNumeroPatronal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByNumeroPatronal);
					this.jInternalFrameOrderByNumeroPatronal.setVisible(false);
					this.jInternalFrameOrderByNumeroPatronal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idNumeroPatronalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=NumeroPatronalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.numeropatronalReturnGeneral=new NumeroPatronalParameterReturnGeneral();
			
			this.numeropatronalParameterGeneral=new NumeroPatronalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.numeropatronalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(NumeroPatronalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(EstructuraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CargoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NumeroPatronalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.numeropatronalSessionBean.getEsGuardarRelacionado(),this.numeropatronalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,NumeroPatronalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.numeropatronalSessionBean.getEsGuardarRelacionado(),this.numeropatronalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaDuplicarNumeroPatronal=true;
			this.isVisibilidadCeldaCopiarNumeroPatronal=true;
			this.isVisibilidadCeldaVerFormNumeroPatronal=true;
			this.isVisibilidadCeldaOrdenNumeroPatronal=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			
			
			this.isVisibilidadFK_IdCanton=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdParroquia=true;
			this.isVisibilidadFK_IdProvincia=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosNumeroPatronal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioNumeroPatronal(false);
			
			this.setPermisosUsuarioNumeroPatronal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado() 
				|| (this.numeropatronalSessionBean.getEsGuardarRelacionado() && this.numeropatronalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioNumeroPatronalClasesRelacionadas();
			}
			
			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioNumeroPatronalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosNumeroPatronal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualNumeroPatronal();
			}
			
			if(!this.isPermisoBusquedaNumeroPatronal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioNumeroPatronal,this.isPermisoPaginacionMedioNumeroPatronal,this.isPermisoPaginacionTodoNumeroPatronal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(NumeroPatronalConstantesFunciones.getTiposSeleccionarNumeroPatronal());
				
				this.tiposColumnasSelect=NumeroPatronalConstantesFunciones.getTiposSeleccionarNumeroPatronal(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectNumeroPatronal();				
				//this.tiposRelacionesSelect=NumeroPatronalConstantesFunciones.getTiposRelacionesNumeroPatronal(true);
				
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
			//if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioNumeroPatronal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioNumeroPatronal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioNumeroPatronal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroPatronal() ;
			
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
			
			
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.cargoLogic=new CargoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.provinciaLogic=new ProvinciaLogic();
			this.cantonLogic=new CantonLogic();
			this.parroquiaLogic=new ParroquiaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				numeropatronalImplementable= (NumeroPatronalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NumeroPatronalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				numeropatronalImplementableHome= (NumeroPatronalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+NumeroPatronalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.numeropatronals= new ArrayList<NumeroPatronal>();
			this.numeropatronalsEliminados= new ArrayList<NumeroPatronal>();
						
			this.isEsNuevoNumeroPatronal=false;
			this.esParaAccionDesdeFormularioNumeroPatronal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.provinciasForeignKey=new ArrayList<Provincia>() ;
			this.cantonsForeignKey=new ArrayList<Canton>() ;
			this.parroquiasForeignKey=new ArrayList<Parroquia>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyNumeroPatronal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroNumeroPatronal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			NumeroPatronalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=NumeroPatronalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesNumeroPatronal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingNumeroPatronal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioNumeroPatronal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioNumeroPatronal();
			}
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasNumeroPatronal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasNumeroPatronal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasNumeroPatronal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessNumeroPatronal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga NumeroPatronal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectNumeroPatronal() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(EstructuraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(EstructuraConstantesFunciones.SCLASSWEBTITULO);
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
			if(sTipo.equals("RelacionesNumeroPatronal")) {
				iIndex=this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();	
				
				

				if(sTitle.equals("Cargos")) {
					if(!CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNumeroPatronal();

						this.cargarParteTabPanelRelacionadaCargo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Estructuras")) {
					if(!EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNumeroPatronal();

						this.cargarParteTabPanelRelacionadaEstructura(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessNumeroPatronal();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessNumeroPatronal();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCargo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNumeroPatronal.cargarSessionConBeanSwingJInternalFrameCargo(false,true,iIndex);
		this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCargo();

		//this.jTabbedPaneRelacionesNumeroPatronal.updateUI();
		//this.jTabbedPaneRelacionesNumeroPatronal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNumeroPatronal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaEstructura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNumeroPatronal.cargarSessionConBeanSwingJInternalFrameEstructura(false,true,iIndex);
		this.jButtonEstructuraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaEstructura();

		//this.jTabbedPaneRelacionesNumeroPatronal.updateUI();
		//this.jTabbedPaneRelacionesNumeroPatronal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNumeroPatronal.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormNumeroPatronal.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesNumeroPatronal.updateUI();
		//this.jTabbedPaneRelacionesNumeroPatronal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesNumeroPatronal.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosNumeroPatronal.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Estructura")) {
				int row=this.jTableDatosNumeroPatronal.getSelectedRow();
				jButtonEstructuraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Cargo")) {
				int row=this.jTableDatosNumeroPatronal.getSelectedRow();
				jButtonCargoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.numeropatronalConstantesFunciones.mostrarDatoGeneralEmpleadoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(numeropatronalConstantesFunciones.resaltarDatoGeneralEmpleadoNumeroPatronal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(numeropatronalConstantesFunciones.resaltarDatoGeneralEmpleadoNumeroPatronal);
						}

						jmenuItem.setEnabled(this.numeropatronalConstantesFunciones.activarDatoGeneralEmpleadoNumeroPatronal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormNumeroPatronal.jmenuDetalleNumeroPatronal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Estructura")) {

					if(this.isTienePermisosEstructura && this.numeropatronalConstantesFunciones.mostrarEstructuraNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Estructuras"+"("+EstructuraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Estructuras");

						if(numeropatronalConstantesFunciones.resaltarEstructuraNumeroPatronal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(numeropatronalConstantesFunciones.resaltarEstructuraNumeroPatronal);
						}

						jmenuItem.setEnabled(this.numeropatronalConstantesFunciones.activarEstructuraNumeroPatronal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Estructura"));

						

						this.jInternalFrameDetalleFormNumeroPatronal.jmenuDetalleNumeroPatronal.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Cargo")) {

					if(this.isTienePermisosCargo && this.numeropatronalConstantesFunciones.mostrarCargoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Cargos"+"("+CargoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Cargos");

						if(numeropatronalConstantesFunciones.resaltarCargoNumeroPatronal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(numeropatronalConstantesFunciones.resaltarCargoNumeroPatronal);
						}

						jmenuItem.setEnabled(this.numeropatronalConstantesFunciones.activarCargoNumeroPatronal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cargo"));

						

						this.jInternalFrameDetalleFormNumeroPatronal.jmenuDetalleNumeroPatronal.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyNumeroPatronal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyNumeroPatronal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyNumeroPatronal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyNumeroPatronalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyNumeroPatronal();
		
		this.cargarCombosFrameForeignKeyNumeroPatronal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyNumeroPatronal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyNumeroPatronal();
		}
	}
	
	

	public void cargarCombosForeignKeyProvincia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProvinciaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProvincia();
				this.cargarCombosFrameProvinciasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProvincia(this.provinciasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCanton(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCantonListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCanton();
				this.cargarCombosFrameCantonsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCanton(this.cantonsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyParroquia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyParroquiaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyParroquia();
				this.cargarCombosFrameParroquiasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaParroquia(this.parroquiasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoNumeroPatronalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			
			if(jTableDatosNumeroPatronal.getRowCount()>=1) {
				jTableDatosNumeroPatronal.removeRowSelectionInterval(0, jTableDatosNumeroPatronal.getRowCount()-1);						
			}
			
			this.isEsNuevoNumeroPatronal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoNumeroPatronal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesNumeroPatronal(true);			
			//this.numeropatronal=new NumeroPatronal();
			//this.numeropatronal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroPatronal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroPatronal() ;
			
			if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroPatronal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.numeropatronal);	
			this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);				
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar NumeroPatronal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarNumeroPatronalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosNumeroPatronal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosNumeroPatronal.getSelectedRows().length;			
			}
			
			numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoNumeroPatronal--;			
				//NumeroPatronal numeropatronalAux= new NumeroPatronal();			
				//numeropatronalAux.setId(this.iIdNuevoNumeroPatronal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//NumeroPatronal numeropatronalOrigen=new NumeroPatronal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(NumeroPatronal numeropatronalOrigen : numeropatronalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							numeropatronalOrigen =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							numeropatronalOrigen =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaNumeroPatronal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.numeropatronal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosNumeroPatronal(numeropatronalOrigen,this.numeropatronal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.numeropatronalLogic.getNumeroPatronals().add(this.numeropatronalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.numeropatronals.add(this.numeropatronalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
				
				this.jTableDatosNumeroPatronal.setRowSelectionInterval(this.getIndiceNuevoNumeroPatronal(), this.getIndiceNuevoNumeroPatronal());
				
				int iLastRow =  this.jTableDatosNumeroPatronal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNumeroPatronal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNumeroPatronal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroPatronal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();									
		
			NumeroPatronal numeropatronalOrigen=new NumeroPatronal();
			NumeroPatronal numeropatronalDestino=new NumeroPatronal();
				
			numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosNumeroPatronal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || numeropatronalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosNumeroPatronal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalOrigen =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						numeropatronalOrigen =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						numeropatronalDestino =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						numeropatronalDestino =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				numeropatronalOrigen =numeropatronalsSeleccionados.get(0);
				numeropatronalDestino =numeropatronalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosNumeroPatronal(numeropatronalOrigen,numeropatronalDestino,true,false);
				
				numeropatronalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(numeropatronalDestino,numeropatronalLogic.getNumeroPatronals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(numeropatronalDestino,numeropatronals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
				
				//this.jTableDatosNumeroPatronal.setRowSelectionInterval(this.getIndiceNuevoNumeroPatronal(), this.getIndiceNuevoNumeroPatronal());
				
				int iLastRow =  this.jTableDatosNumeroPatronal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosNumeroPatronal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosNumeroPatronal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroPatronal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormNumeroPatronal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesNumeroPatronal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasNumeroPatronal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesNumeroPatronal.setVisible(!isVisible);
			this.jPanelPaginacionNumeroPatronal.setVisible(!isVisible);
			this.jPanelAccionesNumeroPatronal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameNumeroPatronal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoNumeroPatronal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionNumeroPatronal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByNumeroPatronal();
			
			this.abrirFrameOrderByNumeroPatronal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByNumeroPatronal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleNumeroPatronal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormNumeroPatronal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormNumeroPatronal.isMaximum()) {
					this.jInternalFrameDetalleFormNumeroPatronal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormNumeroPatronal.setSize(this.jInternalFrameDetalleFormNumeroPatronal.iWidthFormulario,this.jInternalFrameDetalleFormNumeroPatronal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormNumeroPatronal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormNumeroPatronal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormNumeroPatronal.isMaximum()) {
						this.jInternalFrameDetalleFormNumeroPatronal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),NumeroPatronalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),NumeroPatronalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),NumeroPatronalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCargo();
					}

					if(EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaEstructura();
					}

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormNumeroPatronal.setVisible(true);
	        this.jInternalFrameDetalleFormNumeroPatronal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByNumeroPatronal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByNumeroPatronal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByNumeroPatronal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroPatronal,false,this);
				} else {
					this.jInternalFrameOrderByNumeroPatronal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByNumeroPatronal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByNumeroPatronal);
				this.jInternalFrameOrderByNumeroPatronal.setVisible(false);
				this.jInternalFrameOrderByNumeroPatronal.setSelected(false);
				
				this.jInternalFrameOrderByNumeroPatronal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNumeroPatronal"));
				
				this.inicializarActualizarBindingTablaOrderByNumeroPatronal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionNumeroPatronal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionNumeroPatronal==null) {
				
				this.jInternalFrameImportacionNumeroPatronal=new ImportacionJInternalFrame(NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionNumeroPatronal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionNumeroPatronal);
				this.jInternalFrameImportacionNumeroPatronal.setVisible(false);
				this.jInternalFrameImportacionNumeroPatronal.setSelected(false);


				this.jInternalFrameImportacionNumeroPatronal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNumeroPatronal"));
				this.jInternalFrameImportacionNumeroPatronal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNumeroPatronal"));
				this.jInternalFrameImportacionNumeroPatronal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNumeroPatronal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoNumeroPatronal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoNumeroPatronal==null) {
				this.jInternalFrameReporteDinamicoNumeroPatronal=new ReporteDinamicoJInternalFrame(NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoNumeroPatronal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoNumeroPatronal);
				this.jInternalFrameReporteDinamicoNumeroPatronal.setVisible(false);
				this.jInternalFrameReporteDinamicoNumeroPatronal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroPatronal"));
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroPatronal"));
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroPatronal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroPatronal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCargo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaEstructura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormNumeroPatronal.jContentPaneDetalleNumeroPatronal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleNumeroPatronal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormNumeroPatronal);
			
	       	this.jInternalFrameDetalleFormNumeroPatronal.setVisible(false);
	        this.jInternalFrameDetalleFormNumeroPatronal.setSelected(false);
			
			//this.jInternalFrameDetalleFormNumeroPatronal.dispose();
			//this.jInternalFrameDetalleFormNumeroPatronal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoNumeroPatronal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoNumeroPatronal.setVisible(true);
	        this.jInternalFrameReporteDinamicoNumeroPatronal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionNumeroPatronal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionNumeroPatronal.setVisible(true);
	        this.jInternalFrameImportacionNumeroPatronal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByNumeroPatronal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByNumeroPatronal.setVisible(true);
	        this.jInternalFrameOrderByNumeroPatronal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByNumeroPatronal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByNumeroPatronal.setVisible(false);
	        this.jInternalFrameOrderByNumeroPatronal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoNumeroPatronal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoNumeroPatronal.setVisible(false);
	        this.jInternalFrameReporteDinamicoNumeroPatronal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionNumeroPatronal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionNumeroPatronal.setVisible(false);
	        this.jInternalFrameImportacionNumeroPatronal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarNumeroPatronal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarNumeroPatronal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesNumeroPatronal(true);
			//this.isEsNuevoNumeroPatronal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesNumeroPatronal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroPatronal(false) ;
			
			if(numeropatronalSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado() && EstructuraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonEstructuraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado() && CargoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCargoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroPatronal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroPatronal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaNumeroPatronalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarNumeroPatronal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesNumeroPatronal(true);
			//this.isEsNuevoNumeroPatronal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.numeropatronal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesNumeroPatronal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesNumeroPatronal(false) ;
			
			if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleNumeroPatronal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroPatronal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaProvincia(List<Provincia> provinciasForeignKey)throws Exception{
		TableColumn tableColumnProvincia=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA));
		TableCellEditor tableCellEditorProvincia =tableColumnProvincia.getCellEditor();

		ProvinciaTableCell provinciaTableCellFk=(ProvinciaTableCell)tableCellEditorProvincia;

		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.setprovinciasForeignKey(provinciasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNumeroPatronal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//provinciaTableCellFk.setRowActual(intSelectedRow);
			//provinciaTableCellFk.setprovinciasForeignKeyActual(provinciasForeignKey);
		//}


		if(provinciaTableCellFk!=null) {
			provinciaTableCellFk.RecargarProvinciasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCanton(List<Canton> cantonsForeignKey)throws Exception{
		TableColumn tableColumnCanton=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDCANTON));
		TableCellEditor tableCellEditorCanton =tableColumnCanton.getCellEditor();

		CantonTableCell cantonTableCellFk=(CantonTableCell)tableCellEditorCanton;

		if(cantonTableCellFk!=null) {
			cantonTableCellFk.setcantonsForeignKey(cantonsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNumeroPatronal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cantonTableCellFk.setRowActual(intSelectedRow);
			//cantonTableCellFk.setcantonsForeignKeyActual(cantonsForeignKey);
		//}


		if(cantonTableCellFk!=null) {
			cantonTableCellFk.RecargarCantonsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaParroquia(List<Parroquia> parroquiasForeignKey)throws Exception{
		TableColumn tableColumnParroquia=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA));
		TableCellEditor tableCellEditorParroquia =tableColumnParroquia.getCellEditor();

		ParroquiaTableCell parroquiaTableCellFk=(ParroquiaTableCell)tableCellEditorParroquia;

		if(parroquiaTableCellFk!=null) {
			parroquiaTableCellFk.setparroquiasForeignKey(parroquiasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosNumeroPatronal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//parroquiaTableCellFk.setRowActual(intSelectedRow);
			//parroquiaTableCellFk.setparroquiasForeignKeyActual(parroquiasForeignKey);
		//}


		if(parroquiaTableCellFk!=null) {
			parroquiaTableCellFk.RecargarParroquiasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesNumeroPatronal(false);
			
			//if(!this.isEsNuevoNumeroPatronal) {								
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				
			}
			
			if(this.permiteMantenimiento(this.numeropatronal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoNumeroPatronal=true;
					this.inicializarActualizarBindingTablaNumeroPatronal(false);
					this.isEsNuevoNumeroPatronal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoNumeroPatronal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoNumeroPatronal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNumeroPatronal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroPatronal(false);
				
				this.habilitarDeshabilitarControlesNumeroPatronal(false);
			
												
				
				if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleNumeroPatronal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoNumeroPatronalActionPerformed(evt,numeropatronalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualNumeroPatronal(this.numeropatronal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosNumeroPatronal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,numeropatronalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.numeropatronal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				this.numeropatronal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				this.numeropatronal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.numeropatronal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((NumeroPatronalModel) this.jTableDatosNumeroPatronal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoNumeroPatronal=true;
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
				this.isEsNuevoNumeroPatronal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesNumeroPatronal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroPatronal(false);
				
				this.habilitarDeshabilitarControlesNumeroPatronal(false);
				
				
				
				if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleNumeroPatronal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosNumeroPatronal.getRowCount()>=1) {
				jTableDatosNumeroPatronal.removeRowSelectionInterval(0, jTableDatosNumeroPatronal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesNumeroPatronal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaNumeroPatronal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesNumeroPatronal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualNumeroPatronal(false) ;
			
			this.isEsNuevoNumeroPatronal=false;
			
			if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleNumeroPatronal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingNumeroPatronal(false);
				
				//SI ES MANUAL
				if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualNumeroPatronal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoNumeroPatronal--;			
			//NumeroPatronal numeropatronalAux= new NumeroPatronal();			
			//numeropatronalAux.setId(this.iIdNuevoNumeroPatronal);
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaNumeroPatronal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
			
			this.numeropatronal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.numeropatronalLogic.getNumeroPatronals().add(this.numeropatronalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.numeropatronals.add(this.numeropatronalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaNumeroPatronal(false);
			
			this.jTableDatosNumeroPatronal.setRowSelectionInterval(this.getIndiceNuevoNumeroPatronal(), this.getIndiceNuevoNumeroPatronal());
			
			int iLastRow =  this.jTableDatosNumeroPatronal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosNumeroPatronal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosNumeroPatronal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroPatronal(false);
			
			//SI ES MANUAL
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroPatronal();
			}
			
			//this.abrirFrameTreeNumeroPatronal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Numero PatronalES ?", "MANTENIMIENTO DE Numero Patronal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionNumeroPatronal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralNumeroPatronal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.numeropatronalReturnGeneral=numeropatronalLogic.procesarImportacionNumeroPatronalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.numeropatronalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarNumeroPatronalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionNumeroPatronal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionNumeroPatronal.setFileImportacion(this.jInternalFrameImportacionNumeroPatronal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionNumeroPatronal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionNumeroPatronal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionNumeroPatronal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionNumeroPatronal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		

		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("NumeroPatronalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"NumeroPatronalBaseDesign.jrxml";
			
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
			
			this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Provincia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Provincia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Provincia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Provincia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDCANTON:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Canton_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Canton_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Canton_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Canton_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Parroquia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Parroquia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Parroquia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Parroquia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoActividad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoActividad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoActividad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoActividad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_CEDULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_dula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_dula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_dula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_dula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoNumeroPatronal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoria="id_provincia";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoria="id_canton";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA:
					sNombreCampoCategoria="id_parroquia";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD:
					sNombreCampoCategoria="codigo_actividad";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoria="cedula";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA:
					sNombreCampoCategoriaValor="id_provincia";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDCANTON:
					sNombreCampoCategoriaValor="id_canton";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA:
					sNombreCampoCategoriaValor="id_parroquia";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD:
					sNombreCampoCategoriaValor="codigo_actividad";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CEDULA:
					sNombreCampoCategoriaValor="cedula";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Provincia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_provincia");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDCANTON:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Canton",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_canton");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Parroquia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_parroquia");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Actividad Economica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_actividad");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CEDULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cedula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cedula");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("NumeroPatronals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getprovincia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDCANTON:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDCANTON);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getcanton_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getparroquia_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getcodigo_actividad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_CEDULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CEDULA);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getcedula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(NumeroPatronal numeropatronal:numeropatronalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(numeropatronal.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelNumeroPatronal(row);				
			//	iRow++;
			//}				
			
			//for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelNumeroPatronal(numeropatronalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
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
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroPatronal(false);
			
			//SI ES MANUAL
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualNumeroPatronal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroPatronal(false);
			
			//SI ES MANUAL
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNumeroPatronal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingNumeroPatronal(false);
			
			//SI ES MANUAL
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualNumeroPatronal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaNumeroPatronal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosNumeroPatronal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosNumeroPatronal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosNumeroPatronal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosNumeroPatronal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosNumeroPatronal.setMinimumSize(dimensionMinimum);
		this.jTableDatosNumeroPatronal.setMaximumSize(dimensionMaximum);
		this.jTableDatosNumeroPatronal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingNumeroPatronal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingNumeroPatronal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingNumeroPatronal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaNumeroPatronal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesNumeroPatronal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasNumeroPatronal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroPatronal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesNumeroPatronal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualNumeroPatronal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaNumeroPatronal();
		
		this.inicializarActualizarBindingBotonesManualNumeroPatronal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualNumeroPatronal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesNumeroPatronal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroPatronal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroPatronal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosNumeroPatronal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosNumeroPatronal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteNumeroPatronal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionNuevoNumeroPatronal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionSinCerrarNumeroPatronal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionSinMensajeNumeroPatronal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosNumeroPatronal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosNumeroPatronal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteNumeroPatronal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
				this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionNuevoNumeroPatronal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionSinCerrarNumeroPatronal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormNumeroPatronal.jCheckBoxPostAccionSinMensajeNumeroPatronal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionNumeroPatronal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionNumeroPatronal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesNumeroPatronal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesNumeroPatronal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesNumeroPatronal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarNumeroPatronal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesNumeroPatronal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesNumeroPatronal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralNumeroPatronal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesNumeroPatronal(Boolean esInicializar) throws Exception {
		try	{	
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualNumeroPatronal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesNumeroPatronal() throws Exception {
		try	{
			if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualNumeroPatronal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNumeroPatronal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualNumeroPatronal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesNumeroPatronal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesNumeroPatronal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesNumeroPatronal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionNumeroPatronal.addItem(reporte);
			}
			
			
			if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionNumeroPatronal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionNumeroPatronal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesNumeroPatronal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesNumeroPatronal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarNumeroPatronal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarNumeroPatronal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarNumeroPatronal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroPatronal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualNumeroPatronal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
				
				if(this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoNumeroPatronal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoNumeroPatronal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualNumeroPatronal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.getSelectedItem()!=null){this.id_cantonFK_IdCanton=((Canton)this.jComboBoxid_cantonFK_IdCantonNumeroPatronal.getSelectedItem()).getId();}
		if(this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.getSelectedItem()!=null){this.id_parroquiaFK_IdParroquia=((Parroquia)this.jComboBoxid_parroquiaFK_IdParroquiaNumeroPatronal.getSelectedItem()).getId();}
		if(this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.getSelectedItem()!=null){this.id_provinciaFK_IdProvincia=((Provincia)this.jComboBoxid_provinciaFK_IdProvinciaNumeroPatronal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasNumeroPatronal(Boolean esInicializar) throws Exception {				
		if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualNumeroPatronal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaNumeroPatronal() throws Exception {
		this.inicializarActualizarBindingTablaNumeroPatronal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByNumeroPatronal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosNumeroPatronalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaNumeroPatronal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=numeropatronalLogic.getNumeroPatronals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=numeropatronals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosNumeroPatronal.setModel(new NumeroPatronalModel(this.numeropatronalLogic.getNumeroPatronals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosNumeroPatronal.setModel(new NumeroPatronalModel(this.numeropatronals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByNumeroPatronal!=null && this.jInternalFrameOrderByNumeroPatronal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByNumeroPatronal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,numeropatronalConstantesFunciones.resaltarSeleccionarNumeroPatronal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+NumeroPatronalConstantesFunciones.SCLASSWEBTITULO,numeropatronalConstantesFunciones.resaltarSeleccionarNumeroPatronal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_ID));

		if(this.numeropatronalConstantesFunciones.mostraridNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.numeropatronalConstantesFunciones.resaltaridNumeroPatronal,this.numeropatronalConstantesFunciones.activaridNumeroPatronal,this,true,"idNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltaridNumeroPatronal,this.numeropatronalConstantesFunciones.activaridNumeroPatronal,this,true,"idNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.numeropatronalConstantesFunciones.mostrarid_empresaNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_empresaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_empresaNumeroPatronal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_empresaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_empresaNumeroPatronal,false,"id_empresaNumeroPatronal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA));

		if(this.numeropatronalConstantesFunciones.mostrarid_provinciaNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProvinciaTableCell(this.provinciasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_provinciaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_provinciaNumeroPatronal));
			tableColumn.setCellEditor(new ProvinciaTableCell(this.provinciasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_provinciaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_provinciaNumeroPatronal,true,"id_provinciaNumeroPatronal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDCANTON));

		if(this.numeropatronalConstantesFunciones.mostrarid_cantonNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_IDCANTON,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CantonTableCell(this.cantonsForeignKey,this.numeropatronalConstantesFunciones.resaltarid_cantonNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_cantonNumeroPatronal));
			tableColumn.setCellEditor(new CantonTableCell(this.cantonsForeignKey,this.numeropatronalConstantesFunciones.resaltarid_cantonNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_cantonNumeroPatronal,true,"id_cantonNumeroPatronal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA));

		if(this.numeropatronalConstantesFunciones.mostrarid_parroquiaNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ParroquiaTableCell(this.parroquiasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_parroquiaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_parroquiaNumeroPatronal));
			tableColumn.setCellEditor(new ParroquiaTableCell(this.parroquiasForeignKey,this.numeropatronalConstantesFunciones.resaltarid_parroquiaNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarid_parroquiaNumeroPatronal,true,"id_parroquiaNumeroPatronal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_NUMERO));

		if(this.numeropatronalConstantesFunciones.mostrarnumeroNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltarnumeroNumeroPatronal,this.numeropatronalConstantesFunciones.activarnumeroNumeroPatronal,this,true,"numeroNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltarnumeroNumeroPatronal,this.numeropatronalConstantesFunciones.activarnumeroNumeroPatronal,this,true,"numeroNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD));

		if(this.numeropatronalConstantesFunciones.mostrarcodigo_actividadNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltarcodigo_actividadNumeroPatronal,this.numeropatronalConstantesFunciones.activarcodigo_actividadNumeroPatronal,this,true,"codigo_actividadNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltarcodigo_actividadNumeroPatronal,this.numeropatronalConstantesFunciones.activarcodigo_actividadNumeroPatronal,this,true,"codigo_actividadNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_APELLIDO));

		if(this.numeropatronalConstantesFunciones.mostrarapellidoNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltarapellidoNumeroPatronal,this.numeropatronalConstantesFunciones.activarapellidoNumeroPatronal,this,true,"apellidoNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltarapellidoNumeroPatronal,this.numeropatronalConstantesFunciones.activarapellidoNumeroPatronal,this,true,"apellidoNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_NOMBRE));

		if(this.numeropatronalConstantesFunciones.mostrarnombreNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltarnombreNumeroPatronal,this.numeropatronalConstantesFunciones.activarnombreNumeroPatronal,this,true,"nombreNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltarnombreNumeroPatronal,this.numeropatronalConstantesFunciones.activarnombreNumeroPatronal,this,true,"nombreNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_CEDULA));

		if(this.numeropatronalConstantesFunciones.mostrarcedulaNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_CEDULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltarcedulaNumeroPatronal,this.numeropatronalConstantesFunciones.activarcedulaNumeroPatronal,this,true,"cedulaNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltarcedulaNumeroPatronal,this.numeropatronalConstantesFunciones.activarcedulaNumeroPatronal,this,true,"cedulaNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_TELEFONO));

		if(this.numeropatronalConstantesFunciones.mostrartelefonoNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltartelefonoNumeroPatronal,this.numeropatronalConstantesFunciones.activartelefonoNumeroPatronal,this,true,"telefonoNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltartelefonoNumeroPatronal,this.numeropatronalConstantesFunciones.activartelefonoNumeroPatronal,this,true,"telefonoNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION));

		if(this.numeropatronalConstantesFunciones.mostrardescripcionNumeroPatronal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.numeropatronalConstantesFunciones.resaltardescripcionNumeroPatronal,this.numeropatronalConstantesFunciones.activardescripcionNumeroPatronal,this,true,"descripcionNumeroPatronal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.numeropatronalConstantesFunciones.resaltardescripcionNumeroPatronal,this.numeropatronalConstantesFunciones.activardescripcionNumeroPatronal,this,true,"descripcionNumeroPatronal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new NumeroPatronalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDatoGeneralEmpleado && this.numeropatronalConstantesFunciones.mostrarDatoGeneralEmpleadoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(numeropatronalConstantesFunciones.resaltarDatoGeneralEmpleadoNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarDatoGeneralEmpleadoNumeroPatronal));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(numeropatronalConstantesFunciones.resaltarDatoGeneralEmpleadoNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarDatoGeneralEmpleadoNumeroPatronal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNumeroPatronal.addColumn(tableColumn);
			}

			if(this.isTienePermisosEstructura && this.numeropatronalConstantesFunciones.mostrarEstructuraNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Estructuras");
				tableColumn.setHeaderValue("Estructuras");
				tableColumn.setCellRenderer(new EstructuraTableCell(numeropatronalConstantesFunciones.resaltarEstructuraNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarEstructuraNumeroPatronal));
				tableColumn.setCellEditor(new EstructuraTableCell(numeropatronalConstantesFunciones.resaltarEstructuraNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarEstructuraNumeroPatronal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNumeroPatronal.addColumn(tableColumn);
			}

			if(this.isTienePermisosCargo && this.numeropatronalConstantesFunciones.mostrarCargoNumeroPatronal && !NumeroPatronalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Cargos");
				tableColumn.setHeaderValue("Cargos");
				tableColumn.setCellRenderer(new CargoTableCell(numeropatronalConstantesFunciones.resaltarCargoNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarCargoNumeroPatronal));
				tableColumn.setCellEditor(new CargoTableCell(numeropatronalConstantesFunciones.resaltarCargoNumeroPatronal,this,this.numeropatronalConstantesFunciones.activarCargoNumeroPatronal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosNumeroPatronal.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNumeroPatronal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosNumeroPatronal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.numeropatronalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosNumeroPatronal.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.numeropatronalSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosNumeroPatronal.addColumn(tableColumn);
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
			
			this.jTableDatosNumeroPatronal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.numeropatronalSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosNumeroPatronal.moveColumn(this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosNumeroPatronal.moveColumn(this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.numeropatronalSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosNumeroPatronal.moveColumn(this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosNumeroPatronal.moveColumn(this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosNumeroPatronal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosNumeroPatronal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosNumeroPatronal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosNumeroPatronal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosNumeroPatronal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosNumeroPatronal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosNumeroPatronal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosNumeroPatronal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=numeropatronalLogic.getNumeroPatronals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=numeropatronals.size()-1;
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
		//this.jTableDatosNumeroPatronal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosNumeroPatronal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosNumeroPatronal();
			
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
				
				//this.isEsNuevoNumeroPatronal=false;
					
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
				if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormNumeroPatronal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNumeroPatronal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNumeroPatronal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.numeropatronal.getsType().equals("DUPLICADO")
				   || this.numeropatronal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoNumeroPatronal=true;
				
				} else {
					this.isEsNuevoNumeroPatronal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					if(this.numeropatronal.getId()>=0 && !this.numeropatronal.getIsNew()) {						
						this.isEsNuevoNumeroPatronal=false;
						
					} else {
						this.isEsNuevoNumeroPatronal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoNumeroPatronal(esRelaciones);						
				
				this.seleccionarNumeroPatronal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.numeropatronal.getId()<0) {
					this.isEsNuevoNumeroPatronal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarNumeroPatronal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarNumeroPatronal(evt,rowIndex);
				}	
				
				if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion NumeroPatronal: " + this.dDif); 
					}
				}								
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarNumeroPatronal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.numeropatronal)) {
					if(this.numeropatronal.getId()>0) {
						this.numeropatronal.setIsDeleted(true);
						
						this.numeropatronalsEliminados.add(this.numeropatronal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.numeropatronalLogic.getNumeroPatronals().remove(this.numeropatronal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.numeropatronals.remove(this.numeropatronal);				
					}
					
					
					((NumeroPatronalModel) this.jTableDatosNumeroPatronal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaNumeroPatronal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarNumeroPatronal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoNumeroPatronal) {
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosNumeroPatronal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosNumeroPatronal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioNumeroPatronal(this.numeropatronal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.numeropatronalConstantesFunciones.cargarid_empresaNumeroPatronal || this.numeropatronalConstantesFunciones.event_dependid_empresaNumeroPatronal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.numeropatronal.getid_empresa());
									//this.inicializarActualizarBindingNumeroPatronal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(numeropatronal.getEmpresa()!=null) {
							this.empresasForeignKey.add(numeropatronal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.numeropatronal.getid_empresa(),false,"Formulario");

					//Provincia
					if(!this.numeropatronalConstantesFunciones.cargarid_provinciaNumeroPatronal || this.numeropatronalConstantesFunciones.event_dependid_provinciaNumeroPatronal) {
						//this.cargarCombosProvinciasForeignKeyLista(" where id="+this.numeropatronal.getid_provincia());
									//this.inicializarActualizarBindingNumeroPatronal(false,false);
						this.provinciasForeignKey=new ArrayList<Provincia>();

						if(numeropatronal.getProvincia()!=null) {
							this.provinciasForeignKey.add(numeropatronal.getProvincia());
						}

						this.addItemDefectoCombosForeignKeyProvincia();
						this.cargarCombosFrameProvinciasForeignKey("Todos");
					}
					this.setActualProvinciaForeignKey(this.numeropatronal.getid_provincia(),false,"Formulario");

					//Canton
					if(!this.numeropatronalConstantesFunciones.cargarid_cantonNumeroPatronal || this.numeropatronalConstantesFunciones.event_dependid_cantonNumeroPatronal) {
						//this.cargarCombosCantonsForeignKeyLista(" where id="+this.numeropatronal.getid_canton());
									//this.inicializarActualizarBindingNumeroPatronal(false,false);
						this.cantonsForeignKey=new ArrayList<Canton>();

						if(numeropatronal.getCanton()!=null) {
							this.cantonsForeignKey.add(numeropatronal.getCanton());
						}

						this.addItemDefectoCombosForeignKeyCanton();
						this.cargarCombosFrameCantonsForeignKey("Todos");
					}
					this.setActualCantonForeignKey(this.numeropatronal.getid_canton(),false,"Formulario");

					//Parroquia
					if(!this.numeropatronalConstantesFunciones.cargarid_parroquiaNumeroPatronal || this.numeropatronalConstantesFunciones.event_dependid_parroquiaNumeroPatronal) {
						//this.cargarCombosParroquiasForeignKeyLista(" where id="+this.numeropatronal.getid_parroquia());
									//this.inicializarActualizarBindingNumeroPatronal(false,false);
						this.parroquiasForeignKey=new ArrayList<Parroquia>();

						if(numeropatronal.getParroquia()!=null) {
							this.parroquiasForeignKey.add(numeropatronal.getParroquia());
						}

						this.addItemDefectoCombosForeignKeyParroquia();
						this.cargarCombosFrameParroquiasForeignKey("Todos");
					}
					this.setActualParroquiaForeignKey(this.numeropatronal.getid_parroquia(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesNumeroPatronal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesNumeroPatronal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualNumeroPatronal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoNumeroPatronal(NumeroPatronal numeropatronal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoNumeroPatronal(numeropatronal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoNumeroPatronal(NumeroPatronal numeropatronal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioNumeroPatronal(numeropatronal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyNumeroPatronal(numeropatronal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyNumeroPatronal(numeropatronal);
	}
	
	public void setVariablesObjetoActualToFormularioNumeroPatronal(NumeroPatronal numeropatronal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setText(numeropatronal.getId().toString());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setText(numeropatronal.getnumero());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setText(numeropatronal.getcodigo_actividad());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setText(numeropatronal.getapellido());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setText(numeropatronal.getnombre());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setText(numeropatronal.getcedula());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setText(numeropatronal.gettelefono());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setText(numeropatronal.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,NumeroPatronal numeropatronalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,numeropatronalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,NumeroPatronal numeropatronalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				numeropatronalLocal=this.numeropatronal;
			} else {
				numeropatronalLocal=this.numeropatronalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(numeropatronalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoNumeroPatronal(numeropatronalLocal,true);
					
					if(numeropatronalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(numeropatronalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(numeropatronalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoNumeroPatronal(NumeroPatronal numeropatronal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNumeroPatronal(numeropatronal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(numeropatronal);
	}
	
	public void setVariablesFormularioToObjetoActualNumeroPatronal(NumeroPatronal numeropatronal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualNumeroPatronal(numeropatronal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualNumeroPatronal(NumeroPatronal numeropatronal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.getText()==null || this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.getText()=="" || this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.getText()=="Id") {
				this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setText("0");
			}

			if(conColumnasBase) {numeropatronal.setId(Long.parseLong(this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelIdNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setnumero(this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnumeroNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setcodigo_actividad(this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcodigo_actividadNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setapellido(this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelapellidoNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setnombre(this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelnombreNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setcedula(this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_CEDULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabelcedulaNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.settelefono(this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabeltelefonoNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			numeropatronal.setdescripcion(this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormNumeroPatronal.jLabeldescripcionNumeroPatronal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualNumeroPatronal(NumeroPatronal numeropatronalBean,NumeroPatronal numeropatronal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && numeropatronalBean.getid_provincia()!=null && !numeropatronalBean.getid_provincia().equals(-1L))) {numeropatronal.setid_provincia(numeropatronalBean.getid_provincia());}
			if(conDefault || (!conDefault && numeropatronalBean.getid_canton()!=null && !numeropatronalBean.getid_canton().equals(-1L))) {numeropatronal.setid_canton(numeropatronalBean.getid_canton());}
			if(conDefault || (!conDefault && numeropatronalBean.getid_parroquia()!=null && !numeropatronalBean.getid_parroquia().equals(-1L))) {numeropatronal.setid_parroquia(numeropatronalBean.getid_parroquia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosNumeroPatronal(NumeroPatronal numeropatronalOrigen,NumeroPatronal numeropatronal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && numeropatronalOrigen.getId()!=null && !numeropatronalOrigen.getId().equals(0L))) {numeropatronal.setId(numeropatronalOrigen.getId());}}
			if(conDefault || (!conDefault && numeropatronalOrigen.getid_provincia()!=null && !numeropatronalOrigen.getid_provincia().equals(-1L))) {numeropatronal.setid_provincia(numeropatronalOrigen.getid_provincia());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getid_canton()!=null && !numeropatronalOrigen.getid_canton().equals(-1L))) {numeropatronal.setid_canton(numeropatronalOrigen.getid_canton());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getid_parroquia()!=null && !numeropatronalOrigen.getid_parroquia().equals(-1L))) {numeropatronal.setid_parroquia(numeropatronalOrigen.getid_parroquia());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getnumero()!=null && !numeropatronalOrigen.getnumero().equals(""))) {numeropatronal.setnumero(numeropatronalOrigen.getnumero());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getcodigo_actividad()!=null && !numeropatronalOrigen.getcodigo_actividad().equals(""))) {numeropatronal.setcodigo_actividad(numeropatronalOrigen.getcodigo_actividad());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getapellido()!=null && !numeropatronalOrigen.getapellido().equals(""))) {numeropatronal.setapellido(numeropatronalOrigen.getapellido());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getnombre()!=null && !numeropatronalOrigen.getnombre().equals(""))) {numeropatronal.setnombre(numeropatronalOrigen.getnombre());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getcedula()!=null && !numeropatronalOrigen.getcedula().equals(""))) {numeropatronal.setcedula(numeropatronalOrigen.getcedula());}
			if(conDefault || (!conDefault && numeropatronalOrigen.gettelefono()!=null && !numeropatronalOrigen.gettelefono().equals(""))) {numeropatronal.settelefono(numeropatronalOrigen.gettelefono());}
			if(conDefault || (!conDefault && numeropatronalOrigen.getdescripcion()!=null && !numeropatronalOrigen.getdescripcion().equals(""))) {numeropatronal.setdescripcion(numeropatronalOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNumeroPatronal(NumeroPatronal numeropatronal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setText(numeropatronal.getId().toString());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setText(numeropatronal.getnumero());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setText(numeropatronal.getcodigo_actividad());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setText(numeropatronal.getapellido());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setText(numeropatronal.getnombre());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setText(numeropatronal.getcedula());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setText(numeropatronal.gettelefono());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setText(numeropatronal.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioNumeroPatronal(NumeroPatronalBean numeropatronalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setText(numeropatronalBean.getId().toString());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setText(numeropatronalBean.getnumero());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setText(numeropatronalBean.getcodigo_actividad());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setText(numeropatronalBean.getapellido());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setText(numeropatronalBean.getnombre());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setText(numeropatronalBean.getcedula());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setText(numeropatronalBean.gettelefono());
			this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setText(numeropatronalBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanNumeroPatronal(NumeroPatronalParameterReturnGeneral numeropatronalReturnGeneral,NumeroPatronalBean numeropatronalBean,Boolean conDefault) throws Exception { 
		try {
			NumeroPatronal numeropatronalLocal=new NumeroPatronal();
			
			numeropatronalLocal=numeropatronalReturnGeneral.getNumeroPatronal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && numeropatronalLocal.getId()!=null && !numeropatronalLocal.getId().equals(0L))) {numeropatronalBean.setId(numeropatronalLocal.getId());}}
			if(conDefault || (!conDefault && numeropatronalLocal.getid_provincia()!=null && !numeropatronalLocal.getid_provincia().equals(-1L))) {numeropatronalBean.setid_provincia(numeropatronalLocal.getid_provincia());}
			if(conDefault || (!conDefault && numeropatronalLocal.getid_canton()!=null && !numeropatronalLocal.getid_canton().equals(-1L))) {numeropatronalBean.setid_canton(numeropatronalLocal.getid_canton());}
			if(conDefault || (!conDefault && numeropatronalLocal.getid_parroquia()!=null && !numeropatronalLocal.getid_parroquia().equals(-1L))) {numeropatronalBean.setid_parroquia(numeropatronalLocal.getid_parroquia());}
			if(conDefault || (!conDefault && numeropatronalLocal.getnumero()!=null && !numeropatronalLocal.getnumero().equals(""))) {numeropatronalBean.setnumero(numeropatronalLocal.getnumero());}
			if(conDefault || (!conDefault && numeropatronalLocal.getcodigo_actividad()!=null && !numeropatronalLocal.getcodigo_actividad().equals(""))) {numeropatronalBean.setcodigo_actividad(numeropatronalLocal.getcodigo_actividad());}
			if(conDefault || (!conDefault && numeropatronalLocal.getapellido()!=null && !numeropatronalLocal.getapellido().equals(""))) {numeropatronalBean.setapellido(numeropatronalLocal.getapellido());}
			if(conDefault || (!conDefault && numeropatronalLocal.getnombre()!=null && !numeropatronalLocal.getnombre().equals(""))) {numeropatronalBean.setnombre(numeropatronalLocal.getnombre());}
			if(conDefault || (!conDefault && numeropatronalLocal.getcedula()!=null && !numeropatronalLocal.getcedula().equals(""))) {numeropatronalBean.setcedula(numeropatronalLocal.getcedula());}
			if(conDefault || (!conDefault && numeropatronalLocal.gettelefono()!=null && !numeropatronalLocal.gettelefono().equals(""))) {numeropatronalBean.settelefono(numeropatronalLocal.gettelefono());}
			if(conDefault || (!conDefault && numeropatronalLocal.getdescripcion()!=null && !numeropatronalLocal.getdescripcion().equals(""))) {numeropatronalBean.setdescripcion(numeropatronalLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxNumeroPatronalGenerico(Long idNumeroPatronalSeleccionado,JComboBox jComboBoxNumeroPatronal,List<NumeroPatronal> numeropatronalsLocal)throws Exception {
		try {
			NumeroPatronal  numeropatronalTemp=null;

			for(NumeroPatronal numeropatronalAux:numeropatronalsLocal) {
				if(numeropatronalAux.getId()!=null && numeropatronalAux.getId().equals(idNumeroPatronalSeleccionado)) {
					numeropatronalTemp=numeropatronalAux;
					break;
				}
			}

			jComboBoxNumeroPatronal.setSelectedItem(numeropatronalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxNumeroPatronalGenerico(JComboBox jComboBoxNumeroPatronal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNumeroPatronal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxNumeroPatronal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxNumeroPatronal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxNumeroPatronal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxNumeroPatronal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxNumeroPatronal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Estructura")) {
			jButtonEstructuraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Cargo")) {
			jButtonCargoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numeropatronal=(NumeroPatronal) numeropatronalLogic.getNumeroPatronals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			numeropatronal =(NumeroPatronal) numeropatronals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!numeropatronal.getIsNew() && !numeropatronal.getIsChanged() && !numeropatronal.getIsDeleted()) {
				sDescripcion=numeropatronal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=numeropatronal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Provincia")) {
			//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
			if(!numeropatronal.getIsNew() && !numeropatronal.getIsChanged() && !numeropatronal.getIsDeleted()) {
				sDescripcion=numeropatronal.getprovincia_descripcion();
			} else {
				//sDescripcion=this.getActualProvinciaForeignKeyDescripcion((Long)value);
				sDescripcion=numeropatronal.getprovincia_descripcion();
			}
		}

		if(sTipo.equals("Canton")) {
			//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
			if(!numeropatronal.getIsNew() && !numeropatronal.getIsChanged() && !numeropatronal.getIsDeleted()) {
				sDescripcion=numeropatronal.getcanton_descripcion();
			} else {
				//sDescripcion=this.getActualCantonForeignKeyDescripcion((Long)value);
				sDescripcion=numeropatronal.getcanton_descripcion();
			}
		}

		if(sTipo.equals("Parroquia")) {
			//sDescripcion=this.getActualParroquiaForeignKeyDescripcion((Long)value);
			if(!numeropatronal.getIsNew() && !numeropatronal.getIsChanged() && !numeropatronal.getIsDeleted()) {
				sDescripcion=numeropatronal.getparroquia_descripcion();
			} else {
				//sDescripcion=this.getActualParroquiaForeignKeyDescripcion((Long)value);
				sDescripcion=numeropatronal.getparroquia_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		NumeroPatronal numeropatronalRow=new NumeroPatronal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numeropatronalRow=(NumeroPatronal) numeropatronalLogic.getNumeroPatronals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			numeropatronalRow=(NumeroPatronal) numeropatronals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NumeroPatronal numeropatronal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNumeroPatronal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(numeropatronal!=null) {
						this.numeropatronal = numeropatronal;
					} else {
						this.numeropatronal = new NumeroPatronal();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.numeropatronal)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<NumeroPatronal> numeropatronals=new ArrayList<NumeroPatronal>();
					numeropatronals.add(this.numeropatronal);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNumeroPatronal.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(numeropatronals,this.numeropatronal,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.numeropatronalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonEstructuraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NumeroPatronal numeropatronal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNumeroPatronal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(numeropatronal!=null) {
						this.numeropatronal = numeropatronal;
					} else {
						this.numeropatronal = new NumeroPatronal();
					}
				}

				if(this.isTienePermisosEstructura && this.permiteMantenimiento(this.numeropatronal)) {
					EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup=new EstructuraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						estructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup;
					} else {
						estructuraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame;
					}

					List<NumeroPatronal> numeropatronals=new ArrayList<NumeroPatronal>();
					numeropatronals.add(this.numeropatronal);
					if(!esRelacionado) {
						//estructuraBeanSwingJInternalFrame.estructuraSessionBean.setConGuardarRelaciones(false);
						//estructuraBeanSwingJInternalFrame.estructuraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					estructuraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNumeroPatronal.cargarEstructuraBeanSwingJInternalFrame(numeropatronals,this.numeropatronal,estructuraBeanSwingJInternalFrame,/*conInicializar,*/estructuraBeanSwingJInternalFrame.estructuraSessionBean.getConGuardarRelaciones(),estructuraBeanSwingJInternalFrame.estructuraSessionBean.getEsGuardarRelacionado());
					estructuraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						estructuraBeanSwingJInternalFrame.actualizarEstadoPanelsEstructura("no_relacionado");

						estructuraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(EstructuraConstantesFunciones.ITAMANIOFILATABLA + (EstructuraConstantesFunciones.ITAMANIOFILATABLA/2));

						estructuraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Estructura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}

						estructuraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

						estructuraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.numeropatronalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Estructura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCargoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,NumeroPatronal numeropatronal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormNumeroPatronal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.numeropatronal = (NumeroPatronal)this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(numeropatronal!=null) {
						this.numeropatronal = numeropatronal;
					} else {
						this.numeropatronal = new NumeroPatronal();
					}
				}

				if(this.isTienePermisosCargo && this.permiteMantenimiento(this.numeropatronal)) {
					CargoBeanSwingJInternalFrame cargoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup=new CargoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup;
					} else {
						cargoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame;
					}

					List<NumeroPatronal> numeropatronals=new ArrayList<NumeroPatronal>();
					numeropatronals.add(this.numeropatronal);
					if(!esRelacionado) {
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setConGuardarRelaciones(false);
						//cargoBeanSwingJInternalFrame.cargoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormNumeroPatronal.cargarCargoBeanSwingJInternalFrame(numeropatronals,this.numeropatronal,cargoBeanSwingJInternalFrame,/*conInicializar,*/cargoBeanSwingJInternalFrame.cargoSessionBean.getConGuardarRelaciones(),cargoBeanSwingJInternalFrame.cargoSessionBean.getEsGuardarRelacionado());
					cargoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						cargoBeanSwingJInternalFrame.actualizarEstadoPanelsCargo("no_relacionado");

						cargoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CargoConstantesFunciones.ITAMANIOFILATABLA + (CargoConstantesFunciones.ITAMANIOFILATABLA/2));

						cargoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
						TitledBorder titledBorderCargo=(TitledBorder)cargoBeanSwingJInternalFrame.jScrollPanelDatosCargo.getBorder();

						titledBorderCargo.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Cargo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cargoBeanSwingJInternalFrame);
						}

						cargoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(cargoBeanSwingJInternalFrame);

						cargoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.numeropatronalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cargo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualNumeroPatronal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal));			
			this.jButtonDuplicarNumeroPatronal.setVisible((this.isVisibilidadCeldaDuplicarNumeroPatronal && this.isPermisoDuplicarNumeroPatronal));			
			this.jButtonCopiarNumeroPatronal.setVisible((this.isVisibilidadCeldaCopiarNumeroPatronal && this.isPermisoCopiarNumeroPatronal));
			this.jButtonVerFormNumeroPatronal.setVisible((this.isVisibilidadCeldaVerFormNumeroPatronal && this.isPermisoVerFormNumeroPatronal));
			
			this.jButtonAbrirOrderByNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));			
			
			this.jButtonNuevoRelacionesNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal && this.isPermisoNuevoNumeroPatronal));			
			this.jButtonNuevoGuardarCambiosNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarNumeroPatronal.setVisible((this.isVisibilidadCeldaModificarNumeroPatronal && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.setVisible((this.isVisibilidadCeldaActualizarNumeroPatronal && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.setVisible((this.isVisibilidadCeldaEliminarNumeroPatronal && this.isPermisoEliminarNumeroPatronal));
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.setVisible(this.isVisibilidadCeldaCancelarNumeroPatronal);							
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));			
			
			}
						
			this.jButtonGuardarCambiosTablaNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal));						
			this.jButtonDuplicarToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaDuplicarNumeroPatronal && this.isPermisoDuplicarNumeroPatronal));						
			this.jButtonCopiarToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaCopiarNumeroPatronal && this.isPermisoCopiarNumeroPatronal));			
			this.jButtonVerFormToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaVerFormNumeroPatronal && this.isPermisoVerFormNumeroPatronal));			
			this.jButtonAbrirOrderByToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));
			this.jButtonNuevoRelacionesToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal && this.isPermisoNuevoNumeroPatronal));			
			this.jButtonNuevoGuardarCambiosToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));			
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaModificarNumeroPatronal && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaActualizarNumeroPatronal  && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaEliminarNumeroPatronal && this.isPermisoEliminarNumeroPatronal));
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarToolBarNumeroPatronal.setVisible(this.isVisibilidadCeldaCancelarNumeroPatronal);				
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal));			
			this.jMenuItemDuplicarNumeroPatronal.setVisible((this.isVisibilidadCeldaDuplicarNumeroPatronal && this.isPermisoDuplicarNumeroPatronal));			
			this.jMenuItemCopiarNumeroPatronal.setVisible((this.isVisibilidadCeldaCopiarNumeroPatronal && this.isPermisoCopiarNumeroPatronal));			
			this.jMenuItemVerFormNumeroPatronal.setVisible((this.isVisibilidadCeldaVerFormNumeroPatronal && this.isPermisoVerFormNumeroPatronal));			
			this.jMenuItemAbrirOrderByNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));			
			//this.jMenuItemMostrarOcultarNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));
			this.jMenuItemDetalleAbrirOrderByNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));			
			//this.jMenuItemDetalleMostrarOcultarNumeroPatronal.setVisible((this.isVisibilidadCeldaOrdenNumeroPatronal && this.isPermisoOrdenNumeroPatronal));			
			this.jMenuItemNuevoRelacionesNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal && this.isPermisoNuevoNumeroPatronal));			
			this.jMenuItemNuevoGuardarCambiosNumeroPatronal.setVisible((this.isVisibilidadCeldaNuevoNumeroPatronal && this.isPermisoNuevoNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));									
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemModificarNumeroPatronal.setVisible((this.isVisibilidadCeldaModificarNumeroPatronal && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemActualizarNumeroPatronal.setVisible((this.isVisibilidadCeldaActualizarNumeroPatronal && this.isPermisoActualizarNumeroPatronal));	
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemEliminarNumeroPatronal.setVisible((this.isVisibilidadCeldaEliminarNumeroPatronal && this.isPermisoEliminarNumeroPatronal));
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemCancelarNumeroPatronal.setVisible(this.isVisibilidadCeldaCancelarNumeroPatronal);				
			}
			
			this.jMenuItemGuardarCambiosNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));						
			this.jMenuItemGuardarCambiosTablaNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarCambiosNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoNumeroPatronal=this.jButtonNuevoNumeroPatronal.isVisible();
			this.isVisibilidadCeldaDuplicarNumeroPatronal=this.jButtonDuplicarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaCopiarNumeroPatronal=this.jButtonCopiarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaVerFormNumeroPatronal=this.jButtonVerFormNumeroPatronal.isVisible();
			
			this.isVisibilidadCeldaOrdenNumeroPatronal=this.jButtonAbrirOrderByNumeroPatronal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=this.jButtonNuevoRelacionesNumeroPatronal.isVisible();
			this.isVisibilidadCeldaModificarNumeroPatronal=this.jButtonModificarNumeroPatronal.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.isVisibilidadCeldaActualizarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaEliminarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaCancelarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaGuardarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=this.jButtonGuardarCambiosTablaNumeroPatronal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoNumeroPatronal=this.jButtonNuevoToolBarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=this.jButtonNuevoRelacionesToolBarNumeroPatronal.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.isVisibilidadCeldaModificarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarToolBarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaActualizarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarToolBarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaEliminarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarToolBarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaCancelarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarToolBarNumeroPatronal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNumeroPatronal=this.jButtonGuardarCambiosToolBarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=this.jButtonGuardarCambiosTablaToolBarNumeroPatronal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoNumeroPatronal=this.jMenuItemNuevoNumeroPatronal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=this.jMenuItemNuevoRelacionesNumeroPatronal.isVisible();
			
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.isVisibilidadCeldaModificarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemModificarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaActualizarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemActualizarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaEliminarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemEliminarNumeroPatronal.isVisible();
			this.isVisibilidadCeldaCancelarNumeroPatronal=this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemCancelarNumeroPatronal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarNumeroPatronal=this.jMenuItemGuardarCambiosNumeroPatronal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=this.jMenuItemGuardarCambiosTablaNumeroPatronal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesNumeroPatronal(Boolean esInicializar) {
		if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
				//if(this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesNumeroPatronal();
			}
			
			this.inicializarActualizarBindingBotonesManualNumeroPatronal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualNumeroPatronal() {
		this.jButtonNuevoNumeroPatronal.setVisible(this.isPermisoNuevoNumeroPatronal);			
		this.jButtonDuplicarNumeroPatronal.setVisible(this.isPermisoDuplicarNumeroPatronal);			
		this.jButtonCopiarNumeroPatronal.setVisible(this.isPermisoCopiarNumeroPatronal);			
		this.jButtonVerFormNumeroPatronal.setVisible(this.isPermisoVerFormNumeroPatronal);			
		
		this.jButtonAbrirOrderByNumeroPatronal.setVisible(this.isPermisoOrdenNumeroPatronal);					
		
		this.jButtonNuevoRelacionesNumeroPatronal.setVisible(this.isPermisoNuevoNumeroPatronal);			
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarNumeroPatronal.setVisible(this.isPermisoActualizarNumeroPatronal);	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.setVisible(this.isPermisoActualizarNumeroPatronal);	
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.setVisible(this.isPermisoEliminarNumeroPatronal);
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.setVisible(this.isVisibilidadCeldaCancelarNumeroPatronal);						
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.setVisible(this.isPermisoGuardarCambiosNumeroPatronal);							
		}
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.setVisible(this.isPermisoActualizarNumeroPatronal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleNumeroPatronal() {
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarNumeroPatronal.setVisible(this.isPermisoActualizarNumeroPatronal);	
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.setVisible(this.isPermisoActualizarNumeroPatronal);	
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.setVisible(this.isPermisoEliminarNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.setVisible(this.isVisibilidadCeldaCancelarNumeroPatronal);							
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.setVisible((this.isVisibilidadCeldaGuardarNumeroPatronal && this.isPermisoGuardarCambiosNumeroPatronal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosNumeroPatronal() {
		if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualNumeroPatronal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesNumeroPatronal() {
	}
	
	public void jTableDatosNumeroPatronalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarNumeroPatronal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.numeropatronal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaNumeroPatronalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebNumeroPatronal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroPatronal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroPatronal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.numeropatronalLogic.getConnexion());

				if(this.numeropatronal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.numeropatronal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.numeropatronal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_provinciaNumeroPatronalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprovincia=true;

			idTienePermisoprovincia=this.tienePermisosUsuarioEnPaginaWebNumeroPatronal(ProvinciaConstantesFunciones.CLASSNAME);

			if(idTienePermisoprovincia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroPatronal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroPatronal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.provinciaBeanSwingJInternalFrame=new ProvinciaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.provinciaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.provinciaBeanSwingJInternalFrame.getProvinciaLogic().setConnexion(this.numeropatronalLogic.getConnexion());

				if(this.numeropatronal.getid_provincia()!=null) {
					this.provinciaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.provinciaBeanSwingJInternalFrame.setIdActual(this.numeropatronal.getid_provincia());
					this.provinciaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.provinciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProvincia();
				}

				JInternalFrameBase jinternalFrame =this.provinciaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
				TitledBorder titledBorderprovincia=(TitledBorder)this.provinciaBeanSwingJInternalFrame.jScrollPanelDatosProvincia.getBorder();

				titledBorderprovincia.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Provincia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_provinciaNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getid_provincia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_provincia = "+this.numeropatronal.getid_provincia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cantonNumeroPatronalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocanton=true;

			idTienePermisocanton=this.tienePermisosUsuarioEnPaginaWebNumeroPatronal(CantonConstantesFunciones.CLASSNAME);

			if(idTienePermisocanton) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroPatronal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroPatronal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.cantonBeanSwingJInternalFrame=new CantonBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cantonBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cantonBeanSwingJInternalFrame.getCantonLogic().setConnexion(this.numeropatronalLogic.getConnexion());

				if(this.numeropatronal.getid_canton()!=null) {
					this.cantonBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cantonBeanSwingJInternalFrame.setIdActual(this.numeropatronal.getid_canton());
					this.cantonBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cantonBeanSwingJInternalFrame.inicializarActualizarBindingTablaCanton();
				}

				JInternalFrameBase jinternalFrame =this.cantonBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
				TitledBorder titledBordercanton=(TitledBorder)this.cantonBeanSwingJInternalFrame.jScrollPanelDatosCanton.getBorder();

				titledBordercanton.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Canton");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cantonNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getid_canton()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_canton = "+this.numeropatronal.getid_canton().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_parroquiaNumeroPatronalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoparroquia=true;

			idTienePermisoparroquia=this.tienePermisosUsuarioEnPaginaWebNumeroPatronal(ParroquiaConstantesFunciones.CLASSNAME);

			if(idTienePermisoparroquia) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosNumeroPatronal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosNumeroPatronal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);

				this.parroquiaBeanSwingJInternalFrame=new ParroquiaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.parroquiaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.parroquiaBeanSwingJInternalFrame.getParroquiaLogic().setConnexion(this.numeropatronalLogic.getConnexion());

				if(this.numeropatronal.getid_parroquia()!=null) {
					this.parroquiaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.parroquiaBeanSwingJInternalFrame.setIdActual(this.numeropatronal.getid_parroquia());
					this.parroquiaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.parroquiaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.parroquiaBeanSwingJInternalFrame.inicializarActualizarBindingTablaParroquia();
				}

				JInternalFrameBase jinternalFrame =this.parroquiaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderNumeroPatronal=(TitledBorder)this.jScrollPanelDatosNumeroPatronal.getBorder();
				TitledBorder titledBorderparroquia=(TitledBorder)this.parroquiaBeanSwingJInternalFrame.jScrollPanelDatosParroquia.getBorder();

				titledBorderparroquia.setTitle(titledBorderNumeroPatronal.getTitle() + " -> Parroquia");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_parroquiaNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getid_parroquia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_parroquia = "+this.numeropatronal.getid_parroquia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.numeropatronal.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_actividadNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getcodigo_actividad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_actividad like '%"+this.numeropatronal.getcodigo_actividad()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.numeropatronal.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.numeropatronal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncedulaNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getcedula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cedula like '%"+this.numeropatronal.getcedula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.numeropatronal.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionNumeroPatronalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.getnumeropatronal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.numeropatronal==null) {
						this.numeropatronal = new NumeroPatronal();
					}

					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);
				}

				if(this.numeropatronal.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.numeropatronal.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingNumeroPatronal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCantonNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroPatronal(false,false);

			this.getNumeroPatronalsFK_IdCanton();

			this.inicializarActualizarBindingNumeroPatronal(false);

			//if(NumeroPatronalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroPatronal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroPatronal(false,false);

			this.getNumeroPatronalsFK_IdEmpresa();

			this.inicializarActualizarBindingNumeroPatronal(false);

			//if(NumeroPatronalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroPatronal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdParroquiaNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroPatronal(false,false);

			this.getNumeroPatronalsFK_IdParroquia();

			this.inicializarActualizarBindingNumeroPatronal(false);

			//if(NumeroPatronalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroPatronal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProvinciaNumeroPatronalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingNumeroPatronal(false,false);

			this.getNumeroPatronalsFK_IdProvincia();

			this.inicializarActualizarBindingNumeroPatronal(false);

			//if(NumeroPatronalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingNumeroPatronal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.numeropatronalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameNumeroPatronal() {
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
		

		if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
			this.jInternalFrameDetalleFormNumeroPatronal.setVisible(false);	    			
			this.jInternalFrameDetalleFormNumeroPatronal.dispose();
			this.jInternalFrameDetalleFormNumeroPatronal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
			this.jInternalFrameReporteDinamicoNumeroPatronal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoNumeroPatronal.dispose();
			this.jInternalFrameReporteDinamicoNumeroPatronal=null;
		}
		
		if(this.jInternalFrameImportacionNumeroPatronal!=null) {
			this.jInternalFrameImportacionNumeroPatronal.setVisible(false);	    			
			this.jInternalFrameImportacionNumeroPatronal.dispose();
			this.jInternalFrameImportacionNumeroPatronal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessNumeroPatronal();
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			
			if(sTipo.equals("NuevoNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarNumeroPatronal")) {
				jButtonDuplicarNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarNumeroPatronal")) {
				jButtonCopiarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("VerFormNumeroPatronal")) {
				jButtonVerFormNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarNumeroPatronal")) {
				jButtonDuplicarNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarNumeroPatronal")) {
				jButtonDuplicarNumeroPatronalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarNumeroPatronal")) {
				jButtonModificarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarNumeroPatronal")) {
				jButtonModificarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarNumeroPatronal")) {
				jButtonModificarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarNumeroPatronal")) {
				jButtonActualizarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarNumeroPatronal")) {
				jButtonActualizarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarNumeroPatronal")) {
				jButtonActualizarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("EliminarNumeroPatronal")) {
				jButtonEliminarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarNumeroPatronal")) {
				jButtonEliminarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarNumeroPatronal")) {
				jButtonEliminarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("CancelarNumeroPatronal")) {
				jButtonCancelarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarNumeroPatronal")) {
				jButtonCancelarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarNumeroPatronal")) {
				jButtonCancelarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("CerrarNumeroPatronal")) {
				jButtonCerrarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarNumeroPatronal")) {
				jButtonCerrarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarNumeroPatronal")) {
				jButtonCerrarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarNumeroPatronal")) {
				jButtonMostrarOcultarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarNumeroPatronal")) {
				jButtonCancelarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarNumeroPatronal")) {
				jButtonCopiarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarNumeroPatronal")) {
				jButtonVerFormNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarNumeroPatronal")) {
				jButtonCopiarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormNumeroPatronal")) {
				jButtonVerFormNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionNumeroPatronal")) {
				jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarNumeroPatronal")) {
				jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionNumeroPatronal")) {
				jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresNumeroPatronal")) {
				jButtonAnterioresNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarNumeroPatronal")) {
				jButtonAnterioresNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreNumeroPatronal")) {
				jButtonAnterioresNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesNumeroPatronal")) {
				jButtonSiguientesNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarNumeroPatronal")) {
				jButtonSiguientesNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesNumeroPatronal")) {
				jButtonSiguientesNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByNumeroPatronal") || sTipo.equals("MenuItemDetalleAbrirOrderByNumeroPatronal")) {
				jButtonAbrirOrderByNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarNumeroPatronal") || sTipo.equals("MenuItemDetalleMostrarOcultarNumeroPatronal")) {
				jButtonMostrarOcultarNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosNumeroPatronal")) {
				jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarNumeroPatronal")) {
				jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosNumeroPatronal")) {
				jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoNumeroPatronal")) {
				jButtonCerrarReporteDinamicoNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoNumeroPatronal")) {
				jButtonGenerarReporteDinamicoNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoNumeroPatronal")) {
				
				jButtonGenerarExcelReporteDinamicoNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionNumeroPatronal")) {
				jButtonCerrarImportacionNumeroPatronalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionNumeroPatronal")) {
				
				jButtonGenerarImportacionNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionNumeroPatronal")) {
				
				jButtonAbrirImportacionNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesNumeroPatronal")) {
				jComboBoxTiposAccionesNumeroPatronalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesNumeroPatronal")) {
				jComboBoxTiposRelacionesNumeroPatronalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioNumeroPatronal")) {
				jComboBoxTiposAccionesNumeroPatronalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarNumeroPatronal")) {
				
				jComboBoxTiposSeleccionarNumeroPatronalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralNumeroPatronal")) {
				jTextFieldValorCampoGeneralNumeroPatronalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByNumeroPatronal")) {
				jButtonAbrirOrderByNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarNumeroPatronal")) {
				jButtonAbrirOrderByNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByNumeroPatronal")) {
				jButtonCerrarOrderByNumeroPatronalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNumeroPatronalBusqueda")) {
				this.jButtonidNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNumeroPatronalUpdate")) {
				this.jButtonid_empresaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNumeroPatronalBusqueda")) {
				this.jButtonid_empresaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaNumeroPatronalUpdate")) {
				this.jButtonid_provinciaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaNumeroPatronalBusqueda")) {
				this.jButtonid_provinciaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonNumeroPatronalUpdate")) {
				this.jButtonid_cantonNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonNumeroPatronalBusqueda")) {
				this.jButtonid_cantonNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parroquiaNumeroPatronalUpdate")) {
				this.jButtonid_parroquiaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parroquiaNumeroPatronalBusqueda")) {
				this.jButtonid_parroquiaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroNumeroPatronalBusqueda")) {
				this.jButtonnumeroNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_actividadNumeroPatronalBusqueda")) {
				this.jButtoncodigo_actividadNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoNumeroPatronalBusqueda")) {
				this.jButtonapellidoNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNumeroPatronalBusqueda")) {
				this.jButtonnombreNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaNumeroPatronalBusqueda")) {
				this.jButtoncedulaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoNumeroPatronalBusqueda")) {
				this.jButtontelefonoNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNumeroPatronalBusqueda")) {
				this.jButtondescripcionNumeroPatronalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCantonNumeroPatronal")) {
				this.jButtonFK_IdCantonNumeroPatronalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdParroquiaNumeroPatronal")) {
				this.jButtonFK_IdParroquiaNumeroPatronalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdProvinciaNumeroPatronal")) {
				this.jButtonFK_IdProvinciaNumeroPatronalActionPerformed(evt);
			}
			
			;
			
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessNumeroPatronal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			NumeroPatronal numeropatronalLocal=null;
			
			if(!this.getEsControlTabla()) {
				numeropatronalLocal=this.numeropatronal;
			} else {
				numeropatronalLocal=this.numeropatronalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
							
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
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
			
			


			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
								
						
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
								
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
							
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
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
			
			


			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
								
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosNumeroPatronal")) {
					jCheckBoxSeleccionarTodosNumeroPatronalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosNumeroPatronal")) {
					jCheckBoxSeleccionadosNumeroPatronalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarNumeroPatronal")) {
					
				}
				
				


				
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
												
				
				


				
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
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
			
			


			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaNumeroPatronalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.numeropatronal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.numeropatronal);
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
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
				
				


				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(NumeroPatronal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",NumeroPatronal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaNumeroPatronalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.numeropatronalAnterior =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarNumeroPatronal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosNumeroPatronalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosNumeroPatronal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.numeropatronal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.numeropatronal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.numeropatronal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarNumeroPatronal")) {
				
				}
				
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarNumeroPatronal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosNumeroPatronal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarNumeroPatronal")) {
			
			}
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessNumeroPatronal();
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			if(sTipo.equals("NuevoNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarNumeroPatronal")) {
				jButtonDuplicarNumeroPatronalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarNumeroPatronal")) {
				jButtonCopiarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormNumeroPatronal")) {
				jButtonVerFormNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesNumeroPatronal")) {
				jButtonNuevoNumeroPatronalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarNumeroPatronal")) {
				jButtonModificarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarNumeroPatronal")) {
				jButtonActualizarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarNumeroPatronal")) {
				jButtonEliminarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarNumeroPatronal")) {
				jButtonCancelarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarNumeroPatronal")) {
				jButtonCerrarNumeroPatronalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosNumeroPatronal")) {
				jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosNumeroPatronal")) {
				jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByNumeroPatronal")) {
				jButtonAbrirOrderByNumeroPatronalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionNumeroPatronal")) {
				jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresNumeroPatronal")) {
				jButtonAnterioresNumeroPatronalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesNumeroPatronal")) {
				jButtonSiguientesNumeroPatronalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idNumeroPatronalBusqueda")) {
				this.jButtonidNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaNumeroPatronalUpdate")) {
				this.jButtonid_empresaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaNumeroPatronalBusqueda")) {
				this.jButtonid_empresaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_provinciaNumeroPatronalUpdate")) {
				this.jButtonid_provinciaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_provinciaNumeroPatronalBusqueda")) {
				this.jButtonid_provinciaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cantonNumeroPatronalUpdate")) {
				this.jButtonid_cantonNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cantonNumeroPatronalBusqueda")) {
				this.jButtonid_cantonNumeroPatronalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_parroquiaNumeroPatronalUpdate")) {
				this.jButtonid_parroquiaNumeroPatronalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_parroquiaNumeroPatronalBusqueda")) {
				this.jButtonid_parroquiaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroNumeroPatronalBusqueda")) {
				this.jButtonnumeroNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_actividadNumeroPatronalBusqueda")) {
				this.jButtoncodigo_actividadNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoNumeroPatronalBusqueda")) {
				this.jButtonapellidoNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreNumeroPatronalBusqueda")) {
				this.jButtonnombreNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cedulaNumeroPatronalBusqueda")) {
				this.jButtoncedulaNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoNumeroPatronalBusqueda")) {
				this.jButtontelefonoNumeroPatronalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionNumeroPatronalBusqueda")) {
				this.jButtondescripcionNumeroPatronalBusquedaActionPerformed(evt);
			}
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessNumeroPatronal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameNumeroPatronal")) {
				closingInternalFrameNumeroPatronal();
				
			} else if(sTipo.equals("jButtonCancelarNumeroPatronal")) {
				JInternalFrameBase jInternalFrameDetalleFormNumeroPatronal = (JInternalFrameBase)evt.getSource();
	            	
	            NumeroPatronalBeanSwingJInternalFrame jInternalFrameParent=(NumeroPatronalBeanSwingJInternalFrame)jInternalFrameDetalleFormNumeroPatronal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarNumeroPatronalActionPerformed(null);
			}
			
			NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.numeropatronal,new Object(),this.numeropatronalParameterGeneral,this.numeropatronalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormNumeroPatronal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormNumeroPatronal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormNumeroPatronal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.numeropatronal)) {
			if(!esControlTabla) {
				if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);			
				}
				
				if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualNumeroPatronal(this.numeropatronal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.numeropatronalReturnGeneral=numeropatronalLogic.procesarEventosNumeroPatronalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numeropatronalLogic.getNumeroPatronals(),this.numeropatronal,this.numeropatronalParameterGeneral,this.isEsNuevoNumeroPatronal,classes);//this.numeropatronalLogic.getNumeroPatronal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanNumeroPatronal(this.numeropatronalReturnGeneral,this.numeropatronalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanNumeroPatronal(classes,this.numeropatronalReturnGeneral,this.numeropatronalBean,false);
					}
						
					if(this.numeropatronalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal());	
					}
						
					if(this.numeropatronalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal(),classes);//this.numeropatronalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioNumeroPatronal(this.numeropatronal,classes);//this.numeropatronalBean);									
				}
			
				if(NumeroPatronalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualNumeroPatronal(this.numeropatronal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysNumeroPatronal(this.numeropatronal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.numeropatronalAnterior!=null) {
						this.numeropatronal=this.numeropatronalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.numeropatronalReturnGeneral=numeropatronalLogic.procesarEventosNumeroPatronalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numeropatronalLogic.getNumeroPatronals(),this.numeropatronal,this.numeropatronalParameterGeneral,this.isEsNuevoNumeroPatronal,classes);//this.numeropatronalLogic.getNumeroPatronal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.numeropatronalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.numeropatronalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.numeropatronalReturnGeneral.getNumeroPatronal(),numeropatronalLogic.getNumeroPatronals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.numeropatronalReturnGeneral.getNumeroPatronal(),this.numeropatronals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosNumeroPatronal.repaint();
				
				//((AbstractTableModel) this.jTableDatosNumeroPatronal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosNumeroPatronal();
			}
		}
	}
	
	public void actualizarVisualTableDatosNumeroPatronal() throws Exception {
		
		NumeroPatronalModel numeropatronalModel=(NumeroPatronalModel)this.jTableDatosNumeroPatronal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			numeropatronalModel.numeropatronals=this.numeropatronalLogic.getNumeroPatronals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			numeropatronalModel.numeropatronals=this.numeropatronals;
		}
		
		
		((NumeroPatronalModel) this.jTableDatosNumeroPatronal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaNumeroPatronal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getnumeropatronalAnterior(),this.numeropatronalLogic.getNumeroPatronals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getnumeropatronalAnterior(),this.numeropatronals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosNumeroPatronal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioNumeroPatronal(NumeroPatronal numeropatronal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(numeropatronal.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(numeropatronal.getEstructuras());
					this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(numeropatronal.getCargos());
					this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
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
										
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numeropatronal,new Object(),generalEntityParameterGeneral,this.numeropatronalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.numeropatronalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=NumeroPatronalConstantesFunciones.getClassesRelationshipsOfNumeroPatronal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=NumeroPatronalConstantesFunciones.getClassesRelationshipsFromStringsOfNumeroPatronal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormNumeroPatronal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				NumeroPatronalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.numeropatronal,new Object(),generalEntityParameterGeneral,this.numeropatronalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioNumeroPatronal(NumeroPatronalBean numeropatronalBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(numeropatronal.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.setEstructuras(numeropatronal.getEstructuras());
					this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.setCargos(numeropatronal.getCargos());
					this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCargo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanNumeroPatronal(ArrayList<Classe> classes,NumeroPatronalReturnGeneral numeropatronalReturnGeneral,NumeroPatronalBean numeropatronalBean,Boolean conDefault) throws Exception {
		
			this.numeropatronalBean.setDatoGeneralEmpleados(numeropatronalReturnGeneral.getNumeroPatronal().getDatoGeneralEmpleados());
			this.numeropatronalBean.setEstructuras(numeropatronalReturnGeneral.getNumeroPatronal().getEstructuras());
			this.numeropatronalBean.setCargos(numeropatronalReturnGeneral.getNumeroPatronal().getCargos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualNumeroPatronal(NumeroPatronal numeropatronal,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					numeropatronal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Estructura.class)) {
					numeropatronal.setEstructuras(this.jInternalFrameDetalleFormNumeroPatronal.estructuraBeanSwingJInternalFrame.estructuraLogic.getEstructuras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Cargo.class)) {
					numeropatronal.setCargos(this.jInternalFrameDetalleFormNumeroPatronal.cargoBeanSwingJInternalFrame.cargoLogic.getCargos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.numeropatronal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormNumeroPatronal = new NumeroPatronalDetalleFormJInternalFrame(jDesktopPane,this.numeropatronalSessionBean.getConGuardarRelaciones(),this.numeropatronalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.setVisible(false);
		this.jInternalFrameDetalleFormNumeroPatronal.setSelected(false);						
		
		this.jInternalFrameDetalleFormNumeroPatronal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormNumeroPatronal.numeropatronalLogic=this.numeropatronalLogic;
		
		this.cargarCombosFrameForeignKeyNumeroPatronal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleNumeroPatronal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleNumeroPatronal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyNumeroPatronal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyNumeroPatronal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormNumeroPatronal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNumeroPatronal"));
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ModificarNumeroPatronal"));

		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ModificarToolBarNumeroPatronal"));
					
		this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemModificarNumeroPatronal.addActionListener(new ButtonActionListener(this,"MenuItemModificarNumeroPatronal"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.addActionListener (new ButtonActionListener(this,"ActualizarNumeroPatronal"));
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNumeroPatronal"));
						
		this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemActualizarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNumeroPatronal"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.addActionListener (new ButtonActionListener(this,"EliminarNumeroPatronal"));
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"EliminarToolBarNumeroPatronal"));
								
		this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemEliminarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNumeroPatronal"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CancelarNumeroPatronal"));
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CancelarToolBarNumeroPatronal"));
					
		this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemCancelarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNumeroPatronal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemDetalleCerrarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNumeroPatronal"));		
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroPatronal"));
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroPatronal"));
		
		
		
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNumeroPatronal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonidNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnumeroNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"numeroNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncodigo_actividadNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"codigo_actividadNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonapellidoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"apellidoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnombreNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"nombreNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncedulaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"cedulaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtontelefonoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtondescripcionNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNumeroPatronalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNumeroPatronal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameNumeroPatronal"));
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarNumeroPatronal"));
		}
		
		this.jTableDatosNumeroPatronal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarNumeroPatronal"));
		
		this.jTableDatosNumeroPatronal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarNumeroPatronal"));
		
		this.jButtonNuevoNumeroPatronal.addActionListener(new ButtonActionListener(this,"NuevoNumeroPatronal"));
		
		this.jButtonDuplicarNumeroPatronal.addActionListener(new ButtonActionListener(this,"DuplicarNumeroPatronal"));
		
		this.jButtonCopiarNumeroPatronal.addActionListener(new ButtonActionListener(this,"CopiarNumeroPatronal"));
		
		this.jButtonVerFormNumeroPatronal.addActionListener(new ButtonActionListener(this,"VerFormNumeroPatronal"));
		
		
		this.jButtonNuevoToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"NuevoToolBarNumeroPatronal"));
			
		this.jButtonDuplicarToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarNumeroPatronal"));
			
		this.jMenuItemNuevoNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoNumeroPatronal"));
			
		this.jMenuItemDuplicarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarNumeroPatronal"));		
		
		
		this.jButtonNuevoRelacionesNumeroPatronal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesNumeroPatronal"));
		
		
		this.jButtonNuevoRelacionesToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarNumeroPatronal"));
			
		this.jMenuItemNuevoRelacionesNumeroPatronal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesNumeroPatronal"));		
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ModificarNumeroPatronal"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonModificarToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ModificarToolBarNumeroPatronal"));
			
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemModificarNumeroPatronal.addActionListener(new ButtonActionListener(this,"MenuItemModificarNumeroPatronal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarNumeroPatronal.addActionListener (new ButtonActionListener(this,"ActualizarNumeroPatronal"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonActualizarToolBarNumeroPatronal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarNumeroPatronal"));
				
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemActualizarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarNumeroPatronal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarNumeroPatronal.addActionListener (new ButtonActionListener(this,"EliminarNumeroPatronal"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonEliminarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"EliminarToolBarNumeroPatronal"));
						
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemEliminarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarNumeroPatronal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CancelarNumeroPatronal"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonCancelarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CancelarToolBarNumeroPatronal"));
			
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemCancelarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarNumeroPatronal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarNumeroPatronal"));		
		
		
		this.jButtonCerrarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CerrarNumeroPatronal"));
		
		
		this.jButtonCerrarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CerrarToolBarNumeroPatronal"));
			
		this.jMenuItemCerrarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarNumeroPatronal"));
			
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jMenuItemDetalleCerrarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarNumeroPatronal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosNumeroPatronal"));
		}
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarNumeroPatronal"));
		}
		
		this.jButtonCopiarToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"CopiarToolBarNumeroPatronal"));
			
		this.jButtonVerFormToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"VerFormToolBarNumeroPatronal"));
		
		this.jMenuItemGuardarCambiosNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosNumeroPatronal"));
			
		this.jMenuItemCopiarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarNumeroPatronal"));		
		
		this.jMenuItemVerFormNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormNumeroPatronal"));		
		
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNumeroPatronal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarNumeroPatronal"));
			
		this.jMenuItemGuardarCambiosTablaNumeroPatronal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaNumeroPatronal"));		
		
		
		
		this.jButtonRecargarInformacionNumeroPatronal.addActionListener (new ButtonActionListener(this,"RecargarInformacionNumeroPatronal"));
					
		this.jButtonRecargarInformacionToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarNumeroPatronal"));
		
		this.jMenuItemRecargarInformacionNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionNumeroPatronal"));		
		
		
		
		this.jButtonAnterioresNumeroPatronal.addActionListener (new ButtonActionListener(this,"AnterioresNumeroPatronal"));
		
		
		this.jButtonAnterioresToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarNumeroPatronal"));
		
		this.jMenuItemAnterioresNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresNumeroPatronal"));		
		
		
		this.jButtonSiguientesNumeroPatronal.addActionListener (new ButtonActionListener(this,"SiguientesNumeroPatronal"));
		
		
		this.jButtonSiguientesToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarNumeroPatronal"));
			
		this.jMenuItemSiguientesNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesNumeroPatronal"));
			
		this.jMenuItemAbrirOrderByNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByNumeroPatronal"));
			
		this.jMenuItemMostrarOcultarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarNumeroPatronal"));
			
		this.jMenuItemDetalleAbrirOrderByNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByNumeroPatronal"));
			
		this.jMenuItemDetalleMostarOcultarNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarNumeroPatronal"));		
		
		
		this.jButtonNuevoGuardarCambiosNumeroPatronal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosNumeroPatronal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarNumeroPatronal"));
			
		this.jMenuItemNuevoGuardarCambiosNumeroPatronal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosNumeroPatronal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosNumeroPatronal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosNumeroPatronal"));

		this.jCheckBoxSeleccionadosNumeroPatronal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosNumeroPatronal"));
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioNumeroPatronal"));
		}
		
		
		this.jComboBoxTiposRelacionesNumeroPatronal.addActionListener (new ButtonActionListener(this,"TiposRelacionesNumeroPatronal"));
			
		this.jComboBoxTiposAccionesNumeroPatronal.addActionListener (new ButtonActionListener(this,"TiposAccionesNumeroPatronal"));
					
		this.jComboBoxTiposSeleccionarNumeroPatronal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarNumeroPatronal"));
			
		this.jTextFieldValorCampoGeneralNumeroPatronal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralNumeroPatronal"));		
		
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonidNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnumeroNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"numeroNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncodigo_actividadNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"codigo_actividadNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonapellidoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"apellidoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnombreNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"nombreNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncedulaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"cedulaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtontelefonoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtondescripcionNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNumeroPatronalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCantonNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdCantonNumeroPatronal"));

			this.jButtonFK_IdParroquiaNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdParroquiaNumeroPatronal"));

			this.jButtonFK_IdProvinciaNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaNumeroPatronal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoNumeroPatronal!=null) {
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroPatronal"));
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroPatronal"));
				this.jInternalFrameReporteDinamicoNumeroPatronal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroPatronal"));
			}
			
			//this.jButtonCerrarReporteDinamicoNumeroPatronal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoNumeroPatronal"));				
			//this.jButtonGenerarReporteDinamicoNumeroPatronal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoNumeroPatronal"));
			//this.jButtonGenerarExcelReporteDinamicoNumeroPatronal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoNumeroPatronal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionNumeroPatronal!=null) {
				this.jInternalFrameImportacionNumeroPatronal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionNumeroPatronal"));
				this.jInternalFrameImportacionNumeroPatronal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionNumeroPatronal"));
				this.jInternalFrameImportacionNumeroPatronal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionNumeroPatronal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByNumeroPatronal.addActionListener (new ButtonActionListener(this,"AbrirOrderByNumeroPatronal"));
			
			this.jButtonAbrirOrderByToolBarNumeroPatronal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarNumeroPatronal"));			
			
			if(this.jInternalFrameOrderByNumeroPatronal!=null) {
				this.jInternalFrameOrderByNumeroPatronal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByNumeroPatronal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormNumeroPatronal.jTabbedPaneRelacionesNumeroPatronal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesNumeroPatronal"));
		
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
            		closingInternalFrameNumeroPatronal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormNumeroPatronal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormNumeroPatronal = (JInternalFrameBase)event.getSource();
	            	
	            NumeroPatronalBeanSwingJInternalFrame jInternalFrameParent=(NumeroPatronalBeanSwingJInternalFrame)jInternalFrameDetalleFormNumeroPatronal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarNumeroPatronalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosNumeroPatronal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosNumeroPatronalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosNumeroPatronal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosNumeroPatronal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoNumeroPatronal";
		inputMap = this.jButtonNuevoNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNumeroPatronalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoNumeroPatronalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesNumeroPatronal";
		inputMap = this.jButtonNuevoRelacionesNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoNumeroPatronalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarNumeroPatronal";
		inputMap = this.jButtonModificarNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarNumeroPatronal";
		inputMap = this.jButtonActualizarNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarNumeroPatronal";
		inputMap = this.jButtonEliminarNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarNumeroPatronal";
		inputMap = this.jButtonCancelarNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarNumeroPatronal";
		inputMap = this.jButtonCerrarNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosNumeroPatronal";
		inputMap = this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonGuardarCambiosNumeroPatronal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosNumeroPatronalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosNumeroPatronal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosNumeroPatronalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesNumeroPatronal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesNumeroPatronalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarNumeroPatronal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarNumeroPatronalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralNumeroPatronal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralNumeroPatronalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonidNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"idNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_empresaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_provinciaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_provinciaNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_cantonNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_cantonNumeroPatronalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalUpdate.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonid_parroquiaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"id_parroquiaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnumeroNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"numeroNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncodigo_actividadNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"codigo_actividadNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonapellidoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"apellidoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtonnombreNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"nombreNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtoncedulaNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"cedulaNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtontelefonoNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"telefonoNumeroPatronalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormNumeroPatronal.jButtondescripcionNumeroPatronalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionNumeroPatronalBusqueda"));
		
		
		this.jButtonFK_IdCantonNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdCantonNumeroPatronal"));

		this.jButtonFK_IdParroquiaNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdParroquiaNumeroPatronal"));

		this.jButtonFK_IdProvinciaNumeroPatronal.addActionListener(new ButtonActionListener(this,"FK_IdProvinciaNumeroPatronal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionNumeroPatronal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionNumeroPatronalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarNumeroPatronalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarNumeroPatronal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosNumeroPatronal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
					numeropatronalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroPatronal numeropatronalAux:numeropatronals) {
					numeropatronalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosNumeroPatronalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
						numeropatronalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroPatronal numeropatronalAux:numeropatronals) {
						numeropatronalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroPatronal numeropatronalAux:numeropatronals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNumeroPatronal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNumeroPatronal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosNumeroPatronalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosNumeroPatronal.getSelectedRows();
			
			NumeroPatronal numeropatronalLocal=new NumeroPatronal();
			
			//this.seleccionarTodosNumeroPatronal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					numeropatronalLocal =(NumeroPatronal) this.numeropatronalLogic.getNumeroPatronals().toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					numeropatronalLocal =(NumeroPatronal) this.numeropatronals.toArray()[this.jTableDatosNumeroPatronal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				numeropatronalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
						numeropatronalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(NumeroPatronal numeropatronalAux:numeropatronals) {
						numeropatronalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosNumeroPatronal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosNumeroPatronal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosNumeroPatronal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualNumeroPatronalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarNumeroPatronalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralNumeroPatronalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralNumeroPatronal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(NumeroPatronal numeropatronalAux:this.numeropatronalLogic.getNumeroPatronals()) {
				
						if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							numeropatronalAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD)) {
							existe=true;
							numeropatronalAux.setcodigo_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							numeropatronalAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							numeropatronalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							numeropatronalAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							numeropatronalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							numeropatronalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroPatronal numeropatronalAux:numeropatronals) {
					
						if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							numeropatronalAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD)) {
							existe=true;
							numeropatronalAux.setcodigo_actividad(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							numeropatronalAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							numeropatronalAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CEDULA)) {
							existe=true;
							numeropatronalAux.setcedula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							numeropatronalAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							numeropatronalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaNumeroPatronal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesNumeroPatronalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioNumeroPatronal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesNumeroPatronal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteNumeroPatronal) {				
					conSplash=true;//false;										
					
					//this.startProcessNumeroPatronal(conSplash);
				
					this.generarReporteNumeroPatronalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoNumeroPatronalsSeleccionados();
				//this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNumeroPatronalsSeleccionados(false);
				//this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoNumeroPatronalsSeleccionados(true);
				//this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNumeroPatronal();
				
				this.exportarNumeroPatronalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionNumeroPatronals();
				//this.importarNumeroPatronals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessNumeroPatronal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelNumeroPatronalsSeleccionados();
				//this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Numero Patronal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessNumeroPatronal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoNumeroPatronal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyNumeroPatronal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
				}	
			} 			
			else if(NumeroPatronalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteNumeroPatronal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessNumeroPatronal(conSplash);
					
						//this.actualizarParametrosGeneralNumeroPatronal();
						
						this.generarReporteProcesoAccionNumeroPatronalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(NumeroPatronalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Numero PatronalES SELECCIONADOS?", "MANTENIMIENTO DE Numero Patronal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessNumeroPatronal();
				
						this.actualizarParametrosGeneralNumeroPatronal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.numeropatronalReturnGeneral=numeropatronalLogic.procesarAccionNumeroPatronalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.numeropatronalLogic.getNumeroPatronals(),this.numeropatronalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarNumeroPatronalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralNumeroPatronal();
					
					NumeroPatronalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarNumeroPatronalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesNumeroPatronal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxTiposAccionesFormularioNumeroPatronal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessNumeroPatronal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesNumeroPatronalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessNumeroPatronal();
			
			if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
			NumeroPatronal numeropatronal=new NumeroPatronal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingNumeroPatronal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesNumeroPatronal.getSelectedItem();
			
			
			
			
			numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(numeropatronalsSeleccionados.size()==1) {
				for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
					numeropatronal=numeropatronalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,numeropatronal);
				}
				else if(this.sTipoRelacion.equals("Estructura")) {
					jButtonEstructuraActionPerformed(null,rowIndex,true,false,numeropatronal);
				}
				else if(this.sTipoRelacion.equals("Cargo")) {
					jButtonCargoActionPerformed(null,rowIndex,true,false,numeropatronal);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessNumeroPatronal();
			
      		//this.finishProcessNumeroPatronal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarNumeroPatronalReturnGeneral() throws Exception {
		if(this.numeropatronalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.numeropatronalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.numeropatronalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.numeropatronalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.numeropatronalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.numeropatronalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingNumeroPatronal(false);
		}
		
		if(this.numeropatronalReturnGeneral.getConRetornoLista() || this.numeropatronalReturnGeneral.getConRetornoObjeto()) {
			if(this.numeropatronalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.numeropatronalLogic.setNumeroPatronals(this.numeropatronalReturnGeneral.getNumeroPatronals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.numeropatronalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.numeropatronalLogic.setNumeroPatronal(this.numeropatronalReturnGeneral.getNumeroPatronal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingNumeroPatronal(false);
		}
	}
	
	public void actualizarParametrosGeneralNumeroPatronal() throws Exception {
		
		
	}
	
	public ArrayList<NumeroPatronal> getNumeroPatronalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioNumeroPatronal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(NumeroPatronal numeropatronalAux:numeropatronalLogic.getNumeroPatronals()) {
					if(numeropatronalAux.getIsSelected()) {
						numeropatronalsSeleccionados.add(numeropatronalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(NumeroPatronal numeropatronalAux:this.numeropatronals) {
					if(numeropatronalAux.getIsSelected()) {
						numeropatronalsSeleccionados.add(numeropatronalAux);				
					}
				}
			}
			
			if(numeropatronalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						numeropatronalsSeleccionados.addAll(this.numeropatronalLogic.getNumeroPatronals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						numeropatronalsSeleccionados.addAll(this.numeropatronals);				
					}
				}
			}
		} else {
			numeropatronalsSeleccionados.add(this.numeropatronal);
		}
		
		return numeropatronalsSeleccionados;
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
	
	public void generarReporteNumeroPatronalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalNumeroPatronalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoNumeroPatronalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNumeroPatronalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoNumeroPatronalsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesNumeroPatronalsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Numero Patronal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados);
		
	}	
	
	public void generarReporteNormalNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionNumeroPatronalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoNumeroPatronal();
		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoNumeroPatronal();
		
		
		//this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados ,numeropatronalImplementable,numeropatronalImplementableHome);
	}
	
	public void mostrarImportacionNumeroPatronals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionNumeroPatronal();
		
		this.abrirFrameImportacionNumeroPatronal();		
		
			
		//this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados ,numeropatronalImplementable,numeropatronalImplementableHome);
	}
	
	public void importarNumeroPatronals() throws Exception {		
	
	}
	
	public void exportarNumeroPatronalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelNumeroPatronalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoNumeroPatronalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlNumeroPatronalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Numero Patronal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarNumeroPatronal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarNumeroPatronal(numeropatronalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//numeropatronalAux.setsDetalleGeneralEntityReporte(numeropatronalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarNumeroPatronal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_IDCANTON;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_CEDULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarNumeroPatronal(NumeroPatronal numeropatronal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=numeropatronal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getprovincia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getcanton_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getparroquia_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getcodigo_actividad();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getcedula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=numeropatronal.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("NumeroPatronals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelNumeroPatronal(row);				
				iRow++;
			}				
			
			for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelNumeroPatronal(numeropatronalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlNumeroPatronalsSeleccionados() throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();		
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"numeropatronal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("numeropatronals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("numeropatronal");
			//elementRoot.appendChild(element);
		
			for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
				element = document.createElement("numeropatronal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlNumeroPatronal(numeropatronalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Numero Patronal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelNumeroPatronal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDCANTON);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_CEDULA);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelNumeroPatronal(NumeroPatronal numeropatronal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getprovincia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getcanton_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getparroquia_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getcodigo_actividad());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getcedula());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(numeropatronal.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlNumeroPatronal(NumeroPatronal numeropatronal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(NumeroPatronalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(numeropatronal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(NumeroPatronalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(numeropatronal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(NumeroPatronalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(numeropatronal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementprovincia_descripcion = document.createElement(NumeroPatronalConstantesFunciones.IDPROVINCIA);
		elementprovincia_descripcion.appendChild(document.createTextNode(numeropatronal.getprovincia_descripcion()));
		element.appendChild(elementprovincia_descripcion);

		Element elementcanton_descripcion = document.createElement(NumeroPatronalConstantesFunciones.IDCANTON);
		elementcanton_descripcion.appendChild(document.createTextNode(numeropatronal.getcanton_descripcion()));
		element.appendChild(elementcanton_descripcion);

		Element elementparroquia_descripcion = document.createElement(NumeroPatronalConstantesFunciones.IDPARROQUIA);
		elementparroquia_descripcion.appendChild(document.createTextNode(numeropatronal.getparroquia_descripcion()));
		element.appendChild(elementparroquia_descripcion);

		Element elementnumero = document.createElement(NumeroPatronalConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(numeropatronal.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementcodigo_actividad = document.createElement(NumeroPatronalConstantesFunciones.CODIGOACTIVIDAD);
		elementcodigo_actividad.appendChild(document.createTextNode(numeropatronal.getcodigo_actividad().trim()));
		element.appendChild(elementcodigo_actividad);

		Element elementapellido = document.createElement(NumeroPatronalConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(numeropatronal.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre = document.createElement(NumeroPatronalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(numeropatronal.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementcedula = document.createElement(NumeroPatronalConstantesFunciones.CEDULA);
		elementcedula.appendChild(document.createTextNode(numeropatronal.getcedula().trim()));
		element.appendChild(elementcedula);

		Element elementtelefono = document.createElement(NumeroPatronalConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(numeropatronal.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementdescripcion = document.createElement(NumeroPatronalConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(numeropatronal.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoNumeroPatronalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<NumeroPatronal> numeropatronalsSeleccionados=new ArrayList<NumeroPatronal>();
		
		numeropatronalsSeleccionados=this.getNumeroPatronalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoNumeroPatronal(numeropatronalsSeleccionados);
		
		this.generarReporteNumeroPatronals("Todos",numeropatronalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoNumeroPatronal(ArrayList<NumeroPatronal> numeropatronalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(NumeroPatronal numeropatronalAux:numeropatronalsSeleccionados) {
				numeropatronalAux.setsDetalleGeneralEntityReporte(numeropatronalAux.toString());
			
				if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_IDPROVINCIA)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getprovincia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_IDCANTON)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getcanton_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_IDPARROQUIA)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getparroquia_descripcion());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CODIGOACTIVIDAD)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getcodigo_actividad());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_CEDULA)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getcedula());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(NumeroPatronalConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					numeropatronalAux.setsDescripcionGeneralEntityReporte1(numeropatronalAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,NumeroPatronalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesNumeroPatronal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoNumeroPatronal=true;
				this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=true;
				this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=true;
			}
			
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=true;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=true;
			this.isVisibilidadCeldaEliminarNumeroPatronal=true;
			this.isVisibilidadCeldaCancelarNumeroPatronal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=true;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=true;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=true;
			this.isVisibilidadCeldaModificarNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=true;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
			this.isVisibilidadCeldaModificarNumeroPatronal=true;
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
			this.isVisibilidadCeldaCancelarNumeroPatronal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				} else {
					this.isVisibilidadCeldaGuardarNumeroPatronal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(NumeroPatronalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoNumeroPatronal=true;
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=true;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=true;
		} else {
			this.actualizarEstadoPanelsNumeroPatronal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarNumeroPatronal=false;
			//this.isVisibilidadCeldaVerFormNumeroPatronal=false;
			this.isVisibilidadCeldaDuplicarNumeroPatronal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!numeropatronalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
		} else {
			this.isVisibilidadCeldaNuevoNumeroPatronal=false;
			this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(numeropatronalSessionBean.getEsGuardarRelacionado()) {
			if(!numeropatronalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;												
			}
			
			this.jButtonCerrarNumeroPatronal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesNumeroPatronal=false;
		}
		
		if(!this.permiteMantenimiento(this.numeropatronal)) {
			this.isVisibilidadCeldaActualizarNumeroPatronal=false;
			this.isVisibilidadCeldaEliminarNumeroPatronal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesNumeroPatronal() {
		this.isVisibilidadCeldaNuevoNumeroPatronal=false;
		this.isVisibilidadCeldaGuardarCambiosNumeroPatronal=false;
	}
	
	public void actualizarEstadoPanelsNumeroPatronal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionNumeroPatronal!=null) {
				this.jScrollPanelDatosEdicionNumeroPatronal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosNumeroPatronal!=null) {
				this.jScrollPanelDatosNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelPaginacionNumeroPatronal!=null) {
				this.jPanelPaginacionNumeroPatronal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
					this.jTabbedPaneBusquedasNumeroPatronal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.numeropatronalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasNumeroPatronal!=null) {
				this.jTabbedPaneBusquedasNumeroPatronal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesNumeroPatronal!=null) {
				this.jPanelParametrosReportesNumeroPatronal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCanton=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdCantonNumeroPatronal);}

			this.isVisibilidadFK_IdParroquia=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdParroquiaNumeroPatronal);}

			this.isVisibilidadFK_IdProvincia=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdProvinciaNumeroPatronal);}
		}
		
	}

	public void setVisibilidadBusquedasParaProvincia(Boolean isParaProvincia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProvinciaNegation=!isParaProvincia;

			this.isVisibilidadFK_IdCanton=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdCantonNumeroPatronal);}

			this.isVisibilidadFK_IdParroquia=isParaProvinciaNegation;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdParroquiaNumeroPatronal);}

			this.isVisibilidadFK_IdProvincia=isParaProvincia;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdProvinciaNumeroPatronal);}
		}
		
	}

	public void setVisibilidadBusquedasParaCanton(Boolean isParaCanton){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCantonNegation=!isParaCanton;

			this.isVisibilidadFK_IdCanton=isParaCanton;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdCantonNumeroPatronal);}

			this.isVisibilidadFK_IdParroquia=isParaCantonNegation;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdParroquiaNumeroPatronal);}

			this.isVisibilidadFK_IdProvincia=isParaCantonNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdProvinciaNumeroPatronal);}
		}
		
	}

	public void setVisibilidadBusquedasParaParroquia(Boolean isParaParroquia){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaParroquiaNegation=!isParaParroquia;

			this.isVisibilidadFK_IdCanton=isParaParroquiaNegation;
			if(!this.isVisibilidadFK_IdCanton) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdCantonNumeroPatronal);}

			this.isVisibilidadFK_IdParroquia=isParaParroquia;
			if(!this.isVisibilidadFK_IdParroquia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdParroquiaNumeroPatronal);}

			this.isVisibilidadFK_IdProvincia=isParaParroquiaNegation;
			if(!this.isVisibilidadFK_IdProvincia) {this.jTabbedPaneBusquedasNumeroPatronal.remove(jPanelFK_IdProvinciaNumeroPatronal);}
		}
		
	}
	
	

	public String registrarSesionNumeroPatronalParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setsPathNavegacionActual(numeropatronalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(NumeroPatronalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
			this.jInternalFrameDetalleFormNumeroPatronal.datogeneralempleadoSessionBean.setlidNumeroPatronalActual(this.idNumeroPatronalActual);

			numeropatronalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal(true);
			numeropatronalSessionBean.setlIdNumeroPatronalActualForeignKey(this.idNumeroPatronalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNumeroPatronalParaEstructuras() throws Exception {
		Boolean isPaginaPopupEstructura=false;

		try {

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean==null) {
				this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean=new EstructuraSessionBean();
			}

			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setsPathNavegacionActual(numeropatronalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EstructuraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupEstructura=this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEstructura(true);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEstructura(NumeroPatronalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
			this.jInternalFrameDetalleFormNumeroPatronal.estructuraSessionBean.setlidNumeroPatronalActual(this.idNumeroPatronalActual);

			numeropatronalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal(true);
			numeropatronalSessionBean.setlIdNumeroPatronalActualForeignKey(this.idNumeroPatronalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionNumeroPatronalParaCargos() throws Exception {
		Boolean isPaginaPopupCargo=false;

		try {

			if(this.numeropatronalSessionBean==null) {
				this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
			}

			if(this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean==null) {
				this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean=new CargoSessionBean();
			}

			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setsPathNavegacionActual(numeropatronalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CargoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCargo=this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCargo(true);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCargo(NumeroPatronalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setisBusquedaDesdeForeignKeySesionNumeroPatronal(true);
			this.jInternalFrameDetalleFormNumeroPatronal.cargoSessionBean.setlidNumeroPatronalActual(this.idNumeroPatronalActual);

			numeropatronalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyNumeroPatronal(true);
			numeropatronalSessionBean.setlIdNumeroPatronalActualForeignKey(this.idNumeroPatronalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//NumeroPatronalSessionBean numeropatronalSessionBean=new NumeroPatronalSessionBean();
		
		if(this.numeropatronalSessionBean==null) {
			this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
		}
		
		this.numeropatronalSessionBean.setsUltimaBusquedaNumeroPatronal(this.getsAccionBusqueda());
		this.numeropatronalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.numeropatronalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
			numeropatronalSessionBean.setid_canton(this.getid_cantonFK_IdCanton());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			numeropatronalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdParroquia")) {
			numeropatronalSessionBean.setid_parroquia(this.getid_parroquiaFK_IdParroquia());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
			numeropatronalSessionBean.setid_provincia(this.getid_provinciaFK_IdProvincia());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//NumeroPatronalSessionBean numeropatronalSessionBean=new NumeroPatronalSessionBean();
		
		if(this.numeropatronalSessionBean==null) {
			this.numeropatronalSessionBean=new NumeroPatronalSessionBean();
		}
		
		if(this.numeropatronalSessionBean.getsUltimaBusquedaNumeroPatronal()!=null&&!this.numeropatronalSessionBean.getsUltimaBusquedaNumeroPatronal().equals("")) {
			this.setsAccionBusqueda(numeropatronalSessionBean.getsUltimaBusquedaNumeroPatronal());
			this.setiNumeroPaginacion(numeropatronalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(numeropatronalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCanton")) {
				this.setid_cantonFK_IdCanton(numeropatronalSessionBean.getid_canton());
				numeropatronalSessionBean.setid_canton(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(numeropatronalSessionBean.getid_empresa());
				numeropatronalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdParroquia")) {
				this.setid_parroquiaFK_IdParroquia(numeropatronalSessionBean.getid_parroquia());
				numeropatronalSessionBean.setid_parroquia(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProvincia")) {
				this.setid_provinciaFK_IdProvincia(numeropatronalSessionBean.getid_provincia());
				numeropatronalSessionBean.setid_provincia(-1L);
			}
		}
		
		this.numeropatronalSessionBean.setsUltimaBusquedaNumeroPatronal("");
		this.numeropatronalSessionBean.setiNumeroPaginacion(NumeroPatronalConstantesFunciones.INUMEROPAGINACION);
		this.numeropatronalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaNumeroPatronal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioNumeroPatronal() {
		this.updateBorderResaltarBusquedasFormularioNumeroPatronal();
		this.updateVisibilidadBusquedasFormularioNumeroPatronal();
		this.updateHabilitarBusquedasFormularioNumeroPatronal();
	}
	
	public void updateBorderResaltarBusquedasFormularioNumeroPatronal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasNumeroPatronal.getComponents().length>0) {
	

		if(this.numeropatronalConstantesFunciones.resaltarFK_IdCantonNumeroPatronal!=null) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdCantonNumeroPatronal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdCantonNumeroPatronal);
			}
		}

		if(this.numeropatronalConstantesFunciones.resaltarFK_IdParroquiaNumeroPatronal!=null) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdParroquiaNumeroPatronal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdParroquiaNumeroPatronal);
			}
		}

		if(this.numeropatronalConstantesFunciones.resaltarFK_IdProvinciaNumeroPatronal!=null) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdProvinciaNumeroPatronal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdProvinciaNumeroPatronal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioNumeroPatronal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasNumeroPatronal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdCantonNumeroPatronal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.numeropatronalConstantesFunciones.mostrarFK_IdCantonNumeroPatronal);
			if(!this.numeropatronalConstantesFunciones.mostrarFK_IdCantonNumeroPatronal && index>-1) {
				this.jTabbedPaneBusquedasNumeroPatronal.remove(index);
			}

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdParroquiaNumeroPatronal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.numeropatronalConstantesFunciones.mostrarFK_IdParroquiaNumeroPatronal);
			if(!this.numeropatronalConstantesFunciones.mostrarFK_IdParroquiaNumeroPatronal && index>-1) {
				this.jTabbedPaneBusquedasNumeroPatronal.remove(index);
			}

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdProvinciaNumeroPatronal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.numeropatronalConstantesFunciones.mostrarFK_IdProvinciaNumeroPatronal);
			if(!this.numeropatronalConstantesFunciones.mostrarFK_IdProvinciaNumeroPatronal && index>-1) {
				this.jTabbedPaneBusquedasNumeroPatronal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioNumeroPatronal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasNumeroPatronal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdCantonNumeroPatronal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.numeropatronalConstantesFunciones.activarFK_IdCantonNumeroPatronal);
				this.jTabbedPaneBusquedasNumeroPatronal.setEnabledAt(index,this.numeropatronalConstantesFunciones.activarFK_IdCantonNumeroPatronal);
			}

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdParroquiaNumeroPatronal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.numeropatronalConstantesFunciones.activarFK_IdParroquiaNumeroPatronal);
				this.jTabbedPaneBusquedasNumeroPatronal.setEnabledAt(index,this.numeropatronalConstantesFunciones.activarFK_IdParroquiaNumeroPatronal);
			}

			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdProvinciaNumeroPatronal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.numeropatronalConstantesFunciones.activarFK_IdProvinciaNumeroPatronal);
				this.jTabbedPaneBusquedasNumeroPatronal.setEnabledAt(index,this.numeropatronalConstantesFunciones.activarFK_IdProvinciaNumeroPatronal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaNumeroPatronal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCanton")) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdCantonNumeroPatronal);

			this.jTabbedPaneBusquedasNumeroPatronal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);

			this.numeropatronalConstantesFunciones.setResaltarFK_IdCantonNumeroPatronal(resaltar);

			jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdCantonNumeroPatronal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdParroquia")) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdParroquiaNumeroPatronal);

			this.jTabbedPaneBusquedasNumeroPatronal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);

			this.numeropatronalConstantesFunciones.setResaltarFK_IdParroquiaNumeroPatronal(resaltar);

			jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdParroquiaNumeroPatronal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdProvincia")) {
			index= this.jTabbedPaneBusquedasNumeroPatronal.indexOfComponent(this.jPanelFK_IdProvinciaNumeroPatronal);

			this.jTabbedPaneBusquedasNumeroPatronal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasNumeroPatronal.getComponent(index);

			this.numeropatronalConstantesFunciones.setResaltarFK_IdProvinciaNumeroPatronal(resaltar);

			jPanel.setBorder(this.numeropatronalConstantesFunciones.resaltarFK_IdProvinciaNumeroPatronal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarNumeroPatronal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioNumeroPatronal() throws Exception {

		if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioNumeroPatronal();
		this.updateVisibilidadResaltarControlesFormularioNumeroPatronal();
		this.updateHabilitarResaltarControlesFormularioNumeroPatronal();
		
	}
	
	public void updateBorderResaltarControlesFormularioNumeroPatronal() throws Exception {
		if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.numeropatronalConstantesFunciones.resaltaridNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltaridNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarid_empresaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarid_empresaNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarid_provinciaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarid_provinciaNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarid_cantonNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarid_cantonNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarid_parroquiaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarid_parroquiaNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarnumeroNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarnumeroNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarcodigo_actividadNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarcodigo_actividadNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarapellidoNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarapellidoNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarnombreNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarnombreNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltarcedulaNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltarcedulaNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltartelefonoNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltartelefonoNumeroPatronal);}
		if(this.numeropatronalConstantesFunciones.resaltardescripcionNumeroPatronal!=null && this.jInternalFrameDetalleFormNumeroPatronal!=null) {this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setBorder(this.numeropatronalConstantesFunciones.resaltardescripcionNumeroPatronal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioNumeroPatronal() throws Exception {		
		if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
	
		//this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostraridNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelidNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostraridNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_empresaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelid_empresaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_empresaNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_provinciaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelid_provinciaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_provinciaNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_cantonNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelid_cantonNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_cantonNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_parroquiaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelid_parroquiaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarid_parroquiaNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarnumeroNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelnumeroNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarnumeroNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarcodigo_actividadNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelcodigo_actividadNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarcodigo_actividadNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarapellidoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelapellidoNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarapellidoNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarnombreNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelnombreNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarnombreNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarcedulaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPanelcedulaNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrarcedulaNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrartelefonoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPaneltelefonoNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrartelefonoNumeroPatronal);
		//this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrardescripcionNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jPaneldescripcionNumeroPatronal.setVisible(this.numeropatronalConstantesFunciones.mostrardescripcionNumeroPatronal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioNumeroPatronal() throws Exception {
		if(this.jInternalFrameDetalleFormNumeroPatronal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormNumeroPatronal!=null) {
	
		this.jInternalFrameDetalleFormNumeroPatronal.jLabelidNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activaridNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_empresaNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarid_empresaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_provinciaNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarid_provinciaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_cantonNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarid_cantonNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jComboBoxid_parroquiaNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarid_parroquiaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldnumeroNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarnumeroNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcodigo_actividadNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarcodigo_actividadNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreaapellidoNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarapellidoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreanombreNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarnombreNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldcedulaNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activarcedulaNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextFieldtelefonoNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activartelefonoNumeroPatronal);
		this.jInternalFrameDetalleFormNumeroPatronal.jTextAreadescripcionNumeroPatronal.setEnabled(this.numeropatronalConstantesFunciones.activardescripcionNumeroPatronal);
		}
	}
	
		
}