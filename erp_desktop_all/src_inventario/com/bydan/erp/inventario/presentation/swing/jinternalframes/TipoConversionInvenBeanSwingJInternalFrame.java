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

import com.bydan.erp.inventario.util.TipoConversionInvenConstantesFunciones;
import com.bydan.erp.inventario.util.TipoConversionInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoConversionInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoConversionInvenBean;
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
public class TipoConversionInvenBeanSwingJInternalFrame extends TipoConversionInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoConversionInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoConversionInven> tipoconversioninvenValidator = new ClassValidator<TipoConversionInven>(TipoConversionInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoConversionInven tipoconversioninven;	
	public TipoConversionInven tipoconversioninvenAux;
	public TipoConversionInven tipoconversioninvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoConversionInven tipoconversioninvenTotales;
	public Long idTipoConversionInvenActual;
	public Long iIdNuevoTipoConversionInven=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosConversionInven=false;

	public Boolean getIsTienePermisosConversionInven() {
		return isTienePermisosConversionInven;
	}

	public void setIsTienePermisosConversionInven(Boolean isTienePermisosConversionInven) {
		this.isTienePermisosConversionInven= isTienePermisosConversionInven;
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
	
	public Boolean isPermisoTodoTipoConversionInven;
	public Boolean isPermisoNuevoTipoConversionInven;
	public Boolean isPermisoActualizarTipoConversionInven;
	public Boolean isPermisoActualizarOriginalTipoConversionInven;
	public Boolean isPermisoEliminarTipoConversionInven;
	public Boolean isPermisoGuardarCambiosTipoConversionInven;
	public Boolean isPermisoConsultaTipoConversionInven;
	public Boolean isPermisoBusquedaTipoConversionInven;
	public Boolean isPermisoReporteTipoConversionInven;
	public Boolean isPermisoPaginacionMedioTipoConversionInven;
	public Boolean isPermisoPaginacionAltoTipoConversionInven;
	public Boolean isPermisoPaginacionTodoTipoConversionInven;
	public Boolean isPermisoCopiarTipoConversionInven;
	public Boolean isPermisoVerFormTipoConversionInven;
	public Boolean isPermisoDuplicarTipoConversionInven;
	public Boolean isPermisoOrdenTipoConversionInven;
	
	
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
	
	public TipoConversionInvenParameterReturnGeneral tipoconversioninvenReturnGeneral;
	public TipoConversionInvenParameterReturnGeneral tipoconversioninvenParameterGeneral;
	
	

	public ConversionInvenLogic conversioninvenLogic=null;

	public ConversionInvenLogic getConversionInvenLogic() {
		return conversioninvenLogic;
	}

	public void setConversionInvenLogic(ConversionInvenLogic conversioninvenLogic) {
		this.conversioninvenLogic = conversioninvenLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoConversionInven=false;
	public Boolean esParaAccionDesdeFormularioTipoConversionInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoConversionInvenSessionBeanAdditional tipoconversioninvenSessionBeanAdditional=null;
	
	public TipoConversionInvenSessionBeanAdditional getTipoConversionInvenSessionBeanAdditional() {
		return this.tipoconversioninvenSessionBeanAdditional;
	}
	
	public void setTipoConversionInvenSessionBeanAdditional(TipoConversionInvenSessionBeanAdditional tipoconversioninvenSessionBeanAdditional) {
		try {
			this.tipoconversioninvenSessionBeanAdditional=tipoconversioninvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoConversionInvenBeanSwingJInternalFrameAdditional tipoconversioninvenBeanSwingJInternalFrameAdditional=null;
	//public class TipoConversionInvenBeanSwingJInternalFrame
	
	public TipoConversionInvenBeanSwingJInternalFrameAdditional getTipoConversionInvenBeanSwingJInternalFrameAdditional() {
		return this.tipoconversioninvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoConversionInvenBeanSwingJInternalFrameAdditional(TipoConversionInvenBeanSwingJInternalFrameAdditional tipoconversioninvenBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoconversioninvenBeanSwingJInternalFrameAdditional=tipoconversioninvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoConversionInvenLogic tipoconversioninvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoConversionInven tipoconversioninvenBean;
	public TipoConversionInvenConstantesFunciones tipoconversioninvenConstantesFunciones;
	//public TipoConversionInvenParameterReturnGeneral tipoconversioninvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoConversionInven> tipoconversioninvens;	
	//public List<TipoConversionInven> tipoconversioninvensEliminados;
	//public List<TipoConversionInven> tipoconversioninvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoConversionInven=false;
	public Boolean isVisibilidadCeldaDuplicarTipoConversionInven=true;
	public Boolean isVisibilidadCeldaCopiarTipoConversionInven=true;
	public Boolean isVisibilidadCeldaVerFormTipoConversionInven=true;
	public Boolean isVisibilidadCeldaOrdenTipoConversionInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
	public Boolean isVisibilidadCeldaModificarTipoConversionInven=false;
	public Boolean isVisibilidadCeldaActualizarTipoConversionInven=false;
	public Boolean isVisibilidadCeldaEliminarTipoConversionInven=false;
	public Boolean isVisibilidadCeldaCancelarTipoConversionInven=false;
	public Boolean isVisibilidadCeldaGuardarTipoConversionInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoConversionInven() {
		return this.iIdNuevoTipoConversionInven;
	}

	public void setiIdNuevoTipoConversionInven(Long iIdNuevoTipoConversionInven) {
		this.iIdNuevoTipoConversionInven = iIdNuevoTipoConversionInven;
	}
	
	public Long getidTipoConversionInvenActual() {
		return this.idTipoConversionInvenActual;
	}

	public void setidTipoConversionInvenActual(Long idTipoConversionInvenActual) {
		this.idTipoConversionInvenActual = idTipoConversionInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoConversionInven gettipoconversioninven() {
		return this.tipoconversioninven;
	}

	public void settipoconversioninven(TipoConversionInven tipoconversioninven) {
		this.tipoconversioninven = tipoconversioninven;
	}
	
	public TipoConversionInven gettipoconversioninvenAux() {
		return this.tipoconversioninvenAux;
	}

	public void settipoconversioninvenAux(TipoConversionInven tipoconversioninvenAux) {
		this.tipoconversioninvenAux = tipoconversioninvenAux;
	}				
	
	public TipoConversionInven gettipoconversioninvenAnterior() {
		return this.tipoconversioninvenAnterior;
	}

	public void settipoconversioninvenAnterior(TipoConversionInven tipoconversioninvenAnterior) {
		this.tipoconversioninvenAnterior = tipoconversioninvenAnterior;
	}	
	
	public TipoConversionInven gettipoconversioninvenTotales() {
		return this.tipoconversioninvenTotales;
	}

	public void settipoconversioninvenTotales(TipoConversionInven tipoconversioninvenTotales) {
		this.tipoconversioninvenTotales = tipoconversioninvenTotales;
	}	
	
	public TipoConversionInven gettipoconversioninvenBean() {
		return this.tipoconversioninvenBean;
	}

	public void settipoconversioninvenBean(TipoConversionInven tipoconversioninvenBean) {
		this.tipoconversioninvenBean = tipoconversioninvenBean;
	}	
	
	public TipoConversionInvenParameterReturnGeneral gettipoconversioninvenReturnGeneral() {
		return this.tipoconversioninvenReturnGeneral;
	}

	public void settipoconversioninvenReturnGeneral(TipoConversionInvenParameterReturnGeneral tipoconversioninvenReturnGeneral) {
		this.tipoconversioninvenReturnGeneral = tipoconversioninvenReturnGeneral;
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

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoConversionInvenLogic getTipoConversionInvenLogic()	{		
		return tipoconversioninvenLogic;
	}

	public void setTipoConversionInvenLogic(TipoConversionInvenLogic tipoconversioninvenLogic) {
		this.tipoconversioninvenLogic = tipoconversioninvenLogic;
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
	
	public Boolean getIsEsNuevoTipoConversionInven() {
		return isEsNuevoTipoConversionInven;
	}

	public void setIsEsNuevoTipoConversionInven(Boolean isEsNuevoTipoConversionInven) {
		this.isEsNuevoTipoConversionInven = isEsNuevoTipoConversionInven;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoConversionInven() {
		return esParaAccionDesdeFormularioTipoConversionInven;
	}
	
	public void setEsParaAccionDesdeFormularioTipoConversionInven(Boolean esParaAccionDesdeFormularioTipoConversionInven) {
		this.esParaAccionDesdeFormularioTipoConversionInven = esParaAccionDesdeFormularioTipoConversionInven;
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

			if(this.tipoconversioninvenSessionBean==null) {
				this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
			}

			if(!this.tipoconversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoconversioninvenSessionBean.getlidEmpresaActual());
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

					if(this.tipoconversioninven!=null) {
						this.tipoconversioninven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
						this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoConversionInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
						if(this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoConversionInvenGenerico)throws Exception
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
				jComboBoxid_empresaTipoConversionInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoConversionInvenGenerico!=null && jComboBoxid_empresaTipoConversionInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoConversionInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoConversionInven tipoconversioninven,JComboBox jComboBoxid_empresaTipoConversionInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoConversionInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoConversionInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoconversioninven.setid_empresa(empresaAux.getId());
				tipoconversioninven.setempresa_descripcion(TipoConversionInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoconversioninven.setEmpresa(empresaAux);			}
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

					if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { 
							this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { 
					}

					if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
							this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
							this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoConversionInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoConversionInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoConversionInven(this.tipoconversioninvenLogic.getTipoConversionInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoConversionInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoConversionInven(this.tipoconversioninvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoconversioninvenLogic.setTipoConversionInvens(this.tipoconversioninvens);
			tipoconversioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoConversionInvenParameterReturnGeneral getTipoConversionInvenParameterGeneral() {
		return this.tipoconversioninvenParameterGeneral;
	}
	
	public void setTipoConversionInvenParameterGeneral(TipoConversionInvenParameterReturnGeneral tipoconversioninvenParameterGeneral) {
		this.tipoconversioninvenParameterGeneral = tipoconversioninvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoConversionInven() {
		return isPermisoTodoTipoConversionInven;
	}

	public void setIsPermisoTodoTipoConversionInven(Boolean isPermisoTodoTipoConversionInven) {
		this.isPermisoTodoTipoConversionInven = isPermisoTodoTipoConversionInven;
	}

	public Boolean getIsPermisoNuevoTipoConversionInven() {
		return isPermisoNuevoTipoConversionInven;
	}

	public void setIsPermisoNuevoTipoConversionInven(Boolean isPermisoNuevoTipoConversionInven) {
		this.isPermisoNuevoTipoConversionInven = isPermisoNuevoTipoConversionInven;
	}

	public Boolean getIsPermisoActualizarTipoConversionInven() {
		return isPermisoActualizarTipoConversionInven;
	}

	public void setIsPermisoActualizarTipoConversionInven(Boolean isPermisoActualizarTipoConversionInven) {
		this.isPermisoActualizarTipoConversionInven = isPermisoActualizarTipoConversionInven;
	}

	public Boolean getIsPermisoEliminarTipoConversionInven() {
		return isPermisoEliminarTipoConversionInven;
	}

	public void setIsPermisoEliminarTipoConversionInven(Boolean isPermisoEliminarTipoConversionInven) {
		this.isPermisoEliminarTipoConversionInven = isPermisoEliminarTipoConversionInven;
	}

	public Boolean getIsPermisoGuardarCambiosTipoConversionInven() {
		return isPermisoGuardarCambiosTipoConversionInven;
	}

	public void setIsPermisoGuardarCambiosTipoConversionInven(Boolean isPermisoGuardarCambiosTipoConversionInven) {
		this.isPermisoGuardarCambiosTipoConversionInven = isPermisoGuardarCambiosTipoConversionInven;
	}
	
	public Boolean getIsPermisoConsultaTipoConversionInven() {
		return isPermisoConsultaTipoConversionInven;
	}

	public void setIsPermisoConsultaTipoConversionInven(Boolean isPermisoConsultaTipoConversionInven) {
		this.isPermisoConsultaTipoConversionInven = isPermisoConsultaTipoConversionInven;
	}

	public Boolean getIsPermisoBusquedaTipoConversionInven() {
		return isPermisoBusquedaTipoConversionInven;
	}

	public void setIsPermisoBusquedaTipoConversionInven(Boolean isPermisoBusquedaTipoConversionInven) {
		this.isPermisoBusquedaTipoConversionInven = isPermisoBusquedaTipoConversionInven;
	}

	public Boolean getIsPermisoReporteTipoConversionInven() {
		return isPermisoReporteTipoConversionInven;
	}

	public void setIsPermisoReporteTipoConversionInven(Boolean isPermisoReporteTipoConversionInven) {
		this.isPermisoReporteTipoConversionInven = isPermisoReporteTipoConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoConversionInven() {
		return isPermisoPaginacionMedioTipoConversionInven;
	}

	public void setIsPermisoPaginacionMedioTipoConversionInven(Boolean isPermisoPaginacionMedioTipoConversionInven) {
		this.isPermisoPaginacionMedioTipoConversionInven = isPermisoPaginacionMedioTipoConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoConversionInven() {
		return isPermisoPaginacionTodoTipoConversionInven;
	}

	public void setIsPermisoPaginacionTodoTipoConversionInven(Boolean isPermisoPaginacionTodoTipoConversionInven) {
		this.isPermisoPaginacionTodoTipoConversionInven = isPermisoPaginacionTodoTipoConversionInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoConversionInven() {
		return isPermisoPaginacionAltoTipoConversionInven;
	}

	public void setIsPermisoPaginacionAltoTipoConversionInven(Boolean isPermisoPaginacionAltoTipoConversionInven) {
		this.isPermisoPaginacionAltoTipoConversionInven = isPermisoPaginacionAltoTipoConversionInven;
	}
	
	public Boolean getIsPermisoCopiarTipoConversionInven() {
		return isPermisoCopiarTipoConversionInven;
	}

	public void setIsPermisoCopiarTipoConversionInven(Boolean isPermisoCopiarTipoConversionInven) {
		this.isPermisoCopiarTipoConversionInven = isPermisoCopiarTipoConversionInven;
	}
	
	public Boolean getIsPermisoVerFormTipoConversionInven() {
		return isPermisoVerFormTipoConversionInven;
	}

	public void setIsPermisoVerFormTipoConversionInven(Boolean isPermisoVerFormTipoConversionInven) {
		this.isPermisoVerFormTipoConversionInven = isPermisoVerFormTipoConversionInven;
	}
	
	public Boolean getIsPermisoDuplicarTipoConversionInven() {
		return isPermisoDuplicarTipoConversionInven;
	}

	public void setIsPermisoDuplicarTipoConversionInven(Boolean isPermisoDuplicarTipoConversionInven) {
		this.isPermisoDuplicarTipoConversionInven = isPermisoDuplicarTipoConversionInven;
	}
	
	public Boolean getIsPermisoOrdenTipoConversionInven() {
		return isPermisoOrdenTipoConversionInven;
	}

	public void setIsPermisoOrdenTipoConversionInven(Boolean isPermisoOrdenTipoConversionInven) {
		this.isPermisoOrdenTipoConversionInven = isPermisoOrdenTipoConversionInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoConversionInven() {
		return isVisibilidadCeldaNuevoTipoConversionInven;
	}

	public void setIsVisibilidadCeldaNuevoTipoConversionInven(Boolean isVisibilidadCeldaNuevoTipoConversionInven) {
		this.isVisibilidadCeldaNuevoTipoConversionInven = isVisibilidadCeldaNuevoTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoConversionInven() {
		return isVisibilidadCeldaDuplicarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaDuplicarTipoConversionInven(Boolean isVisibilidadCeldaDuplicarTipoConversionInven) {
		this.isVisibilidadCeldaDuplicarTipoConversionInven = isVisibilidadCeldaDuplicarTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoConversionInven() {
		return isVisibilidadCeldaCopiarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaCopiarTipoConversionInven(Boolean isVisibilidadCeldaCopiarTipoConversionInven) {
		this.isVisibilidadCeldaCopiarTipoConversionInven = isVisibilidadCeldaCopiarTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoConversionInven() {
		return isVisibilidadCeldaVerFormTipoConversionInven;
	}

	public void setIsVisibilidadCeldaVerFormTipoConversionInven(Boolean isVisibilidadCeldaVerFormTipoConversionInven) {
		this.isVisibilidadCeldaVerFormTipoConversionInven = isVisibilidadCeldaVerFormTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoConversionInven() {
		return isVisibilidadCeldaOrdenTipoConversionInven;
	}

	public void setIsVisibilidadCeldaOrdenTipoConversionInven(Boolean isVisibilidadCeldaOrdenTipoConversionInven) {
		this.isVisibilidadCeldaOrdenTipoConversionInven = isVisibilidadCeldaOrdenTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoConversionInven() {
		return isVisibilidadCeldaNuevoRelacionesTipoConversionInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoConversionInven(Boolean isVisibilidadCeldaNuevoRelacionesTipoConversionInven) {
		this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven = isVisibilidadCeldaNuevoRelacionesTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoConversionInven() {
		return isVisibilidadCeldaModificarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaModificarTipoConversionInven(Boolean isVisibilidadCeldaModificarTipoConversionInven) {
		this.isVisibilidadCeldaModificarTipoConversionInven = isVisibilidadCeldaModificarTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoConversionInven() {
		return isVisibilidadCeldaActualizarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaActualizarTipoConversionInven(Boolean isVisibilidadCeldaActualizarTipoConversionInven) {
		this.isVisibilidadCeldaActualizarTipoConversionInven = isVisibilidadCeldaActualizarTipoConversionInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoConversionInven() {
		return isVisibilidadCeldaEliminarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaEliminarTipoConversionInven(Boolean isVisibilidadCeldaEliminarTipoConversionInven) {
		this.isVisibilidadCeldaEliminarTipoConversionInven = isVisibilidadCeldaEliminarTipoConversionInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoConversionInven() {
		return isVisibilidadCeldaCancelarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaCancelarTipoConversionInven(Boolean isVisibilidadCeldaCancelarTipoConversionInven) {
		this.isVisibilidadCeldaCancelarTipoConversionInven = isVisibilidadCeldaCancelarTipoConversionInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoConversionInven() {
		return isVisibilidadCeldaGuardarTipoConversionInven;
	}

	public void setIsVisibilidadCeldaGuardarTipoConversionInven(Boolean isVisibilidadCeldaGuardarTipoConversionInven) {
		this.isVisibilidadCeldaGuardarTipoConversionInven = isVisibilidadCeldaGuardarTipoConversionInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoConversionInven() {
		return isVisibilidadCeldaGuardarCambiosTipoConversionInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoConversionInven(Boolean isVisibilidadCeldaGuardarCambiosTipoConversionInven) {
		this.isVisibilidadCeldaGuardarCambiosTipoConversionInven = isVisibilidadCeldaGuardarCambiosTipoConversionInven;
	}
		
	public TipoConversionInvenSessionBean gettipoconversioninvenSessionBean() {
		return this.tipoconversioninvenSessionBean;
	}
	
	public void settipoconversioninvenSessionBean(TipoConversionInvenSessionBean tipoconversioninvenSessionBean) {
		this.tipoconversioninvenSessionBean=tipoconversioninvenSessionBean;
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

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(TipoConversionInven tipoconversioninven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoconversioninven,null);
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
	
	public void bugActualizarReferenciaActual(TipoConversionInven tipoconversioninven,TipoConversionInven tipoconversioninvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoConversionInven(tipoconversioninven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoconversioninvenAux.setId(tipoconversioninven.getId());
		tipoconversioninvenAux.setVersionRow(tipoconversioninven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoConversionInven();
		
			int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoconversioninvenValidator.getInvalidValues(this.tipoconversioninven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoconversioninvenLogic.setDatosCliente(datosCliente);
			tipoconversioninvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoconversioninvenAux=new  TipoConversionInven();
				
				tipoconversioninvenAux.setIsNew(true);
				tipoconversioninvenAux.setIsChanged(true);
				
				tipoconversioninvenAux.setTipoConversionInvenOriginal(this.tipoconversioninven);
				
				tipoconversioninvenAux.setId(this.tipoconversioninven.getId());	
				tipoconversioninvenAux.setVersionRow(this.tipoconversioninven.getVersionRow());	
				tipoconversioninvenAux.setid_empresa(this.tipoconversioninven.getid_empresa());	
				tipoconversioninvenAux.setcodigo(this.tipoconversioninven.getcodigo());	
				tipoconversioninvenAux.setnombre(this.tipoconversioninven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.saveTipoConversionInvens();//WithConnection
						//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoConversionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconversioninvenLogic.saveTipoConversionInvenRelaciones(tipoconversioninvenAux,this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());//WithConnection
								//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconversioninvenAux.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoconversioninvenAux=new  TipoConversionInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() && this.tipoconversioninven.getId()>=0)) {
						
					tipoconversioninvenAux.setIsNew(false);
				}
				
				tipoconversioninvenAux.setIsDeleted(false);
			
				tipoconversioninvenAux.setId(this.tipoconversioninven.getId());	
				tipoconversioninvenAux.setVersionRow(this.tipoconversioninven.getVersionRow());	
				tipoconversioninvenAux.setid_empresa(this.tipoconversioninven.getid_empresa());	
				tipoconversioninvenAux.setcodigo(this.tipoconversioninven.getcodigo());	
				tipoconversioninvenAux.setnombre(this.tipoconversioninven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.saveTipoConversionInvens();//WithConnection
						//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoConversionInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconversioninvenLogic.saveTipoConversionInvenRelaciones(tipoconversioninvenAux,this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());//WithConnection
								//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconversioninvenAux.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoconversioninven,tipoconversioninvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoconversioninvenAux=new  TipoConversionInven();
				
				tipoconversioninvenAux.setIsNew(false);
				tipoconversioninvenAux.setIsChanged(false);
				
				tipoconversioninvenAux.setIsDeleted(true);
				
				tipoconversioninvenAux.setId(this.tipoconversioninven.getId());	
				tipoconversioninvenAux.setVersionRow(this.tipoconversioninven.getVersionRow());	
				tipoconversioninvenAux.setid_empresa(this.tipoconversioninven.getid_empresa());	
				tipoconversioninvenAux.setcodigo(this.tipoconversioninven.getcodigo());	
				tipoconversioninvenAux.setnombre(this.tipoconversioninven.getnombre());	
				
				if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoconversioninvenAux.getId()>=0) {	
						this.tipoconversioninvensEliminados.add(tipoconversioninvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.saveTipoConversionInvens();//WithConnection
						//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens().addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens.addAll(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvensEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoconversioninvenLogic.saveTipoConversionInvenRelaciones(tipoconversioninvenAux,this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());//WithConnection
								//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(new ArrayList<ConversionInven>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens= new ArrayList<ConversionInven>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoconversioninvenAux.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoconversioninvenAux,tipoconversioninvenLogic.getTipoConversionInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoconversioninvenAux,tipoconversioninvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getTipoConversionInvens().addAll(this.tipoconversioninvensEliminados);
					
					tipoconversioninvenLogic.saveTipoConversionInvens();//WithConnection
					//tipoconversioninvenLogic.getSetVersionRowTipoConversionInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoConversionInven();
				
				this.tipoconversioninvensEliminados= new ArrayList<TipoConversionInven>();		
			}
			
			if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Conversion Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoconversioninven=tipoconversioninvenAux;
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
      		//this.finishProcessTipoConversionInven();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoConversionInven tipoconversioninvenLocal) throws Exception {
		
		if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoconversioninvenLocal.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
			
			} else {
			
				tipoconversioninvenLocal.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvens);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoConversionInven tipoconversioninvenLocal) throws Exception {	
		if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoconversioninvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoConversionInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoconversioninvenValidator.getInvalidValues(this.tipoconversioninven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoConversionInven tipoconversioninven,List<TipoConversionInven> tipoconversioninvens) throws Exception {
		try	{		
			TipoConversionInvenConstantesFunciones.actualizarLista(tipoconversioninven,tipoconversioninvens,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoConversionInven tipoconversioninven,List<TipoConversionInven> tipoconversioninvens) throws Exception {
		try	{			
			TipoConversionInvenConstantesFunciones.actualizarSelectedLista(tipoconversioninven,tipoconversioninvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoConversionInven> tipoconversioninvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoconversioninvensLocal=this.tipoconversioninvenLogic.getTipoConversionInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoconversioninvensLocal=this.tipoconversioninvens;
			}
			//ARCHITECTURE
		
			for(TipoConversionInven tipoconversioninvenLocal:tipoconversioninvensLocal) {
				if(this.permiteMantenimiento(tipoconversioninvenLocal) && tipoconversioninvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoConversionInvenConstantesFunciones.getTipoConversionInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoConversionInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelid_empresaTipoConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConversionInvenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelcodigoTipoConversionInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoConversionInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelnombreTipoConversionInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConversionInven.jLabelid_empresaTipoConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConversionInven.jLabelcodigoTipoConversionInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoConversionInven.jLabelnombreTipoConversionInven,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ConversionInven")) {
			if(this.tipoconversioninven==null) {
				this.tipoconversioninven= new TipoConversionInven();
			}

			if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoConversionInven
				this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);

				this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.getconversioninven().setTipoConversionInven(this.tipoconversioninven);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoConversionInven--;	
		
		
		this.tipoconversioninvenAux=new TipoConversionInven();
		
		this.tipoconversioninvenAux.setId(this.iIdNuevoTipoConversionInven);
		this.tipoconversioninvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoconversioninvenLogic.getTipoConversionInvens().add(this.tipoconversioninvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoconversioninvens.add(this.tipoconversioninvenAux);
		}
		//ARCHITECTURE
		
		this.tipoconversioninven=this.tipoconversioninvenAux;
		
		if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninven);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConversionInven(this.tipoconversioninven);
		}
				
		//this.setDefaultControlesTipoConversionInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoConversionInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoConversionInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConversionInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConversionInven(this.tipoconversioninvenBean,this.tipoconversioninven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoConversionInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
			classes=TipoConversionInvenConstantesFunciones.getClassesRelationshipsOfTipoConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.procesarEventosTipoConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconversioninvenLogic.getTipoConversionInvens(),this.tipoconversioninven,this.tipoconversioninvenParameterGeneral,this.isEsNuevoTipoConversionInven,classes);//this.tipoconversioninvenLogic.getTipoConversionInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoConversionInven(this.tipoconversioninvenReturnGeneral,this.tipoconversioninvenBean,false);
		
		if(this.tipoconversioninvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven());
		}
		
		if(this.tipoconversioninvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven(),classes);//this.tipoconversioninvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoConversionInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoConversionInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.RecargarFormTipoConversionInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoConversionInven(false);
						
			if(tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado() && ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConversionInvenActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConversionInven();
			}
			
			this.actualizarVisualTableDatosTipoConversionInven();
			
			this.jTableDatosTipoConversionInven.setRowSelectionInterval(this.getIndiceNuevoTipoConversionInven(), this.getIndiceNuevoTipoConversionInven());
			
			this.seleccionarFilaTablaTipoConversionInvenActual();
						
			this.actualizarEstadoCeldasBotonesTipoConversionInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoConversionInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setEnabled(isHabilitar && this.tipoconversioninvenConstantesFunciones.activarcodigoTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setEnabled(isHabilitar && this.tipoconversioninvenConstantesFunciones.activarnombreTipoConversionInven);	
		//
		this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setEnabled(isHabilitar && this.tipoconversioninvenConstantesFunciones.activarid_empresaTipoConversionInven);
	};
	
	public void setDefaultControlesTipoConversionInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoConversionInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoconversioninvenSessionBean.setConGuardarRelaciones(true);			
			this.tipoconversioninvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoconversioninvenSessionBean.setConGuardarRelaciones(false);			
			this.tipoconversioninvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoConversionInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
				if(tipoconversioninvenAux.getId().equals(this.iIdNuevoTipoConversionInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvens) {
				if(tipoconversioninvenAux.getId().equals(this.iIdNuevoTipoConversionInven)) {
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
	
	public int getIndiceActualTipoConversionInven(TipoConversionInven tipoconversioninven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
				if(tipoconversioninvenAux.getId().equals(tipoconversioninven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvens) {
				if(tipoconversioninvenAux.getId().equals(tipoconversioninven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoConversionInven(TipoConversionInven tipoconversioninvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
				if(tipoconversioninvenAux.getTipoConversionInvenOriginal().getId().equals(tipoconversioninvenOriginal.getId())) {
					existe=true;
					tipoconversioninvenOriginal.setId(tipoconversioninvenAux.getId());
					tipoconversioninvenOriginal.setVersionRow(tipoconversioninvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvens) {
				if(tipoconversioninvenAux.getTipoConversionInvenOriginal().getId().equals(tipoconversioninvenOriginal.getId())) {
					existe=true;
					tipoconversioninvenOriginal.setId(tipoconversioninvenAux.getId());
					tipoconversioninvenOriginal.setVersionRow(tipoconversioninvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoConversionInven(Boolean esParaCancelar) throws Exception {
		tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
		tipoconversioninvenAux=new TipoConversionInven();
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
					if(tipoconversioninvenAux.getId()<0) {
						tipoconversioninvensAux.add(tipoconversioninvenAux);
					}		
				}
				this.iIdNuevoTipoConversionInven=0L;
				this.tipoconversioninvenLogic.getTipoConversionInvens().removeAll(tipoconversioninvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvens) {
					if(tipoconversioninvenAux.getId()<0) {
						tipoconversioninvensAux.add(tipoconversioninvenAux);
					}		
				}
				this.iIdNuevoTipoConversionInven=0L;
				this.tipoconversioninvens.removeAll(tipoconversioninvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoConversionInven 
					&& this.tipoconversioninvenLogic.getTipoConversionInvens().size()>0
					) {
					tipoconversioninvenAux=this.tipoconversioninvenLogic.getTipoConversionInvens().get(this.tipoconversioninvenLogic.getTipoConversionInvens().size() - 1);
				
					if(tipoconversioninvenAux.getId()<0) {
						this.tipoconversioninvenLogic.getTipoConversionInvens().remove(tipoconversioninvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoConversionInven && this.tipoconversioninvens.size()>0) {
					tipoconversioninvenAux=this.tipoconversioninvens.get(this.tipoconversioninvens.size() - 1);
				
					if(tipoconversioninvenAux.getId()<0) {
						this.tipoconversioninvens.remove(tipoconversioninvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoConversionInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoconversioninven.getId()<0) {
				this.tipoconversioninvenLogic.getTipoConversionInvens().remove(this.tipoconversioninven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoconversioninven.getId()<0) {
				this.tipoconversioninvens.remove(this.tipoconversioninven);
			}
		}			
	}
	
	public void setEstadosInicialesTipoConversionInven(List<TipoConversionInven> tipoconversioninvensAux) throws Exception {
		TipoConversionInvenConstantesFunciones.setEstadosInicialesTipoConversionInven(tipoconversioninvensAux);
	}
	
	public void setEstadosInicialesTipoConversionInven(TipoConversionInven tipoconversioninvenAux) throws Exception {
		TipoConversionInvenConstantesFunciones.setEstadosInicialesTipoConversionInven(tipoconversioninvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoConversionInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoConversionInvenActual()) {
				if(!this.isEsNuevoTipoConversionInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoConversionInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoConversionInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Conversion Inven ?", "MANTENIMIENTO DE Tipo Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoConversionInven tipoconversioninven) throws Exception {
		TipoConversionInvenConstantesFunciones.seleccionarAsignar(this.tipoconversioninven,tipoconversioninven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoConversionInven=this.isPermisoActualizarOriginalTipoConversionInven;
			
			
			this.seleccionarAsignar(tipoconversioninven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoConversionInvenConstantesFunciones.quitarEspaciosTipoConversionInven(this.tipoconversioninven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoconversioninvenSessionBean.setsFuncionBusquedaRapida(this.tipoconversioninvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoConversionInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoConversionInven(esParaCancelar);				
				this.cancelarNuevoTipoConversionInven(esParaCancelar);								
			}
			
			this.tipoconversioninven=new TipoConversionInven();
			
			this.inicializarTipoConversionInven();
			
			this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoConversionInven() throws Exception {
		try {
			TipoConversionInvenConstantesFunciones.inicializarTipoConversionInven(this.tipoconversioninven);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoconversioninvenLogic.getTipoConversionInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoConversionInvens(String sAccionBusqueda,List<TipoConversionInven> tipoconversioninvensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoConversionInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoConversionInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoConversionInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoConversionInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Conversion Invenes");		
		parameters.put("busquedapor", TipoConversionInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ConversionInven.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoConversionInvenLogic tipoconversioninvenLogicAuxiliar=new TipoConversionInvenLogic();
					tipoconversioninvenLogicAuxiliar.setDatosCliente(tipoconversioninvenLogic.getDatosCliente());				
					tipoconversioninvenLogicAuxiliar.setTipoConversionInvens(tipoconversioninvensParaReportes);
					
					tipoconversioninvenLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoConversionInvenWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoconversioninvensParaReportes=tipoconversioninvenLogicAuxiliar.getTipoConversionInvens();
					
					//tipoconversioninvenLogic.getNewConnexionToDeep();
					
					//for (TipoConversionInven tipoconversioninven:tipoconversioninvensParaReportes) {
					//	tipoconversioninvenLogic.deepLoad(tipoconversioninven, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoconversioninvenLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoconversioninvenLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileConversionInven = AuxiliarReportes.class.getResourceAsStream("ConversionInvenDetalleRelacionesDesign.jasper");
			parameters.put("subreport_conversioninven", reportFileConversionInven);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoConversionInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoConversionInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoConversionInven=new JRBeanArrayDataSource(TipoConversionInvenJInternalFrame.TraerTipoConversionInvenBeans(tipoconversioninvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoConversionInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoConversionInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoConversionInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoConversionInvenBean.TraerTipoConversionInvenBeans(tipoconversioninvensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoConversionInvenActionPerformed(null);
					//this.generarExcelReporteTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoConversionInvens(sAccionBusqueda,sTipoArchivoReporte,tipoconversioninvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConversionInven> tipoconversioninvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConversionInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConversionInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoConversionInven tipoconversioninven : tipoconversioninvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoConversionInvenConstantesFunciones.generarExcelReporteDataTipoConversionInven("NORMAL",row,workbook,tipoconversioninven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoConversionInven(String sTipo,Row row,Workbook workbook) {
		
		TipoConversionInvenConstantesFunciones.generarExcelReporteHeaderTipoConversionInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConversionInven> tipoconversioninvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConversionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoConversionInven tipoconversioninven : tipoconversioninvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoConversionInvenConstantesFunciones.getTipoConversionInvenDescripcion(tipoconversioninven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconversioninven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConversionInvenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconversioninven.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoconversioninven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoConversionInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoConversionInven> tipoconversioninvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoConversionInven> tipoconversioninvensRespaldo=null;
		
		classes=TipoConversionInvenConstantesFunciones.getClassesRelationshipsOfTipoConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoconversioninvenLogic.setDatosCliente(this.datosCliente);
		this.tipoconversioninvenLogic.setDatosDeep(this.datosDeep);
		this.tipoconversioninvenLogic.setIsConDeep(true);
		
		tipoconversioninvensRespaldo=this.tipoconversioninvenLogic.getTipoConversionInvens();
		
		this.tipoconversioninvenLogic.setTipoConversionInvens(tipoconversioninvensParaReportes);	
		this.tipoconversioninvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoconversioninvensParaReportes=this.tipoconversioninvenLogic.getTipoConversionInvens();
		this.tipoconversioninvenLogic.setTipoConversionInvens(tipoconversioninvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoConversionInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoConversionInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoConversionInven tipoconversioninven : tipoconversioninvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoConversionInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoConversionInvenConstantesFunciones.generarExcelReporteDataTipoConversionInven("NORMAL",row,workbook,tipoconversioninven,cellStyleDataAux);
		
			
			


				//ConversionInven
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ConversionInvenConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoconversioninven.getConversionInvens()!=null && tipoconversioninven.getConversionInvens().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ConversionInvenConstantesFunciones.generarExcelReporteHeaderConversionInven("RELACIONADO",row,workbook);
				}

				if(tipoconversioninven.getConversionInvens()!=null) {
					i2=0;
					for(ConversionInven conversioninven : tipoconversioninven.getConversionInvens()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ConversionInvenConstantesFunciones.generarExcelReporteDataConversionInven("RELACIONADO",row,workbook,conversioninven,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoConversionInvenConstantesFunciones.getTipoConversionInvenDescripcion(tipoconversioninven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConversionInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoConversionInven() throws Exception {		
		this.startProcessTipoConversionInven(true);
	}
	
	public void startProcessTipoConversionInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoConversionInven ,this.jPanelParametrosReportesTipoConversionInven, this.jScrollPanelDatosTipoConversionInven,this.jPanelPaginacionTipoConversionInven, this.jScrollPanelDatosEdicionTipoConversionInven, this.jPanelAccionesTipoConversionInven,this.jPanelAccionesFormularioTipoConversionInven,this.jmenuBarTipoConversionInven,this.jmenuBarDetalleTipoConversionInven,this.jTtoolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConversionInven=this.jTabbedPaneBusquedasTipoConversionInven; 
		
		final JPanel jPanelParametrosReportesTipoConversionInven=this.jPanelParametrosReportesTipoConversionInven;
		//final JScrollPane jScrollPanelDatosTipoConversionInven=this.jScrollPanelDatosTipoConversionInven;
		final JTable jTableDatosTipoConversionInven=this.jTableDatosTipoConversionInven;		
		final JPanel jPanelPaginacionTipoConversionInven=this.jPanelPaginacionTipoConversionInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoConversionInven=this.jScrollPanelDatosEdicionTipoConversionInven;
		final JPanel jPanelAccionesTipoConversionInven=this.jPanelAccionesTipoConversionInven;
		
		JPanel jPanelCamposAuxiliarTipoConversionInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoConversionInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			jPanelCamposAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jPanelCamposTipoConversionInven;
			jPanelAccionesFormularioAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jPanelAccionesFormularioTipoConversionInven;
		}
		
		final JPanel jPanelCamposTipoConversionInven=jPanelCamposAuxiliarTipoConversionInven;
		final JPanel jPanelAccionesFormularioTipoConversionInven=jPanelAccionesFormularioAuxiliarTipoConversionInven;
		
		
		final JMenuBar jmenuBarTipoConversionInven=this.jmenuBarTipoConversionInven;
		final JToolBar jTtoolBarTipoConversionInven=this.jTtoolBarTipoConversionInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoConversionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConversionInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			jmenuBarDetalleAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jmenuBarDetalleTipoConversionInven;
			jTtoolBarDetalleAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jTtoolBarDetalleTipoConversionInven;
		}
		
		final JMenuBar jmenuBarDetalleTipoConversionInven=jmenuBarDetalleAuxiliarTipoConversionInven;
		final JToolBar jTtoolBarDetalleTipoConversionInven=jTtoolBarDetalleAuxiliarTipoConversionInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConversionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConversionInven;
			processRunnable.jTableDatos=jTableDatosTipoConversionInven;
			processRunnable.jPanelCampos=jPanelCamposTipoConversionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConversionInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConversionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConversionInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConversionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConversionInven;
			processRunnable.jTtoolBar=jTtoolBarTipoConversionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConversionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConversionInven ,jPanelParametrosReportesTipoConversionInven,jTableDatosTipoConversionInven, /*jScrollPanelDatosTipoConversionInven,*/jPanelCamposTipoConversionInven,jPanelPaginacionTipoConversionInven, /*jScrollPanelDatosEdicionTipoConversionInven,*/ jPanelAccionesTipoConversionInven,jPanelAccionesFormularioTipoConversionInven,jmenuBarTipoConversionInven,jmenuBarDetalleTipoConversionInven,jTtoolBarTipoConversionInven,jTtoolBarDetalleTipoConversionInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoConversionInven ,jPanelParametrosReportesTipoConversionInven, jScrollPanelDatosTipoConversionInven,jPanelPaginacionTipoConversionInven, jScrollPanelDatosEdicionTipoConversionInven, jPanelAccionesTipoConversionInven,jPanelAccionesFormularioTipoConversionInven,jmenuBarTipoConversionInven,jmenuBarDetalleTipoConversionInven,jTtoolBarTipoConversionInven,jTtoolBarDetalleTipoConversionInven);
						
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
	
	public void finishProcessTipoConversionInven() {// throws Exception 
		this.finishProcessTipoConversionInven(true);
	}
	
	public void finishProcessTipoConversionInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoConversionInven ,this.jPanelParametrosReportesTipoConversionInven, this.jScrollPanelDatosTipoConversionInven,this.jPanelPaginacionTipoConversionInven, this.jScrollPanelDatosEdicionTipoConversionInven, this.jPanelAccionesTipoConversionInven,this.jPanelAccionesFormularioTipoConversionInven,this.jmenuBarTipoConversionInven,this.jmenuBarDetalleTipoConversionInven,this.jTtoolBarTipoConversionInven,this.jTtoolBarDetalleTipoConversionInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoConversionInven=this.jTabbedPaneBusquedasTipoConversionInven; 
		
		final JPanel jPanelParametrosReportesTipoConversionInven=this.jPanelParametrosReportesTipoConversionInven;
		//final JScrollPane jScrollPanelDatosTipoConversionInven=this.jScrollPanelDatosTipoConversionInven;
		final JTable jTableDatosTipoConversionInven=this.jTableDatosTipoConversionInven;		
		final JPanel jPanelPaginacionTipoConversionInven=this.jPanelPaginacionTipoConversionInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoConversionInven=this.jScrollPanelDatosEdicionTipoConversionInven;
		final JPanel jPanelAccionesTipoConversionInven=this.jPanelAccionesTipoConversionInven;
		
		JPanel jPanelCamposAuxiliarTipoConversionInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoConversionInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			jPanelCamposAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jPanelCamposTipoConversionInven;
			jPanelAccionesFormularioAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jPanelAccionesFormularioTipoConversionInven;
		}
		
		final JPanel jPanelCamposTipoConversionInven=jPanelCamposAuxiliarTipoConversionInven;
		final JPanel jPanelAccionesFormularioTipoConversionInven=jPanelAccionesFormularioAuxiliarTipoConversionInven;
		
		
		final JMenuBar jmenuBarTipoConversionInven=this.jmenuBarTipoConversionInven;		
		final JToolBar jTtoolBarTipoConversionInven=this.jTtoolBarTipoConversionInven;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoConversionInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoConversionInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			jmenuBarDetalleAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jmenuBarDetalleTipoConversionInven;
			jTtoolBarDetalleAuxiliarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jTtoolBarDetalleTipoConversionInven;		
		}
		
		final JMenuBar jmenuBarDetalleTipoConversionInven=jmenuBarDetalleAuxiliarTipoConversionInven;
		final JToolBar jTtoolBarDetalleTipoConversionInven=jTtoolBarDetalleAuxiliarTipoConversionInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoConversionInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoConversionInven;
			processRunnable.jTableDatos=jTableDatosTipoConversionInven;
			processRunnable.jPanelCampos=jPanelCamposTipoConversionInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoConversionInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoConversionInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoConversionInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoConversionInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoConversionInven;
			processRunnable.jTtoolBar=jTtoolBarTipoConversionInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoConversionInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoConversionInven ,jPanelParametrosReportesTipoConversionInven, jTableDatosTipoConversionInven,/*jScrollPanelDatosTipoConversionInven,*/jPanelCamposTipoConversionInven,jPanelPaginacionTipoConversionInven, /*jScrollPanelDatosEdicionTipoConversionInven,*/ jPanelAccionesTipoConversionInven,jPanelAccionesFormularioTipoConversionInven,jmenuBarTipoConversionInven,jmenuBarDetalleTipoConversionInven,jTtoolBarTipoConversionInven,jTtoolBarDetalleTipoConversionInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoConversionInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoConversionInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoConversionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoConversionInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoConversionInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoConversionInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoConversionInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoconversioninvenConstantesFunciones.getsFinalQueryTipoConversionInven();
		String  finalQueryPaginacionTodos=this.tipoconversioninvenConstantesFunciones.getsFinalQueryTipoConversionInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoConversionInvenConstantesFunciones.getArrayColumnasGlobalesNoTipoConversionInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoConversionInvenConstantesFunciones.getArrayColumnasGlobalesTipoConversionInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoConversionInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoconversioninvensEliminados= new ArrayList<TipoConversionInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoConversionInven();
		
				///*TipoConversionInvenSessionBean*/this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
			
			if(this.tipoconversioninvenSessionBean==null) {
				this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
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
					this.iNumeroPaginacion=TipoConversionInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoConversionInvenConstantesFunciones.getClassesForeignKeysOfTipoConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoconversioninven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoconversioninvensAux= new ArrayList<TipoConversionInven>();
			
				
			tipoconversioninvenLogic.setDatosCliente(this.datosCliente);
			tipoconversioninvenLogic.setDatosDeep(this.datosDeep);
			tipoconversioninvenLogic.setIsConDeep(true);
			
			
			tipoconversioninvenLogic.getTipoConversionInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoconversioninvenLogic.getTodosTipoConversionInvens(finalQueryGlobal,pagination);
					
					//tipoconversioninvenLogic.getTodosTipoConversionInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoconversioninvenLogic.getTipoConversionInvens()==null|| tipoconversioninvenLogic.getTipoConversionInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconversioninvensAux= new ArrayList<TipoConversionInven>();
							tipoconversioninvensAux.addAll(tipoconversioninvenLogic.getTipoConversionInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvensAux= new ArrayList<TipoConversionInven>();
							tipoconversioninvensAux.addAll(tipoconversioninvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconversioninvenLogic.getTodosTipoConversionInvens(finalQueryGlobal+"",this.pagination);												
							
							//tipoconversioninvenLogic.getTodosTipoConversionInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoConversionInvens("Todos",tipoconversioninvenLogic.getTipoConversionInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoconversioninvenLogic.setTipoConversionInvens(new ArrayList<TipoConversionInven>());					
							tipoconversioninvenLogic.getTipoConversionInvens().addAll(tipoconversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvens=new ArrayList<TipoConversionInven>();
							tipoconversioninvens.addAll(tipoconversioninvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoConversionInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoConversionInven=this.idActual;
				
				} else if(this.idTipoConversionInvenActual!=null && this.idTipoConversionInvenActual!=0L) {
					idTipoConversionInven=idTipoConversionInvenActual;
				}
				
					
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndicePorId(idTipoConversionInven);
				
				this.tipoconversioninvens=new ArrayList<TipoConversionInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoconversioninvenLogic.getEntity(idTipoConversionInven);
					
					//tipoconversioninvenLogic.getEntityWithConnection(idTipoConversionInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLogic.setTipoConversionInvens(new ArrayList<TipoConversionInven>());
					tipoconversioninvenLogic.getTipoConversionInvens().add(tipoconversioninvenLogic.getTipoConversionInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconversioninvens=new ArrayList<TipoConversionInven>();
					this.tipoconversioninvens.add(tipoconversioninven);
				}
				
				if(tipoconversioninvenLogic.getTipoConversionInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconversioninvenLogic.getTipoConversionInvens()==null||tipoconversioninvenLogic.getTipoConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconversioninvens==null|| tipoconversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
						tipoconversioninvensAux.addAll(tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
							tipoconversioninvensAux.addAll(tipoconversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConversionInvens("BusquedaPorCodigo",tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConversionInvens("BusquedaPorCodigo",tipoconversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.setTipoConversionInvens(new ArrayList<TipoConversionInven>());
						tipoconversioninvenLogic.getTipoConversionInvens().addAll(tipoconversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvens=new ArrayList<TipoConversionInven>();
							tipoconversioninvens.addAll(tipoconversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconversioninvenLogic.getTipoConversionInvens()==null||tipoconversioninvenLogic.getTipoConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconversioninvens==null|| tipoconversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
						tipoconversioninvensAux.addAll(tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
							tipoconversioninvensAux.addAll(tipoconversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConversionInvens("BusquedaPorNombre",tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConversionInvens("BusquedaPorNombre",tipoconversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.setTipoConversionInvens(new ArrayList<TipoConversionInven>());
						tipoconversioninvenLogic.getTipoConversionInvens().addAll(tipoconversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvens=new ArrayList<TipoConversionInven>();
							tipoconversioninvens.addAll(tipoconversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoconversioninvenLogic.getTipoConversionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoconversioninvenLogic.getTipoConversionInvens()==null||tipoconversioninvenLogic.getTipoConversionInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoconversioninvens==null|| tipoconversioninvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
						tipoconversioninvensAux.addAll(tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvensAux=new ArrayList<TipoConversionInven>();
							tipoconversioninvensAux.addAll(tipoconversioninvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoconversioninvenLogic.getTipoConversionInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoConversionInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoConversionInvens("FK_IdEmpresa",tipoconversioninvenLogic.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoConversionInvens("FK_IdEmpresa",tipoconversioninvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenLogic.setTipoConversionInvens(new ArrayList<TipoConversionInven>());
						tipoconversioninvenLogic.getTipoConversionInvens().addAll(tipoconversioninvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvens=new ArrayList<TipoConversionInven>();
							tipoconversioninvens.addAll(tipoconversioninvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoConversionInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoConversionInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconversioninvenLogic.getTipoConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconversioninvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoconversioninvenLogic.getTipoConversionInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoconversioninvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoConversionInven tipoconversioninven) {
		Boolean permite=true;
		
		if(this.tipoconversioninven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoConversionInvenConstantesFunciones.getOrderByListaTipoConversionInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoConversionInvenConstantesFunciones.getOrderByListaTipoConversionInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConversionInven tipoconversioninven:tipoconversioninvenLogic.getTipoConversionInvens()) {
				if(tipoconversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconversioninvenTotales=tipoconversioninven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConversionInven tipoconversioninven:this.tipoconversioninvens) {
				if(tipoconversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconversioninvenTotales=tipoconversioninven;
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
			this.tipoconversioninvenAux=new TipoConversionInven();
			this.tipoconversioninvenAux.setsType(Constantes2.S_TOTALES);
			this.tipoconversioninvenAux.setIsNew(false);
			this.tipoconversioninvenAux.setIsChanged(false);
			this.tipoconversioninvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoConversionInvenConstantesFunciones.TotalizarValoresFilaTipoConversionInven(this.tipoconversioninvenLogic.getTipoConversionInvens(),this.tipoconversioninvenAux);
				
				this.tipoconversioninvenLogic.getTipoConversionInvens().add(this.tipoconversioninvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoConversionInvenConstantesFunciones.TotalizarValoresFilaTipoConversionInven(this.tipoconversioninvens,this.tipoconversioninvenAux);
				
				this.tipoconversioninvens.add(this.tipoconversioninvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoconversioninvenTotales=new TipoConversionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconversioninvenLogic.getTipoConversionInvens().remove(tipoconversioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoconversioninvens.remove(tipoconversioninvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoconversioninvenTotales=new TipoConversionInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoConversionInven tipoconversioninven:tipoconversioninvenLogic.getTipoConversionInvens()) {
				if(tipoconversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconversioninvenTotales=tipoconversioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConversionInvenConstantesFunciones.TotalizarValoresFilaTipoConversionInven(this.tipoconversioninvenLogic.getTipoConversionInvens(),tipoconversioninvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoConversionInven tipoconversioninven:this.tipoconversioninvens) {
				if(tipoconversioninven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoconversioninvenTotales=tipoconversioninven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoConversionInvenConstantesFunciones.TotalizarValoresFilaTipoConversionInven(this.tipoconversioninvens,tipoconversioninvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoConversionInvensBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoConversionInvensBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoConversionInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoConversionInvensBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoConversionInvensBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLogic.getTipoConversionInvensBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoConversionInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLogic.getTipoConversionInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoConversionInven() {
		this.isPermisoTodoTipoConversionInven=false;
		this.isPermisoNuevoTipoConversionInven=false;
		this.isPermisoActualizarTipoConversionInven=false;
		this.isPermisoActualizarOriginalTipoConversionInven=false;
		this.isPermisoEliminarTipoConversionInven=false;
		this.isPermisoGuardarCambiosTipoConversionInven=false;
		this.isPermisoConsultaTipoConversionInven=false;
		this.isPermisoBusquedaTipoConversionInven=false;
		this.isPermisoReporteTipoConversionInven=false;		
		this.isPermisoOrdenTipoConversionInven=false;		
		this.isPermisoPaginacionMedioTipoConversionInven=false;		
		this.isPermisoPaginacionAltoTipoConversionInven=false;
		this.isPermisoPaginacionTodoTipoConversionInven=false;
		this.isPermisoCopiarTipoConversionInven=false;		
		this.isPermisoVerFormTipoConversionInven=false;		
		this.isPermisoDuplicarTipoConversionInven=false;		
		this.isPermisoOrdenTipoConversionInven=false;		
	}
	
	public void setPermisosUsuarioTipoConversionInven(Boolean isPermiso) {
		this.isPermisoTodoTipoConversionInven=isPermiso;
		this.isPermisoNuevoTipoConversionInven=isPermiso;
		this.isPermisoActualizarTipoConversionInven=isPermiso;
		this.isPermisoActualizarOriginalTipoConversionInven=isPermiso;
		this.isPermisoEliminarTipoConversionInven=isPermiso;
		this.isPermisoGuardarCambiosTipoConversionInven=isPermiso;
		this.isPermisoConsultaTipoConversionInven=isPermiso;
		this.isPermisoBusquedaTipoConversionInven=isPermiso;
		this.isPermisoReporteTipoConversionInven=isPermiso;
		this.isPermisoOrdenTipoConversionInven=isPermiso;		
		this.isPermisoPaginacionMedioTipoConversionInven=isPermiso;		
		this.isPermisoPaginacionAltoTipoConversionInven=isPermiso;		
		this.isPermisoPaginacionTodoTipoConversionInven=isPermiso;		
		this.isPermisoCopiarTipoConversionInven=isPermiso;		
		this.isPermisoVerFormTipoConversionInven=isPermiso;		
		this.isPermisoDuplicarTipoConversionInven=isPermiso;
		this.isPermisoOrdenTipoConversionInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoConversionInven(Boolean isPermiso) {
		//this.isPermisoTodoTipoConversionInven=isPermiso;
		this.isPermisoNuevoTipoConversionInven=isPermiso;
		this.isPermisoActualizarTipoConversionInven=isPermiso;
		this.isPermisoActualizarOriginalTipoConversionInven=isPermiso;
		this.isPermisoEliminarTipoConversionInven=isPermiso;
		this.isPermisoGuardarCambiosTipoConversionInven=isPermiso;
		//this.isPermisoConsultaTipoConversionInven=isPermiso;
		//this.isPermisoBusquedaTipoConversionInven=isPermiso;
		//this.isPermisoReporteTipoConversionInven=isPermiso;
		//this.isPermisoOrdenTipoConversionInven=isPermiso;		
		//this.isPermisoPaginacionMedioTipoConversionInven=isPermiso;		
		//this.isPermisoPaginacionAltoTipoConversionInven=isPermiso;		
		//this.isPermisoPaginacionTodoTipoConversionInven=isPermiso;		
		//this.isPermisoCopiarTipoConversionInven=isPermiso;		
		//this.isPermisoDuplicarTipoConversionInven=isPermiso;
		//this.isPermisoOrdenTipoConversionInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoConversionInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ConversionInvenConstantesFunciones.SNOMBREOPCION);
		
		if(TipoConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosConversionInven=false;
		this.isTienePermisosConversionInven=this.verificarGetPermisosUsuarioOpcionTipoConversionInvenClaseRelacionada(this.opcionsRelacionadas,ConversionInvenConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoConversionInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoConversionInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosConversionInven=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoConversionInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoConversionInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoConversionInvenClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosConversionInven && this.jInternalFrameDetalleFormTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.remove(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoConversionInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoConversionInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoConversionInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoConversionInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoConversionInven=this.isPermisoActualizarTipoConversionInven;
			this.isPermisoEliminarTipoConversionInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoConversionInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoConversionInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoConversionInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoConversionInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoConversionInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConversionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoConversionInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoConversionInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoConversionInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoConversionInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoConversionInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoConversionInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoConversionInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoConversionInven.setToolTipText(this.jTableDatosTipoConversionInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoConversionInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoConversionInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoConversionInven() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosConversionInven && this.tipoconversioninvenConstantesFunciones.mostrarConversionInvenTipoConversionInven && !TipoConversionInvenConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Conversion Inven");
			reporte.setsDescripcion("Conversion Inven");
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
	public void inicializarCombosForeignKeyTipoConversionInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoConversionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoConversionInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoConversionInvenListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyTipoConversionInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoConversionInvenParameterReturnGeneral tipoconversioninvenReturnGeneral=new TipoConversionInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoconversioninvenConstantesFunciones.cargarid_empresaTipoConversionInven)
					 || (this.esRecargarFks && this.tipoconversioninvenConstantesFunciones.cargarid_empresaTipoConversionInven)) {

					if(!this.tipoconversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoconversioninvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.cargarCombosLoteForeignKeyTipoConversionInven(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoconversioninvenReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoConversionInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoconversioninvenSessionBean==null) {
				this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
			}

			if(!this.tipoconversioninvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoConversionInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoConversionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoConversionInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConversionInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoConversionInven(TipoConversionInven tipoconversioninven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoConversionInven(TipoConversionInven tipoconversioninven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoConversionInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoConversionInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoConversionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoConversionInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoConversionInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoConversionInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoConversionInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoConversionInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoConversionInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoConversionInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoConversionInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean(); 
		this.tipoconversioninvenConstantesFunciones=new TipoConversionInvenConstantesFunciones(); 
		this.tipoconversioninvenBean=new TipoConversionInven();//(this.tipoconversioninvenConstantesFunciones); 		
		this.tipoconversioninvenReturnGeneral=new TipoConversionInvenParameterReturnGeneral(); 
		
		this.tipoconversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoconversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoConversionInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoConversionInven(true);
			
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
			
			this.tipoconversioninvenConstantesFunciones=new TipoConversionInvenConstantesFunciones(); 
			this.tipoconversioninvenBean=new TipoConversionInven();//this.tipoconversioninvenConstantesFunciones); 			
			this.tipoconversioninvenReturnGeneral=new TipoConversionInvenParameterReturnGeneral(); 
		
			TipoConversionInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Conversion Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoconversioninven=new TipoConversionInven();
			this.tipoconversioninvens = new ArrayList<TipoConversionInven>();
			this.tipoconversioninvensAux = new ArrayList<TipoConversionInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic=new TipoConversionInvenLogic();
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoconversioninvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoconversioninvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoConversionInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConversionInven);	
					}
					
					if(this.jInternalFrameImportacionTipoConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConversionInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoConversionInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoConversionInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConversionInven);
				this.jInternalFrameDetalleFormTipoConversionInven.setVisible(false);
				this.jInternalFrameDetalleFormTipoConversionInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConversionInven);
					this.jInternalFrameReporteDinamicoTipoConversionInven.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoConversionInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoConversionInven);
					this.jInternalFrameImportacionTipoConversionInven.setVisible(false);
					this.jInternalFrameImportacionTipoConversionInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoConversionInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoConversionInven);
					this.jInternalFrameOrderByTipoConversionInven.setVisible(false);
					this.jInternalFrameOrderByTipoConversionInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoConversionInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoConversionInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoconversioninvenReturnGeneral=new TipoConversionInvenParameterReturnGeneral();
			
			this.tipoconversioninvenParameterGeneral=new TipoConversionInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoconversioninvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoConversionInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ConversionInvenConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConversionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado(),this.tipoconversioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoConversionInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado(),this.tipoconversioninvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaDuplicarTipoConversionInven=true;
			this.isVisibilidadCeldaCopiarTipoConversionInven=true;
			this.isVisibilidadCeldaVerFormTipoConversionInven=true;
			this.isVisibilidadCeldaOrdenTipoConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoConversionInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoConversionInven(false);
			
			this.setPermisosUsuarioTipoConversionInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoconversioninvenSessionBean.getEsGuardarRelacionado() && this.tipoconversioninvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoConversionInvenClasesRelacionadas();
			}
			
			if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoConversionInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoConversionInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoConversionInven();
			}
			
			if(!this.isPermisoBusquedaTipoConversionInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoConversionInven,this.isPermisoPaginacionMedioTipoConversionInven,this.isPermisoPaginacionTodoTipoConversionInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoConversionInvenConstantesFunciones.getTiposSeleccionarTipoConversionInven());
				
				this.tiposColumnasSelect=TipoConversionInvenConstantesFunciones.getTiposSeleccionarTipoConversionInven(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoConversionInven();				
				//this.tiposRelacionesSelect=TipoConversionInvenConstantesFunciones.getTiposRelacionesTipoConversionInven(true);
				
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
			//if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoConversionInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoConversionInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoConversionInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConversionInven() ;
			
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
			
			
			this.conversioninvenLogic=new ConversionInvenLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoconversioninvenImplementable= (TipoConversionInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConversionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoconversioninvenImplementableHome= (TipoConversionInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoConversionInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoconversioninvens= new ArrayList<TipoConversionInven>();
			this.tipoconversioninvensEliminados= new ArrayList<TipoConversionInven>();
						
			this.isEsNuevoTipoConversionInven=false;
			this.esParaAccionDesdeFormularioTipoConversionInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoConversionInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoConversionInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoConversionInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoConversionInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoConversionInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoConversionInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoConversionInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoConversionInven();
			}
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoConversionInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoConversionInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoConversionInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoConversionInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoConversionInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoConversionInven() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoConversionInven")) {
				iIndex=this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();	
				
				

				if(sTitle.equals("Conversion Invenes")) {
					if(!ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoConversionInven();

						this.cargarParteTabPanelRelacionadaConversionInven(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoConversionInven();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaConversionInven(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoConversionInven.cargarSessionConBeanSwingJInternalFrameConversionInven(false,true,iIndex);
		this.jButtonConversionInvenActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaConversionInven();

		//this.jTabbedPaneRelacionesTipoConversionInven.updateUI();
		//this.jTabbedPaneRelacionesTipoConversionInven.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoConversionInven.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ConversionInven")) {
				int row=this.jTableDatosTipoConversionInven.getSelectedRow();
				jButtonConversionInvenActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Conversion Inven")) {

					if(this.isTienePermisosConversionInven && this.tipoconversioninvenConstantesFunciones.mostrarConversionInvenTipoConversionInven && !TipoConversionInvenConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Conversion Invenes"+"("+ConversionInvenConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Conversion Invenes");

						if(tipoconversioninvenConstantesFunciones.resaltarConversionInvenTipoConversionInven!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoconversioninvenConstantesFunciones.resaltarConversionInvenTipoConversionInven);
						}

						jmenuItem.setEnabled(this.tipoconversioninvenConstantesFunciones.activarConversionInvenTipoConversionInven);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ConversionInven"));

						

						this.jInternalFrameDetalleFormTipoConversionInven.jmenuDetalleTipoConversionInven.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoConversionInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoConversionInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoConversionInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoConversionInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoConversionInven();
		
		this.cargarCombosFrameForeignKeyTipoConversionInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoConversionInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoConversionInven();
		}
	}
	
	
	
	public void jButtonNuevoTipoConversionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			
			if(jTableDatosTipoConversionInven.getRowCount()>=1) {
				jTableDatosTipoConversionInven.removeRowSelectionInterval(0, jTableDatosTipoConversionInven.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoConversionInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoConversionInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoConversionInven(true);			
			//this.tipoconversioninven=new TipoConversionInven();
			//this.tipoconversioninven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConversionInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConversionInven() ;
			
			if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConversionInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoconversioninven);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);				
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoConversionInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoConversionInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoConversionInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoConversionInven.getSelectedRows().length;			
			}
			
			tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoConversionInven--;			
				//TipoConversionInven tipoconversioninvenAux= new TipoConversionInven();			
				//tipoconversioninvenAux.setId(this.iIdNuevoTipoConversionInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoConversionInven tipoconversioninvenOrigen=new TipoConversionInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoConversionInven tipoconversioninvenOrigen : tipoconversioninvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoconversioninvenOrigen =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoconversioninvenOrigen =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoConversionInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoconversioninven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoConversionInven(tipoconversioninvenOrigen,this.tipoconversioninven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconversioninvenLogic.getTipoConversionInvens().add(this.tipoconversioninvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconversioninvens.add(this.tipoconversioninvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
				
				this.jTableDatosTipoConversionInven.setRowSelectionInterval(this.getIndiceNuevoTipoConversionInven(), this.getIndiceNuevoTipoConversionInven());
				
				int iLastRow =  this.jTableDatosTipoConversionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConversionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConversionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConversionInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();									
		
			TipoConversionInven tipoconversioninvenOrigen=new TipoConversionInven();
			TipoConversionInven tipoconversioninvenDestino=new TipoConversionInven();
				
			tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoConversionInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoconversioninvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoConversionInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenOrigen =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconversioninvenOrigen =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoconversioninvenDestino =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoconversioninvenDestino =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoconversioninvenOrigen =tipoconversioninvensSeleccionados.get(0);
				tipoconversioninvenDestino =tipoconversioninvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoConversionInven(tipoconversioninvenOrigen,tipoconversioninvenDestino,true,false);
				
				tipoconversioninvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoconversioninvenDestino,tipoconversioninvenLogic.getTipoConversionInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoconversioninvenDestino,tipoconversioninvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
				
				//this.jTableDatosTipoConversionInven.setRowSelectionInterval(this.getIndiceNuevoTipoConversionInven(), this.getIndiceNuevoTipoConversionInven());
				
				int iLastRow =  this.jTableDatosTipoConversionInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoConversionInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoConversionInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConversionInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoConversionInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoConversionInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoConversionInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoConversionInven.setVisible(!isVisible);
			this.jPanelPaginacionTipoConversionInven.setVisible(!isVisible);
			this.jPanelAccionesTipoConversionInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoConversionInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoConversionInven();
			
			this.abrirFrameOrderByTipoConversionInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoConversionInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoConversionInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConversionInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoConversionInven.isMaximum()) {
					this.jInternalFrameDetalleFormTipoConversionInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoConversionInven.setSize(this.jInternalFrameDetalleFormTipoConversionInven.iWidthFormulario,this.jInternalFrameDetalleFormTipoConversionInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoConversionInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoConversionInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoConversionInven.isMaximum()) {
						this.jInternalFrameDetalleFormTipoConversionInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoConversionInven.jContentPaneDetalleTipoConversionInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoConversionInven.jContentPaneDetalleTipoConversionInven.getWidth(),TipoConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoConversionInven.jContentPaneDetalleTipoConversionInven.getWidth(),TipoConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoConversionInven.jContentPaneDetalleTipoConversionInven.getWidth(),TipoConversionInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaConversionInven();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoConversionInven.setVisible(true);
	        this.jInternalFrameDetalleFormTipoConversionInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoConversionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoConversionInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConversionInven,false,this);
				} else {
					this.jInternalFrameOrderByTipoConversionInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoConversionInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoConversionInven);
				this.jInternalFrameOrderByTipoConversionInven.setVisible(false);
				this.jInternalFrameOrderByTipoConversionInven.setSelected(false);
				
				this.jInternalFrameOrderByTipoConversionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConversionInven"));
				
				this.inicializarActualizarBindingTablaOrderByTipoConversionInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoConversionInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoConversionInven==null) {
				
				this.jInternalFrameImportacionTipoConversionInven=new ImportacionJInternalFrame(TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoConversionInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoConversionInven);
				this.jInternalFrameImportacionTipoConversionInven.setVisible(false);
				this.jInternalFrameImportacionTipoConversionInven.setSelected(false);


				this.jInternalFrameImportacionTipoConversionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConversionInven"));
				this.jInternalFrameImportacionTipoConversionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConversionInven"));
				this.jInternalFrameImportacionTipoConversionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConversionInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoConversionInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoConversionInven==null) {
				this.jInternalFrameReporteDinamicoTipoConversionInven=new ReporteDinamicoJInternalFrame(TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoConversionInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoConversionInven);
				this.jInternalFrameReporteDinamicoTipoConversionInven.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoConversionInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConversionInven"));
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConversionInven"));
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConversionInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConversionInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaConversionInven() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoConversionInven.jContentPaneDetalleTipoConversionInven.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoConversionInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoConversionInven);
			
	       	this.jInternalFrameDetalleFormTipoConversionInven.setVisible(false);
	        this.jInternalFrameDetalleFormTipoConversionInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoConversionInven.dispose();
			//this.jInternalFrameDetalleFormTipoConversionInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoConversionInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoConversionInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoConversionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoConversionInven.setVisible(true);
	        this.jInternalFrameImportacionTipoConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoConversionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoConversionInven.setVisible(true);
	        this.jInternalFrameOrderByTipoConversionInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoConversionInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoConversionInven.setVisible(false);
	        this.jInternalFrameOrderByTipoConversionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoConversionInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoConversionInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoConversionInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoConversionInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoConversionInven.setVisible(false);
	        this.jInternalFrameImportacionTipoConversionInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoConversionInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoConversionInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoConversionInven(true);
			//this.isEsNuevoTipoConversionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConversionInven(false) ;
			
			if(tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado() && ConversionInvenJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonConversionInvenActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConversionInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConversionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoConversionInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoConversionInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoConversionInven(true);
			//this.isEsNuevoTipoConversionInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoconversioninven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoConversionInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoConversionInven(false) ;
			
			if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoConversionInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConversionInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoConversionInven(false);
			
			//if(!this.isEsNuevoTipoConversionInven) {								
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				
			}
			
			if(this.permiteMantenimiento(this.tipoconversioninven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoConversionInven=true;
					this.inicializarActualizarBindingTablaTipoConversionInven(false);
					this.isEsNuevoTipoConversionInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoConversionInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoConversionInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConversionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConversionInven(false);
				
				this.habilitarDeshabilitarControlesTipoConversionInven(false);
			
												
				
				if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoConversionInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoConversionInvenActionPerformed(evt,tipoconversioninvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoConversionInven(this.tipoconversioninven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoConversionInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoconversioninvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoconversioninven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoconversioninven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoconversioninven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoconversioninven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoConversionInvenModel) this.jTableDatosTipoConversionInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoConversionInven=true;
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
				this.isEsNuevoTipoConversionInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoConversionInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConversionInven(false);
				
				this.habilitarDeshabilitarControlesTipoConversionInven(false);
				
				
				
				if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoConversionInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoConversionInven.getRowCount()>=1) {
				jTableDatosTipoConversionInven.removeRowSelectionInterval(0, jTableDatosTipoConversionInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoConversionInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoConversionInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoConversionInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoConversionInven(false) ;
			
			this.isEsNuevoTipoConversionInven=false;
			
			if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoConversionInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoConversionInven(false);
				
				//SI ES MANUAL
				if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoConversionInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoConversionInven--;			
			//TipoConversionInven tipoconversioninvenAux= new TipoConversionInven();			
			//tipoconversioninvenAux.setId(this.iIdNuevoTipoConversionInven);
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoConversionInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
			
			this.tipoconversioninven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoconversioninvenLogic.getTipoConversionInvens().add(this.tipoconversioninvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoconversioninvens.add(this.tipoconversioninvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoConversionInven(false);
			
			this.jTableDatosTipoConversionInven.setRowSelectionInterval(this.getIndiceNuevoTipoConversionInven(), this.getIndiceNuevoTipoConversionInven());
			
			int iLastRow =  this.jTableDatosTipoConversionInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoConversionInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoConversionInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConversionInven(false);
			
			//SI ES MANUAL
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConversionInven();
			}
			
			//this.abrirFrameTreeTipoConversionInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Conversion InvenES ?", "MANTENIMIENTO DE Tipo Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoConversionInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoConversionInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.procesarImportacionTipoConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoconversioninvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoConversionInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoConversionInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoConversionInven.setFileImportacion(this.jInternalFrameImportacionTipoConversionInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoConversionInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoConversionInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoConversionInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoConversionInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		

		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoConversionInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoConversionInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConversionInvenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoConversionInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoConversionInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoConversionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoConversionInven tipoconversioninven:tipoconversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconversioninven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoConversionInven tipoconversioninven:tipoconversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconversioninven.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoConversionInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoConversionInven tipoconversioninven:tipoconversioninvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoconversioninven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoConversionInven(row);				
			//	iRow++;
			//}				
			
			//for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoConversionInven(tipoconversioninvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConversionInven(false);
			
			//SI ES MANUAL
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoConversionInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConversionInven(false);
			
			//SI ES MANUAL
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConversionInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoConversionInven(false);
			
			//SI ES MANUAL
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoConversionInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoConversionInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoConversionInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoConversionInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoConversionInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoConversionInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoConversionInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoConversionInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoConversionInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoConversionInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoConversionInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoConversionInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoConversionInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoConversionInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoConversionInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConversionInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoConversionInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoConversionInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoConversionInven();
		
		this.inicializarActualizarBindingBotonesManualTipoConversionInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConversionInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoConversionInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConversionInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConversionInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoConversionInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoConversionInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoConversionInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionNuevoTipoConversionInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionSinCerrarTipoConversionInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionSinMensajeTipoConversionInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoConversionInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoConversionInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoConversionInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
				this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionNuevoTipoConversionInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionSinCerrarTipoConversionInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoConversionInven.jCheckBoxPostAccionSinMensajeTipoConversionInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoConversionInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoConversionInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoConversionInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoConversionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoConversionInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoConversionInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoConversionInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoConversionInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoConversionInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoConversionInven(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoConversionInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoConversionInven() throws Exception {
		try	{
			if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConversionInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConversionInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoConversionInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoConversionInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoConversionInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoConversionInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoConversionInven.addItem(reporte);
			}
			
			
			if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoConversionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoConversionInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoConversionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoConversionInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoConversionInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoConversionInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoConversionInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConversionInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoConversionInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoConversionInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoConversionInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoConversionInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoConversionInven.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoConversionInven.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoConversionInven(Boolean esInicializar) throws Exception {				
		if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoConversionInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoConversionInven() throws Exception {
		this.inicializarActualizarBindingTablaTipoConversionInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoConversionInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoConversionInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoConversionInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoconversioninvenLogic.getTipoConversionInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoconversioninvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoConversionInven.setModel(new TipoConversionInvenModel(this.tipoconversioninvenLogic.getTipoConversionInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoConversionInven.setModel(new TipoConversionInvenModel(this.tipoconversioninvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoConversionInven!=null && this.jInternalFrameOrderByTipoConversionInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoConversionInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,tipoconversioninvenConstantesFunciones.resaltarSeleccionarTipoConversionInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoConversionInvenConstantesFunciones.SCLASSWEBTITULO,tipoconversioninvenConstantesFunciones.resaltarSeleccionarTipoConversionInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,TipoConversionInvenConstantesFunciones.LABEL_ID));

		if(this.tipoconversioninvenConstantesFunciones.mostraridTipoConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConversionInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoconversioninvenConstantesFunciones.resaltaridTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activaridTipoConversionInven,this,true,"idTipoConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconversioninvenConstantesFunciones.resaltaridTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activaridTipoConversionInven,this,true,"idTipoConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoconversioninvenConstantesFunciones.mostrarid_empresaTipoConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoconversioninvenConstantesFunciones.resaltarid_empresaTipoConversionInven,this,this.tipoconversioninvenConstantesFunciones.activarid_empresaTipoConversionInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoconversioninvenConstantesFunciones.resaltarid_empresaTipoConversionInven,this,this.tipoconversioninvenConstantesFunciones.activarid_empresaTipoConversionInven,false,"id_empresaTipoConversionInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,TipoConversionInvenConstantesFunciones.LABEL_CODIGO));

		if(this.tipoconversioninvenConstantesFunciones.mostrarcodigoTipoConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConversionInvenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconversioninvenConstantesFunciones.resaltarcodigoTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activarcodigoTipoConversionInven,this,true,"codigoTipoConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconversioninvenConstantesFunciones.resaltarcodigoTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activarcodigoTipoConversionInven,this,true,"codigoTipoConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,TipoConversionInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoconversioninvenConstantesFunciones.mostrarnombreTipoConversionInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoConversionInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoconversioninvenConstantesFunciones.resaltarnombreTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activarnombreTipoConversionInven,this,true,"nombreTipoConversionInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoconversioninvenConstantesFunciones.resaltarnombreTipoConversionInven,this.tipoconversioninvenConstantesFunciones.activarnombreTipoConversionInven,this,true,"nombreTipoConversionInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoConversionInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosConversionInven && this.tipoconversioninvenConstantesFunciones.mostrarConversionInvenTipoConversionInven && !TipoConversionInvenConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Conversion Invenes");
				tableColumn.setHeaderValue("Conversion Invenes");
				tableColumn.setCellRenderer(new ConversionInvenTableCell(tipoconversioninvenConstantesFunciones.resaltarConversionInvenTipoConversionInven,this,this.tipoconversioninvenConstantesFunciones.activarConversionInvenTipoConversionInven));
				tableColumn.setCellEditor(new ConversionInvenTableCell(tipoconversioninvenConstantesFunciones.resaltarConversionInvenTipoConversionInven,this,this.tipoconversioninvenConstantesFunciones.activarConversionInvenTipoConversionInven));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoConversionInven.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConversionInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoConversionInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoConversionInven.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoConversionInven.addColumn(tableColumn);
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
			
			this.jTableDatosTipoConversionInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoConversionInven.moveColumn(this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoConversionInven.moveColumn(this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoConversionInven.moveColumn(this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoConversionInven.moveColumn(this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoConversionInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoConversionInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoConversionInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoConversionInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoConversionInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoConversionInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoConversionInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoConversionInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoconversioninvenLogic.getTipoConversionInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoconversioninvens.size()-1;
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
		//this.jTableDatosTipoConversionInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoConversionInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoConversionInven();
			
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
				
				//this.isEsNuevoTipoConversionInven=false;
					
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
				if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoConversionInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConversionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConversionInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoconversioninven.getsType().equals("DUPLICADO")
				   || this.tipoconversioninven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoConversionInven=true;
				
				} else {
					this.isEsNuevoTipoConversionInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoconversioninven.getId()>=0 && !this.tipoconversioninven.getIsNew()) {						
						this.isEsNuevoTipoConversionInven=false;
						
					} else {
						this.isEsNuevoTipoConversionInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoConversionInven(esRelaciones);						
				
				this.seleccionarTipoConversionInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoconversioninven.getId()<0) {
					this.isEsNuevoTipoConversionInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoConversionInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoConversionInven(evt,rowIndex);
				}	
				
				if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoConversionInven: " + this.dDif); 
					}
				}								
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoConversionInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoconversioninven)) {
					if(this.tipoconversioninven.getId()>0) {
						this.tipoconversioninven.setIsDeleted(true);
						
						this.tipoconversioninvensEliminados.add(this.tipoconversioninven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoconversioninvenLogic.getTipoConversionInvens().remove(this.tipoconversioninven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoconversioninvens.remove(this.tipoconversioninven);				
					}
					
					
					((TipoConversionInvenModel) this.jTableDatosTipoConversionInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoConversionInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoConversionInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoConversionInven) {
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoConversionInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoConversionInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoconversioninvenConstantesFunciones.cargarid_empresaTipoConversionInven || this.tipoconversioninvenConstantesFunciones.event_dependid_empresaTipoConversionInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoconversioninven.getid_empresa());
									//this.inicializarActualizarBindingTipoConversionInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoconversioninven.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoconversioninven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoconversioninven.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoConversionInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoConversionInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoConversionInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConversionInven(TipoConversionInven tipoconversioninven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoConversionInven(tipoconversioninven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoConversionInven(TipoConversionInven tipoconversioninven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoConversionInven(tipoconversioninven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoConversionInven(tipoconversioninven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoConversionInven(tipoconversioninven);
	}
	
	public void setVariablesObjetoActualToFormularioTipoConversionInven(TipoConversionInven tipoconversioninven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setText(tipoconversioninven.getId().toString());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setText(tipoconversioninven.getcodigo());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setText(tipoconversioninven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoConversionInven tipoconversioninvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoconversioninvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoConversionInven tipoconversioninvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoconversioninvenLocal=this.tipoconversioninven;
			} else {
				tipoconversioninvenLocal=this.tipoconversioninvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoconversioninvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoConversionInven(tipoconversioninvenLocal,true);
					
					if(tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoconversioninvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoconversioninvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoConversionInven(TipoConversionInven tipoconversioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConversionInven(tipoconversioninven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(tipoconversioninven);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConversionInven(TipoConversionInven tipoconversioninven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoConversionInven(tipoconversioninven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoConversionInven(TipoConversionInven tipoconversioninven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.getText()==null || this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.getText()=="" || this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setText("0");
			}

			if(conColumnasBase) {tipoconversioninven.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConversionInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelIdTipoConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconversioninven.setcodigo(this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConversionInvenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelcodigoTipoConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoconversioninven.setnombre(this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoConversionInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoConversionInven.jLabelnombreTipoConversionInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoConversionInven(TipoConversionInven tipoconversioninvenBean,TipoConversionInven tipoconversioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoConversionInven(TipoConversionInven tipoconversioninvenOrigen,TipoConversionInven tipoconversioninven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconversioninvenOrigen.getId()!=null && !tipoconversioninvenOrigen.getId().equals(0L))) {tipoconversioninven.setId(tipoconversioninvenOrigen.getId());}}
			if(conDefault || (!conDefault && tipoconversioninvenOrigen.getcodigo()!=null && !tipoconversioninvenOrigen.getcodigo().equals(""))) {tipoconversioninven.setcodigo(tipoconversioninvenOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoconversioninvenOrigen.getnombre()!=null && !tipoconversioninvenOrigen.getnombre().equals(""))) {tipoconversioninven.setnombre(tipoconversioninvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConversionInven(TipoConversionInven tipoconversioninven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setText(tipoconversioninven.getId().toString());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setText(tipoconversioninven.getcodigo());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setText(tipoconversioninven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoConversionInven(TipoConversionInvenBean tipoconversioninvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setText(tipoconversioninvenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setText(tipoconversioninvenBean.getcodigo());
			this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setText(tipoconversioninvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoConversionInven(TipoConversionInvenParameterReturnGeneral tipoconversioninvenReturnGeneral,TipoConversionInvenBean tipoconversioninvenBean,Boolean conDefault) throws Exception { 
		try {
			TipoConversionInven tipoconversioninvenLocal=new TipoConversionInven();
			
			tipoconversioninvenLocal=tipoconversioninvenReturnGeneral.getTipoConversionInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoconversioninvenLocal.getId()!=null && !tipoconversioninvenLocal.getId().equals(0L))) {tipoconversioninvenBean.setId(tipoconversioninvenLocal.getId());}}
			if(conDefault || (!conDefault && tipoconversioninvenLocal.getcodigo()!=null && !tipoconversioninvenLocal.getcodigo().equals(""))) {tipoconversioninvenBean.setcodigo(tipoconversioninvenLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoconversioninvenLocal.getnombre()!=null && !tipoconversioninvenLocal.getnombre().equals(""))) {tipoconversioninvenBean.setnombre(tipoconversioninvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoConversionInvenGenerico(Long idTipoConversionInvenSeleccionado,JComboBox jComboBoxTipoConversionInven,List<TipoConversionInven> tipoconversioninvensLocal)throws Exception {
		try {
			TipoConversionInven  tipoconversioninvenTemp=null;

			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensLocal) {
				if(tipoconversioninvenAux.getId()!=null && tipoconversioninvenAux.getId().equals(idTipoConversionInvenSeleccionado)) {
					tipoconversioninvenTemp=tipoconversioninvenAux;
					break;
				}
			}

			jComboBoxTipoConversionInven.setSelectedItem(tipoconversioninvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoConversionInvenGenerico(JComboBox jComboBoxTipoConversionInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConversionInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoConversionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoConversionInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoConversionInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoConversionInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoConversionInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ConversionInven")) {
			jButtonConversionInvenActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconversioninven=(TipoConversionInven) tipoconversioninvenLogic.getTipoConversionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconversioninven =(TipoConversionInven) tipoconversioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoconversioninven.getIsNew() && !tipoconversioninven.getIsChanged() && !tipoconversioninven.getIsDeleted()) {
				sDescripcion=tipoconversioninven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoconversioninven.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoConversionInven tipoconversioninvenRow=new TipoConversionInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconversioninvenRow=(TipoConversionInven) tipoconversioninvenLogic.getTipoConversionInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoconversioninvenRow=(TipoConversionInven) tipoconversioninvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonConversionInvenActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoConversionInven tipoconversioninven) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoConversionInven==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninven = (TipoConversionInven)this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoconversioninven = (TipoConversionInven)this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoconversioninven!=null) {
						this.tipoconversioninven = tipoconversioninven;
					} else {
						this.tipoconversioninven = new TipoConversionInven();
					}
				}

				if(this.isTienePermisosConversionInven && this.permiteMantenimiento(this.tipoconversioninven)) {
					ConversionInvenBeanSwingJInternalFrame conversioninvenBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup=new ConversionInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						conversioninvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup;
					} else {
						conversioninvenBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame;
					}

					List<TipoConversionInven> tipoconversioninvens=new ArrayList<TipoConversionInven>();
					tipoconversioninvens.add(this.tipoconversioninven);
					if(!esRelacionado) {
						//conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setConGuardarRelaciones(false);
						//conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					conversioninvenBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoConversionInven.cargarConversionInvenBeanSwingJInternalFrame(tipoconversioninvens,this.tipoconversioninven,conversioninvenBeanSwingJInternalFrame,/*conInicializar,*/conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getConGuardarRelaciones(),conversioninvenBeanSwingJInternalFrame.conversioninvenSessionBean.getEsGuardarRelacionado());
					conversioninvenBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						conversioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsConversionInven("no_relacionado");

						conversioninvenBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ConversionInvenConstantesFunciones.ITAMANIOFILATABLA + (ConversionInvenConstantesFunciones.ITAMANIOFILATABLA/2));

						conversioninvenBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoConversionInven=(TitledBorder)this.jScrollPanelDatosTipoConversionInven.getBorder();
						TitledBorder titledBorderConversionInven=(TitledBorder)conversioninvenBeanSwingJInternalFrame.jScrollPanelDatosConversionInven.getBorder();

						titledBorderConversionInven.setTitle(titledBorderTipoConversionInven.getTitle() + " -> Conversion Inven");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,conversioninvenBeanSwingJInternalFrame);
						}

						conversioninvenBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(conversioninvenBeanSwingJInternalFrame);

						conversioninvenBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Conversion Inven",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoConversionInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven));			
			this.jButtonDuplicarTipoConversionInven.setVisible((this.isVisibilidadCeldaDuplicarTipoConversionInven && this.isPermisoDuplicarTipoConversionInven));			
			this.jButtonCopiarTipoConversionInven.setVisible((this.isVisibilidadCeldaCopiarTipoConversionInven && this.isPermisoCopiarTipoConversionInven));
			this.jButtonVerFormTipoConversionInven.setVisible((this.isVisibilidadCeldaVerFormTipoConversionInven && this.isPermisoVerFormTipoConversionInven));
			
			this.jButtonAbrirOrderByTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));			
			
			this.jButtonNuevoRelacionesTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven && this.isPermisoNuevoTipoConversionInven));			
			this.jButtonNuevoGuardarCambiosTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarTipoConversionInven.setVisible((this.isVisibilidadCeldaModificarTipoConversionInven && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.setVisible((this.isVisibilidadCeldaActualizarTipoConversionInven && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.setVisible((this.isVisibilidadCeldaEliminarTipoConversionInven && this.isPermisoEliminarTipoConversionInven));
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.setVisible(this.isVisibilidadCeldaCancelarTipoConversionInven);							
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven));						
			this.jButtonDuplicarToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaDuplicarTipoConversionInven && this.isPermisoDuplicarTipoConversionInven));						
			this.jButtonCopiarToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaCopiarTipoConversionInven && this.isPermisoCopiarTipoConversionInven));			
			this.jButtonVerFormToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaVerFormTipoConversionInven && this.isPermisoVerFormTipoConversionInven));			
			this.jButtonAbrirOrderByToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));
			this.jButtonNuevoRelacionesToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven && this.isPermisoNuevoTipoConversionInven));			
			this.jButtonNuevoGuardarCambiosToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));			
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaModificarTipoConversionInven && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaActualizarTipoConversionInven  && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaEliminarTipoConversionInven && this.isPermisoEliminarTipoConversionInven));
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarToolBarTipoConversionInven.setVisible(this.isVisibilidadCeldaCancelarTipoConversionInven);				
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven));			
			this.jMenuItemDuplicarTipoConversionInven.setVisible((this.isVisibilidadCeldaDuplicarTipoConversionInven && this.isPermisoDuplicarTipoConversionInven));			
			this.jMenuItemCopiarTipoConversionInven.setVisible((this.isVisibilidadCeldaCopiarTipoConversionInven && this.isPermisoCopiarTipoConversionInven));			
			this.jMenuItemVerFormTipoConversionInven.setVisible((this.isVisibilidadCeldaVerFormTipoConversionInven && this.isPermisoVerFormTipoConversionInven));			
			this.jMenuItemAbrirOrderByTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));			
			//this.jMenuItemMostrarOcultarTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));
			this.jMenuItemDetalleAbrirOrderByTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));			
			//this.jMenuItemDetalleMostrarOcultarTipoConversionInven.setVisible((this.isVisibilidadCeldaOrdenTipoConversionInven && this.isPermisoOrdenTipoConversionInven));			
			this.jMenuItemNuevoRelacionesTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven && this.isPermisoNuevoTipoConversionInven));			
			this.jMenuItemNuevoGuardarCambiosTipoConversionInven.setVisible((this.isVisibilidadCeldaNuevoTipoConversionInven && this.isPermisoNuevoTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));									
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemModificarTipoConversionInven.setVisible((this.isVisibilidadCeldaModificarTipoConversionInven && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemActualizarTipoConversionInven.setVisible((this.isVisibilidadCeldaActualizarTipoConversionInven && this.isPermisoActualizarTipoConversionInven));	
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemEliminarTipoConversionInven.setVisible((this.isVisibilidadCeldaEliminarTipoConversionInven && this.isPermisoEliminarTipoConversionInven));
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemCancelarTipoConversionInven.setVisible(this.isVisibilidadCeldaCancelarTipoConversionInven);				
			}
			
			this.jMenuItemGuardarCambiosTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));						
			this.jMenuItemGuardarCambiosTablaTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoConversionInven=this.jButtonNuevoTipoConversionInven.isVisible();
			this.isVisibilidadCeldaDuplicarTipoConversionInven=this.jButtonDuplicarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaCopiarTipoConversionInven=this.jButtonCopiarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaVerFormTipoConversionInven=this.jButtonVerFormTipoConversionInven.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoConversionInven=this.jButtonAbrirOrderByTipoConversionInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=this.jButtonNuevoRelacionesTipoConversionInven.isVisible();
			this.isVisibilidadCeldaModificarTipoConversionInven=this.jButtonModificarTipoConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.isVisibilidadCeldaActualizarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=this.jButtonGuardarCambiosTablaTipoConversionInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoConversionInven=this.jButtonNuevoToolBarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=this.jButtonNuevoRelacionesToolBarTipoConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.isVisibilidadCeldaModificarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarToolBarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarToolBarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarToolBarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarToolBarTipoConversionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConversionInven=this.jButtonGuardarCambiosToolBarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=this.jButtonGuardarCambiosTablaToolBarTipoConversionInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoConversionInven=this.jMenuItemNuevoTipoConversionInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=this.jMenuItemNuevoRelacionesTipoConversionInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.isVisibilidadCeldaModificarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemModificarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemActualizarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemEliminarTipoConversionInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemCancelarTipoConversionInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoConversionInven=this.jMenuItemGuardarCambiosTipoConversionInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=this.jMenuItemGuardarCambiosTablaTipoConversionInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoConversionInven(Boolean esInicializar) {
		if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConversionInven();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoConversionInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoConversionInven() {
		this.jButtonNuevoTipoConversionInven.setVisible(this.isPermisoNuevoTipoConversionInven);			
		this.jButtonDuplicarTipoConversionInven.setVisible(this.isPermisoDuplicarTipoConversionInven);			
		this.jButtonCopiarTipoConversionInven.setVisible(this.isPermisoCopiarTipoConversionInven);			
		this.jButtonVerFormTipoConversionInven.setVisible(this.isPermisoVerFormTipoConversionInven);			
		
		this.jButtonAbrirOrderByTipoConversionInven.setVisible(this.isPermisoOrdenTipoConversionInven);					
		
		this.jButtonNuevoRelacionesTipoConversionInven.setVisible(this.isPermisoNuevoTipoConversionInven);			
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarTipoConversionInven.setVisible(this.isPermisoActualizarTipoConversionInven);	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.setVisible(this.isPermisoActualizarTipoConversionInven);	
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.setVisible(this.isPermisoEliminarTipoConversionInven);
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.setVisible(this.isVisibilidadCeldaCancelarTipoConversionInven);						
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.setVisible(this.isPermisoGuardarCambiosTipoConversionInven);							
		}
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.setVisible(this.isPermisoActualizarTipoConversionInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConversionInven() {
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarTipoConversionInven.setVisible(this.isPermisoActualizarTipoConversionInven);	
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.setVisible(this.isPermisoActualizarTipoConversionInven);	
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.setVisible(this.isPermisoEliminarTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.setVisible(this.isVisibilidadCeldaCancelarTipoConversionInven);							
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.setVisible((this.isVisibilidadCeldaGuardarTipoConversionInven && this.isPermisoGuardarCambiosTipoConversionInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoConversionInven() {
		if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoConversionInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoConversionInven() {
	}
	
	public void jTableDatosTipoConversionInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoConversionInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.gettipoconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconversioninven==null) {
						this.tipoconversioninven = new TipoConversionInven();
					}

					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				}

				if(this.tipoconversioninven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoconversioninven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoConversionInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoConversionInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoConversionInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoConversionInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoConversionInven(this.gettipoconversioninven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoconversioninvenLogic.getConnexion());

				if(this.tipoconversioninven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoconversioninven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoConversionInven=(TitledBorder)this.jScrollPanelDatosTipoConversionInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoConversionInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.gettipoconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconversioninven==null) {
						this.tipoconversioninven = new TipoConversionInven();
					}

					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				}

				if(this.tipoconversioninven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoconversioninven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.gettipoconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconversioninven==null) {
						this.tipoconversioninven = new TipoConversionInven();
					}

					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				}

				if(this.tipoconversioninven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoconversioninven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoConversionInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.gettipoconversioninven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoconversioninven==null) {
						this.tipoconversioninven = new TipoConversionInven();
					}

					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);
				}

				if(this.tipoconversioninven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoconversioninven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoConversionInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConversionInven(false,false);

			this.getTipoConversionInvensBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoConversionInven(false);

			//if(TipoConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConversionInven(false,false);

			this.getTipoConversionInvensBusquedaPorNombre();

			this.inicializarActualizarBindingTipoConversionInven(false);

			//if(TipoConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTipoConversionInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoConversionInven(false,false);

			this.getTipoConversionInvensFK_IdEmpresa();

			this.inicializarActualizarBindingTipoConversionInven(false);

			//if(TipoConversionInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoConversionInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoconversioninvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoConversionInven() {
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
		

		if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
			this.jInternalFrameDetalleFormTipoConversionInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoConversionInven.dispose();
			this.jInternalFrameDetalleFormTipoConversionInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
			this.jInternalFrameReporteDinamicoTipoConversionInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoConversionInven.dispose();
			this.jInternalFrameReporteDinamicoTipoConversionInven=null;
		}
		
		if(this.jInternalFrameImportacionTipoConversionInven!=null) {
			this.jInternalFrameImportacionTipoConversionInven.setVisible(false);	    			
			this.jInternalFrameImportacionTipoConversionInven.dispose();
			this.jInternalFrameImportacionTipoConversionInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoConversionInven();
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoConversionInven")) {
				jButtonDuplicarTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoConversionInven")) {
				jButtonCopiarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoConversionInven")) {
				jButtonVerFormTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoConversionInven")) {
				jButtonDuplicarTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoConversionInven")) {
				jButtonDuplicarTipoConversionInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoConversionInven")) {
				jButtonModificarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoConversionInven")) {
				jButtonModificarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoConversionInven")) {
				jButtonModificarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoConversionInven")) {
				jButtonActualizarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoConversionInven")) {
				jButtonActualizarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoConversionInven")) {
				jButtonActualizarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoConversionInven")) {
				jButtonEliminarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoConversionInven")) {
				jButtonEliminarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoConversionInven")) {
				jButtonEliminarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoConversionInven")) {
				jButtonCancelarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoConversionInven")) {
				jButtonCancelarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoConversionInven")) {
				jButtonCancelarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoConversionInven")) {
				jButtonCerrarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoConversionInven")) {
				jButtonCerrarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoConversionInven")) {
				jButtonCerrarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoConversionInven")) {
				jButtonMostrarOcultarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoConversionInven")) {
				jButtonCancelarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoConversionInven")) {
				jButtonCopiarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoConversionInven")) {
				jButtonVerFormTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoConversionInven")) {
				jButtonCopiarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoConversionInven")) {
				jButtonVerFormTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoConversionInven")) {
				jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoConversionInven")) {
				jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoConversionInven")) {
				jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoConversionInven")) {
				jButtonAnterioresTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoConversionInven")) {
				jButtonAnterioresTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoConversionInven")) {
				jButtonAnterioresTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoConversionInven")) {
				jButtonSiguientesTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoConversionInven")) {
				jButtonSiguientesTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoConversionInven")) {
				jButtonSiguientesTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoConversionInven") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoConversionInven")) {
				jButtonAbrirOrderByTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoConversionInven") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoConversionInven")) {
				jButtonMostrarOcultarTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConversionInven")) {
				jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoConversionInven")) {
				jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoConversionInven")) {
				jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoConversionInven")) {
				jButtonCerrarReporteDinamicoTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoConversionInven")) {
				jButtonGenerarReporteDinamicoTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoConversionInven")) {
				
				jButtonGenerarExcelReporteDinamicoTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoConversionInven")) {
				jButtonCerrarImportacionTipoConversionInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoConversionInven")) {
				
				jButtonGenerarImportacionTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoConversionInven")) {
				
				jButtonAbrirImportacionTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoConversionInven")) {
				jComboBoxTiposAccionesTipoConversionInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoConversionInven")) {
				jComboBoxTiposRelacionesTipoConversionInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoConversionInven")) {
				jComboBoxTiposAccionesTipoConversionInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoConversionInven")) {
				
				jComboBoxTiposSeleccionarTipoConversionInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoConversionInven")) {
				jTextFieldValorCampoGeneralTipoConversionInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoConversionInven")) {
				jButtonAbrirOrderByTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoConversionInven")) {
				jButtonAbrirOrderByTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoConversionInven")) {
				jButtonCerrarOrderByTipoConversionInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConversionInvenBusqueda")) {
				this.jButtonidTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoConversionInvenUpdate")) {
				this.jButtonid_empresaTipoConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoConversionInvenBusqueda")) {
				this.jButtonid_empresaTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConversionInvenBusqueda")) {
				this.jButtoncodigoTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConversionInvenBusqueda")) {
				this.jButtonnombreTipoConversionInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoConversionInven")) {
				this.jButtonBusquedaPorCodigoTipoConversionInvenActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoConversionInven")) {
				this.jButtonBusquedaPorNombreTipoConversionInvenActionPerformed(evt);
			}
			
			;
			
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoConversionInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoConversionInven tipoconversioninvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoconversioninvenLocal=this.tipoconversioninven;
			} else {
				tipoconversioninvenLocal=this.tipoconversioninvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
							
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
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
			
			


			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
								
						
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
								
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
							
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
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
			
			


			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
								
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoConversionInven")) {
					jCheckBoxSeleccionarTodosTipoConversionInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoConversionInven")) {
					jCheckBoxSeleccionadosTipoConversionInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoConversionInven")) {
					
				}
				
				


				
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
												
				
				


				
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
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
			
			


			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoConversionInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoconversioninven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoconversioninven);
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
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
				
				


				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoConversionInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoConversionInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoConversionInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoconversioninvenAnterior =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoConversionInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoConversionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoConversionInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoconversioninven =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoconversioninven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoConversionInven")) {
				
				}
				
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoConversionInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoConversionInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoConversionInven")) {
			
			}
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoConversionInven();
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoConversionInven")) {
				jButtonDuplicarTipoConversionInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoConversionInven")) {
				jButtonCopiarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoConversionInven")) {
				jButtonVerFormTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoConversionInven")) {
				jButtonNuevoTipoConversionInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoConversionInven")) {
				jButtonModificarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoConversionInven")) {
				jButtonActualizarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoConversionInven")) {
				jButtonEliminarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoConversionInven")) {
				jButtonCancelarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoConversionInven")) {
				jButtonCerrarTipoConversionInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoConversionInven")) {
				jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoConversionInven")) {
				jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoConversionInven")) {
				jButtonAbrirOrderByTipoConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoConversionInven")) {
				jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoConversionInven")) {
				jButtonAnterioresTipoConversionInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoConversionInven")) {
				jButtonSiguientesTipoConversionInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoConversionInvenBusqueda")) {
				this.jButtonidTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoConversionInvenUpdate")) {
				this.jButtonid_empresaTipoConversionInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoConversionInvenBusqueda")) {
				this.jButtonid_empresaTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoConversionInvenBusqueda")) {
				this.jButtoncodigoTipoConversionInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoConversionInvenBusqueda")) {
				this.jButtonnombreTipoConversionInvenBusquedaActionPerformed(evt);
			}
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoConversionInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoConversionInven")) {
				closingInternalFrameTipoConversionInven();
				
			} else if(sTipo.equals("jButtonCancelarTipoConversionInven")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoConversionInven = (JInternalFrameBase)evt.getSource();
	            	
	            TipoConversionInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoConversionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConversionInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoConversionInvenActionPerformed(null);
			}
			
			TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoconversioninven,new Object(),this.tipoconversioninvenParameterGeneral,this.tipoconversioninvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoConversionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoConversionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoConversionInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoconversioninven)) {
			if(!esControlTabla) {
				if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);			
				}
				
				if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoConversionInven(this.tipoconversioninven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.procesarEventosTipoConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconversioninvenLogic.getTipoConversionInvens(),this.tipoconversioninven,this.tipoconversioninvenParameterGeneral,this.isEsNuevoTipoConversionInven,classes);//this.tipoconversioninvenLogic.getTipoConversionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoConversionInven(this.tipoconversioninvenReturnGeneral,this.tipoconversioninvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoConversionInven(classes,this.tipoconversioninvenReturnGeneral,this.tipoconversioninvenBean,false);
					}
						
					if(this.tipoconversioninvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven());	
					}
						
					if(this.tipoconversioninvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven(),classes);//this.tipoconversioninvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoConversionInven(this.tipoconversioninven,classes);//this.tipoconversioninvenBean);									
				}
			
				if(TipoConversionInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoConversionInven(this.tipoconversioninven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoConversionInven(this.tipoconversioninven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoconversioninvenAnterior!=null) {
						this.tipoconversioninven=this.tipoconversioninvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.procesarEventosTipoConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconversioninvenLogic.getTipoConversionInvens(),this.tipoconversioninven,this.tipoconversioninvenParameterGeneral,this.isEsNuevoTipoConversionInven,classes);//this.tipoconversioninvenLogic.getTipoConversionInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoconversioninvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoconversioninvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoconversioninvenReturnGeneral.getTipoConversionInven(),tipoconversioninvenLogic.getTipoConversionInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoconversioninvenReturnGeneral.getTipoConversionInven(),this.tipoconversioninvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoConversionInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoConversionInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoConversionInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoConversionInven() throws Exception {
		
		TipoConversionInvenModel tipoconversioninvenModel=(TipoConversionInvenModel)this.jTableDatosTipoConversionInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoconversioninvenModel.tipoconversioninvens=this.tipoconversioninvenLogic.getTipoConversionInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoconversioninvenModel.tipoconversioninvens=this.tipoconversioninvens;
		}
		
		
		((TipoConversionInvenModel) this.jTableDatosTipoConversionInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoConversionInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoconversioninvenAnterior(),this.tipoconversioninvenLogic.getTipoConversionInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoconversioninvenAnterior(),this.tipoconversioninvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoConversionInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoConversionInven(TipoConversionInven tipoconversioninven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(tipoconversioninven.getConversionInvens());
					this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
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
										
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconversioninven,new Object(),generalEntityParameterGeneral,this.tipoconversioninvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoConversionInvenConstantesFunciones.getClassesRelationshipsOfTipoConversionInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoConversionInvenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoConversionInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoConversionInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoConversionInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoconversioninven,new Object(),generalEntityParameterGeneral,this.tipoconversioninvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoConversionInven(TipoConversionInvenBean tipoconversioninvenBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.setConversionInvens(tipoconversioninven.getConversionInvens());
					this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaConversionInven(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoConversionInven(ArrayList<Classe> classes,TipoConversionInvenReturnGeneral tipoconversioninvenReturnGeneral,TipoConversionInvenBean tipoconversioninvenBean,Boolean conDefault) throws Exception {
		
			this.tipoconversioninvenBean.setConversionInvens(tipoconversioninvenReturnGeneral.getTipoConversionInven().getConversionInvens());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoConversionInven(TipoConversionInven tipoconversioninven,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ConversionInven.class)) {
					tipoconversioninven.setConversionInvens(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenBeanSwingJInternalFrame.conversioninvenLogic.getConversionInvens());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoconversioninven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoConversionInven = new TipoConversionInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoconversioninvenSessionBean.getConGuardarRelaciones(),this.tipoconversioninvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.setVisible(false);
		this.jInternalFrameDetalleFormTipoConversionInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoConversionInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoConversionInven.tipoconversioninvenLogic=this.tipoconversioninvenLogic;
		
		this.cargarCombosFrameForeignKeyTipoConversionInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoConversionInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoConversionInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoConversionInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoConversionInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoConversionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConversionInven"));
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ModificarTipoConversionInven"));

		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConversionInven"));
					
		this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemModificarTipoConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoConversionInven"));
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConversionInven"));
						
		this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemActualizarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.addActionListener (new ButtonActionListener(this,"EliminarTipoConversionInven"));
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConversionInven"));
								
		this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemEliminarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CancelarTipoConversionInven"));
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConversionInven"));
					
		this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemCancelarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConversionInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemDetalleCerrarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConversionInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConversionInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConversionInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConversionInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonidTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtoncodigoTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonnombreTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConversionInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConversionInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoConversionInven"));
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoConversionInven"));
		}
		
		this.jTableDatosTipoConversionInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoConversionInven"));
		
		this.jTableDatosTipoConversionInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoConversionInven"));
		
		this.jButtonNuevoTipoConversionInven.addActionListener(new ButtonActionListener(this,"NuevoTipoConversionInven"));
		
		this.jButtonDuplicarTipoConversionInven.addActionListener(new ButtonActionListener(this,"DuplicarTipoConversionInven"));
		
		this.jButtonCopiarTipoConversionInven.addActionListener(new ButtonActionListener(this,"CopiarTipoConversionInven"));
		
		this.jButtonVerFormTipoConversionInven.addActionListener(new ButtonActionListener(this,"VerFormTipoConversionInven"));
		
		
		this.jButtonNuevoToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoConversionInven"));
			
		this.jButtonDuplicarToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoConversionInven"));
			
		this.jMenuItemNuevoTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoConversionInven"));
			
		this.jMenuItemDuplicarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoConversionInven"));		
		
		
		this.jButtonNuevoRelacionesTipoConversionInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoConversionInven"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoConversionInven"));
			
		this.jMenuItemNuevoRelacionesTipoConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoConversionInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ModificarTipoConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonModificarToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoConversionInven"));
			
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemModificarTipoConversionInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarTipoConversionInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonActualizarToolBarTipoConversionInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoConversionInven"));
				
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemActualizarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarTipoConversionInven.addActionListener (new ButtonActionListener(this,"EliminarTipoConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonEliminarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoConversionInven"));
						
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemEliminarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CancelarTipoConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonCancelarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoConversionInven"));
			
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemCancelarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoConversionInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoConversionInven"));		
		
		
		this.jButtonCerrarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CerrarTipoConversionInven"));
		
		
		this.jButtonCerrarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoConversionInven"));
			
		this.jMenuItemCerrarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoConversionInven"));
			
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jMenuItemDetalleCerrarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoConversionInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoConversionInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoConversionInven"));
		}
		
		this.jButtonCopiarToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoConversionInven"));
			
		this.jButtonVerFormToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoConversionInven"));
		
		this.jMenuItemGuardarCambiosTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoConversionInven"));
			
		this.jMenuItemCopiarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoConversionInven"));		
		
		this.jMenuItemVerFormTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoConversionInven"));		
		
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConversionInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoConversionInven"));
			
		this.jMenuItemGuardarCambiosTablaTipoConversionInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoConversionInven"));		
		
		
		
		this.jButtonRecargarInformacionTipoConversionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoConversionInven"));
					
		this.jButtonRecargarInformacionToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoConversionInven"));
		
		this.jMenuItemRecargarInformacionTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoConversionInven"));		
		
		
		
		this.jButtonAnterioresTipoConversionInven.addActionListener (new ButtonActionListener(this,"AnterioresTipoConversionInven"));
		
		
		this.jButtonAnterioresToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoConversionInven"));
		
		this.jMenuItemAnterioresTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoConversionInven"));		
		
		
		this.jButtonSiguientesTipoConversionInven.addActionListener (new ButtonActionListener(this,"SiguientesTipoConversionInven"));
		
		
		this.jButtonSiguientesToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoConversionInven"));
			
		this.jMenuItemSiguientesTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoConversionInven"));
			
		this.jMenuItemAbrirOrderByTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoConversionInven"));
			
		this.jMenuItemMostrarOcultarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoConversionInven"));
			
		this.jMenuItemDetalleAbrirOrderByTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoConversionInven"));
			
		this.jMenuItemDetalleMostarOcultarTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoConversionInven"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoConversionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoConversionInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoConversionInven"));
			
		this.jMenuItemNuevoGuardarCambiosTipoConversionInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoConversionInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoConversionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoConversionInven"));

		this.jCheckBoxSeleccionadosTipoConversionInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoConversionInven"));
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoConversionInven"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoConversionInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoConversionInven"));
			
		this.jComboBoxTiposAccionesTipoConversionInven.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoConversionInven"));
					
		this.jComboBoxTiposSeleccionarTipoConversionInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoConversionInven"));
			
		this.jTextFieldValorCampoGeneralTipoConversionInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoConversionInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonidTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtoncodigoTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonnombreTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConversionInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoConversionInven.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoConversionInven"));

			this.jButtonBusquedaPorNombreTipoConversionInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoConversionInven"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoConversionInven!=null) {
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConversionInven"));
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConversionInven"));
				this.jInternalFrameReporteDinamicoTipoConversionInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConversionInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoConversionInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoConversionInven"));				
			//this.jButtonGenerarReporteDinamicoTipoConversionInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoConversionInven"));
			//this.jButtonGenerarExcelReporteDinamicoTipoConversionInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoConversionInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoConversionInven!=null) {
				this.jInternalFrameImportacionTipoConversionInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoConversionInven"));
				this.jInternalFrameImportacionTipoConversionInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoConversionInven"));
				this.jInternalFrameImportacionTipoConversionInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoConversionInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoConversionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoConversionInven"));
			
			this.jButtonAbrirOrderByToolBarTipoConversionInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoConversionInven"));			
			
			if(this.jInternalFrameOrderByTipoConversionInven!=null) {
				this.jInternalFrameOrderByTipoConversionInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoConversionInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoConversionInven.jTabbedPaneRelacionesTipoConversionInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoConversionInven"));
		
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
            		closingInternalFrameTipoConversionInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoConversionInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoConversionInven = (JInternalFrameBase)event.getSource();
	            	
	            TipoConversionInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoConversionInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoConversionInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoConversionInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoConversionInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoConversionInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoConversionInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoConversionInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoConversionInven";
		inputMap = this.jButtonNuevoTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConversionInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoConversionInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoConversionInven";
		inputMap = this.jButtonNuevoRelacionesTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoConversionInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoConversionInven";
		inputMap = this.jButtonModificarTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoConversionInven";
		inputMap = this.jButtonActualizarTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoConversionInven";
		inputMap = this.jButtonEliminarTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoConversionInven";
		inputMap = this.jButtonCancelarTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoConversionInven";
		inputMap = this.jButtonCerrarTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoConversionInven";
		inputMap = this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonGuardarCambiosTipoConversionInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoConversionInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoConversionInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoConversionInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoConversionInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoConversionInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonidTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoConversionInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonid_empresaTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtoncodigoTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoConversionInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoConversionInven.jButtonnombreTipoConversionInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoConversionInvenBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoConversionInven.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoConversionInven"));

		this.jButtonBusquedaPorNombreTipoConversionInven.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoConversionInven"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoConversionInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoConversionInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoConversionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoConversionInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoConversionInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
					tipoconversioninvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvens) {
					tipoconversioninvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoConversionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
						tipoconversioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvens) {
						tipoconversioninvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConversionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConversionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoConversionInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoConversionInven.getSelectedRows();
			
			TipoConversionInven tipoconversioninvenLocal=new TipoConversionInven();
			
			//this.seleccionarTodosTipoConversionInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoconversioninvenLocal =(TipoConversionInven) this.tipoconversioninvenLogic.getTipoConversionInvens().toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoconversioninvenLocal =(TipoConversionInven) this.tipoconversioninvens.toArray()[this.jTableDatosTipoConversionInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoconversioninvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
						tipoconversioninvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvens) {
						tipoconversioninvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoConversionInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoConversionInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoConversionInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoConversionInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoConversionInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoConversionInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoConversionInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvenLogic.getTipoConversionInvens()) {
				
						if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconversioninvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconversioninvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvens) {
					
						if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoconversioninvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoconversioninvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoConversionInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoConversionInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoConversionInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoConversionInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoConversionInven) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoConversionInven(conSplash);
				
					this.generarReporteTipoConversionInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoConversionInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConversionInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoConversionInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConversionInven();
				
				this.exportarTipoConversionInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoConversionInvens();
				//this.importarTipoConversionInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoConversionInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoConversionInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoConversionInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoConversionInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoConversionInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoConversionInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoConversionInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoConversionInven(conSplash);
					
						//this.actualizarParametrosGeneralTipoConversionInven();
						
						this.generarReporteProcesoAccionTipoConversionInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoConversionInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Conversion InvenES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Conversion Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoConversionInven();
				
						this.actualizarParametrosGeneralTipoConversionInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoconversioninvenReturnGeneral=tipoconversioninvenLogic.procesarAccionTipoConversionInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoconversioninvenLogic.getTipoConversionInvens(),this.tipoconversioninvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoConversionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoConversionInven();
					
					TipoConversionInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoConversionInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoConversionInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxTiposAccionesFormularioTipoConversionInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoConversionInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoConversionInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoConversionInven();
			
			if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
			TipoConversionInven tipoconversioninven=new TipoConversionInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoConversionInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoConversionInven.getSelectedItem();
			
			
			
			
			tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoconversioninvensSeleccionados.size()==1) {
				for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
					tipoconversioninven=tipoconversioninvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Conversion Inven")) {
					jButtonConversionInvenActionPerformed(null,rowIndex,true,false,tipoconversioninven);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoConversionInven();
			
      		//this.finishProcessTipoConversionInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoConversionInvenReturnGeneral() throws Exception {
		if(this.tipoconversioninvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoconversioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoconversioninvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoconversioninvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoconversioninvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoconversioninvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoConversionInven(false);
		}
		
		if(this.tipoconversioninvenReturnGeneral.getConRetornoLista() || this.tipoconversioninvenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoconversioninvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconversioninvenLogic.setTipoConversionInvens(this.tipoconversioninvenReturnGeneral.getTipoConversionInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoconversioninvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoconversioninvenLogic.setTipoConversionInven(this.tipoconversioninvenReturnGeneral.getTipoConversionInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoConversionInven(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoConversionInven() throws Exception {
		
		
	}
	
	public ArrayList<TipoConversionInven> getTipoConversionInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoConversionInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvenLogic.getTipoConversionInvens()) {
					if(tipoconversioninvenAux.getIsSelected()) {
						tipoconversioninvensSeleccionados.add(tipoconversioninvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoConversionInven tipoconversioninvenAux:this.tipoconversioninvens) {
					if(tipoconversioninvenAux.getIsSelected()) {
						tipoconversioninvensSeleccionados.add(tipoconversioninvenAux);				
					}
				}
			}
			
			if(tipoconversioninvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoconversioninvensSeleccionados.addAll(this.tipoconversioninvenLogic.getTipoConversionInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoconversioninvensSeleccionados.addAll(this.tipoconversioninvens);				
					}
				}
			}
		} else {
			tipoconversioninvensSeleccionados.add(this.tipoconversioninven);
		}
		
		return tipoconversioninvensSeleccionados;
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
	
	public void generarReporteTipoConversionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoConversionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoConversionInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConversionInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoConversionInvensSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoConversionInvensSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Conversion Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoConversionInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoConversionInven();
		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoConversionInven();
		
		
		//this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados ,tipoconversioninvenImplementable,tipoconversioninvenImplementableHome);
	}
	
	public void mostrarImportacionTipoConversionInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoConversionInven();
		
		this.abrirFrameImportacionTipoConversionInven();		
		
			
		//this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados ,tipoconversioninvenImplementable,tipoconversioninvenImplementableHome);
	}
	
	public void importarTipoConversionInvens() throws Exception {		
	
	}
	
	public void exportarTipoConversionInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoConversionInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoConversionInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoConversionInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Conversion Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoConversionInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoConversionInven(tipoconversioninvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoconversioninvenAux.setsDetalleGeneralEntityReporte(tipoconversioninvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoConversionInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoConversionInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConversionInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConversionInvenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoConversionInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoConversionInven(TipoConversionInven tipoconversioninven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoconversioninven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconversioninven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconversioninven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconversioninven.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoconversioninven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoConversionInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoConversionInven(row);				
				iRow++;
			}				
			
			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoConversionInven(tipoconversioninvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoConversionInvensSeleccionados() throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();		
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoconversioninven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoconversioninvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoconversioninven");
			//elementRoot.appendChild(element);
		
			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
				element = document.createElement("tipoconversioninven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoConversionInven(tipoconversioninvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Conversion Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoConversionInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoConversionInven(TipoConversionInven tipoconversioninven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconversioninven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconversioninven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconversioninven.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoconversioninven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoConversionInven(TipoConversionInven tipoconversioninven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoConversionInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoconversioninven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoConversionInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoconversioninven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoConversionInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoconversioninven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoConversionInvenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoconversioninven.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoConversionInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoconversioninven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoConversionInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados=new ArrayList<TipoConversionInven>();
		
		tipoconversioninvensSeleccionados=this.getTipoConversionInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoConversionInven(tipoconversioninvensSeleccionados);
		
		this.generarReporteTipoConversionInvens("Todos",tipoconversioninvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoConversionInven(ArrayList<TipoConversionInven> tipoconversioninvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoConversionInven tipoconversioninvenAux:tipoconversioninvensSeleccionados) {
				tipoconversioninvenAux.setsDetalleGeneralEntityReporte(tipoconversioninvenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoconversioninvenAux.setsDescripcionGeneralEntityReporte1(tipoconversioninvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoconversioninvenAux.setsDescripcionGeneralEntityReporte1(tipoconversioninvenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoConversionInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoconversioninvenAux.setsDescripcionGeneralEntityReporte1(tipoconversioninvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoConversionInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoConversionInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoConversionInven=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=true;
				this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=true;
			}
			
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=true;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=true;
			this.isVisibilidadCeldaEliminarTipoConversionInven=true;
			this.isVisibilidadCeldaCancelarTipoConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=true;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=true;
			this.isVisibilidadCeldaModificarTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
			this.isVisibilidadCeldaModificarTipoConversionInven=true;
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
			this.isVisibilidadCeldaCancelarTipoConversionInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoConversionInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoConversionInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoConversionInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=true;
		} else {
			this.actualizarEstadoPanelsTipoConversionInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoConversionInven=false;
			//this.isVisibilidadCeldaVerFormTipoConversionInven=false;
			this.isVisibilidadCeldaDuplicarTipoConversionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoconversioninvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoConversionInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!tipoconversioninvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;												
			}
			
			this.jButtonCerrarTipoConversionInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoConversionInven=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoconversioninven)) {
			this.isVisibilidadCeldaActualizarTipoConversionInven=false;
			this.isVisibilidadCeldaEliminarTipoConversionInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoConversionInven() {
		this.isVisibilidadCeldaNuevoTipoConversionInven=false;
		this.isVisibilidadCeldaGuardarCambiosTipoConversionInven=false;
	}
	
	public void actualizarEstadoPanelsTipoConversionInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoConversionInven!=null) {
				this.jScrollPanelDatosEdicionTipoConversionInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoConversionInven!=null) {
				this.jScrollPanelDatosTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoConversionInven!=null) {
				this.jPanelPaginacionTipoConversionInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
					this.jTabbedPaneBusquedasTipoConversionInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoconversioninvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoConversionInven!=null) {
				this.jTabbedPaneBusquedasTipoConversionInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoConversionInven!=null) {
				this.jPanelParametrosReportesTipoConversionInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoConversionInven.remove(jPanelBusquedaPorCodigoTipoConversionInven);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoConversionInven.remove(jPanelBusquedaPorNombreTipoConversionInven);}
		}
		
	}
	
	

	public String registrarSesionTipoConversionInvenParaConversionInvenes() throws Exception {
		Boolean isPaginaPopupConversionInven=false;

		try {

			if(this.tipoconversioninvenSessionBean==null) {
				this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean==null) {
				this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean=new ConversionInvenSessionBean();
			}

			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setsPathNavegacionActual(tipoconversioninvenSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ConversionInvenConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupConversionInven=this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeConversionInven(true);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeConversionInven(TipoConversionInvenConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setisBusquedaDesdeForeignKeySesionTipoConversionInven(true);
			this.jInternalFrameDetalleFormTipoConversionInven.conversioninvenSessionBean.setlidTipoConversionInvenActual(this.idTipoConversionInvenActual);

			tipoconversioninvenSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoConversionInven(true);
			tipoconversioninvenSessionBean.setlIdTipoConversionInvenActualForeignKey(this.idTipoConversionInvenActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoConversionInvenSessionBean tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		
		if(this.tipoconversioninvenSessionBean==null) {
			this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		}
		
		this.tipoconversioninvenSessionBean.setsUltimaBusquedaTipoConversionInven(this.getsAccionBusqueda());
		this.tipoconversioninvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoconversioninvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipoconversioninvenSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoconversioninvenSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoconversioninvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoConversionInvenSessionBean tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		
		if(this.tipoconversioninvenSessionBean==null) {
			this.tipoconversioninvenSessionBean=new TipoConversionInvenSessionBean();
		}
		
		if(this.tipoconversioninvenSessionBean.getsUltimaBusquedaTipoConversionInven()!=null&&!this.tipoconversioninvenSessionBean.getsUltimaBusquedaTipoConversionInven().equals("")) {
			this.setsAccionBusqueda(tipoconversioninvenSessionBean.getsUltimaBusquedaTipoConversionInven());
			this.setiNumeroPaginacion(tipoconversioninvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoconversioninvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipoconversioninvenSessionBean.getcodigo());
				tipoconversioninvenSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoconversioninvenSessionBean.getnombre());
				tipoconversioninvenSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoconversioninvenSessionBean.getid_empresa());
				tipoconversioninvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoconversioninvenSessionBean.setsUltimaBusquedaTipoConversionInven("");
		this.tipoconversioninvenSessionBean.setiNumeroPaginacion(TipoConversionInvenConstantesFunciones.INUMEROPAGINACION);
		this.tipoconversioninvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoConversionInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoConversionInven() {
		this.updateBorderResaltarBusquedasFormularioTipoConversionInven();
		this.updateVisibilidadBusquedasFormularioTipoConversionInven();
		this.updateHabilitarBusquedasFormularioTipoConversionInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoConversionInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoConversionInven.getComponents().length>0) {
	

		if(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorCodigoTipoConversionInven!=null) {
			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConversionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
				jPanel.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorCodigoTipoConversionInven);
			}
		}

		if(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorNombreTipoConversionInven!=null) {
			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoConversionInven);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
				jPanel.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorNombreTipoConversionInven);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoConversionInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoConversionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConversionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarBusquedaPorCodigoTipoConversionInven);
			if(!this.tipoconversioninvenConstantesFunciones.mostrarBusquedaPorCodigoTipoConversionInven && index>-1) {
				this.jTabbedPaneBusquedasTipoConversionInven.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoConversionInven);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarBusquedaPorNombreTipoConversionInven);
			if(!this.tipoconversioninvenConstantesFunciones.mostrarBusquedaPorNombreTipoConversionInven && index>-1) {
				this.jTabbedPaneBusquedasTipoConversionInven.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoConversionInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoConversionInven.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConversionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoconversioninvenConstantesFunciones.activarBusquedaPorCodigoTipoConversionInven);
				this.jTabbedPaneBusquedasTipoConversionInven.setEnabledAt(index,this.tipoconversioninvenConstantesFunciones.activarBusquedaPorCodigoTipoConversionInven);
			}

			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoConversionInven);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoconversioninvenConstantesFunciones.activarBusquedaPorNombreTipoConversionInven);
				this.jTabbedPaneBusquedasTipoConversionInven.setEnabledAt(index,this.tipoconversioninvenConstantesFunciones.activarBusquedaPorNombreTipoConversionInven);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoConversionInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorCodigoTipoConversionInven);

			this.jTabbedPaneBusquedasTipoConversionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);

			this.tipoconversioninvenConstantesFunciones.setResaltarBusquedaPorCodigoTipoConversionInven(resaltar);

			jPanel.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorCodigoTipoConversionInven);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoConversionInven.indexOfComponent(this.jPanelBusquedaPorNombreTipoConversionInven);

			this.jTabbedPaneBusquedasTipoConversionInven.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoConversionInven.getComponent(index);

			this.tipoconversioninvenConstantesFunciones.setResaltarBusquedaPorNombreTipoConversionInven(resaltar);

			jPanel.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarBusquedaPorNombreTipoConversionInven);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoConversionInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoConversionInven() throws Exception {

		if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoConversionInven();
		this.updateVisibilidadResaltarControlesFormularioTipoConversionInven();
		this.updateHabilitarResaltarControlesFormularioTipoConversionInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoConversionInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoconversioninvenConstantesFunciones.resaltaridTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven!=null) {this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setBorder(this.tipoconversioninvenConstantesFunciones.resaltaridTipoConversionInven);}
		if(this.tipoconversioninvenConstantesFunciones.resaltarid_empresaTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven!=null) {this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarid_empresaTipoConversionInven);}
		if(this.tipoconversioninvenConstantesFunciones.resaltarcodigoTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven!=null) {this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarcodigoTipoConversionInven);}
		if(this.tipoconversioninvenConstantesFunciones.resaltarnombreTipoConversionInven!=null && this.jInternalFrameDetalleFormTipoConversionInven!=null) {this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setBorder(this.tipoconversioninvenConstantesFunciones.resaltarnombreTipoConversionInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoConversionInven() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
	
		//this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostraridTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jPanelidTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostraridTipoConversionInven);
		//this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarid_empresaTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jPanelid_empresaTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarid_empresaTipoConversionInven);
		//this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarcodigoTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jPanelcodigoTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarcodigoTipoConversionInven);
		//this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarnombreTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jPanelnombreTipoConversionInven.setVisible(this.tipoconversioninvenConstantesFunciones.mostrarnombreTipoConversionInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoConversionInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoConversionInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoConversionInven!=null) {
	
		this.jInternalFrameDetalleFormTipoConversionInven.jLabelidTipoConversionInven.setEnabled(this.tipoconversioninvenConstantesFunciones.activaridTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jComboBoxid_empresaTipoConversionInven.setEnabled(this.tipoconversioninvenConstantesFunciones.activarid_empresaTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jTextFieldcodigoTipoConversionInven.setEnabled(this.tipoconversioninvenConstantesFunciones.activarcodigoTipoConversionInven);
		this.jInternalFrameDetalleFormTipoConversionInven.jTextAreanombreTipoConversionInven.setEnabled(this.tipoconversioninvenConstantesFunciones.activarnombreTipoConversionInven);
		}
	}
	
		
}