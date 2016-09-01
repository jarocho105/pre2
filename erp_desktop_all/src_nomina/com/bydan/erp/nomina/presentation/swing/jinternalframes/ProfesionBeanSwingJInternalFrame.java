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

import com.bydan.erp.nomina.util.ProfesionConstantesFunciones;
import com.bydan.erp.nomina.util.ProfesionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ProfesionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ProfesionBean;
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

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ProfesionBeanSwingJInternalFrame extends ProfesionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ProfesionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Profesion> profesionValidator = new ClassValidator<Profesion>(Profesion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Profesion profesion;	
	public Profesion profesionAux;
	public Profesion profesionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Profesion profesionTotales;
	public Long idProfesionActual;
	public Long iIdNuevoProfesion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosProfesionEmplea=false;

	public Boolean getIsTienePermisosProfesionEmplea() {
		return isTienePermisosProfesionEmplea;
	}

	public void setIsTienePermisosProfesionEmplea(Boolean isTienePermisosProfesionEmplea) {
		this.isTienePermisosProfesionEmplea= isTienePermisosProfesionEmplea;
	}


	public Boolean isTienePermisosReferencia=false;

	public Boolean getIsTienePermisosReferencia() {
		return isTienePermisosReferencia;
	}

	public void setIsTienePermisosReferencia(Boolean isTienePermisosReferencia) {
		this.isTienePermisosReferencia= isTienePermisosReferencia;
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
	
	public Boolean isPermisoTodoProfesion;
	public Boolean isPermisoNuevoProfesion;
	public Boolean isPermisoActualizarProfesion;
	public Boolean isPermisoActualizarOriginalProfesion;
	public Boolean isPermisoEliminarProfesion;
	public Boolean isPermisoGuardarCambiosProfesion;
	public Boolean isPermisoConsultaProfesion;
	public Boolean isPermisoBusquedaProfesion;
	public Boolean isPermisoReporteProfesion;
	public Boolean isPermisoPaginacionMedioProfesion;
	public Boolean isPermisoPaginacionAltoProfesion;
	public Boolean isPermisoPaginacionTodoProfesion;
	public Boolean isPermisoCopiarProfesion;
	public Boolean isPermisoVerFormProfesion;
	public Boolean isPermisoDuplicarProfesion;
	public Boolean isPermisoOrdenProfesion;
	
	
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
	
	public ProfesionParameterReturnGeneral profesionReturnGeneral;
	public ProfesionParameterReturnGeneral profesionParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public ProfesionEmpleaLogic profesionempleaLogic=null;

	public ProfesionEmpleaLogic getProfesionEmpleaLogic() {
		return profesionempleaLogic;
	}

	public void setProfesionEmpleaLogic(ProfesionEmpleaLogic profesionempleaLogic) {
		this.profesionempleaLogic = profesionempleaLogic;
	}


	public ReferenciaLogic referenciaLogic=null;

	public ReferenciaLogic getReferenciaLogic() {
		return referenciaLogic;
	}

	public void setReferenciaLogic(ReferenciaLogic referenciaLogic) {
		this.referenciaLogic = referenciaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoProfesion=false;
	public Boolean esParaAccionDesdeFormularioProfesion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ProfesionSessionBeanAdditional profesionSessionBeanAdditional=null;
	
	public ProfesionSessionBeanAdditional getProfesionSessionBeanAdditional() {
		return this.profesionSessionBeanAdditional;
	}
	
	public void setProfesionSessionBeanAdditional(ProfesionSessionBeanAdditional profesionSessionBeanAdditional) {
		try {
			this.profesionSessionBeanAdditional=profesionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ProfesionBeanSwingJInternalFrameAdditional profesionBeanSwingJInternalFrameAdditional=null;
	//public class ProfesionBeanSwingJInternalFrame
	
	public ProfesionBeanSwingJInternalFrameAdditional getProfesionBeanSwingJInternalFrameAdditional() {
		return this.profesionBeanSwingJInternalFrameAdditional;
	}
	
	public void setProfesionBeanSwingJInternalFrameAdditional(ProfesionBeanSwingJInternalFrameAdditional profesionBeanSwingJInternalFrameAdditional) {
		try {
			this.profesionBeanSwingJInternalFrameAdditional=profesionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ProfesionLogic profesionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Profesion profesionBean;
	public ProfesionConstantesFunciones profesionConstantesFunciones;
	//public ProfesionParameterReturnGeneral profesionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Profesion> profesions;	
	//public List<Profesion> profesionsEliminados;
	//public List<Profesion> profesionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoProfesion=false;
	public Boolean isVisibilidadCeldaDuplicarProfesion=true;
	public Boolean isVisibilidadCeldaCopiarProfesion=true;
	public Boolean isVisibilidadCeldaVerFormProfesion=true;
	public Boolean isVisibilidadCeldaOrdenProfesion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesProfesion=false;
	public Boolean isVisibilidadCeldaModificarProfesion=false;
	public Boolean isVisibilidadCeldaActualizarProfesion=false;
	public Boolean isVisibilidadCeldaEliminarProfesion=false;
	public Boolean isVisibilidadCeldaCancelarProfesion=false;
	public Boolean isVisibilidadCeldaGuardarProfesion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosProfesion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoProfesion() {
		return this.iIdNuevoProfesion;
	}

	public void setiIdNuevoProfesion(Long iIdNuevoProfesion) {
		this.iIdNuevoProfesion = iIdNuevoProfesion;
	}
	
	public Long getidProfesionActual() {
		return this.idProfesionActual;
	}

	public void setidProfesionActual(Long idProfesionActual) {
		this.idProfesionActual = idProfesionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Profesion getprofesion() {
		return this.profesion;
	}

	public void setprofesion(Profesion profesion) {
		this.profesion = profesion;
	}
	
	public Profesion getprofesionAux() {
		return this.profesionAux;
	}

	public void setprofesionAux(Profesion profesionAux) {
		this.profesionAux = profesionAux;
	}				
	
	public Profesion getprofesionAnterior() {
		return this.profesionAnterior;
	}

	public void setprofesionAnterior(Profesion profesionAnterior) {
		this.profesionAnterior = profesionAnterior;
	}	
	
	public Profesion getprofesionTotales() {
		return this.profesionTotales;
	}

	public void setprofesionTotales(Profesion profesionTotales) {
		this.profesionTotales = profesionTotales;
	}	
	
	public Profesion getprofesionBean() {
		return this.profesionBean;
	}

	public void setprofesionBean(Profesion profesionBean) {
		this.profesionBean = profesionBean;
	}	
	
	public ProfesionParameterReturnGeneral getprofesionReturnGeneral() {
		return this.profesionReturnGeneral;
	}

	public void setprofesionReturnGeneral(ProfesionParameterReturnGeneral profesionReturnGeneral) {
		this.profesionReturnGeneral = profesionReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ProfesionLogic getProfesionLogic()	{		
		return profesionLogic;
	}

	public void setProfesionLogic(ProfesionLogic profesionLogic) {
		this.profesionLogic = profesionLogic;
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
	
	public Boolean getIsEsNuevoProfesion() {
		return isEsNuevoProfesion;
	}

	public void setIsEsNuevoProfesion(Boolean isEsNuevoProfesion) {
		this.isEsNuevoProfesion = isEsNuevoProfesion;
	}

	public Boolean getEsParaAccionDesdeFormularioProfesion() {
		return esParaAccionDesdeFormularioProfesion;
	}
	
	public void setEsParaAccionDesdeFormularioProfesion(Boolean esParaAccionDesdeFormularioProfesion) {
		this.esParaAccionDesdeFormularioProfesion = esParaAccionDesdeFormularioProfesion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesProfesion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ProfesionConstantesFunciones.refrescarForeignKeysDescripcionesProfesion(this.profesionLogic.getProfesions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ProfesionConstantesFunciones.refrescarForeignKeysDescripcionesProfesion(this.profesions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//profesionLogic.setProfesions(this.profesions);
			profesionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ProfesionParameterReturnGeneral getProfesionParameterGeneral() {
		return this.profesionParameterGeneral;
	}
	
	public void setProfesionParameterGeneral(ProfesionParameterReturnGeneral profesionParameterGeneral) {
		this.profesionParameterGeneral = profesionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoProfesion() {
		return isPermisoTodoProfesion;
	}

	public void setIsPermisoTodoProfesion(Boolean isPermisoTodoProfesion) {
		this.isPermisoTodoProfesion = isPermisoTodoProfesion;
	}

	public Boolean getIsPermisoNuevoProfesion() {
		return isPermisoNuevoProfesion;
	}

	public void setIsPermisoNuevoProfesion(Boolean isPermisoNuevoProfesion) {
		this.isPermisoNuevoProfesion = isPermisoNuevoProfesion;
	}

	public Boolean getIsPermisoActualizarProfesion() {
		return isPermisoActualizarProfesion;
	}

	public void setIsPermisoActualizarProfesion(Boolean isPermisoActualizarProfesion) {
		this.isPermisoActualizarProfesion = isPermisoActualizarProfesion;
	}

	public Boolean getIsPermisoEliminarProfesion() {
		return isPermisoEliminarProfesion;
	}

	public void setIsPermisoEliminarProfesion(Boolean isPermisoEliminarProfesion) {
		this.isPermisoEliminarProfesion = isPermisoEliminarProfesion;
	}

	public Boolean getIsPermisoGuardarCambiosProfesion() {
		return isPermisoGuardarCambiosProfesion;
	}

	public void setIsPermisoGuardarCambiosProfesion(Boolean isPermisoGuardarCambiosProfesion) {
		this.isPermisoGuardarCambiosProfesion = isPermisoGuardarCambiosProfesion;
	}
	
	public Boolean getIsPermisoConsultaProfesion() {
		return isPermisoConsultaProfesion;
	}

	public void setIsPermisoConsultaProfesion(Boolean isPermisoConsultaProfesion) {
		this.isPermisoConsultaProfesion = isPermisoConsultaProfesion;
	}

	public Boolean getIsPermisoBusquedaProfesion() {
		return isPermisoBusquedaProfesion;
	}

	public void setIsPermisoBusquedaProfesion(Boolean isPermisoBusquedaProfesion) {
		this.isPermisoBusquedaProfesion = isPermisoBusquedaProfesion;
	}

	public Boolean getIsPermisoReporteProfesion() {
		return isPermisoReporteProfesion;
	}

	public void setIsPermisoReporteProfesion(Boolean isPermisoReporteProfesion) {
		this.isPermisoReporteProfesion = isPermisoReporteProfesion;
	}
	
	public Boolean getIsPermisoPaginacionMedioProfesion() {
		return isPermisoPaginacionMedioProfesion;
	}

	public void setIsPermisoPaginacionMedioProfesion(Boolean isPermisoPaginacionMedioProfesion) {
		this.isPermisoPaginacionMedioProfesion = isPermisoPaginacionMedioProfesion;
	}
	
	public Boolean getIsPermisoPaginacionTodoProfesion() {
		return isPermisoPaginacionTodoProfesion;
	}

	public void setIsPermisoPaginacionTodoProfesion(Boolean isPermisoPaginacionTodoProfesion) {
		this.isPermisoPaginacionTodoProfesion = isPermisoPaginacionTodoProfesion;
	}
	
	public Boolean getIsPermisoPaginacionAltoProfesion() {
		return isPermisoPaginacionAltoProfesion;
	}

	public void setIsPermisoPaginacionAltoProfesion(Boolean isPermisoPaginacionAltoProfesion) {
		this.isPermisoPaginacionAltoProfesion = isPermisoPaginacionAltoProfesion;
	}
	
	public Boolean getIsPermisoCopiarProfesion() {
		return isPermisoCopiarProfesion;
	}

	public void setIsPermisoCopiarProfesion(Boolean isPermisoCopiarProfesion) {
		this.isPermisoCopiarProfesion = isPermisoCopiarProfesion;
	}
	
	public Boolean getIsPermisoVerFormProfesion() {
		return isPermisoVerFormProfesion;
	}

	public void setIsPermisoVerFormProfesion(Boolean isPermisoVerFormProfesion) {
		this.isPermisoVerFormProfesion = isPermisoVerFormProfesion;
	}
	
	public Boolean getIsPermisoDuplicarProfesion() {
		return isPermisoDuplicarProfesion;
	}

	public void setIsPermisoDuplicarProfesion(Boolean isPermisoDuplicarProfesion) {
		this.isPermisoDuplicarProfesion = isPermisoDuplicarProfesion;
	}
	
	public Boolean getIsPermisoOrdenProfesion() {
		return isPermisoOrdenProfesion;
	}

	public void setIsPermisoOrdenProfesion(Boolean isPermisoOrdenProfesion) {
		this.isPermisoOrdenProfesion = isPermisoOrdenProfesion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoProfesion() {
		return isVisibilidadCeldaNuevoProfesion;
	}

	public void setIsVisibilidadCeldaNuevoProfesion(Boolean isVisibilidadCeldaNuevoProfesion) {
		this.isVisibilidadCeldaNuevoProfesion = isVisibilidadCeldaNuevoProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarProfesion() {
		return isVisibilidadCeldaDuplicarProfesion;
	}

	public void setIsVisibilidadCeldaDuplicarProfesion(Boolean isVisibilidadCeldaDuplicarProfesion) {
		this.isVisibilidadCeldaDuplicarProfesion = isVisibilidadCeldaDuplicarProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarProfesion() {
		return isVisibilidadCeldaCopiarProfesion;
	}

	public void setIsVisibilidadCeldaCopiarProfesion(Boolean isVisibilidadCeldaCopiarProfesion) {
		this.isVisibilidadCeldaCopiarProfesion = isVisibilidadCeldaCopiarProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormProfesion() {
		return isVisibilidadCeldaVerFormProfesion;
	}

	public void setIsVisibilidadCeldaVerFormProfesion(Boolean isVisibilidadCeldaVerFormProfesion) {
		this.isVisibilidadCeldaVerFormProfesion = isVisibilidadCeldaVerFormProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenProfesion() {
		return isVisibilidadCeldaOrdenProfesion;
	}

	public void setIsVisibilidadCeldaOrdenProfesion(Boolean isVisibilidadCeldaOrdenProfesion) {
		this.isVisibilidadCeldaOrdenProfesion = isVisibilidadCeldaOrdenProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesProfesion() {
		return isVisibilidadCeldaNuevoRelacionesProfesion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesProfesion(Boolean isVisibilidadCeldaNuevoRelacionesProfesion) {
		this.isVisibilidadCeldaNuevoRelacionesProfesion = isVisibilidadCeldaNuevoRelacionesProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarProfesion() {
		return isVisibilidadCeldaModificarProfesion;
	}

	public void setIsVisibilidadCeldaModificarProfesion(Boolean isVisibilidadCeldaModificarProfesion) {
		this.isVisibilidadCeldaModificarProfesion = isVisibilidadCeldaModificarProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarProfesion() {
		return isVisibilidadCeldaActualizarProfesion;
	}

	public void setIsVisibilidadCeldaActualizarProfesion(Boolean isVisibilidadCeldaActualizarProfesion) {
		this.isVisibilidadCeldaActualizarProfesion = isVisibilidadCeldaActualizarProfesion;
	}

	public Boolean getIsVisibilidadCeldaEliminarProfesion() {
		return isVisibilidadCeldaEliminarProfesion;
	}

	public void setIsVisibilidadCeldaEliminarProfesion(Boolean isVisibilidadCeldaEliminarProfesion) {
		this.isVisibilidadCeldaEliminarProfesion = isVisibilidadCeldaEliminarProfesion;
	}

	public Boolean getIsVisibilidadCeldaCancelarProfesion() {
		return isVisibilidadCeldaCancelarProfesion;
	}

	public void setIsVisibilidadCeldaCancelarProfesion(Boolean isVisibilidadCeldaCancelarProfesion) {
		this.isVisibilidadCeldaCancelarProfesion = isVisibilidadCeldaCancelarProfesion;
	}

	public Boolean getIsVisibilidadCeldaGuardarProfesion() {
		return isVisibilidadCeldaGuardarProfesion;
	}

	public void setIsVisibilidadCeldaGuardarProfesion(Boolean isVisibilidadCeldaGuardarProfesion) {
		this.isVisibilidadCeldaGuardarProfesion = isVisibilidadCeldaGuardarProfesion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosProfesion() {
		return isVisibilidadCeldaGuardarCambiosProfesion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosProfesion(Boolean isVisibilidadCeldaGuardarCambiosProfesion) {
		this.isVisibilidadCeldaGuardarCambiosProfesion = isVisibilidadCeldaGuardarCambiosProfesion;
	}
		
	public ProfesionSessionBean getprofesionSessionBean() {
		return this.profesionSessionBean;
	}
	
	public void setprofesionSessionBean(ProfesionSessionBean profesionSessionBean) {
		this.profesionSessionBean=profesionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysProfesion(Profesion profesion)throws Exception {
		try {
			
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
	
	public void bugActualizarReferenciaActual(Profesion profesion,Profesion profesionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalProfesion(profesion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		profesionAux.setId(profesion.getId());
		profesionAux.setVersionRow(profesion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessProfesion();
		
			int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = profesionValidator.getInvalidValues(this.profesion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			profesionLogic.setDatosCliente(datosCliente);
			profesionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				profesionAux=new  Profesion();
				
				profesionAux.setIsNew(true);
				profesionAux.setIsChanged(true);
				
				profesionAux.setProfesionOriginal(this.profesion);
				
				profesionAux.setId(this.profesion.getId());	
				profesionAux.setVersionRow(this.profesion.getVersionRow());	
				profesionAux.setcodigo(this.profesion.getcodigo());	
				profesionAux.setnombre(this.profesion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.profesionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.profesionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(profesionAux,profesionLogic.getProfesions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionAux,profesions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.profesionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionLogic.saveProfesions();//WithConnection
						//profesionLogic.getSetVersionRowProfesions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.profesion,profesionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas().addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas.addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionLogic.saveProfesionRelaciones(profesionAux,this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas(),this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//profesionLogic.getSetVersionRowProfesions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.profesion,profesionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas= new ArrayList<ProfesionEmplea>();
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas());

							if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.profesionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.profesionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(profesionAux,profesionLogic.getProfesions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(profesionAux,profesions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.profesion,profesionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				profesionAux=new  Profesion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.profesionSessionBean.getEsGuardarRelacionado() 
					|| (this.profesionSessionBean.getEsGuardarRelacionado() && this.profesion.getId()>=0)) {
						
					profesionAux.setIsNew(false);
				}
				
				profesionAux.setIsDeleted(false);
			
				profesionAux.setId(this.profesion.getId());	
				profesionAux.setVersionRow(this.profesion.getVersionRow());	
				profesionAux.setcodigo(this.profesion.getcodigo());	
				profesionAux.setnombre(this.profesion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(profesionAux,profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionAux,profesions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.profesionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionLogic.saveProfesions();//WithConnection
						//profesionLogic.getSetVersionRowProfesions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.profesion,profesionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas().addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas.addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionLogic.saveProfesionRelaciones(profesionAux,this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas(),this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//profesionLogic.getSetVersionRowProfesions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.profesion,profesionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas= new ArrayList<ProfesionEmplea>();
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas());

							if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.profesionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.profesionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(profesionAux,profesionLogic.getProfesions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(profesionAux,profesions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.profesion,profesionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				profesionAux=new  Profesion();
				
				profesionAux.setIsNew(false);
				profesionAux.setIsChanged(false);
				
				profesionAux.setIsDeleted(true);
				
				profesionAux.setId(this.profesion.getId());	
				profesionAux.setVersionRow(this.profesion.getVersionRow());	
				profesionAux.setcodigo(this.profesion.getcodigo());	
				profesionAux.setnombre(this.profesion.getnombre());	
				
				if(this.profesionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.profesionAux.getId()>=0) {	
						this.profesionsEliminados.add(profesionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(profesionAux,profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionAux,profesions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.profesionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.profesionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionLogic.saveProfesions();//WithConnection
						//profesionLogic.getSetVersionRowProfesions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas().addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias().addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas.addAll(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleasEliminados);
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias.addAll(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jInternalFrameDetalleFormReferencia.telefonoreferenciaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								profesionLogic.saveProfesionRelaciones(profesionAux,this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas(),this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());//WithConnection
								//profesionLogic.getSetVersionRowProfesions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.setProfesionEmpleas(new ArrayList<ProfesionEmplea>());
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(new ArrayList<Referencia>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas= new ArrayList<ProfesionEmplea>();
							this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias= new ArrayList<Referencia>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas());

							if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.quitarFilaTotales();}
							profesionAux.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.profesionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.profesionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(profesionAux,profesionLogic.getProfesions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(profesionAux,profesions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getProfesions().addAll(this.profesionsEliminados);
					
					profesionLogic.saveProfesions();//WithConnection
					//profesionLogic.getSetVersionRowProfesions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.profesionsEliminados= new ArrayList<Profesion>();		
			}
			
			if(this.profesionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Profesion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.profesion=profesionAux;
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
      		//this.finishProcessProfesion();
      	}
		
	}	
	
	public void actualizarRelaciones(Profesion profesionLocal) throws Exception {
		
		if(this.profesionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				profesionLocal.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				profesionLocal.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas());
				profesionLocal.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
			
			} else {
			
				profesionLocal.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clientes);
				profesionLocal.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleas);
				profesionLocal.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referencias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Profesion profesionLocal) throws Exception {	
		if(this.profesionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarProfesionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = profesionValidator.getInvalidValues(this.profesion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Profesion profesion,List<Profesion> profesions) throws Exception {
		try	{		
			ProfesionConstantesFunciones.actualizarLista(profesion,profesions,this.profesionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Profesion profesion,List<Profesion> profesions) throws Exception {
		try	{			
			ProfesionConstantesFunciones.actualizarSelectedLista(profesion,profesions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Profesion> profesionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				profesionsLocal=this.profesionLogic.getProfesions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				profesionsLocal=this.profesions;
			}
			//ARCHITECTURE
		
			for(Profesion profesionLocal:profesionsLocal) {
				if(this.permiteMantenimiento(profesionLocal) && profesionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ProfesionConstantesFunciones.getProfesionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ProfesionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesion.jLabelcodigoProfesion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ProfesionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesion.jLabelnombreProfesion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProfesion.jLabelcodigoProfesion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormProfesion.jLabelnombreProfesion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.profesion==null) {
				this.profesion= new Profesion();
			}

			if(this.profesionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProfesion
				this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);

				this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.getcliente().setProfesion(this.profesion);
			}

			return;
		}
		 else  if(sTipo.equals("ProfesionEmplea")) {
			if(this.profesion==null) {
				this.profesion= new Profesion();
			}

			if(this.profesionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProfesion
				this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);

				this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.getprofesionemplea().setProfesion(this.profesion);
			}

			return;
		}
		 else  if(sTipo.equals("Referencia")) {
			if(this.profesion==null) {
				this.profesion= new Profesion();
			}

			if(this.profesionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoProfesion
				this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);

				this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.getreferencia().setProfesion(this.profesion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoProfesion--;	
		
		
		this.profesionAux=new Profesion();
		
		this.profesionAux.setId(this.iIdNuevoProfesion);
		this.profesionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.profesionLogic.getProfesions().add(this.profesionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.profesions.add(this.profesionAux);
		}
		//ARCHITECTURE
		
		this.profesion=this.profesionAux;
		
		if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioProfesion(this.profesion);
			this.setVariablesObjetoActualToFormularioForeignKeyProfesion(this.profesion);
		}
				
		//this.setDefaultControlesProfesion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyProfesion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyProfesion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyProfesion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProfesion(this.profesionBean,this.profesion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ProfesionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.profesionSessionBean.getConGuardarRelaciones()) {
			classes=ProfesionConstantesFunciones.getClassesRelationshipsOfProfesion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.profesionReturnGeneral=profesionLogic.procesarEventosProfesionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesionLogic.getProfesions(),this.profesion,this.profesionParameterGeneral,this.isEsNuevoProfesion,classes);//this.profesionLogic.getProfesion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanProfesion(this.profesionReturnGeneral,this.profesionBean,false);
		
		if(this.profesionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyProfesion(this.profesionReturnGeneral.getProfesion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioProfesion(this.profesionReturnGeneral.getProfesion());
		}
		
		if(this.profesionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioProfesion(this.profesionReturnGeneral.getProfesion(),classes);//this.profesionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualProfesion(this.profesion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyProfesion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyProfesion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProfesionBeanSwingJInternalFrameAdditional.RecargarFormProfesion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingProfesion(false);
						
			if(profesionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.getEsGuardarRelacionado() && ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProfesionEmpleaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado() && ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesion();
			}
			
			this.actualizarVisualTableDatosProfesion();
			
			this.jTableDatosProfesion.setRowSelectionInterval(this.getIndiceNuevoProfesion(), this.getIndiceNuevoProfesion());
			
			this.seleccionarFilaTablaProfesionActual();
						
			this.actualizarEstadoCeldasBotonesProfesion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesProfesion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setEnabled(isHabilitar && this.profesionConstantesFunciones.activarcodigoProfesion);
		this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setEnabled(isHabilitar && this.profesionConstantesFunciones.activarnombreProfesion);	
		
	};
	
	public void setDefaultControlesProfesion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoProfesion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.profesionSessionBean.setConGuardarRelaciones(true);			
			this.profesionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.profesionSessionBean.setConGuardarRelaciones(false);			
			this.profesionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoProfesion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
				if(profesionAux.getId().equals(this.iIdNuevoProfesion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Profesion profesionAux:this.profesions) {
				if(profesionAux.getId().equals(this.iIdNuevoProfesion)) {
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
	
	public int getIndiceActualProfesion(Profesion profesion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
				if(profesionAux.getId().equals(profesion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Profesion profesionAux:this.profesions) {
				if(profesionAux.getId().equals(profesion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalProfesion(Profesion profesionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
				if(profesionAux.getProfesionOriginal().getId().equals(profesionOriginal.getId())) {
					existe=true;
					profesionOriginal.setId(profesionAux.getId());
					profesionOriginal.setVersionRow(profesionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Profesion profesionAux:this.profesions) {
				if(profesionAux.getProfesionOriginal().getId().equals(profesionOriginal.getId())) {
					existe=true;
					profesionOriginal.setId(profesionAux.getId());
					profesionOriginal.setVersionRow(profesionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosProfesion(Boolean esParaCancelar) throws Exception {
		profesionsAux=new ArrayList<Profesion>();
		profesionAux=new Profesion();
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
					if(profesionAux.getId()<0) {
						profesionsAux.add(profesionAux);
					}		
				}
				this.iIdNuevoProfesion=0L;
				this.profesionLogic.getProfesions().removeAll(profesionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Profesion profesionAux:this.profesions) {
					if(profesionAux.getId()<0) {
						profesionsAux.add(profesionAux);
					}		
				}
				this.iIdNuevoProfesion=0L;
				this.profesions.removeAll(profesionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoProfesion 
					&& this.profesionLogic.getProfesions().size()>0
					) {
					profesionAux=this.profesionLogic.getProfesions().get(this.profesionLogic.getProfesions().size() - 1);
				
					if(profesionAux.getId()<0) {
						this.profesionLogic.getProfesions().remove(profesionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoProfesion && this.profesions.size()>0) {
					profesionAux=this.profesions.get(this.profesions.size() - 1);
				
					if(profesionAux.getId()<0) {
						this.profesions.remove(profesionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoProfesion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(profesion.getId()<0) {
				this.profesionLogic.getProfesions().remove(this.profesion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(profesion.getId()<0) {
				this.profesions.remove(this.profesion);
			}
		}			
	}
	
	public void setEstadosInicialesProfesion(List<Profesion> profesionsAux) throws Exception {
		ProfesionConstantesFunciones.setEstadosInicialesProfesion(profesionsAux);
	}
	
	public void setEstadosInicialesProfesion(Profesion profesionAux) throws Exception {
		ProfesionConstantesFunciones.setEstadosInicialesProfesion(profesionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarProfesionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarProfesionActual()) {
				if(!this.isEsNuevoProfesion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoProfesion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarProfesionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Profesion ?", "MANTENIMIENTO DE Profesion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Profesion profesion) throws Exception {
		ProfesionConstantesFunciones.seleccionarAsignar(this.profesion,profesion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarProfesion=this.isPermisoActualizarOriginalProfesion;
			
			
			this.seleccionarAsignar(profesion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ProfesionConstantesFunciones.quitarEspaciosProfesion(this.profesion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesProfesion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.profesionSessionBean.setsFuncionBusquedaRapida(this.profesionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoProfesion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosProfesion(esParaCancelar);				
				this.cancelarNuevoProfesion(esParaCancelar);								
			}
			
			this.profesion=new Profesion();
			
			this.inicializarProfesion();
			
			this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarProfesion() throws Exception {
		try {
			ProfesionConstantesFunciones.inicializarProfesion(this.profesion);
			
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
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.profesionLogic.getProfesions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteProfesions(String sAccionBusqueda,List<Profesion> profesionsParaReportes) throws Exception {
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
					sPathReporteFinal="Profesion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ProfesionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ProfesionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Profesion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Profesiones");		
		parameters.put("busquedapor", ProfesionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(ProfesionEmplea.class));
			classes.add(new Classe(Referencia.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					ProfesionLogic profesionLogicAuxiliar=new ProfesionLogic();
					profesionLogicAuxiliar.setDatosCliente(profesionLogic.getDatosCliente());				
					profesionLogicAuxiliar.setProfesions(profesionsParaReportes);
					
					profesionLogicAuxiliar.cargarRelacionesLoteForeignKeyProfesionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					profesionsParaReportes=profesionLogicAuxiliar.getProfesions();
					
					//profesionLogic.getNewConnexionToDeep();
					
					//for (Profesion profesion:profesionsParaReportes) {
					//	profesionLogic.deepLoad(profesion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//profesionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//profesionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileProfesionEmplea = AuxiliarReportes.class.getResourceAsStream("ProfesionEmpleaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_profesionemplea", reportFileProfesionEmplea);

			InputStream reportFileReferencia = AuxiliarReportes.class.getResourceAsStream("ReferenciaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referencia", reportFileReferencia);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceProfesion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ProfesionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ProfesionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceProfesion=new JRBeanArrayDataSource(ProfesionJInternalFrame.TraerProfesionBeans(profesionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceProfesion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ProfesionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ProfesionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ProfesionBean.TraerProfesionBeans(profesionsParaReportes).toArray()));
							
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
				this.generarExcelReporteProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoProfesionActionPerformed(null);
					//this.generarExcelReporteProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesProfesions(sAccionBusqueda,sTipoArchivoReporte,profesionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteProfesions(String sAccionBusqueda,String sTipoArchivoReporte,List<Profesion> profesionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Profesions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProfesion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Profesion profesion : profesionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ProfesionConstantesFunciones.generarExcelReporteDataProfesion("NORMAL",row,workbook,profesion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderProfesion(String sTipo,Row row,Workbook workbook) {
		
		ProfesionConstantesFunciones.generarExcelReporteHeaderProfesion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalProfesions(String sAccionBusqueda,String sTipoArchivoReporte,List<Profesion> profesionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Profesions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Profesion profesion : profesionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ProfesionConstantesFunciones.getProfesionDescripcion(profesion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProfesionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProfesionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(profesion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ProfesionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ProfesionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(profesion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesProfesions(String sAccionBusqueda,String sTipoArchivoReporte,List<Profesion> profesionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Profesion> profesionsRespaldo=null;
		
		classes=ProfesionConstantesFunciones.getClassesRelationshipsOfProfesion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.profesionLogic.setDatosCliente(this.datosCliente);
		this.profesionLogic.setDatosDeep(this.datosDeep);
		this.profesionLogic.setIsConDeep(true);
		
		profesionsRespaldo=this.profesionLogic.getProfesions();
		
		this.profesionLogic.setProfesions(profesionsParaReportes);	
		this.profesionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		profesionsParaReportes=this.profesionLogic.getProfesions();
		this.profesionLogic.setProfesions(profesionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Profesions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderProfesion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Profesion profesion : profesionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderProfesion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ProfesionConstantesFunciones.generarExcelReporteDataProfesion("NORMAL",row,workbook,profesion,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(profesion.getClientes()!=null && profesion.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(profesion.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : profesion.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ProfesionEmplea
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO))) {

				if(profesion.getProfesionEmpleas()!=null && profesion.getProfesionEmpleas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProfesionEmpleaConstantesFunciones.generarExcelReporteHeaderProfesionEmplea("RELACIONADO",row,workbook);
				}

				if(profesion.getProfesionEmpleas()!=null) {
					i2=0;
					for(ProfesionEmplea profesionemplea : profesion.getProfesionEmpleas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProfesionEmpleaConstantesFunciones.generarExcelReporteDataProfesionEmplea("RELACIONADO",row,workbook,profesionemplea,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Referencia
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaConstantesFunciones.SCLASSWEBTITULO))) {

				if(profesion.getReferencias()!=null && profesion.getReferencias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaConstantesFunciones.generarExcelReporteHeaderReferencia("RELACIONADO",row,workbook);
				}

				if(profesion.getReferencias()!=null) {
					i2=0;
					for(Referencia referencia : profesion.getReferencias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaConstantesFunciones.generarExcelReporteDataReferencia("RELACIONADO",row,workbook,referencia,cellStyleDataAuxHijo);
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
		cell.setCellValue(ProfesionConstantesFunciones.getProfesionDescripcion(profesion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoProfesion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessProfesion() throws Exception {		
		this.startProcessProfesion(true);
	}
	
	public void startProcessProfesion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasProfesion ,this.jPanelParametrosReportesProfesion, this.jScrollPanelDatosProfesion,this.jPanelPaginacionProfesion, this.jScrollPanelDatosEdicionProfesion, this.jPanelAccionesProfesion,this.jPanelAccionesFormularioProfesion,this.jmenuBarProfesion,this.jmenuBarDetalleProfesion,this.jTtoolBarProfesion,this.jTtoolBarDetalleProfesion);		
		
		final JTabbedPane jTabbedPaneBusquedasProfesion=this.jTabbedPaneBusquedasProfesion; 
		
		final JPanel jPanelParametrosReportesProfesion=this.jPanelParametrosReportesProfesion;
		//final JScrollPane jScrollPanelDatosProfesion=this.jScrollPanelDatosProfesion;
		final JTable jTableDatosProfesion=this.jTableDatosProfesion;		
		final JPanel jPanelPaginacionProfesion=this.jPanelPaginacionProfesion;
		//final JScrollPane jScrollPanelDatosEdicionProfesion=this.jScrollPanelDatosEdicionProfesion;
		final JPanel jPanelAccionesProfesion=this.jPanelAccionesProfesion;
		
		JPanel jPanelCamposAuxiliarProfesion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarProfesion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
			jPanelCamposAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jPanelCamposProfesion;
			jPanelAccionesFormularioAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jPanelAccionesFormularioProfesion;
		}
		
		final JPanel jPanelCamposProfesion=jPanelCamposAuxiliarProfesion;
		final JPanel jPanelAccionesFormularioProfesion=jPanelAccionesFormularioAuxiliarProfesion;
		
		
		final JMenuBar jmenuBarProfesion=this.jmenuBarProfesion;
		final JToolBar jTtoolBarProfesion=this.jTtoolBarProfesion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarProfesion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProfesion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
			jmenuBarDetalleAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jmenuBarDetalleProfesion;
			jTtoolBarDetalleAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jTtoolBarDetalleProfesion;
		}
		
		final JMenuBar jmenuBarDetalleProfesion=jmenuBarDetalleAuxiliarProfesion;
		final JToolBar jTtoolBarDetalleProfesion=jTtoolBarDetalleAuxiliarProfesion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProfesion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProfesion;
			processRunnable.jTableDatos=jTableDatosProfesion;
			processRunnable.jPanelCampos=jPanelCamposProfesion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProfesion;
			processRunnable.jPanelAcciones=jPanelAccionesProfesion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProfesion;
			
			
			processRunnable.jmenuBar=jmenuBarProfesion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProfesion;
			processRunnable.jTtoolBar=jTtoolBarProfesion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProfesion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProfesion ,jPanelParametrosReportesProfesion,jTableDatosProfesion, /*jScrollPanelDatosProfesion,*/jPanelCamposProfesion,jPanelPaginacionProfesion, /*jScrollPanelDatosEdicionProfesion,*/ jPanelAccionesProfesion,jPanelAccionesFormularioProfesion,jmenuBarProfesion,jmenuBarDetalleProfesion,jTtoolBarProfesion,jTtoolBarDetalleProfesion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasProfesion ,jPanelParametrosReportesProfesion, jScrollPanelDatosProfesion,jPanelPaginacionProfesion, jScrollPanelDatosEdicionProfesion, jPanelAccionesProfesion,jPanelAccionesFormularioProfesion,jmenuBarProfesion,jmenuBarDetalleProfesion,jTtoolBarProfesion,jTtoolBarDetalleProfesion);
						
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
	
	public void finishProcessProfesion() {// throws Exception 
		this.finishProcessProfesion(true);
	}
	
	public void finishProcessProfesion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasProfesion ,this.jPanelParametrosReportesProfesion, this.jScrollPanelDatosProfesion,this.jPanelPaginacionProfesion, this.jScrollPanelDatosEdicionProfesion, this.jPanelAccionesProfesion,this.jPanelAccionesFormularioProfesion,this.jmenuBarProfesion,this.jmenuBarDetalleProfesion,this.jTtoolBarProfesion,this.jTtoolBarDetalleProfesion);		
		
		final JTabbedPane jTabbedPaneBusquedasProfesion=this.jTabbedPaneBusquedasProfesion; 
		
		final JPanel jPanelParametrosReportesProfesion=this.jPanelParametrosReportesProfesion;
		//final JScrollPane jScrollPanelDatosProfesion=this.jScrollPanelDatosProfesion;
		final JTable jTableDatosProfesion=this.jTableDatosProfesion;		
		final JPanel jPanelPaginacionProfesion=this.jPanelPaginacionProfesion;
		//final JScrollPane jScrollPanelDatosEdicionProfesion=this.jScrollPanelDatosEdicionProfesion;
		final JPanel jPanelAccionesProfesion=this.jPanelAccionesProfesion;
		
		JPanel jPanelCamposAuxiliarProfesion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarProfesion=new JPanel();
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
			jPanelCamposAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jPanelCamposProfesion;
			jPanelAccionesFormularioAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jPanelAccionesFormularioProfesion;
		}
		
		final JPanel jPanelCamposProfesion=jPanelCamposAuxiliarProfesion;
		final JPanel jPanelAccionesFormularioProfesion=jPanelAccionesFormularioAuxiliarProfesion;
		
		
		final JMenuBar jmenuBarProfesion=this.jmenuBarProfesion;		
		final JToolBar jTtoolBarProfesion=this.jTtoolBarProfesion;
				
		JMenuBar jmenuBarDetalleAuxiliarProfesion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarProfesion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
			jmenuBarDetalleAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jmenuBarDetalleProfesion;
			jTtoolBarDetalleAuxiliarProfesion=this.jInternalFrameDetalleFormProfesion.jTtoolBarDetalleProfesion;		
		}
		
		final JMenuBar jmenuBarDetalleProfesion=jmenuBarDetalleAuxiliarProfesion;
		final JToolBar jTtoolBarDetalleProfesion=jTtoolBarDetalleAuxiliarProfesion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasProfesion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesProfesion;
			processRunnable.jTableDatos=jTableDatosProfesion;
			processRunnable.jPanelCampos=jPanelCamposProfesion;
			processRunnable.jPanelPaginacion=jPanelPaginacionProfesion;
			processRunnable.jPanelAcciones=jPanelAccionesProfesion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioProfesion;
			
			
			processRunnable.jmenuBar=jmenuBarProfesion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleProfesion;
			processRunnable.jTtoolBar=jTtoolBarProfesion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleProfesion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasProfesion ,jPanelParametrosReportesProfesion, jTableDatosProfesion,/*jScrollPanelDatosProfesion,*/jPanelCamposProfesion,jPanelPaginacionProfesion, /*jScrollPanelDatosEdicionProfesion,*/ jPanelAccionesProfesion,jPanelAccionesFormularioProfesion,jmenuBarProfesion,jmenuBarDetalleProfesion,jTtoolBarProfesion,jTtoolBarDetalleProfesion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesProfesion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarProfesion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuProfesion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarProfesion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarProfesion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleProfesion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuProfesion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarProfesion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleProfesion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.profesionConstantesFunciones.getsFinalQueryProfesion();
		String  finalQueryPaginacionTodos=this.profesionConstantesFunciones.getsFinalQueryProfesion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ProfesionConstantesFunciones.getArrayColumnasGlobalesNoProfesion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ProfesionConstantesFunciones.getArrayColumnasGlobalesProfesion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ProfesionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.profesionsEliminados= new ArrayList<Profesion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessProfesion();
		
				///*ProfesionSessionBean*/this.profesionSessionBean=new ProfesionSessionBean();
			
			if(this.profesionSessionBean==null) {
				this.profesionSessionBean=new ProfesionSessionBean();
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
					this.iNumeroPaginacion=ProfesionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ProfesionConstantesFunciones.getClassesForeignKeysOfProfesion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/profesion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			profesionsAux= new ArrayList<Profesion>();
			
				
			profesionLogic.setDatosCliente(this.datosCliente);
			profesionLogic.setDatosDeep(this.datosDeep);
			profesionLogic.setIsConDeep(true);
			
			
			profesionLogic.getProfesionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					profesionLogic.getTodosProfesions(finalQueryGlobal,pagination);
					
					//profesionLogic.getTodosProfesionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(profesionLogic.getProfesions()==null|| profesionLogic.getProfesions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionsAux= new ArrayList<Profesion>();
							profesionsAux.addAll(profesionLogic.getProfesions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionsAux= new ArrayList<Profesion>();
							profesionsAux.addAll(profesions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionLogic.getTodosProfesions(finalQueryGlobal+"",this.pagination);												
							
							//profesionLogic.getTodosProfesionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteProfesions("Todos",profesionLogic.getProfesions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							profesionLogic.setProfesions(new ArrayList<Profesion>());					
							profesionLogic.getProfesions().addAll(profesionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesions=new ArrayList<Profesion>();
							profesions.addAll(profesionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idProfesion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idProfesion=this.idActual;
				
				} else if(this.idProfesionActual!=null && this.idProfesionActual!=0L) {
					idProfesion=idProfesionActual;
				}
				
					
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndicePorId(idProfesion);
				
				this.profesions=new ArrayList<Profesion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					profesionLogic.getEntity(idProfesion);
					
					//profesionLogic.getEntityWithConnection(idProfesion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLogic.setProfesions(new ArrayList<Profesion>());
					profesionLogic.getProfesions().add(profesionLogic.getProfesion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesions=new ArrayList<Profesion>();
					this.profesions.add(profesion);
				}
				
				if(profesionLogic.getProfesion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					profesionLogic.getProfesionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=profesionLogic.getProfesions()==null||profesionLogic.getProfesions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=profesions==null|| profesions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionsAux=new ArrayList<Profesion>();
						profesionsAux.addAll(profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionsAux=new ArrayList<Profesion>();
							profesionsAux.addAll(profesions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							profesionLogic.getProfesionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProfesions("BusquedaPorCodigo",profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProfesions("BusquedaPorCodigo",profesions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionLogic.setProfesions(new ArrayList<Profesion>());
						profesionLogic.getProfesions().addAll(profesionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesions=new ArrayList<Profesion>();
							profesions.addAll(profesionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					profesionLogic.getProfesionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=profesionLogic.getProfesions()==null||profesionLogic.getProfesions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=profesions==null|| profesions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionsAux=new ArrayList<Profesion>();
						profesionsAux.addAll(profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionsAux=new ArrayList<Profesion>();
							profesionsAux.addAll(profesions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							profesionLogic.getProfesionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ProfesionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteProfesions("BusquedaPorNombre",profesionLogic.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteProfesions("BusquedaPorNombre",profesions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionLogic.setProfesions(new ArrayList<Profesion>());
						profesionLogic.getProfesions().addAll(profesionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesions=new ArrayList<Profesion>();
							profesions.addAll(profesionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesProfesion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessProfesion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=profesionLogic.getProfesions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=profesionLogic.getProfesions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=profesions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Profesion profesion) {
		Boolean permite=true;
		
		if(this.profesion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ProfesionConstantesFunciones.getOrderByListaProfesion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ProfesionConstantesFunciones.getOrderByListaProfesion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Profesion profesion:profesionLogic.getProfesions()) {
				if(profesion.getsType().equals(Constantes2.S_TOTALES)) {
					profesionTotales=profesion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Profesion profesion:this.profesions) {
				if(profesion.getsType().equals(Constantes2.S_TOTALES)) {
					profesionTotales=profesion;
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
			this.profesionAux=new Profesion();
			this.profesionAux.setsType(Constantes2.S_TOTALES);
			this.profesionAux.setIsNew(false);
			this.profesionAux.setIsChanged(false);
			this.profesionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ProfesionConstantesFunciones.TotalizarValoresFilaProfesion(this.profesionLogic.getProfesions(),this.profesionAux);
				
				this.profesionLogic.getProfesions().add(this.profesionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ProfesionConstantesFunciones.TotalizarValoresFilaProfesion(this.profesions,this.profesionAux);
				
				this.profesions.add(this.profesionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		profesionTotales=new Profesion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.profesionLogic.getProfesions().remove(profesionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.profesions.remove(profesionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		profesionTotales=new Profesion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Profesion profesion:profesionLogic.getProfesions()) {
				if(profesion.getsType().equals(Constantes2.S_TOTALES)) {
					profesionTotales=profesion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProfesionConstantesFunciones.TotalizarValoresFilaProfesion(this.profesionLogic.getProfesions(),profesionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Profesion profesion:this.profesions) {
				if(profesion.getsType().equals(Constantes2.S_TOTALES)) {
					profesionTotales=profesion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ProfesionConstantesFunciones.TotalizarValoresFilaProfesion(this.profesions,profesionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getProfesionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getProfesionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getProfesionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLogic.getProfesionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getProfesionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLogic.getProfesionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosProfesion() {
		this.isPermisoTodoProfesion=false;
		this.isPermisoNuevoProfesion=false;
		this.isPermisoActualizarProfesion=false;
		this.isPermisoActualizarOriginalProfesion=false;
		this.isPermisoEliminarProfesion=false;
		this.isPermisoGuardarCambiosProfesion=false;
		this.isPermisoConsultaProfesion=false;
		this.isPermisoBusquedaProfesion=false;
		this.isPermisoReporteProfesion=false;		
		this.isPermisoOrdenProfesion=false;		
		this.isPermisoPaginacionMedioProfesion=false;		
		this.isPermisoPaginacionAltoProfesion=false;
		this.isPermisoPaginacionTodoProfesion=false;
		this.isPermisoCopiarProfesion=false;		
		this.isPermisoVerFormProfesion=false;		
		this.isPermisoDuplicarProfesion=false;		
		this.isPermisoOrdenProfesion=false;		
	}
	
	public void setPermisosUsuarioProfesion(Boolean isPermiso) {
		this.isPermisoTodoProfesion=isPermiso;
		this.isPermisoNuevoProfesion=isPermiso;
		this.isPermisoActualizarProfesion=isPermiso;
		this.isPermisoActualizarOriginalProfesion=isPermiso;
		this.isPermisoEliminarProfesion=isPermiso;
		this.isPermisoGuardarCambiosProfesion=isPermiso;
		this.isPermisoConsultaProfesion=isPermiso;
		this.isPermisoBusquedaProfesion=isPermiso;
		this.isPermisoReporteProfesion=isPermiso;
		this.isPermisoOrdenProfesion=isPermiso;		
		this.isPermisoPaginacionMedioProfesion=isPermiso;		
		this.isPermisoPaginacionAltoProfesion=isPermiso;		
		this.isPermisoPaginacionTodoProfesion=isPermiso;		
		this.isPermisoCopiarProfesion=isPermiso;		
		this.isPermisoVerFormProfesion=isPermiso;		
		this.isPermisoDuplicarProfesion=isPermiso;
		this.isPermisoOrdenProfesion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioProfesion(Boolean isPermiso) {
		//this.isPermisoTodoProfesion=isPermiso;
		this.isPermisoNuevoProfesion=isPermiso;
		this.isPermisoActualizarProfesion=isPermiso;
		this.isPermisoActualizarOriginalProfesion=isPermiso;
		this.isPermisoEliminarProfesion=isPermiso;
		this.isPermisoGuardarCambiosProfesion=isPermiso;
		//this.isPermisoConsultaProfesion=isPermiso;
		//this.isPermisoBusquedaProfesion=isPermiso;
		//this.isPermisoReporteProfesion=isPermiso;
		//this.isPermisoOrdenProfesion=isPermiso;		
		//this.isPermisoPaginacionMedioProfesion=isPermiso;		
		//this.isPermisoPaginacionAltoProfesion=isPermiso;		
		//this.isPermisoPaginacionTodoProfesion=isPermiso;		
		//this.isPermisoCopiarProfesion=isPermiso;		
		//this.isPermisoDuplicarProfesion=isPermiso;
		//this.isPermisoOrdenProfesion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioProfesionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ProfesionEmpleaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ReferenciaConstantesFunciones.SNOMBREOPCION);
		
		if(ProfesionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionProfesionClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosProfesionEmplea=false;
		this.isTienePermisosProfesionEmplea=this.verificarGetPermisosUsuarioOpcionProfesionClaseRelacionada(this.opcionsRelacionadas,ProfesionEmpleaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosReferencia=false;
		this.isTienePermisosReferencia=this.verificarGetPermisosUsuarioOpcionProfesionClaseRelacionada(this.opcionsRelacionadas,ReferenciaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebProfesion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioProfesionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosProfesionEmplea=conPermiso;
		this.isTienePermisosReferencia=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioProfesionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionProfesionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioProfesionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormProfesion!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.remove(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosProfesionEmplea && this.jInternalFrameDetalleFormProfesion!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.remove(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosReferencia && this.jInternalFrameDetalleFormProfesion!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.remove(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioProfesion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ProfesionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.profesionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ProfesionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoProfesion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarProfesion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalProfesion=this.isPermisoActualizarProfesion;
			this.isPermisoEliminarProfesion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosProfesion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaProfesion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaProfesion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoProfesion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteProfesion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProfesion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioProfesion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoProfesion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoProfesion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarProfesion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormProfesion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarProfesion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenProfesion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.profesionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosProfesion.setToolTipText(this.jTableDatosProfesion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioProfesion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioProfesion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ProfesionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ProfesionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioProfesion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.profesionConstantesFunciones.mostrarClienteProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosProfesionEmplea && this.profesionConstantesFunciones.mostrarProfesionEmpleaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Profesion Emplea");
			reporte.setsDescripcion("Profesion Emplea");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosReferencia && this.profesionConstantesFunciones.mostrarReferenciaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia");
			reporte.setsDescripcion("Referencia");
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
	
		
	public void inicializarCombosForeignKeyProfesionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyProfesionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ProfesionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyProfesionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyProfesionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyProfesion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyProfesion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyProfesion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyProfesion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyProfesion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyProfesion(Profesion profesion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyProfesion(Profesion profesion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyProfesion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyProfesion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyProfesion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyProfesion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroProfesion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyProfesion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyProfesion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyProfesion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ProfesionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ProfesionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ProfesionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.profesionSessionBean=new ProfesionSessionBean(); 
		this.profesionConstantesFunciones=new ProfesionConstantesFunciones(); 
		this.profesionBean=new Profesion();//(this.profesionConstantesFunciones); 		
		this.profesionReturnGeneral=new ProfesionParameterReturnGeneral(); 
		
		this.profesionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.profesionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ProfesionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ProfesionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ProfesionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessProfesion(true);
			
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
			
			this.profesionConstantesFunciones=new ProfesionConstantesFunciones(); 
			this.profesionBean=new Profesion();//this.profesionConstantesFunciones); 			
			this.profesionReturnGeneral=new ProfesionParameterReturnGeneral(); 
		
			ProfesionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Profesion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.profesion=new Profesion();
			this.profesions = new ArrayList<Profesion>();
			this.profesionsAux = new ArrayList<Profesion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic=new ProfesionLogic();
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			//this.profesionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.profesionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormProfesion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoProfesion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProfesion);	
					}
					
					if(this.jInternalFrameImportacionProfesion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProfesion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByProfesion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByProfesion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormProfesion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormProfesion);
				this.jInternalFrameDetalleFormProfesion.setVisible(false);
				this.jInternalFrameDetalleFormProfesion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoProfesion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProfesion);
					this.jInternalFrameReporteDinamicoProfesion.setVisible(false);
					this.jInternalFrameReporteDinamicoProfesion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionProfesion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionProfesion);
					this.jInternalFrameImportacionProfesion.setVisible(false);
					this.jInternalFrameImportacionProfesion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByProfesion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByProfesion);
					this.jInternalFrameOrderByProfesion.setVisible(false);
					this.jInternalFrameOrderByProfesion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idProfesionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ProfesionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.profesionReturnGeneral=new ProfesionParameterReturnGeneral();
			
			this.profesionParameterGeneral=new ProfesionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.profesionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ProfesionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.profesionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ProfesionEmpleaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ReferenciaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProfesionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.profesionSessionBean.getEsGuardarRelacionado(),this.profesionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ProfesionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.profesionSessionBean.getEsGuardarRelacionado(),this.profesionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaDuplicarProfesion=true;
			this.isVisibilidadCeldaCopiarProfesion=true;
			this.isVisibilidadCeldaVerFormProfesion=true;
			this.isVisibilidadCeldaOrdenProfesion=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=false;
			this.isVisibilidadCeldaGuardarProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosProfesion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioProfesion(false);
			
			this.setPermisosUsuarioProfesion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionSessionBean.getEsGuardarRelacionado() 
				|| (this.profesionSessionBean.getEsGuardarRelacionado() && this.profesionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioProfesionClasesRelacionadas();
			}
			
			if(this.profesionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioProfesionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ProfesionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosProfesion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualProfesion();
			}
			
			if(!this.isPermisoBusquedaProfesion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasProfesion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioProfesion,this.isPermisoPaginacionMedioProfesion,this.isPermisoPaginacionTodoProfesion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ProfesionConstantesFunciones.getTiposSeleccionarProfesion());
				
				this.tiposColumnasSelect=ProfesionConstantesFunciones.getTiposSeleccionarProfesion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectProfesion();				
				//this.tiposRelacionesSelect=ProfesionConstantesFunciones.getTiposRelacionesProfesion(true);
				
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
			//if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioProfesion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioProfesion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioProfesion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesion() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.profesionempleaLogic=new ProfesionEmpleaLogic();
			this.referenciaLogic=new ReferenciaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				profesionImplementable= (ProfesionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProfesionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				profesionImplementableHome= (ProfesionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ProfesionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.profesions= new ArrayList<Profesion>();
			this.profesionsEliminados= new ArrayList<Profesion>();
						
			this.isEsNuevoProfesion=false;
			this.esParaAccionDesdeFormularioProfesion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyProfesion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroProfesion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ProfesionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ProfesionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesProfesion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingProfesion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormProfesion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioProfesion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioProfesion();
			}
			
			ProfesionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasProfesion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasProfesion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasProfesion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessProfesion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Profesion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectProfesion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesProfesion")) {
				iIndex=this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosProfesion.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProfesion();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Profesion Empleas")) {
					if(!ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProfesion();

						this.cargarParteTabPanelRelacionadaProfesionEmplea(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Referencias")) {
					if(!ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessProfesion();

						this.cargarParteTabPanelRelacionadaReferencia(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessProfesion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProfesion.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesProfesion.updateUI();
		//this.jTabbedPaneRelacionesProfesion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProfesion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProfesionEmplea(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProfesion.cargarSessionConBeanSwingJInternalFrameProfesionEmplea(false,true,iIndex);
		this.jButtonProfesionEmpleaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProfesionEmplea();

		//this.jTabbedPaneRelacionesProfesion.updateUI();
		//this.jTabbedPaneRelacionesProfesion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProfesion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaReferencia(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormProfesion.cargarSessionConBeanSwingJInternalFrameReferencia(false,true,iIndex);
		this.jButtonReferenciaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferencia();

		//this.jTabbedPaneRelacionesProfesion.updateUI();
		//this.jTabbedPaneRelacionesProfesion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesProfesion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosProfesion.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ProfesionEmplea")) {
				int row=this.jTableDatosProfesion.getSelectedRow();
				jButtonProfesionEmpleaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Referencia")) {
				int row=this.jTableDatosProfesion.getSelectedRow();
				jButtonReferenciaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.profesionConstantesFunciones.mostrarClienteProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(profesionConstantesFunciones.resaltarClienteProfesion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(profesionConstantesFunciones.resaltarClienteProfesion);
						}

						jmenuItem.setEnabled(this.profesionConstantesFunciones.activarClienteProfesion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormProfesion.jmenuDetalleProfesion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Profesion Emplea")) {

					if(this.isTienePermisosProfesionEmplea && this.profesionConstantesFunciones.mostrarProfesionEmpleaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Profesion Empleas"+"("+ProfesionEmpleaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Profesion Empleas");

						if(profesionConstantesFunciones.resaltarProfesionEmpleaProfesion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(profesionConstantesFunciones.resaltarProfesionEmpleaProfesion);
						}

						jmenuItem.setEnabled(this.profesionConstantesFunciones.activarProfesionEmpleaProfesion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ProfesionEmplea"));

						

						this.jInternalFrameDetalleFormProfesion.jmenuDetalleProfesion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Referencia")) {

					if(this.isTienePermisosReferencia && this.profesionConstantesFunciones.mostrarReferenciaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencias"+"("+ReferenciaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencias");

						if(profesionConstantesFunciones.resaltarReferenciaProfesion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(profesionConstantesFunciones.resaltarReferenciaProfesion);
						}

						jmenuItem.setEnabled(this.profesionConstantesFunciones.activarReferenciaProfesion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Referencia"));

						

						this.jInternalFrameDetalleFormProfesion.jmenuDetalleProfesion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyProfesion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyProfesion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyProfesion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyProfesionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyProfesion();
		
		this.cargarCombosFrameForeignKeyProfesion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyProfesion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyProfesion();
		}
	}
	
	
	
	public void jButtonNuevoProfesionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.profesionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			
			if(jTableDatosProfesion.getRowCount()>=1) {
				jTableDatosProfesion.removeRowSelectionInterval(0, jTableDatosProfesion.getRowCount()-1);						
			}
			
			this.isEsNuevoProfesion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoProfesion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesProfesion(true);			
			//this.profesion=new Profesion();
			//this.profesion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesion() ;
			
			if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.profesion);	
			this.actualizarInformacion("INFO_PADRE",false,this.profesion);				
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			if(this.profesionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Profesion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarProfesionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosProfesion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosProfesion.getSelectedRows().length;			
			}
			
			profesionsSeleccionados=this.getProfesionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoProfesion--;			
				//Profesion profesionAux= new Profesion();			
				//profesionAux.setId(this.iIdNuevoProfesion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Profesion profesionOrigen=new Profesion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Profesion profesionOrigen : profesionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							profesionOrigen =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							profesionOrigen =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaProfesion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.profesion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosProfesion(profesionOrigen,this.profesion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.profesionLogic.getProfesions().add(this.profesionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.profesions.add(this.profesionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaProfesion(false);
				
				this.jTableDatosProfesion.setRowSelectionInterval(this.getIndiceNuevoProfesion(), this.getIndiceNuevoProfesion());
				
				int iLastRow =  this.jTableDatosProfesion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProfesion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProfesion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();									
		
			Profesion profesionOrigen=new Profesion();
			Profesion profesionDestino=new Profesion();
				
			profesionsSeleccionados=this.getProfesionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosProfesion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || profesionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosProfesion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionOrigen =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						profesionOrigen =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						profesionDestino =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						profesionDestino =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				profesionOrigen =profesionsSeleccionados.get(0);
				profesionDestino =profesionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosProfesion(profesionOrigen,profesionDestino,true,false);
				
				profesionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(profesionDestino,profesionLogic.getProfesions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(profesionDestino,profesions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaProfesion(false);
				
				//this.jTableDatosProfesion.setRowSelectionInterval(this.getIndiceNuevoProfesion(), this.getIndiceNuevoProfesion());
				
				int iLastRow =  this.jTableDatosProfesion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosProfesion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosProfesion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormProfesion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesProfesion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasProfesion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesProfesion.setVisible(!isVisible);
			this.jPanelPaginacionProfesion.setVisible(!isVisible);
			this.jPanelAccionesProfesion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameProfesion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoProfesion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionProfesion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByProfesion();
			
			this.abrirFrameOrderByProfesion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByProfesion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleProfesion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormProfesion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormProfesion.isMaximum()) {
					this.jInternalFrameDetalleFormProfesion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormProfesion.setSize(this.jInternalFrameDetalleFormProfesion.iWidthFormulario,this.jInternalFrameDetalleFormProfesion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormProfesion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormProfesion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormProfesion.isMaximum()) {
						this.jInternalFrameDetalleFormProfesion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),ProfesionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),ProfesionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),ProfesionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProfesionEmplea();
					}

					if(ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferencia();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormProfesion.setVisible(true);
	        this.jInternalFrameDetalleFormProfesion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByProfesion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByProfesion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByProfesion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesion,false,this);
				} else {
					this.jInternalFrameOrderByProfesion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByProfesion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByProfesion);
				this.jInternalFrameOrderByProfesion.setVisible(false);
				this.jInternalFrameOrderByProfesion.setSelected(false);
				
				this.jInternalFrameOrderByProfesion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProfesion"));
				
				this.inicializarActualizarBindingTablaOrderByProfesion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionProfesion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionProfesion==null) {
				
				this.jInternalFrameImportacionProfesion=new ImportacionJInternalFrame(ProfesionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionProfesion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionProfesion);
				this.jInternalFrameImportacionProfesion.setVisible(false);
				this.jInternalFrameImportacionProfesion.setSelected(false);


				this.jInternalFrameImportacionProfesion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProfesion"));
				this.jInternalFrameImportacionProfesion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProfesion"));
				this.jInternalFrameImportacionProfesion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProfesion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoProfesion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoProfesion==null) {
				this.jInternalFrameReporteDinamicoProfesion=new ReporteDinamicoJInternalFrame(ProfesionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoProfesion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoProfesion);
				this.jInternalFrameReporteDinamicoProfesion.setVisible(false);
				this.jInternalFrameReporteDinamicoProfesion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoProfesion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesion"));
				this.jInternalFrameReporteDinamicoProfesion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesion"));
				this.jInternalFrameReporteDinamicoProfesion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProfesionEmplea() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.jScrollPanelDatosProfesionEmplea.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.jScrollPanelDatosProfesionEmplea.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.jScrollPanelDatosProfesionEmplea.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.jScrollPanelDatosProfesionEmplea.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaReferencia() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormProfesion.jContentPaneDetalleProfesion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleProfesion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormProfesion);
			
	       	this.jInternalFrameDetalleFormProfesion.setVisible(false);
	        this.jInternalFrameDetalleFormProfesion.setSelected(false);
			
			//this.jInternalFrameDetalleFormProfesion.dispose();
			//this.jInternalFrameDetalleFormProfesion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoProfesion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoProfesion.setVisible(true);
	        this.jInternalFrameReporteDinamicoProfesion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionProfesion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionProfesion.setVisible(true);
	        this.jInternalFrameImportacionProfesion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByProfesion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByProfesion.setVisible(true);
	        this.jInternalFrameOrderByProfesion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByProfesion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByProfesion.setVisible(false);
	        this.jInternalFrameOrderByProfesion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoProfesion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoProfesion.setVisible(false);
	        this.jInternalFrameReporteDinamicoProfesion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionProfesion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionProfesion.setVisible(false);
	        this.jInternalFrameImportacionProfesion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarProfesion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarProfesion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesProfesion(true);
			//this.isEsNuevoProfesion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesProfesion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesion(false) ;
			
			if(profesionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.getEsGuardarRelacionado() && ProfesionEmpleaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProfesionEmpleaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado() && ReferenciaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaProfesionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarProfesion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesProfesion(true);
			//this.isEsNuevoProfesion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.profesion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesProfesion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesProfesion(false) ;
			
			if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleProfesion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesProfesion(false);
			
			//if(!this.isEsNuevoProfesion) {								
				int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
				
			}
			
			if(this.permiteMantenimiento(this.profesion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.profesionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoProfesion=true;
					this.inicializarActualizarBindingTablaProfesion(false);
					this.isEsNuevoProfesion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoProfesion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoProfesion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProfesion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesion(false);
				
				this.habilitarDeshabilitarControlesProfesion(false);
			
												
				
				if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleProfesion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoProfesionActionPerformed(evt,profesionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualProfesion(this.profesion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosProfesion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,profesionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.profesion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarProfesionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				this.profesion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				this.profesion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.profesion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.profesionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ProfesionModel) this.jTableDatosProfesion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoProfesion=true;
				this.inicializarActualizarBindingTablaProfesion(false);
				this.isEsNuevoProfesion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesProfesion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesion(false);
				
				this.habilitarDeshabilitarControlesProfesion(false);
				
				
				
				if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleProfesion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarProfesionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosProfesion.getRowCount()>=1) {
				jTableDatosProfesion.removeRowSelectionInterval(0, jTableDatosProfesion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesProfesion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaProfesion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesProfesion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualProfesion(false) ;
			
			this.isEsNuevoProfesion=false;
			
			if(ProfesionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleProfesion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingProfesion(false);
				
				//SI ES MANUAL
				if(ProfesionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualProfesion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoProfesion--;			
			//Profesion profesionAux= new Profesion();			
			//profesionAux.setId(this.iIdNuevoProfesion);
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaProfesion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
			
			this.profesion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.profesionLogic.getProfesions().add(this.profesionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.profesions.add(this.profesionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaProfesion(false);
			
			this.jTableDatosProfesion.setRowSelectionInterval(this.getIndiceNuevoProfesion(), this.getIndiceNuevoProfesion());
			
			int iLastRow =  this.jTableDatosProfesion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosProfesion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosProfesion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaProfesion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingProfesion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesion(false);
			
			//SI ES MANUAL
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesion();
			}
			
			//this.abrirFrameTreeProfesion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionProfesionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ProfesionES ?", "MANTENIMIENTO DE Profesion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionProfesion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralProfesion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.profesionReturnGeneral=profesionLogic.procesarImportacionProfesionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.profesionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarProfesionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionProfesionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionProfesion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionProfesion.setFileImportacion(this.jInternalFrameImportacionProfesion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionProfesion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionProfesion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionProfesion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionProfesion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		

		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ProfesionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ProfesionBaseDesign.jrxml";
			
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
			
			this.generarReporteProfesions("Todos",profesionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProfesionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ProfesionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoProfesion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ProfesionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ProfesionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ProfesionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ProfesionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoProfesion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ProfesionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ProfesionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoProfesionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Profesions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ProfesionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProfesionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Profesion profesion:profesionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(profesion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ProfesionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ProfesionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Profesion profesion:profesionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(profesion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelProfesion(row);				
			//	iRow++;
			//}				
			
			//for(Profesion profesionAux:profesionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelProfesion(profesionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
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
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesion(false);
			
			//SI ES MANUAL
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualProfesion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesion(false);
			
			//SI ES MANUAL
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProfesion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesProfesionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingProfesion(false);
			
			//SI ES MANUAL
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualProfesion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaProfesion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosProfesion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosProfesion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosProfesion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosProfesion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosProfesion.setMinimumSize(dimensionMinimum);
		this.jTableDatosProfesion.setMaximumSize(dimensionMaximum);
		this.jTableDatosProfesion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingProfesion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingProfesion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingProfesion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaProfesion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesProfesion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasProfesion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesProfesion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ProfesionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualProfesion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaProfesion();
		
		this.inicializarActualizarBindingBotonesManualProfesion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualProfesion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesProfesion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualProfesion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualProfesion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosProfesion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosProfesion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteProfesion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormProfesion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionNuevoProfesion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionSinCerrarProfesion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionSinMensajeProfesion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosProfesion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosProfesion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteProfesion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormProfesion!=null) {
				this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionNuevoProfesion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionSinCerrarProfesion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormProfesion.jCheckBoxPostAccionSinMensajeProfesion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionProfesion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionProfesion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesProfesion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoProfesion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesProfesion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesProfesion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarProfesion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesProfesion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoProfesion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesProfesion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralProfesion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesProfesion(Boolean esInicializar) throws Exception {
		try	{	
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualProfesion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesProfesion() throws Exception {
		try	{
			if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualProfesion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProfesion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualProfesion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesProfesion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesProfesion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesProfesion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionProfesion.addItem(reporte);
			}
			
			
			if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionProfesion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionProfesion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesProfesion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesProfesion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarProfesion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarProfesion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarProfesion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualProfesion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProfesion!=null) {
				this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoProfesion!=null) {
				this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoProfesion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoProfesion!=null) {
				
				if(this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProfesion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoProfesion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoProfesion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoProfesion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualProfesion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoProfesion.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreProfesion.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasProfesion(Boolean esInicializar) throws Exception {				
		if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualProfesion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaProfesion() throws Exception {
		this.inicializarActualizarBindingTablaProfesion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByProfesion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosProfesionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaProfesion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=profesionLogic.getProfesions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=profesions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosProfesion.setModel(new ProfesionModel(this.profesionLogic.getProfesions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosProfesion.setModel(new ProfesionModel(this.profesions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByProfesion!=null && this.jInternalFrameOrderByProfesion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByProfesion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosProfesion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ProfesionConstantesFunciones.SCLASSWEBTITULO,profesionConstantesFunciones.resaltarSeleccionarProfesion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ProfesionConstantesFunciones.SCLASSWEBTITULO,profesionConstantesFunciones.resaltarSeleccionarProfesion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosProfesion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesion,ProfesionConstantesFunciones.LABEL_ID));

		if(this.profesionConstantesFunciones.mostraridProfesion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.profesionConstantesFunciones.resaltaridProfesion,this.profesionConstantesFunciones.activaridProfesion,this,true,"idProfesion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.profesionConstantesFunciones.resaltaridProfesion,this.profesionConstantesFunciones.activaridProfesion,this,true,"idProfesion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProfesion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesion,ProfesionConstantesFunciones.LABEL_CODIGO));

		if(this.profesionConstantesFunciones.mostrarcodigoProfesion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.profesionConstantesFunciones.resaltarcodigoProfesion,this.profesionConstantesFunciones.activarcodigoProfesion,this,true,"codigoProfesion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.profesionConstantesFunciones.resaltarcodigoProfesion,this.profesionConstantesFunciones.activarcodigoProfesion,this,true,"codigoProfesion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosProfesion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosProfesion,ProfesionConstantesFunciones.LABEL_NOMBRE));

		if(this.profesionConstantesFunciones.mostrarnombreProfesion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ProfesionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.profesionConstantesFunciones.resaltarnombreProfesion,this.profesionConstantesFunciones.activarnombreProfesion,this,true,"nombreProfesion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.profesionConstantesFunciones.resaltarnombreProfesion,this.profesionConstantesFunciones.activarnombreProfesion,this,true,"nombreProfesion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ProfesionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.profesionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.profesionConstantesFunciones.mostrarClienteProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(profesionConstantesFunciones.resaltarClienteProfesion,this,this.profesionConstantesFunciones.activarClienteProfesion));
				tableColumn.setCellEditor(new ClienteTableCell(profesionConstantesFunciones.resaltarClienteProfesion,this,this.profesionConstantesFunciones.activarClienteProfesion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProfesion.addColumn(tableColumn);
			}

			if(this.isTienePermisosProfesionEmplea && this.profesionConstantesFunciones.mostrarProfesionEmpleaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Profesion Empleas");
				tableColumn.setHeaderValue("Profesion Empleas");
				tableColumn.setCellRenderer(new ProfesionEmpleaTableCell(profesionConstantesFunciones.resaltarProfesionEmpleaProfesion,this,this.profesionConstantesFunciones.activarProfesionEmpleaProfesion));
				tableColumn.setCellEditor(new ProfesionEmpleaTableCell(profesionConstantesFunciones.resaltarProfesionEmpleaProfesion,this,this.profesionConstantesFunciones.activarProfesionEmpleaProfesion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProfesion.addColumn(tableColumn);
			}

			if(this.isTienePermisosReferencia && this.profesionConstantesFunciones.mostrarReferenciaProfesion && !ProfesionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencias");
				tableColumn.setHeaderValue("Referencias");
				tableColumn.setCellRenderer(new ReferenciaTableCell(profesionConstantesFunciones.resaltarReferenciaProfesion,this,this.profesionConstantesFunciones.activarReferenciaProfesion));
				tableColumn.setCellEditor(new ReferenciaTableCell(profesionConstantesFunciones.resaltarReferenciaProfesion,this,this.profesionConstantesFunciones.activarReferenciaProfesion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosProfesion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.profesionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.profesionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProfesion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.profesionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.profesionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosProfesion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarProfesion && this.isPermisoGuardarCambiosProfesion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.profesionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.profesionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosProfesion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.profesionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosProfesion.addColumn(tableColumn);
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
			
			this.jTableDatosProfesion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProfesion && this.isPermisoGuardarCambiosProfesion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.profesionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarProfesion && this.isPermisoGuardarCambiosProfesion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosProfesion.moveColumn(this.jTableDatosProfesion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosProfesion.moveColumn(this.jTableDatosProfesion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.profesionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosProfesion.moveColumn(this.jTableDatosProfesion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosProfesion.moveColumn(this.jTableDatosProfesion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosProfesion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosProfesion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosProfesion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosProfesion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosProfesion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosProfesion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosProfesion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosProfesion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=profesionLogic.getProfesions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=profesions.size()-1;
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
		//this.jTableDatosProfesion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosProfesion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosProfesion();
			
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
				
				//this.isEsNuevoProfesion=false;
					
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
				if(this.profesionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormProfesion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProfesion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProfesion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.profesion.getsType().equals("DUPLICADO")
				   || this.profesion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoProfesion=true;
				
				} else {
					this.isEsNuevoProfesion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.profesionSessionBean.getEsGuardarRelacionado()) {
					if(this.profesion.getId()>=0 && !this.profesion.getIsNew()) {						
						this.isEsNuevoProfesion=false;
						
					} else {
						this.isEsNuevoProfesion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoProfesion(esRelaciones);						
				
				this.seleccionarProfesion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.profesion.getId()<0) {
					this.isEsNuevoProfesion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarProfesion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarProfesion(evt,rowIndex);
				}	
				
				if(this.profesionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Profesion: " + this.dDif); 
					}
				}								
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarProfesion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.profesion)) {
					if(this.profesion.getId()>0) {
						this.profesion.setIsDeleted(true);
						
						this.profesionsEliminados.add(this.profesion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.profesionLogic.getProfesions().remove(this.profesion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.profesions.remove(this.profesion);				
					}
					
					
					((ProfesionModel) this.jTableDatosProfesion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaProfesion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarProfesion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoProfesion) {
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosProfesion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosProfesion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioProfesion(this.profesion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesProfesion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesProfesion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualProfesion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoProfesion(Profesion profesion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoProfesion(profesion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoProfesion(Profesion profesion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioProfesion(profesion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyProfesion(profesion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyProfesion(profesion);
	}
	
	public void setVariablesObjetoActualToFormularioProfesion(Profesion profesion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setText(profesion.getId().toString());
			this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setText(profesion.getcodigo());
			this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setText(profesion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Profesion profesionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,profesionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Profesion profesionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				profesionLocal=this.profesion;
			} else {
				profesionLocal=this.profesionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(profesionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoProfesion(profesionLocal,true);
					
					if(profesionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(profesionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.profesionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(profesionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoProfesion(Profesion profesion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProfesion(profesion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysProfesion(profesion);
	}
	
	public void setVariablesFormularioToObjetoActualProfesion(Profesion profesion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualProfesion(profesion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualProfesion(Profesion profesion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.getText()==null || this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.getText()=="" || this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.getText()=="Id") {
				this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setText("0");
			}

			if(conColumnasBase) {profesion.setId(Long.parseLong(this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProfesionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesion.jLabelIdProfesion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			profesion.setcodigo(this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProfesionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesion.jLabelcodigoProfesion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			profesion.setnombre(this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ProfesionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormProfesion.jLabelnombreProfesion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualProfesion(Profesion profesionBean,Profesion profesion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosProfesion(Profesion profesionOrigen,Profesion profesion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && profesionOrigen.getId()!=null && !profesionOrigen.getId().equals(0L))) {profesion.setId(profesionOrigen.getId());}}
			if(conDefault || (!conDefault && profesionOrigen.getcodigo()!=null && !profesionOrigen.getcodigo().equals(""))) {profesion.setcodigo(profesionOrigen.getcodigo());}
			if(conDefault || (!conDefault && profesionOrigen.getnombre()!=null && !profesionOrigen.getnombre().equals(""))) {profesion.setnombre(profesionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProfesion(Profesion profesion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setText(profesion.getId().toString());
			this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setText(profesion.getcodigo());
			this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setText(profesion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioProfesion(ProfesionBean profesionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setText(profesionBean.getId().toString());
			this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setText(profesionBean.getcodigo());
			this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setText(profesionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanProfesion(ProfesionParameterReturnGeneral profesionReturnGeneral,ProfesionBean profesionBean,Boolean conDefault) throws Exception { 
		try {
			Profesion profesionLocal=new Profesion();
			
			profesionLocal=profesionReturnGeneral.getProfesion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && profesionLocal.getId()!=null && !profesionLocal.getId().equals(0L))) {profesionBean.setId(profesionLocal.getId());}}
			if(conDefault || (!conDefault && profesionLocal.getcodigo()!=null && !profesionLocal.getcodigo().equals(""))) {profesionBean.setcodigo(profesionLocal.getcodigo());}
			if(conDefault || (!conDefault && profesionLocal.getnombre()!=null && !profesionLocal.getnombre().equals(""))) {profesionBean.setnombre(profesionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxProfesionGenerico(Long idProfesionSeleccionado,JComboBox jComboBoxProfesion,List<Profesion> profesionsLocal)throws Exception {
		try {
			Profesion  profesionTemp=null;

			for(Profesion profesionAux:profesionsLocal) {
				if(profesionAux.getId()!=null && profesionAux.getId().equals(idProfesionSeleccionado)) {
					profesionTemp=profesionAux;
					break;
				}
			}

			jComboBoxProfesion.setSelectedItem(profesionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxProfesionGenerico(JComboBox jComboBoxProfesion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxProfesion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProfesion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxProfesion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxProfesion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProfesion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxProfesion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxProfesion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxProfesion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxProfesion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxProfesion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ProfesionEmplea")) {
			jButtonProfesionEmpleaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Referencia")) {
			jButtonReferenciaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesion=(Profesion) profesionLogic.getProfesions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			profesion =(Profesion) profesions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Profesion profesionRow=new Profesion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesionRow=(Profesion) profesionLogic.getProfesions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			profesionRow=(Profesion) profesions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Profesion profesion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProfesion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion = (Profesion)this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.profesion = (Profesion)this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(profesion!=null) {
						this.profesion = profesion;
					} else {
						this.profesion = new Profesion();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.profesion)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame;
					}

					List<Profesion> profesions=new ArrayList<Profesion>();
					profesions.add(this.profesion);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProfesion.cargarClienteBeanSwingJInternalFrame(profesions,this.profesion,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProfesion=(TitledBorder)this.jScrollPanelDatosProfesion.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderProfesion.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.profesionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonProfesionEmpleaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Profesion profesion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProfesion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion = (Profesion)this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.profesion = (Profesion)this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(profesion!=null) {
						this.profesion = profesion;
					} else {
						this.profesion = new Profesion();
					}
				}

				if(this.isTienePermisosProfesionEmplea && this.permiteMantenimiento(this.profesion)) {
					ProfesionEmpleaBeanSwingJInternalFrame profesionempleaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup=new ProfesionEmpleaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						profesionempleaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup;
					} else {
						profesionempleaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame;
					}

					List<Profesion> profesions=new ArrayList<Profesion>();
					profesions.add(this.profesion);
					if(!esRelacionado) {
						//profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setConGuardarRelaciones(false);
						//profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					profesionempleaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProfesion.cargarProfesionEmpleaBeanSwingJInternalFrame(profesions,this.profesion,profesionempleaBeanSwingJInternalFrame,/*conInicializar,*/profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.getConGuardarRelaciones(),profesionempleaBeanSwingJInternalFrame.profesionempleaSessionBean.getEsGuardarRelacionado());
					profesionempleaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						profesionempleaBeanSwingJInternalFrame.actualizarEstadoPanelsProfesionEmplea("no_relacionado");

						profesionempleaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProfesionEmpleaConstantesFunciones.ITAMANIOFILATABLA + (ProfesionEmpleaConstantesFunciones.ITAMANIOFILATABLA/2));

						profesionempleaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProfesion=(TitledBorder)this.jScrollPanelDatosProfesion.getBorder();
						TitledBorder titledBorderProfesionEmplea=(TitledBorder)profesionempleaBeanSwingJInternalFrame.jScrollPanelDatosProfesionEmplea.getBorder();

						titledBorderProfesionEmplea.setTitle(titledBorderProfesion.getTitle() + " -> Profesion Emplea");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,profesionempleaBeanSwingJInternalFrame);
						}

						profesionempleaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(profesionempleaBeanSwingJInternalFrame);

						profesionempleaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.profesionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Profesion Emplea",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonReferenciaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Profesion profesion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormProfesion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion = (Profesion)this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.profesion = (Profesion)this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(profesion!=null) {
						this.profesion = profesion;
					} else {
						this.profesion = new Profesion();
					}
				}

				if(this.isTienePermisosReferencia && this.permiteMantenimiento(this.profesion)) {
					ReferenciaBeanSwingJInternalFrame referenciaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup=new ReferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup;
					} else {
						referenciaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame;
					}

					List<Profesion> profesions=new ArrayList<Profesion>();
					profesions.add(this.profesion);
					if(!esRelacionado) {
						//referenciaBeanSwingJInternalFrame.referenciaSessionBean.setConGuardarRelaciones(false);
						//referenciaBeanSwingJInternalFrame.referenciaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormProfesion.cargarReferenciaBeanSwingJInternalFrame(profesions,this.profesion,referenciaBeanSwingJInternalFrame,/*conInicializar,*/referenciaBeanSwingJInternalFrame.referenciaSessionBean.getConGuardarRelaciones(),referenciaBeanSwingJInternalFrame.referenciaSessionBean.getEsGuardarRelacionado());
					referenciaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciaBeanSwingJInternalFrame.actualizarEstadoPanelsReferencia("no_relacionado");

						referenciaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderProfesion=(TitledBorder)this.jScrollPanelDatosProfesion.getBorder();
						TitledBorder titledBorderReferencia=(TitledBorder)referenciaBeanSwingJInternalFrame.jScrollPanelDatosReferencia.getBorder();

						titledBorderReferencia.setTitle(titledBorderProfesion.getTitle() + " -> Referencia");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciaBeanSwingJInternalFrame);
						}

						referenciaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciaBeanSwingJInternalFrame);

						referenciaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.profesionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualProfesion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion));			
			this.jButtonDuplicarProfesion.setVisible((this.isVisibilidadCeldaDuplicarProfesion && this.isPermisoDuplicarProfesion));			
			this.jButtonCopiarProfesion.setVisible((this.isVisibilidadCeldaCopiarProfesion && this.isPermisoCopiarProfesion));
			this.jButtonVerFormProfesion.setVisible((this.isVisibilidadCeldaVerFormProfesion && this.isPermisoVerFormProfesion));
			
			this.jButtonAbrirOrderByProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));			
			
			this.jButtonNuevoRelacionesProfesion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesion && this.isPermisoNuevoProfesion));			
			this.jButtonNuevoGuardarCambiosProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion && this.isPermisoGuardarCambiosProfesion));
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.jInternalFrameDetalleFormProfesion.jButtonModificarProfesion.setVisible((this.isVisibilidadCeldaModificarProfesion && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.setVisible((this.isVisibilidadCeldaActualizarProfesion && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.setVisible((this.isVisibilidadCeldaEliminarProfesion && this.isPermisoEliminarProfesion));
			this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.setVisible(this.isVisibilidadCeldaCancelarProfesion);							
			this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.setVisible((this.isVisibilidadCeldaGuardarProfesion && this.isPermisoGuardarCambiosProfesion));			
			
			}
						
			this.jButtonGuardarCambiosTablaProfesion.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesion && this.isPermisoGuardarCambiosProfesion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion));						
			this.jButtonDuplicarToolBarProfesion.setVisible((this.isVisibilidadCeldaDuplicarProfesion && this.isPermisoDuplicarProfesion));						
			this.jButtonCopiarToolBarProfesion.setVisible((this.isVisibilidadCeldaCopiarProfesion && this.isPermisoCopiarProfesion));			
			this.jButtonVerFormToolBarProfesion.setVisible((this.isVisibilidadCeldaVerFormProfesion && this.isPermisoVerFormProfesion));			
			this.jButtonAbrirOrderByToolBarProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));
			this.jButtonNuevoRelacionesToolBarProfesion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesion && this.isPermisoNuevoProfesion));			
			this.jButtonNuevoGuardarCambiosToolBarProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion && this.isPermisoGuardarCambiosProfesion));			
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.jInternalFrameDetalleFormProfesion.jButtonModificarToolBarProfesion.setVisible((this.isVisibilidadCeldaModificarProfesion && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jButtonActualizarToolBarProfesion.setVisible((this.isVisibilidadCeldaActualizarProfesion  && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jButtonEliminarToolBarProfesion.setVisible((this.isVisibilidadCeldaEliminarProfesion && this.isPermisoEliminarProfesion));
			this.jInternalFrameDetalleFormProfesion.jButtonCancelarToolBarProfesion.setVisible(this.isVisibilidadCeldaCancelarProfesion);				
			this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosToolBarProfesion.setVisible((this.isVisibilidadCeldaGuardarProfesion && this.isPermisoGuardarCambiosProfesion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarProfesion.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesion && this.isPermisoGuardarCambiosProfesion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion));			
			this.jMenuItemDuplicarProfesion.setVisible((this.isVisibilidadCeldaDuplicarProfesion && this.isPermisoDuplicarProfesion));			
			this.jMenuItemCopiarProfesion.setVisible((this.isVisibilidadCeldaCopiarProfesion && this.isPermisoCopiarProfesion));			
			this.jMenuItemVerFormProfesion.setVisible((this.isVisibilidadCeldaVerFormProfesion && this.isPermisoVerFormProfesion));			
			this.jMenuItemAbrirOrderByProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));			
			//this.jMenuItemMostrarOcultarProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));
			this.jMenuItemDetalleAbrirOrderByProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));			
			//this.jMenuItemDetalleMostrarOcultarProfesion.setVisible((this.isVisibilidadCeldaOrdenProfesion && this.isPermisoOrdenProfesion));			
			this.jMenuItemNuevoRelacionesProfesion.setVisible((this.isVisibilidadCeldaNuevoRelacionesProfesion && this.isPermisoNuevoProfesion));			
			this.jMenuItemNuevoGuardarCambiosProfesion.setVisible((this.isVisibilidadCeldaNuevoProfesion && this.isPermisoNuevoProfesion && this.isPermisoGuardarCambiosProfesion));									
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.jInternalFrameDetalleFormProfesion.jMenuItemModificarProfesion.setVisible((this.isVisibilidadCeldaModificarProfesion && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jMenuItemActualizarProfesion.setVisible((this.isVisibilidadCeldaActualizarProfesion && this.isPermisoActualizarProfesion));	
			this.jInternalFrameDetalleFormProfesion.jMenuItemEliminarProfesion.setVisible((this.isVisibilidadCeldaEliminarProfesion && this.isPermisoEliminarProfesion));
			this.jInternalFrameDetalleFormProfesion.jMenuItemCancelarProfesion.setVisible(this.isVisibilidadCeldaCancelarProfesion);				
			}
			
			this.jMenuItemGuardarCambiosProfesion.setVisible((this.isVisibilidadCeldaGuardarProfesion && this.isPermisoGuardarCambiosProfesion));						
			this.jMenuItemGuardarCambiosTablaProfesion.setVisible((this.isVisibilidadCeldaGuardarCambiosProfesion && this.isPermisoGuardarCambiosProfesion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoProfesion=this.jButtonNuevoProfesion.isVisible();
			this.isVisibilidadCeldaDuplicarProfesion=this.jButtonDuplicarProfesion.isVisible();
			this.isVisibilidadCeldaCopiarProfesion=this.jButtonCopiarProfesion.isVisible();
			this.isVisibilidadCeldaVerFormProfesion=this.jButtonVerFormProfesion.isVisible();
			
			this.isVisibilidadCeldaOrdenProfesion=this.jButtonAbrirOrderByProfesion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesProfesion=this.jButtonNuevoRelacionesProfesion.isVisible();
			this.isVisibilidadCeldaModificarProfesion=this.jButtonModificarProfesion.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.isVisibilidadCeldaActualizarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.isVisible();
			this.isVisibilidadCeldaEliminarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.isVisible();
			this.isVisibilidadCeldaCancelarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.isVisible();
			this.isVisibilidadCeldaGuardarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosProfesion=this.jButtonGuardarCambiosTablaProfesion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoProfesion=this.jButtonNuevoToolBarProfesion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProfesion=this.jButtonNuevoRelacionesToolBarProfesion.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.isVisibilidadCeldaModificarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonModificarToolBarProfesion.isVisible();
			this.isVisibilidadCeldaActualizarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonActualizarToolBarProfesion.isVisible();
			this.isVisibilidadCeldaEliminarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonEliminarToolBarProfesion.isVisible();
			this.isVisibilidadCeldaCancelarProfesion=this.jInternalFrameDetalleFormProfesion.jButtonCancelarToolBarProfesion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProfesion=this.jButtonGuardarCambiosToolBarProfesion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProfesion=this.jButtonGuardarCambiosTablaToolBarProfesion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoProfesion=this.jMenuItemNuevoProfesion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesProfesion=this.jMenuItemNuevoRelacionesProfesion.isVisible();
			
			if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.isVisibilidadCeldaModificarProfesion=this.jInternalFrameDetalleFormProfesion.jMenuItemModificarProfesion.isVisible();
			this.isVisibilidadCeldaActualizarProfesion=this.jInternalFrameDetalleFormProfesion.jMenuItemActualizarProfesion.isVisible();
			this.isVisibilidadCeldaEliminarProfesion=this.jInternalFrameDetalleFormProfesion.jMenuItemEliminarProfesion.isVisible();
			this.isVisibilidadCeldaCancelarProfesion=this.jInternalFrameDetalleFormProfesion.jMenuItemCancelarProfesion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarProfesion=this.jMenuItemGuardarCambiosProfesion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosProfesion=this.jMenuItemGuardarCambiosTablaProfesion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesProfesion(Boolean esInicializar) {
		if(ProfesionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.profesionSessionBean.getConGuardarRelaciones()) {
				//if(this.profesionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesProfesion();
			}
			
			this.inicializarActualizarBindingBotonesManualProfesion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualProfesion() {
		this.jButtonNuevoProfesion.setVisible(this.isPermisoNuevoProfesion);			
		this.jButtonDuplicarProfesion.setVisible(this.isPermisoDuplicarProfesion);			
		this.jButtonCopiarProfesion.setVisible(this.isPermisoCopiarProfesion);			
		this.jButtonVerFormProfesion.setVisible(this.isPermisoVerFormProfesion);			
		
		this.jButtonAbrirOrderByProfesion.setVisible(this.isPermisoOrdenProfesion);					
		
		this.jButtonNuevoRelacionesProfesion.setVisible(this.isPermisoNuevoProfesion);			
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonModificarProfesion.setVisible(this.isPermisoActualizarProfesion);	
			this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.setVisible(this.isPermisoActualizarProfesion);	
			this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.setVisible(this.isPermisoEliminarProfesion);
			this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.setVisible(this.isVisibilidadCeldaCancelarProfesion);						
			this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.setVisible(this.isPermisoGuardarCambiosProfesion);							
		}
		
		this.jButtonGuardarCambiosTablaProfesion.setVisible(this.isPermisoActualizarProfesion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleProfesion() {
		this.jInternalFrameDetalleFormProfesion.jButtonModificarProfesion.setVisible(this.isPermisoActualizarProfesion);	
		this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.setVisible(this.isPermisoActualizarProfesion);	
		this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.setVisible(this.isPermisoEliminarProfesion);
		this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.setVisible(this.isVisibilidadCeldaCancelarProfesion);							
		this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.setVisible((this.isVisibilidadCeldaGuardarProfesion && this.isPermisoGuardarCambiosProfesion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosProfesion() {
		if(ProfesionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualProfesion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesProfesion() {
	}
	
	public void jTableDatosProfesionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarProfesion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidProfesionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesion(this.getprofesion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesion==null) {
						this.profesion = new Profesion();
					}

					this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
				}

				if(this.profesion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.profesion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoProfesionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesion(this.getprofesion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesion==null) {
						this.profesion = new Profesion();
					}

					this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
				}

				if(this.profesion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.profesion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreProfesionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosProfesion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualProfesion(this.getprofesion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.profesion==null) {
						this.profesion = new Profesion();
					}

					this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);
				}

				if(this.profesion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.profesion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingProfesion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoProfesionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProfesion(false,false);

			this.getProfesionsBusquedaPorCodigo();

			this.inicializarActualizarBindingProfesion(false);

			//if(ProfesionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProfesion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreProfesionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingProfesion(false,false);

			this.getProfesionsBusquedaPorNombre();

			this.inicializarActualizarBindingProfesion(false);

			//if(ProfesionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingProfesion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.profesionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameProfesion() {
		if(this.jInternalFrameDetalleFormProfesion!=null) {
		

		if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
			this.jInternalFrameDetalleFormProfesion.setVisible(false);	    			
			this.jInternalFrameDetalleFormProfesion.dispose();
			this.jInternalFrameDetalleFormProfesion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoProfesion!=null) {
			this.jInternalFrameReporteDinamicoProfesion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoProfesion.dispose();
			this.jInternalFrameReporteDinamicoProfesion=null;
		}
		
		if(this.jInternalFrameImportacionProfesion!=null) {
			this.jInternalFrameImportacionProfesion.setVisible(false);	    			
			this.jInternalFrameImportacionProfesion.dispose();
			this.jInternalFrameImportacionProfesion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessProfesion();
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			
			if(sTipo.equals("NuevoProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarProfesion")) {
				jButtonDuplicarProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarProfesion")) {
				jButtonCopiarProfesionActionPerformed(evt);
			} else if(sTipo.equals("VerFormProfesion")) {
				jButtonVerFormProfesionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarProfesion")) {
				jButtonDuplicarProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarProfesion")) {
				jButtonDuplicarProfesionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarProfesion")) {
				jButtonModificarProfesionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarProfesion")) {
				jButtonModificarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarProfesion")) {
				jButtonModificarProfesionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarProfesion")) {
				jButtonActualizarProfesionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarProfesion")) {
				jButtonActualizarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarProfesion")) {
				jButtonActualizarProfesionActionPerformed(evt);
			} else if(sTipo.equals("EliminarProfesion")) {
				jButtonEliminarProfesionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarProfesion")) {
				jButtonEliminarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarProfesion")) {
				jButtonEliminarProfesionActionPerformed(evt);
			} else if(sTipo.equals("CancelarProfesion")) {
				jButtonCancelarProfesionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarProfesion")) {
				jButtonCancelarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarProfesion")) {
				jButtonCancelarProfesionActionPerformed(evt);
			} else if(sTipo.equals("CerrarProfesion")) {
				jButtonCerrarProfesionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarProfesion")) {
				jButtonCerrarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarProfesion")) {
				jButtonCerrarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarProfesion")) {
				jButtonMostrarOcultarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarProfesion")) {
				jButtonCancelarProfesionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarProfesion")) {
				jButtonCopiarProfesionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarProfesion")) {
				jButtonVerFormProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarProfesion")) {
				jButtonCopiarProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormProfesion")) {
				jButtonVerFormProfesionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionProfesion")) {
				jButtonRecargarInformacionProfesionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarProfesion")) {
				jButtonRecargarInformacionProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionProfesion")) {
				jButtonRecargarInformacionProfesionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresProfesion")) {
				jButtonAnterioresProfesionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarProfesion")) {
				jButtonAnterioresProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreProfesion")) {
				jButtonAnterioresProfesionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesProfesion")) {
				jButtonSiguientesProfesionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarProfesion")) {
				jButtonSiguientesProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesProfesion")) {
				jButtonSiguientesProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByProfesion") || sTipo.equals("MenuItemDetalleAbrirOrderByProfesion")) {
				jButtonAbrirOrderByProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarProfesion") || sTipo.equals("MenuItemDetalleMostrarOcultarProfesion")) {
				jButtonMostrarOcultarProfesionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosProfesion")) {
				jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarProfesion")) {
				jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosProfesion")) {
				jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoProfesion")) {
				jButtonCerrarReporteDinamicoProfesionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoProfesion")) {
				jButtonGenerarReporteDinamicoProfesionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoProfesion")) {
				
				jButtonGenerarExcelReporteDinamicoProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionProfesion")) {
				jButtonCerrarImportacionProfesionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionProfesion")) {
				
				jButtonGenerarImportacionProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionProfesion")) {
				
				jButtonAbrirImportacionProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesProfesion")) {
				jComboBoxTiposAccionesProfesionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesProfesion")) {
				jComboBoxTiposRelacionesProfesionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioProfesion")) {
				jComboBoxTiposAccionesProfesionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarProfesion")) {
				
				jComboBoxTiposSeleccionarProfesionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralProfesion")) {
				jTextFieldValorCampoGeneralProfesionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByProfesion")) {
				jButtonAbrirOrderByProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarProfesion")) {
				jButtonAbrirOrderByProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByProfesion")) {
				jButtonCerrarOrderByProfesionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProfesionBusqueda")) {
				this.jButtonidProfesionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProfesionBusqueda")) {
				this.jButtoncodigoProfesionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProfesionBusqueda")) {
				this.jButtonnombreProfesionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoProfesion")) {
				this.jButtonBusquedaPorCodigoProfesionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreProfesion")) {
				this.jButtonBusquedaPorNombreProfesionActionPerformed(evt);
			}
			
			;
			
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessProfesion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Profesion profesionLocal=null;
			
			if(!this.getEsControlTabla()) {
				profesionLocal=this.profesion;
			} else {
				profesionLocal=this.profesionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
							
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
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
			
			


			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
								
						
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
								
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
							
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
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
			
			


			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
								
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosProfesion")) {
					jCheckBoxSeleccionarTodosProfesionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosProfesion")) {
					jCheckBoxSeleccionadosProfesionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarProfesion")) {
					
				}
				
				


				
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
												
				
				


				
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
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
			
			


			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaProfesionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.profesion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.profesion);
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
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
				
				


				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Profesion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Profesion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaProfesionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.profesionAnterior =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.profesionAnterior =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarProfesion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosProfesionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosProfesion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.profesion =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.profesion =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.profesion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarProfesion")) {
				
				}
				
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarProfesion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosProfesion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarProfesion")) {
			
			}
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessProfesion();
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			if(sTipo.equals("NuevoProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarProfesion")) {
				jButtonDuplicarProfesionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarProfesion")) {
				jButtonCopiarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormProfesion")) {
				jButtonVerFormProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesProfesion")) {
				jButtonNuevoProfesionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarProfesion")) {
				jButtonModificarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarProfesion")) {
				jButtonActualizarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarProfesion")) {
				jButtonEliminarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarProfesion")) {
				jButtonCancelarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarProfesion")) {
				jButtonCerrarProfesionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosProfesion")) {
				jButtonGuardarCambiosProfesionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosProfesion")) {
				jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByProfesion")) {
				jButtonAbrirOrderByProfesionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionProfesion")) {
				jButtonRecargarInformacionProfesionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresProfesion")) {
				jButtonAnterioresProfesionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesProfesion")) {
				jButtonSiguientesProfesionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idProfesionBusqueda")) {
				this.jButtonidProfesionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoProfesionBusqueda")) {
				this.jButtoncodigoProfesionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreProfesionBusqueda")) {
				this.jButtonnombreProfesionBusquedaActionPerformed(evt);
			}
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessProfesion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameProfesion")) {
				closingInternalFrameProfesion();
				
			} else if(sTipo.equals("jButtonCancelarProfesion")) {
				JInternalFrameBase jInternalFrameDetalleFormProfesion = (JInternalFrameBase)evt.getSource();
	            	
	            ProfesionBeanSwingJInternalFrame jInternalFrameParent=(ProfesionBeanSwingJInternalFrame)jInternalFrameDetalleFormProfesion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarProfesionActionPerformed(null);
			}
			
			ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.profesion,new Object(),this.profesionParameterGeneral,this.profesionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormProfesion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormProfesion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormProfesion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.profesion)) {
			if(!esControlTabla) {
				if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);			
				}
				
				if(this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualProfesion(this.profesion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.profesionReturnGeneral=profesionLogic.procesarEventosProfesionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionLogic.getProfesions(),this.profesion,this.profesionParameterGeneral,this.isEsNuevoProfesion,classes);//this.profesionLogic.getProfesion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanProfesion(this.profesionReturnGeneral,this.profesionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.profesionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanProfesion(classes,this.profesionReturnGeneral,this.profesionBean,false);
					}
						
					if(this.profesionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyProfesion(this.profesionReturnGeneral.getProfesion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioProfesion(this.profesionReturnGeneral.getProfesion());	
					}
						
					if(this.profesionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioProfesion(this.profesionReturnGeneral.getProfesion(),classes);//this.profesionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioProfesion(this.profesion,classes);//this.profesionBean);									
				}
			
				if(ProfesionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualProfesion(this.profesion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysProfesion(this.profesion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.profesionAnterior!=null) {
						this.profesion=this.profesionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.profesionReturnGeneral=profesionLogic.procesarEventosProfesionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesionLogic.getProfesions(),this.profesion,this.profesionParameterGeneral,this.isEsNuevoProfesion,classes);//this.profesionLogic.getProfesion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.profesionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.profesionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.profesionReturnGeneral.getProfesion(),profesionLogic.getProfesions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.profesionReturnGeneral.getProfesion(),this.profesions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosProfesion.repaint();
				
				//((AbstractTableModel) this.jTableDatosProfesion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosProfesion();
			}
		}
	}
	
	public void actualizarVisualTableDatosProfesion() throws Exception {
		
		ProfesionModel profesionModel=(ProfesionModel)this.jTableDatosProfesion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			profesionModel.profesions=this.profesionLogic.getProfesions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			profesionModel.profesions=this.profesions;
		}
		
		
		((ProfesionModel) this.jTableDatosProfesion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaProfesion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprofesionAnterior(),this.profesionLogic.getProfesions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprofesionAnterior(),this.profesions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosProfesion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioProfesion(Profesion profesion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(profesion.getClientes());
					this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProfesionEmplea.class)) {
					this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.setProfesionEmpleas(profesion.getProfesionEmpleas());
					this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesionEmplea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(profesion.getReferencias());
					this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
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
										
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesion,new Object(),generalEntityParameterGeneral,this.profesionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.profesionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ProfesionConstantesFunciones.getClassesRelationshipsOfProfesion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ProfesionConstantesFunciones.getClassesRelationshipsFromStringsOfProfesion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormProfesion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ProfesionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.profesion,new Object(),generalEntityParameterGeneral,this.profesionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioProfesion(ProfesionBean profesionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(profesion.getClientes());
					this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProfesionEmplea.class)) {
					this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.setProfesionEmpleas(profesion.getProfesionEmpleas());
					this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProfesionEmplea(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.setReferencias(profesion.getReferencias());
					this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferencia(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanProfesion(ArrayList<Classe> classes,ProfesionReturnGeneral profesionReturnGeneral,ProfesionBean profesionBean,Boolean conDefault) throws Exception {
		
			this.profesionBean.setClientes(profesionReturnGeneral.getProfesion().getClientes());
			this.profesionBean.setProfesionEmpleas(profesionReturnGeneral.getProfesion().getProfesionEmpleas());
			this.profesionBean.setReferencias(profesionReturnGeneral.getProfesion().getReferencias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualProfesion(Profesion profesion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					profesion.setClientes(this.jInternalFrameDetalleFormProfesion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ProfesionEmplea.class)) {
					profesion.setProfesionEmpleas(this.jInternalFrameDetalleFormProfesion.profesionempleaBeanSwingJInternalFrame.profesionempleaLogic.getProfesionEmpleas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Referencia.class)) {
					profesion.setReferencias(this.jInternalFrameDetalleFormProfesion.referenciaBeanSwingJInternalFrame.referenciaLogic.getReferencias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.profesion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormProfesion = new ProfesionDetalleFormJInternalFrame(jDesktopPane,this.profesionSessionBean.getConGuardarRelaciones(),this.profesionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormProfesion);
		this.jInternalFrameDetalleFormProfesion.setVisible(false);
		this.jInternalFrameDetalleFormProfesion.setSelected(false);						
		
		this.jInternalFrameDetalleFormProfesion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormProfesion.profesionLogic=this.profesionLogic;
		
		this.cargarCombosFrameForeignKeyProfesion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleProfesion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleProfesion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyProfesion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyProfesion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormProfesion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProfesion"));
		
		this.jInternalFrameDetalleFormProfesion.jButtonModificarProfesion.addActionListener(new ButtonActionListener(this,"ModificarProfesion"));

		
		this.jInternalFrameDetalleFormProfesion.jButtonModificarToolBarProfesion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProfesion"));
					
		this.jInternalFrameDetalleFormProfesion.jMenuItemModificarProfesion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProfesion"));		
		
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.addActionListener (new ButtonActionListener(this,"ActualizarProfesion"));
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonActualizarToolBarProfesion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProfesion"));
						
		this.jInternalFrameDetalleFormProfesion.jMenuItemActualizarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProfesion"));		
		
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.addActionListener (new ButtonActionListener(this,"EliminarProfesion"));
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonEliminarToolBarProfesion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProfesion"));
								
		this.jInternalFrameDetalleFormProfesion.jMenuItemEliminarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProfesion"));		
		
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.addActionListener (new ButtonActionListener(this,"CancelarProfesion"));
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonCancelarToolBarProfesion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProfesion"));
					
		this.jInternalFrameDetalleFormProfesion.jMenuItemCancelarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProfesion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormProfesion.jMenuItemDetalleCerrarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProfesion"));		
		
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosToolBarProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesion"));
		
		
		
		this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosToolBarProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesion"));
		
		
		
		this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProfesion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonidProfesionBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtoncodigoProfesionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonnombreProfesionBusqueda.addActionListener(new ButtonActionListener(this,"nombreProfesionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProfesion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameProfesion"));
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarProfesion"));
		}
		
		this.jTableDatosProfesion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarProfesion"));
		
		this.jTableDatosProfesion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarProfesion"));
		
		this.jButtonNuevoProfesion.addActionListener(new ButtonActionListener(this,"NuevoProfesion"));
		
		this.jButtonDuplicarProfesion.addActionListener(new ButtonActionListener(this,"DuplicarProfesion"));
		
		this.jButtonCopiarProfesion.addActionListener(new ButtonActionListener(this,"CopiarProfesion"));
		
		this.jButtonVerFormProfesion.addActionListener(new ButtonActionListener(this,"VerFormProfesion"));
		
		
		this.jButtonNuevoToolBarProfesion.addActionListener(new ButtonActionListener(this,"NuevoToolBarProfesion"));
			
		this.jButtonDuplicarToolBarProfesion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarProfesion"));
			
		this.jMenuItemNuevoProfesion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoProfesion"));
			
		this.jMenuItemDuplicarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarProfesion"));		
		
		
		this.jButtonNuevoRelacionesProfesion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesProfesion"));
		
		
		this.jButtonNuevoRelacionesToolBarProfesion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarProfesion"));
			
		this.jMenuItemNuevoRelacionesProfesion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesProfesion"));		
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonModificarProfesion.addActionListener(new ButtonActionListener(this,"ModificarProfesion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonModificarToolBarProfesion.addActionListener(new ButtonActionListener(this,"ModificarToolBarProfesion"));
			
			this.jInternalFrameDetalleFormProfesion.jMenuItemModificarProfesion.addActionListener(new ButtonActionListener(this,"MenuItemModificarProfesion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormProfesion.jButtonActualizarProfesion.addActionListener (new ButtonActionListener(this,"ActualizarProfesion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonActualizarToolBarProfesion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarProfesion"));
				
			this.jInternalFrameDetalleFormProfesion.jMenuItemActualizarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarProfesion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonEliminarProfesion.addActionListener (new ButtonActionListener(this,"EliminarProfesion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonEliminarToolBarProfesion.addActionListener (new ButtonActionListener(this,"EliminarToolBarProfesion"));
						
			this.jInternalFrameDetalleFormProfesion.jMenuItemEliminarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarProfesion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonCancelarProfesion.addActionListener (new ButtonActionListener(this,"CancelarProfesion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonCancelarToolBarProfesion.addActionListener (new ButtonActionListener(this,"CancelarToolBarProfesion"));
			
			this.jInternalFrameDetalleFormProfesion.jMenuItemCancelarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarProfesion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarProfesion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarProfesion"));		
		
		
		this.jButtonCerrarProfesion.addActionListener (new ButtonActionListener(this,"CerrarProfesion"));
		
		
		this.jButtonCerrarToolBarProfesion.addActionListener (new ButtonActionListener(this,"CerrarToolBarProfesion"));
			
		this.jMenuItemCerrarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarProfesion"));
			
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jMenuItemDetalleCerrarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarProfesion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosProfesion"));
		}
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosToolBarProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarProfesion"));
		}
		
		this.jButtonCopiarToolBarProfesion.addActionListener (new ButtonActionListener(this,"CopiarToolBarProfesion"));
			
		this.jButtonVerFormToolBarProfesion.addActionListener (new ButtonActionListener(this,"VerFormToolBarProfesion"));
		
		this.jMenuItemGuardarCambiosProfesion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosProfesion"));
			
		this.jMenuItemCopiarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarProfesion"));		
		
		this.jMenuItemVerFormProfesion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormProfesion"));		
		
		
		this.jButtonGuardarCambiosTablaProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProfesion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarProfesion"));
			
		this.jMenuItemGuardarCambiosTablaProfesion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaProfesion"));		
		
		
		
		this.jButtonRecargarInformacionProfesion.addActionListener (new ButtonActionListener(this,"RecargarInformacionProfesion"));
					
		this.jButtonRecargarInformacionToolBarProfesion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarProfesion"));
		
		this.jMenuItemRecargarInformacionProfesion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionProfesion"));		
		
		
		
		this.jButtonAnterioresProfesion.addActionListener (new ButtonActionListener(this,"AnterioresProfesion"));
		
		
		this.jButtonAnterioresToolBarProfesion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarProfesion"));
		
		this.jMenuItemAnterioresProfesion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresProfesion"));		
		
		
		this.jButtonSiguientesProfesion.addActionListener (new ButtonActionListener(this,"SiguientesProfesion"));
		
		
		this.jButtonSiguientesToolBarProfesion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarProfesion"));
			
		this.jMenuItemSiguientesProfesion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesProfesion"));
			
		this.jMenuItemAbrirOrderByProfesion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByProfesion"));
			
		this.jMenuItemMostrarOcultarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarProfesion"));
			
		this.jMenuItemDetalleAbrirOrderByProfesion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByProfesion"));
			
		this.jMenuItemDetalleMostarOcultarProfesion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarProfesion"));		
		
		
		this.jButtonNuevoGuardarCambiosProfesion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosProfesion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarProfesion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarProfesion"));
			
		this.jMenuItemNuevoGuardarCambiosProfesion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosProfesion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosProfesion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosProfesion"));

		this.jCheckBoxSeleccionadosProfesion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosProfesion"));
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioProfesion"));
		}
		
		
		this.jComboBoxTiposRelacionesProfesion.addActionListener (new ButtonActionListener(this,"TiposRelacionesProfesion"));
			
		this.jComboBoxTiposAccionesProfesion.addActionListener (new ButtonActionListener(this,"TiposAccionesProfesion"));
					
		this.jComboBoxTiposSeleccionarProfesion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarProfesion"));
			
		this.jTextFieldValorCampoGeneralProfesion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralProfesion"));		
		
		
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonidProfesionBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtoncodigoProfesionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonnombreProfesionBusqueda.addActionListener(new ButtonActionListener(this,"nombreProfesionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoProfesion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoProfesion"));

			this.jButtonBusquedaPorNombreProfesion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreProfesion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoProfesion!=null) {
				this.jInternalFrameReporteDinamicoProfesion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesion"));
				this.jInternalFrameReporteDinamicoProfesion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesion"));
				this.jInternalFrameReporteDinamicoProfesion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesion"));
			}
			
			//this.jButtonCerrarReporteDinamicoProfesion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoProfesion"));				
			//this.jButtonGenerarReporteDinamicoProfesion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoProfesion"));
			//this.jButtonGenerarExcelReporteDinamicoProfesion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoProfesion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionProfesion!=null) {
				this.jInternalFrameImportacionProfesion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionProfesion"));
				this.jInternalFrameImportacionProfesion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionProfesion"));
				this.jInternalFrameImportacionProfesion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionProfesion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByProfesion.addActionListener (new ButtonActionListener(this,"AbrirOrderByProfesion"));
			
			this.jButtonAbrirOrderByToolBarProfesion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarProfesion"));			
			
			if(this.jInternalFrameOrderByProfesion!=null) {
				this.jInternalFrameOrderByProfesion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByProfesion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormProfesion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormProfesion.jTabbedPaneRelacionesProfesion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesProfesion"));
		
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
            		closingInternalFrameProfesion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormProfesion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormProfesion = (JInternalFrameBase)event.getSource();
	            	
	            ProfesionBeanSwingJInternalFrame jInternalFrameParent=(ProfesionBeanSwingJInternalFrame)jInternalFrameDetalleFormProfesion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarProfesionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosProfesion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosProfesionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosProfesion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosProfesion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoProfesion";
		inputMap = this.jButtonNuevoProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProfesionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoProfesionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesProfesion";
		inputMap = this.jButtonNuevoRelacionesProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoProfesionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarProfesion";
		inputMap = this.jButtonModificarProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarProfesion";
		inputMap = this.jButtonActualizarProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarProfesion";
		inputMap = this.jButtonEliminarProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarProfesion";
		inputMap = this.jButtonCancelarProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarProfesion";
		inputMap = this.jButtonCerrarProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosProfesion";
		inputMap = this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormProfesion.jButtonGuardarCambiosProfesion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosProfesionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosProfesion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosProfesionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesProfesion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesProfesionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarProfesion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarProfesionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralProfesion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralProfesionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonidProfesionBusqueda.addActionListener(new ButtonActionListener(this,"idProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtoncodigoProfesionBusqueda.addActionListener(new ButtonActionListener(this,"codigoProfesionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormProfesion.jButtonnombreProfesionBusqueda.addActionListener(new ButtonActionListener(this,"nombreProfesionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoProfesion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoProfesion"));

		this.jButtonBusquedaPorNombreProfesion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreProfesion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionProfesion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionProfesionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarProfesionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarProfesion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosProfesion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
					profesionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Profesion profesionAux:profesions) {
					profesionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosProfesionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProfesion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
						profesionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Profesion profesionAux:profesions) {
						profesionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Profesion profesionAux:profesions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaProfesion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProfesion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProfesion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProfesion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosProfesionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingProfesion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosProfesion.getSelectedRows();
			
			Profesion profesionLocal=new Profesion();
			
			//this.seleccionarTodosProfesion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					profesionLocal =(Profesion) this.profesionLogic.getProfesions().toArray()[this.jTableDatosProfesion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					profesionLocal =(Profesion) this.profesions.toArray()[this.jTableDatosProfesion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				profesionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
						profesionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Profesion profesionAux:profesions) {
						profesionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaProfesion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosProfesion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosProfesion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosProfesion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualProfesionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarProfesionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralProfesionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingProfesion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralProfesion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Profesion profesionAux:this.profesionLogic.getProfesions()) {
				
						if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							profesionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							profesionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Profesion profesionAux:profesions) {
					
						if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							profesionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							profesionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaProfesion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesProfesionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingProfesion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioProfesion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesProfesion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteProfesion) {				
					conSplash=true;//false;										
					
					//this.startProcessProfesion(conSplash);
				
					this.generarReporteProfesionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoProfesionsSeleccionados();
				//this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProfesionsSeleccionados(false);
				//this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoProfesionsSeleccionados(true);
				//this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProfesion();
				
				this.exportarProfesionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionProfesions();
				//this.importarProfesions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessProfesion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelProfesionsSeleccionados();
				//this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Profesion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessProfesion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoProfesion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyProfesion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
				}	
			} 			
			else if(ProfesionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteProfesion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessProfesion(conSplash);
					
						//this.actualizarParametrosGeneralProfesion();
						
						this.generarReporteProcesoAccionProfesionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ProfesionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ProfesionES SELECCIONADOS?", "MANTENIMIENTO DE Profesion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessProfesion();
				
						this.actualizarParametrosGeneralProfesion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.profesionReturnGeneral=profesionLogic.procesarAccionProfesionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.profesionLogic.getProfesions(),this.profesionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarProfesionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralProfesion();
					
					ProfesionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarProfesionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesProfesion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormProfesion.jComboBoxTiposAccionesFormularioProfesion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessProfesion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesProfesionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessProfesion();
			
			if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
			Profesion profesion=new Profesion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingProfesion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesProfesion.getSelectedItem();
			
			
			
			
			profesionsSeleccionados=this.getProfesionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(profesionsSeleccionados.size()==1) {
				for(Profesion profesionAux:profesionsSeleccionados) {
					profesion=profesionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,profesion);
				}
				else if(this.sTipoRelacion.equals("Profesion Emplea")) {
					jButtonProfesionEmpleaActionPerformed(null,rowIndex,true,false,profesion);
				}
				else if(this.sTipoRelacion.equals("Referencia")) {
					jButtonReferenciaActionPerformed(null,rowIndex,true,false,profesion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessProfesion();
			
      		//this.finishProcessProfesion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarProfesionReturnGeneral() throws Exception {
		if(this.profesionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.profesionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.profesionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.profesionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.profesionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.profesionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingProfesion(false);
		}
		
		if(this.profesionReturnGeneral.getConRetornoLista() || this.profesionReturnGeneral.getConRetornoObjeto()) {
			if(this.profesionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.profesionLogic.setProfesions(this.profesionReturnGeneral.getProfesions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.profesionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.profesionLogic.setProfesion(this.profesionReturnGeneral.getProfesion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingProfesion(false);
		}
	}
	
	public void actualizarParametrosGeneralProfesion() throws Exception {
		
		
	}
	
	public ArrayList<Profesion> getProfesionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioProfesion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Profesion profesionAux:profesionLogic.getProfesions()) {
					if(profesionAux.getIsSelected()) {
						profesionsSeleccionados.add(profesionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Profesion profesionAux:this.profesions) {
					if(profesionAux.getIsSelected()) {
						profesionsSeleccionados.add(profesionAux);				
					}
				}
			}
			
			if(profesionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						profesionsSeleccionados.addAll(this.profesionLogic.getProfesions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						profesionsSeleccionados.addAll(this.profesions);				
					}
				}
			}
		} else {
			profesionsSeleccionados.add(this.profesion);
		}
		
		return profesionsSeleccionados;
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
	
	public void generarReporteProfesionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalProfesionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoProfesionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProfesionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoProfesionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesProfesionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Profesion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteProfesions("Todos",profesionsSeleccionados);
		
	}	
	
	public void generarReporteNormalProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteProfesions("Todos",profesionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionProfesionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteProfesions("Todos",profesionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoProfesion();
		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoProfesion();
		
		
		//this.generarReporteProfesions("Todos",profesionsSeleccionados ,profesionImplementable,profesionImplementableHome);
	}
	
	public void mostrarImportacionProfesions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionProfesion();
		
		this.abrirFrameImportacionProfesion();		
		
			
		//this.generarReporteProfesions("Todos",profesionsSeleccionados ,profesionImplementable,profesionImplementableHome);
	}
	
	public void importarProfesions() throws Exception {		
	
	}
	
	public void exportarProfesionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelProfesionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoProfesionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlProfesionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Profesion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarProfesion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Profesion profesionAux:profesionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarProfesion(profesionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//profesionAux.setsDetalleGeneralEntityReporte(profesionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarProfesion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ProfesionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ProfesionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarProfesion(Profesion profesion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=profesion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=profesion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=profesion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=profesion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Profesions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelProfesion(row);				
				iRow++;
			}				
			
			for(Profesion profesionAux:profesionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelProfesion(profesionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlProfesionsSeleccionados() throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();		
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"profesion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("profesions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("profesion");
			//elementRoot.appendChild(element);
		
			for(Profesion profesionAux:profesionsSeleccionados) {
				element = document.createElement("profesion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlProfesion(profesionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.profesionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Profesion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelProfesion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ProfesionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelProfesion(Profesion profesion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(profesion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(profesion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(profesion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlProfesion(Profesion profesion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ProfesionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(profesion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ProfesionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(profesion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ProfesionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(profesion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ProfesionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(profesion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoProfesionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Profesion> profesionsSeleccionados=new ArrayList<Profesion>();
		
		profesionsSeleccionados=this.getProfesionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoProfesion(profesionsSeleccionados);
		
		this.generarReporteProfesions("Todos",profesionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoProfesion(ArrayList<Profesion> profesionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Profesion profesionAux:profesionsSeleccionados) {
				profesionAux.setsDetalleGeneralEntityReporte(profesionAux.toString());
			
				if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					profesionAux.setsDescripcionGeneralEntityReporte1(profesionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ProfesionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					profesionAux.setsDescripcionGeneralEntityReporte1(profesionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ProfesionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesProfesion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoProfesion=true;
				this.isVisibilidadCeldaNuevoRelacionesProfesion=true;
				this.isVisibilidadCeldaGuardarCambiosProfesion=true;
			}
			
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=true;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=true;
			this.isVisibilidadCeldaEliminarProfesion=true;
			this.isVisibilidadCeldaCancelarProfesion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=true;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoProfesion=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=true;
			this.isVisibilidadCeldaGuardarCambiosProfesion=true;
			this.isVisibilidadCeldaModificarProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=true;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
			this.isVisibilidadCeldaModificarProfesion=true;
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
			this.isVisibilidadCeldaCancelarProfesion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarProfesion=false;
				} else {
					this.isVisibilidadCeldaGuardarProfesion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ProfesionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoProfesion=true;
			this.isVisibilidadCeldaNuevoRelacionesProfesion=true;
			this.isVisibilidadCeldaGuardarCambiosProfesion=true;
		} else {
			this.actualizarEstadoPanelsProfesion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarProfesion=false;
			//this.isVisibilidadCeldaVerFormProfesion=false;
			this.isVisibilidadCeldaDuplicarProfesion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!profesionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
		} else {
			this.isVisibilidadCeldaNuevoProfesion=false;
			this.isVisibilidadCeldaGuardarCambiosProfesion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(profesionSessionBean.getEsGuardarRelacionado()) {
			if(!profesionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesProfesion=false;												
			}
			
			this.jButtonCerrarProfesion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesProfesion=false;
		}
		
		if(!this.permiteMantenimiento(this.profesion)) {
			this.isVisibilidadCeldaActualizarProfesion=false;
			this.isVisibilidadCeldaEliminarProfesion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesProfesion() {
		this.isVisibilidadCeldaNuevoProfesion=false;
		this.isVisibilidadCeldaGuardarCambiosProfesion=false;
	}
	
	public void actualizarEstadoPanelsProfesion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(false);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionProfesion!=null) {
				this.jScrollPanelDatosEdicionProfesion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosProfesion!=null) {
				this.jScrollPanelDatosProfesion.setVisible(true);
			}
			
			if(this.jPanelPaginacionProfesion!=null) {
				this.jPanelPaginacionProfesion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.profesionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasProfesion!=null) {
					this.jTabbedPaneBusquedasProfesion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.profesionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasProfesion!=null) {
				this.jTabbedPaneBusquedasProfesion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesProfesion!=null) {
				this.jPanelParametrosReportesProfesion.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionProfesionParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.profesionSessionBean==null) {
				this.profesionSessionBean=new ProfesionSessionBean();
			}

			if(this.jInternalFrameDetalleFormProfesion.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormProfesion.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setsPathNavegacionActual(profesionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormProfesion.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ProfesionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
			this.jInternalFrameDetalleFormProfesion.clienteSessionBean.setlidProfesionActual(this.idProfesionActual);

			profesionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProfesion(true);
			profesionSessionBean.setlIdProfesionActualForeignKey(this.idProfesionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProfesionParaProfesionEmpleas() throws Exception {
		Boolean isPaginaPopupProfesionEmplea=false;

		try {

			if(this.profesionSessionBean==null) {
				this.profesionSessionBean=new ProfesionSessionBean();
			}

			if(this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean==null) {
				this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean=new ProfesionEmpleaSessionBean();
			}

			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setsPathNavegacionActual(profesionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProfesionEmpleaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProfesionEmplea=this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProfesionEmplea(true);
			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProfesionEmplea(ProfesionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
			this.jInternalFrameDetalleFormProfesion.profesionempleaSessionBean.setlidProfesionActual(this.idProfesionActual);

			profesionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProfesion(true);
			profesionSessionBean.setlIdProfesionActualForeignKey(this.idProfesionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionProfesionParaReferencias() throws Exception {
		Boolean isPaginaPopupReferencia=false;

		try {

			if(this.profesionSessionBean==null) {
				this.profesionSessionBean=new ProfesionSessionBean();
			}

			if(this.jInternalFrameDetalleFormProfesion.referenciaSessionBean==null) {
				this.jInternalFrameDetalleFormProfesion.referenciaSessionBean=new ReferenciaSessionBean();
			}

			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setsPathNavegacionActual(profesionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferencia=this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferencia(true);
			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferencia(ProfesionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setisBusquedaDesdeForeignKeySesionProfesion(true);
			this.jInternalFrameDetalleFormProfesion.referenciaSessionBean.setlidProfesionActual(this.idProfesionActual);

			profesionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyProfesion(true);
			profesionSessionBean.setlIdProfesionActualForeignKey(this.idProfesionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ProfesionSessionBean profesionSessionBean=new ProfesionSessionBean();
		
		if(this.profesionSessionBean==null) {
			this.profesionSessionBean=new ProfesionSessionBean();
		}
		
		this.profesionSessionBean.setsUltimaBusquedaProfesion(this.getsAccionBusqueda());
		this.profesionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.profesionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			profesionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			profesionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ProfesionSessionBean profesionSessionBean=new ProfesionSessionBean();
		
		if(this.profesionSessionBean==null) {
			this.profesionSessionBean=new ProfesionSessionBean();
		}
		
		if(this.profesionSessionBean.getsUltimaBusquedaProfesion()!=null&&!this.profesionSessionBean.getsUltimaBusquedaProfesion().equals("")) {
			this.setsAccionBusqueda(profesionSessionBean.getsUltimaBusquedaProfesion());
			this.setiNumeroPaginacion(profesionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(profesionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(profesionSessionBean.getcodigo());
				profesionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(profesionSessionBean.getnombre());
				profesionSessionBean.setnombre("");
			}
		}
		
		this.profesionSessionBean.setsUltimaBusquedaProfesion("");
		this.profesionSessionBean.setiNumeroPaginacion(ProfesionConstantesFunciones.INUMEROPAGINACION);
		this.profesionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaProfesion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioProfesion() {
		this.updateBorderResaltarBusquedasFormularioProfesion();
		this.updateVisibilidadBusquedasFormularioProfesion();
		this.updateHabilitarBusquedasFormularioProfesion();
	}
	
	public void updateBorderResaltarBusquedasFormularioProfesion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasProfesion.getComponents().length>0) {
	

		if(this.profesionConstantesFunciones.resaltarBusquedaPorCodigoProfesion!=null) {
			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorCodigoProfesion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
				jPanel.setBorder(this.profesionConstantesFunciones.resaltarBusquedaPorCodigoProfesion);
			}
		}

		if(this.profesionConstantesFunciones.resaltarBusquedaPorNombreProfesion!=null) {
			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorNombreProfesion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
				jPanel.setBorder(this.profesionConstantesFunciones.resaltarBusquedaPorNombreProfesion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioProfesion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasProfesion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorCodigoProfesion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.profesionConstantesFunciones.mostrarBusquedaPorCodigoProfesion);
			if(!this.profesionConstantesFunciones.mostrarBusquedaPorCodigoProfesion && index>-1) {
				this.jTabbedPaneBusquedasProfesion.remove(index);
			}

			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorNombreProfesion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.profesionConstantesFunciones.mostrarBusquedaPorNombreProfesion);
			if(!this.profesionConstantesFunciones.mostrarBusquedaPorNombreProfesion && index>-1) {
				this.jTabbedPaneBusquedasProfesion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioProfesion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasProfesion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorCodigoProfesion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.profesionConstantesFunciones.activarBusquedaPorCodigoProfesion);
				this.jTabbedPaneBusquedasProfesion.setEnabledAt(index,this.profesionConstantesFunciones.activarBusquedaPorCodigoProfesion);
			}

			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorNombreProfesion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.profesionConstantesFunciones.activarBusquedaPorNombreProfesion);
				this.jTabbedPaneBusquedasProfesion.setEnabledAt(index,this.profesionConstantesFunciones.activarBusquedaPorNombreProfesion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaProfesion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorCodigoProfesion);

			this.jTabbedPaneBusquedasProfesion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);

			this.profesionConstantesFunciones.setResaltarBusquedaPorCodigoProfesion(resaltar);

			jPanel.setBorder(this.profesionConstantesFunciones.resaltarBusquedaPorCodigoProfesion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasProfesion.indexOfComponent(this.jPanelBusquedaPorNombreProfesion);

			this.jTabbedPaneBusquedasProfesion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasProfesion.getComponent(index);

			this.profesionConstantesFunciones.setResaltarBusquedaPorNombreProfesion(resaltar);

			jPanel.setBorder(this.profesionConstantesFunciones.resaltarBusquedaPorNombreProfesion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarProfesion.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioProfesion() throws Exception {

		if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioProfesion();
		this.updateVisibilidadResaltarControlesFormularioProfesion();
		this.updateHabilitarResaltarControlesFormularioProfesion();
		
	}
	
	public void updateBorderResaltarControlesFormularioProfesion() throws Exception {
		if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.profesionConstantesFunciones.resaltaridProfesion!=null && this.jInternalFrameDetalleFormProfesion!=null) {this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setBorder(this.profesionConstantesFunciones.resaltaridProfesion);}
		if(this.profesionConstantesFunciones.resaltarcodigoProfesion!=null && this.jInternalFrameDetalleFormProfesion!=null) {this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setBorder(this.profesionConstantesFunciones.resaltarcodigoProfesion);}
		if(this.profesionConstantesFunciones.resaltarnombreProfesion!=null && this.jInternalFrameDetalleFormProfesion!=null) {this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setBorder(this.profesionConstantesFunciones.resaltarnombreProfesion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioProfesion() throws Exception {		
		if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
	
		//this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setVisible(this.profesionConstantesFunciones.mostraridProfesion);
		this.jInternalFrameDetalleFormProfesion.jPanelidProfesion.setVisible(this.profesionConstantesFunciones.mostraridProfesion);
		//this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setVisible(this.profesionConstantesFunciones.mostrarcodigoProfesion);
		this.jInternalFrameDetalleFormProfesion.jPanelcodigoProfesion.setVisible(this.profesionConstantesFunciones.mostrarcodigoProfesion);
		//this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setVisible(this.profesionConstantesFunciones.mostrarnombreProfesion);
		this.jInternalFrameDetalleFormProfesion.jPanelnombreProfesion.setVisible(this.profesionConstantesFunciones.mostrarnombreProfesion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioProfesion() throws Exception {
		if(this.jInternalFrameDetalleFormProfesion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormProfesion!=null) {
	
		this.jInternalFrameDetalleFormProfesion.jTextFieldidProfesion.setEnabled(this.profesionConstantesFunciones.activaridProfesion);
		this.jInternalFrameDetalleFormProfesion.jTextFieldcodigoProfesion.setEnabled(this.profesionConstantesFunciones.activarcodigoProfesion);
		this.jInternalFrameDetalleFormProfesion.jTextAreanombreProfesion.setEnabled(this.profesionConstantesFunciones.activarnombreProfesion);
		}
	}
	
		
}