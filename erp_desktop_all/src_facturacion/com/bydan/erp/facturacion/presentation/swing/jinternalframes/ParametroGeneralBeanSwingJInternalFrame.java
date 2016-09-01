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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.ParametroGeneralConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroGeneralParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroGeneralParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ParametroGeneralBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class ParametroGeneralBeanSwingJInternalFrame extends ParametroGeneralJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroGeneralBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroGeneral> parametrogeneralValidator = new ClassValidator<ParametroGeneral>(ParametroGeneral.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroGeneral parametrogeneral;	
	public ParametroGeneral parametrogeneralAux;
	public ParametroGeneral parametrogeneralAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroGeneral parametrogeneralTotales;
	public Long idParametroGeneralActual;
	public Long iIdNuevoParametroGeneral=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTipoDocumentoGeneral="";

	public List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey;

	public List<TipoDocumentoGeneral> gettipodocumentogeneralsForeignKey() {
		return tipodocumentogeneralsForeignKey;
	}

	public void settipodocumentogeneralsForeignKey(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey) {
		this.tipodocumentogeneralsForeignKey = tipodocumentogeneralsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoDocumentoGeneral tipodocumentogeneralForeignKey;

	public TipoDocumentoGeneral gettipodocumentogeneralForeignKey() {
		return tipodocumentogeneralForeignKey;
	}

	public void settipodocumentogeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneralForeignKey) {
		this.tipodocumentogeneralForeignKey = tipodocumentogeneralForeignKey;
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
	
	public Boolean isPermisoTodoParametroGeneral;
	public Boolean isPermisoNuevoParametroGeneral;
	public Boolean isPermisoActualizarParametroGeneral;
	public Boolean isPermisoActualizarOriginalParametroGeneral;
	public Boolean isPermisoEliminarParametroGeneral;
	public Boolean isPermisoGuardarCambiosParametroGeneral;
	public Boolean isPermisoConsultaParametroGeneral;
	public Boolean isPermisoBusquedaParametroGeneral;
	public Boolean isPermisoReporteParametroGeneral;
	public Boolean isPermisoPaginacionMedioParametroGeneral;
	public Boolean isPermisoPaginacionAltoParametroGeneral;
	public Boolean isPermisoPaginacionTodoParametroGeneral;
	public Boolean isPermisoCopiarParametroGeneral;
	public Boolean isPermisoVerFormParametroGeneral;
	public Boolean isPermisoDuplicarParametroGeneral;
	public Boolean isPermisoOrdenParametroGeneral;
	
	
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
	
	public ParametroGeneralParameterReturnGeneral parametrogeneralReturnGeneral;
	public ParametroGeneralParameterReturnGeneral parametrogeneralParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroGeneral=false;
	public Boolean esParaAccionDesdeFormularioParametroGeneral=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroGeneralSessionBeanAdditional parametrogeneralSessionBeanAdditional=null;
	
	public ParametroGeneralSessionBeanAdditional getParametroGeneralSessionBeanAdditional() {
		return this.parametrogeneralSessionBeanAdditional;
	}
	
	public void setParametroGeneralSessionBeanAdditional(ParametroGeneralSessionBeanAdditional parametrogeneralSessionBeanAdditional) {
		try {
			this.parametrogeneralSessionBeanAdditional=parametrogeneralSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroGeneralBeanSwingJInternalFrameAdditional parametrogeneralBeanSwingJInternalFrameAdditional=null;
	//public class ParametroGeneralBeanSwingJInternalFrame
	
	public ParametroGeneralBeanSwingJInternalFrameAdditional getParametroGeneralBeanSwingJInternalFrameAdditional() {
		return this.parametrogeneralBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroGeneralBeanSwingJInternalFrameAdditional(ParametroGeneralBeanSwingJInternalFrameAdditional parametrogeneralBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrogeneralBeanSwingJInternalFrameAdditional=parametrogeneralBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroGeneralLogic parametrogeneralLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroGeneral parametrogeneralBean;
	public ParametroGeneralConstantesFunciones parametrogeneralConstantesFunciones;
	//public ParametroGeneralParameterReturnGeneral parametrogeneralReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoDocumentoGeneralLogic tipodocumentogeneralLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroGeneral> parametrogenerals;	
	//public List<ParametroGeneral> parametrogeneralsEliminados;
	//public List<ParametroGeneral> parametrogeneralsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroGeneral=false;
	public Boolean isVisibilidadCeldaDuplicarParametroGeneral=true;
	public Boolean isVisibilidadCeldaCopiarParametroGeneral=true;
	public Boolean isVisibilidadCeldaVerFormParametroGeneral=true;
	public Boolean isVisibilidadCeldaOrdenParametroGeneral=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
	public Boolean isVisibilidadCeldaModificarParametroGeneral=false;
	public Boolean isVisibilidadCeldaActualizarParametroGeneral=false;
	public Boolean isVisibilidadCeldaEliminarParametroGeneral=false;
	public Boolean isVisibilidadCeldaCancelarParametroGeneral=false;
	public Boolean isVisibilidadCeldaGuardarParametroGeneral=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroGeneral=false;	
	
	
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdSucursalEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoDocumentoGeneral=false;
	
	public Long getiIdNuevoParametroGeneral() {
		return this.iIdNuevoParametroGeneral;
	}

	public void setiIdNuevoParametroGeneral(Long iIdNuevoParametroGeneral) {
		this.iIdNuevoParametroGeneral = iIdNuevoParametroGeneral;
	}
	
	public Long getidParametroGeneralActual() {
		return this.idParametroGeneralActual;
	}

	public void setidParametroGeneralActual(Long idParametroGeneralActual) {
		this.idParametroGeneralActual = idParametroGeneralActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroGeneral getparametrogeneral() {
		return this.parametrogeneral;
	}

	public void setparametrogeneral(ParametroGeneral parametrogeneral) {
		this.parametrogeneral = parametrogeneral;
	}
	
	public ParametroGeneral getparametrogeneralAux() {
		return this.parametrogeneralAux;
	}

	public void setparametrogeneralAux(ParametroGeneral parametrogeneralAux) {
		this.parametrogeneralAux = parametrogeneralAux;
	}				
	
	public ParametroGeneral getparametrogeneralAnterior() {
		return this.parametrogeneralAnterior;
	}

	public void setparametrogeneralAnterior(ParametroGeneral parametrogeneralAnterior) {
		this.parametrogeneralAnterior = parametrogeneralAnterior;
	}	
	
	public ParametroGeneral getparametrogeneralTotales() {
		return this.parametrogeneralTotales;
	}

	public void setparametrogeneralTotales(ParametroGeneral parametrogeneralTotales) {
		this.parametrogeneralTotales = parametrogeneralTotales;
	}	
	
	public ParametroGeneral getparametrogeneralBean() {
		return this.parametrogeneralBean;
	}

	public void setparametrogeneralBean(ParametroGeneral parametrogeneralBean) {
		this.parametrogeneralBean = parametrogeneralBean;
	}	
	
	public ParametroGeneralParameterReturnGeneral getparametrogeneralReturnGeneral() {
		return this.parametrogeneralReturnGeneral;
	}

	public void setparametrogeneralReturnGeneral(ParametroGeneralParameterReturnGeneral parametrogeneralReturnGeneral) {
		this.parametrogeneralReturnGeneral = parametrogeneralReturnGeneral;
	}	
	
	
	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_empresaFK_IdSucursalEmpresa=-1L;

	public Long getid_empresaFK_IdSucursalEmpresa() {
		return this.id_empresaFK_IdSucursalEmpresa;
	}

	public void setid_empresaFK_IdSucursalEmpresa(Long id_empresaFK_IdSucursalEmpresa) {
		this.id_empresaFK_IdSucursalEmpresa = id_empresaFK_IdSucursalEmpresa;
	}

	public Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral=-1L;

	public Long getid_tipo_documento_generalFK_IdTipoDocumentoGeneral() {
		return this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
	}

	public void setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(Long id_tipo_documento_generalFK_IdTipoDocumentoGeneral) {
		this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral = id_tipo_documento_generalFK_IdTipoDocumentoGeneral;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroGeneralLogic getParametroGeneralLogic()	{		
		return parametrogeneralLogic;
	}

	public void setParametroGeneralLogic(ParametroGeneralLogic parametrogeneralLogic) {
		this.parametrogeneralLogic = parametrogeneralLogic;
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
	
	public Boolean getIsEsNuevoParametroGeneral() {
		return isEsNuevoParametroGeneral;
	}

	public void setIsEsNuevoParametroGeneral(Boolean isEsNuevoParametroGeneral) {
		this.isEsNuevoParametroGeneral = isEsNuevoParametroGeneral;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroGeneral() {
		return esParaAccionDesdeFormularioParametroGeneral;
	}
	
	public void setEsParaAccionDesdeFormularioParametroGeneral(Boolean esParaAccionDesdeFormularioParametroGeneral) {
		this.esParaAccionDesdeFormularioParametroGeneral = esParaAccionDesdeFormularioParametroGeneral;
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

			if(this.parametrogeneralSessionBean==null) {
				this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
			}

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrogeneralSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogeneralSessionBean==null) {
				this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
			}

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(parametrogeneralSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosTipoDocumentoGeneralsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoDocumentoGeneralLogic tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();

			//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

			if(this.parametrogeneralSessionBean==null) {
				this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
			}

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipodocumentogeneralLogic.getTipoDocumentoGeneralDataAccess().setIsForForeingKeyData(true);

					tipodocumentogeneralLogic.getTodosTipoDocumentoGeneralsWithConnection(sFinalQuery,new Pagination());

					this.tipodocumentogeneralsForeignKey=tipodocumentogeneralLogic.getTipoDocumentoGenerals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoDocumentoGeneral(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodocumentogeneralLogic.getEntityWithConnection(parametrogeneralSessionBean.getlidTipoDocumentoGeneralActual());
					this.tipodocumentogeneralsForeignKey.add(tipodocumentogeneralLogic.getTipoDocumentoGeneral());
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

					if(this.parametrogeneral!=null) {
						this.parametrogeneral.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroGeneral.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroGeneralGenerico)throws Exception
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
				jComboBoxid_empresaParametroGeneralGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroGeneralGenerico!=null && jComboBoxid_empresaParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.parametrogeneral!=null) {
						this.parametrogeneral.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroGeneral.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroGeneralGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalParametroGeneralGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroGeneralGenerico!=null && jComboBoxid_sucursalParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoDocumentoGeneralForeignKey(Long idTipoDocumentoGeneralSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipodocumentogeneralTemp!=null) {

					if(this.parametrogeneral!=null) {
						this.parametrogeneral.setTipoDocumentoGeneral(tipodocumentogeneralTemp);
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedItem(tipodocumentogeneralTemp);
					}
				} else {
					//jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedItem(tipodocumentogeneralTemp);
					if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
						if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipodocumentogeneralTemp!=null && jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral!=null) {
						jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setSelectedItem(tipodocumentogeneralTemp);
					} else {
						if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral!=null) {
							//jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setSelectedItem(tipodocumentogeneralTemp);
							if(jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.getItemCount()>0) {
								jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setSelectedIndex(0);
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

	public String getActualTipoDocumentoGeneralForeignKeyDescripcion(Long idTipoDocumentoGeneralSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}


			sDescripcion=TipoDocumentoGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoDocumentoGeneralForeignKeyGenerico(Long idTipoDocumentoGeneralSeleccionado,JComboBox jComboBoxid_tipo_documento_generalParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralTemp=null;

			for(TipoDocumentoGeneral tipodocumentogeneralAux:tipodocumentogeneralsForeignKey) {
				if(tipodocumentogeneralAux.getId()!=null && tipodocumentogeneralAux.getId().equals(idTipoDocumentoGeneralSeleccionado)) {
					tipodocumentogeneralTemp=tipodocumentogeneralAux;
					break;
				}
			}

			if(tipodocumentogeneralTemp!=null) {
				jComboBoxid_tipo_documento_generalParametroGeneralGenerico.setSelectedItem(tipodocumentogeneralTemp);
			} else {
				if(jComboBoxid_tipo_documento_generalParametroGeneralGenerico!=null && jComboBoxid_tipo_documento_generalParametroGeneralGenerico.getItemCount()>0) {
					jComboBoxid_tipo_documento_generalParametroGeneralGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroGeneral parametrogeneral,JComboBox jComboBoxid_empresaParametroGeneralGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroGeneralGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroGeneralGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrogeneral.setid_empresa(empresaAux.getId());
				parametrogeneral.setempresa_descripcion(ParametroGeneralConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrogeneral.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroGeneral parametrogeneral,JComboBox jComboBoxid_sucursalParametroGeneralGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroGeneralGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroGeneralGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametrogeneral.setid_sucursal(sucursalAux.getId());
				parametrogeneral.setsucursal_descripcion(ParametroGeneralConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametrogeneral.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoDocumentoGeneralForeignKey(ParametroGeneral parametrogeneral,JComboBox jComboBoxid_tipo_documento_generalParametroGeneralGenerico)throws Exception
	{
		try
		{
			TipoDocumentoGeneral  tipodocumentogeneralAux=new TipoDocumentoGeneral();

			if(jComboBoxid_tipo_documento_generalParametroGeneralGenerico==null) {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.getSelectedItem();
			} else {
				tipodocumentogeneralAux=(TipoDocumentoGeneral)jComboBoxid_tipo_documento_generalParametroGeneralGenerico.getSelectedItem();
			}

			if(tipodocumentogeneralAux!=null && tipodocumentogeneralAux.getId()!=null) {
				parametrogeneral.setid_tipo_documento_general(tipodocumentogeneralAux.getId());
				parametrogeneral.settipodocumentogeneral_descripcion(ParametroGeneralConstantesFunciones.getTipoDocumentoGeneralDescripcion(tipodocumentogeneralAux));
				parametrogeneral.setTipoDocumentoGeneral(tipodocumentogeneralAux);			}
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

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
					}

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
					}

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoDocumentoGeneralsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoDocumentoGeneral=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.addItem(tipodocumentogeneral);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroGeneral!=null) { 
					}

					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoDocumentoGeneral") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.removeAllItems();

							for(TipoDocumentoGeneral tipodocumentogeneral:this.tipodocumentogeneralsForeignKey) {
								this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.addItem(tipodocumentogeneral);
							}
						}

						if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoDocumentoGeneralForeignKey(TipoDocumentoGeneral tipodocumentogeneral,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedItem(tipodocumentogeneral);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setSelectedItem(tipodocumentogeneral);
						} else {
							this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroGeneral() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroGeneralConstantesFunciones.refrescarForeignKeysDescripcionesParametroGeneral(this.parametrogeneralLogic.getParametroGenerals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroGeneralConstantesFunciones.refrescarForeignKeysDescripcionesParametroGeneral(this.parametrogenerals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoDocumentoGeneral.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrogeneralLogic.setParametroGenerals(this.parametrogenerals);
			parametrogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroGeneralParameterReturnGeneral getParametroGeneralParameterGeneral() {
		return this.parametrogeneralParameterGeneral;
	}
	
	public void setParametroGeneralParameterGeneral(ParametroGeneralParameterReturnGeneral parametrogeneralParameterGeneral) {
		this.parametrogeneralParameterGeneral = parametrogeneralParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroGeneral() {
		return isPermisoTodoParametroGeneral;
	}

	public void setIsPermisoTodoParametroGeneral(Boolean isPermisoTodoParametroGeneral) {
		this.isPermisoTodoParametroGeneral = isPermisoTodoParametroGeneral;
	}

	public Boolean getIsPermisoNuevoParametroGeneral() {
		return isPermisoNuevoParametroGeneral;
	}

	public void setIsPermisoNuevoParametroGeneral(Boolean isPermisoNuevoParametroGeneral) {
		this.isPermisoNuevoParametroGeneral = isPermisoNuevoParametroGeneral;
	}

	public Boolean getIsPermisoActualizarParametroGeneral() {
		return isPermisoActualizarParametroGeneral;
	}

	public void setIsPermisoActualizarParametroGeneral(Boolean isPermisoActualizarParametroGeneral) {
		this.isPermisoActualizarParametroGeneral = isPermisoActualizarParametroGeneral;
	}

	public Boolean getIsPermisoEliminarParametroGeneral() {
		return isPermisoEliminarParametroGeneral;
	}

	public void setIsPermisoEliminarParametroGeneral(Boolean isPermisoEliminarParametroGeneral) {
		this.isPermisoEliminarParametroGeneral = isPermisoEliminarParametroGeneral;
	}

	public Boolean getIsPermisoGuardarCambiosParametroGeneral() {
		return isPermisoGuardarCambiosParametroGeneral;
	}

	public void setIsPermisoGuardarCambiosParametroGeneral(Boolean isPermisoGuardarCambiosParametroGeneral) {
		this.isPermisoGuardarCambiosParametroGeneral = isPermisoGuardarCambiosParametroGeneral;
	}
	
	public Boolean getIsPermisoConsultaParametroGeneral() {
		return isPermisoConsultaParametroGeneral;
	}

	public void setIsPermisoConsultaParametroGeneral(Boolean isPermisoConsultaParametroGeneral) {
		this.isPermisoConsultaParametroGeneral = isPermisoConsultaParametroGeneral;
	}

	public Boolean getIsPermisoBusquedaParametroGeneral() {
		return isPermisoBusquedaParametroGeneral;
	}

	public void setIsPermisoBusquedaParametroGeneral(Boolean isPermisoBusquedaParametroGeneral) {
		this.isPermisoBusquedaParametroGeneral = isPermisoBusquedaParametroGeneral;
	}

	public Boolean getIsPermisoReporteParametroGeneral() {
		return isPermisoReporteParametroGeneral;
	}

	public void setIsPermisoReporteParametroGeneral(Boolean isPermisoReporteParametroGeneral) {
		this.isPermisoReporteParametroGeneral = isPermisoReporteParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroGeneral() {
		return isPermisoPaginacionMedioParametroGeneral;
	}

	public void setIsPermisoPaginacionMedioParametroGeneral(Boolean isPermisoPaginacionMedioParametroGeneral) {
		this.isPermisoPaginacionMedioParametroGeneral = isPermisoPaginacionMedioParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroGeneral() {
		return isPermisoPaginacionTodoParametroGeneral;
	}

	public void setIsPermisoPaginacionTodoParametroGeneral(Boolean isPermisoPaginacionTodoParametroGeneral) {
		this.isPermisoPaginacionTodoParametroGeneral = isPermisoPaginacionTodoParametroGeneral;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroGeneral() {
		return isPermisoPaginacionAltoParametroGeneral;
	}

	public void setIsPermisoPaginacionAltoParametroGeneral(Boolean isPermisoPaginacionAltoParametroGeneral) {
		this.isPermisoPaginacionAltoParametroGeneral = isPermisoPaginacionAltoParametroGeneral;
	}
	
	public Boolean getIsPermisoCopiarParametroGeneral() {
		return isPermisoCopiarParametroGeneral;
	}

	public void setIsPermisoCopiarParametroGeneral(Boolean isPermisoCopiarParametroGeneral) {
		this.isPermisoCopiarParametroGeneral = isPermisoCopiarParametroGeneral;
	}
	
	public Boolean getIsPermisoVerFormParametroGeneral() {
		return isPermisoVerFormParametroGeneral;
	}

	public void setIsPermisoVerFormParametroGeneral(Boolean isPermisoVerFormParametroGeneral) {
		this.isPermisoVerFormParametroGeneral = isPermisoVerFormParametroGeneral;
	}
	
	public Boolean getIsPermisoDuplicarParametroGeneral() {
		return isPermisoDuplicarParametroGeneral;
	}

	public void setIsPermisoDuplicarParametroGeneral(Boolean isPermisoDuplicarParametroGeneral) {
		this.isPermisoDuplicarParametroGeneral = isPermisoDuplicarParametroGeneral;
	}
	
	public Boolean getIsPermisoOrdenParametroGeneral() {
		return isPermisoOrdenParametroGeneral;
	}

	public void setIsPermisoOrdenParametroGeneral(Boolean isPermisoOrdenParametroGeneral) {
		this.isPermisoOrdenParametroGeneral = isPermisoOrdenParametroGeneral;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroGeneral() {
		return isVisibilidadCeldaNuevoParametroGeneral;
	}

	public void setIsVisibilidadCeldaNuevoParametroGeneral(Boolean isVisibilidadCeldaNuevoParametroGeneral) {
		this.isVisibilidadCeldaNuevoParametroGeneral = isVisibilidadCeldaNuevoParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroGeneral() {
		return isVisibilidadCeldaDuplicarParametroGeneral;
	}

	public void setIsVisibilidadCeldaDuplicarParametroGeneral(Boolean isVisibilidadCeldaDuplicarParametroGeneral) {
		this.isVisibilidadCeldaDuplicarParametroGeneral = isVisibilidadCeldaDuplicarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroGeneral() {
		return isVisibilidadCeldaCopiarParametroGeneral;
	}

	public void setIsVisibilidadCeldaCopiarParametroGeneral(Boolean isVisibilidadCeldaCopiarParametroGeneral) {
		this.isVisibilidadCeldaCopiarParametroGeneral = isVisibilidadCeldaCopiarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroGeneral() {
		return isVisibilidadCeldaVerFormParametroGeneral;
	}

	public void setIsVisibilidadCeldaVerFormParametroGeneral(Boolean isVisibilidadCeldaVerFormParametroGeneral) {
		this.isVisibilidadCeldaVerFormParametroGeneral = isVisibilidadCeldaVerFormParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroGeneral() {
		return isVisibilidadCeldaOrdenParametroGeneral;
	}

	public void setIsVisibilidadCeldaOrdenParametroGeneral(Boolean isVisibilidadCeldaOrdenParametroGeneral) {
		this.isVisibilidadCeldaOrdenParametroGeneral = isVisibilidadCeldaOrdenParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroGeneral() {
		return isVisibilidadCeldaNuevoRelacionesParametroGeneral;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroGeneral(Boolean isVisibilidadCeldaNuevoRelacionesParametroGeneral) {
		this.isVisibilidadCeldaNuevoRelacionesParametroGeneral = isVisibilidadCeldaNuevoRelacionesParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroGeneral() {
		return isVisibilidadCeldaModificarParametroGeneral;
	}

	public void setIsVisibilidadCeldaModificarParametroGeneral(Boolean isVisibilidadCeldaModificarParametroGeneral) {
		this.isVisibilidadCeldaModificarParametroGeneral = isVisibilidadCeldaModificarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroGeneral() {
		return isVisibilidadCeldaActualizarParametroGeneral;
	}

	public void setIsVisibilidadCeldaActualizarParametroGeneral(Boolean isVisibilidadCeldaActualizarParametroGeneral) {
		this.isVisibilidadCeldaActualizarParametroGeneral = isVisibilidadCeldaActualizarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroGeneral() {
		return isVisibilidadCeldaEliminarParametroGeneral;
	}

	public void setIsVisibilidadCeldaEliminarParametroGeneral(Boolean isVisibilidadCeldaEliminarParametroGeneral) {
		this.isVisibilidadCeldaEliminarParametroGeneral = isVisibilidadCeldaEliminarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroGeneral() {
		return isVisibilidadCeldaCancelarParametroGeneral;
	}

	public void setIsVisibilidadCeldaCancelarParametroGeneral(Boolean isVisibilidadCeldaCancelarParametroGeneral) {
		this.isVisibilidadCeldaCancelarParametroGeneral = isVisibilidadCeldaCancelarParametroGeneral;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroGeneral() {
		return isVisibilidadCeldaGuardarParametroGeneral;
	}

	public void setIsVisibilidadCeldaGuardarParametroGeneral(Boolean isVisibilidadCeldaGuardarParametroGeneral) {
		this.isVisibilidadCeldaGuardarParametroGeneral = isVisibilidadCeldaGuardarParametroGeneral;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroGeneral() {
		return isVisibilidadCeldaGuardarCambiosParametroGeneral;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroGeneral(Boolean isVisibilidadCeldaGuardarCambiosParametroGeneral) {
		this.isVisibilidadCeldaGuardarCambiosParametroGeneral = isVisibilidadCeldaGuardarCambiosParametroGeneral;
	}
		
	public ParametroGeneralSessionBean getparametrogeneralSessionBean() {
		return this.parametrogeneralSessionBean;
	}
	
	public void setparametrogeneralSessionBean(ParametroGeneralSessionBean parametrogeneralSessionBean) {
		this.parametrogeneralSessionBean=parametrogeneralSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdSucursalEmpresa() {
		return this.isVisibilidadFK_IdSucursalEmpresa;
	}

	public void setisVisibilidadFK_IdSucursalEmpresa(Boolean isVisibilidadFK_IdSucursalEmpresa) {
		this.isVisibilidadFK_IdSucursalEmpresa=isVisibilidadFK_IdSucursalEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoDocumentoGeneral() {
		return this.isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	public void setisVisibilidadFK_IdTipoDocumentoGeneral(Boolean isVisibilidadFK_IdTipoDocumentoGeneral) {
		this.isVisibilidadFK_IdTipoDocumentoGeneral=isVisibilidadFK_IdTipoDocumentoGeneral;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(ParametroGeneral parametrogeneral)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrogeneral,null);
				this.setActualParaGuardarSucursalForeignKey(parametrogeneral,null);
				this.setActualParaGuardarTipoDocumentoGeneralForeignKey(parametrogeneral,null);
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
	
	public void bugActualizarReferenciaActual(ParametroGeneral parametrogeneral,ParametroGeneral parametrogeneralAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroGeneral(parametrogeneral);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrogeneralAux.setId(parametrogeneral.getId());
		parametrogeneralAux.setVersionRow(parametrogeneral.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroGeneral();
		
			int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrogeneralValidator.getInvalidValues(this.parametrogeneral);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrogeneralLogic.setDatosCliente(datosCliente);
			parametrogeneralLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrogeneralAux=new  ParametroGeneral();
				
				parametrogeneralAux.setIsNew(true);
				parametrogeneralAux.setIsChanged(true);
				
				parametrogeneralAux.setParametroGeneralOriginal(this.parametrogeneral);
				
				parametrogeneralAux.setId(this.parametrogeneral.getId());	
				parametrogeneralAux.setVersionRow(this.parametrogeneral.getVersionRow());	
				parametrogeneralAux.setid_empresa(this.parametrogeneral.getid_empresa());	
				parametrogeneralAux.setid_sucursal(this.parametrogeneral.getid_sucursal());	
				parametrogeneralAux.setid_tipo_documento_general(this.parametrogeneral.getid_tipo_documento_general());	
				parametrogeneralAux.setnumero_secuencial(this.parametrogeneral.getnumero_secuencial());	
				parametrogeneralAux.setnumero_autor(this.parametrogeneral.getnumero_autor());	
				parametrogeneralAux.setfecha_inicio(this.parametrogeneral.getfecha_inicio());	
				parametrogeneralAux.setfecha_fin(this.parametrogeneral.getfecha_fin());	
				parametrogeneralAux.setesta_activo(this.parametrogeneral.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralAux,parametrogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.saveParametroGenerals();//WithConnection
						//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);
					
					this.refrescarForeignKeysDescripcionesParametroGeneral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogeneralLogic.saveParametroGeneralRelaciones(parametrogeneralAux);//WithConnection
								//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrogeneralAux,parametrogenerals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrogeneralAux=new  ParametroGeneral();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrogeneralSessionBean.getEsGuardarRelacionado() && this.parametrogeneral.getId()>=0)) {
						
					parametrogeneralAux.setIsNew(false);
				}
				
				parametrogeneralAux.setIsDeleted(false);
			
				parametrogeneralAux.setId(this.parametrogeneral.getId());	
				parametrogeneralAux.setVersionRow(this.parametrogeneral.getVersionRow());	
				parametrogeneralAux.setid_empresa(this.parametrogeneral.getid_empresa());	
				parametrogeneralAux.setid_sucursal(this.parametrogeneral.getid_sucursal());	
				parametrogeneralAux.setid_tipo_documento_general(this.parametrogeneral.getid_tipo_documento_general());	
				parametrogeneralAux.setnumero_secuencial(this.parametrogeneral.getnumero_secuencial());	
				parametrogeneralAux.setnumero_autor(this.parametrogeneral.getnumero_autor());	
				parametrogeneralAux.setfecha_inicio(this.parametrogeneral.getfecha_inicio());	
				parametrogeneralAux.setfecha_fin(this.parametrogeneral.getfecha_fin());	
				parametrogeneralAux.setesta_activo(this.parametrogeneral.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralAux,parametrogenerals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.saveParametroGenerals();//WithConnection
						//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);
					
					this.refrescarForeignKeysDescripcionesParametroGeneral();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogeneralLogic.saveParametroGeneralRelaciones(parametrogeneralAux);//WithConnection
								//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrogeneralAux,parametrogenerals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrogeneral,parametrogeneralAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrogeneralAux=new  ParametroGeneral();
				
				parametrogeneralAux.setIsNew(false);
				parametrogeneralAux.setIsChanged(false);
				
				parametrogeneralAux.setIsDeleted(true);
				
				parametrogeneralAux.setId(this.parametrogeneral.getId());	
				parametrogeneralAux.setVersionRow(this.parametrogeneral.getVersionRow());	
				parametrogeneralAux.setid_empresa(this.parametrogeneral.getid_empresa());	
				parametrogeneralAux.setid_sucursal(this.parametrogeneral.getid_sucursal());	
				parametrogeneralAux.setid_tipo_documento_general(this.parametrogeneral.getid_tipo_documento_general());	
				parametrogeneralAux.setnumero_secuencial(this.parametrogeneral.getnumero_secuencial());	
				parametrogeneralAux.setnumero_autor(this.parametrogeneral.getnumero_autor());	
				parametrogeneralAux.setfecha_inicio(this.parametrogeneral.getfecha_inicio());	
				parametrogeneralAux.setfecha_fin(this.parametrogeneral.getfecha_fin());	
				parametrogeneralAux.setesta_activo(this.parametrogeneral.getesta_activo());	
				
				if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrogeneralAux.getId()>=0) {	
						this.parametrogeneralsEliminados.add(parametrogeneralAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralAux,parametrogenerals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.saveParametroGenerals();//WithConnection
						//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrogeneralLogic.saveParametroGeneralRelaciones(parametrogeneralAux);//WithConnection
								//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
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
							if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrogeneralAux,parametrogeneralLogic.getParametroGenerals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrogeneralAux,parametrogenerals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getParametroGenerals().addAll(this.parametrogeneralsEliminados);
					
					parametrogeneralLogic.saveParametroGenerals();//WithConnection
					//parametrogeneralLogic.getSetVersionRowParametroGenerals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroGeneral();
				
				this.parametrogeneralsEliminados= new ArrayList<ParametroGeneral>();		
			}
			
			if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro General GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrogeneral=parametrogeneralAux;
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
      		//this.finishProcessParametroGeneral();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroGeneral parametrogeneralLocal) throws Exception {
		
		if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroGeneral parametrogeneralLocal) throws Exception {	
		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrogeneralLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametrogeneralLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoDocumentoGeneralDetalleFormJInternalFrame.class)) {
				TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrameLocal=(TipoDocumentoGeneralBeanSwingJInternalFrame) ((TipoDocumentoGeneralDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipodocumentogeneralBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.gettipodocumentogeneral(),true);
				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarLista(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral,this.tipodocumentogeneralsForeignKey);

				tipodocumentogeneralBeanSwingJInternalFrameLocal.actualizarRelaciones(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				parametrogeneralLocal.setTipoDocumentoGeneral(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral);

				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Formulario");
				this.setActualTipoDocumentoGeneralForeignKey(tipodocumentogeneralBeanSwingJInternalFrameLocal.tipodocumentogeneral.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroGeneralActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrogeneralValidator.getInvalidValues(this.parametrogeneral);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroGeneral parametrogeneral,List<ParametroGeneral> parametrogenerals) throws Exception {
		try	{		
			ParametroGeneralConstantesFunciones.actualizarLista(parametrogeneral,parametrogenerals,this.parametrogeneralSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroGeneral parametrogeneral,List<ParametroGeneral> parametrogenerals) throws Exception {
		try	{			
			ParametroGeneralConstantesFunciones.actualizarSelectedLista(parametrogeneral,parametrogenerals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroGeneral> parametrogeneralsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrogeneralsLocal=this.parametrogeneralLogic.getParametroGenerals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrogeneralsLocal=this.parametrogenerals;
			}
			//ARCHITECTURE
		
			for(ParametroGeneral parametrogeneralLocal:parametrogeneralsLocal) {
				if(this.permiteMantenimiento(parametrogeneralLocal) && parametrogeneralLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroGeneralConstantesFunciones.getParametroGeneralLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_empresaParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_sucursalParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.IDTIPODOCUMENTOGENERAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_tipo_documento_generalParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.NUMEROSECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_secuencialParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.NUMEROAUTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_autorParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.FECHAINICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_inicioParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.FECHAFIN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_finParametroGeneral,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroGeneralConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelesta_activoParametroGeneral,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_empresaParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_sucursalParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelid_tipo_documento_generalParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_secuencialParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_autorParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_inicioParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_finParametroGeneral,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroGeneral.jLabelesta_activoParametroGeneral,"");
		
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
		this.iIdNuevoParametroGeneral--;	
		
		
		this.parametrogeneralAux=new ParametroGeneral();
		
		this.parametrogeneralAux.setId(this.iIdNuevoParametroGeneral);
		this.parametrogeneralAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrogeneralLogic.getParametroGenerals().add(this.parametrogeneralAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrogenerals.add(this.parametrogeneralAux);
		}
		//ARCHITECTURE
		
		this.parametrogeneral=this.parametrogeneralAux;
		
		if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroGeneral(this.parametrogeneral);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneral(this.parametrogeneral);
		}
				
		//this.setDefaultControlesParametroGeneral();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroGeneral();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroGeneral();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneral();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGeneral(this.parametrogeneralBean,this.parametrogeneral,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroGeneralConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
			classes=ParametroGeneralConstantesFunciones.getClassesRelationshipsOfParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrogeneralReturnGeneral=parametrogeneralLogic.procesarEventosParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneralLogic.getParametroGenerals(),this.parametrogeneral,this.parametrogeneralParameterGeneral,this.isEsNuevoParametroGeneral,classes);//this.parametrogeneralLogic.getParametroGeneral()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroGeneral(this.parametrogeneralReturnGeneral,this.parametrogeneralBean,false);
		
		if(this.parametrogeneralReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral());
		}
		
		if(this.parametrogeneralReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral(),classes);//this.parametrogeneralBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroGeneral();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroGeneral();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.RecargarFormParametroGeneral(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroGeneral(false);
						
			if(parametrogeneralSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneral();
			}
			
			this.actualizarVisualTableDatosParametroGeneral();
			
			this.jTableDatosParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoParametroGeneral(), this.getIndiceNuevoParametroGeneral());
			
			this.seleccionarFilaTablaParametroGeneralActual();
						
			this.actualizarEstadoCeldasBotonesParametroGeneral("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroGeneral(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarnumero_secuencialParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarnumero_autorParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarfecha_inicioParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarfecha_finParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activaresta_activoParametroGeneral);	
		//
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarid_empresaParametroGeneral);//
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarid_sucursalParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setEnabled(isHabilitar && this.parametrogeneralConstantesFunciones.activarid_tipo_documento_generalParametroGeneral);
	};
	
	public void setDefaultControlesParametroGeneral() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroGeneral(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrogeneralSessionBean.setConGuardarRelaciones(true);			
			this.parametrogeneralSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.setVisible(true);
			
					
		} else {
			//this.parametrogeneralSessionBean.setConGuardarRelaciones(false);			
			this.parametrogeneralSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroGeneral() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
				if(parametrogeneralAux.getId().equals(this.iIdNuevoParametroGeneral)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogenerals) {
				if(parametrogeneralAux.getId().equals(this.iIdNuevoParametroGeneral)) {
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
	
	public int getIndiceActualParametroGeneral(ParametroGeneral parametrogeneral,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
				if(parametrogeneralAux.getId().equals(parametrogeneral.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogenerals) {
				if(parametrogeneralAux.getId().equals(parametrogeneral.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroGeneral(ParametroGeneral parametrogeneralOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
				if(parametrogeneralAux.getParametroGeneralOriginal().getId().equals(parametrogeneralOriginal.getId())) {
					existe=true;
					parametrogeneralOriginal.setId(parametrogeneralAux.getId());
					parametrogeneralOriginal.setVersionRow(parametrogeneralAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneral parametrogeneralAux:this.parametrogenerals) {
				if(parametrogeneralAux.getParametroGeneralOriginal().getId().equals(parametrogeneralOriginal.getId())) {
					existe=true;
					parametrogeneralOriginal.setId(parametrogeneralAux.getId());
					parametrogeneralOriginal.setVersionRow(parametrogeneralAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroGeneral(Boolean esParaCancelar) throws Exception {
		parametrogeneralsAux=new ArrayList<ParametroGeneral>();
		parametrogeneralAux=new ParametroGeneral();
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
					if(parametrogeneralAux.getId()<0) {
						parametrogeneralsAux.add(parametrogeneralAux);
					}		
				}
				this.iIdNuevoParametroGeneral=0L;
				this.parametrogeneralLogic.getParametroGenerals().removeAll(parametrogeneralsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneral parametrogeneralAux:this.parametrogenerals) {
					if(parametrogeneralAux.getId()<0) {
						parametrogeneralsAux.add(parametrogeneralAux);
					}		
				}
				this.iIdNuevoParametroGeneral=0L;
				this.parametrogenerals.removeAll(parametrogeneralsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroGeneral 
					&& this.parametrogeneralLogic.getParametroGenerals().size()>0
					) {
					parametrogeneralAux=this.parametrogeneralLogic.getParametroGenerals().get(this.parametrogeneralLogic.getParametroGenerals().size() - 1);
				
					if(parametrogeneralAux.getId()<0) {
						this.parametrogeneralLogic.getParametroGenerals().remove(parametrogeneralAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroGeneral && this.parametrogenerals.size()>0) {
					parametrogeneralAux=this.parametrogenerals.get(this.parametrogenerals.size() - 1);
				
					if(parametrogeneralAux.getId()<0) {
						this.parametrogenerals.remove(parametrogeneralAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroGeneral(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrogeneral.getId()<0) {
				this.parametrogeneralLogic.getParametroGenerals().remove(this.parametrogeneral);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrogeneral.getId()<0) {
				this.parametrogenerals.remove(this.parametrogeneral);
			}
		}			
	}
	
	public void setEstadosInicialesParametroGeneral(List<ParametroGeneral> parametrogeneralsAux) throws Exception {
		ParametroGeneralConstantesFunciones.setEstadosInicialesParametroGeneral(parametrogeneralsAux);
	}
	
	public void setEstadosInicialesParametroGeneral(ParametroGeneral parametrogeneralAux) throws Exception {
		ParametroGeneralConstantesFunciones.setEstadosInicialesParametroGeneral(parametrogeneralAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroGeneralActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroGeneralActual()) {
				if(!this.isEsNuevoParametroGeneral) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroGeneral=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroGeneralActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro General ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroGeneral parametrogeneral) throws Exception {
		ParametroGeneralConstantesFunciones.seleccionarAsignar(this.parametrogeneral,parametrogeneral);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroGeneral=this.isPermisoActualizarOriginalParametroGeneral;
			
			
			this.seleccionarAsignar(parametrogeneral);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroGeneralConstantesFunciones.quitarEspaciosParametroGeneral(this.parametrogeneral,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrogeneralSessionBean.setsFuncionBusquedaRapida(this.parametrogeneralSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroGeneral) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroGeneral(esParaCancelar);				
				this.cancelarNuevoParametroGeneral(esParaCancelar);								
			}
			
			this.parametrogeneral=new ParametroGeneral();
			
			this.inicializarParametroGeneral();
			
			this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroGeneral() throws Exception {
		try {
			ParametroGeneralConstantesFunciones.inicializarParametroGeneral(this.parametrogeneral);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrogeneralLogic.getParametroGenerals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroGenerals(String sAccionBusqueda,List<ParametroGeneral> parametrogeneralsParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroGeneral"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroGeneralMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroGeneralMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroGeneral"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Generals");		
		parameters.put("busquedapor", ParametroGeneralConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroGeneral=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroGeneralConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroGeneral=new JRBeanArrayDataSource(ParametroGeneralJInternalFrame.TraerParametroGeneralBeans(parametrogeneralsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroGeneral);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroGeneralConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroGeneralConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroGeneralBean.TraerParametroGeneralBeans(parametrogeneralsParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroGeneralActionPerformed(null);
					//this.generarExcelReporteParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroGenerals(sAccionBusqueda,sTipoArchivoReporte,parametrogeneralsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneral> parametrogeneralsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenerals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGeneral("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroGeneral parametrogeneral : parametrogeneralsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroGeneralConstantesFunciones.generarExcelReporteDataParametroGeneral("NORMAL",row,workbook,parametrogeneral,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroGeneral(String sTipo,Row row,Workbook workbook) {
		
		ParametroGeneralConstantesFunciones.generarExcelReporteHeaderParametroGeneral(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneral> parametrogeneralsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroGeneral parametrogeneral : parametrogeneralsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroGeneralConstantesFunciones.getParametroGeneralDescripcion(parametrogeneral));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.gettipodocumentogeneral_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getnumero_secuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getnumero_autor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrogeneral.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrogeneral.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroGenerals(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroGeneral> parametrogeneralsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroGeneral> parametrogeneralsRespaldo=null;
		
		classes=ParametroGeneralConstantesFunciones.getClassesRelationshipsOfParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrogeneralLogic.setDatosCliente(this.datosCliente);
		this.parametrogeneralLogic.setDatosDeep(this.datosDeep);
		this.parametrogeneralLogic.setIsConDeep(true);
		
		parametrogeneralsRespaldo=this.parametrogeneralLogic.getParametroGenerals();
		
		this.parametrogeneralLogic.setParametroGenerals(parametrogeneralsParaReportes);	
		this.parametrogeneralLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrogeneralsParaReportes=this.parametrogeneralLogic.getParametroGenerals();
		this.parametrogeneralLogic.setParametroGenerals(parametrogeneralsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroGenerals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroGeneral("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroGeneral parametrogeneral : parametrogeneralsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroGeneral("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroGeneralConstantesFunciones.generarExcelReporteDataParametroGeneral("NORMAL",row,workbook,parametrogeneral,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroGeneralConstantesFunciones.getParametroGeneralDescripcion(parametrogeneral));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneral.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroGeneral() throws Exception {		
		this.startProcessParametroGeneral(true);
	}
	
	public void startProcessParametroGeneral(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroGeneral ,this.jPanelParametrosReportesParametroGeneral, this.jScrollPanelDatosParametroGeneral,this.jPanelPaginacionParametroGeneral, this.jScrollPanelDatosEdicionParametroGeneral, this.jPanelAccionesParametroGeneral,this.jPanelAccionesFormularioParametroGeneral,this.jmenuBarParametroGeneral,this.jmenuBarDetalleParametroGeneral,this.jTtoolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGeneral=this.jTabbedPaneBusquedasParametroGeneral; 
		
		final JPanel jPanelParametrosReportesParametroGeneral=this.jPanelParametrosReportesParametroGeneral;
		//final JScrollPane jScrollPanelDatosParametroGeneral=this.jScrollPanelDatosParametroGeneral;
		final JTable jTableDatosParametroGeneral=this.jTableDatosParametroGeneral;		
		final JPanel jPanelPaginacionParametroGeneral=this.jPanelPaginacionParametroGeneral;
		//final JScrollPane jScrollPanelDatosEdicionParametroGeneral=this.jScrollPanelDatosEdicionParametroGeneral;
		final JPanel jPanelAccionesParametroGeneral=this.jPanelAccionesParametroGeneral;
		
		JPanel jPanelCamposAuxiliarParametroGeneral=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroGeneral=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			jPanelCamposAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jPanelCamposParametroGeneral;
			jPanelAccionesFormularioAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jPanelAccionesFormularioParametroGeneral;
		}
		
		final JPanel jPanelCamposParametroGeneral=jPanelCamposAuxiliarParametroGeneral;
		final JPanel jPanelAccionesFormularioParametroGeneral=jPanelAccionesFormularioAuxiliarParametroGeneral;
		
		
		final JMenuBar jmenuBarParametroGeneral=this.jmenuBarParametroGeneral;
		final JToolBar jTtoolBarParametroGeneral=this.jTtoolBarParametroGeneral;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGeneral=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			jmenuBarDetalleAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jmenuBarDetalleParametroGeneral;
			jTtoolBarDetalleAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jTtoolBarDetalleParametroGeneral;
		}
		
		final JMenuBar jmenuBarDetalleParametroGeneral=jmenuBarDetalleAuxiliarParametroGeneral;
		final JToolBar jTtoolBarDetalleParametroGeneral=jTtoolBarDetalleAuxiliarParametroGeneral;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGeneral;
			processRunnable.jTableDatos=jTableDatosParametroGeneral;
			processRunnable.jPanelCampos=jPanelCamposParametroGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGeneral;
			processRunnable.jTtoolBar=jTtoolBarParametroGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroGeneral ,jPanelParametrosReportesParametroGeneral,jTableDatosParametroGeneral, /*jScrollPanelDatosParametroGeneral,*/jPanelCamposParametroGeneral,jPanelPaginacionParametroGeneral, /*jScrollPanelDatosEdicionParametroGeneral,*/ jPanelAccionesParametroGeneral,jPanelAccionesFormularioParametroGeneral,jmenuBarParametroGeneral,jmenuBarDetalleParametroGeneral,jTtoolBarParametroGeneral,jTtoolBarDetalleParametroGeneral);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroGeneral ,jPanelParametrosReportesParametroGeneral, jScrollPanelDatosParametroGeneral,jPanelPaginacionParametroGeneral, jScrollPanelDatosEdicionParametroGeneral, jPanelAccionesParametroGeneral,jPanelAccionesFormularioParametroGeneral,jmenuBarParametroGeneral,jmenuBarDetalleParametroGeneral,jTtoolBarParametroGeneral,jTtoolBarDetalleParametroGeneral);
						
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
	
	public void finishProcessParametroGeneral() {// throws Exception 
		this.finishProcessParametroGeneral(true);
	}
	
	public void finishProcessParametroGeneral(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroGeneral ,this.jPanelParametrosReportesParametroGeneral, this.jScrollPanelDatosParametroGeneral,this.jPanelPaginacionParametroGeneral, this.jScrollPanelDatosEdicionParametroGeneral, this.jPanelAccionesParametroGeneral,this.jPanelAccionesFormularioParametroGeneral,this.jmenuBarParametroGeneral,this.jmenuBarDetalleParametroGeneral,this.jTtoolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroGeneral=this.jTabbedPaneBusquedasParametroGeneral; 
		
		final JPanel jPanelParametrosReportesParametroGeneral=this.jPanelParametrosReportesParametroGeneral;
		//final JScrollPane jScrollPanelDatosParametroGeneral=this.jScrollPanelDatosParametroGeneral;
		final JTable jTableDatosParametroGeneral=this.jTableDatosParametroGeneral;		
		final JPanel jPanelPaginacionParametroGeneral=this.jPanelPaginacionParametroGeneral;
		//final JScrollPane jScrollPanelDatosEdicionParametroGeneral=this.jScrollPanelDatosEdicionParametroGeneral;
		final JPanel jPanelAccionesParametroGeneral=this.jPanelAccionesParametroGeneral;
		
		JPanel jPanelCamposAuxiliarParametroGeneral=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroGeneral=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			jPanelCamposAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jPanelCamposParametroGeneral;
			jPanelAccionesFormularioAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jPanelAccionesFormularioParametroGeneral;
		}
		
		final JPanel jPanelCamposParametroGeneral=jPanelCamposAuxiliarParametroGeneral;
		final JPanel jPanelAccionesFormularioParametroGeneral=jPanelAccionesFormularioAuxiliarParametroGeneral;
		
		
		final JMenuBar jmenuBarParametroGeneral=this.jmenuBarParametroGeneral;		
		final JToolBar jTtoolBarParametroGeneral=this.jTtoolBarParametroGeneral;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroGeneral=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroGeneral=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			jmenuBarDetalleAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jmenuBarDetalleParametroGeneral;
			jTtoolBarDetalleAuxiliarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jTtoolBarDetalleParametroGeneral;		
		}
		
		final JMenuBar jmenuBarDetalleParametroGeneral=jmenuBarDetalleAuxiliarParametroGeneral;
		final JToolBar jTtoolBarDetalleParametroGeneral=jTtoolBarDetalleAuxiliarParametroGeneral;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroGeneral;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroGeneral;
			processRunnable.jTableDatos=jTableDatosParametroGeneral;
			processRunnable.jPanelCampos=jPanelCamposParametroGeneral;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroGeneral;
			processRunnable.jPanelAcciones=jPanelAccionesParametroGeneral;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroGeneral;
			
			
			processRunnable.jmenuBar=jmenuBarParametroGeneral;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroGeneral;
			processRunnable.jTtoolBar=jTtoolBarParametroGeneral;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroGeneral;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroGeneral ,jPanelParametrosReportesParametroGeneral, jTableDatosParametroGeneral,/*jScrollPanelDatosParametroGeneral,*/jPanelCamposParametroGeneral,jPanelPaginacionParametroGeneral, /*jScrollPanelDatosEdicionParametroGeneral,*/ jPanelAccionesParametroGeneral,jPanelAccionesFormularioParametroGeneral,jmenuBarParametroGeneral,jmenuBarDetalleParametroGeneral,jTtoolBarParametroGeneral,jTtoolBarDetalleParametroGeneral));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroGeneral(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroGeneral(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroGeneral,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroGeneral(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroGeneral,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroGeneral,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrogeneralConstantesFunciones.getsFinalQueryParametroGeneral();
		String  finalQueryPaginacionTodos=this.parametrogeneralConstantesFunciones.getsFinalQueryParametroGeneral();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroGeneralConstantesFunciones.getArrayColumnasGlobalesNoParametroGeneral(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroGeneralConstantesFunciones.getArrayColumnasGlobalesParametroGeneral(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroGeneralConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrogeneralsEliminados= new ArrayList<ParametroGeneral>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroGeneral();
		
				///*ParametroGeneralSessionBean*/this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
			
			if(this.parametrogeneralSessionBean==null) {
				this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
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
					this.iNumeroPaginacion=ParametroGeneralConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroGeneralConstantesFunciones.getClassesForeignKeysOfParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrogeneral."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrogeneralsAux= new ArrayList<ParametroGeneral>();
			
				
			parametrogeneralLogic.setDatosCliente(this.datosCliente);
			parametrogeneralLogic.setDatosDeep(this.datosDeep);
			parametrogeneralLogic.setIsConDeep(true);
			
			
			parametrogeneralLogic.getParametroGeneralDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrogeneralLogic.getTodosParametroGenerals(finalQueryGlobal,pagination);
					
					//parametrogeneralLogic.getTodosParametroGeneralsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrogeneralLogic.getParametroGenerals()==null|| parametrogeneralLogic.getParametroGenerals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralsAux= new ArrayList<ParametroGeneral>();
							parametrogeneralsAux.addAll(parametrogeneralLogic.getParametroGenerals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsAux= new ArrayList<ParametroGeneral>();
							parametrogeneralsAux.addAll(parametrogenerals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralLogic.getTodosParametroGenerals(finalQueryGlobal+"",this.pagination);												
							
							//parametrogeneralLogic.getTodosParametroGeneralsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroGenerals("Todos",parametrogeneralLogic.getParametroGenerals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrogeneralLogic.setParametroGenerals(new ArrayList<ParametroGeneral>());					
							parametrogeneralLogic.getParametroGenerals().addAll(parametrogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenerals=new ArrayList<ParametroGeneral>();
							parametrogenerals.addAll(parametrogeneralsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroGeneral=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroGeneral=this.idActual;
				
				} else if(this.idParametroGeneralActual!=null && this.idParametroGeneralActual!=0L) {
					idParametroGeneral=idParametroGeneralActual;
				}
				
					
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndicePorId(idParametroGeneral);
				
				this.parametrogenerals=new ArrayList<ParametroGeneral>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrogeneralLogic.getEntity(idParametroGeneral);
					
					//parametrogeneralLogic.getEntityWithConnection(idParametroGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralLogic.setParametroGenerals(new ArrayList<ParametroGeneral>());
					parametrogeneralLogic.getParametroGenerals().add(parametrogeneralLogic.getParametroGeneral());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogenerals=new ArrayList<ParametroGeneral>();
					this.parametrogenerals.add(parametrogeneral);
				}
				
				if(parametrogeneralLogic.getParametroGeneral()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogeneralLogic.getParametroGeneralsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogeneralLogic.getParametroGenerals()==null||parametrogeneralLogic.getParametroGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenerals==null|| parametrogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsAux=new ArrayList<ParametroGeneral>();
						parametrogeneralsAux.addAll(parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsAux=new ArrayList<ParametroGeneral>();
							parametrogeneralsAux.addAll(parametrogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogeneralLogic.getParametroGeneralsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenerals("FK_IdSucursal",parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenerals("FK_IdSucursal",parametrogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.setParametroGenerals(new ArrayList<ParametroGeneral>());
						parametrogeneralLogic.getParametroGenerals().addAll(parametrogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenerals=new ArrayList<ParametroGeneral>();
							parametrogenerals.addAll(parametrogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursalEmpresa")) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursalEmpresa(id_empresaFK_IdSucursalEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogeneralLogic.getParametroGeneralsFK_IdSucursalEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdSucursalEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursalEmpresa(id_empresaFK_IdSucursalEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursalEmpresa(id_empresaFK_IdSucursalEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogeneralLogic.getParametroGenerals()==null||parametrogeneralLogic.getParametroGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenerals==null|| parametrogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsAux=new ArrayList<ParametroGeneral>();
						parametrogeneralsAux.addAll(parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsAux=new ArrayList<ParametroGeneral>();
							parametrogeneralsAux.addAll(parametrogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogeneralLogic.getParametroGeneralsFK_IdSucursalEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdSucursalEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursalEmpresa(id_empresaFK_IdSucursalEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdSucursalEmpresa(id_empresaFK_IdSucursalEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenerals("FK_IdSucursalEmpresa",parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenerals("FK_IdSucursalEmpresa",parametrogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.setParametroGenerals(new ArrayList<ParametroGeneral>());
						parametrogeneralLogic.getParametroGenerals().addAll(parametrogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenerals=new ArrayList<ParametroGeneral>();
							parametrogenerals.addAll(parametrogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrogeneralLogic.getParametroGeneralsFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrogeneralLogic.getParametroGenerals()==null||parametrogeneralLogic.getParametroGenerals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrogenerals==null|| parametrogenerals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralsAux=new ArrayList<ParametroGeneral>();
						parametrogeneralsAux.addAll(parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralsAux=new ArrayList<ParametroGeneral>();
							parametrogeneralsAux.addAll(parametrogenerals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrogeneralLogic.getParametroGeneralsFK_IdTipoDocumentoGeneral(finalQueryGlobal,pagination,id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroGeneralConstantesFunciones.getDetalleIndiceFK_IdTipoDocumentoGeneral(id_tipo_documento_generalFK_IdTipoDocumentoGeneral);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroGenerals("FK_IdTipoDocumentoGeneral",parametrogeneralLogic.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroGenerals("FK_IdTipoDocumentoGeneral",parametrogenerals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralLogic.setParametroGenerals(new ArrayList<ParametroGeneral>());
						parametrogeneralLogic.getParametroGenerals().addAll(parametrogeneralsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogenerals=new ArrayList<ParametroGeneral>();
							parametrogenerals.addAll(parametrogeneralsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroGeneral();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroGeneral();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogeneralLogic.getParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenerals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrogeneralLogic.getParametroGenerals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrogenerals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroGeneral parametrogeneral) {
		Boolean permite=true;
		
		if(this.parametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroGeneralConstantesFunciones.getOrderByListaParametroGeneral();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroGeneralConstantesFunciones.getOrderByListaParametroGeneral();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneral parametrogeneral:parametrogeneralLogic.getParametroGenerals()) {
				if(parametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralTotales=parametrogeneral;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneral parametrogeneral:this.parametrogenerals) {
				if(parametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralTotales=parametrogeneral;
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
			this.parametrogeneralAux=new ParametroGeneral();
			this.parametrogeneralAux.setsType(Constantes2.S_TOTALES);
			this.parametrogeneralAux.setIsNew(false);
			this.parametrogeneralAux.setIsChanged(false);
			this.parametrogeneralAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroGeneralConstantesFunciones.TotalizarValoresFilaParametroGeneral(this.parametrogeneralLogic.getParametroGenerals(),this.parametrogeneralAux);
				
				this.parametrogeneralLogic.getParametroGenerals().add(this.parametrogeneralAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroGeneralConstantesFunciones.TotalizarValoresFilaParametroGeneral(this.parametrogenerals,this.parametrogeneralAux);
				
				this.parametrogenerals.add(this.parametrogeneralAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrogeneralTotales=new ParametroGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogeneralLogic.getParametroGenerals().remove(parametrogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrogenerals.remove(parametrogeneralTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrogeneralTotales=new ParametroGeneral();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroGeneral parametrogeneral:parametrogeneralLogic.getParametroGenerals()) {
				if(parametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralTotales=parametrogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralConstantesFunciones.TotalizarValoresFilaParametroGeneral(this.parametrogeneralLogic.getParametroGenerals(),parametrogeneralTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroGeneral parametrogeneral:this.parametrogenerals) {
				if(parametrogeneral.getsType().equals(Constantes2.S_TOTALES)) {
					parametrogeneralTotales=parametrogeneral;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroGeneralConstantesFunciones.TotalizarValoresFilaParametroGeneral(this.parametrogenerals,parametrogeneralTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroGeneralsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGeneralsFK_IdSucursalEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursalEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroGeneralsFK_IdTipoDocumentoGeneral()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoDocumentoGeneral";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroGeneralsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralLogic.getParametroGeneralsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGeneralsFK_IdSucursalEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralLogic.getParametroGeneralsFK_IdSucursalEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroGeneralsFK_IdTipoDocumentoGeneral(String sFinalQuery,Long id_tipo_documento_general)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralLogic.getParametroGeneralsFK_IdTipoDocumentoGeneral(sFinalQuery,this.pagination,id_tipo_documento_general);
				
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
	
	public void inicializarPermisosParametroGeneral() {
		this.isPermisoTodoParametroGeneral=false;
		this.isPermisoNuevoParametroGeneral=false;
		this.isPermisoActualizarParametroGeneral=false;
		this.isPermisoActualizarOriginalParametroGeneral=false;
		this.isPermisoEliminarParametroGeneral=false;
		this.isPermisoGuardarCambiosParametroGeneral=false;
		this.isPermisoConsultaParametroGeneral=false;
		this.isPermisoBusquedaParametroGeneral=false;
		this.isPermisoReporteParametroGeneral=false;		
		this.isPermisoOrdenParametroGeneral=false;		
		this.isPermisoPaginacionMedioParametroGeneral=false;		
		this.isPermisoPaginacionAltoParametroGeneral=false;
		this.isPermisoPaginacionTodoParametroGeneral=false;
		this.isPermisoCopiarParametroGeneral=false;		
		this.isPermisoVerFormParametroGeneral=false;		
		this.isPermisoDuplicarParametroGeneral=false;		
		this.isPermisoOrdenParametroGeneral=false;		
	}
	
	public void setPermisosUsuarioParametroGeneral(Boolean isPermiso) {
		this.isPermisoTodoParametroGeneral=isPermiso;
		this.isPermisoNuevoParametroGeneral=isPermiso;
		this.isPermisoActualizarParametroGeneral=isPermiso;
		this.isPermisoActualizarOriginalParametroGeneral=isPermiso;
		this.isPermisoEliminarParametroGeneral=isPermiso;
		this.isPermisoGuardarCambiosParametroGeneral=isPermiso;
		this.isPermisoConsultaParametroGeneral=isPermiso;
		this.isPermisoBusquedaParametroGeneral=isPermiso;
		this.isPermisoReporteParametroGeneral=isPermiso;
		this.isPermisoOrdenParametroGeneral=isPermiso;		
		this.isPermisoPaginacionMedioParametroGeneral=isPermiso;		
		this.isPermisoPaginacionAltoParametroGeneral=isPermiso;		
		this.isPermisoPaginacionTodoParametroGeneral=isPermiso;		
		this.isPermisoCopiarParametroGeneral=isPermiso;		
		this.isPermisoVerFormParametroGeneral=isPermiso;		
		this.isPermisoDuplicarParametroGeneral=isPermiso;
		this.isPermisoOrdenParametroGeneral=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroGeneral(Boolean isPermiso) {
		//this.isPermisoTodoParametroGeneral=isPermiso;
		this.isPermisoNuevoParametroGeneral=isPermiso;
		this.isPermisoActualizarParametroGeneral=isPermiso;
		this.isPermisoActualizarOriginalParametroGeneral=isPermiso;
		this.isPermisoEliminarParametroGeneral=isPermiso;
		this.isPermisoGuardarCambiosParametroGeneral=isPermiso;
		//this.isPermisoConsultaParametroGeneral=isPermiso;
		//this.isPermisoBusquedaParametroGeneral=isPermiso;
		//this.isPermisoReporteParametroGeneral=isPermiso;
		//this.isPermisoOrdenParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionMedioParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionAltoParametroGeneral=isPermiso;		
		//this.isPermisoPaginacionTodoParametroGeneral=isPermiso;		
		//this.isPermisoCopiarParametroGeneral=isPermiso;		
		//this.isPermisoDuplicarParametroGeneral=isPermiso;
		//this.isPermisoOrdenParametroGeneral=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroGeneralClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroGeneral(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroGeneralClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroGeneralClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroGeneralClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroGeneralClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroGeneral() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroGeneralConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroGeneral=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroGeneral=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroGeneral=this.isPermisoActualizarParametroGeneral;
			this.isPermisoEliminarParametroGeneral=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroGeneral=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroGeneral=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroGeneral=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroGeneral=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroGeneral=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroGeneral=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroGeneral=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroGeneral=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroGeneral=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroGeneral=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroGeneral=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroGeneral=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroGeneral.setToolTipText(this.jTableDatosParametroGeneral.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroGeneral(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroGeneral(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroGeneral() throws Exception {
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
	public void inicializarCombosForeignKeyParametroGeneralListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipodocumentogeneralsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroGeneralJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroGeneralListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoDocumentoGeneralListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroGeneralListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroGeneralParameterReturnGeneral parametrogeneralReturnGeneral=new ParametroGeneralParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrogeneralConstantesFunciones.cargarid_empresaParametroGeneral)
					 || (this.esRecargarFks && this.parametrogeneralConstantesFunciones.cargarid_empresaParametroGeneral)) {

					if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrogeneralSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametrogeneralConstantesFunciones.cargarid_sucursalParametroGeneral)
					 || (this.esRecargarFks && this.parametrogeneralConstantesFunciones.cargarid_sucursalParametroGeneral)) {

					if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametrogeneralSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoDocumentoGeneral="";

				if(((this.tipodocumentogeneralsForeignKey==null||this.tipodocumentogeneralsForeignKey.size()<=0) && this.parametrogeneralConstantesFunciones.cargarid_tipo_documento_generalParametroGeneral)
					 || (this.esRecargarFks && this.parametrogeneralConstantesFunciones.cargarid_tipo_documento_generalParametroGeneral)) {

					if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoDocumentoGeneralConstantesFunciones.getArrayColumnasGlobalesTipoDocumentoGeneral(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoDocumentoGeneralConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoDocumentoGeneral=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoDocumentoGeneral, "");
						finalQueryGlobalTipoDocumentoGeneral+=TipoDocumentoGeneralConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoDocumentoGeneral=" WHERE " + ConstantesSql.ID + "="+parametrogeneralSessionBean.getlidTipoDocumentoGeneralActual();
					}
				} else {
					finalQueryGlobalTipoDocumentoGeneral="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrogeneralReturnGeneral=parametrogeneralLogic.cargarCombosLoteForeignKeyParametroGeneral(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoDocumentoGeneral);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrogeneralReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametrogeneralReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoDocumentoGeneral.equals("NONE")) {
				this.tipodocumentogeneralsForeignKey=parametrogeneralReturnGeneral.gettipodocumentogeneralsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroGeneral()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrogeneralSessionBean==null) {
				this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
			}

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoDocumentoGeneral()throws Exception {
		try {

			if(!this.parametrogeneralSessionBean.getisBusquedaDesdeForeignKeySesionTipoDocumentoGeneral()) {
				TipoDocumentoGeneral tipodocumentogeneral=new TipoDocumentoGeneral();
				TipoDocumentoGeneralConstantesFunciones.setTipoDocumentoGeneralDescripcion(tipodocumentogeneral,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipodocumentogeneral.setId(null);

				if(!TipoDocumentoGeneralConstantesFunciones.ExisteEnLista(this.tipodocumentogeneralsForeignKey,tipodocumentogeneral,true)) {

					this.tipodocumentogeneralsForeignKey.add(0,tipodocumentogeneral);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroGeneral()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroGeneral()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.parametrogeneral.setfecha_inicio(this.parametroGeneralUsuario.getfecha_sistema());
				this.parametrogeneral.setfecha_fin(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneral();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroGeneral(ParametroGeneral parametrogeneral)throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(parametrogeneral.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroGeneral(ParametroGeneral parametrogeneral,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroGeneral()throws Exception {	
		try {
			
			this.setActualTipoDocumentoGeneralForeignKey(this.parametrogeneralConstantesFunciones.getid_tipo_documento_general(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroGeneral()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroGeneral()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroGeneral()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroGeneral()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroGeneral(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroGeneral()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ParametroGeneralBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroGeneralBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroGeneralBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrogeneralSessionBean=new ParametroGeneralSessionBean(); 
		this.parametrogeneralConstantesFunciones=new ParametroGeneralConstantesFunciones(); 
		this.parametrogeneralBean=new ParametroGeneral();//(this.parametrogeneralConstantesFunciones); 		
		this.parametrogeneralReturnGeneral=new ParametroGeneralParameterReturnGeneral(); 
		
		this.parametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroGeneralBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroGeneral(true);
			
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
			
			this.parametrogeneralConstantesFunciones=new ParametroGeneralConstantesFunciones(); 
			this.parametrogeneralBean=new ParametroGeneral();//this.parametrogeneralConstantesFunciones); 			
			this.parametrogeneralReturnGeneral=new ParametroGeneralParameterReturnGeneral(); 
		
			ParametroGeneralBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrogeneral=new ParametroGeneral();
			this.parametrogenerals = new ArrayList<ParametroGeneral>();
			this.parametrogeneralsAux = new ArrayList<ParametroGeneral>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic=new ParametroGeneralLogic();
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroGeneral);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGeneral);	
					}
					
					if(this.jInternalFrameImportacionParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGeneral);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroGeneral!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroGeneral);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGeneral);
				this.jInternalFrameDetalleFormParametroGeneral.setVisible(false);
				this.jInternalFrameDetalleFormParametroGeneral.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGeneral);
					this.jInternalFrameReporteDinamicoParametroGeneral.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroGeneral.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroGeneral);
					this.jInternalFrameImportacionParametroGeneral.setVisible(false);
					this.jInternalFrameImportacionParametroGeneral.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroGeneral!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroGeneral);
					this.jInternalFrameOrderByParametroGeneral.setVisible(false);
					this.jInternalFrameOrderByParametroGeneral.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroGeneralActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroGeneralConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrogeneralReturnGeneral=new ParametroGeneralParameterReturnGeneral();
			
			this.parametrogeneralParameterGeneral=new ParametroGeneralParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrogeneralLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroGeneralJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogeneralSessionBean.getEsGuardarRelacionado(),this.parametrogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroGeneralConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrogeneralSessionBean.getEsGuardarRelacionado(),this.parametrogeneralSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaDuplicarParametroGeneral=true;
			this.isVisibilidadCeldaCopiarParametroGeneral=true;
			this.isVisibilidadCeldaVerFormParametroGeneral=true;
			this.isVisibilidadCeldaOrdenParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			
			
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdSucursalEmpresa=true;
			this.isVisibilidadFK_IdTipoDocumentoGeneral=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroGeneral();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroGeneral(false);
			
			this.setPermisosUsuarioParametroGeneral();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrogeneralSessionBean.getEsGuardarRelacionado() && this.parametrogeneralSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroGeneralClasesRelacionadas();
			}
			
			if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroGeneralClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroGeneral();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroGeneral();
			}
			
			if(!this.isPermisoBusquedaParametroGeneral) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroGeneral,this.isPermisoPaginacionMedioParametroGeneral,this.isPermisoPaginacionTodoParametroGeneral);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroGeneralConstantesFunciones.getTiposSeleccionarParametroGeneral());
				
				this.tiposColumnasSelect=ParametroGeneralConstantesFunciones.getTiposSeleccionarParametroGeneral(true);
				
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
			//if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroGeneral();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroGeneral(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroGeneral(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneral() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.tipodocumentogeneralLogic=new TipoDocumentoGeneralLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrogeneralImplementable= (ParametroGeneralImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrogeneralImplementableHome= (ParametroGeneralImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroGeneralConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrogenerals= new ArrayList<ParametroGeneral>();
			this.parametrogeneralsEliminados= new ArrayList<ParametroGeneral>();
						
			this.isEsNuevoParametroGeneral=false;
			this.esParaAccionDesdeFormularioParametroGeneral=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroGeneral(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroGeneral();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroGeneralBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroGeneralConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroGeneral("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroGeneral(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroGeneral();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroGeneral();
			}
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroGeneral.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroGeneral.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroGeneral.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroGeneral(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroGeneral: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroGeneral() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroGeneral")) {
				iIndex=this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroGeneral();	
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
	
	public void cargarCombosForeignKeyParametroGeneral(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroGeneral(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroGeneralListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroGeneral();
		
		this.cargarCombosFrameForeignKeyParametroGeneral();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroGeneral();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroGeneral();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoDocumentoGeneral(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoDocumentoGeneralListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
				this.cargarCombosFrameTipoDocumentoGeneralsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoDocumentoGeneral(this.tipodocumentogeneralsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			
			if(jTableDatosParametroGeneral.getRowCount()>=1) {
				jTableDatosParametroGeneral.removeRowSelectionInterval(0, jTableDatosParametroGeneral.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroGeneral=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroGeneral(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroGeneral(true);			
			//this.parametrogeneral=new ParametroGeneral();
			//this.parametrogeneral.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneral(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneral() ;
			
			if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneral(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrogeneral);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);				
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroGeneral: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroGeneralActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroGeneral.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroGeneral.getSelectedRows().length;			
			}
			
			parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroGeneral--;			
				//ParametroGeneral parametrogeneralAux= new ParametroGeneral();			
				//parametrogeneralAux.setId(this.iIdNuevoParametroGeneral);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroGeneral parametrogeneralOrigen=new ParametroGeneral();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroGeneral parametrogeneralOrigen : parametrogeneralsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrogeneralOrigen =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrogeneralOrigen =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroGeneral();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrogeneral.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroGeneral(parametrogeneralOrigen,this.parametrogeneral,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogeneralLogic.getParametroGenerals().add(this.parametrogeneralAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogenerals.add(this.parametrogeneralAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroGeneral(false);
				
				this.jTableDatosParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoParametroGeneral(), this.getIndiceNuevoParametroGeneral());
				
				int iLastRow =  this.jTableDatosParametroGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneral(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();									
		
			ParametroGeneral parametrogeneralOrigen=new ParametroGeneral();
			ParametroGeneral parametrogeneralDestino=new ParametroGeneral();
				
			parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroGeneral.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrogeneralsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroGeneral.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralOrigen =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogeneralOrigen =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrogeneralDestino =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrogeneralDestino =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrogeneralOrigen =parametrogeneralsSeleccionados.get(0);
				parametrogeneralDestino =parametrogeneralsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroGeneral(parametrogeneralOrigen,parametrogeneralDestino,true,false);
				
				parametrogeneralDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrogeneralDestino,parametrogeneralLogic.getParametroGenerals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrogeneralDestino,parametrogenerals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroGeneral(false);
				
				//this.jTableDatosParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoParametroGeneral(), this.getIndiceNuevoParametroGeneral());
				
				int iLastRow =  this.jTableDatosParametroGeneral.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroGeneral.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroGeneral.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneral(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroGeneral.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroGeneral.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroGeneral.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroGeneral.setVisible(!isVisible);
			this.jPanelPaginacionParametroGeneral.setVisible(!isVisible);
			this.jPanelAccionesParametroGeneral.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroGeneral();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroGeneral();
			
			this.abrirFrameOrderByParametroGeneral();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroGeneral();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroGeneral(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGeneral);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroGeneral.isMaximum()) {
					this.jInternalFrameDetalleFormParametroGeneral.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroGeneral.setSize(this.jInternalFrameDetalleFormParametroGeneral.iWidthFormulario,this.jInternalFrameDetalleFormParametroGeneral.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroGeneral.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroGeneral.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroGeneral.isMaximum()) {
						this.jInternalFrameDetalleFormParametroGeneral.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroGeneral.jContentPaneDetalleParametroGeneral.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneral.jContentPaneDetalleParametroGeneral.getWidth(),ParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneral.jContentPaneDetalleParametroGeneral.getWidth(),ParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroGeneral.jContentPaneDetalleParametroGeneral.getWidth(),ParametroGeneralConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroGeneral.setVisible(true);
	        this.jInternalFrameDetalleFormParametroGeneral.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroGeneral==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneral,false,this);
				} else {
					this.jInternalFrameOrderByParametroGeneral=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroGeneral,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroGeneral);
				this.jInternalFrameOrderByParametroGeneral.setVisible(false);
				this.jInternalFrameOrderByParametroGeneral.setSelected(false);
				
				this.jInternalFrameOrderByParametroGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGeneral"));
				
				this.inicializarActualizarBindingTablaOrderByParametroGeneral();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroGeneral() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroGeneral==null) {
				
				this.jInternalFrameImportacionParametroGeneral=new ImportacionJInternalFrame(ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroGeneral);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroGeneral);
				this.jInternalFrameImportacionParametroGeneral.setVisible(false);
				this.jInternalFrameImportacionParametroGeneral.setSelected(false);


				this.jInternalFrameImportacionParametroGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGeneral"));
				this.jInternalFrameImportacionParametroGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGeneral"));
				this.jInternalFrameImportacionParametroGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGeneral"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroGeneral() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroGeneral==null) {
				this.jInternalFrameReporteDinamicoParametroGeneral=new ReporteDinamicoJInternalFrame(ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroGeneral);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroGeneral);
				this.jInternalFrameReporteDinamicoParametroGeneral.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroGeneral.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneral"));
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneral"));
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneral"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneral();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroGeneral() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroGeneral);
			
	       	this.jInternalFrameDetalleFormParametroGeneral.setVisible(false);
	        this.jInternalFrameDetalleFormParametroGeneral.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroGeneral.dispose();
			//this.jInternalFrameDetalleFormParametroGeneral=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroGeneral() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroGeneral.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroGeneral.setVisible(true);
	        this.jInternalFrameImportacionParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroGeneral.setVisible(true);
	        this.jInternalFrameOrderByParametroGeneral.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroGeneral() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroGeneral.setVisible(false);
	        this.jInternalFrameOrderByParametroGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroGeneral() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroGeneral.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroGeneral.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroGeneral() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroGeneral.setVisible(false);
	        this.jInternalFrameImportacionParametroGeneral.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroGeneral(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroGeneral(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroGeneral(true);
			//this.isEsNuevoParametroGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneral(false) ;
			
			if(parametrogeneralSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneral(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroGeneralActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroGeneral(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroGeneral(true);
			//this.isEsNuevoParametroGeneral=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrogeneral.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroGeneral("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroGeneral(false) ;
			
			if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroGeneral(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneral(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoDocumentoGeneral(List<TipoDocumentoGeneral> tipodocumentogeneralsForeignKey)throws Exception{
		TableColumn tableColumnTipoDocumentoGeneral=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));
		TableCellEditor tableCellEditorTipoDocumentoGeneral =tableColumnTipoDocumentoGeneral.getCellEditor();

		TipoDocumentoGeneralTableCell tipodocumentogeneralTableCellFk=(TipoDocumentoGeneralTableCell)tableCellEditorTipoDocumentoGeneral;

		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKey(tipodocumentogeneralsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroGeneral.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipodocumentogeneralTableCellFk.setRowActual(intSelectedRow);
			//tipodocumentogeneralTableCellFk.settipodocumentogeneralsForeignKeyActual(tipodocumentogeneralsForeignKey);
		//}


		if(tipodocumentogeneralTableCellFk!=null) {
			tipodocumentogeneralTableCellFk.RecargarTipoDocumentoGeneralsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroGeneral(false);
			
			//if(!this.isEsNuevoParametroGeneral) {								
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				
			}
			
			if(this.permiteMantenimiento(this.parametrogeneral)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroGeneral=true;
					this.inicializarActualizarBindingTablaParametroGeneral(false);
					this.isEsNuevoParametroGeneral=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroGeneral=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroGeneral=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneral(false);
				
				this.habilitarDeshabilitarControlesParametroGeneral(false);
			
												
				
				if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroGeneral();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroGeneralActionPerformed(evt,parametrogeneralSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroGeneral(this.parametrogeneral,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroGeneral.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrogeneralSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrogeneral.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				this.parametrogeneral.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				this.parametrogeneral.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrogeneral)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroGeneralModel) this.jTableDatosParametroGeneral.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroGeneral=true;
				this.inicializarActualizarBindingTablaParametroGeneral(false);
				this.isEsNuevoParametroGeneral=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroGeneral(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneral(false);
				
				this.habilitarDeshabilitarControlesParametroGeneral(false);
				
				
				
				if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroGeneral();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroGeneralActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroGeneral.getRowCount()>=1) {
				jTableDatosParametroGeneral.removeRowSelectionInterval(0, jTableDatosParametroGeneral.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroGeneral(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroGeneral(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroGeneral(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroGeneral(false) ;
			
			this.isEsNuevoParametroGeneral=false;
			
			if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroGeneral();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroGeneral(false);
				
				//SI ES MANUAL
				if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroGeneral();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroGeneral--;			
			//ParametroGeneral parametrogeneralAux= new ParametroGeneral();			
			//parametrogeneralAux.setId(this.iIdNuevoParametroGeneral);
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroGeneral();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
			
			this.parametrogeneral.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrogeneralLogic.getParametroGenerals().add(this.parametrogeneralAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrogenerals.add(this.parametrogeneralAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroGeneral(false);
			
			this.jTableDatosParametroGeneral.setRowSelectionInterval(this.getIndiceNuevoParametroGeneral(), this.getIndiceNuevoParametroGeneral());
			
			int iLastRow =  this.jTableDatosParametroGeneral.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroGeneral.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroGeneral.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroGeneral(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneral(false);
			
			//SI ES MANUAL
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneral();
			}
			
			//this.abrirFrameTreeParametroGeneral();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro GeneralS ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroGeneral.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroGeneral();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrogeneralReturnGeneral=parametrogeneralLogic.procesarImportacionParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrogeneralParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroGeneralReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroGeneral.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroGeneral.setFileImportacion(this.jInternalFrameImportacionParametroGeneral.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroGeneral.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroGeneral.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroGeneral.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroGeneral.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		

		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroGeneralBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroGeneralBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoDocumentoGeneral_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoDocumentoGeneral_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoDocumentoGeneral_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoDocumentoGeneral_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroSecuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroSecuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroSecuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroSecuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroAutor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroAutor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroAutor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroAutor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaInicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaInicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaInicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaInicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAFIN:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFin_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFin_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFin_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFin_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroGeneral.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoria="id_tipo_documento_general";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoria="numero_secuencial";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR:
					sNombreCampoCategoria="numero_autor";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoria="fecha_inicio";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoria="fecha_fin";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					sNombreCampoCategoriaValor="id_tipo_documento_general";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					sNombreCampoCategoriaValor="numero_secuencial";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR:
					sNombreCampoCategoriaValor="numero_autor";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO:
					sNombreCampoCategoriaValor="fecha_inicio";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAFIN:
					sNombreCampoCategoriaValor="fecha_fin";
					break;

				case ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Documento General",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_documento_general");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_secuencial");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Autor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_autor");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Inicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_inicio");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAFIN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Fin",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_fin");
					break;

				case ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroGeneralActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.gettipodocumentogeneral_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getnumero_secuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getnumero_autor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(ParametroGeneral parametrogeneral:parametrogeneralsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrogeneral.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelParametroGeneral(row);				
			//	iRow++;
			//}				
			
			//for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroGeneral(parametrogeneralAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneral(false);
			
			//SI ES MANUAL
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroGeneral();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneral(false);
			
			//SI ES MANUAL
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGeneral();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroGeneralActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroGeneral(false);
			
			//SI ES MANUAL
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroGeneral();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroGeneral() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroGeneral.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroGeneral.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroGeneral.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroGeneral.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroGeneral.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroGeneral.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroGeneral.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroGeneral(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroGeneral(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroGeneral(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroGeneral(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroGeneral(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroGeneral(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneral(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroGeneral(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroGeneral() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroGeneral();
		
		this.inicializarActualizarBindingBotonesManualParametroGeneral(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGeneral();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneral() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneral(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneral(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroGeneral.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroGeneral.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroGeneral.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionNuevoParametroGeneral.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionSinCerrarParametroGeneral.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionSinMensajeParametroGeneral.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroGeneral.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroGeneral.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroGeneral.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
				this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionNuevoParametroGeneral.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionSinCerrarParametroGeneral.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxPostAccionSinMensajeParametroGeneral.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroGeneral.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroGeneral.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroGeneral.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroGeneral.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroGeneral.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroGeneral.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroGeneral.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroGeneral.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroGeneral(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroGeneral(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroGeneral() throws Exception {
		try	{
			if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGeneral();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGeneral() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroGeneral() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroGeneral.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroGeneral.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroGeneral.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroGeneral.addItem(reporte);
			}
			
			
			if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroGeneral.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroGeneral.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroGeneral.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroGeneral.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroGeneral.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneral();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroGeneral() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroGeneral.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGeneral.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroGeneral.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroGeneral.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroGeneral.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroGeneral()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.getSelectedItem()!=null){this.id_tipo_documento_generalFK_IdTipoDocumentoGeneral=((TipoDocumentoGeneral)this.jComboBoxid_tipo_documento_generalFK_IdTipoDocumentoGeneralParametroGeneral.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroGeneral(Boolean esInicializar) throws Exception {				
		if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroGeneral();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroGeneral() throws Exception {
		this.inicializarActualizarBindingTablaParametroGeneral(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroGeneral() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroGeneralOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneralOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroGeneral(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrogeneralLogic.getParametroGenerals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrogenerals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroGeneral.setModel(new ParametroGeneralModel(this.parametrogeneralLogic.getParametroGenerals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroGeneral.setModel(new ParametroGeneralModel(this.parametrogenerals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroGeneral!=null && this.jInternalFrameOrderByParametroGeneral.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroGeneral();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,parametrogeneralConstantesFunciones.resaltarSeleccionarParametroGeneral,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO,parametrogeneralConstantesFunciones.resaltarSeleccionarParametroGeneral,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_ID));

		if(this.parametrogeneralConstantesFunciones.mostraridParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrogeneralConstantesFunciones.resaltaridParametroGeneral,this.parametrogeneralConstantesFunciones.activaridParametroGeneral,this,true,"idParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralConstantesFunciones.resaltaridParametroGeneral,this.parametrogeneralConstantesFunciones.activaridParametroGeneral,this,true,"idParametroGeneral","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrogeneralConstantesFunciones.mostrarid_empresaParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_empresaParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_empresaParametroGeneral));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_empresaParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_empresaParametroGeneral,false,"id_empresaParametroGeneral","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametrogeneralConstantesFunciones.mostrarid_sucursalParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_sucursalParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_sucursalParametroGeneral));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_sucursalParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_sucursalParametroGeneral,false,"id_sucursalParametroGeneral","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL));

		if(this.parametrogeneralConstantesFunciones.mostrarid_tipo_documento_generalParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_tipo_documento_generalParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_tipo_documento_generalParametroGeneral));
			tableColumn.setCellEditor(new TipoDocumentoGeneralTableCell(this.tipodocumentogeneralsForeignKey,this.parametrogeneralConstantesFunciones.resaltarid_tipo_documento_generalParametroGeneral,this,this.parametrogeneralConstantesFunciones.activarid_tipo_documento_generalParametroGeneral,true,"id_tipo_documento_generalParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL));

		if(this.parametrogeneralConstantesFunciones.mostrarnumero_secuencialParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralConstantesFunciones.resaltarnumero_secuencialParametroGeneral,this.parametrogeneralConstantesFunciones.activarnumero_secuencialParametroGeneral,this,true,"numero_secuencialParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralConstantesFunciones.resaltarnumero_secuencialParametroGeneral,this.parametrogeneralConstantesFunciones.activarnumero_secuencialParametroGeneral,this,true,"numero_secuencialParametroGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR));

		if(this.parametrogeneralConstantesFunciones.mostrarnumero_autorParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrogeneralConstantesFunciones.resaltarnumero_autorParametroGeneral,this.parametrogeneralConstantesFunciones.activarnumero_autorParametroGeneral,this,true,"numero_autorParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrogeneralConstantesFunciones.resaltarnumero_autorParametroGeneral,this.parametrogeneralConstantesFunciones.activarnumero_autorParametroGeneral,this,true,"numero_autorParametroGeneral","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO));

		if(this.parametrogeneralConstantesFunciones.mostrarfecha_inicioParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.parametrogeneralConstantesFunciones.resaltarfecha_inicioParametroGeneral,this.parametrogeneralConstantesFunciones.activarfecha_inicioParametroGeneral,this,true,"fecha_inicioParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.parametrogeneralConstantesFunciones.resaltarfecha_inicioParametroGeneral,this.parametrogeneralConstantesFunciones.activarfecha_inicioParametroGeneral,this,true,"fecha_inicioParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_FECHAFIN));

		if(this.parametrogeneralConstantesFunciones.mostrarfecha_finParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_FECHAFIN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.parametrogeneralConstantesFunciones.resaltarfecha_finParametroGeneral,this.parametrogeneralConstantesFunciones.activarfecha_finParametroGeneral,this,true,"fecha_finParametroGeneral","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.parametrogeneralConstantesFunciones.resaltarfecha_finParametroGeneral,this.parametrogeneralConstantesFunciones.activarfecha_finParametroGeneral,this,true,"fecha_finParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.parametrogeneralConstantesFunciones.mostraresta_activoParametroGeneral && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrogeneralConstantesFunciones.resaltaresta_activoParametroGeneral,this.parametrogeneralConstantesFunciones.activaresta_activoParametroGeneral));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrogeneralConstantesFunciones.resaltaresta_activoParametroGeneral,this.parametrogeneralConstantesFunciones.activaresta_activoParametroGeneral,this,true,"esta_activoParametroGeneral","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroGeneralPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGeneral.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroGeneral.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrogeneralSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroGeneral.addColumn(tableColumn);
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
			
			this.jTableDatosParametroGeneral.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroGeneral.moveColumn(this.jTableDatosParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroGeneral.moveColumn(this.jTableDatosParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroGeneral.moveColumn(this.jTableDatosParametroGeneral.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroGeneral.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroGeneral.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroGeneral,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroGeneral.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroGeneral.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroGeneral.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroGeneral.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroGeneral.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrogeneralLogic.getParametroGenerals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrogenerals.size()-1;
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
		//this.jTableDatosParametroGeneral.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroGeneral.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroGeneral();
			
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
				
				//this.isEsNuevoParametroGeneral=false;
					
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
				if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroGeneral==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGeneral.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrogeneral.getsType().equals("DUPLICADO")
				   || this.parametrogeneral.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroGeneral=true;
				
				} else {
					this.isEsNuevoParametroGeneral=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrogeneral.getId()>=0 && !this.parametrogeneral.getIsNew()) {						
						this.isEsNuevoParametroGeneral=false;
						
					} else {
						this.isEsNuevoParametroGeneral=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroGeneral(esRelaciones);						
				
				this.seleccionarParametroGeneral(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrogeneral.getId()<0) {
					this.isEsNuevoParametroGeneral=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroGeneral(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroGeneral(evt,rowIndex);
				}	
				
				if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroGeneral: " + this.dDif); 
					}
				}								
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroGeneral(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrogeneral)) {
					if(this.parametrogeneral.getId()>0) {
						this.parametrogeneral.setIsDeleted(true);
						
						this.parametrogeneralsEliminados.add(this.parametrogeneral);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrogeneralLogic.getParametroGenerals().remove(this.parametrogeneral);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrogenerals.remove(this.parametrogeneral);				
					}
					
					
					((ParametroGeneralModel) this.jTableDatosParametroGeneral.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroGeneral(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroGeneral(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroGeneral) {
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroGeneral.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroGeneral.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroGeneral(this.parametrogeneral);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrogeneralConstantesFunciones.cargarid_empresaParametroGeneral || this.parametrogeneralConstantesFunciones.event_dependid_empresaParametroGeneral) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrogeneral.getid_empresa());
									//this.inicializarActualizarBindingParametroGeneral(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrogeneral.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrogeneral.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrogeneral.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametrogeneralConstantesFunciones.cargarid_sucursalParametroGeneral || this.parametrogeneralConstantesFunciones.event_dependid_sucursalParametroGeneral) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametrogeneral.getid_sucursal());
									//this.inicializarActualizarBindingParametroGeneral(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametrogeneral.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametrogeneral.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametrogeneral.getid_sucursal(),false,"Formulario");

					//TipoDocumentoGeneral
					if(!this.parametrogeneralConstantesFunciones.cargarid_tipo_documento_generalParametroGeneral || this.parametrogeneralConstantesFunciones.event_dependid_tipo_documento_generalParametroGeneral) {
						//this.cargarCombosTipoDocumentoGeneralsForeignKeyLista(" where id="+this.parametrogeneral.getid_tipo_documento_general());
									//this.inicializarActualizarBindingParametroGeneral(false,false);
						this.tipodocumentogeneralsForeignKey=new ArrayList<TipoDocumentoGeneral>();

						if(parametrogeneral.getTipoDocumentoGeneral()!=null) {
							this.tipodocumentogeneralsForeignKey.add(parametrogeneral.getTipoDocumentoGeneral());
						}

						this.addItemDefectoCombosForeignKeyTipoDocumentoGeneral();
						this.cargarCombosFrameTipoDocumentoGeneralsForeignKey("Todos");
					}
					this.setActualTipoDocumentoGeneralForeignKey(this.parametrogeneral.getid_tipo_documento_general(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroGeneral("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroGeneral(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroGeneral() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGeneral(ParametroGeneral parametrogeneral) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroGeneral(parametrogeneral,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroGeneral(ParametroGeneral parametrogeneral,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroGeneral(parametrogeneral);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroGeneral(parametrogeneral,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneral(parametrogeneral);
	}
	
	public void setVariablesObjetoActualToFormularioParametroGeneral(ParametroGeneral parametrogeneral) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setText(parametrogeneral.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setText(parametrogeneral.getnumero_secuencial());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setText(parametrogeneral.getnumero_autor());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setDate(parametrogeneral.getfecha_inicio());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setDate(parametrogeneral.getfecha_fin());
			this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setSelected(parametrogeneral.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroGeneral parametrogeneralLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrogeneralLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroGeneral parametrogeneralLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrogeneralLocal=this.parametrogeneral;
			} else {
				parametrogeneralLocal=this.parametrogeneralAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrogeneralLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroGeneral(parametrogeneralLocal,true);
					
					if(parametrogeneralSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrogeneralLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrogeneralLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroGeneral(ParametroGeneral parametrogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGeneral(parametrogeneral,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(parametrogeneral);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGeneral(ParametroGeneral parametrogeneral,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroGeneral(parametrogeneral,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroGeneral(ParametroGeneral parametrogeneral,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.getText()==null || this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.getText()=="" || this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setText("0");
			}

			if(conColumnasBase) {parametrogeneral.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelIdParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneral.setnumero_secuencial(this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_secuencialParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneral.setnumero_autor(this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelnumero_autorParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneral.setfecha_inicio(this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_inicioParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneral.setfecha_fin(this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_FECHAFIN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelfecha_finParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrogeneral.setesta_activo(this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroGeneral.jLabelesta_activoParametroGeneral,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroGeneral(ParametroGeneral parametrogeneralBean,ParametroGeneral parametrogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrogeneralBean.getid_tipo_documento_general()!=null && !parametrogeneralBean.getid_tipo_documento_general().equals(-1L))) {parametrogeneral.setid_tipo_documento_general(parametrogeneralBean.getid_tipo_documento_general());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroGeneral(ParametroGeneral parametrogeneralOrigen,ParametroGeneral parametrogeneral,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralOrigen.getId()!=null && !parametrogeneralOrigen.getId().equals(0L))) {parametrogeneral.setId(parametrogeneralOrigen.getId());}}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getid_tipo_documento_general()!=null && !parametrogeneralOrigen.getid_tipo_documento_general().equals(-1L))) {parametrogeneral.setid_tipo_documento_general(parametrogeneralOrigen.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getnumero_secuencial()!=null && !parametrogeneralOrigen.getnumero_secuencial().equals(""))) {parametrogeneral.setnumero_secuencial(parametrogeneralOrigen.getnumero_secuencial());}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getnumero_autor()!=null && !parametrogeneralOrigen.getnumero_autor().equals(""))) {parametrogeneral.setnumero_autor(parametrogeneralOrigen.getnumero_autor());}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getfecha_inicio()!=null && !parametrogeneralOrigen.getfecha_inicio().equals(new Date()))) {parametrogeneral.setfecha_inicio(parametrogeneralOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getfecha_fin()!=null && !parametrogeneralOrigen.getfecha_fin().equals(new Date()))) {parametrogeneral.setfecha_fin(parametrogeneralOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && parametrogeneralOrigen.getesta_activo()!=null && !parametrogeneralOrigen.getesta_activo().equals(false))) {parametrogeneral.setesta_activo(parametrogeneralOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGeneral(ParametroGeneral parametrogeneral) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setText(parametrogeneral.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setText(parametrogeneral.getnumero_secuencial());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setText(parametrogeneral.getnumero_autor());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setDate(parametrogeneral.getfecha_inicio());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setDate(parametrogeneral.getfecha_fin());
			this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setSelected(parametrogeneral.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroGeneral(ParametroGeneralBean parametrogeneralBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setText(parametrogeneralBean.getId().toString());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setText(parametrogeneralBean.getnumero_secuencial());
			this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setText(parametrogeneralBean.getnumero_autor());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setDate(parametrogeneralBean.getfecha_inicio());
			this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setDate(parametrogeneralBean.getfecha_fin());
			this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setSelected(parametrogeneralBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroGeneral(ParametroGeneralParameterReturnGeneral parametrogeneralReturnGeneral,ParametroGeneralBean parametrogeneralBean,Boolean conDefault) throws Exception { 
		try {
			ParametroGeneral parametrogeneralLocal=new ParametroGeneral();
			
			parametrogeneralLocal=parametrogeneralReturnGeneral.getParametroGeneral();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrogeneralLocal.getId()!=null && !parametrogeneralLocal.getId().equals(0L))) {parametrogeneralBean.setId(parametrogeneralLocal.getId());}}
			if(conDefault || (!conDefault && parametrogeneralLocal.getid_tipo_documento_general()!=null && !parametrogeneralLocal.getid_tipo_documento_general().equals(-1L))) {parametrogeneralBean.setid_tipo_documento_general(parametrogeneralLocal.getid_tipo_documento_general());}
			if(conDefault || (!conDefault && parametrogeneralLocal.getnumero_secuencial()!=null && !parametrogeneralLocal.getnumero_secuencial().equals(""))) {parametrogeneralBean.setnumero_secuencial(parametrogeneralLocal.getnumero_secuencial());}
			if(conDefault || (!conDefault && parametrogeneralLocal.getnumero_autor()!=null && !parametrogeneralLocal.getnumero_autor().equals(""))) {parametrogeneralBean.setnumero_autor(parametrogeneralLocal.getnumero_autor());}
			if(conDefault || (!conDefault && parametrogeneralLocal.getfecha_inicio()!=null && !parametrogeneralLocal.getfecha_inicio().equals(new Date()))) {parametrogeneralBean.setfecha_inicio(parametrogeneralLocal.getfecha_inicio());}
			if(conDefault || (!conDefault && parametrogeneralLocal.getfecha_fin()!=null && !parametrogeneralLocal.getfecha_fin().equals(new Date()))) {parametrogeneralBean.setfecha_fin(parametrogeneralLocal.getfecha_fin());}
			if(conDefault || (!conDefault && parametrogeneralLocal.getesta_activo()!=null && !parametrogeneralLocal.getesta_activo().equals(false))) {parametrogeneralBean.setesta_activo(parametrogeneralLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroGeneralGenerico(Long idParametroGeneralSeleccionado,JComboBox jComboBoxParametroGeneral,List<ParametroGeneral> parametrogeneralsLocal)throws Exception {
		try {
			ParametroGeneral  parametrogeneralTemp=null;

			for(ParametroGeneral parametrogeneralAux:parametrogeneralsLocal) {
				if(parametrogeneralAux.getId()!=null && parametrogeneralAux.getId().equals(idParametroGeneralSeleccionado)) {
					parametrogeneralTemp=parametrogeneralAux;
					break;
				}
			}

			jComboBoxParametroGeneral.setSelectedItem(parametrogeneralTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroGeneralGenerico(JComboBox jComboBoxParametroGeneral,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneral.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroGeneral.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroGeneral.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneral=(ParametroGeneral) parametrogeneralLogic.getParametroGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogeneral =(ParametroGeneral) parametrogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrogeneral.getIsNew() && !parametrogeneral.getIsChanged() && !parametrogeneral.getIsDeleted()) {
				sDescripcion=parametrogeneral.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogeneral.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametrogeneral.getIsNew() && !parametrogeneral.getIsChanged() && !parametrogeneral.getIsDeleted()) {
				sDescripcion=parametrogeneral.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogeneral.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoDocumentoGeneral")) {
			//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
			if(!parametrogeneral.getIsNew() && !parametrogeneral.getIsChanged() && !parametrogeneral.getIsDeleted()) {
				sDescripcion=parametrogeneral.gettipodocumentogeneral_descripcion();
			} else {
				//sDescripcion=this.getActualTipoDocumentoGeneralForeignKeyDescripcion((Long)value);
				sDescripcion=parametrogeneral.gettipodocumentogeneral_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroGeneral parametrogeneralRow=new ParametroGeneral();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneralRow=(ParametroGeneral) parametrogeneralLogic.getParametroGenerals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrogeneralRow=(ParametroGeneral) parametrogenerals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroGeneral(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral));			
			this.jButtonDuplicarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneral && this.isPermisoDuplicarParametroGeneral));			
			this.jButtonCopiarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarParametroGeneral && this.isPermisoCopiarParametroGeneral));
			this.jButtonVerFormParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormParametroGeneral && this.isPermisoVerFormParametroGeneral));
			
			this.jButtonAbrirOrderByParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));			
			
			this.jButtonNuevoRelacionesParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneral && this.isPermisoNuevoParametroGeneral));			
			this.jButtonNuevoGuardarCambiosParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarParametroGeneral && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarParametroGeneral && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarParametroGeneral && this.isPermisoEliminarParametroGeneral));
			this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarParametroGeneral);							
			this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral));						
			this.jButtonDuplicarToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneral && this.isPermisoDuplicarParametroGeneral));						
			this.jButtonCopiarToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarParametroGeneral && this.isPermisoCopiarParametroGeneral));			
			this.jButtonVerFormToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormParametroGeneral && this.isPermisoVerFormParametroGeneral));			
			this.jButtonAbrirOrderByToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));
			this.jButtonNuevoRelacionesToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneral && this.isPermisoNuevoParametroGeneral));			
			this.jButtonNuevoGuardarCambiosToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));			
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarParametroGeneral && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarParametroGeneral  && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarParametroGeneral && this.isPermisoEliminarParametroGeneral));
			this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarToolBarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarParametroGeneral);				
			this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral));			
			this.jMenuItemDuplicarParametroGeneral.setVisible((this.isVisibilidadCeldaDuplicarParametroGeneral && this.isPermisoDuplicarParametroGeneral));			
			this.jMenuItemCopiarParametroGeneral.setVisible((this.isVisibilidadCeldaCopiarParametroGeneral && this.isPermisoCopiarParametroGeneral));			
			this.jMenuItemVerFormParametroGeneral.setVisible((this.isVisibilidadCeldaVerFormParametroGeneral && this.isPermisoVerFormParametroGeneral));			
			this.jMenuItemAbrirOrderByParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));			
			//this.jMenuItemMostrarOcultarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));
			this.jMenuItemDetalleAbrirOrderByParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));			
			//this.jMenuItemDetalleMostrarOcultarParametroGeneral.setVisible((this.isVisibilidadCeldaOrdenParametroGeneral && this.isPermisoOrdenParametroGeneral));			
			this.jMenuItemNuevoRelacionesParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroGeneral && this.isPermisoNuevoParametroGeneral));			
			this.jMenuItemNuevoGuardarCambiosParametroGeneral.setVisible((this.isVisibilidadCeldaNuevoParametroGeneral && this.isPermisoNuevoParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));									
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemModificarParametroGeneral.setVisible((this.isVisibilidadCeldaModificarParametroGeneral && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemActualizarParametroGeneral.setVisible((this.isVisibilidadCeldaActualizarParametroGeneral && this.isPermisoActualizarParametroGeneral));	
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemEliminarParametroGeneral.setVisible((this.isVisibilidadCeldaEliminarParametroGeneral && this.isPermisoEliminarParametroGeneral));
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemCancelarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarParametroGeneral);				
			}
			
			this.jMenuItemGuardarCambiosParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));						
			this.jMenuItemGuardarCambiosTablaParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroGeneral=this.jButtonNuevoParametroGeneral.isVisible();
			this.isVisibilidadCeldaDuplicarParametroGeneral=this.jButtonDuplicarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCopiarParametroGeneral=this.jButtonCopiarParametroGeneral.isVisible();
			this.isVisibilidadCeldaVerFormParametroGeneral=this.jButtonVerFormParametroGeneral.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroGeneral=this.jButtonAbrirOrderByParametroGeneral.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=this.jButtonNuevoRelacionesParametroGeneral.isVisible();
			this.isVisibilidadCeldaModificarParametroGeneral=this.jButtonModificarParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.isVisibilidadCeldaActualizarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=this.jButtonGuardarCambiosTablaParametroGeneral.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroGeneral=this.jButtonNuevoToolBarParametroGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=this.jButtonNuevoRelacionesToolBarParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.isVisibilidadCeldaModificarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarToolBarParametroGeneral.isVisible();
			this.isVisibilidadCeldaActualizarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarToolBarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarToolBarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarToolBarParametroGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGeneral=this.jButtonGuardarCambiosToolBarParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=this.jButtonGuardarCambiosTablaToolBarParametroGeneral.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroGeneral=this.jMenuItemNuevoParametroGeneral.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=this.jMenuItemNuevoRelacionesParametroGeneral.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.isVisibilidadCeldaModificarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jMenuItemModificarParametroGeneral.isVisible();
			this.isVisibilidadCeldaActualizarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jMenuItemActualizarParametroGeneral.isVisible();
			this.isVisibilidadCeldaEliminarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jMenuItemEliminarParametroGeneral.isVisible();
			this.isVisibilidadCeldaCancelarParametroGeneral=this.jInternalFrameDetalleFormParametroGeneral.jMenuItemCancelarParametroGeneral.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroGeneral=this.jMenuItemGuardarCambiosParametroGeneral.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=this.jMenuItemGuardarCambiosTablaParametroGeneral.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroGeneral(Boolean esInicializar) {
		if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGeneral();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroGeneral(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroGeneral() {
		this.jButtonNuevoParametroGeneral.setVisible(this.isPermisoNuevoParametroGeneral);			
		this.jButtonDuplicarParametroGeneral.setVisible(this.isPermisoDuplicarParametroGeneral);			
		this.jButtonCopiarParametroGeneral.setVisible(this.isPermisoCopiarParametroGeneral);			
		this.jButtonVerFormParametroGeneral.setVisible(this.isPermisoVerFormParametroGeneral);			
		
		this.jButtonAbrirOrderByParametroGeneral.setVisible(this.isPermisoOrdenParametroGeneral);					
		
		this.jButtonNuevoRelacionesParametroGeneral.setVisible(this.isPermisoNuevoParametroGeneral);			
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarParametroGeneral.setVisible(this.isPermisoActualizarParametroGeneral);	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.setVisible(this.isPermisoActualizarParametroGeneral);	
			this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.setVisible(this.isPermisoEliminarParametroGeneral);
			this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarParametroGeneral);						
			this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.setVisible(this.isPermisoGuardarCambiosParametroGeneral);							
		}
		
		this.jButtonGuardarCambiosTablaParametroGeneral.setVisible(this.isPermisoActualizarParametroGeneral);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGeneral() {
		this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarParametroGeneral.setVisible(this.isPermisoActualizarParametroGeneral);	
		this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.setVisible(this.isPermisoActualizarParametroGeneral);	
		this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.setVisible(this.isPermisoEliminarParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.setVisible(this.isVisibilidadCeldaCancelarParametroGeneral);							
		this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.setVisible((this.isVisibilidadCeldaGuardarParametroGeneral && this.isPermisoGuardarCambiosParametroGeneral));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroGeneral() {
		if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroGeneral();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroGeneral() {
	}
	
	public void jTableDatosParametroGeneralListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroGeneral(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrogeneral.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroGeneral(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrogeneralLogic.getConnexion());

				if(this.parametrogeneral.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrogeneral.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGeneral=(TitledBorder)this.jScrollPanelDatosParametroGeneral.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroGeneral.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrogeneral.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroGeneral(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametrogeneralLogic.getConnexion());

				if(this.parametrogeneral.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametrogeneral.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGeneral=(TitledBorder)this.jScrollPanelDatosParametroGeneral.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroGeneral.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametrogeneral.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_documento_generalParametroGeneralUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipodocumentogeneral=true;

			idTienePermisotipodocumentogeneral=this.tienePermisosUsuarioEnPaginaWebParametroGeneral(TipoDocumentoGeneralConstantesFunciones.CLASSNAME);

			if(idTienePermisotipodocumentogeneral) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroGeneral.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroGeneral.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);

				this.tipodocumentogeneralBeanSwingJInternalFrame=new TipoDocumentoGeneralBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipodocumentogeneralBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipodocumentogeneralBeanSwingJInternalFrame.getTipoDocumentoGeneralLogic().setConnexion(this.parametrogeneralLogic.getConnexion());

				if(this.parametrogeneral.getid_tipo_documento_general()!=null) {
					this.tipodocumentogeneralBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipodocumentogeneralBeanSwingJInternalFrame.setIdActual(this.parametrogeneral.getid_tipo_documento_general());
					this.tipodocumentogeneralBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipodocumentogeneralBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumentoGeneral();
				}

				JInternalFrameBase jinternalFrame =this.tipodocumentogeneralBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroGeneral=(TitledBorder)this.jScrollPanelDatosParametroGeneral.getBorder();
				TitledBorder titledBordertipodocumentogeneral=(TitledBorder)this.tipodocumentogeneralBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumentoGeneral.getBorder();

				titledBordertipodocumentogeneral.setTitle(titledBorderParametroGeneral.getTitle() + " -> Tipo Documento General");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_documento_generalParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getid_tipo_documento_general()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_documento_general = "+this.parametrogeneral.getid_tipo_documento_general().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_secuencialParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getnumero_secuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_secuencial like '%"+this.parametrogeneral.getnumero_secuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_autorParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getnumero_autor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_autor like '%"+this.parametrogeneral.getnumero_autor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.parametrogeneral.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.parametrogeneral.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoParametroGeneralBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.getparametrogeneral(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrogeneral==null) {
						this.parametrogeneral = new ParametroGeneral();
					}

					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);
				}

				if(this.parametrogeneral.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.parametrogeneral.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroGeneral(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdSucursalParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGeneral(false,false);

			this.getParametroGeneralsFK_IdSucursal();

			this.inicializarActualizarBindingParametroGeneral(false);

			//if(ParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalEmpresaParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGeneral(false,false);

			this.getParametroGeneralsFK_IdSucursalEmpresa();

			this.inicializarActualizarBindingParametroGeneral(false);

			//if(ParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoDocumentoGeneralParametroGeneralActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroGeneral(false,false);

			this.getParametroGeneralsFK_IdTipoDocumentoGeneral();

			this.inicializarActualizarBindingParametroGeneral(false);

			//if(ParametroGeneralBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroGeneral(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrogeneralLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroGeneral() {
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
			this.jInternalFrameDetalleFormParametroGeneral.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroGeneral.dispose();
			this.jInternalFrameDetalleFormParametroGeneral=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
			this.jInternalFrameReporteDinamicoParametroGeneral.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroGeneral.dispose();
			this.jInternalFrameReporteDinamicoParametroGeneral=null;
		}
		
		if(this.jInternalFrameImportacionParametroGeneral!=null) {
			this.jInternalFrameImportacionParametroGeneral.setVisible(false);	    			
			this.jInternalFrameImportacionParametroGeneral.dispose();
			this.jInternalFrameImportacionParametroGeneral=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroGeneral();
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroGeneral")) {
				jButtonDuplicarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroGeneral")) {
				jButtonCopiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroGeneral")) {
				jButtonVerFormParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroGeneral")) {
				jButtonDuplicarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroGeneral")) {
				jButtonDuplicarParametroGeneralActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroGeneral")) {
				jButtonModificarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroGeneral")) {
				jButtonModificarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroGeneral")) {
				jButtonModificarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroGeneral")) {
				jButtonActualizarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroGeneral")) {
				jButtonActualizarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroGeneral")) {
				jButtonActualizarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroGeneral")) {
				jButtonEliminarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroGeneral")) {
				jButtonEliminarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroGeneral")) {
				jButtonEliminarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroGeneral")) {
				jButtonCancelarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroGeneral")) {
				jButtonCancelarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroGeneral")) {
				jButtonCancelarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroGeneral")) {
				jButtonCerrarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroGeneral")) {
				jButtonCerrarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroGeneral")) {
				jButtonCerrarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroGeneral")) {
				jButtonMostrarOcultarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroGeneral")) {
				jButtonCancelarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroGeneral")) {
				jButtonCopiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroGeneral")) {
				jButtonVerFormParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroGeneral")) {
				jButtonCopiarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroGeneral")) {
				jButtonVerFormParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroGeneral")) {
				jButtonRecargarInformacionParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroGeneral")) {
				jButtonRecargarInformacionParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroGeneral")) {
				jButtonRecargarInformacionParametroGeneralActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroGeneral")) {
				jButtonAnterioresParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroGeneral")) {
				jButtonAnterioresParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroGeneral")) {
				jButtonAnterioresParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroGeneral")) {
				jButtonSiguientesParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroGeneral")) {
				jButtonSiguientesParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroGeneral")) {
				jButtonSiguientesParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroGeneral") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroGeneral")) {
				jButtonAbrirOrderByParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroGeneral") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroGeneral")) {
				jButtonMostrarOcultarParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGeneral")) {
				jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroGeneral")) {
				jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroGeneral")) {
				jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroGeneral")) {
				jButtonCerrarReporteDinamicoParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroGeneral")) {
				jButtonGenerarReporteDinamicoParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroGeneral")) {
				
				jButtonGenerarExcelReporteDinamicoParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroGeneral")) {
				jButtonCerrarImportacionParametroGeneralActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroGeneral")) {
				
				jButtonGenerarImportacionParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroGeneral")) {
				
				jButtonAbrirImportacionParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroGeneral")) {
				jComboBoxTiposAccionesParametroGeneralActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroGeneral")) {
				jComboBoxTiposRelacionesParametroGeneralActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroGeneral")) {
				jComboBoxTiposAccionesParametroGeneralActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroGeneral")) {
				
				jComboBoxTiposSeleccionarParametroGeneralActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroGeneral")) {
				jTextFieldValorCampoGeneralParametroGeneralActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroGeneral")) {
				jButtonAbrirOrderByParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroGeneral")) {
				jButtonAbrirOrderByParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroGeneral")) {
				jButtonCerrarOrderByParametroGeneralActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGeneralBusqueda")) {
				this.jButtonidParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroGeneralUpdate")) {
				this.jButtonid_empresaParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroGeneralBusqueda")) {
				this.jButtonid_empresaParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroGeneralUpdate")) {
				this.jButtonid_sucursalParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroGeneralBusqueda")) {
				this.jButtonid_sucursalParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalParametroGeneralUpdate")) {
				this.jButtonid_tipo_documento_generalParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalParametroGeneralBusqueda")) {
				this.jButtonid_tipo_documento_generalParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialParametroGeneralBusqueda")) {
				this.jButtonnumero_secuencialParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorParametroGeneralBusqueda")) {
				this.jButtonnumero_autorParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioParametroGeneralBusqueda")) {
				this.jButtonfecha_inicioParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finParametroGeneralBusqueda")) {
				this.jButtonfecha_finParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoParametroGeneralBusqueda")) {
				this.jButtonesta_activoParametroGeneralBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoDocumentoGeneralParametroGeneral")) {
				this.jButtonFK_IdTipoDocumentoGeneralParametroGeneralActionPerformed(evt);
			}
			
			;
			
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroGeneral();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroGeneral parametrogeneralLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrogeneralLocal=this.parametrogeneral;
			} else {
				parametrogeneralLocal=this.parametrogeneralAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
							
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
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
			
			


			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
								
						
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
								
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
							
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
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
			
			


			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
								
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroGeneral")) {
					jCheckBoxSeleccionarTodosParametroGeneralItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroGeneral")) {
					jCheckBoxSeleccionadosParametroGeneralItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroGeneral")) {
					
				}
				
				


				
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
												
				
				


				
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
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
			
			


			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroGeneralActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrogeneral);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrogeneral);
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
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
				
				


				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroGeneral.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroGeneral.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroGeneralActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrogeneralAnterior =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroGeneral")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroGeneral.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrogeneral =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrogeneral =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrogeneral);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroGeneral")) {
				
				}
				
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroGeneral")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroGeneral.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroGeneral")) {
			
			}
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroGeneral();
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			if(sTipo.equals("NuevoParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroGeneral")) {
				jButtonDuplicarParametroGeneralActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroGeneral")) {
				jButtonCopiarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroGeneral")) {
				jButtonVerFormParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroGeneral")) {
				jButtonNuevoParametroGeneralActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroGeneral")) {
				jButtonModificarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroGeneral")) {
				jButtonActualizarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroGeneral")) {
				jButtonEliminarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroGeneral")) {
				jButtonCancelarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroGeneral")) {
				jButtonCerrarParametroGeneralActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroGeneral")) {
				jButtonGuardarCambiosParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroGeneral")) {
				jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroGeneral")) {
				jButtonAbrirOrderByParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroGeneral")) {
				jButtonRecargarInformacionParametroGeneralActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroGeneral")) {
				jButtonAnterioresParametroGeneralActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroGeneral")) {
				jButtonSiguientesParametroGeneralActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroGeneralBusqueda")) {
				this.jButtonidParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroGeneralUpdate")) {
				this.jButtonid_empresaParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroGeneralBusqueda")) {
				this.jButtonid_empresaParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroGeneralUpdate")) {
				this.jButtonid_sucursalParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroGeneralBusqueda")) {
				this.jButtonid_sucursalParametroGeneralBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_documento_generalParametroGeneralUpdate")) {
				this.jButtonid_tipo_documento_generalParametroGeneralUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_documento_generalParametroGeneralBusqueda")) {
				this.jButtonid_tipo_documento_generalParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_secuencialParametroGeneralBusqueda")) {
				this.jButtonnumero_secuencialParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_autorParametroGeneralBusqueda")) {
				this.jButtonnumero_autorParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioParametroGeneralBusqueda")) {
				this.jButtonfecha_inicioParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finParametroGeneralBusqueda")) {
				this.jButtonfecha_finParametroGeneralBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoParametroGeneralBusqueda")) {
				this.jButtonesta_activoParametroGeneralBusquedaActionPerformed(evt);
			}
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroGeneral();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroGeneral")) {
				closingInternalFrameParametroGeneral();
				
			} else if(sTipo.equals("jButtonCancelarParametroGeneral")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroGeneral = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroGeneralBeanSwingJInternalFrame jInternalFrameParent=(ParametroGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGeneral.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroGeneralActionPerformed(null);
			}
			
			ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrogeneral,new Object(),this.parametrogeneralParameterGeneral,this.parametrogeneralReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroGeneral(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrogeneral)) {
			if(!esControlTabla) {
				if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);			
				}
				
				if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroGeneral(this.parametrogeneral,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogeneralReturnGeneral=parametrogeneralLogic.procesarEventosParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralLogic.getParametroGenerals(),this.parametrogeneral,this.parametrogeneralParameterGeneral,this.isEsNuevoParametroGeneral,classes);//this.parametrogeneralLogic.getParametroGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroGeneral(this.parametrogeneralReturnGeneral,this.parametrogeneralBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroGeneral(classes,this.parametrogeneralReturnGeneral,this.parametrogeneralBean,false);
					}
						
					if(this.parametrogeneralReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral());	
					}
						
					if(this.parametrogeneralReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral(),classes);//this.parametrogeneralBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroGeneral(this.parametrogeneral,classes);//this.parametrogeneralBean);									
				}
			
				if(ParametroGeneralJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroGeneral(this.parametrogeneral,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroGeneral(this.parametrogeneral);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrogeneralAnterior!=null) {
						this.parametrogeneral=this.parametrogeneralAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrogeneralReturnGeneral=parametrogeneralLogic.procesarEventosParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneralLogic.getParametroGenerals(),this.parametrogeneral,this.parametrogeneralParameterGeneral,this.isEsNuevoParametroGeneral,classes);//this.parametrogeneralLogic.getParametroGeneral()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrogeneralSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrogeneralReturnGeneral.getParametroGeneral(),parametrogeneralLogic.getParametroGenerals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrogeneralReturnGeneral.getParametroGeneral(),this.parametrogenerals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroGeneral.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroGeneral.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroGeneral();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroGeneral() throws Exception {
		
		ParametroGeneralModel parametrogeneralModel=(ParametroGeneralModel)this.jTableDatosParametroGeneral.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrogeneralModel.parametrogenerals=this.parametrogeneralLogic.getParametroGenerals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrogeneralModel.parametrogenerals=this.parametrogenerals;
		}
		
		
		((ParametroGeneralModel) this.jTableDatosParametroGeneral.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroGeneral() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrogeneralAnterior(),this.parametrogeneralLogic.getParametroGenerals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrogeneralAnterior(),this.parametrogenerals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroGeneral();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroGeneral(ParametroGeneral parametrogeneral,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
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
										
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneral,new Object(),generalEntityParameterGeneral,this.parametrogeneralReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroGeneralConstantesFunciones.getClassesRelationshipsOfParametroGeneral(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroGeneralConstantesFunciones.getClassesRelationshipsFromStringsOfParametroGeneral(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroGeneral(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroGeneralBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrogeneral,new Object(),generalEntityParameterGeneral,this.parametrogeneralReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroGeneral(ParametroGeneralBean parametrogeneralBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroGeneral(ArrayList<Classe> classes,ParametroGeneralReturnGeneral parametrogeneralReturnGeneral,ParametroGeneralBean parametrogeneralBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroGeneral(ParametroGeneral parametrogeneral,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrogeneral)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroGeneral = new ParametroGeneralDetalleFormJInternalFrame(jDesktopPane,this.parametrogeneralSessionBean.getConGuardarRelaciones(),this.parametrogeneralSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.setVisible(false);
		this.jInternalFrameDetalleFormParametroGeneral.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroGeneral.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroGeneral.parametrogeneralLogic=this.parametrogeneralLogic;
		
		this.cargarCombosFrameForeignKeyParametroGeneral("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroGeneral();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroGeneral();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroGeneral("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroGeneral();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGeneral"));
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarParametroGeneral"));

		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGeneral"));
					
		this.jInternalFrameDetalleFormParametroGeneral.jMenuItemModificarParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.addActionListener (new ButtonActionListener(this,"ActualizarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGeneral"));
						
		this.jInternalFrameDetalleFormParametroGeneral.jMenuItemActualizarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGeneral"));
								
		this.jInternalFrameDetalleFormParametroGeneral.jMenuItemEliminarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarParametroGeneral"));
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGeneral"));
					
		this.jInternalFrameDetalleFormParametroGeneral.jMenuItemCancelarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGeneral"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jMenuItemDetalleCerrarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGeneral"));		
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneral"));
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneral"));
		
		
		
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGeneral"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonidParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_secuencialParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_autorParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_inicioParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_finParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonesta_activoParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGeneral"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroGeneral"));
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroGeneral"));
		}
		
		this.jTableDatosParametroGeneral.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroGeneral"));
		
		this.jTableDatosParametroGeneral.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroGeneral"));
		
		this.jButtonNuevoParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoParametroGeneral"));
		
		this.jButtonDuplicarParametroGeneral.addActionListener(new ButtonActionListener(this,"DuplicarParametroGeneral"));
		
		this.jButtonCopiarParametroGeneral.addActionListener(new ButtonActionListener(this,"CopiarParametroGeneral"));
		
		this.jButtonVerFormParametroGeneral.addActionListener(new ButtonActionListener(this,"VerFormParametroGeneral"));
		
		
		this.jButtonNuevoToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroGeneral"));
			
		this.jButtonDuplicarToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroGeneral"));
			
		this.jMenuItemNuevoParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroGeneral"));
			
		this.jMenuItemDuplicarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroGeneral"));		
		
		
		this.jButtonNuevoRelacionesParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroGeneral"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroGeneral"));
			
		this.jMenuItemNuevoRelacionesParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonModificarToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroGeneral"));
			
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemModificarParametroGeneral.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarParametroGeneral.addActionListener (new ButtonActionListener(this,"ActualizarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonActualizarToolBarParametroGeneral.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroGeneral"));
				
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemActualizarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonEliminarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroGeneral"));
						
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemEliminarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonCancelarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroGeneral"));
			
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemCancelarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroGeneral"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroGeneral"));		
		
		
		this.jButtonCerrarParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarParametroGeneral"));
		
		
		this.jButtonCerrarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroGeneral"));
			
		this.jMenuItemCerrarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroGeneral"));
			
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jMenuItemDetalleCerrarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroGeneral"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroGeneral"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroGeneral"));
		}
		
		this.jButtonCopiarToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroGeneral"));
			
		this.jButtonVerFormToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroGeneral"));
		
		this.jMenuItemGuardarCambiosParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroGeneral"));
			
		this.jMenuItemCopiarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroGeneral"));		
		
		this.jMenuItemVerFormParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroGeneral"));		
		
		
		this.jButtonGuardarCambiosTablaParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGeneral"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroGeneral"));
			
		this.jMenuItemGuardarCambiosTablaParametroGeneral.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroGeneral"));		
		
		
		
		this.jButtonRecargarInformacionParametroGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroGeneral"));
					
		this.jButtonRecargarInformacionToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroGeneral"));
		
		this.jMenuItemRecargarInformacionParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroGeneral"));		
		
		
		
		this.jButtonAnterioresParametroGeneral.addActionListener (new ButtonActionListener(this,"AnterioresParametroGeneral"));
		
		
		this.jButtonAnterioresToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroGeneral"));
		
		this.jMenuItemAnterioresParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroGeneral"));		
		
		
		this.jButtonSiguientesParametroGeneral.addActionListener (new ButtonActionListener(this,"SiguientesParametroGeneral"));
		
		
		this.jButtonSiguientesToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroGeneral"));
			
		this.jMenuItemSiguientesParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroGeneral"));
			
		this.jMenuItemAbrirOrderByParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroGeneral"));
			
		this.jMenuItemMostrarOcultarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroGeneral"));
			
		this.jMenuItemDetalleAbrirOrderByParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroGeneral"));
			
		this.jMenuItemDetalleMostarOcultarParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroGeneral"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroGeneral"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroGeneral"));
			
		this.jMenuItemNuevoGuardarCambiosParametroGeneral.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroGeneral"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroGeneral"));

		this.jCheckBoxSeleccionadosParametroGeneral.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroGeneral"));
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroGeneral"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroGeneral"));
			
		this.jComboBoxTiposAccionesParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroGeneral"));
					
		this.jComboBoxTiposSeleccionarParametroGeneral.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroGeneral"));
			
		this.jTextFieldValorCampoGeneralParametroGeneral.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroGeneral"));		
		
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonidParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_secuencialParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_autorParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_inicioParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_finParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonesta_activoParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralParametroGeneral"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroGeneral!=null) {
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneral"));
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneral"));
				this.jInternalFrameReporteDinamicoParametroGeneral.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneral"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroGeneral.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroGeneral"));				
			//this.jButtonGenerarReporteDinamicoParametroGeneral.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroGeneral"));
			//this.jButtonGenerarExcelReporteDinamicoParametroGeneral.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroGeneral"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroGeneral!=null) {
				this.jInternalFrameImportacionParametroGeneral.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroGeneral"));
				this.jInternalFrameImportacionParametroGeneral.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroGeneral"));
				this.jInternalFrameImportacionParametroGeneral.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroGeneral"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroGeneral"));
			
			this.jButtonAbrirOrderByToolBarParametroGeneral.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroGeneral"));			
			
			if(this.jInternalFrameOrderByParametroGeneral!=null) {
				this.jInternalFrameOrderByParametroGeneral.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroGeneral"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroGeneral.jTabbedPaneRelacionesParametroGeneral.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroGeneral"));
		
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
            		closingInternalFrameParametroGeneral();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroGeneral.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroGeneral = (JInternalFrameBase)event.getSource();
	            	
	            ParametroGeneralBeanSwingJInternalFrame jInternalFrameParent=(ParametroGeneralBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroGeneral.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroGeneralActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroGeneral.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroGeneralListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroGeneral.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroGeneral.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroGeneral";
		inputMap = this.jButtonNuevoParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGeneralActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroGeneralActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroGeneral";
		inputMap = this.jButtonNuevoRelacionesParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroGeneralActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroGeneral";
		inputMap = this.jButtonModificarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroGeneral";
		inputMap = this.jButtonActualizarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroGeneral";
		inputMap = this.jButtonEliminarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroGeneral";
		inputMap = this.jButtonCancelarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroGeneral";
		inputMap = this.jButtonCerrarParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroGeneral";
		inputMap = this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroGeneral.jButtonGuardarCambiosParametroGeneral.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroGeneralActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroGeneral.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroGeneralItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroGeneral.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroGeneralActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonidParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"idParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_empresaParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_sucursalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroGeneralBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonid_tipo_documento_generalParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_documento_generalParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_secuencialParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_secuencialParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonnumero_autorParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"numero_autorParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_inicioParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonfecha_finParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finParametroGeneralBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroGeneral.jButtonesta_activoParametroGeneralBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoParametroGeneralBusqueda"));
		
		
		this.jButtonFK_IdTipoDocumentoGeneralParametroGeneral.addActionListener(new ButtonActionListener(this,"FK_IdTipoDocumentoGeneralParametroGeneral"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroGeneral.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroGeneralActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroGeneral.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroGeneral(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
					parametrogeneralAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneral parametrogeneralAux:parametrogenerals) {
					parametrogeneralAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
						parametrogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneral parametrogeneralAux:parametrogenerals) {
						parametrogeneralAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
					
						if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							parametrogeneralAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneral parametrogeneralAux:parametrogenerals) {
						
						if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							parametrogeneralAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroGeneralItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroGeneral.getSelectedRows();
			
			ParametroGeneral parametrogeneralLocal=new ParametroGeneral();
			
			//this.seleccionarTodosParametroGeneral(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrogeneralLocal =(ParametroGeneral) this.parametrogeneralLogic.getParametroGenerals().toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrogeneralLocal =(ParametroGeneral) this.parametrogenerals.toArray()[this.jTableDatosParametroGeneral.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrogeneralLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
						parametrogeneralAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroGeneral parametrogeneralAux:parametrogenerals) {
						parametrogeneralAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneral(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroGeneral.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroGeneral.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroGeneral,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroGeneralItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroGeneralParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroGeneralActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroGeneral.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroGeneral parametrogeneralAux:this.parametrogeneralLogic.getParametroGenerals()) {
				
						if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							parametrogeneralAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR)) {
							existe=true;
							parametrogeneralAux.setnumero_autor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							parametrogeneralAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							parametrogeneralAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneral parametrogeneralAux:parametrogenerals) {
					
						if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
							existe=true;
							parametrogeneralAux.setnumero_secuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR)) {
							existe=true;
							parametrogeneralAux.setnumero_autor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							parametrogeneralAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							parametrogeneralAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroGeneral(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroGeneralActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroGeneral=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroGeneral.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroGeneral) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroGeneral(conSplash);
				
					this.generarReporteParametroGeneralsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGeneralsSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroGeneralsSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGeneral();
				
				this.exportarParametroGeneralsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroGenerals();
				//this.importarParametroGenerals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroGeneral();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroGeneralsSeleccionados();
				//this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroGeneral();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroGeneral)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroGeneral(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroGeneralBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroGeneral) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroGeneral(conSplash);
					
						//this.actualizarParametrosGeneralParametroGeneral();
						
						this.generarReporteProcesoAccionParametroGeneralsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroGeneralBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro GeneralS SELECCIONADOS?", "MANTENIMIENTO DE Parametro General", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroGeneral();
				
						this.actualizarParametrosGeneralParametroGeneral();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrogeneralReturnGeneral=parametrogeneralLogic.procesarAccionParametroGeneralsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrogeneralLogic.getParametroGenerals(),this.parametrogeneralParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroGeneral();
					
					ParametroGeneralBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroGeneralReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroGeneral.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroGeneral.jComboBoxTiposAccionesFormularioParametroGeneral.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroGeneral(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroGeneralActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroGeneral();
			
			if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
			ParametroGeneral parametrogeneral=new ParametroGeneral();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroGeneral(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroGeneral.getSelectedItem();
			
			
			
			
			parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrogeneralsSeleccionados.size()==1) {
				for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
					parametrogeneral=parametrogeneralAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroGeneral();
			
      		//this.finishProcessParametroGeneral(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroGeneralReturnGeneral() throws Exception {
		if(this.parametrogeneralReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrogeneralReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrogeneralReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrogeneralReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrogeneralReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroGeneral(false);
		}
		
		if(this.parametrogeneralReturnGeneral.getConRetornoLista() || this.parametrogeneralReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrogeneralReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogeneralLogic.setParametroGenerals(this.parametrogeneralReturnGeneral.getParametroGenerals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrogeneralReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrogeneralLogic.setParametroGeneral(this.parametrogeneralReturnGeneral.getParametroGeneral());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroGeneral(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroGeneral() throws Exception {
		
		
	}
	
	public ArrayList<ParametroGeneral> getParametroGeneralsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroGeneral) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroGeneral parametrogeneralAux:parametrogeneralLogic.getParametroGenerals()) {
					if(parametrogeneralAux.getIsSelected()) {
						parametrogeneralsSeleccionados.add(parametrogeneralAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroGeneral parametrogeneralAux:this.parametrogenerals) {
					if(parametrogeneralAux.getIsSelected()) {
						parametrogeneralsSeleccionados.add(parametrogeneralAux);				
					}
				}
			}
			
			if(parametrogeneralsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrogeneralsSeleccionados.addAll(this.parametrogeneralLogic.getParametroGenerals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrogeneralsSeleccionados.addAll(this.parametrogenerals);				
					}
				}
			}
		} else {
			parametrogeneralsSeleccionados.add(this.parametrogeneral);
		}
		
		return parametrogeneralsSeleccionados;
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
	
	public void generarReporteParametroGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroGeneralsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGeneralsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroGeneralsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroGeneralsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroGeneral();
		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroGeneral();
		
		
		//this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados ,parametrogeneralImplementable,parametrogeneralImplementableHome);
	}
	
	public void mostrarImportacionParametroGenerals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroGeneral();
		
		this.abrirFrameImportacionParametroGeneral();		
		
			
		//this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados ,parametrogeneralImplementable,parametrogeneralImplementableHome);
	}
	
	public void importarParametroGenerals() throws Exception {		
	
	}
	
	public void exportarParametroGeneralsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroGeneralsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroGeneralsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroGeneralsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro General",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroGeneral(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroGeneral(parametrogeneralAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrogeneralAux.setsDetalleGeneralEntityReporte(parametrogeneralAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroGeneral(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroGeneral(ParametroGeneral parametrogeneral,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrogeneral.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.gettipodocumentogeneral_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getnumero_secuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getnumero_autor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrogeneral.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroGenerals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroGeneral(row);				
				iRow++;
			}				
			
			for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroGeneral(parametrogeneralAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroGeneralsSeleccionados() throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();		
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrogeneral.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrogenerals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrogeneral");
			//elementRoot.appendChild(element);
		
			for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
				element = document.createElement("parametrogeneral");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroGeneral(parametrogeneralAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro General",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroGeneral(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroGeneral(ParametroGeneral parametrogeneral,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.gettipodocumentogeneral_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getnumero_secuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getnumero_autor());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrogeneral.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlParametroGeneral(ParametroGeneral parametrogeneral,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroGeneralConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrogeneral.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroGeneralConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrogeneral.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroGeneralConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrogeneral.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroGeneralConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametrogeneral.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipodocumentogeneral_descripcion = document.createElement(ParametroGeneralConstantesFunciones.IDTIPODOCUMENTOGENERAL);
		elementtipodocumentogeneral_descripcion.appendChild(document.createTextNode(parametrogeneral.gettipodocumentogeneral_descripcion()));
		element.appendChild(elementtipodocumentogeneral_descripcion);

		Element elementnumero_secuencial = document.createElement(ParametroGeneralConstantesFunciones.NUMEROSECUENCIAL);
		elementnumero_secuencial.appendChild(document.createTextNode(parametrogeneral.getnumero_secuencial().trim()));
		element.appendChild(elementnumero_secuencial);

		Element elementnumero_autor = document.createElement(ParametroGeneralConstantesFunciones.NUMEROAUTOR);
		elementnumero_autor.appendChild(document.createTextNode(parametrogeneral.getnumero_autor().trim()));
		element.appendChild(elementnumero_autor);

		Element elementfecha_inicio = document.createElement(ParametroGeneralConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(parametrogeneral.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ParametroGeneralConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(parametrogeneral.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementesta_activo = document.createElement(ParametroGeneralConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(parametrogeneral.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoParametroGeneralsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroGeneral> parametrogeneralsSeleccionados=new ArrayList<ParametroGeneral>();
		
		parametrogeneralsSeleccionados=this.getParametroGeneralsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroGeneral(parametrogeneralsSeleccionados);
		
		this.generarReporteParametroGenerals("Todos",parametrogeneralsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroGeneral(ArrayList<ParametroGeneral> parametrogeneralsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroGeneral parametrogeneralAux:parametrogeneralsSeleccionados) {
				parametrogeneralAux.setsDetalleGeneralEntityReporte(parametrogeneralAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(parametrogeneralAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(parametrogeneralAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(parametrogeneralAux.gettipodocumentogeneral_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(parametrogeneralAux.getnumero_secuencial());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(parametrogeneralAux.getnumero_autor());
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(parametrogeneralAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(parametrogeneralAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					parametrogeneralAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrogeneralAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroGeneralConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroGeneral(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroGeneral=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=true;
				this.isVisibilidadCeldaGuardarCambiosParametroGeneral=true;
			}
			
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarParametroGeneral=true;
			this.isVisibilidadCeldaCancelarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=true;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=true;
			this.isVisibilidadCeldaModificarParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
			this.isVisibilidadCeldaModificarParametroGeneral=true;
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
			this.isVisibilidadCeldaCancelarParametroGeneral=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroGeneral=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroGeneral=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=true;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=true;
		} else {
			this.actualizarEstadoPanelsParametroGeneral(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroGeneral=false;
			//this.isVisibilidadCeldaVerFormParametroGeneral=false;
			this.isVisibilidadCeldaDuplicarParametroGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrogeneralSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroGeneral=false;
			this.isVisibilidadCeldaGuardarCambiosParametroGeneral=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!parametrogeneralSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;												
			}
			
			this.jButtonCerrarParametroGeneral.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroGeneral=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrogeneral)) {
			this.isVisibilidadCeldaActualizarParametroGeneral=false;
			this.isVisibilidadCeldaEliminarParametroGeneral=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroGeneral() {
	}
	
	public void actualizarEstadoPanelsParametroGeneral(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroGeneral!=null) {
				this.jScrollPanelDatosEdicionParametroGeneral.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroGeneral!=null) {
				this.jScrollPanelDatosParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroGeneral!=null) {
				this.jPanelPaginacionParametroGeneral.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
					this.jTabbedPaneBusquedasParametroGeneral.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroGeneral!=null) {
				this.jTabbedPaneBusquedasParametroGeneral.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroGeneral!=null) {
				this.jPanelParametrosReportesParametroGeneral.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasParametroGeneral.remove(jPanelFK_IdTipoDocumentoGeneralParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasParametroGeneral.remove(jPanelFK_IdTipoDocumentoGeneralParametroGeneral);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoDocumentoGeneral(Boolean isParaTipoDocumentoGeneral){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoDocumentoGeneralNegation=!isParaTipoDocumentoGeneral;

			this.isVisibilidadFK_IdTipoDocumentoGeneral=isParaTipoDocumentoGeneral;
			if(!this.isVisibilidadFK_IdTipoDocumentoGeneral) {this.jTabbedPaneBusquedasParametroGeneral.remove(jPanelFK_IdTipoDocumentoGeneralParametroGeneral);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroGeneralSessionBean parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		
		if(this.parametrogeneralSessionBean==null) {
			this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		}
		
		this.parametrogeneralSessionBean.setsUltimaBusquedaParametroGeneral(this.getsAccionBusqueda());
		this.parametrogeneralSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrogeneralSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametrogeneralSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursalEmpresa")) {
			parametrogeneralSessionBean.setid_empresa(this.getid_empresaFK_IdSucursalEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
			parametrogeneralSessionBean.setid_tipo_documento_general(this.getid_tipo_documento_generalFK_IdTipoDocumentoGeneral());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroGeneralSessionBean parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		
		if(this.parametrogeneralSessionBean==null) {
			this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		}
		
		if(this.parametrogeneralSessionBean.getsUltimaBusquedaParametroGeneral()!=null&&!this.parametrogeneralSessionBean.getsUltimaBusquedaParametroGeneral().equals("")) {
			this.setsAccionBusqueda(parametrogeneralSessionBean.getsUltimaBusquedaParametroGeneral());
			this.setiNumeroPaginacion(parametrogeneralSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrogeneralSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametrogeneralSessionBean.getid_sucursal());
				parametrogeneralSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursalEmpresa")) {
				this.setid_empresaFK_IdSucursalEmpresa(parametrogeneralSessionBean.getid_empresa());
				parametrogeneralSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoDocumentoGeneral")) {
				this.setid_tipo_documento_generalFK_IdTipoDocumentoGeneral(parametrogeneralSessionBean.getid_tipo_documento_general());
				parametrogeneralSessionBean.setid_tipo_documento_general(-1L);
			}
		}
		
		this.parametrogeneralSessionBean.setsUltimaBusquedaParametroGeneral("");
		this.parametrogeneralSessionBean.setiNumeroPaginacion(ParametroGeneralConstantesFunciones.INUMEROPAGINACION);
		this.parametrogeneralSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroGeneral(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroGeneral() {
		this.updateBorderResaltarBusquedasFormularioParametroGeneral();
		this.updateVisibilidadBusquedasFormularioParametroGeneral();
		this.updateHabilitarBusquedasFormularioParametroGeneral();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroGeneral() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroGeneral.getComponents().length>0) {
	

		if(this.parametrogeneralConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralParametroGeneral!=null) {
			index= this.jTabbedPaneBusquedasParametroGeneral.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGeneral.getComponent(index);
				jPanel.setBorder(this.parametrogeneralConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralParametroGeneral);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroGeneral() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroGeneral.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGeneral.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrogeneralConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralParametroGeneral);
			if(!this.parametrogeneralConstantesFunciones.mostrarFK_IdTipoDocumentoGeneralParametroGeneral && index>-1) {
				this.jTabbedPaneBusquedasParametroGeneral.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroGeneral() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroGeneral.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroGeneral.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGeneral.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrogeneralConstantesFunciones.activarFK_IdTipoDocumentoGeneralParametroGeneral);
				this.jTabbedPaneBusquedasParametroGeneral.setEnabledAt(index,this.parametrogeneralConstantesFunciones.activarFK_IdTipoDocumentoGeneralParametroGeneral);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroGeneral(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoDocumentoGeneral")) {
			index= this.jTabbedPaneBusquedasParametroGeneral.indexOfComponent(this.jPanelFK_IdTipoDocumentoGeneralParametroGeneral);

			this.jTabbedPaneBusquedasParametroGeneral.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroGeneral.getComponent(index);

			this.parametrogeneralConstantesFunciones.setResaltarFK_IdTipoDocumentoGeneralParametroGeneral(resaltar);

			jPanel.setBorder(this.parametrogeneralConstantesFunciones.resaltarFK_IdTipoDocumentoGeneralParametroGeneral);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroGeneral.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroGeneral() throws Exception {

		if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroGeneral();
		this.updateVisibilidadResaltarControlesFormularioParametroGeneral();
		this.updateHabilitarResaltarControlesFormularioParametroGeneral();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrogeneralConstantesFunciones.resaltaridParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltaridParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarid_empresaParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarid_empresaParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarid_sucursalParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarid_sucursalParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarid_tipo_documento_generalParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarid_tipo_documento_generalParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarnumero_secuencialParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarnumero_secuencialParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarnumero_autorParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarnumero_autorParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarfecha_inicioParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarfecha_inicioParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltarfecha_finParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltarfecha_finParametroGeneral);}
		if(this.parametrogeneralConstantesFunciones.resaltaresta_activoParametroGeneral!=null && this.jInternalFrameDetalleFormParametroGeneral!=null) {this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setBorderPainted(true);this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setBorder(this.parametrogeneralConstantesFunciones.resaltaresta_activoParametroGeneral);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroGeneral() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
	
		//this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostraridParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelidParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostraridParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_empresaParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelid_empresaParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_empresaParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_sucursalParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelid_sucursalParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_sucursalParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_tipo_documento_generalParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelid_tipo_documento_generalParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarid_tipo_documento_generalParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarnumero_secuencialParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelnumero_secuencialParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarnumero_secuencialParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarnumero_autorParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelnumero_autorParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarnumero_autorParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarfecha_inicioParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelfecha_inicioParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarfecha_inicioParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarfecha_finParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelfecha_finParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostrarfecha_finParametroGeneral);
		//this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostraresta_activoParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jPanelesta_activoParametroGeneral.setVisible(this.parametrogeneralConstantesFunciones.mostraresta_activoParametroGeneral);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroGeneral() throws Exception {
		if(this.jInternalFrameDetalleFormParametroGeneral==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroGeneral!=null) {
	
		this.jInternalFrameDetalleFormParametroGeneral.jLabelidParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activaridParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_empresaParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarid_empresaParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_sucursalParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarid_sucursalParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jComboBoxid_tipo_documento_generalParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarid_tipo_documento_generalParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_secuencialParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarnumero_secuencialParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jTextFieldnumero_autorParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarnumero_autorParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_inicioParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarfecha_inicioParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jDateChooserfecha_finParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activarfecha_finParametroGeneral);
		this.jInternalFrameDetalleFormParametroGeneral.jCheckBoxesta_activoParametroGeneral.setEnabled(this.parametrogeneralConstantesFunciones.activaresta_activoParametroGeneral);
		}
	}
	
		
}