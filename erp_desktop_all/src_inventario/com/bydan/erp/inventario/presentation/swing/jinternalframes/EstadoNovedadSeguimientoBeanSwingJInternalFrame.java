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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.EstadoNovedadSeguimientoConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoNovedadSeguimientoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoNovedadSeguimientoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoNovedadSeguimientoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class EstadoNovedadSeguimientoBeanSwingJInternalFrame extends EstadoNovedadSeguimientoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoNovedadSeguimientoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoNovedadSeguimiento> estadonovedadseguimientoValidator = new ClassValidator<EstadoNovedadSeguimiento>(EstadoNovedadSeguimiento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoNovedadSeguimiento estadonovedadseguimiento;	
	public EstadoNovedadSeguimiento estadonovedadseguimientoAux;
	public EstadoNovedadSeguimiento estadonovedadseguimientoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoNovedadSeguimiento estadonovedadseguimientoTotales;
	public Long idEstadoNovedadSeguimientoActual;
	public Long iIdNuevoEstadoNovedadSeguimiento=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoNovedadSeguimiento;
	public Boolean isPermisoNuevoEstadoNovedadSeguimiento;
	public Boolean isPermisoActualizarEstadoNovedadSeguimiento;
	public Boolean isPermisoActualizarOriginalEstadoNovedadSeguimiento;
	public Boolean isPermisoEliminarEstadoNovedadSeguimiento;
	public Boolean isPermisoGuardarCambiosEstadoNovedadSeguimiento;
	public Boolean isPermisoConsultaEstadoNovedadSeguimiento;
	public Boolean isPermisoBusquedaEstadoNovedadSeguimiento;
	public Boolean isPermisoReporteEstadoNovedadSeguimiento;
	public Boolean isPermisoPaginacionMedioEstadoNovedadSeguimiento;
	public Boolean isPermisoPaginacionAltoEstadoNovedadSeguimiento;
	public Boolean isPermisoPaginacionTodoEstadoNovedadSeguimiento;
	public Boolean isPermisoCopiarEstadoNovedadSeguimiento;
	public Boolean isPermisoVerFormEstadoNovedadSeguimiento;
	public Boolean isPermisoDuplicarEstadoNovedadSeguimiento;
	public Boolean isPermisoOrdenEstadoNovedadSeguimiento;
	
	
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
	
	public EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoReturnGeneral;
	public EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoNovedadSeguimiento=false;
	public Boolean esParaAccionDesdeFormularioEstadoNovedadSeguimiento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoNovedadSeguimiento estadonovedadseguimientoBean;
	public EstadoNovedadSeguimientoConstantesFunciones estadonovedadseguimientoConstantesFunciones;
	//public EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoNovedadSeguimiento> estadonovedadseguimientos;	
	//public List<EstadoNovedadSeguimiento> estadonovedadseguimientosEliminados;
	//public List<EstadoNovedadSeguimiento> estadonovedadseguimientosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaCopiarEstadoNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaVerFormEstadoNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaOrdenEstadoNovedadSeguimiento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=false;
	public Boolean isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;	
	
	
	
	public Long getiIdNuevoEstadoNovedadSeguimiento() {
		return this.iIdNuevoEstadoNovedadSeguimiento;
	}

	public void setiIdNuevoEstadoNovedadSeguimiento(Long iIdNuevoEstadoNovedadSeguimiento) {
		this.iIdNuevoEstadoNovedadSeguimiento = iIdNuevoEstadoNovedadSeguimiento;
	}
	
	public Long getidEstadoNovedadSeguimientoActual() {
		return this.idEstadoNovedadSeguimientoActual;
	}

	public void setidEstadoNovedadSeguimientoActual(Long idEstadoNovedadSeguimientoActual) {
		this.idEstadoNovedadSeguimientoActual = idEstadoNovedadSeguimientoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoNovedadSeguimiento getestadonovedadseguimiento() {
		return this.estadonovedadseguimiento;
	}

	public void setestadonovedadseguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento) {
		this.estadonovedadseguimiento = estadonovedadseguimiento;
	}
	
	public EstadoNovedadSeguimiento getestadonovedadseguimientoAux() {
		return this.estadonovedadseguimientoAux;
	}

	public void setestadonovedadseguimientoAux(EstadoNovedadSeguimiento estadonovedadseguimientoAux) {
		this.estadonovedadseguimientoAux = estadonovedadseguimientoAux;
	}				
	
	public EstadoNovedadSeguimiento getestadonovedadseguimientoAnterior() {
		return this.estadonovedadseguimientoAnterior;
	}

	public void setestadonovedadseguimientoAnterior(EstadoNovedadSeguimiento estadonovedadseguimientoAnterior) {
		this.estadonovedadseguimientoAnterior = estadonovedadseguimientoAnterior;
	}	
	
	public EstadoNovedadSeguimiento getestadonovedadseguimientoTotales() {
		return this.estadonovedadseguimientoTotales;
	}

	public void setestadonovedadseguimientoTotales(EstadoNovedadSeguimiento estadonovedadseguimientoTotales) {
		this.estadonovedadseguimientoTotales = estadonovedadseguimientoTotales;
	}	
	
	public EstadoNovedadSeguimiento getestadonovedadseguimientoBean() {
		return this.estadonovedadseguimientoBean;
	}

	public void setestadonovedadseguimientoBean(EstadoNovedadSeguimiento estadonovedadseguimientoBean) {
		this.estadonovedadseguimientoBean = estadonovedadseguimientoBean;
	}	
	
	public EstadoNovedadSeguimientoParameterReturnGeneral getestadonovedadseguimientoReturnGeneral() {
		return this.estadonovedadseguimientoReturnGeneral;
	}

	public void setestadonovedadseguimientoReturnGeneral(EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoReturnGeneral) {
		this.estadonovedadseguimientoReturnGeneral = estadonovedadseguimientoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoNovedadSeguimientoLogic getEstadoNovedadSeguimientoLogic()	{		
		return estadonovedadseguimientoLogic;
	}

	public void setEstadoNovedadSeguimientoLogic(EstadoNovedadSeguimientoLogic estadonovedadseguimientoLogic) {
		this.estadonovedadseguimientoLogic = estadonovedadseguimientoLogic;
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
	
	public Boolean getIsEsNuevoEstadoNovedadSeguimiento() {
		return isEsNuevoEstadoNovedadSeguimiento;
	}

	public void setIsEsNuevoEstadoNovedadSeguimiento(Boolean isEsNuevoEstadoNovedadSeguimiento) {
		this.isEsNuevoEstadoNovedadSeguimiento = isEsNuevoEstadoNovedadSeguimiento;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoNovedadSeguimiento() {
		return esParaAccionDesdeFormularioEstadoNovedadSeguimiento;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoNovedadSeguimiento(Boolean esParaAccionDesdeFormularioEstadoNovedadSeguimiento) {
		this.esParaAccionDesdeFormularioEstadoNovedadSeguimiento = esParaAccionDesdeFormularioEstadoNovedadSeguimiento;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoNovedadSeguimiento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoNovedadSeguimientoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNovedadSeguimiento(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoNovedadSeguimientoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNovedadSeguimiento(this.estadonovedadseguimientos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(this.estadonovedadseguimientos);
			estadonovedadseguimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoNovedadSeguimientoParameterReturnGeneral getEstadoNovedadSeguimientoParameterGeneral() {
		return this.estadonovedadseguimientoParameterGeneral;
	}
	
	public void setEstadoNovedadSeguimientoParameterGeneral(EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoParameterGeneral) {
		this.estadonovedadseguimientoParameterGeneral = estadonovedadseguimientoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoNovedadSeguimiento() {
		return isPermisoTodoEstadoNovedadSeguimiento;
	}

	public void setIsPermisoTodoEstadoNovedadSeguimiento(Boolean isPermisoTodoEstadoNovedadSeguimiento) {
		this.isPermisoTodoEstadoNovedadSeguimiento = isPermisoTodoEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoNuevoEstadoNovedadSeguimiento() {
		return isPermisoNuevoEstadoNovedadSeguimiento;
	}

	public void setIsPermisoNuevoEstadoNovedadSeguimiento(Boolean isPermisoNuevoEstadoNovedadSeguimiento) {
		this.isPermisoNuevoEstadoNovedadSeguimiento = isPermisoNuevoEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoActualizarEstadoNovedadSeguimiento() {
		return isPermisoActualizarEstadoNovedadSeguimiento;
	}

	public void setIsPermisoActualizarEstadoNovedadSeguimiento(Boolean isPermisoActualizarEstadoNovedadSeguimiento) {
		this.isPermisoActualizarEstadoNovedadSeguimiento = isPermisoActualizarEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoEliminarEstadoNovedadSeguimiento() {
		return isPermisoEliminarEstadoNovedadSeguimiento;
	}

	public void setIsPermisoEliminarEstadoNovedadSeguimiento(Boolean isPermisoEliminarEstadoNovedadSeguimiento) {
		this.isPermisoEliminarEstadoNovedadSeguimiento = isPermisoEliminarEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoNovedadSeguimiento() {
		return isPermisoGuardarCambiosEstadoNovedadSeguimiento;
	}

	public void setIsPermisoGuardarCambiosEstadoNovedadSeguimiento(Boolean isPermisoGuardarCambiosEstadoNovedadSeguimiento) {
		this.isPermisoGuardarCambiosEstadoNovedadSeguimiento = isPermisoGuardarCambiosEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoConsultaEstadoNovedadSeguimiento() {
		return isPermisoConsultaEstadoNovedadSeguimiento;
	}

	public void setIsPermisoConsultaEstadoNovedadSeguimiento(Boolean isPermisoConsultaEstadoNovedadSeguimiento) {
		this.isPermisoConsultaEstadoNovedadSeguimiento = isPermisoConsultaEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoBusquedaEstadoNovedadSeguimiento() {
		return isPermisoBusquedaEstadoNovedadSeguimiento;
	}

	public void setIsPermisoBusquedaEstadoNovedadSeguimiento(Boolean isPermisoBusquedaEstadoNovedadSeguimiento) {
		this.isPermisoBusquedaEstadoNovedadSeguimiento = isPermisoBusquedaEstadoNovedadSeguimiento;
	}

	public Boolean getIsPermisoReporteEstadoNovedadSeguimiento() {
		return isPermisoReporteEstadoNovedadSeguimiento;
	}

	public void setIsPermisoReporteEstadoNovedadSeguimiento(Boolean isPermisoReporteEstadoNovedadSeguimiento) {
		this.isPermisoReporteEstadoNovedadSeguimiento = isPermisoReporteEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoNovedadSeguimiento() {
		return isPermisoPaginacionMedioEstadoNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionMedioEstadoNovedadSeguimiento(Boolean isPermisoPaginacionMedioEstadoNovedadSeguimiento) {
		this.isPermisoPaginacionMedioEstadoNovedadSeguimiento = isPermisoPaginacionMedioEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoNovedadSeguimiento() {
		return isPermisoPaginacionTodoEstadoNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionTodoEstadoNovedadSeguimiento(Boolean isPermisoPaginacionTodoEstadoNovedadSeguimiento) {
		this.isPermisoPaginacionTodoEstadoNovedadSeguimiento = isPermisoPaginacionTodoEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoNovedadSeguimiento() {
		return isPermisoPaginacionAltoEstadoNovedadSeguimiento;
	}

	public void setIsPermisoPaginacionAltoEstadoNovedadSeguimiento(Boolean isPermisoPaginacionAltoEstadoNovedadSeguimiento) {
		this.isPermisoPaginacionAltoEstadoNovedadSeguimiento = isPermisoPaginacionAltoEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoCopiarEstadoNovedadSeguimiento() {
		return isPermisoCopiarEstadoNovedadSeguimiento;
	}

	public void setIsPermisoCopiarEstadoNovedadSeguimiento(Boolean isPermisoCopiarEstadoNovedadSeguimiento) {
		this.isPermisoCopiarEstadoNovedadSeguimiento = isPermisoCopiarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoVerFormEstadoNovedadSeguimiento() {
		return isPermisoVerFormEstadoNovedadSeguimiento;
	}

	public void setIsPermisoVerFormEstadoNovedadSeguimiento(Boolean isPermisoVerFormEstadoNovedadSeguimiento) {
		this.isPermisoVerFormEstadoNovedadSeguimiento = isPermisoVerFormEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoDuplicarEstadoNovedadSeguimiento() {
		return isPermisoDuplicarEstadoNovedadSeguimiento;
	}

	public void setIsPermisoDuplicarEstadoNovedadSeguimiento(Boolean isPermisoDuplicarEstadoNovedadSeguimiento) {
		this.isPermisoDuplicarEstadoNovedadSeguimiento = isPermisoDuplicarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsPermisoOrdenEstadoNovedadSeguimiento() {
		return isPermisoOrdenEstadoNovedadSeguimiento;
	}

	public void setIsPermisoOrdenEstadoNovedadSeguimiento(Boolean isPermisoOrdenEstadoNovedadSeguimiento) {
		this.isPermisoOrdenEstadoNovedadSeguimiento = isPermisoOrdenEstadoNovedadSeguimiento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaNuevoEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaNuevoEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaNuevoEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento = isVisibilidadCeldaNuevoEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento = isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaCopiarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaCopiarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaCopiarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento = isVisibilidadCeldaCopiarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaVerFormEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaVerFormEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaVerFormEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento = isVisibilidadCeldaVerFormEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaOrdenEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaOrdenEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaOrdenEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento = isVisibilidadCeldaOrdenEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento = isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaModificarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaModificarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaModificarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento = isVisibilidadCeldaModificarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaActualizarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaActualizarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaActualizarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento = isVisibilidadCeldaActualizarEstadoNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaEliminarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaEliminarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaEliminarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento = isVisibilidadCeldaEliminarEstadoNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaCancelarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaCancelarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaCancelarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento = isVisibilidadCeldaCancelarEstadoNovedadSeguimiento;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaGuardarEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaGuardarEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaGuardarEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento = isVisibilidadCeldaGuardarEstadoNovedadSeguimiento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento() {
		return isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento(Boolean isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento) {
		this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento = isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento;
	}
		
	public EstadoNovedadSeguimientoSessionBean getestadonovedadseguimientoSessionBean() {
		return this.estadonovedadseguimientoSessionBean;
	}
	
	public void setestadonovedadseguimientoSessionBean(EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean) {
		this.estadonovedadseguimientoSessionBean=estadonovedadseguimientoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoNovedadSeguimiento estadonovedadseguimiento,EstadoNovedadSeguimiento estadonovedadseguimientoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoNovedadSeguimiento(estadonovedadseguimiento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadonovedadseguimientoAux.setId(estadonovedadseguimiento.getId());
		estadonovedadseguimientoAux.setVersionRow(estadonovedadseguimiento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoNovedadSeguimiento();
		
			int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadonovedadseguimientoValidator.getInvalidValues(this.estadonovedadseguimiento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadonovedadseguimientoLogic.setDatosCliente(datosCliente);
			estadonovedadseguimientoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadonovedadseguimientoAux=new  EstadoNovedadSeguimiento();
				
				estadonovedadseguimientoAux.setIsNew(true);
				estadonovedadseguimientoAux.setIsChanged(true);
				
				estadonovedadseguimientoAux.setEstadoNovedadSeguimientoOriginal(this.estadonovedadseguimiento);
				
				estadonovedadseguimientoAux.setId(this.estadonovedadseguimiento.getId());	
				estadonovedadseguimientoAux.setVersionRow(this.estadonovedadseguimiento.getVersionRow());	
				estadonovedadseguimientoAux.setcodigo(this.estadonovedadseguimiento.getcodigo());	
				estadonovedadseguimientoAux.setnombre(this.estadonovedadseguimiento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadseguimientoLogic.saveEstadoNovedadSeguimientos();//WithConnection
						//estadonovedadseguimientoLogic.getSetVersionRowEstadoNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonovedadseguimiento,estadonovedadseguimientoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadonovedadseguimientoAux=new  EstadoNovedadSeguimiento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() && this.estadonovedadseguimiento.getId()>=0)) {
						
					estadonovedadseguimientoAux.setIsNew(false);
				}
				
				estadonovedadseguimientoAux.setIsDeleted(false);
			
				estadonovedadseguimientoAux.setId(this.estadonovedadseguimiento.getId());	
				estadonovedadseguimientoAux.setVersionRow(this.estadonovedadseguimiento.getVersionRow());	
				estadonovedadseguimientoAux.setcodigo(this.estadonovedadseguimiento.getcodigo());	
				estadonovedadseguimientoAux.setnombre(this.estadonovedadseguimiento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadseguimientoLogic.saveEstadoNovedadSeguimientos();//WithConnection
						//estadonovedadseguimientoLogic.getSetVersionRowEstadoNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonovedadseguimiento,estadonovedadseguimientoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadonovedadseguimientoAux=new  EstadoNovedadSeguimiento();
				
				estadonovedadseguimientoAux.setIsNew(false);
				estadonovedadseguimientoAux.setIsChanged(false);
				
				estadonovedadseguimientoAux.setIsDeleted(true);
				
				estadonovedadseguimientoAux.setId(this.estadonovedadseguimiento.getId());	
				estadonovedadseguimientoAux.setVersionRow(this.estadonovedadseguimiento.getVersionRow());	
				estadonovedadseguimientoAux.setcodigo(this.estadonovedadseguimiento.getcodigo());	
				estadonovedadseguimientoAux.setnombre(this.estadonovedadseguimiento.getnombre());	
				
				if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadonovedadseguimientoAux.getId()>=0) {	
						this.estadonovedadseguimientosEliminados.add(estadonovedadseguimientoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadseguimientoLogic.saveEstadoNovedadSeguimientos();//WithConnection
						//estadonovedadseguimientoLogic.getSetVersionRowEstadoNovedadSeguimientos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadonovedadseguimientoAux,estadonovedadseguimientos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().addAll(this.estadonovedadseguimientosEliminados);
					
					estadonovedadseguimientoLogic.saveEstadoNovedadSeguimientos();//WithConnection
					//estadonovedadseguimientoLogic.getSetVersionRowEstadoNovedadSeguimientos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadonovedadseguimientosEliminados= new ArrayList<EstadoNovedadSeguimiento>();		
			}
			
			if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Novedad Seguimiento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadonovedadseguimiento=estadonovedadseguimientoAux;
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
      		//this.finishProcessEstadoNovedadSeguimiento();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoNovedadSeguimiento estadonovedadseguimientoLocal) throws Exception {
		
		if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoNovedadSeguimiento estadonovedadseguimientoLocal) throws Exception {	
		if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoNovedadSeguimientoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadonovedadseguimientoValidator.getInvalidValues(this.estadonovedadseguimiento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoNovedadSeguimiento estadonovedadseguimiento,List<EstadoNovedadSeguimiento> estadonovedadseguimientos) throws Exception {
		try	{		
			EstadoNovedadSeguimientoConstantesFunciones.actualizarLista(estadonovedadseguimiento,estadonovedadseguimientos,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoNovedadSeguimiento estadonovedadseguimiento,List<EstadoNovedadSeguimiento> estadonovedadseguimientos) throws Exception {
		try	{			
			EstadoNovedadSeguimientoConstantesFunciones.actualizarSelectedLista(estadonovedadseguimiento,estadonovedadseguimientos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoNovedadSeguimiento> estadonovedadseguimientosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadonovedadseguimientosLocal=this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadonovedadseguimientosLocal=this.estadonovedadseguimientos;
			}
			//ARCHITECTURE
		
			for(EstadoNovedadSeguimiento estadonovedadseguimientoLocal:estadonovedadseguimientosLocal) {
				if(this.permiteMantenimiento(estadonovedadseguimientoLocal) && estadonovedadseguimientoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoNovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoNovedadSeguimientoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelcodigoEstadoNovedadSeguimiento,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoNovedadSeguimientoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelnombreEstadoNovedadSeguimiento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelcodigoEstadoNovedadSeguimiento,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelnombreEstadoNovedadSeguimiento,"");
		
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
		this.iIdNuevoEstadoNovedadSeguimiento--;	
		
		
		this.estadonovedadseguimientoAux=new EstadoNovedadSeguimiento();
		
		this.estadonovedadseguimientoAux.setId(this.iIdNuevoEstadoNovedadSeguimiento);
		this.estadonovedadseguimientoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().add(this.estadonovedadseguimientoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadonovedadseguimientos.add(this.estadonovedadseguimientoAux);
		}
		//ARCHITECTURE
		
		this.estadonovedadseguimiento=this.estadonovedadseguimientoAux;
		
		if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
		}
				
		//this.setDefaultControlesEstadoNovedadSeguimiento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoNovedadSeguimiento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoNovedadSeguimiento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadSeguimiento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimientoBean,this.estadonovedadseguimiento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoNovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfEstadoNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadonovedadseguimientoReturnGeneral=estadonovedadseguimientoLogic.procesarEventosEstadoNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),this.estadonovedadseguimiento,this.estadonovedadseguimientoParameterGeneral,this.isEsNuevoEstadoNovedadSeguimiento,classes);//this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral,this.estadonovedadseguimientoBean,false);
		
		if(this.estadonovedadseguimientoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento());
		}
		
		if(this.estadonovedadseguimientoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento(),classes);//this.estadonovedadseguimientoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoNovedadSeguimiento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoNovedadSeguimiento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
						
			if(estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();
			}
			
			this.actualizarVisualTableDatosEstadoNovedadSeguimiento();
			
			this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadSeguimiento(), this.getIndiceNuevoEstadoNovedadSeguimiento());
			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoNovedadSeguimiento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setEnabled(isHabilitar && this.estadonovedadseguimientoConstantesFunciones.activarcodigoEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setEnabled(isHabilitar && this.estadonovedadseguimientoConstantesFunciones.activarnombreEstadoNovedadSeguimiento);	
		
	};
	
	public void setDefaultControlesEstadoNovedadSeguimiento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoNovedadSeguimiento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(true);			
			this.estadonovedadseguimientoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setVisible(true);
			
					
		} else {
			//this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(false);			
			this.estadonovedadseguimientoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoNovedadSeguimiento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				if(estadonovedadseguimientoAux.getId().equals(this.iIdNuevoEstadoNovedadSeguimiento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientos) {
				if(estadonovedadseguimientoAux.getId().equals(this.iIdNuevoEstadoNovedadSeguimiento)) {
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
	
	public int getIndiceActualEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				if(estadonovedadseguimientoAux.getId().equals(estadonovedadseguimiento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientos) {
				if(estadonovedadseguimientoAux.getId().equals(estadonovedadseguimiento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimientoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				if(estadonovedadseguimientoAux.getEstadoNovedadSeguimientoOriginal().getId().equals(estadonovedadseguimientoOriginal.getId())) {
					existe=true;
					estadonovedadseguimientoOriginal.setId(estadonovedadseguimientoAux.getId());
					estadonovedadseguimientoOriginal.setVersionRow(estadonovedadseguimientoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientos) {
				if(estadonovedadseguimientoAux.getEstadoNovedadSeguimientoOriginal().getId().equals(estadonovedadseguimientoOriginal.getId())) {
					existe=true;
					estadonovedadseguimientoOriginal.setId(estadonovedadseguimientoAux.getId());
					estadonovedadseguimientoOriginal.setVersionRow(estadonovedadseguimientoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoNovedadSeguimiento(Boolean esParaCancelar) throws Exception {
		estadonovedadseguimientosAux=new ArrayList<EstadoNovedadSeguimiento>();
		estadonovedadseguimientoAux=new EstadoNovedadSeguimiento();
		
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
					if(estadonovedadseguimientoAux.getId()<0) {
						estadonovedadseguimientosAux.add(estadonovedadseguimientoAux);
					}		
				}
				this.iIdNuevoEstadoNovedadSeguimiento=0L;
				this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().removeAll(estadonovedadseguimientosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientos) {
					if(estadonovedadseguimientoAux.getId()<0) {
						estadonovedadseguimientosAux.add(estadonovedadseguimientoAux);
					}		
				}
				this.iIdNuevoEstadoNovedadSeguimiento=0L;
				this.estadonovedadseguimientos.removeAll(estadonovedadseguimientosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoNovedadSeguimiento 
					&& this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size()>0
					) {
					estadonovedadseguimientoAux=this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().get(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size() - 1);
				
					if(estadonovedadseguimientoAux.getId()<0) {
						this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().remove(estadonovedadseguimientoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoNovedadSeguimiento && this.estadonovedadseguimientos.size()>0) {
					estadonovedadseguimientoAux=this.estadonovedadseguimientos.get(this.estadonovedadseguimientos.size() - 1);
				
					if(estadonovedadseguimientoAux.getId()<0) {
						this.estadonovedadseguimientos.remove(estadonovedadseguimientoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoNovedadSeguimiento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadonovedadseguimiento.getId()<0) {
				this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().remove(this.estadonovedadseguimiento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadonovedadseguimiento.getId()<0) {
				this.estadonovedadseguimientos.remove(this.estadonovedadseguimiento);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoNovedadSeguimiento(List<EstadoNovedadSeguimiento> estadonovedadseguimientosAux) throws Exception {
		EstadoNovedadSeguimientoConstantesFunciones.setEstadosInicialesEstadoNovedadSeguimiento(estadonovedadseguimientosAux);
	}
	
	public void setEstadosInicialesEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimientoAux) throws Exception {
		EstadoNovedadSeguimientoConstantesFunciones.setEstadosInicialesEstadoNovedadSeguimiento(estadonovedadseguimientoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoNovedadSeguimientoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoNovedadSeguimientoActual()) {
				if(!this.isEsNuevoEstadoNovedadSeguimiento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoNovedadSeguimiento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoNovedadSeguimientoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Novedad Seguimiento ?", "MANTENIMIENTO DE Estado Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoNovedadSeguimiento estadonovedadseguimiento) throws Exception {
		EstadoNovedadSeguimientoConstantesFunciones.seleccionarAsignar(this.estadonovedadseguimiento,estadonovedadseguimiento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoNovedadSeguimiento=this.isPermisoActualizarOriginalEstadoNovedadSeguimiento;
			
			
			this.seleccionarAsignar(estadonovedadseguimiento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoNovedadSeguimientoConstantesFunciones.quitarEspaciosEstadoNovedadSeguimiento(this.estadonovedadseguimiento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadonovedadseguimientoSessionBean.setsFuncionBusquedaRapida(this.estadonovedadseguimientoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoNovedadSeguimiento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoNovedadSeguimiento(esParaCancelar);				
				this.cancelarNuevoEstadoNovedadSeguimiento(esParaCancelar);								
			}
			
			this.estadonovedadseguimiento=new EstadoNovedadSeguimiento();
			
			this.inicializarEstadoNovedadSeguimiento();
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoNovedadSeguimiento() throws Exception {
		try {
			EstadoNovedadSeguimientoConstantesFunciones.inicializarEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoNovedadSeguimientos(String sAccionBusqueda,List<EstadoNovedadSeguimiento> estadonovedadseguimientosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoNovedadSeguimiento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoNovedadSeguimientoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoNovedadSeguimientoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoNovedadSeguimiento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Novedad Seguimientoes");		
		parameters.put("busquedapor", EstadoNovedadSeguimientoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoNovedadSeguimiento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoNovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoNovedadSeguimientoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoNovedadSeguimiento=new JRBeanArrayDataSource(EstadoNovedadSeguimientoJInternalFrame.TraerEstadoNovedadSeguimientoBeans(estadonovedadseguimientosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoNovedadSeguimiento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoNovedadSeguimientoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoNovedadSeguimientoBean.TraerEstadoNovedadSeguimientoBeans(estadonovedadseguimientosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimientoActionPerformed(null);
					//this.generarExcelReporteEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoNovedadSeguimientos(sAccionBusqueda,sTipoArchivoReporte,estadonovedadseguimientosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadSeguimiento> estadonovedadseguimientosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadSeguimientos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNovedadSeguimiento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoNovedadSeguimiento estadonovedadseguimiento : estadonovedadseguimientosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoNovedadSeguimientoConstantesFunciones.generarExcelReporteDataEstadoNovedadSeguimiento("NORMAL",row,workbook,estadonovedadseguimiento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoNovedadSeguimiento(String sTipo,Row row,Workbook workbook) {
		
		EstadoNovedadSeguimientoConstantesFunciones.generarExcelReporteHeaderEstadoNovedadSeguimiento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadSeguimiento> estadonovedadseguimientosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadSeguimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoNovedadSeguimiento estadonovedadseguimiento : estadonovedadseguimientosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoDescripcion(estadonovedadseguimiento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonovedadseguimiento.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonovedadseguimiento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoNovedadSeguimientos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNovedadSeguimiento> estadonovedadseguimientosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoNovedadSeguimiento> estadonovedadseguimientosRespaldo=null;
		
		classes=EstadoNovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfEstadoNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadonovedadseguimientoLogic.setDatosCliente(this.datosCliente);
		this.estadonovedadseguimientoLogic.setDatosDeep(this.datosDeep);
		this.estadonovedadseguimientoLogic.setIsConDeep(true);
		
		estadonovedadseguimientosRespaldo=this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos();
		
		this.estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(estadonovedadseguimientosParaReportes);	
		this.estadonovedadseguimientoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadonovedadseguimientosParaReportes=this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos();
		this.estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(estadonovedadseguimientosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNovedadSeguimientos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNovedadSeguimiento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoNovedadSeguimiento estadonovedadseguimiento : estadonovedadseguimientosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoNovedadSeguimiento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoNovedadSeguimientoConstantesFunciones.generarExcelReporteDataEstadoNovedadSeguimiento("NORMAL",row,workbook,estadonovedadseguimiento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.getEstadoNovedadSeguimientoDescripcion(estadonovedadseguimiento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoNovedadSeguimiento() throws Exception {		
		this.startProcessEstadoNovedadSeguimiento(true);
	}
	
	public void startProcessEstadoNovedadSeguimiento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoNovedadSeguimiento, this.jScrollPanelDatosEstadoNovedadSeguimiento,this.jPanelPaginacionEstadoNovedadSeguimiento, this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento, this.jPanelAccionesEstadoNovedadSeguimiento,this.jPanelAccionesFormularioEstadoNovedadSeguimiento,this.jmenuBarEstadoNovedadSeguimiento,this.jmenuBarDetalleEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNovedadSeguimiento=null; 
		
		final JPanel jPanelParametrosReportesEstadoNovedadSeguimiento=this.jPanelParametrosReportesEstadoNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEstadoNovedadSeguimiento=this.jScrollPanelDatosEstadoNovedadSeguimiento;
		final JTable jTableDatosEstadoNovedadSeguimiento=this.jTableDatosEstadoNovedadSeguimiento;		
		final JPanel jPanelPaginacionEstadoNovedadSeguimiento=this.jPanelPaginacionEstadoNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNovedadSeguimiento=this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento;
		final JPanel jPanelAccionesEstadoNovedadSeguimiento=this.jPanelAccionesEstadoNovedadSeguimiento;
		
		JPanel jPanelCamposAuxiliarEstadoNovedadSeguimiento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			jPanelCamposAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelCamposEstadoNovedadSeguimiento;
			jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelAccionesFormularioEstadoNovedadSeguimiento;
		}
		
		final JPanel jPanelCamposEstadoNovedadSeguimiento=jPanelCamposAuxiliarEstadoNovedadSeguimiento;
		final JPanel jPanelAccionesFormularioEstadoNovedadSeguimiento=jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento;
		
		
		final JMenuBar jmenuBarEstadoNovedadSeguimiento=this.jmenuBarEstadoNovedadSeguimiento;
		final JToolBar jTtoolBarEstadoNovedadSeguimiento=this.jTtoolBarEstadoNovedadSeguimiento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jmenuBarDetalleEstadoNovedadSeguimiento;
			jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTtoolBarDetalleEstadoNovedadSeguimiento;
		}
		
		final JMenuBar jmenuBarDetalleEstadoNovedadSeguimiento=jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento;
		final JToolBar jTtoolBarDetalleEstadoNovedadSeguimiento=jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNovedadSeguimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNovedadSeguimiento;
			processRunnable.jTableDatos=jTableDatosEstadoNovedadSeguimiento;
			processRunnable.jPanelCampos=jPanelCamposEstadoNovedadSeguimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNovedadSeguimiento;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNovedadSeguimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNovedadSeguimiento;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNovedadSeguimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNovedadSeguimiento;
			processRunnable.jTtoolBar=jTtoolBarEstadoNovedadSeguimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNovedadSeguimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoNovedadSeguimiento ,jPanelParametrosReportesEstadoNovedadSeguimiento,jTableDatosEstadoNovedadSeguimiento, /*jScrollPanelDatosEstadoNovedadSeguimiento,*/jPanelCamposEstadoNovedadSeguimiento,jPanelPaginacionEstadoNovedadSeguimiento, /*jScrollPanelDatosEdicionEstadoNovedadSeguimiento,*/ jPanelAccionesEstadoNovedadSeguimiento,jPanelAccionesFormularioEstadoNovedadSeguimiento,jmenuBarEstadoNovedadSeguimiento,jmenuBarDetalleEstadoNovedadSeguimiento,jTtoolBarEstadoNovedadSeguimiento,jTtoolBarDetalleEstadoNovedadSeguimiento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoNovedadSeguimiento, jScrollPanelDatosEstadoNovedadSeguimiento,jPanelPaginacionEstadoNovedadSeguimiento, jScrollPanelDatosEdicionEstadoNovedadSeguimiento, jPanelAccionesEstadoNovedadSeguimiento,jPanelAccionesFormularioEstadoNovedadSeguimiento,jmenuBarEstadoNovedadSeguimiento,jmenuBarDetalleEstadoNovedadSeguimiento,jTtoolBarEstadoNovedadSeguimiento,jTtoolBarDetalleEstadoNovedadSeguimiento);
						
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
	
	public void finishProcessEstadoNovedadSeguimiento() {// throws Exception 
		this.finishProcessEstadoNovedadSeguimiento(true);
	}
	
	public void finishProcessEstadoNovedadSeguimiento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoNovedadSeguimiento, this.jScrollPanelDatosEstadoNovedadSeguimiento,this.jPanelPaginacionEstadoNovedadSeguimiento, this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento, this.jPanelAccionesEstadoNovedadSeguimiento,this.jPanelAccionesFormularioEstadoNovedadSeguimiento,this.jmenuBarEstadoNovedadSeguimiento,this.jmenuBarDetalleEstadoNovedadSeguimiento,this.jTtoolBarEstadoNovedadSeguimiento,this.jTtoolBarDetalleEstadoNovedadSeguimiento);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNovedadSeguimiento=null; 
		
		final JPanel jPanelParametrosReportesEstadoNovedadSeguimiento=this.jPanelParametrosReportesEstadoNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEstadoNovedadSeguimiento=this.jScrollPanelDatosEstadoNovedadSeguimiento;
		final JTable jTableDatosEstadoNovedadSeguimiento=this.jTableDatosEstadoNovedadSeguimiento;		
		final JPanel jPanelPaginacionEstadoNovedadSeguimiento=this.jPanelPaginacionEstadoNovedadSeguimiento;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNovedadSeguimiento=this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento;
		final JPanel jPanelAccionesEstadoNovedadSeguimiento=this.jPanelAccionesEstadoNovedadSeguimiento;
		
		JPanel jPanelCamposAuxiliarEstadoNovedadSeguimiento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			jPanelCamposAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelCamposEstadoNovedadSeguimiento;
			jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelAccionesFormularioEstadoNovedadSeguimiento;
		}
		
		final JPanel jPanelCamposEstadoNovedadSeguimiento=jPanelCamposAuxiliarEstadoNovedadSeguimiento;
		final JPanel jPanelAccionesFormularioEstadoNovedadSeguimiento=jPanelAccionesFormularioAuxiliarEstadoNovedadSeguimiento;
		
		
		final JMenuBar jmenuBarEstadoNovedadSeguimiento=this.jmenuBarEstadoNovedadSeguimiento;		
		final JToolBar jTtoolBarEstadoNovedadSeguimiento=this.jTtoolBarEstadoNovedadSeguimiento;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jmenuBarDetalleEstadoNovedadSeguimiento;
			jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTtoolBarDetalleEstadoNovedadSeguimiento;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoNovedadSeguimiento=jmenuBarDetalleAuxiliarEstadoNovedadSeguimiento;
		final JToolBar jTtoolBarDetalleEstadoNovedadSeguimiento=jTtoolBarDetalleAuxiliarEstadoNovedadSeguimiento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNovedadSeguimiento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNovedadSeguimiento;
			processRunnable.jTableDatos=jTableDatosEstadoNovedadSeguimiento;
			processRunnable.jPanelCampos=jPanelCamposEstadoNovedadSeguimiento;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNovedadSeguimiento;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNovedadSeguimiento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNovedadSeguimiento;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNovedadSeguimiento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNovedadSeguimiento;
			processRunnable.jTtoolBar=jTtoolBarEstadoNovedadSeguimiento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNovedadSeguimiento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoNovedadSeguimiento ,jPanelParametrosReportesEstadoNovedadSeguimiento, jTableDatosEstadoNovedadSeguimiento,/*jScrollPanelDatosEstadoNovedadSeguimiento,*/jPanelCamposEstadoNovedadSeguimiento,jPanelPaginacionEstadoNovedadSeguimiento, /*jScrollPanelDatosEdicionEstadoNovedadSeguimiento,*/ jPanelAccionesEstadoNovedadSeguimiento,jPanelAccionesFormularioEstadoNovedadSeguimiento,jmenuBarEstadoNovedadSeguimiento,jmenuBarDetalleEstadoNovedadSeguimiento,jTtoolBarEstadoNovedadSeguimiento,jTtoolBarDetalleEstadoNovedadSeguimiento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoNovedadSeguimiento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoNovedadSeguimiento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoNovedadSeguimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoNovedadSeguimiento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoNovedadSeguimiento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoNovedadSeguimiento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoNovedadSeguimiento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadonovedadseguimientoConstantesFunciones.getsFinalQueryEstadoNovedadSeguimiento();
		String  finalQueryPaginacionTodos=this.estadonovedadseguimientoConstantesFunciones.getsFinalQueryEstadoNovedadSeguimiento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoNovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesNoEstadoNovedadSeguimiento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoNovedadSeguimientoConstantesFunciones.getArrayColumnasGlobalesEstadoNovedadSeguimiento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoNovedadSeguimientoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadonovedadseguimientosEliminados= new ArrayList<EstadoNovedadSeguimiento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoNovedadSeguimiento();
		
				///*EstadoNovedadSeguimientoSessionBean*/this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
			
			if(this.estadonovedadseguimientoSessionBean==null) {
				this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
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
					this.iNumeroPaginacion=EstadoNovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoNovedadSeguimientoConstantesFunciones.getClassesForeignKeysOfEstadoNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadonovedadseguimiento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadonovedadseguimientosAux= new ArrayList<EstadoNovedadSeguimiento>();
			
				
			estadonovedadseguimientoLogic.setDatosCliente(this.datosCliente);
			estadonovedadseguimientoLogic.setDatosDeep(this.datosDeep);
			estadonovedadseguimientoLogic.setIsConDeep(true);
			
			
			estadonovedadseguimientoLogic.getEstadoNovedadSeguimientoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadonovedadseguimientoLogic.getTodosEstadoNovedadSeguimientos(finalQueryGlobal,pagination);
					
					//estadonovedadseguimientoLogic.getTodosEstadoNovedadSeguimientosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()==null|| estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadseguimientosAux= new ArrayList<EstadoNovedadSeguimiento>();
							estadonovedadseguimientosAux.addAll(estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadseguimientosAux= new ArrayList<EstadoNovedadSeguimiento>();
							estadonovedadseguimientosAux.addAll(estadonovedadseguimientos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadseguimientoLogic.getTodosEstadoNovedadSeguimientos(finalQueryGlobal+"",this.pagination);												
							
							//estadonovedadseguimientoLogic.getTodosEstadoNovedadSeguimientosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(new ArrayList<EstadoNovedadSeguimiento>());					
							estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().addAll(estadonovedadseguimientosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadseguimientos=new ArrayList<EstadoNovedadSeguimiento>();
							estadonovedadseguimientos.addAll(estadonovedadseguimientosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoNovedadSeguimiento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoNovedadSeguimiento=this.idActual;
				
				} else if(this.idEstadoNovedadSeguimientoActual!=null && this.idEstadoNovedadSeguimientoActual!=0L) {
					idEstadoNovedadSeguimiento=idEstadoNovedadSeguimientoActual;
				}
				
					
				this.sDetalleReporte=EstadoNovedadSeguimientoConstantesFunciones.getDetalleIndicePorId(idEstadoNovedadSeguimiento);
				
				this.estadonovedadseguimientos=new ArrayList<EstadoNovedadSeguimiento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadonovedadseguimientoLogic.getEntity(idEstadoNovedadSeguimiento);
					
					//estadonovedadseguimientoLogic.getEntityWithConnection(idEstadoNovedadSeguimiento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(new ArrayList<EstadoNovedadSeguimiento>());
					estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().add(estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonovedadseguimientos=new ArrayList<EstadoNovedadSeguimiento>();
					this.estadonovedadseguimientos.add(estadonovedadseguimiento);
				}
				
				if(estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoNovedadSeguimiento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoNovedadSeguimiento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadseguimientos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonovedadseguimientos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoNovedadSeguimiento estadonovedadseguimiento) {
		Boolean permite=true;
		
		if(this.estadonovedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoNovedadSeguimientoConstantesFunciones.getOrderByListaEstadoNovedadSeguimiento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoNovedadSeguimientoConstantesFunciones.getOrderByListaEstadoNovedadSeguimiento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadSeguimiento estadonovedadseguimiento:estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				if(estadonovedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadseguimientoTotales=estadonovedadseguimiento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadSeguimiento estadonovedadseguimiento:this.estadonovedadseguimientos) {
				if(estadonovedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadseguimientoTotales=estadonovedadseguimiento;
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
			this.estadonovedadseguimientoAux=new EstadoNovedadSeguimiento();
			this.estadonovedadseguimientoAux.setsType(Constantes2.S_TOTALES);
			this.estadonovedadseguimientoAux.setIsNew(false);
			this.estadonovedadseguimientoAux.setIsChanged(false);
			this.estadonovedadseguimientoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoNovedadSeguimientoConstantesFunciones.TotalizarValoresFilaEstadoNovedadSeguimiento(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),this.estadonovedadseguimientoAux);
				
				this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().add(this.estadonovedadseguimientoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoNovedadSeguimientoConstantesFunciones.TotalizarValoresFilaEstadoNovedadSeguimiento(this.estadonovedadseguimientos,this.estadonovedadseguimientoAux);
				
				this.estadonovedadseguimientos.add(this.estadonovedadseguimientoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadonovedadseguimientoTotales=new EstadoNovedadSeguimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().remove(estadonovedadseguimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonovedadseguimientos.remove(estadonovedadseguimientoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadonovedadseguimientoTotales=new EstadoNovedadSeguimiento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNovedadSeguimiento estadonovedadseguimiento:estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				if(estadonovedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadseguimientoTotales=estadonovedadseguimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNovedadSeguimientoConstantesFunciones.TotalizarValoresFilaEstadoNovedadSeguimiento(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),estadonovedadseguimientoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNovedadSeguimiento estadonovedadseguimiento:this.estadonovedadseguimientos) {
				if(estadonovedadseguimiento.getsType().equals(Constantes2.S_TOTALES)) {
					estadonovedadseguimientoTotales=estadonovedadseguimiento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNovedadSeguimientoConstantesFunciones.TotalizarValoresFilaEstadoNovedadSeguimiento(this.estadonovedadseguimientos,estadonovedadseguimientoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoNovedadSeguimiento() {
		this.isPermisoTodoEstadoNovedadSeguimiento=false;
		this.isPermisoNuevoEstadoNovedadSeguimiento=false;
		this.isPermisoActualizarEstadoNovedadSeguimiento=false;
		this.isPermisoActualizarOriginalEstadoNovedadSeguimiento=false;
		this.isPermisoEliminarEstadoNovedadSeguimiento=false;
		this.isPermisoGuardarCambiosEstadoNovedadSeguimiento=false;
		this.isPermisoConsultaEstadoNovedadSeguimiento=false;
		this.isPermisoBusquedaEstadoNovedadSeguimiento=false;
		this.isPermisoReporteEstadoNovedadSeguimiento=false;		
		this.isPermisoOrdenEstadoNovedadSeguimiento=false;		
		this.isPermisoPaginacionMedioEstadoNovedadSeguimiento=false;		
		this.isPermisoPaginacionAltoEstadoNovedadSeguimiento=false;
		this.isPermisoPaginacionTodoEstadoNovedadSeguimiento=false;
		this.isPermisoCopiarEstadoNovedadSeguimiento=false;		
		this.isPermisoVerFormEstadoNovedadSeguimiento=false;		
		this.isPermisoDuplicarEstadoNovedadSeguimiento=false;		
		this.isPermisoOrdenEstadoNovedadSeguimiento=false;		
	}
	
	public void setPermisosUsuarioEstadoNovedadSeguimiento(Boolean isPermiso) {
		this.isPermisoTodoEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoNuevoEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarOriginalEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoEliminarEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoGuardarCambiosEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoConsultaEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoBusquedaEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoReporteEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoOrdenEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionMedioEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionAltoEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoPaginacionTodoEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoCopiarEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoVerFormEstadoNovedadSeguimiento=isPermiso;		
		this.isPermisoDuplicarEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoOrdenEstadoNovedadSeguimiento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoNovedadSeguimiento(Boolean isPermiso) {
		//this.isPermisoTodoEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoNuevoEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoActualizarOriginalEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoEliminarEstadoNovedadSeguimiento=isPermiso;
		this.isPermisoGuardarCambiosEstadoNovedadSeguimiento=isPermiso;
		//this.isPermisoConsultaEstadoNovedadSeguimiento=isPermiso;
		//this.isPermisoBusquedaEstadoNovedadSeguimiento=isPermiso;
		//this.isPermisoReporteEstadoNovedadSeguimiento=isPermiso;
		//this.isPermisoOrdenEstadoNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoNovedadSeguimiento=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoNovedadSeguimiento=isPermiso;		
		//this.isPermisoCopiarEstadoNovedadSeguimiento=isPermiso;		
		//this.isPermisoDuplicarEstadoNovedadSeguimiento=isPermiso;
		//this.isPermisoOrdenEstadoNovedadSeguimiento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNovedadSeguimientoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoNovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoNovedadSeguimiento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNovedadSeguimientoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoNovedadSeguimientoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoNovedadSeguimientoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoNovedadSeguimientoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoNovedadSeguimiento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoNovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoNovedadSeguimientoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoNovedadSeguimiento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoNovedadSeguimiento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoNovedadSeguimiento=this.isPermisoActualizarEstadoNovedadSeguimiento;
			this.isPermisoEliminarEstadoNovedadSeguimiento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoNovedadSeguimiento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoNovedadSeguimiento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoNovedadSeguimiento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoNovedadSeguimiento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoNovedadSeguimiento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNovedadSeguimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoNovedadSeguimiento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoNovedadSeguimiento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoNovedadSeguimiento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoNovedadSeguimiento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNovedadSeguimiento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoNovedadSeguimiento.setToolTipText(this.jTableDatosEstadoNovedadSeguimiento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoNovedadSeguimiento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoNovedadSeguimiento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoNovedadSeguimiento() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoNovedadSeguimientoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoNovedadSeguimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoNovedadSeguimientoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoNovedadSeguimientoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoNovedadSeguimientoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoNovedadSeguimiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoNovedadSeguimiento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoNovedadSeguimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadSeguimiento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoNovedadSeguimiento()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoNovedadSeguimiento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoNovedadSeguimiento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoNovedadSeguimiento(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoNovedadSeguimiento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoNovedadSeguimientoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoNovedadSeguimientoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoNovedadSeguimientoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean(); 
		this.estadonovedadseguimientoConstantesFunciones=new EstadoNovedadSeguimientoConstantesFunciones(); 
		this.estadonovedadseguimientoBean=new EstadoNovedadSeguimiento();//(this.estadonovedadseguimientoConstantesFunciones); 		
		this.estadonovedadseguimientoReturnGeneral=new EstadoNovedadSeguimientoParameterReturnGeneral(); 
		
		this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonovedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoNovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoNovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoNovedadSeguimientoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoNovedadSeguimiento(true);
			
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
			
			this.estadonovedadseguimientoConstantesFunciones=new EstadoNovedadSeguimientoConstantesFunciones(); 
			this.estadonovedadseguimientoBean=new EstadoNovedadSeguimiento();//this.estadonovedadseguimientoConstantesFunciones); 			
			this.estadonovedadseguimientoReturnGeneral=new EstadoNovedadSeguimientoParameterReturnGeneral(); 
		
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Novedad Seguimiento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadonovedadseguimiento=new EstadoNovedadSeguimiento();
			this.estadonovedadseguimientos = new ArrayList<EstadoNovedadSeguimiento>();
			this.estadonovedadseguimientosAux = new ArrayList<EstadoNovedadSeguimiento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic=new EstadoNovedadSeguimientoLogic();
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadonovedadseguimientoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadonovedadseguimientoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento);	
					}
					
					if(this.jInternalFrameImportacionEstadoNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNovedadSeguimiento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoNovedadSeguimiento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoNovedadSeguimiento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento);
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setVisible(false);
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento);
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNovedadSeguimiento);
					this.jInternalFrameImportacionEstadoNovedadSeguimiento.setVisible(false);
					this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoNovedadSeguimiento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNovedadSeguimiento);
					this.jInternalFrameOrderByEstadoNovedadSeguimiento.setVisible(false);
					this.jInternalFrameOrderByEstadoNovedadSeguimiento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoNovedadSeguimientoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoNovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadonovedadseguimientoReturnGeneral=new EstadoNovedadSeguimientoParameterReturnGeneral();
			
			this.estadonovedadseguimientoParameterGeneral=new EstadoNovedadSeguimientoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadonovedadseguimientoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNovedadSeguimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado(),this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNovedadSeguimientoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado(),this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoNovedadSeguimiento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoNovedadSeguimiento(false);
			
			this.setPermisosUsuarioEstadoNovedadSeguimiento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado() && this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoNovedadSeguimientoClasesRelacionadas();
			}
			
			if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoNovedadSeguimientoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoNovedadSeguimiento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoNovedadSeguimiento();
			}
			
			if(!this.isPermisoBusquedaEstadoNovedadSeguimiento) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoNovedadSeguimiento,this.isPermisoPaginacionMedioEstadoNovedadSeguimiento,this.isPermisoPaginacionTodoEstadoNovedadSeguimiento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoNovedadSeguimientoConstantesFunciones.getTiposSeleccionarEstadoNovedadSeguimiento());
				
				this.tiposColumnasSelect=EstadoNovedadSeguimientoConstantesFunciones.getTiposSeleccionarEstadoNovedadSeguimiento(true);
				
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
			//if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoNovedadSeguimiento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoNovedadSeguimiento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoNovedadSeguimiento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadSeguimiento() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadonovedadseguimientoImplementable= (EstadoNovedadSeguimientoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNovedadSeguimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadonovedadseguimientoImplementableHome= (EstadoNovedadSeguimientoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNovedadSeguimientoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadonovedadseguimientos= new ArrayList<EstadoNovedadSeguimiento>();
			this.estadonovedadseguimientosEliminados= new ArrayList<EstadoNovedadSeguimiento>();
						
			this.isEsNuevoEstadoNovedadSeguimiento=false;
			this.esParaAccionDesdeFormularioEstadoNovedadSeguimiento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoNovedadSeguimiento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoNovedadSeguimiento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoNovedadSeguimientoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoNovedadSeguimiento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoNovedadSeguimiento();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoNovedadSeguimiento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoNovedadSeguimiento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoNovedadSeguimiento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoNovedadSeguimiento")) {
				iIndex=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoNovedadSeguimiento();	
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
	
	public void cargarCombosForeignKeyEstadoNovedadSeguimiento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoNovedadSeguimiento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoNovedadSeguimiento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoNovedadSeguimientoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoNovedadSeguimiento();
		
		this.cargarCombosFrameForeignKeyEstadoNovedadSeguimiento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoNovedadSeguimiento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoNovedadSeguimiento();
		}
	}
	
	
	
	public void jButtonNuevoEstadoNovedadSeguimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			
			if(jTableDatosEstadoNovedadSeguimiento.getRowCount()>=1) {
				jTableDatosEstadoNovedadSeguimiento.removeRowSelectionInterval(0, jTableDatosEstadoNovedadSeguimiento.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoNovedadSeguimiento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoNovedadSeguimiento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(true);			
			//this.estadonovedadseguimiento=new EstadoNovedadSeguimiento();
			//this.estadonovedadseguimiento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento() ;
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadSeguimiento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadonovedadseguimiento);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);				
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoNovedadSeguimiento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRows().length;			
			}
			
			estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoNovedadSeguimiento--;			
				//EstadoNovedadSeguimiento estadonovedadseguimientoAux= new EstadoNovedadSeguimiento();			
				//estadonovedadseguimientoAux.setId(this.iIdNuevoEstadoNovedadSeguimiento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoNovedadSeguimiento estadonovedadseguimientoOrigen=new EstadoNovedadSeguimiento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoNovedadSeguimiento estadonovedadseguimientoOrigen : estadonovedadseguimientosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadonovedadseguimientoOrigen =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonovedadseguimientoOrigen =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoNovedadSeguimiento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadonovedadseguimiento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoNovedadSeguimiento(estadonovedadseguimientoOrigen,this.estadonovedadseguimiento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().add(this.estadonovedadseguimientoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonovedadseguimientos.add(this.estadonovedadseguimientoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
				
				this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadSeguimiento(), this.getIndiceNuevoEstadoNovedadSeguimiento());
				
				int iLastRow =  this.jTableDatosEstadoNovedadSeguimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNovedadSeguimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNovedadSeguimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();									
		
			EstadoNovedadSeguimiento estadonovedadseguimientoOrigen=new EstadoNovedadSeguimiento();
			EstadoNovedadSeguimiento estadonovedadseguimientoDestino=new EstadoNovedadSeguimiento();
				
			estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadonovedadseguimientosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoNovedadSeguimiento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadseguimientoOrigen =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonovedadseguimientoOrigen =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonovedadseguimientoDestino =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonovedadseguimientoDestino =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadonovedadseguimientoOrigen =estadonovedadseguimientosSeleccionados.get(0);
				estadonovedadseguimientoDestino =estadonovedadseguimientosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoNovedadSeguimiento(estadonovedadseguimientoOrigen,estadonovedadseguimientoDestino,true,false);
				
				estadonovedadseguimientoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonovedadseguimientoDestino,estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonovedadseguimientoDestino,estadonovedadseguimientos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
				
				//this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadSeguimiento(), this.getIndiceNuevoEstadoNovedadSeguimiento());
				
				int iLastRow =  this.jTableDatosEstadoNovedadSeguimiento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNovedadSeguimiento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNovedadSeguimiento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoNovedadSeguimiento.isVisible();
			
			
			this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(!isVisible);
			this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(!isVisible);
			this.jPanelAccionesEstadoNovedadSeguimiento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoNovedadSeguimiento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoNovedadSeguimiento();
			
			this.abrirFrameOrderByEstadoNovedadSeguimiento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoNovedadSeguimiento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoNovedadSeguimiento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNovedadSeguimiento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSize(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.iWidthFormulario,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jContentPaneDetalleEstadoNovedadSeguimiento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jContentPaneDetalleEstadoNovedadSeguimiento.getWidth(),EstadoNovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jContentPaneDetalleEstadoNovedadSeguimiento.getWidth(),EstadoNovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jContentPaneDetalleEstadoNovedadSeguimiento.getWidth(),EstadoNovedadSeguimientoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoNovedadSeguimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoNovedadSeguimiento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadSeguimiento,false,this);
				} else {
					this.jInternalFrameOrderByEstadoNovedadSeguimiento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNovedadSeguimiento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNovedadSeguimiento);
				this.jInternalFrameOrderByEstadoNovedadSeguimiento.setVisible(false);
				this.jInternalFrameOrderByEstadoNovedadSeguimiento.setSelected(false);
				
				this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNovedadSeguimiento"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoNovedadSeguimiento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoNovedadSeguimiento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoNovedadSeguimiento==null) {
				
				this.jInternalFrameImportacionEstadoNovedadSeguimiento=new ImportacionJInternalFrame(EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNovedadSeguimiento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNovedadSeguimiento);
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.setVisible(false);
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSelected(false);


				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNovedadSeguimiento"));
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNovedadSeguimiento"));
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNovedadSeguimiento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoNovedadSeguimiento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento==null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento=new ReporteDinamicoJInternalFrame(EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento);
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadSeguimiento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadSeguimiento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoNovedadSeguimiento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNovedadSeguimiento);
			
	       	this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.dispose();
			//this.jInternalFrameDetalleFormEstadoNovedadSeguimiento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoNovedadSeguimiento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoNovedadSeguimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoNovedadSeguimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setVisible(true);
	        this.jInternalFrameOrderByEstadoNovedadSeguimiento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoNovedadSeguimiento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameOrderByEstadoNovedadSeguimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoNovedadSeguimiento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoNovedadSeguimiento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoNovedadSeguimiento.setVisible(false);
	        this.jInternalFrameImportacionEstadoNovedadSeguimiento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoNovedadSeguimiento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoNovedadSeguimiento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(true);
			//this.isEsNuevoEstadoNovedadSeguimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false) ;
			
			if(estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadSeguimiento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoNovedadSeguimientoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoNovedadSeguimiento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(true);
			//this.isEsNuevoEstadoNovedadSeguimiento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadonovedadseguimiento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false) ;
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNovedadSeguimiento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoNovedadSeguimiento(false);
			
			//if(!this.isEsNuevoEstadoNovedadSeguimiento) {								
				int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				
			}
			
			if(this.permiteMantenimiento(this.estadonovedadseguimiento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoNovedadSeguimiento=true;
					this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
					this.isEsNuevoEstadoNovedadSeguimiento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoNovedadSeguimiento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoNovedadSeguimiento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(false);
				
				this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(false);
			
												
				
				if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoNovedadSeguimiento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,estadonovedadseguimientoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadonovedadseguimientoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadonovedadseguimiento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				this.estadonovedadseguimiento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				this.estadonovedadseguimiento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadonovedadseguimiento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoNovedadSeguimientoModel) this.jTableDatosEstadoNovedadSeguimiento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoNovedadSeguimiento=true;
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
				this.isEsNuevoEstadoNovedadSeguimiento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(false);
				
				this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(false);
				
				
				
				if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoNovedadSeguimiento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoNovedadSeguimiento.getRowCount()>=1) {
				jTableDatosEstadoNovedadSeguimiento.removeRowSelectionInterval(0, jTableDatosEstadoNovedadSeguimiento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoNovedadSeguimiento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(false) ;
			
			this.isEsNuevoEstadoNovedadSeguimiento=false;
			
			if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoNovedadSeguimiento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
				
				//SI ES MANUAL
				if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoNovedadSeguimiento--;			
			//EstadoNovedadSeguimiento estadonovedadseguimientoAux= new EstadoNovedadSeguimiento();			
			//estadonovedadseguimientoAux.setId(this.iIdNuevoEstadoNovedadSeguimiento);
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoNovedadSeguimiento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
			
			this.estadonovedadseguimiento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().add(this.estadonovedadseguimientoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadonovedadseguimientos.add(this.estadonovedadseguimientoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			
			this.jTableDatosEstadoNovedadSeguimiento.setRowSelectionInterval(this.getIndiceNuevoEstadoNovedadSeguimiento(), this.getIndiceNuevoEstadoNovedadSeguimiento());
			
			int iLastRow =  this.jTableDatosEstadoNovedadSeguimiento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoNovedadSeguimiento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoNovedadSeguimiento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();
			}
			
			//this.abrirFrameTreeEstadoNovedadSeguimiento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Novedad SeguimientoES ?", "MANTENIMIENTO DE Estado Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoNovedadSeguimiento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoNovedadSeguimiento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadonovedadseguimientoReturnGeneral=estadonovedadseguimientoLogic.procesarImportacionEstadoNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadonovedadseguimientoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoNovedadSeguimientoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoNovedadSeguimiento.setFileImportacion(this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoNovedadSeguimiento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoNovedadSeguimiento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		

		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoNovedadSeguimientoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoNovedadSeguimientoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoNovedadSeguimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoNovedadSeguimiento estadonovedadseguimiento:estadonovedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonovedadseguimiento.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoNovedadSeguimiento estadonovedadseguimiento:estadonovedadseguimientosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonovedadseguimiento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoNovedadSeguimiento(row);				
			//	iRow++;
			//}				
			
			//for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoNovedadSeguimiento(estadonovedadseguimientoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
			
			//SI ES MANUAL
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNovedadSeguimiento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoNovedadSeguimiento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoNovedadSeguimiento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoNovedadSeguimiento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoNovedadSeguimiento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoNovedadSeguimiento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoNovedadSeguimiento.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoNovedadSeguimiento.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoNovedadSeguimiento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoNovedadSeguimiento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoNovedadSeguimiento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoNovedadSeguimiento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoNovedadSeguimiento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadSeguimiento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoNovedadSeguimiento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoNovedadSeguimiento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento();
		
		this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNovedadSeguimiento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadSeguimiento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadSeguimiento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadSeguimiento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoNovedadSeguimiento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionNuevoEstadoNovedadSeguimiento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionSinCerrarEstadoNovedadSeguimiento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jCheckBoxPostAccionSinMensajeEstadoNovedadSeguimiento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoNovedadSeguimiento(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNovedadSeguimiento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNovedadSeguimiento() throws Exception {
		try	{
			if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNovedadSeguimiento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNovedadSeguimiento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNovedadSeguimiento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			
			if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoNovedadSeguimiento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadSeguimiento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNovedadSeguimiento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoNovedadSeguimiento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoNovedadSeguimiento(Boolean esInicializar) throws Exception {				
		if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNovedadSeguimiento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoNovedadSeguimiento() throws Exception {
		this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoNovedadSeguimiento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoNovedadSeguimientoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimientoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoNovedadSeguimiento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadonovedadseguimientos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoNovedadSeguimiento.setModel(new EstadoNovedadSeguimientoModel(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoNovedadSeguimiento.setModel(new EstadoNovedadSeguimientoModel(this.estadonovedadseguimientos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoNovedadSeguimiento!=null && this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoNovedadSeguimiento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,estadonovedadseguimientoConstantesFunciones.resaltarSeleccionarEstadoNovedadSeguimiento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoNovedadSeguimientoConstantesFunciones.SCLASSWEBTITULO,estadonovedadseguimientoConstantesFunciones.resaltarSeleccionarEstadoNovedadSeguimiento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID));

		if(this.estadonovedadseguimientoConstantesFunciones.mostraridEstadoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltaridEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activaridEstadoNovedadSeguimiento,this,true,"idEstadoNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltaridEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activaridEstadoNovedadSeguimiento,this,true,"idEstadoNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO));

		if(this.estadonovedadseguimientoConstantesFunciones.mostrarcodigoEstadoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltarcodigoEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activarcodigoEstadoNovedadSeguimiento,this,true,"codigoEstadoNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltarcodigoEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activarcodigoEstadoNovedadSeguimiento,this,true,"codigoEstadoNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadonovedadseguimientoConstantesFunciones.mostrarnombreEstadoNovedadSeguimiento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltarnombreEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activarnombreEstadoNovedadSeguimiento,this,true,"nombreEstadoNovedadSeguimiento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonovedadseguimientoConstantesFunciones.resaltarnombreEstadoNovedadSeguimiento,this.estadonovedadseguimientoConstantesFunciones.activarnombreEstadoNovedadSeguimiento,this,true,"nombreEstadoNovedadSeguimiento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNovedadSeguimientoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNovedadSeguimiento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNovedadSeguimiento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoNovedadSeguimiento.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoNovedadSeguimiento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoNovedadSeguimiento.moveColumn(this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoNovedadSeguimiento.moveColumn(this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoNovedadSeguimiento.moveColumn(this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoNovedadSeguimiento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoNovedadSeguimiento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoNovedadSeguimiento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoNovedadSeguimiento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoNovedadSeguimiento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoNovedadSeguimiento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadonovedadseguimientos.size()-1;
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
		//this.jTableDatosEstadoNovedadSeguimiento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoNovedadSeguimiento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoNovedadSeguimiento();
			
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
				
				//this.isEsNuevoEstadoNovedadSeguimiento=false;
					
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
				if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNovedadSeguimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadonovedadseguimiento.getsType().equals("DUPLICADO")
				   || this.estadonovedadseguimiento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoNovedadSeguimiento=true;
				
				} else {
					this.isEsNuevoEstadoNovedadSeguimiento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadonovedadseguimiento.getId()>=0 && !this.estadonovedadseguimiento.getIsNew()) {						
						this.isEsNuevoEstadoNovedadSeguimiento=false;
						
					} else {
						this.isEsNuevoEstadoNovedadSeguimiento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoNovedadSeguimiento(esRelaciones);						
				
				this.seleccionarEstadoNovedadSeguimiento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadonovedadseguimiento.getId()<0) {
					this.isEsNuevoEstadoNovedadSeguimiento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoNovedadSeguimiento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoNovedadSeguimiento(evt,rowIndex);
				}	
				
				if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoNovedadSeguimiento: " + this.dDif); 
					}
				}								
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoNovedadSeguimiento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadonovedadseguimiento)) {
					if(this.estadonovedadseguimiento.getId()>0) {
						this.estadonovedadseguimiento.setIsDeleted(true);
						
						this.estadonovedadseguimientosEliminados.add(this.estadonovedadseguimiento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().remove(this.estadonovedadseguimiento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonovedadseguimientos.remove(this.estadonovedadseguimiento);				
					}
					
					
					((EstadoNovedadSeguimientoModel) this.jTableDatosEstadoNovedadSeguimiento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoNovedadSeguimiento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoNovedadSeguimiento) {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNovedadSeguimiento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoNovedadSeguimiento(estadonovedadseguimiento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(estadonovedadseguimiento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoNovedadSeguimiento(estadonovedadseguimiento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadSeguimiento(estadonovedadseguimiento);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoNovedadSeguimiento estadonovedadseguimientoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadonovedadseguimientoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoNovedadSeguimiento estadonovedadseguimientoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadonovedadseguimientoLocal=this.estadonovedadseguimiento;
			} else {
				estadonovedadseguimientoLocal=this.estadonovedadseguimientoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadonovedadseguimientoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoNovedadSeguimiento(estadonovedadseguimientoLocal,true);
					
					if(estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadonovedadseguimientoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadonovedadseguimientoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(estadonovedadseguimiento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(estadonovedadseguimiento);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(estadonovedadseguimiento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.getText()==null || this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.getText()=="" || this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setText("0");
			}

			if(conColumnasBase) {estadonovedadseguimiento.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelIdEstadoNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonovedadseguimiento.setcodigo(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelcodigoEstadoNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonovedadseguimiento.setnombre(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jLabelnombreEstadoNovedadSeguimiento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimientoBean,EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimientoOrigen,EstadoNovedadSeguimiento estadonovedadseguimiento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonovedadseguimientoOrigen.getId()!=null && !estadonovedadseguimientoOrigen.getId().equals(0L))) {estadonovedadseguimiento.setId(estadonovedadseguimientoOrigen.getId());}}
			if(conDefault || (!conDefault && estadonovedadseguimientoOrigen.getcodigo()!=null && !estadonovedadseguimientoOrigen.getcodigo().equals(""))) {estadonovedadseguimiento.setcodigo(estadonovedadseguimientoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadonovedadseguimientoOrigen.getnombre()!=null && !estadonovedadseguimientoOrigen.getnombre().equals(""))) {estadonovedadseguimiento.setnombre(estadonovedadseguimientoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setText(estadonovedadseguimiento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNovedadSeguimiento(EstadoNovedadSeguimientoBean estadonovedadseguimientoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setText(estadonovedadseguimientoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setText(estadonovedadseguimientoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setText(estadonovedadseguimientoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoNovedadSeguimiento(EstadoNovedadSeguimientoParameterReturnGeneral estadonovedadseguimientoReturnGeneral,EstadoNovedadSeguimientoBean estadonovedadseguimientoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoNovedadSeguimiento estadonovedadseguimientoLocal=new EstadoNovedadSeguimiento();
			
			estadonovedadseguimientoLocal=estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonovedadseguimientoLocal.getId()!=null && !estadonovedadseguimientoLocal.getId().equals(0L))) {estadonovedadseguimientoBean.setId(estadonovedadseguimientoLocal.getId());}}
			if(conDefault || (!conDefault && estadonovedadseguimientoLocal.getcodigo()!=null && !estadonovedadseguimientoLocal.getcodigo().equals(""))) {estadonovedadseguimientoBean.setcodigo(estadonovedadseguimientoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadonovedadseguimientoLocal.getnombre()!=null && !estadonovedadseguimientoLocal.getnombre().equals(""))) {estadonovedadseguimientoBean.setnombre(estadonovedadseguimientoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoNovedadSeguimientoGenerico(Long idEstadoNovedadSeguimientoSeleccionado,JComboBox jComboBoxEstadoNovedadSeguimiento,List<EstadoNovedadSeguimiento> estadonovedadseguimientosLocal)throws Exception {
		try {
			EstadoNovedadSeguimiento  estadonovedadseguimientoTemp=null;

			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosLocal) {
				if(estadonovedadseguimientoAux.getId()!=null && estadonovedadseguimientoAux.getId().equals(idEstadoNovedadSeguimientoSeleccionado)) {
					estadonovedadseguimientoTemp=estadonovedadseguimientoAux;
					break;
				}
			}

			jComboBoxEstadoNovedadSeguimiento.setSelectedItem(estadonovedadseguimientoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoNovedadSeguimientoGenerico(JComboBox jComboBoxEstadoNovedadSeguimiento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNovedadSeguimiento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoNovedadSeguimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNovedadSeguimiento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoNovedadSeguimiento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoNovedadSeguimiento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoNovedadSeguimiento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadseguimiento=(EstadoNovedadSeguimiento) estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonovedadseguimiento =(EstadoNovedadSeguimiento) estadonovedadseguimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoNovedadSeguimiento estadonovedadseguimientoRow=new EstadoNovedadSeguimiento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadseguimientoRow=(EstadoNovedadSeguimiento) estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonovedadseguimientoRow=(EstadoNovedadSeguimiento) estadonovedadseguimientos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));			
			this.jButtonDuplicarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento && this.isPermisoDuplicarEstadoNovedadSeguimiento));			
			this.jButtonCopiarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento && this.isPermisoCopiarEstadoNovedadSeguimiento));
			this.jButtonVerFormEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento && this.isPermisoVerFormEstadoNovedadSeguimiento));
			
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));			
			
			this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));			
			this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento && this.isPermisoEliminarEstadoNovedadSeguimiento));
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento);							
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));						
			this.jButtonDuplicarToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento && this.isPermisoDuplicarEstadoNovedadSeguimiento));						
			this.jButtonCopiarToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento && this.isPermisoCopiarEstadoNovedadSeguimiento));			
			this.jButtonVerFormToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento && this.isPermisoVerFormEstadoNovedadSeguimiento));			
			this.jButtonAbrirOrderByToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));
			this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));			
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento  && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento && this.isPermisoEliminarEstadoNovedadSeguimiento));
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarToolBarEstadoNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento);				
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));			
			this.jMenuItemDuplicarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento && this.isPermisoDuplicarEstadoNovedadSeguimiento));			
			this.jMenuItemCopiarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento && this.isPermisoCopiarEstadoNovedadSeguimiento));			
			this.jMenuItemVerFormEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento && this.isPermisoVerFormEstadoNovedadSeguimiento));			
			this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));			
			//this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));
			this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));			
			//this.jMenuItemDetalleMostrarOcultarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento && this.isPermisoOrdenEstadoNovedadSeguimiento));			
			this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento));			
			this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento && this.isPermisoNuevoEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));									
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemModificarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemActualizarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento && this.isPermisoActualizarEstadoNovedadSeguimiento));	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemEliminarEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento && this.isPermisoEliminarEstadoNovedadSeguimiento));
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemCancelarEstadoNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento);				
			}
			
			this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));						
			this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=this.jButtonNuevoEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento=this.jButtonDuplicarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento=this.jButtonCopiarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento=this.jButtonVerFormEstadoNovedadSeguimiento.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoNovedadSeguimiento=this.jButtonAbrirOrderByEstadoNovedadSeguimiento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=this.jButtonModificarEstadoNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=this.jButtonNuevoToolBarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarToolBarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarToolBarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarToolBarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarToolBarEstadoNovedadSeguimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=this.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=this.jMenuItemNuevoEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemModificarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemActualizarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemEliminarEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemCancelarEstadoNovedadSeguimiento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoNovedadSeguimiento(Boolean esInicializar) {
		if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNovedadSeguimiento();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoNovedadSeguimiento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoNovedadSeguimiento() {
		this.jButtonNuevoEstadoNovedadSeguimiento.setVisible(this.isPermisoNuevoEstadoNovedadSeguimiento);			
		this.jButtonDuplicarEstadoNovedadSeguimiento.setVisible(this.isPermisoDuplicarEstadoNovedadSeguimiento);			
		this.jButtonCopiarEstadoNovedadSeguimiento.setVisible(this.isPermisoCopiarEstadoNovedadSeguimiento);			
		this.jButtonVerFormEstadoNovedadSeguimiento.setVisible(this.isPermisoVerFormEstadoNovedadSeguimiento);			
		
		this.jButtonAbrirOrderByEstadoNovedadSeguimiento.setVisible(this.isPermisoOrdenEstadoNovedadSeguimiento);					
		
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.setVisible(this.isPermisoNuevoEstadoNovedadSeguimiento);			
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarEstadoNovedadSeguimiento.setVisible(this.isPermisoActualizarEstadoNovedadSeguimiento);	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.setVisible(this.isPermisoActualizarEstadoNovedadSeguimiento);	
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.setVisible(this.isPermisoEliminarEstadoNovedadSeguimiento);
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento);						
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.setVisible(this.isPermisoGuardarCambiosEstadoNovedadSeguimiento);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.setVisible(this.isPermisoActualizarEstadoNovedadSeguimiento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNovedadSeguimiento() {
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarEstadoNovedadSeguimiento.setVisible(this.isPermisoActualizarEstadoNovedadSeguimiento);	
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.setVisible(this.isPermisoActualizarEstadoNovedadSeguimiento);	
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.setVisible(this.isPermisoEliminarEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.setVisible(this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento);							
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.setVisible((this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento && this.isPermisoGuardarCambiosEstadoNovedadSeguimiento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoNovedadSeguimiento() {
		if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoNovedadSeguimiento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoNovedadSeguimiento() {
	}
	
	public void jTableDatosEstadoNovedadSeguimientoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoNovedadSeguimiento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.getestadonovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadseguimiento==null) {
						this.estadonovedadseguimiento = new EstadoNovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				}

				if(this.estadonovedadseguimiento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadonovedadseguimiento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.getestadonovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadseguimiento==null) {
						this.estadonovedadseguimiento = new EstadoNovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				}

				if(this.estadonovedadseguimiento.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadonovedadseguimiento.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoNovedadSeguimientoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.getestadonovedadseguimiento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonovedadseguimiento==null) {
						this.estadonovedadseguimiento = new EstadoNovedadSeguimiento();
					}

					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);
				}

				if(this.estadonovedadseguimiento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadonovedadseguimiento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoNovedadSeguimiento() {
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.dispose();
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.dispose();
			this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento=null;
		}
		
		if(this.jInternalFrameImportacionEstadoNovedadSeguimiento!=null) {
			this.jInternalFrameImportacionEstadoNovedadSeguimiento.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoNovedadSeguimiento.dispose();
			this.jInternalFrameImportacionEstadoNovedadSeguimiento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoNovedadSeguimiento();
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoNovedadSeguimiento")) {
				jButtonDuplicarEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoNovedadSeguimiento")) {
				jButtonCopiarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoNovedadSeguimiento")) {
				jButtonVerFormEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoNovedadSeguimiento")) {
				jButtonDuplicarEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoNovedadSeguimiento")) {
				jButtonDuplicarEstadoNovedadSeguimientoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoNovedadSeguimiento")) {
				jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoNovedadSeguimiento")) {
				jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoNovedadSeguimiento")) {
				jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoNovedadSeguimiento")) {
				jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoNovedadSeguimiento")) {
				jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoNovedadSeguimiento")) {
				jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoNovedadSeguimiento")) {
				jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoNovedadSeguimiento")) {
				jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoNovedadSeguimiento")) {
				jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoNovedadSeguimiento")) {
				jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoNovedadSeguimiento")) {
				jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoNovedadSeguimiento")) {
				jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoNovedadSeguimiento")) {
				jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoNovedadSeguimiento")) {
				jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoNovedadSeguimiento")) {
				jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoNovedadSeguimiento")) {
				jButtonMostrarOcultarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoNovedadSeguimiento")) {
				jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoNovedadSeguimiento")) {
				jButtonCopiarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoNovedadSeguimiento")) {
				jButtonVerFormEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoNovedadSeguimiento")) {
				jButtonCopiarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoNovedadSeguimiento")) {
				jButtonVerFormEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoNovedadSeguimiento")) {
				jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoNovedadSeguimiento")) {
				jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoNovedadSeguimiento")) {
				jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoNovedadSeguimiento")) {
				jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoNovedadSeguimiento")) {
				jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoNovedadSeguimiento")) {
				jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoNovedadSeguimiento")) {
				jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoNovedadSeguimiento")) {
				jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoNovedadSeguimiento")) {
				jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoNovedadSeguimiento") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento")) {
				jButtonAbrirOrderByEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoNovedadSeguimiento") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoNovedadSeguimiento")) {
				jButtonMostrarOcultarEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoNovedadSeguimiento")) {
				jButtonCerrarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoNovedadSeguimiento")) {
				jButtonGenerarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoNovedadSeguimiento")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoNovedadSeguimiento")) {
				jButtonCerrarImportacionEstadoNovedadSeguimientoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoNovedadSeguimiento")) {
				
				jButtonGenerarImportacionEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoNovedadSeguimiento")) {
				
				jButtonAbrirImportacionEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoNovedadSeguimiento")) {
				jComboBoxTiposAccionesEstadoNovedadSeguimientoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoNovedadSeguimiento")) {
				jComboBoxTiposRelacionesEstadoNovedadSeguimientoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoNovedadSeguimiento")) {
				jComboBoxTiposAccionesEstadoNovedadSeguimientoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoNovedadSeguimiento")) {
				
				jComboBoxTiposSeleccionarEstadoNovedadSeguimientoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoNovedadSeguimiento")) {
				jTextFieldValorCampoGeneralEstadoNovedadSeguimientoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoNovedadSeguimiento")) {
				jButtonAbrirOrderByEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoNovedadSeguimiento")) {
				jButtonAbrirOrderByEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoNovedadSeguimiento")) {
				jButtonCerrarOrderByEstadoNovedadSeguimientoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNovedadSeguimientoBusqueda")) {
				this.jButtonidEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNovedadSeguimientoBusqueda")) {
				this.jButtoncodigoEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNovedadSeguimientoBusqueda")) {
				this.jButtonnombreEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoNovedadSeguimiento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoNovedadSeguimiento estadonovedadseguimientoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadonovedadseguimientoLocal=this.estadonovedadseguimiento;
			} else {
				estadonovedadseguimientoLocal=this.estadonovedadseguimientoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
							
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
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
			
			


			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
								
						
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
								
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
							
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
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
			
			


			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
								
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoNovedadSeguimiento")) {
					jCheckBoxSeleccionarTodosEstadoNovedadSeguimientoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoNovedadSeguimiento")) {
					jCheckBoxSeleccionadosEstadoNovedadSeguimientoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoNovedadSeguimiento")) {
					
				}
				
				


				
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
												
				
				


				
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
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
			
			


			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonovedadseguimiento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonovedadseguimiento);
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
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
				
				


				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNovedadSeguimiento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNovedadSeguimiento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNovedadSeguimientoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonovedadseguimientoAnterior =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoNovedadSeguimiento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoNovedadSeguimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoNovedadSeguimiento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadonovedadseguimiento =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadonovedadseguimiento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoNovedadSeguimiento")) {
				
				}
				
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoNovedadSeguimiento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoNovedadSeguimiento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoNovedadSeguimiento")) {
			
			}
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoNovedadSeguimiento();
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoNovedadSeguimiento")) {
				jButtonDuplicarEstadoNovedadSeguimientoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoNovedadSeguimiento")) {
				jButtonCopiarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoNovedadSeguimiento")) {
				jButtonVerFormEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoNovedadSeguimiento")) {
				jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoNovedadSeguimiento")) {
				jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoNovedadSeguimiento")) {
				jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoNovedadSeguimiento")) {
				jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoNovedadSeguimiento")) {
				jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoNovedadSeguimiento")) {
				jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNovedadSeguimiento")) {
				jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoNovedadSeguimiento")) {
				jButtonAbrirOrderByEstadoNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoNovedadSeguimiento")) {
				jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoNovedadSeguimiento")) {
				jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoNovedadSeguimiento")) {
				jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNovedadSeguimientoBusqueda")) {
				this.jButtonidEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNovedadSeguimientoBusqueda")) {
				this.jButtoncodigoEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNovedadSeguimientoBusqueda")) {
				this.jButtonnombreEstadoNovedadSeguimientoBusquedaActionPerformed(evt);
			}
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoNovedadSeguimiento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoNovedadSeguimiento")) {
				closingInternalFrameEstadoNovedadSeguimiento();
				
			} else if(sTipo.equals("jButtonCancelarEstadoNovedadSeguimiento")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoNovedadSeguimiento = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoNovedadSeguimientoBeanSwingJInternalFrame jInternalFrameParent=(EstadoNovedadSeguimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNovedadSeguimiento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoNovedadSeguimientoActionPerformed(null);
			}
			
			EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonovedadseguimiento,new Object(),this.estadonovedadseguimientoParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoNovedadSeguimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoNovedadSeguimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoNovedadSeguimiento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadonovedadseguimiento)) {
			if(!esControlTabla) {
				if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);			
				}
				
				if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonovedadseguimientoReturnGeneral=estadonovedadseguimientoLogic.procesarEventosEstadoNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),this.estadonovedadseguimiento,this.estadonovedadseguimientoParameterGeneral,this.isEsNuevoEstadoNovedadSeguimiento,classes);//this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral,this.estadonovedadseguimientoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNovedadSeguimiento(classes,this.estadonovedadseguimientoReturnGeneral,this.estadonovedadseguimientoBean,false);
					}
						
					if(this.estadonovedadseguimientoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento());	
					}
						
					if(this.estadonovedadseguimientoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento(),classes);//this.estadonovedadseguimientoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoNovedadSeguimiento(this.estadonovedadseguimiento,classes);//this.estadonovedadseguimientoBean);									
				}
			
				if(EstadoNovedadSeguimientoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoNovedadSeguimiento(this.estadonovedadseguimiento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNovedadSeguimiento(this.estadonovedadseguimiento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadonovedadseguimientoAnterior!=null) {
						this.estadonovedadseguimiento=this.estadonovedadseguimientoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonovedadseguimientoReturnGeneral=estadonovedadseguimientoLogic.procesarEventosEstadoNovedadSeguimientosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos(),this.estadonovedadseguimiento,this.estadonovedadseguimientoParameterGeneral,this.isEsNuevoEstadoNovedadSeguimiento,classes);//this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimiento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonovedadseguimientoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento(),estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento(),this.estadonovedadseguimientos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoNovedadSeguimiento.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoNovedadSeguimiento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoNovedadSeguimiento();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoNovedadSeguimiento() throws Exception {
		
		EstadoNovedadSeguimientoModel estadonovedadseguimientoModel=(EstadoNovedadSeguimientoModel)this.jTableDatosEstadoNovedadSeguimiento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonovedadseguimientoModel.estadonovedadseguimientos=this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadonovedadseguimientoModel.estadonovedadseguimientos=this.estadonovedadseguimientos;
		}
		
		
		((EstadoNovedadSeguimientoModel) this.jTableDatosEstadoNovedadSeguimiento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoNovedadSeguimiento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadonovedadseguimientoAnterior(),this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadonovedadseguimientoAnterior(),this.estadonovedadseguimientos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoNovedadSeguimiento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
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
										
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadseguimiento,new Object(),generalEntityParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoNovedadSeguimientoConstantesFunciones.getClassesRelationshipsOfEstadoNovedadSeguimiento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoNovedadSeguimientoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoNovedadSeguimiento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoNovedadSeguimiento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoNovedadSeguimientoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonovedadseguimiento,new Object(),generalEntityParameterGeneral,this.estadonovedadseguimientoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoNovedadSeguimiento(EstadoNovedadSeguimientoBean estadonovedadseguimientoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNovedadSeguimiento(ArrayList<Classe> classes,EstadoNovedadSeguimientoReturnGeneral estadonovedadseguimientoReturnGeneral,EstadoNovedadSeguimientoBean estadonovedadseguimientoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadonovedadseguimiento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento = new EstadoNovedadSeguimientoDetalleFormJInternalFrame(jDesktopPane,this.estadonovedadseguimientoSessionBean.getConGuardarRelaciones(),this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setVisible(false);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.estadonovedadseguimientoLogic=this.estadonovedadseguimientoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoNovedadSeguimiento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNovedadSeguimiento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNovedadSeguimiento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoNovedadSeguimiento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoNovedadSeguimiento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNovedadSeguimiento"));
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarEstadoNovedadSeguimiento"));

		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNovedadSeguimiento"));
					
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemModificarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNovedadSeguimiento"));
						
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemActualizarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarEstadoNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNovedadSeguimiento"));
								
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemEliminarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarEstadoNovedadSeguimiento"));
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNovedadSeguimiento"));
					
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemCancelarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNovedadSeguimiento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemDetalleCerrarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNovedadSeguimiento"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadSeguimiento"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadSeguimiento"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNovedadSeguimiento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonidEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtoncodigoEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonnombreEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadSeguimientoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNovedadSeguimiento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoNovedadSeguimiento"));
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNovedadSeguimiento"));
		}
		
		this.jTableDatosEstadoNovedadSeguimiento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoNovedadSeguimiento"));
		
		this.jTableDatosEstadoNovedadSeguimiento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoNovedadSeguimiento"));
		
		this.jButtonNuevoEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoEstadoNovedadSeguimiento"));
		
		this.jButtonDuplicarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"DuplicarEstadoNovedadSeguimiento"));
		
		this.jButtonCopiarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"CopiarEstadoNovedadSeguimiento"));
		
		this.jButtonVerFormEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"VerFormEstadoNovedadSeguimiento"));
		
		
		this.jButtonNuevoToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoNovedadSeguimiento"));
			
		this.jButtonDuplicarToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemNuevoEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoNovedadSeguimiento"));
			
		this.jMenuItemDuplicarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoNovedadSeguimiento"));		
		
		
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoNovedadSeguimiento"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoNovedadSeguimiento"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarEstadoNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonModificarToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNovedadSeguimiento"));
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemModificarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonActualizarToolBarEstadoNovedadSeguimiento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNovedadSeguimiento"));
				
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemActualizarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarEstadoNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonEliminarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNovedadSeguimiento"));
						
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemEliminarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarEstadoNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonCancelarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNovedadSeguimiento"));
			
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemCancelarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNovedadSeguimiento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoNovedadSeguimiento"));		
		
		
		this.jButtonCerrarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarEstadoNovedadSeguimiento"));
		
		
		this.jButtonCerrarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemCerrarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoNovedadSeguimiento"));
			
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jMenuItemDetalleCerrarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNovedadSeguimiento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoNovedadSeguimiento"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNovedadSeguimiento"));
		}
		
		this.jButtonCopiarToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoNovedadSeguimiento"));
			
		this.jButtonVerFormToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoNovedadSeguimiento"));
		
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoNovedadSeguimiento"));
			
		this.jMenuItemCopiarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoNovedadSeguimiento"));		
		
		this.jMenuItemVerFormEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoNovedadSeguimiento"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNovedadSeguimiento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNovedadSeguimiento"));		
		
		
		
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoNovedadSeguimiento"));
					
		this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoNovedadSeguimiento"));
		
		this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoNovedadSeguimiento"));		
		
		
		
		this.jButtonAnterioresEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AnterioresEstadoNovedadSeguimiento"));
		
		
		this.jButtonAnterioresToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoNovedadSeguimiento"));
		
		this.jMenuItemAnterioresEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoNovedadSeguimiento"));		
		
		
		this.jButtonSiguientesEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"SiguientesEstadoNovedadSeguimiento"));
		
		
		this.jButtonSiguientesToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemSiguientesEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoNovedadSeguimiento"));
			
		this.jMenuItemAbrirOrderByEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoNovedadSeguimiento"));
			
		this.jMenuItemMostrarOcultarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoNovedadSeguimiento"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoNovedadSeguimiento"));
			
		this.jMenuItemDetalleMostarOcultarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoNovedadSeguimiento"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoNovedadSeguimiento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoNovedadSeguimiento"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoNovedadSeguimiento"));

		this.jCheckBoxSeleccionadosEstadoNovedadSeguimiento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoNovedadSeguimiento"));
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNovedadSeguimiento"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoNovedadSeguimiento"));
			
		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoNovedadSeguimiento"));
					
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoNovedadSeguimiento"));
			
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoNovedadSeguimiento"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonidEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtoncodigoEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonnombreEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadSeguimientoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadSeguimiento"));
				this.jInternalFrameReporteDinamicoEstadoNovedadSeguimiento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadSeguimiento"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNovedadSeguimiento"));				
			//this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNovedadSeguimiento"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNovedadSeguimiento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNovedadSeguimiento"));
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNovedadSeguimiento"));
				this.jInternalFrameImportacionEstadoNovedadSeguimiento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNovedadSeguimiento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoNovedadSeguimiento"));
			
			this.jButtonAbrirOrderByToolBarEstadoNovedadSeguimiento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoNovedadSeguimiento"));			
			
			if(this.jInternalFrameOrderByEstadoNovedadSeguimiento!=null) {
				this.jInternalFrameOrderByEstadoNovedadSeguimiento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNovedadSeguimiento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTabbedPaneRelacionesEstadoNovedadSeguimiento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNovedadSeguimiento"));
		
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
            		closingInternalFrameEstadoNovedadSeguimiento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoNovedadSeguimiento = (JInternalFrameBase)event.getSource();
	            	
	            EstadoNovedadSeguimientoBeanSwingJInternalFrame jInternalFrameParent=(EstadoNovedadSeguimientoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNovedadSeguimiento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoNovedadSeguimientoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoNovedadSeguimiento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoNovedadSeguimientoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoNovedadSeguimiento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoNovedadSeguimiento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoNovedadSeguimiento";
		inputMap = this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNovedadSeguimientoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoNovedadSeguimiento";
		inputMap = this.jButtonModificarEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoNovedadSeguimiento";
		inputMap = this.jButtonActualizarEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoNovedadSeguimiento";
		inputMap = this.jButtonEliminarEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCancelarEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoNovedadSeguimiento";
		inputMap = this.jButtonCerrarEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoNovedadSeguimiento";
		inputMap = this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonGuardarCambiosEstadoNovedadSeguimiento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoNovedadSeguimiento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoNovedadSeguimientoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoNovedadSeguimientoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonidEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtoncodigoEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNovedadSeguimientoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jButtonnombreEstadoNovedadSeguimientoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNovedadSeguimientoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoNovedadSeguimiento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoNovedadSeguimientoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoNovedadSeguimiento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoNovedadSeguimiento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
					estadonovedadseguimientoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientos) {
					estadonovedadseguimientoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoNovedadSeguimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
						estadonovedadseguimientoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientos) {
						estadonovedadseguimientoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNovedadSeguimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNovedadSeguimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoNovedadSeguimientoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoNovedadSeguimiento.getSelectedRows();
			
			EstadoNovedadSeguimiento estadonovedadseguimientoLocal=new EstadoNovedadSeguimiento();
			
			//this.seleccionarTodosEstadoNovedadSeguimiento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonovedadseguimientoLocal =(EstadoNovedadSeguimiento) this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos().toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadonovedadseguimientoLocal =(EstadoNovedadSeguimiento) this.estadonovedadseguimientos.toArray()[this.jTableDatosEstadoNovedadSeguimiento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadonovedadseguimientoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
						estadonovedadseguimientoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientos) {
						estadonovedadseguimientoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNovedadSeguimiento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNovedadSeguimiento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNovedadSeguimiento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoNovedadSeguimientoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoNovedadSeguimientoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoNovedadSeguimiento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
				
						if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonovedadseguimientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonovedadseguimientoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientos) {
					
						if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonovedadseguimientoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonovedadseguimientoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoNovedadSeguimientoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoNovedadSeguimiento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoNovedadSeguimiento) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoNovedadSeguimiento(conSplash);
				
					this.generarReporteEstadoNovedadSeguimientosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoNovedadSeguimientosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNovedadSeguimientosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNovedadSeguimientosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNovedadSeguimiento();
				
				this.exportarEstadoNovedadSeguimientosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoNovedadSeguimientos();
				//this.importarEstadoNovedadSeguimientos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNovedadSeguimiento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoNovedadSeguimientosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Novedad Seguimiento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoNovedadSeguimiento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoNovedadSeguimiento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoNovedadSeguimiento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNovedadSeguimiento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jComboBoxTiposAccionesFormularioEstadoNovedadSeguimiento.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoNovedadSeguimiento();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoNovedadSeguimiento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoNovedadSeguimientoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoNovedadSeguimiento();
			
			if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
			EstadoNovedadSeguimiento estadonovedadseguimiento=new EstadoNovedadSeguimiento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoNovedadSeguimiento.getSelectedItem();
			
			
			
			
			estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadonovedadseguimientosSeleccionados.size()==1) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
					estadonovedadseguimiento=estadonovedadseguimientoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoNovedadSeguimiento();
			
      		//this.finishProcessEstadoNovedadSeguimiento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoNovedadSeguimientoReturnGeneral() throws Exception {
		if(this.estadonovedadseguimientoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadonovedadseguimientoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadonovedadseguimientoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadonovedadseguimientoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadonovedadseguimientoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadonovedadseguimientoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
		}
		
		if(this.estadonovedadseguimientoReturnGeneral.getConRetornoLista() || this.estadonovedadseguimientoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadonovedadseguimientoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonovedadseguimientoLogic.setEstadoNovedadSeguimientos(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimientos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadonovedadseguimientoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonovedadseguimientoLogic.setEstadoNovedadSeguimiento(this.estadonovedadseguimientoReturnGeneral.getEstadoNovedadSeguimiento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoNovedadSeguimiento(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoNovedadSeguimiento() throws Exception {
		
		
	}
	
	public ArrayList<EstadoNovedadSeguimiento> getEstadoNovedadSeguimientosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoNovedadSeguimiento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos()) {
					if(estadonovedadseguimientoAux.getIsSelected()) {
						estadonovedadseguimientosSeleccionados.add(estadonovedadseguimientoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:this.estadonovedadseguimientos) {
					if(estadonovedadseguimientoAux.getIsSelected()) {
						estadonovedadseguimientosSeleccionados.add(estadonovedadseguimientoAux);				
					}
				}
			}
			
			if(estadonovedadseguimientosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadonovedadseguimientosSeleccionados.addAll(this.estadonovedadseguimientoLogic.getEstadoNovedadSeguimientos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadonovedadseguimientosSeleccionados.addAll(this.estadonovedadseguimientos);				
					}
				}
			}
		} else {
			estadonovedadseguimientosSeleccionados.add(this.estadonovedadseguimiento);
		}
		
		return estadonovedadseguimientosSeleccionados;
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
	
	public void generarReporteEstadoNovedadSeguimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNovedadSeguimientosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNovedadSeguimientosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Novedad Seguimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoNovedadSeguimientosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoNovedadSeguimiento();
		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoNovedadSeguimiento();
		
		
		//this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados ,estadonovedadseguimientoImplementable,estadonovedadseguimientoImplementableHome);
	}
	
	public void mostrarImportacionEstadoNovedadSeguimientos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoNovedadSeguimiento();
		
		this.abrirFrameImportacionEstadoNovedadSeguimiento();		
		
			
		//this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados ,estadonovedadseguimientoImplementable,estadonovedadseguimientoImplementableHome);
	}
	
	public void importarEstadoNovedadSeguimientos() throws Exception {		
	
	}
	
	public void exportarEstadoNovedadSeguimientosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoNovedadSeguimientosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoNovedadSeguimientosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoNovedadSeguimientosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Novedad Seguimiento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoNovedadSeguimiento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoNovedadSeguimiento(estadonovedadseguimientoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadonovedadseguimientoAux.setsDetalleGeneralEntityReporte(estadonovedadseguimientoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoNovedadSeguimiento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadSeguimientoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadonovedadseguimiento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadseguimiento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadseguimiento.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonovedadseguimiento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoNovedadSeguimientos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoNovedadSeguimiento(row);				
				iRow++;
			}				
			
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoNovedadSeguimiento(estadonovedadseguimientoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoNovedadSeguimientosSeleccionados() throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();		
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonovedadseguimiento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadonovedadseguimientos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadonovedadseguimiento");
			//elementRoot.appendChild(element);
		
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
				element = document.createElement("estadonovedadseguimiento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoNovedadSeguimiento(estadonovedadseguimientoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Novedad Seguimiento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoNovedadSeguimiento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadseguimiento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadseguimiento.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonovedadseguimiento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoNovedadSeguimiento(EstadoNovedadSeguimiento estadonovedadseguimiento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoNovedadSeguimientoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadonovedadseguimiento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoNovedadSeguimientoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadonovedadseguimiento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoNovedadSeguimientoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadonovedadseguimiento.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoNovedadSeguimientoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadonovedadseguimiento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoNovedadSeguimientosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados=new ArrayList<EstadoNovedadSeguimiento>();
		
		estadonovedadseguimientosSeleccionados=this.getEstadoNovedadSeguimientosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoNovedadSeguimiento(estadonovedadseguimientosSeleccionados);
		
		this.generarReporteEstadoNovedadSeguimientos("Todos",estadonovedadseguimientosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoNovedadSeguimiento(ArrayList<EstadoNovedadSeguimiento> estadonovedadseguimientosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoNovedadSeguimiento estadonovedadseguimientoAux:estadonovedadseguimientosSeleccionados) {
				estadonovedadseguimientoAux.setsDetalleGeneralEntityReporte(estadonovedadseguimientoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadonovedadseguimientoAux.setsDescripcionGeneralEntityReporte1(estadonovedadseguimientoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoNovedadSeguimientoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadonovedadseguimientoAux.setsDescripcionGeneralEntityReporte1(estadonovedadseguimientoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNovedadSeguimientoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoNovedadSeguimiento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaModificarEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaCancelarEstadoNovedadSeguimiento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNovedadSeguimiento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoNovedadSeguimientoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=true;
		} else {
			this.actualizarEstadoPanelsEstadoNovedadSeguimiento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoNovedadSeguimiento=false;
			//this.isVisibilidadCeldaVerFormEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaDuplicarEstadoNovedadSeguimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNovedadSeguimiento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
			if(!estadonovedadseguimientoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;												
			}
			
			this.jButtonCerrarEstadoNovedadSeguimiento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNovedadSeguimiento=false;
		}
		
		if(!this.permiteMantenimiento(this.estadonovedadseguimiento)) {
			this.isVisibilidadCeldaActualizarEstadoNovedadSeguimiento=false;
			this.isVisibilidadCeldaEliminarEstadoNovedadSeguimiento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNovedadSeguimiento() {
	}
	
	public void actualizarEstadoPanelsEstadoNovedadSeguimiento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEdicionEstadoNovedadSeguimiento.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNovedadSeguimiento!=null) {
				this.jScrollPanelDatosEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNovedadSeguimiento!=null) {
				this.jPanelPaginacionEstadoNovedadSeguimiento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNovedadSeguimiento!=null) {
				this.jPanelParametrosReportesEstadoNovedadSeguimiento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadonovedadseguimientoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		
		if(this.estadonovedadseguimientoSessionBean==null) {
			this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		}
		
		this.estadonovedadseguimientoSessionBean.setsUltimaBusquedaEstadoNovedadSeguimiento(this.getsAccionBusqueda());
		this.estadonovedadseguimientoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadonovedadseguimientoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoNovedadSeguimientoSessionBean estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		
		if(this.estadonovedadseguimientoSessionBean==null) {
			this.estadonovedadseguimientoSessionBean=new EstadoNovedadSeguimientoSessionBean();
		}
		
		if(this.estadonovedadseguimientoSessionBean.getsUltimaBusquedaEstadoNovedadSeguimiento()!=null&&!this.estadonovedadseguimientoSessionBean.getsUltimaBusquedaEstadoNovedadSeguimiento().equals("")) {
			this.setsAccionBusqueda(estadonovedadseguimientoSessionBean.getsUltimaBusquedaEstadoNovedadSeguimiento());
			this.setiNumeroPaginacion(estadonovedadseguimientoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadonovedadseguimientoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadonovedadseguimientoSessionBean.setsUltimaBusquedaEstadoNovedadSeguimiento("");
		this.estadonovedadseguimientoSessionBean.setiNumeroPaginacion(EstadoNovedadSeguimientoConstantesFunciones.INUMEROPAGINACION);
		this.estadonovedadseguimientoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoNovedadSeguimiento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoNovedadSeguimiento() {
		this.updateBorderResaltarBusquedasFormularioEstadoNovedadSeguimiento();
		this.updateVisibilidadBusquedasFormularioEstadoNovedadSeguimiento();
		this.updateHabilitarBusquedasFormularioEstadoNovedadSeguimiento();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoNovedadSeguimiento() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoNovedadSeguimiento() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoNovedadSeguimiento() {
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
	
	public void updateControlesFormularioEstadoNovedadSeguimiento() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoNovedadSeguimiento();
		this.updateVisibilidadResaltarControlesFormularioEstadoNovedadSeguimiento();
		this.updateHabilitarResaltarControlesFormularioEstadoNovedadSeguimiento();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoNovedadSeguimiento() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadonovedadseguimientoConstantesFunciones.resaltaridEstadoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setBorder(this.estadonovedadseguimientoConstantesFunciones.resaltaridEstadoNovedadSeguimiento);}
		if(this.estadonovedadseguimientoConstantesFunciones.resaltarcodigoEstadoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setBorder(this.estadonovedadseguimientoConstantesFunciones.resaltarcodigoEstadoNovedadSeguimiento);}
		if(this.estadonovedadseguimientoConstantesFunciones.resaltarnombreEstadoNovedadSeguimiento!=null && this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setBorder(this.estadonovedadseguimientoConstantesFunciones.resaltarnombreEstadoNovedadSeguimiento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoNovedadSeguimiento() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
	
		//this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostraridEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelidEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostraridEstadoNovedadSeguimiento);
		//this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostrarcodigoEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelcodigoEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostrarcodigoEstadoNovedadSeguimiento);
		//this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostrarnombreEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jPanelnombreEstadoNovedadSeguimiento.setVisible(this.estadonovedadseguimientoConstantesFunciones.mostrarnombreEstadoNovedadSeguimiento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoNovedadSeguimiento() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNovedadSeguimiento!=null) {
	
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldidEstadoNovedadSeguimiento.setEnabled(this.estadonovedadseguimientoConstantesFunciones.activaridEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldcodigoEstadoNovedadSeguimiento.setEnabled(this.estadonovedadseguimientoConstantesFunciones.activarcodigoEstadoNovedadSeguimiento);
		this.jInternalFrameDetalleFormEstadoNovedadSeguimiento.jTextFieldnombreEstadoNovedadSeguimiento.setEnabled(this.estadonovedadseguimientoConstantesFunciones.activarnombreEstadoNovedadSeguimiento);
		}
	}
	
		
}