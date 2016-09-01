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

import com.bydan.erp.inventario.util.ConversionUnidadConstantesFunciones;
import com.bydan.erp.inventario.util.ConversionUnidadParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ConversionUnidadParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ConversionUnidadBean;
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

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ConversionUnidadBeanSwingJInternalFrame extends ConversionUnidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConversionUnidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConversionUnidad> conversionunidadValidator = new ClassValidator<ConversionUnidad>(ConversionUnidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConversionUnidad conversionunidad;	
	public ConversionUnidad conversionunidadAux;
	public ConversionUnidad conversionunidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConversionUnidad conversionunidadTotales;
	public Long idConversionUnidadActual;
	public Long iIdNuevoConversionUnidad=0L;
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

	public String sFinalQueryComboUnidadDesde="";

	public List<Unidad> unidaddesdesForeignKey;

	public List<Unidad> getunidaddesdesForeignKey() {
		return unidaddesdesForeignKey;
	}

	public void setunidaddesdesForeignKey(List<Unidad> unidaddesdesForeignKey) {
		this.unidaddesdesForeignKey = unidaddesdesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidaddesdeForeignKey;

	public Unidad getunidaddesdeForeignKey() {
		return unidaddesdeForeignKey;
	}

	public void setunidaddesdeForeignKey(Unidad unidaddesdeForeignKey) {
		this.unidaddesdeForeignKey = unidaddesdeForeignKey;
	}

	public String sFinalQueryComboUnidadHasta="";

	public List<Unidad> unidadhastasForeignKey;

	public List<Unidad> getunidadhastasForeignKey() {
		return unidadhastasForeignKey;
	}

	public void setunidadhastasForeignKey(List<Unidad> unidadhastasForeignKey) {
		this.unidadhastasForeignKey = unidadhastasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadhastaForeignKey;

	public Unidad getunidadhastaForeignKey() {
		return unidadhastaForeignKey;
	}

	public void setunidadhastaForeignKey(Unidad unidadhastaForeignKey) {
		this.unidadhastaForeignKey = unidadhastaForeignKey;
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
	
	public Boolean isPermisoTodoConversionUnidad;
	public Boolean isPermisoNuevoConversionUnidad;
	public Boolean isPermisoActualizarConversionUnidad;
	public Boolean isPermisoActualizarOriginalConversionUnidad;
	public Boolean isPermisoEliminarConversionUnidad;
	public Boolean isPermisoGuardarCambiosConversionUnidad;
	public Boolean isPermisoConsultaConversionUnidad;
	public Boolean isPermisoBusquedaConversionUnidad;
	public Boolean isPermisoReporteConversionUnidad;
	public Boolean isPermisoPaginacionMedioConversionUnidad;
	public Boolean isPermisoPaginacionAltoConversionUnidad;
	public Boolean isPermisoPaginacionTodoConversionUnidad;
	public Boolean isPermisoCopiarConversionUnidad;
	public Boolean isPermisoVerFormConversionUnidad;
	public Boolean isPermisoDuplicarConversionUnidad;
	public Boolean isPermisoOrdenConversionUnidad;
	
	
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
	
	public ConversionUnidadParameterReturnGeneral conversionunidadReturnGeneral;
	public ConversionUnidadParameterReturnGeneral conversionunidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConversionUnidad=false;
	public Boolean esParaAccionDesdeFormularioConversionUnidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConversionUnidadSessionBeanAdditional conversionunidadSessionBeanAdditional=null;
	
	public ConversionUnidadSessionBeanAdditional getConversionUnidadSessionBeanAdditional() {
		return this.conversionunidadSessionBeanAdditional;
	}
	
	public void setConversionUnidadSessionBeanAdditional(ConversionUnidadSessionBeanAdditional conversionunidadSessionBeanAdditional) {
		try {
			this.conversionunidadSessionBeanAdditional=conversionunidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConversionUnidadBeanSwingJInternalFrameAdditional conversionunidadBeanSwingJInternalFrameAdditional=null;
	//public class ConversionUnidadBeanSwingJInternalFrame
	
	public ConversionUnidadBeanSwingJInternalFrameAdditional getConversionUnidadBeanSwingJInternalFrameAdditional() {
		return this.conversionunidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setConversionUnidadBeanSwingJInternalFrameAdditional(ConversionUnidadBeanSwingJInternalFrameAdditional conversionunidadBeanSwingJInternalFrameAdditional) {
		try {
			this.conversionunidadBeanSwingJInternalFrameAdditional=conversionunidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConversionUnidadLogic conversionunidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConversionUnidad conversionunidadBean;
	public ConversionUnidadConstantesFunciones conversionunidadConstantesFunciones;
	//public ConversionUnidadParameterReturnGeneral conversionunidadReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public UnidadLogic unidaddesdeLogic;
	public UnidadLogic unidadhastaLogic;
	
	//PARAMETROS
	
	
	//public List<ConversionUnidad> conversionunidads;	
	//public List<ConversionUnidad> conversionunidadsEliminados;
	//public List<ConversionUnidad> conversionunidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConversionUnidad=false;
	public Boolean isVisibilidadCeldaDuplicarConversionUnidad=true;
	public Boolean isVisibilidadCeldaCopiarConversionUnidad=true;
	public Boolean isVisibilidadCeldaVerFormConversionUnidad=true;
	public Boolean isVisibilidadCeldaOrdenConversionUnidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
	public Boolean isVisibilidadCeldaModificarConversionUnidad=false;
	public Boolean isVisibilidadCeldaActualizarConversionUnidad=false;
	public Boolean isVisibilidadCeldaEliminarConversionUnidad=false;
	public Boolean isVisibilidadCeldaCancelarConversionUnidad=false;
	public Boolean isVisibilidadCeldaGuardarConversionUnidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConversionUnidad=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdUnidadDesde=false;
	public Boolean isVisibilidadFK_IdUnidadHasta=false;
	
	public Long getiIdNuevoConversionUnidad() {
		return this.iIdNuevoConversionUnidad;
	}

	public void setiIdNuevoConversionUnidad(Long iIdNuevoConversionUnidad) {
		this.iIdNuevoConversionUnidad = iIdNuevoConversionUnidad;
	}
	
	public Long getidConversionUnidadActual() {
		return this.idConversionUnidadActual;
	}

	public void setidConversionUnidadActual(Long idConversionUnidadActual) {
		this.idConversionUnidadActual = idConversionUnidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConversionUnidad getconversionunidad() {
		return this.conversionunidad;
	}

	public void setconversionunidad(ConversionUnidad conversionunidad) {
		this.conversionunidad = conversionunidad;
	}
	
	public ConversionUnidad getconversionunidadAux() {
		return this.conversionunidadAux;
	}

	public void setconversionunidadAux(ConversionUnidad conversionunidadAux) {
		this.conversionunidadAux = conversionunidadAux;
	}				
	
	public ConversionUnidad getconversionunidadAnterior() {
		return this.conversionunidadAnterior;
	}

	public void setconversionunidadAnterior(ConversionUnidad conversionunidadAnterior) {
		this.conversionunidadAnterior = conversionunidadAnterior;
	}	
	
	public ConversionUnidad getconversionunidadTotales() {
		return this.conversionunidadTotales;
	}

	public void setconversionunidadTotales(ConversionUnidad conversionunidadTotales) {
		this.conversionunidadTotales = conversionunidadTotales;
	}	
	
	public ConversionUnidad getconversionunidadBean() {
		return this.conversionunidadBean;
	}

	public void setconversionunidadBean(ConversionUnidad conversionunidadBean) {
		this.conversionunidadBean = conversionunidadBean;
	}	
	
	public ConversionUnidadParameterReturnGeneral getconversionunidadReturnGeneral() {
		return this.conversionunidadReturnGeneral;
	}

	public void setconversionunidadReturnGeneral(ConversionUnidadParameterReturnGeneral conversionunidadReturnGeneral) {
		this.conversionunidadReturnGeneral = conversionunidadReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_unidad_desdeFK_IdUnidadDesde=-1L;

	public Long getid_unidad_desdeFK_IdUnidadDesde() {
		return this.id_unidad_desdeFK_IdUnidadDesde;
	}

	public void setid_unidad_desdeFK_IdUnidadDesde(Long id_unidad_desdeFK_IdUnidadDesde) {
		this.id_unidad_desdeFK_IdUnidadDesde = id_unidad_desdeFK_IdUnidadDesde;
	}

	public Long id_unidad_hastaFK_IdUnidadHasta=-1L;

	public Long getid_unidad_hastaFK_IdUnidadHasta() {
		return this.id_unidad_hastaFK_IdUnidadHasta;
	}

	public void setid_unidad_hastaFK_IdUnidadHasta(Long id_unidad_hastaFK_IdUnidadHasta) {
		this.id_unidad_hastaFK_IdUnidadHasta = id_unidad_hastaFK_IdUnidadHasta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConversionUnidadLogic getConversionUnidadLogic()	{		
		return conversionunidadLogic;
	}

	public void setConversionUnidadLogic(ConversionUnidadLogic conversionunidadLogic) {
		this.conversionunidadLogic = conversionunidadLogic;
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
	
	public Boolean getIsEsNuevoConversionUnidad() {
		return isEsNuevoConversionUnidad;
	}

	public void setIsEsNuevoConversionUnidad(Boolean isEsNuevoConversionUnidad) {
		this.isEsNuevoConversionUnidad = isEsNuevoConversionUnidad;
	}

	public Boolean getEsParaAccionDesdeFormularioConversionUnidad() {
		return esParaAccionDesdeFormularioConversionUnidad;
	}
	
	public void setEsParaAccionDesdeFormularioConversionUnidad(Boolean esParaAccionDesdeFormularioConversionUnidad) {
		this.esParaAccionDesdeFormularioConversionUnidad = esParaAccionDesdeFormularioConversionUnidad;
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

			if(this.conversionunidadSessionBean==null) {
				this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
			}

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(conversionunidadSessionBean.getlidEmpresaActual());
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

	public void cargarCombosUnidadDesdesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidaddesdesForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.conversionunidadSessionBean==null) {
				this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
			}

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadDesde()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidaddesdeLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidaddesdesForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidadDesde(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(conversionunidadSessionBean.getlidUnidadDesdeActual());
					this.unidaddesdesForeignKey.add(unidadLogic.getUnidad());
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

	public void cargarCombosUnidadHastasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadhastasForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.conversionunidadSessionBean==null) {
				this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
			}

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadHasta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadhastaLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadhastasForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidadHasta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(conversionunidadSessionBean.getlidUnidadHastaActual());
					this.unidadhastasForeignKey.add(unidadLogic.getUnidad());
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

					if(this.conversionunidad!=null) {
						this.conversionunidad.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConversionUnidad.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConversionUnidadGenerico)throws Exception
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
				jComboBoxid_empresaConversionUnidadGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConversionUnidadGenerico!=null && jComboBoxid_empresaConversionUnidadGenerico.getItemCount()>0) {
					jComboBoxid_empresaConversionUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadDesdeForeignKey(Long idUnidadDesdeSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidaddesdeTemp=null;

			for(Unidad unidaddesdeAux:unidaddesdesForeignKey) {
				if(unidaddesdeAux.getId()!=null && unidaddesdeAux.getId().equals(idUnidadDesdeSeleccionado)) {
					unidaddesdeTemp=unidaddesdeAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidaddesdeTemp!=null) {

					if(this.conversionunidad!=null) {
						this.conversionunidad.setUnidadDesde(unidaddesdeTemp);
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setSelectedItem(unidaddesdeTemp);
					}
				} else {
					//jComboBoxid_unidad_desdeConversionUnidad.setSelectedItem(unidaddesdeTemp);
					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidadDesde") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidaddesdeTemp!=null && jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad!=null) {
						jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setSelectedItem(unidaddesdeTemp);
					} else {
						if(jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad!=null) {
							//jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setSelectedItem(unidaddesdeTemp);
							if(jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.getItemCount()>0) {
								jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setSelectedIndex(0);
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

	public String getActualUnidadDesdeForeignKeyDescripcion(Long idUnidadDesdeSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidaddesdeTemp=null;

			for(Unidad unidaddesdeAux:unidaddesdesForeignKey) {
				if(unidaddesdeAux.getId()!=null && unidaddesdeAux.getId().equals(idUnidadDesdeSeleccionado)) {
					unidaddesdeTemp=unidaddesdeAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidaddesdeTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadDesdeForeignKeyGenerico(Long idUnidadDesdeSeleccionado,JComboBox jComboBoxid_unidad_desdeConversionUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidaddesdeTemp=null;

			for(Unidad unidaddesdeAux:unidaddesdesForeignKey) {
				if(unidaddesdeAux.getId()!=null && unidaddesdeAux.getId().equals(idUnidadDesdeSeleccionado)) {
					unidaddesdeTemp=unidaddesdeAux;
					break;
				}
			}

			if(unidaddesdeTemp!=null) {
				jComboBoxid_unidad_desdeConversionUnidadGenerico.setSelectedItem(unidaddesdeTemp);
			} else {
				if(jComboBoxid_unidad_desdeConversionUnidadGenerico!=null && jComboBoxid_unidad_desdeConversionUnidadGenerico.getItemCount()>0) {
					jComboBoxid_unidad_desdeConversionUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadHastaForeignKey(Long idUnidadHastaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadhastaTemp=null;

			for(Unidad unidadhastaAux:unidadhastasForeignKey) {
				if(unidadhastaAux.getId()!=null && unidadhastaAux.getId().equals(idUnidadHastaSeleccionado)) {
					unidadhastaTemp=unidadhastaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadhastaTemp!=null) {

					if(this.conversionunidad!=null) {
						this.conversionunidad.setUnidadHasta(unidadhastaTemp);
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setSelectedItem(unidadhastaTemp);
					}
				} else {
					//jComboBoxid_unidad_hastaConversionUnidad.setSelectedItem(unidadhastaTemp);
					if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
						if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidadHasta") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadhastaTemp!=null && jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad!=null) {
						jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setSelectedItem(unidadhastaTemp);
					} else {
						if(jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad!=null) {
							//jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setSelectedItem(unidadhastaTemp);
							if(jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.getItemCount()>0) {
								jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setSelectedIndex(0);
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

	public String getActualUnidadHastaForeignKeyDescripcion(Long idUnidadHastaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadhastaTemp=null;

			for(Unidad unidadhastaAux:unidadhastasForeignKey) {
				if(unidadhastaAux.getId()!=null && unidadhastaAux.getId().equals(idUnidadHastaSeleccionado)) {
					unidadhastaTemp=unidadhastaAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadhastaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadHastaForeignKeyGenerico(Long idUnidadHastaSeleccionado,JComboBox jComboBoxid_unidad_hastaConversionUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadhastaTemp=null;

			for(Unidad unidadhastaAux:unidadhastasForeignKey) {
				if(unidadhastaAux.getId()!=null && unidadhastaAux.getId().equals(idUnidadHastaSeleccionado)) {
					unidadhastaTemp=unidadhastaAux;
					break;
				}
			}

			if(unidadhastaTemp!=null) {
				jComboBoxid_unidad_hastaConversionUnidadGenerico.setSelectedItem(unidadhastaTemp);
			} else {
				if(jComboBoxid_unidad_hastaConversionUnidadGenerico!=null && jComboBoxid_unidad_hastaConversionUnidadGenerico.getItemCount()>0) {
					jComboBoxid_unidad_hastaConversionUnidadGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConversionUnidad conversionunidad,JComboBox jComboBoxid_empresaConversionUnidadGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConversionUnidadGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConversionUnidadGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				conversionunidad.setid_empresa(empresaAux.getId());
				conversionunidad.setempresa_descripcion(ConversionUnidadConstantesFunciones.getEmpresaDescripcion(empresaAux));
				conversionunidad.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadDesdeForeignKey(ConversionUnidad conversionunidad,JComboBox jComboBoxid_unidad_desdeConversionUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidad_desdeConversionUnidadGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidad_desdeConversionUnidadGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				conversionunidad.setid_unidad_desde(unidadAux.getId());
				conversionunidad.setunidaddesde_descripcion(ConversionUnidadConstantesFunciones.getUnidadDesdeDescripcion(unidadAux));
				conversionunidad.setUnidadDesde(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadHastaForeignKey(ConversionUnidad conversionunidad,JComboBox jComboBoxid_unidad_hastaConversionUnidadGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidad_hastaConversionUnidadGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidad_hastaConversionUnidadGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				conversionunidad.setid_unidad_hasta(unidadAux.getId());
				conversionunidad.setunidadhasta_descripcion(ConversionUnidadConstantesFunciones.getUnidadHastaDescripcion(unidadAux));
				conversionunidad.setUnidadHasta(unidadAux);			}
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

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
					}

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadDesdesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.removeAllItems();

							for(Unidad unidaddesde:this.unidaddesdesForeignKey) {
								this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.addItem(unidaddesde);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
					}

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidadDesde") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.removeAllItems();

							for(Unidad unidaddesde:this.unidaddesdesForeignKey) {
								this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.addItem(unidaddesde);
							}
						}

						if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadHastasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.removeAllItems();

							for(Unidad unidadhasta:this.unidadhastasForeignKey) {
								this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.addItem(unidadhasta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionUnidad!=null) { 
					}

					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidadHasta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.removeAllItems();

							for(Unidad unidadhasta:this.unidadhastasForeignKey) {
								this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.addItem(unidadhasta);
							}
						}

						if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameUnidadDesdeForeignKey(Unidad unidaddesde,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setSelectedItem(unidaddesde);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setSelectedItem(unidaddesde);
						} else {
							this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadHastaForeignKey(Unidad unidadhasta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setSelectedItem(unidadhasta);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setSelectedItem(unidadhasta);
						} else {
							this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConversionUnidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConversionUnidadConstantesFunciones.refrescarForeignKeysDescripcionesConversionUnidad(this.conversionunidadLogic.getConversionUnidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConversionUnidadConstantesFunciones.refrescarForeignKeysDescripcionesConversionUnidad(this.conversionunidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//conversionunidadLogic.setConversionUnidads(this.conversionunidads);
			conversionunidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConversionUnidadParameterReturnGeneral getConversionUnidadParameterGeneral() {
		return this.conversionunidadParameterGeneral;
	}
	
	public void setConversionUnidadParameterGeneral(ConversionUnidadParameterReturnGeneral conversionunidadParameterGeneral) {
		this.conversionunidadParameterGeneral = conversionunidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConversionUnidad() {
		return isPermisoTodoConversionUnidad;
	}

	public void setIsPermisoTodoConversionUnidad(Boolean isPermisoTodoConversionUnidad) {
		this.isPermisoTodoConversionUnidad = isPermisoTodoConversionUnidad;
	}

	public Boolean getIsPermisoNuevoConversionUnidad() {
		return isPermisoNuevoConversionUnidad;
	}

	public void setIsPermisoNuevoConversionUnidad(Boolean isPermisoNuevoConversionUnidad) {
		this.isPermisoNuevoConversionUnidad = isPermisoNuevoConversionUnidad;
	}

	public Boolean getIsPermisoActualizarConversionUnidad() {
		return isPermisoActualizarConversionUnidad;
	}

	public void setIsPermisoActualizarConversionUnidad(Boolean isPermisoActualizarConversionUnidad) {
		this.isPermisoActualizarConversionUnidad = isPermisoActualizarConversionUnidad;
	}

	public Boolean getIsPermisoEliminarConversionUnidad() {
		return isPermisoEliminarConversionUnidad;
	}

	public void setIsPermisoEliminarConversionUnidad(Boolean isPermisoEliminarConversionUnidad) {
		this.isPermisoEliminarConversionUnidad = isPermisoEliminarConversionUnidad;
	}

	public Boolean getIsPermisoGuardarCambiosConversionUnidad() {
		return isPermisoGuardarCambiosConversionUnidad;
	}

	public void setIsPermisoGuardarCambiosConversionUnidad(Boolean isPermisoGuardarCambiosConversionUnidad) {
		this.isPermisoGuardarCambiosConversionUnidad = isPermisoGuardarCambiosConversionUnidad;
	}
	
	public Boolean getIsPermisoConsultaConversionUnidad() {
		return isPermisoConsultaConversionUnidad;
	}

	public void setIsPermisoConsultaConversionUnidad(Boolean isPermisoConsultaConversionUnidad) {
		this.isPermisoConsultaConversionUnidad = isPermisoConsultaConversionUnidad;
	}

	public Boolean getIsPermisoBusquedaConversionUnidad() {
		return isPermisoBusquedaConversionUnidad;
	}

	public void setIsPermisoBusquedaConversionUnidad(Boolean isPermisoBusquedaConversionUnidad) {
		this.isPermisoBusquedaConversionUnidad = isPermisoBusquedaConversionUnidad;
	}

	public Boolean getIsPermisoReporteConversionUnidad() {
		return isPermisoReporteConversionUnidad;
	}

	public void setIsPermisoReporteConversionUnidad(Boolean isPermisoReporteConversionUnidad) {
		this.isPermisoReporteConversionUnidad = isPermisoReporteConversionUnidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioConversionUnidad() {
		return isPermisoPaginacionMedioConversionUnidad;
	}

	public void setIsPermisoPaginacionMedioConversionUnidad(Boolean isPermisoPaginacionMedioConversionUnidad) {
		this.isPermisoPaginacionMedioConversionUnidad = isPermisoPaginacionMedioConversionUnidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoConversionUnidad() {
		return isPermisoPaginacionTodoConversionUnidad;
	}

	public void setIsPermisoPaginacionTodoConversionUnidad(Boolean isPermisoPaginacionTodoConversionUnidad) {
		this.isPermisoPaginacionTodoConversionUnidad = isPermisoPaginacionTodoConversionUnidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoConversionUnidad() {
		return isPermisoPaginacionAltoConversionUnidad;
	}

	public void setIsPermisoPaginacionAltoConversionUnidad(Boolean isPermisoPaginacionAltoConversionUnidad) {
		this.isPermisoPaginacionAltoConversionUnidad = isPermisoPaginacionAltoConversionUnidad;
	}
	
	public Boolean getIsPermisoCopiarConversionUnidad() {
		return isPermisoCopiarConversionUnidad;
	}

	public void setIsPermisoCopiarConversionUnidad(Boolean isPermisoCopiarConversionUnidad) {
		this.isPermisoCopiarConversionUnidad = isPermisoCopiarConversionUnidad;
	}
	
	public Boolean getIsPermisoVerFormConversionUnidad() {
		return isPermisoVerFormConversionUnidad;
	}

	public void setIsPermisoVerFormConversionUnidad(Boolean isPermisoVerFormConversionUnidad) {
		this.isPermisoVerFormConversionUnidad = isPermisoVerFormConversionUnidad;
	}
	
	public Boolean getIsPermisoDuplicarConversionUnidad() {
		return isPermisoDuplicarConversionUnidad;
	}

	public void setIsPermisoDuplicarConversionUnidad(Boolean isPermisoDuplicarConversionUnidad) {
		this.isPermisoDuplicarConversionUnidad = isPermisoDuplicarConversionUnidad;
	}
	
	public Boolean getIsPermisoOrdenConversionUnidad() {
		return isPermisoOrdenConversionUnidad;
	}

	public void setIsPermisoOrdenConversionUnidad(Boolean isPermisoOrdenConversionUnidad) {
		this.isPermisoOrdenConversionUnidad = isPermisoOrdenConversionUnidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConversionUnidad() {
		return isVisibilidadCeldaNuevoConversionUnidad;
	}

	public void setIsVisibilidadCeldaNuevoConversionUnidad(Boolean isVisibilidadCeldaNuevoConversionUnidad) {
		this.isVisibilidadCeldaNuevoConversionUnidad = isVisibilidadCeldaNuevoConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConversionUnidad() {
		return isVisibilidadCeldaDuplicarConversionUnidad;
	}

	public void setIsVisibilidadCeldaDuplicarConversionUnidad(Boolean isVisibilidadCeldaDuplicarConversionUnidad) {
		this.isVisibilidadCeldaDuplicarConversionUnidad = isVisibilidadCeldaDuplicarConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConversionUnidad() {
		return isVisibilidadCeldaCopiarConversionUnidad;
	}

	public void setIsVisibilidadCeldaCopiarConversionUnidad(Boolean isVisibilidadCeldaCopiarConversionUnidad) {
		this.isVisibilidadCeldaCopiarConversionUnidad = isVisibilidadCeldaCopiarConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConversionUnidad() {
		return isVisibilidadCeldaVerFormConversionUnidad;
	}

	public void setIsVisibilidadCeldaVerFormConversionUnidad(Boolean isVisibilidadCeldaVerFormConversionUnidad) {
		this.isVisibilidadCeldaVerFormConversionUnidad = isVisibilidadCeldaVerFormConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConversionUnidad() {
		return isVisibilidadCeldaOrdenConversionUnidad;
	}

	public void setIsVisibilidadCeldaOrdenConversionUnidad(Boolean isVisibilidadCeldaOrdenConversionUnidad) {
		this.isVisibilidadCeldaOrdenConversionUnidad = isVisibilidadCeldaOrdenConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConversionUnidad() {
		return isVisibilidadCeldaNuevoRelacionesConversionUnidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConversionUnidad(Boolean isVisibilidadCeldaNuevoRelacionesConversionUnidad) {
		this.isVisibilidadCeldaNuevoRelacionesConversionUnidad = isVisibilidadCeldaNuevoRelacionesConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConversionUnidad() {
		return isVisibilidadCeldaModificarConversionUnidad;
	}

	public void setIsVisibilidadCeldaModificarConversionUnidad(Boolean isVisibilidadCeldaModificarConversionUnidad) {
		this.isVisibilidadCeldaModificarConversionUnidad = isVisibilidadCeldaModificarConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConversionUnidad() {
		return isVisibilidadCeldaActualizarConversionUnidad;
	}

	public void setIsVisibilidadCeldaActualizarConversionUnidad(Boolean isVisibilidadCeldaActualizarConversionUnidad) {
		this.isVisibilidadCeldaActualizarConversionUnidad = isVisibilidadCeldaActualizarConversionUnidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarConversionUnidad() {
		return isVisibilidadCeldaEliminarConversionUnidad;
	}

	public void setIsVisibilidadCeldaEliminarConversionUnidad(Boolean isVisibilidadCeldaEliminarConversionUnidad) {
		this.isVisibilidadCeldaEliminarConversionUnidad = isVisibilidadCeldaEliminarConversionUnidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarConversionUnidad() {
		return isVisibilidadCeldaCancelarConversionUnidad;
	}

	public void setIsVisibilidadCeldaCancelarConversionUnidad(Boolean isVisibilidadCeldaCancelarConversionUnidad) {
		this.isVisibilidadCeldaCancelarConversionUnidad = isVisibilidadCeldaCancelarConversionUnidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarConversionUnidad() {
		return isVisibilidadCeldaGuardarConversionUnidad;
	}

	public void setIsVisibilidadCeldaGuardarConversionUnidad(Boolean isVisibilidadCeldaGuardarConversionUnidad) {
		this.isVisibilidadCeldaGuardarConversionUnidad = isVisibilidadCeldaGuardarConversionUnidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConversionUnidad() {
		return isVisibilidadCeldaGuardarCambiosConversionUnidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConversionUnidad(Boolean isVisibilidadCeldaGuardarCambiosConversionUnidad) {
		this.isVisibilidadCeldaGuardarCambiosConversionUnidad = isVisibilidadCeldaGuardarCambiosConversionUnidad;
	}
		
	public ConversionUnidadSessionBean getconversionunidadSessionBean() {
		return this.conversionunidadSessionBean;
	}
	
	public void setconversionunidadSessionBean(ConversionUnidadSessionBean conversionunidadSessionBean) {
		this.conversionunidadSessionBean=conversionunidadSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdUnidadDesde() {
		return this.isVisibilidadFK_IdUnidadDesde;
	}

	public void setisVisibilidadFK_IdUnidadDesde(Boolean isVisibilidadFK_IdUnidadDesde) {
		this.isVisibilidadFK_IdUnidadDesde=isVisibilidadFK_IdUnidadDesde;
	}

	public Boolean getisVisibilidadFK_IdUnidadHasta() {
		return this.isVisibilidadFK_IdUnidadHasta;
	}

	public void setisVisibilidadFK_IdUnidadHasta(Boolean isVisibilidadFK_IdUnidadHasta) {
		this.isVisibilidadFK_IdUnidadHasta=isVisibilidadFK_IdUnidadHasta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(ConversionUnidad conversionunidad)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(conversionunidad,null);
				this.setActualParaGuardarUnidadDesdeForeignKey(conversionunidad,null);
				this.setActualParaGuardarUnidadHastaForeignKey(conversionunidad,null);
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
	
	public void bugActualizarReferenciaActual(ConversionUnidad conversionunidad,ConversionUnidad conversionunidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConversionUnidad(conversionunidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conversionunidadAux.setId(conversionunidad.getId());
		conversionunidadAux.setVersionRow(conversionunidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConversionUnidad();
		
			int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = conversionunidadValidator.getInvalidValues(this.conversionunidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			conversionunidadLogic.setDatosCliente(datosCliente);
			conversionunidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				conversionunidadAux=new  ConversionUnidad();
				
				conversionunidadAux.setIsNew(true);
				conversionunidadAux.setIsChanged(true);
				
				conversionunidadAux.setConversionUnidadOriginal(this.conversionunidad);
				
				conversionunidadAux.setId(this.conversionunidad.getId());	
				conversionunidadAux.setVersionRow(this.conversionunidad.getVersionRow());	
				conversionunidadAux.setid_empresa(this.conversionunidad.getid_empresa());	
				conversionunidadAux.setid_unidad_desde(this.conversionunidad.getid_unidad_desde());	
				conversionunidadAux.setid_unidad_hasta(this.conversionunidad.getid_unidad_hasta());	
				conversionunidadAux.setvalor(this.conversionunidad.getvalor());	
				conversionunidadAux.setrelacion(this.conversionunidad.getrelacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversionunidadAux,conversionunidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.saveConversionUnidads();//WithConnection
						//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);
					
					this.refrescarForeignKeysDescripcionesConversionUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversionunidadLogic.saveConversionUnidadRelaciones(conversionunidadAux);//WithConnection
								//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conversionunidadAux,conversionunidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				conversionunidadAux=new  ConversionUnidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.conversionunidadSessionBean.getEsGuardarRelacionado() 
					|| (this.conversionunidadSessionBean.getEsGuardarRelacionado() && this.conversionunidad.getId()>=0)) {
						
					conversionunidadAux.setIsNew(false);
				}
				
				conversionunidadAux.setIsDeleted(false);
			
				conversionunidadAux.setId(this.conversionunidad.getId());	
				conversionunidadAux.setVersionRow(this.conversionunidad.getVersionRow());	
				conversionunidadAux.setid_empresa(this.conversionunidad.getid_empresa());	
				conversionunidadAux.setid_unidad_desde(this.conversionunidad.getid_unidad_desde());	
				conversionunidadAux.setid_unidad_hasta(this.conversionunidad.getid_unidad_hasta());	
				conversionunidadAux.setvalor(this.conversionunidad.getvalor());	
				conversionunidadAux.setrelacion(this.conversionunidad.getrelacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversionunidadAux,conversionunidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.saveConversionUnidads();//WithConnection
						//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);
					
					this.refrescarForeignKeysDescripcionesConversionUnidad();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversionunidadLogic.saveConversionUnidadRelaciones(conversionunidadAux);//WithConnection
								//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conversionunidadAux,conversionunidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conversionunidad,conversionunidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				conversionunidadAux=new  ConversionUnidad();
				
				conversionunidadAux.setIsNew(false);
				conversionunidadAux.setIsChanged(false);
				
				conversionunidadAux.setIsDeleted(true);
				
				conversionunidadAux.setId(this.conversionunidad.getId());	
				conversionunidadAux.setVersionRow(this.conversionunidad.getVersionRow());	
				conversionunidadAux.setid_empresa(this.conversionunidad.getid_empresa());	
				conversionunidadAux.setid_unidad_desde(this.conversionunidad.getid_unidad_desde());	
				conversionunidadAux.setid_unidad_hasta(this.conversionunidad.getid_unidad_hasta());	
				conversionunidadAux.setvalor(this.conversionunidad.getvalor());	
				conversionunidadAux.setrelacion(this.conversionunidad.getrelacion());	
				
				if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.conversionunidadAux.getId()>=0) {	
						this.conversionunidadsEliminados.add(conversionunidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversionunidadAux,conversionunidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.saveConversionUnidads();//WithConnection
						//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversionunidadLogic.saveConversionUnidadRelaciones(conversionunidadAux);//WithConnection
								//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
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
							if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(conversionunidadAux,conversionunidadLogic.getConversionUnidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(conversionunidadAux,conversionunidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getConversionUnidads().addAll(this.conversionunidadsEliminados);
					
					conversionunidadLogic.saveConversionUnidads();//WithConnection
					//conversionunidadLogic.getSetVersionRowConversionUnidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConversionUnidad();
				
				this.conversionunidadsEliminados= new ArrayList<ConversionUnidad>();		
			}
			
			if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Conversion Unidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.conversionunidad=conversionunidadAux;
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
      		//this.finishProcessConversionUnidad();
      	}
		
	}	
	
	public void actualizarRelaciones(ConversionUnidad conversionunidadLocal) throws Exception {
		
		if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConversionUnidad conversionunidadLocal) throws Exception {	
		if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				conversionunidadLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidaddesdeBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidaddesdeBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidaddesdeBeanSwingJInternalFrameLocal.getunidad(),true);
				unidaddesdeBeanSwingJInternalFrameLocal.actualizarLista(unidaddesdeBeanSwingJInternalFrameLocal.unidad,this.unidaddesdesForeignKey);

				unidaddesdeBeanSwingJInternalFrameLocal.actualizarRelaciones(unidaddesdeBeanSwingJInternalFrameLocal.unidad);

				conversionunidadLocal.setUnidadDesde(unidaddesdeBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidadDesde();
				this.cargarCombosFrameUnidadDesdesForeignKey("Formulario");
				this.setActualUnidadDesdeForeignKey(unidaddesdeBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadhastaBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadhastaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadhastaBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadhastaBeanSwingJInternalFrameLocal.actualizarLista(unidadhastaBeanSwingJInternalFrameLocal.unidad,this.unidadhastasForeignKey);

				unidadhastaBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadhastaBeanSwingJInternalFrameLocal.unidad);

				conversionunidadLocal.setUnidadHasta(unidadhastaBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidadHasta();
				this.cargarCombosFrameUnidadHastasForeignKey("Formulario");
				this.setActualUnidadHastaForeignKey(unidadhastaBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConversionUnidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conversionunidadValidator.getInvalidValues(this.conversionunidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConversionUnidad conversionunidad,List<ConversionUnidad> conversionunidads) throws Exception {
		try	{		
			ConversionUnidadConstantesFunciones.actualizarLista(conversionunidad,conversionunidads,this.conversionunidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ConversionUnidad conversionunidad,List<ConversionUnidad> conversionunidads) throws Exception {
		try	{			
			ConversionUnidadConstantesFunciones.actualizarSelectedLista(conversionunidad,conversionunidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConversionUnidad> conversionunidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conversionunidadsLocal=this.conversionunidadLogic.getConversionUnidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conversionunidadsLocal=this.conversionunidads;
			}
			//ARCHITECTURE
		
			for(ConversionUnidad conversionunidadLocal:conversionunidadsLocal) {
				if(this.permiteMantenimiento(conversionunidadLocal) && conversionunidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConversionUnidadConstantesFunciones.getConversionUnidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConversionUnidadConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_empresaConversionUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionUnidadConstantesFunciones.IDUNIDADDESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_unidad_desdeConversionUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionUnidadConstantesFunciones.IDUNIDADHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_unidad_hastaConversionUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionUnidadConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelvalorConversionUnidad,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionUnidadConstantesFunciones.RELACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelrelacionConversionUnidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_empresaConversionUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_unidad_desdeConversionUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionUnidad.jLabelid_unidad_hastaConversionUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionUnidad.jLabelvalorConversionUnidad,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionUnidad.jLabelrelacionConversionUnidad,"");
		
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
		this.iIdNuevoConversionUnidad--;	
		
		
		this.conversionunidadAux=new ConversionUnidad();
		
		this.conversionunidadAux.setId(this.iIdNuevoConversionUnidad);
		this.conversionunidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conversionunidadLogic.getConversionUnidads().add(this.conversionunidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conversionunidads.add(this.conversionunidadAux);
		}
		//ARCHITECTURE
		
		this.conversionunidad=this.conversionunidadAux;
		
		if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConversionUnidad(this.conversionunidad);
			this.setVariablesObjetoActualToFormularioForeignKeyConversionUnidad(this.conversionunidad);
		}
				
		//this.setDefaultControlesConversionUnidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConversionUnidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConversionUnidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConversionUnidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConversionUnidad(this.conversionunidadBean,this.conversionunidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConversionUnidadConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
			classes=ConversionUnidadConstantesFunciones.getClassesRelationshipsOfConversionUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.conversionunidadReturnGeneral=conversionunidadLogic.procesarEventosConversionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversionunidadLogic.getConversionUnidads(),this.conversionunidad,this.conversionunidadParameterGeneral,this.isEsNuevoConversionUnidad,classes);//this.conversionunidadLogic.getConversionUnidad()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConversionUnidad(this.conversionunidadReturnGeneral,this.conversionunidadBean,false);
		
		if(this.conversionunidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad());
		}
		
		if(this.conversionunidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad(),classes);//this.conversionunidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConversionUnidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConversionUnidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.RecargarFormConversionUnidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConversionUnidad(false);
						
			if(conversionunidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionUnidad();
			}
			
			this.actualizarVisualTableDatosConversionUnidad();
			
			this.jTableDatosConversionUnidad.setRowSelectionInterval(this.getIndiceNuevoConversionUnidad(), this.getIndiceNuevoConversionUnidad());
			
			this.seleccionarFilaTablaConversionUnidadActual();
						
			this.actualizarEstadoCeldasBotonesConversionUnidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConversionUnidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setEnabled(isHabilitar && this.conversionunidadConstantesFunciones.activarvalorConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setEnabled(isHabilitar && this.conversionunidadConstantesFunciones.activarrelacionConversionUnidad);	
		//
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setEnabled(isHabilitar && this.conversionunidadConstantesFunciones.activarid_empresaConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setEnabled(isHabilitar && this.conversionunidadConstantesFunciones.activarid_unidad_desdeConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setEnabled(isHabilitar && this.conversionunidadConstantesFunciones.activarid_unidad_hastaConversionUnidad);
	};
	
	public void setDefaultControlesConversionUnidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConversionUnidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conversionunidadSessionBean.setConGuardarRelaciones(true);			
			this.conversionunidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.setVisible(true);
			
					
		} else {
			//this.conversionunidadSessionBean.setConGuardarRelaciones(false);			
			this.conversionunidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConversionUnidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
				if(conversionunidadAux.getId().equals(this.iIdNuevoConversionUnidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidads) {
				if(conversionunidadAux.getId().equals(this.iIdNuevoConversionUnidad)) {
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
	
	public int getIndiceActualConversionUnidad(ConversionUnidad conversionunidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
				if(conversionunidadAux.getId().equals(conversionunidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidads) {
				if(conversionunidadAux.getId().equals(conversionunidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConversionUnidad(ConversionUnidad conversionunidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
				if(conversionunidadAux.getConversionUnidadOriginal().getId().equals(conversionunidadOriginal.getId())) {
					existe=true;
					conversionunidadOriginal.setId(conversionunidadAux.getId());
					conversionunidadOriginal.setVersionRow(conversionunidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionUnidad conversionunidadAux:this.conversionunidads) {
				if(conversionunidadAux.getConversionUnidadOriginal().getId().equals(conversionunidadOriginal.getId())) {
					existe=true;
					conversionunidadOriginal.setId(conversionunidadAux.getId());
					conversionunidadOriginal.setVersionRow(conversionunidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConversionUnidad(Boolean esParaCancelar) throws Exception {
		conversionunidadsAux=new ArrayList<ConversionUnidad>();
		conversionunidadAux=new ConversionUnidad();
		
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
					if(conversionunidadAux.getId()<0) {
						conversionunidadsAux.add(conversionunidadAux);
					}		
				}
				this.iIdNuevoConversionUnidad=0L;
				this.conversionunidadLogic.getConversionUnidads().removeAll(conversionunidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionUnidad conversionunidadAux:this.conversionunidads) {
					if(conversionunidadAux.getId()<0) {
						conversionunidadsAux.add(conversionunidadAux);
					}		
				}
				this.iIdNuevoConversionUnidad=0L;
				this.conversionunidads.removeAll(conversionunidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConversionUnidad 
					&& this.conversionunidadLogic.getConversionUnidads().size()>0
					) {
					conversionunidadAux=this.conversionunidadLogic.getConversionUnidads().get(this.conversionunidadLogic.getConversionUnidads().size() - 1);
				
					if(conversionunidadAux.getId()<0) {
						this.conversionunidadLogic.getConversionUnidads().remove(conversionunidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConversionUnidad && this.conversionunidads.size()>0) {
					conversionunidadAux=this.conversionunidads.get(this.conversionunidads.size() - 1);
				
					if(conversionunidadAux.getId()<0) {
						this.conversionunidads.remove(conversionunidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConversionUnidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conversionunidad.getId()<0) {
				this.conversionunidadLogic.getConversionUnidads().remove(this.conversionunidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conversionunidad.getId()<0) {
				this.conversionunidads.remove(this.conversionunidad);
			}
		}			
	}
	
	public void setEstadosInicialesConversionUnidad(List<ConversionUnidad> conversionunidadsAux) throws Exception {
		ConversionUnidadConstantesFunciones.setEstadosInicialesConversionUnidad(conversionunidadsAux);
	}
	
	public void setEstadosInicialesConversionUnidad(ConversionUnidad conversionunidadAux) throws Exception {
		ConversionUnidadConstantesFunciones.setEstadosInicialesConversionUnidad(conversionunidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConversionUnidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConversionUnidadActual()) {
				if(!this.isEsNuevoConversionUnidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConversionUnidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConversionUnidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conversion Unidad ?", "MANTENIMIENTO DE Conversion Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConversionUnidad conversionunidad) throws Exception {
		ConversionUnidadConstantesFunciones.seleccionarAsignar(this.conversionunidad,conversionunidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConversionUnidad=this.isPermisoActualizarOriginalConversionUnidad;
			
			
			this.seleccionarAsignar(conversionunidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConversionUnidadConstantesFunciones.quitarEspaciosConversionUnidad(this.conversionunidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConversionUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conversionunidadSessionBean.setsFuncionBusquedaRapida(this.conversionunidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConversionUnidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConversionUnidad(esParaCancelar);				
				this.cancelarNuevoConversionUnidad(esParaCancelar);								
			}
			
			this.conversionunidad=new ConversionUnidad();
			
			this.inicializarConversionUnidad();
			
			this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConversionUnidad() throws Exception {
		try {
			ConversionUnidadConstantesFunciones.inicializarConversionUnidad(this.conversionunidad);
			
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
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conversionunidadLogic.getConversionUnidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConversionUnidads(String sAccionBusqueda,List<ConversionUnidad> conversionunidadsParaReportes) throws Exception {
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
					sPathReporteFinal="ConversionUnidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConversionUnidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConversionUnidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConversionUnidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conversion Unidades");		
		parameters.put("busquedapor", ConversionUnidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConversionUnidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConversionUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConversionUnidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConversionUnidad=new JRBeanArrayDataSource(ConversionUnidadJInternalFrame.TraerConversionUnidadBeans(conversionunidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConversionUnidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConversionUnidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConversionUnidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConversionUnidadBean.TraerConversionUnidadBeans(conversionunidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConversionUnidadActionPerformed(null);
					//this.generarExcelReporteConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConversionUnidads(sAccionBusqueda,sTipoArchivoReporte,conversionunidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConversionUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionUnidad> conversionunidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionUnidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConversionUnidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConversionUnidad conversionunidad : conversionunidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConversionUnidadConstantesFunciones.generarExcelReporteDataConversionUnidad("NORMAL",row,workbook,conversionunidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConversionUnidad(String sTipo,Row row,Workbook workbook) {
		
		ConversionUnidadConstantesFunciones.generarExcelReporteHeaderConversionUnidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConversionUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionUnidad> conversionunidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConversionUnidad conversionunidad : conversionunidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConversionUnidadConstantesFunciones.getConversionUnidadDescripcion(conversionunidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversionunidad.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversionunidad.getunidaddesde_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversionunidad.getunidadhasta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionUnidadConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversionunidad.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionUnidadConstantesFunciones.LABEL_RELACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_RELACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversionunidad.getrelacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConversionUnidads(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionUnidad> conversionunidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConversionUnidad> conversionunidadsRespaldo=null;
		
		classes=ConversionUnidadConstantesFunciones.getClassesRelationshipsOfConversionUnidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conversionunidadLogic.setDatosCliente(this.datosCliente);
		this.conversionunidadLogic.setDatosDeep(this.datosDeep);
		this.conversionunidadLogic.setIsConDeep(true);
		
		conversionunidadsRespaldo=this.conversionunidadLogic.getConversionUnidads();
		
		this.conversionunidadLogic.setConversionUnidads(conversionunidadsParaReportes);	
		this.conversionunidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conversionunidadsParaReportes=this.conversionunidadLogic.getConversionUnidads();
		this.conversionunidadLogic.setConversionUnidads(conversionunidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionUnidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConversionUnidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConversionUnidad conversionunidad : conversionunidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConversionUnidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConversionUnidadConstantesFunciones.generarExcelReporteDataConversionUnidad("NORMAL",row,workbook,conversionunidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConversionUnidadConstantesFunciones.getConversionUnidadDescripcion(conversionunidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConversionUnidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConversionUnidad() throws Exception {		
		this.startProcessConversionUnidad(true);
	}
	
	public void startProcessConversionUnidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConversionUnidad ,this.jPanelParametrosReportesConversionUnidad, this.jScrollPanelDatosConversionUnidad,this.jPanelPaginacionConversionUnidad, this.jScrollPanelDatosEdicionConversionUnidad, this.jPanelAccionesConversionUnidad,this.jPanelAccionesFormularioConversionUnidad,this.jmenuBarConversionUnidad,this.jmenuBarDetalleConversionUnidad,this.jTtoolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasConversionUnidad=this.jTabbedPaneBusquedasConversionUnidad; 
		
		final JPanel jPanelParametrosReportesConversionUnidad=this.jPanelParametrosReportesConversionUnidad;
		//final JScrollPane jScrollPanelDatosConversionUnidad=this.jScrollPanelDatosConversionUnidad;
		final JTable jTableDatosConversionUnidad=this.jTableDatosConversionUnidad;		
		final JPanel jPanelPaginacionConversionUnidad=this.jPanelPaginacionConversionUnidad;
		//final JScrollPane jScrollPanelDatosEdicionConversionUnidad=this.jScrollPanelDatosEdicionConversionUnidad;
		final JPanel jPanelAccionesConversionUnidad=this.jPanelAccionesConversionUnidad;
		
		JPanel jPanelCamposAuxiliarConversionUnidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConversionUnidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			jPanelCamposAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jPanelCamposConversionUnidad;
			jPanelAccionesFormularioAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jPanelAccionesFormularioConversionUnidad;
		}
		
		final JPanel jPanelCamposConversionUnidad=jPanelCamposAuxiliarConversionUnidad;
		final JPanel jPanelAccionesFormularioConversionUnidad=jPanelAccionesFormularioAuxiliarConversionUnidad;
		
		
		final JMenuBar jmenuBarConversionUnidad=this.jmenuBarConversionUnidad;
		final JToolBar jTtoolBarConversionUnidad=this.jTtoolBarConversionUnidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConversionUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConversionUnidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			jmenuBarDetalleAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jmenuBarDetalleConversionUnidad;
			jTtoolBarDetalleAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jTtoolBarDetalleConversionUnidad;
		}
		
		final JMenuBar jmenuBarDetalleConversionUnidad=jmenuBarDetalleAuxiliarConversionUnidad;
		final JToolBar jTtoolBarDetalleConversionUnidad=jTtoolBarDetalleAuxiliarConversionUnidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConversionUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConversionUnidad;
			processRunnable.jTableDatos=jTableDatosConversionUnidad;
			processRunnable.jPanelCampos=jPanelCamposConversionUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionConversionUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesConversionUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConversionUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarConversionUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConversionUnidad;
			processRunnable.jTtoolBar=jTtoolBarConversionUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConversionUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConversionUnidad ,jPanelParametrosReportesConversionUnidad,jTableDatosConversionUnidad, /*jScrollPanelDatosConversionUnidad,*/jPanelCamposConversionUnidad,jPanelPaginacionConversionUnidad, /*jScrollPanelDatosEdicionConversionUnidad,*/ jPanelAccionesConversionUnidad,jPanelAccionesFormularioConversionUnidad,jmenuBarConversionUnidad,jmenuBarDetalleConversionUnidad,jTtoolBarConversionUnidad,jTtoolBarDetalleConversionUnidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConversionUnidad ,jPanelParametrosReportesConversionUnidad, jScrollPanelDatosConversionUnidad,jPanelPaginacionConversionUnidad, jScrollPanelDatosEdicionConversionUnidad, jPanelAccionesConversionUnidad,jPanelAccionesFormularioConversionUnidad,jmenuBarConversionUnidad,jmenuBarDetalleConversionUnidad,jTtoolBarConversionUnidad,jTtoolBarDetalleConversionUnidad);
						
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
	
	public void finishProcessConversionUnidad() {// throws Exception 
		this.finishProcessConversionUnidad(true);
	}
	
	public void finishProcessConversionUnidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConversionUnidad ,this.jPanelParametrosReportesConversionUnidad, this.jScrollPanelDatosConversionUnidad,this.jPanelPaginacionConversionUnidad, this.jScrollPanelDatosEdicionConversionUnidad, this.jPanelAccionesConversionUnidad,this.jPanelAccionesFormularioConversionUnidad,this.jmenuBarConversionUnidad,this.jmenuBarDetalleConversionUnidad,this.jTtoolBarConversionUnidad,this.jTtoolBarDetalleConversionUnidad);		
		
		final JTabbedPane jTabbedPaneBusquedasConversionUnidad=this.jTabbedPaneBusquedasConversionUnidad; 
		
		final JPanel jPanelParametrosReportesConversionUnidad=this.jPanelParametrosReportesConversionUnidad;
		//final JScrollPane jScrollPanelDatosConversionUnidad=this.jScrollPanelDatosConversionUnidad;
		final JTable jTableDatosConversionUnidad=this.jTableDatosConversionUnidad;		
		final JPanel jPanelPaginacionConversionUnidad=this.jPanelPaginacionConversionUnidad;
		//final JScrollPane jScrollPanelDatosEdicionConversionUnidad=this.jScrollPanelDatosEdicionConversionUnidad;
		final JPanel jPanelAccionesConversionUnidad=this.jPanelAccionesConversionUnidad;
		
		JPanel jPanelCamposAuxiliarConversionUnidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConversionUnidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			jPanelCamposAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jPanelCamposConversionUnidad;
			jPanelAccionesFormularioAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jPanelAccionesFormularioConversionUnidad;
		}
		
		final JPanel jPanelCamposConversionUnidad=jPanelCamposAuxiliarConversionUnidad;
		final JPanel jPanelAccionesFormularioConversionUnidad=jPanelAccionesFormularioAuxiliarConversionUnidad;
		
		
		final JMenuBar jmenuBarConversionUnidad=this.jmenuBarConversionUnidad;		
		final JToolBar jTtoolBarConversionUnidad=this.jTtoolBarConversionUnidad;
				
		JMenuBar jmenuBarDetalleAuxiliarConversionUnidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConversionUnidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			jmenuBarDetalleAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jmenuBarDetalleConversionUnidad;
			jTtoolBarDetalleAuxiliarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jTtoolBarDetalleConversionUnidad;		
		}
		
		final JMenuBar jmenuBarDetalleConversionUnidad=jmenuBarDetalleAuxiliarConversionUnidad;
		final JToolBar jTtoolBarDetalleConversionUnidad=jTtoolBarDetalleAuxiliarConversionUnidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConversionUnidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConversionUnidad;
			processRunnable.jTableDatos=jTableDatosConversionUnidad;
			processRunnable.jPanelCampos=jPanelCamposConversionUnidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionConversionUnidad;
			processRunnable.jPanelAcciones=jPanelAccionesConversionUnidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConversionUnidad;
			
			
			processRunnable.jmenuBar=jmenuBarConversionUnidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConversionUnidad;
			processRunnable.jTtoolBar=jTtoolBarConversionUnidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConversionUnidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConversionUnidad ,jPanelParametrosReportesConversionUnidad, jTableDatosConversionUnidad,/*jScrollPanelDatosConversionUnidad,*/jPanelCamposConversionUnidad,jPanelPaginacionConversionUnidad, /*jScrollPanelDatosEdicionConversionUnidad,*/ jPanelAccionesConversionUnidad,jPanelAccionesFormularioConversionUnidad,jmenuBarConversionUnidad,jmenuBarDetalleConversionUnidad,jTtoolBarConversionUnidad,jTtoolBarDetalleConversionUnidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConversionUnidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConversionUnidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConversionUnidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConversionUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConversionUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConversionUnidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConversionUnidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConversionUnidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConversionUnidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conversionunidadConstantesFunciones.getsFinalQueryConversionUnidad();
		String  finalQueryPaginacionTodos=this.conversionunidadConstantesFunciones.getsFinalQueryConversionUnidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConversionUnidadConstantesFunciones.getArrayColumnasGlobalesNoConversionUnidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConversionUnidadConstantesFunciones.getArrayColumnasGlobalesConversionUnidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConversionUnidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conversionunidadsEliminados= new ArrayList<ConversionUnidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConversionUnidad();
		
				///*ConversionUnidadSessionBean*/this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
			
			if(this.conversionunidadSessionBean==null) {
				this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
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
					this.iNumeroPaginacion=ConversionUnidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConversionUnidadConstantesFunciones.getClassesForeignKeysOfConversionUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conversionunidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conversionunidadsAux= new ArrayList<ConversionUnidad>();
			
				
			conversionunidadLogic.setDatosCliente(this.datosCliente);
			conversionunidadLogic.setDatosDeep(this.datosDeep);
			conversionunidadLogic.setIsConDeep(true);
			
			
			conversionunidadLogic.getConversionUnidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					conversionunidadLogic.getTodosConversionUnidads(finalQueryGlobal,pagination);
					
					//conversionunidadLogic.getTodosConversionUnidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(conversionunidadLogic.getConversionUnidads()==null|| conversionunidadLogic.getConversionUnidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversionunidadsAux= new ArrayList<ConversionUnidad>();
							conversionunidadsAux.addAll(conversionunidadLogic.getConversionUnidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidadsAux= new ArrayList<ConversionUnidad>();
							conversionunidadsAux.addAll(conversionunidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversionunidadLogic.getTodosConversionUnidads(finalQueryGlobal+"",this.pagination);												
							
							//conversionunidadLogic.getTodosConversionUnidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConversionUnidads("Todos",conversionunidadLogic.getConversionUnidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversionunidadLogic.setConversionUnidads(new ArrayList<ConversionUnidad>());					
							conversionunidadLogic.getConversionUnidads().addAll(conversionunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidads=new ArrayList<ConversionUnidad>();
							conversionunidads.addAll(conversionunidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConversionUnidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConversionUnidad=this.idActual;
				
				} else if(this.idConversionUnidadActual!=null && this.idConversionUnidadActual!=0L) {
					idConversionUnidad=idConversionUnidadActual;
				}
				
					
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndicePorId(idConversionUnidad);
				
				this.conversionunidads=new ArrayList<ConversionUnidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					conversionunidadLogic.getEntity(idConversionUnidad);
					
					//conversionunidadLogic.getEntityWithConnection(idConversionUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversionunidadLogic.setConversionUnidads(new ArrayList<ConversionUnidad>());
					conversionunidadLogic.getConversionUnidads().add(conversionunidadLogic.getConversionUnidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversionunidads=new ArrayList<ConversionUnidad>();
					this.conversionunidads.add(conversionunidad);
				}
				
				if(conversionunidadLogic.getConversionUnidad()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversionunidadLogic.getConversionUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversionunidadLogic.getConversionUnidads()==null||conversionunidadLogic.getConversionUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversionunidads==null|| conversionunidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadsAux=new ArrayList<ConversionUnidad>();
						conversionunidadsAux.addAll(conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidadsAux=new ArrayList<ConversionUnidad>();
							conversionunidadsAux.addAll(conversionunidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversionunidadLogic.getConversionUnidadsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionUnidads("FK_IdEmpresa",conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionUnidads("FK_IdEmpresa",conversionunidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.setConversionUnidads(new ArrayList<ConversionUnidad>());
						conversionunidadLogic.getConversionUnidads().addAll(conversionunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidads=new ArrayList<ConversionUnidad>();
							conversionunidads.addAll(conversionunidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidadDesde")) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadDesde(id_unidad_desdeFK_IdUnidadDesde);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversionunidadLogic.getConversionUnidadsFK_IdUnidadDesde(finalQueryGlobal,pagination,id_unidad_desdeFK_IdUnidadDesde);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadDesde(id_unidad_desdeFK_IdUnidadDesde);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadDesde(id_unidad_desdeFK_IdUnidadDesde);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversionunidadLogic.getConversionUnidads()==null||conversionunidadLogic.getConversionUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversionunidads==null|| conversionunidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadsAux=new ArrayList<ConversionUnidad>();
						conversionunidadsAux.addAll(conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidadsAux=new ArrayList<ConversionUnidad>();
							conversionunidadsAux.addAll(conversionunidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversionunidadLogic.getConversionUnidadsFK_IdUnidadDesde(finalQueryGlobal,pagination,id_unidad_desdeFK_IdUnidadDesde);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadDesde(id_unidad_desdeFK_IdUnidadDesde);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadDesde(id_unidad_desdeFK_IdUnidadDesde);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionUnidads("FK_IdUnidadDesde",conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionUnidads("FK_IdUnidadDesde",conversionunidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.setConversionUnidads(new ArrayList<ConversionUnidad>());
						conversionunidadLogic.getConversionUnidads().addAll(conversionunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidads=new ArrayList<ConversionUnidad>();
							conversionunidads.addAll(conversionunidadsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidadHasta")) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadHasta(id_unidad_hastaFK_IdUnidadHasta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversionunidadLogic.getConversionUnidadsFK_IdUnidadHasta(finalQueryGlobal,pagination,id_unidad_hastaFK_IdUnidadHasta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadHasta(id_unidad_hastaFK_IdUnidadHasta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadHasta(id_unidad_hastaFK_IdUnidadHasta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversionunidadLogic.getConversionUnidads()==null||conversionunidadLogic.getConversionUnidads().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversionunidads==null|| conversionunidads.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadsAux=new ArrayList<ConversionUnidad>();
						conversionunidadsAux.addAll(conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidadsAux=new ArrayList<ConversionUnidad>();
							conversionunidadsAux.addAll(conversionunidads);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversionunidadLogic.getConversionUnidadsFK_IdUnidadHasta(finalQueryGlobal,pagination,id_unidad_hastaFK_IdUnidadHasta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadHasta(id_unidad_hastaFK_IdUnidadHasta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionUnidadConstantesFunciones.getDetalleIndiceFK_IdUnidadHasta(id_unidad_hastaFK_IdUnidadHasta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionUnidads("FK_IdUnidadHasta",conversionunidadLogic.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionUnidads("FK_IdUnidadHasta",conversionunidads);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadLogic.setConversionUnidads(new ArrayList<ConversionUnidad>());
						conversionunidadLogic.getConversionUnidads().addAll(conversionunidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidads=new ArrayList<ConversionUnidad>();
							conversionunidads.addAll(conversionunidadsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConversionUnidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConversionUnidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conversionunidadLogic.getConversionUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversionunidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conversionunidadLogic.getConversionUnidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversionunidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConversionUnidad conversionunidad) {
		Boolean permite=true;
		
		if(this.conversionunidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConversionUnidadConstantesFunciones.getOrderByListaConversionUnidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConversionUnidadConstantesFunciones.getOrderByListaConversionUnidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionUnidad conversionunidad:conversionunidadLogic.getConversionUnidads()) {
				if(conversionunidad.getsType().equals(Constantes2.S_TOTALES)) {
					conversionunidadTotales=conversionunidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionUnidad conversionunidad:this.conversionunidads) {
				if(conversionunidad.getsType().equals(Constantes2.S_TOTALES)) {
					conversionunidadTotales=conversionunidad;
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
			this.conversionunidadAux=new ConversionUnidad();
			this.conversionunidadAux.setsType(Constantes2.S_TOTALES);
			this.conversionunidadAux.setIsNew(false);
			this.conversionunidadAux.setIsChanged(false);
			this.conversionunidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConversionUnidadConstantesFunciones.TotalizarValoresFilaConversionUnidad(this.conversionunidadLogic.getConversionUnidads(),this.conversionunidadAux);
				
				this.conversionunidadLogic.getConversionUnidads().add(this.conversionunidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConversionUnidadConstantesFunciones.TotalizarValoresFilaConversionUnidad(this.conversionunidads,this.conversionunidadAux);
				
				this.conversionunidads.add(this.conversionunidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conversionunidadTotales=new ConversionUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conversionunidadLogic.getConversionUnidads().remove(conversionunidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conversionunidads.remove(conversionunidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conversionunidadTotales=new ConversionUnidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionUnidad conversionunidad:conversionunidadLogic.getConversionUnidads()) {
				if(conversionunidad.getsType().equals(Constantes2.S_TOTALES)) {
					conversionunidadTotales=conversionunidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConversionUnidadConstantesFunciones.TotalizarValoresFilaConversionUnidad(this.conversionunidadLogic.getConversionUnidads(),conversionunidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionUnidad conversionunidad:this.conversionunidads) {
				if(conversionunidad.getsType().equals(Constantes2.S_TOTALES)) {
					conversionunidadTotales=conversionunidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConversionUnidadConstantesFunciones.TotalizarValoresFilaConversionUnidad(this.conversionunidads,conversionunidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConversionUnidadsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConversionUnidadsFK_IdUnidadDesde()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadDesde";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConversionUnidadsFK_IdUnidadHasta()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadHasta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConversionUnidadsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversionunidadLogic.getConversionUnidadsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConversionUnidadsFK_IdUnidadDesde(String sFinalQuery,Long id_unidad_desde)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversionunidadLogic.getConversionUnidadsFK_IdUnidadDesde(sFinalQuery,this.pagination,id_unidad_desde);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConversionUnidadsFK_IdUnidadHasta(String sFinalQuery,Long id_unidad_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversionunidadLogic.getConversionUnidadsFK_IdUnidadHasta(sFinalQuery,this.pagination,id_unidad_hasta);
				
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
	
	public void inicializarPermisosConversionUnidad() {
		this.isPermisoTodoConversionUnidad=false;
		this.isPermisoNuevoConversionUnidad=false;
		this.isPermisoActualizarConversionUnidad=false;
		this.isPermisoActualizarOriginalConversionUnidad=false;
		this.isPermisoEliminarConversionUnidad=false;
		this.isPermisoGuardarCambiosConversionUnidad=false;
		this.isPermisoConsultaConversionUnidad=false;
		this.isPermisoBusquedaConversionUnidad=false;
		this.isPermisoReporteConversionUnidad=false;		
		this.isPermisoOrdenConversionUnidad=false;		
		this.isPermisoPaginacionMedioConversionUnidad=false;		
		this.isPermisoPaginacionAltoConversionUnidad=false;
		this.isPermisoPaginacionTodoConversionUnidad=false;
		this.isPermisoCopiarConversionUnidad=false;		
		this.isPermisoVerFormConversionUnidad=false;		
		this.isPermisoDuplicarConversionUnidad=false;		
		this.isPermisoOrdenConversionUnidad=false;		
	}
	
	public void setPermisosUsuarioConversionUnidad(Boolean isPermiso) {
		this.isPermisoTodoConversionUnidad=isPermiso;
		this.isPermisoNuevoConversionUnidad=isPermiso;
		this.isPermisoActualizarConversionUnidad=isPermiso;
		this.isPermisoActualizarOriginalConversionUnidad=isPermiso;
		this.isPermisoEliminarConversionUnidad=isPermiso;
		this.isPermisoGuardarCambiosConversionUnidad=isPermiso;
		this.isPermisoConsultaConversionUnidad=isPermiso;
		this.isPermisoBusquedaConversionUnidad=isPermiso;
		this.isPermisoReporteConversionUnidad=isPermiso;
		this.isPermisoOrdenConversionUnidad=isPermiso;		
		this.isPermisoPaginacionMedioConversionUnidad=isPermiso;		
		this.isPermisoPaginacionAltoConversionUnidad=isPermiso;		
		this.isPermisoPaginacionTodoConversionUnidad=isPermiso;		
		this.isPermisoCopiarConversionUnidad=isPermiso;		
		this.isPermisoVerFormConversionUnidad=isPermiso;		
		this.isPermisoDuplicarConversionUnidad=isPermiso;
		this.isPermisoOrdenConversionUnidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConversionUnidad(Boolean isPermiso) {
		//this.isPermisoTodoConversionUnidad=isPermiso;
		this.isPermisoNuevoConversionUnidad=isPermiso;
		this.isPermisoActualizarConversionUnidad=isPermiso;
		this.isPermisoActualizarOriginalConversionUnidad=isPermiso;
		this.isPermisoEliminarConversionUnidad=isPermiso;
		this.isPermisoGuardarCambiosConversionUnidad=isPermiso;
		//this.isPermisoConsultaConversionUnidad=isPermiso;
		//this.isPermisoBusquedaConversionUnidad=isPermiso;
		//this.isPermisoReporteConversionUnidad=isPermiso;
		//this.isPermisoOrdenConversionUnidad=isPermiso;		
		//this.isPermisoPaginacionMedioConversionUnidad=isPermiso;		
		//this.isPermisoPaginacionAltoConversionUnidad=isPermiso;		
		//this.isPermisoPaginacionTodoConversionUnidad=isPermiso;		
		//this.isPermisoCopiarConversionUnidad=isPermiso;		
		//this.isPermisoDuplicarConversionUnidad=isPermiso;
		//this.isPermisoOrdenConversionUnidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConversionUnidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConversionUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConversionUnidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConversionUnidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConversionUnidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConversionUnidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConversionUnidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConversionUnidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConversionUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConversionUnidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConversionUnidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConversionUnidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConversionUnidad=this.isPermisoActualizarConversionUnidad;
			this.isPermisoEliminarConversionUnidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConversionUnidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConversionUnidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConversionUnidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConversionUnidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConversionUnidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConversionUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConversionUnidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConversionUnidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConversionUnidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConversionUnidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConversionUnidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConversionUnidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConversionUnidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConversionUnidad.setToolTipText(this.jTableDatosConversionUnidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConversionUnidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConversionUnidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConversionUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConversionUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConversionUnidad() throws Exception {
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
	public void inicializarCombosForeignKeyConversionUnidadListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.unidaddesdesForeignKey=new ArrayList();
				this.unidadhastasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConversionUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConversionUnidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConversionUnidadListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadDesdeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadHastaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyUnidadDesdeListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidaddesdesForeignKey==null||this.unidaddesdesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadDesdesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadHastaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadhastasForeignKey==null||this.unidadhastasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadHastasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyConversionUnidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConversionUnidadParameterReturnGeneral conversionunidadReturnGeneral=new ConversionUnidadParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.conversionunidadConstantesFunciones.cargarid_empresaConversionUnidad)
					 || (this.esRecargarFks && this.conversionunidadConstantesFunciones.cargarid_empresaConversionUnidad)) {

					if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+conversionunidadSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalUnidadDesde="";

				if(((this.unidaddesdesForeignKey==null||this.unidaddesdesForeignKey.size()<=0) && this.conversionunidadConstantesFunciones.cargarid_unidad_desdeConversionUnidad)
					 || (this.esRecargarFks && this.conversionunidadConstantesFunciones.cargarid_unidad_desdeConversionUnidad)) {

					if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadDesde()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidadDesde=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidadDesde=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidadDesde, "");
						finalQueryGlobalUnidadDesde+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadDesdesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidadDesde=" WHERE " + ConstantesSql.ID + "="+conversionunidadSessionBean.getlidUnidadDesdeActual();
					}
				} else {
					finalQueryGlobalUnidadDesde="NONE";
				}


				String finalQueryGlobalUnidadHasta="";

				if(((this.unidadhastasForeignKey==null||this.unidadhastasForeignKey.size()<=0) && this.conversionunidadConstantesFunciones.cargarid_unidad_hastaConversionUnidad)
					 || (this.esRecargarFks && this.conversionunidadConstantesFunciones.cargarid_unidad_hastaConversionUnidad)) {

					if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadHasta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidadHasta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidadHasta=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidadHasta, "");
						finalQueryGlobalUnidadHasta+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadHastasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidadHasta=" WHERE " + ConstantesSql.ID + "="+conversionunidadSessionBean.getlidUnidadHastaActual();
					}
				} else {
					finalQueryGlobalUnidadHasta="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				conversionunidadReturnGeneral=conversionunidadLogic.cargarCombosLoteForeignKeyConversionUnidad(finalQueryGlobalEmpresa,finalQueryGlobalUnidadDesde,finalQueryGlobalUnidadHasta);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=conversionunidadReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalUnidadDesde.equals("NONE")) {
				this.unidaddesdesForeignKey=conversionunidadReturnGeneral.getunidaddesdesForeignKey();
			}

			if(!finalQueryGlobalUnidadHasta.equals("NONE")) {
				this.unidadhastasForeignKey=conversionunidadReturnGeneral.getunidadhastasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConversionUnidad()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyUnidadDesde();
			this.addItemDefectoCombosForeignKeyUnidadHasta();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.conversionunidadSessionBean==null) {
				this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
			}

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyUnidadDesde()throws Exception {
		try {

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadDesde()) {
				Unidad unidaddesde=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidaddesde,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidaddesde.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidaddesdesForeignKey,unidaddesde,true)) {

					this.unidaddesdesForeignKey.add(0,unidaddesde);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidadHasta()throws Exception {
		try {

			if(!this.conversionunidadSessionBean.getisBusquedaDesdeForeignKeySesionUnidadHasta()) {
				Unidad unidadhasta=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidadhasta,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidadhasta.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadhastasForeignKey,unidadhasta,true)) {

					this.unidadhastasForeignKey.add(0,unidadhasta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConversionUnidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConversionUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConversionUnidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConversionUnidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConversionUnidad(ConversionUnidad conversionunidad)throws Exception {	
		try {
			
			this.setActualUnidadDesdeForeignKey(conversionunidad.getid_unidad_desde(),false,"Formulario");
			this.setActualUnidadHastaForeignKey(conversionunidad.getid_unidad_hasta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConversionUnidad(ConversionUnidad conversionunidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConversionUnidad()throws Exception {	
		try {
			
			this.setActualUnidadDesdeForeignKey(this.conversionunidadConstantesFunciones.getid_unidad_desde(),false,"Formulario");
			this.setActualUnidadHastaForeignKey(this.conversionunidadConstantesFunciones.getid_unidad_hasta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConversionUnidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConversionUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConversionUnidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConversionUnidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConversionUnidad()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameUnidadDesdesForeignKey("Todos");
			this.cargarCombosFrameUnidadHastasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConversionUnidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadDesdesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadHastasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConversionUnidad()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ConversionUnidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConversionUnidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConversionUnidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conversionunidadSessionBean=new ConversionUnidadSessionBean(); 
		this.conversionunidadConstantesFunciones=new ConversionUnidadConstantesFunciones(); 
		this.conversionunidadBean=new ConversionUnidad();//(this.conversionunidadConstantesFunciones); 		
		this.conversionunidadReturnGeneral=new ConversionUnidadParameterReturnGeneral(); 
		
		this.conversionunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversionunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConversionUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConversionUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConversionUnidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConversionUnidad(true);
			
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
			
			this.conversionunidadConstantesFunciones=new ConversionUnidadConstantesFunciones(); 
			this.conversionunidadBean=new ConversionUnidad();//this.conversionunidadConstantesFunciones); 			
			this.conversionunidadReturnGeneral=new ConversionUnidadParameterReturnGeneral(); 
		
			ConversionUnidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conversion Unidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.conversionunidad=new ConversionUnidad();
			this.conversionunidads = new ArrayList<ConversionUnidad>();
			this.conversionunidadsAux = new ArrayList<ConversionUnidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic=new ConversionUnidadLogic();
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			//this.conversionunidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conversionunidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConversionUnidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConversionUnidad);	
					}
					
					if(this.jInternalFrameImportacionConversionUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConversionUnidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConversionUnidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConversionUnidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConversionUnidad);
				this.jInternalFrameDetalleFormConversionUnidad.setVisible(false);
				this.jInternalFrameDetalleFormConversionUnidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConversionUnidad);
					this.jInternalFrameReporteDinamicoConversionUnidad.setVisible(false);
					this.jInternalFrameReporteDinamicoConversionUnidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConversionUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConversionUnidad);
					this.jInternalFrameImportacionConversionUnidad.setVisible(false);
					this.jInternalFrameImportacionConversionUnidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConversionUnidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConversionUnidad);
					this.jInternalFrameOrderByConversionUnidad.setVisible(false);
					this.jInternalFrameOrderByConversionUnidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConversionUnidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConversionUnidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conversionunidadReturnGeneral=new ConversionUnidadParameterReturnGeneral();
			
			this.conversionunidadParameterGeneral=new ConversionUnidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conversionunidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConversionUnidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConversionUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conversionunidadSessionBean.getEsGuardarRelacionado(),this.conversionunidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConversionUnidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conversionunidadSessionBean.getEsGuardarRelacionado(),this.conversionunidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaDuplicarConversionUnidad=true;
			this.isVisibilidadCeldaCopiarConversionUnidad=true;
			this.isVisibilidadCeldaVerFormConversionUnidad=true;
			this.isVisibilidadCeldaOrdenConversionUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=false;
			this.isVisibilidadCeldaGuardarConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdUnidadDesde=true;
			this.isVisibilidadFK_IdUnidadHasta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConversionUnidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConversionUnidad(false);
			
			this.setPermisosUsuarioConversionUnidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado() 
				|| (this.conversionunidadSessionBean.getEsGuardarRelacionado() && this.conversionunidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConversionUnidadClasesRelacionadas();
			}
			
			if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConversionUnidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConversionUnidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConversionUnidad();
			}
			
			if(!this.isPermisoBusquedaConversionUnidad) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConversionUnidad,this.isPermisoPaginacionMedioConversionUnidad,this.isPermisoPaginacionTodoConversionUnidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConversionUnidadConstantesFunciones.getTiposSeleccionarConversionUnidad());
				
				this.tiposColumnasSelect=ConversionUnidadConstantesFunciones.getTiposSeleccionarConversionUnidad(true);
				
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
			//if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConversionUnidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioConversionUnidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioConversionUnidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionUnidad() ;
			
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
			this.unidaddesdeLogic=new UnidadLogic();
			this.unidadhastaLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				conversionunidadImplementable= (ConversionUnidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConversionUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conversionunidadImplementableHome= (ConversionUnidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConversionUnidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conversionunidads= new ArrayList<ConversionUnidad>();
			this.conversionunidadsEliminados= new ArrayList<ConversionUnidad>();
						
			this.isEsNuevoConversionUnidad=false;
			this.esParaAccionDesdeFormularioConversionUnidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.unidaddesdesForeignKey=new ArrayList<Unidad>() ;
			this.unidadhastasForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConversionUnidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConversionUnidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConversionUnidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConversionUnidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConversionUnidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConversionUnidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConversionUnidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConversionUnidad();
			}
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConversionUnidad.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConversionUnidad.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConversionUnidad.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConversionUnidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConversionUnidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConversionUnidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConversionUnidad")) {
				iIndex=this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConversionUnidad();	
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
	
	public void cargarCombosForeignKeyConversionUnidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConversionUnidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConversionUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConversionUnidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConversionUnidad();
		
		this.cargarCombosFrameForeignKeyConversionUnidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConversionUnidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConversionUnidad();
		}
	}
	
	

	public void cargarCombosForeignKeyUnidadDesde(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadDesdeListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidadDesde();
				this.cargarCombosFrameUnidadDesdesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidadDesde(this.unidaddesdesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadHasta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadHastaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidadHasta();
				this.cargarCombosFrameUnidadHastasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidadHasta(this.unidadhastasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConversionUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			
			if(jTableDatosConversionUnidad.getRowCount()>=1) {
				jTableDatosConversionUnidad.removeRowSelectionInterval(0, jTableDatosConversionUnidad.getRowCount()-1);						
			}
			
			this.isEsNuevoConversionUnidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConversionUnidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConversionUnidad(true);			
			//this.conversionunidad=new ConversionUnidad();
			//this.conversionunidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionUnidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionUnidad() ;
			
			if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionUnidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conversionunidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);				
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConversionUnidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConversionUnidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConversionUnidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConversionUnidad.getSelectedRows().length;			
			}
			
			conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConversionUnidad--;			
				//ConversionUnidad conversionunidadAux= new ConversionUnidad();			
				//conversionunidadAux.setId(this.iIdNuevoConversionUnidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConversionUnidad conversionunidadOrigen=new ConversionUnidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConversionUnidad conversionunidadOrigen : conversionunidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conversionunidadOrigen =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversionunidadOrigen =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConversionUnidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conversionunidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConversionUnidad(conversionunidadOrigen,this.conversionunidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conversionunidadLogic.getConversionUnidads().add(this.conversionunidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conversionunidads.add(this.conversionunidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConversionUnidad(false);
				
				this.jTableDatosConversionUnidad.setRowSelectionInterval(this.getIndiceNuevoConversionUnidad(), this.getIndiceNuevoConversionUnidad());
				
				int iLastRow =  this.jTableDatosConversionUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConversionUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConversionUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionUnidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();									
		
			ConversionUnidad conversionunidadOrigen=new ConversionUnidad();
			ConversionUnidad conversionunidadDestino=new ConversionUnidad();
				
			conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConversionUnidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conversionunidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConversionUnidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadOrigen =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conversionunidadOrigen =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversionunidadDestino =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conversionunidadDestino =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conversionunidadOrigen =conversionunidadsSeleccionados.get(0);
				conversionunidadDestino =conversionunidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConversionUnidad(conversionunidadOrigen,conversionunidadDestino,true,false);
				
				conversionunidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conversionunidadDestino,conversionunidadLogic.getConversionUnidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversionunidadDestino,conversionunidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConversionUnidad(false);
				
				//this.jTableDatosConversionUnidad.setRowSelectionInterval(this.getIndiceNuevoConversionUnidad(), this.getIndiceNuevoConversionUnidad());
				
				int iLastRow =  this.jTableDatosConversionUnidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConversionUnidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConversionUnidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionUnidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConversionUnidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConversionUnidad.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConversionUnidad.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConversionUnidad.setVisible(!isVisible);
			this.jPanelPaginacionConversionUnidad.setVisible(!isVisible);
			this.jPanelAccionesConversionUnidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConversionUnidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConversionUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConversionUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConversionUnidad();
			
			this.abrirFrameOrderByConversionUnidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConversionUnidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConversionUnidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConversionUnidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConversionUnidad.isMaximum()) {
					this.jInternalFrameDetalleFormConversionUnidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConversionUnidad.setSize(this.jInternalFrameDetalleFormConversionUnidad.iWidthFormulario,this.jInternalFrameDetalleFormConversionUnidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConversionUnidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConversionUnidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConversionUnidad.isMaximum()) {
						this.jInternalFrameDetalleFormConversionUnidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConversionUnidad.jContentPaneDetalleConversionUnidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConversionUnidad.jContentPaneDetalleConversionUnidad.getWidth(),ConversionUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConversionUnidad.jContentPaneDetalleConversionUnidad.getWidth(),ConversionUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConversionUnidad.jContentPaneDetalleConversionUnidad.getWidth(),ConversionUnidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConversionUnidad.setVisible(true);
	        this.jInternalFrameDetalleFormConversionUnidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConversionUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConversionUnidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConversionUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionUnidad,false,this);
				} else {
					this.jInternalFrameOrderByConversionUnidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionUnidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConversionUnidad);
				this.jInternalFrameOrderByConversionUnidad.setVisible(false);
				this.jInternalFrameOrderByConversionUnidad.setSelected(false);
				
				this.jInternalFrameOrderByConversionUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConversionUnidad"));
				
				this.inicializarActualizarBindingTablaOrderByConversionUnidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConversionUnidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConversionUnidad==null) {
				
				this.jInternalFrameImportacionConversionUnidad=new ImportacionJInternalFrame(ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConversionUnidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConversionUnidad);
				this.jInternalFrameImportacionConversionUnidad.setVisible(false);
				this.jInternalFrameImportacionConversionUnidad.setSelected(false);


				this.jInternalFrameImportacionConversionUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConversionUnidad"));
				this.jInternalFrameImportacionConversionUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConversionUnidad"));
				this.jInternalFrameImportacionConversionUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConversionUnidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConversionUnidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConversionUnidad==null) {
				this.jInternalFrameReporteDinamicoConversionUnidad=new ReporteDinamicoJInternalFrame(ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConversionUnidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConversionUnidad);
				this.jInternalFrameReporteDinamicoConversionUnidad.setVisible(false);
				this.jInternalFrameReporteDinamicoConversionUnidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionUnidad"));
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionUnidad"));
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionUnidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionUnidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConversionUnidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConversionUnidad);
			
	       	this.jInternalFrameDetalleFormConversionUnidad.setVisible(false);
	        this.jInternalFrameDetalleFormConversionUnidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormConversionUnidad.dispose();
			//this.jInternalFrameDetalleFormConversionUnidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConversionUnidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConversionUnidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoConversionUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConversionUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConversionUnidad.setVisible(true);
	        this.jInternalFrameImportacionConversionUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConversionUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConversionUnidad.setVisible(true);
	        this.jInternalFrameOrderByConversionUnidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConversionUnidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConversionUnidad.setVisible(false);
	        this.jInternalFrameOrderByConversionUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConversionUnidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConversionUnidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoConversionUnidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConversionUnidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConversionUnidad.setVisible(false);
	        this.jInternalFrameImportacionConversionUnidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConversionUnidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConversionUnidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConversionUnidad(true);
			//this.isEsNuevoConversionUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConversionUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionUnidad(false) ;
			
			if(conversionunidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionUnidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConversionUnidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConversionUnidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConversionUnidad(true);
			//this.isEsNuevoConversionUnidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conversionunidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConversionUnidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConversionUnidad(false) ;
			
			if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionUnidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionUnidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaUnidadDesde(List<Unidad> unidaddesdesForeignKey)throws Exception{
		TableColumn tableColumnUnidadDesde=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE));
		TableCellEditor tableCellEditorUnidadDesde =tableColumnUnidadDesde.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidadDesde;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidaddesdesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConversionUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidaddesdesForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidadHasta(List<Unidad> unidadhastasForeignKey)throws Exception{
		TableColumn tableColumnUnidadHasta=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA));
		TableCellEditor tableCellEditorUnidadHasta =tableColumnUnidadHasta.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidadHasta;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadhastasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConversionUnidad.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadhastasForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConversionUnidad(false);
			
			//if(!this.isEsNuevoConversionUnidad) {								
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				
			}
			
			if(this.permiteMantenimiento(this.conversionunidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConversionUnidad=true;
					this.inicializarActualizarBindingTablaConversionUnidad(false);
					this.isEsNuevoConversionUnidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConversionUnidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConversionUnidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConversionUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionUnidad(false);
				
				this.habilitarDeshabilitarControlesConversionUnidad(false);
			
												
				
				if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConversionUnidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConversionUnidadActionPerformed(evt,conversionunidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConversionUnidad(this.conversionunidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConversionUnidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conversionunidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conversionunidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				this.conversionunidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				this.conversionunidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conversionunidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConversionUnidadModel) this.jTableDatosConversionUnidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConversionUnidad=true;
				this.inicializarActualizarBindingTablaConversionUnidad(false);
				this.isEsNuevoConversionUnidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConversionUnidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionUnidad(false);
				
				this.habilitarDeshabilitarControlesConversionUnidad(false);
				
				
				
				if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConversionUnidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConversionUnidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConversionUnidad.getRowCount()>=1) {
				jTableDatosConversionUnidad.removeRowSelectionInterval(0, jTableDatosConversionUnidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConversionUnidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConversionUnidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionUnidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionUnidad(false) ;
			
			this.isEsNuevoConversionUnidad=false;
			
			if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConversionUnidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConversionUnidad(false);
				
				//SI ES MANUAL
				if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConversionUnidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConversionUnidad--;			
			//ConversionUnidad conversionunidadAux= new ConversionUnidad();			
			//conversionunidadAux.setId(this.iIdNuevoConversionUnidad);
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConversionUnidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
			
			this.conversionunidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conversionunidadLogic.getConversionUnidads().add(this.conversionunidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conversionunidads.add(this.conversionunidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConversionUnidad(false);
			
			this.jTableDatosConversionUnidad.setRowSelectionInterval(this.getIndiceNuevoConversionUnidad(), this.getIndiceNuevoConversionUnidad());
			
			int iLastRow =  this.jTableDatosConversionUnidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConversionUnidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConversionUnidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConversionUnidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionUnidad(false);
			
			//SI ES MANUAL
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionUnidad();
			}
			
			//this.abrirFrameTreeConversionUnidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Conversion UnidadES ?", "MANTENIMIENTO DE Conversion Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConversionUnidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConversionUnidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.conversionunidadReturnGeneral=conversionunidadLogic.procesarImportacionConversionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.conversionunidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConversionUnidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConversionUnidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConversionUnidad.setFileImportacion(this.jInternalFrameImportacionConversionUnidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConversionUnidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConversionUnidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConversionUnidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConversionUnidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		

		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConversionUnidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConversionUnidadBaseDesign.jrxml";
			
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
			
			this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UnidadDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UnidadDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UnidadDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UnidadDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UnidadHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UnidadHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UnidadHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UnidadHasta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionUnidadConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionUnidadConstantesFunciones.LABEL_RELACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConversionUnidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE:
					sNombreCampoCategoria="id_unidad_desde";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA:
					sNombreCampoCategoria="id_unidad_hasta";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_RELACION:
					sNombreCampoCategoria="relacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE:
					sNombreCampoCategoriaValor="id_unidad_desde";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA:
					sNombreCampoCategoriaValor="id_unidad_hasta";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ConversionUnidadConstantesFunciones.LABEL_RELACION:
					sNombreCampoCategoriaValor="relacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad_desde");
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad_hasta");
					break;

				case ConversionUnidadConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ConversionUnidadConstantesFunciones.LABEL_RELACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Relacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"relacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoConversionUnidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConversionUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConversionUnidad conversionunidad:conversionunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversionunidad.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE);
					iRow++;

					for(ConversionUnidad conversionunidad:conversionunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversionunidad.getunidaddesde_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA);
					iRow++;

					for(ConversionUnidad conversionunidad:conversionunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversionunidad.getunidadhasta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionUnidadConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ConversionUnidad conversionunidad:conversionunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversionunidad.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionUnidadConstantesFunciones.LABEL_RELACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_RELACION);
					iRow++;

					for(ConversionUnidad conversionunidad:conversionunidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversionunidad.getrelacion());
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
			//	this.getFilaCabeceraExportarExcelConversionUnidad(row);				
			//	iRow++;
			//}				
			
			//for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConversionUnidad(conversionunidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionUnidad(false);
			
			//SI ES MANUAL
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionUnidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionUnidad(false);
			
			//SI ES MANUAL
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConversionUnidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConversionUnidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionUnidad(false);
			
			//SI ES MANUAL
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConversionUnidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConversionUnidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConversionUnidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConversionUnidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConversionUnidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConversionUnidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConversionUnidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosConversionUnidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosConversionUnidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConversionUnidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConversionUnidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConversionUnidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConversionUnidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConversionUnidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConversionUnidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionUnidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConversionUnidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConversionUnidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConversionUnidad();
		
		this.inicializarActualizarBindingBotonesManualConversionUnidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConversionUnidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionUnidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConversionUnidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConversionUnidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConversionUnidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConversionUnidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConversionUnidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionNuevoConversionUnidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionSinCerrarConversionUnidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionSinMensajeConversionUnidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConversionUnidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConversionUnidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConversionUnidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
				this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionNuevoConversionUnidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionSinCerrarConversionUnidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConversionUnidad.jCheckBoxPostAccionSinMensajeConversionUnidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConversionUnidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConversionUnidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConversionUnidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConversionUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConversionUnidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConversionUnidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConversionUnidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConversionUnidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConversionUnidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConversionUnidad(Boolean esInicializar) throws Exception {
		try	{	
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConversionUnidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConversionUnidad() throws Exception {
		try	{
			if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConversionUnidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConversionUnidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConversionUnidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConversionUnidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConversionUnidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConversionUnidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConversionUnidad.addItem(reporte);
			}
			
			
			if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConversionUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConversionUnidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConversionUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConversionUnidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConversionUnidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConversionUnidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConversionUnidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionUnidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionUnidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
				this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
				this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConversionUnidadConstantesFunciones.getTiposSeleccionarConversionUnidad(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConversionUnidadConstantesFunciones.getTiposSeleccionarConversionUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConversionUnidadConstantesFunciones.getTiposSeleccionarConversionUnidad(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionUnidad.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConversionUnidad.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConversionUnidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.getSelectedItem()!=null){this.id_unidad_desdeFK_IdUnidadDesde=((Unidad)this.jComboBoxid_unidad_desdeFK_IdUnidadDesdeConversionUnidad.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.getSelectedItem()!=null){this.id_unidad_hastaFK_IdUnidadHasta=((Unidad)this.jComboBoxid_unidad_hastaFK_IdUnidadHastaConversionUnidad.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConversionUnidad(Boolean esInicializar) throws Exception {				
		if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConversionUnidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConversionUnidad() throws Exception {
		this.inicializarActualizarBindingTablaConversionUnidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConversionUnidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConversionUnidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConversionUnidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conversionunidadLogic.getConversionUnidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conversionunidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConversionUnidad.setModel(new ConversionUnidadModel(this.conversionunidadLogic.getConversionUnidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConversionUnidad.setModel(new ConversionUnidadModel(this.conversionunidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConversionUnidad!=null && this.jInternalFrameOrderByConversionUnidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConversionUnidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,conversionunidadConstantesFunciones.resaltarSeleccionarConversionUnidad,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConversionUnidadConstantesFunciones.SCLASSWEBTITULO,conversionunidadConstantesFunciones.resaltarSeleccionarConversionUnidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_ID));

		if(this.conversionunidadConstantesFunciones.mostraridConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conversionunidadConstantesFunciones.resaltaridConversionUnidad,this.conversionunidadConstantesFunciones.activaridConversionUnidad,iSizeTabla,this,true,"idConversionUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversionunidadConstantesFunciones.resaltaridConversionUnidad,this.conversionunidadConstantesFunciones.activaridConversionUnidad,this,true,"idConversionUnidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA));

		if(this.conversionunidadConstantesFunciones.mostrarid_empresaConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.conversionunidadConstantesFunciones.resaltarid_empresaConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_empresaConversionUnidad,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.conversionunidadConstantesFunciones.resaltarid_empresaConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_empresaConversionUnidad,false,"id_empresaConversionUnidad","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE));

		if(this.conversionunidadConstantesFunciones.mostrarid_unidad_desdeConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidaddesdesForeignKey,this.conversionunidadConstantesFunciones.resaltarid_unidad_desdeConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_unidad_desdeConversionUnidad,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidaddesdesForeignKey,this.conversionunidadConstantesFunciones.resaltarid_unidad_desdeConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_unidad_desdeConversionUnidad,true,"id_unidad_desdeConversionUnidad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA));

		if(this.conversionunidadConstantesFunciones.mostrarid_unidad_hastaConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadhastasForeignKey,this.conversionunidadConstantesFunciones.resaltarid_unidad_hastaConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_unidad_hastaConversionUnidad,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadhastasForeignKey,this.conversionunidadConstantesFunciones.resaltarid_unidad_hastaConversionUnidad,this,this.conversionunidadConstantesFunciones.activarid_unidad_hastaConversionUnidad,true,"id_unidad_hastaConversionUnidad","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_VALOR));

		if(this.conversionunidadConstantesFunciones.mostrarvalorConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conversionunidadConstantesFunciones.resaltarvalorConversionUnidad,this.conversionunidadConstantesFunciones.activarvalorConversionUnidad,iSizeTabla,this,true,"valorConversionUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversionunidadConstantesFunciones.resaltarvalorConversionUnidad,this.conversionunidadConstantesFunciones.activarvalorConversionUnidad,this,true,"valorConversionUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,ConversionUnidadConstantesFunciones.LABEL_RELACION));

		if(this.conversionunidadConstantesFunciones.mostrarrelacionConversionUnidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionUnidadConstantesFunciones.LABEL_RELACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conversionunidadConstantesFunciones.resaltarrelacionConversionUnidad,this.conversionunidadConstantesFunciones.activarrelacionConversionUnidad,iSizeTabla,this,true,"relacionConversionUnidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversionunidadConstantesFunciones.resaltarrelacionConversionUnidad,this.conversionunidadConstantesFunciones.activarrelacionConversionUnidad,this,true,"relacionConversionUnidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConversionUnidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConversionUnidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConversionUnidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conversionunidadSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConversionUnidad.addColumn(tableColumn);
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
			
			this.jTableDatosConversionUnidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConversionUnidad.moveColumn(this.jTableDatosConversionUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConversionUnidad.moveColumn(this.jTableDatosConversionUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConversionUnidad.moveColumn(this.jTableDatosConversionUnidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConversionUnidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConversionUnidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConversionUnidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConversionUnidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConversionUnidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConversionUnidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConversionUnidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConversionUnidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=conversionunidadLogic.getConversionUnidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=conversionunidads.size()-1;
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
		//this.jTableDatosConversionUnidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConversionUnidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConversionUnidad();
			
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
				
				//this.isEsNuevoConversionUnidad=false;
					
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
				if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConversionUnidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConversionUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConversionUnidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conversionunidad.getsType().equals("DUPLICADO")
				   || this.conversionunidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConversionUnidad=true;
				
				} else {
					this.isEsNuevoConversionUnidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					if(this.conversionunidad.getId()>=0 && !this.conversionunidad.getIsNew()) {						
						this.isEsNuevoConversionUnidad=false;
						
					} else {
						this.isEsNuevoConversionUnidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConversionUnidad(esRelaciones);						
				
				this.seleccionarConversionUnidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conversionunidad.getId()<0) {
					this.isEsNuevoConversionUnidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConversionUnidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConversionUnidad(evt,rowIndex);
				}	
				
				if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConversionUnidad: " + this.dDif); 
					}
				}								
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConversionUnidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conversionunidad)) {
					if(this.conversionunidad.getId()>0) {
						this.conversionunidad.setIsDeleted(true);
						
						this.conversionunidadsEliminados.add(this.conversionunidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conversionunidadLogic.getConversionUnidads().remove(this.conversionunidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conversionunidads.remove(this.conversionunidad);				
					}
					
					
					((ConversionUnidadModel) this.jTableDatosConversionUnidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionUnidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConversionUnidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConversionUnidad) {
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConversionUnidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConversionUnidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConversionUnidad(this.conversionunidad);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.conversionunidadConstantesFunciones.cargarid_empresaConversionUnidad || this.conversionunidadConstantesFunciones.event_dependid_empresaConversionUnidad) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.conversionunidad.getid_empresa());
									//this.inicializarActualizarBindingConversionUnidad(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(conversionunidad.getEmpresa()!=null) {
							this.empresasForeignKey.add(conversionunidad.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.conversionunidad.getid_empresa(),false,"Formulario");

					//UnidadDesde
					if(!this.conversionunidadConstantesFunciones.cargarid_unidad_desdeConversionUnidad || this.conversionunidadConstantesFunciones.event_dependid_unidad_desdeConversionUnidad) {
						//this.cargarCombosUnidadDesdesForeignKeyLista(" where id="+this.conversionunidad.getid_unidad_desde());
									//this.inicializarActualizarBindingConversionUnidad(false,false);
						this.unidaddesdesForeignKey=new ArrayList<Unidad>();

						if(conversionunidad.getUnidadDesde()!=null) {
							this.unidaddesdesForeignKey.add(conversionunidad.getUnidadDesde());
						}

						this.addItemDefectoCombosForeignKeyUnidadDesde();
						this.cargarCombosFrameUnidadDesdesForeignKey("Todos");
					}
					this.setActualUnidadDesdeForeignKey(this.conversionunidad.getid_unidad_desde(),false,"Formulario");

					//UnidadHasta
					if(!this.conversionunidadConstantesFunciones.cargarid_unidad_hastaConversionUnidad || this.conversionunidadConstantesFunciones.event_dependid_unidad_hastaConversionUnidad) {
						//this.cargarCombosUnidadHastasForeignKeyLista(" where id="+this.conversionunidad.getid_unidad_hasta());
									//this.inicializarActualizarBindingConversionUnidad(false,false);
						this.unidadhastasForeignKey=new ArrayList<Unidad>();

						if(conversionunidad.getUnidadHasta()!=null) {
							this.unidadhastasForeignKey.add(conversionunidad.getUnidadHasta());
						}

						this.addItemDefectoCombosForeignKeyUnidadHasta();
						this.cargarCombosFrameUnidadHastasForeignKey("Todos");
					}
					this.setActualUnidadHastaForeignKey(this.conversionunidad.getid_unidad_hasta(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConversionUnidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConversionUnidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionUnidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConversionUnidad(ConversionUnidad conversionunidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConversionUnidad(conversionunidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConversionUnidad(ConversionUnidad conversionunidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConversionUnidad(conversionunidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConversionUnidad(conversionunidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConversionUnidad(conversionunidad);
	}
	
	public void setVariablesObjetoActualToFormularioConversionUnidad(ConversionUnidad conversionunidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setText(conversionunidad.getId().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setText(conversionunidad.getvalor().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setText(conversionunidad.getrelacion().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConversionUnidad conversionunidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conversionunidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConversionUnidad conversionunidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conversionunidadLocal=this.conversionunidad;
			} else {
				conversionunidadLocal=this.conversionunidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conversionunidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConversionUnidad(conversionunidadLocal,true);
					
					if(conversionunidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conversionunidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conversionunidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConversionUnidad(ConversionUnidad conversionunidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConversionUnidad(conversionunidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(conversionunidad);
	}
	
	public void setVariablesFormularioToObjetoActualConversionUnidad(ConversionUnidad conversionunidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConversionUnidad(conversionunidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConversionUnidad(ConversionUnidad conversionunidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.getText()==null || this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.getText()=="" || this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.getText()=="Id") {
				this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setText("0");
			}

			if(conColumnasBase) {conversionunidad.setId(Long.parseLong(this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionUnidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelIdConversionUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conversionunidad.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionUnidadConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelvalorConversionUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conversionunidad.setrelacion(Double.parseDouble(this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionUnidadConstantesFunciones.LABEL_RELACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionUnidad.jLabelrelacionConversionUnidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConversionUnidad(ConversionUnidad conversionunidadBean,ConversionUnidad conversionunidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && conversionunidadBean.getid_unidad_desde()!=null && !conversionunidadBean.getid_unidad_desde().equals(-1L))) {conversionunidad.setid_unidad_desde(conversionunidadBean.getid_unidad_desde());}
			if(conDefault || (!conDefault && conversionunidadBean.getid_unidad_hasta()!=null && !conversionunidadBean.getid_unidad_hasta().equals(-1L))) {conversionunidad.setid_unidad_hasta(conversionunidadBean.getid_unidad_hasta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConversionUnidad(ConversionUnidad conversionunidadOrigen,ConversionUnidad conversionunidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conversionunidadOrigen.getId()!=null && !conversionunidadOrigen.getId().equals(0L))) {conversionunidad.setId(conversionunidadOrigen.getId());}}
			if(conDefault || (!conDefault && conversionunidadOrigen.getid_unidad_desde()!=null && !conversionunidadOrigen.getid_unidad_desde().equals(-1L))) {conversionunidad.setid_unidad_desde(conversionunidadOrigen.getid_unidad_desde());}
			if(conDefault || (!conDefault && conversionunidadOrigen.getid_unidad_hasta()!=null && !conversionunidadOrigen.getid_unidad_hasta().equals(-1L))) {conversionunidad.setid_unidad_hasta(conversionunidadOrigen.getid_unidad_hasta());}
			if(conDefault || (!conDefault && conversionunidadOrigen.getvalor()!=null && !conversionunidadOrigen.getvalor().equals(0.0))) {conversionunidad.setvalor(conversionunidadOrigen.getvalor());}
			if(conDefault || (!conDefault && conversionunidadOrigen.getrelacion()!=null && !conversionunidadOrigen.getrelacion().equals(0.0))) {conversionunidad.setrelacion(conversionunidadOrigen.getrelacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConversionUnidad(ConversionUnidad conversionunidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setText(conversionunidad.getId().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setText(conversionunidad.getvalor().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setText(conversionunidad.getrelacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConversionUnidad(ConversionUnidadBean conversionunidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setText(conversionunidadBean.getId().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setText(conversionunidadBean.getvalor().toString());
			this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setText(conversionunidadBean.getrelacion().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConversionUnidad(ConversionUnidadParameterReturnGeneral conversionunidadReturnGeneral,ConversionUnidadBean conversionunidadBean,Boolean conDefault) throws Exception { 
		try {
			ConversionUnidad conversionunidadLocal=new ConversionUnidad();
			
			conversionunidadLocal=conversionunidadReturnGeneral.getConversionUnidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conversionunidadLocal.getId()!=null && !conversionunidadLocal.getId().equals(0L))) {conversionunidadBean.setId(conversionunidadLocal.getId());}}
			if(conDefault || (!conDefault && conversionunidadLocal.getid_unidad_desde()!=null && !conversionunidadLocal.getid_unidad_desde().equals(-1L))) {conversionunidadBean.setid_unidad_desde(conversionunidadLocal.getid_unidad_desde());}
			if(conDefault || (!conDefault && conversionunidadLocal.getid_unidad_hasta()!=null && !conversionunidadLocal.getid_unidad_hasta().equals(-1L))) {conversionunidadBean.setid_unidad_hasta(conversionunidadLocal.getid_unidad_hasta());}
			if(conDefault || (!conDefault && conversionunidadLocal.getvalor()!=null && !conversionunidadLocal.getvalor().equals(0.0))) {conversionunidadBean.setvalor(conversionunidadLocal.getvalor());}
			if(conDefault || (!conDefault && conversionunidadLocal.getrelacion()!=null && !conversionunidadLocal.getrelacion().equals(0.0))) {conversionunidadBean.setrelacion(conversionunidadLocal.getrelacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConversionUnidadGenerico(Long idConversionUnidadSeleccionado,JComboBox jComboBoxConversionUnidad,List<ConversionUnidad> conversionunidadsLocal)throws Exception {
		try {
			ConversionUnidad  conversionunidadTemp=null;

			for(ConversionUnidad conversionunidadAux:conversionunidadsLocal) {
				if(conversionunidadAux.getId()!=null && conversionunidadAux.getId().equals(idConversionUnidadSeleccionado)) {
					conversionunidadTemp=conversionunidadAux;
					break;
				}
			}

			jComboBoxConversionUnidad.setSelectedItem(conversionunidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConversionUnidadGenerico(JComboBox jComboBoxConversionUnidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConversionUnidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConversionUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConversionUnidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConversionUnidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConversionUnidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConversionUnidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversionunidad=(ConversionUnidad) conversionunidadLogic.getConversionUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conversionunidad =(ConversionUnidad) conversionunidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!conversionunidad.getIsNew() && !conversionunidad.getIsChanged() && !conversionunidad.getIsDeleted()) {
				sDescripcion=conversionunidad.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=conversionunidad.getempresa_descripcion();
			}
		}

		if(sTipo.equals("UnidadDesde")) {
			//sDescripcion=this.getActualUnidadDesdeForeignKeyDescripcion((Long)value);
			if(!conversionunidad.getIsNew() && !conversionunidad.getIsChanged() && !conversionunidad.getIsDeleted()) {
				sDescripcion=conversionunidad.getunidaddesde_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadDesdeForeignKeyDescripcion((Long)value);
				sDescripcion=conversionunidad.getunidaddesde_descripcion();
			}
		}

		if(sTipo.equals("UnidadHasta")) {
			//sDescripcion=this.getActualUnidadHastaForeignKeyDescripcion((Long)value);
			if(!conversionunidad.getIsNew() && !conversionunidad.getIsChanged() && !conversionunidad.getIsDeleted()) {
				sDescripcion=conversionunidad.getunidadhasta_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadHastaForeignKeyDescripcion((Long)value);
				sDescripcion=conversionunidad.getunidadhasta_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConversionUnidad conversionunidadRow=new ConversionUnidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversionunidadRow=(ConversionUnidad) conversionunidadLogic.getConversionUnidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conversionunidadRow=(ConversionUnidad) conversionunidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConversionUnidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad));			
			this.jButtonDuplicarConversionUnidad.setVisible((this.isVisibilidadCeldaDuplicarConversionUnidad && this.isPermisoDuplicarConversionUnidad));			
			this.jButtonCopiarConversionUnidad.setVisible((this.isVisibilidadCeldaCopiarConversionUnidad && this.isPermisoCopiarConversionUnidad));
			this.jButtonVerFormConversionUnidad.setVisible((this.isVisibilidadCeldaVerFormConversionUnidad && this.isPermisoVerFormConversionUnidad));
			
			this.jButtonAbrirOrderByConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));			
			
			this.jButtonNuevoRelacionesConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionUnidad && this.isPermisoNuevoConversionUnidad));			
			this.jButtonNuevoGuardarCambiosConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarConversionUnidad.setVisible((this.isVisibilidadCeldaModificarConversionUnidad && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.setVisible((this.isVisibilidadCeldaActualizarConversionUnidad && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.setVisible((this.isVisibilidadCeldaEliminarConversionUnidad && this.isPermisoEliminarConversionUnidad));
			this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.setVisible(this.isVisibilidadCeldaCancelarConversionUnidad);							
			this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad));						
			this.jButtonDuplicarToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaDuplicarConversionUnidad && this.isPermisoDuplicarConversionUnidad));						
			this.jButtonCopiarToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaCopiarConversionUnidad && this.isPermisoCopiarConversionUnidad));			
			this.jButtonVerFormToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaVerFormConversionUnidad && this.isPermisoVerFormConversionUnidad));			
			this.jButtonAbrirOrderByToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));
			this.jButtonNuevoRelacionesToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionUnidad && this.isPermisoNuevoConversionUnidad));			
			this.jButtonNuevoGuardarCambiosToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));			
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaModificarConversionUnidad && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaActualizarConversionUnidad  && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaEliminarConversionUnidad && this.isPermisoEliminarConversionUnidad));
			this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarToolBarConversionUnidad.setVisible(this.isVisibilidadCeldaCancelarConversionUnidad);				
			this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad));			
			this.jMenuItemDuplicarConversionUnidad.setVisible((this.isVisibilidadCeldaDuplicarConversionUnidad && this.isPermisoDuplicarConversionUnidad));			
			this.jMenuItemCopiarConversionUnidad.setVisible((this.isVisibilidadCeldaCopiarConversionUnidad && this.isPermisoCopiarConversionUnidad));			
			this.jMenuItemVerFormConversionUnidad.setVisible((this.isVisibilidadCeldaVerFormConversionUnidad && this.isPermisoVerFormConversionUnidad));			
			this.jMenuItemAbrirOrderByConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));			
			//this.jMenuItemMostrarOcultarConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));
			this.jMenuItemDetalleAbrirOrderByConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));			
			//this.jMenuItemDetalleMostrarOcultarConversionUnidad.setVisible((this.isVisibilidadCeldaOrdenConversionUnidad && this.isPermisoOrdenConversionUnidad));			
			this.jMenuItemNuevoRelacionesConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionUnidad && this.isPermisoNuevoConversionUnidad));			
			this.jMenuItemNuevoGuardarCambiosConversionUnidad.setVisible((this.isVisibilidadCeldaNuevoConversionUnidad && this.isPermisoNuevoConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));									
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemModificarConversionUnidad.setVisible((this.isVisibilidadCeldaModificarConversionUnidad && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemActualizarConversionUnidad.setVisible((this.isVisibilidadCeldaActualizarConversionUnidad && this.isPermisoActualizarConversionUnidad));	
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemEliminarConversionUnidad.setVisible((this.isVisibilidadCeldaEliminarConversionUnidad && this.isPermisoEliminarConversionUnidad));
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemCancelarConversionUnidad.setVisible(this.isVisibilidadCeldaCancelarConversionUnidad);				
			}
			
			this.jMenuItemGuardarCambiosConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));						
			this.jMenuItemGuardarCambiosTablaConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConversionUnidad=this.jButtonNuevoConversionUnidad.isVisible();
			this.isVisibilidadCeldaDuplicarConversionUnidad=this.jButtonDuplicarConversionUnidad.isVisible();
			this.isVisibilidadCeldaCopiarConversionUnidad=this.jButtonCopiarConversionUnidad.isVisible();
			this.isVisibilidadCeldaVerFormConversionUnidad=this.jButtonVerFormConversionUnidad.isVisible();
			
			this.isVisibilidadCeldaOrdenConversionUnidad=this.jButtonAbrirOrderByConversionUnidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=this.jButtonNuevoRelacionesConversionUnidad.isVisible();
			this.isVisibilidadCeldaModificarConversionUnidad=this.jButtonModificarConversionUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.isVisibilidadCeldaActualizarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.isVisible();
			this.isVisibilidadCeldaEliminarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.isVisible();
			this.isVisibilidadCeldaCancelarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.isVisible();
			this.isVisibilidadCeldaGuardarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=this.jButtonGuardarCambiosTablaConversionUnidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConversionUnidad=this.jButtonNuevoToolBarConversionUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=this.jButtonNuevoRelacionesToolBarConversionUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.isVisibilidadCeldaModificarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarToolBarConversionUnidad.isVisible();
			this.isVisibilidadCeldaActualizarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarToolBarConversionUnidad.isVisible();
			this.isVisibilidadCeldaEliminarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarToolBarConversionUnidad.isVisible();
			this.isVisibilidadCeldaCancelarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarToolBarConversionUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConversionUnidad=this.jButtonGuardarCambiosToolBarConversionUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=this.jButtonGuardarCambiosTablaToolBarConversionUnidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConversionUnidad=this.jMenuItemNuevoConversionUnidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=this.jMenuItemNuevoRelacionesConversionUnidad.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.isVisibilidadCeldaModificarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jMenuItemModificarConversionUnidad.isVisible();
			this.isVisibilidadCeldaActualizarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jMenuItemActualizarConversionUnidad.isVisible();
			this.isVisibilidadCeldaEliminarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jMenuItemEliminarConversionUnidad.isVisible();
			this.isVisibilidadCeldaCancelarConversionUnidad=this.jInternalFrameDetalleFormConversionUnidad.jMenuItemCancelarConversionUnidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConversionUnidad=this.jMenuItemGuardarCambiosConversionUnidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=this.jMenuItemGuardarCambiosTablaConversionUnidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConversionUnidad(Boolean esInicializar) {
		if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
				//if(this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConversionUnidad();
			}
			
			this.inicializarActualizarBindingBotonesManualConversionUnidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConversionUnidad() {
		this.jButtonNuevoConversionUnidad.setVisible(this.isPermisoNuevoConversionUnidad);			
		this.jButtonDuplicarConversionUnidad.setVisible(this.isPermisoDuplicarConversionUnidad);			
		this.jButtonCopiarConversionUnidad.setVisible(this.isPermisoCopiarConversionUnidad);			
		this.jButtonVerFormConversionUnidad.setVisible(this.isPermisoVerFormConversionUnidad);			
		
		this.jButtonAbrirOrderByConversionUnidad.setVisible(this.isPermisoOrdenConversionUnidad);					
		
		this.jButtonNuevoRelacionesConversionUnidad.setVisible(this.isPermisoNuevoConversionUnidad);			
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarConversionUnidad.setVisible(this.isPermisoActualizarConversionUnidad);	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.setVisible(this.isPermisoActualizarConversionUnidad);	
			this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.setVisible(this.isPermisoEliminarConversionUnidad);
			this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.setVisible(this.isVisibilidadCeldaCancelarConversionUnidad);						
			this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.setVisible(this.isPermisoGuardarCambiosConversionUnidad);							
		}
		
		this.jButtonGuardarCambiosTablaConversionUnidad.setVisible(this.isPermisoActualizarConversionUnidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConversionUnidad() {
		this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarConversionUnidad.setVisible(this.isPermisoActualizarConversionUnidad);	
		this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.setVisible(this.isPermisoActualizarConversionUnidad);	
		this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.setVisible(this.isPermisoEliminarConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.setVisible(this.isVisibilidadCeldaCancelarConversionUnidad);							
		this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.setVisible((this.isVisibilidadCeldaGuardarConversionUnidad && this.isPermisoGuardarCambiosConversionUnidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConversionUnidad() {
		if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConversionUnidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConversionUnidad() {
	}
	
	public void jTableDatosConversionUnidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConversionUnidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conversionunidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConversionUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConversionUnidad(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.conversionunidadLogic.getConnexion());

				if(this.conversionunidad.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.conversionunidad.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionUnidad=(TitledBorder)this.jScrollPanelDatosConversionUnidad.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConversionUnidad.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.conversionunidad.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidad_desdeConversionUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidaddesde=true;

			idTienePermisounidaddesde=this.tienePermisosUsuarioEnPaginaWebConversionUnidad(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidaddesde) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);

				this.unidaddesdeBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidaddesdeBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidaddesdeBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.conversionunidadLogic.getConnexion());

				if(this.conversionunidad.getid_unidad_desde()!=null) {
					this.unidaddesdeBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidaddesdeBeanSwingJInternalFrame.setIdActual(this.conversionunidad.getid_unidad_desde());
					this.unidaddesdeBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidaddesdeBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidaddesdeBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidaddesdeBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionUnidad=(TitledBorder)this.jScrollPanelDatosConversionUnidad.getBorder();
				TitledBorder titledBorderunidaddesde=(TitledBorder)this.unidaddesdeBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidaddesde.setTitle(titledBorderConversionUnidad.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidad_desdeConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getid_unidad_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad_desde = "+this.conversionunidad.getid_unidad_desde().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidad_hastaConversionUnidadUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidadhasta=true;

			idTienePermisounidadhasta=this.tienePermisosUsuarioEnPaginaWebConversionUnidad(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidadhasta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionUnidad.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionUnidad.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);

				this.unidadhastaBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadhastaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadhastaBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.conversionunidadLogic.getConnexion());

				if(this.conversionunidad.getid_unidad_hasta()!=null) {
					this.unidadhastaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadhastaBeanSwingJInternalFrame.setIdActual(this.conversionunidad.getid_unidad_hasta());
					this.unidadhastaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadhastaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadhastaBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadhastaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionUnidad=(TitledBorder)this.jScrollPanelDatosConversionUnidad.getBorder();
				TitledBorder titledBorderunidadhasta=(TitledBorder)this.unidadhastaBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidadhasta.setTitle(titledBorderConversionUnidad.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidad_hastaConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getid_unidad_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad_hasta = "+this.conversionunidad.getid_unidad_hasta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.conversionunidad.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrelacionConversionUnidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.getconversionunidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversionunidad==null) {
						this.conversionunidad = new ConversionUnidad();
					}

					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);
				}

				if(this.conversionunidad.getrelacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where relacion = "+this.conversionunidad.getrelacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionUnidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaConversionUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionUnidad(false,false);

			this.getConversionUnidadsFK_IdEmpresa();

			this.inicializarActualizarBindingConversionUnidad(false);

			//if(ConversionUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadDesdeConversionUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionUnidad(false,false);

			this.getConversionUnidadsFK_IdUnidadDesde();

			this.inicializarActualizarBindingConversionUnidad(false);

			//if(ConversionUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadHastaConversionUnidadActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionUnidad(false,false);

			this.getConversionUnidadsFK_IdUnidadHasta();

			this.inicializarActualizarBindingConversionUnidad(false);

			//if(ConversionUnidadBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionUnidad(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversionunidadLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConversionUnidad() {
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
			this.jInternalFrameDetalleFormConversionUnidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormConversionUnidad.dispose();
			this.jInternalFrameDetalleFormConversionUnidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
			this.jInternalFrameReporteDinamicoConversionUnidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConversionUnidad.dispose();
			this.jInternalFrameReporteDinamicoConversionUnidad=null;
		}
		
		if(this.jInternalFrameImportacionConversionUnidad!=null) {
			this.jInternalFrameImportacionConversionUnidad.setVisible(false);	    			
			this.jInternalFrameImportacionConversionUnidad.dispose();
			this.jInternalFrameImportacionConversionUnidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConversionUnidad();
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConversionUnidad")) {
				jButtonDuplicarConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConversionUnidad")) {
				jButtonCopiarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormConversionUnidad")) {
				jButtonVerFormConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConversionUnidad")) {
				jButtonDuplicarConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConversionUnidad")) {
				jButtonDuplicarConversionUnidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConversionUnidad")) {
				jButtonModificarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConversionUnidad")) {
				jButtonModificarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConversionUnidad")) {
				jButtonModificarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConversionUnidad")) {
				jButtonActualizarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConversionUnidad")) {
				jButtonActualizarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConversionUnidad")) {
				jButtonActualizarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarConversionUnidad")) {
				jButtonEliminarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConversionUnidad")) {
				jButtonEliminarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConversionUnidad")) {
				jButtonEliminarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarConversionUnidad")) {
				jButtonCancelarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConversionUnidad")) {
				jButtonCancelarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConversionUnidad")) {
				jButtonCancelarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarConversionUnidad")) {
				jButtonCerrarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConversionUnidad")) {
				jButtonCerrarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConversionUnidad")) {
				jButtonCerrarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConversionUnidad")) {
				jButtonMostrarOcultarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConversionUnidad")) {
				jButtonCancelarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConversionUnidad")) {
				jButtonCopiarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConversionUnidad")) {
				jButtonVerFormConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConversionUnidad")) {
				jButtonCopiarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConversionUnidad")) {
				jButtonVerFormConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConversionUnidad")) {
				jButtonRecargarInformacionConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConversionUnidad")) {
				jButtonRecargarInformacionConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConversionUnidad")) {
				jButtonRecargarInformacionConversionUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConversionUnidad")) {
				jButtonAnterioresConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConversionUnidad")) {
				jButtonAnterioresConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConversionUnidad")) {
				jButtonAnterioresConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConversionUnidad")) {
				jButtonSiguientesConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConversionUnidad")) {
				jButtonSiguientesConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConversionUnidad")) {
				jButtonSiguientesConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConversionUnidad") || sTipo.equals("MenuItemDetalleAbrirOrderByConversionUnidad")) {
				jButtonAbrirOrderByConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConversionUnidad") || sTipo.equals("MenuItemDetalleMostrarOcultarConversionUnidad")) {
				jButtonMostrarOcultarConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConversionUnidad")) {
				jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConversionUnidad")) {
				jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConversionUnidad")) {
				jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConversionUnidad")) {
				jButtonCerrarReporteDinamicoConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConversionUnidad")) {
				jButtonGenerarReporteDinamicoConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConversionUnidad")) {
				
				jButtonGenerarExcelReporteDinamicoConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConversionUnidad")) {
				jButtonCerrarImportacionConversionUnidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConversionUnidad")) {
				
				jButtonGenerarImportacionConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConversionUnidad")) {
				
				jButtonAbrirImportacionConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConversionUnidad")) {
				jComboBoxTiposAccionesConversionUnidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConversionUnidad")) {
				jComboBoxTiposRelacionesConversionUnidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConversionUnidad")) {
				jComboBoxTiposAccionesConversionUnidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConversionUnidad")) {
				
				jComboBoxTiposSeleccionarConversionUnidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConversionUnidad")) {
				jTextFieldValorCampoGeneralConversionUnidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConversionUnidad")) {
				jButtonAbrirOrderByConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConversionUnidad")) {
				jButtonAbrirOrderByConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConversionUnidad")) {
				jButtonCerrarOrderByConversionUnidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConversionUnidadBusqueda")) {
				this.jButtonidConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConversionUnidadUpdate")) {
				this.jButtonid_empresaConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConversionUnidadBusqueda")) {
				this.jButtonid_empresaConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_desdeConversionUnidadUpdate")) {
				this.jButtonid_unidad_desdeConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_desdeConversionUnidadBusqueda")) {
				this.jButtonid_unidad_desdeConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_hastaConversionUnidadUpdate")) {
				this.jButtonid_unidad_hastaConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_hastaConversionUnidadBusqueda")) {
				this.jButtonid_unidad_hastaConversionUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConversionUnidadBusqueda")) {
				this.jButtonvalorConversionUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("relacionConversionUnidadBusqueda")) {
				this.jButtonrelacionConversionUnidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdUnidadDesdeConversionUnidad")) {
				this.jButtonFK_IdUnidadDesdeConversionUnidadActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadHastaConversionUnidad")) {
				this.jButtonFK_IdUnidadHastaConversionUnidadActionPerformed(evt);
			}
			
			;
			
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConversionUnidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConversionUnidad conversionunidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				conversionunidadLocal=this.conversionunidad;
			} else {
				conversionunidadLocal=this.conversionunidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
							
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
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
			
			


			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
								
						
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
								
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
							
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
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
			
			


			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
								
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConversionUnidad")) {
					jCheckBoxSeleccionarTodosConversionUnidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConversionUnidad")) {
					jCheckBoxSeleccionadosConversionUnidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConversionUnidad")) {
					
				}
				
				


				
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
												
				
				


				
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
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
			
			


			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionUnidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversionunidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversionunidad);
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
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
				
				


				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionUnidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionUnidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionUnidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversionunidadAnterior =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConversionUnidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConversionUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConversionUnidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conversionunidad =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conversionunidad =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conversionunidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConversionUnidad")) {
				
				}
				
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConversionUnidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConversionUnidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConversionUnidad")) {
			
			}
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConversionUnidad();
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			if(sTipo.equals("NuevoConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConversionUnidad")) {
				jButtonDuplicarConversionUnidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConversionUnidad")) {
				jButtonCopiarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConversionUnidad")) {
				jButtonVerFormConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConversionUnidad")) {
				jButtonNuevoConversionUnidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConversionUnidad")) {
				jButtonModificarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConversionUnidad")) {
				jButtonActualizarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConversionUnidad")) {
				jButtonEliminarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConversionUnidad")) {
				jButtonCancelarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConversionUnidad")) {
				jButtonCerrarConversionUnidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConversionUnidad")) {
				jButtonGuardarCambiosConversionUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConversionUnidad")) {
				jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConversionUnidad")) {
				jButtonAbrirOrderByConversionUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConversionUnidad")) {
				jButtonRecargarInformacionConversionUnidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConversionUnidad")) {
				jButtonAnterioresConversionUnidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConversionUnidad")) {
				jButtonSiguientesConversionUnidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConversionUnidadBusqueda")) {
				this.jButtonidConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConversionUnidadUpdate")) {
				this.jButtonid_empresaConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConversionUnidadBusqueda")) {
				this.jButtonid_empresaConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_desdeConversionUnidadUpdate")) {
				this.jButtonid_unidad_desdeConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_desdeConversionUnidadBusqueda")) {
				this.jButtonid_unidad_desdeConversionUnidadBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_hastaConversionUnidadUpdate")) {
				this.jButtonid_unidad_hastaConversionUnidadUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_hastaConversionUnidadBusqueda")) {
				this.jButtonid_unidad_hastaConversionUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConversionUnidadBusqueda")) {
				this.jButtonvalorConversionUnidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("relacionConversionUnidadBusqueda")) {
				this.jButtonrelacionConversionUnidadBusquedaActionPerformed(evt);
			}
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConversionUnidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConversionUnidad")) {
				closingInternalFrameConversionUnidad();
				
			} else if(sTipo.equals("jButtonCancelarConversionUnidad")) {
				JInternalFrameBase jInternalFrameDetalleFormConversionUnidad = (JInternalFrameBase)evt.getSource();
	            	
	            ConversionUnidadBeanSwingJInternalFrame jInternalFrameParent=(ConversionUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormConversionUnidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConversionUnidadActionPerformed(null);
			}
			
			ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conversionunidad,new Object(),this.conversionunidadParameterGeneral,this.conversionunidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConversionUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConversionUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConversionUnidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conversionunidad)) {
			if(!esControlTabla) {
				if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);			
				}
				
				if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConversionUnidad(this.conversionunidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conversionunidadReturnGeneral=conversionunidadLogic.procesarEventosConversionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversionunidadLogic.getConversionUnidads(),this.conversionunidad,this.conversionunidadParameterGeneral,this.isEsNuevoConversionUnidad,classes);//this.conversionunidadLogic.getConversionUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConversionUnidad(this.conversionunidadReturnGeneral,this.conversionunidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConversionUnidad(classes,this.conversionunidadReturnGeneral,this.conversionunidadBean,false);
					}
						
					if(this.conversionunidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad());	
					}
						
					if(this.conversionunidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad(),classes);//this.conversionunidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConversionUnidad(this.conversionunidad,classes);//this.conversionunidadBean);									
				}
			
				if(ConversionUnidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConversionUnidad(this.conversionunidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionUnidad(this.conversionunidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conversionunidadAnterior!=null) {
						this.conversionunidad=this.conversionunidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conversionunidadReturnGeneral=conversionunidadLogic.procesarEventosConversionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversionunidadLogic.getConversionUnidads(),this.conversionunidad,this.conversionunidadParameterGeneral,this.isEsNuevoConversionUnidad,classes);//this.conversionunidadLogic.getConversionUnidad()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conversionunidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conversionunidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conversionunidadReturnGeneral.getConversionUnidad(),conversionunidadLogic.getConversionUnidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conversionunidadReturnGeneral.getConversionUnidad(),this.conversionunidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConversionUnidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosConversionUnidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConversionUnidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosConversionUnidad() throws Exception {
		
		ConversionUnidadModel conversionunidadModel=(ConversionUnidadModel)this.jTableDatosConversionUnidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversionunidadModel.conversionunidads=this.conversionunidadLogic.getConversionUnidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conversionunidadModel.conversionunidads=this.conversionunidads;
		}
		
		
		((ConversionUnidadModel) this.jTableDatosConversionUnidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConversionUnidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconversionunidadAnterior(),this.conversionunidadLogic.getConversionUnidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconversionunidadAnterior(),this.conversionunidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConversionUnidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConversionUnidad(ConversionUnidad conversionunidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
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
										
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversionunidad,new Object(),generalEntityParameterGeneral,this.conversionunidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conversionunidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConversionUnidadConstantesFunciones.getClassesRelationshipsOfConversionUnidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConversionUnidadConstantesFunciones.getClassesRelationshipsFromStringsOfConversionUnidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConversionUnidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConversionUnidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversionunidad,new Object(),generalEntityParameterGeneral,this.conversionunidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConversionUnidad(ConversionUnidadBean conversionunidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConversionUnidad(ArrayList<Classe> classes,ConversionUnidadReturnGeneral conversionunidadReturnGeneral,ConversionUnidadBean conversionunidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConversionUnidad(ConversionUnidad conversionunidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.conversionunidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConversionUnidad = new ConversionUnidadDetalleFormJInternalFrame(jDesktopPane,this.conversionunidadSessionBean.getConGuardarRelaciones(),this.conversionunidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.setVisible(false);
		this.jInternalFrameDetalleFormConversionUnidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormConversionUnidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConversionUnidad.conversionunidadLogic=this.conversionunidadLogic;
		
		this.cargarCombosFrameForeignKeyConversionUnidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConversionUnidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConversionUnidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConversionUnidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConversionUnidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConversionUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConversionUnidad"));
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarConversionUnidad.addActionListener(new ButtonActionListener(this,"ModificarConversionUnidad"));

		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarConversionUnidad"));
					
		this.jInternalFrameDetalleFormConversionUnidad.jMenuItemModificarConversionUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarConversionUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.addActionListener (new ButtonActionListener(this,"ActualizarConversionUnidad"));
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConversionUnidad"));
						
		this.jInternalFrameDetalleFormConversionUnidad.jMenuItemActualizarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConversionUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.addActionListener (new ButtonActionListener(this,"EliminarConversionUnidad"));
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarConversionUnidad"));
								
		this.jInternalFrameDetalleFormConversionUnidad.jMenuItemEliminarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConversionUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.addActionListener (new ButtonActionListener(this,"CancelarConversionUnidad"));
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarConversionUnidad"));
					
		this.jInternalFrameDetalleFormConversionUnidad.jMenuItemCancelarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConversionUnidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jMenuItemDetalleCerrarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConversionUnidad"));		
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionUnidad"));
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionUnidad"));
		
		
		
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConversionUnidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonidConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonvalorConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonrelacionConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"relacionConversionUnidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConversionUnidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConversionUnidad"));
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConversionUnidad"));
		}
		
		this.jTableDatosConversionUnidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConversionUnidad"));
		
		this.jTableDatosConversionUnidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConversionUnidad"));
		
		this.jButtonNuevoConversionUnidad.addActionListener(new ButtonActionListener(this,"NuevoConversionUnidad"));
		
		this.jButtonDuplicarConversionUnidad.addActionListener(new ButtonActionListener(this,"DuplicarConversionUnidad"));
		
		this.jButtonCopiarConversionUnidad.addActionListener(new ButtonActionListener(this,"CopiarConversionUnidad"));
		
		this.jButtonVerFormConversionUnidad.addActionListener(new ButtonActionListener(this,"VerFormConversionUnidad"));
		
		
		this.jButtonNuevoToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarConversionUnidad"));
			
		this.jButtonDuplicarToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConversionUnidad"));
			
		this.jMenuItemNuevoConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConversionUnidad"));
			
		this.jMenuItemDuplicarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConversionUnidad"));		
		
		
		this.jButtonNuevoRelacionesConversionUnidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConversionUnidad"));
		
		
		this.jButtonNuevoRelacionesToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConversionUnidad"));
			
		this.jMenuItemNuevoRelacionesConversionUnidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConversionUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarConversionUnidad.addActionListener(new ButtonActionListener(this,"ModificarConversionUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonModificarToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarConversionUnidad"));
			
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemModificarConversionUnidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarConversionUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarConversionUnidad.addActionListener (new ButtonActionListener(this,"ActualizarConversionUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonActualizarToolBarConversionUnidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConversionUnidad"));
				
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemActualizarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConversionUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarConversionUnidad.addActionListener (new ButtonActionListener(this,"EliminarConversionUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonEliminarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarConversionUnidad"));
						
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemEliminarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConversionUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarConversionUnidad.addActionListener (new ButtonActionListener(this,"CancelarConversionUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonCancelarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarConversionUnidad"));
			
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemCancelarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConversionUnidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConversionUnidad"));		
		
		
		this.jButtonCerrarConversionUnidad.addActionListener (new ButtonActionListener(this,"CerrarConversionUnidad"));
		
		
		this.jButtonCerrarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarConversionUnidad"));
			
		this.jMenuItemCerrarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConversionUnidad"));
			
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jMenuItemDetalleCerrarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConversionUnidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosConversionUnidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionUnidad"));
		}
		
		this.jButtonCopiarToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarConversionUnidad"));
			
		this.jButtonVerFormToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarConversionUnidad"));
		
		this.jMenuItemGuardarCambiosConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConversionUnidad"));
			
		this.jMenuItemCopiarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConversionUnidad"));		
		
		this.jMenuItemVerFormConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConversionUnidad"));		
		
		
		this.jButtonGuardarCambiosTablaConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConversionUnidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConversionUnidad"));
			
		this.jMenuItemGuardarCambiosTablaConversionUnidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConversionUnidad"));		
		
		
		
		this.jButtonRecargarInformacionConversionUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionConversionUnidad"));
					
		this.jButtonRecargarInformacionToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConversionUnidad"));
		
		this.jMenuItemRecargarInformacionConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConversionUnidad"));		
		
		
		
		this.jButtonAnterioresConversionUnidad.addActionListener (new ButtonActionListener(this,"AnterioresConversionUnidad"));
		
		
		this.jButtonAnterioresToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConversionUnidad"));
		
		this.jMenuItemAnterioresConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConversionUnidad"));		
		
		
		this.jButtonSiguientesConversionUnidad.addActionListener (new ButtonActionListener(this,"SiguientesConversionUnidad"));
		
		
		this.jButtonSiguientesToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConversionUnidad"));
			
		this.jMenuItemSiguientesConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConversionUnidad"));
			
		this.jMenuItemAbrirOrderByConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConversionUnidad"));
			
		this.jMenuItemMostrarOcultarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConversionUnidad"));
			
		this.jMenuItemDetalleAbrirOrderByConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConversionUnidad"));
			
		this.jMenuItemDetalleMostarOcultarConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConversionUnidad"));		
		
		
		this.jButtonNuevoGuardarCambiosConversionUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConversionUnidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConversionUnidad"));
			
		this.jMenuItemNuevoGuardarCambiosConversionUnidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConversionUnidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConversionUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConversionUnidad"));

		this.jCheckBoxSeleccionadosConversionUnidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConversionUnidad"));
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConversionUnidad"));
		}
		
		
		this.jComboBoxTiposRelacionesConversionUnidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesConversionUnidad"));
			
		this.jComboBoxTiposAccionesConversionUnidad.addActionListener (new ButtonActionListener(this,"TiposAccionesConversionUnidad"));
					
		this.jComboBoxTiposSeleccionarConversionUnidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConversionUnidad"));
			
		this.jTextFieldValorCampoGeneralConversionUnidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConversionUnidad"));		
		
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonidConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonvalorConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonrelacionConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"relacionConversionUnidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdUnidadDesdeConversionUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDesdeConversionUnidad"));

			this.jButtonFK_IdUnidadHastaConversionUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadHastaConversionUnidad"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConversionUnidad!=null) {
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionUnidad"));
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionUnidad"));
				this.jInternalFrameReporteDinamicoConversionUnidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionUnidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoConversionUnidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionUnidad"));				
			//this.jButtonGenerarReporteDinamicoConversionUnidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionUnidad"));
			//this.jButtonGenerarExcelReporteDinamicoConversionUnidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionUnidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConversionUnidad!=null) {
				this.jInternalFrameImportacionConversionUnidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConversionUnidad"));
				this.jInternalFrameImportacionConversionUnidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConversionUnidad"));
				this.jInternalFrameImportacionConversionUnidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConversionUnidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConversionUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByConversionUnidad"));
			
			this.jButtonAbrirOrderByToolBarConversionUnidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConversionUnidad"));			
			
			if(this.jInternalFrameOrderByConversionUnidad!=null) {
				this.jInternalFrameOrderByConversionUnidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConversionUnidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionUnidad.jTabbedPaneRelacionesConversionUnidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConversionUnidad"));
		
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
            		closingInternalFrameConversionUnidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConversionUnidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConversionUnidad = (JInternalFrameBase)event.getSource();
	            	
	            ConversionUnidadBeanSwingJInternalFrame jInternalFrameParent=(ConversionUnidadBeanSwingJInternalFrame)jInternalFrameDetalleFormConversionUnidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConversionUnidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConversionUnidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConversionUnidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConversionUnidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConversionUnidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConversionUnidad";
		inputMap = this.jButtonNuevoConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConversionUnidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionUnidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConversionUnidad";
		inputMap = this.jButtonNuevoRelacionesConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConversionUnidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConversionUnidad";
		inputMap = this.jButtonModificarConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConversionUnidad";
		inputMap = this.jButtonActualizarConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConversionUnidad";
		inputMap = this.jButtonEliminarConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConversionUnidad";
		inputMap = this.jButtonCancelarConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConversionUnidad";
		inputMap = this.jButtonCerrarConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConversionUnidad";
		inputMap = this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConversionUnidad.jButtonGuardarCambiosConversionUnidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConversionUnidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConversionUnidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConversionUnidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConversionUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConversionUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConversionUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConversionUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConversionUnidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConversionUnidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonidConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"idConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_empresaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_desdeConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_desdeConversionUnidadBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonid_unidad_hastaConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_hastaConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonvalorConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionUnidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionUnidad.jButtonrelacionConversionUnidadBusqueda.addActionListener(new ButtonActionListener(this,"relacionConversionUnidadBusqueda"));
		
		
		this.jButtonFK_IdUnidadDesdeConversionUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadDesdeConversionUnidad"));

		this.jButtonFK_IdUnidadHastaConversionUnidad.addActionListener(new ButtonActionListener(this,"FK_IdUnidadHastaConversionUnidad"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConversionUnidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConversionUnidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConversionUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConversionUnidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConversionUnidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
					conversionunidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionUnidad conversionunidadAux:conversionunidads) {
					conversionunidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConversionUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
						conversionunidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionUnidad conversionunidadAux:conversionunidads) {
						conversionunidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionUnidad conversionunidadAux:conversionunidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConversionUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConversionUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConversionUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConversionUnidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConversionUnidad.getSelectedRows();
			
			ConversionUnidad conversionunidadLocal=new ConversionUnidad();
			
			//this.seleccionarTodosConversionUnidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversionunidadLocal =(ConversionUnidad) this.conversionunidadLogic.getConversionUnidads().toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conversionunidadLocal =(ConversionUnidad) this.conversionunidads.toArray()[this.jTableDatosConversionUnidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conversionunidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
						conversionunidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionUnidad conversionunidadAux:conversionunidads) {
						conversionunidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConversionUnidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConversionUnidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConversionUnidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConversionUnidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConversionUnidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConversionUnidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConversionUnidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConversionUnidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConversionUnidad conversionunidadAux:this.conversionunidadLogic.getConversionUnidads()) {
				
						if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							conversionunidadAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_RELACION)) {
							existe=true;
							conversionunidadAux.setrelacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionUnidad conversionunidadAux:conversionunidads) {
					
						if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							conversionunidadAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_RELACION)) {
							existe=true;
							conversionunidadAux.setrelacion(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConversionUnidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConversionUnidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConversionUnidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConversionUnidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConversionUnidad) {				
					conSplash=true;//false;										
					
					//this.startProcessConversionUnidad(conSplash);
				
					this.generarReporteConversionUnidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConversionUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConversionUnidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConversionUnidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConversionUnidad();
				
				this.exportarConversionUnidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConversionUnidads();
				//this.importarConversionUnidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConversionUnidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConversionUnidadsSeleccionados();
				//this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conversion Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConversionUnidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConversionUnidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConversionUnidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
				}	
			} 			
			else if(ConversionUnidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConversionUnidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConversionUnidad(conSplash);
					
						//this.actualizarParametrosGeneralConversionUnidad();
						
						this.generarReporteProcesoAccionConversionUnidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConversionUnidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Conversion UnidadES SELECCIONADOS?", "MANTENIMIENTO DE Conversion Unidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConversionUnidad();
				
						this.actualizarParametrosGeneralConversionUnidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conversionunidadReturnGeneral=conversionunidadLogic.procesarAccionConversionUnidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conversionunidadLogic.getConversionUnidads(),this.conversionunidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConversionUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConversionUnidad();
					
					ConversionUnidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConversionUnidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConversionUnidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConversionUnidad.jComboBoxTiposAccionesFormularioConversionUnidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConversionUnidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConversionUnidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConversionUnidad();
			
			if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
			ConversionUnidad conversionunidad=new ConversionUnidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConversionUnidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConversionUnidad.getSelectedItem();
			
			
			
			
			conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(conversionunidadsSeleccionados.size()==1) {
				for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
					conversionunidad=conversionunidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConversionUnidad();
			
      		//this.finishProcessConversionUnidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConversionUnidadReturnGeneral() throws Exception {
		if(this.conversionunidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conversionunidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conversionunidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conversionunidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conversionunidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conversionunidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConversionUnidad(false);
		}
		
		if(this.conversionunidadReturnGeneral.getConRetornoLista() || this.conversionunidadReturnGeneral.getConRetornoObjeto()) {
			if(this.conversionunidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conversionunidadLogic.setConversionUnidads(this.conversionunidadReturnGeneral.getConversionUnidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.conversionunidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conversionunidadLogic.setConversionUnidad(this.conversionunidadReturnGeneral.getConversionUnidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConversionUnidad(false);
		}
	}
	
	public void actualizarParametrosGeneralConversionUnidad() throws Exception {
		
		
	}
	
	public ArrayList<ConversionUnidad> getConversionUnidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConversionUnidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConversionUnidad conversionunidadAux:conversionunidadLogic.getConversionUnidads()) {
					if(conversionunidadAux.getIsSelected()) {
						conversionunidadsSeleccionados.add(conversionunidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionUnidad conversionunidadAux:this.conversionunidads) {
					if(conversionunidadAux.getIsSelected()) {
						conversionunidadsSeleccionados.add(conversionunidadAux);				
					}
				}
			}
			
			if(conversionunidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conversionunidadsSeleccionados.addAll(this.conversionunidadLogic.getConversionUnidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conversionunidadsSeleccionados.addAll(this.conversionunidads);				
					}
				}
			}
		} else {
			conversionunidadsSeleccionados.add(this.conversionunidad);
		}
		
		return conversionunidadsSeleccionados;
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
	
	public void generarReporteConversionUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConversionUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConversionUnidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConversionUnidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConversionUnidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conversion Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConversionUnidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConversionUnidad();
		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConversionUnidad();
		
		
		//this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados ,conversionunidadImplementable,conversionunidadImplementableHome);
	}
	
	public void mostrarImportacionConversionUnidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConversionUnidad();
		
		this.abrirFrameImportacionConversionUnidad();		
		
			
		//this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados ,conversionunidadImplementable,conversionunidadImplementableHome);
	}
	
	public void importarConversionUnidads() throws Exception {		
	
	}
	
	public void exportarConversionUnidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConversionUnidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConversionUnidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConversionUnidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conversion Unidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConversionUnidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConversionUnidad(conversionunidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conversionunidadAux.setsDetalleGeneralEntityReporte(conversionunidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConversionUnidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionUnidadConstantesFunciones.LABEL_RELACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConversionUnidad(ConversionUnidad conversionunidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conversionunidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getunidaddesde_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getunidadhasta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversionunidad.getrelacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConversionUnidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConversionUnidad(row);				
				iRow++;
			}				
			
			for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConversionUnidad(conversionunidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConversionUnidadsSeleccionados() throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();		
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversionunidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conversionunidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conversionunidad");
			//elementRoot.appendChild(element);
		
			for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
				element = document.createElement("conversionunidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConversionUnidad(conversionunidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Unidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConversionUnidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionUnidadConstantesFunciones.LABEL_RELACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConversionUnidad(ConversionUnidad conversionunidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getunidaddesde_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getunidadhasta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(conversionunidad.getrelacion());				
	}
	
	public void setFilaDatosExportarXmlConversionUnidad(ConversionUnidad conversionunidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConversionUnidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(conversionunidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConversionUnidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conversionunidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConversionUnidadConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(conversionunidad.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementunidaddesde_descripcion = document.createElement(ConversionUnidadConstantesFunciones.IDUNIDADDESDE);
		elementunidaddesde_descripcion.appendChild(document.createTextNode(conversionunidad.getunidaddesde_descripcion()));
		element.appendChild(elementunidaddesde_descripcion);

		Element elementunidadhasta_descripcion = document.createElement(ConversionUnidadConstantesFunciones.IDUNIDADHASTA);
		elementunidadhasta_descripcion.appendChild(document.createTextNode(conversionunidad.getunidadhasta_descripcion()));
		element.appendChild(elementunidadhasta_descripcion);

		Element elementvalor = document.createElement(ConversionUnidadConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(conversionunidad.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementrelacion = document.createElement(ConversionUnidadConstantesFunciones.RELACION);
		elementrelacion.appendChild(document.createTextNode(conversionunidad.getrelacion().toString().trim()));
		element.appendChild(elementrelacion);
	}
	
	public void generarReporteGroupGenericoConversionUnidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConversionUnidad> conversionunidadsSeleccionados=new ArrayList<ConversionUnidad>();
		
		conversionunidadsSeleccionados=this.getConversionUnidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConversionUnidad(conversionunidadsSeleccionados);
		
		this.generarReporteConversionUnidads("Todos",conversionunidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConversionUnidad(ArrayList<ConversionUnidad> conversionunidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConversionUnidad conversionunidadAux:conversionunidadsSeleccionados) {
				conversionunidadAux.setsDetalleGeneralEntityReporte(conversionunidadAux.toString());
			
				if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					conversionunidadAux.setsDescripcionGeneralEntityReporte1(conversionunidadAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADDESDE)) {
					existe=true;
					conversionunidadAux.setsDescripcionGeneralEntityReporte1(conversionunidadAux.getunidaddesde_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionUnidadConstantesFunciones.LABEL_IDUNIDADHASTA)) {
					existe=true;
					conversionunidadAux.setsDescripcionGeneralEntityReporte1(conversionunidadAux.getunidadhasta_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionUnidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConversionUnidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConversionUnidad=true;
				this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=true;
				this.isVisibilidadCeldaGuardarCambiosConversionUnidad=true;
			}
			
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=true;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=true;
			this.isVisibilidadCeldaEliminarConversionUnidad=true;
			this.isVisibilidadCeldaCancelarConversionUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=true;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConversionUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=true;
			this.isVisibilidadCeldaModificarConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
			this.isVisibilidadCeldaModificarConversionUnidad=true;
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
			this.isVisibilidadCeldaCancelarConversionUnidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionUnidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConversionUnidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConversionUnidad=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=true;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=true;
		} else {
			this.actualizarEstadoPanelsConversionUnidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConversionUnidad=false;
			//this.isVisibilidadCeldaVerFormConversionUnidad=false;
			this.isVisibilidadCeldaDuplicarConversionUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conversionunidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
		} else {
			this.isVisibilidadCeldaNuevoConversionUnidad=false;
			this.isVisibilidadCeldaGuardarCambiosConversionUnidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conversionunidadSessionBean.getEsGuardarRelacionado()) {
			if(!conversionunidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;												
			}
			
			this.jButtonCerrarConversionUnidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConversionUnidad=false;
		}
		
		if(!this.permiteMantenimiento(this.conversionunidad)) {
			this.isVisibilidadCeldaActualizarConversionUnidad=false;
			this.isVisibilidadCeldaEliminarConversionUnidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConversionUnidad() {
	}
	
	public void actualizarEstadoPanelsConversionUnidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConversionUnidad!=null) {
				this.jScrollPanelDatosEdicionConversionUnidad.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionUnidad!=null) {
				this.jScrollPanelDatosConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionUnidad!=null) {
				this.jPanelPaginacionConversionUnidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
					this.jTabbedPaneBusquedasConversionUnidad.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conversionunidadSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionUnidad!=null) {
				this.jTabbedPaneBusquedasConversionUnidad.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConversionUnidad!=null) {
				this.jPanelParametrosReportesConversionUnidad.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdUnidadDesde=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidadDesde) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadDesdeConversionUnidad);}

			this.isVisibilidadFK_IdUnidadHasta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidadHasta) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadHastaConversionUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidadDesde(Boolean isParaUnidadDesde){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadDesdeNegation=!isParaUnidadDesde;

			this.isVisibilidadFK_IdUnidadDesde=isParaUnidadDesde;
			if(!this.isVisibilidadFK_IdUnidadDesde) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadDesdeConversionUnidad);}

			this.isVisibilidadFK_IdUnidadHasta=isParaUnidadDesdeNegation;
			if(!this.isVisibilidadFK_IdUnidadHasta) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadHastaConversionUnidad);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidadHasta(Boolean isParaUnidadHasta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadHastaNegation=!isParaUnidadHasta;

			this.isVisibilidadFK_IdUnidadDesde=isParaUnidadHastaNegation;
			if(!this.isVisibilidadFK_IdUnidadDesde) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadDesdeConversionUnidad);}

			this.isVisibilidadFK_IdUnidadHasta=isParaUnidadHasta;
			if(!this.isVisibilidadFK_IdUnidadHasta) {this.jTabbedPaneBusquedasConversionUnidad.remove(jPanelFK_IdUnidadHastaConversionUnidad);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConversionUnidadSessionBean conversionunidadSessionBean=new ConversionUnidadSessionBean();
		
		if(this.conversionunidadSessionBean==null) {
			this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
		}
		
		this.conversionunidadSessionBean.setsUltimaBusquedaConversionUnidad(this.getsAccionBusqueda());
		this.conversionunidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.conversionunidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			conversionunidadSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidadDesde")) {
			conversionunidadSessionBean.setid_unidad_desde(this.getid_unidad_desdeFK_IdUnidadDesde());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidadHasta")) {
			conversionunidadSessionBean.setid_unidad_hasta(this.getid_unidad_hastaFK_IdUnidadHasta());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConversionUnidadSessionBean conversionunidadSessionBean=new ConversionUnidadSessionBean();
		
		if(this.conversionunidadSessionBean==null) {
			this.conversionunidadSessionBean=new ConversionUnidadSessionBean();
		}
		
		if(this.conversionunidadSessionBean.getsUltimaBusquedaConversionUnidad()!=null&&!this.conversionunidadSessionBean.getsUltimaBusquedaConversionUnidad().equals("")) {
			this.setsAccionBusqueda(conversionunidadSessionBean.getsUltimaBusquedaConversionUnidad());
			this.setiNumeroPaginacion(conversionunidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(conversionunidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(conversionunidadSessionBean.getid_empresa());
				conversionunidadSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidadDesde")) {
				this.setid_unidad_desdeFK_IdUnidadDesde(conversionunidadSessionBean.getid_unidad_desde());
				conversionunidadSessionBean.setid_unidad_desde(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidadHasta")) {
				this.setid_unidad_hastaFK_IdUnidadHasta(conversionunidadSessionBean.getid_unidad_hasta());
				conversionunidadSessionBean.setid_unidad_hasta(-1L);
			}
		}
		
		this.conversionunidadSessionBean.setsUltimaBusquedaConversionUnidad("");
		this.conversionunidadSessionBean.setiNumeroPaginacion(ConversionUnidadConstantesFunciones.INUMEROPAGINACION);
		this.conversionunidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConversionUnidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConversionUnidad() {
		this.updateBorderResaltarBusquedasFormularioConversionUnidad();
		this.updateVisibilidadBusquedasFormularioConversionUnidad();
		this.updateHabilitarBusquedasFormularioConversionUnidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioConversionUnidad() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConversionUnidad.getComponents().length>0) {
	

		if(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadDesdeConversionUnidad!=null) {
			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadDesdeConversionUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
				jPanel.setBorder(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadDesdeConversionUnidad);
			}
		}

		if(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadHastaConversionUnidad!=null) {
			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadHastaConversionUnidad);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
				jPanel.setBorder(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadHastaConversionUnidad);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConversionUnidad() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConversionUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadDesdeConversionUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conversionunidadConstantesFunciones.mostrarFK_IdUnidadDesdeConversionUnidad);
			if(!this.conversionunidadConstantesFunciones.mostrarFK_IdUnidadDesdeConversionUnidad && index>-1) {
				this.jTabbedPaneBusquedasConversionUnidad.remove(index);
			}

			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadHastaConversionUnidad);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conversionunidadConstantesFunciones.mostrarFK_IdUnidadHastaConversionUnidad);
			if(!this.conversionunidadConstantesFunciones.mostrarFK_IdUnidadHastaConversionUnidad && index>-1) {
				this.jTabbedPaneBusquedasConversionUnidad.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConversionUnidad() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConversionUnidad.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadDesdeConversionUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conversionunidadConstantesFunciones.activarFK_IdUnidadDesdeConversionUnidad);
				this.jTabbedPaneBusquedasConversionUnidad.setEnabledAt(index,this.conversionunidadConstantesFunciones.activarFK_IdUnidadDesdeConversionUnidad);
			}

			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadHastaConversionUnidad);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conversionunidadConstantesFunciones.activarFK_IdUnidadHastaConversionUnidad);
				this.jTabbedPaneBusquedasConversionUnidad.setEnabledAt(index,this.conversionunidadConstantesFunciones.activarFK_IdUnidadHastaConversionUnidad);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConversionUnidad(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdUnidadDesde")) {
			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadDesdeConversionUnidad);

			this.jTabbedPaneBusquedasConversionUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);

			this.conversionunidadConstantesFunciones.setResaltarFK_IdUnidadDesdeConversionUnidad(resaltar);

			jPanel.setBorder(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadDesdeConversionUnidad);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidadHasta")) {
			index= this.jTabbedPaneBusquedasConversionUnidad.indexOfComponent(this.jPanelFK_IdUnidadHastaConversionUnidad);

			this.jTabbedPaneBusquedasConversionUnidad.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionUnidad.getComponent(index);

			this.conversionunidadConstantesFunciones.setResaltarFK_IdUnidadHastaConversionUnidad(resaltar);

			jPanel.setBorder(this.conversionunidadConstantesFunciones.resaltarFK_IdUnidadHastaConversionUnidad);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConversionUnidad.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConversionUnidad() throws Exception {

		if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConversionUnidad();
		this.updateVisibilidadResaltarControlesFormularioConversionUnidad();
		this.updateHabilitarResaltarControlesFormularioConversionUnidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioConversionUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conversionunidadConstantesFunciones.resaltaridConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltaridConversionUnidad);}
		if(this.conversionunidadConstantesFunciones.resaltarid_empresaConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltarid_empresaConversionUnidad);}
		if(this.conversionunidadConstantesFunciones.resaltarid_unidad_desdeConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltarid_unidad_desdeConversionUnidad);}
		if(this.conversionunidadConstantesFunciones.resaltarid_unidad_hastaConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltarid_unidad_hastaConversionUnidad);}
		if(this.conversionunidadConstantesFunciones.resaltarvalorConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltarvalorConversionUnidad);}
		if(this.conversionunidadConstantesFunciones.resaltarrelacionConversionUnidad!=null && this.jInternalFrameDetalleFormConversionUnidad!=null) {this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setBorder(this.conversionunidadConstantesFunciones.resaltarrelacionConversionUnidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConversionUnidad() throws Exception {		
		if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
	
		//this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostraridConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelidConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostraridConversionUnidad);
		//this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_empresaConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelid_empresaConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_empresaConversionUnidad);
		//this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_unidad_desdeConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelid_unidad_desdeConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_unidad_desdeConversionUnidad);
		//this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_unidad_hastaConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelid_unidad_hastaConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarid_unidad_hastaConversionUnidad);
		//this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarvalorConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelvalorConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarvalorConversionUnidad);
		//this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarrelacionConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jPanelrelacionConversionUnidad.setVisible(this.conversionunidadConstantesFunciones.mostrarrelacionConversionUnidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConversionUnidad() throws Exception {
		if(this.jInternalFrameDetalleFormConversionUnidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConversionUnidad!=null) {
	
		this.jInternalFrameDetalleFormConversionUnidad.jLabelidConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activaridConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_empresaConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activarid_empresaConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_desdeConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activarid_unidad_desdeConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jComboBoxid_unidad_hastaConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activarid_unidad_hastaConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jTextFieldvalorConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activarvalorConversionUnidad);
		this.jInternalFrameDetalleFormConversionUnidad.jTextFieldrelacionConversionUnidad.setEnabled(this.conversionunidadConstantesFunciones.activarrelacionConversionUnidad);
		}
	}
	
		
}