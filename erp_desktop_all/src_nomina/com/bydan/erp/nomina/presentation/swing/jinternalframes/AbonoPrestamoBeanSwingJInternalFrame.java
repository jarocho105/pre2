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

import com.bydan.erp.nomina.util.AbonoPrestamoConstantesFunciones;
import com.bydan.erp.nomina.util.AbonoPrestamoParameterReturnGeneral;
//import com.bydan.erp.nomina.util.AbonoPrestamoParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.AbonoPrestamoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class AbonoPrestamoBeanSwingJInternalFrame extends AbonoPrestamoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AbonoPrestamoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<AbonoPrestamo> abonoprestamoValidator = new ClassValidator<AbonoPrestamo>(AbonoPrestamo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public AbonoPrestamo abonoprestamo;	
	public AbonoPrestamo abonoprestamoAux;
	public AbonoPrestamo abonoprestamoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public AbonoPrestamo abonoprestamoTotales;
	public Long idAbonoPrestamoActual;
	public Long iIdNuevoAbonoPrestamo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPrestamo="";

	public List<Prestamo> prestamosForeignKey;

	public List<Prestamo> getprestamosForeignKey() {
		return prestamosForeignKey;
	}

	public void setprestamosForeignKey(List<Prestamo> prestamosForeignKey) {
		this.prestamosForeignKey = prestamosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Prestamo prestamoForeignKey;

	public Prestamo getprestamoForeignKey() {
		return prestamoForeignKey;
	}

	public void setprestamoForeignKey(Prestamo prestamoForeignKey) {
		this.prestamoForeignKey = prestamoForeignKey;
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
	
	public Boolean isPermisoTodoAbonoPrestamo;
	public Boolean isPermisoNuevoAbonoPrestamo;
	public Boolean isPermisoActualizarAbonoPrestamo;
	public Boolean isPermisoActualizarOriginalAbonoPrestamo;
	public Boolean isPermisoEliminarAbonoPrestamo;
	public Boolean isPermisoGuardarCambiosAbonoPrestamo;
	public Boolean isPermisoConsultaAbonoPrestamo;
	public Boolean isPermisoBusquedaAbonoPrestamo;
	public Boolean isPermisoReporteAbonoPrestamo;
	public Boolean isPermisoPaginacionMedioAbonoPrestamo;
	public Boolean isPermisoPaginacionAltoAbonoPrestamo;
	public Boolean isPermisoPaginacionTodoAbonoPrestamo;
	public Boolean isPermisoCopiarAbonoPrestamo;
	public Boolean isPermisoVerFormAbonoPrestamo;
	public Boolean isPermisoDuplicarAbonoPrestamo;
	public Boolean isPermisoOrdenAbonoPrestamo;
	
	
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
	
	public AbonoPrestamoParameterReturnGeneral abonoprestamoReturnGeneral;
	public AbonoPrestamoParameterReturnGeneral abonoprestamoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAbonoPrestamo=false;
	public Boolean esParaAccionDesdeFormularioAbonoPrestamo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AbonoPrestamoSessionBeanAdditional abonoprestamoSessionBeanAdditional=null;
	
	public AbonoPrestamoSessionBeanAdditional getAbonoPrestamoSessionBeanAdditional() {
		return this.abonoprestamoSessionBeanAdditional;
	}
	
	public void setAbonoPrestamoSessionBeanAdditional(AbonoPrestamoSessionBeanAdditional abonoprestamoSessionBeanAdditional) {
		try {
			this.abonoprestamoSessionBeanAdditional=abonoprestamoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AbonoPrestamoBeanSwingJInternalFrameAdditional abonoprestamoBeanSwingJInternalFrameAdditional=null;
	//public class AbonoPrestamoBeanSwingJInternalFrame
	
	public AbonoPrestamoBeanSwingJInternalFrameAdditional getAbonoPrestamoBeanSwingJInternalFrameAdditional() {
		return this.abonoprestamoBeanSwingJInternalFrameAdditional;
	}
	
	public void setAbonoPrestamoBeanSwingJInternalFrameAdditional(AbonoPrestamoBeanSwingJInternalFrameAdditional abonoprestamoBeanSwingJInternalFrameAdditional) {
		try {
			this.abonoprestamoBeanSwingJInternalFrameAdditional=abonoprestamoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AbonoPrestamoLogic abonoprestamoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public AbonoPrestamo abonoprestamoBean;
	public AbonoPrestamoConstantesFunciones abonoprestamoConstantesFunciones;
	//public AbonoPrestamoParameterReturnGeneral abonoprestamoReturnGeneral;
	
	//FK
	
	public PrestamoLogic prestamoLogic;
	
	//PARAMETROS
	
	
	//public List<AbonoPrestamo> abonoprestamos;	
	//public List<AbonoPrestamo> abonoprestamosEliminados;
	//public List<AbonoPrestamo> abonoprestamosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaDuplicarAbonoPrestamo=true;
	public Boolean isVisibilidadCeldaCopiarAbonoPrestamo=true;
	public Boolean isVisibilidadCeldaVerFormAbonoPrestamo=true;
	public Boolean isVisibilidadCeldaOrdenAbonoPrestamo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaModificarAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaActualizarAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaEliminarAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaCancelarAbonoPrestamo=false;
	public Boolean isVisibilidadCeldaGuardarAbonoPrestamo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;	
	
	
	public Boolean isVisibilidadFK_IdPrestamo=false;
	
	public Long getiIdNuevoAbonoPrestamo() {
		return this.iIdNuevoAbonoPrestamo;
	}

	public void setiIdNuevoAbonoPrestamo(Long iIdNuevoAbonoPrestamo) {
		this.iIdNuevoAbonoPrestamo = iIdNuevoAbonoPrestamo;
	}
	
	public Long getidAbonoPrestamoActual() {
		return this.idAbonoPrestamoActual;
	}

	public void setidAbonoPrestamoActual(Long idAbonoPrestamoActual) {
		this.idAbonoPrestamoActual = idAbonoPrestamoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public AbonoPrestamo getabonoprestamo() {
		return this.abonoprestamo;
	}

	public void setabonoprestamo(AbonoPrestamo abonoprestamo) {
		this.abonoprestamo = abonoprestamo;
	}
	
	public AbonoPrestamo getabonoprestamoAux() {
		return this.abonoprestamoAux;
	}

	public void setabonoprestamoAux(AbonoPrestamo abonoprestamoAux) {
		this.abonoprestamoAux = abonoprestamoAux;
	}				
	
	public AbonoPrestamo getabonoprestamoAnterior() {
		return this.abonoprestamoAnterior;
	}

	public void setabonoprestamoAnterior(AbonoPrestamo abonoprestamoAnterior) {
		this.abonoprestamoAnterior = abonoprestamoAnterior;
	}	
	
	public AbonoPrestamo getabonoprestamoTotales() {
		return this.abonoprestamoTotales;
	}

	public void setabonoprestamoTotales(AbonoPrestamo abonoprestamoTotales) {
		this.abonoprestamoTotales = abonoprestamoTotales;
	}	
	
	public AbonoPrestamo getabonoprestamoBean() {
		return this.abonoprestamoBean;
	}

	public void setabonoprestamoBean(AbonoPrestamo abonoprestamoBean) {
		this.abonoprestamoBean = abonoprestamoBean;
	}	
	
	public AbonoPrestamoParameterReturnGeneral getabonoprestamoReturnGeneral() {
		return this.abonoprestamoReturnGeneral;
	}

	public void setabonoprestamoReturnGeneral(AbonoPrestamoParameterReturnGeneral abonoprestamoReturnGeneral) {
		this.abonoprestamoReturnGeneral = abonoprestamoReturnGeneral;
	}	
	
	
	public Long id_prestamoFK_IdPrestamo=-1L;

	public Long getid_prestamoFK_IdPrestamo() {
		return this.id_prestamoFK_IdPrestamo;
	}

	public void setid_prestamoFK_IdPrestamo(Long id_prestamoFK_IdPrestamo) {
		this.id_prestamoFK_IdPrestamo = id_prestamoFK_IdPrestamo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AbonoPrestamoLogic getAbonoPrestamoLogic()	{		
		return abonoprestamoLogic;
	}

	public void setAbonoPrestamoLogic(AbonoPrestamoLogic abonoprestamoLogic) {
		this.abonoprestamoLogic = abonoprestamoLogic;
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
	
	public Boolean getIsEsNuevoAbonoPrestamo() {
		return isEsNuevoAbonoPrestamo;
	}

	public void setIsEsNuevoAbonoPrestamo(Boolean isEsNuevoAbonoPrestamo) {
		this.isEsNuevoAbonoPrestamo = isEsNuevoAbonoPrestamo;
	}

	public Boolean getEsParaAccionDesdeFormularioAbonoPrestamo() {
		return esParaAccionDesdeFormularioAbonoPrestamo;
	}
	
	public void setEsParaAccionDesdeFormularioAbonoPrestamo(Boolean esParaAccionDesdeFormularioAbonoPrestamo) {
		this.esParaAccionDesdeFormularioAbonoPrestamo = esParaAccionDesdeFormularioAbonoPrestamo;
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
	
	
	public void cargarCombosPrestamosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.prestamosForeignKey=new ArrayList<Prestamo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PrestamoLogic prestamoLogic=new PrestamoLogic();

			prestamoLogic.getPrestamoDataAccess().setIsForForeingKeyData(true);

			if(this.abonoprestamoSessionBean==null) {
				this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
			}

			if(!this.abonoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getPrestamoDataAccess().setIsForForeingKeyData(true);

					prestamoLogic.getTodosPrestamosWithConnection(sFinalQuery,new Pagination());

					this.prestamosForeignKey=prestamoLogic.getPrestamos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPrestamo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					prestamoLogic.getEntityWithConnection(abonoprestamoSessionBean.getlidPrestamoActual());
					this.prestamosForeignKey.add(prestamoLogic.getPrestamo());
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

	
	
	public void setActualPrestamoForeignKey(Long idPrestamoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(prestamoTemp!=null) {

					if(this.abonoprestamo!=null) {
						this.abonoprestamo.setPrestamo(prestamoTemp);
					}

					if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
						this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setSelectedItem(prestamoTemp);
					}
				} else {
					//jComboBoxid_prestamoAbonoPrestamo.setSelectedItem(prestamoTemp);
					if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
						if(this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.getItemCount()>0) {
							this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPrestamo") || sFormularioTipoBusqueda.equals("Todos")){
					if(prestamoTemp!=null && jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo!=null) {
						jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setSelectedItem(prestamoTemp);
					} else {
						if(jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo!=null) {
							//jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setSelectedItem(prestamoTemp);
							if(jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.getItemCount()>0) {
								jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setSelectedIndex(0);
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

	public String getActualPrestamoForeignKeyDescripcion(Long idPrestamoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}


			sDescripcion=PrestamoConstantesFunciones.getPrestamoDescripcion(prestamoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPrestamoForeignKeyGenerico(Long idPrestamoSeleccionado,JComboBox jComboBoxid_prestamoAbonoPrestamoGenerico)throws Exception
	{
		try
		{
			Prestamo  prestamoTemp=null;

			for(Prestamo prestamoAux:prestamosForeignKey) {
				if(prestamoAux.getId()!=null && prestamoAux.getId().equals(idPrestamoSeleccionado)) {
					prestamoTemp=prestamoAux;
					break;
				}
			}

			if(prestamoTemp!=null) {
				jComboBoxid_prestamoAbonoPrestamoGenerico.setSelectedItem(prestamoTemp);
			} else {
				if(jComboBoxid_prestamoAbonoPrestamoGenerico!=null && jComboBoxid_prestamoAbonoPrestamoGenerico.getItemCount()>0) {
					jComboBoxid_prestamoAbonoPrestamoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPrestamoForeignKey(AbonoPrestamo abonoprestamo,JComboBox jComboBoxid_prestamoAbonoPrestamoGenerico)throws Exception
	{
		try
		{
			Prestamo  prestamoAux=new Prestamo();

			if(jComboBoxid_prestamoAbonoPrestamoGenerico==null) {
				prestamoAux=(Prestamo)this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.getSelectedItem();
			} else {
				prestamoAux=(Prestamo)jComboBoxid_prestamoAbonoPrestamoGenerico.getSelectedItem();
			}

			if(prestamoAux!=null && prestamoAux.getId()!=null) {
				abonoprestamo.setid_prestamo(prestamoAux.getId());
				abonoprestamo.setprestamo_descripcion(AbonoPrestamoConstantesFunciones.getPrestamoDescripcion(prestamoAux));
				abonoprestamo.setPrestamo(prestamoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePrestamosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPrestamo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { 
							this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.removeAllItems();

							for(Prestamo prestamo:this.prestamosForeignKey) {
								this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.addItem(prestamo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { 
					}

					if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPrestamo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.removeAllItems();

							for(Prestamo prestamo:this.prestamosForeignKey) {
								this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.addItem(prestamo);
							}
						}

						if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePrestamoForeignKey(Prestamo prestamo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
							this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setSelectedItem(prestamo);
						}
					} else {
						if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
							this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setSelectedItem(prestamo);
						} else {
							this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesAbonoPrestamo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AbonoPrestamoConstantesFunciones.refrescarForeignKeysDescripcionesAbonoPrestamo(this.abonoprestamoLogic.getAbonoPrestamos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AbonoPrestamoConstantesFunciones.refrescarForeignKeysDescripcionesAbonoPrestamo(this.abonoprestamos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Prestamo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//abonoprestamoLogic.setAbonoPrestamos(this.abonoprestamos);
			abonoprestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AbonoPrestamoParameterReturnGeneral getAbonoPrestamoParameterGeneral() {
		return this.abonoprestamoParameterGeneral;
	}
	
	public void setAbonoPrestamoParameterGeneral(AbonoPrestamoParameterReturnGeneral abonoprestamoParameterGeneral) {
		this.abonoprestamoParameterGeneral = abonoprestamoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAbonoPrestamo() {
		return isPermisoTodoAbonoPrestamo;
	}

	public void setIsPermisoTodoAbonoPrestamo(Boolean isPermisoTodoAbonoPrestamo) {
		this.isPermisoTodoAbonoPrestamo = isPermisoTodoAbonoPrestamo;
	}

	public Boolean getIsPermisoNuevoAbonoPrestamo() {
		return isPermisoNuevoAbonoPrestamo;
	}

	public void setIsPermisoNuevoAbonoPrestamo(Boolean isPermisoNuevoAbonoPrestamo) {
		this.isPermisoNuevoAbonoPrestamo = isPermisoNuevoAbonoPrestamo;
	}

	public Boolean getIsPermisoActualizarAbonoPrestamo() {
		return isPermisoActualizarAbonoPrestamo;
	}

	public void setIsPermisoActualizarAbonoPrestamo(Boolean isPermisoActualizarAbonoPrestamo) {
		this.isPermisoActualizarAbonoPrestamo = isPermisoActualizarAbonoPrestamo;
	}

	public Boolean getIsPermisoEliminarAbonoPrestamo() {
		return isPermisoEliminarAbonoPrestamo;
	}

	public void setIsPermisoEliminarAbonoPrestamo(Boolean isPermisoEliminarAbonoPrestamo) {
		this.isPermisoEliminarAbonoPrestamo = isPermisoEliminarAbonoPrestamo;
	}

	public Boolean getIsPermisoGuardarCambiosAbonoPrestamo() {
		return isPermisoGuardarCambiosAbonoPrestamo;
	}

	public void setIsPermisoGuardarCambiosAbonoPrestamo(Boolean isPermisoGuardarCambiosAbonoPrestamo) {
		this.isPermisoGuardarCambiosAbonoPrestamo = isPermisoGuardarCambiosAbonoPrestamo;
	}
	
	public Boolean getIsPermisoConsultaAbonoPrestamo() {
		return isPermisoConsultaAbonoPrestamo;
	}

	public void setIsPermisoConsultaAbonoPrestamo(Boolean isPermisoConsultaAbonoPrestamo) {
		this.isPermisoConsultaAbonoPrestamo = isPermisoConsultaAbonoPrestamo;
	}

	public Boolean getIsPermisoBusquedaAbonoPrestamo() {
		return isPermisoBusquedaAbonoPrestamo;
	}

	public void setIsPermisoBusquedaAbonoPrestamo(Boolean isPermisoBusquedaAbonoPrestamo) {
		this.isPermisoBusquedaAbonoPrestamo = isPermisoBusquedaAbonoPrestamo;
	}

	public Boolean getIsPermisoReporteAbonoPrestamo() {
		return isPermisoReporteAbonoPrestamo;
	}

	public void setIsPermisoReporteAbonoPrestamo(Boolean isPermisoReporteAbonoPrestamo) {
		this.isPermisoReporteAbonoPrestamo = isPermisoReporteAbonoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionMedioAbonoPrestamo() {
		return isPermisoPaginacionMedioAbonoPrestamo;
	}

	public void setIsPermisoPaginacionMedioAbonoPrestamo(Boolean isPermisoPaginacionMedioAbonoPrestamo) {
		this.isPermisoPaginacionMedioAbonoPrestamo = isPermisoPaginacionMedioAbonoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionTodoAbonoPrestamo() {
		return isPermisoPaginacionTodoAbonoPrestamo;
	}

	public void setIsPermisoPaginacionTodoAbonoPrestamo(Boolean isPermisoPaginacionTodoAbonoPrestamo) {
		this.isPermisoPaginacionTodoAbonoPrestamo = isPermisoPaginacionTodoAbonoPrestamo;
	}
	
	public Boolean getIsPermisoPaginacionAltoAbonoPrestamo() {
		return isPermisoPaginacionAltoAbonoPrestamo;
	}

	public void setIsPermisoPaginacionAltoAbonoPrestamo(Boolean isPermisoPaginacionAltoAbonoPrestamo) {
		this.isPermisoPaginacionAltoAbonoPrestamo = isPermisoPaginacionAltoAbonoPrestamo;
	}
	
	public Boolean getIsPermisoCopiarAbonoPrestamo() {
		return isPermisoCopiarAbonoPrestamo;
	}

	public void setIsPermisoCopiarAbonoPrestamo(Boolean isPermisoCopiarAbonoPrestamo) {
		this.isPermisoCopiarAbonoPrestamo = isPermisoCopiarAbonoPrestamo;
	}
	
	public Boolean getIsPermisoVerFormAbonoPrestamo() {
		return isPermisoVerFormAbonoPrestamo;
	}

	public void setIsPermisoVerFormAbonoPrestamo(Boolean isPermisoVerFormAbonoPrestamo) {
		this.isPermisoVerFormAbonoPrestamo = isPermisoVerFormAbonoPrestamo;
	}
	
	public Boolean getIsPermisoDuplicarAbonoPrestamo() {
		return isPermisoDuplicarAbonoPrestamo;
	}

	public void setIsPermisoDuplicarAbonoPrestamo(Boolean isPermisoDuplicarAbonoPrestamo) {
		this.isPermisoDuplicarAbonoPrestamo = isPermisoDuplicarAbonoPrestamo;
	}
	
	public Boolean getIsPermisoOrdenAbonoPrestamo() {
		return isPermisoOrdenAbonoPrestamo;
	}

	public void setIsPermisoOrdenAbonoPrestamo(Boolean isPermisoOrdenAbonoPrestamo) {
		this.isPermisoOrdenAbonoPrestamo = isPermisoOrdenAbonoPrestamo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAbonoPrestamo() {
		return isVisibilidadCeldaNuevoAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoAbonoPrestamo(Boolean isVisibilidadCeldaNuevoAbonoPrestamo) {
		this.isVisibilidadCeldaNuevoAbonoPrestamo = isVisibilidadCeldaNuevoAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAbonoPrestamo() {
		return isVisibilidadCeldaDuplicarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaDuplicarAbonoPrestamo(Boolean isVisibilidadCeldaDuplicarAbonoPrestamo) {
		this.isVisibilidadCeldaDuplicarAbonoPrestamo = isVisibilidadCeldaDuplicarAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAbonoPrestamo() {
		return isVisibilidadCeldaCopiarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaCopiarAbonoPrestamo(Boolean isVisibilidadCeldaCopiarAbonoPrestamo) {
		this.isVisibilidadCeldaCopiarAbonoPrestamo = isVisibilidadCeldaCopiarAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAbonoPrestamo() {
		return isVisibilidadCeldaVerFormAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaVerFormAbonoPrestamo(Boolean isVisibilidadCeldaVerFormAbonoPrestamo) {
		this.isVisibilidadCeldaVerFormAbonoPrestamo = isVisibilidadCeldaVerFormAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAbonoPrestamo() {
		return isVisibilidadCeldaOrdenAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaOrdenAbonoPrestamo(Boolean isVisibilidadCeldaOrdenAbonoPrestamo) {
		this.isVisibilidadCeldaOrdenAbonoPrestamo = isVisibilidadCeldaOrdenAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAbonoPrestamo() {
		return isVisibilidadCeldaNuevoRelacionesAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAbonoPrestamo(Boolean isVisibilidadCeldaNuevoRelacionesAbonoPrestamo) {
		this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo = isVisibilidadCeldaNuevoRelacionesAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAbonoPrestamo() {
		return isVisibilidadCeldaModificarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaModificarAbonoPrestamo(Boolean isVisibilidadCeldaModificarAbonoPrestamo) {
		this.isVisibilidadCeldaModificarAbonoPrestamo = isVisibilidadCeldaModificarAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAbonoPrestamo() {
		return isVisibilidadCeldaActualizarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaActualizarAbonoPrestamo(Boolean isVisibilidadCeldaActualizarAbonoPrestamo) {
		this.isVisibilidadCeldaActualizarAbonoPrestamo = isVisibilidadCeldaActualizarAbonoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaEliminarAbonoPrestamo() {
		return isVisibilidadCeldaEliminarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaEliminarAbonoPrestamo(Boolean isVisibilidadCeldaEliminarAbonoPrestamo) {
		this.isVisibilidadCeldaEliminarAbonoPrestamo = isVisibilidadCeldaEliminarAbonoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaCancelarAbonoPrestamo() {
		return isVisibilidadCeldaCancelarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaCancelarAbonoPrestamo(Boolean isVisibilidadCeldaCancelarAbonoPrestamo) {
		this.isVisibilidadCeldaCancelarAbonoPrestamo = isVisibilidadCeldaCancelarAbonoPrestamo;
	}

	public Boolean getIsVisibilidadCeldaGuardarAbonoPrestamo() {
		return isVisibilidadCeldaGuardarAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarAbonoPrestamo(Boolean isVisibilidadCeldaGuardarAbonoPrestamo) {
		this.isVisibilidadCeldaGuardarAbonoPrestamo = isVisibilidadCeldaGuardarAbonoPrestamo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAbonoPrestamo() {
		return isVisibilidadCeldaGuardarCambiosAbonoPrestamo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAbonoPrestamo(Boolean isVisibilidadCeldaGuardarCambiosAbonoPrestamo) {
		this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo = isVisibilidadCeldaGuardarCambiosAbonoPrestamo;
	}
		
	public AbonoPrestamoSessionBean getabonoprestamoSessionBean() {
		return this.abonoprestamoSessionBean;
	}
	
	public void setabonoprestamoSessionBean(AbonoPrestamoSessionBean abonoprestamoSessionBean) {
		this.abonoprestamoSessionBean=abonoprestamoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPrestamo() {
		return this.isVisibilidadFK_IdPrestamo;
	}

	public void setisVisibilidadFK_IdPrestamo(Boolean isVisibilidadFK_IdPrestamo) {
		this.isVisibilidadFK_IdPrestamo=isVisibilidadFK_IdPrestamo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(AbonoPrestamo abonoprestamo)throws Exception {
		try {
			
				this.setActualParaGuardarPrestamoForeignKey(abonoprestamo,null);
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
	
	public void bugActualizarReferenciaActual(AbonoPrestamo abonoprestamo,AbonoPrestamo abonoprestamoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAbonoPrestamo(abonoprestamo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		abonoprestamoAux.setId(abonoprestamo.getId());
		abonoprestamoAux.setVersionRow(abonoprestamo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAbonoPrestamo();
		
			int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = abonoprestamoValidator.getInvalidValues(this.abonoprestamo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			abonoprestamoLogic.setDatosCliente(datosCliente);
			abonoprestamoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				abonoprestamoAux=new  AbonoPrestamo();
				
				abonoprestamoAux.setIsNew(true);
				abonoprestamoAux.setIsChanged(true);
				
				abonoprestamoAux.setAbonoPrestamoOriginal(this.abonoprestamo);
				
				abonoprestamoAux.setId(this.abonoprestamo.getId());	
				abonoprestamoAux.setVersionRow(this.abonoprestamo.getVersionRow());	
				abonoprestamoAux.setid_prestamo(this.abonoprestamo.getid_prestamo());	
				abonoprestamoAux.setnumero(this.abonoprestamo.getnumero());	
				abonoprestamoAux.setmonto_capital(this.abonoprestamo.getmonto_capital());	
				abonoprestamoAux.setmonto_interes(this.abonoprestamo.getmonto_interes());	
				abonoprestamoAux.setvalor(this.abonoprestamo.getvalor());	
				abonoprestamoAux.setfecha_vencimiento(this.abonoprestamo.getfecha_vencimiento());	
				abonoprestamoAux.setcodigo_quincena(this.abonoprestamo.getcodigo_quincena());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(abonoprestamoAux,abonoprestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoLogic.saveAbonoPrestamos();//WithConnection
						//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);
					
					this.refrescarForeignKeysDescripcionesAbonoPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								abonoprestamoLogic.saveAbonoPrestamoRelaciones(abonoprestamoAux);//WithConnection
								//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(abonoprestamoAux,abonoprestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				abonoprestamoAux=new  AbonoPrestamo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado() 
					|| (this.abonoprestamoSessionBean.getEsGuardarRelacionado() && this.abonoprestamo.getId()>=0)) {
						
					abonoprestamoAux.setIsNew(false);
				}
				
				abonoprestamoAux.setIsDeleted(false);
			
				abonoprestamoAux.setId(this.abonoprestamo.getId());	
				abonoprestamoAux.setVersionRow(this.abonoprestamo.getVersionRow());	
				abonoprestamoAux.setid_prestamo(this.abonoprestamo.getid_prestamo());	
				abonoprestamoAux.setnumero(this.abonoprestamo.getnumero());	
				abonoprestamoAux.setmonto_capital(this.abonoprestamo.getmonto_capital());	
				abonoprestamoAux.setmonto_interes(this.abonoprestamo.getmonto_interes());	
				abonoprestamoAux.setvalor(this.abonoprestamo.getvalor());	
				abonoprestamoAux.setfecha_vencimiento(this.abonoprestamo.getfecha_vencimiento());	
				abonoprestamoAux.setcodigo_quincena(this.abonoprestamo.getcodigo_quincena());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(abonoprestamoAux,abonoprestamos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoLogic.saveAbonoPrestamos();//WithConnection
						//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);
					
					this.refrescarForeignKeysDescripcionesAbonoPrestamo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								abonoprestamoLogic.saveAbonoPrestamoRelaciones(abonoprestamoAux);//WithConnection
								//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(abonoprestamoAux,abonoprestamos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.abonoprestamo,abonoprestamoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				abonoprestamoAux=new  AbonoPrestamo();
				
				abonoprestamoAux.setIsNew(false);
				abonoprestamoAux.setIsChanged(false);
				
				abonoprestamoAux.setIsDeleted(true);
				
				abonoprestamoAux.setId(this.abonoprestamo.getId());	
				abonoprestamoAux.setVersionRow(this.abonoprestamo.getVersionRow());	
				abonoprestamoAux.setid_prestamo(this.abonoprestamo.getid_prestamo());	
				abonoprestamoAux.setnumero(this.abonoprestamo.getnumero());	
				abonoprestamoAux.setmonto_capital(this.abonoprestamo.getmonto_capital());	
				abonoprestamoAux.setmonto_interes(this.abonoprestamo.getmonto_interes());	
				abonoprestamoAux.setvalor(this.abonoprestamo.getvalor());	
				abonoprestamoAux.setfecha_vencimiento(this.abonoprestamo.getfecha_vencimiento());	
				abonoprestamoAux.setcodigo_quincena(this.abonoprestamo.getcodigo_quincena());	
				
				if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.abonoprestamoAux.getId()>=0) {	
						this.abonoprestamosEliminados.add(abonoprestamoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(abonoprestamoAux,abonoprestamos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoLogic.saveAbonoPrestamos();//WithConnection
						//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								abonoprestamoLogic.saveAbonoPrestamoRelaciones(abonoprestamoAux);//WithConnection
								//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
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
							if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(abonoprestamoAux,abonoprestamoLogic.getAbonoPrestamos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(abonoprestamoAux,abonoprestamos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getAbonoPrestamos().addAll(this.abonoprestamosEliminados);
					
					abonoprestamoLogic.saveAbonoPrestamos();//WithConnection
					//abonoprestamoLogic.getSetVersionRowAbonoPrestamos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAbonoPrestamo();
				
				this.abonoprestamosEliminados= new ArrayList<AbonoPrestamo>();		
			}
			
			if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Abono Prestamo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.abonoprestamo=abonoprestamoAux;
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
      		//this.finishProcessAbonoPrestamo();
      	}
		
	}	
	
	public void actualizarRelaciones(AbonoPrestamo abonoprestamoLocal) throws Exception {
		
		if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(AbonoPrestamo abonoprestamoLocal) throws Exception {	
		if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PrestamoDetalleFormJInternalFrame.class)) {
				PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrameLocal=(PrestamoBeanSwingJInternalFrame) ((PrestamoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				prestamoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPrestamo(prestamoBeanSwingJInternalFrameLocal.getprestamo(),true);
				prestamoBeanSwingJInternalFrameLocal.actualizarLista(prestamoBeanSwingJInternalFrameLocal.prestamo,this.prestamosForeignKey);

				prestamoBeanSwingJInternalFrameLocal.actualizarRelaciones(prestamoBeanSwingJInternalFrameLocal.prestamo);

				abonoprestamoLocal.setPrestamo(prestamoBeanSwingJInternalFrameLocal.prestamo);

				this.addItemDefectoCombosForeignKeyPrestamo();
				this.cargarCombosFramePrestamosForeignKey("Formulario");
				this.setActualPrestamoForeignKey(prestamoBeanSwingJInternalFrameLocal.prestamo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAbonoPrestamoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = abonoprestamoValidator.getInvalidValues(this.abonoprestamo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(AbonoPrestamo abonoprestamo,List<AbonoPrestamo> abonoprestamos) throws Exception {
		try	{		
			AbonoPrestamoConstantesFunciones.actualizarLista(abonoprestamo,abonoprestamos,this.abonoprestamoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(AbonoPrestamo abonoprestamo,List<AbonoPrestamo> abonoprestamos) throws Exception {
		try	{			
			AbonoPrestamoConstantesFunciones.actualizarSelectedLista(abonoprestamo,abonoprestamos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<AbonoPrestamo> abonoprestamosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				abonoprestamosLocal=this.abonoprestamoLogic.getAbonoPrestamos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				abonoprestamosLocal=this.abonoprestamos;
			}
			//ARCHITECTURE
		
			for(AbonoPrestamo abonoprestamoLocal:abonoprestamosLocal) {
				if(this.permiteMantenimiento(abonoprestamoLocal) && abonoprestamoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AbonoPrestamoConstantesFunciones.getAbonoPrestamoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.IDPRESTAMO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelid_prestamoAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelnumeroAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.MONTOCAPITAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_capitalAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.MONTOINTERES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_interesAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelvalorAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelfecha_vencimientoAbonoPrestamo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AbonoPrestamoConstantesFunciones.CODIGOQUINCENA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelcodigo_quincenaAbonoPrestamo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelid_prestamoAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelnumeroAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_capitalAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_interesAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelvalorAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelfecha_vencimientoAbonoPrestamo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelcodigo_quincenaAbonoPrestamo,"");
		
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
		this.iIdNuevoAbonoPrestamo--;	
		
		
		this.abonoprestamoAux=new AbonoPrestamo();
		
		this.abonoprestamoAux.setId(this.iIdNuevoAbonoPrestamo);
		this.abonoprestamoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.abonoprestamoLogic.getAbonoPrestamos().add(this.abonoprestamoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.abonoprestamos.add(this.abonoprestamoAux);
		}
		//ARCHITECTURE
		
		this.abonoprestamo=this.abonoprestamoAux;
		
		if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamo);
			this.setVariablesObjetoActualToFormularioForeignKeyAbonoPrestamo(this.abonoprestamo);
		}
				
		//this.setDefaultControlesAbonoPrestamo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAbonoPrestamo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAbonoPrestamo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAbonoPrestamo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAbonoPrestamo(this.abonoprestamoBean,this.abonoprestamo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AbonoPrestamoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
			classes=AbonoPrestamoConstantesFunciones.getClassesRelationshipsOfAbonoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.abonoprestamoReturnGeneral=abonoprestamoLogic.procesarEventosAbonoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.abonoprestamoLogic.getAbonoPrestamos(),this.abonoprestamo,this.abonoprestamoParameterGeneral,this.isEsNuevoAbonoPrestamo,classes);//this.abonoprestamoLogic.getAbonoPrestamo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAbonoPrestamo(this.abonoprestamoReturnGeneral,this.abonoprestamoBean,false);
		
		if(this.abonoprestamoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo());
		}
		
		if(this.abonoprestamoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo(),classes);//this.abonoprestamoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAbonoPrestamo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAbonoPrestamo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.RecargarFormAbonoPrestamo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAbonoPrestamo(false);
						
			if(abonoprestamoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAbonoPrestamo();
			}
			
			this.actualizarVisualTableDatosAbonoPrestamo();
			
			this.jTableDatosAbonoPrestamo.setRowSelectionInterval(this.getIndiceNuevoAbonoPrestamo(), this.getIndiceNuevoAbonoPrestamo());
			
			this.seleccionarFilaTablaAbonoPrestamoActual();
						
			this.actualizarEstadoCeldasBotonesAbonoPrestamo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAbonoPrestamo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarnumeroAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarmonto_capitalAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarmonto_interesAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarvalorAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarfecha_vencimientoAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarcodigo_quincenaAbonoPrestamo);	
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setEnabled(isHabilitar && this.abonoprestamoConstantesFunciones.activarid_prestamoAbonoPrestamo);
	};
	
	public void setDefaultControlesAbonoPrestamo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAbonoPrestamo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.abonoprestamoSessionBean.setConGuardarRelaciones(true);			
			this.abonoprestamoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.setVisible(true);
			
					
		} else {
			//this.abonoprestamoSessionBean.setConGuardarRelaciones(false);			
			this.abonoprestamoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAbonoPrestamo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
				if(abonoprestamoAux.getId().equals(this.iIdNuevoAbonoPrestamo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamos) {
				if(abonoprestamoAux.getId().equals(this.iIdNuevoAbonoPrestamo)) {
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
	
	public int getIndiceActualAbonoPrestamo(AbonoPrestamo abonoprestamo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
				if(abonoprestamoAux.getId().equals(abonoprestamo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamos) {
				if(abonoprestamoAux.getId().equals(abonoprestamo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAbonoPrestamo(AbonoPrestamo abonoprestamoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
				if(abonoprestamoAux.getAbonoPrestamoOriginal().getId().equals(abonoprestamoOriginal.getId())) {
					existe=true;
					abonoprestamoOriginal.setId(abonoprestamoAux.getId());
					abonoprestamoOriginal.setVersionRow(abonoprestamoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AbonoPrestamo abonoprestamoAux:this.abonoprestamos) {
				if(abonoprestamoAux.getAbonoPrestamoOriginal().getId().equals(abonoprestamoOriginal.getId())) {
					existe=true;
					abonoprestamoOriginal.setId(abonoprestamoAux.getId());
					abonoprestamoOriginal.setVersionRow(abonoprestamoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAbonoPrestamo(Boolean esParaCancelar) throws Exception {
		abonoprestamosAux=new ArrayList<AbonoPrestamo>();
		abonoprestamoAux=new AbonoPrestamo();
		
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
					if(abonoprestamoAux.getId()<0) {
						abonoprestamosAux.add(abonoprestamoAux);
					}		
				}
				this.iIdNuevoAbonoPrestamo=0L;
				this.abonoprestamoLogic.getAbonoPrestamos().removeAll(abonoprestamosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AbonoPrestamo abonoprestamoAux:this.abonoprestamos) {
					if(abonoprestamoAux.getId()<0) {
						abonoprestamosAux.add(abonoprestamoAux);
					}		
				}
				this.iIdNuevoAbonoPrestamo=0L;
				this.abonoprestamos.removeAll(abonoprestamosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAbonoPrestamo 
					&& this.abonoprestamoLogic.getAbonoPrestamos().size()>0
					) {
					abonoprestamoAux=this.abonoprestamoLogic.getAbonoPrestamos().get(this.abonoprestamoLogic.getAbonoPrestamos().size() - 1);
				
					if(abonoprestamoAux.getId()<0) {
						this.abonoprestamoLogic.getAbonoPrestamos().remove(abonoprestamoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAbonoPrestamo && this.abonoprestamos.size()>0) {
					abonoprestamoAux=this.abonoprestamos.get(this.abonoprestamos.size() - 1);
				
					if(abonoprestamoAux.getId()<0) {
						this.abonoprestamos.remove(abonoprestamoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAbonoPrestamo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(abonoprestamo.getId()<0) {
				this.abonoprestamoLogic.getAbonoPrestamos().remove(this.abonoprestamo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(abonoprestamo.getId()<0) {
				this.abonoprestamos.remove(this.abonoprestamo);
			}
		}			
	}
	
	public void setEstadosInicialesAbonoPrestamo(List<AbonoPrestamo> abonoprestamosAux) throws Exception {
		AbonoPrestamoConstantesFunciones.setEstadosInicialesAbonoPrestamo(abonoprestamosAux);
	}
	
	public void setEstadosInicialesAbonoPrestamo(AbonoPrestamo abonoprestamoAux) throws Exception {
		AbonoPrestamoConstantesFunciones.setEstadosInicialesAbonoPrestamo(abonoprestamoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAbonoPrestamoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAbonoPrestamoActual()) {
				if(!this.isEsNuevoAbonoPrestamo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAbonoPrestamo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAbonoPrestamoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Abono Prestamo ?", "MANTENIMIENTO DE Abono Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(AbonoPrestamo abonoprestamo) throws Exception {
		AbonoPrestamoConstantesFunciones.seleccionarAsignar(this.abonoprestamo,abonoprestamo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAbonoPrestamo=this.isPermisoActualizarOriginalAbonoPrestamo;
			
			
			this.seleccionarAsignar(abonoprestamo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AbonoPrestamoConstantesFunciones.quitarEspaciosAbonoPrestamo(this.abonoprestamo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAbonoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.abonoprestamoSessionBean.setsFuncionBusquedaRapida(this.abonoprestamoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAbonoPrestamo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAbonoPrestamo(esParaCancelar);				
				this.cancelarNuevoAbonoPrestamo(esParaCancelar);								
			}
			
			this.abonoprestamo=new AbonoPrestamo();
			
			this.inicializarAbonoPrestamo();
			
			this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAbonoPrestamo() throws Exception {
		try {
			AbonoPrestamoConstantesFunciones.inicializarAbonoPrestamo(this.abonoprestamo);
			
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
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.abonoprestamoLogic.getAbonoPrestamos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAbonoPrestamos(String sAccionBusqueda,List<AbonoPrestamo> abonoprestamosParaReportes) throws Exception {
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
					sPathReporteFinal="AbonoPrestamo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AbonoPrestamoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AbonoPrestamoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="AbonoPrestamo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Abono Prestamos");		
		parameters.put("busquedapor", AbonoPrestamoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAbonoPrestamo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AbonoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AbonoPrestamoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAbonoPrestamo=new JRBeanArrayDataSource(AbonoPrestamoJInternalFrame.TraerAbonoPrestamoBeans(abonoprestamosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAbonoPrestamo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AbonoPrestamoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AbonoPrestamoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AbonoPrestamoBean.TraerAbonoPrestamoBeans(abonoprestamosParaReportes).toArray()));
							
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
				this.generarExcelReporteAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAbonoPrestamoActionPerformed(null);
					//this.generarExcelReporteAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAbonoPrestamos(sAccionBusqueda,sTipoArchivoReporte,abonoprestamosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAbonoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<AbonoPrestamo> abonoprestamosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AbonoPrestamos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAbonoPrestamo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(AbonoPrestamo abonoprestamo : abonoprestamosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AbonoPrestamoConstantesFunciones.generarExcelReporteDataAbonoPrestamo("NORMAL",row,workbook,abonoprestamo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAbonoPrestamo(String sTipo,Row row,Workbook workbook) {
		
		AbonoPrestamoConstantesFunciones.generarExcelReporteHeaderAbonoPrestamo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAbonoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<AbonoPrestamo> abonoprestamosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AbonoPrestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(AbonoPrestamo abonoprestamo : abonoprestamosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AbonoPrestamoConstantesFunciones.getAbonoPrestamoDescripcion(abonoprestamo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getprestamo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getmonto_capital());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getmonto_interes());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(abonoprestamo.getcodigo_quincena());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAbonoPrestamos(String sAccionBusqueda,String sTipoArchivoReporte,List<AbonoPrestamo> abonoprestamosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<AbonoPrestamo> abonoprestamosRespaldo=null;
		
		classes=AbonoPrestamoConstantesFunciones.getClassesRelationshipsOfAbonoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.abonoprestamoLogic.setDatosCliente(this.datosCliente);
		this.abonoprestamoLogic.setDatosDeep(this.datosDeep);
		this.abonoprestamoLogic.setIsConDeep(true);
		
		abonoprestamosRespaldo=this.abonoprestamoLogic.getAbonoPrestamos();
		
		this.abonoprestamoLogic.setAbonoPrestamos(abonoprestamosParaReportes);	
		this.abonoprestamoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		abonoprestamosParaReportes=this.abonoprestamoLogic.getAbonoPrestamos();
		this.abonoprestamoLogic.setAbonoPrestamos(abonoprestamosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("AbonoPrestamos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAbonoPrestamo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(AbonoPrestamo abonoprestamo : abonoprestamosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAbonoPrestamo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AbonoPrestamoConstantesFunciones.generarExcelReporteDataAbonoPrestamo("NORMAL",row,workbook,abonoprestamo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AbonoPrestamoConstantesFunciones.getAbonoPrestamoDescripcion(abonoprestamo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAbonoPrestamo() throws Exception {		
		this.startProcessAbonoPrestamo(true);
	}
	
	public void startProcessAbonoPrestamo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAbonoPrestamo ,this.jPanelParametrosReportesAbonoPrestamo, this.jScrollPanelDatosAbonoPrestamo,this.jPanelPaginacionAbonoPrestamo, this.jScrollPanelDatosEdicionAbonoPrestamo, this.jPanelAccionesAbonoPrestamo,this.jPanelAccionesFormularioAbonoPrestamo,this.jmenuBarAbonoPrestamo,this.jmenuBarDetalleAbonoPrestamo,this.jTtoolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasAbonoPrestamo=this.jTabbedPaneBusquedasAbonoPrestamo; 
		
		final JPanel jPanelParametrosReportesAbonoPrestamo=this.jPanelParametrosReportesAbonoPrestamo;
		//final JScrollPane jScrollPanelDatosAbonoPrestamo=this.jScrollPanelDatosAbonoPrestamo;
		final JTable jTableDatosAbonoPrestamo=this.jTableDatosAbonoPrestamo;		
		final JPanel jPanelPaginacionAbonoPrestamo=this.jPanelPaginacionAbonoPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionAbonoPrestamo=this.jScrollPanelDatosEdicionAbonoPrestamo;
		final JPanel jPanelAccionesAbonoPrestamo=this.jPanelAccionesAbonoPrestamo;
		
		JPanel jPanelCamposAuxiliarAbonoPrestamo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAbonoPrestamo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			jPanelCamposAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jPanelCamposAbonoPrestamo;
			jPanelAccionesFormularioAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jPanelAccionesFormularioAbonoPrestamo;
		}
		
		final JPanel jPanelCamposAbonoPrestamo=jPanelCamposAuxiliarAbonoPrestamo;
		final JPanel jPanelAccionesFormularioAbonoPrestamo=jPanelAccionesFormularioAuxiliarAbonoPrestamo;
		
		
		final JMenuBar jmenuBarAbonoPrestamo=this.jmenuBarAbonoPrestamo;
		final JToolBar jTtoolBarAbonoPrestamo=this.jTtoolBarAbonoPrestamo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAbonoPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAbonoPrestamo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			jmenuBarDetalleAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jmenuBarDetalleAbonoPrestamo;
			jTtoolBarDetalleAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jTtoolBarDetalleAbonoPrestamo;
		}
		
		final JMenuBar jmenuBarDetalleAbonoPrestamo=jmenuBarDetalleAuxiliarAbonoPrestamo;
		final JToolBar jTtoolBarDetalleAbonoPrestamo=jTtoolBarDetalleAuxiliarAbonoPrestamo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAbonoPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAbonoPrestamo;
			processRunnable.jTableDatos=jTableDatosAbonoPrestamo;
			processRunnable.jPanelCampos=jPanelCamposAbonoPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionAbonoPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesAbonoPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAbonoPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarAbonoPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAbonoPrestamo;
			processRunnable.jTtoolBar=jTtoolBarAbonoPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAbonoPrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAbonoPrestamo ,jPanelParametrosReportesAbonoPrestamo,jTableDatosAbonoPrestamo, /*jScrollPanelDatosAbonoPrestamo,*/jPanelCamposAbonoPrestamo,jPanelPaginacionAbonoPrestamo, /*jScrollPanelDatosEdicionAbonoPrestamo,*/ jPanelAccionesAbonoPrestamo,jPanelAccionesFormularioAbonoPrestamo,jmenuBarAbonoPrestamo,jmenuBarDetalleAbonoPrestamo,jTtoolBarAbonoPrestamo,jTtoolBarDetalleAbonoPrestamo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAbonoPrestamo ,jPanelParametrosReportesAbonoPrestamo, jScrollPanelDatosAbonoPrestamo,jPanelPaginacionAbonoPrestamo, jScrollPanelDatosEdicionAbonoPrestamo, jPanelAccionesAbonoPrestamo,jPanelAccionesFormularioAbonoPrestamo,jmenuBarAbonoPrestamo,jmenuBarDetalleAbonoPrestamo,jTtoolBarAbonoPrestamo,jTtoolBarDetalleAbonoPrestamo);
						
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
	
	public void finishProcessAbonoPrestamo() {// throws Exception 
		this.finishProcessAbonoPrestamo(true);
	}
	
	public void finishProcessAbonoPrestamo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAbonoPrestamo ,this.jPanelParametrosReportesAbonoPrestamo, this.jScrollPanelDatosAbonoPrestamo,this.jPanelPaginacionAbonoPrestamo, this.jScrollPanelDatosEdicionAbonoPrestamo, this.jPanelAccionesAbonoPrestamo,this.jPanelAccionesFormularioAbonoPrestamo,this.jmenuBarAbonoPrestamo,this.jmenuBarDetalleAbonoPrestamo,this.jTtoolBarAbonoPrestamo,this.jTtoolBarDetalleAbonoPrestamo);		
		
		final JTabbedPane jTabbedPaneBusquedasAbonoPrestamo=this.jTabbedPaneBusquedasAbonoPrestamo; 
		
		final JPanel jPanelParametrosReportesAbonoPrestamo=this.jPanelParametrosReportesAbonoPrestamo;
		//final JScrollPane jScrollPanelDatosAbonoPrestamo=this.jScrollPanelDatosAbonoPrestamo;
		final JTable jTableDatosAbonoPrestamo=this.jTableDatosAbonoPrestamo;		
		final JPanel jPanelPaginacionAbonoPrestamo=this.jPanelPaginacionAbonoPrestamo;
		//final JScrollPane jScrollPanelDatosEdicionAbonoPrestamo=this.jScrollPanelDatosEdicionAbonoPrestamo;
		final JPanel jPanelAccionesAbonoPrestamo=this.jPanelAccionesAbonoPrestamo;
		
		JPanel jPanelCamposAuxiliarAbonoPrestamo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAbonoPrestamo=new JPanel();
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			jPanelCamposAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jPanelCamposAbonoPrestamo;
			jPanelAccionesFormularioAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jPanelAccionesFormularioAbonoPrestamo;
		}
		
		final JPanel jPanelCamposAbonoPrestamo=jPanelCamposAuxiliarAbonoPrestamo;
		final JPanel jPanelAccionesFormularioAbonoPrestamo=jPanelAccionesFormularioAuxiliarAbonoPrestamo;
		
		
		final JMenuBar jmenuBarAbonoPrestamo=this.jmenuBarAbonoPrestamo;		
		final JToolBar jTtoolBarAbonoPrestamo=this.jTtoolBarAbonoPrestamo;
				
		JMenuBar jmenuBarDetalleAuxiliarAbonoPrestamo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAbonoPrestamo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			jmenuBarDetalleAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jmenuBarDetalleAbonoPrestamo;
			jTtoolBarDetalleAuxiliarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jTtoolBarDetalleAbonoPrestamo;		
		}
		
		final JMenuBar jmenuBarDetalleAbonoPrestamo=jmenuBarDetalleAuxiliarAbonoPrestamo;
		final JToolBar jTtoolBarDetalleAbonoPrestamo=jTtoolBarDetalleAuxiliarAbonoPrestamo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAbonoPrestamo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAbonoPrestamo;
			processRunnable.jTableDatos=jTableDatosAbonoPrestamo;
			processRunnable.jPanelCampos=jPanelCamposAbonoPrestamo;
			processRunnable.jPanelPaginacion=jPanelPaginacionAbonoPrestamo;
			processRunnable.jPanelAcciones=jPanelAccionesAbonoPrestamo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAbonoPrestamo;
			
			
			processRunnable.jmenuBar=jmenuBarAbonoPrestamo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAbonoPrestamo;
			processRunnable.jTtoolBar=jTtoolBarAbonoPrestamo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAbonoPrestamo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAbonoPrestamo ,jPanelParametrosReportesAbonoPrestamo, jTableDatosAbonoPrestamo,/*jScrollPanelDatosAbonoPrestamo,*/jPanelCamposAbonoPrestamo,jPanelPaginacionAbonoPrestamo, /*jScrollPanelDatosEdicionAbonoPrestamo,*/ jPanelAccionesAbonoPrestamo,jPanelAccionesFormularioAbonoPrestamo,jmenuBarAbonoPrestamo,jmenuBarDetalleAbonoPrestamo,jTtoolBarAbonoPrestamo,jTtoolBarDetalleAbonoPrestamo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAbonoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAbonoPrestamo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAbonoPrestamo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAbonoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAbonoPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAbonoPrestamo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAbonoPrestamo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAbonoPrestamo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAbonoPrestamo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.abonoprestamoConstantesFunciones.getsFinalQueryAbonoPrestamo();
		String  finalQueryPaginacionTodos=this.abonoprestamoConstantesFunciones.getsFinalQueryAbonoPrestamo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AbonoPrestamoConstantesFunciones.getArrayColumnasGlobalesNoAbonoPrestamo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AbonoPrestamoConstantesFunciones.getArrayColumnasGlobalesAbonoPrestamo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AbonoPrestamoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.abonoprestamosEliminados= new ArrayList<AbonoPrestamo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAbonoPrestamo();
		
				///*AbonoPrestamoSessionBean*/this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
			
			if(this.abonoprestamoSessionBean==null) {
				this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
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
					this.iNumeroPaginacion=AbonoPrestamoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AbonoPrestamoConstantesFunciones.getClassesForeignKeysOfAbonoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/abonoprestamo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			abonoprestamosAux= new ArrayList<AbonoPrestamo>();
			
				
			abonoprestamoLogic.setDatosCliente(this.datosCliente);
			abonoprestamoLogic.setDatosDeep(this.datosDeep);
			abonoprestamoLogic.setIsConDeep(true);
			
			
			abonoprestamoLogic.getAbonoPrestamoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					abonoprestamoLogic.getTodosAbonoPrestamos(finalQueryGlobal,pagination);
					
					//abonoprestamoLogic.getTodosAbonoPrestamosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(abonoprestamoLogic.getAbonoPrestamos()==null|| abonoprestamoLogic.getAbonoPrestamos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							abonoprestamosAux= new ArrayList<AbonoPrestamo>();
							abonoprestamosAux.addAll(abonoprestamoLogic.getAbonoPrestamos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							abonoprestamosAux= new ArrayList<AbonoPrestamo>();
							abonoprestamosAux.addAll(abonoprestamos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							abonoprestamoLogic.getTodosAbonoPrestamos(finalQueryGlobal+"",this.pagination);												
							
							//abonoprestamoLogic.getTodosAbonoPrestamosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAbonoPrestamos("Todos",abonoprestamoLogic.getAbonoPrestamos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());					
							abonoprestamoLogic.getAbonoPrestamos().addAll(abonoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							abonoprestamos=new ArrayList<AbonoPrestamo>();
							abonoprestamos.addAll(abonoprestamosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAbonoPrestamo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAbonoPrestamo=this.idActual;
				
				} else if(this.idAbonoPrestamoActual!=null && this.idAbonoPrestamoActual!=0L) {
					idAbonoPrestamo=idAbonoPrestamoActual;
				}
				
					
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndicePorId(idAbonoPrestamo);
				
				this.abonoprestamos=new ArrayList<AbonoPrestamo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					abonoprestamoLogic.getEntity(idAbonoPrestamo);
					
					//abonoprestamoLogic.getEntityWithConnection(idAbonoPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());
					abonoprestamoLogic.getAbonoPrestamos().add(abonoprestamoLogic.getAbonoPrestamo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.abonoprestamos=new ArrayList<AbonoPrestamo>();
					this.abonoprestamos.add(abonoprestamo);
				}
				
				if(abonoprestamoLogic.getAbonoPrestamo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPrestamo")) {
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					abonoprestamoLogic.getAbonoPrestamosFK_IdPrestamo(finalQueryGlobal,pagination,id_prestamoFK_IdPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=abonoprestamoLogic.getAbonoPrestamos()==null||abonoprestamoLogic.getAbonoPrestamos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=abonoprestamos==null|| abonoprestamos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamosAux=new ArrayList<AbonoPrestamo>();
						abonoprestamosAux.addAll(abonoprestamoLogic.getAbonoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							abonoprestamosAux=new ArrayList<AbonoPrestamo>();
							abonoprestamosAux.addAll(abonoprestamos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							abonoprestamoLogic.getAbonoPrestamosFK_IdPrestamo(finalQueryGlobal,pagination,id_prestamoFK_IdPrestamo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AbonoPrestamoConstantesFunciones.getDetalleIndiceFK_IdPrestamo(id_prestamoFK_IdPrestamo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAbonoPrestamos("FK_IdPrestamo",abonoprestamoLogic.getAbonoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAbonoPrestamos("FK_IdPrestamo",abonoprestamos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoLogic.setAbonoPrestamos(new ArrayList<AbonoPrestamo>());
						abonoprestamoLogic.getAbonoPrestamos().addAll(abonoprestamosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							abonoprestamos=new ArrayList<AbonoPrestamo>();
							abonoprestamos.addAll(abonoprestamosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAbonoPrestamo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAbonoPrestamo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=abonoprestamoLogic.getAbonoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=abonoprestamos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=abonoprestamoLogic.getAbonoPrestamos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=abonoprestamos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(AbonoPrestamo abonoprestamo) {
		Boolean permite=true;
		
		if(this.abonoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AbonoPrestamoConstantesFunciones.getOrderByListaAbonoPrestamo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AbonoPrestamoConstantesFunciones.getOrderByListaAbonoPrestamo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AbonoPrestamo abonoprestamo:abonoprestamoLogic.getAbonoPrestamos()) {
				if(abonoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					abonoprestamoTotales=abonoprestamo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AbonoPrestamo abonoprestamo:this.abonoprestamos) {
				if(abonoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					abonoprestamoTotales=abonoprestamo;
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
			this.abonoprestamoAux=new AbonoPrestamo();
			this.abonoprestamoAux.setsType(Constantes2.S_TOTALES);
			this.abonoprestamoAux.setIsNew(false);
			this.abonoprestamoAux.setIsChanged(false);
			this.abonoprestamoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AbonoPrestamoConstantesFunciones.TotalizarValoresFilaAbonoPrestamo(this.abonoprestamoLogic.getAbonoPrestamos(),this.abonoprestamoAux);
				
				this.abonoprestamoLogic.getAbonoPrestamos().add(this.abonoprestamoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AbonoPrestamoConstantesFunciones.TotalizarValoresFilaAbonoPrestamo(this.abonoprestamos,this.abonoprestamoAux);
				
				this.abonoprestamos.add(this.abonoprestamoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		abonoprestamoTotales=new AbonoPrestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.abonoprestamoLogic.getAbonoPrestamos().remove(abonoprestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.abonoprestamos.remove(abonoprestamoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		abonoprestamoTotales=new AbonoPrestamo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(AbonoPrestamo abonoprestamo:abonoprestamoLogic.getAbonoPrestamos()) {
				if(abonoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					abonoprestamoTotales=abonoprestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AbonoPrestamoConstantesFunciones.TotalizarValoresFilaAbonoPrestamo(this.abonoprestamoLogic.getAbonoPrestamos(),abonoprestamoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(AbonoPrestamo abonoprestamo:this.abonoprestamos) {
				if(abonoprestamo.getsType().equals(Constantes2.S_TOTALES)) {
					abonoprestamoTotales=abonoprestamo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AbonoPrestamoConstantesFunciones.TotalizarValoresFilaAbonoPrestamo(this.abonoprestamos,abonoprestamoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAbonoPrestamosFK_IdPrestamo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPrestamo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAbonoPrestamosFK_IdPrestamo(String sFinalQuery,Long id_prestamo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					abonoprestamoLogic.getAbonoPrestamosFK_IdPrestamo(sFinalQuery,this.pagination,id_prestamo);
				
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
	
	public void inicializarPermisosAbonoPrestamo() {
		this.isPermisoTodoAbonoPrestamo=false;
		this.isPermisoNuevoAbonoPrestamo=false;
		this.isPermisoActualizarAbonoPrestamo=false;
		this.isPermisoActualizarOriginalAbonoPrestamo=false;
		this.isPermisoEliminarAbonoPrestamo=false;
		this.isPermisoGuardarCambiosAbonoPrestamo=false;
		this.isPermisoConsultaAbonoPrestamo=false;
		this.isPermisoBusquedaAbonoPrestamo=false;
		this.isPermisoReporteAbonoPrestamo=false;		
		this.isPermisoOrdenAbonoPrestamo=false;		
		this.isPermisoPaginacionMedioAbonoPrestamo=false;		
		this.isPermisoPaginacionAltoAbonoPrestamo=false;
		this.isPermisoPaginacionTodoAbonoPrestamo=false;
		this.isPermisoCopiarAbonoPrestamo=false;		
		this.isPermisoVerFormAbonoPrestamo=false;		
		this.isPermisoDuplicarAbonoPrestamo=false;		
		this.isPermisoOrdenAbonoPrestamo=false;		
	}
	
	public void setPermisosUsuarioAbonoPrestamo(Boolean isPermiso) {
		this.isPermisoTodoAbonoPrestamo=isPermiso;
		this.isPermisoNuevoAbonoPrestamo=isPermiso;
		this.isPermisoActualizarAbonoPrestamo=isPermiso;
		this.isPermisoActualizarOriginalAbonoPrestamo=isPermiso;
		this.isPermisoEliminarAbonoPrestamo=isPermiso;
		this.isPermisoGuardarCambiosAbonoPrestamo=isPermiso;
		this.isPermisoConsultaAbonoPrestamo=isPermiso;
		this.isPermisoBusquedaAbonoPrestamo=isPermiso;
		this.isPermisoReporteAbonoPrestamo=isPermiso;
		this.isPermisoOrdenAbonoPrestamo=isPermiso;		
		this.isPermisoPaginacionMedioAbonoPrestamo=isPermiso;		
		this.isPermisoPaginacionAltoAbonoPrestamo=isPermiso;		
		this.isPermisoPaginacionTodoAbonoPrestamo=isPermiso;		
		this.isPermisoCopiarAbonoPrestamo=isPermiso;		
		this.isPermisoVerFormAbonoPrestamo=isPermiso;		
		this.isPermisoDuplicarAbonoPrestamo=isPermiso;
		this.isPermisoOrdenAbonoPrestamo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAbonoPrestamo(Boolean isPermiso) {
		//this.isPermisoTodoAbonoPrestamo=isPermiso;
		this.isPermisoNuevoAbonoPrestamo=isPermiso;
		this.isPermisoActualizarAbonoPrestamo=isPermiso;
		this.isPermisoActualizarOriginalAbonoPrestamo=isPermiso;
		this.isPermisoEliminarAbonoPrestamo=isPermiso;
		this.isPermisoGuardarCambiosAbonoPrestamo=isPermiso;
		//this.isPermisoConsultaAbonoPrestamo=isPermiso;
		//this.isPermisoBusquedaAbonoPrestamo=isPermiso;
		//this.isPermisoReporteAbonoPrestamo=isPermiso;
		//this.isPermisoOrdenAbonoPrestamo=isPermiso;		
		//this.isPermisoPaginacionMedioAbonoPrestamo=isPermiso;		
		//this.isPermisoPaginacionAltoAbonoPrestamo=isPermiso;		
		//this.isPermisoPaginacionTodoAbonoPrestamo=isPermiso;		
		//this.isPermisoCopiarAbonoPrestamo=isPermiso;		
		//this.isPermisoDuplicarAbonoPrestamo=isPermiso;
		//this.isPermisoOrdenAbonoPrestamo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAbonoPrestamoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AbonoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAbonoPrestamo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAbonoPrestamoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAbonoPrestamoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAbonoPrestamoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAbonoPrestamoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAbonoPrestamo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AbonoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AbonoPrestamoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAbonoPrestamo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAbonoPrestamo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAbonoPrestamo=this.isPermisoActualizarAbonoPrestamo;
			this.isPermisoEliminarAbonoPrestamo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAbonoPrestamo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAbonoPrestamo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAbonoPrestamo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAbonoPrestamo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAbonoPrestamo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAbonoPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAbonoPrestamo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAbonoPrestamo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAbonoPrestamo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAbonoPrestamo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAbonoPrestamo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAbonoPrestamo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAbonoPrestamo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAbonoPrestamo.setToolTipText(this.jTableDatosAbonoPrestamo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAbonoPrestamo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAbonoPrestamo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AbonoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AbonoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAbonoPrestamo() throws Exception {
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
	public void inicializarCombosForeignKeyAbonoPrestamoListas()throws Exception {
		try	{						
			
				this.prestamosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAbonoPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AbonoPrestamoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAbonoPrestamoListas(false);
			} else {
			
				this.cargarCombosForeignKeyPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPrestamoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.prestamosForeignKey==null||this.prestamosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PrestamoConstantesFunciones.getArrayColumnasGlobalesPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PrestamoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PrestamoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPrestamosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyAbonoPrestamoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AbonoPrestamoParameterReturnGeneral abonoprestamoReturnGeneral=new AbonoPrestamoParameterReturnGeneral();
						
			


				String finalQueryGlobalPrestamo="";

				if(((this.prestamosForeignKey==null||this.prestamosForeignKey.size()<=0) && this.abonoprestamoConstantesFunciones.cargarid_prestamoAbonoPrestamo)
					 || (this.esRecargarFks && this.abonoprestamoConstantesFunciones.cargarid_prestamoAbonoPrestamo)) {

					if(!this.abonoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PrestamoConstantesFunciones.getArrayColumnasGlobalesPrestamo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPrestamo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PrestamoConstantesFunciones.TABLENAME);

						finalQueryGlobalPrestamo=Funciones.GetFinalQueryAppend(finalQueryGlobalPrestamo, "");
						finalQueryGlobalPrestamo+=PrestamoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPrestamosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPrestamo=" WHERE " + ConstantesSql.ID + "="+abonoprestamoSessionBean.getlidPrestamoActual();
					}
				} else {
					finalQueryGlobalPrestamo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				abonoprestamoReturnGeneral=abonoprestamoLogic.cargarCombosLoteForeignKeyAbonoPrestamo(finalQueryGlobalPrestamo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPrestamo.equals("NONE")) {
				this.prestamosForeignKey=abonoprestamoReturnGeneral.getprestamosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAbonoPrestamo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPrestamo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPrestamo()throws Exception {
		try {
			if(this.abonoprestamoSessionBean==null) {
				this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
			}

			if(!this.abonoprestamoSessionBean.getisBusquedaDesdeForeignKeySesionPrestamo()) {
				Prestamo prestamo=new Prestamo();
				PrestamoConstantesFunciones.setPrestamoDescripcion(prestamo,Constantes.SMENSAJE_ESCOJA_OPCION);
				prestamo.setId(null);

				if(!PrestamoConstantesFunciones.ExisteEnLista(this.prestamosForeignKey,prestamo,true)) {

					this.prestamosForeignKey.add(0,prestamo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyAbonoPrestamo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAbonoPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAbonoPrestamo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
				this.abonoprestamo.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAbonoPrestamo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAbonoPrestamo(AbonoPrestamo abonoprestamo)throws Exception {	
		try {
			
			this.setActualPrestamoForeignKey(abonoprestamo.getid_prestamo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAbonoPrestamo(AbonoPrestamo abonoprestamo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAbonoPrestamo()throws Exception {	
		try {
			
			this.setActualPrestamoForeignKey(this.abonoprestamoConstantesFunciones.getid_prestamo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAbonoPrestamo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAbonoPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAbonoPrestamo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAbonoPrestamo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAbonoPrestamo()throws Exception {
		try {
			

			this.cargarCombosFramePrestamosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAbonoPrestamo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePrestamosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAbonoPrestamo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.getItemCount()>0) {
				this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AbonoPrestamoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AbonoPrestamoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AbonoPrestamoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean(); 
		this.abonoprestamoConstantesFunciones=new AbonoPrestamoConstantesFunciones(); 
		this.abonoprestamoBean=new AbonoPrestamo();//(this.abonoprestamoConstantesFunciones); 		
		this.abonoprestamoReturnGeneral=new AbonoPrestamoParameterReturnGeneral(); 
		
		this.abonoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.abonoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AbonoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AbonoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AbonoPrestamoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAbonoPrestamo(true);
			
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
			
			this.abonoprestamoConstantesFunciones=new AbonoPrestamoConstantesFunciones(); 
			this.abonoprestamoBean=new AbonoPrestamo();//this.abonoprestamoConstantesFunciones); 			
			this.abonoprestamoReturnGeneral=new AbonoPrestamoParameterReturnGeneral(); 
		
			AbonoPrestamoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Abono Prestamo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.abonoprestamo=new AbonoPrestamo();
			this.abonoprestamos = new ArrayList<AbonoPrestamo>();
			this.abonoprestamosAux = new ArrayList<AbonoPrestamo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic=new AbonoPrestamoLogic();
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.abonoprestamoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.abonoprestamoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAbonoPrestamo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAbonoPrestamo);	
					}
					
					if(this.jInternalFrameImportacionAbonoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAbonoPrestamo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAbonoPrestamo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAbonoPrestamo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAbonoPrestamo);
				this.jInternalFrameDetalleFormAbonoPrestamo.setVisible(false);
				this.jInternalFrameDetalleFormAbonoPrestamo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAbonoPrestamo);
					this.jInternalFrameReporteDinamicoAbonoPrestamo.setVisible(false);
					this.jInternalFrameReporteDinamicoAbonoPrestamo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAbonoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAbonoPrestamo);
					this.jInternalFrameImportacionAbonoPrestamo.setVisible(false);
					this.jInternalFrameImportacionAbonoPrestamo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAbonoPrestamo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAbonoPrestamo);
					this.jInternalFrameOrderByAbonoPrestamo.setVisible(false);
					this.jInternalFrameOrderByAbonoPrestamo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAbonoPrestamoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AbonoPrestamoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.abonoprestamoReturnGeneral=new AbonoPrestamoParameterReturnGeneral();
			
			this.abonoprestamoParameterGeneral=new AbonoPrestamoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.abonoprestamoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AbonoPrestamoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AbonoPrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),this.abonoprestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AbonoPrestamoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),this.abonoprestamoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaDuplicarAbonoPrestamo=true;
			this.isVisibilidadCeldaCopiarAbonoPrestamo=true;
			this.isVisibilidadCeldaVerFormAbonoPrestamo=true;
			this.isVisibilidadCeldaOrdenAbonoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			
			
			this.isVisibilidadFK_IdPrestamo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAbonoPrestamo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAbonoPrestamo(false);
			
			this.setPermisosUsuarioAbonoPrestamo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado() 
				|| (this.abonoprestamoSessionBean.getEsGuardarRelacionado() && this.abonoprestamoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAbonoPrestamoClasesRelacionadas();
			}
			
			if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAbonoPrestamoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAbonoPrestamo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAbonoPrestamo();
			}
			
			if(!this.isPermisoBusquedaAbonoPrestamo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAbonoPrestamo,this.isPermisoPaginacionMedioAbonoPrestamo,this.isPermisoPaginacionTodoAbonoPrestamo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AbonoPrestamoConstantesFunciones.getTiposSeleccionarAbonoPrestamo());
				
				this.tiposColumnasSelect=AbonoPrestamoConstantesFunciones.getTiposSeleccionarAbonoPrestamo(true);
				
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
			//if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAbonoPrestamo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioAbonoPrestamo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioAbonoPrestamo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAbonoPrestamo() ;
			
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
			
			this.prestamoLogic=new PrestamoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				abonoprestamoImplementable= (AbonoPrestamoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AbonoPrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				abonoprestamoImplementableHome= (AbonoPrestamoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AbonoPrestamoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.abonoprestamos= new ArrayList<AbonoPrestamo>();
			this.abonoprestamosEliminados= new ArrayList<AbonoPrestamo>();
						
			this.isEsNuevoAbonoPrestamo=false;
			this.esParaAccionDesdeFormularioAbonoPrestamo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.prestamosForeignKey=new ArrayList<Prestamo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAbonoPrestamo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAbonoPrestamo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AbonoPrestamoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AbonoPrestamoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAbonoPrestamo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAbonoPrestamo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAbonoPrestamo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAbonoPrestamo();
			}
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAbonoPrestamo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAbonoPrestamo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAbonoPrestamo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAbonoPrestamo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga AbonoPrestamo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAbonoPrestamo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAbonoPrestamo")) {
				iIndex=this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAbonoPrestamo();	
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
	
	public void cargarCombosForeignKeyAbonoPrestamo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAbonoPrestamo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAbonoPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAbonoPrestamoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAbonoPrestamo();
		
		this.cargarCombosFrameForeignKeyAbonoPrestamo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAbonoPrestamo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAbonoPrestamo();
		}
	}
	
	

	public void cargarCombosForeignKeyPrestamo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPrestamoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPrestamo();
				this.cargarCombosFramePrestamosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPrestamo(this.prestamosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoAbonoPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			
			if(jTableDatosAbonoPrestamo.getRowCount()>=1) {
				jTableDatosAbonoPrestamo.removeRowSelectionInterval(0, jTableDatosAbonoPrestamo.getRowCount()-1);						
			}
			
			this.isEsNuevoAbonoPrestamo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAbonoPrestamo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAbonoPrestamo(true);			
			//this.abonoprestamo=new AbonoPrestamo();
			//this.abonoprestamo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAbonoPrestamo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAbonoPrestamo() ;
			
			if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAbonoPrestamo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.abonoprestamo);	
			this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);				
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar AbonoPrestamo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAbonoPrestamoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAbonoPrestamo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAbonoPrestamo.getSelectedRows().length;			
			}
			
			abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAbonoPrestamo--;			
				//AbonoPrestamo abonoprestamoAux= new AbonoPrestamo();			
				//abonoprestamoAux.setId(this.iIdNuevoAbonoPrestamo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//AbonoPrestamo abonoprestamoOrigen=new AbonoPrestamo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(AbonoPrestamo abonoprestamoOrigen : abonoprestamosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							abonoprestamoOrigen =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							abonoprestamoOrigen =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAbonoPrestamo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.abonoprestamo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAbonoPrestamo(abonoprestamoOrigen,this.abonoprestamo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.abonoprestamoLogic.getAbonoPrestamos().add(this.abonoprestamoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.abonoprestamos.add(this.abonoprestamoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
				
				this.jTableDatosAbonoPrestamo.setRowSelectionInterval(this.getIndiceNuevoAbonoPrestamo(), this.getIndiceNuevoAbonoPrestamo());
				
				int iLastRow =  this.jTableDatosAbonoPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAbonoPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAbonoPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAbonoPrestamo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();									
		
			AbonoPrestamo abonoprestamoOrigen=new AbonoPrestamo();
			AbonoPrestamo abonoprestamoDestino=new AbonoPrestamo();
				
			abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAbonoPrestamo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || abonoprestamosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAbonoPrestamo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoOrigen =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						abonoprestamoOrigen =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						abonoprestamoDestino =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						abonoprestamoDestino =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				abonoprestamoOrigen =abonoprestamosSeleccionados.get(0);
				abonoprestamoDestino =abonoprestamosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAbonoPrestamo(abonoprestamoOrigen,abonoprestamoDestino,true,false);
				
				abonoprestamoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(abonoprestamoDestino,abonoprestamoLogic.getAbonoPrestamos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(abonoprestamoDestino,abonoprestamos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
				
				//this.jTableDatosAbonoPrestamo.setRowSelectionInterval(this.getIndiceNuevoAbonoPrestamo(), this.getIndiceNuevoAbonoPrestamo());
				
				int iLastRow =  this.jTableDatosAbonoPrestamo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAbonoPrestamo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAbonoPrestamo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAbonoPrestamo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAbonoPrestamo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAbonoPrestamo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAbonoPrestamo.setVisible(!isVisible);
			this.jPanelPaginacionAbonoPrestamo.setVisible(!isVisible);
			this.jPanelAccionesAbonoPrestamo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAbonoPrestamo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAbonoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAbonoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAbonoPrestamo();
			
			this.abrirFrameOrderByAbonoPrestamo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAbonoPrestamo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAbonoPrestamo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAbonoPrestamo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAbonoPrestamo.isMaximum()) {
					this.jInternalFrameDetalleFormAbonoPrestamo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAbonoPrestamo.setSize(this.jInternalFrameDetalleFormAbonoPrestamo.iWidthFormulario,this.jInternalFrameDetalleFormAbonoPrestamo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAbonoPrestamo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAbonoPrestamo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAbonoPrestamo.isMaximum()) {
						this.jInternalFrameDetalleFormAbonoPrestamo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAbonoPrestamo.jContentPaneDetalleAbonoPrestamo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAbonoPrestamo.jContentPaneDetalleAbonoPrestamo.getWidth(),AbonoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAbonoPrestamo.jContentPaneDetalleAbonoPrestamo.getWidth(),AbonoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAbonoPrestamo.jContentPaneDetalleAbonoPrestamo.getWidth(),AbonoPrestamoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAbonoPrestamo.setVisible(true);
	        this.jInternalFrameDetalleFormAbonoPrestamo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAbonoPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAbonoPrestamo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAbonoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAbonoPrestamo,false,this);
				} else {
					this.jInternalFrameOrderByAbonoPrestamo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAbonoPrestamo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAbonoPrestamo);
				this.jInternalFrameOrderByAbonoPrestamo.setVisible(false);
				this.jInternalFrameOrderByAbonoPrestamo.setSelected(false);
				
				this.jInternalFrameOrderByAbonoPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAbonoPrestamo"));
				
				this.inicializarActualizarBindingTablaOrderByAbonoPrestamo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAbonoPrestamo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAbonoPrestamo==null) {
				
				this.jInternalFrameImportacionAbonoPrestamo=new ImportacionJInternalFrame(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAbonoPrestamo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAbonoPrestamo);
				this.jInternalFrameImportacionAbonoPrestamo.setVisible(false);
				this.jInternalFrameImportacionAbonoPrestamo.setSelected(false);


				this.jInternalFrameImportacionAbonoPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAbonoPrestamo"));
				this.jInternalFrameImportacionAbonoPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAbonoPrestamo"));
				this.jInternalFrameImportacionAbonoPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAbonoPrestamo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAbonoPrestamo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAbonoPrestamo==null) {
				this.jInternalFrameReporteDinamicoAbonoPrestamo=new ReporteDinamicoJInternalFrame(AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAbonoPrestamo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAbonoPrestamo);
				this.jInternalFrameReporteDinamicoAbonoPrestamo.setVisible(false);
				this.jInternalFrameReporteDinamicoAbonoPrestamo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAbonoPrestamo"));
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAbonoPrestamo"));
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAbonoPrestamo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAbonoPrestamo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleAbonoPrestamo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAbonoPrestamo);
			
	       	this.jInternalFrameDetalleFormAbonoPrestamo.setVisible(false);
	        this.jInternalFrameDetalleFormAbonoPrestamo.setSelected(false);
			
			//this.jInternalFrameDetalleFormAbonoPrestamo.dispose();
			//this.jInternalFrameDetalleFormAbonoPrestamo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAbonoPrestamo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAbonoPrestamo.setVisible(true);
	        this.jInternalFrameReporteDinamicoAbonoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAbonoPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAbonoPrestamo.setVisible(true);
	        this.jInternalFrameImportacionAbonoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAbonoPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAbonoPrestamo.setVisible(true);
	        this.jInternalFrameOrderByAbonoPrestamo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAbonoPrestamo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAbonoPrestamo.setVisible(false);
	        this.jInternalFrameOrderByAbonoPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAbonoPrestamo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAbonoPrestamo.setVisible(false);
	        this.jInternalFrameReporteDinamicoAbonoPrestamo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAbonoPrestamo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAbonoPrestamo.setVisible(false);
	        this.jInternalFrameImportacionAbonoPrestamo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAbonoPrestamo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAbonoPrestamo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAbonoPrestamo(true);
			//this.isEsNuevoAbonoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAbonoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAbonoPrestamo(false) ;
			
			if(abonoprestamoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAbonoPrestamo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAbonoPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAbonoPrestamoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAbonoPrestamo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAbonoPrestamo(true);
			//this.isEsNuevoAbonoPrestamo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.abonoprestamo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAbonoPrestamo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAbonoPrestamo(false) ;
			
			if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAbonoPrestamo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAbonoPrestamo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPrestamo(List<Prestamo> prestamosForeignKey)throws Exception{
		TableColumn tableColumnPrestamo=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO));
		TableCellEditor tableCellEditorPrestamo =tableColumnPrestamo.getCellEditor();

		PrestamoTableCell prestamoTableCellFk=(PrestamoTableCell)tableCellEditorPrestamo;

		if(prestamoTableCellFk!=null) {
			prestamoTableCellFk.setprestamosForeignKey(prestamosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosAbonoPrestamo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//prestamoTableCellFk.setRowActual(intSelectedRow);
			//prestamoTableCellFk.setprestamosForeignKeyActual(prestamosForeignKey);
		//}


		if(prestamoTableCellFk!=null) {
			prestamoTableCellFk.RecargarPrestamosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAbonoPrestamo(false);
			
			//if(!this.isEsNuevoAbonoPrestamo) {								
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				
			}
			
			if(this.permiteMantenimiento(this.abonoprestamo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAbonoPrestamo=true;
					this.inicializarActualizarBindingTablaAbonoPrestamo(false);
					this.isEsNuevoAbonoPrestamo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAbonoPrestamo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAbonoPrestamo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAbonoPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAbonoPrestamo(false);
				
				this.habilitarDeshabilitarControlesAbonoPrestamo(false);
			
												
				
				if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAbonoPrestamo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAbonoPrestamoActionPerformed(evt,abonoprestamoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAbonoPrestamo(this.abonoprestamo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAbonoPrestamo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,abonoprestamoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.abonoprestamo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.abonoprestamo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				this.abonoprestamo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.abonoprestamo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AbonoPrestamoModel) this.jTableDatosAbonoPrestamo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAbonoPrestamo=true;
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
				this.isEsNuevoAbonoPrestamo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAbonoPrestamo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAbonoPrestamo(false);
				
				this.habilitarDeshabilitarControlesAbonoPrestamo(false);
				
				
				
				if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAbonoPrestamo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAbonoPrestamo.getRowCount()>=1) {
				jTableDatosAbonoPrestamo.removeRowSelectionInterval(0, jTableDatosAbonoPrestamo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAbonoPrestamo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAbonoPrestamo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAbonoPrestamo(false) ;
			
			this.isEsNuevoAbonoPrestamo=false;
			
			if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAbonoPrestamo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAbonoPrestamo(false);
				
				//SI ES MANUAL
				if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAbonoPrestamo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAbonoPrestamo--;			
			//AbonoPrestamo abonoprestamoAux= new AbonoPrestamo();			
			//abonoprestamoAux.setId(this.iIdNuevoAbonoPrestamo);
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAbonoPrestamo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
			
			this.abonoprestamo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.abonoprestamoLogic.getAbonoPrestamos().add(this.abonoprestamoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.abonoprestamos.add(this.abonoprestamoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			
			this.jTableDatosAbonoPrestamo.setRowSelectionInterval(this.getIndiceNuevoAbonoPrestamo(), this.getIndiceNuevoAbonoPrestamo());
			
			int iLastRow =  this.jTableDatosAbonoPrestamo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAbonoPrestamo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAbonoPrestamo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAbonoPrestamo(false);
			
			//SI ES MANUAL
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAbonoPrestamo();
			}
			
			//this.abrirFrameTreeAbonoPrestamo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Abono PrestamoS ?", "MANTENIMIENTO DE Abono Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAbonoPrestamo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAbonoPrestamo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.abonoprestamoReturnGeneral=abonoprestamoLogic.procesarImportacionAbonoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.abonoprestamoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAbonoPrestamoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAbonoPrestamo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAbonoPrestamo.setFileImportacion(this.jInternalFrameImportacionAbonoPrestamo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAbonoPrestamo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAbonoPrestamo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAbonoPrestamo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAbonoPrestamo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		

		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AbonoPrestamoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AbonoPrestamoBaseDesign.jrxml";
			
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
			
			this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Prestamo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Prestamo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Prestamo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Prestamo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoCapital_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoCapital_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoCapital_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoCapital_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntoInteres_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntoInteres_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntoInteres_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntoInteres_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoQuincena_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoQuincena_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoQuincena_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoQuincena_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO:
					sNombreCampoCategoria="id_prestamo";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoria="monto_capital";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoria="monto_interes";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA:
					sNombreCampoCategoria="codigo_quincena";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO:
					sNombreCampoCategoriaValor="id_prestamo";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL:
					sNombreCampoCategoriaValor="monto_capital";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES:
					sNombreCampoCategoriaValor="monto_interes";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA:
					sNombreCampoCategoriaValor="codigo_quincena";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idprestamo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_prestamo");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Capital",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_capital");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Monto Interes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"monto_interes");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Quincena",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_quincena");
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
	
	public void jButtonGenerarExcelReporteDinamicoAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("AbonoPrestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getprestamo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getmonto_capital());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getmonto_interes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA);
					iRow++;

					for(AbonoPrestamo abonoprestamo:abonoprestamosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(abonoprestamo.getcodigo_quincena());
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
			//	this.getFilaCabeceraExportarExcelAbonoPrestamo(row);				
			//	iRow++;
			//}				
			
			//for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAbonoPrestamo(abonoprestamoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
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
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAbonoPrestamo(false);
			
			//SI ES MANUAL
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAbonoPrestamo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAbonoPrestamo(false);
			
			//SI ES MANUAL
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAbonoPrestamo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAbonoPrestamo(false);
			
			//SI ES MANUAL
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAbonoPrestamo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAbonoPrestamo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAbonoPrestamo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAbonoPrestamo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAbonoPrestamo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAbonoPrestamo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAbonoPrestamo.setMinimumSize(dimensionMinimum);
		this.jTableDatosAbonoPrestamo.setMaximumSize(dimensionMaximum);
		this.jTableDatosAbonoPrestamo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAbonoPrestamo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAbonoPrestamo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAbonoPrestamo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAbonoPrestamo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAbonoPrestamo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAbonoPrestamo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAbonoPrestamo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAbonoPrestamo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAbonoPrestamo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAbonoPrestamo();
		
		this.inicializarActualizarBindingBotonesManualAbonoPrestamo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAbonoPrestamo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAbonoPrestamo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAbonoPrestamo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAbonoPrestamo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAbonoPrestamo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAbonoPrestamo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAbonoPrestamo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionNuevoAbonoPrestamo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionSinCerrarAbonoPrestamo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionSinMensajeAbonoPrestamo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAbonoPrestamo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAbonoPrestamo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAbonoPrestamo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
				this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionNuevoAbonoPrestamo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionSinCerrarAbonoPrestamo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAbonoPrestamo.jCheckBoxPostAccionSinMensajeAbonoPrestamo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAbonoPrestamo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAbonoPrestamo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAbonoPrestamo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAbonoPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAbonoPrestamo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAbonoPrestamo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAbonoPrestamo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAbonoPrestamo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAbonoPrestamo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAbonoPrestamo(Boolean esInicializar) throws Exception {
		try	{	
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAbonoPrestamo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAbonoPrestamo() throws Exception {
		try	{
			if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAbonoPrestamo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAbonoPrestamo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAbonoPrestamo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAbonoPrestamo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAbonoPrestamo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAbonoPrestamo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAbonoPrestamo.addItem(reporte);
			}
			
			
			if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAbonoPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAbonoPrestamo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAbonoPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAbonoPrestamo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAbonoPrestamo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAbonoPrestamo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAbonoPrestamo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAbonoPrestamo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAbonoPrestamo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
				
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AbonoPrestamoConstantesFunciones.getTiposSeleccionarAbonoPrestamo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AbonoPrestamoConstantesFunciones.getTiposSeleccionarAbonoPrestamo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AbonoPrestamoConstantesFunciones.getTiposSeleccionarAbonoPrestamo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAbonoPrestamo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAbonoPrestamo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.getSelectedItem()!=null){this.id_prestamoFK_IdPrestamo=((Prestamo)this.jComboBoxid_prestamoFK_IdPrestamoAbonoPrestamo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAbonoPrestamo(Boolean esInicializar) throws Exception {				
		if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAbonoPrestamo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAbonoPrestamo() throws Exception {
		this.inicializarActualizarBindingTablaAbonoPrestamo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAbonoPrestamo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAbonoPrestamoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAbonoPrestamo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=abonoprestamoLogic.getAbonoPrestamos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=abonoprestamos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAbonoPrestamo.setModel(new AbonoPrestamoModel(this.abonoprestamoLogic.getAbonoPrestamos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAbonoPrestamo.setModel(new AbonoPrestamoModel(this.abonoprestamos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAbonoPrestamo!=null && this.jInternalFrameOrderByAbonoPrestamo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAbonoPrestamo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,abonoprestamoConstantesFunciones.resaltarSeleccionarAbonoPrestamo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AbonoPrestamoConstantesFunciones.SCLASSWEBTITULO,abonoprestamoConstantesFunciones.resaltarSeleccionarAbonoPrestamo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_ID));

		if(this.abonoprestamoConstantesFunciones.mostraridAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.abonoprestamoConstantesFunciones.resaltaridAbonoPrestamo,this.abonoprestamoConstantesFunciones.activaridAbonoPrestamo,iSizeTabla,this,true,"idAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltaridAbonoPrestamo,this.abonoprestamoConstantesFunciones.activaridAbonoPrestamo,this,true,"idAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO));

		if(this.abonoprestamoConstantesFunciones.mostrarid_prestamoAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PrestamoTableCell(this.prestamosForeignKey,this.abonoprestamoConstantesFunciones.resaltarid_prestamoAbonoPrestamo,this,this.abonoprestamoConstantesFunciones.activarid_prestamoAbonoPrestamo,iSizeTabla));
			tableColumn.setCellEditor(new PrestamoTableCell(this.prestamosForeignKey,this.abonoprestamoConstantesFunciones.resaltarid_prestamoAbonoPrestamo,this,this.abonoprestamoConstantesFunciones.activarid_prestamoAbonoPrestamo,true,"id_prestamoAbonoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_NUMERO));

		if(this.abonoprestamoConstantesFunciones.mostrarnumeroAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.abonoprestamoConstantesFunciones.resaltarnumeroAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarnumeroAbonoPrestamo,iSizeTabla,this,true,"numeroAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarnumeroAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarnumeroAbonoPrestamo,this,true,"numeroAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL));

		if(this.abonoprestamoConstantesFunciones.mostrarmonto_capitalAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.abonoprestamoConstantesFunciones.resaltarmonto_capitalAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarmonto_capitalAbonoPrestamo,iSizeTabla,this,true,"monto_capitalAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarmonto_capitalAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarmonto_capitalAbonoPrestamo,this,true,"monto_capitalAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES));

		if(this.abonoprestamoConstantesFunciones.mostrarmonto_interesAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.abonoprestamoConstantesFunciones.resaltarmonto_interesAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarmonto_interesAbonoPrestamo,iSizeTabla,this,true,"monto_interesAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarmonto_interesAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarmonto_interesAbonoPrestamo,this,true,"monto_interesAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_VALOR));

		if(this.abonoprestamoConstantesFunciones.mostrarvalorAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.abonoprestamoConstantesFunciones.resaltarvalorAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarvalorAbonoPrestamo,iSizeTabla,this,true,"valorAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarvalorAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarvalorAbonoPrestamo,this,true,"valorAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.abonoprestamoConstantesFunciones.mostrarfecha_vencimientoAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.abonoprestamoConstantesFunciones.resaltarfecha_vencimientoAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarfecha_vencimientoAbonoPrestamo,iSizeTabla,this,true,"fecha_vencimientoAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarfecha_vencimientoAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarfecha_vencimientoAbonoPrestamo,this,true,"fecha_vencimientoAbonoPrestamo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA));

		if(this.abonoprestamoConstantesFunciones.mostrarcodigo_quincenaAbonoPrestamo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.abonoprestamoConstantesFunciones.resaltarcodigo_quincenaAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarcodigo_quincenaAbonoPrestamo,iSizeTabla,this,true,"codigo_quincenaAbonoPrestamo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.abonoprestamoConstantesFunciones.resaltarcodigo_quincenaAbonoPrestamo,this.abonoprestamoConstantesFunciones.activarcodigo_quincenaAbonoPrestamo,this,true,"codigo_quincenaAbonoPrestamo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AbonoPrestamoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAbonoPrestamo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAbonoPrestamo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.abonoprestamoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAbonoPrestamo.addColumn(tableColumn);
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
			
			this.jTableDatosAbonoPrestamo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAbonoPrestamo.moveColumn(this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAbonoPrestamo.moveColumn(this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAbonoPrestamo.moveColumn(this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAbonoPrestamo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAbonoPrestamo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAbonoPrestamo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAbonoPrestamo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAbonoPrestamo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAbonoPrestamo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAbonoPrestamo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=abonoprestamoLogic.getAbonoPrestamos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=abonoprestamos.size()-1;
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
		//this.jTableDatosAbonoPrestamo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAbonoPrestamo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAbonoPrestamo();
			
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
				
				//this.isEsNuevoAbonoPrestamo=false;
					
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
				if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAbonoPrestamo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAbonoPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAbonoPrestamo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.abonoprestamo.getsType().equals("DUPLICADO")
				   || this.abonoprestamo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAbonoPrestamo=true;
				
				} else {
					this.isEsNuevoAbonoPrestamo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					if(this.abonoprestamo.getId()>=0 && !this.abonoprestamo.getIsNew()) {						
						this.isEsNuevoAbonoPrestamo=false;
						
					} else {
						this.isEsNuevoAbonoPrestamo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAbonoPrestamo(esRelaciones);						
				
				this.seleccionarAbonoPrestamo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.abonoprestamo.getId()<0) {
					this.isEsNuevoAbonoPrestamo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAbonoPrestamo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAbonoPrestamo(evt,rowIndex);
				}	
				
				if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion AbonoPrestamo: " + this.dDif); 
					}
				}								
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAbonoPrestamo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.abonoprestamo)) {
					if(this.abonoprestamo.getId()>0) {
						this.abonoprestamo.setIsDeleted(true);
						
						this.abonoprestamosEliminados.add(this.abonoprestamo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.abonoprestamoLogic.getAbonoPrestamos().remove(this.abonoprestamo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.abonoprestamos.remove(this.abonoprestamo);				
					}
					
					
					((AbonoPrestamoModel) this.jTableDatosAbonoPrestamo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAbonoPrestamo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAbonoPrestamo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAbonoPrestamo) {
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAbonoPrestamo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAbonoPrestamo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamo);
				}
				
				//ARCHITECTURE
				try {
					

					//Prestamo
					if(!this.abonoprestamoConstantesFunciones.cargarid_prestamoAbonoPrestamo || this.abonoprestamoConstantesFunciones.event_dependid_prestamoAbonoPrestamo) {
						//this.cargarCombosPrestamosForeignKeyLista(" where id="+this.abonoprestamo.getid_prestamo());
									//this.inicializarActualizarBindingAbonoPrestamo(false,false);
						this.prestamosForeignKey=new ArrayList<Prestamo>();

						if(abonoprestamo.getPrestamo()!=null) {
							this.prestamosForeignKey.add(abonoprestamo.getPrestamo());
						}

						this.addItemDefectoCombosForeignKeyPrestamo();
						this.cargarCombosFramePrestamosForeignKey("Todos");
					}
					this.setActualPrestamoForeignKey(this.abonoprestamo.getid_prestamo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAbonoPrestamo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAbonoPrestamo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAbonoPrestamo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAbonoPrestamo(AbonoPrestamo abonoprestamo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAbonoPrestamo(abonoprestamo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAbonoPrestamo(AbonoPrestamo abonoprestamo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAbonoPrestamo(abonoprestamo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAbonoPrestamo(abonoprestamo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAbonoPrestamo(abonoprestamo);
	}
	
	public void setVariablesObjetoActualToFormularioAbonoPrestamo(AbonoPrestamo abonoprestamo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setText(abonoprestamo.getId().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setText(abonoprestamo.getnumero().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setText(abonoprestamo.getmonto_capital().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setText(abonoprestamo.getmonto_interes().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setText(abonoprestamo.getvalor().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setDate(abonoprestamo.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setText(abonoprestamo.getcodigo_quincena());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,AbonoPrestamo abonoprestamoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,abonoprestamoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,AbonoPrestamo abonoprestamoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				abonoprestamoLocal=this.abonoprestamo;
			} else {
				abonoprestamoLocal=this.abonoprestamoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(abonoprestamoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAbonoPrestamo(abonoprestamoLocal,true);
					
					if(abonoprestamoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(abonoprestamoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(abonoprestamoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAbonoPrestamo(AbonoPrestamo abonoprestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAbonoPrestamo(abonoprestamo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(abonoprestamo);
	}
	
	public void setVariablesFormularioToObjetoActualAbonoPrestamo(AbonoPrestamo abonoprestamo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAbonoPrestamo(abonoprestamo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAbonoPrestamo(AbonoPrestamo abonoprestamo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.getText()==null || this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.getText()=="" || this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.getText()=="Id") {
				this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setText("0");
			}

			if(conColumnasBase) {abonoprestamo.setId(Long.parseLong(this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelIdAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setnumero(Integer.parseInt(this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelnumeroAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setmonto_capital(Double.parseDouble(this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_capitalAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setmonto_interes(Double.parseDouble(this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelmonto_interesAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelvalorAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setfecha_vencimiento(this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelfecha_vencimientoAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			abonoprestamo.setcodigo_quincena(this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAbonoPrestamo.jLabelcodigo_quincenaAbonoPrestamo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAbonoPrestamo(AbonoPrestamo abonoprestamoBean,AbonoPrestamo abonoprestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && abonoprestamoBean.getid_prestamo()!=null && !abonoprestamoBean.getid_prestamo().equals(-1L))) {abonoprestamo.setid_prestamo(abonoprestamoBean.getid_prestamo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAbonoPrestamo(AbonoPrestamo abonoprestamoOrigen,AbonoPrestamo abonoprestamo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && abonoprestamoOrigen.getId()!=null && !abonoprestamoOrigen.getId().equals(0L))) {abonoprestamo.setId(abonoprestamoOrigen.getId());}}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getid_prestamo()!=null && !abonoprestamoOrigen.getid_prestamo().equals(-1L))) {abonoprestamo.setid_prestamo(abonoprestamoOrigen.getid_prestamo());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getnumero()!=null && !abonoprestamoOrigen.getnumero().equals(0))) {abonoprestamo.setnumero(abonoprestamoOrigen.getnumero());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getmonto_capital()!=null && !abonoprestamoOrigen.getmonto_capital().equals(0.0))) {abonoprestamo.setmonto_capital(abonoprestamoOrigen.getmonto_capital());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getmonto_interes()!=null && !abonoprestamoOrigen.getmonto_interes().equals(0.0))) {abonoprestamo.setmonto_interes(abonoprestamoOrigen.getmonto_interes());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getvalor()!=null && !abonoprestamoOrigen.getvalor().equals(0.0))) {abonoprestamo.setvalor(abonoprestamoOrigen.getvalor());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getfecha_vencimiento()!=null && !abonoprestamoOrigen.getfecha_vencimiento().equals(new Date()))) {abonoprestamo.setfecha_vencimiento(abonoprestamoOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && abonoprestamoOrigen.getcodigo_quincena()!=null && !abonoprestamoOrigen.getcodigo_quincena().equals(""))) {abonoprestamo.setcodigo_quincena(abonoprestamoOrigen.getcodigo_quincena());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAbonoPrestamo(AbonoPrestamo abonoprestamo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setText(abonoprestamo.getId().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setText(abonoprestamo.getnumero().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setText(abonoprestamo.getmonto_capital().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setText(abonoprestamo.getmonto_interes().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setText(abonoprestamo.getvalor().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setDate(abonoprestamo.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setText(abonoprestamo.getcodigo_quincena());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAbonoPrestamo(AbonoPrestamoBean abonoprestamoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setText(abonoprestamoBean.getId().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setText(abonoprestamoBean.getnumero().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setText(abonoprestamoBean.getmonto_capital().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setText(abonoprestamoBean.getmonto_interes().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setText(abonoprestamoBean.getvalor().toString());
			this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setDate(abonoprestamoBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setText(abonoprestamoBean.getcodigo_quincena());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAbonoPrestamo(AbonoPrestamoParameterReturnGeneral abonoprestamoReturnGeneral,AbonoPrestamoBean abonoprestamoBean,Boolean conDefault) throws Exception { 
		try {
			AbonoPrestamo abonoprestamoLocal=new AbonoPrestamo();
			
			abonoprestamoLocal=abonoprestamoReturnGeneral.getAbonoPrestamo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && abonoprestamoLocal.getId()!=null && !abonoprestamoLocal.getId().equals(0L))) {abonoprestamoBean.setId(abonoprestamoLocal.getId());}}
			if(conDefault || (!conDefault && abonoprestamoLocal.getid_prestamo()!=null && !abonoprestamoLocal.getid_prestamo().equals(-1L))) {abonoprestamoBean.setid_prestamo(abonoprestamoLocal.getid_prestamo());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getnumero()!=null && !abonoprestamoLocal.getnumero().equals(0))) {abonoprestamoBean.setnumero(abonoprestamoLocal.getnumero());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getmonto_capital()!=null && !abonoprestamoLocal.getmonto_capital().equals(0.0))) {abonoprestamoBean.setmonto_capital(abonoprestamoLocal.getmonto_capital());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getmonto_interes()!=null && !abonoprestamoLocal.getmonto_interes().equals(0.0))) {abonoprestamoBean.setmonto_interes(abonoprestamoLocal.getmonto_interes());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getvalor()!=null && !abonoprestamoLocal.getvalor().equals(0.0))) {abonoprestamoBean.setvalor(abonoprestamoLocal.getvalor());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getfecha_vencimiento()!=null && !abonoprestamoLocal.getfecha_vencimiento().equals(new Date()))) {abonoprestamoBean.setfecha_vencimiento(abonoprestamoLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && abonoprestamoLocal.getcodigo_quincena()!=null && !abonoprestamoLocal.getcodigo_quincena().equals(""))) {abonoprestamoBean.setcodigo_quincena(abonoprestamoLocal.getcodigo_quincena());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAbonoPrestamoGenerico(Long idAbonoPrestamoSeleccionado,JComboBox jComboBoxAbonoPrestamo,List<AbonoPrestamo> abonoprestamosLocal)throws Exception {
		try {
			AbonoPrestamo  abonoprestamoTemp=null;

			for(AbonoPrestamo abonoprestamoAux:abonoprestamosLocal) {
				if(abonoprestamoAux.getId()!=null && abonoprestamoAux.getId().equals(idAbonoPrestamoSeleccionado)) {
					abonoprestamoTemp=abonoprestamoAux;
					break;
				}
			}

			jComboBoxAbonoPrestamo.setSelectedItem(abonoprestamoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAbonoPrestamoGenerico(JComboBox jComboBoxAbonoPrestamo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAbonoPrestamo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAbonoPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAbonoPrestamo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAbonoPrestamo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAbonoPrestamo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAbonoPrestamo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			abonoprestamo=(AbonoPrestamo) abonoprestamoLogic.getAbonoPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			abonoprestamo =(AbonoPrestamo) abonoprestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Prestamo")) {
			//sDescripcion=this.getActualPrestamoForeignKeyDescripcion((Long)value);
			if(!abonoprestamo.getIsNew() && !abonoprestamo.getIsChanged() && !abonoprestamo.getIsDeleted()) {
				sDescripcion=abonoprestamo.getprestamo_descripcion();
			} else {
				//sDescripcion=this.getActualPrestamoForeignKeyDescripcion((Long)value);
				sDescripcion=abonoprestamo.getprestamo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		AbonoPrestamo abonoprestamoRow=new AbonoPrestamo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			abonoprestamoRow=(AbonoPrestamo) abonoprestamoLogic.getAbonoPrestamos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			abonoprestamoRow=(AbonoPrestamo) abonoprestamos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAbonoPrestamo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));			
			this.jButtonDuplicarAbonoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarAbonoPrestamo && this.isPermisoDuplicarAbonoPrestamo));			
			this.jButtonCopiarAbonoPrestamo.setVisible((this.isVisibilidadCeldaCopiarAbonoPrestamo && this.isPermisoCopiarAbonoPrestamo));
			this.jButtonVerFormAbonoPrestamo.setVisible((this.isVisibilidadCeldaVerFormAbonoPrestamo && this.isPermisoVerFormAbonoPrestamo));
			
			this.jButtonAbrirOrderByAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));			
			
			this.jButtonNuevoRelacionesAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));			
			this.jButtonNuevoGuardarCambiosAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarAbonoPrestamo.setVisible((this.isVisibilidadCeldaModificarAbonoPrestamo && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.setVisible((this.isVisibilidadCeldaActualizarAbonoPrestamo && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.setVisible((this.isVisibilidadCeldaEliminarAbonoPrestamo && this.isPermisoEliminarAbonoPrestamo));
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.setVisible(this.isVisibilidadCeldaCancelarAbonoPrestamo);							
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));			
			
			}
						
			this.jButtonGuardarCambiosTablaAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));						
			this.jButtonDuplicarToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarAbonoPrestamo && this.isPermisoDuplicarAbonoPrestamo));						
			this.jButtonCopiarToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaCopiarAbonoPrestamo && this.isPermisoCopiarAbonoPrestamo));			
			this.jButtonVerFormToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaVerFormAbonoPrestamo && this.isPermisoVerFormAbonoPrestamo));			
			this.jButtonAbrirOrderByToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));
			this.jButtonNuevoRelacionesToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));			
			this.jButtonNuevoGuardarCambiosToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));			
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaModificarAbonoPrestamo && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaActualizarAbonoPrestamo  && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaEliminarAbonoPrestamo && this.isPermisoEliminarAbonoPrestamo));
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarToolBarAbonoPrestamo.setVisible(this.isVisibilidadCeldaCancelarAbonoPrestamo);				
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));			
			this.jMenuItemDuplicarAbonoPrestamo.setVisible((this.isVisibilidadCeldaDuplicarAbonoPrestamo && this.isPermisoDuplicarAbonoPrestamo));			
			this.jMenuItemCopiarAbonoPrestamo.setVisible((this.isVisibilidadCeldaCopiarAbonoPrestamo && this.isPermisoCopiarAbonoPrestamo));			
			this.jMenuItemVerFormAbonoPrestamo.setVisible((this.isVisibilidadCeldaVerFormAbonoPrestamo && this.isPermisoVerFormAbonoPrestamo));			
			this.jMenuItemAbrirOrderByAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));			
			//this.jMenuItemMostrarOcultarAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));
			this.jMenuItemDetalleAbrirOrderByAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));			
			//this.jMenuItemDetalleMostrarOcultarAbonoPrestamo.setVisible((this.isVisibilidadCeldaOrdenAbonoPrestamo && this.isPermisoOrdenAbonoPrestamo));			
			this.jMenuItemNuevoRelacionesAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo));			
			this.jMenuItemNuevoGuardarCambiosAbonoPrestamo.setVisible((this.isVisibilidadCeldaNuevoAbonoPrestamo && this.isPermisoNuevoAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));									
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemModificarAbonoPrestamo.setVisible((this.isVisibilidadCeldaModificarAbonoPrestamo && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemActualizarAbonoPrestamo.setVisible((this.isVisibilidadCeldaActualizarAbonoPrestamo && this.isPermisoActualizarAbonoPrestamo));	
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemEliminarAbonoPrestamo.setVisible((this.isVisibilidadCeldaEliminarAbonoPrestamo && this.isPermisoEliminarAbonoPrestamo));
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemCancelarAbonoPrestamo.setVisible(this.isVisibilidadCeldaCancelarAbonoPrestamo);				
			}
			
			this.jMenuItemGuardarCambiosAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));						
			this.jMenuItemGuardarCambiosTablaAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=this.jButtonNuevoAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaDuplicarAbonoPrestamo=this.jButtonDuplicarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaCopiarAbonoPrestamo=this.jButtonCopiarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaVerFormAbonoPrestamo=this.jButtonVerFormAbonoPrestamo.isVisible();
			
			this.isVisibilidadCeldaOrdenAbonoPrestamo=this.jButtonAbrirOrderByAbonoPrestamo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=this.jButtonNuevoRelacionesAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaModificarAbonoPrestamo=this.jButtonModificarAbonoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.isVisibilidadCeldaActualizarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=this.jButtonGuardarCambiosTablaAbonoPrestamo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAbonoPrestamo=this.jButtonNuevoToolBarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=this.jButtonNuevoRelacionesToolBarAbonoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.isVisibilidadCeldaModificarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarToolBarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarToolBarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarToolBarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarToolBarAbonoPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAbonoPrestamo=this.jButtonGuardarCambiosToolBarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAbonoPrestamo=this.jMenuItemNuevoAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=this.jMenuItemNuevoRelacionesAbonoPrestamo.isVisible();
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.isVisibilidadCeldaModificarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemModificarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaActualizarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemActualizarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaEliminarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemEliminarAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaCancelarAbonoPrestamo=this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemCancelarAbonoPrestamo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAbonoPrestamo=this.jMenuItemGuardarCambiosAbonoPrestamo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=this.jMenuItemGuardarCambiosTablaAbonoPrestamo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAbonoPrestamo(Boolean esInicializar) {
		if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
				//if(this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAbonoPrestamo();
			}
			
			this.inicializarActualizarBindingBotonesManualAbonoPrestamo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAbonoPrestamo() {
		this.jButtonNuevoAbonoPrestamo.setVisible(this.isPermisoNuevoAbonoPrestamo);			
		this.jButtonDuplicarAbonoPrestamo.setVisible(this.isPermisoDuplicarAbonoPrestamo);			
		this.jButtonCopiarAbonoPrestamo.setVisible(this.isPermisoCopiarAbonoPrestamo);			
		this.jButtonVerFormAbonoPrestamo.setVisible(this.isPermisoVerFormAbonoPrestamo);			
		
		this.jButtonAbrirOrderByAbonoPrestamo.setVisible(this.isPermisoOrdenAbonoPrestamo);					
		
		this.jButtonNuevoRelacionesAbonoPrestamo.setVisible(this.isPermisoNuevoAbonoPrestamo);			
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarAbonoPrestamo.setVisible(this.isPermisoActualizarAbonoPrestamo);	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.setVisible(this.isPermisoActualizarAbonoPrestamo);	
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.setVisible(this.isPermisoEliminarAbonoPrestamo);
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.setVisible(this.isVisibilidadCeldaCancelarAbonoPrestamo);						
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.setVisible(this.isPermisoGuardarCambiosAbonoPrestamo);							
		}
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.setVisible(this.isPermisoActualizarAbonoPrestamo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAbonoPrestamo() {
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarAbonoPrestamo.setVisible(this.isPermisoActualizarAbonoPrestamo);	
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.setVisible(this.isPermisoActualizarAbonoPrestamo);	
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.setVisible(this.isPermisoEliminarAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.setVisible(this.isVisibilidadCeldaCancelarAbonoPrestamo);							
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.setVisible((this.isVisibilidadCeldaGuardarAbonoPrestamo && this.isPermisoGuardarCambiosAbonoPrestamo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAbonoPrestamo() {
		if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAbonoPrestamo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAbonoPrestamo() {
	}
	
	public void jTableDatosAbonoPrestamoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAbonoPrestamo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.abonoprestamo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_prestamoAbonoPrestamoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoprestamo=true;

			idTienePermisoprestamo=this.tienePermisosUsuarioEnPaginaWebAbonoPrestamo(PrestamoConstantesFunciones.CLASSNAME);

			if(idTienePermisoprestamo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAbonoPrestamo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAbonoPrestamo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.abonoprestamoLogic.getConnexion());

				if(this.abonoprestamo.getid_prestamo()!=null) {
					this.prestamoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.prestamoBeanSwingJInternalFrame.setIdActual(this.abonoprestamo.getid_prestamo());
					this.prestamoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.prestamoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo();
				}

				JInternalFrameBase jinternalFrame =this.prestamoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAbonoPrestamo=(TitledBorder)this.jScrollPanelDatosAbonoPrestamo.getBorder();
				TitledBorder titledBorderprestamo=(TitledBorder)this.prestamoBeanSwingJInternalFrame.jScrollPanelDatosPrestamo.getBorder();

				titledBorderprestamo.setTitle(titledBorderAbonoPrestamo.getTitle() + " -> Prestamo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_prestamoAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getid_prestamo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_prestamo = "+this.abonoprestamo.getid_prestamo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.abonoprestamo.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_capitalAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getmonto_capital()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_capital = "+this.abonoprestamo.getmonto_capital().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmonto_interesAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getmonto_interes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where monto_interes = "+this.abonoprestamo.getmonto_interes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.abonoprestamo.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.abonoprestamo.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_quincenaAbonoPrestamoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.getabonoprestamo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.abonoprestamo==null) {
						this.abonoprestamo = new AbonoPrestamo();
					}

					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);
				}

				if(this.abonoprestamo.getcodigo_quincena()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_quincena like '%"+this.abonoprestamo.getcodigo_quincena()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAbonoPrestamo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPrestamoAbonoPrestamoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAbonoPrestamo(false,false);

			this.getAbonoPrestamosFK_IdPrestamo();

			this.inicializarActualizarBindingAbonoPrestamo(false);

			//if(AbonoPrestamoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAbonoPrestamo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.abonoprestamoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAbonoPrestamo() {
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
			this.jInternalFrameDetalleFormAbonoPrestamo.setVisible(false);	    			
			this.jInternalFrameDetalleFormAbonoPrestamo.dispose();
			this.jInternalFrameDetalleFormAbonoPrestamo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
			this.jInternalFrameReporteDinamicoAbonoPrestamo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAbonoPrestamo.dispose();
			this.jInternalFrameReporteDinamicoAbonoPrestamo=null;
		}
		
		if(this.jInternalFrameImportacionAbonoPrestamo!=null) {
			this.jInternalFrameImportacionAbonoPrestamo.setVisible(false);	    			
			this.jInternalFrameImportacionAbonoPrestamo.dispose();
			this.jInternalFrameImportacionAbonoPrestamo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAbonoPrestamo();
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			
			if(sTipo.equals("NuevoAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAbonoPrestamo")) {
				jButtonDuplicarAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAbonoPrestamo")) {
				jButtonCopiarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormAbonoPrestamo")) {
				jButtonVerFormAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAbonoPrestamo")) {
				jButtonDuplicarAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAbonoPrestamo")) {
				jButtonDuplicarAbonoPrestamoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAbonoPrestamo")) {
				jButtonModificarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAbonoPrestamo")) {
				jButtonModificarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAbonoPrestamo")) {
				jButtonModificarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAbonoPrestamo")) {
				jButtonActualizarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAbonoPrestamo")) {
				jButtonActualizarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAbonoPrestamo")) {
				jButtonActualizarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarAbonoPrestamo")) {
				jButtonEliminarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAbonoPrestamo")) {
				jButtonEliminarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAbonoPrestamo")) {
				jButtonEliminarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarAbonoPrestamo")) {
				jButtonCancelarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAbonoPrestamo")) {
				jButtonCancelarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAbonoPrestamo")) {
				jButtonCancelarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarAbonoPrestamo")) {
				jButtonCerrarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAbonoPrestamo")) {
				jButtonCerrarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAbonoPrestamo")) {
				jButtonCerrarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAbonoPrestamo")) {
				jButtonMostrarOcultarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAbonoPrestamo")) {
				jButtonCancelarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAbonoPrestamo")) {
				jButtonCopiarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAbonoPrestamo")) {
				jButtonVerFormAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAbonoPrestamo")) {
				jButtonCopiarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAbonoPrestamo")) {
				jButtonVerFormAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAbonoPrestamo")) {
				jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAbonoPrestamo")) {
				jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAbonoPrestamo")) {
				jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAbonoPrestamo")) {
				jButtonAnterioresAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAbonoPrestamo")) {
				jButtonAnterioresAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAbonoPrestamo")) {
				jButtonAnterioresAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAbonoPrestamo")) {
				jButtonSiguientesAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAbonoPrestamo")) {
				jButtonSiguientesAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAbonoPrestamo")) {
				jButtonSiguientesAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAbonoPrestamo") || sTipo.equals("MenuItemDetalleAbrirOrderByAbonoPrestamo")) {
				jButtonAbrirOrderByAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAbonoPrestamo") || sTipo.equals("MenuItemDetalleMostrarOcultarAbonoPrestamo")) {
				jButtonMostrarOcultarAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAbonoPrestamo")) {
				jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAbonoPrestamo")) {
				jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAbonoPrestamo")) {
				jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAbonoPrestamo")) {
				jButtonCerrarReporteDinamicoAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAbonoPrestamo")) {
				jButtonGenerarReporteDinamicoAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAbonoPrestamo")) {
				
				jButtonGenerarExcelReporteDinamicoAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAbonoPrestamo")) {
				jButtonCerrarImportacionAbonoPrestamoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAbonoPrestamo")) {
				
				jButtonGenerarImportacionAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAbonoPrestamo")) {
				
				jButtonAbrirImportacionAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAbonoPrestamo")) {
				jComboBoxTiposAccionesAbonoPrestamoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAbonoPrestamo")) {
				jComboBoxTiposRelacionesAbonoPrestamoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAbonoPrestamo")) {
				jComboBoxTiposAccionesAbonoPrestamoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAbonoPrestamo")) {
				
				jComboBoxTiposSeleccionarAbonoPrestamoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAbonoPrestamo")) {
				jTextFieldValorCampoGeneralAbonoPrestamoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAbonoPrestamo")) {
				jButtonAbrirOrderByAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAbonoPrestamo")) {
				jButtonAbrirOrderByAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAbonoPrestamo")) {
				jButtonCerrarOrderByAbonoPrestamoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAbonoPrestamoBusqueda")) {
				this.jButtonidAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_prestamoAbonoPrestamoUpdate")) {
				this.jButtonid_prestamoAbonoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_prestamoAbonoPrestamoBusqueda")) {
				this.jButtonid_prestamoAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroAbonoPrestamoBusqueda")) {
				this.jButtonnumeroAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalAbonoPrestamoBusqueda")) {
				this.jButtonmonto_capitalAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesAbonoPrestamoBusqueda")) {
				this.jButtonmonto_interesAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAbonoPrestamoBusqueda")) {
				this.jButtonvalorAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoAbonoPrestamoBusqueda")) {
				this.jButtonfecha_vencimientoAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_quincenaAbonoPrestamoBusqueda")) {
				this.jButtoncodigo_quincenaAbonoPrestamoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPrestamoAbonoPrestamo")) {
				this.jButtonFK_IdPrestamoAbonoPrestamoActionPerformed(evt);
			}
			
			;
			
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAbonoPrestamo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			AbonoPrestamo abonoprestamoLocal=null;
			
			if(!this.getEsControlTabla()) {
				abonoprestamoLocal=this.abonoprestamo;
			} else {
				abonoprestamoLocal=this.abonoprestamoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
							
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
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
			
			


			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
								
						
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
								
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
							
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
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
			
			


			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
								
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAbonoPrestamo")) {
					jCheckBoxSeleccionarTodosAbonoPrestamoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAbonoPrestamo")) {
					jCheckBoxSeleccionadosAbonoPrestamoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAbonoPrestamo")) {
					
				}
				
				


				
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
												
				
				


				
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
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
			
			


			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAbonoPrestamoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.abonoprestamo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.abonoprestamo);
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
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
				
				


				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(AbonoPrestamo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",AbonoPrestamo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAbonoPrestamoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.abonoprestamoAnterior =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAbonoPrestamo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAbonoPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAbonoPrestamo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.abonoprestamo =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.abonoprestamo =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.abonoprestamo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAbonoPrestamo")) {
				
				}
				
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAbonoPrestamo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAbonoPrestamo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAbonoPrestamo")) {
			
			}
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAbonoPrestamo();
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			if(sTipo.equals("NuevoAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAbonoPrestamo")) {
				jButtonDuplicarAbonoPrestamoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAbonoPrestamo")) {
				jButtonCopiarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAbonoPrestamo")) {
				jButtonVerFormAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAbonoPrestamo")) {
				jButtonNuevoAbonoPrestamoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAbonoPrestamo")) {
				jButtonModificarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAbonoPrestamo")) {
				jButtonActualizarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAbonoPrestamo")) {
				jButtonEliminarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAbonoPrestamo")) {
				jButtonCancelarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAbonoPrestamo")) {
				jButtonCerrarAbonoPrestamoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAbonoPrestamo")) {
				jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAbonoPrestamo")) {
				jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAbonoPrestamo")) {
				jButtonAbrirOrderByAbonoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAbonoPrestamo")) {
				jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAbonoPrestamo")) {
				jButtonAnterioresAbonoPrestamoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAbonoPrestamo")) {
				jButtonSiguientesAbonoPrestamoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAbonoPrestamoBusqueda")) {
				this.jButtonidAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_prestamoAbonoPrestamoUpdate")) {
				this.jButtonid_prestamoAbonoPrestamoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_prestamoAbonoPrestamoBusqueda")) {
				this.jButtonid_prestamoAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroAbonoPrestamoBusqueda")) {
				this.jButtonnumeroAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_capitalAbonoPrestamoBusqueda")) {
				this.jButtonmonto_capitalAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("monto_interesAbonoPrestamoBusqueda")) {
				this.jButtonmonto_interesAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAbonoPrestamoBusqueda")) {
				this.jButtonvalorAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoAbonoPrestamoBusqueda")) {
				this.jButtonfecha_vencimientoAbonoPrestamoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_quincenaAbonoPrestamoBusqueda")) {
				this.jButtoncodigo_quincenaAbonoPrestamoBusquedaActionPerformed(evt);
			}
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAbonoPrestamo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAbonoPrestamo")) {
				closingInternalFrameAbonoPrestamo();
				
			} else if(sTipo.equals("jButtonCancelarAbonoPrestamo")) {
				JInternalFrameBase jInternalFrameDetalleFormAbonoPrestamo = (JInternalFrameBase)evt.getSource();
	            	
	            AbonoPrestamoBeanSwingJInternalFrame jInternalFrameParent=(AbonoPrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormAbonoPrestamo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAbonoPrestamoActionPerformed(null);
			}
			
			AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.abonoprestamo,new Object(),this.abonoprestamoParameterGeneral,this.abonoprestamoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAbonoPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAbonoPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAbonoPrestamo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.abonoprestamo)) {
			if(!esControlTabla) {
				if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);			
				}
				
				if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAbonoPrestamo(this.abonoprestamo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.abonoprestamoReturnGeneral=abonoprestamoLogic.procesarEventosAbonoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.abonoprestamoLogic.getAbonoPrestamos(),this.abonoprestamo,this.abonoprestamoParameterGeneral,this.isEsNuevoAbonoPrestamo,classes);//this.abonoprestamoLogic.getAbonoPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAbonoPrestamo(this.abonoprestamoReturnGeneral,this.abonoprestamoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAbonoPrestamo(classes,this.abonoprestamoReturnGeneral,this.abonoprestamoBean,false);
					}
						
					if(this.abonoprestamoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo());	
					}
						
					if(this.abonoprestamoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo(),classes);//this.abonoprestamoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAbonoPrestamo(this.abonoprestamo,classes);//this.abonoprestamoBean);									
				}
			
				if(AbonoPrestamoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAbonoPrestamo(this.abonoprestamo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAbonoPrestamo(this.abonoprestamo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.abonoprestamoAnterior!=null) {
						this.abonoprestamo=this.abonoprestamoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.abonoprestamoReturnGeneral=abonoprestamoLogic.procesarEventosAbonoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.abonoprestamoLogic.getAbonoPrestamos(),this.abonoprestamo,this.abonoprestamoParameterGeneral,this.isEsNuevoAbonoPrestamo,classes);//this.abonoprestamoLogic.getAbonoPrestamo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.abonoprestamoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.abonoprestamoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.abonoprestamoReturnGeneral.getAbonoPrestamo(),abonoprestamoLogic.getAbonoPrestamos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.abonoprestamoReturnGeneral.getAbonoPrestamo(),this.abonoprestamos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAbonoPrestamo.repaint();
				
				//((AbstractTableModel) this.jTableDatosAbonoPrestamo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAbonoPrestamo();
			}
		}
	}
	
	public void actualizarVisualTableDatosAbonoPrestamo() throws Exception {
		
		AbonoPrestamoModel abonoprestamoModel=(AbonoPrestamoModel)this.jTableDatosAbonoPrestamo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			abonoprestamoModel.abonoprestamos=this.abonoprestamoLogic.getAbonoPrestamos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			abonoprestamoModel.abonoprestamos=this.abonoprestamos;
		}
		
		
		((AbonoPrestamoModel) this.jTableDatosAbonoPrestamo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAbonoPrestamo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getabonoprestamoAnterior(),this.abonoprestamoLogic.getAbonoPrestamos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getabonoprestamoAnterior(),this.abonoprestamos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAbonoPrestamo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAbonoPrestamo(AbonoPrestamo abonoprestamo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
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
										
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.abonoprestamo,new Object(),generalEntityParameterGeneral,this.abonoprestamoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.abonoprestamoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AbonoPrestamoConstantesFunciones.getClassesRelationshipsOfAbonoPrestamo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AbonoPrestamoConstantesFunciones.getClassesRelationshipsFromStringsOfAbonoPrestamo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAbonoPrestamo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AbonoPrestamoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.abonoprestamo,new Object(),generalEntityParameterGeneral,this.abonoprestamoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAbonoPrestamo(AbonoPrestamoBean abonoprestamoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAbonoPrestamo(ArrayList<Classe> classes,AbonoPrestamoReturnGeneral abonoprestamoReturnGeneral,AbonoPrestamoBean abonoprestamoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAbonoPrestamo(AbonoPrestamo abonoprestamo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.abonoprestamo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAbonoPrestamo = new AbonoPrestamoDetalleFormJInternalFrame(jDesktopPane,this.abonoprestamoSessionBean.getConGuardarRelaciones(),this.abonoprestamoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.setVisible(false);
		this.jInternalFrameDetalleFormAbonoPrestamo.setSelected(false);						
		
		this.jInternalFrameDetalleFormAbonoPrestamo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAbonoPrestamo.abonoprestamoLogic=this.abonoprestamoLogic;
		
		this.cargarCombosFrameForeignKeyAbonoPrestamo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAbonoPrestamo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAbonoPrestamo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAbonoPrestamo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAbonoPrestamo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAbonoPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAbonoPrestamo"));
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarAbonoPrestamo"));

		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarAbonoPrestamo"));
					
		this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemModificarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarAbonoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarAbonoPrestamo"));
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAbonoPrestamo"));
						
		this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemActualizarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAbonoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarAbonoPrestamo"));
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarAbonoPrestamo"));
								
		this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemEliminarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAbonoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarAbonoPrestamo"));
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarAbonoPrestamo"));
					
		this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemCancelarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAbonoPrestamo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemDetalleCerrarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAbonoPrestamo"));		
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAbonoPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAbonoPrestamo"));
		
		
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAbonoPrestamo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonidAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idAbonoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonnumeroAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numeroAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_capitalAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_interesAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonvalorAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"valorAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonfecha_vencimientoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtoncodigo_quincenaAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_quincenaAbonoPrestamoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAbonoPrestamo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAbonoPrestamo"));
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAbonoPrestamo"));
		}
		
		this.jTableDatosAbonoPrestamo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAbonoPrestamo"));
		
		this.jTableDatosAbonoPrestamo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAbonoPrestamo"));
		
		this.jButtonNuevoAbonoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoAbonoPrestamo"));
		
		this.jButtonDuplicarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarAbonoPrestamo"));
		
		this.jButtonCopiarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"CopiarAbonoPrestamo"));
		
		this.jButtonVerFormAbonoPrestamo.addActionListener(new ButtonActionListener(this,"VerFormAbonoPrestamo"));
		
		
		this.jButtonNuevoToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoToolBarAbonoPrestamo"));
			
		this.jButtonDuplicarToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAbonoPrestamo"));
			
		this.jMenuItemNuevoAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAbonoPrestamo"));
			
		this.jMenuItemDuplicarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAbonoPrestamo"));		
		
		
		this.jButtonNuevoRelacionesAbonoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAbonoPrestamo"));
		
		
		this.jButtonNuevoRelacionesToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAbonoPrestamo"));
			
		this.jMenuItemNuevoRelacionesAbonoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAbonoPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarAbonoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonModificarToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ModificarToolBarAbonoPrestamo"));
			
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemModificarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"MenuItemModificarAbonoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"ActualizarAbonoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonActualizarToolBarAbonoPrestamo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAbonoPrestamo"));
				
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemActualizarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAbonoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarAbonoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonEliminarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"EliminarToolBarAbonoPrestamo"));
						
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemEliminarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAbonoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarAbonoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonCancelarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CancelarToolBarAbonoPrestamo"));
			
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemCancelarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAbonoPrestamo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAbonoPrestamo"));		
		
		
		this.jButtonCerrarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarAbonoPrestamo"));
		
		
		this.jButtonCerrarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarToolBarAbonoPrestamo"));
			
		this.jMenuItemCerrarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAbonoPrestamo"));
			
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jMenuItemDetalleCerrarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAbonoPrestamo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosAbonoPrestamo"));
		}
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAbonoPrestamo"));
		}
		
		this.jButtonCopiarToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CopiarToolBarAbonoPrestamo"));
			
		this.jButtonVerFormToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"VerFormToolBarAbonoPrestamo"));
		
		this.jMenuItemGuardarCambiosAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAbonoPrestamo"));
			
		this.jMenuItemCopiarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAbonoPrestamo"));		
		
		this.jMenuItemVerFormAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAbonoPrestamo"));		
		
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAbonoPrestamo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAbonoPrestamo"));
			
		this.jMenuItemGuardarCambiosTablaAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAbonoPrestamo"));		
		
		
		
		this.jButtonRecargarInformacionAbonoPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionAbonoPrestamo"));
					
		this.jButtonRecargarInformacionToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAbonoPrestamo"));
		
		this.jMenuItemRecargarInformacionAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAbonoPrestamo"));		
		
		
		
		this.jButtonAnterioresAbonoPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresAbonoPrestamo"));
		
		
		this.jButtonAnterioresToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAbonoPrestamo"));
		
		this.jMenuItemAnterioresAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAbonoPrestamo"));		
		
		
		this.jButtonSiguientesAbonoPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesAbonoPrestamo"));
		
		
		this.jButtonSiguientesToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAbonoPrestamo"));
			
		this.jMenuItemSiguientesAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAbonoPrestamo"));
			
		this.jMenuItemAbrirOrderByAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAbonoPrestamo"));
			
		this.jMenuItemMostrarOcultarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAbonoPrestamo"));
			
		this.jMenuItemDetalleAbrirOrderByAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAbonoPrestamo"));
			
		this.jMenuItemDetalleMostarOcultarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAbonoPrestamo"));		
		
		
		this.jButtonNuevoGuardarCambiosAbonoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAbonoPrestamo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAbonoPrestamo"));
			
		this.jMenuItemNuevoGuardarCambiosAbonoPrestamo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAbonoPrestamo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAbonoPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAbonoPrestamo"));

		this.jCheckBoxSeleccionadosAbonoPrestamo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAbonoPrestamo"));
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAbonoPrestamo"));
		}
		
		
		this.jComboBoxTiposRelacionesAbonoPrestamo.addActionListener (new ButtonActionListener(this,"TiposRelacionesAbonoPrestamo"));
			
		this.jComboBoxTiposAccionesAbonoPrestamo.addActionListener (new ButtonActionListener(this,"TiposAccionesAbonoPrestamo"));
					
		this.jComboBoxTiposSeleccionarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAbonoPrestamo"));
			
		this.jTextFieldValorCampoGeneralAbonoPrestamo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAbonoPrestamo"));		
		
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonidAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idAbonoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonnumeroAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numeroAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_capitalAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_interesAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonvalorAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"valorAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonfecha_vencimientoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtoncodigo_quincenaAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_quincenaAbonoPrestamoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPrestamoAbonoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdPrestamoAbonoPrestamo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAbonoPrestamo!=null) {
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAbonoPrestamo"));
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAbonoPrestamo"));
				this.jInternalFrameReporteDinamicoAbonoPrestamo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAbonoPrestamo"));
			}
			
			//this.jButtonCerrarReporteDinamicoAbonoPrestamo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAbonoPrestamo"));				
			//this.jButtonGenerarReporteDinamicoAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAbonoPrestamo"));
			//this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAbonoPrestamo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAbonoPrestamo!=null) {
				this.jInternalFrameImportacionAbonoPrestamo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAbonoPrestamo"));
				this.jInternalFrameImportacionAbonoPrestamo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAbonoPrestamo"));
				this.jInternalFrameImportacionAbonoPrestamo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAbonoPrestamo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAbonoPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByAbonoPrestamo"));
			
			this.jButtonAbrirOrderByToolBarAbonoPrestamo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAbonoPrestamo"));			
			
			if(this.jInternalFrameOrderByAbonoPrestamo!=null) {
				this.jInternalFrameOrderByAbonoPrestamo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAbonoPrestamo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAbonoPrestamo.jTabbedPaneRelacionesAbonoPrestamo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAbonoPrestamo"));
		
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
            		closingInternalFrameAbonoPrestamo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAbonoPrestamo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAbonoPrestamo = (JInternalFrameBase)event.getSource();
	            	
	            AbonoPrestamoBeanSwingJInternalFrame jInternalFrameParent=(AbonoPrestamoBeanSwingJInternalFrame)jInternalFrameDetalleFormAbonoPrestamo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAbonoPrestamoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAbonoPrestamo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAbonoPrestamoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAbonoPrestamo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAbonoPrestamo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAbonoPrestamo";
		inputMap = this.jButtonNuevoAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAbonoPrestamoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAbonoPrestamoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAbonoPrestamo";
		inputMap = this.jButtonNuevoRelacionesAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAbonoPrestamoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAbonoPrestamo";
		inputMap = this.jButtonModificarAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAbonoPrestamo";
		inputMap = this.jButtonActualizarAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAbonoPrestamo";
		inputMap = this.jButtonEliminarAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAbonoPrestamo";
		inputMap = this.jButtonCancelarAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAbonoPrestamo";
		inputMap = this.jButtonCerrarAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAbonoPrestamo";
		inputMap = this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonGuardarCambiosAbonoPrestamo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAbonoPrestamoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAbonoPrestamo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAbonoPrestamoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAbonoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAbonoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAbonoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAbonoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAbonoPrestamo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAbonoPrestamoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonidAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"idAbonoPrestamoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoUpdate.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonid_prestamoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"id_prestamoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonnumeroAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"numeroAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_capitalAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_capitalAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonmonto_interesAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"monto_interesAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonvalorAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"valorAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtonfecha_vencimientoAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoAbonoPrestamoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAbonoPrestamo.jButtoncodigo_quincenaAbonoPrestamoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_quincenaAbonoPrestamoBusqueda"));
		
		
		this.jButtonFK_IdPrestamoAbonoPrestamo.addActionListener(new ButtonActionListener(this,"FK_IdPrestamoAbonoPrestamo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAbonoPrestamo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAbonoPrestamoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAbonoPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAbonoPrestamo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAbonoPrestamo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
					abonoprestamoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AbonoPrestamo abonoprestamoAux:abonoprestamos) {
					abonoprestamoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAbonoPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
						abonoprestamoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AbonoPrestamo abonoprestamoAux:abonoprestamos) {
						abonoprestamoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AbonoPrestamo abonoprestamoAux:abonoprestamos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAbonoPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAbonoPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAbonoPrestamoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAbonoPrestamo.getSelectedRows();
			
			AbonoPrestamo abonoprestamoLocal=new AbonoPrestamo();
			
			//this.seleccionarTodosAbonoPrestamo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					abonoprestamoLocal =(AbonoPrestamo) this.abonoprestamoLogic.getAbonoPrestamos().toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					abonoprestamoLocal =(AbonoPrestamo) this.abonoprestamos.toArray()[this.jTableDatosAbonoPrestamo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				abonoprestamoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
						abonoprestamoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(AbonoPrestamo abonoprestamoAux:abonoprestamos) {
						abonoprestamoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAbonoPrestamo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAbonoPrestamo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAbonoPrestamo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAbonoPrestamoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAbonoPrestamoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAbonoPrestamoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAbonoPrestamo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(AbonoPrestamo abonoprestamoAux:this.abonoprestamoLogic.getAbonoPrestamos()) {
				
						if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							abonoprestamoAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							abonoprestamoAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							abonoprestamoAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							abonoprestamoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							abonoprestamoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA)) {
							existe=true;
							abonoprestamoAux.setcodigo_quincena(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AbonoPrestamo abonoprestamoAux:abonoprestamos) {
					
						if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							abonoprestamoAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL)) {
							existe=true;
							abonoprestamoAux.setmonto_capital(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES)) {
							existe=true;
							abonoprestamoAux.setmonto_interes(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							abonoprestamoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							abonoprestamoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA)) {
							existe=true;
							abonoprestamoAux.setcodigo_quincena(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAbonoPrestamoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAbonoPrestamo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAbonoPrestamo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAbonoPrestamo) {				
					conSplash=true;//false;										
					
					//this.startProcessAbonoPrestamo(conSplash);
				
					this.generarReporteAbonoPrestamosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAbonoPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAbonoPrestamosSeleccionados(false);
				//this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAbonoPrestamosSeleccionados(true);
				//this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAbonoPrestamo();
				
				this.exportarAbonoPrestamosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAbonoPrestamos();
				//this.importarAbonoPrestamos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAbonoPrestamo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAbonoPrestamosSeleccionados();
				//this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Abono Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAbonoPrestamo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAbonoPrestamo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAbonoPrestamo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
				}	
			} 			
			else if(AbonoPrestamoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAbonoPrestamo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAbonoPrestamo(conSplash);
					
						//this.actualizarParametrosGeneralAbonoPrestamo();
						
						this.generarReporteProcesoAccionAbonoPrestamosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AbonoPrestamoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Abono PrestamoS SELECCIONADOS?", "MANTENIMIENTO DE Abono Prestamo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAbonoPrestamo();
				
						this.actualizarParametrosGeneralAbonoPrestamo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.abonoprestamoReturnGeneral=abonoprestamoLogic.procesarAccionAbonoPrestamosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.abonoprestamoLogic.getAbonoPrestamos(),this.abonoprestamoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAbonoPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAbonoPrestamo();
					
					AbonoPrestamoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAbonoPrestamoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAbonoPrestamo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxTiposAccionesFormularioAbonoPrestamo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAbonoPrestamo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAbonoPrestamoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAbonoPrestamo();
			
			if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
			AbonoPrestamo abonoprestamo=new AbonoPrestamo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAbonoPrestamo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAbonoPrestamo.getSelectedItem();
			
			
			
			
			abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
			//this.sTipoAccion;
			
			if(abonoprestamosSeleccionados.size()==1) {
				for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
					abonoprestamo=abonoprestamoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAbonoPrestamo();
			
      		//this.finishProcessAbonoPrestamo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAbonoPrestamoReturnGeneral() throws Exception {
		if(this.abonoprestamoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.abonoprestamoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.abonoprestamoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.abonoprestamoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.abonoprestamoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.abonoprestamoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAbonoPrestamo(false);
		}
		
		if(this.abonoprestamoReturnGeneral.getConRetornoLista() || this.abonoprestamoReturnGeneral.getConRetornoObjeto()) {
			if(this.abonoprestamoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.abonoprestamoLogic.setAbonoPrestamos(this.abonoprestamoReturnGeneral.getAbonoPrestamos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.abonoprestamoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.abonoprestamoLogic.setAbonoPrestamo(this.abonoprestamoReturnGeneral.getAbonoPrestamo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAbonoPrestamo(false);
		}
	}
	
	public void actualizarParametrosGeneralAbonoPrestamo() throws Exception {
		
		
	}
	
	public ArrayList<AbonoPrestamo> getAbonoPrestamosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAbonoPrestamo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(AbonoPrestamo abonoprestamoAux:abonoprestamoLogic.getAbonoPrestamos()) {
					if(abonoprestamoAux.getIsSelected()) {
						abonoprestamosSeleccionados.add(abonoprestamoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(AbonoPrestamo abonoprestamoAux:this.abonoprestamos) {
					if(abonoprestamoAux.getIsSelected()) {
						abonoprestamosSeleccionados.add(abonoprestamoAux);				
					}
				}
			}
			
			if(abonoprestamosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						abonoprestamosSeleccionados.addAll(this.abonoprestamoLogic.getAbonoPrestamos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						abonoprestamosSeleccionados.addAll(this.abonoprestamos);				
					}
				}
			}
		} else {
			abonoprestamosSeleccionados.add(this.abonoprestamo);
		}
		
		return abonoprestamosSeleccionados;
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
	
	public void generarReporteAbonoPrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAbonoPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAbonoPrestamosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAbonoPrestamosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAbonoPrestamosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Abono Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados);
		
	}	
	
	public void generarReporteNormalAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAbonoPrestamosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAbonoPrestamo();
		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAbonoPrestamo();
		
		
		//this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados ,abonoprestamoImplementable,abonoprestamoImplementableHome);
	}
	
	public void mostrarImportacionAbonoPrestamos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAbonoPrestamo();
		
		this.abrirFrameImportacionAbonoPrestamo();		
		
			
		//this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados ,abonoprestamoImplementable,abonoprestamoImplementableHome);
	}
	
	public void importarAbonoPrestamos() throws Exception {		
	
	}
	
	public void exportarAbonoPrestamosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAbonoPrestamosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAbonoPrestamosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAbonoPrestamosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Abono Prestamo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAbonoPrestamo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAbonoPrestamo(abonoprestamoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//abonoprestamoAux.setsDetalleGeneralEntityReporte(abonoprestamoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAbonoPrestamo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAbonoPrestamo(AbonoPrestamo abonoprestamo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=abonoprestamo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getprestamo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getnumero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getmonto_capital().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getmonto_interes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=abonoprestamo.getcodigo_quincena();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("AbonoPrestamos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAbonoPrestamo(row);				
				iRow++;
			}				
			
			for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAbonoPrestamo(abonoprestamoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAbonoPrestamosSeleccionados() throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();		
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"abonoprestamo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("abonoprestamos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("abonoprestamo");
			//elementRoot.appendChild(element);
		
			for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
				element = document.createElement("abonoprestamo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAbonoPrestamo(abonoprestamoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Abono Prestamo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAbonoPrestamo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOCAPITAL);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_MONTOINTERES);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAbonoPrestamo(AbonoPrestamo abonoprestamo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getprestamo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getmonto_capital());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getmonto_interes());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(abonoprestamo.getcodigo_quincena());				
	}
	
	public void setFilaDatosExportarXmlAbonoPrestamo(AbonoPrestamo abonoprestamo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AbonoPrestamoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(abonoprestamo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AbonoPrestamoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(abonoprestamo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementprestamo_descripcion = document.createElement(AbonoPrestamoConstantesFunciones.IDPRESTAMO);
		elementprestamo_descripcion.appendChild(document.createTextNode(abonoprestamo.getprestamo_descripcion()));
		element.appendChild(elementprestamo_descripcion);

		Element elementnumero = document.createElement(AbonoPrestamoConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(abonoprestamo.getnumero().toString().trim()));
		element.appendChild(elementnumero);

		Element elementmonto_capital = document.createElement(AbonoPrestamoConstantesFunciones.MONTOCAPITAL);
		elementmonto_capital.appendChild(document.createTextNode(abonoprestamo.getmonto_capital().toString().trim()));
		element.appendChild(elementmonto_capital);

		Element elementmonto_interes = document.createElement(AbonoPrestamoConstantesFunciones.MONTOINTERES);
		elementmonto_interes.appendChild(document.createTextNode(abonoprestamo.getmonto_interes().toString().trim()));
		element.appendChild(elementmonto_interes);

		Element elementvalor = document.createElement(AbonoPrestamoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(abonoprestamo.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha_vencimiento = document.createElement(AbonoPrestamoConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(abonoprestamo.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementcodigo_quincena = document.createElement(AbonoPrestamoConstantesFunciones.CODIGOQUINCENA);
		elementcodigo_quincena.appendChild(document.createTextNode(abonoprestamo.getcodigo_quincena().trim()));
		element.appendChild(elementcodigo_quincena);
	}
	
	public void generarReporteGroupGenericoAbonoPrestamosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<AbonoPrestamo> abonoprestamosSeleccionados=new ArrayList<AbonoPrestamo>();
		
		abonoprestamosSeleccionados=this.getAbonoPrestamosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAbonoPrestamo(abonoprestamosSeleccionados);
		
		this.generarReporteAbonoPrestamos("Todos",abonoprestamosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAbonoPrestamo(ArrayList<AbonoPrestamo> abonoprestamosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(AbonoPrestamo abonoprestamoAux:abonoprestamosSeleccionados) {
				abonoprestamoAux.setsDetalleGeneralEntityReporte(abonoprestamoAux.toString());
			
				if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_IDPRESTAMO)) {
					existe=true;
					abonoprestamoAux.setsDescripcionGeneralEntityReporte1(abonoprestamoAux.getprestamo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					abonoprestamoAux.setsDescripcionGeneralEntityReporte1(abonoprestamoAux.getnumero().toString());
				}
				 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					abonoprestamoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(abonoprestamoAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(AbonoPrestamoConstantesFunciones.LABEL_CODIGOQUINCENA)) {
					existe=true;
					abonoprestamoAux.setsDescripcionGeneralEntityReporte1(abonoprestamoAux.getcodigo_quincena());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AbonoPrestamoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAbonoPrestamo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAbonoPrestamo=true;
				this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=true;
				this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=true;
			}
			
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=true;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=true;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=true;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=true;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=true;
			this.isVisibilidadCeldaModificarAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=true;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
			this.isVisibilidadCeldaModificarAbonoPrestamo=true;
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
			this.isVisibilidadCeldaCancelarAbonoPrestamo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				} else {
					this.isVisibilidadCeldaGuardarAbonoPrestamo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AbonoPrestamoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAbonoPrestamo=true;
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=true;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=true;
		} else {
			this.actualizarEstadoPanelsAbonoPrestamo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAbonoPrestamo=false;
			//this.isVisibilidadCeldaVerFormAbonoPrestamo=false;
			this.isVisibilidadCeldaDuplicarAbonoPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!abonoprestamoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
		} else {
			this.isVisibilidadCeldaNuevoAbonoPrestamo=false;
			this.isVisibilidadCeldaGuardarCambiosAbonoPrestamo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(!abonoprestamoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;												
			}
			
			this.jButtonCerrarAbonoPrestamo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAbonoPrestamo=false;
		}
		
		if(!this.permiteMantenimiento(this.abonoprestamo)) {
			this.isVisibilidadCeldaActualizarAbonoPrestamo=false;
			this.isVisibilidadCeldaEliminarAbonoPrestamo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAbonoPrestamo() {
	}
	
	public void actualizarEstadoPanelsAbonoPrestamo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAbonoPrestamo!=null) {
				this.jScrollPanelDatosEdicionAbonoPrestamo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAbonoPrestamo!=null) {
				this.jScrollPanelDatosAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelPaginacionAbonoPrestamo!=null) {
				this.jPanelPaginacionAbonoPrestamo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
					this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.abonoprestamoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAbonoPrestamo!=null) {
				this.jTabbedPaneBusquedasAbonoPrestamo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAbonoPrestamo!=null) {
				this.jPanelParametrosReportesAbonoPrestamo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPrestamo(Boolean isParaPrestamo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPrestamoNegation=!isParaPrestamo;

			this.isVisibilidadFK_IdPrestamo=isParaPrestamo;
			if(!this.isVisibilidadFK_IdPrestamo) {this.jTabbedPaneBusquedasAbonoPrestamo.remove(jPanelFK_IdPrestamoAbonoPrestamo);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AbonoPrestamoSessionBean abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		
		if(this.abonoprestamoSessionBean==null) {
			this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		}
		
		this.abonoprestamoSessionBean.setsUltimaBusquedaAbonoPrestamo(this.getsAccionBusqueda());
		this.abonoprestamoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.abonoprestamoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPrestamo")) {
			abonoprestamoSessionBean.setid_prestamo(this.getid_prestamoFK_IdPrestamo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AbonoPrestamoSessionBean abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		
		if(this.abonoprestamoSessionBean==null) {
			this.abonoprestamoSessionBean=new AbonoPrestamoSessionBean();
		}
		
		if(this.abonoprestamoSessionBean.getsUltimaBusquedaAbonoPrestamo()!=null&&!this.abonoprestamoSessionBean.getsUltimaBusquedaAbonoPrestamo().equals("")) {
			this.setsAccionBusqueda(abonoprestamoSessionBean.getsUltimaBusquedaAbonoPrestamo());
			this.setiNumeroPaginacion(abonoprestamoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(abonoprestamoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPrestamo")) {
				this.setid_prestamoFK_IdPrestamo(abonoprestamoSessionBean.getid_prestamo());
				abonoprestamoSessionBean.setid_prestamo(-1L);
			}
		}
		
		this.abonoprestamoSessionBean.setsUltimaBusquedaAbonoPrestamo("");
		this.abonoprestamoSessionBean.setiNumeroPaginacion(AbonoPrestamoConstantesFunciones.INUMEROPAGINACION);
		this.abonoprestamoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAbonoPrestamo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAbonoPrestamo() {
		this.updateBorderResaltarBusquedasFormularioAbonoPrestamo();
		this.updateVisibilidadBusquedasFormularioAbonoPrestamo();
		this.updateHabilitarBusquedasFormularioAbonoPrestamo();
	}
	
	public void updateBorderResaltarBusquedasFormularioAbonoPrestamo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAbonoPrestamo.getComponents().length>0) {
	

		if(this.abonoprestamoConstantesFunciones.resaltarFK_IdPrestamoAbonoPrestamo!=null) {
			index= this.jTabbedPaneBusquedasAbonoPrestamo.indexOfComponent(this.jPanelFK_IdPrestamoAbonoPrestamo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAbonoPrestamo.getComponent(index);
				jPanel.setBorder(this.abonoprestamoConstantesFunciones.resaltarFK_IdPrestamoAbonoPrestamo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAbonoPrestamo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAbonoPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAbonoPrestamo.indexOfComponent(this.jPanelFK_IdPrestamoAbonoPrestamo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasAbonoPrestamo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.abonoprestamoConstantesFunciones.mostrarFK_IdPrestamoAbonoPrestamo);
			if(!this.abonoprestamoConstantesFunciones.mostrarFK_IdPrestamoAbonoPrestamo && index>-1) {
				this.jTabbedPaneBusquedasAbonoPrestamo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAbonoPrestamo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAbonoPrestamo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasAbonoPrestamo.indexOfComponent(this.jPanelFK_IdPrestamoAbonoPrestamo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasAbonoPrestamo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.abonoprestamoConstantesFunciones.activarFK_IdPrestamoAbonoPrestamo);
				this.jTabbedPaneBusquedasAbonoPrestamo.setEnabledAt(index,this.abonoprestamoConstantesFunciones.activarFK_IdPrestamoAbonoPrestamo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAbonoPrestamo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPrestamo")) {
			index= this.jTabbedPaneBusquedasAbonoPrestamo.indexOfComponent(this.jPanelFK_IdPrestamoAbonoPrestamo);

			this.jTabbedPaneBusquedasAbonoPrestamo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasAbonoPrestamo.getComponent(index);

			this.abonoprestamoConstantesFunciones.setResaltarFK_IdPrestamoAbonoPrestamo(resaltar);

			jPanel.setBorder(this.abonoprestamoConstantesFunciones.resaltarFK_IdPrestamoAbonoPrestamo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarAbonoPrestamo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAbonoPrestamo() throws Exception {

		if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAbonoPrestamo();
		this.updateVisibilidadResaltarControlesFormularioAbonoPrestamo();
		this.updateHabilitarResaltarControlesFormularioAbonoPrestamo();
		
	}
	
	public void updateBorderResaltarControlesFormularioAbonoPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.abonoprestamoConstantesFunciones.resaltaridAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltaridAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarid_prestamoAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarid_prestamoAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarnumeroAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarnumeroAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarmonto_capitalAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarmonto_capitalAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarmonto_interesAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarmonto_interesAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarvalorAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarvalorAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarfecha_vencimientoAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarfecha_vencimientoAbonoPrestamo);}
		if(this.abonoprestamoConstantesFunciones.resaltarcodigo_quincenaAbonoPrestamo!=null && this.jInternalFrameDetalleFormAbonoPrestamo!=null) {this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setBorder(this.abonoprestamoConstantesFunciones.resaltarcodigo_quincenaAbonoPrestamo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAbonoPrestamo() throws Exception {		
		if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
	
		//this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostraridAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelidAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostraridAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarid_prestamoAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelid_prestamoAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarid_prestamoAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarnumeroAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelnumeroAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarnumeroAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarmonto_capitalAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelmonto_capitalAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarmonto_capitalAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarmonto_interesAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelmonto_interesAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarmonto_interesAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarvalorAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelvalorAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarvalorAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarfecha_vencimientoAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelfecha_vencimientoAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarfecha_vencimientoAbonoPrestamo);
		//this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarcodigo_quincenaAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jPanelcodigo_quincenaAbonoPrestamo.setVisible(this.abonoprestamoConstantesFunciones.mostrarcodigo_quincenaAbonoPrestamo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAbonoPrestamo() throws Exception {
		if(this.jInternalFrameDetalleFormAbonoPrestamo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAbonoPrestamo!=null) {
	
		this.jInternalFrameDetalleFormAbonoPrestamo.jLabelidAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activaridAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jComboBoxid_prestamoAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarid_prestamoAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldnumeroAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarnumeroAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_capitalAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarmonto_capitalAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldmonto_interesAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarmonto_interesAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldvalorAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarvalorAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jDateChooserfecha_vencimientoAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarfecha_vencimientoAbonoPrestamo);
		this.jInternalFrameDetalleFormAbonoPrestamo.jTextFieldcodigo_quincenaAbonoPrestamo.setEnabled(this.abonoprestamoConstantesFunciones.activarcodigo_quincenaAbonoPrestamo);
		}
	}
	
		
}