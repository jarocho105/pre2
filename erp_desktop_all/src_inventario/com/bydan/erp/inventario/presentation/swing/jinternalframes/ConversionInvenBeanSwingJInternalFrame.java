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

import com.bydan.erp.inventario.util.ConversionInvenConstantesFunciones;
import com.bydan.erp.inventario.util.ConversionInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.ConversionInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.ConversionInvenBean;
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
public class ConversionInvenBeanSwingJInternalFrame extends ConversionInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConversionInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ConversionInven> conversioninvenValidator = new ClassValidator<ConversionInven>(ConversionInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ConversionInven conversioninven;	
	public ConversionInven conversioninvenAux;
	public ConversionInven conversioninvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ConversionInven conversioninvenTotales;
	public Long idConversionInvenActual;
	public Long iIdNuevoConversionInven=0L;
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

	public String sFinalQueryComboTipoConversionInven="";

	public List<TipoConversionInven> tipoconversioninvensForeignKey;

	public List<TipoConversionInven> gettipoconversioninvensForeignKey() {
		return tipoconversioninvensForeignKey;
	}

	public void settipoconversioninvensForeignKey(List<TipoConversionInven> tipoconversioninvensForeignKey) {
		this.tipoconversioninvensForeignKey = tipoconversioninvensForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoConversionInven tipoconversioninvenForeignKey;

	public TipoConversionInven gettipoconversioninvenForeignKey() {
		return tipoconversioninvenForeignKey;
	}

	public void settipoconversioninvenForeignKey(TipoConversionInven tipoconversioninvenForeignKey) {
		this.tipoconversioninvenForeignKey = tipoconversioninvenForeignKey;
	}

	public String sFinalQueryComboUnidad="";

	public List<Unidad> unidadsForeignKey;

	public List<Unidad> getunidadsForeignKey() {
		return unidadsForeignKey;
	}

	public void setunidadsForeignKey(List<Unidad> unidadsForeignKey) {
		this.unidadsForeignKey = unidadsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadForeignKey;

	public Unidad getunidadForeignKey() {
		return unidadForeignKey;
	}

	public void setunidadForeignKey(Unidad unidadForeignKey) {
		this.unidadForeignKey = unidadForeignKey;
	}

	public String sFinalQueryComboUnidadConversion="";

	public List<Unidad> unidadconversionsForeignKey;

	public List<Unidad> getunidadconversionsForeignKey() {
		return unidadconversionsForeignKey;
	}

	public void setunidadconversionsForeignKey(List<Unidad> unidadconversionsForeignKey) {
		this.unidadconversionsForeignKey = unidadconversionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Unidad unidadconversionForeignKey;

	public Unidad getunidadconversionForeignKey() {
		return unidadconversionForeignKey;
	}

	public void setunidadconversionForeignKey(Unidad unidadconversionForeignKey) {
		this.unidadconversionForeignKey = unidadconversionForeignKey;
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
	
	public Boolean isPermisoTodoConversionInven;
	public Boolean isPermisoNuevoConversionInven;
	public Boolean isPermisoActualizarConversionInven;
	public Boolean isPermisoActualizarOriginalConversionInven;
	public Boolean isPermisoEliminarConversionInven;
	public Boolean isPermisoGuardarCambiosConversionInven;
	public Boolean isPermisoConsultaConversionInven;
	public Boolean isPermisoBusquedaConversionInven;
	public Boolean isPermisoReporteConversionInven;
	public Boolean isPermisoPaginacionMedioConversionInven;
	public Boolean isPermisoPaginacionAltoConversionInven;
	public Boolean isPermisoPaginacionTodoConversionInven;
	public Boolean isPermisoCopiarConversionInven;
	public Boolean isPermisoVerFormConversionInven;
	public Boolean isPermisoDuplicarConversionInven;
	public Boolean isPermisoOrdenConversionInven;
	
	
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
	
	public ConversionInvenParameterReturnGeneral conversioninvenReturnGeneral;
	public ConversionInvenParameterReturnGeneral conversioninvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConversionInven=false;
	public Boolean esParaAccionDesdeFormularioConversionInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConversionInvenSessionBeanAdditional conversioninvenSessionBeanAdditional=null;
	
	public ConversionInvenSessionBeanAdditional getConversionInvenSessionBeanAdditional() {
		return this.conversioninvenSessionBeanAdditional;
	}
	
	public void setConversionInvenSessionBeanAdditional(ConversionInvenSessionBeanAdditional conversioninvenSessionBeanAdditional) {
		try {
			this.conversioninvenSessionBeanAdditional=conversioninvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConversionInvenBeanSwingJInternalFrameAdditional conversioninvenBeanSwingJInternalFrameAdditional=null;
	//public class ConversionInvenBeanSwingJInternalFrame
	
	public ConversionInvenBeanSwingJInternalFrameAdditional getConversionInvenBeanSwingJInternalFrameAdditional() {
		return this.conversioninvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setConversionInvenBeanSwingJInternalFrameAdditional(ConversionInvenBeanSwingJInternalFrameAdditional conversioninvenBeanSwingJInternalFrameAdditional) {
		try {
			this.conversioninvenBeanSwingJInternalFrameAdditional=conversioninvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConversionInvenLogic conversioninvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ConversionInven conversioninvenBean;
	public ConversionInvenConstantesFunciones conversioninvenConstantesFunciones;
	//public ConversionInvenParameterReturnGeneral conversioninvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoConversionInvenLogic tipoconversioninvenLogic;
	public UnidadLogic unidadLogic;
	public UnidadLogic unidadconversionLogic;
	
	//PARAMETROS
	
	
	//public List<ConversionInven> conversioninvens;	
	//public List<ConversionInven> conversioninvensEliminados;
	//public List<ConversionInven> conversioninvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConversionInven=false;
	public Boolean isVisibilidadCeldaDuplicarConversionInven=true;
	public Boolean isVisibilidadCeldaCopiarConversionInven=true;
	public Boolean isVisibilidadCeldaVerFormConversionInven=true;
	public Boolean isVisibilidadCeldaOrdenConversionInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConversionInven=false;
	public Boolean isVisibilidadCeldaModificarConversionInven=false;
	public Boolean isVisibilidadCeldaActualizarConversionInven=false;
	public Boolean isVisibilidadCeldaEliminarConversionInven=false;
	public Boolean isVisibilidadCeldaCancelarConversionInven=false;
	public Boolean isVisibilidadCeldaGuardarConversionInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConversionInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoConversionInven=false;
	public Boolean isVisibilidadFK_IdUnidad=false;
	public Boolean isVisibilidadFK_IdUnidadConversion=false;
	
	public Long getiIdNuevoConversionInven() {
		return this.iIdNuevoConversionInven;
	}

	public void setiIdNuevoConversionInven(Long iIdNuevoConversionInven) {
		this.iIdNuevoConversionInven = iIdNuevoConversionInven;
	}
	
	public Long getidConversionInvenActual() {
		return this.idConversionInvenActual;
	}

	public void setidConversionInvenActual(Long idConversionInvenActual) {
		this.idConversionInvenActual = idConversionInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ConversionInven getconversioninven() {
		return this.conversioninven;
	}

	public void setconversioninven(ConversionInven conversioninven) {
		this.conversioninven = conversioninven;
	}
	
	public ConversionInven getconversioninvenAux() {
		return this.conversioninvenAux;
	}

	public void setconversioninvenAux(ConversionInven conversioninvenAux) {
		this.conversioninvenAux = conversioninvenAux;
	}				
	
	public ConversionInven getconversioninvenAnterior() {
		return this.conversioninvenAnterior;
	}

	public void setconversioninvenAnterior(ConversionInven conversioninvenAnterior) {
		this.conversioninvenAnterior = conversioninvenAnterior;
	}	
	
	public ConversionInven getconversioninvenTotales() {
		return this.conversioninvenTotales;
	}

	public void setconversioninvenTotales(ConversionInven conversioninvenTotales) {
		this.conversioninvenTotales = conversioninvenTotales;
	}	
	
	public ConversionInven getconversioninvenBean() {
		return this.conversioninvenBean;
	}

	public void setconversioninvenBean(ConversionInven conversioninvenBean) {
		this.conversioninvenBean = conversioninvenBean;
	}	
	
	public ConversionInvenParameterReturnGeneral getconversioninvenReturnGeneral() {
		return this.conversioninvenReturnGeneral;
	}

	public void setconversioninvenReturnGeneral(ConversionInvenParameterReturnGeneral conversioninvenReturnGeneral) {
		this.conversioninvenReturnGeneral = conversioninvenReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_conversion_invenFK_IdTipoConversionInven=-1L;

	public Long getid_tipo_conversion_invenFK_IdTipoConversionInven() {
		return this.id_tipo_conversion_invenFK_IdTipoConversionInven;
	}

	public void setid_tipo_conversion_invenFK_IdTipoConversionInven(Long id_tipo_conversion_invenFK_IdTipoConversionInven) {
		this.id_tipo_conversion_invenFK_IdTipoConversionInven = id_tipo_conversion_invenFK_IdTipoConversionInven;
	}

	public Long id_unidadFK_IdUnidad=-1L;

	public Long getid_unidadFK_IdUnidad() {
		return this.id_unidadFK_IdUnidad;
	}

	public void setid_unidadFK_IdUnidad(Long id_unidadFK_IdUnidad) {
		this.id_unidadFK_IdUnidad = id_unidadFK_IdUnidad;
	}

	public Long id_unidad_conversionFK_IdUnidadConversion=-1L;

	public Long getid_unidad_conversionFK_IdUnidadConversion() {
		return this.id_unidad_conversionFK_IdUnidadConversion;
	}

	public void setid_unidad_conversionFK_IdUnidadConversion(Long id_unidad_conversionFK_IdUnidadConversion) {
		this.id_unidad_conversionFK_IdUnidadConversion = id_unidad_conversionFK_IdUnidadConversion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConversionInvenLogic getConversionInvenLogic()	{		
		return conversioninvenLogic;
	}

	public void setConversionInvenLogic(ConversionInvenLogic conversioninvenLogic) {
		this.conversioninvenLogic = conversioninvenLogic;
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
	
	public Boolean getIsEsNuevoConversionInven() {
		return isEsNuevoConversionInven;
	}

	public void setIsEsNuevoConversionInven(Boolean isEsNuevoConversionInven) {
		this.isEsNuevoConversionInven = isEsNuevoConversionInven;
	}

	public Boolean getEsParaAccionDesdeFormularioConversionInven() {
		return esParaAccionDesdeFormularioConversionInven;
	}
	
	public void setEsParaAccionDesdeFormularioConversionInven(Boolean esParaAccionDesdeFormularioConversionInven) {
		this.esParaAccionDesdeFormularioConversionInven = esParaAccionDesdeFormularioConversionInven;
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

			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(conversioninvenSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoConversionInvensForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoconversioninvensForeignKey=new ArrayList<TipoConversionInven>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoConversionInvenLogic tipoconversioninvenLogic=new TipoConversionInvenLogic();

			//tipoconversioninvenLogic.getTipoConversionInvenDataAccess().setIsForForeingKeyData(true);

			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoConversionInven()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoconversioninvenLogic.getTipoConversionInvenDataAccess().setIsForForeingKeyData(true);

					tipoconversioninvenLogic.getTodosTipoConversionInvensWithConnection(sFinalQuery,new Pagination());

					this.tipoconversioninvensForeignKey=tipoconversioninvenLogic.getTipoConversionInvens();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoConversionInven(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLogic.getEntityWithConnection(conversioninvenSessionBean.getlidTipoConversionInvenActual());
					this.tipoconversioninvensForeignKey.add(tipoconversioninvenLogic.getTipoConversionInven());
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

	public void cargarCombosUnidadsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidad(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(conversioninvenSessionBean.getlidUnidadActual());
					this.unidadsForeignKey.add(unidadLogic.getUnidad());
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

	public void cargarCombosUnidadConversionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.unidadconversionsForeignKey=new ArrayList<Unidad>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			UnidadLogic unidadLogic=new UnidadLogic();

			//unidadLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidadConversion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//unidadconversionLogic.getUnidadDataAccess().setIsForForeingKeyData(true);

					unidadLogic.getTodosUnidadsWithConnection(sFinalQuery,new Pagination());

					this.unidadconversionsForeignKey=unidadLogic.getUnidads();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaUnidadConversion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					unidadLogic.getEntityWithConnection(conversioninvenSessionBean.getlidUnidadConversionActual());
					this.unidadconversionsForeignKey.add(unidadLogic.getUnidad());
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

					if(this.conversioninven!=null) {
						this.conversioninven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaConversionInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaConversionInvenGenerico)throws Exception
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
				jComboBoxid_empresaConversionInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaConversionInvenGenerico!=null && jComboBoxid_empresaConversionInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaConversionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoConversionInvenForeignKey(Long idTipoConversionInvenSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoConversionInven  tipoconversioninvenTemp=null;

			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensForeignKey) {
				if(tipoconversioninvenAux.getId()!=null && tipoconversioninvenAux.getId().equals(idTipoConversionInvenSeleccionado)) {
					tipoconversioninvenTemp=tipoconversioninvenAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoconversioninvenTemp!=null) {

					if(this.conversioninven!=null) {
						this.conversioninven.setTipoConversionInven(tipoconversioninvenTemp);
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setSelectedItem(tipoconversioninvenTemp);
					}
				} else {
					//jComboBoxid_tipo_conversion_invenConversionInven.setSelectedItem(tipoconversioninvenTemp);
					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoConversionInven") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoconversioninvenTemp!=null && jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven!=null) {
						jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setSelectedItem(tipoconversioninvenTemp);
					} else {
						if(jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven!=null) {
							//jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setSelectedItem(tipoconversioninvenTemp);
							if(jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.getItemCount()>0) {
								jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setSelectedIndex(0);
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

	public String getActualTipoConversionInvenForeignKeyDescripcion(Long idTipoConversionInvenSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoConversionInven  tipoconversioninvenTemp=null;

			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensForeignKey) {
				if(tipoconversioninvenAux.getId()!=null && tipoconversioninvenAux.getId().equals(idTipoConversionInvenSeleccionado)) {
					tipoconversioninvenTemp=tipoconversioninvenAux;
					break;
				}
			}


			sDescripcion=TipoConversionInvenConstantesFunciones.getTipoConversionInvenDescripcion(tipoconversioninvenTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoConversionInvenForeignKeyGenerico(Long idTipoConversionInvenSeleccionado,JComboBox jComboBoxid_tipo_conversion_invenConversionInvenGenerico)throws Exception
	{
		try
		{
			TipoConversionInven  tipoconversioninvenTemp=null;

			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensForeignKey) {
				if(tipoconversioninvenAux.getId()!=null && tipoconversioninvenAux.getId().equals(idTipoConversionInvenSeleccionado)) {
					tipoconversioninvenTemp=tipoconversioninvenAux;
					break;
				}
			}

			if(tipoconversioninvenTemp!=null) {
				jComboBoxid_tipo_conversion_invenConversionInvenGenerico.setSelectedItem(tipoconversioninvenTemp);
			} else {
				if(jComboBoxid_tipo_conversion_invenConversionInvenGenerico!=null && jComboBoxid_tipo_conversion_invenConversionInvenGenerico.getItemCount()>0) {
					jComboBoxid_tipo_conversion_invenConversionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadForeignKey(Long idUnidadSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadTemp!=null) {

					if(this.conversioninven!=null) {
						this.conversioninven.setUnidad(unidadTemp);
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setSelectedItem(unidadTemp);
					}
				} else {
					//jComboBoxid_unidadConversionInven.setSelectedItem(unidadTemp);
					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadTemp!=null && jComboBoxid_unidadFK_IdUnidadConversionInven!=null) {
						jComboBoxid_unidadFK_IdUnidadConversionInven.setSelectedItem(unidadTemp);
					} else {
						if(jComboBoxid_unidadFK_IdUnidadConversionInven!=null) {
							//jComboBoxid_unidadFK_IdUnidadConversionInven.setSelectedItem(unidadTemp);
							if(jComboBoxid_unidadFK_IdUnidadConversionInven.getItemCount()>0) {
								jComboBoxid_unidadFK_IdUnidadConversionInven.setSelectedIndex(0);
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

	public String getActualUnidadForeignKeyDescripcion(Long idUnidadSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadForeignKeyGenerico(Long idUnidadSeleccionado,JComboBox jComboBoxid_unidadConversionInvenGenerico)throws Exception
	{
		try
		{
			Unidad  unidadTemp=null;

			for(Unidad unidadAux:unidadsForeignKey) {
				if(unidadAux.getId()!=null && unidadAux.getId().equals(idUnidadSeleccionado)) {
					unidadTemp=unidadAux;
					break;
				}
			}

			if(unidadTemp!=null) {
				jComboBoxid_unidadConversionInvenGenerico.setSelectedItem(unidadTemp);
			} else {
				if(jComboBoxid_unidadConversionInvenGenerico!=null && jComboBoxid_unidadConversionInvenGenerico.getItemCount()>0) {
					jComboBoxid_unidadConversionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualUnidadConversionForeignKey(Long idUnidadConversionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Unidad  unidadconversionTemp=null;

			for(Unidad unidadconversionAux:unidadconversionsForeignKey) {
				if(unidadconversionAux.getId()!=null && unidadconversionAux.getId().equals(idUnidadConversionSeleccionado)) {
					unidadconversionTemp=unidadconversionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(unidadconversionTemp!=null) {

					if(this.conversioninven!=null) {
						this.conversioninven.setUnidadConversion(unidadconversionTemp);
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setSelectedItem(unidadconversionTemp);
					}
				} else {
					//jComboBoxid_unidad_conversionConversionInven.setSelectedItem(unidadconversionTemp);
					if(this.jInternalFrameDetalleFormConversionInven!=null) {
						if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdUnidadConversion") || sFormularioTipoBusqueda.equals("Todos")){
					if(unidadconversionTemp!=null && jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven!=null) {
						jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setSelectedItem(unidadconversionTemp);
					} else {
						if(jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven!=null) {
							//jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setSelectedItem(unidadconversionTemp);
							if(jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.getItemCount()>0) {
								jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setSelectedIndex(0);
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

	public String getActualUnidadConversionForeignKeyDescripcion(Long idUnidadConversionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Unidad  unidadconversionTemp=null;

			for(Unidad unidadconversionAux:unidadconversionsForeignKey) {
				if(unidadconversionAux.getId()!=null && unidadconversionAux.getId().equals(idUnidadConversionSeleccionado)) {
					unidadconversionTemp=unidadconversionAux;
					break;
				}
			}


			sDescripcion=UnidadConstantesFunciones.getUnidadDescripcion(unidadconversionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualUnidadConversionForeignKeyGenerico(Long idUnidadConversionSeleccionado,JComboBox jComboBoxid_unidad_conversionConversionInvenGenerico)throws Exception
	{
		try
		{
			Unidad  unidadconversionTemp=null;

			for(Unidad unidadconversionAux:unidadconversionsForeignKey) {
				if(unidadconversionAux.getId()!=null && unidadconversionAux.getId().equals(idUnidadConversionSeleccionado)) {
					unidadconversionTemp=unidadconversionAux;
					break;
				}
			}

			if(unidadconversionTemp!=null) {
				jComboBoxid_unidad_conversionConversionInvenGenerico.setSelectedItem(unidadconversionTemp);
			} else {
				if(jComboBoxid_unidad_conversionConversionInvenGenerico!=null && jComboBoxid_unidad_conversionConversionInvenGenerico.getItemCount()>0) {
					jComboBoxid_unidad_conversionConversionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ConversionInven conversioninven,JComboBox jComboBoxid_empresaConversionInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaConversionInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaConversionInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				conversioninven.setid_empresa(empresaAux.getId());
				conversioninven.setempresa_descripcion(ConversionInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				conversioninven.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoConversionInvenForeignKey(ConversionInven conversioninven,JComboBox jComboBoxid_tipo_conversion_invenConversionInvenGenerico)throws Exception
	{
		try
		{
			TipoConversionInven  tipoconversioninvenAux=new TipoConversionInven();

			if(jComboBoxid_tipo_conversion_invenConversionInvenGenerico==null) {
				tipoconversioninvenAux=(TipoConversionInven)this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.getSelectedItem();
			} else {
				tipoconversioninvenAux=(TipoConversionInven)jComboBoxid_tipo_conversion_invenConversionInvenGenerico.getSelectedItem();
			}

			if(tipoconversioninvenAux!=null && tipoconversioninvenAux.getId()!=null) {
				conversioninven.setid_tipo_conversion_inven(tipoconversioninvenAux.getId());
				conversioninven.settipoconversioninven_descripcion(ConversionInvenConstantesFunciones.getTipoConversionInvenDescripcion(tipoconversioninvenAux));
				conversioninven.setTipoConversionInven(tipoconversioninvenAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadForeignKey(ConversionInven conversioninven,JComboBox jComboBoxid_unidadConversionInvenGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidadConversionInvenGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidadConversionInvenGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				conversioninven.setid_unidad(unidadAux.getId());
				conversioninven.setunidad_descripcion(ConversionInvenConstantesFunciones.getUnidadDescripcion(unidadAux));
				conversioninven.setUnidad(unidadAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarUnidadConversionForeignKey(ConversionInven conversioninven,JComboBox jComboBoxid_unidad_conversionConversionInvenGenerico)throws Exception
	{
		try
		{
			Unidad  unidadAux=new Unidad();

			if(jComboBoxid_unidad_conversionConversionInvenGenerico==null) {
				unidadAux=(Unidad)this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.getSelectedItem();
			} else {
				unidadAux=(Unidad)jComboBoxid_unidad_conversionConversionInvenGenerico.getSelectedItem();
			}

			if(unidadAux!=null && unidadAux.getId()!=null) {
				conversioninven.setid_unidad_conversion(unidadAux.getId());
				conversioninven.setunidadconversion_descripcion(ConversionInvenConstantesFunciones.getUnidadConversionDescripcion(unidadAux));
				conversioninven.setUnidadConversion(unidadAux);			}
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

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) { 
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) { 
					}

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoConversionInvensForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoConversionInven=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) { 
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.removeAllItems();

							for(TipoConversionInven tipoconversioninven:this.tipoconversioninvensForeignKey) {
								this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.addItem(tipoconversioninven);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) { 
					}

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoConversionInven") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.removeAllItems();

							for(TipoConversionInven tipoconversioninven:this.tipoconversioninvensForeignKey) {
								this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.addItem(tipoconversioninven);
							}
						}

						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) { 
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.addItem(unidad);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) { 
					}

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidad") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidadFK_IdUnidadConversionInven.removeAllItems();

							for(Unidad unidad:this.unidadsForeignKey) {
								this.jComboBoxid_unidadFK_IdUnidadConversionInven.addItem(unidad);
							}
						}

						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameUnidadConversionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingUnidad=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) { 
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.removeAllItems();

							for(Unidad unidadconversion:this.unidadconversionsForeignKey) {
								this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.addItem(unidadconversion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConversionInven!=null) { 
					}

					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdUnidadConversion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.removeAllItems();

							for(Unidad unidadconversion:this.unidadconversionsForeignKey) {
								this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.addItem(unidadconversion);
							}
						}

						if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoConversionInvenForeignKey(TipoConversionInven tipoconversioninven,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setSelectedItem(tipoconversioninven);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setSelectedItem(tipoconversioninven);
						} else {
							this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadForeignKey(Unidad unidad,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setSelectedItem(unidad);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidadFK_IdUnidadConversionInven.setSelectedItem(unidad);
						} else {
							this.jComboBoxid_unidadFK_IdUnidadConversionInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameUnidadConversionForeignKey(Unidad unidadconversion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setSelectedItem(unidadconversion);
						}
					} else {
						if(this.jInternalFrameDetalleFormConversionInven!=null) {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setSelectedItem(unidadconversion);
						} else {
							this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConversionInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConversionInvenConstantesFunciones.refrescarForeignKeysDescripcionesConversionInven(this.conversioninvenLogic.getConversionInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConversionInvenConstantesFunciones.refrescarForeignKeysDescripcionesConversionInven(this.conversioninvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoConversionInven.class));
		classes.add(new Classe(Unidad.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//conversioninvenLogic.setConversionInvens(this.conversioninvens);
			conversioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConversionInvenParameterReturnGeneral getConversionInvenParameterGeneral() {
		return this.conversioninvenParameterGeneral;
	}
	
	public void setConversionInvenParameterGeneral(ConversionInvenParameterReturnGeneral conversioninvenParameterGeneral) {
		this.conversioninvenParameterGeneral = conversioninvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConversionInven() {
		return isPermisoTodoConversionInven;
	}

	public void setIsPermisoTodoConversionInven(Boolean isPermisoTodoConversionInven) {
		this.isPermisoTodoConversionInven = isPermisoTodoConversionInven;
	}

	public Boolean getIsPermisoNuevoConversionInven() {
		return isPermisoNuevoConversionInven;
	}

	public void setIsPermisoNuevoConversionInven(Boolean isPermisoNuevoConversionInven) {
		this.isPermisoNuevoConversionInven = isPermisoNuevoConversionInven;
	}

	public Boolean getIsPermisoActualizarConversionInven() {
		return isPermisoActualizarConversionInven;
	}

	public void setIsPermisoActualizarConversionInven(Boolean isPermisoActualizarConversionInven) {
		this.isPermisoActualizarConversionInven = isPermisoActualizarConversionInven;
	}

	public Boolean getIsPermisoEliminarConversionInven() {
		return isPermisoEliminarConversionInven;
	}

	public void setIsPermisoEliminarConversionInven(Boolean isPermisoEliminarConversionInven) {
		this.isPermisoEliminarConversionInven = isPermisoEliminarConversionInven;
	}

	public Boolean getIsPermisoGuardarCambiosConversionInven() {
		return isPermisoGuardarCambiosConversionInven;
	}

	public void setIsPermisoGuardarCambiosConversionInven(Boolean isPermisoGuardarCambiosConversionInven) {
		this.isPermisoGuardarCambiosConversionInven = isPermisoGuardarCambiosConversionInven;
	}
	
	public Boolean getIsPermisoConsultaConversionInven() {
		return isPermisoConsultaConversionInven;
	}

	public void setIsPermisoConsultaConversionInven(Boolean isPermisoConsultaConversionInven) {
		this.isPermisoConsultaConversionInven = isPermisoConsultaConversionInven;
	}

	public Boolean getIsPermisoBusquedaConversionInven() {
		return isPermisoBusquedaConversionInven;
	}

	public void setIsPermisoBusquedaConversionInven(Boolean isPermisoBusquedaConversionInven) {
		this.isPermisoBusquedaConversionInven = isPermisoBusquedaConversionInven;
	}

	public Boolean getIsPermisoReporteConversionInven() {
		return isPermisoReporteConversionInven;
	}

	public void setIsPermisoReporteConversionInven(Boolean isPermisoReporteConversionInven) {
		this.isPermisoReporteConversionInven = isPermisoReporteConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioConversionInven() {
		return isPermisoPaginacionMedioConversionInven;
	}

	public void setIsPermisoPaginacionMedioConversionInven(Boolean isPermisoPaginacionMedioConversionInven) {
		this.isPermisoPaginacionMedioConversionInven = isPermisoPaginacionMedioConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoConversionInven() {
		return isPermisoPaginacionTodoConversionInven;
	}

	public void setIsPermisoPaginacionTodoConversionInven(Boolean isPermisoPaginacionTodoConversionInven) {
		this.isPermisoPaginacionTodoConversionInven = isPermisoPaginacionTodoConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoConversionInven() {
		return isPermisoPaginacionAltoConversionInven;
	}

	public void setIsPermisoPaginacionAltoConversionInven(Boolean isPermisoPaginacionAltoConversionInven) {
		this.isPermisoPaginacionAltoConversionInven = isPermisoPaginacionAltoConversionInven;
	}
	
	public Boolean getIsPermisoCopiarConversionInven() {
		return isPermisoCopiarConversionInven;
	}

	public void setIsPermisoCopiarConversionInven(Boolean isPermisoCopiarConversionInven) {
		this.isPermisoCopiarConversionInven = isPermisoCopiarConversionInven;
	}
	
	public Boolean getIsPermisoVerFormConversionInven() {
		return isPermisoVerFormConversionInven;
	}

	public void setIsPermisoVerFormConversionInven(Boolean isPermisoVerFormConversionInven) {
		this.isPermisoVerFormConversionInven = isPermisoVerFormConversionInven;
	}
	
	public Boolean getIsPermisoDuplicarConversionInven() {
		return isPermisoDuplicarConversionInven;
	}

	public void setIsPermisoDuplicarConversionInven(Boolean isPermisoDuplicarConversionInven) {
		this.isPermisoDuplicarConversionInven = isPermisoDuplicarConversionInven;
	}
	
	public Boolean getIsPermisoOrdenConversionInven() {
		return isPermisoOrdenConversionInven;
	}

	public void setIsPermisoOrdenConversionInven(Boolean isPermisoOrdenConversionInven) {
		this.isPermisoOrdenConversionInven = isPermisoOrdenConversionInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConversionInven() {
		return isVisibilidadCeldaNuevoConversionInven;
	}

	public void setIsVisibilidadCeldaNuevoConversionInven(Boolean isVisibilidadCeldaNuevoConversionInven) {
		this.isVisibilidadCeldaNuevoConversionInven = isVisibilidadCeldaNuevoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConversionInven() {
		return isVisibilidadCeldaDuplicarConversionInven;
	}

	public void setIsVisibilidadCeldaDuplicarConversionInven(Boolean isVisibilidadCeldaDuplicarConversionInven) {
		this.isVisibilidadCeldaDuplicarConversionInven = isVisibilidadCeldaDuplicarConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConversionInven() {
		return isVisibilidadCeldaCopiarConversionInven;
	}

	public void setIsVisibilidadCeldaCopiarConversionInven(Boolean isVisibilidadCeldaCopiarConversionInven) {
		this.isVisibilidadCeldaCopiarConversionInven = isVisibilidadCeldaCopiarConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConversionInven() {
		return isVisibilidadCeldaVerFormConversionInven;
	}

	public void setIsVisibilidadCeldaVerFormConversionInven(Boolean isVisibilidadCeldaVerFormConversionInven) {
		this.isVisibilidadCeldaVerFormConversionInven = isVisibilidadCeldaVerFormConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConversionInven() {
		return isVisibilidadCeldaOrdenConversionInven;
	}

	public void setIsVisibilidadCeldaOrdenConversionInven(Boolean isVisibilidadCeldaOrdenConversionInven) {
		this.isVisibilidadCeldaOrdenConversionInven = isVisibilidadCeldaOrdenConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConversionInven() {
		return isVisibilidadCeldaNuevoRelacionesConversionInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConversionInven(Boolean isVisibilidadCeldaNuevoRelacionesConversionInven) {
		this.isVisibilidadCeldaNuevoRelacionesConversionInven = isVisibilidadCeldaNuevoRelacionesConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConversionInven() {
		return isVisibilidadCeldaModificarConversionInven;
	}

	public void setIsVisibilidadCeldaModificarConversionInven(Boolean isVisibilidadCeldaModificarConversionInven) {
		this.isVisibilidadCeldaModificarConversionInven = isVisibilidadCeldaModificarConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConversionInven() {
		return isVisibilidadCeldaActualizarConversionInven;
	}

	public void setIsVisibilidadCeldaActualizarConversionInven(Boolean isVisibilidadCeldaActualizarConversionInven) {
		this.isVisibilidadCeldaActualizarConversionInven = isVisibilidadCeldaActualizarConversionInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarConversionInven() {
		return isVisibilidadCeldaEliminarConversionInven;
	}

	public void setIsVisibilidadCeldaEliminarConversionInven(Boolean isVisibilidadCeldaEliminarConversionInven) {
		this.isVisibilidadCeldaEliminarConversionInven = isVisibilidadCeldaEliminarConversionInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarConversionInven() {
		return isVisibilidadCeldaCancelarConversionInven;
	}

	public void setIsVisibilidadCeldaCancelarConversionInven(Boolean isVisibilidadCeldaCancelarConversionInven) {
		this.isVisibilidadCeldaCancelarConversionInven = isVisibilidadCeldaCancelarConversionInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarConversionInven() {
		return isVisibilidadCeldaGuardarConversionInven;
	}

	public void setIsVisibilidadCeldaGuardarConversionInven(Boolean isVisibilidadCeldaGuardarConversionInven) {
		this.isVisibilidadCeldaGuardarConversionInven = isVisibilidadCeldaGuardarConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConversionInven() {
		return isVisibilidadCeldaGuardarCambiosConversionInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConversionInven(Boolean isVisibilidadCeldaGuardarCambiosConversionInven) {
		this.isVisibilidadCeldaGuardarCambiosConversionInven = isVisibilidadCeldaGuardarCambiosConversionInven;
	}
		
	public ConversionInvenSessionBean getconversioninvenSessionBean() {
		return this.conversioninvenSessionBean;
	}
	
	public void setconversioninvenSessionBean(ConversionInvenSessionBean conversioninvenSessionBean) {
		this.conversioninvenSessionBean=conversioninvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoConversionInven() {
		return this.isVisibilidadFK_IdTipoConversionInven;
	}

	public void setisVisibilidadFK_IdTipoConversionInven(Boolean isVisibilidadFK_IdTipoConversionInven) {
		this.isVisibilidadFK_IdTipoConversionInven=isVisibilidadFK_IdTipoConversionInven;
	}

	public Boolean getisVisibilidadFK_IdUnidad() {
		return this.isVisibilidadFK_IdUnidad;
	}

	public void setisVisibilidadFK_IdUnidad(Boolean isVisibilidadFK_IdUnidad) {
		this.isVisibilidadFK_IdUnidad=isVisibilidadFK_IdUnidad;
	}

	public Boolean getisVisibilidadFK_IdUnidadConversion() {
		return this.isVisibilidadFK_IdUnidadConversion;
	}

	public void setisVisibilidadFK_IdUnidadConversion(Boolean isVisibilidadFK_IdUnidadConversion) {
		this.isVisibilidadFK_IdUnidadConversion=isVisibilidadFK_IdUnidadConversion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConversionInven(ConversionInven conversioninven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(conversioninven,null);
				this.setActualParaGuardarTipoConversionInvenForeignKey(conversioninven,null);
				this.setActualParaGuardarUnidadForeignKey(conversioninven,null);
				this.setActualParaGuardarUnidadConversionForeignKey(conversioninven,null);
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
	
	public void bugActualizarReferenciaActual(ConversionInven conversioninven,ConversionInven conversioninvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConversionInven(conversioninven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conversioninvenAux.setId(conversioninven.getId());
		conversioninvenAux.setVersionRow(conversioninven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConversionInven();
		
			int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = conversioninvenValidator.getInvalidValues(this.conversioninven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			conversioninvenLogic.setDatosCliente(datosCliente);
			conversioninvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				conversioninvenAux=new  ConversionInven();
				
				conversioninvenAux.setIsNew(true);
				conversioninvenAux.setIsChanged(true);
				
				conversioninvenAux.setConversionInvenOriginal(this.conversioninven);
				
				conversioninvenAux.setId(this.conversioninven.getId());	
				conversioninvenAux.setVersionRow(this.conversioninven.getVersionRow());	
				conversioninvenAux.setid_empresa(this.conversioninven.getid_empresa());	
				conversioninvenAux.setid_tipo_conversion_inven(this.conversioninven.getid_tipo_conversion_inven());	
				conversioninvenAux.setid_unidad(this.conversioninven.getid_unidad());	
				conversioninvenAux.setid_unidad_conversion(this.conversioninven.getid_unidad_conversion());	
				conversioninvenAux.setvalor(this.conversioninven.getvalor());	
				conversioninvenAux.setdescripcion(this.conversioninven.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversioninvenAux,conversioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.saveConversionInvens();//WithConnection
						//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);
					
					this.refrescarForeignKeysDescripcionesConversionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversioninvenLogic.saveConversionInvenRelaciones(conversioninvenAux);//WithConnection
								//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conversioninvenAux,conversioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				conversioninvenAux=new  ConversionInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.conversioninvenSessionBean.getEsGuardarRelacionado() 
					|| (this.conversioninvenSessionBean.getEsGuardarRelacionado() && this.conversioninven.getId()>=0)) {
						
					conversioninvenAux.setIsNew(false);
				}
				
				conversioninvenAux.setIsDeleted(false);
			
				conversioninvenAux.setId(this.conversioninven.getId());	
				conversioninvenAux.setVersionRow(this.conversioninven.getVersionRow());	
				conversioninvenAux.setid_empresa(this.conversioninven.getid_empresa());	
				conversioninvenAux.setid_tipo_conversion_inven(this.conversioninven.getid_tipo_conversion_inven());	
				conversioninvenAux.setid_unidad(this.conversioninven.getid_unidad());	
				conversioninvenAux.setid_unidad_conversion(this.conversioninven.getid_unidad_conversion());	
				conversioninvenAux.setvalor(this.conversioninven.getvalor());	
				conversioninvenAux.setdescripcion(this.conversioninven.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversioninvenAux,conversioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.saveConversionInvens();//WithConnection
						//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);
					
					this.refrescarForeignKeysDescripcionesConversionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversioninvenLogic.saveConversionInvenRelaciones(conversioninvenAux);//WithConnection
								//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conversioninvenAux,conversioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conversioninven,conversioninvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				conversioninvenAux=new  ConversionInven();
				
				conversioninvenAux.setIsNew(false);
				conversioninvenAux.setIsChanged(false);
				
				conversioninvenAux.setIsDeleted(true);
				
				conversioninvenAux.setId(this.conversioninven.getId());	
				conversioninvenAux.setVersionRow(this.conversioninven.getVersionRow());	
				conversioninvenAux.setid_empresa(this.conversioninven.getid_empresa());	
				conversioninvenAux.setid_tipo_conversion_inven(this.conversioninven.getid_tipo_conversion_inven());	
				conversioninvenAux.setid_unidad(this.conversioninven.getid_unidad());	
				conversioninvenAux.setid_unidad_conversion(this.conversioninven.getid_unidad_conversion());	
				conversioninvenAux.setvalor(this.conversioninven.getvalor());	
				conversioninvenAux.setdescripcion(this.conversioninven.getdescripcion());	
				
				if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.conversioninvenAux.getId()>=0) {	
						this.conversioninvensEliminados.add(conversioninvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversioninvenAux,conversioninvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.saveConversionInvens();//WithConnection
						//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conversioninvenLogic.saveConversionInvenRelaciones(conversioninvenAux);//WithConnection
								//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
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
							if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(conversioninvenAux,conversioninvenLogic.getConversionInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(conversioninvenAux,conversioninvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getConversionInvens().addAll(this.conversioninvensEliminados);
					
					conversioninvenLogic.saveConversionInvens();//WithConnection
					//conversioninvenLogic.getSetVersionRowConversionInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConversionInven();
				
				this.conversioninvensEliminados= new ArrayList<ConversionInven>();		
			}
			
			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Conversion Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.conversioninven=conversioninvenAux;
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
      		//this.finishProcessConversionInven();
      	}
		
	}	
	
	public void actualizarRelaciones(ConversionInven conversioninvenLocal) throws Exception {
		
		if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ConversionInven conversioninvenLocal) throws Exception {	
		if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				conversioninvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoConversionInvenDetalleFormJInternalFrame.class)) {
				TipoConversionInvenBeanSwingJInternalFrame tipoconversioninvenBeanSwingJInternalFrameLocal=(TipoConversionInvenBeanSwingJInternalFrame) ((TipoConversionInvenDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoconversioninvenBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoConversionInven(tipoconversioninvenBeanSwingJInternalFrameLocal.gettipoconversioninven(),true);
				tipoconversioninvenBeanSwingJInternalFrameLocal.actualizarLista(tipoconversioninvenBeanSwingJInternalFrameLocal.tipoconversioninven,this.tipoconversioninvensForeignKey);

				tipoconversioninvenBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoconversioninvenBeanSwingJInternalFrameLocal.tipoconversioninven);

				conversioninvenLocal.setTipoConversionInven(tipoconversioninvenBeanSwingJInternalFrameLocal.tipoconversioninven);

				this.addItemDefectoCombosForeignKeyTipoConversionInven();
				this.cargarCombosFrameTipoConversionInvensForeignKey("Formulario");
				this.setActualTipoConversionInvenForeignKey(tipoconversioninvenBeanSwingJInternalFrameLocal.tipoconversioninven.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadBeanSwingJInternalFrameLocal.actualizarLista(unidadBeanSwingJInternalFrameLocal.unidad,this.unidadsForeignKey);

				unidadBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadBeanSwingJInternalFrameLocal.unidad);

				conversioninvenLocal.setUnidad(unidadBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey("Formulario");
				this.setActualUnidadForeignKey(unidadBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(UnidadDetalleFormJInternalFrame.class)) {
				UnidadBeanSwingJInternalFrame unidadconversionBeanSwingJInternalFrameLocal=(UnidadBeanSwingJInternalFrame) ((UnidadDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				unidadconversionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoUnidad(unidadconversionBeanSwingJInternalFrameLocal.getunidad(),true);
				unidadconversionBeanSwingJInternalFrameLocal.actualizarLista(unidadconversionBeanSwingJInternalFrameLocal.unidad,this.unidadconversionsForeignKey);

				unidadconversionBeanSwingJInternalFrameLocal.actualizarRelaciones(unidadconversionBeanSwingJInternalFrameLocal.unidad);

				conversioninvenLocal.setUnidadConversion(unidadconversionBeanSwingJInternalFrameLocal.unidad);

				this.addItemDefectoCombosForeignKeyUnidadConversion();
				this.cargarCombosFrameUnidadConversionsForeignKey("Formulario");
				this.setActualUnidadConversionForeignKey(unidadconversionBeanSwingJInternalFrameLocal.unidad.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConversionInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conversioninvenValidator.getInvalidValues(this.conversioninven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ConversionInven conversioninven,List<ConversionInven> conversioninvens) throws Exception {
		try	{		
			ConversionInvenConstantesFunciones.actualizarLista(conversioninven,conversioninvens,this.conversioninvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ConversionInven conversioninven,List<ConversionInven> conversioninvens) throws Exception {
		try	{			
			ConversionInvenConstantesFunciones.actualizarSelectedLista(conversioninven,conversioninvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ConversionInven> conversioninvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conversioninvensLocal=this.conversioninvenLogic.getConversionInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conversioninvensLocal=this.conversioninvens;
			}
			//ARCHITECTURE
		
			for(ConversionInven conversioninvenLocal:conversioninvensLocal) {
				if(this.permiteMantenimiento(conversioninvenLocal) && conversioninvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConversionInvenConstantesFunciones.getConversionInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelid_empresaConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.IDTIPOCONVERSIONINVEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelid_tipo_conversion_invenConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.IDUNIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelid_unidadConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.IDUNIDADCONVERSION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelid_unidad_conversionConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelvalorConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConversionInvenConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabeldescripcionConversionInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabelid_empresaConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabelid_tipo_conversion_invenConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabelid_unidadConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabelid_unidad_conversionConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabelvalorConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConversionInven.jLabeldescripcionConversionInven,"");
		
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
		this.iIdNuevoConversionInven--;	
		
		
		this.conversioninvenAux=new ConversionInven();
		
		this.conversioninvenAux.setId(this.iIdNuevoConversionInven);
		this.conversioninvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conversioninvenLogic.getConversionInvens().add(this.conversioninvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conversioninvens.add(this.conversioninvenAux);
		}
		//ARCHITECTURE
		
		this.conversioninven=this.conversioninvenAux;
		
		if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConversionInven(this.conversioninven);
			this.setVariablesObjetoActualToFormularioForeignKeyConversionInven(this.conversioninven);
		}
				
		//this.setDefaultControlesConversionInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConversionInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConversionInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConversionInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConversionInven(this.conversioninvenBean,this.conversioninven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConversionInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
			classes=ConversionInvenConstantesFunciones.getClassesRelationshipsOfConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.conversioninvenReturnGeneral=conversioninvenLogic.procesarEventosConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversioninvenLogic.getConversionInvens(),this.conversioninven,this.conversioninvenParameterGeneral,this.isEsNuevoConversionInven,classes);//this.conversioninvenLogic.getConversionInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConversionInven(this.conversioninvenReturnGeneral,this.conversioninvenBean,false);
		
		if(this.conversioninvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConversionInven(this.conversioninvenReturnGeneral.getConversionInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConversionInven(this.conversioninvenReturnGeneral.getConversionInven());
		}
		
		if(this.conversioninvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConversionInven(this.conversioninvenReturnGeneral.getConversionInven(),classes);//this.conversioninvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConversionInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConversionInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConversionInvenBeanSwingJInternalFrameAdditional.RecargarFormConversionInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConversionInven(false);
						
			if(conversioninvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionInven();
			}
			
			this.actualizarVisualTableDatosConversionInven();
			
			this.jTableDatosConversionInven.setRowSelectionInterval(this.getIndiceNuevoConversionInven(), this.getIndiceNuevoConversionInven());
			
			this.seleccionarFilaTablaConversionInvenActual();
						
			this.actualizarEstadoCeldasBotonesConversionInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConversionInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activarvalorConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activardescripcionConversionInven);	
		//
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activarid_empresaConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activarid_tipo_conversion_invenConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activarid_unidadConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setEnabled(isHabilitar && this.conversioninvenConstantesFunciones.activarid_unidad_conversionConversionInven);
	};
	
	public void setDefaultControlesConversionInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConversionInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conversioninvenSessionBean.setConGuardarRelaciones(true);			
			this.conversioninvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.setVisible(true);
			
					
		} else {
			//this.conversioninvenSessionBean.setConGuardarRelaciones(false);			
			this.conversioninvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConversionInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
				if(conversioninvenAux.getId().equals(this.iIdNuevoConversionInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionInven conversioninvenAux:this.conversioninvens) {
				if(conversioninvenAux.getId().equals(this.iIdNuevoConversionInven)) {
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
	
	public int getIndiceActualConversionInven(ConversionInven conversioninven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
				if(conversioninvenAux.getId().equals(conversioninven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionInven conversioninvenAux:this.conversioninvens) {
				if(conversioninvenAux.getId().equals(conversioninven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConversionInven(ConversionInven conversioninvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
				if(conversioninvenAux.getConversionInvenOriginal().getId().equals(conversioninvenOriginal.getId())) {
					existe=true;
					conversioninvenOriginal.setId(conversioninvenAux.getId());
					conversioninvenOriginal.setVersionRow(conversioninvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionInven conversioninvenAux:this.conversioninvens) {
				if(conversioninvenAux.getConversionInvenOriginal().getId().equals(conversioninvenOriginal.getId())) {
					existe=true;
					conversioninvenOriginal.setId(conversioninvenAux.getId());
					conversioninvenOriginal.setVersionRow(conversioninvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConversionInven(Boolean esParaCancelar) throws Exception {
		conversioninvensAux=new ArrayList<ConversionInven>();
		conversioninvenAux=new ConversionInven();
		
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
					if(conversioninvenAux.getId()<0) {
						conversioninvensAux.add(conversioninvenAux);
					}		
				}
				this.iIdNuevoConversionInven=0L;
				this.conversioninvenLogic.getConversionInvens().removeAll(conversioninvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionInven conversioninvenAux:this.conversioninvens) {
					if(conversioninvenAux.getId()<0) {
						conversioninvensAux.add(conversioninvenAux);
					}		
				}
				this.iIdNuevoConversionInven=0L;
				this.conversioninvens.removeAll(conversioninvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConversionInven 
					&& this.conversioninvenLogic.getConversionInvens().size()>0
					) {
					conversioninvenAux=this.conversioninvenLogic.getConversionInvens().get(this.conversioninvenLogic.getConversionInvens().size() - 1);
				
					if(conversioninvenAux.getId()<0) {
						this.conversioninvenLogic.getConversionInvens().remove(conversioninvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConversionInven && this.conversioninvens.size()>0) {
					conversioninvenAux=this.conversioninvens.get(this.conversioninvens.size() - 1);
				
					if(conversioninvenAux.getId()<0) {
						this.conversioninvens.remove(conversioninvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConversionInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conversioninven.getId()<0) {
				this.conversioninvenLogic.getConversionInvens().remove(this.conversioninven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conversioninven.getId()<0) {
				this.conversioninvens.remove(this.conversioninven);
			}
		}			
	}
	
	public void setEstadosInicialesConversionInven(List<ConversionInven> conversioninvensAux) throws Exception {
		ConversionInvenConstantesFunciones.setEstadosInicialesConversionInven(conversioninvensAux);
	}
	
	public void setEstadosInicialesConversionInven(ConversionInven conversioninvenAux) throws Exception {
		ConversionInvenConstantesFunciones.setEstadosInicialesConversionInven(conversioninvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConversionInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConversionInvenActual()) {
				if(!this.isEsNuevoConversionInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConversionInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConversionInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conversion Inven ?", "MANTENIMIENTO DE Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ConversionInven conversioninven) throws Exception {
		ConversionInvenConstantesFunciones.seleccionarAsignar(this.conversioninven,conversioninven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConversionInven=this.isPermisoActualizarOriginalConversionInven;
			
			
			this.seleccionarAsignar(conversioninven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConversionInvenConstantesFunciones.quitarEspaciosConversionInven(this.conversioninven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conversioninvenSessionBean.setsFuncionBusquedaRapida(this.conversioninvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConversionInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConversionInven(esParaCancelar);				
				this.cancelarNuevoConversionInven(esParaCancelar);								
			}
			
			this.conversioninven=new ConversionInven();
			
			this.inicializarConversionInven();
			
			this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConversionInven() throws Exception {
		try {
			ConversionInvenConstantesFunciones.inicializarConversionInven(this.conversioninven);
			
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
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conversioninvenLogic.getConversionInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConversionInvens(String sAccionBusqueda,List<ConversionInven> conversioninvensParaReportes) throws Exception {
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
					sPathReporteFinal="ConversionInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConversionInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConversionInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ConversionInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conversion Invenes");		
		parameters.put("busquedapor", ConversionInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConversionInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConversionInven=new JRBeanArrayDataSource(ConversionInvenJInternalFrame.TraerConversionInvenBeans(conversioninvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConversionInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConversionInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConversionInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConversionInvenBean.TraerConversionInvenBeans(conversioninvensParaReportes).toArray()));
							
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
				this.generarExcelReporteConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConversionInvenActionPerformed(null);
					//this.generarExcelReporteConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConversionInvens(sAccionBusqueda,sTipoArchivoReporte,conversioninvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionInven> conversioninvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConversionInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ConversionInven conversioninven : conversioninvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConversionInvenConstantesFunciones.generarExcelReporteDataConversionInven("NORMAL",row,workbook,conversioninven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConversionInven(String sTipo,Row row,Workbook workbook) {
		
		ConversionInvenConstantesFunciones.generarExcelReporteHeaderConversionInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionInven> conversioninvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ConversionInven conversioninven : conversioninvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConversionInvenConstantesFunciones.getConversionInvenDescripcion(conversioninven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.gettipoconversioninven_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.getunidad_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.getunidadconversion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conversioninven.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<ConversionInven> conversioninvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ConversionInven> conversioninvensRespaldo=null;
		
		classes=ConversionInvenConstantesFunciones.getClassesRelationshipsOfConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conversioninvenLogic.setDatosCliente(this.datosCliente);
		this.conversioninvenLogic.setDatosDeep(this.datosDeep);
		this.conversioninvenLogic.setIsConDeep(true);
		
		conversioninvensRespaldo=this.conversioninvenLogic.getConversionInvens();
		
		this.conversioninvenLogic.setConversionInvens(conversioninvensParaReportes);	
		this.conversioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conversioninvensParaReportes=this.conversioninvenLogic.getConversionInvens();
		this.conversioninvenLogic.setConversionInvens(conversioninvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ConversionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConversionInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ConversionInven conversioninven : conversioninvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConversionInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConversionInvenConstantesFunciones.generarExcelReporteDataConversionInven("NORMAL",row,workbook,conversioninven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConversionInvenConstantesFunciones.getConversionInvenDescripcion(conversioninven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConversionInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConversionInven() throws Exception {		
		this.startProcessConversionInven(true);
	}
	
	public void startProcessConversionInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConversionInven ,this.jPanelParametrosReportesConversionInven, this.jScrollPanelDatosConversionInven,this.jPanelPaginacionConversionInven, this.jScrollPanelDatosEdicionConversionInven, this.jPanelAccionesConversionInven,this.jPanelAccionesFormularioConversionInven,this.jmenuBarConversionInven,this.jmenuBarDetalleConversionInven,this.jTtoolBarConversionInven,this.jTtoolBarDetalleConversionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasConversionInven=this.jTabbedPaneBusquedasConversionInven; 
		
		final JPanel jPanelParametrosReportesConversionInven=this.jPanelParametrosReportesConversionInven;
		//final JScrollPane jScrollPanelDatosConversionInven=this.jScrollPanelDatosConversionInven;
		final JTable jTableDatosConversionInven=this.jTableDatosConversionInven;		
		final JPanel jPanelPaginacionConversionInven=this.jPanelPaginacionConversionInven;
		//final JScrollPane jScrollPanelDatosEdicionConversionInven=this.jScrollPanelDatosEdicionConversionInven;
		final JPanel jPanelAccionesConversionInven=this.jPanelAccionesConversionInven;
		
		JPanel jPanelCamposAuxiliarConversionInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConversionInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			jPanelCamposAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jPanelCamposConversionInven;
			jPanelAccionesFormularioAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jPanelAccionesFormularioConversionInven;
		}
		
		final JPanel jPanelCamposConversionInven=jPanelCamposAuxiliarConversionInven;
		final JPanel jPanelAccionesFormularioConversionInven=jPanelAccionesFormularioAuxiliarConversionInven;
		
		
		final JMenuBar jmenuBarConversionInven=this.jmenuBarConversionInven;
		final JToolBar jTtoolBarConversionInven=this.jTtoolBarConversionInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConversionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConversionInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			jmenuBarDetalleAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jmenuBarDetalleConversionInven;
			jTtoolBarDetalleAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jTtoolBarDetalleConversionInven;
		}
		
		final JMenuBar jmenuBarDetalleConversionInven=jmenuBarDetalleAuxiliarConversionInven;
		final JToolBar jTtoolBarDetalleConversionInven=jTtoolBarDetalleAuxiliarConversionInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConversionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConversionInven;
			processRunnable.jTableDatos=jTableDatosConversionInven;
			processRunnable.jPanelCampos=jPanelCamposConversionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionConversionInven;
			processRunnable.jPanelAcciones=jPanelAccionesConversionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConversionInven;
			
			
			processRunnable.jmenuBar=jmenuBarConversionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConversionInven;
			processRunnable.jTtoolBar=jTtoolBarConversionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConversionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConversionInven ,jPanelParametrosReportesConversionInven,jTableDatosConversionInven, /*jScrollPanelDatosConversionInven,*/jPanelCamposConversionInven,jPanelPaginacionConversionInven, /*jScrollPanelDatosEdicionConversionInven,*/ jPanelAccionesConversionInven,jPanelAccionesFormularioConversionInven,jmenuBarConversionInven,jmenuBarDetalleConversionInven,jTtoolBarConversionInven,jTtoolBarDetalleConversionInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConversionInven ,jPanelParametrosReportesConversionInven, jScrollPanelDatosConversionInven,jPanelPaginacionConversionInven, jScrollPanelDatosEdicionConversionInven, jPanelAccionesConversionInven,jPanelAccionesFormularioConversionInven,jmenuBarConversionInven,jmenuBarDetalleConversionInven,jTtoolBarConversionInven,jTtoolBarDetalleConversionInven);
						
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
	
	public void finishProcessConversionInven() {// throws Exception 
		this.finishProcessConversionInven(true);
	}
	
	public void finishProcessConversionInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConversionInven ,this.jPanelParametrosReportesConversionInven, this.jScrollPanelDatosConversionInven,this.jPanelPaginacionConversionInven, this.jScrollPanelDatosEdicionConversionInven, this.jPanelAccionesConversionInven,this.jPanelAccionesFormularioConversionInven,this.jmenuBarConversionInven,this.jmenuBarDetalleConversionInven,this.jTtoolBarConversionInven,this.jTtoolBarDetalleConversionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasConversionInven=this.jTabbedPaneBusquedasConversionInven; 
		
		final JPanel jPanelParametrosReportesConversionInven=this.jPanelParametrosReportesConversionInven;
		//final JScrollPane jScrollPanelDatosConversionInven=this.jScrollPanelDatosConversionInven;
		final JTable jTableDatosConversionInven=this.jTableDatosConversionInven;		
		final JPanel jPanelPaginacionConversionInven=this.jPanelPaginacionConversionInven;
		//final JScrollPane jScrollPanelDatosEdicionConversionInven=this.jScrollPanelDatosEdicionConversionInven;
		final JPanel jPanelAccionesConversionInven=this.jPanelAccionesConversionInven;
		
		JPanel jPanelCamposAuxiliarConversionInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConversionInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			jPanelCamposAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jPanelCamposConversionInven;
			jPanelAccionesFormularioAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jPanelAccionesFormularioConversionInven;
		}
		
		final JPanel jPanelCamposConversionInven=jPanelCamposAuxiliarConversionInven;
		final JPanel jPanelAccionesFormularioConversionInven=jPanelAccionesFormularioAuxiliarConversionInven;
		
		
		final JMenuBar jmenuBarConversionInven=this.jmenuBarConversionInven;		
		final JToolBar jTtoolBarConversionInven=this.jTtoolBarConversionInven;
				
		JMenuBar jmenuBarDetalleAuxiliarConversionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConversionInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			jmenuBarDetalleAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jmenuBarDetalleConversionInven;
			jTtoolBarDetalleAuxiliarConversionInven=this.jInternalFrameDetalleFormConversionInven.jTtoolBarDetalleConversionInven;		
		}
		
		final JMenuBar jmenuBarDetalleConversionInven=jmenuBarDetalleAuxiliarConversionInven;
		final JToolBar jTtoolBarDetalleConversionInven=jTtoolBarDetalleAuxiliarConversionInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConversionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConversionInven;
			processRunnable.jTableDatos=jTableDatosConversionInven;
			processRunnable.jPanelCampos=jPanelCamposConversionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionConversionInven;
			processRunnable.jPanelAcciones=jPanelAccionesConversionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConversionInven;
			
			
			processRunnable.jmenuBar=jmenuBarConversionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConversionInven;
			processRunnable.jTtoolBar=jTtoolBarConversionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConversionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConversionInven ,jPanelParametrosReportesConversionInven, jTableDatosConversionInven,/*jScrollPanelDatosConversionInven,*/jPanelCamposConversionInven,jPanelPaginacionConversionInven, /*jScrollPanelDatosEdicionConversionInven,*/ jPanelAccionesConversionInven,jPanelAccionesFormularioConversionInven,jmenuBarConversionInven,jmenuBarDetalleConversionInven,jTtoolBarConversionInven,jTtoolBarDetalleConversionInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConversionInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConversionInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConversionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConversionInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConversionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConversionInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conversioninvenConstantesFunciones.getsFinalQueryConversionInven();
		String  finalQueryPaginacionTodos=this.conversioninvenConstantesFunciones.getsFinalQueryConversionInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConversionInvenConstantesFunciones.getArrayColumnasGlobalesNoConversionInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConversionInvenConstantesFunciones.getArrayColumnasGlobalesConversionInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConversionInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conversioninvensEliminados= new ArrayList<ConversionInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConversionInven();
		
				///*ConversionInvenSessionBean*/this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			
			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
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
					this.iNumeroPaginacion=ConversionInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConversionInvenConstantesFunciones.getClassesForeignKeysOfConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conversioninven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conversioninvensAux= new ArrayList<ConversionInven>();
			
				
			conversioninvenLogic.setDatosCliente(this.datosCliente);
			conversioninvenLogic.setDatosDeep(this.datosDeep);
			conversioninvenLogic.setIsConDeep(true);
			
			
			conversioninvenLogic.getConversionInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					conversioninvenLogic.getTodosConversionInvens(finalQueryGlobal,pagination);
					
					//conversioninvenLogic.getTodosConversionInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(conversioninvenLogic.getConversionInvens()==null|| conversioninvenLogic.getConversionInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversioninvensAux= new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvenLogic.getConversionInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvensAux= new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversioninvenLogic.getTodosConversionInvens(finalQueryGlobal+"",this.pagination);												
							
							//conversioninvenLogic.getTodosConversionInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConversionInvens("Todos",conversioninvenLogic.getConversionInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());					
							conversioninvenLogic.getConversionInvens().addAll(conversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvens=new ArrayList<ConversionInven>();
							conversioninvens.addAll(conversioninvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConversionInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConversionInven=this.idActual;
				
				} else if(this.idConversionInvenActual!=null && this.idConversionInvenActual!=0L) {
					idConversionInven=idConversionInvenActual;
				}
				
					
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndicePorId(idConversionInven);
				
				this.conversioninvens=new ArrayList<ConversionInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					conversioninvenLogic.getEntity(idConversionInven);
					
					//conversioninvenLogic.getEntityWithConnection(idConversionInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
					conversioninvenLogic.getConversionInvens().add(conversioninvenLogic.getConversionInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninvens=new ArrayList<ConversionInven>();
					this.conversioninvens.add(conversioninven);
				}
				
				if(conversioninvenLogic.getConversionInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversioninvenLogic.getConversionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversioninvenLogic.getConversionInvens()==null||conversioninvenLogic.getConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversioninvens==null|| conversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvensAux=new ArrayList<ConversionInven>();
						conversioninvensAux.addAll(conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvensAux=new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversioninvenLogic.getConversionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionInvens("FK_IdEmpresa",conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionInvens("FK_IdEmpresa",conversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
						conversioninvenLogic.getConversionInvens().addAll(conversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvens=new ArrayList<ConversionInven>();
							conversioninvens.addAll(conversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoConversionInven")) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoConversionInven(id_tipo_conversion_invenFK_IdTipoConversionInven);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversioninvenLogic.getConversionInvensFK_IdTipoConversionInven(finalQueryGlobal,pagination,id_tipo_conversion_invenFK_IdTipoConversionInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoConversionInven(id_tipo_conversion_invenFK_IdTipoConversionInven);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoConversionInven(id_tipo_conversion_invenFK_IdTipoConversionInven);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversioninvenLogic.getConversionInvens()==null||conversioninvenLogic.getConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversioninvens==null|| conversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvensAux=new ArrayList<ConversionInven>();
						conversioninvensAux.addAll(conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvensAux=new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversioninvenLogic.getConversionInvensFK_IdTipoConversionInven(finalQueryGlobal,pagination,id_tipo_conversion_invenFK_IdTipoConversionInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoConversionInven(id_tipo_conversion_invenFK_IdTipoConversionInven);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdTipoConversionInven(id_tipo_conversion_invenFK_IdTipoConversionInven);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionInvens("FK_IdTipoConversionInven",conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionInvens("FK_IdTipoConversionInven",conversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
						conversioninvenLogic.getConversionInvens().addAll(conversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvens=new ArrayList<ConversionInven>();
							conversioninvens.addAll(conversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidad")) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversioninvenLogic.getConversionInvensFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversioninvenLogic.getConversionInvens()==null||conversioninvenLogic.getConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversioninvens==null|| conversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvensAux=new ArrayList<ConversionInven>();
						conversioninvensAux.addAll(conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvensAux=new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversioninvenLogic.getConversionInvensFK_IdUnidad(finalQueryGlobal,pagination,id_unidadFK_IdUnidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidad(id_unidadFK_IdUnidad);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionInvens("FK_IdUnidad",conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionInvens("FK_IdUnidad",conversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
						conversioninvenLogic.getConversionInvens().addAll(conversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvens=new ArrayList<ConversionInven>();
							conversioninvens.addAll(conversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdUnidadConversion")) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidadConversion(id_unidad_conversionFK_IdUnidadConversion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conversioninvenLogic.getConversionInvensFK_IdUnidadConversion(finalQueryGlobal,pagination,id_unidad_conversionFK_IdUnidadConversion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidadConversion(id_unidad_conversionFK_IdUnidadConversion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidadConversion(id_unidad_conversionFK_IdUnidadConversion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conversioninvenLogic.getConversionInvens()==null||conversioninvenLogic.getConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conversioninvens==null|| conversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvensAux=new ArrayList<ConversionInven>();
						conversioninvensAux.addAll(conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvensAux=new ArrayList<ConversionInven>();
							conversioninvensAux.addAll(conversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conversioninvenLogic.getConversionInvensFK_IdUnidadConversion(finalQueryGlobal,pagination,id_unidad_conversionFK_IdUnidadConversion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidadConversion(id_unidad_conversionFK_IdUnidadConversion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConversionInvenConstantesFunciones.getDetalleIndiceFK_IdUnidadConversion(id_unidad_conversionFK_IdUnidadConversion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConversionInvens("FK_IdUnidadConversion",conversioninvenLogic.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConversionInvens("FK_IdUnidadConversion",conversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
						conversioninvenLogic.getConversionInvens().addAll(conversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvens=new ArrayList<ConversionInven>();
							conversioninvens.addAll(conversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConversionInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConversionInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conversioninvenLogic.getConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversioninvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conversioninvenLogic.getConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conversioninvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ConversionInven conversioninven) {
		Boolean permite=true;
		
		if(this.conversioninven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConversionInvenConstantesFunciones.getOrderByListaConversionInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConversionInvenConstantesFunciones.getOrderByListaConversionInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionInven conversioninven:conversioninvenLogic.getConversionInvens()) {
				if(conversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					conversioninvenTotales=conversioninven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionInven conversioninven:this.conversioninvens) {
				if(conversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					conversioninvenTotales=conversioninven;
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
			this.conversioninvenAux=new ConversionInven();
			this.conversioninvenAux.setsType(Constantes2.S_TOTALES);
			this.conversioninvenAux.setIsNew(false);
			this.conversioninvenAux.setIsChanged(false);
			this.conversioninvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ConversionInvenConstantesFunciones.TotalizarValoresFilaConversionInven(this.conversioninvenLogic.getConversionInvens(),this.conversioninvenAux);
				
				this.conversioninvenLogic.getConversionInvens().add(this.conversioninvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ConversionInvenConstantesFunciones.TotalizarValoresFilaConversionInven(this.conversioninvens,this.conversioninvenAux);
				
				this.conversioninvens.add(this.conversioninvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conversioninvenTotales=new ConversionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conversioninvenLogic.getConversionInvens().remove(conversioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conversioninvens.remove(conversioninvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conversioninvenTotales=new ConversionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ConversionInven conversioninven:conversioninvenLogic.getConversionInvens()) {
				if(conversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					conversioninvenTotales=conversioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConversionInvenConstantesFunciones.TotalizarValoresFilaConversionInven(this.conversioninvenLogic.getConversionInvens(),conversioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ConversionInven conversioninven:this.conversioninvens) {
				if(conversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					conversioninvenTotales=conversioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConversionInvenConstantesFunciones.TotalizarValoresFilaConversionInven(this.conversioninvens,conversioninvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConversionInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConversionInvensFK_IdTipoConversionInven()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoConversionInven";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConversionInvensFK_IdUnidad()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidad";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConversionInvensFK_IdUnidadConversion()throws Exception {
		try {
			sAccionBusqueda="FK_IdUnidadConversion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConversionInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLogic.getConversionInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConversionInvensFK_IdTipoConversionInven(String sFinalQuery,Long id_tipo_conversion_inven)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLogic.getConversionInvensFK_IdTipoConversionInven(sFinalQuery,this.pagination,id_tipo_conversion_inven);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConversionInvensFK_IdUnidad(String sFinalQuery,Long id_unidad)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLogic.getConversionInvensFK_IdUnidad(sFinalQuery,this.pagination,id_unidad);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConversionInvensFK_IdUnidadConversion(String sFinalQuery,Long id_unidad_conversion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLogic.getConversionInvensFK_IdUnidadConversion(sFinalQuery,this.pagination,id_unidad_conversion);
				
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
	
	public void inicializarPermisosConversionInven() {
		this.isPermisoTodoConversionInven=false;
		this.isPermisoNuevoConversionInven=false;
		this.isPermisoActualizarConversionInven=false;
		this.isPermisoActualizarOriginalConversionInven=false;
		this.isPermisoEliminarConversionInven=false;
		this.isPermisoGuardarCambiosConversionInven=false;
		this.isPermisoConsultaConversionInven=false;
		this.isPermisoBusquedaConversionInven=false;
		this.isPermisoReporteConversionInven=false;		
		this.isPermisoOrdenConversionInven=false;		
		this.isPermisoPaginacionMedioConversionInven=false;		
		this.isPermisoPaginacionAltoConversionInven=false;
		this.isPermisoPaginacionTodoConversionInven=false;
		this.isPermisoCopiarConversionInven=false;		
		this.isPermisoVerFormConversionInven=false;		
		this.isPermisoDuplicarConversionInven=false;		
		this.isPermisoOrdenConversionInven=false;		
	}
	
	public void setPermisosUsuarioConversionInven(Boolean isPermiso) {
		this.isPermisoTodoConversionInven=isPermiso;
		this.isPermisoNuevoConversionInven=isPermiso;
		this.isPermisoActualizarConversionInven=isPermiso;
		this.isPermisoActualizarOriginalConversionInven=isPermiso;
		this.isPermisoEliminarConversionInven=isPermiso;
		this.isPermisoGuardarCambiosConversionInven=isPermiso;
		this.isPermisoConsultaConversionInven=isPermiso;
		this.isPermisoBusquedaConversionInven=isPermiso;
		this.isPermisoReporteConversionInven=isPermiso;
		this.isPermisoOrdenConversionInven=isPermiso;		
		this.isPermisoPaginacionMedioConversionInven=isPermiso;		
		this.isPermisoPaginacionAltoConversionInven=isPermiso;		
		this.isPermisoPaginacionTodoConversionInven=isPermiso;		
		this.isPermisoCopiarConversionInven=isPermiso;		
		this.isPermisoVerFormConversionInven=isPermiso;		
		this.isPermisoDuplicarConversionInven=isPermiso;
		this.isPermisoOrdenConversionInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConversionInven(Boolean isPermiso) {
		//this.isPermisoTodoConversionInven=isPermiso;
		this.isPermisoNuevoConversionInven=isPermiso;
		this.isPermisoActualizarConversionInven=isPermiso;
		this.isPermisoActualizarOriginalConversionInven=isPermiso;
		this.isPermisoEliminarConversionInven=isPermiso;
		this.isPermisoGuardarCambiosConversionInven=isPermiso;
		//this.isPermisoConsultaConversionInven=isPermiso;
		//this.isPermisoBusquedaConversionInven=isPermiso;
		//this.isPermisoReporteConversionInven=isPermiso;
		//this.isPermisoOrdenConversionInven=isPermiso;		
		//this.isPermisoPaginacionMedioConversionInven=isPermiso;		
		//this.isPermisoPaginacionAltoConversionInven=isPermiso;		
		//this.isPermisoPaginacionTodoConversionInven=isPermiso;		
		//this.isPermisoCopiarConversionInven=isPermiso;		
		//this.isPermisoDuplicarConversionInven=isPermiso;
		//this.isPermisoOrdenConversionInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConversionInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConversionInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConversionInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConversionInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConversionInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConversionInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConversionInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConversionInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConversionInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConversionInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConversionInven=this.isPermisoActualizarConversionInven;
			this.isPermisoEliminarConversionInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConversionInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConversionInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConversionInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConversionInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConversionInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConversionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConversionInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConversionInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConversionInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConversionInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConversionInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConversionInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConversionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConversionInven.setToolTipText(this.jTableDatosConversionInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConversionInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConversionInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConversionInven() throws Exception {
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
	public void inicializarCombosForeignKeyConversionInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipoconversioninvensForeignKey=new ArrayList();
				this.unidadsForeignKey=new ArrayList();
				this.unidadconversionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConversionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConversionInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConversionInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoConversionInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyUnidadConversionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoConversionInvenListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoconversioninvensForeignKey==null||this.tipoconversioninvensForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoConversionInvenConstantesFunciones.getArrayColumnasGlobalesTipoConversionInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConversionInvenConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoConversionInvenConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoConversionInvensForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadConversionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.unidadconversionsForeignKey==null||this.unidadconversionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=UnidadConstantesFunciones.SFINALQUERY;

				this.cargarCombosUnidadConversionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyConversionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConversionInvenParameterReturnGeneral conversioninvenReturnGeneral=new ConversionInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.conversioninvenConstantesFunciones.cargarid_empresaConversionInven)
					 || (this.esRecargarFks && this.conversioninvenConstantesFunciones.cargarid_empresaConversionInven)) {

					if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+conversioninvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoConversionInven="";

				if(((this.tipoconversioninvensForeignKey==null||this.tipoconversioninvensForeignKey.size()<=0) && this.conversioninvenConstantesFunciones.cargarid_tipo_conversion_invenConversionInven)
					 || (this.esRecargarFks && this.conversioninvenConstantesFunciones.cargarid_tipo_conversion_invenConversionInven)) {

					if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoConversionInven()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoConversionInvenConstantesFunciones.getArrayColumnasGlobalesTipoConversionInven(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoConversionInven=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoConversionInvenConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoConversionInven=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoConversionInven, "");
						finalQueryGlobalTipoConversionInven+=TipoConversionInvenConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoConversionInvensForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoConversionInven=" WHERE " + ConstantesSql.ID + "="+conversioninvenSessionBean.getlidTipoConversionInvenActual();
					}
				} else {
					finalQueryGlobalTipoConversionInven="NONE";
				}


				String finalQueryGlobalUnidad="";

				if(((this.unidadsForeignKey==null||this.unidadsForeignKey.size()<=0) && this.conversioninvenConstantesFunciones.cargarid_unidadConversionInven)
					 || (this.esRecargarFks && this.conversioninvenConstantesFunciones.cargarid_unidadConversionInven)) {

					if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidad=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidad=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidad, "");
						finalQueryGlobalUnidad+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidad=" WHERE " + ConstantesSql.ID + "="+conversioninvenSessionBean.getlidUnidadActual();
					}
				} else {
					finalQueryGlobalUnidad="NONE";
				}


				String finalQueryGlobalUnidadConversion="";

				if(((this.unidadconversionsForeignKey==null||this.unidadconversionsForeignKey.size()<=0) && this.conversioninvenConstantesFunciones.cargarid_unidad_conversionConversionInven)
					 || (this.esRecargarFks && this.conversioninvenConstantesFunciones.cargarid_unidad_conversionConversionInven)) {

					if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidadConversion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=UnidadConstantesFunciones.getArrayColumnasGlobalesUnidad(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalUnidadConversion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,UnidadConstantesFunciones.TABLENAME);

						finalQueryGlobalUnidadConversion=Funciones.GetFinalQueryAppend(finalQueryGlobalUnidadConversion, "");
						finalQueryGlobalUnidadConversion+=UnidadConstantesFunciones.SFINALQUERY;

						//this.cargarCombosUnidadConversionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalUnidadConversion=" WHERE " + ConstantesSql.ID + "="+conversioninvenSessionBean.getlidUnidadConversionActual();
					}
				} else {
					finalQueryGlobalUnidadConversion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				conversioninvenReturnGeneral=conversioninvenLogic.cargarCombosLoteForeignKeyConversionInven(finalQueryGlobalEmpresa,finalQueryGlobalTipoConversionInven,finalQueryGlobalUnidad,finalQueryGlobalUnidadConversion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=conversioninvenReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoConversionInven.equals("NONE")) {
				this.tipoconversioninvensForeignKey=conversioninvenReturnGeneral.gettipoconversioninvensForeignKey();
			}

			if(!finalQueryGlobalUnidad.equals("NONE")) {
				this.unidadsForeignKey=conversioninvenReturnGeneral.getunidadsForeignKey();
			}

			if(!finalQueryGlobalUnidadConversion.equals("NONE")) {
				this.unidadconversionsForeignKey=conversioninvenReturnGeneral.getunidadconversionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConversionInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoConversionInven();
			this.addItemDefectoCombosForeignKeyUnidad();
			this.addItemDefectoCombosForeignKeyUnidadConversion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.conversioninvenSessionBean==null) {
				this.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoConversionInven()throws Exception {
		try {

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionTipoConversionInven()) {
				TipoConversionInven tipoconversioninven=new TipoConversionInven();
				TipoConversionInvenConstantesFunciones.setTipoConversionInvenDescripcion(tipoconversioninven,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoconversioninven.setId(null);

				if(!TipoConversionInvenConstantesFunciones.ExisteEnLista(this.tipoconversioninvensForeignKey,tipoconversioninven,true)) {

					this.tipoconversioninvensForeignKey.add(0,tipoconversioninven);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidad()throws Exception {
		try {

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidad()) {
				Unidad unidad=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidad,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidad.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadsForeignKey,unidad,true)) {

					this.unidadsForeignKey.add(0,unidad);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyUnidadConversion()throws Exception {
		try {

			if(!this.conversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionUnidadConversion()) {
				Unidad unidadconversion=new Unidad();
				UnidadConstantesFunciones.setUnidadDescripcion(unidadconversion,Constantes.SMENSAJE_ESCOJA_OPCION);
				unidadconversion.setId(null);

				if(!UnidadConstantesFunciones.ExisteEnLista(this.unidadconversionsForeignKey,unidadconversion,true)) {

					this.unidadconversionsForeignKey.add(0,unidadconversion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConversionInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConversionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConversionInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConversionInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConversionInven(ConversionInven conversioninven)throws Exception {	
		try {
			
			this.setActualTipoConversionInvenForeignKey(conversioninven.getid_tipo_conversion_inven(),false,"Formulario");
			this.setActualUnidadForeignKey(conversioninven.getid_unidad(),false,"Formulario");
			this.setActualUnidadConversionForeignKey(conversioninven.getid_unidad_conversion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConversionInven(ConversionInven conversioninven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConversionInven()throws Exception {	
		try {
			
			this.setActualTipoConversionInvenForeignKey(this.conversioninvenConstantesFunciones.getid_tipo_conversion_inven(),false,"Formulario");
			this.setActualUnidadForeignKey(this.conversioninvenConstantesFunciones.getid_unidad(),false,"Formulario");
			this.setActualUnidadConversionForeignKey(this.conversioninvenConstantesFunciones.getid_unidad_conversion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConversionInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConversionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConversionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConversionInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConversionInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoConversionInvensForeignKey("Todos");
			this.cargarCombosFrameUnidadsForeignKey("Todos");
			this.cargarCombosFrameUnidadConversionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConversionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoConversionInvensForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameUnidadConversionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConversionInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven!=null && this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven!=null && this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven!=null && this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven!=null && this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ConversionInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConversionInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConversionInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conversioninvenSessionBean=new ConversionInvenSessionBean(); 
		this.conversioninvenConstantesFunciones=new ConversionInvenConstantesFunciones(); 
		this.conversioninvenBean=new ConversionInven();//(this.conversioninvenConstantesFunciones); 		
		this.conversioninvenReturnGeneral=new ConversionInvenParameterReturnGeneral(); 
		
		this.conversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConversionInven(true);
			
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
			
			this.conversioninvenConstantesFunciones=new ConversionInvenConstantesFunciones(); 
			this.conversioninvenBean=new ConversionInven();//this.conversioninvenConstantesFunciones); 			
			this.conversioninvenReturnGeneral=new ConversionInvenParameterReturnGeneral(); 
		
			ConversionInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conversion Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.conversioninven=new ConversionInven();
			this.conversioninvens = new ArrayList<ConversionInven>();
			this.conversioninvensAux = new ArrayList<ConversionInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic=new ConversionInvenLogic();
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.conversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConversionInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConversionInven);	
					}
					
					if(this.jInternalFrameImportacionConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConversionInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConversionInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConversionInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConversionInven);
				this.jInternalFrameDetalleFormConversionInven.setVisible(false);
				this.jInternalFrameDetalleFormConversionInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConversionInven);
					this.jInternalFrameReporteDinamicoConversionInven.setVisible(false);
					this.jInternalFrameReporteDinamicoConversionInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConversionInven);
					this.jInternalFrameImportacionConversionInven.setVisible(false);
					this.jInternalFrameImportacionConversionInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConversionInven);
					this.jInternalFrameOrderByConversionInven.setVisible(false);
					this.jInternalFrameOrderByConversionInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConversionInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConversionInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conversioninvenReturnGeneral=new ConversionInvenParameterReturnGeneral();
			
			this.conversioninvenParameterGeneral=new ConversionInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conversioninvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConversionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conversioninvenSessionBean.getEsGuardarRelacionado(),this.conversioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConversionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conversioninvenSessionBean.getEsGuardarRelacionado(),this.conversioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaDuplicarConversionInven=true;
			this.isVisibilidadCeldaCopiarConversionInven=true;
			this.isVisibilidadCeldaVerFormConversionInven=true;
			this.isVisibilidadCeldaOrdenConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=false;
			this.isVisibilidadCeldaGuardarConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoConversionInven=true;
			this.isVisibilidadFK_IdUnidad=true;
			this.isVisibilidadFK_IdUnidadConversion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConversionInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConversionInven(false);
			
			this.setPermisosUsuarioConversionInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado() 
				|| (this.conversioninvenSessionBean.getEsGuardarRelacionado() && this.conversioninvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConversionInvenClasesRelacionadas();
			}
			
			if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConversionInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConversionInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConversionInven();
			}
			
			if(!this.isPermisoBusquedaConversionInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConversionInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConversionInven,this.isPermisoPaginacionMedioConversionInven,this.isPermisoPaginacionTodoConversionInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConversionInvenConstantesFunciones.getTiposSeleccionarConversionInven());
				
				this.tiposColumnasSelect=ConversionInvenConstantesFunciones.getTiposSeleccionarConversionInven(true);
				
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
			//if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConversionInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioConversionInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioConversionInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionInven() ;
			
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
			this.tipoconversioninvenLogic=new TipoConversionInvenLogic();
			this.unidadLogic=new UnidadLogic();
			this.unidadconversionLogic=new UnidadLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				conversioninvenImplementable= (ConversionInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConversionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conversioninvenImplementableHome= (ConversionInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConversionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conversioninvens= new ArrayList<ConversionInven>();
			this.conversioninvensEliminados= new ArrayList<ConversionInven>();
						
			this.isEsNuevoConversionInven=false;
			this.esParaAccionDesdeFormularioConversionInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipoconversioninvensForeignKey=new ArrayList<TipoConversionInven>() ;
			this.unidadsForeignKey=new ArrayList<Unidad>() ;
			this.unidadconversionsForeignKey=new ArrayList<Unidad>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConversionInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConversionInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConversionInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConversionInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConversionInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConversionInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConversionInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConversionInven();
			}
			
			ConversionInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConversionInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConversionInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConversionInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConversionInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ConversionInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConversionInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConversionInven")) {
				iIndex=this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConversionInven();	
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
	
	public void cargarCombosForeignKeyConversionInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConversionInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConversionInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConversionInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConversionInven();
		
		this.cargarCombosFrameForeignKeyConversionInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConversionInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConversionInven();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoConversionInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoConversionInvenListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoConversionInven();
				this.cargarCombosFrameTipoConversionInvensForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoConversionInven(this.tipoconversioninvensForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidad();
				this.cargarCombosFrameUnidadsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidad(this.unidadsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyUnidadConversion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyUnidadConversionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyUnidadConversion();
				this.cargarCombosFrameUnidadConversionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaUnidadConversion(this.unidadconversionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConversionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			
			if(jTableDatosConversionInven.getRowCount()>=1) {
				jTableDatosConversionInven.removeRowSelectionInterval(0, jTableDatosConversionInven.getRowCount()-1);						
			}
			
			this.isEsNuevoConversionInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConversionInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConversionInven(true);			
			//this.conversioninven=new ConversionInven();
			//this.conversioninven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionInven() ;
			
			if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conversioninven);	
			this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);				
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ConversionInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConversionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConversionInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConversionInven.getSelectedRows().length;			
			}
			
			conversioninvensSeleccionados=this.getConversionInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConversionInven--;			
				//ConversionInven conversioninvenAux= new ConversionInven();			
				//conversioninvenAux.setId(this.iIdNuevoConversionInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ConversionInven conversioninvenOrigen=new ConversionInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ConversionInven conversioninvenOrigen : conversioninvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conversioninvenOrigen =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conversioninvenOrigen =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConversionInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conversioninven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConversionInven(conversioninvenOrigen,this.conversioninven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conversioninvenLogic.getConversionInvens().add(this.conversioninvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conversioninvens.add(this.conversioninvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConversionInven(false);
				
				this.jTableDatosConversionInven.setRowSelectionInterval(this.getIndiceNuevoConversionInven(), this.getIndiceNuevoConversionInven());
				
				int iLastRow =  this.jTableDatosConversionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConversionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConversionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();									
		
			ConversionInven conversioninvenOrigen=new ConversionInven();
			ConversionInven conversioninvenDestino=new ConversionInven();
				
			conversioninvensSeleccionados=this.getConversionInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConversionInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conversioninvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConversionInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenOrigen =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conversioninvenOrigen =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conversioninvenDestino =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conversioninvenDestino =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conversioninvenOrigen =conversioninvensSeleccionados.get(0);
				conversioninvenDestino =conversioninvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConversionInven(conversioninvenOrigen,conversioninvenDestino,true,false);
				
				conversioninvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conversioninvenDestino,conversioninvenLogic.getConversionInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conversioninvenDestino,conversioninvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConversionInven(false);
				
				//this.jTableDatosConversionInven.setRowSelectionInterval(this.getIndiceNuevoConversionInven(), this.getIndiceNuevoConversionInven());
				
				int iLastRow =  this.jTableDatosConversionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConversionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConversionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConversionInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConversionInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConversionInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConversionInven.setVisible(!isVisible);
			this.jPanelPaginacionConversionInven.setVisible(!isVisible);
			this.jPanelAccionesConversionInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConversionInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConversionInven();
			
			this.abrirFrameOrderByConversionInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConversionInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConversionInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConversionInven.isMaximum()) {
					this.jInternalFrameDetalleFormConversionInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConversionInven.setSize(this.jInternalFrameDetalleFormConversionInven.iWidthFormulario,this.jInternalFrameDetalleFormConversionInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConversionInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConversionInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConversionInven.isMaximum()) {
						this.jInternalFrameDetalleFormConversionInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConversionInven.jContentPaneDetalleConversionInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConversionInven.jContentPaneDetalleConversionInven.getWidth(),ConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConversionInven.jContentPaneDetalleConversionInven.getWidth(),ConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConversionInven.jContentPaneDetalleConversionInven.getWidth(),ConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConversionInven.setVisible(true);
	        this.jInternalFrameDetalleFormConversionInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConversionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConversionInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionInven,false,this);
				} else {
					this.jInternalFrameOrderByConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConversionInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConversionInven);
				this.jInternalFrameOrderByConversionInven.setVisible(false);
				this.jInternalFrameOrderByConversionInven.setSelected(false);
				
				this.jInternalFrameOrderByConversionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConversionInven"));
				
				this.inicializarActualizarBindingTablaOrderByConversionInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConversionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConversionInven==null) {
				
				this.jInternalFrameImportacionConversionInven=new ImportacionJInternalFrame(ConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConversionInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConversionInven);
				this.jInternalFrameImportacionConversionInven.setVisible(false);
				this.jInternalFrameImportacionConversionInven.setSelected(false);


				this.jInternalFrameImportacionConversionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConversionInven"));
				this.jInternalFrameImportacionConversionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConversionInven"));
				this.jInternalFrameImportacionConversionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConversionInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConversionInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConversionInven==null) {
				this.jInternalFrameReporteDinamicoConversionInven=new ReporteDinamicoJInternalFrame(ConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConversionInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConversionInven);
				this.jInternalFrameReporteDinamicoConversionInven.setVisible(false);
				this.jInternalFrameReporteDinamicoConversionInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionInven"));
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionInven"));
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConversionInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConversionInven);
			
	       	this.jInternalFrameDetalleFormConversionInven.setVisible(false);
	        this.jInternalFrameDetalleFormConversionInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormConversionInven.dispose();
			//this.jInternalFrameDetalleFormConversionInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConversionInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConversionInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConversionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConversionInven.setVisible(true);
	        this.jInternalFrameImportacionConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConversionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConversionInven.setVisible(true);
	        this.jInternalFrameOrderByConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConversionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConversionInven.setVisible(false);
	        this.jInternalFrameOrderByConversionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConversionInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConversionInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoConversionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConversionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConversionInven.setVisible(false);
	        this.jInternalFrameImportacionConversionInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConversionInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConversionInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConversionInven(true);
			//this.isEsNuevoConversionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionInven(false) ;
			
			if(conversioninvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConversionInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConversionInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConversionInven(true);
			//this.isEsNuevoConversionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conversioninven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConversionInven(false) ;
			
			if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConversionInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoConversionInven(List<TipoConversionInven> tipoconversioninvensForeignKey)throws Exception{
		TableColumn tableColumnTipoConversionInven=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN));
		TableCellEditor tableCellEditorTipoConversionInven =tableColumnTipoConversionInven.getCellEditor();

		TipoConversionInvenTableCell tipoconversioninvenTableCellFk=(TipoConversionInvenTableCell)tableCellEditorTipoConversionInven;

		if(tipoconversioninvenTableCellFk!=null) {
			tipoconversioninvenTableCellFk.settipoconversioninvensForeignKey(tipoconversioninvensForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConversionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoconversioninvenTableCellFk.setRowActual(intSelectedRow);
			//tipoconversioninvenTableCellFk.settipoconversioninvensForeignKeyActual(tipoconversioninvensForeignKey);
		//}


		if(tipoconversioninvenTableCellFk!=null) {
			tipoconversioninvenTableCellFk.RecargarTipoConversionInvensForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidad(List<Unidad> unidadsForeignKey)throws Exception{
		TableColumn tableColumnUnidad=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDUNIDAD));
		TableCellEditor tableCellEditorUnidad =tableColumnUnidad.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidad;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConversionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaUnidadConversion(List<Unidad> unidadconversionsForeignKey)throws Exception{
		TableColumn tableColumnUnidadConversion=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION));
		TableCellEditor tableCellEditorUnidadConversion =tableColumnUnidadConversion.getCellEditor();

		UnidadTableCell unidadTableCellFk=(UnidadTableCell)tableCellEditorUnidadConversion;

		if(unidadTableCellFk!=null) {
			unidadTableCellFk.setunidadsForeignKey(unidadconversionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConversionInven.getSelectedRow();

		//if(intSelectedRow<=0) {
			//unidadTableCellFk.setRowActual(intSelectedRow);
			//unidadTableCellFk.setunidadsForeignKeyActual(unidadconversionsForeignKey);
		//}


		if(unidadTableCellFk!=null) {
			unidadTableCellFk.RecargarUnidadsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConversionInven(false);
			
			//if(!this.isEsNuevoConversionInven) {								
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				
			}
			
			if(this.permiteMantenimiento(this.conversioninven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConversionInven=true;
					this.inicializarActualizarBindingTablaConversionInven(false);
					this.isEsNuevoConversionInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConversionInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConversionInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConversionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionInven(false);
				
				this.habilitarDeshabilitarControlesConversionInven(false);
			
												
				
				if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConversionInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConversionInvenActionPerformed(evt,conversioninvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConversionInven(this.conversioninven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConversionInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conversioninvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conversioninven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				this.conversioninven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				this.conversioninven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conversioninven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConversionInvenModel) this.jTableDatosConversionInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConversionInven=true;
				this.inicializarActualizarBindingTablaConversionInven(false);
				this.isEsNuevoConversionInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConversionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionInven(false);
				
				this.habilitarDeshabilitarControlesConversionInven(false);
				
				
				
				if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConversionInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConversionInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConversionInven.getRowCount()>=1) {
				jTableDatosConversionInven.removeRowSelectionInterval(0, jTableDatosConversionInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConversionInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConversionInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConversionInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConversionInven(false) ;
			
			this.isEsNuevoConversionInven=false;
			
			if(ConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConversionInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConversionInven(false);
				
				//SI ES MANUAL
				if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConversionInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConversionInven--;			
			//ConversionInven conversioninvenAux= new ConversionInven();			
			//conversioninvenAux.setId(this.iIdNuevoConversionInven);
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConversionInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
			
			this.conversioninven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conversioninvenLogic.getConversionInvens().add(this.conversioninvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conversioninvens.add(this.conversioninvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConversionInven(false);
			
			this.jTableDatosConversionInven.setRowSelectionInterval(this.getIndiceNuevoConversionInven(), this.getIndiceNuevoConversionInven());
			
			int iLastRow =  this.jTableDatosConversionInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConversionInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConversionInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConversionInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConversionInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionInven(false);
			
			//SI ES MANUAL
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionInven();
			}
			
			//this.abrirFrameTreeConversionInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConversionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Conversion InvenES ?", "MANTENIMIENTO DE Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConversionInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConversionInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.conversioninvenReturnGeneral=conversioninvenLogic.procesarImportacionConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.conversioninvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConversionInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConversionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConversionInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConversionInven.setFileImportacion(this.jInternalFrameImportacionConversionInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConversionInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConversionInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConversionInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConversionInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		

		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConversionInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConversionInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoConversionInven_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoConversionInven_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoConversionInven_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoConversionInven_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDAD:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Unidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Unidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Unidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Unidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UnidadConversion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UnidadConversion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UnidadConversion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UnidadConversion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionInvenConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConversionInvenConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoConversionInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN:
					sNombreCampoCategoria="id_tipo_conversion_inven";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoria="id_unidad";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION:
					sNombreCampoCategoria="id_unidad_conversion";
					break;

				case ConversionInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ConversionInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN:
					sNombreCampoCategoriaValor="id_tipo_conversion_inven";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDAD:
					sNombreCampoCategoriaValor="id_unidad";
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION:
					sNombreCampoCategoriaValor="id_unidad_conversion";
					break;

				case ConversionInvenConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ConversionInvenConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Conversion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_conversion_inven");
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad");
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Unidad Conversion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_unidad_conversion");
					break;

				case ConversionInvenConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ConversionInvenConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoConversionInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ConversionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.gettipoconversioninven_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.getunidad_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.getunidadconversion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionInvenConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConversionInvenConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ConversionInven conversioninven:conversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conversioninven.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelConversionInven(row);				
			//	iRow++;
			//}				
			
			//for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConversionInven(conversioninvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionInven(false);
			
			//SI ES MANUAL
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConversionInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionInven(false);
			
			//SI ES MANUAL
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConversionInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConversionInven(false);
			
			//SI ES MANUAL
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConversionInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConversionInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConversionInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConversionInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConversionInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConversionInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConversionInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosConversionInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosConversionInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConversionInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConversionInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConversionInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConversionInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConversionInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConversionInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConversionInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConversionInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConversionInven();
		
		this.inicializarActualizarBindingBotonesManualConversionInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConversionInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConversionInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConversionInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConversionInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConversionInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConversionInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConversionInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConversionInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionNuevoConversionInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionSinCerrarConversionInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionSinMensajeConversionInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConversionInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConversionInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConversionInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConversionInven!=null) {
				this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionNuevoConversionInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionSinCerrarConversionInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConversionInven.jCheckBoxPostAccionSinMensajeConversionInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConversionInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConversionInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConversionInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConversionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConversionInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConversionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConversionInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConversionInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConversionInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConversionInven(Boolean esInicializar) throws Exception {
		try	{	
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConversionInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConversionInven() throws Exception {
		try	{
			if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConversionInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConversionInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConversionInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConversionInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConversionInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConversionInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConversionInven.addItem(reporte);
			}
			
			
			if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConversionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConversionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConversionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConversionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConversionInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConversionInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConversionInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConversionInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ConversionInvenConstantesFunciones.getTiposSeleccionarConversionInven(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ConversionInvenConstantesFunciones.getTiposSeleccionarConversionInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ConversionInvenConstantesFunciones.getTiposSeleccionarConversionInven(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConversionInven.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoConversionInven.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConversionInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.getSelectedItem()!=null){this.id_tipo_conversion_invenFK_IdTipoConversionInven=((TipoConversionInven)this.jComboBoxid_tipo_conversion_invenFK_IdTipoConversionInvenConversionInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidadFK_IdUnidadConversionInven.getSelectedItem()!=null){this.id_unidadFK_IdUnidad=((Unidad)this.jComboBoxid_unidadFK_IdUnidadConversionInven.getSelectedItem()).getId();}
		if(this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.getSelectedItem()!=null){this.id_unidad_conversionFK_IdUnidadConversion=((Unidad)this.jComboBoxid_unidad_conversionFK_IdUnidadConversionConversionInven.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConversionInven(Boolean esInicializar) throws Exception {				
		if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConversionInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConversionInven() throws Exception {
		this.inicializarActualizarBindingTablaConversionInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConversionInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConversionInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConversionInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conversioninvenLogic.getConversionInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conversioninvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConversionInven.setModel(new ConversionInvenModel(this.conversioninvenLogic.getConversionInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConversionInven.setModel(new ConversionInvenModel(this.conversioninvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConversionInven!=null && this.jInternalFrameOrderByConversionInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConversionInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO,conversioninvenConstantesFunciones.resaltarSeleccionarConversionInven,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConversionInvenConstantesFunciones.SCLASSWEBTITULO,conversioninvenConstantesFunciones.resaltarSeleccionarConversionInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_ID));

		if(this.conversioninvenConstantesFunciones.mostraridConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conversioninvenConstantesFunciones.resaltaridConversionInven,this.conversioninvenConstantesFunciones.activaridConversionInven,iSizeTabla,this,true,"idConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversioninvenConstantesFunciones.resaltaridConversionInven,this.conversioninvenConstantesFunciones.activaridConversionInven,this,true,"idConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.conversioninvenConstantesFunciones.mostrarid_empresaConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.conversioninvenConstantesFunciones.resaltarid_empresaConversionInven,this,this.conversioninvenConstantesFunciones.activarid_empresaConversionInven,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.conversioninvenConstantesFunciones.resaltarid_empresaConversionInven,this,this.conversioninvenConstantesFunciones.activarid_empresaConversionInven,false,"id_empresaConversionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN));

		if(this.conversioninvenConstantesFunciones.mostrarid_tipo_conversion_invenConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoConversionInvenTableCell(this.tipoconversioninvensForeignKey,this.conversioninvenConstantesFunciones.resaltarid_tipo_conversion_invenConversionInven,this,this.conversioninvenConstantesFunciones.activarid_tipo_conversion_invenConversionInven,iSizeTabla));
			tableColumn.setCellEditor(new TipoConversionInvenTableCell(this.tipoconversioninvensForeignKey,this.conversioninvenConstantesFunciones.resaltarid_tipo_conversion_invenConversionInven,this,this.conversioninvenConstantesFunciones.activarid_tipo_conversion_invenConversionInven,true,"id_tipo_conversion_invenConversionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDUNIDAD));

		if(this.conversioninvenConstantesFunciones.mostrarid_unidadConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_IDUNIDAD,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadsForeignKey,this.conversioninvenConstantesFunciones.resaltarid_unidadConversionInven,this,this.conversioninvenConstantesFunciones.activarid_unidadConversionInven,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadsForeignKey,this.conversioninvenConstantesFunciones.resaltarid_unidadConversionInven,this,this.conversioninvenConstantesFunciones.activarid_unidadConversionInven,true,"id_unidadConversionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION));

		if(this.conversioninvenConstantesFunciones.mostrarid_unidad_conversionConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new UnidadTableCell(this.unidadconversionsForeignKey,this.conversioninvenConstantesFunciones.resaltarid_unidad_conversionConversionInven,this,this.conversioninvenConstantesFunciones.activarid_unidad_conversionConversionInven,iSizeTabla));
			tableColumn.setCellEditor(new UnidadTableCell(this.unidadconversionsForeignKey,this.conversioninvenConstantesFunciones.resaltarid_unidad_conversionConversionInven,this,this.conversioninvenConstantesFunciones.activarid_unidad_conversionConversionInven,true,"id_unidad_conversionConversionInven","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_VALOR));

		if(this.conversioninvenConstantesFunciones.mostrarvalorConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conversioninvenConstantesFunciones.resaltarvalorConversionInven,this.conversioninvenConstantesFunciones.activarvalorConversionInven,iSizeTabla,this,true,"valorConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversioninvenConstantesFunciones.resaltarvalorConversionInven,this.conversioninvenConstantesFunciones.activarvalorConversionInven,this,true,"valorConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,ConversionInvenConstantesFunciones.LABEL_DESCRIPCION));

		if(this.conversioninvenConstantesFunciones.mostrardescripcionConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConversionInvenConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conversioninvenConstantesFunciones.resaltardescripcionConversionInven,this.conversioninvenConstantesFunciones.activardescripcionConversionInven,iSizeTabla,this,true,"descripcionConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conversioninvenConstantesFunciones.resaltardescripcionConversionInven,this.conversioninvenConstantesFunciones.activardescripcionConversionInven,this,true,"descripcionConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConversionInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConversionInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConversionInven && this.isPermisoGuardarCambiosConversionInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conversioninvenSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConversionInven.addColumn(tableColumn);
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
			
			this.jTableDatosConversionInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConversionInven && this.isPermisoGuardarCambiosConversionInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConversionInven && this.isPermisoGuardarCambiosConversionInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConversionInven.moveColumn(this.jTableDatosConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConversionInven.moveColumn(this.jTableDatosConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConversionInven.moveColumn(this.jTableDatosConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConversionInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConversionInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConversionInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConversionInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConversionInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConversionInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConversionInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConversionInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=conversioninvenLogic.getConversionInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=conversioninvens.size()-1;
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
		//this.jTableDatosConversionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConversionInven();
			
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
				
				//this.isEsNuevoConversionInven=false;
					
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
				if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConversionInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConversionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConversionInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conversioninven.getsType().equals("DUPLICADO")
				   || this.conversioninven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConversionInven=true;
				
				} else {
					this.isEsNuevoConversionInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					if(this.conversioninven.getId()>=0 && !this.conversioninven.getIsNew()) {						
						this.isEsNuevoConversionInven=false;
						
					} else {
						this.isEsNuevoConversionInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConversionInven(esRelaciones);						
				
				this.seleccionarConversionInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conversioninven.getId()<0) {
					this.isEsNuevoConversionInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConversionInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConversionInven(evt,rowIndex);
				}	
				
				if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ConversionInven: " + this.dDif); 
					}
				}								
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConversionInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conversioninven)) {
					if(this.conversioninven.getId()>0) {
						this.conversioninven.setIsDeleted(true);
						
						this.conversioninvensEliminados.add(this.conversioninven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conversioninvenLogic.getConversionInvens().remove(this.conversioninven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conversioninvens.remove(this.conversioninven);				
					}
					
					
					((ConversionInvenModel) this.jTableDatosConversionInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConversionInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConversionInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConversionInven) {
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConversionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConversionInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConversionInven(this.conversioninven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.conversioninvenConstantesFunciones.cargarid_empresaConversionInven || this.conversioninvenConstantesFunciones.event_dependid_empresaConversionInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.conversioninven.getid_empresa());
									//this.inicializarActualizarBindingConversionInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(conversioninven.getEmpresa()!=null) {
							this.empresasForeignKey.add(conversioninven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.conversioninven.getid_empresa(),false,"Formulario");

					//TipoConversionInven
					if(!this.conversioninvenConstantesFunciones.cargarid_tipo_conversion_invenConversionInven || this.conversioninvenConstantesFunciones.event_dependid_tipo_conversion_invenConversionInven) {
						//this.cargarCombosTipoConversionInvensForeignKeyLista(" where id="+this.conversioninven.getid_tipo_conversion_inven());
									//this.inicializarActualizarBindingConversionInven(false,false);
						this.tipoconversioninvensForeignKey=new ArrayList<TipoConversionInven>();

						if(conversioninven.getTipoConversionInven()!=null) {
							this.tipoconversioninvensForeignKey.add(conversioninven.getTipoConversionInven());
						}

						this.addItemDefectoCombosForeignKeyTipoConversionInven();
						this.cargarCombosFrameTipoConversionInvensForeignKey("Todos");
					}
					this.setActualTipoConversionInvenForeignKey(this.conversioninven.getid_tipo_conversion_inven(),false,"Formulario");

					//Unidad
					if(!this.conversioninvenConstantesFunciones.cargarid_unidadConversionInven || this.conversioninvenConstantesFunciones.event_dependid_unidadConversionInven) {
						//this.cargarCombosUnidadsForeignKeyLista(" where id="+this.conversioninven.getid_unidad());
									//this.inicializarActualizarBindingConversionInven(false,false);
						this.unidadsForeignKey=new ArrayList<Unidad>();

						if(conversioninven.getUnidad()!=null) {
							this.unidadsForeignKey.add(conversioninven.getUnidad());
						}

						this.addItemDefectoCombosForeignKeyUnidad();
						this.cargarCombosFrameUnidadsForeignKey("Todos");
					}
					this.setActualUnidadForeignKey(this.conversioninven.getid_unidad(),false,"Formulario");

					//UnidadConversion
					if(!this.conversioninvenConstantesFunciones.cargarid_unidad_conversionConversionInven || this.conversioninvenConstantesFunciones.event_dependid_unidad_conversionConversionInven) {
						//this.cargarCombosUnidadConversionsForeignKeyLista(" where id="+this.conversioninven.getid_unidad_conversion());
									//this.inicializarActualizarBindingConversionInven(false,false);
						this.unidadconversionsForeignKey=new ArrayList<Unidad>();

						if(conversioninven.getUnidadConversion()!=null) {
							this.unidadconversionsForeignKey.add(conversioninven.getUnidadConversion());
						}

						this.addItemDefectoCombosForeignKeyUnidadConversion();
						this.cargarCombosFrameUnidadConversionsForeignKey("Todos");
					}
					this.setActualUnidadConversionForeignKey(this.conversioninven.getid_unidad_conversion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConversionInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConversionInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConversionInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConversionInven(ConversionInven conversioninven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConversionInven(conversioninven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConversionInven(ConversionInven conversioninven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConversionInven(conversioninven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConversionInven(conversioninven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConversionInven(conversioninven);
	}
	
	public void setVariablesObjetoActualToFormularioConversionInven(ConversionInven conversioninven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setText(conversioninven.getId().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setText(conversioninven.getvalor().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setText(conversioninven.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ConversionInven conversioninvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conversioninvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ConversionInven conversioninvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conversioninvenLocal=this.conversioninven;
			} else {
				conversioninvenLocal=this.conversioninvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conversioninvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConversionInven(conversioninvenLocal,true);
					
					if(conversioninvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conversioninvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conversioninvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConversionInven(ConversionInven conversioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConversionInven(conversioninven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(conversioninven);
	}
	
	public void setVariablesFormularioToObjetoActualConversionInven(ConversionInven conversioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConversionInven(conversioninven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConversionInven(ConversionInven conversioninven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.getText()==null || this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.getText()=="" || this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.getText()=="Id") {
				this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setText("0");
			}

			if(conColumnasBase) {conversioninven.setId(Long.parseLong(this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelIdConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conversioninven.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionInvenConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabelvalorConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conversioninven.setdescripcion(this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConversionInvenConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConversionInven.jLabeldescripcionConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConversionInven(ConversionInven conversioninvenBean,ConversionInven conversioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && conversioninvenBean.getid_tipo_conversion_inven()!=null && !conversioninvenBean.getid_tipo_conversion_inven().equals(-1L))) {conversioninven.setid_tipo_conversion_inven(conversioninvenBean.getid_tipo_conversion_inven());}
			if(conDefault || (!conDefault && conversioninvenBean.getid_unidad()!=null && !conversioninvenBean.getid_unidad().equals(-1L))) {conversioninven.setid_unidad(conversioninvenBean.getid_unidad());}
			if(conDefault || (!conDefault && conversioninvenBean.getid_unidad_conversion()!=null && !conversioninvenBean.getid_unidad_conversion().equals(-1L))) {conversioninven.setid_unidad_conversion(conversioninvenBean.getid_unidad_conversion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConversionInven(ConversionInven conversioninvenOrigen,ConversionInven conversioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conversioninvenOrigen.getId()!=null && !conversioninvenOrigen.getId().equals(0L))) {conversioninven.setId(conversioninvenOrigen.getId());}}
			if(conDefault || (!conDefault && conversioninvenOrigen.getid_tipo_conversion_inven()!=null && !conversioninvenOrigen.getid_tipo_conversion_inven().equals(-1L))) {conversioninven.setid_tipo_conversion_inven(conversioninvenOrigen.getid_tipo_conversion_inven());}
			if(conDefault || (!conDefault && conversioninvenOrigen.getid_unidad()!=null && !conversioninvenOrigen.getid_unidad().equals(-1L))) {conversioninven.setid_unidad(conversioninvenOrigen.getid_unidad());}
			if(conDefault || (!conDefault && conversioninvenOrigen.getid_unidad_conversion()!=null && !conversioninvenOrigen.getid_unidad_conversion().equals(-1L))) {conversioninven.setid_unidad_conversion(conversioninvenOrigen.getid_unidad_conversion());}
			if(conDefault || (!conDefault && conversioninvenOrigen.getvalor()!=null && !conversioninvenOrigen.getvalor().equals(0.0))) {conversioninven.setvalor(conversioninvenOrigen.getvalor());}
			if(conDefault || (!conDefault && conversioninvenOrigen.getdescripcion()!=null && !conversioninvenOrigen.getdescripcion().equals(""))) {conversioninven.setdescripcion(conversioninvenOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConversionInven(ConversionInven conversioninven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setText(conversioninven.getId().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setText(conversioninven.getvalor().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setText(conversioninven.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConversionInven(ConversionInvenBean conversioninvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setText(conversioninvenBean.getId().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setText(conversioninvenBean.getvalor().toString());
			this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setText(conversioninvenBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConversionInven(ConversionInvenParameterReturnGeneral conversioninvenReturnGeneral,ConversionInvenBean conversioninvenBean,Boolean conDefault) throws Exception { 
		try {
			ConversionInven conversioninvenLocal=new ConversionInven();
			
			conversioninvenLocal=conversioninvenReturnGeneral.getConversionInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conversioninvenLocal.getId()!=null && !conversioninvenLocal.getId().equals(0L))) {conversioninvenBean.setId(conversioninvenLocal.getId());}}
			if(conDefault || (!conDefault && conversioninvenLocal.getid_tipo_conversion_inven()!=null && !conversioninvenLocal.getid_tipo_conversion_inven().equals(-1L))) {conversioninvenBean.setid_tipo_conversion_inven(conversioninvenLocal.getid_tipo_conversion_inven());}
			if(conDefault || (!conDefault && conversioninvenLocal.getid_unidad()!=null && !conversioninvenLocal.getid_unidad().equals(-1L))) {conversioninvenBean.setid_unidad(conversioninvenLocal.getid_unidad());}
			if(conDefault || (!conDefault && conversioninvenLocal.getid_unidad_conversion()!=null && !conversioninvenLocal.getid_unidad_conversion().equals(-1L))) {conversioninvenBean.setid_unidad_conversion(conversioninvenLocal.getid_unidad_conversion());}
			if(conDefault || (!conDefault && conversioninvenLocal.getvalor()!=null && !conversioninvenLocal.getvalor().equals(0.0))) {conversioninvenBean.setvalor(conversioninvenLocal.getvalor());}
			if(conDefault || (!conDefault && conversioninvenLocal.getdescripcion()!=null && !conversioninvenLocal.getdescripcion().equals(""))) {conversioninvenBean.setdescripcion(conversioninvenLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConversionInvenGenerico(Long idConversionInvenSeleccionado,JComboBox jComboBoxConversionInven,List<ConversionInven> conversioninvensLocal)throws Exception {
		try {
			ConversionInven  conversioninvenTemp=null;

			for(ConversionInven conversioninvenAux:conversioninvensLocal) {
				if(conversioninvenAux.getId()!=null && conversioninvenAux.getId().equals(idConversionInvenSeleccionado)) {
					conversioninvenTemp=conversioninvenAux;
					break;
				}
			}

			jComboBoxConversionInven.setSelectedItem(conversioninvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConversionInvenGenerico(JComboBox jComboBoxConversionInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConversionInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConversionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConversionInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConversionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversioninven=(ConversionInven) conversioninvenLogic.getConversionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conversioninven =(ConversionInven) conversioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!conversioninven.getIsNew() && !conversioninven.getIsChanged() && !conversioninven.getIsDeleted()) {
				sDescripcion=conversioninven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=conversioninven.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoConversionInven")) {
			//sDescripcion=this.getActualTipoConversionInvenForeignKeyDescripcion((Long)value);
			if(!conversioninven.getIsNew() && !conversioninven.getIsChanged() && !conversioninven.getIsDeleted()) {
				sDescripcion=conversioninven.gettipoconversioninven_descripcion();
			} else {
				//sDescripcion=this.getActualTipoConversionInvenForeignKeyDescripcion((Long)value);
				sDescripcion=conversioninven.gettipoconversioninven_descripcion();
			}
		}

		if(sTipo.equals("Unidad")) {
			//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
			if(!conversioninven.getIsNew() && !conversioninven.getIsChanged() && !conversioninven.getIsDeleted()) {
				sDescripcion=conversioninven.getunidad_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadForeignKeyDescripcion((Long)value);
				sDescripcion=conversioninven.getunidad_descripcion();
			}
		}

		if(sTipo.equals("UnidadConversion")) {
			//sDescripcion=this.getActualUnidadConversionForeignKeyDescripcion((Long)value);
			if(!conversioninven.getIsNew() && !conversioninven.getIsChanged() && !conversioninven.getIsDeleted()) {
				sDescripcion=conversioninven.getunidadconversion_descripcion();
			} else {
				//sDescripcion=this.getActualUnidadConversionForeignKeyDescripcion((Long)value);
				sDescripcion=conversioninven.getunidadconversion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ConversionInven conversioninvenRow=new ConversionInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversioninvenRow=(ConversionInven) conversioninvenLogic.getConversionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conversioninvenRow=(ConversionInven) conversioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConversionInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven));			
			this.jButtonDuplicarConversionInven.setVisible((this.isVisibilidadCeldaDuplicarConversionInven && this.isPermisoDuplicarConversionInven));			
			this.jButtonCopiarConversionInven.setVisible((this.isVisibilidadCeldaCopiarConversionInven && this.isPermisoCopiarConversionInven));
			this.jButtonVerFormConversionInven.setVisible((this.isVisibilidadCeldaVerFormConversionInven && this.isPermisoVerFormConversionInven));
			
			this.jButtonAbrirOrderByConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));			
			
			this.jButtonNuevoRelacionesConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionInven && this.isPermisoNuevoConversionInven));			
			this.jButtonNuevoGuardarCambiosConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven && this.isPermisoGuardarCambiosConversionInven));
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.jInternalFrameDetalleFormConversionInven.jButtonModificarConversionInven.setVisible((this.isVisibilidadCeldaModificarConversionInven && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.setVisible((this.isVisibilidadCeldaActualizarConversionInven && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.setVisible((this.isVisibilidadCeldaEliminarConversionInven && this.isPermisoEliminarConversionInven));
			this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.setVisible(this.isVisibilidadCeldaCancelarConversionInven);							
			this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.setVisible((this.isVisibilidadCeldaGuardarConversionInven && this.isPermisoGuardarCambiosConversionInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionInven && this.isPermisoGuardarCambiosConversionInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven));						
			this.jButtonDuplicarToolBarConversionInven.setVisible((this.isVisibilidadCeldaDuplicarConversionInven && this.isPermisoDuplicarConversionInven));						
			this.jButtonCopiarToolBarConversionInven.setVisible((this.isVisibilidadCeldaCopiarConversionInven && this.isPermisoCopiarConversionInven));			
			this.jButtonVerFormToolBarConversionInven.setVisible((this.isVisibilidadCeldaVerFormConversionInven && this.isPermisoVerFormConversionInven));			
			this.jButtonAbrirOrderByToolBarConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));
			this.jButtonNuevoRelacionesToolBarConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionInven && this.isPermisoNuevoConversionInven));			
			this.jButtonNuevoGuardarCambiosToolBarConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven && this.isPermisoGuardarCambiosConversionInven));			
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.jInternalFrameDetalleFormConversionInven.jButtonModificarToolBarConversionInven.setVisible((this.isVisibilidadCeldaModificarConversionInven && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jButtonActualizarToolBarConversionInven.setVisible((this.isVisibilidadCeldaActualizarConversionInven  && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jButtonEliminarToolBarConversionInven.setVisible((this.isVisibilidadCeldaEliminarConversionInven && this.isPermisoEliminarConversionInven));
			this.jInternalFrameDetalleFormConversionInven.jButtonCancelarToolBarConversionInven.setVisible(this.isVisibilidadCeldaCancelarConversionInven);				
			this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosToolBarConversionInven.setVisible((this.isVisibilidadCeldaGuardarConversionInven && this.isPermisoGuardarCambiosConversionInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionInven && this.isPermisoGuardarCambiosConversionInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven));			
			this.jMenuItemDuplicarConversionInven.setVisible((this.isVisibilidadCeldaDuplicarConversionInven && this.isPermisoDuplicarConversionInven));			
			this.jMenuItemCopiarConversionInven.setVisible((this.isVisibilidadCeldaCopiarConversionInven && this.isPermisoCopiarConversionInven));			
			this.jMenuItemVerFormConversionInven.setVisible((this.isVisibilidadCeldaVerFormConversionInven && this.isPermisoVerFormConversionInven));			
			this.jMenuItemAbrirOrderByConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));			
			//this.jMenuItemMostrarOcultarConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));
			this.jMenuItemDetalleAbrirOrderByConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));			
			//this.jMenuItemDetalleMostrarOcultarConversionInven.setVisible((this.isVisibilidadCeldaOrdenConversionInven && this.isPermisoOrdenConversionInven));			
			this.jMenuItemNuevoRelacionesConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesConversionInven && this.isPermisoNuevoConversionInven));			
			this.jMenuItemNuevoGuardarCambiosConversionInven.setVisible((this.isVisibilidadCeldaNuevoConversionInven && this.isPermisoNuevoConversionInven && this.isPermisoGuardarCambiosConversionInven));									
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.jInternalFrameDetalleFormConversionInven.jMenuItemModificarConversionInven.setVisible((this.isVisibilidadCeldaModificarConversionInven && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jMenuItemActualizarConversionInven.setVisible((this.isVisibilidadCeldaActualizarConversionInven && this.isPermisoActualizarConversionInven));	
			this.jInternalFrameDetalleFormConversionInven.jMenuItemEliminarConversionInven.setVisible((this.isVisibilidadCeldaEliminarConversionInven && this.isPermisoEliminarConversionInven));
			this.jInternalFrameDetalleFormConversionInven.jMenuItemCancelarConversionInven.setVisible(this.isVisibilidadCeldaCancelarConversionInven);				
			}
			
			this.jMenuItemGuardarCambiosConversionInven.setVisible((this.isVisibilidadCeldaGuardarConversionInven && this.isPermisoGuardarCambiosConversionInven));						
			this.jMenuItemGuardarCambiosTablaConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosConversionInven && this.isPermisoGuardarCambiosConversionInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConversionInven=this.jButtonNuevoConversionInven.isVisible();
			this.isVisibilidadCeldaDuplicarConversionInven=this.jButtonDuplicarConversionInven.isVisible();
			this.isVisibilidadCeldaCopiarConversionInven=this.jButtonCopiarConversionInven.isVisible();
			this.isVisibilidadCeldaVerFormConversionInven=this.jButtonVerFormConversionInven.isVisible();
			
			this.isVisibilidadCeldaOrdenConversionInven=this.jButtonAbrirOrderByConversionInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=this.jButtonNuevoRelacionesConversionInven.isVisible();
			this.isVisibilidadCeldaModificarConversionInven=this.jButtonModificarConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.isVisibilidadCeldaActualizarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConversionInven=this.jButtonGuardarCambiosTablaConversionInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConversionInven=this.jButtonNuevoToolBarConversionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=this.jButtonNuevoRelacionesToolBarConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.isVisibilidadCeldaModificarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonModificarToolBarConversionInven.isVisible();
			this.isVisibilidadCeldaActualizarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonActualizarToolBarConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonEliminarToolBarConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarConversionInven=this.jInternalFrameDetalleFormConversionInven.jButtonCancelarToolBarConversionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConversionInven=this.jButtonGuardarCambiosToolBarConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConversionInven=this.jButtonGuardarCambiosTablaToolBarConversionInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConversionInven=this.jMenuItemNuevoConversionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=this.jMenuItemNuevoRelacionesConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.isVisibilidadCeldaModificarConversionInven=this.jInternalFrameDetalleFormConversionInven.jMenuItemModificarConversionInven.isVisible();
			this.isVisibilidadCeldaActualizarConversionInven=this.jInternalFrameDetalleFormConversionInven.jMenuItemActualizarConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarConversionInven=this.jInternalFrameDetalleFormConversionInven.jMenuItemEliminarConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarConversionInven=this.jInternalFrameDetalleFormConversionInven.jMenuItemCancelarConversionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConversionInven=this.jMenuItemGuardarCambiosConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConversionInven=this.jMenuItemGuardarCambiosTablaConversionInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConversionInven(Boolean esInicializar) {
		if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
				//if(this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConversionInven();
			}
			
			this.inicializarActualizarBindingBotonesManualConversionInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConversionInven() {
		this.jButtonNuevoConversionInven.setVisible(this.isPermisoNuevoConversionInven);			
		this.jButtonDuplicarConversionInven.setVisible(this.isPermisoDuplicarConversionInven);			
		this.jButtonCopiarConversionInven.setVisible(this.isPermisoCopiarConversionInven);			
		this.jButtonVerFormConversionInven.setVisible(this.isPermisoVerFormConversionInven);			
		
		this.jButtonAbrirOrderByConversionInven.setVisible(this.isPermisoOrdenConversionInven);					
		
		this.jButtonNuevoRelacionesConversionInven.setVisible(this.isPermisoNuevoConversionInven);			
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonModificarConversionInven.setVisible(this.isPermisoActualizarConversionInven);	
			this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.setVisible(this.isPermisoActualizarConversionInven);	
			this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.setVisible(this.isPermisoEliminarConversionInven);
			this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.setVisible(this.isVisibilidadCeldaCancelarConversionInven);						
			this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.setVisible(this.isPermisoGuardarCambiosConversionInven);							
		}
		
		this.jButtonGuardarCambiosTablaConversionInven.setVisible(this.isPermisoActualizarConversionInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConversionInven() {
		this.jInternalFrameDetalleFormConversionInven.jButtonModificarConversionInven.setVisible(this.isPermisoActualizarConversionInven);	
		this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.setVisible(this.isPermisoActualizarConversionInven);	
		this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.setVisible(this.isPermisoEliminarConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.setVisible(this.isVisibilidadCeldaCancelarConversionInven);							
		this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.setVisible((this.isVisibilidadCeldaGuardarConversionInven && this.isPermisoGuardarCambiosConversionInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConversionInven() {
		if(ConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConversionInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConversionInven() {
	}
	
	public void jTableDatosConversionInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConversionInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conversioninven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaConversionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebConversionInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.conversioninvenLogic.getConnexion());

				if(this.conversioninven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.conversioninven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionInven=(TitledBorder)this.jScrollPanelDatosConversionInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderConversionInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.conversioninven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_conversion_invenConversionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoconversioninven=true;

			idTienePermisotipoconversioninven=this.tienePermisosUsuarioEnPaginaWebConversionInven(TipoConversionInvenConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoconversioninven) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);

				this.tipoconversioninvenBeanSwingJInternalFrame=new TipoConversionInvenBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoconversioninvenBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoconversioninvenBeanSwingJInternalFrame.getTipoConversionInvenLogic().setConnexion(this.conversioninvenLogic.getConnexion());

				if(this.conversioninven.getid_tipo_conversion_inven()!=null) {
					this.tipoconversioninvenBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoconversioninvenBeanSwingJInternalFrame.setIdActual(this.conversioninven.getid_tipo_conversion_inven());
					this.tipoconversioninvenBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoconversioninvenBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoconversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoConversionInven();
				}

				JInternalFrameBase jinternalFrame =this.tipoconversioninvenBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionInven=(TitledBorder)this.jScrollPanelDatosConversionInven.getBorder();
				TitledBorder titledBordertipoconversioninven=(TitledBorder)this.tipoconversioninvenBeanSwingJInternalFrame.jScrollPanelDatosTipoConversionInven.getBorder();

				titledBordertipoconversioninven.setTitle(titledBorderConversionInven.getTitle() + " -> Tipo Conversion Inven");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_conversion_invenConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getid_tipo_conversion_inven()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_conversion_inven = "+this.conversioninven.getid_tipo_conversion_inven().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidadConversionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidad=true;

			idTienePermisounidad=this.tienePermisosUsuarioEnPaginaWebConversionInven(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidad) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);

				this.unidadBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.conversioninvenLogic.getConnexion());

				if(this.conversioninven.getid_unidad()!=null) {
					this.unidadBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadBeanSwingJInternalFrame.setIdActual(this.conversioninven.getid_unidad());
					this.unidadBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionInven=(TitledBorder)this.jScrollPanelDatosConversionInven.getBorder();
				TitledBorder titledBorderunidad=(TitledBorder)this.unidadBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidad.setTitle(titledBorderConversionInven.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidadConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getid_unidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad = "+this.conversioninven.getid_unidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_unidad_conversionConversionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisounidadconversion=true;

			idTienePermisounidadconversion=this.tienePermisosUsuarioEnPaginaWebConversionInven(UnidadConstantesFunciones.CLASSNAME);

			if(idTienePermisounidadconversion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConversionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConversionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);

				this.unidadconversionBeanSwingJInternalFrame=new UnidadBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.unidadconversionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.unidadconversionBeanSwingJInternalFrame.getUnidadLogic().setConnexion(this.conversioninvenLogic.getConnexion());

				if(this.conversioninven.getid_unidad_conversion()!=null) {
					this.unidadconversionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.unidadconversionBeanSwingJInternalFrame.setIdActual(this.conversioninven.getid_unidad_conversion());
					this.unidadconversionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.unidadconversionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.unidadconversionBeanSwingJInternalFrame.inicializarActualizarBindingTablaUnidad();
				}

				JInternalFrameBase jinternalFrame =this.unidadconversionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConversionInven=(TitledBorder)this.jScrollPanelDatosConversionInven.getBorder();
				TitledBorder titledBorderunidadconversion=(TitledBorder)this.unidadconversionBeanSwingJInternalFrame.jScrollPanelDatosUnidad.getBorder();

				titledBorderunidadconversion.setTitle(titledBorderConversionInven.getTitle() + " -> Unidad");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_unidad_conversionConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getid_unidad_conversion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_unidad_conversion = "+this.conversioninven.getid_unidad_conversion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.conversioninven.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.getconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conversioninven==null) {
						this.conversioninven = new ConversionInven();
					}

					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);
				}

				if(this.conversioninven.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.conversioninven.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionInven(false,false);

			this.getConversionInvensFK_IdEmpresa();

			this.inicializarActualizarBindingConversionInven(false);

			//if(ConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoConversionInvenConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionInven(false,false);

			this.getConversionInvensFK_IdTipoConversionInven();

			this.inicializarActualizarBindingConversionInven(false);

			//if(ConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionInven(false,false);

			this.getConversionInvensFK_IdUnidad();

			this.inicializarActualizarBindingConversionInven(false);

			//if(ConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdUnidadConversionConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConversionInven(false,false);

			this.getConversionInvensFK_IdUnidadConversion();

			this.inicializarActualizarBindingConversionInven(false);

			//if(ConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConversionInven() {
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
			this.jInternalFrameDetalleFormConversionInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormConversionInven.dispose();
			this.jInternalFrameDetalleFormConversionInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
			this.jInternalFrameReporteDinamicoConversionInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConversionInven.dispose();
			this.jInternalFrameReporteDinamicoConversionInven=null;
		}
		
		if(this.jInternalFrameImportacionConversionInven!=null) {
			this.jInternalFrameImportacionConversionInven.setVisible(false);	    			
			this.jInternalFrameImportacionConversionInven.dispose();
			this.jInternalFrameImportacionConversionInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConversionInven();
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConversionInven")) {
				jButtonDuplicarConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConversionInven")) {
				jButtonCopiarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormConversionInven")) {
				jButtonVerFormConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConversionInven")) {
				jButtonDuplicarConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConversionInven")) {
				jButtonDuplicarConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConversionInven")) {
				jButtonModificarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConversionInven")) {
				jButtonModificarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConversionInven")) {
				jButtonModificarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConversionInven")) {
				jButtonActualizarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConversionInven")) {
				jButtonActualizarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConversionInven")) {
				jButtonActualizarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarConversionInven")) {
				jButtonEliminarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConversionInven")) {
				jButtonEliminarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConversionInven")) {
				jButtonEliminarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarConversionInven")) {
				jButtonCancelarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConversionInven")) {
				jButtonCancelarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConversionInven")) {
				jButtonCancelarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarConversionInven")) {
				jButtonCerrarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConversionInven")) {
				jButtonCerrarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConversionInven")) {
				jButtonCerrarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConversionInven")) {
				jButtonMostrarOcultarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConversionInven")) {
				jButtonCancelarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConversionInven")) {
				jButtonCopiarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConversionInven")) {
				jButtonVerFormConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConversionInven")) {
				jButtonCopiarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConversionInven")) {
				jButtonVerFormConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConversionInven")) {
				jButtonRecargarInformacionConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConversionInven")) {
				jButtonRecargarInformacionConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConversionInven")) {
				jButtonRecargarInformacionConversionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConversionInven")) {
				jButtonAnterioresConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConversionInven")) {
				jButtonAnterioresConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConversionInven")) {
				jButtonAnterioresConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConversionInven")) {
				jButtonSiguientesConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConversionInven")) {
				jButtonSiguientesConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConversionInven")) {
				jButtonSiguientesConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConversionInven") || sTipo.equals("MenuItemDetalleAbrirOrderByConversionInven")) {
				jButtonAbrirOrderByConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConversionInven") || sTipo.equals("MenuItemDetalleMostrarOcultarConversionInven")) {
				jButtonMostrarOcultarConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConversionInven")) {
				jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConversionInven")) {
				jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConversionInven")) {
				jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConversionInven")) {
				jButtonCerrarReporteDinamicoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConversionInven")) {
				jButtonGenerarReporteDinamicoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConversionInven")) {
				
				jButtonGenerarExcelReporteDinamicoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConversionInven")) {
				jButtonCerrarImportacionConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConversionInven")) {
				
				jButtonGenerarImportacionConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConversionInven")) {
				
				jButtonAbrirImportacionConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConversionInven")) {
				jComboBoxTiposAccionesConversionInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConversionInven")) {
				jComboBoxTiposRelacionesConversionInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConversionInven")) {
				jComboBoxTiposAccionesConversionInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConversionInven")) {
				
				jComboBoxTiposSeleccionarConversionInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConversionInven")) {
				jTextFieldValorCampoGeneralConversionInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConversionInven")) {
				jButtonAbrirOrderByConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConversionInven")) {
				jButtonAbrirOrderByConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConversionInven")) {
				jButtonCerrarOrderByConversionInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConversionInvenBusqueda")) {
				this.jButtonidConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConversionInvenUpdate")) {
				this.jButtonid_empresaConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConversionInvenBusqueda")) {
				this.jButtonid_empresaConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_conversion_invenConversionInvenUpdate")) {
				this.jButtonid_tipo_conversion_invenConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_conversion_invenConversionInvenBusqueda")) {
				this.jButtonid_tipo_conversion_invenConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadConversionInvenUpdate")) {
				this.jButtonid_unidadConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadConversionInvenBusqueda")) {
				this.jButtonid_unidadConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_conversionConversionInvenUpdate")) {
				this.jButtonid_unidad_conversionConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_conversionConversionInvenBusqueda")) {
				this.jButtonid_unidad_conversionConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConversionInvenBusqueda")) {
				this.jButtonvalorConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionConversionInvenBusqueda")) {
				this.jButtondescripcionConversionInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoConversionInvenConversionInven")) {
				this.jButtonFK_IdTipoConversionInvenConversionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadConversionInven")) {
				this.jButtonFK_IdUnidadConversionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdUnidadConversionConversionInven")) {
				this.jButtonFK_IdUnidadConversionConversionInvenActionPerformed(evt);
			}
			
			;
			
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConversionInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ConversionInven conversioninvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				conversioninvenLocal=this.conversioninven;
			} else {
				conversioninvenLocal=this.conversioninvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
							
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
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
			
			


			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
								
						
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
								
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
							
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
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
			
			


			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
								
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConversionInven")) {
					jCheckBoxSeleccionarTodosConversionInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConversionInven")) {
					jCheckBoxSeleccionadosConversionInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConversionInven")) {
					
				}
				
				


				
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
												
				
				


				
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
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
			
			


			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConversionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conversioninven);
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
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
				
				


				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ConversionInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conversioninvenAnterior =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConversionInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConversionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConversionInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conversioninven =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conversioninven =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conversioninven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConversionInven")) {
				
				}
				
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConversionInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConversionInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConversionInven")) {
			
			}
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConversionInven();
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			if(sTipo.equals("NuevoConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConversionInven")) {
				jButtonDuplicarConversionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConversionInven")) {
				jButtonCopiarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConversionInven")) {
				jButtonVerFormConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConversionInven")) {
				jButtonNuevoConversionInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConversionInven")) {
				jButtonModificarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConversionInven")) {
				jButtonActualizarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConversionInven")) {
				jButtonEliminarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConversionInven")) {
				jButtonCancelarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConversionInven")) {
				jButtonCerrarConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConversionInven")) {
				jButtonGuardarCambiosConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConversionInven")) {
				jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConversionInven")) {
				jButtonAbrirOrderByConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConversionInven")) {
				jButtonRecargarInformacionConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConversionInven")) {
				jButtonAnterioresConversionInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConversionInven")) {
				jButtonSiguientesConversionInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idConversionInvenBusqueda")) {
				this.jButtonidConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaConversionInvenUpdate")) {
				this.jButtonid_empresaConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaConversionInvenBusqueda")) {
				this.jButtonid_empresaConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_conversion_invenConversionInvenUpdate")) {
				this.jButtonid_tipo_conversion_invenConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_conversion_invenConversionInvenBusqueda")) {
				this.jButtonid_tipo_conversion_invenConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidadConversionInvenUpdate")) {
				this.jButtonid_unidadConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidadConversionInvenBusqueda")) {
				this.jButtonid_unidadConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_unidad_conversionConversionInvenUpdate")) {
				this.jButtonid_unidad_conversionConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_unidad_conversionConversionInvenBusqueda")) {
				this.jButtonid_unidad_conversionConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorConversionInvenBusqueda")) {
				this.jButtonvalorConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionConversionInvenBusqueda")) {
				this.jButtondescripcionConversionInvenBusquedaActionPerformed(evt);
			}
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConversionInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConversionInven")) {
				closingInternalFrameConversionInven();
				
			} else if(sTipo.equals("jButtonCancelarConversionInven")) {
				JInternalFrameBase jInternalFrameDetalleFormConversionInven = (JInternalFrameBase)evt.getSource();
	            	
	            ConversionInvenBeanSwingJInternalFrame jInternalFrameParent=(ConversionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormConversionInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConversionInvenActionPerformed(null);
			}
			
			ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conversioninven,new Object(),this.conversioninvenParameterGeneral,this.conversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConversionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConversionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConversionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conversioninven)) {
			if(!esControlTabla) {
				if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);			
				}
				
				if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConversionInven(this.conversioninven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conversioninvenReturnGeneral=conversioninvenLogic.procesarEventosConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversioninvenLogic.getConversionInvens(),this.conversioninven,this.conversioninvenParameterGeneral,this.isEsNuevoConversionInven,classes);//this.conversioninvenLogic.getConversionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConversionInven(this.conversioninvenReturnGeneral,this.conversioninvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConversionInven(classes,this.conversioninvenReturnGeneral,this.conversioninvenBean,false);
					}
						
					if(this.conversioninvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConversionInven(this.conversioninvenReturnGeneral.getConversionInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConversionInven(this.conversioninvenReturnGeneral.getConversionInven());	
					}
						
					if(this.conversioninvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConversionInven(this.conversioninvenReturnGeneral.getConversionInven(),classes);//this.conversioninvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConversionInven(this.conversioninven,classes);//this.conversioninvenBean);									
				}
			
				if(ConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConversionInven(this.conversioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConversionInven(this.conversioninven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conversioninvenAnterior!=null) {
						this.conversioninven=this.conversioninvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conversioninvenReturnGeneral=conversioninvenLogic.procesarEventosConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversioninvenLogic.getConversionInvens(),this.conversioninven,this.conversioninvenParameterGeneral,this.isEsNuevoConversionInven,classes);//this.conversioninvenLogic.getConversionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conversioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conversioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conversioninvenReturnGeneral.getConversionInven(),conversioninvenLogic.getConversionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conversioninvenReturnGeneral.getConversionInven(),this.conversioninvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConversionInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosConversionInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConversionInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosConversionInven() throws Exception {
		
		ConversionInvenModel conversioninvenModel=(ConversionInvenModel)this.jTableDatosConversionInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conversioninvenModel.conversioninvens=this.conversioninvenLogic.getConversionInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conversioninvenModel.conversioninvens=this.conversioninvens;
		}
		
		
		((ConversionInvenModel) this.jTableDatosConversionInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConversionInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconversioninvenAnterior(),this.conversioninvenLogic.getConversionInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconversioninvenAnterior(),this.conversioninvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConversionInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConversionInven(ConversionInven conversioninven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
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
										
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversioninven,new Object(),generalEntityParameterGeneral,this.conversioninvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conversioninvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConversionInvenConstantesFunciones.getClassesRelationshipsOfConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConversionInvenConstantesFunciones.getClassesRelationshipsFromStringsOfConversionInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConversionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conversioninven,new Object(),generalEntityParameterGeneral,this.conversioninvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConversionInven(ConversionInvenBean conversioninvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConversionInven(ArrayList<Classe> classes,ConversionInvenReturnGeneral conversioninvenReturnGeneral,ConversionInvenBean conversioninvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConversionInven(ConversionInven conversioninven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.conversioninven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConversionInven = new ConversionInvenDetalleFormJInternalFrame(jDesktopPane,this.conversioninvenSessionBean.getConGuardarRelaciones(),this.conversioninvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConversionInven);
		this.jInternalFrameDetalleFormConversionInven.setVisible(false);
		this.jInternalFrameDetalleFormConversionInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormConversionInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConversionInven.conversioninvenLogic=this.conversioninvenLogic;
		
		this.cargarCombosFrameForeignKeyConversionInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConversionInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConversionInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConversionInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConversionInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConversionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConversionInven"));
		
		this.jInternalFrameDetalleFormConversionInven.jButtonModificarConversionInven.addActionListener(new ButtonActionListener(this,"ModificarConversionInven"));

		
		this.jInternalFrameDetalleFormConversionInven.jButtonModificarToolBarConversionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarConversionInven"));
					
		this.jInternalFrameDetalleFormConversionInven.jMenuItemModificarConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.addActionListener (new ButtonActionListener(this,"ActualizarConversionInven"));
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonActualizarToolBarConversionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConversionInven"));
						
		this.jInternalFrameDetalleFormConversionInven.jMenuItemActualizarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.addActionListener (new ButtonActionListener(this,"EliminarConversionInven"));
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonEliminarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarConversionInven"));
								
		this.jInternalFrameDetalleFormConversionInven.jMenuItemEliminarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.addActionListener (new ButtonActionListener(this,"CancelarConversionInven"));
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonCancelarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarConversionInven"));
					
		this.jInternalFrameDetalleFormConversionInven.jMenuItemCancelarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConversionInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jMenuItemDetalleCerrarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosToolBarConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionInven"));
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosToolBarConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionInven"));
		
		
		
		this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConversionInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonidConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonvalorConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtondescripcionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConversionInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConversionInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConversionInven"));
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConversionInven"));
		}
		
		this.jTableDatosConversionInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConversionInven"));
		
		this.jTableDatosConversionInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConversionInven"));
		
		this.jButtonNuevoConversionInven.addActionListener(new ButtonActionListener(this,"NuevoConversionInven"));
		
		this.jButtonDuplicarConversionInven.addActionListener(new ButtonActionListener(this,"DuplicarConversionInven"));
		
		this.jButtonCopiarConversionInven.addActionListener(new ButtonActionListener(this,"CopiarConversionInven"));
		
		this.jButtonVerFormConversionInven.addActionListener(new ButtonActionListener(this,"VerFormConversionInven"));
		
		
		this.jButtonNuevoToolBarConversionInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarConversionInven"));
			
		this.jButtonDuplicarToolBarConversionInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConversionInven"));
			
		this.jMenuItemNuevoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConversionInven"));
			
		this.jMenuItemDuplicarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConversionInven"));		
		
		
		this.jButtonNuevoRelacionesConversionInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConversionInven"));
		
		
		this.jButtonNuevoRelacionesToolBarConversionInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConversionInven"));
			
		this.jMenuItemNuevoRelacionesConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConversionInven"));		
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonModificarConversionInven.addActionListener(new ButtonActionListener(this,"ModificarConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonModificarToolBarConversionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarConversionInven"));
			
			this.jInternalFrameDetalleFormConversionInven.jMenuItemModificarConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConversionInven.jButtonActualizarConversionInven.addActionListener (new ButtonActionListener(this,"ActualizarConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonActualizarToolBarConversionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConversionInven"));
				
			this.jInternalFrameDetalleFormConversionInven.jMenuItemActualizarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonEliminarConversionInven.addActionListener (new ButtonActionListener(this,"EliminarConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonEliminarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarConversionInven"));
						
			this.jInternalFrameDetalleFormConversionInven.jMenuItemEliminarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonCancelarConversionInven.addActionListener (new ButtonActionListener(this,"CancelarConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonCancelarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarConversionInven"));
			
			this.jInternalFrameDetalleFormConversionInven.jMenuItemCancelarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConversionInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConversionInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConversionInven"));		
		
		
		this.jButtonCerrarConversionInven.addActionListener (new ButtonActionListener(this,"CerrarConversionInven"));
		
		
		this.jButtonCerrarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarConversionInven"));
			
		this.jMenuItemCerrarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConversionInven"));
			
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jMenuItemDetalleCerrarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosToolBarConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConversionInven"));
		}
		
		this.jButtonCopiarToolBarConversionInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarConversionInven"));
			
		this.jButtonVerFormToolBarConversionInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarConversionInven"));
		
		this.jMenuItemGuardarCambiosConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConversionInven"));
			
		this.jMenuItemCopiarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConversionInven"));		
		
		this.jMenuItemVerFormConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConversionInven"));		
		
		
		this.jButtonGuardarCambiosTablaConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConversionInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConversionInven"));
			
		this.jMenuItemGuardarCambiosTablaConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConversionInven"));		
		
		
		
		this.jButtonRecargarInformacionConversionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionConversionInven"));
					
		this.jButtonRecargarInformacionToolBarConversionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConversionInven"));
		
		this.jMenuItemRecargarInformacionConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConversionInven"));		
		
		
		
		this.jButtonAnterioresConversionInven.addActionListener (new ButtonActionListener(this,"AnterioresConversionInven"));
		
		
		this.jButtonAnterioresToolBarConversionInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConversionInven"));
		
		this.jMenuItemAnterioresConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConversionInven"));		
		
		
		this.jButtonSiguientesConversionInven.addActionListener (new ButtonActionListener(this,"SiguientesConversionInven"));
		
		
		this.jButtonSiguientesToolBarConversionInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConversionInven"));
			
		this.jMenuItemSiguientesConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConversionInven"));
			
		this.jMenuItemAbrirOrderByConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConversionInven"));
			
		this.jMenuItemMostrarOcultarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConversionInven"));
			
		this.jMenuItemDetalleAbrirOrderByConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConversionInven"));
			
		this.jMenuItemDetalleMostarOcultarConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConversionInven"));		
		
		
		this.jButtonNuevoGuardarCambiosConversionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConversionInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConversionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConversionInven"));
			
		this.jMenuItemNuevoGuardarCambiosConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConversionInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConversionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConversionInven"));

		this.jCheckBoxSeleccionadosConversionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConversionInven"));
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConversionInven"));
		}
		
		
		this.jComboBoxTiposRelacionesConversionInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesConversionInven"));
			
		this.jComboBoxTiposAccionesConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesConversionInven"));
					
		this.jComboBoxTiposSeleccionarConversionInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConversionInven"));
			
		this.jTextFieldValorCampoGeneralConversionInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConversionInven"));		
		
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonidConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonvalorConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtondescripcionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConversionInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoConversionInvenConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoConversionInvenConversionInven"));

			this.jButtonFK_IdUnidadConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdUnidadConversionInven"));

			this.jButtonFK_IdUnidadConversionConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdUnidadConversionConversionInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionInven"));
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionInven"));
				this.jInternalFrameReporteDinamicoConversionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoConversionInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConversionInven"));				
			//this.jButtonGenerarReporteDinamicoConversionInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConversionInven"));
			//this.jButtonGenerarExcelReporteDinamicoConversionInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConversionInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConversionInven!=null) {
				this.jInternalFrameImportacionConversionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConversionInven"));
				this.jInternalFrameImportacionConversionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConversionInven"));
				this.jInternalFrameImportacionConversionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConversionInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConversionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByConversionInven"));
			
			this.jButtonAbrirOrderByToolBarConversionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConversionInven"));			
			
			if(this.jInternalFrameOrderByConversionInven!=null) {
				this.jInternalFrameOrderByConversionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConversionInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConversionInven.jTabbedPaneRelacionesConversionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConversionInven"));
		
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
            		closingInternalFrameConversionInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConversionInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConversionInven = (JInternalFrameBase)event.getSource();
	            	
	            ConversionInvenBeanSwingJInternalFrame jInternalFrameParent=(ConversionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormConversionInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConversionInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConversionInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConversionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConversionInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConversionInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConversionInven";
		inputMap = this.jButtonNuevoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConversionInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConversionInven";
		inputMap = this.jButtonNuevoRelacionesConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConversionInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConversionInven";
		inputMap = this.jButtonModificarConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConversionInven";
		inputMap = this.jButtonActualizarConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConversionInven";
		inputMap = this.jButtonEliminarConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConversionInven";
		inputMap = this.jButtonCancelarConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConversionInven";
		inputMap = this.jButtonCerrarConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConversionInven";
		inputMap = this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConversionInven.jButtonGuardarCambiosConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConversionInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConversionInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonidConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_empresaConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_tipo_conversion_invenConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_conversion_invenConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidadConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidadConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonid_unidad_conversionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_unidad_conversionConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtonvalorConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"valorConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConversionInven.jButtondescripcionConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"descripcionConversionInvenBusqueda"));
		
		
		this.jButtonFK_IdTipoConversionInvenConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdTipoConversionInvenConversionInven"));

		this.jButtonFK_IdUnidadConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdUnidadConversionInven"));

		this.jButtonFK_IdUnidadConversionConversionInven.addActionListener(new ButtonActionListener(this,"FK_IdUnidadConversionConversionInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConversionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConversionInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConversionInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
					conversioninvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionInven conversioninvenAux:conversioninvens) {
					conversioninvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConversionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConversionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
						conversioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionInven conversioninvenAux:conversioninvens) {
						conversioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionInven conversioninvenAux:conversioninvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConversionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConversionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConversionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConversionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConversionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConversionInven.getSelectedRows();
			
			ConversionInven conversioninvenLocal=new ConversionInven();
			
			//this.seleccionarTodosConversionInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conversioninvenLocal =(ConversionInven) this.conversioninvenLogic.getConversionInvens().toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conversioninvenLocal =(ConversionInven) this.conversioninvens.toArray()[this.jTableDatosConversionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conversioninvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
						conversioninvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ConversionInven conversioninvenAux:conversioninvens) {
						conversioninvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConversionInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConversionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConversionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConversionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConversionInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConversionInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConversionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConversionInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConversionInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ConversionInven conversioninvenAux:this.conversioninvenLogic.getConversionInvens()) {
				
						if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							conversioninvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							conversioninvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionInven conversioninvenAux:conversioninvens) {
					
						if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							conversioninvenAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							conversioninvenAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConversionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConversionInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConversionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConversionInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConversionInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConversionInven) {				
					conSplash=true;//false;										
					
					//this.startProcessConversionInven(conSplash);
				
					this.generarReporteConversionInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConversionInvensSeleccionados();
				//this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConversionInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConversionInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConversionInven();
				
				this.exportarConversionInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConversionInvens();
				//this.importarConversionInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConversionInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConversionInvensSeleccionados();
				//this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConversionInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConversionInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConversionInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
				}	
			} 			
			else if(ConversionInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConversionInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConversionInven(conSplash);
					
						//this.actualizarParametrosGeneralConversionInven();
						
						this.generarReporteProcesoAccionConversionInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConversionInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Conversion InvenES SELECCIONADOS?", "MANTENIMIENTO DE Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConversionInven();
				
						this.actualizarParametrosGeneralConversionInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conversioninvenReturnGeneral=conversioninvenLogic.procesarAccionConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conversioninvenLogic.getConversionInvens(),this.conversioninvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConversionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConversionInven();
					
					ConversionInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConversionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConversionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConversionInven.jComboBoxTiposAccionesFormularioConversionInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConversionInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConversionInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConversionInven();
			
			if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
			ConversionInven conversioninven=new ConversionInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConversionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConversionInven.getSelectedItem();
			
			
			
			
			conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(conversioninvensSeleccionados.size()==1) {
				for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
					conversioninven=conversioninvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConversionInven();
			
      		//this.finishProcessConversionInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConversionInvenReturnGeneral() throws Exception {
		if(this.conversioninvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conversioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conversioninvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conversioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conversioninvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conversioninvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConversionInven(false);
		}
		
		if(this.conversioninvenReturnGeneral.getConRetornoLista() || this.conversioninvenReturnGeneral.getConRetornoObjeto()) {
			if(this.conversioninvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conversioninvenLogic.setConversionInvens(this.conversioninvenReturnGeneral.getConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.conversioninvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conversioninvenLogic.setConversionInven(this.conversioninvenReturnGeneral.getConversionInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConversionInven(false);
		}
	}
	
	public void actualizarParametrosGeneralConversionInven() throws Exception {
		
		
	}
	
	public ArrayList<ConversionInven> getConversionInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConversionInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ConversionInven conversioninvenAux:conversioninvenLogic.getConversionInvens()) {
					if(conversioninvenAux.getIsSelected()) {
						conversioninvensSeleccionados.add(conversioninvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ConversionInven conversioninvenAux:this.conversioninvens) {
					if(conversioninvenAux.getIsSelected()) {
						conversioninvensSeleccionados.add(conversioninvenAux);				
					}
				}
			}
			
			if(conversioninvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conversioninvensSeleccionados.addAll(this.conversioninvenLogic.getConversionInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conversioninvensSeleccionados.addAll(this.conversioninvens);				
					}
				}
			}
		} else {
			conversioninvensSeleccionados.add(this.conversioninven);
		}
		
		return conversioninvensSeleccionados;
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
	
	public void generarReporteConversionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConversionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConversionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConversionInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConversionInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conversion Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados);
		
	}	
	
	public void generarReporteNormalConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConversionInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConversionInven();
		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConversionInven();
		
		
		//this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados ,conversioninvenImplementable,conversioninvenImplementableHome);
	}
	
	public void mostrarImportacionConversionInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConversionInven();
		
		this.abrirFrameImportacionConversionInven();		
		
			
		//this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados ,conversioninvenImplementable,conversioninvenImplementableHome);
	}
	
	public void importarConversionInvens() throws Exception {		
	
	}
	
	public void exportarConversionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConversionInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConversionInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConversionInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conversion Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConversionInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConversionInven(conversioninvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conversioninvenAux.setsDetalleGeneralEntityReporte(conversioninvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConversionInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_IDUNIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConversionInvenConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConversionInven(ConversionInven conversioninven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conversioninven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.gettipoconversioninven_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getunidad_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getunidadconversion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conversioninven.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ConversionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConversionInven(row);				
				iRow++;
			}				
			
			for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConversionInven(conversioninvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConversionInvensSeleccionados() throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();		
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conversioninven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conversioninvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conversioninven");
			//elementRoot.appendChild(element);
		
			for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
				element = document.createElement("conversioninven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConversionInven(conversioninvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConversionInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConversionInven(ConversionInven conversioninven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.gettipoconversioninven_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getunidad_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getunidadconversion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(conversioninven.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlConversionInven(ConversionInven conversioninven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ConversionInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(conversioninven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConversionInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conversioninven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ConversionInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(conversioninven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipoconversioninven_descripcion = document.createElement(ConversionInvenConstantesFunciones.IDTIPOCONVERSIONINVEN);
		elementtipoconversioninven_descripcion.appendChild(document.createTextNode(conversioninven.gettipoconversioninven_descripcion()));
		element.appendChild(elementtipoconversioninven_descripcion);

		Element elementunidad_descripcion = document.createElement(ConversionInvenConstantesFunciones.IDUNIDAD);
		elementunidad_descripcion.appendChild(document.createTextNode(conversioninven.getunidad_descripcion()));
		element.appendChild(elementunidad_descripcion);

		Element elementunidadconversion_descripcion = document.createElement(ConversionInvenConstantesFunciones.IDUNIDADCONVERSION);
		elementunidadconversion_descripcion.appendChild(document.createTextNode(conversioninven.getunidadconversion_descripcion()));
		element.appendChild(elementunidadconversion_descripcion);

		Element elementvalor = document.createElement(ConversionInvenConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(conversioninven.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(ConversionInvenConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(conversioninven.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoConversionInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ConversionInven> conversioninvensSeleccionados=new ArrayList<ConversionInven>();
		
		conversioninvensSeleccionados=this.getConversionInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConversionInven(conversioninvensSeleccionados);
		
		this.generarReporteConversionInvens("Todos",conversioninvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConversionInven(ArrayList<ConversionInven> conversioninvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ConversionInven conversioninvenAux:conversioninvensSeleccionados) {
				conversioninvenAux.setsDetalleGeneralEntityReporte(conversioninvenAux.toString());
			
				if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					conversioninvenAux.setsDescripcionGeneralEntityReporte1(conversioninvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_IDTIPOCONVERSIONINVEN)) {
					existe=true;
					conversioninvenAux.setsDescripcionGeneralEntityReporte1(conversioninvenAux.gettipoconversioninven_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_IDUNIDAD)) {
					existe=true;
					conversioninvenAux.setsDescripcionGeneralEntityReporte1(conversioninvenAux.getunidad_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_IDUNIDADCONVERSION)) {
					existe=true;
					conversioninvenAux.setsDescripcionGeneralEntityReporte1(conversioninvenAux.getunidadconversion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConversionInvenConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					conversioninvenAux.setsDescripcionGeneralEntityReporte1(conversioninvenAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConversionInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConversionInven=true;
				this.isVisibilidadCeldaNuevoRelacionesConversionInven=true;
				this.isVisibilidadCeldaGuardarCambiosConversionInven=true;
			}
			
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=true;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=true;
			this.isVisibilidadCeldaEliminarConversionInven=true;
			this.isVisibilidadCeldaCancelarConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=true;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=true;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=true;
			this.isVisibilidadCeldaModificarConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
			this.isVisibilidadCeldaModificarConversionInven=true;
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
			this.isVisibilidadCeldaCancelarConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarConversionInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConversionInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=true;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=true;
		} else {
			this.actualizarEstadoPanelsConversionInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConversionInven=false;
			//this.isVisibilidadCeldaVerFormConversionInven=false;
			this.isVisibilidadCeldaDuplicarConversionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conversioninvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
		} else {
			this.isVisibilidadCeldaNuevoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosConversionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!conversioninvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;												
			}
			
			this.jButtonCerrarConversionInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConversionInven=false;
		}
		
		if(!this.permiteMantenimiento(this.conversioninven)) {
			this.isVisibilidadCeldaActualizarConversionInven=false;
			this.isVisibilidadCeldaEliminarConversionInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConversionInven() {
	}
	
	public void actualizarEstadoPanelsConversionInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConversionInven!=null) {
				this.jScrollPanelDatosEdicionConversionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConversionInven!=null) {
				this.jScrollPanelDatosConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionConversionInven!=null) {
				this.jPanelPaginacionConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConversionInven!=null) {
					this.jTabbedPaneBusquedasConversionInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conversioninvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConversionInven!=null) {
				this.jTabbedPaneBusquedasConversionInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConversionInven!=null) {
				this.jPanelParametrosReportesConversionInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoConversionInven=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoConversionInven) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdTipoConversionInvenConversionInven);}

			this.isVisibilidadFK_IdUnidad=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionInven);}

			this.isVisibilidadFK_IdUnidadConversion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdUnidadConversion) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionConversionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoConversionInven(Boolean isParaTipoConversionInven){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoConversionInvenNegation=!isParaTipoConversionInven;

			this.isVisibilidadFK_IdTipoConversionInven=isParaTipoConversionInven;
			if(!this.isVisibilidadFK_IdTipoConversionInven) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdTipoConversionInvenConversionInven);}

			this.isVisibilidadFK_IdUnidad=isParaTipoConversionInvenNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionInven);}

			this.isVisibilidadFK_IdUnidadConversion=isParaTipoConversionInvenNegation;
			if(!this.isVisibilidadFK_IdUnidadConversion) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionConversionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidad(Boolean isParaUnidad){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadNegation=!isParaUnidad;

			this.isVisibilidadFK_IdTipoConversionInven=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdTipoConversionInven) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdTipoConversionInvenConversionInven);}

			this.isVisibilidadFK_IdUnidad=isParaUnidad;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionInven);}

			this.isVisibilidadFK_IdUnidadConversion=isParaUnidadNegation;
			if(!this.isVisibilidadFK_IdUnidadConversion) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionConversionInven);}
		}
		
	}

	public void setVisibilidadBusquedasParaUnidadConversion(Boolean isParaUnidadConversion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaUnidadConversionNegation=!isParaUnidadConversion;

			this.isVisibilidadFK_IdTipoConversionInven=isParaUnidadConversionNegation;
			if(!this.isVisibilidadFK_IdTipoConversionInven) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdTipoConversionInvenConversionInven);}

			this.isVisibilidadFK_IdUnidad=isParaUnidadConversionNegation;
			if(!this.isVisibilidadFK_IdUnidad) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionInven);}

			this.isVisibilidadFK_IdUnidadConversion=isParaUnidadConversion;
			if(!this.isVisibilidadFK_IdUnidadConversion) {this.jTabbedPaneBusquedasConversionInven.remove(jPanelFK_IdUnidadConversionConversionInven);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConversionInvenSessionBean conversioninvenSessionBean=new ConversionInvenSessionBean();
		
		if(this.conversioninvenSessionBean==null) {
			this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		}
		
		this.conversioninvenSessionBean.setsUltimaBusquedaConversionInven(this.getsAccionBusqueda());
		this.conversioninvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.conversioninvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			conversioninvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoConversionInven")) {
			conversioninvenSessionBean.setid_tipo_conversion_inven(this.getid_tipo_conversion_invenFK_IdTipoConversionInven());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
			conversioninvenSessionBean.setid_unidad(this.getid_unidadFK_IdUnidad());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdUnidadConversion")) {
			conversioninvenSessionBean.setid_unidad_conversion(this.getid_unidad_conversionFK_IdUnidadConversion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConversionInvenSessionBean conversioninvenSessionBean=new ConversionInvenSessionBean();
		
		if(this.conversioninvenSessionBean==null) {
			this.conversioninvenSessionBean=new ConversionInvenSessionBean();
		}
		
		if(this.conversioninvenSessionBean.getsUltimaBusquedaConversionInven()!=null&&!this.conversioninvenSessionBean.getsUltimaBusquedaConversionInven().equals("")) {
			this.setsAccionBusqueda(conversioninvenSessionBean.getsUltimaBusquedaConversionInven());
			this.setiNumeroPaginacion(conversioninvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(conversioninvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(conversioninvenSessionBean.getid_empresa());
				conversioninvenSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoConversionInven")) {
				this.setid_tipo_conversion_invenFK_IdTipoConversionInven(conversioninvenSessionBean.getid_tipo_conversion_inven());
				conversioninvenSessionBean.setid_tipo_conversion_inven(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidad")) {
				this.setid_unidadFK_IdUnidad(conversioninvenSessionBean.getid_unidad());
				conversioninvenSessionBean.setid_unidad(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdUnidadConversion")) {
				this.setid_unidad_conversionFK_IdUnidadConversion(conversioninvenSessionBean.getid_unidad_conversion());
				conversioninvenSessionBean.setid_unidad_conversion(-1L);
			}
		}
		
		this.conversioninvenSessionBean.setsUltimaBusquedaConversionInven("");
		this.conversioninvenSessionBean.setiNumeroPaginacion(ConversionInvenConstantesFunciones.INUMEROPAGINACION);
		this.conversioninvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConversionInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConversionInven() {
		this.updateBorderResaltarBusquedasFormularioConversionInven();
		this.updateVisibilidadBusquedasFormularioConversionInven();
		this.updateHabilitarBusquedasFormularioConversionInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioConversionInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConversionInven.getComponents().length>0) {
	

		if(this.conversioninvenConstantesFunciones.resaltarFK_IdTipoConversionInvenConversionInven!=null) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdTipoConversionInvenConversionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdTipoConversionInvenConversionInven);
			}
		}

		if(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionInven!=null) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionInven);
			}
		}

		if(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionConversionInven!=null) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionConversionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionConversionInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConversionInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConversionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdTipoConversionInvenConversionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conversioninvenConstantesFunciones.mostrarFK_IdTipoConversionInvenConversionInven);
			if(!this.conversioninvenConstantesFunciones.mostrarFK_IdTipoConversionInvenConversionInven && index>-1) {
				this.jTabbedPaneBusquedasConversionInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conversioninvenConstantesFunciones.mostrarFK_IdUnidadConversionInven);
			if(!this.conversioninvenConstantesFunciones.mostrarFK_IdUnidadConversionInven && index>-1) {
				this.jTabbedPaneBusquedasConversionInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionConversionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conversioninvenConstantesFunciones.mostrarFK_IdUnidadConversionConversionInven);
			if(!this.conversioninvenConstantesFunciones.mostrarFK_IdUnidadConversionConversionInven && index>-1) {
				this.jTabbedPaneBusquedasConversionInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConversionInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConversionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdTipoConversionInvenConversionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conversioninvenConstantesFunciones.activarFK_IdTipoConversionInvenConversionInven);
				this.jTabbedPaneBusquedasConversionInven.setEnabledAt(index,this.conversioninvenConstantesFunciones.activarFK_IdTipoConversionInvenConversionInven);
			}

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conversioninvenConstantesFunciones.activarFK_IdUnidadConversionInven);
				this.jTabbedPaneBusquedasConversionInven.setEnabledAt(index,this.conversioninvenConstantesFunciones.activarFK_IdUnidadConversionInven);
			}

			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionConversionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conversioninvenConstantesFunciones.activarFK_IdUnidadConversionConversionInven);
				this.jTabbedPaneBusquedasConversionInven.setEnabledAt(index,this.conversioninvenConstantesFunciones.activarFK_IdUnidadConversionConversionInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConversionInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoConversionInven")) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdTipoConversionInvenConversionInven);

			this.jTabbedPaneBusquedasConversionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);

			this.conversioninvenConstantesFunciones.setResaltarFK_IdTipoConversionInvenConversionInven(resaltar);

			jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdTipoConversionInvenConversionInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidad")) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionInven);

			this.jTabbedPaneBusquedasConversionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);

			this.conversioninvenConstantesFunciones.setResaltarFK_IdUnidadConversionInven(resaltar);

			jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdUnidadConversion")) {
			index= this.jTabbedPaneBusquedasConversionInven.indexOfComponent(this.jPanelFK_IdUnidadConversionConversionInven);

			this.jTabbedPaneBusquedasConversionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConversionInven.getComponent(index);

			this.conversioninvenConstantesFunciones.setResaltarFK_IdUnidadConversionConversionInven(resaltar);

			jPanel.setBorder(this.conversioninvenConstantesFunciones.resaltarFK_IdUnidadConversionConversionInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConversionInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConversionInven() throws Exception {

		if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConversionInven();
		this.updateVisibilidadResaltarControlesFormularioConversionInven();
		this.updateHabilitarResaltarControlesFormularioConversionInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioConversionInven() throws Exception {
		if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conversioninvenConstantesFunciones.resaltaridConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltaridConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltarid_empresaConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltarid_empresaConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltarid_tipo_conversion_invenConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltarid_tipo_conversion_invenConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltarid_unidadConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltarid_unidadConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltarid_unidad_conversionConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltarid_unidad_conversionConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltarvalorConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltarvalorConversionInven);}
		if(this.conversioninvenConstantesFunciones.resaltardescripcionConversionInven!=null && this.jInternalFrameDetalleFormConversionInven!=null) {this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setBorder(this.conversioninvenConstantesFunciones.resaltardescripcionConversionInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConversionInven() throws Exception {		
		if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
	
		//this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostraridConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelidConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostraridConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_empresaConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelid_empresaConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_empresaConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_tipo_conversion_invenConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelid_tipo_conversion_invenConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_tipo_conversion_invenConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_unidadConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelid_unidadConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_unidadConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_unidad_conversionConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelid_unidad_conversionConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarid_unidad_conversionConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarvalorConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPanelvalorConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrarvalorConversionInven);
		//this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrardescripcionConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jPaneldescripcionConversionInven.setVisible(this.conversioninvenConstantesFunciones.mostrardescripcionConversionInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConversionInven() throws Exception {
		if(this.jInternalFrameDetalleFormConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConversionInven!=null) {
	
		this.jInternalFrameDetalleFormConversionInven.jLabelidConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activaridConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_empresaConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activarid_empresaConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_tipo_conversion_invenConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activarid_tipo_conversion_invenConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidadConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activarid_unidadConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jComboBoxid_unidad_conversionConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activarid_unidad_conversionConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jTextFieldvalorConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activarvalorConversionInven);
		this.jInternalFrameDetalleFormConversionInven.jTextFielddescripcionConversionInven.setEnabled(this.conversioninvenConstantesFunciones.activardescripcionConversionInven);
		}
	}
	
		
}