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

import com.bydan.erp.inventario.util.TipoFormaPagoInvenConstantesFunciones;
import com.bydan.erp.inventario.util.TipoFormaPagoInvenParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoFormaPagoInvenParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoFormaPagoInvenBean;
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
public class TipoFormaPagoInvenBeanSwingJInternalFrame extends TipoFormaPagoInvenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFormaPagoInvenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFormaPagoInven> tipoformapagoinvenValidator = new ClassValidator<TipoFormaPagoInven>(TipoFormaPagoInven.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFormaPagoInven tipoformapagoinven;	
	public TipoFormaPagoInven tipoformapagoinvenAux;
	public TipoFormaPagoInven tipoformapagoinvenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFormaPagoInven tipoformapagoinvenTotales;
	public Long idTipoFormaPagoInvenActual;
	public Long iIdNuevoTipoFormaPagoInven=0L;
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
	
	public Boolean isPermisoTodoTipoFormaPagoInven;
	public Boolean isPermisoNuevoTipoFormaPagoInven;
	public Boolean isPermisoActualizarTipoFormaPagoInven;
	public Boolean isPermisoActualizarOriginalTipoFormaPagoInven;
	public Boolean isPermisoEliminarTipoFormaPagoInven;
	public Boolean isPermisoGuardarCambiosTipoFormaPagoInven;
	public Boolean isPermisoConsultaTipoFormaPagoInven;
	public Boolean isPermisoBusquedaTipoFormaPagoInven;
	public Boolean isPermisoReporteTipoFormaPagoInven;
	public Boolean isPermisoPaginacionMedioTipoFormaPagoInven;
	public Boolean isPermisoPaginacionAltoTipoFormaPagoInven;
	public Boolean isPermisoPaginacionTodoTipoFormaPagoInven;
	public Boolean isPermisoCopiarTipoFormaPagoInven;
	public Boolean isPermisoVerFormTipoFormaPagoInven;
	public Boolean isPermisoDuplicarTipoFormaPagoInven;
	public Boolean isPermisoOrdenTipoFormaPagoInven;
	
	
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
	
	public TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenReturnGeneral;
	public TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFormaPagoInven=false;
	public Boolean esParaAccionDesdeFormularioTipoFormaPagoInven=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoFormaPagoInvenSessionBeanAdditional tipoformapagoinvenSessionBeanAdditional=null;
	
	public TipoFormaPagoInvenSessionBeanAdditional getTipoFormaPagoInvenSessionBeanAdditional() {
		return this.tipoformapagoinvenSessionBeanAdditional;
	}
	
	public void setTipoFormaPagoInvenSessionBeanAdditional(TipoFormaPagoInvenSessionBeanAdditional tipoformapagoinvenSessionBeanAdditional) {
		try {
			this.tipoformapagoinvenSessionBeanAdditional=tipoformapagoinvenSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoFormaPagoInvenBeanSwingJInternalFrameAdditional tipoformapagoinvenBeanSwingJInternalFrameAdditional=null;
	//public class TipoFormaPagoInvenBeanSwingJInternalFrame
	
	public TipoFormaPagoInvenBeanSwingJInternalFrameAdditional getTipoFormaPagoInvenBeanSwingJInternalFrameAdditional() {
		return this.tipoformapagoinvenBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoFormaPagoInvenBeanSwingJInternalFrameAdditional(TipoFormaPagoInvenBeanSwingJInternalFrameAdditional tipoformapagoinvenBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoformapagoinvenBeanSwingJInternalFrameAdditional=tipoformapagoinvenBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFormaPagoInvenLogic tipoformapagoinvenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFormaPagoInven tipoformapagoinvenBean;
	public TipoFormaPagoInvenConstantesFunciones tipoformapagoinvenConstantesFunciones;
	//public TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoFormaPagoInven> tipoformapagoinvens;	
	//public List<TipoFormaPagoInven> tipoformapagoinvensEliminados;
	//public List<TipoFormaPagoInven> tipoformapagoinvensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFormaPagoInven=true;
	public Boolean isVisibilidadCeldaCopiarTipoFormaPagoInven=true;
	public Boolean isVisibilidadCeldaVerFormTipoFormaPagoInven=true;
	public Boolean isVisibilidadCeldaOrdenTipoFormaPagoInven=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaModificarTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaCancelarTipoFormaPagoInven=false;
	public Boolean isVisibilidadCeldaGuardarTipoFormaPagoInven=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoFormaPagoInven() {
		return this.iIdNuevoTipoFormaPagoInven;
	}

	public void setiIdNuevoTipoFormaPagoInven(Long iIdNuevoTipoFormaPagoInven) {
		this.iIdNuevoTipoFormaPagoInven = iIdNuevoTipoFormaPagoInven;
	}
	
	public Long getidTipoFormaPagoInvenActual() {
		return this.idTipoFormaPagoInvenActual;
	}

	public void setidTipoFormaPagoInvenActual(Long idTipoFormaPagoInvenActual) {
		this.idTipoFormaPagoInvenActual = idTipoFormaPagoInvenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFormaPagoInven gettipoformapagoinven() {
		return this.tipoformapagoinven;
	}

	public void settipoformapagoinven(TipoFormaPagoInven tipoformapagoinven) {
		this.tipoformapagoinven = tipoformapagoinven;
	}
	
	public TipoFormaPagoInven gettipoformapagoinvenAux() {
		return this.tipoformapagoinvenAux;
	}

	public void settipoformapagoinvenAux(TipoFormaPagoInven tipoformapagoinvenAux) {
		this.tipoformapagoinvenAux = tipoformapagoinvenAux;
	}				
	
	public TipoFormaPagoInven gettipoformapagoinvenAnterior() {
		return this.tipoformapagoinvenAnterior;
	}

	public void settipoformapagoinvenAnterior(TipoFormaPagoInven tipoformapagoinvenAnterior) {
		this.tipoformapagoinvenAnterior = tipoformapagoinvenAnterior;
	}	
	
	public TipoFormaPagoInven gettipoformapagoinvenTotales() {
		return this.tipoformapagoinvenTotales;
	}

	public void settipoformapagoinvenTotales(TipoFormaPagoInven tipoformapagoinvenTotales) {
		this.tipoformapagoinvenTotales = tipoformapagoinvenTotales;
	}	
	
	public TipoFormaPagoInven gettipoformapagoinvenBean() {
		return this.tipoformapagoinvenBean;
	}

	public void settipoformapagoinvenBean(TipoFormaPagoInven tipoformapagoinvenBean) {
		this.tipoformapagoinvenBean = tipoformapagoinvenBean;
	}	
	
	public TipoFormaPagoInvenParameterReturnGeneral gettipoformapagoinvenReturnGeneral() {
		return this.tipoformapagoinvenReturnGeneral;
	}

	public void settipoformapagoinvenReturnGeneral(TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenReturnGeneral) {
		this.tipoformapagoinvenReturnGeneral = tipoformapagoinvenReturnGeneral;
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
	
	
	public TipoFormaPagoInvenLogic getTipoFormaPagoInvenLogic()	{		
		return tipoformapagoinvenLogic;
	}

	public void setTipoFormaPagoInvenLogic(TipoFormaPagoInvenLogic tipoformapagoinvenLogic) {
		this.tipoformapagoinvenLogic = tipoformapagoinvenLogic;
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
	
	public Boolean getIsEsNuevoTipoFormaPagoInven() {
		return isEsNuevoTipoFormaPagoInven;
	}

	public void setIsEsNuevoTipoFormaPagoInven(Boolean isEsNuevoTipoFormaPagoInven) {
		this.isEsNuevoTipoFormaPagoInven = isEsNuevoTipoFormaPagoInven;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFormaPagoInven() {
		return esParaAccionDesdeFormularioTipoFormaPagoInven;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFormaPagoInven(Boolean esParaAccionDesdeFormularioTipoFormaPagoInven) {
		this.esParaAccionDesdeFormularioTipoFormaPagoInven = esParaAccionDesdeFormularioTipoFormaPagoInven;
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

			if(this.tipoformapagoinvenSessionBean==null) {
				this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
			}

			if(!this.tipoformapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipoformapagoinvenSessionBean.getlidEmpresaActual());
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

					if(this.tipoformapagoinven!=null) {
						this.tipoformapagoinven.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
						this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoFormaPagoInven.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
						if(this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoFormaPagoInvenGenerico)throws Exception
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
				jComboBoxid_empresaTipoFormaPagoInvenGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoFormaPagoInvenGenerico!=null && jComboBoxid_empresaTipoFormaPagoInvenGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoFormaPagoInvenGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoFormaPagoInven tipoformapagoinven,JComboBox jComboBoxid_empresaTipoFormaPagoInvenGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoFormaPagoInvenGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoFormaPagoInvenGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipoformapagoinven.setid_empresa(empresaAux.getId());
				tipoformapagoinven.setempresa_descripcion(TipoFormaPagoInvenConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipoformapagoinven.setEmpresa(empresaAux);			}
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

					if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { 
							this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { 
					}

					if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
							this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoFormaPagoInven() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFormaPagoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormaPagoInven(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFormaPagoInvenConstantesFunciones.refrescarForeignKeysDescripcionesTipoFormaPagoInven(this.tipoformapagoinvens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoformapagoinvenLogic.setTipoFormaPagoInvens(this.tipoformapagoinvens);
			tipoformapagoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFormaPagoInvenParameterReturnGeneral getTipoFormaPagoInvenParameterGeneral() {
		return this.tipoformapagoinvenParameterGeneral;
	}
	
	public void setTipoFormaPagoInvenParameterGeneral(TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenParameterGeneral) {
		this.tipoformapagoinvenParameterGeneral = tipoformapagoinvenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFormaPagoInven() {
		return isPermisoTodoTipoFormaPagoInven;
	}

	public void setIsPermisoTodoTipoFormaPagoInven(Boolean isPermisoTodoTipoFormaPagoInven) {
		this.isPermisoTodoTipoFormaPagoInven = isPermisoTodoTipoFormaPagoInven;
	}

	public Boolean getIsPermisoNuevoTipoFormaPagoInven() {
		return isPermisoNuevoTipoFormaPagoInven;
	}

	public void setIsPermisoNuevoTipoFormaPagoInven(Boolean isPermisoNuevoTipoFormaPagoInven) {
		this.isPermisoNuevoTipoFormaPagoInven = isPermisoNuevoTipoFormaPagoInven;
	}

	public Boolean getIsPermisoActualizarTipoFormaPagoInven() {
		return isPermisoActualizarTipoFormaPagoInven;
	}

	public void setIsPermisoActualizarTipoFormaPagoInven(Boolean isPermisoActualizarTipoFormaPagoInven) {
		this.isPermisoActualizarTipoFormaPagoInven = isPermisoActualizarTipoFormaPagoInven;
	}

	public Boolean getIsPermisoEliminarTipoFormaPagoInven() {
		return isPermisoEliminarTipoFormaPagoInven;
	}

	public void setIsPermisoEliminarTipoFormaPagoInven(Boolean isPermisoEliminarTipoFormaPagoInven) {
		this.isPermisoEliminarTipoFormaPagoInven = isPermisoEliminarTipoFormaPagoInven;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFormaPagoInven() {
		return isPermisoGuardarCambiosTipoFormaPagoInven;
	}

	public void setIsPermisoGuardarCambiosTipoFormaPagoInven(Boolean isPermisoGuardarCambiosTipoFormaPagoInven) {
		this.isPermisoGuardarCambiosTipoFormaPagoInven = isPermisoGuardarCambiosTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoConsultaTipoFormaPagoInven() {
		return isPermisoConsultaTipoFormaPagoInven;
	}

	public void setIsPermisoConsultaTipoFormaPagoInven(Boolean isPermisoConsultaTipoFormaPagoInven) {
		this.isPermisoConsultaTipoFormaPagoInven = isPermisoConsultaTipoFormaPagoInven;
	}

	public Boolean getIsPermisoBusquedaTipoFormaPagoInven() {
		return isPermisoBusquedaTipoFormaPagoInven;
	}

	public void setIsPermisoBusquedaTipoFormaPagoInven(Boolean isPermisoBusquedaTipoFormaPagoInven) {
		this.isPermisoBusquedaTipoFormaPagoInven = isPermisoBusquedaTipoFormaPagoInven;
	}

	public Boolean getIsPermisoReporteTipoFormaPagoInven() {
		return isPermisoReporteTipoFormaPagoInven;
	}

	public void setIsPermisoReporteTipoFormaPagoInven(Boolean isPermisoReporteTipoFormaPagoInven) {
		this.isPermisoReporteTipoFormaPagoInven = isPermisoReporteTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFormaPagoInven() {
		return isPermisoPaginacionMedioTipoFormaPagoInven;
	}

	public void setIsPermisoPaginacionMedioTipoFormaPagoInven(Boolean isPermisoPaginacionMedioTipoFormaPagoInven) {
		this.isPermisoPaginacionMedioTipoFormaPagoInven = isPermisoPaginacionMedioTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFormaPagoInven() {
		return isPermisoPaginacionTodoTipoFormaPagoInven;
	}

	public void setIsPermisoPaginacionTodoTipoFormaPagoInven(Boolean isPermisoPaginacionTodoTipoFormaPagoInven) {
		this.isPermisoPaginacionTodoTipoFormaPagoInven = isPermisoPaginacionTodoTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFormaPagoInven() {
		return isPermisoPaginacionAltoTipoFormaPagoInven;
	}

	public void setIsPermisoPaginacionAltoTipoFormaPagoInven(Boolean isPermisoPaginacionAltoTipoFormaPagoInven) {
		this.isPermisoPaginacionAltoTipoFormaPagoInven = isPermisoPaginacionAltoTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoCopiarTipoFormaPagoInven() {
		return isPermisoCopiarTipoFormaPagoInven;
	}

	public void setIsPermisoCopiarTipoFormaPagoInven(Boolean isPermisoCopiarTipoFormaPagoInven) {
		this.isPermisoCopiarTipoFormaPagoInven = isPermisoCopiarTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoVerFormTipoFormaPagoInven() {
		return isPermisoVerFormTipoFormaPagoInven;
	}

	public void setIsPermisoVerFormTipoFormaPagoInven(Boolean isPermisoVerFormTipoFormaPagoInven) {
		this.isPermisoVerFormTipoFormaPagoInven = isPermisoVerFormTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoDuplicarTipoFormaPagoInven() {
		return isPermisoDuplicarTipoFormaPagoInven;
	}

	public void setIsPermisoDuplicarTipoFormaPagoInven(Boolean isPermisoDuplicarTipoFormaPagoInven) {
		this.isPermisoDuplicarTipoFormaPagoInven = isPermisoDuplicarTipoFormaPagoInven;
	}
	
	public Boolean getIsPermisoOrdenTipoFormaPagoInven() {
		return isPermisoOrdenTipoFormaPagoInven;
	}

	public void setIsPermisoOrdenTipoFormaPagoInven(Boolean isPermisoOrdenTipoFormaPagoInven) {
		this.isPermisoOrdenTipoFormaPagoInven = isPermisoOrdenTipoFormaPagoInven;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFormaPagoInven() {
		return isVisibilidadCeldaNuevoTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaNuevoTipoFormaPagoInven(Boolean isVisibilidadCeldaNuevoTipoFormaPagoInven) {
		this.isVisibilidadCeldaNuevoTipoFormaPagoInven = isVisibilidadCeldaNuevoTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFormaPagoInven() {
		return isVisibilidadCeldaDuplicarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFormaPagoInven(Boolean isVisibilidadCeldaDuplicarTipoFormaPagoInven) {
		this.isVisibilidadCeldaDuplicarTipoFormaPagoInven = isVisibilidadCeldaDuplicarTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFormaPagoInven() {
		return isVisibilidadCeldaCopiarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaCopiarTipoFormaPagoInven(Boolean isVisibilidadCeldaCopiarTipoFormaPagoInven) {
		this.isVisibilidadCeldaCopiarTipoFormaPagoInven = isVisibilidadCeldaCopiarTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFormaPagoInven() {
		return isVisibilidadCeldaVerFormTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaVerFormTipoFormaPagoInven(Boolean isVisibilidadCeldaVerFormTipoFormaPagoInven) {
		this.isVisibilidadCeldaVerFormTipoFormaPagoInven = isVisibilidadCeldaVerFormTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFormaPagoInven() {
		return isVisibilidadCeldaOrdenTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaOrdenTipoFormaPagoInven(Boolean isVisibilidadCeldaOrdenTipoFormaPagoInven) {
		this.isVisibilidadCeldaOrdenTipoFormaPagoInven = isVisibilidadCeldaOrdenTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven() {
		return isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven(Boolean isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven = isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFormaPagoInven() {
		return isVisibilidadCeldaModificarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaModificarTipoFormaPagoInven(Boolean isVisibilidadCeldaModificarTipoFormaPagoInven) {
		this.isVisibilidadCeldaModificarTipoFormaPagoInven = isVisibilidadCeldaModificarTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFormaPagoInven() {
		return isVisibilidadCeldaActualizarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaActualizarTipoFormaPagoInven(Boolean isVisibilidadCeldaActualizarTipoFormaPagoInven) {
		this.isVisibilidadCeldaActualizarTipoFormaPagoInven = isVisibilidadCeldaActualizarTipoFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFormaPagoInven() {
		return isVisibilidadCeldaEliminarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaEliminarTipoFormaPagoInven(Boolean isVisibilidadCeldaEliminarTipoFormaPagoInven) {
		this.isVisibilidadCeldaEliminarTipoFormaPagoInven = isVisibilidadCeldaEliminarTipoFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFormaPagoInven() {
		return isVisibilidadCeldaCancelarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaCancelarTipoFormaPagoInven(Boolean isVisibilidadCeldaCancelarTipoFormaPagoInven) {
		this.isVisibilidadCeldaCancelarTipoFormaPagoInven = isVisibilidadCeldaCancelarTipoFormaPagoInven;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFormaPagoInven() {
		return isVisibilidadCeldaGuardarTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaGuardarTipoFormaPagoInven(Boolean isVisibilidadCeldaGuardarTipoFormaPagoInven) {
		this.isVisibilidadCeldaGuardarTipoFormaPagoInven = isVisibilidadCeldaGuardarTipoFormaPagoInven;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFormaPagoInven() {
		return isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFormaPagoInven(Boolean isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven) {
		this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven = isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven;
	}
		
	public TipoFormaPagoInvenSessionBean gettipoformapagoinvenSessionBean() {
		return this.tipoformapagoinvenSessionBean;
	}
	
	public void settipoformapagoinvenSessionBean(TipoFormaPagoInvenSessionBean tipoformapagoinvenSessionBean) {
		this.tipoformapagoinvenSessionBean=tipoformapagoinvenSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipoformapagoinven,null);
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
	
	public void bugActualizarReferenciaActual(TipoFormaPagoInven tipoformapagoinven,TipoFormaPagoInven tipoformapagoinvenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFormaPagoInven(tipoformapagoinven);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoformapagoinvenAux.setId(tipoformapagoinven.getId());
		tipoformapagoinvenAux.setVersionRow(tipoformapagoinven.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFormaPagoInven();
		
			int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoformapagoinvenValidator.getInvalidValues(this.tipoformapagoinven);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoformapagoinvenLogic.setDatosCliente(datosCliente);
			tipoformapagoinvenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoformapagoinvenAux=new  TipoFormaPagoInven();
				
				tipoformapagoinvenAux.setIsNew(true);
				tipoformapagoinvenAux.setIsChanged(true);
				
				tipoformapagoinvenAux.setTipoFormaPagoInvenOriginal(this.tipoformapagoinven);
				
				tipoformapagoinvenAux.setId(this.tipoformapagoinven.getId());	
				tipoformapagoinvenAux.setVersionRow(this.tipoformapagoinven.getVersionRow());	
				tipoformapagoinvenAux.setid_empresa(this.tipoformapagoinven.getid_empresa());	
				tipoformapagoinvenAux.setcodigo(this.tipoformapagoinven.getcodigo());	
				tipoformapagoinvenAux.setnombre(this.tipoformapagoinven.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenLogic.saveTipoFormaPagoInvens();//WithConnection
						//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoFormaPagoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformapagoinvenLogic.saveTipoFormaPagoInvenRelaciones(tipoformapagoinvenAux);//WithConnection
								//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoformapagoinvenAux=new  TipoFormaPagoInven();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() && this.tipoformapagoinven.getId()>=0)) {
						
					tipoformapagoinvenAux.setIsNew(false);
				}
				
				tipoformapagoinvenAux.setIsDeleted(false);
			
				tipoformapagoinvenAux.setId(this.tipoformapagoinven.getId());	
				tipoformapagoinvenAux.setVersionRow(this.tipoformapagoinven.getVersionRow());	
				tipoformapagoinvenAux.setid_empresa(this.tipoformapagoinven.getid_empresa());	
				tipoformapagoinvenAux.setcodigo(this.tipoformapagoinven.getcodigo());	
				tipoformapagoinvenAux.setnombre(this.tipoformapagoinven.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenLogic.saveTipoFormaPagoInvens();//WithConnection
						//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);
					
					this.refrescarForeignKeysDescripcionesTipoFormaPagoInven();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformapagoinvenLogic.saveTipoFormaPagoInvenRelaciones(tipoformapagoinvenAux);//WithConnection
								//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoformapagoinven,tipoformapagoinvenAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoformapagoinvenAux=new  TipoFormaPagoInven();
				
				tipoformapagoinvenAux.setIsNew(false);
				tipoformapagoinvenAux.setIsChanged(false);
				
				tipoformapagoinvenAux.setIsDeleted(true);
				
				tipoformapagoinvenAux.setId(this.tipoformapagoinven.getId());	
				tipoformapagoinvenAux.setVersionRow(this.tipoformapagoinven.getVersionRow());	
				tipoformapagoinvenAux.setid_empresa(this.tipoformapagoinven.getid_empresa());	
				tipoformapagoinvenAux.setcodigo(this.tipoformapagoinven.getcodigo());	
				tipoformapagoinvenAux.setnombre(this.tipoformapagoinven.getnombre());	
				
				if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoformapagoinvenAux.getId()>=0) {	
						this.tipoformapagoinvensEliminados.add(tipoformapagoinvenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenLogic.saveTipoFormaPagoInvens();//WithConnection
						//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoformapagoinvenLogic.saveTipoFormaPagoInvenRelaciones(tipoformapagoinvenAux);//WithConnection
								//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
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
							if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoformapagoinvenAux,tipoformapagoinvenLogic.getTipoFormaPagoInvens());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoformapagoinvenAux,tipoformapagoinvens);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().addAll(this.tipoformapagoinvensEliminados);
					
					tipoformapagoinvenLogic.saveTipoFormaPagoInvens();//WithConnection
					//tipoformapagoinvenLogic.getSetVersionRowTipoFormaPagoInvens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoFormaPagoInven();
				
				this.tipoformapagoinvensEliminados= new ArrayList<TipoFormaPagoInven>();		
			}
			
			if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Forma Pago Inven GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoformapagoinven=tipoformapagoinvenAux;
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
      		//this.finishProcessTipoFormaPagoInven();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFormaPagoInven tipoformapagoinvenLocal) throws Exception {
		
		if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFormaPagoInven tipoformapagoinvenLocal) throws Exception {	
		if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipoformapagoinvenLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoFormaPagoInvenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoformapagoinvenValidator.getInvalidValues(this.tipoformapagoinven);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFormaPagoInven tipoformapagoinven,List<TipoFormaPagoInven> tipoformapagoinvens) throws Exception {
		try	{		
			TipoFormaPagoInvenConstantesFunciones.actualizarLista(tipoformapagoinven,tipoformapagoinvens,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFormaPagoInven tipoformapagoinven,List<TipoFormaPagoInven> tipoformapagoinvens) throws Exception {
		try	{			
			TipoFormaPagoInvenConstantesFunciones.actualizarSelectedLista(tipoformapagoinven,tipoformapagoinvens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFormaPagoInven> tipoformapagoinvensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoformapagoinvensLocal=this.tipoformapagoinvenLogic.getTipoFormaPagoInvens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoformapagoinvensLocal=this.tipoformapagoinvens;
			}
			//ARCHITECTURE
		
			for(TipoFormaPagoInven tipoformapagoinvenLocal:tipoformapagoinvensLocal) {
				if(this.permiteMantenimiento(tipoformapagoinvenLocal) && tipoformapagoinvenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFormaPagoInvenConstantesFunciones.getTipoFormaPagoInvenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFormaPagoInvenConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelid_empresaTipoFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFormaPagoInvenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelcodigoTipoFormaPagoInven,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFormaPagoInvenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelnombreTipoFormaPagoInven,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelid_empresaTipoFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelcodigoTipoFormaPagoInven,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelnombreTipoFormaPagoInven,"");
		
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
		this.iIdNuevoTipoFormaPagoInven--;	
		
		
		this.tipoformapagoinvenAux=new TipoFormaPagoInven();
		
		this.tipoformapagoinvenAux.setId(this.iIdNuevoTipoFormaPagoInven);
		this.tipoformapagoinvenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().add(this.tipoformapagoinvenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoformapagoinvens.add(this.tipoformapagoinvenAux);
		}
		//ARCHITECTURE
		
		this.tipoformapagoinven=this.tipoformapagoinvenAux;
		
		if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinven);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormaPagoInven(this.tipoformapagoinven);
		}
				
		//this.setDefaultControlesTipoFormaPagoInven();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFormaPagoInven();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFormaPagoInven();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormaPagoInven();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormaPagoInven(this.tipoformapagoinvenBean,this.tipoformapagoinven,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
			classes=TipoFormaPagoInvenConstantesFunciones.getClassesRelationshipsOfTipoFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.procesarEventosTipoFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this.tipoformapagoinven,this.tipoformapagoinvenParameterGeneral,this.isEsNuevoTipoFormaPagoInven,classes);//this.tipoformapagoinvenLogic.getTipoFormaPagoInven()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral,this.tipoformapagoinvenBean,false);
		
		if(this.tipoformapagoinvenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven());
		}
		
		if(this.tipoformapagoinvenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven(),classes);//this.tipoformapagoinvenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFormaPagoInven();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFormaPagoInven();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.RecargarFormTipoFormaPagoInven(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
						
			if(tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormaPagoInven();
			}
			
			this.actualizarVisualTableDatosTipoFormaPagoInven();
			
			this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoTipoFormaPagoInven(), this.getIndiceNuevoTipoFormaPagoInven());
			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
						
			this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFormaPagoInven(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setEnabled(isHabilitar && this.tipoformapagoinvenConstantesFunciones.activarcodigoTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setEnabled(isHabilitar && this.tipoformapagoinvenConstantesFunciones.activarnombreTipoFormaPagoInven);	
		//
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setEnabled(isHabilitar && this.tipoformapagoinvenConstantesFunciones.activarid_empresaTipoFormaPagoInven);
	};
	
	public void setDefaultControlesTipoFormaPagoInven() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFormaPagoInven(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(true);			
			this.tipoformapagoinvenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.setVisible(true);
			
					
		} else {
			//this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(false);			
			this.tipoformapagoinvenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoFormaPagoInven() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				if(tipoformapagoinvenAux.getId().equals(this.iIdNuevoTipoFormaPagoInven)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvens) {
				if(tipoformapagoinvenAux.getId().equals(this.iIdNuevoTipoFormaPagoInven)) {
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
	
	public int getIndiceActualTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				if(tipoformapagoinvenAux.getId().equals(tipoformapagoinven.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvens) {
				if(tipoformapagoinvenAux.getId().equals(tipoformapagoinven.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinvenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				if(tipoformapagoinvenAux.getTipoFormaPagoInvenOriginal().getId().equals(tipoformapagoinvenOriginal.getId())) {
					existe=true;
					tipoformapagoinvenOriginal.setId(tipoformapagoinvenAux.getId());
					tipoformapagoinvenOriginal.setVersionRow(tipoformapagoinvenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvens) {
				if(tipoformapagoinvenAux.getTipoFormaPagoInvenOriginal().getId().equals(tipoformapagoinvenOriginal.getId())) {
					existe=true;
					tipoformapagoinvenOriginal.setId(tipoformapagoinvenAux.getId());
					tipoformapagoinvenOriginal.setVersionRow(tipoformapagoinvenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFormaPagoInven(Boolean esParaCancelar) throws Exception {
		tipoformapagoinvensAux=new ArrayList<TipoFormaPagoInven>();
		tipoformapagoinvenAux=new TipoFormaPagoInven();
		
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
					if(tipoformapagoinvenAux.getId()<0) {
						tipoformapagoinvensAux.add(tipoformapagoinvenAux);
					}		
				}
				this.iIdNuevoTipoFormaPagoInven=0L;
				this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().removeAll(tipoformapagoinvensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvens) {
					if(tipoformapagoinvenAux.getId()<0) {
						tipoformapagoinvensAux.add(tipoformapagoinvenAux);
					}		
				}
				this.iIdNuevoTipoFormaPagoInven=0L;
				this.tipoformapagoinvens.removeAll(tipoformapagoinvensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFormaPagoInven 
					&& this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()>0
					) {
					tipoformapagoinvenAux=this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().get(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().size() - 1);
				
					if(tipoformapagoinvenAux.getId()<0) {
						this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().remove(tipoformapagoinvenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFormaPagoInven && this.tipoformapagoinvens.size()>0) {
					tipoformapagoinvenAux=this.tipoformapagoinvens.get(this.tipoformapagoinvens.size() - 1);
				
					if(tipoformapagoinvenAux.getId()<0) {
						this.tipoformapagoinvens.remove(tipoformapagoinvenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFormaPagoInven(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoformapagoinven.getId()<0) {
				this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().remove(this.tipoformapagoinven);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoformapagoinven.getId()<0) {
				this.tipoformapagoinvens.remove(this.tipoformapagoinven);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFormaPagoInven(List<TipoFormaPagoInven> tipoformapagoinvensAux) throws Exception {
		TipoFormaPagoInvenConstantesFunciones.setEstadosInicialesTipoFormaPagoInven(tipoformapagoinvensAux);
	}
	
	public void setEstadosInicialesTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinvenAux) throws Exception {
		TipoFormaPagoInvenConstantesFunciones.setEstadosInicialesTipoFormaPagoInven(tipoformapagoinvenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFormaPagoInvenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFormaPagoInvenActual()) {
				if(!this.isEsNuevoTipoFormaPagoInven) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFormaPagoInven=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFormaPagoInvenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Forma Pago Inven ?", "MANTENIMIENTO DE Tipo Forma Pago Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFormaPagoInven tipoformapagoinven) throws Exception {
		TipoFormaPagoInvenConstantesFunciones.seleccionarAsignar(this.tipoformapagoinven,tipoformapagoinven);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFormaPagoInven=this.isPermisoActualizarOriginalTipoFormaPagoInven;
			
			
			this.seleccionarAsignar(tipoformapagoinven);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFormaPagoInvenConstantesFunciones.quitarEspaciosTipoFormaPagoInven(this.tipoformapagoinven,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoformapagoinvenSessionBean.setsFuncionBusquedaRapida(this.tipoformapagoinvenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFormaPagoInven) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFormaPagoInven(esParaCancelar);				
				this.cancelarNuevoTipoFormaPagoInven(esParaCancelar);								
			}
			
			this.tipoformapagoinven=new TipoFormaPagoInven();
			
			this.inicializarTipoFormaPagoInven();
			
			this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFormaPagoInven() throws Exception {
		try {
			TipoFormaPagoInvenConstantesFunciones.inicializarTipoFormaPagoInven(this.tipoformapagoinven);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFormaPagoInvens(String sAccionBusqueda,List<TipoFormaPagoInven> tipoformapagoinvensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFormaPagoInven"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFormaPagoInvenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFormaPagoInvenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFormaPagoInven"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Forma Pago Invenes");		
		parameters.put("busquedapor", TipoFormaPagoInvenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFormaPagoInven=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFormaPagoInvenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFormaPagoInven=new JRBeanArrayDataSource(TipoFormaPagoInvenJInternalFrame.TraerTipoFormaPagoInvenBeans(tipoformapagoinvensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFormaPagoInven);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFormaPagoInvenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFormaPagoInvenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFormaPagoInvenBean.TraerTipoFormaPagoInvenBeans(tipoformapagoinvensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInvenActionPerformed(null);
					//this.generarExcelReporteTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFormaPagoInvens(sAccionBusqueda,sTipoArchivoReporte,tipoformapagoinvensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormaPagoInven> tipoformapagoinvensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormaPagoInvens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormaPagoInven("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFormaPagoInven tipoformapagoinven : tipoformapagoinvensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFormaPagoInvenConstantesFunciones.generarExcelReporteDataTipoFormaPagoInven("NORMAL",row,workbook,tipoformapagoinven,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFormaPagoInven(String sTipo,Row row,Workbook workbook) {
		
		TipoFormaPagoInvenConstantesFunciones.generarExcelReporteHeaderTipoFormaPagoInven(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormaPagoInven> tipoformapagoinvensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormaPagoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFormaPagoInven tipoformapagoinven : tipoformapagoinvensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.getTipoFormaPagoInvenDescripcion(tipoformapagoinven));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformapagoinven.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformapagoinven.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoformapagoinven.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFormaPagoInvens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFormaPagoInven> tipoformapagoinvensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFormaPagoInven> tipoformapagoinvensRespaldo=null;
		
		classes=TipoFormaPagoInvenConstantesFunciones.getClassesRelationshipsOfTipoFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoformapagoinvenLogic.setDatosCliente(this.datosCliente);
		this.tipoformapagoinvenLogic.setDatosDeep(this.datosDeep);
		this.tipoformapagoinvenLogic.setIsConDeep(true);
		
		tipoformapagoinvensRespaldo=this.tipoformapagoinvenLogic.getTipoFormaPagoInvens();
		
		this.tipoformapagoinvenLogic.setTipoFormaPagoInvens(tipoformapagoinvensParaReportes);	
		this.tipoformapagoinvenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoformapagoinvensParaReportes=this.tipoformapagoinvenLogic.getTipoFormaPagoInvens();
		this.tipoformapagoinvenLogic.setTipoFormaPagoInvens(tipoformapagoinvensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFormaPagoInvens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFormaPagoInven("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFormaPagoInven tipoformapagoinven : tipoformapagoinvensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFormaPagoInven("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFormaPagoInvenConstantesFunciones.generarExcelReporteDataTipoFormaPagoInven("NORMAL",row,workbook,tipoformapagoinven,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.getTipoFormaPagoInvenDescripcion(tipoformapagoinven));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFormaPagoInven() throws Exception {		
		this.startProcessTipoFormaPagoInven(true);
	}
	
	public void startProcessTipoFormaPagoInven(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoFormaPagoInven ,this.jPanelParametrosReportesTipoFormaPagoInven, this.jScrollPanelDatosTipoFormaPagoInven,this.jPanelPaginacionTipoFormaPagoInven, this.jScrollPanelDatosEdicionTipoFormaPagoInven, this.jPanelAccionesTipoFormaPagoInven,this.jPanelAccionesFormularioTipoFormaPagoInven,this.jmenuBarTipoFormaPagoInven,this.jmenuBarDetalleTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormaPagoInven=this.jTabbedPaneBusquedasTipoFormaPagoInven; 
		
		final JPanel jPanelParametrosReportesTipoFormaPagoInven=this.jPanelParametrosReportesTipoFormaPagoInven;
		//final JScrollPane jScrollPanelDatosTipoFormaPagoInven=this.jScrollPanelDatosTipoFormaPagoInven;
		final JTable jTableDatosTipoFormaPagoInven=this.jTableDatosTipoFormaPagoInven;		
		final JPanel jPanelPaginacionTipoFormaPagoInven=this.jPanelPaginacionTipoFormaPagoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormaPagoInven=this.jScrollPanelDatosEdicionTipoFormaPagoInven;
		final JPanel jPanelAccionesTipoFormaPagoInven=this.jPanelAccionesTipoFormaPagoInven;
		
		JPanel jPanelCamposAuxiliarTipoFormaPagoInven=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormaPagoInven=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			jPanelCamposAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelCamposTipoFormaPagoInven;
			jPanelAccionesFormularioAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelAccionesFormularioTipoFormaPagoInven;
		}
		
		final JPanel jPanelCamposTipoFormaPagoInven=jPanelCamposAuxiliarTipoFormaPagoInven;
		final JPanel jPanelAccionesFormularioTipoFormaPagoInven=jPanelAccionesFormularioAuxiliarTipoFormaPagoInven;
		
		
		final JMenuBar jmenuBarTipoFormaPagoInven=this.jmenuBarTipoFormaPagoInven;
		final JToolBar jTtoolBarTipoFormaPagoInven=this.jTtoolBarTipoFormaPagoInven;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFormaPagoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormaPagoInven=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			jmenuBarDetalleAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jmenuBarDetalleTipoFormaPagoInven;
			jTtoolBarDetalleAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jTtoolBarDetalleTipoFormaPagoInven;
		}
		
		final JMenuBar jmenuBarDetalleTipoFormaPagoInven=jmenuBarDetalleAuxiliarTipoFormaPagoInven;
		final JToolBar jTtoolBarDetalleTipoFormaPagoInven=jTtoolBarDetalleAuxiliarTipoFormaPagoInven;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormaPagoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormaPagoInven;
			processRunnable.jTableDatos=jTableDatosTipoFormaPagoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoFormaPagoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormaPagoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormaPagoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormaPagoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormaPagoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormaPagoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoFormaPagoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormaPagoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFormaPagoInven ,jPanelParametrosReportesTipoFormaPagoInven,jTableDatosTipoFormaPagoInven, /*jScrollPanelDatosTipoFormaPagoInven,*/jPanelCamposTipoFormaPagoInven,jPanelPaginacionTipoFormaPagoInven, /*jScrollPanelDatosEdicionTipoFormaPagoInven,*/ jPanelAccionesTipoFormaPagoInven,jPanelAccionesFormularioTipoFormaPagoInven,jmenuBarTipoFormaPagoInven,jmenuBarDetalleTipoFormaPagoInven,jTtoolBarTipoFormaPagoInven,jTtoolBarDetalleTipoFormaPagoInven);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFormaPagoInven ,jPanelParametrosReportesTipoFormaPagoInven, jScrollPanelDatosTipoFormaPagoInven,jPanelPaginacionTipoFormaPagoInven, jScrollPanelDatosEdicionTipoFormaPagoInven, jPanelAccionesTipoFormaPagoInven,jPanelAccionesFormularioTipoFormaPagoInven,jmenuBarTipoFormaPagoInven,jmenuBarDetalleTipoFormaPagoInven,jTtoolBarTipoFormaPagoInven,jTtoolBarDetalleTipoFormaPagoInven);
						
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
	
	public void finishProcessTipoFormaPagoInven() {// throws Exception 
		this.finishProcessTipoFormaPagoInven(true);
	}
	
	public void finishProcessTipoFormaPagoInven(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoFormaPagoInven ,this.jPanelParametrosReportesTipoFormaPagoInven, this.jScrollPanelDatosTipoFormaPagoInven,this.jPanelPaginacionTipoFormaPagoInven, this.jScrollPanelDatosEdicionTipoFormaPagoInven, this.jPanelAccionesTipoFormaPagoInven,this.jPanelAccionesFormularioTipoFormaPagoInven,this.jmenuBarTipoFormaPagoInven,this.jmenuBarDetalleTipoFormaPagoInven,this.jTtoolBarTipoFormaPagoInven,this.jTtoolBarDetalleTipoFormaPagoInven);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFormaPagoInven=this.jTabbedPaneBusquedasTipoFormaPagoInven; 
		
		final JPanel jPanelParametrosReportesTipoFormaPagoInven=this.jPanelParametrosReportesTipoFormaPagoInven;
		//final JScrollPane jScrollPanelDatosTipoFormaPagoInven=this.jScrollPanelDatosTipoFormaPagoInven;
		final JTable jTableDatosTipoFormaPagoInven=this.jTableDatosTipoFormaPagoInven;		
		final JPanel jPanelPaginacionTipoFormaPagoInven=this.jPanelPaginacionTipoFormaPagoInven;
		//final JScrollPane jScrollPanelDatosEdicionTipoFormaPagoInven=this.jScrollPanelDatosEdicionTipoFormaPagoInven;
		final JPanel jPanelAccionesTipoFormaPagoInven=this.jPanelAccionesTipoFormaPagoInven;
		
		JPanel jPanelCamposAuxiliarTipoFormaPagoInven=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFormaPagoInven=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			jPanelCamposAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelCamposTipoFormaPagoInven;
			jPanelAccionesFormularioAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelAccionesFormularioTipoFormaPagoInven;
		}
		
		final JPanel jPanelCamposTipoFormaPagoInven=jPanelCamposAuxiliarTipoFormaPagoInven;
		final JPanel jPanelAccionesFormularioTipoFormaPagoInven=jPanelAccionesFormularioAuxiliarTipoFormaPagoInven;
		
		
		final JMenuBar jmenuBarTipoFormaPagoInven=this.jmenuBarTipoFormaPagoInven;		
		final JToolBar jTtoolBarTipoFormaPagoInven=this.jTtoolBarTipoFormaPagoInven;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFormaPagoInven=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFormaPagoInven=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			jmenuBarDetalleAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jmenuBarDetalleTipoFormaPagoInven;
			jTtoolBarDetalleAuxiliarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jTtoolBarDetalleTipoFormaPagoInven;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFormaPagoInven=jmenuBarDetalleAuxiliarTipoFormaPagoInven;
		final JToolBar jTtoolBarDetalleTipoFormaPagoInven=jTtoolBarDetalleAuxiliarTipoFormaPagoInven;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFormaPagoInven;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFormaPagoInven;
			processRunnable.jTableDatos=jTableDatosTipoFormaPagoInven;
			processRunnable.jPanelCampos=jPanelCamposTipoFormaPagoInven;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFormaPagoInven;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFormaPagoInven;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFormaPagoInven;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFormaPagoInven;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFormaPagoInven;
			processRunnable.jTtoolBar=jTtoolBarTipoFormaPagoInven;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFormaPagoInven;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFormaPagoInven ,jPanelParametrosReportesTipoFormaPagoInven, jTableDatosTipoFormaPagoInven,/*jScrollPanelDatosTipoFormaPagoInven,*/jPanelCamposTipoFormaPagoInven,jPanelPaginacionTipoFormaPagoInven, /*jScrollPanelDatosEdicionTipoFormaPagoInven,*/ jPanelAccionesTipoFormaPagoInven,jPanelAccionesFormularioTipoFormaPagoInven,jmenuBarTipoFormaPagoInven,jmenuBarDetalleTipoFormaPagoInven,jTtoolBarTipoFormaPagoInven,jTtoolBarDetalleTipoFormaPagoInven));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFormaPagoInven(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFormaPagoInven(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFormaPagoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFormaPagoInven,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFormaPagoInven(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFormaPagoInven,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFormaPagoInven,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoformapagoinvenConstantesFunciones.getsFinalQueryTipoFormaPagoInven();
		String  finalQueryPaginacionTodos=this.tipoformapagoinvenConstantesFunciones.getsFinalQueryTipoFormaPagoInven();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFormaPagoInvenConstantesFunciones.getArrayColumnasGlobalesNoTipoFormaPagoInven(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFormaPagoInvenConstantesFunciones.getArrayColumnasGlobalesTipoFormaPagoInven(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFormaPagoInvenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoformapagoinvensEliminados= new ArrayList<TipoFormaPagoInven>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFormaPagoInven();
		
				///*TipoFormaPagoInvenSessionBean*/this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
			
			if(this.tipoformapagoinvenSessionBean==null) {
				this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
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
					this.iNumeroPaginacion=TipoFormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFormaPagoInvenConstantesFunciones.getClassesForeignKeysOfTipoFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoformapagoinven."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoformapagoinvensAux= new ArrayList<TipoFormaPagoInven>();
			
				
			tipoformapagoinvenLogic.setDatosCliente(this.datosCliente);
			tipoformapagoinvenLogic.setDatosDeep(this.datosDeep);
			tipoformapagoinvenLogic.setIsConDeep(true);
			
			
			tipoformapagoinvenLogic.getTipoFormaPagoInvenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoformapagoinvenLogic.getTodosTipoFormaPagoInvens(finalQueryGlobal,pagination);
					
					//tipoformapagoinvenLogic.getTodosTipoFormaPagoInvensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoformapagoinvenLogic.getTipoFormaPagoInvens()==null|| tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformapagoinvensAux= new ArrayList<TipoFormaPagoInven>();
							tipoformapagoinvensAux.addAll(tipoformapagoinvenLogic.getTipoFormaPagoInvens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformapagoinvensAux= new ArrayList<TipoFormaPagoInven>();
							tipoformapagoinvensAux.addAll(tipoformapagoinvens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformapagoinvenLogic.getTodosTipoFormaPagoInvens(finalQueryGlobal+"",this.pagination);												
							
							//tipoformapagoinvenLogic.getTodosTipoFormaPagoInvensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvenLogic.getTipoFormaPagoInvens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoformapagoinvenLogic.setTipoFormaPagoInvens(new ArrayList<TipoFormaPagoInven>());					
							tipoformapagoinvenLogic.getTipoFormaPagoInvens().addAll(tipoformapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformapagoinvens=new ArrayList<TipoFormaPagoInven>();
							tipoformapagoinvens.addAll(tipoformapagoinvensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFormaPagoInven=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFormaPagoInven=this.idActual;
				
				} else if(this.idTipoFormaPagoInvenActual!=null && this.idTipoFormaPagoInvenActual!=0L) {
					idTipoFormaPagoInven=idTipoFormaPagoInvenActual;
				}
				
					
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndicePorId(idTipoFormaPagoInven);
				
				this.tipoformapagoinvens=new ArrayList<TipoFormaPagoInven>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoformapagoinvenLogic.getEntity(idTipoFormaPagoInven);
					
					//tipoformapagoinvenLogic.getEntityWithConnection(idTipoFormaPagoInven);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoinvenLogic.setTipoFormaPagoInvens(new ArrayList<TipoFormaPagoInven>());
					tipoformapagoinvenLogic.getTipoFormaPagoInvens().add(tipoformapagoinvenLogic.getTipoFormaPagoInven());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformapagoinvens=new ArrayList<TipoFormaPagoInven>();
					this.tipoformapagoinvens.add(tipoformapagoinven);
				}
				
				if(tipoformapagoinvenLogic.getTipoFormaPagoInven()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoformapagoinvenLogic.getTipoFormaPagoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoformapagoinvenLogic.getTipoFormaPagoInvens()==null||tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoformapagoinvens==null|| tipoformapagoinvens.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvensAux=new ArrayList<TipoFormaPagoInven>();
						tipoformapagoinvensAux.addAll(tipoformapagoinvenLogic.getTipoFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformapagoinvensAux=new ArrayList<TipoFormaPagoInven>();
							tipoformapagoinvensAux.addAll(tipoformapagoinvens);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoformapagoinvenLogic.getTipoFormaPagoInvensFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoFormaPagoInvenConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoFormaPagoInvens("FK_IdEmpresa",tipoformapagoinvenLogic.getTipoFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoFormaPagoInvens("FK_IdEmpresa",tipoformapagoinvens);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenLogic.setTipoFormaPagoInvens(new ArrayList<TipoFormaPagoInven>());
						tipoformapagoinvenLogic.getTipoFormaPagoInvens().addAll(tipoformapagoinvensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformapagoinvens=new ArrayList<TipoFormaPagoInven>();
							tipoformapagoinvens.addAll(tipoformapagoinvensAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFormaPagoInven();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFormaPagoInven();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformapagoinvenLogic.getTipoFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformapagoinvens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoformapagoinvenLogic.getTipoFormaPagoInvens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoformapagoinvens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFormaPagoInven tipoformapagoinven) {
		Boolean permite=true;
		
		if(this.tipoformapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFormaPagoInvenConstantesFunciones.getOrderByListaTipoFormaPagoInven();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFormaPagoInvenConstantesFunciones.getOrderByListaTipoFormaPagoInven();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				if(tipoformapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformapagoinvenTotales=tipoformapagoinven;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormaPagoInven tipoformapagoinven:this.tipoformapagoinvens) {
				if(tipoformapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformapagoinvenTotales=tipoformapagoinven;
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
			this.tipoformapagoinvenAux=new TipoFormaPagoInven();
			this.tipoformapagoinvenAux.setsType(Constantes2.S_TOTALES);
			this.tipoformapagoinvenAux.setIsNew(false);
			this.tipoformapagoinvenAux.setIsChanged(false);
			this.tipoformapagoinvenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFormaPagoInvenConstantesFunciones.TotalizarValoresFilaTipoFormaPagoInven(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this.tipoformapagoinvenAux);
				
				this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().add(this.tipoformapagoinvenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFormaPagoInvenConstantesFunciones.TotalizarValoresFilaTipoFormaPagoInven(this.tipoformapagoinvens,this.tipoformapagoinvenAux);
				
				this.tipoformapagoinvens.add(this.tipoformapagoinvenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoformapagoinvenTotales=new TipoFormaPagoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().remove(tipoformapagoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoformapagoinvens.remove(tipoformapagoinvenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoformapagoinvenTotales=new TipoFormaPagoInven();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				if(tipoformapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformapagoinvenTotales=tipoformapagoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormaPagoInvenConstantesFunciones.TotalizarValoresFilaTipoFormaPagoInven(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),tipoformapagoinvenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFormaPagoInven tipoformapagoinven:this.tipoformapagoinvens) {
				if(tipoformapagoinven.getsType().equals(Constantes2.S_TOTALES)) {
					tipoformapagoinvenTotales=tipoformapagoinven;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFormaPagoInvenConstantesFunciones.TotalizarValoresFilaTipoFormaPagoInven(this.tipoformapagoinvens,tipoformapagoinvenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoFormaPagoInvensFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoFormaPagoInvensFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoinvenLogic.getTipoFormaPagoInvensFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoFormaPagoInven() {
		this.isPermisoTodoTipoFormaPagoInven=false;
		this.isPermisoNuevoTipoFormaPagoInven=false;
		this.isPermisoActualizarTipoFormaPagoInven=false;
		this.isPermisoActualizarOriginalTipoFormaPagoInven=false;
		this.isPermisoEliminarTipoFormaPagoInven=false;
		this.isPermisoGuardarCambiosTipoFormaPagoInven=false;
		this.isPermisoConsultaTipoFormaPagoInven=false;
		this.isPermisoBusquedaTipoFormaPagoInven=false;
		this.isPermisoReporteTipoFormaPagoInven=false;		
		this.isPermisoOrdenTipoFormaPagoInven=false;		
		this.isPermisoPaginacionMedioTipoFormaPagoInven=false;		
		this.isPermisoPaginacionAltoTipoFormaPagoInven=false;
		this.isPermisoPaginacionTodoTipoFormaPagoInven=false;
		this.isPermisoCopiarTipoFormaPagoInven=false;		
		this.isPermisoVerFormTipoFormaPagoInven=false;		
		this.isPermisoDuplicarTipoFormaPagoInven=false;		
		this.isPermisoOrdenTipoFormaPagoInven=false;		
	}
	
	public void setPermisosUsuarioTipoFormaPagoInven(Boolean isPermiso) {
		this.isPermisoTodoTipoFormaPagoInven=isPermiso;
		this.isPermisoNuevoTipoFormaPagoInven=isPermiso;
		this.isPermisoActualizarTipoFormaPagoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoFormaPagoInven=isPermiso;
		this.isPermisoEliminarTipoFormaPagoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoFormaPagoInven=isPermiso;
		this.isPermisoConsultaTipoFormaPagoInven=isPermiso;
		this.isPermisoBusquedaTipoFormaPagoInven=isPermiso;
		this.isPermisoReporteTipoFormaPagoInven=isPermiso;
		this.isPermisoOrdenTipoFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionMedioTipoFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionAltoTipoFormaPagoInven=isPermiso;		
		this.isPermisoPaginacionTodoTipoFormaPagoInven=isPermiso;		
		this.isPermisoCopiarTipoFormaPagoInven=isPermiso;		
		this.isPermisoVerFormTipoFormaPagoInven=isPermiso;		
		this.isPermisoDuplicarTipoFormaPagoInven=isPermiso;
		this.isPermisoOrdenTipoFormaPagoInven=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFormaPagoInven(Boolean isPermiso) {
		//this.isPermisoTodoTipoFormaPagoInven=isPermiso;
		this.isPermisoNuevoTipoFormaPagoInven=isPermiso;
		this.isPermisoActualizarTipoFormaPagoInven=isPermiso;
		this.isPermisoActualizarOriginalTipoFormaPagoInven=isPermiso;
		this.isPermisoEliminarTipoFormaPagoInven=isPermiso;
		this.isPermisoGuardarCambiosTipoFormaPagoInven=isPermiso;
		//this.isPermisoConsultaTipoFormaPagoInven=isPermiso;
		//this.isPermisoBusquedaTipoFormaPagoInven=isPermiso;
		//this.isPermisoReporteTipoFormaPagoInven=isPermiso;
		//this.isPermisoOrdenTipoFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFormaPagoInven=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFormaPagoInven=isPermiso;		
		//this.isPermisoCopiarTipoFormaPagoInven=isPermiso;		
		//this.isPermisoDuplicarTipoFormaPagoInven=isPermiso;
		//this.isPermisoOrdenTipoFormaPagoInven=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormaPagoInvenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoFormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFormaPagoInven(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFormaPagoInvenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFormaPagoInvenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFormaPagoInvenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFormaPagoInvenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoFormaPagoInven() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFormaPagoInvenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFormaPagoInven=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFormaPagoInven=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFormaPagoInven=this.isPermisoActualizarTipoFormaPagoInven;
			this.isPermisoEliminarTipoFormaPagoInven=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFormaPagoInven=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFormaPagoInven=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFormaPagoInven=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFormaPagoInven=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFormaPagoInven=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormaPagoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFormaPagoInven=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFormaPagoInven=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFormaPagoInven=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFormaPagoInven=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFormaPagoInven=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFormaPagoInven=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFormaPagoInven=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFormaPagoInven.setToolTipText(this.jTableDatosTipoFormaPagoInven.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFormaPagoInven(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFormaPagoInven(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFormaPagoInven() throws Exception {
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
	public void inicializarCombosForeignKeyTipoFormaPagoInvenListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFormaPagoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFormaPagoInvenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFormaPagoInvenListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoFormaPagoInvenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenReturnGeneral=new TipoFormaPagoInvenParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipoformapagoinvenConstantesFunciones.cargarid_empresaTipoFormaPagoInven)
					 || (this.esRecargarFks && this.tipoformapagoinvenConstantesFunciones.cargarid_empresaTipoFormaPagoInven)) {

					if(!this.tipoformapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipoformapagoinvenSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.cargarCombosLoteForeignKeyTipoFormaPagoInven(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipoformapagoinvenReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFormaPagoInven()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipoformapagoinvenSessionBean==null) {
				this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
			}

			if(!this.tipoformapagoinvenSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoFormaPagoInven()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFormaPagoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFormaPagoInven()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormaPagoInven();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFormaPagoInven()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFormaPagoInven()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFormaPagoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFormaPagoInven()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFormaPagoInven()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFormaPagoInven()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFormaPagoInven(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFormaPagoInven()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven!=null && this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoFormaPagoInvenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFormaPagoInvenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFormaPagoInvenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean(); 
		this.tipoformapagoinvenConstantesFunciones=new TipoFormaPagoInvenConstantesFunciones(); 
		this.tipoformapagoinvenBean=new TipoFormaPagoInven();//(this.tipoformapagoinvenConstantesFunciones); 		
		this.tipoformapagoinvenReturnGeneral=new TipoFormaPagoInvenParameterReturnGeneral(); 
		
		this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoformapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFormaPagoInvenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFormaPagoInven(true);
			
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
			
			this.tipoformapagoinvenConstantesFunciones=new TipoFormaPagoInvenConstantesFunciones(); 
			this.tipoformapagoinvenBean=new TipoFormaPagoInven();//this.tipoformapagoinvenConstantesFunciones); 			
			this.tipoformapagoinvenReturnGeneral=new TipoFormaPagoInvenParameterReturnGeneral(); 
		
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Forma Pago Inven Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoformapagoinven=new TipoFormaPagoInven();
			this.tipoformapagoinvens = new ArrayList<TipoFormaPagoInven>();
			this.tipoformapagoinvensAux = new ArrayList<TipoFormaPagoInven>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic=new TipoFormaPagoInvenLogic();
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoformapagoinvenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoformapagoinvenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFormaPagoInven);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormaPagoInven);	
					}
					
					if(this.jInternalFrameImportacionTipoFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormaPagoInven);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFormaPagoInven!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFormaPagoInven);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormaPagoInven);
				this.jInternalFrameDetalleFormTipoFormaPagoInven.setVisible(false);
				this.jInternalFrameDetalleFormTipoFormaPagoInven.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormaPagoInven);
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormaPagoInven);
					this.jInternalFrameImportacionTipoFormaPagoInven.setVisible(false);
					this.jInternalFrameImportacionTipoFormaPagoInven.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFormaPagoInven!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormaPagoInven);
					this.jInternalFrameOrderByTipoFormaPagoInven.setVisible(false);
					this.jInternalFrameOrderByTipoFormaPagoInven.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFormaPagoInvenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoformapagoinvenReturnGeneral=new TipoFormaPagoInvenParameterReturnGeneral();
			
			this.tipoformapagoinvenParameterGeneral=new TipoFormaPagoInvenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoformapagoinvenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFormaPagoInvenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormaPagoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado(),this.tipoformapagoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFormaPagoInvenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado(),this.tipoformapagoinvenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaDuplicarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaCopiarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaVerFormTipoFormaPagoInven=true;
			this.isVisibilidadCeldaOrdenTipoFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFormaPagoInven();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFormaPagoInven(false);
			
			this.setPermisosUsuarioTipoFormaPagoInven();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado() && this.tipoformapagoinvenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFormaPagoInvenClasesRelacionadas();
			}
			
			if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFormaPagoInvenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFormaPagoInven();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFormaPagoInven();
			}
			
			if(!this.isPermisoBusquedaTipoFormaPagoInven) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFormaPagoInven,this.isPermisoPaginacionMedioTipoFormaPagoInven,this.isPermisoPaginacionTodoTipoFormaPagoInven);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFormaPagoInvenConstantesFunciones.getTiposSeleccionarTipoFormaPagoInven());
				
				this.tiposColumnasSelect=TipoFormaPagoInvenConstantesFunciones.getTiposSeleccionarTipoFormaPagoInven(true);
				
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
			//if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFormaPagoInven();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoFormaPagoInven(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoFormaPagoInven(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormaPagoInven() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipoformapagoinvenImplementable= (TipoFormaPagoInvenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormaPagoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoformapagoinvenImplementableHome= (TipoFormaPagoInvenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFormaPagoInvenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoformapagoinvens= new ArrayList<TipoFormaPagoInven>();
			this.tipoformapagoinvensEliminados= new ArrayList<TipoFormaPagoInven>();
						
			this.isEsNuevoTipoFormaPagoInven=false;
			this.esParaAccionDesdeFormularioTipoFormaPagoInven=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFormaPagoInven(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFormaPagoInven();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFormaPagoInvenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFormaPagoInven(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFormaPagoInven();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFormaPagoInven();
			}
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoFormaPagoInven.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoFormaPagoInven.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoFormaPagoInven.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFormaPagoInven(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFormaPagoInven: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFormaPagoInven() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFormaPagoInven")) {
				iIndex=this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFormaPagoInven();	
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
	
	public void cargarCombosForeignKeyTipoFormaPagoInven(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFormaPagoInven(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFormaPagoInven(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFormaPagoInvenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFormaPagoInven();
		
		this.cargarCombosFrameForeignKeyTipoFormaPagoInven();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFormaPagoInven();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFormaPagoInven();
		}
	}
	
	
	
	public void jButtonNuevoTipoFormaPagoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			
			if(jTableDatosTipoFormaPagoInven.getRowCount()>=1) {
				jTableDatosTipoFormaPagoInven.removeRowSelectionInterval(0, jTableDatosTipoFormaPagoInven.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFormaPagoInven=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFormaPagoInven(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFormaPagoInven(true);			
			//this.tipoformapagoinven=new TipoFormaPagoInven();
			//this.tipoformapagoinven.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven() ;
			
			if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormaPagoInven(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoformapagoinven);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);				
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFormaPagoInven: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFormaPagoInvenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFormaPagoInven.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFormaPagoInven.getSelectedRows().length;			
			}
			
			tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFormaPagoInven--;			
				//TipoFormaPagoInven tipoformapagoinvenAux= new TipoFormaPagoInven();			
				//tipoformapagoinvenAux.setId(this.iIdNuevoTipoFormaPagoInven);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFormaPagoInven tipoformapagoinvenOrigen=new TipoFormaPagoInven();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFormaPagoInven tipoformapagoinvenOrigen : tipoformapagoinvensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoformapagoinvenOrigen =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoformapagoinvenOrigen =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFormaPagoInven();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoformapagoinven.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFormaPagoInven(tipoformapagoinvenOrigen,this.tipoformapagoinven,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().add(this.tipoformapagoinvenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinvens.add(this.tipoformapagoinvenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
				
				this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoTipoFormaPagoInven(), this.getIndiceNuevoTipoFormaPagoInven());
				
				int iLastRow =  this.jTableDatosTipoFormaPagoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormaPagoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormaPagoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();									
		
			TipoFormaPagoInven tipoformapagoinvenOrigen=new TipoFormaPagoInven();
			TipoFormaPagoInven tipoformapagoinvenDestino=new TipoFormaPagoInven();
				
			tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFormaPagoInven.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoformapagoinvensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFormaPagoInven.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenOrigen =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformapagoinvenOrigen =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoformapagoinvenDestino =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoformapagoinvenDestino =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoformapagoinvenOrigen =tipoformapagoinvensSeleccionados.get(0);
				tipoformapagoinvenDestino =tipoformapagoinvensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFormaPagoInven(tipoformapagoinvenOrigen,tipoformapagoinvenDestino,true,false);
				
				tipoformapagoinvenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoformapagoinvenDestino,tipoformapagoinvenLogic.getTipoFormaPagoInvens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoformapagoinvenDestino,tipoformapagoinvens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
				
				//this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoTipoFormaPagoInven(), this.getIndiceNuevoTipoFormaPagoInven());
				
				int iLastRow =  this.jTableDatosTipoFormaPagoInven.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFormaPagoInven.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFormaPagoInven.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFormaPagoInven.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(!isVisible);
			this.jPanelPaginacionTipoFormaPagoInven.setVisible(!isVisible);
			this.jPanelAccionesTipoFormaPagoInven.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFormaPagoInven();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFormaPagoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFormaPagoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFormaPagoInven();
			
			this.abrirFrameOrderByTipoFormaPagoInven();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFormaPagoInven();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFormaPagoInven(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormaPagoInven);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFormaPagoInven.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFormaPagoInven.setSize(this.jInternalFrameDetalleFormTipoFormaPagoInven.iWidthFormulario,this.jInternalFrameDetalleFormTipoFormaPagoInven.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFormaPagoInven.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFormaPagoInven.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFormaPagoInven.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFormaPagoInven.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFormaPagoInven.jContentPaneDetalleTipoFormaPagoInven.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormaPagoInven.jContentPaneDetalleTipoFormaPagoInven.getWidth(),TipoFormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFormaPagoInven.jContentPaneDetalleTipoFormaPagoInven.getWidth(),TipoFormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFormaPagoInven.jContentPaneDetalleTipoFormaPagoInven.getWidth(),TipoFormaPagoInvenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFormaPagoInven.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFormaPagoInven.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFormaPagoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFormaPagoInven==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPagoInven,false,this);
				} else {
					this.jInternalFrameOrderByTipoFormaPagoInven=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFormaPagoInven,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFormaPagoInven);
				this.jInternalFrameOrderByTipoFormaPagoInven.setVisible(false);
				this.jInternalFrameOrderByTipoFormaPagoInven.setSelected(false);
				
				this.jInternalFrameOrderByTipoFormaPagoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormaPagoInven"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFormaPagoInven();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFormaPagoInven() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFormaPagoInven==null) {
				
				this.jInternalFrameImportacionTipoFormaPagoInven=new ImportacionJInternalFrame(TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFormaPagoInven);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFormaPagoInven);
				this.jInternalFrameImportacionTipoFormaPagoInven.setVisible(false);
				this.jInternalFrameImportacionTipoFormaPagoInven.setSelected(false);


				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormaPagoInven"));
				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormaPagoInven"));
				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormaPagoInven"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFormaPagoInven() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven==null) {
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven=new ReporteDinamicoJInternalFrame(TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFormaPagoInven);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFormaPagoInven);
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormaPagoInven"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormaPagoInven();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoFormaPagoInven() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFormaPagoInven);
			
	       	this.jInternalFrameDetalleFormTipoFormaPagoInven.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFormaPagoInven.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFormaPagoInven.dispose();
			//this.jInternalFrameDetalleFormTipoFormaPagoInven=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFormaPagoInven() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFormaPagoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFormaPagoInven.setVisible(true);
	        this.jInternalFrameImportacionTipoFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFormaPagoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFormaPagoInven.setVisible(true);
	        this.jInternalFrameOrderByTipoFormaPagoInven.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFormaPagoInven() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFormaPagoInven.setVisible(false);
	        this.jInternalFrameOrderByTipoFormaPagoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFormaPagoInven() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFormaPagoInven() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFormaPagoInven.setVisible(false);
	        this.jInternalFrameImportacionTipoFormaPagoInven.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFormaPagoInven(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFormaPagoInven(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFormaPagoInven(true);
			//this.isEsNuevoTipoFormaPagoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false) ;
			
			if(tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormaPagoInven(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFormaPagoInvenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFormaPagoInven(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFormaPagoInven(true);
			//this.isEsNuevoTipoFormaPagoInven=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoformapagoinven.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false) ;
			
			if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFormaPagoInven(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFormaPagoInven(false);
			
			//if(!this.isEsNuevoTipoFormaPagoInven) {								
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				
			}
			
			if(this.permiteMantenimiento(this.tipoformapagoinven)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFormaPagoInven=true;
					this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
					this.isEsNuevoTipoFormaPagoInven=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFormaPagoInven=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFormaPagoInven=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(false);
				
				this.habilitarDeshabilitarControlesTipoFormaPagoInven(false);
			
												
				
				if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFormaPagoInven();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,tipoformapagoinvenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFormaPagoInven(this.tipoformapagoinven,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoformapagoinvenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoformapagoinven.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoformapagoinven.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				this.tipoformapagoinven.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoformapagoinven)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFormaPagoInvenModel) this.jTableDatosTipoFormaPagoInven.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFormaPagoInven=true;
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
				this.isEsNuevoTipoFormaPagoInven=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(false);
				
				this.habilitarDeshabilitarControlesTipoFormaPagoInven(false);
				
				
				
				if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFormaPagoInven();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFormaPagoInven.getRowCount()>=1) {
				jTableDatosTipoFormaPagoInven.removeRowSelectionInterval(0, jTableDatosTipoFormaPagoInven.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFormaPagoInven(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(false) ;
			
			this.isEsNuevoTipoFormaPagoInven=false;
			
			if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFormaPagoInven();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFormaPagoInven(false);
				
				//SI ES MANUAL
				if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFormaPagoInven();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFormaPagoInven--;			
			//TipoFormaPagoInven tipoformapagoinvenAux= new TipoFormaPagoInven();			
			//tipoformapagoinvenAux.setId(this.iIdNuevoTipoFormaPagoInven);
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFormaPagoInven();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
			
			this.tipoformapagoinven.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().add(this.tipoformapagoinvenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoformapagoinvens.add(this.tipoformapagoinvenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			
			this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(this.getIndiceNuevoTipoFormaPagoInven(), this.getIndiceNuevoTipoFormaPagoInven());
			
			int iLastRow =  this.jTableDatosTipoFormaPagoInven.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFormaPagoInven.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFormaPagoInven.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
			
			//SI ES MANUAL
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormaPagoInven();
			}
			
			//this.abrirFrameTreeTipoFormaPagoInven();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Forma Pago InvenES ?", "MANTENIMIENTO DE Tipo Forma Pago Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFormaPagoInven.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFormaPagoInven();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.procesarImportacionTipoFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoformapagoinvenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFormaPagoInvenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFormaPagoInven.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFormaPagoInven.setFileImportacion(this.jInternalFrameImportacionTipoFormaPagoInven.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFormaPagoInven.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFormaPagoInven.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFormaPagoInven.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFormaPagoInven.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		

		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFormaPagoInvenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFormaPagoInvenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFormaPagoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformapagoinven.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformapagoinven.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFormaPagoInven tipoformapagoinven:tipoformapagoinvensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoformapagoinven.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFormaPagoInven(row);				
			//	iRow++;
			//}				
			
			//for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFormaPagoInven(tipoformapagoinvenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
			
			//SI ES MANUAL
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFormaPagoInven();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
			
			//SI ES MANUAL
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormaPagoInven();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
			
			//SI ES MANUAL
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFormaPagoInven();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFormaPagoInven() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFormaPagoInven.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFormaPagoInven.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFormaPagoInven.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFormaPagoInven.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFormaPagoInven.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFormaPagoInven.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFormaPagoInven.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFormaPagoInven(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFormaPagoInven(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFormaPagoInven(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFormaPagoInven(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFormaPagoInven(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFormaPagoInven(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormaPagoInven(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFormaPagoInven(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFormaPagoInven() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFormaPagoInven();
		
		this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormaPagoInven();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormaPagoInven() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormaPagoInven(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormaPagoInven(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFormaPagoInven.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFormaPagoInven.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionNuevoTipoFormaPagoInven.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFormaPagoInven.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFormaPagoInven.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionNuevoTipoFormaPagoInven.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionSinCerrarTipoFormaPagoInven.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jCheckBoxPostAccionSinMensajeTipoFormaPagoInven.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFormaPagoInven.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFormaPagoInven.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFormaPagoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFormaPagoInven.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFormaPagoInven.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFormaPagoInven.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFormaPagoInven.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFormaPagoInven(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFormaPagoInven(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFormaPagoInven() throws Exception {
		try	{
			if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormaPagoInven();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormaPagoInven() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFormaPagoInven() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFormaPagoInven.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFormaPagoInven.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFormaPagoInven.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFormaPagoInven.addItem(reporte);
			}
			
			
			if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFormaPagoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFormaPagoInven.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFormaPagoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFormaPagoInven.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFormaPagoInven.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFormaPagoInven.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFormaPagoInven.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormaPagoInven();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFormaPagoInven() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFormaPagoInven()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFormaPagoInven(Boolean esInicializar) throws Exception {				
		if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFormaPagoInven();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFormaPagoInven() throws Exception {
		this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFormaPagoInven() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFormaPagoInvenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInvenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFormaPagoInven(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoformapagoinvens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFormaPagoInven.setModel(new TipoFormaPagoInvenModel(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFormaPagoInven.setModel(new TipoFormaPagoInvenModel(this.tipoformapagoinvens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFormaPagoInven!=null && this.jInternalFrameOrderByTipoFormaPagoInven.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFormaPagoInven();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,tipoformapagoinvenConstantesFunciones.resaltarSeleccionarTipoFormaPagoInven,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFormaPagoInvenConstantesFunciones.SCLASSWEBTITULO,tipoformapagoinvenConstantesFunciones.resaltarSeleccionarTipoFormaPagoInven,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,TipoFormaPagoInvenConstantesFunciones.LABEL_ID));

		if(this.tipoformapagoinvenConstantesFunciones.mostraridTipoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormaPagoInvenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoformapagoinvenConstantesFunciones.resaltaridTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activaridTipoFormaPagoInven,this,true,"idTipoFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformapagoinvenConstantesFunciones.resaltaridTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activaridTipoFormaPagoInven,this,true,"idTipoFormaPagoInven","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipoformapagoinvenConstantesFunciones.mostrarid_empresaTipoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipoformapagoinvenConstantesFunciones.resaltarid_empresaTipoFormaPagoInven,this,this.tipoformapagoinvenConstantesFunciones.activarid_empresaTipoFormaPagoInven));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipoformapagoinvenConstantesFunciones.resaltarid_empresaTipoFormaPagoInven,this,this.tipoformapagoinvenConstantesFunciones.activarid_empresaTipoFormaPagoInven,false,"id_empresaTipoFormaPagoInven","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO));

		if(this.tipoformapagoinvenConstantesFunciones.mostrarcodigoTipoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoformapagoinvenConstantesFunciones.resaltarcodigoTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activarcodigoTipoFormaPagoInven,this,true,"codigoTipoFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformapagoinvenConstantesFunciones.resaltarcodigoTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activarcodigoTipoFormaPagoInven,this,true,"codigoTipoFormaPagoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoformapagoinvenConstantesFunciones.mostrarnombreTipoFormaPagoInven && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoformapagoinvenConstantesFunciones.resaltarnombreTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activarnombreTipoFormaPagoInven,this,true,"nombreTipoFormaPagoInven","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoformapagoinvenConstantesFunciones.resaltarnombreTipoFormaPagoInven,this.tipoformapagoinvenConstantesFunciones.activarnombreTipoFormaPagoInven,this,true,"nombreTipoFormaPagoInven","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFormaPagoInvenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormaPagoInven.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFormaPagoInven.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFormaPagoInven.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFormaPagoInven.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFormaPagoInven.moveColumn(this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFormaPagoInven.moveColumn(this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFormaPagoInven.moveColumn(this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFormaPagoInven.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFormaPagoInven.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFormaPagoInven,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFormaPagoInven.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFormaPagoInven.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFormaPagoInven.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoformapagoinvenLogic.getTipoFormaPagoInvens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoformapagoinvens.size()-1;
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
		//this.jTableDatosTipoFormaPagoInven.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFormaPagoInven.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFormaPagoInven();
			
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
				
				//this.isEsNuevoTipoFormaPagoInven=false;
					
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
				if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormaPagoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormaPagoInven.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoformapagoinven.getsType().equals("DUPLICADO")
				   || this.tipoformapagoinven.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFormaPagoInven=true;
				
				} else {
					this.isEsNuevoTipoFormaPagoInven=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoformapagoinven.getId()>=0 && !this.tipoformapagoinven.getIsNew()) {						
						this.isEsNuevoTipoFormaPagoInven=false;
						
					} else {
						this.isEsNuevoTipoFormaPagoInven=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFormaPagoInven(esRelaciones);						
				
				this.seleccionarTipoFormaPagoInven(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoformapagoinven.getId()<0) {
					this.isEsNuevoTipoFormaPagoInven=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFormaPagoInven(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFormaPagoInven(evt,rowIndex);
				}	
				
				if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFormaPagoInven: " + this.dDif); 
					}
				}								
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFormaPagoInven(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoformapagoinven)) {
					if(this.tipoformapagoinven.getId()>0) {
						this.tipoformapagoinven.setIsDeleted(true);
						
						this.tipoformapagoinvensEliminados.add(this.tipoformapagoinven);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().remove(this.tipoformapagoinven);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinvens.remove(this.tipoformapagoinven);				
					}
					
					
					((TipoFormaPagoInvenModel) this.jTableDatosTipoFormaPagoInven.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFormaPagoInven(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFormaPagoInven) {
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFormaPagoInven.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFormaPagoInven.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinven);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipoformapagoinvenConstantesFunciones.cargarid_empresaTipoFormaPagoInven || this.tipoformapagoinvenConstantesFunciones.event_dependid_empresaTipoFormaPagoInven) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipoformapagoinven.getid_empresa());
									//this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipoformapagoinven.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipoformapagoinven.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipoformapagoinven.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFormaPagoInven("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFormaPagoInven(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFormaPagoInven(tipoformapagoinven,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFormaPagoInven(tipoformapagoinven);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFormaPagoInven(tipoformapagoinven,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFormaPagoInven(tipoformapagoinven);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setText(tipoformapagoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setText(tipoformapagoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setText(tipoformapagoinven.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFormaPagoInven tipoformapagoinvenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoformapagoinvenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFormaPagoInven tipoformapagoinvenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoformapagoinvenLocal=this.tipoformapagoinven;
			} else {
				tipoformapagoinvenLocal=this.tipoformapagoinvenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoformapagoinvenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFormaPagoInven(tipoformapagoinvenLocal,true);
					
					if(tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoformapagoinvenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoformapagoinvenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(tipoformapagoinven,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(tipoformapagoinven);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(tipoformapagoinven,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.getText()==null || this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.getText()=="" || this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setText("0");
			}

			if(conColumnasBase) {tipoformapagoinven.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormaPagoInvenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelIdTipoFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoformapagoinven.setcodigo(this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelcodigoTipoFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoformapagoinven.setnombre(this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelnombreTipoFormaPagoInven,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinvenBean,TipoFormaPagoInven tipoformapagoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinvenOrigen,TipoFormaPagoInven tipoformapagoinven,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformapagoinvenOrigen.getId()!=null && !tipoformapagoinvenOrigen.getId().equals(0L))) {tipoformapagoinven.setId(tipoformapagoinvenOrigen.getId());}}
			if(conDefault || (!conDefault && tipoformapagoinvenOrigen.getcodigo()!=null && !tipoformapagoinvenOrigen.getcodigo().equals(""))) {tipoformapagoinven.setcodigo(tipoformapagoinvenOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoformapagoinvenOrigen.getnombre()!=null && !tipoformapagoinvenOrigen.getnombre().equals(""))) {tipoformapagoinven.setnombre(tipoformapagoinvenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setText(tipoformapagoinven.getId().toString());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setText(tipoformapagoinven.getcodigo());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setText(tipoformapagoinven.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFormaPagoInven(TipoFormaPagoInvenBean tipoformapagoinvenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setText(tipoformapagoinvenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setText(tipoformapagoinvenBean.getcodigo());
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setText(tipoformapagoinvenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFormaPagoInven(TipoFormaPagoInvenParameterReturnGeneral tipoformapagoinvenReturnGeneral,TipoFormaPagoInvenBean tipoformapagoinvenBean,Boolean conDefault) throws Exception { 
		try {
			TipoFormaPagoInven tipoformapagoinvenLocal=new TipoFormaPagoInven();
			
			tipoformapagoinvenLocal=tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoformapagoinvenLocal.getId()!=null && !tipoformapagoinvenLocal.getId().equals(0L))) {tipoformapagoinvenBean.setId(tipoformapagoinvenLocal.getId());}}
			if(conDefault || (!conDefault && tipoformapagoinvenLocal.getcodigo()!=null && !tipoformapagoinvenLocal.getcodigo().equals(""))) {tipoformapagoinvenBean.setcodigo(tipoformapagoinvenLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoformapagoinvenLocal.getnombre()!=null && !tipoformapagoinvenLocal.getnombre().equals(""))) {tipoformapagoinvenBean.setnombre(tipoformapagoinvenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFormaPagoInvenGenerico(Long idTipoFormaPagoInvenSeleccionado,JComboBox jComboBoxTipoFormaPagoInven,List<TipoFormaPagoInven> tipoformapagoinvensLocal)throws Exception {
		try {
			TipoFormaPagoInven  tipoformapagoinvenTemp=null;

			for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensLocal) {
				if(tipoformapagoinvenAux.getId()!=null && tipoformapagoinvenAux.getId().equals(idTipoFormaPagoInvenSeleccionado)) {
					tipoformapagoinvenTemp=tipoformapagoinvenAux;
					break;
				}
			}

			jComboBoxTipoFormaPagoInven.setSelectedItem(tipoformapagoinvenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFormaPagoInvenGenerico(JComboBox jComboBoxTipoFormaPagoInven,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormaPagoInven.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFormaPagoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFormaPagoInven.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFormaPagoInven.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFormaPagoInven.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFormaPagoInven.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformapagoinven=(TipoFormaPagoInven) tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformapagoinven =(TipoFormaPagoInven) tipoformapagoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipoformapagoinven.getIsNew() && !tipoformapagoinven.getIsChanged() && !tipoformapagoinven.getIsDeleted()) {
				sDescripcion=tipoformapagoinven.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipoformapagoinven.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFormaPagoInven tipoformapagoinvenRow=new TipoFormaPagoInven();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformapagoinvenRow=(TipoFormaPagoInven) tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoformapagoinvenRow=(TipoFormaPagoInven) tipoformapagoinvens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFormaPagoInven(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));			
			this.jButtonDuplicarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoFormaPagoInven && this.isPermisoDuplicarTipoFormaPagoInven));			
			this.jButtonCopiarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarTipoFormaPagoInven && this.isPermisoCopiarTipoFormaPagoInven));
			this.jButtonVerFormTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormTipoFormaPagoInven && this.isPermisoVerFormTipoFormaPagoInven));
			
			this.jButtonAbrirOrderByTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));			
			
			this.jButtonNuevoRelacionesTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));			
			this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarTipoFormaPagoInven && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarTipoFormaPagoInven && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarTipoFormaPagoInven && this.isPermisoEliminarTipoFormaPagoInven));
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarTipoFormaPagoInven);							
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));						
			this.jButtonDuplicarToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoFormaPagoInven && this.isPermisoDuplicarTipoFormaPagoInven));						
			this.jButtonCopiarToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarTipoFormaPagoInven && this.isPermisoCopiarTipoFormaPagoInven));			
			this.jButtonVerFormToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormTipoFormaPagoInven && this.isPermisoVerFormTipoFormaPagoInven));			
			this.jButtonAbrirOrderByToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));
			this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));			
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarTipoFormaPagoInven && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarTipoFormaPagoInven  && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarTipoFormaPagoInven && this.isPermisoEliminarTipoFormaPagoInven));
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarToolBarTipoFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarTipoFormaPagoInven);				
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));			
			this.jMenuItemDuplicarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaDuplicarTipoFormaPagoInven && this.isPermisoDuplicarTipoFormaPagoInven));			
			this.jMenuItemCopiarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaCopiarTipoFormaPagoInven && this.isPermisoCopiarTipoFormaPagoInven));			
			this.jMenuItemVerFormTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaVerFormTipoFormaPagoInven && this.isPermisoVerFormTipoFormaPagoInven));			
			this.jMenuItemAbrirOrderByTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));			
			//this.jMenuItemMostrarOcultarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));
			this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));			
			//this.jMenuItemDetalleMostrarOcultarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaOrdenTipoFormaPagoInven && this.isPermisoOrdenTipoFormaPagoInven));			
			this.jMenuItemNuevoRelacionesTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven));			
			this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaNuevoTipoFormaPagoInven && this.isPermisoNuevoTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));									
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemModificarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaModificarTipoFormaPagoInven && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemActualizarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaActualizarTipoFormaPagoInven && this.isPermisoActualizarTipoFormaPagoInven));	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemEliminarTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaEliminarTipoFormaPagoInven && this.isPermisoEliminarTipoFormaPagoInven));
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemCancelarTipoFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarTipoFormaPagoInven);				
			}
			
			this.jMenuItemGuardarCambiosTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));						
			this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=this.jButtonNuevoTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFormaPagoInven=this.jButtonDuplicarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCopiarTipoFormaPagoInven=this.jButtonCopiarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaVerFormTipoFormaPagoInven=this.jButtonVerFormTipoFormaPagoInven.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFormaPagoInven=this.jButtonAbrirOrderByTipoFormaPagoInven.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=this.jButtonNuevoRelacionesTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=this.jButtonModificarTipoFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=this.jButtonGuardarCambiosTablaTipoFormaPagoInven.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=this.jButtonNuevoToolBarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarToolBarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarToolBarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarToolBarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarToolBarTipoFormaPagoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormaPagoInven=this.jButtonGuardarCambiosToolBarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=this.jMenuItemNuevoTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=this.jMenuItemNuevoRelacionesTipoFormaPagoInven.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemModificarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemActualizarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemEliminarTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemCancelarTipoFormaPagoInven.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFormaPagoInven=this.jMenuItemGuardarCambiosTipoFormaPagoInven.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFormaPagoInven(Boolean esInicializar) {
		if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormaPagoInven();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFormaPagoInven(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFormaPagoInven() {
		this.jButtonNuevoTipoFormaPagoInven.setVisible(this.isPermisoNuevoTipoFormaPagoInven);			
		this.jButtonDuplicarTipoFormaPagoInven.setVisible(this.isPermisoDuplicarTipoFormaPagoInven);			
		this.jButtonCopiarTipoFormaPagoInven.setVisible(this.isPermisoCopiarTipoFormaPagoInven);			
		this.jButtonVerFormTipoFormaPagoInven.setVisible(this.isPermisoVerFormTipoFormaPagoInven);			
		
		this.jButtonAbrirOrderByTipoFormaPagoInven.setVisible(this.isPermisoOrdenTipoFormaPagoInven);					
		
		this.jButtonNuevoRelacionesTipoFormaPagoInven.setVisible(this.isPermisoNuevoTipoFormaPagoInven);			
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarTipoFormaPagoInven.setVisible(this.isPermisoActualizarTipoFormaPagoInven);	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.setVisible(this.isPermisoActualizarTipoFormaPagoInven);	
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.setVisible(this.isPermisoEliminarTipoFormaPagoInven);
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarTipoFormaPagoInven);						
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.setVisible(this.isPermisoGuardarCambiosTipoFormaPagoInven);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.setVisible(this.isPermisoActualizarTipoFormaPagoInven);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormaPagoInven() {
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarTipoFormaPagoInven.setVisible(this.isPermisoActualizarTipoFormaPagoInven);	
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.setVisible(this.isPermisoActualizarTipoFormaPagoInven);	
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.setVisible(this.isPermisoEliminarTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.setVisible(this.isVisibilidadCeldaCancelarTipoFormaPagoInven);							
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.setVisible((this.isVisibilidadCeldaGuardarTipoFormaPagoInven && this.isPermisoGuardarCambiosTipoFormaPagoInven));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFormaPagoInven() {
		if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFormaPagoInven();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFormaPagoInven() {
	}
	
	public void jTableDatosTipoFormaPagoInvenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFormaPagoInven(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.gettipoformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformapagoinven==null) {
						this.tipoformapagoinven = new TipoFormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				}

				if(this.tipoformapagoinven.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoformapagoinven.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoFormaPagoInvenUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoFormaPagoInven(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoFormaPagoInven.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoFormaPagoInven.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.gettipoformapagoinven(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipoformapagoinvenLogic.getConnexion());

				if(this.tipoformapagoinven.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipoformapagoinven.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoFormaPagoInven=(TitledBorder)this.jScrollPanelDatosTipoFormaPagoInven.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoFormaPagoInven.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.gettipoformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformapagoinven==null) {
						this.tipoformapagoinven = new TipoFormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				}

				if(this.tipoformapagoinven.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipoformapagoinven.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.gettipoformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformapagoinven==null) {
						this.tipoformapagoinven = new TipoFormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				}

				if(this.tipoformapagoinven.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoformapagoinven.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFormaPagoInvenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.gettipoformapagoinven(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoformapagoinven==null) {
						this.tipoformapagoinven = new TipoFormaPagoInven();
					}

					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);
				}

				if(this.tipoformapagoinven.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoformapagoinven.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFormaPagoInven(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoFormaPagoInvenActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);

			this.getTipoFormaPagoInvensFK_IdEmpresa();

			this.inicializarActualizarBindingTipoFormaPagoInven(false);

			//if(TipoFormaPagoInvenBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoformapagoinvenLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoFormaPagoInven() {
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.dispose();
			this.jInternalFrameDetalleFormTipoFormaPagoInven=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
			this.jInternalFrameReporteDinamicoTipoFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFormaPagoInven.dispose();
			this.jInternalFrameReporteDinamicoTipoFormaPagoInven=null;
		}
		
		if(this.jInternalFrameImportacionTipoFormaPagoInven!=null) {
			this.jInternalFrameImportacionTipoFormaPagoInven.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFormaPagoInven.dispose();
			this.jInternalFrameImportacionTipoFormaPagoInven=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFormaPagoInven();
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFormaPagoInven")) {
				jButtonDuplicarTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFormaPagoInven")) {
				jButtonCopiarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFormaPagoInven")) {
				jButtonVerFormTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFormaPagoInven")) {
				jButtonDuplicarTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFormaPagoInven")) {
				jButtonDuplicarTipoFormaPagoInvenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFormaPagoInven")) {
				jButtonModificarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFormaPagoInven")) {
				jButtonModificarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFormaPagoInven")) {
				jButtonModificarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFormaPagoInven")) {
				jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFormaPagoInven")) {
				jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFormaPagoInven")) {
				jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFormaPagoInven")) {
				jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFormaPagoInven")) {
				jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFormaPagoInven")) {
				jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFormaPagoInven")) {
				jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFormaPagoInven")) {
				jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFormaPagoInven")) {
				jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFormaPagoInven")) {
				jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFormaPagoInven")) {
				jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFormaPagoInven")) {
				jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFormaPagoInven")) {
				jButtonMostrarOcultarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFormaPagoInven")) {
				jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFormaPagoInven")) {
				jButtonCopiarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFormaPagoInven")) {
				jButtonVerFormTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFormaPagoInven")) {
				jButtonCopiarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFormaPagoInven")) {
				jButtonVerFormTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFormaPagoInven")) {
				jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFormaPagoInven")) {
				jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFormaPagoInven")) {
				jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFormaPagoInven")) {
				jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFormaPagoInven")) {
				jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFormaPagoInven")) {
				jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFormaPagoInven")) {
				jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFormaPagoInven")) {
				jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFormaPagoInven")) {
				jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFormaPagoInven") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFormaPagoInven")) {
				jButtonAbrirOrderByTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFormaPagoInven") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFormaPagoInven")) {
				jButtonMostrarOcultarTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormaPagoInven")) {
				jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFormaPagoInven")) {
				jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFormaPagoInven")) {
				jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFormaPagoInven")) {
				jButtonCerrarReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFormaPagoInven")) {
				jButtonGenerarReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFormaPagoInven")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFormaPagoInven")) {
				jButtonCerrarImportacionTipoFormaPagoInvenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFormaPagoInven")) {
				
				jButtonGenerarImportacionTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFormaPagoInven")) {
				
				jButtonAbrirImportacionTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFormaPagoInven")) {
				jComboBoxTiposAccionesTipoFormaPagoInvenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFormaPagoInven")) {
				jComboBoxTiposRelacionesTipoFormaPagoInvenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFormaPagoInven")) {
				jComboBoxTiposAccionesTipoFormaPagoInvenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFormaPagoInven")) {
				
				jComboBoxTiposSeleccionarTipoFormaPagoInvenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFormaPagoInven")) {
				jTextFieldValorCampoGeneralTipoFormaPagoInvenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFormaPagoInven")) {
				jButtonAbrirOrderByTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFormaPagoInven")) {
				jButtonAbrirOrderByTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFormaPagoInven")) {
				jButtonCerrarOrderByTipoFormaPagoInvenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormaPagoInvenBusqueda")) {
				this.jButtonidTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFormaPagoInvenUpdate")) {
				this.jButtonid_empresaTipoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFormaPagoInvenBusqueda")) {
				this.jButtonid_empresaTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFormaPagoInvenBusqueda")) {
				this.jButtoncodigoTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormaPagoInvenBusqueda")) {
				this.jButtonnombreTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFormaPagoInven();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFormaPagoInven tipoformapagoinvenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoformapagoinvenLocal=this.tipoformapagoinven;
			} else {
				tipoformapagoinvenLocal=this.tipoformapagoinvenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
							
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
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
			
			


			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
								
						
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
								
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
							
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
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
			
			


			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
								
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFormaPagoInven")) {
					jCheckBoxSeleccionarTodosTipoFormaPagoInvenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFormaPagoInven")) {
					jCheckBoxSeleccionadosTipoFormaPagoInvenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFormaPagoInven")) {
					
				}
				
				


				
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
												
				
				


				
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
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
			
			


			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoformapagoinven);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoformapagoinven);
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
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
				
				


				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFormaPagoInven.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFormaPagoInven.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFormaPagoInvenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoformapagoinvenAnterior =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFormaPagoInven")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFormaPagoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFormaPagoInven.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoformapagoinven =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoformapagoinven);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFormaPagoInven")) {
				
				}
				
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFormaPagoInven")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFormaPagoInven.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFormaPagoInven")) {
			
			}
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFormaPagoInven();
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFormaPagoInven")) {
				jButtonDuplicarTipoFormaPagoInvenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFormaPagoInven")) {
				jButtonCopiarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFormaPagoInven")) {
				jButtonVerFormTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFormaPagoInven")) {
				jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFormaPagoInven")) {
				jButtonModificarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFormaPagoInven")) {
				jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFormaPagoInven")) {
				jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFormaPagoInven")) {
				jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFormaPagoInven")) {
				jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFormaPagoInven")) {
				jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFormaPagoInven")) {
				jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFormaPagoInven")) {
				jButtonAbrirOrderByTipoFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFormaPagoInven")) {
				jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFormaPagoInven")) {
				jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFormaPagoInven")) {
				jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFormaPagoInvenBusqueda")) {
				this.jButtonidTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoFormaPagoInvenUpdate")) {
				this.jButtonid_empresaTipoFormaPagoInvenUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoFormaPagoInvenBusqueda")) {
				this.jButtonid_empresaTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFormaPagoInvenBusqueda")) {
				this.jButtoncodigoTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFormaPagoInvenBusqueda")) {
				this.jButtonnombreTipoFormaPagoInvenBusquedaActionPerformed(evt);
			}
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFormaPagoInven();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFormaPagoInven")) {
				closingInternalFrameTipoFormaPagoInven();
				
			} else if(sTipo.equals("jButtonCancelarTipoFormaPagoInven")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFormaPagoInven = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFormaPagoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoFormaPagoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormaPagoInven.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFormaPagoInvenActionPerformed(null);
			}
			
			TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoformapagoinven,new Object(),this.tipoformapagoinvenParameterGeneral,this.tipoformapagoinvenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFormaPagoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFormaPagoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFormaPagoInven(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoformapagoinven)) {
			if(!esControlTabla) {
				if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);			
				}
				
				if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.procesarEventosTipoFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this.tipoformapagoinven,this.tipoformapagoinvenParameterGeneral,this.isEsNuevoTipoFormaPagoInven,classes);//this.tipoformapagoinvenLogic.getTipoFormaPagoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral,this.tipoformapagoinvenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormaPagoInven(classes,this.tipoformapagoinvenReturnGeneral,this.tipoformapagoinvenBean,false);
					}
						
					if(this.tipoformapagoinvenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven());	
					}
						
					if(this.tipoformapagoinvenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven(),classes);//this.tipoformapagoinvenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFormaPagoInven(this.tipoformapagoinven,classes);//this.tipoformapagoinvenBean);									
				}
			
				if(TipoFormaPagoInvenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFormaPagoInven(this.tipoformapagoinven,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFormaPagoInven(this.tipoformapagoinven);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoformapagoinvenAnterior!=null) {
						this.tipoformapagoinven=this.tipoformapagoinvenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.procesarEventosTipoFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this.tipoformapagoinven,this.tipoformapagoinvenParameterGeneral,this.isEsNuevoTipoFormaPagoInven,classes);//this.tipoformapagoinvenLogic.getTipoFormaPagoInven()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoformapagoinvenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven(),tipoformapagoinvenLogic.getTipoFormaPagoInvens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven(),this.tipoformapagoinvens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFormaPagoInven.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFormaPagoInven.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFormaPagoInven();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFormaPagoInven() throws Exception {
		
		TipoFormaPagoInvenModel tipoformapagoinvenModel=(TipoFormaPagoInvenModel)this.jTableDatosTipoFormaPagoInven.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoformapagoinvenModel.tipoformapagoinvens=this.tipoformapagoinvenLogic.getTipoFormaPagoInvens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoformapagoinvenModel.tipoformapagoinvens=this.tipoformapagoinvens;
		}
		
		
		((TipoFormaPagoInvenModel) this.jTableDatosTipoFormaPagoInven.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFormaPagoInven() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoformapagoinvenAnterior(),this.tipoformapagoinvenLogic.getTipoFormaPagoInvens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoformapagoinvenAnterior(),this.tipoformapagoinvens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFormaPagoInven();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
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
										
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformapagoinven,new Object(),generalEntityParameterGeneral,this.tipoformapagoinvenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFormaPagoInvenConstantesFunciones.getClassesRelationshipsOfTipoFormaPagoInven(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFormaPagoInvenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFormaPagoInven(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFormaPagoInven(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoformapagoinven,new Object(),generalEntityParameterGeneral,this.tipoformapagoinvenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFormaPagoInven(TipoFormaPagoInvenBean tipoformapagoinvenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFormaPagoInven(ArrayList<Classe> classes,TipoFormaPagoInvenReturnGeneral tipoformapagoinvenReturnGeneral,TipoFormaPagoInvenBean tipoformapagoinvenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoformapagoinven)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven = new TipoFormaPagoInvenDetalleFormJInternalFrame(jDesktopPane,this.tipoformapagoinvenSessionBean.getConGuardarRelaciones(),this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.setVisible(false);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.tipoformapagoinvenLogic=this.tipoformapagoinvenLogic;
		
		this.cargarCombosFrameForeignKeyTipoFormaPagoInven("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFormaPagoInven();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFormaPagoInven();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFormaPagoInven("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFormaPagoInven();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormaPagoInven"));
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoFormaPagoInven"));

		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormaPagoInven"));
					
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemModificarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormaPagoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormaPagoInven"));
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormaPagoInven"));
						
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemActualizarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormaPagoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoFormaPagoInven"));
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormaPagoInven"));
								
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemEliminarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormaPagoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoFormaPagoInven"));
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormaPagoInven"));
					
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemCancelarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormaPagoInven"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemDetalleCerrarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormaPagoInven"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormaPagoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormaPagoInven"));
		
		
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormaPagoInven"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonidTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtoncodigoTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonnombreTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormaPagoInvenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormaPagoInven"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFormaPagoInven"));
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFormaPagoInven"));
		}
		
		this.jTableDatosTipoFormaPagoInven.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFormaPagoInven"));
		
		this.jTableDatosTipoFormaPagoInven.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFormaPagoInven"));
		
		this.jButtonNuevoTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoTipoFormaPagoInven"));
		
		this.jButtonDuplicarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"DuplicarTipoFormaPagoInven"));
		
		this.jButtonCopiarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"CopiarTipoFormaPagoInven"));
		
		this.jButtonVerFormTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"VerFormTipoFormaPagoInven"));
		
		
		this.jButtonNuevoToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFormaPagoInven"));
			
		this.jButtonDuplicarToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFormaPagoInven"));
			
		this.jMenuItemNuevoTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFormaPagoInven"));
			
		this.jMenuItemDuplicarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFormaPagoInven"));		
		
		
		this.jButtonNuevoRelacionesTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFormaPagoInven"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFormaPagoInven"));
			
		this.jMenuItemNuevoRelacionesTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFormaPagoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarTipoFormaPagoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonModificarToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFormaPagoInven"));
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemModificarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFormaPagoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"ActualizarTipoFormaPagoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonActualizarToolBarTipoFormaPagoInven.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFormaPagoInven"));
				
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemActualizarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFormaPagoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarTipoFormaPagoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonEliminarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFormaPagoInven"));
						
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemEliminarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFormaPagoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarTipoFormaPagoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonCancelarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFormaPagoInven"));
			
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemCancelarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFormaPagoInven"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFormaPagoInven"));		
		
		
		this.jButtonCerrarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarTipoFormaPagoInven"));
		
		
		this.jButtonCerrarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFormaPagoInven"));
			
		this.jMenuItemCerrarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFormaPagoInven"));
			
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jMenuItemDetalleCerrarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFormaPagoInven"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFormaPagoInven"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFormaPagoInven"));
		}
		
		this.jButtonCopiarToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFormaPagoInven"));
			
		this.jButtonVerFormToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFormaPagoInven"));
		
		this.jMenuItemGuardarCambiosTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFormaPagoInven"));
			
		this.jMenuItemCopiarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFormaPagoInven"));		
		
		this.jMenuItemVerFormTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFormaPagoInven"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormaPagoInven"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFormaPagoInven"));
			
		this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFormaPagoInven"));		
		
		
		
		this.jButtonRecargarInformacionTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFormaPagoInven"));
					
		this.jButtonRecargarInformacionToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFormaPagoInven"));
		
		this.jMenuItemRecargarInformacionTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFormaPagoInven"));		
		
		
		
		this.jButtonAnterioresTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"AnterioresTipoFormaPagoInven"));
		
		
		this.jButtonAnterioresToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFormaPagoInven"));
		
		this.jMenuItemAnterioresTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFormaPagoInven"));		
		
		
		this.jButtonSiguientesTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"SiguientesTipoFormaPagoInven"));
		
		
		this.jButtonSiguientesToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFormaPagoInven"));
			
		this.jMenuItemSiguientesTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFormaPagoInven"));
			
		this.jMenuItemAbrirOrderByTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFormaPagoInven"));
			
		this.jMenuItemMostrarOcultarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFormaPagoInven"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFormaPagoInven"));
			
		this.jMenuItemDetalleMostarOcultarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFormaPagoInven"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFormaPagoInven"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFormaPagoInven"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFormaPagoInven"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFormaPagoInven"));

		this.jCheckBoxSeleccionadosTipoFormaPagoInven.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFormaPagoInven"));
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFormaPagoInven"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFormaPagoInven"));
			
		this.jComboBoxTiposAccionesTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFormaPagoInven"));
					
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFormaPagoInven"));
			
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFormaPagoInven"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonidTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtoncodigoTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonnombreTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormaPagoInvenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFormaPagoInven!=null) {
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormaPagoInven"));
				this.jInternalFrameReporteDinamicoTipoFormaPagoInven.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormaPagoInven"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFormaPagoInven"));				
			//this.jButtonGenerarReporteDinamicoTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFormaPagoInven"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFormaPagoInven"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFormaPagoInven!=null) {
				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFormaPagoInven"));
				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFormaPagoInven"));
				this.jInternalFrameImportacionTipoFormaPagoInven.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFormaPagoInven"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFormaPagoInven"));
			
			this.jButtonAbrirOrderByToolBarTipoFormaPagoInven.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFormaPagoInven"));			
			
			if(this.jInternalFrameOrderByTipoFormaPagoInven!=null) {
				this.jInternalFrameOrderByTipoFormaPagoInven.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFormaPagoInven"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFormaPagoInven.jTabbedPaneRelacionesTipoFormaPagoInven.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFormaPagoInven"));
		
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
            		closingInternalFrameTipoFormaPagoInven();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFormaPagoInven = (JInternalFrameBase)event.getSource();
	            	
	            TipoFormaPagoInvenBeanSwingJInternalFrame jInternalFrameParent=(TipoFormaPagoInvenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFormaPagoInven.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFormaPagoInvenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFormaPagoInven.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFormaPagoInvenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFormaPagoInven.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFormaPagoInven.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFormaPagoInven";
		inputMap = this.jButtonNuevoTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFormaPagoInven";
		inputMap = this.jButtonNuevoRelacionesTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFormaPagoInvenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFormaPagoInven";
		inputMap = this.jButtonModificarTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFormaPagoInven";
		inputMap = this.jButtonActualizarTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFormaPagoInven";
		inputMap = this.jButtonEliminarTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFormaPagoInven";
		inputMap = this.jButtonCancelarTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFormaPagoInven";
		inputMap = this.jButtonCerrarTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFormaPagoInven";
		inputMap = this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonGuardarCambiosTipoFormaPagoInven.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFormaPagoInven.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFormaPagoInvenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFormaPagoInven.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFormaPagoInvenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonidTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFormaPagoInvenBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonid_empresaTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtoncodigoTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFormaPagoInvenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jButtonnombreTipoFormaPagoInvenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFormaPagoInvenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFormaPagoInven.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFormaPagoInvenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFormaPagoInven.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFormaPagoInven(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
					tipoformapagoinvenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvens) {
					tipoformapagoinvenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFormaPagoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
						tipoformapagoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvens) {
						tipoformapagoinvenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormaPagoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormaPagoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFormaPagoInvenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFormaPagoInven.getSelectedRows();
			
			TipoFormaPagoInven tipoformapagoinvenLocal=new TipoFormaPagoInven();
			
			//this.seleccionarTodosTipoFormaPagoInven(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoformapagoinvenLocal =(TipoFormaPagoInven) this.tipoformapagoinvenLogic.getTipoFormaPagoInvens().toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoformapagoinvenLocal =(TipoFormaPagoInven) this.tipoformapagoinvens.toArray()[this.jTableDatosTipoFormaPagoInven.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoformapagoinvenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
						tipoformapagoinvenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvens) {
						tipoformapagoinvenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFormaPagoInven.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFormaPagoInven.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFormaPagoInven,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFormaPagoInvenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFormaPagoInvenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFormaPagoInven.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
				
						if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoformapagoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformapagoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvens) {
					
						if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoformapagoinvenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoformapagoinvenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFormaPagoInvenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFormaPagoInven=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFormaPagoInven.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFormaPagoInven) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFormaPagoInven(conSplash);
				
					this.generarReporteTipoFormaPagoInvensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFormaPagoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormaPagoInvensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFormaPagoInvensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormaPagoInven();
				
				this.exportarTipoFormaPagoInvensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFormaPagoInvens();
				//this.importarTipoFormaPagoInvens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFormaPagoInven();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFormaPagoInvensSeleccionados();
				//this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Forma Pago Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFormaPagoInven();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFormaPagoInven)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFormaPagoInven(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoFormaPagoInvenBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoFormaPagoInven) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoFormaPagoInven(conSplash);
					
						//this.actualizarParametrosGeneralTipoFormaPagoInven();
						
						this.generarReporteProcesoAccionTipoFormaPagoInvensSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Forma Pago InvenES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Forma Pago Inven", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoFormaPagoInven();
				
						this.actualizarParametrosGeneralTipoFormaPagoInven();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoformapagoinvenReturnGeneral=tipoformapagoinvenLogic.procesarAccionTipoFormaPagoInvensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoformapagoinvenLogic.getTipoFormaPagoInvens(),this.tipoformapagoinvenParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoFormaPagoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFormaPagoInven();
					
					TipoFormaPagoInvenBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoFormaPagoInvenReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoFormaPagoInven.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxTiposAccionesFormularioTipoFormaPagoInven.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFormaPagoInven(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFormaPagoInvenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFormaPagoInven();
			
			if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
			TipoFormaPagoInven tipoformapagoinven=new TipoFormaPagoInven();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFormaPagoInven(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFormaPagoInven.getSelectedItem();
			
			
			
			
			tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoformapagoinvensSeleccionados.size()==1) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
					tipoformapagoinven=tipoformapagoinvenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFormaPagoInven();
			
      		//this.finishProcessTipoFormaPagoInven(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFormaPagoInvenReturnGeneral() throws Exception {
		if(this.tipoformapagoinvenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoformapagoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoformapagoinvenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoformapagoinvenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoformapagoinvenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoformapagoinvenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
		}
		
		if(this.tipoformapagoinvenReturnGeneral.getConRetornoLista() || this.tipoformapagoinvenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoformapagoinvenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformapagoinvenLogic.setTipoFormaPagoInvens(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInvens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoformapagoinvenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoformapagoinvenLogic.setTipoFormaPagoInven(this.tipoformapagoinvenReturnGeneral.getTipoFormaPagoInven());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFormaPagoInven(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFormaPagoInven() throws Exception {
		
		
	}
	
	public ArrayList<TipoFormaPagoInven> getTipoFormaPagoInvensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFormaPagoInven) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvenLogic.getTipoFormaPagoInvens()) {
					if(tipoformapagoinvenAux.getIsSelected()) {
						tipoformapagoinvensSeleccionados.add(tipoformapagoinvenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFormaPagoInven tipoformapagoinvenAux:this.tipoformapagoinvens) {
					if(tipoformapagoinvenAux.getIsSelected()) {
						tipoformapagoinvensSeleccionados.add(tipoformapagoinvenAux);				
					}
				}
			}
			
			if(tipoformapagoinvensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoformapagoinvensSeleccionados.addAll(this.tipoformapagoinvenLogic.getTipoFormaPagoInvens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoformapagoinvensSeleccionados.addAll(this.tipoformapagoinvens);				
					}
				}
			}
		} else {
			tipoformapagoinvensSeleccionados.add(this.tipoformapagoinven);
		}
		
		return tipoformapagoinvensSeleccionados;
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
	
	public void generarReporteTipoFormaPagoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormaPagoInvensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFormaPagoInvensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Forma Pago Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFormaPagoInvensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFormaPagoInven();
		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFormaPagoInven();
		
		
		//this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados ,tipoformapagoinvenImplementable,tipoformapagoinvenImplementableHome);
	}
	
	public void mostrarImportacionTipoFormaPagoInvens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFormaPagoInven();
		
		this.abrirFrameImportacionTipoFormaPagoInven();		
		
			
		//this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados ,tipoformapagoinvenImplementable,tipoformapagoinvenImplementableHome);
	}
	
	public void importarTipoFormaPagoInvens() throws Exception {		
	
	}
	
	public void exportarTipoFormaPagoInvensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFormaPagoInvensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFormaPagoInvensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFormaPagoInvensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Forma Pago Inven",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFormaPagoInven(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFormaPagoInven(tipoformapagoinvenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoformapagoinvenAux.setsDetalleGeneralEntityReporte(tipoformapagoinvenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFormaPagoInven(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFormaPagoInvenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormaPagoInvenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoformapagoinven.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformapagoinven.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformapagoinven.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformapagoinven.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoformapagoinven.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFormaPagoInvens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFormaPagoInven(row);				
				iRow++;
			}				
			
			for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFormaPagoInven(tipoformapagoinvenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFormaPagoInvensSeleccionados() throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();		
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoformapagoinven.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoformapagoinvens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoformapagoinven");
			//elementRoot.appendChild(element);
		
			for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
				element = document.createElement("tipoformapagoinven");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFormaPagoInven(tipoformapagoinvenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Forma Pago Inven",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFormaPagoInven(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformapagoinven.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformapagoinven.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformapagoinven.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoformapagoinven.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFormaPagoInven(TipoFormaPagoInven tipoformapagoinven,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFormaPagoInvenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoformapagoinven.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFormaPagoInvenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoformapagoinven.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoFormaPagoInvenConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipoformapagoinven.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoFormaPagoInvenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoformapagoinven.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoFormaPagoInvenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoformapagoinven.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFormaPagoInvensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados=new ArrayList<TipoFormaPagoInven>();
		
		tipoformapagoinvensSeleccionados=this.getTipoFormaPagoInvensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFormaPagoInven(tipoformapagoinvensSeleccionados);
		
		this.generarReporteTipoFormaPagoInvens("Todos",tipoformapagoinvensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFormaPagoInven(ArrayList<TipoFormaPagoInven> tipoformapagoinvensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFormaPagoInven tipoformapagoinvenAux:tipoformapagoinvensSeleccionados) {
				tipoformapagoinvenAux.setsDetalleGeneralEntityReporte(tipoformapagoinvenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipoformapagoinvenAux.setsDescripcionGeneralEntityReporte1(tipoformapagoinvenAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoformapagoinvenAux.setsDescripcionGeneralEntityReporte1(tipoformapagoinvenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoFormaPagoInvenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoformapagoinvenAux.setsDescripcionGeneralEntityReporte1(tipoformapagoinvenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFormaPagoInvenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFormaPagoInven(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFormaPagoInven=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=true;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
			this.isVisibilidadCeldaModificarTipoFormaPagoInven=true;
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaCancelarTipoFormaPagoInven=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFormaPagoInven=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFormaPagoInvenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=true;
		} else {
			this.actualizarEstadoPanelsTipoFormaPagoInven(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFormaPagoInven=false;
			//this.isVisibilidadCeldaVerFormTipoFormaPagoInven=false;
			this.isVisibilidadCeldaDuplicarTipoFormaPagoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFormaPagoInven=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFormaPagoInven=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!tipoformapagoinvenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;												
			}
			
			this.jButtonCerrarTipoFormaPagoInven.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFormaPagoInven=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoformapagoinven)) {
			this.isVisibilidadCeldaActualizarTipoFormaPagoInven=false;
			this.isVisibilidadCeldaEliminarTipoFormaPagoInven=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFormaPagoInven() {
	}
	
	public void actualizarEstadoPanelsTipoFormaPagoInven(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosEdicionTipoFormaPagoInven.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFormaPagoInven!=null) {
				this.jScrollPanelDatosTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFormaPagoInven!=null) {
				this.jPanelPaginacionTipoFormaPagoInven.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
					this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoformapagoinvenSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoFormaPagoInven!=null) {
				this.jTabbedPaneBusquedasTipoFormaPagoInven.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoFormaPagoInven!=null) {
				this.jPanelParametrosReportesTipoFormaPagoInven.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFormaPagoInvenSessionBean tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		
		if(this.tipoformapagoinvenSessionBean==null) {
			this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		}
		
		this.tipoformapagoinvenSessionBean.setsUltimaBusquedaTipoFormaPagoInven(this.getsAccionBusqueda());
		this.tipoformapagoinvenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoformapagoinvenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipoformapagoinvenSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFormaPagoInvenSessionBean tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		
		if(this.tipoformapagoinvenSessionBean==null) {
			this.tipoformapagoinvenSessionBean=new TipoFormaPagoInvenSessionBean();
		}
		
		if(this.tipoformapagoinvenSessionBean.getsUltimaBusquedaTipoFormaPagoInven()!=null&&!this.tipoformapagoinvenSessionBean.getsUltimaBusquedaTipoFormaPagoInven().equals("")) {
			this.setsAccionBusqueda(tipoformapagoinvenSessionBean.getsUltimaBusquedaTipoFormaPagoInven());
			this.setiNumeroPaginacion(tipoformapagoinvenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoformapagoinvenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipoformapagoinvenSessionBean.getid_empresa());
				tipoformapagoinvenSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipoformapagoinvenSessionBean.setsUltimaBusquedaTipoFormaPagoInven("");
		this.tipoformapagoinvenSessionBean.setiNumeroPaginacion(TipoFormaPagoInvenConstantesFunciones.INUMEROPAGINACION);
		this.tipoformapagoinvenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFormaPagoInven(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFormaPagoInven() {
		this.updateBorderResaltarBusquedasFormularioTipoFormaPagoInven();
		this.updateVisibilidadBusquedasFormularioTipoFormaPagoInven();
		this.updateHabilitarBusquedasFormularioTipoFormaPagoInven();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFormaPagoInven() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoFormaPagoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFormaPagoInven() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoFormaPagoInven.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoFormaPagoInven() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoFormaPagoInven.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoFormaPagoInven(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoFormaPagoInven.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoFormaPagoInven() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFormaPagoInven();
		this.updateVisibilidadResaltarControlesFormularioTipoFormaPagoInven();
		this.updateHabilitarResaltarControlesFormularioTipoFormaPagoInven();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFormaPagoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoformapagoinvenConstantesFunciones.resaltaridTipoFormaPagoInven!=null && this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setBorder(this.tipoformapagoinvenConstantesFunciones.resaltaridTipoFormaPagoInven);}
		if(this.tipoformapagoinvenConstantesFunciones.resaltarid_empresaTipoFormaPagoInven!=null && this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setBorder(this.tipoformapagoinvenConstantesFunciones.resaltarid_empresaTipoFormaPagoInven);}
		if(this.tipoformapagoinvenConstantesFunciones.resaltarcodigoTipoFormaPagoInven!=null && this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setBorder(this.tipoformapagoinvenConstantesFunciones.resaltarcodigoTipoFormaPagoInven);}
		if(this.tipoformapagoinvenConstantesFunciones.resaltarnombreTipoFormaPagoInven!=null && this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setBorder(this.tipoformapagoinvenConstantesFunciones.resaltarnombreTipoFormaPagoInven);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFormaPagoInven() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
	
		//this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostraridTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelidTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostraridTipoFormaPagoInven);
		//this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarid_empresaTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelid_empresaTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarid_empresaTipoFormaPagoInven);
		//this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarcodigoTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelcodigoTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarcodigoTipoFormaPagoInven);
		//this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarnombreTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jPanelnombreTipoFormaPagoInven.setVisible(this.tipoformapagoinvenConstantesFunciones.mostrarnombreTipoFormaPagoInven);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFormaPagoInven() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFormaPagoInven!=null) {
	
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jLabelidTipoFormaPagoInven.setEnabled(this.tipoformapagoinvenConstantesFunciones.activaridTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jComboBoxid_empresaTipoFormaPagoInven.setEnabled(this.tipoformapagoinvenConstantesFunciones.activarid_empresaTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextFieldcodigoTipoFormaPagoInven.setEnabled(this.tipoformapagoinvenConstantesFunciones.activarcodigoTipoFormaPagoInven);
		this.jInternalFrameDetalleFormTipoFormaPagoInven.jTextAreanombreTipoFormaPagoInven.setEnabled(this.tipoformapagoinvenConstantesFunciones.activarnombreTipoFormaPagoInven);
		}
	}
	
		
}