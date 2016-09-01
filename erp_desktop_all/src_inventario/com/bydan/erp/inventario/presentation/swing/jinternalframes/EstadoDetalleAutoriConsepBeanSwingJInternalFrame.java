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

import com.bydan.erp.inventario.util.EstadoDetalleAutoriConsepConstantesFunciones;
import com.bydan.erp.inventario.util.EstadoDetalleAutoriConsepParameterReturnGeneral;
//import com.bydan.erp.inventario.util.EstadoDetalleAutoriConsepParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.EstadoDetalleAutoriConsepBean;
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
public class EstadoDetalleAutoriConsepBeanSwingJInternalFrame extends EstadoDetalleAutoriConsepJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoDetalleAutoriConsepBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoDetalleAutoriConsep> estadodetalleautoriconsepValidator = new ClassValidator<EstadoDetalleAutoriConsep>(EstadoDetalleAutoriConsep.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoDetalleAutoriConsep estadodetalleautoriconsep;	
	public EstadoDetalleAutoriConsep estadodetalleautoriconsepAux;
	public EstadoDetalleAutoriConsep estadodetalleautoriconsepAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoDetalleAutoriConsep estadodetalleautoriconsepTotales;
	public Long idEstadoDetalleAutoriConsepActual;
	public Long iIdNuevoEstadoDetalleAutoriConsep=0L;
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
	
	public Boolean isPermisoTodoEstadoDetalleAutoriConsep;
	public Boolean isPermisoNuevoEstadoDetalleAutoriConsep;
	public Boolean isPermisoActualizarEstadoDetalleAutoriConsep;
	public Boolean isPermisoActualizarOriginalEstadoDetalleAutoriConsep;
	public Boolean isPermisoEliminarEstadoDetalleAutoriConsep;
	public Boolean isPermisoGuardarCambiosEstadoDetalleAutoriConsep;
	public Boolean isPermisoConsultaEstadoDetalleAutoriConsep;
	public Boolean isPermisoBusquedaEstadoDetalleAutoriConsep;
	public Boolean isPermisoReporteEstadoDetalleAutoriConsep;
	public Boolean isPermisoPaginacionMedioEstadoDetalleAutoriConsep;
	public Boolean isPermisoPaginacionAltoEstadoDetalleAutoriConsep;
	public Boolean isPermisoPaginacionTodoEstadoDetalleAutoriConsep;
	public Boolean isPermisoCopiarEstadoDetalleAutoriConsep;
	public Boolean isPermisoVerFormEstadoDetalleAutoriConsep;
	public Boolean isPermisoDuplicarEstadoDetalleAutoriConsep;
	public Boolean isPermisoOrdenEstadoDetalleAutoriConsep;
	
	
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
	
	public EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepReturnGeneral;
	public EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoDetalleAutoriConsep=false;
	public Boolean esParaAccionDesdeFormularioEstadoDetalleAutoriConsep=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoDetalleAutoriConsep estadodetalleautoriconsepBean;
	public EstadoDetalleAutoriConsepConstantesFunciones estadodetalleautoriconsepConstantesFunciones;
	//public EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps;	
	//public List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsEliminados;
	//public List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=false;
	public Boolean isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;	
	
	
	
	public Long getiIdNuevoEstadoDetalleAutoriConsep() {
		return this.iIdNuevoEstadoDetalleAutoriConsep;
	}

	public void setiIdNuevoEstadoDetalleAutoriConsep(Long iIdNuevoEstadoDetalleAutoriConsep) {
		this.iIdNuevoEstadoDetalleAutoriConsep = iIdNuevoEstadoDetalleAutoriConsep;
	}
	
	public Long getidEstadoDetalleAutoriConsepActual() {
		return this.idEstadoDetalleAutoriConsepActual;
	}

	public void setidEstadoDetalleAutoriConsepActual(Long idEstadoDetalleAutoriConsepActual) {
		this.idEstadoDetalleAutoriConsepActual = idEstadoDetalleAutoriConsepActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoDetalleAutoriConsep getestadodetalleautoriconsep() {
		return this.estadodetalleautoriconsep;
	}

	public void setestadodetalleautoriconsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep) {
		this.estadodetalleautoriconsep = estadodetalleautoriconsep;
	}
	
	public EstadoDetalleAutoriConsep getestadodetalleautoriconsepAux() {
		return this.estadodetalleautoriconsepAux;
	}

	public void setestadodetalleautoriconsepAux(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux) {
		this.estadodetalleautoriconsepAux = estadodetalleautoriconsepAux;
	}				
	
	public EstadoDetalleAutoriConsep getestadodetalleautoriconsepAnterior() {
		return this.estadodetalleautoriconsepAnterior;
	}

	public void setestadodetalleautoriconsepAnterior(EstadoDetalleAutoriConsep estadodetalleautoriconsepAnterior) {
		this.estadodetalleautoriconsepAnterior = estadodetalleautoriconsepAnterior;
	}	
	
	public EstadoDetalleAutoriConsep getestadodetalleautoriconsepTotales() {
		return this.estadodetalleautoriconsepTotales;
	}

	public void setestadodetalleautoriconsepTotales(EstadoDetalleAutoriConsep estadodetalleautoriconsepTotales) {
		this.estadodetalleautoriconsepTotales = estadodetalleautoriconsepTotales;
	}	
	
	public EstadoDetalleAutoriConsep getestadodetalleautoriconsepBean() {
		return this.estadodetalleautoriconsepBean;
	}

	public void setestadodetalleautoriconsepBean(EstadoDetalleAutoriConsep estadodetalleautoriconsepBean) {
		this.estadodetalleautoriconsepBean = estadodetalleautoriconsepBean;
	}	
	
	public EstadoDetalleAutoriConsepParameterReturnGeneral getestadodetalleautoriconsepReturnGeneral() {
		return this.estadodetalleautoriconsepReturnGeneral;
	}

	public void setestadodetalleautoriconsepReturnGeneral(EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepReturnGeneral) {
		this.estadodetalleautoriconsepReturnGeneral = estadodetalleautoriconsepReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoDetalleAutoriConsepLogic getEstadoDetalleAutoriConsepLogic()	{		
		return estadodetalleautoriconsepLogic;
	}

	public void setEstadoDetalleAutoriConsepLogic(EstadoDetalleAutoriConsepLogic estadodetalleautoriconsepLogic) {
		this.estadodetalleautoriconsepLogic = estadodetalleautoriconsepLogic;
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
	
	public Boolean getIsEsNuevoEstadoDetalleAutoriConsep() {
		return isEsNuevoEstadoDetalleAutoriConsep;
	}

	public void setIsEsNuevoEstadoDetalleAutoriConsep(Boolean isEsNuevoEstadoDetalleAutoriConsep) {
		this.isEsNuevoEstadoDetalleAutoriConsep = isEsNuevoEstadoDetalleAutoriConsep;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoDetalleAutoriConsep() {
		return esParaAccionDesdeFormularioEstadoDetalleAutoriConsep;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoDetalleAutoriConsep(Boolean esParaAccionDesdeFormularioEstadoDetalleAutoriConsep) {
		this.esParaAccionDesdeFormularioEstadoDetalleAutoriConsep = esParaAccionDesdeFormularioEstadoDetalleAutoriConsep;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoDetalleAutoriConsep() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoDetalleAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoDetalleAutoriConsepConstantesFunciones.refrescarForeignKeysDescripcionesEstadoDetalleAutoriConsep(this.estadodetalleautoriconseps);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(this.estadodetalleautoriconseps);
			estadodetalleautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoDetalleAutoriConsepParameterReturnGeneral getEstadoDetalleAutoriConsepParameterGeneral() {
		return this.estadodetalleautoriconsepParameterGeneral;
	}
	
	public void setEstadoDetalleAutoriConsepParameterGeneral(EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepParameterGeneral) {
		this.estadodetalleautoriconsepParameterGeneral = estadodetalleautoriconsepParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoDetalleAutoriConsep() {
		return isPermisoTodoEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoTodoEstadoDetalleAutoriConsep(Boolean isPermisoTodoEstadoDetalleAutoriConsep) {
		this.isPermisoTodoEstadoDetalleAutoriConsep = isPermisoTodoEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoNuevoEstadoDetalleAutoriConsep() {
		return isPermisoNuevoEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoNuevoEstadoDetalleAutoriConsep(Boolean isPermisoNuevoEstadoDetalleAutoriConsep) {
		this.isPermisoNuevoEstadoDetalleAutoriConsep = isPermisoNuevoEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoActualizarEstadoDetalleAutoriConsep() {
		return isPermisoActualizarEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoActualizarEstadoDetalleAutoriConsep(Boolean isPermisoActualizarEstadoDetalleAutoriConsep) {
		this.isPermisoActualizarEstadoDetalleAutoriConsep = isPermisoActualizarEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoEliminarEstadoDetalleAutoriConsep() {
		return isPermisoEliminarEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoEliminarEstadoDetalleAutoriConsep(Boolean isPermisoEliminarEstadoDetalleAutoriConsep) {
		this.isPermisoEliminarEstadoDetalleAutoriConsep = isPermisoEliminarEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoDetalleAutoriConsep() {
		return isPermisoGuardarCambiosEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoGuardarCambiosEstadoDetalleAutoriConsep(Boolean isPermisoGuardarCambiosEstadoDetalleAutoriConsep) {
		this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep = isPermisoGuardarCambiosEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoConsultaEstadoDetalleAutoriConsep() {
		return isPermisoConsultaEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoConsultaEstadoDetalleAutoriConsep(Boolean isPermisoConsultaEstadoDetalleAutoriConsep) {
		this.isPermisoConsultaEstadoDetalleAutoriConsep = isPermisoConsultaEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoBusquedaEstadoDetalleAutoriConsep() {
		return isPermisoBusquedaEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoBusquedaEstadoDetalleAutoriConsep(Boolean isPermisoBusquedaEstadoDetalleAutoriConsep) {
		this.isPermisoBusquedaEstadoDetalleAutoriConsep = isPermisoBusquedaEstadoDetalleAutoriConsep;
	}

	public Boolean getIsPermisoReporteEstadoDetalleAutoriConsep() {
		return isPermisoReporteEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoReporteEstadoDetalleAutoriConsep(Boolean isPermisoReporteEstadoDetalleAutoriConsep) {
		this.isPermisoReporteEstadoDetalleAutoriConsep = isPermisoReporteEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoDetalleAutoriConsep() {
		return isPermisoPaginacionMedioEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionMedioEstadoDetalleAutoriConsep(Boolean isPermisoPaginacionMedioEstadoDetalleAutoriConsep) {
		this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep = isPermisoPaginacionMedioEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoDetalleAutoriConsep() {
		return isPermisoPaginacionTodoEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionTodoEstadoDetalleAutoriConsep(Boolean isPermisoPaginacionTodoEstadoDetalleAutoriConsep) {
		this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep = isPermisoPaginacionTodoEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoDetalleAutoriConsep() {
		return isPermisoPaginacionAltoEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoPaginacionAltoEstadoDetalleAutoriConsep(Boolean isPermisoPaginacionAltoEstadoDetalleAutoriConsep) {
		this.isPermisoPaginacionAltoEstadoDetalleAutoriConsep = isPermisoPaginacionAltoEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoCopiarEstadoDetalleAutoriConsep() {
		return isPermisoCopiarEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoCopiarEstadoDetalleAutoriConsep(Boolean isPermisoCopiarEstadoDetalleAutoriConsep) {
		this.isPermisoCopiarEstadoDetalleAutoriConsep = isPermisoCopiarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoVerFormEstadoDetalleAutoriConsep() {
		return isPermisoVerFormEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoVerFormEstadoDetalleAutoriConsep(Boolean isPermisoVerFormEstadoDetalleAutoriConsep) {
		this.isPermisoVerFormEstadoDetalleAutoriConsep = isPermisoVerFormEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoDuplicarEstadoDetalleAutoriConsep() {
		return isPermisoDuplicarEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoDuplicarEstadoDetalleAutoriConsep(Boolean isPermisoDuplicarEstadoDetalleAutoriConsep) {
		this.isPermisoDuplicarEstadoDetalleAutoriConsep = isPermisoDuplicarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsPermisoOrdenEstadoDetalleAutoriConsep() {
		return isPermisoOrdenEstadoDetalleAutoriConsep;
	}

	public void setIsPermisoOrdenEstadoDetalleAutoriConsep(Boolean isPermisoOrdenEstadoDetalleAutoriConsep) {
		this.isPermisoOrdenEstadoDetalleAutoriConsep = isPermisoOrdenEstadoDetalleAutoriConsep;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep = isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep = isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaCopiarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep = isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaVerFormEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep = isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaOrdenEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep = isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep = isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaModificarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaModificarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaModificarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep = isVisibilidadCeldaModificarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaActualizarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep = isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaEliminarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep = isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaCancelarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep = isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep = isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep() {
		return isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep(Boolean isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep) {
		this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep = isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep;
	}
		
	public EstadoDetalleAutoriConsepSessionBean getestadodetalleautoriconsepSessionBean() {
		return this.estadodetalleautoriconsepSessionBean;
	}
	
	public void setestadodetalleautoriconsepSessionBean(EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean) {
		this.estadodetalleautoriconsepSessionBean=estadodetalleautoriconsepSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoDetalleAutoriConsep estadodetalleautoriconsep,EstadoDetalleAutoriConsep estadodetalleautoriconsepAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoDetalleAutoriConsep(estadodetalleautoriconsep);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadodetalleautoriconsepAux.setId(estadodetalleautoriconsep.getId());
		estadodetalleautoriconsepAux.setVersionRow(estadodetalleautoriconsep.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoDetalleAutoriConsep();
		
			int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadodetalleautoriconsepValidator.getInvalidValues(this.estadodetalleautoriconsep);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadodetalleautoriconsepLogic.setDatosCliente(datosCliente);
			estadodetalleautoriconsepLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadodetalleautoriconsepAux=new  EstadoDetalleAutoriConsep();
				
				estadodetalleautoriconsepAux.setIsNew(true);
				estadodetalleautoriconsepAux.setIsChanged(true);
				
				estadodetalleautoriconsepAux.setEstadoDetalleAutoriConsepOriginal(this.estadodetalleautoriconsep);
				
				estadodetalleautoriconsepAux.setId(this.estadodetalleautoriconsep.getId());	
				estadodetalleautoriconsepAux.setVersionRow(this.estadodetalleautoriconsep.getVersionRow());	
				estadodetalleautoriconsepAux.setcodigo(this.estadodetalleautoriconsep.getcodigo());	
				estadodetalleautoriconsepAux.setnombre(this.estadodetalleautoriconsep.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleautoriconsepLogic.saveEstadoDetalleAutoriConseps();//WithConnection
						//estadodetalleautoriconsepLogic.getSetVersionRowEstadoDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleautoriconsep,estadodetalleautoriconsepAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadodetalleautoriconsepAux=new  EstadoDetalleAutoriConsep();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() 
					|| (this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() && this.estadodetalleautoriconsep.getId()>=0)) {
						
					estadodetalleautoriconsepAux.setIsNew(false);
				}
				
				estadodetalleautoriconsepAux.setIsDeleted(false);
			
				estadodetalleautoriconsepAux.setId(this.estadodetalleautoriconsep.getId());	
				estadodetalleautoriconsepAux.setVersionRow(this.estadodetalleautoriconsep.getVersionRow());	
				estadodetalleautoriconsepAux.setcodigo(this.estadodetalleautoriconsep.getcodigo());	
				estadodetalleautoriconsepAux.setnombre(this.estadodetalleautoriconsep.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconseps);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleautoriconsepLogic.saveEstadoDetalleAutoriConseps();//WithConnection
						//estadodetalleautoriconsepLogic.getSetVersionRowEstadoDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadodetalleautoriconsep,estadodetalleautoriconsepAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadodetalleautoriconsepAux=new  EstadoDetalleAutoriConsep();
				
				estadodetalleautoriconsepAux.setIsNew(false);
				estadodetalleautoriconsepAux.setIsChanged(false);
				
				estadodetalleautoriconsepAux.setIsDeleted(true);
				
				estadodetalleautoriconsepAux.setId(this.estadodetalleautoriconsep.getId());	
				estadodetalleautoriconsepAux.setVersionRow(this.estadodetalleautoriconsep.getVersionRow());	
				estadodetalleautoriconsepAux.setcodigo(this.estadodetalleautoriconsep.getcodigo());	
				estadodetalleautoriconsepAux.setnombre(this.estadodetalleautoriconsep.getnombre());	
				
				if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadodetalleautoriconsepAux.getId()>=0) {	
						this.estadodetalleautoriconsepsEliminados.add(estadodetalleautoriconsepAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconseps);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleautoriconsepLogic.saveEstadoDetalleAutoriConseps();//WithConnection
						//estadodetalleautoriconsepLogic.getSetVersionRowEstadoDetalleAutoriConseps();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadodetalleautoriconsepAux,estadodetalleautoriconseps);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().addAll(this.estadodetalleautoriconsepsEliminados);
					
					estadodetalleautoriconsepLogic.saveEstadoDetalleAutoriConseps();//WithConnection
					//estadodetalleautoriconsepLogic.getSetVersionRowEstadoDetalleAutoriConseps();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadodetalleautoriconsepsEliminados= new ArrayList<EstadoDetalleAutoriConsep>();		
			}
			
			if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Detalle Autorizacion Consep GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadodetalleautoriconsep=estadodetalleautoriconsepAux;
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
      		//this.finishProcessEstadoDetalleAutoriConsep();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal) throws Exception {
		
		if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal) throws Exception {	
		if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoDetalleAutoriConsepActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadodetalleautoriconsepValidator.getInvalidValues(this.estadodetalleautoriconsep);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoDetalleAutoriConsep estadodetalleautoriconsep,List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps) throws Exception {
		try	{		
			EstadoDetalleAutoriConsepConstantesFunciones.actualizarLista(estadodetalleautoriconsep,estadodetalleautoriconseps,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoDetalleAutoriConsep estadodetalleautoriconsep,List<EstadoDetalleAutoriConsep> estadodetalleautoriconseps) throws Exception {
		try	{			
			EstadoDetalleAutoriConsepConstantesFunciones.actualizarSelectedLista(estadodetalleautoriconsep,estadodetalleautoriconseps);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadodetalleautoriconsepsLocal=this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadodetalleautoriconsepsLocal=this.estadodetalleautoriconseps;
			}
			//ARCHITECTURE
		
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal:estadodetalleautoriconsepsLocal) {
				if(this.permiteMantenimiento(estadodetalleautoriconsepLocal) && estadodetalleautoriconsepLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoDetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoDetalleAutoriConsepConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelcodigoEstadoDetalleAutoriConsep,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoDetalleAutoriConsepConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelnombreEstadoDetalleAutoriConsep,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelcodigoEstadoDetalleAutoriConsep,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelnombreEstadoDetalleAutoriConsep,"");
		
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
		this.iIdNuevoEstadoDetalleAutoriConsep--;	
		
		
		this.estadodetalleautoriconsepAux=new EstadoDetalleAutoriConsep();
		
		this.estadodetalleautoriconsepAux.setId(this.iIdNuevoEstadoDetalleAutoriConsep);
		this.estadodetalleautoriconsepAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().add(this.estadodetalleautoriconsepAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadodetalleautoriconseps.add(this.estadodetalleautoriconsepAux);
		}
		//ARCHITECTURE
		
		this.estadodetalleautoriconsep=this.estadodetalleautoriconsepAux;
		
		if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
		}
				
		//this.setDefaultControlesEstadoDetalleAutoriConsep();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleAutoriConsep();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepBean,this.estadodetalleautoriconsep,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			classes=EstadoDetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfEstadoDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadodetalleautoriconsepReturnGeneral=estadodetalleautoriconsepLogic.procesarEventosEstadoDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),this.estadodetalleautoriconsep,this.estadodetalleautoriconsepParameterGeneral,this.isEsNuevoEstadoDetalleAutoriConsep,classes);//this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral,this.estadodetalleautoriconsepBean,false);
		
		if(this.estadodetalleautoriconsepReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep());
		}
		
		if(this.estadodetalleautoriconsepReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep(),classes);//this.estadodetalleautoriconsepBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoDetalleAutoriConsep();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoDetalleAutoriConsep();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
						
			if(estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();
			}
			
			this.actualizarVisualTableDatosEstadoDetalleAutoriConsep();
			
			this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleAutoriConsep(), this.getIndiceNuevoEstadoDetalleAutoriConsep());
			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
						
			this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setEnabled(isHabilitar && this.estadodetalleautoriconsepConstantesFunciones.activarcodigoEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setEnabled(isHabilitar && this.estadodetalleautoriconsepConstantesFunciones.activarnombreEstadoDetalleAutoriConsep);	
		
	};
	
	public void setDefaultControlesEstadoDetalleAutoriConsep() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoDetalleAutoriConsep(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(true);			
			this.estadodetalleautoriconsepSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setVisible(true);
			
					
		} else {
			//this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(false);			
			this.estadodetalleautoriconsepSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoDetalleAutoriConsep() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				if(estadodetalleautoriconsepAux.getId().equals(this.iIdNuevoEstadoDetalleAutoriConsep)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconseps) {
				if(estadodetalleautoriconsepAux.getId().equals(this.iIdNuevoEstadoDetalleAutoriConsep)) {
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
	
	public int getIndiceActualEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				if(estadodetalleautoriconsepAux.getId().equals(estadodetalleautoriconsep.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconseps) {
				if(estadodetalleautoriconsepAux.getId().equals(estadodetalleautoriconsep.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsepOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				if(estadodetalleautoriconsepAux.getEstadoDetalleAutoriConsepOriginal().getId().equals(estadodetalleautoriconsepOriginal.getId())) {
					existe=true;
					estadodetalleautoriconsepOriginal.setId(estadodetalleautoriconsepAux.getId());
					estadodetalleautoriconsepOriginal.setVersionRow(estadodetalleautoriconsepAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconseps) {
				if(estadodetalleautoriconsepAux.getEstadoDetalleAutoriConsepOriginal().getId().equals(estadodetalleautoriconsepOriginal.getId())) {
					existe=true;
					estadodetalleautoriconsepOriginal.setId(estadodetalleautoriconsepAux.getId());
					estadodetalleautoriconsepOriginal.setVersionRow(estadodetalleautoriconsepAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoDetalleAutoriConsep(Boolean esParaCancelar) throws Exception {
		estadodetalleautoriconsepsAux=new ArrayList<EstadoDetalleAutoriConsep>();
		estadodetalleautoriconsepAux=new EstadoDetalleAutoriConsep();
		
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
					if(estadodetalleautoriconsepAux.getId()<0) {
						estadodetalleautoriconsepsAux.add(estadodetalleautoriconsepAux);
					}		
				}
				this.iIdNuevoEstadoDetalleAutoriConsep=0L;
				this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().removeAll(estadodetalleautoriconsepsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconseps) {
					if(estadodetalleautoriconsepAux.getId()<0) {
						estadodetalleautoriconsepsAux.add(estadodetalleautoriconsepAux);
					}		
				}
				this.iIdNuevoEstadoDetalleAutoriConsep=0L;
				this.estadodetalleautoriconseps.removeAll(estadodetalleautoriconsepsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleAutoriConsep 
					&& this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size()>0
					) {
					estadodetalleautoriconsepAux=this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().get(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size() - 1);
				
					if(estadodetalleautoriconsepAux.getId()<0) {
						this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().remove(estadodetalleautoriconsepAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoDetalleAutoriConsep && this.estadodetalleautoriconseps.size()>0) {
					estadodetalleautoriconsepAux=this.estadodetalleautoriconseps.get(this.estadodetalleautoriconseps.size() - 1);
				
					if(estadodetalleautoriconsepAux.getId()<0) {
						this.estadodetalleautoriconseps.remove(estadodetalleautoriconsepAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoDetalleAutoriConsep(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadodetalleautoriconsep.getId()<0) {
				this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().remove(this.estadodetalleautoriconsep);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadodetalleautoriconsep.getId()<0) {
				this.estadodetalleautoriconseps.remove(this.estadodetalleautoriconsep);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoDetalleAutoriConsep(List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsAux) throws Exception {
		EstadoDetalleAutoriConsepConstantesFunciones.setEstadosInicialesEstadoDetalleAutoriConsep(estadodetalleautoriconsepsAux);
	}
	
	public void setEstadosInicialesEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux) throws Exception {
		EstadoDetalleAutoriConsepConstantesFunciones.setEstadosInicialesEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoDetalleAutoriConsepActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoDetalleAutoriConsepActual()) {
				if(!this.isEsNuevoEstadoDetalleAutoriConsep) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoDetalleAutoriConsep=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoDetalleAutoriConsepActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Detalle Autorizacion Consep ?", "MANTENIMIENTO DE Estado Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoDetalleAutoriConsep estadodetalleautoriconsep) throws Exception {
		EstadoDetalleAutoriConsepConstantesFunciones.seleccionarAsignar(this.estadodetalleautoriconsep,estadodetalleautoriconsep);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoDetalleAutoriConsep=this.isPermisoActualizarOriginalEstadoDetalleAutoriConsep;
			
			
			this.seleccionarAsignar(estadodetalleautoriconsep);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoDetalleAutoriConsepConstantesFunciones.quitarEspaciosEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadodetalleautoriconsepSessionBean.setsFuncionBusquedaRapida(this.estadodetalleautoriconsepSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoDetalleAutoriConsep) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoDetalleAutoriConsep(esParaCancelar);				
				this.cancelarNuevoEstadoDetalleAutoriConsep(esParaCancelar);								
			}
			
			this.estadodetalleautoriconsep=new EstadoDetalleAutoriConsep();
			
			this.inicializarEstadoDetalleAutoriConsep();
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoDetalleAutoriConsep() throws Exception {
		try {
			EstadoDetalleAutoriConsepConstantesFunciones.inicializarEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoDetalleAutoriConseps(String sAccionBusqueda,List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoDetalleAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoDetalleAutoriConsepMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoDetalleAutoriConsepMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoDetalleAutoriConsep"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Detalle Autorizacion Consepes");		
		parameters.put("busquedapor", EstadoDetalleAutoriConsepConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoDetalleAutoriConsep=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoDetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoDetalleAutoriConsepConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoDetalleAutoriConsep=new JRBeanArrayDataSource(EstadoDetalleAutoriConsepJInternalFrame.TraerEstadoDetalleAutoriConsepBeans(estadodetalleautoriconsepsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoDetalleAutoriConsep);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoDetalleAutoriConsepConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoDetalleAutoriConsepBean.TraerEstadoDetalleAutoriConsepBeans(estadodetalleautoriconsepsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(null);
					//this.generarExcelReporteEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoDetalleAutoriConseps(sAccionBusqueda,sTipoArchivoReporte,estadodetalleautoriconsepsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleAutoriConseps");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleAutoriConsep("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoDetalleAutoriConsep estadodetalleautoriconsep : estadodetalleautoriconsepsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoDetalleAutoriConsepConstantesFunciones.generarExcelReporteDataEstadoDetalleAutoriConsep("NORMAL",row,workbook,estadodetalleautoriconsep,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoDetalleAutoriConsep(String sTipo,Row row,Workbook workbook) {
		
		EstadoDetalleAutoriConsepConstantesFunciones.generarExcelReporteHeaderEstadoDetalleAutoriConsep(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoDetalleAutoriConsep estadodetalleautoriconsep : estadodetalleautoriconsepsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsep));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleautoriconsep.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadodetalleautoriconsep.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoDetalleAutoriConseps(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsRespaldo=null;
		
		classes=EstadoDetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfEstadoDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadodetalleautoriconsepLogic.setDatosCliente(this.datosCliente);
		this.estadodetalleautoriconsepLogic.setDatosDeep(this.datosDeep);
		this.estadodetalleautoriconsepLogic.setIsConDeep(true);
		
		estadodetalleautoriconsepsRespaldo=this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps();
		
		this.estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(estadodetalleautoriconsepsParaReportes);	
		this.estadodetalleautoriconsepLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadodetalleautoriconsepsParaReportes=this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps();
		this.estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(estadodetalleautoriconsepsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoDetalleAutoriConseps");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoDetalleAutoriConsep("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoDetalleAutoriConsep estadodetalleautoriconsep : estadodetalleautoriconsepsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoDetalleAutoriConsep("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoDetalleAutoriConsepConstantesFunciones.generarExcelReporteDataEstadoDetalleAutoriConsep("NORMAL",row,workbook,estadodetalleautoriconsep,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.getEstadoDetalleAutoriConsepDescripcion(estadodetalleautoriconsep));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoDetalleAutoriConsep() throws Exception {		
		this.startProcessEstadoDetalleAutoriConsep(true);
	}
	
	public void startProcessEstadoDetalleAutoriConsep(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoDetalleAutoriConsep, this.jScrollPanelDatosEstadoDetalleAutoriConsep,this.jPanelPaginacionEstadoDetalleAutoriConsep, this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep, this.jPanelAccionesEstadoDetalleAutoriConsep,this.jPanelAccionesFormularioEstadoDetalleAutoriConsep,this.jmenuBarEstadoDetalleAutoriConsep,this.jmenuBarDetalleEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleAutoriConsep=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleAutoriConsep=this.jPanelParametrosReportesEstadoDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEstadoDetalleAutoriConsep=this.jScrollPanelDatosEstadoDetalleAutoriConsep;
		final JTable jTableDatosEstadoDetalleAutoriConsep=this.jTableDatosEstadoDetalleAutoriConsep;		
		final JPanel jPanelPaginacionEstadoDetalleAutoriConsep=this.jPanelPaginacionEstadoDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleAutoriConsep=this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep;
		final JPanel jPanelAccionesEstadoDetalleAutoriConsep=this.jPanelAccionesEstadoDetalleAutoriConsep;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleAutoriConsep=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			jPanelCamposAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelCamposEstadoDetalleAutoriConsep;
			jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelAccionesFormularioEstadoDetalleAutoriConsep;
		}
		
		final JPanel jPanelCamposEstadoDetalleAutoriConsep=jPanelCamposAuxiliarEstadoDetalleAutoriConsep;
		final JPanel jPanelAccionesFormularioEstadoDetalleAutoriConsep=jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep;
		
		
		final JMenuBar jmenuBarEstadoDetalleAutoriConsep=this.jmenuBarEstadoDetalleAutoriConsep;
		final JToolBar jTtoolBarEstadoDetalleAutoriConsep=this.jTtoolBarEstadoDetalleAutoriConsep;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jmenuBarDetalleEstadoDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTtoolBarDetalleEstadoDetalleAutoriConsep;
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleAutoriConsep=jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep;
		final JToolBar jTtoolBarDetalleEstadoDetalleAutoriConsep=jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleAutoriConsep;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoDetalleAutoriConsep ,jPanelParametrosReportesEstadoDetalleAutoriConsep,jTableDatosEstadoDetalleAutoriConsep, /*jScrollPanelDatosEstadoDetalleAutoriConsep,*/jPanelCamposEstadoDetalleAutoriConsep,jPanelPaginacionEstadoDetalleAutoriConsep, /*jScrollPanelDatosEdicionEstadoDetalleAutoriConsep,*/ jPanelAccionesEstadoDetalleAutoriConsep,jPanelAccionesFormularioEstadoDetalleAutoriConsep,jmenuBarEstadoDetalleAutoriConsep,jmenuBarDetalleEstadoDetalleAutoriConsep,jTtoolBarEstadoDetalleAutoriConsep,jTtoolBarDetalleEstadoDetalleAutoriConsep);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoDetalleAutoriConsep, jScrollPanelDatosEstadoDetalleAutoriConsep,jPanelPaginacionEstadoDetalleAutoriConsep, jScrollPanelDatosEdicionEstadoDetalleAutoriConsep, jPanelAccionesEstadoDetalleAutoriConsep,jPanelAccionesFormularioEstadoDetalleAutoriConsep,jmenuBarEstadoDetalleAutoriConsep,jmenuBarDetalleEstadoDetalleAutoriConsep,jTtoolBarEstadoDetalleAutoriConsep,jTtoolBarDetalleEstadoDetalleAutoriConsep);
						
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
	
	public void finishProcessEstadoDetalleAutoriConsep() {// throws Exception 
		this.finishProcessEstadoDetalleAutoriConsep(true);
	}
	
	public void finishProcessEstadoDetalleAutoriConsep(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoDetalleAutoriConsep, this.jScrollPanelDatosEstadoDetalleAutoriConsep,this.jPanelPaginacionEstadoDetalleAutoriConsep, this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep, this.jPanelAccionesEstadoDetalleAutoriConsep,this.jPanelAccionesFormularioEstadoDetalleAutoriConsep,this.jmenuBarEstadoDetalleAutoriConsep,this.jmenuBarDetalleEstadoDetalleAutoriConsep,this.jTtoolBarEstadoDetalleAutoriConsep,this.jTtoolBarDetalleEstadoDetalleAutoriConsep);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoDetalleAutoriConsep=null; 
		
		final JPanel jPanelParametrosReportesEstadoDetalleAutoriConsep=this.jPanelParametrosReportesEstadoDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEstadoDetalleAutoriConsep=this.jScrollPanelDatosEstadoDetalleAutoriConsep;
		final JTable jTableDatosEstadoDetalleAutoriConsep=this.jTableDatosEstadoDetalleAutoriConsep;		
		final JPanel jPanelPaginacionEstadoDetalleAutoriConsep=this.jPanelPaginacionEstadoDetalleAutoriConsep;
		//final JScrollPane jScrollPanelDatosEdicionEstadoDetalleAutoriConsep=this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep;
		final JPanel jPanelAccionesEstadoDetalleAutoriConsep=this.jPanelAccionesEstadoDetalleAutoriConsep;
		
		JPanel jPanelCamposAuxiliarEstadoDetalleAutoriConsep=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			jPanelCamposAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelCamposEstadoDetalleAutoriConsep;
			jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelAccionesFormularioEstadoDetalleAutoriConsep;
		}
		
		final JPanel jPanelCamposEstadoDetalleAutoriConsep=jPanelCamposAuxiliarEstadoDetalleAutoriConsep;
		final JPanel jPanelAccionesFormularioEstadoDetalleAutoriConsep=jPanelAccionesFormularioAuxiliarEstadoDetalleAutoriConsep;
		
		
		final JMenuBar jmenuBarEstadoDetalleAutoriConsep=this.jmenuBarEstadoDetalleAutoriConsep;		
		final JToolBar jTtoolBarEstadoDetalleAutoriConsep=this.jTtoolBarEstadoDetalleAutoriConsep;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jmenuBarDetalleEstadoDetalleAutoriConsep;
			jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTtoolBarDetalleEstadoDetalleAutoriConsep;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoDetalleAutoriConsep=jmenuBarDetalleAuxiliarEstadoDetalleAutoriConsep;
		final JToolBar jTtoolBarDetalleEstadoDetalleAutoriConsep=jTtoolBarDetalleAuxiliarEstadoDetalleAutoriConsep;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoDetalleAutoriConsep;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoDetalleAutoriConsep;
			processRunnable.jTableDatos=jTableDatosEstadoDetalleAutoriConsep;
			processRunnable.jPanelCampos=jPanelCamposEstadoDetalleAutoriConsep;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoDetalleAutoriConsep;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoDetalleAutoriConsep;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoDetalleAutoriConsep;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoDetalleAutoriConsep;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoDetalleAutoriConsep;
			processRunnable.jTtoolBar=jTtoolBarEstadoDetalleAutoriConsep;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoDetalleAutoriConsep;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoDetalleAutoriConsep ,jPanelParametrosReportesEstadoDetalleAutoriConsep, jTableDatosEstadoDetalleAutoriConsep,/*jScrollPanelDatosEstadoDetalleAutoriConsep,*/jPanelCamposEstadoDetalleAutoriConsep,jPanelPaginacionEstadoDetalleAutoriConsep, /*jScrollPanelDatosEdicionEstadoDetalleAutoriConsep,*/ jPanelAccionesEstadoDetalleAutoriConsep,jPanelAccionesFormularioEstadoDetalleAutoriConsep,jmenuBarEstadoDetalleAutoriConsep,jmenuBarDetalleEstadoDetalleAutoriConsep,jTtoolBarEstadoDetalleAutoriConsep,jTtoolBarDetalleEstadoDetalleAutoriConsep));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoDetalleAutoriConsep(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoDetalleAutoriConsep(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoDetalleAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoDetalleAutoriConsep(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoDetalleAutoriConsep,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoDetalleAutoriConsep,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadodetalleautoriconsepConstantesFunciones.getsFinalQueryEstadoDetalleAutoriConsep();
		String  finalQueryPaginacionTodos=this.estadodetalleautoriconsepConstantesFunciones.getsFinalQueryEstadoDetalleAutoriConsep();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoDetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesNoEstadoDetalleAutoriConsep(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoDetalleAutoriConsepConstantesFunciones.getArrayColumnasGlobalesEstadoDetalleAutoriConsep(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoDetalleAutoriConsepConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadodetalleautoriconsepsEliminados= new ArrayList<EstadoDetalleAutoriConsep>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoDetalleAutoriConsep();
		
				///*EstadoDetalleAutoriConsepSessionBean*/this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
			
			if(this.estadodetalleautoriconsepSessionBean==null) {
				this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
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
					this.iNumeroPaginacion=EstadoDetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoDetalleAutoriConsepConstantesFunciones.getClassesForeignKeysOfEstadoDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadodetalleautoriconsep."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadodetalleautoriconsepsAux= new ArrayList<EstadoDetalleAutoriConsep>();
			
				
			estadodetalleautoriconsepLogic.setDatosCliente(this.datosCliente);
			estadodetalleautoriconsepLogic.setDatosDeep(this.datosDeep);
			estadodetalleautoriconsepLogic.setIsConDeep(true);
			
			
			estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsepDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadodetalleautoriconsepLogic.getTodosEstadoDetalleAutoriConseps(finalQueryGlobal,pagination);
					
					//estadodetalleautoriconsepLogic.getTodosEstadoDetalleAutoriConsepsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()==null|| estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleautoriconsepsAux= new ArrayList<EstadoDetalleAutoriConsep>();
							estadodetalleautoriconsepsAux.addAll(estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleautoriconsepsAux= new ArrayList<EstadoDetalleAutoriConsep>();
							estadodetalleautoriconsepsAux.addAll(estadodetalleautoriconseps);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleautoriconsepLogic.getTodosEstadoDetalleAutoriConseps(finalQueryGlobal+"",this.pagination);												
							
							//estadodetalleautoriconsepLogic.getTodosEstadoDetalleAutoriConsepsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(new ArrayList<EstadoDetalleAutoriConsep>());					
							estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().addAll(estadodetalleautoriconsepsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleautoriconseps=new ArrayList<EstadoDetalleAutoriConsep>();
							estadodetalleautoriconseps.addAll(estadodetalleautoriconsepsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoDetalleAutoriConsep=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoDetalleAutoriConsep=this.idActual;
				
				} else if(this.idEstadoDetalleAutoriConsepActual!=null && this.idEstadoDetalleAutoriConsepActual!=0L) {
					idEstadoDetalleAutoriConsep=idEstadoDetalleAutoriConsepActual;
				}
				
					
				this.sDetalleReporte=EstadoDetalleAutoriConsepConstantesFunciones.getDetalleIndicePorId(idEstadoDetalleAutoriConsep);
				
				this.estadodetalleautoriconseps=new ArrayList<EstadoDetalleAutoriConsep>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadodetalleautoriconsepLogic.getEntity(idEstadoDetalleAutoriConsep);
					
					//estadodetalleautoriconsepLogic.getEntityWithConnection(idEstadoDetalleAutoriConsep);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(new ArrayList<EstadoDetalleAutoriConsep>());
					estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().add(estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleautoriconseps=new ArrayList<EstadoDetalleAutoriConsep>();
					this.estadodetalleautoriconseps.add(estadodetalleautoriconsep);
				}
				
				if(estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoDetalleAutoriConsep();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoDetalleAutoriConsep();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleautoriconseps.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadodetalleautoriconseps.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoDetalleAutoriConsep estadodetalleautoriconsep) {
		Boolean permite=true;
		
		if(this.estadodetalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoDetalleAutoriConsepConstantesFunciones.getOrderByListaEstadoDetalleAutoriConsep();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoDetalleAutoriConsepConstantesFunciones.getOrderByListaEstadoDetalleAutoriConsep();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				if(estadodetalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleautoriconsepTotales=estadodetalleautoriconsep;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:this.estadodetalleautoriconseps) {
				if(estadodetalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleautoriconsepTotales=estadodetalleautoriconsep;
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
			this.estadodetalleautoriconsepAux=new EstadoDetalleAutoriConsep();
			this.estadodetalleautoriconsepAux.setsType(Constantes2.S_TOTALES);
			this.estadodetalleautoriconsepAux.setIsNew(false);
			this.estadodetalleautoriconsepAux.setIsChanged(false);
			this.estadodetalleautoriconsepAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoDetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),this.estadodetalleautoriconsepAux);
				
				this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().add(this.estadodetalleautoriconsepAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoDetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaEstadoDetalleAutoriConsep(this.estadodetalleautoriconseps,this.estadodetalleautoriconsepAux);
				
				this.estadodetalleautoriconseps.add(this.estadodetalleautoriconsepAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadodetalleautoriconsepTotales=new EstadoDetalleAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().remove(estadodetalleautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadodetalleautoriconseps.remove(estadodetalleautoriconsepTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadodetalleautoriconsepTotales=new EstadoDetalleAutoriConsep();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				if(estadodetalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleautoriconsepTotales=estadodetalleautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),estadodetalleautoriconsepTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:this.estadodetalleautoriconseps) {
				if(estadodetalleautoriconsep.getsType().equals(Constantes2.S_TOTALES)) {
					estadodetalleautoriconsepTotales=estadodetalleautoriconsep;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoDetalleAutoriConsepConstantesFunciones.TotalizarValoresFilaEstadoDetalleAutoriConsep(this.estadodetalleautoriconseps,estadodetalleautoriconsepTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoDetalleAutoriConsep() {
		this.isPermisoTodoEstadoDetalleAutoriConsep=false;
		this.isPermisoNuevoEstadoDetalleAutoriConsep=false;
		this.isPermisoActualizarEstadoDetalleAutoriConsep=false;
		this.isPermisoActualizarOriginalEstadoDetalleAutoriConsep=false;
		this.isPermisoEliminarEstadoDetalleAutoriConsep=false;
		this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep=false;
		this.isPermisoConsultaEstadoDetalleAutoriConsep=false;
		this.isPermisoBusquedaEstadoDetalleAutoriConsep=false;
		this.isPermisoReporteEstadoDetalleAutoriConsep=false;		
		this.isPermisoOrdenEstadoDetalleAutoriConsep=false;		
		this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep=false;		
		this.isPermisoPaginacionAltoEstadoDetalleAutoriConsep=false;
		this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep=false;
		this.isPermisoCopiarEstadoDetalleAutoriConsep=false;		
		this.isPermisoVerFormEstadoDetalleAutoriConsep=false;		
		this.isPermisoDuplicarEstadoDetalleAutoriConsep=false;		
		this.isPermisoOrdenEstadoDetalleAutoriConsep=false;		
	}
	
	public void setPermisosUsuarioEstadoDetalleAutoriConsep(Boolean isPermiso) {
		this.isPermisoTodoEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoNuevoEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoEliminarEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoConsultaEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoBusquedaEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoReporteEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoOrdenEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionAltoEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoCopiarEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoVerFormEstadoDetalleAutoriConsep=isPermiso;		
		this.isPermisoDuplicarEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoOrdenEstadoDetalleAutoriConsep=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoDetalleAutoriConsep(Boolean isPermiso) {
		//this.isPermisoTodoEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoNuevoEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoActualizarOriginalEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoEliminarEstadoDetalleAutoriConsep=isPermiso;
		this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep=isPermiso;
		//this.isPermisoConsultaEstadoDetalleAutoriConsep=isPermiso;
		//this.isPermisoBusquedaEstadoDetalleAutoriConsep=isPermiso;
		//this.isPermisoReporteEstadoDetalleAutoriConsep=isPermiso;
		//this.isPermisoOrdenEstadoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoCopiarEstadoDetalleAutoriConsep=isPermiso;		
		//this.isPermisoDuplicarEstadoDetalleAutoriConsep=isPermiso;
		//this.isPermisoOrdenEstadoDetalleAutoriConsep=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleAutoriConsepClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoDetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoDetalleAutoriConsep(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoDetalleAutoriConsepClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoDetalleAutoriConsepClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoDetalleAutoriConsepClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoDetalleAutoriConsepClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoDetalleAutoriConsep() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoDetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoDetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoDetalleAutoriConsep=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoDetalleAutoriConsep=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoDetalleAutoriConsep=this.isPermisoActualizarEstadoDetalleAutoriConsep;
			this.isPermisoEliminarEstadoDetalleAutoriConsep=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoDetalleAutoriConsep=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoDetalleAutoriConsep=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoDetalleAutoriConsep=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoDetalleAutoriConsep=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoDetalleAutoriConsep=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoDetalleAutoriConsep=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoDetalleAutoriConsep=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoDetalleAutoriConsep=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoDetalleAutoriConsep.setToolTipText(this.jTableDatosEstadoDetalleAutoriConsep.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoDetalleAutoriConsep(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoDetalleAutoriConsep(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoDetalleAutoriConsep() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoDetalleAutoriConsepListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoDetalleAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoDetalleAutoriConsepJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoDetalleAutoriConsepListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoDetalleAutoriConsepListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoDetalleAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoDetalleAutoriConsep()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoDetalleAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleAutoriConsep();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoDetalleAutoriConsep()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoDetalleAutoriConsep()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoDetalleAutoriConsep()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoDetalleAutoriConsep(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoDetalleAutoriConsep()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean(); 
		this.estadodetalleautoriconsepConstantesFunciones=new EstadoDetalleAutoriConsepConstantesFunciones(); 
		this.estadodetalleautoriconsepBean=new EstadoDetalleAutoriConsep();//(this.estadodetalleautoriconsepConstantesFunciones); 		
		this.estadodetalleautoriconsepReturnGeneral=new EstadoDetalleAutoriConsepParameterReturnGeneral(); 
		
		this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadodetalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoDetalleAutoriConsepBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoDetalleAutoriConsep(true);
			
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
			
			this.estadodetalleautoriconsepConstantesFunciones=new EstadoDetalleAutoriConsepConstantesFunciones(); 
			this.estadodetalleautoriconsepBean=new EstadoDetalleAutoriConsep();//this.estadodetalleautoriconsepConstantesFunciones); 			
			this.estadodetalleautoriconsepReturnGeneral=new EstadoDetalleAutoriConsepParameterReturnGeneral(); 
		
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Detalle Autorizacion Consep Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadodetalleautoriconsep=new EstadoDetalleAutoriConsep();
			this.estadodetalleautoriconseps = new ArrayList<EstadoDetalleAutoriConsep>();
			this.estadodetalleautoriconsepsAux = new ArrayList<EstadoDetalleAutoriConsep>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic=new EstadoDetalleAutoriConsepLogic();
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.estadodetalleautoriconsepSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadodetalleautoriconsepSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep);	
					}
					
					if(this.jInternalFrameImportacionEstadoDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleAutoriConsep);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoDetalleAutoriConsep);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep);
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep);
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleAutoriConsep);
					this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleAutoriConsep);
					this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setVisible(false);
					this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoDetalleAutoriConsepActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoDetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadodetalleautoriconsepReturnGeneral=new EstadoDetalleAutoriConsepParameterReturnGeneral();
			
			this.estadodetalleautoriconsepParameterGeneral=new EstadoDetalleAutoriConsepParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadodetalleautoriconsepLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoDetalleAutoriConsepConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoDetalleAutoriConsep();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoDetalleAutoriConsep(false);
			
			this.setPermisosUsuarioEstadoDetalleAutoriConsep();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() 
				|| (this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado() && this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoDetalleAutoriConsepClasesRelacionadas();
			}
			
			if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoDetalleAutoriConsepClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoDetalleAutoriConsep();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleAutoriConsep();
			}
			
			if(!this.isPermisoBusquedaEstadoDetalleAutoriConsep) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep,this.isPermisoPaginacionMedioEstadoDetalleAutoriConsep,this.isPermisoPaginacionTodoEstadoDetalleAutoriConsep);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoDetalleAutoriConsepConstantesFunciones.getTiposSeleccionarEstadoDetalleAutoriConsep());
				
				this.tiposColumnasSelect=EstadoDetalleAutoriConsepConstantesFunciones.getTiposSeleccionarEstadoDetalleAutoriConsep(true);
				
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
			//if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoDetalleAutoriConsep();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoDetalleAutoriConsep(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoDetalleAutoriConsep(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleAutoriConsep() ;
			
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
				estadodetalleautoriconsepImplementable= (EstadoDetalleAutoriConsepImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadodetalleautoriconsepImplementableHome= (EstadoDetalleAutoriConsepImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoDetalleAutoriConsepConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadodetalleautoriconseps= new ArrayList<EstadoDetalleAutoriConsep>();
			this.estadodetalleautoriconsepsEliminados= new ArrayList<EstadoDetalleAutoriConsep>();
						
			this.isEsNuevoEstadoDetalleAutoriConsep=false;
			this.esParaAccionDesdeFormularioEstadoDetalleAutoriConsep=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoDetalleAutoriConsep(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoDetalleAutoriConsep();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoDetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoDetalleAutoriConsep();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoDetalleAutoriConsep();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoDetalleAutoriConsep(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoDetalleAutoriConsep: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoDetalleAutoriConsep() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoDetalleAutoriConsep")) {
				iIndex=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoDetalleAutoriConsep();	
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
	
	public void cargarCombosForeignKeyEstadoDetalleAutoriConsep(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoDetalleAutoriConsep(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoDetalleAutoriConsep(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoDetalleAutoriConsepListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoDetalleAutoriConsep();
		
		this.cargarCombosFrameForeignKeyEstadoDetalleAutoriConsep();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoDetalleAutoriConsep();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoDetalleAutoriConsep();
		}
	}
	
	
	
	public void jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			
			if(jTableDatosEstadoDetalleAutoriConsep.getRowCount()>=1) {
				jTableDatosEstadoDetalleAutoriConsep.removeRowSelectionInterval(0, jTableDatosEstadoDetalleAutoriConsep.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoDetalleAutoriConsep=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleAutoriConsep(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(true);			
			//this.estadodetalleautoriconsep=new EstadoDetalleAutoriConsep();
			//this.estadodetalleautoriconsep.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep() ;
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleAutoriConsep(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadodetalleautoriconsep);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);				
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoDetalleAutoriConsep: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRows().length;			
			}
			
			estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoDetalleAutoriConsep--;			
				//EstadoDetalleAutoriConsep estadodetalleautoriconsepAux= new EstadoDetalleAutoriConsep();			
				//estadodetalleautoriconsepAux.setId(this.iIdNuevoEstadoDetalleAutoriConsep);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoDetalleAutoriConsep estadodetalleautoriconsepOrigen=new EstadoDetalleAutoriConsep();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepOrigen : estadodetalleautoriconsepsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadodetalleautoriconsepOrigen =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadodetalleautoriconsepOrigen =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoDetalleAutoriConsep();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadodetalleautoriconsep.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoDetalleAutoriConsep(estadodetalleautoriconsepOrigen,this.estadodetalleautoriconsep,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().add(this.estadodetalleautoriconsepAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleautoriconseps.add(this.estadodetalleautoriconsepAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
				
				this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleAutoriConsep(), this.getIndiceNuevoEstadoDetalleAutoriConsep());
				
				int iLastRow =  this.jTableDatosEstadoDetalleAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();									
		
			EstadoDetalleAutoriConsep estadodetalleautoriconsepOrigen=new EstadoDetalleAutoriConsep();
			EstadoDetalleAutoriConsep estadodetalleautoriconsepDestino=new EstadoDetalleAutoriConsep();
				
			estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadodetalleautoriconsepsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleautoriconsepOrigen =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleautoriconsepOrigen =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadodetalleautoriconsepDestino =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadodetalleautoriconsepDestino =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadodetalleautoriconsepOrigen =estadodetalleautoriconsepsSeleccionados.get(0);
				estadodetalleautoriconsepDestino =estadodetalleautoriconsepsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoDetalleAutoriConsep(estadodetalleautoriconsepOrigen,estadodetalleautoriconsepDestino,true,false);
				
				estadodetalleautoriconsepDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadodetalleautoriconsepDestino,estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadodetalleautoriconsepDestino,estadodetalleautoriconseps);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
				
				//this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleAutoriConsep(), this.getIndiceNuevoEstadoDetalleAutoriConsep());
				
				int iLastRow =  this.jTableDatosEstadoDetalleAutoriConsep.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoDetalleAutoriConsep.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoDetalleAutoriConsep.isVisible();
			
			
			this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(!isVisible);
			this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(!isVisible);
			this.jPanelAccionesEstadoDetalleAutoriConsep.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoDetalleAutoriConsep();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoDetalleAutoriConsep();
			
			this.abrirFrameOrderByEstadoDetalleAutoriConsep();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoDetalleAutoriConsep();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoDetalleAutoriConsep(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleAutoriConsep);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSize(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.iWidthFormulario,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jContentPaneDetalleEstadoDetalleAutoriConsep.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jContentPaneDetalleEstadoDetalleAutoriConsep.getWidth(),EstadoDetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jContentPaneDetalleEstadoDetalleAutoriConsep.getWidth(),EstadoDetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jContentPaneDetalleEstadoDetalleAutoriConsep.getWidth(),EstadoDetalleAutoriConsepConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,false,this);
				} else {
					this.jInternalFrameOrderByEstadoDetalleAutoriConsep=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoDetalleAutoriConsep,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoDetalleAutoriConsep);
				this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setSelected(false);
				
				this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleAutoriConsep"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleAutoriConsep();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoDetalleAutoriConsep==null) {
				
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep=new ImportacionJInternalFrame(EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoDetalleAutoriConsep);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoDetalleAutoriConsep);
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSelected(false);


				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleAutoriConsep"));
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleAutoriConsep"));
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleAutoriConsep"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep==null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep=new ReporteDinamicoJInternalFrame(EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep);
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleAutoriConsep"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleAutoriConsep();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoDetalleAutoriConsep);
			
	       	this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.dispose();
			//this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoDetalleAutoriConsep() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoDetalleAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoDetalleAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setVisible(true);
	        this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoDetalleAutoriConsep() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameOrderByEstadoDetalleAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoDetalleAutoriConsep() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoDetalleAutoriConsep() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setVisible(false);
	        this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoDetalleAutoriConsep(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoDetalleAutoriConsep(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(true);
			//this.isEsNuevoEstadoDetalleAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false) ;
			
			if(estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleAutoriConsep(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoDetalleAutoriConsepActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoDetalleAutoriConsep(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(true);
			//this.isEsNuevoEstadoDetalleAutoriConsep=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadodetalleautoriconsep.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false) ;
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoDetalleAutoriConsep(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleAutoriConsep(false);
			
			//if(!this.isEsNuevoEstadoDetalleAutoriConsep) {								
				int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				
			}
			
			if(this.permiteMantenimiento(this.estadodetalleautoriconsep)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoDetalleAutoriConsep=true;
					this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
					this.isEsNuevoEstadoDetalleAutoriConsep=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoDetalleAutoriConsep=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoDetalleAutoriConsep=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(false);
			
												
				
				if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoDetalleAutoriConsep();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,estadodetalleautoriconsepSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadodetalleautoriconsepSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadodetalleautoriconsep.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleautoriconsep.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				this.estadodetalleautoriconsep.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadodetalleautoriconsep)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoDetalleAutoriConsepModel) this.jTableDatosEstadoDetalleAutoriConsep.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoDetalleAutoriConsep=true;
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
				this.isEsNuevoEstadoDetalleAutoriConsep=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(false);
				
				this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(false);
				
				
				
				if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoDetalleAutoriConsep();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoDetalleAutoriConsep.getRowCount()>=1) {
				jTableDatosEstadoDetalleAutoriConsep.removeRowSelectionInterval(0, jTableDatosEstadoDetalleAutoriConsep.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoDetalleAutoriConsep(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(false) ;
			
			this.isEsNuevoEstadoDetalleAutoriConsep=false;
			
			if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoDetalleAutoriConsep();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
				
				//SI ES MANUAL
				if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoDetalleAutoriConsep--;			
			//EstadoDetalleAutoriConsep estadodetalleautoriconsepAux= new EstadoDetalleAutoriConsep();			
			//estadodetalleautoriconsepAux.setId(this.iIdNuevoEstadoDetalleAutoriConsep);
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoDetalleAutoriConsep();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
			
			this.estadodetalleautoriconsep.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().add(this.estadodetalleautoriconsepAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadodetalleautoriconseps.add(this.estadodetalleautoriconsepAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			
			this.jTableDatosEstadoDetalleAutoriConsep.setRowSelectionInterval(this.getIndiceNuevoEstadoDetalleAutoriConsep(), this.getIndiceNuevoEstadoDetalleAutoriConsep());
			
			int iLastRow =  this.jTableDatosEstadoDetalleAutoriConsep.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoDetalleAutoriConsep.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoDetalleAutoriConsep.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();
			}
			
			//this.abrirFrameTreeEstadoDetalleAutoriConsep();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Detalle Autorizacion ConsepES ?", "MANTENIMIENTO DE Estado Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoDetalleAutoriConsep();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadodetalleautoriconsepReturnGeneral=estadodetalleautoriconsepLogic.procesarImportacionEstadoDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadodetalleautoriconsepParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoDetalleAutoriConsepReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setFileImportacion(this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoDetalleAutoriConsep.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		

		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoDetalleAutoriConsepBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoDetalleAutoriConsepBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoDetalleAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:estadodetalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleautoriconsep.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoDetalleAutoriConsep estadodetalleautoriconsep:estadodetalleautoriconsepsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadodetalleautoriconsep.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoDetalleAutoriConsep(row);				
			//	iRow++;
			//}				
			
			//for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
			
			//SI ES MANUAL
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoDetalleAutoriConsep();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoDetalleAutoriConsep() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoDetalleAutoriConsep.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoDetalleAutoriConsep.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoDetalleAutoriConsep.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoDetalleAutoriConsep.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoDetalleAutoriConsep.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoDetalleAutoriConsep.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoDetalleAutoriConsep.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoDetalleAutoriConsep(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoDetalleAutoriConsep(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoDetalleAutoriConsep(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleAutoriConsep(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoDetalleAutoriConsep(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoDetalleAutoriConsep() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep();
		
		this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleAutoriConsep();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleAutoriConsep() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleAutoriConsep(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleAutoriConsep(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoDetalleAutoriConsep.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionNuevoEstadoDetalleAutoriConsep.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionSinCerrarEstadoDetalleAutoriConsep.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jCheckBoxPostAccionSinMensajeEstadoDetalleAutoriConsep.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoDetalleAutoriConsep(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoDetalleAutoriConsep() throws Exception {
		try	{
			if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleAutoriConsep();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleAutoriConsep() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoDetalleAutoriConsep() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			
			if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoDetalleAutoriConsep.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleAutoriConsep();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoDetalleAutoriConsep() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoDetalleAutoriConsep()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoDetalleAutoriConsep(Boolean esInicializar) throws Exception {				
		if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoDetalleAutoriConsep();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoDetalleAutoriConsep() throws Exception {
		this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoDetalleAutoriConsep() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoDetalleAutoriConsepOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsepOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadodetalleautoriconseps.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoDetalleAutoriConsep.setModel(new EstadoDetalleAutoriConsepModel(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoDetalleAutoriConsep.setModel(new EstadoDetalleAutoriConsepModel(this.estadodetalleautoriconseps,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep!=null && this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoDetalleAutoriConsep();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,estadodetalleautoriconsepConstantesFunciones.resaltarSeleccionarEstadoDetalleAutoriConsep,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoDetalleAutoriConsepConstantesFunciones.SCLASSWEBTITULO,estadodetalleautoriconsepConstantesFunciones.resaltarSeleccionarEstadoDetalleAutoriConsep,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID));

		if(this.estadodetalleautoriconsepConstantesFunciones.mostraridEstadoDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltaridEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activaridEstadoDetalleAutoriConsep,this,true,"idEstadoDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltaridEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activaridEstadoDetalleAutoriConsep,this,true,"idEstadoDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO));

		if(this.estadodetalleautoriconsepConstantesFunciones.mostrarcodigoEstadoDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltarcodigoEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activarcodigoEstadoDetalleAutoriConsep,this,true,"codigoEstadoDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltarcodigoEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activarcodigoEstadoDetalleAutoriConsep,this,true,"codigoEstadoDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE));

		if(this.estadodetalleautoriconsepConstantesFunciones.mostrarnombreEstadoDetalleAutoriConsep && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltarnombreEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activarnombreEstadoDetalleAutoriConsep,this,true,"nombreEstadoDetalleAutoriConsep","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadodetalleautoriconsepConstantesFunciones.resaltarnombreEstadoDetalleAutoriConsep,this.estadodetalleautoriconsepConstantesFunciones.activarnombreEstadoDetalleAutoriConsep,this,true,"nombreEstadoDetalleAutoriConsep","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoDetalleAutoriConsepPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleAutoriConsep.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoDetalleAutoriConsep.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoDetalleAutoriConsep.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoDetalleAutoriConsep.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoDetalleAutoriConsep.moveColumn(this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoDetalleAutoriConsep.moveColumn(this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoDetalleAutoriConsep.moveColumn(this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoDetalleAutoriConsep.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoDetalleAutoriConsep.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoDetalleAutoriConsep,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoDetalleAutoriConsep.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoDetalleAutoriConsep.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoDetalleAutoriConsep.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadodetalleautoriconseps.size()-1;
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
		//this.jTableDatosEstadoDetalleAutoriConsep.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoDetalleAutoriConsep.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoDetalleAutoriConsep();
			
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
				
				//this.isEsNuevoEstadoDetalleAutoriConsep=false;
					
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
				if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadodetalleautoriconsep.getsType().equals("DUPLICADO")
				   || this.estadodetalleautoriconsep.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoDetalleAutoriConsep=true;
				
				} else {
					this.isEsNuevoEstadoDetalleAutoriConsep=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					if(this.estadodetalleautoriconsep.getId()>=0 && !this.estadodetalleautoriconsep.getIsNew()) {						
						this.isEsNuevoEstadoDetalleAutoriConsep=false;
						
					} else {
						this.isEsNuevoEstadoDetalleAutoriConsep=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoDetalleAutoriConsep(esRelaciones);						
				
				this.seleccionarEstadoDetalleAutoriConsep(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadodetalleautoriconsep.getId()<0) {
					this.isEsNuevoEstadoDetalleAutoriConsep=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoDetalleAutoriConsep(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoDetalleAutoriConsep(evt,rowIndex);
				}	
				
				if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoDetalleAutoriConsep: " + this.dDif); 
					}
				}								
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoDetalleAutoriConsep(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadodetalleautoriconsep)) {
					if(this.estadodetalleautoriconsep.getId()>0) {
						this.estadodetalleautoriconsep.setIsDeleted(true);
						
						this.estadodetalleautoriconsepsEliminados.add(this.estadodetalleautoriconsep);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().remove(this.estadodetalleautoriconsep);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadodetalleautoriconseps.remove(this.estadodetalleautoriconsep);				
					}
					
					
					((EstadoDetalleAutoriConsepModel) this.jTableDatosEstadoDetalleAutoriConsep.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoDetalleAutoriConsep(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoDetalleAutoriConsep) {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoDetalleAutoriConsep.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoDetalleAutoriConsep(estadodetalleautoriconsep,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(estadodetalleautoriconsep);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoDetalleAutoriConsep(estadodetalleautoriconsep,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleAutoriConsep(estadodetalleautoriconsep);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadodetalleautoriconsepLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadodetalleautoriconsepLocal=this.estadodetalleautoriconsep;
			} else {
				estadodetalleautoriconsepLocal=this.estadodetalleautoriconsepAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadodetalleautoriconsepLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoDetalleAutoriConsep(estadodetalleautoriconsepLocal,true);
					
					if(estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadodetalleautoriconsepLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadodetalleautoriconsepLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(estadodetalleautoriconsep,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(estadodetalleautoriconsep);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(estadodetalleautoriconsep,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.getText()==null || this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.getText()=="" || this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setText("0");
			}

			if(conColumnasBase) {estadodetalleautoriconsep.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelIdEstadoDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleautoriconsep.setcodigo(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelcodigoEstadoDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadodetalleautoriconsep.setnombre(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jLabelnombreEstadoDetalleAutoriConsep,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsepBean,EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsepOrigen,EstadoDetalleAutoriConsep estadodetalleautoriconsep,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleautoriconsepOrigen.getId()!=null && !estadodetalleautoriconsepOrigen.getId().equals(0L))) {estadodetalleautoriconsep.setId(estadodetalleautoriconsepOrigen.getId());}}
			if(conDefault || (!conDefault && estadodetalleautoriconsepOrigen.getcodigo()!=null && !estadodetalleautoriconsepOrigen.getcodigo().equals(""))) {estadodetalleautoriconsep.setcodigo(estadodetalleautoriconsepOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleautoriconsepOrigen.getnombre()!=null && !estadodetalleautoriconsepOrigen.getnombre().equals(""))) {estadodetalleautoriconsep.setnombre(estadodetalleautoriconsepOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsep.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsepBean estadodetalleautoriconsepBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsepBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsepBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setText(estadodetalleautoriconsepBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsepParameterReturnGeneral estadodetalleautoriconsepReturnGeneral,EstadoDetalleAutoriConsepBean estadodetalleautoriconsepBean,Boolean conDefault) throws Exception { 
		try {
			EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal=new EstadoDetalleAutoriConsep();
			
			estadodetalleautoriconsepLocal=estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadodetalleautoriconsepLocal.getId()!=null && !estadodetalleautoriconsepLocal.getId().equals(0L))) {estadodetalleautoriconsepBean.setId(estadodetalleautoriconsepLocal.getId());}}
			if(conDefault || (!conDefault && estadodetalleautoriconsepLocal.getcodigo()!=null && !estadodetalleautoriconsepLocal.getcodigo().equals(""))) {estadodetalleautoriconsepBean.setcodigo(estadodetalleautoriconsepLocal.getcodigo());}
			if(conDefault || (!conDefault && estadodetalleautoriconsepLocal.getnombre()!=null && !estadodetalleautoriconsepLocal.getnombre().equals(""))) {estadodetalleautoriconsepBean.setnombre(estadodetalleautoriconsepLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoDetalleAutoriConsepGenerico(Long idEstadoDetalleAutoriConsepSeleccionado,JComboBox jComboBoxEstadoDetalleAutoriConsep,List<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsLocal)throws Exception {
		try {
			EstadoDetalleAutoriConsep  estadodetalleautoriconsepTemp=null;

			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsLocal) {
				if(estadodetalleautoriconsepAux.getId()!=null && estadodetalleautoriconsepAux.getId().equals(idEstadoDetalleAutoriConsepSeleccionado)) {
					estadodetalleautoriconsepTemp=estadodetalleautoriconsepAux;
					break;
				}
			}

			jComboBoxEstadoDetalleAutoriConsep.setSelectedItem(estadodetalleautoriconsepTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoDetalleAutoriConsepGenerico(JComboBox jComboBoxEstadoDetalleAutoriConsep,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleAutoriConsep.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoDetalleAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoDetalleAutoriConsep.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoDetalleAutoriConsep.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoDetalleAutoriConsep.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoDetalleAutoriConsep.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleautoriconsep=(EstadoDetalleAutoriConsep) estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) estadodetalleautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoDetalleAutoriConsep estadodetalleautoriconsepRow=new EstadoDetalleAutoriConsep();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleautoriconsepRow=(EstadoDetalleAutoriConsep) estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadodetalleautoriconsepRow=(EstadoDetalleAutoriConsep) estadodetalleautoriconseps.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));			
			this.jButtonDuplicarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep && this.isPermisoDuplicarEstadoDetalleAutoriConsep));			
			this.jButtonCopiarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep && this.isPermisoCopiarEstadoDetalleAutoriConsep));
			this.jButtonVerFormEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep && this.isPermisoVerFormEstadoDetalleAutoriConsep));
			
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));			
			
			this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));			
			this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep && this.isPermisoEliminarEstadoDetalleAutoriConsep));
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep);							
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));						
			this.jButtonDuplicarToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep && this.isPermisoDuplicarEstadoDetalleAutoriConsep));						
			this.jButtonCopiarToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep && this.isPermisoCopiarEstadoDetalleAutoriConsep));			
			this.jButtonVerFormToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep && this.isPermisoVerFormEstadoDetalleAutoriConsep));			
			this.jButtonAbrirOrderByToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));
			this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));			
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep  && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep && this.isPermisoEliminarEstadoDetalleAutoriConsep));
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarToolBarEstadoDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep);				
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));			
			this.jMenuItemDuplicarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep && this.isPermisoDuplicarEstadoDetalleAutoriConsep));			
			this.jMenuItemCopiarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep && this.isPermisoCopiarEstadoDetalleAutoriConsep));			
			this.jMenuItemVerFormEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep && this.isPermisoVerFormEstadoDetalleAutoriConsep));			
			this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));			
			//this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));
			this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));			
			//this.jMenuItemDetalleMostrarOcultarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep && this.isPermisoOrdenEstadoDetalleAutoriConsep));			
			this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep));			
			this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep && this.isPermisoNuevoEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));									
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemModificarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemActualizarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep && this.isPermisoActualizarEstadoDetalleAutoriConsep));	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemEliminarEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep && this.isPermisoEliminarEstadoDetalleAutoriConsep));
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemCancelarEstadoDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep);				
			}
			
			this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));						
			this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=this.jButtonNuevoEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep=this.jButtonDuplicarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep=this.jButtonCopiarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep=this.jButtonVerFormEstadoDetalleAutoriConsep.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoDetalleAutoriConsep=this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=this.jButtonModificarEstadoDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=this.jButtonNuevoToolBarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarToolBarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarToolBarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarToolBarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarToolBarEstadoDetalleAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=this.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=this.jMenuItemNuevoEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemModificarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemActualizarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemEliminarEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemCancelarEstadoDetalleAutoriConsep.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoDetalleAutoriConsep(Boolean esInicializar) {
		if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
				//if(this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleAutoriConsep();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoDetalleAutoriConsep(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoDetalleAutoriConsep() {
		this.jButtonNuevoEstadoDetalleAutoriConsep.setVisible(this.isPermisoNuevoEstadoDetalleAutoriConsep);			
		this.jButtonDuplicarEstadoDetalleAutoriConsep.setVisible(this.isPermisoDuplicarEstadoDetalleAutoriConsep);			
		this.jButtonCopiarEstadoDetalleAutoriConsep.setVisible(this.isPermisoCopiarEstadoDetalleAutoriConsep);			
		this.jButtonVerFormEstadoDetalleAutoriConsep.setVisible(this.isPermisoVerFormEstadoDetalleAutoriConsep);			
		
		this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.setVisible(this.isPermisoOrdenEstadoDetalleAutoriConsep);					
		
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.setVisible(this.isPermisoNuevoEstadoDetalleAutoriConsep);			
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarEstadoDetalleAutoriConsep.setVisible(this.isPermisoActualizarEstadoDetalleAutoriConsep);	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.setVisible(this.isPermisoActualizarEstadoDetalleAutoriConsep);	
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.setVisible(this.isPermisoEliminarEstadoDetalleAutoriConsep);
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep);						
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.setVisible(this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.setVisible(this.isPermisoActualizarEstadoDetalleAutoriConsep);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleAutoriConsep() {
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarEstadoDetalleAutoriConsep.setVisible(this.isPermisoActualizarEstadoDetalleAutoriConsep);	
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.setVisible(this.isPermisoActualizarEstadoDetalleAutoriConsep);	
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.setVisible(this.isPermisoEliminarEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.setVisible(this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep);							
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.setVisible((this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep && this.isPermisoGuardarCambiosEstadoDetalleAutoriConsep));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoDetalleAutoriConsep() {
		if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoDetalleAutoriConsep();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoDetalleAutoriConsep() {
	}
	
	public void jTableDatosEstadoDetalleAutoriConsepListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoDetalleAutoriConsep(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.getestadodetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleautoriconsep==null) {
						this.estadodetalleautoriconsep = new EstadoDetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				}

				if(this.estadodetalleautoriconsep.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadodetalleautoriconsep.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.getestadodetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleautoriconsep==null) {
						this.estadodetalleautoriconsep = new EstadoDetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				}

				if(this.estadodetalleautoriconsep.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadodetalleautoriconsep.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoDetalleAutoriConsepBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.getestadodetalleautoriconsep(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadodetalleautoriconsep==null) {
						this.estadodetalleautoriconsep = new EstadoDetalleAutoriConsep();
					}

					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);
				}

				if(this.estadodetalleautoriconsep.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadodetalleautoriconsep.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoDetalleAutoriConsep() {
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.dispose();
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.dispose();
			this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep=null;
		}
		
		if(this.jInternalFrameImportacionEstadoDetalleAutoriConsep!=null) {
			this.jInternalFrameImportacionEstadoDetalleAutoriConsep.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoDetalleAutoriConsep.dispose();
			this.jInternalFrameImportacionEstadoDetalleAutoriConsep=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoDetalleAutoriConsep();
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoDetalleAutoriConsep")) {
				jButtonDuplicarEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoDetalleAutoriConsep")) {
				jButtonCopiarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoDetalleAutoriConsep")) {
				jButtonVerFormEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoDetalleAutoriConsep")) {
				jButtonDuplicarEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoDetalleAutoriConsep")) {
				jButtonDuplicarEstadoDetalleAutoriConsepActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoDetalleAutoriConsep")) {
				jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoDetalleAutoriConsep")) {
				jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoDetalleAutoriConsep")) {
				jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoDetalleAutoriConsep")) {
				jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoDetalleAutoriConsep")) {
				jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoDetalleAutoriConsep")) {
				jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoDetalleAutoriConsep")) {
				jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoDetalleAutoriConsep")) {
				jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoDetalleAutoriConsep")) {
				jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoDetalleAutoriConsep")) {
				jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoDetalleAutoriConsep")) {
				jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoDetalleAutoriConsep")) {
				jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoDetalleAutoriConsep")) {
				jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoDetalleAutoriConsep")) {
				jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoDetalleAutoriConsep")) {
				jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoDetalleAutoriConsep")) {
				jButtonMostrarOcultarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoDetalleAutoriConsep")) {
				jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoDetalleAutoriConsep")) {
				jButtonCopiarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoDetalleAutoriConsep")) {
				jButtonVerFormEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoDetalleAutoriConsep")) {
				jButtonCopiarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoDetalleAutoriConsep")) {
				jButtonVerFormEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleAutoriConsep")) {
				jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoDetalleAutoriConsep")) {
				jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoDetalleAutoriConsep")) {
				jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoDetalleAutoriConsep")) {
				jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoDetalleAutoriConsep")) {
				jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoDetalleAutoriConsep")) {
				jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoDetalleAutoriConsep")) {
				jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoDetalleAutoriConsep")) {
				jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoDetalleAutoriConsep")) {
				jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoDetalleAutoriConsep") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep")) {
				jButtonAbrirOrderByEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoDetalleAutoriConsep") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoDetalleAutoriConsep")) {
				jButtonMostrarOcultarEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoDetalleAutoriConsep")) {
				jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoDetalleAutoriConsep")) {
				jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoDetalleAutoriConsep")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoDetalleAutoriConsep")) {
				jButtonCerrarImportacionEstadoDetalleAutoriConsepActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoDetalleAutoriConsep")) {
				
				jButtonGenerarImportacionEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoDetalleAutoriConsep")) {
				
				jButtonAbrirImportacionEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoDetalleAutoriConsep")) {
				jComboBoxTiposAccionesEstadoDetalleAutoriConsepActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoDetalleAutoriConsep")) {
				jComboBoxTiposRelacionesEstadoDetalleAutoriConsepActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoDetalleAutoriConsep")) {
				jComboBoxTiposAccionesEstadoDetalleAutoriConsepActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoDetalleAutoriConsep")) {
				
				jComboBoxTiposSeleccionarEstadoDetalleAutoriConsepActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoDetalleAutoriConsep")) {
				jTextFieldValorCampoGeneralEstadoDetalleAutoriConsepActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoDetalleAutoriConsep")) {
				jButtonAbrirOrderByEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoDetalleAutoriConsep")) {
				jButtonAbrirOrderByEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoDetalleAutoriConsep")) {
				jButtonCerrarOrderByEstadoDetalleAutoriConsepActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtonidEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtoncodigoEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtonnombreEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoDetalleAutoriConsep();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadodetalleautoriconsepLocal=this.estadodetalleautoriconsep;
			} else {
				estadodetalleautoriconsepLocal=this.estadodetalleautoriconsepAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
							
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
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
			
			


			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
								
						
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
								
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
							
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
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
			
			


			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
								
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoDetalleAutoriConsep")) {
					jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoDetalleAutoriConsep")) {
					jCheckBoxSeleccionadosEstadoDetalleAutoriConsepItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoDetalleAutoriConsep")) {
					
				}
				
				


				
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
												
				
				


				
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
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
			
			


			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadodetalleautoriconsep);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadodetalleautoriconsep);
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
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
				
				


				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoDetalleAutoriConsep.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoDetalleAutoriConsep.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoDetalleAutoriConsepActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadodetalleautoriconsepAnterior =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoDetalleAutoriConsep")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoDetalleAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadodetalleautoriconsep =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadodetalleautoriconsep);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoDetalleAutoriConsep")) {
				
				}
				
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoDetalleAutoriConsep")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoDetalleAutoriConsep.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleAutoriConsep")) {
			
			}
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoDetalleAutoriConsep();
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoDetalleAutoriConsep")) {
				jButtonDuplicarEstadoDetalleAutoriConsepActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoDetalleAutoriConsep")) {
				jButtonCopiarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoDetalleAutoriConsep")) {
				jButtonVerFormEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoDetalleAutoriConsep")) {
				jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoDetalleAutoriConsep")) {
				jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoDetalleAutoriConsep")) {
				jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoDetalleAutoriConsep")) {
				jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoDetalleAutoriConsep")) {
				jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoDetalleAutoriConsep")) {
				jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoDetalleAutoriConsep")) {
				jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoDetalleAutoriConsep")) {
				jButtonAbrirOrderByEstadoDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoDetalleAutoriConsep")) {
				jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoDetalleAutoriConsep")) {
				jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoDetalleAutoriConsep")) {
				jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtonidEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtoncodigoEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoDetalleAutoriConsepBusqueda")) {
				this.jButtonnombreEstadoDetalleAutoriConsepBusquedaActionPerformed(evt);
			}
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoDetalleAutoriConsep();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoDetalleAutoriConsep")) {
				closingInternalFrameEstadoDetalleAutoriConsep();
				
			} else if(sTipo.equals("jButtonCancelarEstadoDetalleAutoriConsep")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleAutoriConsep = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoDetalleAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleAutoriConsep.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(null);
			}
			
			EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadodetalleautoriconsep,new Object(),this.estadodetalleautoriconsepParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoDetalleAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoDetalleAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoDetalleAutoriConsep(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadodetalleautoriconsep)) {
			if(!esControlTabla) {
				if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);			
				}
				
				if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleautoriconsepReturnGeneral=estadodetalleautoriconsepLogic.procesarEventosEstadoDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),this.estadodetalleautoriconsep,this.estadodetalleautoriconsepParameterGeneral,this.isEsNuevoEstadoDetalleAutoriConsep,classes);//this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral,this.estadodetalleautoriconsepBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleAutoriConsep(classes,this.estadodetalleautoriconsepReturnGeneral,this.estadodetalleautoriconsepBean,false);
					}
						
					if(this.estadodetalleautoriconsepReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep());	
					}
						
					if(this.estadodetalleautoriconsepReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep(),classes);//this.estadodetalleautoriconsepBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,classes);//this.estadodetalleautoriconsepBean);									
				}
			
				if(EstadoDetalleAutoriConsepJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoDetalleAutoriConsep(this.estadodetalleautoriconsep);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadodetalleautoriconsepAnterior!=null) {
						this.estadodetalleautoriconsep=this.estadodetalleautoriconsepAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadodetalleautoriconsepReturnGeneral=estadodetalleautoriconsepLogic.procesarEventosEstadoDetalleAutoriConsepsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps(),this.estadodetalleautoriconsep,this.estadodetalleautoriconsepParameterGeneral,this.isEsNuevoEstadoDetalleAutoriConsep,classes);//this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConsep()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadodetalleautoriconsepSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep(),estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep(),this.estadodetalleautoriconseps);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoDetalleAutoriConsep.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoDetalleAutoriConsep.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoDetalleAutoriConsep();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoDetalleAutoriConsep() throws Exception {
		
		EstadoDetalleAutoriConsepModel estadodetalleautoriconsepModel=(EstadoDetalleAutoriConsepModel)this.jTableDatosEstadoDetalleAutoriConsep.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadodetalleautoriconsepModel.estadodetalleautoriconseps=this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadodetalleautoriconsepModel.estadodetalleautoriconseps=this.estadodetalleautoriconseps;
		}
		
		
		((EstadoDetalleAutoriConsepModel) this.jTableDatosEstadoDetalleAutoriConsep.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoDetalleAutoriConsep() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadodetalleautoriconsepAnterior(),this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadodetalleautoriconsepAnterior(),this.estadodetalleautoriconseps);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoDetalleAutoriConsep();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
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
										
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleautoriconsep,new Object(),generalEntityParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoDetalleAutoriConsepConstantesFunciones.getClassesRelationshipsOfEstadoDetalleAutoriConsep(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoDetalleAutoriConsepConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoDetalleAutoriConsep(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoDetalleAutoriConsep(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoDetalleAutoriConsepBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadodetalleautoriconsep,new Object(),generalEntityParameterGeneral,this.estadodetalleautoriconsepReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsepBean estadodetalleautoriconsepBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoDetalleAutoriConsep(ArrayList<Classe> classes,EstadoDetalleAutoriConsepReturnGeneral estadodetalleautoriconsepReturnGeneral,EstadoDetalleAutoriConsepBean estadodetalleautoriconsepBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadodetalleautoriconsep)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep = new EstadoDetalleAutoriConsepDetalleFormJInternalFrame(jDesktopPane,this.estadodetalleautoriconsepSessionBean.getConGuardarRelaciones(),this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setVisible(false);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.estadodetalleautoriconsepLogic=this.estadodetalleautoriconsepLogic;
		
		this.cargarCombosFrameForeignKeyEstadoDetalleAutoriConsep("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoDetalleAutoriConsep();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoDetalleAutoriConsep();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoDetalleAutoriConsep("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoDetalleAutoriConsep();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleAutoriConsep"));
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleAutoriConsep"));

		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleAutoriConsep"));
					
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemModificarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleAutoriConsep"));
						
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemActualizarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleAutoriConsep"));
								
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemEliminarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleAutoriConsep"));
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleAutoriConsep"));
					
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemCancelarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleAutoriConsep"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleAutoriConsep"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleAutoriConsep"));
		
		
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleAutoriConsep"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonidEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonnombreEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleAutoriConsepBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleAutoriConsep"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoDetalleAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoDetalleAutoriConsep"));
		}
		
		this.jTableDatosEstadoDetalleAutoriConsep.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoDetalleAutoriConsep"));
		
		this.jTableDatosEstadoDetalleAutoriConsep.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoDetalleAutoriConsep"));
		
		this.jButtonNuevoEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoEstadoDetalleAutoriConsep"));
		
		this.jButtonDuplicarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarEstadoDetalleAutoriConsep"));
		
		this.jButtonCopiarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"CopiarEstadoDetalleAutoriConsep"));
		
		this.jButtonVerFormEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"VerFormEstadoDetalleAutoriConsep"));
		
		
		this.jButtonNuevoToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoDetalleAutoriConsep"));
			
		this.jButtonDuplicarToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemNuevoEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoDetalleAutoriConsep"));
			
		this.jMenuItemDuplicarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoDetalleAutoriConsep"));		
		
		
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoDetalleAutoriConsep"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoDetalleAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarEstadoDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonModificarToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoDetalleAutoriConsep"));
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemModificarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ActualizarEstadoDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonActualizarToolBarEstadoDetalleAutoriConsep.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoDetalleAutoriConsep"));
				
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemActualizarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarEstadoDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonEliminarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoDetalleAutoriConsep"));
						
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemEliminarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarEstadoDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonCancelarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoDetalleAutoriConsep"));
			
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemCancelarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoDetalleAutoriConsep"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoDetalleAutoriConsep"));		
		
		
		this.jButtonCerrarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarEstadoDetalleAutoriConsep"));
		
		
		this.jButtonCerrarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemCerrarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoDetalleAutoriConsep"));
			
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoDetalleAutoriConsep"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoDetalleAutoriConsep"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoDetalleAutoriConsep"));
		}
		
		this.jButtonCopiarToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoDetalleAutoriConsep"));
			
		this.jButtonVerFormToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoDetalleAutoriConsep"));
		
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoDetalleAutoriConsep"));
			
		this.jMenuItemCopiarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoDetalleAutoriConsep"));		
		
		this.jMenuItemVerFormEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoDetalleAutoriConsep"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleAutoriConsep"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoDetalleAutoriConsep"));		
		
		
		
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoDetalleAutoriConsep"));
					
		this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoDetalleAutoriConsep"));
		
		this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoDetalleAutoriConsep"));		
		
		
		
		this.jButtonAnterioresEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresEstadoDetalleAutoriConsep"));
		
		
		this.jButtonAnterioresToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoDetalleAutoriConsep"));
		
		this.jMenuItemAnterioresEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoDetalleAutoriConsep"));		
		
		
		this.jButtonSiguientesEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesEstadoDetalleAutoriConsep"));
		
		
		this.jButtonSiguientesToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemSiguientesEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoDetalleAutoriConsep"));
			
		this.jMenuItemAbrirOrderByEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoDetalleAutoriConsep"));
			
		this.jMenuItemMostrarOcultarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoDetalleAutoriConsep"));
			
		this.jMenuItemDetalleMostarOcultarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoDetalleAutoriConsep"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoDetalleAutoriConsep"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoDetalleAutoriConsep"));

		this.jCheckBoxSeleccionadosEstadoDetalleAutoriConsep.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoDetalleAutoriConsep"));
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoDetalleAutoriConsep"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoDetalleAutoriConsep"));
			
		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoDetalleAutoriConsep"));
					
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoDetalleAutoriConsep"));
			
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoDetalleAutoriConsep"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonidEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonnombreEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleAutoriConsepBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleAutoriConsep"));
				this.jInternalFrameReporteDinamicoEstadoDetalleAutoriConsep.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleAutoriConsep"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoDetalleAutoriConsep"));				
			//this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoDetalleAutoriConsep"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoDetalleAutoriConsep"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoDetalleAutoriConsep"));
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoDetalleAutoriConsep"));
				this.jInternalFrameImportacionEstadoDetalleAutoriConsep.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoDetalleAutoriConsep"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoDetalleAutoriConsep"));
			
			this.jButtonAbrirOrderByToolBarEstadoDetalleAutoriConsep.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoDetalleAutoriConsep"));			
			
			if(this.jInternalFrameOrderByEstadoDetalleAutoriConsep!=null) {
				this.jInternalFrameOrderByEstadoDetalleAutoriConsep.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoDetalleAutoriConsep"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTabbedPaneRelacionesEstadoDetalleAutoriConsep.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoDetalleAutoriConsep"));
		
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
            		closingInternalFrameEstadoDetalleAutoriConsep();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoDetalleAutoriConsep = (JInternalFrameBase)event.getSource();
	            	
	            EstadoDetalleAutoriConsepBeanSwingJInternalFrame jInternalFrameParent=(EstadoDetalleAutoriConsepBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoDetalleAutoriConsep.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoDetalleAutoriConsep.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoDetalleAutoriConsepListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoDetalleAutoriConsep.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoDetalleAutoriConsep.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoDetalleAutoriConsep";
		inputMap = this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoDetalleAutoriConsepActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonModificarEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonActualizarEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonEliminarEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCancelarEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoDetalleAutoriConsep";
		inputMap = this.jButtonCerrarEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoDetalleAutoriConsep";
		inputMap = this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonGuardarCambiosEstadoDetalleAutoriConsep.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsep.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsepItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoDetalleAutoriConsepActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonidEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtoncodigoEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoDetalleAutoriConsepBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jButtonnombreEstadoDetalleAutoriConsepBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoDetalleAutoriConsepBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoDetalleAutoriConsep.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoDetalleAutoriConsepActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoDetalleAutoriConsep.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoDetalleAutoriConsep(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
					estadodetalleautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconseps) {
					estadodetalleautoriconsepAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoDetalleAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
						estadodetalleautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconseps) {
						estadodetalleautoriconsepAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconseps) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoDetalleAutoriConsepItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoDetalleAutoriConsep.getSelectedRows();
			
			EstadoDetalleAutoriConsep estadodetalleautoriconsepLocal=new EstadoDetalleAutoriConsep();
			
			//this.seleccionarTodosEstadoDetalleAutoriConsep(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadodetalleautoriconsepLocal =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps().toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadodetalleautoriconsepLocal =(EstadoDetalleAutoriConsep) this.estadodetalleautoriconseps.toArray()[this.jTableDatosEstadoDetalleAutoriConsep.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadodetalleautoriconsepLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
						estadodetalleautoriconsepAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconseps) {
						estadodetalleautoriconsepAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoDetalleAutoriConsep.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoDetalleAutoriConsep.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoDetalleAutoriConsep,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoDetalleAutoriConsepItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoDetalleAutoriConsepParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoDetalleAutoriConsep.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
				
						if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleautoriconsepAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconseps) {
					
						if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadodetalleautoriconsepAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadodetalleautoriconsepAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoDetalleAutoriConsepActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoDetalleAutoriConsep=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoDetalleAutoriConsep) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoDetalleAutoriConsep(conSplash);
				
					this.generarReporteEstadoDetalleAutoriConsepsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoDetalleAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleAutoriConsepsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoDetalleAutoriConsepsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleAutoriConsep();
				
				this.exportarEstadoDetalleAutoriConsepsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoDetalleAutoriConseps();
				//this.importarEstadoDetalleAutoriConseps();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoDetalleAutoriConsep();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoDetalleAutoriConsepsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Detalle Autorizacion Consep", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoDetalleAutoriConsep();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoDetalleAutoriConsep)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoDetalleAutoriConsep(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoDetalleAutoriConsep.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jComboBoxTiposAccionesFormularioEstadoDetalleAutoriConsep.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoDetalleAutoriConsep();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoDetalleAutoriConsep(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoDetalleAutoriConsepActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoDetalleAutoriConsep();
			
			if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
			EstadoDetalleAutoriConsep estadodetalleautoriconsep=new EstadoDetalleAutoriConsep();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoDetalleAutoriConsep.getSelectedItem();
			
			
			
			
			estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadodetalleautoriconsepsSeleccionados.size()==1) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
					estadodetalleautoriconsep=estadodetalleautoriconsepAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoDetalleAutoriConsep();
			
      		//this.finishProcessEstadoDetalleAutoriConsep(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoDetalleAutoriConsepReturnGeneral() throws Exception {
		if(this.estadodetalleautoriconsepReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadodetalleautoriconsepReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadodetalleautoriconsepReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadodetalleautoriconsepReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadodetalleautoriconsepReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
		}
		
		if(this.estadodetalleautoriconsepReturnGeneral.getConRetornoLista() || this.estadodetalleautoriconsepReturnGeneral.getConRetornoObjeto()) {
			if(this.estadodetalleautoriconsepReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConseps(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConseps());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadodetalleautoriconsepReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadodetalleautoriconsepLogic.setEstadoDetalleAutoriConsep(this.estadodetalleautoriconsepReturnGeneral.getEstadoDetalleAutoriConsep());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoDetalleAutoriConsep(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoDetalleAutoriConsep() throws Exception {
		
		
	}
	
	public ArrayList<EstadoDetalleAutoriConsep> getEstadoDetalleAutoriConsepsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoDetalleAutoriConsep) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps()) {
					if(estadodetalleautoriconsepAux.getIsSelected()) {
						estadodetalleautoriconsepsSeleccionados.add(estadodetalleautoriconsepAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:this.estadodetalleautoriconseps) {
					if(estadodetalleautoriconsepAux.getIsSelected()) {
						estadodetalleautoriconsepsSeleccionados.add(estadodetalleautoriconsepAux);				
					}
				}
			}
			
			if(estadodetalleautoriconsepsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadodetalleautoriconsepsSeleccionados.addAll(this.estadodetalleautoriconsepLogic.getEstadoDetalleAutoriConseps());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadodetalleautoriconsepsSeleccionados.addAll(this.estadodetalleautoriconseps);				
					}
				}
			}
		} else {
			estadodetalleautoriconsepsSeleccionados.add(this.estadodetalleautoriconsep);
		}
		
		return estadodetalleautoriconsepsSeleccionados;
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
	
	public void generarReporteEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleAutoriConsepsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoDetalleAutoriConsepsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Detalle Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoDetalleAutoriConsepsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoDetalleAutoriConsep();
		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoDetalleAutoriConsep();
		
		
		//this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados ,estadodetalleautoriconsepImplementable,estadodetalleautoriconsepImplementableHome);
	}
	
	public void mostrarImportacionEstadoDetalleAutoriConseps() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoDetalleAutoriConsep();
		
		this.abrirFrameImportacionEstadoDetalleAutoriConsep();		
		
			
		//this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados ,estadodetalleautoriconsepImplementable,estadodetalleautoriconsepImplementableHome);
	}
	
	public void importarEstadoDetalleAutoriConseps() throws Exception {		
	
	}
	
	public void exportarEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoDetalleAutoriConsepsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoDetalleAutoriConsepsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoDetalleAutoriConsepsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Detalle Autorizacion Consep",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoDetalleAutoriConsep(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadodetalleautoriconsepAux.setsDetalleGeneralEntityReporte(estadodetalleautoriconsepAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoDetalleAutoriConsep(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleAutoriConsepConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadodetalleautoriconsep.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleautoriconsep.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleautoriconsep.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadodetalleautoriconsep.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoDetalleAutoriConseps");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoDetalleAutoriConsep(row);				
				iRow++;
			}				
			
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoDetalleAutoriConsepsSeleccionados() throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();		
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadodetalleautoriconsep.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadodetalleautoriconseps");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadodetalleautoriconsep");
			//elementRoot.appendChild(element);
		
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
				element = document.createElement("estadodetalleautoriconsep");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoDetalleAutoriConsep(estadodetalleautoriconsepAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Detalle Autorizacion Consep",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoDetalleAutoriConsep(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleautoriconsep.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleautoriconsep.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadodetalleautoriconsep.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoDetalleAutoriConsep(EstadoDetalleAutoriConsep estadodetalleautoriconsep,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoDetalleAutoriConsepConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadodetalleautoriconsep.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoDetalleAutoriConsepConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadodetalleautoriconsep.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoDetalleAutoriConsepConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadodetalleautoriconsep.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoDetalleAutoriConsepConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadodetalleautoriconsep.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoDetalleAutoriConsepsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados=new ArrayList<EstadoDetalleAutoriConsep>();
		
		estadodetalleautoriconsepsSeleccionados=this.getEstadoDetalleAutoriConsepsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoDetalleAutoriConsep(estadodetalleautoriconsepsSeleccionados);
		
		this.generarReporteEstadoDetalleAutoriConseps("Todos",estadodetalleautoriconsepsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoDetalleAutoriConsep(ArrayList<EstadoDetalleAutoriConsep> estadodetalleautoriconsepsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoDetalleAutoriConsep estadodetalleautoriconsepAux:estadodetalleautoriconsepsSeleccionados) {
				estadodetalleautoriconsepAux.setsDetalleGeneralEntityReporte(estadodetalleautoriconsepAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadodetalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(estadodetalleautoriconsepAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoDetalleAutoriConsepConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadodetalleautoriconsepAux.setsDescripcionGeneralEntityReporte1(estadodetalleautoriconsepAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoDetalleAutoriConsepConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoDetalleAutoriConsep(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaModificarEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaCancelarEstadoDetalleAutoriConsep=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoDetalleAutoriConsep=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoDetalleAutoriConsepJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=true;
		} else {
			this.actualizarEstadoPanelsEstadoDetalleAutoriConsep(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoDetalleAutoriConsep=false;
			//this.isVisibilidadCeldaVerFormEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaDuplicarEstadoDetalleAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoDetalleAutoriConsep=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
			if(!estadodetalleautoriconsepSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;												
			}
			
			this.jButtonCerrarEstadoDetalleAutoriConsep.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoDetalleAutoriConsep=false;
		}
		
		if(!this.permiteMantenimiento(this.estadodetalleautoriconsep)) {
			this.isVisibilidadCeldaActualizarEstadoDetalleAutoriConsep=false;
			this.isVisibilidadCeldaEliminarEstadoDetalleAutoriConsep=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoDetalleAutoriConsep() {
	}
	
	public void actualizarEstadoPanelsEstadoDetalleAutoriConsep(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEdicionEstadoDetalleAutoriConsep.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoDetalleAutoriConsep!=null) {
				this.jScrollPanelDatosEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoDetalleAutoriConsep!=null) {
				this.jPanelPaginacionEstadoDetalleAutoriConsep.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoDetalleAutoriConsep!=null) {
				this.jPanelParametrosReportesEstadoDetalleAutoriConsep.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadodetalleautoriconsepSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		
		if(this.estadodetalleautoriconsepSessionBean==null) {
			this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		}
		
		this.estadodetalleautoriconsepSessionBean.setsUltimaBusquedaEstadoDetalleAutoriConsep(this.getsAccionBusqueda());
		this.estadodetalleautoriconsepSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadodetalleautoriconsepSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoDetalleAutoriConsepSessionBean estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		
		if(this.estadodetalleautoriconsepSessionBean==null) {
			this.estadodetalleautoriconsepSessionBean=new EstadoDetalleAutoriConsepSessionBean();
		}
		
		if(this.estadodetalleautoriconsepSessionBean.getsUltimaBusquedaEstadoDetalleAutoriConsep()!=null&&!this.estadodetalleautoriconsepSessionBean.getsUltimaBusquedaEstadoDetalleAutoriConsep().equals("")) {
			this.setsAccionBusqueda(estadodetalleautoriconsepSessionBean.getsUltimaBusquedaEstadoDetalleAutoriConsep());
			this.setiNumeroPaginacion(estadodetalleautoriconsepSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadodetalleautoriconsepSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadodetalleautoriconsepSessionBean.setsUltimaBusquedaEstadoDetalleAutoriConsep("");
		this.estadodetalleautoriconsepSessionBean.setiNumeroPaginacion(EstadoDetalleAutoriConsepConstantesFunciones.INUMEROPAGINACION);
		this.estadodetalleautoriconsepSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoDetalleAutoriConsep(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoDetalleAutoriConsep() {
		this.updateBorderResaltarBusquedasFormularioEstadoDetalleAutoriConsep();
		this.updateVisibilidadBusquedasFormularioEstadoDetalleAutoriConsep();
		this.updateHabilitarBusquedasFormularioEstadoDetalleAutoriConsep();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoDetalleAutoriConsep() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoDetalleAutoriConsep() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoDetalleAutoriConsep() {
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
	
	public void updateControlesFormularioEstadoDetalleAutoriConsep() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoDetalleAutoriConsep();
		this.updateVisibilidadResaltarControlesFormularioEstadoDetalleAutoriConsep();
		this.updateHabilitarResaltarControlesFormularioEstadoDetalleAutoriConsep();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoDetalleAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadodetalleautoriconsepConstantesFunciones.resaltaridEstadoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setBorder(this.estadodetalleautoriconsepConstantesFunciones.resaltaridEstadoDetalleAutoriConsep);}
		if(this.estadodetalleautoriconsepConstantesFunciones.resaltarcodigoEstadoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setBorder(this.estadodetalleautoriconsepConstantesFunciones.resaltarcodigoEstadoDetalleAutoriConsep);}
		if(this.estadodetalleautoriconsepConstantesFunciones.resaltarnombreEstadoDetalleAutoriConsep!=null && this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setBorder(this.estadodetalleautoriconsepConstantesFunciones.resaltarnombreEstadoDetalleAutoriConsep);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoDetalleAutoriConsep() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
	
		//this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostraridEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelidEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostraridEstadoDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostrarcodigoEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelcodigoEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostrarcodigoEstadoDetalleAutoriConsep);
		//this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostrarnombreEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jPanelnombreEstadoDetalleAutoriConsep.setVisible(this.estadodetalleautoriconsepConstantesFunciones.mostrarnombreEstadoDetalleAutoriConsep);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoDetalleAutoriConsep() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep!=null) {
	
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldidEstadoDetalleAutoriConsep.setEnabled(this.estadodetalleautoriconsepConstantesFunciones.activaridEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldcodigoEstadoDetalleAutoriConsep.setEnabled(this.estadodetalleautoriconsepConstantesFunciones.activarcodigoEstadoDetalleAutoriConsep);
		this.jInternalFrameDetalleFormEstadoDetalleAutoriConsep.jTextFieldnombreEstadoDetalleAutoriConsep.setEnabled(this.estadodetalleautoriconsepConstantesFunciones.activarnombreEstadoDetalleAutoriConsep);
		}
	}
	
		
}