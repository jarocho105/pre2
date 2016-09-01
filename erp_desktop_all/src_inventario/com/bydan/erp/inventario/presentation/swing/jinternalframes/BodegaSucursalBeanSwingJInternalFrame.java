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

import com.bydan.erp.inventario.util.BodegaSucursalConstantesFunciones;
import com.bydan.erp.inventario.util.BodegaSucursalParameterReturnGeneral;
//import com.bydan.erp.inventario.util.BodegaSucursalParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.BodegaSucursalBean;
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
public class BodegaSucursalBeanSwingJInternalFrame extends BodegaSucursalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BodegaSucursalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BodegaSucursal> bodegasucursalValidator = new ClassValidator<BodegaSucursal>(BodegaSucursal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BodegaSucursal bodegasucursal;	
	public BodegaSucursal bodegasucursalAux;
	public BodegaSucursal bodegasucursalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BodegaSucursal bodegasucursalTotales;
	public Long idBodegaSucursalActual;
	public Long iIdNuevoBodegaSucursal=0L;
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

	public String sFinalQueryComboBodega="";

	public List<Bodega> bodegasForeignKey;

	public List<Bodega> getbodegasForeignKey() {
		return bodegasForeignKey;
	}

	public void setbodegasForeignKey(List<Bodega> bodegasForeignKey) {
		this.bodegasForeignKey = bodegasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegaForeignKey;

	public Bodega getbodegaForeignKey() {
		return bodegaForeignKey;
	}

	public void setbodegaForeignKey(Bodega bodegaForeignKey) {
		this.bodegaForeignKey = bodegaForeignKey;
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
	
	public Boolean isPermisoTodoBodegaSucursal;
	public Boolean isPermisoNuevoBodegaSucursal;
	public Boolean isPermisoActualizarBodegaSucursal;
	public Boolean isPermisoActualizarOriginalBodegaSucursal;
	public Boolean isPermisoEliminarBodegaSucursal;
	public Boolean isPermisoGuardarCambiosBodegaSucursal;
	public Boolean isPermisoConsultaBodegaSucursal;
	public Boolean isPermisoBusquedaBodegaSucursal;
	public Boolean isPermisoReporteBodegaSucursal;
	public Boolean isPermisoPaginacionMedioBodegaSucursal;
	public Boolean isPermisoPaginacionAltoBodegaSucursal;
	public Boolean isPermisoPaginacionTodoBodegaSucursal;
	public Boolean isPermisoCopiarBodegaSucursal;
	public Boolean isPermisoVerFormBodegaSucursal;
	public Boolean isPermisoDuplicarBodegaSucursal;
	public Boolean isPermisoOrdenBodegaSucursal;
	
	
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
	
	public BodegaSucursalParameterReturnGeneral bodegasucursalReturnGeneral;
	public BodegaSucursalParameterReturnGeneral bodegasucursalParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBodegaSucursal=false;
	public Boolean esParaAccionDesdeFormularioBodegaSucursal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BodegaSucursalSessionBeanAdditional bodegasucursalSessionBeanAdditional=null;
	
	public BodegaSucursalSessionBeanAdditional getBodegaSucursalSessionBeanAdditional() {
		return this.bodegasucursalSessionBeanAdditional;
	}
	
	public void setBodegaSucursalSessionBeanAdditional(BodegaSucursalSessionBeanAdditional bodegasucursalSessionBeanAdditional) {
		try {
			this.bodegasucursalSessionBeanAdditional=bodegasucursalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BodegaSucursalBeanSwingJInternalFrameAdditional bodegasucursalBeanSwingJInternalFrameAdditional=null;
	//public class BodegaSucursalBeanSwingJInternalFrame
	
	public BodegaSucursalBeanSwingJInternalFrameAdditional getBodegaSucursalBeanSwingJInternalFrameAdditional() {
		return this.bodegasucursalBeanSwingJInternalFrameAdditional;
	}
	
	public void setBodegaSucursalBeanSwingJInternalFrameAdditional(BodegaSucursalBeanSwingJInternalFrameAdditional bodegasucursalBeanSwingJInternalFrameAdditional) {
		try {
			this.bodegasucursalBeanSwingJInternalFrameAdditional=bodegasucursalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BodegaSucursalLogic bodegasucursalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BodegaSucursal bodegasucursalBean;
	public BodegaSucursalConstantesFunciones bodegasucursalConstantesFunciones;
	//public BodegaSucursalParameterReturnGeneral bodegasucursalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	
	//PARAMETROS
	
	
	//public List<BodegaSucursal> bodegasucursals;	
	//public List<BodegaSucursal> bodegasucursalsEliminados;
	//public List<BodegaSucursal> bodegasucursalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBodegaSucursal=false;
	public Boolean isVisibilidadCeldaDuplicarBodegaSucursal=true;
	public Boolean isVisibilidadCeldaCopiarBodegaSucursal=true;
	public Boolean isVisibilidadCeldaVerFormBodegaSucursal=true;
	public Boolean isVisibilidadCeldaOrdenBodegaSucursal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
	public Boolean isVisibilidadCeldaModificarBodegaSucursal=false;
	public Boolean isVisibilidadCeldaActualizarBodegaSucursal=false;
	public Boolean isVisibilidadCeldaEliminarBodegaSucursal=false;
	public Boolean isVisibilidadCeldaCancelarBodegaSucursal=false;
	public Boolean isVisibilidadCeldaGuardarBodegaSucursal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoBodegaSucursal() {
		return this.iIdNuevoBodegaSucursal;
	}

	public void setiIdNuevoBodegaSucursal(Long iIdNuevoBodegaSucursal) {
		this.iIdNuevoBodegaSucursal = iIdNuevoBodegaSucursal;
	}
	
	public Long getidBodegaSucursalActual() {
		return this.idBodegaSucursalActual;
	}

	public void setidBodegaSucursalActual(Long idBodegaSucursalActual) {
		this.idBodegaSucursalActual = idBodegaSucursalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BodegaSucursal getbodegasucursal() {
		return this.bodegasucursal;
	}

	public void setbodegasucursal(BodegaSucursal bodegasucursal) {
		this.bodegasucursal = bodegasucursal;
	}
	
	public BodegaSucursal getbodegasucursalAux() {
		return this.bodegasucursalAux;
	}

	public void setbodegasucursalAux(BodegaSucursal bodegasucursalAux) {
		this.bodegasucursalAux = bodegasucursalAux;
	}				
	
	public BodegaSucursal getbodegasucursalAnterior() {
		return this.bodegasucursalAnterior;
	}

	public void setbodegasucursalAnterior(BodegaSucursal bodegasucursalAnterior) {
		this.bodegasucursalAnterior = bodegasucursalAnterior;
	}	
	
	public BodegaSucursal getbodegasucursalTotales() {
		return this.bodegasucursalTotales;
	}

	public void setbodegasucursalTotales(BodegaSucursal bodegasucursalTotales) {
		this.bodegasucursalTotales = bodegasucursalTotales;
	}	
	
	public BodegaSucursal getbodegasucursalBean() {
		return this.bodegasucursalBean;
	}

	public void setbodegasucursalBean(BodegaSucursal bodegasucursalBean) {
		this.bodegasucursalBean = bodegasucursalBean;
	}	
	
	public BodegaSucursalParameterReturnGeneral getbodegasucursalReturnGeneral() {
		return this.bodegasucursalReturnGeneral;
	}

	public void setbodegasucursalReturnGeneral(BodegaSucursalParameterReturnGeneral bodegasucursalReturnGeneral) {
		this.bodegasucursalReturnGeneral = bodegasucursalReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public BodegaSucursalLogic getBodegaSucursalLogic()	{		
		return bodegasucursalLogic;
	}

	public void setBodegaSucursalLogic(BodegaSucursalLogic bodegasucursalLogic) {
		this.bodegasucursalLogic = bodegasucursalLogic;
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
	
	public Boolean getIsEsNuevoBodegaSucursal() {
		return isEsNuevoBodegaSucursal;
	}

	public void setIsEsNuevoBodegaSucursal(Boolean isEsNuevoBodegaSucursal) {
		this.isEsNuevoBodegaSucursal = isEsNuevoBodegaSucursal;
	}

	public Boolean getEsParaAccionDesdeFormularioBodegaSucursal() {
		return esParaAccionDesdeFormularioBodegaSucursal;
	}
	
	public void setEsParaAccionDesdeFormularioBodegaSucursal(Boolean esParaAccionDesdeFormularioBodegaSucursal) {
		this.esParaAccionDesdeFormularioBodegaSucursal = esParaAccionDesdeFormularioBodegaSucursal;
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

			if(this.bodegasucursalSessionBean==null) {
				this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
			}

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(bodegasucursalSessionBean.getlidEmpresaActual());
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

			if(this.bodegasucursalSessionBean==null) {
				this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
			}

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(bodegasucursalSessionBean.getlidSucursalActual());
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

	public void cargarCombosBodegasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.bodegasucursalSessionBean==null) {
				this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
			}

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodega(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(bodegasucursalSessionBean.getlidBodegaActual());
					this.bodegasForeignKey.add(bodegaLogic.getBodega());
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

					if(this.bodegasucursal!=null) {
						this.bodegasucursal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBodegaSucursal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBodegaSucursalGenerico)throws Exception
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
				jComboBoxid_empresaBodegaSucursalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBodegaSucursalGenerico!=null && jComboBoxid_empresaBodegaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_empresaBodegaSucursalGenerico.setSelectedIndex(0);
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

					if(this.bodegasucursal!=null) {
						this.bodegasucursal.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalBodegaSucursal.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdSucursal") || sFormularioTipoBusqueda.equals("Todos")){
					if(sucursalTemp!=null && jComboBoxid_sucursalFK_IdSucursalBodegaSucursal!=null) {
						jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setSelectedItem(sucursalTemp);
					} else {
						if(jComboBoxid_sucursalFK_IdSucursalBodegaSucursal!=null) {
							//jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setSelectedItem(sucursalTemp);
							if(jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.getItemCount()>0) {
								jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalBodegaSucursalGenerico)throws Exception
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
				jComboBoxid_sucursalBodegaSucursalGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalBodegaSucursalGenerico!=null && jComboBoxid_sucursalBodegaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_sucursalBodegaSucursalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaForeignKey(Long idBodegaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegaTemp!=null) {

					if(this.bodegasucursal!=null) {
						this.bodegasucursal.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaBodegaSucursal.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
						if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.getItemCount()>0) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaBodegaSucursal!=null) {
						jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaBodegaSucursal!=null) {
							//jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setSelectedIndex(0);
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

	public String getActualBodegaForeignKeyDescripcion(Long idBodegaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaBodegaSucursalGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaTemp=null;

			for(Bodega bodegaAux:bodegasForeignKey) {
				if(bodegaAux.getId()!=null && bodegaAux.getId().equals(idBodegaSeleccionado)) {
					bodegaTemp=bodegaAux;
					break;
				}
			}

			if(bodegaTemp!=null) {
				jComboBoxid_bodegaBodegaSucursalGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaBodegaSucursalGenerico!=null && jComboBoxid_bodegaBodegaSucursalGenerico.getItemCount()>0) {
					jComboBoxid_bodegaBodegaSucursalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BodegaSucursal bodegasucursal,JComboBox jComboBoxid_empresaBodegaSucursalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBodegaSucursalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBodegaSucursalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bodegasucursal.setid_empresa(empresaAux.getId());
				bodegasucursal.setempresa_descripcion(BodegaSucursalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bodegasucursal.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(BodegaSucursal bodegasucursal,JComboBox jComboBoxid_sucursalBodegaSucursalGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalBodegaSucursalGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalBodegaSucursalGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				bodegasucursal.setid_sucursal(sucursalAux.getId());
				bodegasucursal.setsucursal_descripcion(BodegaSucursalConstantesFunciones.getSucursalDescripcion(sucursalAux));
				bodegasucursal.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(BodegaSucursal bodegasucursal,JComboBox jComboBoxid_bodegaBodegaSucursalGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaBodegaSucursalGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaBodegaSucursalGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				bodegasucursal.setid_bodega(bodegaAux.getId());
				bodegasucursal.setbodega_descripcion(BodegaSucursalConstantesFunciones.getBodegaDescripcion(bodegaAux));
				bodegasucursal.setBodega(bodegaAux);			}
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

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
					}

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
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

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
					}

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdSucursal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.addItem(sucursal);
							}
						}

						if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { 
					}

					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.addItem(bodega);
							}
						}

						if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setSelectedItem(sucursal);
						} else {
							this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesBodegaSucursal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BodegaSucursalConstantesFunciones.refrescarForeignKeysDescripcionesBodegaSucursal(this.bodegasucursalLogic.getBodegaSucursals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BodegaSucursalConstantesFunciones.refrescarForeignKeysDescripcionesBodegaSucursal(this.bodegasucursals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bodegasucursalLogic.setBodegaSucursals(this.bodegasucursals);
			bodegasucursalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BodegaSucursalParameterReturnGeneral getBodegaSucursalParameterGeneral() {
		return this.bodegasucursalParameterGeneral;
	}
	
	public void setBodegaSucursalParameterGeneral(BodegaSucursalParameterReturnGeneral bodegasucursalParameterGeneral) {
		this.bodegasucursalParameterGeneral = bodegasucursalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBodegaSucursal() {
		return isPermisoTodoBodegaSucursal;
	}

	public void setIsPermisoTodoBodegaSucursal(Boolean isPermisoTodoBodegaSucursal) {
		this.isPermisoTodoBodegaSucursal = isPermisoTodoBodegaSucursal;
	}

	public Boolean getIsPermisoNuevoBodegaSucursal() {
		return isPermisoNuevoBodegaSucursal;
	}

	public void setIsPermisoNuevoBodegaSucursal(Boolean isPermisoNuevoBodegaSucursal) {
		this.isPermisoNuevoBodegaSucursal = isPermisoNuevoBodegaSucursal;
	}

	public Boolean getIsPermisoActualizarBodegaSucursal() {
		return isPermisoActualizarBodegaSucursal;
	}

	public void setIsPermisoActualizarBodegaSucursal(Boolean isPermisoActualizarBodegaSucursal) {
		this.isPermisoActualizarBodegaSucursal = isPermisoActualizarBodegaSucursal;
	}

	public Boolean getIsPermisoEliminarBodegaSucursal() {
		return isPermisoEliminarBodegaSucursal;
	}

	public void setIsPermisoEliminarBodegaSucursal(Boolean isPermisoEliminarBodegaSucursal) {
		this.isPermisoEliminarBodegaSucursal = isPermisoEliminarBodegaSucursal;
	}

	public Boolean getIsPermisoGuardarCambiosBodegaSucursal() {
		return isPermisoGuardarCambiosBodegaSucursal;
	}

	public void setIsPermisoGuardarCambiosBodegaSucursal(Boolean isPermisoGuardarCambiosBodegaSucursal) {
		this.isPermisoGuardarCambiosBodegaSucursal = isPermisoGuardarCambiosBodegaSucursal;
	}
	
	public Boolean getIsPermisoConsultaBodegaSucursal() {
		return isPermisoConsultaBodegaSucursal;
	}

	public void setIsPermisoConsultaBodegaSucursal(Boolean isPermisoConsultaBodegaSucursal) {
		this.isPermisoConsultaBodegaSucursal = isPermisoConsultaBodegaSucursal;
	}

	public Boolean getIsPermisoBusquedaBodegaSucursal() {
		return isPermisoBusquedaBodegaSucursal;
	}

	public void setIsPermisoBusquedaBodegaSucursal(Boolean isPermisoBusquedaBodegaSucursal) {
		this.isPermisoBusquedaBodegaSucursal = isPermisoBusquedaBodegaSucursal;
	}

	public Boolean getIsPermisoReporteBodegaSucursal() {
		return isPermisoReporteBodegaSucursal;
	}

	public void setIsPermisoReporteBodegaSucursal(Boolean isPermisoReporteBodegaSucursal) {
		this.isPermisoReporteBodegaSucursal = isPermisoReporteBodegaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionMedioBodegaSucursal() {
		return isPermisoPaginacionMedioBodegaSucursal;
	}

	public void setIsPermisoPaginacionMedioBodegaSucursal(Boolean isPermisoPaginacionMedioBodegaSucursal) {
		this.isPermisoPaginacionMedioBodegaSucursal = isPermisoPaginacionMedioBodegaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionTodoBodegaSucursal() {
		return isPermisoPaginacionTodoBodegaSucursal;
	}

	public void setIsPermisoPaginacionTodoBodegaSucursal(Boolean isPermisoPaginacionTodoBodegaSucursal) {
		this.isPermisoPaginacionTodoBodegaSucursal = isPermisoPaginacionTodoBodegaSucursal;
	}
	
	public Boolean getIsPermisoPaginacionAltoBodegaSucursal() {
		return isPermisoPaginacionAltoBodegaSucursal;
	}

	public void setIsPermisoPaginacionAltoBodegaSucursal(Boolean isPermisoPaginacionAltoBodegaSucursal) {
		this.isPermisoPaginacionAltoBodegaSucursal = isPermisoPaginacionAltoBodegaSucursal;
	}
	
	public Boolean getIsPermisoCopiarBodegaSucursal() {
		return isPermisoCopiarBodegaSucursal;
	}

	public void setIsPermisoCopiarBodegaSucursal(Boolean isPermisoCopiarBodegaSucursal) {
		this.isPermisoCopiarBodegaSucursal = isPermisoCopiarBodegaSucursal;
	}
	
	public Boolean getIsPermisoVerFormBodegaSucursal() {
		return isPermisoVerFormBodegaSucursal;
	}

	public void setIsPermisoVerFormBodegaSucursal(Boolean isPermisoVerFormBodegaSucursal) {
		this.isPermisoVerFormBodegaSucursal = isPermisoVerFormBodegaSucursal;
	}
	
	public Boolean getIsPermisoDuplicarBodegaSucursal() {
		return isPermisoDuplicarBodegaSucursal;
	}

	public void setIsPermisoDuplicarBodegaSucursal(Boolean isPermisoDuplicarBodegaSucursal) {
		this.isPermisoDuplicarBodegaSucursal = isPermisoDuplicarBodegaSucursal;
	}
	
	public Boolean getIsPermisoOrdenBodegaSucursal() {
		return isPermisoOrdenBodegaSucursal;
	}

	public void setIsPermisoOrdenBodegaSucursal(Boolean isPermisoOrdenBodegaSucursal) {
		this.isPermisoOrdenBodegaSucursal = isPermisoOrdenBodegaSucursal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBodegaSucursal() {
		return isVisibilidadCeldaNuevoBodegaSucursal;
	}

	public void setIsVisibilidadCeldaNuevoBodegaSucursal(Boolean isVisibilidadCeldaNuevoBodegaSucursal) {
		this.isVisibilidadCeldaNuevoBodegaSucursal = isVisibilidadCeldaNuevoBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBodegaSucursal() {
		return isVisibilidadCeldaDuplicarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaDuplicarBodegaSucursal(Boolean isVisibilidadCeldaDuplicarBodegaSucursal) {
		this.isVisibilidadCeldaDuplicarBodegaSucursal = isVisibilidadCeldaDuplicarBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBodegaSucursal() {
		return isVisibilidadCeldaCopiarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaCopiarBodegaSucursal(Boolean isVisibilidadCeldaCopiarBodegaSucursal) {
		this.isVisibilidadCeldaCopiarBodegaSucursal = isVisibilidadCeldaCopiarBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBodegaSucursal() {
		return isVisibilidadCeldaVerFormBodegaSucursal;
	}

	public void setIsVisibilidadCeldaVerFormBodegaSucursal(Boolean isVisibilidadCeldaVerFormBodegaSucursal) {
		this.isVisibilidadCeldaVerFormBodegaSucursal = isVisibilidadCeldaVerFormBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBodegaSucursal() {
		return isVisibilidadCeldaOrdenBodegaSucursal;
	}

	public void setIsVisibilidadCeldaOrdenBodegaSucursal(Boolean isVisibilidadCeldaOrdenBodegaSucursal) {
		this.isVisibilidadCeldaOrdenBodegaSucursal = isVisibilidadCeldaOrdenBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBodegaSucursal() {
		return isVisibilidadCeldaNuevoRelacionesBodegaSucursal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBodegaSucursal(Boolean isVisibilidadCeldaNuevoRelacionesBodegaSucursal) {
		this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal = isVisibilidadCeldaNuevoRelacionesBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBodegaSucursal() {
		return isVisibilidadCeldaModificarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaModificarBodegaSucursal(Boolean isVisibilidadCeldaModificarBodegaSucursal) {
		this.isVisibilidadCeldaModificarBodegaSucursal = isVisibilidadCeldaModificarBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBodegaSucursal() {
		return isVisibilidadCeldaActualizarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaActualizarBodegaSucursal(Boolean isVisibilidadCeldaActualizarBodegaSucursal) {
		this.isVisibilidadCeldaActualizarBodegaSucursal = isVisibilidadCeldaActualizarBodegaSucursal;
	}

	public Boolean getIsVisibilidadCeldaEliminarBodegaSucursal() {
		return isVisibilidadCeldaEliminarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaEliminarBodegaSucursal(Boolean isVisibilidadCeldaEliminarBodegaSucursal) {
		this.isVisibilidadCeldaEliminarBodegaSucursal = isVisibilidadCeldaEliminarBodegaSucursal;
	}

	public Boolean getIsVisibilidadCeldaCancelarBodegaSucursal() {
		return isVisibilidadCeldaCancelarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaCancelarBodegaSucursal(Boolean isVisibilidadCeldaCancelarBodegaSucursal) {
		this.isVisibilidadCeldaCancelarBodegaSucursal = isVisibilidadCeldaCancelarBodegaSucursal;
	}

	public Boolean getIsVisibilidadCeldaGuardarBodegaSucursal() {
		return isVisibilidadCeldaGuardarBodegaSucursal;
	}

	public void setIsVisibilidadCeldaGuardarBodegaSucursal(Boolean isVisibilidadCeldaGuardarBodegaSucursal) {
		this.isVisibilidadCeldaGuardarBodegaSucursal = isVisibilidadCeldaGuardarBodegaSucursal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBodegaSucursal() {
		return isVisibilidadCeldaGuardarCambiosBodegaSucursal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBodegaSucursal(Boolean isVisibilidadCeldaGuardarCambiosBodegaSucursal) {
		this.isVisibilidadCeldaGuardarCambiosBodegaSucursal = isVisibilidadCeldaGuardarCambiosBodegaSucursal;
	}
		
	public BodegaSucursalSessionBean getbodegasucursalSessionBean() {
		return this.bodegasucursalSessionBean;
	}
	
	public void setbodegasucursalSessionBean(BodegaSucursalSessionBean bodegasucursalSessionBean) {
		this.bodegasucursalSessionBean=bodegasucursalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(BodegaSucursal bodegasucursal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bodegasucursal,null);
				this.setActualParaGuardarSucursalForeignKey(bodegasucursal,null);
				this.setActualParaGuardarBodegaForeignKey(bodegasucursal,null);
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
	
	public void bugActualizarReferenciaActual(BodegaSucursal bodegasucursal,BodegaSucursal bodegasucursalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBodegaSucursal(bodegasucursal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bodegasucursalAux.setId(bodegasucursal.getId());
		bodegasucursalAux.setVersionRow(bodegasucursal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBodegaSucursal();
		
			int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bodegasucursalValidator.getInvalidValues(this.bodegasucursal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bodegasucursalLogic.setDatosCliente(datosCliente);
			bodegasucursalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bodegasucursalAux=new  BodegaSucursal();
				
				bodegasucursalAux.setIsNew(true);
				bodegasucursalAux.setIsChanged(true);
				
				bodegasucursalAux.setBodegaSucursalOriginal(this.bodegasucursal);
				
				bodegasucursalAux.setId(this.bodegasucursal.getId());	
				bodegasucursalAux.setVersionRow(this.bodegasucursal.getVersionRow());	
				bodegasucursalAux.setid_empresa(this.bodegasucursal.getid_empresa());	
				bodegasucursalAux.setid_sucursal(this.bodegasucursal.getid_sucursal());	
				bodegasucursalAux.setid_bodega(this.bodegasucursal.getid_bodega());	
				bodegasucursalAux.setsecuencia(this.bodegasucursal.getsecuencia());	
				bodegasucursalAux.settamanio(this.bodegasucursal.gettamanio());	
				bodegasucursalAux.setdescripcion(this.bodegasucursal.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bodegasucursalAux,bodegasucursals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.saveBodegaSucursals();//WithConnection
						//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);
					
					this.refrescarForeignKeysDescripcionesBodegaSucursal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bodegasucursalLogic.saveBodegaSucursalRelaciones(bodegasucursalAux);//WithConnection
								//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bodegasucursalAux,bodegasucursals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bodegasucursalAux=new  BodegaSucursal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado() 
					|| (this.bodegasucursalSessionBean.getEsGuardarRelacionado() && this.bodegasucursal.getId()>=0)) {
						
					bodegasucursalAux.setIsNew(false);
				}
				
				bodegasucursalAux.setIsDeleted(false);
			
				bodegasucursalAux.setId(this.bodegasucursal.getId());	
				bodegasucursalAux.setVersionRow(this.bodegasucursal.getVersionRow());	
				bodegasucursalAux.setid_empresa(this.bodegasucursal.getid_empresa());	
				bodegasucursalAux.setid_sucursal(this.bodegasucursal.getid_sucursal());	
				bodegasucursalAux.setid_bodega(this.bodegasucursal.getid_bodega());	
				bodegasucursalAux.setsecuencia(this.bodegasucursal.getsecuencia());	
				bodegasucursalAux.settamanio(this.bodegasucursal.gettamanio());	
				bodegasucursalAux.setdescripcion(this.bodegasucursal.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bodegasucursalAux,bodegasucursals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.saveBodegaSucursals();//WithConnection
						//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);
					
					this.refrescarForeignKeysDescripcionesBodegaSucursal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bodegasucursalLogic.saveBodegaSucursalRelaciones(bodegasucursalAux);//WithConnection
								//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bodegasucursalAux,bodegasucursals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bodegasucursal,bodegasucursalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bodegasucursalAux=new  BodegaSucursal();
				
				bodegasucursalAux.setIsNew(false);
				bodegasucursalAux.setIsChanged(false);
				
				bodegasucursalAux.setIsDeleted(true);
				
				bodegasucursalAux.setId(this.bodegasucursal.getId());	
				bodegasucursalAux.setVersionRow(this.bodegasucursal.getVersionRow());	
				bodegasucursalAux.setid_empresa(this.bodegasucursal.getid_empresa());	
				bodegasucursalAux.setid_sucursal(this.bodegasucursal.getid_sucursal());	
				bodegasucursalAux.setid_bodega(this.bodegasucursal.getid_bodega());	
				bodegasucursalAux.setsecuencia(this.bodegasucursal.getsecuencia());	
				bodegasucursalAux.settamanio(this.bodegasucursal.gettamanio());	
				bodegasucursalAux.setdescripcion(this.bodegasucursal.getdescripcion());	
				
				if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bodegasucursalAux.getId()>=0) {	
						this.bodegasucursalsEliminados.add(bodegasucursalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bodegasucursalAux,bodegasucursals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.saveBodegaSucursals();//WithConnection
						//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bodegasucursalLogic.saveBodegaSucursalRelaciones(bodegasucursalAux);//WithConnection
								//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
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
							if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bodegasucursalAux,bodegasucursalLogic.getBodegaSucursals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bodegasucursalAux,bodegasucursals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getBodegaSucursals().addAll(this.bodegasucursalsEliminados);
					
					bodegasucursalLogic.saveBodegaSucursals();//WithConnection
					//bodegasucursalLogic.getSetVersionRowBodegaSucursals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBodegaSucursal();
				
				this.bodegasucursalsEliminados= new ArrayList<BodegaSucursal>();		
			}
			
			if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Bodega Sucursal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bodegasucursal=bodegasucursalAux;
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
      		//this.finishProcessBodegaSucursal();
      	}
		
	}	
	
	public void actualizarRelaciones(BodegaSucursal bodegasucursalLocal) throws Exception {
		
		if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BodegaSucursal bodegasucursalLocal) throws Exception {	
		if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bodegasucursalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				bodegasucursalLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				bodegasucursalLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBodegaSucursalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bodegasucursalValidator.getInvalidValues(this.bodegasucursal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BodegaSucursal bodegasucursal,List<BodegaSucursal> bodegasucursals) throws Exception {
		try	{		
			BodegaSucursalConstantesFunciones.actualizarLista(bodegasucursal,bodegasucursals,this.bodegasucursalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(BodegaSucursal bodegasucursal,List<BodegaSucursal> bodegasucursals) throws Exception {
		try	{			
			BodegaSucursalConstantesFunciones.actualizarSelectedLista(bodegasucursal,bodegasucursals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BodegaSucursal> bodegasucursalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bodegasucursalsLocal=this.bodegasucursalLogic.getBodegaSucursals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bodegasucursalsLocal=this.bodegasucursals;
			}
			//ARCHITECTURE
		
			for(BodegaSucursal bodegasucursalLocal:bodegasucursalsLocal) {
				if(this.permiteMantenimiento(bodegasucursalLocal) && bodegasucursalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BodegaSucursalConstantesFunciones.getBodegaSucursalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_empresaBodegaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_sucursalBodegaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_bodegaBodegaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.SECUENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelsecuenciaBodegaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.TAMANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabeltamanioBodegaSucursal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BodegaSucursalConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabeldescripcionBodegaSucursal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_empresaBodegaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_sucursalBodegaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabelid_bodegaBodegaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabelsecuenciaBodegaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabeltamanioBodegaSucursal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBodegaSucursal.jLabeldescripcionBodegaSucursal,"");
		
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
		this.iIdNuevoBodegaSucursal--;	
		
		
		this.bodegasucursalAux=new BodegaSucursal();
		
		this.bodegasucursalAux.setId(this.iIdNuevoBodegaSucursal);
		this.bodegasucursalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bodegasucursalLogic.getBodegaSucursals().add(this.bodegasucursalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bodegasucursals.add(this.bodegasucursalAux);
		}
		//ARCHITECTURE
		
		this.bodegasucursal=this.bodegasucursalAux;
		
		if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBodegaSucursal(this.bodegasucursal);
			this.setVariablesObjetoActualToFormularioForeignKeyBodegaSucursal(this.bodegasucursal);
		}
				
		//this.setDefaultControlesBodegaSucursal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBodegaSucursal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBodegaSucursal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBodegaSucursal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBodegaSucursal(this.bodegasucursalBean,this.bodegasucursal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BodegaSucursalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
			classes=BodegaSucursalConstantesFunciones.getClassesRelationshipsOfBodegaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bodegasucursalReturnGeneral=bodegasucursalLogic.procesarEventosBodegaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bodegasucursalLogic.getBodegaSucursals(),this.bodegasucursal,this.bodegasucursalParameterGeneral,this.isEsNuevoBodegaSucursal,classes);//this.bodegasucursalLogic.getBodegaSucursal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBodegaSucursal(this.bodegasucursalReturnGeneral,this.bodegasucursalBean,false);
		
		if(this.bodegasucursalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal());
		}
		
		if(this.bodegasucursalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal(),classes);//this.bodegasucursalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBodegaSucursal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBodegaSucursal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.RecargarFormBodegaSucursal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBodegaSucursal(false);
						
			if(bodegasucursalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBodegaSucursal();
			}
			
			this.actualizarVisualTableDatosBodegaSucursal();
			
			this.jTableDatosBodegaSucursal.setRowSelectionInterval(this.getIndiceNuevoBodegaSucursal(), this.getIndiceNuevoBodegaSucursal());
			
			this.seleccionarFilaTablaBodegaSucursalActual();
						
			this.actualizarEstadoCeldasBotonesBodegaSucursal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBodegaSucursal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activarsecuenciaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activartamanioBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activardescripcionBodegaSucursal);	
		//
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activarid_empresaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activarid_sucursalBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setEnabled(isHabilitar && this.bodegasucursalConstantesFunciones.activarid_bodegaBodegaSucursal);
	};
	
	public void setDefaultControlesBodegaSucursal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBodegaSucursal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bodegasucursalSessionBean.setConGuardarRelaciones(true);			
			this.bodegasucursalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.setVisible(true);
			
					
		} else {
			//this.bodegasucursalSessionBean.setConGuardarRelaciones(false);			
			this.bodegasucursalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBodegaSucursal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
				if(bodegasucursalAux.getId().equals(this.iIdNuevoBodegaSucursal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursals) {
				if(bodegasucursalAux.getId().equals(this.iIdNuevoBodegaSucursal)) {
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
	
	public int getIndiceActualBodegaSucursal(BodegaSucursal bodegasucursal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
				if(bodegasucursalAux.getId().equals(bodegasucursal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursals) {
				if(bodegasucursalAux.getId().equals(bodegasucursal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBodegaSucursal(BodegaSucursal bodegasucursalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
				if(bodegasucursalAux.getBodegaSucursalOriginal().getId().equals(bodegasucursalOriginal.getId())) {
					existe=true;
					bodegasucursalOriginal.setId(bodegasucursalAux.getId());
					bodegasucursalOriginal.setVersionRow(bodegasucursalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BodegaSucursal bodegasucursalAux:this.bodegasucursals) {
				if(bodegasucursalAux.getBodegaSucursalOriginal().getId().equals(bodegasucursalOriginal.getId())) {
					existe=true;
					bodegasucursalOriginal.setId(bodegasucursalAux.getId());
					bodegasucursalOriginal.setVersionRow(bodegasucursalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBodegaSucursal(Boolean esParaCancelar) throws Exception {
		bodegasucursalsAux=new ArrayList<BodegaSucursal>();
		bodegasucursalAux=new BodegaSucursal();
		
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
					if(bodegasucursalAux.getId()<0) {
						bodegasucursalsAux.add(bodegasucursalAux);
					}		
				}
				this.iIdNuevoBodegaSucursal=0L;
				this.bodegasucursalLogic.getBodegaSucursals().removeAll(bodegasucursalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BodegaSucursal bodegasucursalAux:this.bodegasucursals) {
					if(bodegasucursalAux.getId()<0) {
						bodegasucursalsAux.add(bodegasucursalAux);
					}		
				}
				this.iIdNuevoBodegaSucursal=0L;
				this.bodegasucursals.removeAll(bodegasucursalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBodegaSucursal 
					&& this.bodegasucursalLogic.getBodegaSucursals().size()>0
					) {
					bodegasucursalAux=this.bodegasucursalLogic.getBodegaSucursals().get(this.bodegasucursalLogic.getBodegaSucursals().size() - 1);
				
					if(bodegasucursalAux.getId()<0) {
						this.bodegasucursalLogic.getBodegaSucursals().remove(bodegasucursalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBodegaSucursal && this.bodegasucursals.size()>0) {
					bodegasucursalAux=this.bodegasucursals.get(this.bodegasucursals.size() - 1);
				
					if(bodegasucursalAux.getId()<0) {
						this.bodegasucursals.remove(bodegasucursalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBodegaSucursal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bodegasucursal.getId()<0) {
				this.bodegasucursalLogic.getBodegaSucursals().remove(this.bodegasucursal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bodegasucursal.getId()<0) {
				this.bodegasucursals.remove(this.bodegasucursal);
			}
		}			
	}
	
	public void setEstadosInicialesBodegaSucursal(List<BodegaSucursal> bodegasucursalsAux) throws Exception {
		BodegaSucursalConstantesFunciones.setEstadosInicialesBodegaSucursal(bodegasucursalsAux);
	}
	
	public void setEstadosInicialesBodegaSucursal(BodegaSucursal bodegasucursalAux) throws Exception {
		BodegaSucursalConstantesFunciones.setEstadosInicialesBodegaSucursal(bodegasucursalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBodegaSucursalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBodegaSucursalActual()) {
				if(!this.isEsNuevoBodegaSucursal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBodegaSucursal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBodegaSucursalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Bodega Sucursal ?", "MANTENIMIENTO DE Bodega Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BodegaSucursal bodegasucursal) throws Exception {
		BodegaSucursalConstantesFunciones.seleccionarAsignar(this.bodegasucursal,bodegasucursal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBodegaSucursal=this.isPermisoActualizarOriginalBodegaSucursal;
			
			
			this.seleccionarAsignar(bodegasucursal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BodegaSucursalConstantesFunciones.quitarEspaciosBodegaSucursal(this.bodegasucursal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBodegaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bodegasucursalSessionBean.setsFuncionBusquedaRapida(this.bodegasucursalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBodegaSucursal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBodegaSucursal(esParaCancelar);				
				this.cancelarNuevoBodegaSucursal(esParaCancelar);								
			}
			
			this.bodegasucursal=new BodegaSucursal();
			
			this.inicializarBodegaSucursal();
			
			this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBodegaSucursal() throws Exception {
		try {
			BodegaSucursalConstantesFunciones.inicializarBodegaSucursal(this.bodegasucursal);
			
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
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bodegasucursalLogic.getBodegaSucursals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBodegaSucursals(String sAccionBusqueda,List<BodegaSucursal> bodegasucursalsParaReportes) throws Exception {
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
					sPathReporteFinal="BodegaSucursal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BodegaSucursalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BodegaSucursalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BodegaSucursal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Bodega Sucursales");		
		parameters.put("busquedapor", BodegaSucursalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBodegaSucursal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BodegaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BodegaSucursalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBodegaSucursal=new JRBeanArrayDataSource(BodegaSucursalJInternalFrame.TraerBodegaSucursalBeans(bodegasucursalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBodegaSucursal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BodegaSucursalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BodegaSucursalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BodegaSucursalBean.TraerBodegaSucursalBeans(bodegasucursalsParaReportes).toArray()));
							
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
				this.generarExcelReporteBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBodegaSucursalActionPerformed(null);
					//this.generarExcelReporteBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBodegaSucursals(sAccionBusqueda,sTipoArchivoReporte,bodegasucursalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBodegaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<BodegaSucursal> bodegasucursalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BodegaSucursals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBodegaSucursal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BodegaSucursal bodegasucursal : bodegasucursalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BodegaSucursalConstantesFunciones.generarExcelReporteDataBodegaSucursal("NORMAL",row,workbook,bodegasucursal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBodegaSucursal(String sTipo,Row row,Workbook workbook) {
		
		BodegaSucursalConstantesFunciones.generarExcelReporteHeaderBodegaSucursal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBodegaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<BodegaSucursal> bodegasucursalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BodegaSucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BodegaSucursal bodegasucursal : bodegasucursalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BodegaSucursalConstantesFunciones.getBodegaSucursalDescripcion(bodegasucursal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.getsecuencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_TAMANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_TAMANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.gettamanio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bodegasucursal.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBodegaSucursals(String sAccionBusqueda,String sTipoArchivoReporte,List<BodegaSucursal> bodegasucursalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BodegaSucursal> bodegasucursalsRespaldo=null;
		
		classes=BodegaSucursalConstantesFunciones.getClassesRelationshipsOfBodegaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bodegasucursalLogic.setDatosCliente(this.datosCliente);
		this.bodegasucursalLogic.setDatosDeep(this.datosDeep);
		this.bodegasucursalLogic.setIsConDeep(true);
		
		bodegasucursalsRespaldo=this.bodegasucursalLogic.getBodegaSucursals();
		
		this.bodegasucursalLogic.setBodegaSucursals(bodegasucursalsParaReportes);	
		this.bodegasucursalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bodegasucursalsParaReportes=this.bodegasucursalLogic.getBodegaSucursals();
		this.bodegasucursalLogic.setBodegaSucursals(bodegasucursalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BodegaSucursals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBodegaSucursal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BodegaSucursal bodegasucursal : bodegasucursalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBodegaSucursal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BodegaSucursalConstantesFunciones.generarExcelReporteDataBodegaSucursal("NORMAL",row,workbook,bodegasucursal,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BodegaSucursalConstantesFunciones.getBodegaSucursalDescripcion(bodegasucursal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBodegaSucursal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBodegaSucursal() throws Exception {		
		this.startProcessBodegaSucursal(true);
	}
	
	public void startProcessBodegaSucursal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBodegaSucursal ,this.jPanelParametrosReportesBodegaSucursal, this.jScrollPanelDatosBodegaSucursal,this.jPanelPaginacionBodegaSucursal, this.jScrollPanelDatosEdicionBodegaSucursal, this.jPanelAccionesBodegaSucursal,this.jPanelAccionesFormularioBodegaSucursal,this.jmenuBarBodegaSucursal,this.jmenuBarDetalleBodegaSucursal,this.jTtoolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasBodegaSucursal=this.jTabbedPaneBusquedasBodegaSucursal; 
		
		final JPanel jPanelParametrosReportesBodegaSucursal=this.jPanelParametrosReportesBodegaSucursal;
		//final JScrollPane jScrollPanelDatosBodegaSucursal=this.jScrollPanelDatosBodegaSucursal;
		final JTable jTableDatosBodegaSucursal=this.jTableDatosBodegaSucursal;		
		final JPanel jPanelPaginacionBodegaSucursal=this.jPanelPaginacionBodegaSucursal;
		//final JScrollPane jScrollPanelDatosEdicionBodegaSucursal=this.jScrollPanelDatosEdicionBodegaSucursal;
		final JPanel jPanelAccionesBodegaSucursal=this.jPanelAccionesBodegaSucursal;
		
		JPanel jPanelCamposAuxiliarBodegaSucursal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBodegaSucursal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			jPanelCamposAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jPanelCamposBodegaSucursal;
			jPanelAccionesFormularioAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jPanelAccionesFormularioBodegaSucursal;
		}
		
		final JPanel jPanelCamposBodegaSucursal=jPanelCamposAuxiliarBodegaSucursal;
		final JPanel jPanelAccionesFormularioBodegaSucursal=jPanelAccionesFormularioAuxiliarBodegaSucursal;
		
		
		final JMenuBar jmenuBarBodegaSucursal=this.jmenuBarBodegaSucursal;
		final JToolBar jTtoolBarBodegaSucursal=this.jTtoolBarBodegaSucursal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBodegaSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBodegaSucursal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			jmenuBarDetalleAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jmenuBarDetalleBodegaSucursal;
			jTtoolBarDetalleAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jTtoolBarDetalleBodegaSucursal;
		}
		
		final JMenuBar jmenuBarDetalleBodegaSucursal=jmenuBarDetalleAuxiliarBodegaSucursal;
		final JToolBar jTtoolBarDetalleBodegaSucursal=jTtoolBarDetalleAuxiliarBodegaSucursal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBodegaSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBodegaSucursal;
			processRunnable.jTableDatos=jTableDatosBodegaSucursal;
			processRunnable.jPanelCampos=jPanelCamposBodegaSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionBodegaSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesBodegaSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBodegaSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarBodegaSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBodegaSucursal;
			processRunnable.jTtoolBar=jTtoolBarBodegaSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBodegaSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBodegaSucursal ,jPanelParametrosReportesBodegaSucursal,jTableDatosBodegaSucursal, /*jScrollPanelDatosBodegaSucursal,*/jPanelCamposBodegaSucursal,jPanelPaginacionBodegaSucursal, /*jScrollPanelDatosEdicionBodegaSucursal,*/ jPanelAccionesBodegaSucursal,jPanelAccionesFormularioBodegaSucursal,jmenuBarBodegaSucursal,jmenuBarDetalleBodegaSucursal,jTtoolBarBodegaSucursal,jTtoolBarDetalleBodegaSucursal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBodegaSucursal ,jPanelParametrosReportesBodegaSucursal, jScrollPanelDatosBodegaSucursal,jPanelPaginacionBodegaSucursal, jScrollPanelDatosEdicionBodegaSucursal, jPanelAccionesBodegaSucursal,jPanelAccionesFormularioBodegaSucursal,jmenuBarBodegaSucursal,jmenuBarDetalleBodegaSucursal,jTtoolBarBodegaSucursal,jTtoolBarDetalleBodegaSucursal);
						
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
	
	public void finishProcessBodegaSucursal() {// throws Exception 
		this.finishProcessBodegaSucursal(true);
	}
	
	public void finishProcessBodegaSucursal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBodegaSucursal ,this.jPanelParametrosReportesBodegaSucursal, this.jScrollPanelDatosBodegaSucursal,this.jPanelPaginacionBodegaSucursal, this.jScrollPanelDatosEdicionBodegaSucursal, this.jPanelAccionesBodegaSucursal,this.jPanelAccionesFormularioBodegaSucursal,this.jmenuBarBodegaSucursal,this.jmenuBarDetalleBodegaSucursal,this.jTtoolBarBodegaSucursal,this.jTtoolBarDetalleBodegaSucursal);		
		
		final JTabbedPane jTabbedPaneBusquedasBodegaSucursal=this.jTabbedPaneBusquedasBodegaSucursal; 
		
		final JPanel jPanelParametrosReportesBodegaSucursal=this.jPanelParametrosReportesBodegaSucursal;
		//final JScrollPane jScrollPanelDatosBodegaSucursal=this.jScrollPanelDatosBodegaSucursal;
		final JTable jTableDatosBodegaSucursal=this.jTableDatosBodegaSucursal;		
		final JPanel jPanelPaginacionBodegaSucursal=this.jPanelPaginacionBodegaSucursal;
		//final JScrollPane jScrollPanelDatosEdicionBodegaSucursal=this.jScrollPanelDatosEdicionBodegaSucursal;
		final JPanel jPanelAccionesBodegaSucursal=this.jPanelAccionesBodegaSucursal;
		
		JPanel jPanelCamposAuxiliarBodegaSucursal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBodegaSucursal=new JPanel();
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			jPanelCamposAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jPanelCamposBodegaSucursal;
			jPanelAccionesFormularioAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jPanelAccionesFormularioBodegaSucursal;
		}
		
		final JPanel jPanelCamposBodegaSucursal=jPanelCamposAuxiliarBodegaSucursal;
		final JPanel jPanelAccionesFormularioBodegaSucursal=jPanelAccionesFormularioAuxiliarBodegaSucursal;
		
		
		final JMenuBar jmenuBarBodegaSucursal=this.jmenuBarBodegaSucursal;		
		final JToolBar jTtoolBarBodegaSucursal=this.jTtoolBarBodegaSucursal;
				
		JMenuBar jmenuBarDetalleAuxiliarBodegaSucursal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBodegaSucursal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			jmenuBarDetalleAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jmenuBarDetalleBodegaSucursal;
			jTtoolBarDetalleAuxiliarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jTtoolBarDetalleBodegaSucursal;		
		}
		
		final JMenuBar jmenuBarDetalleBodegaSucursal=jmenuBarDetalleAuxiliarBodegaSucursal;
		final JToolBar jTtoolBarDetalleBodegaSucursal=jTtoolBarDetalleAuxiliarBodegaSucursal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBodegaSucursal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBodegaSucursal;
			processRunnable.jTableDatos=jTableDatosBodegaSucursal;
			processRunnable.jPanelCampos=jPanelCamposBodegaSucursal;
			processRunnable.jPanelPaginacion=jPanelPaginacionBodegaSucursal;
			processRunnable.jPanelAcciones=jPanelAccionesBodegaSucursal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBodegaSucursal;
			
			
			processRunnable.jmenuBar=jmenuBarBodegaSucursal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBodegaSucursal;
			processRunnable.jTtoolBar=jTtoolBarBodegaSucursal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBodegaSucursal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBodegaSucursal ,jPanelParametrosReportesBodegaSucursal, jTableDatosBodegaSucursal,/*jScrollPanelDatosBodegaSucursal,*/jPanelCamposBodegaSucursal,jPanelPaginacionBodegaSucursal, /*jScrollPanelDatosEdicionBodegaSucursal,*/ jPanelAccionesBodegaSucursal,jPanelAccionesFormularioBodegaSucursal,jmenuBarBodegaSucursal,jmenuBarDetalleBodegaSucursal,jTtoolBarBodegaSucursal,jTtoolBarDetalleBodegaSucursal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBodegaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBodegaSucursal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBodegaSucursal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBodegaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBodegaSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBodegaSucursal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBodegaSucursal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBodegaSucursal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBodegaSucursal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bodegasucursalConstantesFunciones.getsFinalQueryBodegaSucursal();
		String  finalQueryPaginacionTodos=this.bodegasucursalConstantesFunciones.getsFinalQueryBodegaSucursal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BodegaSucursalConstantesFunciones.getArrayColumnasGlobalesNoBodegaSucursal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BodegaSucursalConstantesFunciones.getArrayColumnasGlobalesBodegaSucursal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BodegaSucursalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bodegasucursalsEliminados= new ArrayList<BodegaSucursal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBodegaSucursal();
		
				///*BodegaSucursalSessionBean*/this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
			
			if(this.bodegasucursalSessionBean==null) {
				this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
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
					this.iNumeroPaginacion=BodegaSucursalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BodegaSucursalConstantesFunciones.getClassesForeignKeysOfBodegaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bodegasucursal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bodegasucursalsAux= new ArrayList<BodegaSucursal>();
			
				
			bodegasucursalLogic.setDatosCliente(this.datosCliente);
			bodegasucursalLogic.setDatosDeep(this.datosDeep);
			bodegasucursalLogic.setIsConDeep(true);
			
			
			bodegasucursalLogic.getBodegaSucursalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bodegasucursalLogic.getTodosBodegaSucursals(finalQueryGlobal,pagination);
					
					//bodegasucursalLogic.getTodosBodegaSucursalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bodegasucursalLogic.getBodegaSucursals()==null|| bodegasucursalLogic.getBodegaSucursals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bodegasucursalsAux= new ArrayList<BodegaSucursal>();
							bodegasucursalsAux.addAll(bodegasucursalLogic.getBodegaSucursals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursalsAux= new ArrayList<BodegaSucursal>();
							bodegasucursalsAux.addAll(bodegasucursals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bodegasucursalLogic.getTodosBodegaSucursals(finalQueryGlobal+"",this.pagination);												
							
							//bodegasucursalLogic.getTodosBodegaSucursalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBodegaSucursals("Todos",bodegasucursalLogic.getBodegaSucursals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bodegasucursalLogic.setBodegaSucursals(new ArrayList<BodegaSucursal>());					
							bodegasucursalLogic.getBodegaSucursals().addAll(bodegasucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursals=new ArrayList<BodegaSucursal>();
							bodegasucursals.addAll(bodegasucursalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBodegaSucursal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBodegaSucursal=this.idActual;
				
				} else if(this.idBodegaSucursalActual!=null && this.idBodegaSucursalActual!=0L) {
					idBodegaSucursal=idBodegaSucursalActual;
				}
				
					
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndicePorId(idBodegaSucursal);
				
				this.bodegasucursals=new ArrayList<BodegaSucursal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bodegasucursalLogic.getEntity(idBodegaSucursal);
					
					//bodegasucursalLogic.getEntityWithConnection(idBodegaSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLogic.setBodegaSucursals(new ArrayList<BodegaSucursal>());
					bodegasucursalLogic.getBodegaSucursals().add(bodegasucursalLogic.getBodegaSucursal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bodegasucursals=new ArrayList<BodegaSucursal>();
					this.bodegasucursals.add(bodegasucursal);
				}
				
				if(bodegasucursalLogic.getBodegaSucursal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bodegasucursalLogic.getBodegaSucursalsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bodegasucursalLogic.getBodegaSucursals()==null||bodegasucursalLogic.getBodegaSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bodegasucursals==null|| bodegasucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalsAux=new ArrayList<BodegaSucursal>();
						bodegasucursalsAux.addAll(bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursalsAux=new ArrayList<BodegaSucursal>();
							bodegasucursalsAux.addAll(bodegasucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bodegasucursalLogic.getBodegaSucursalsFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBodegaSucursals("FK_IdBodega",bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBodegaSucursals("FK_IdBodega",bodegasucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.setBodegaSucursals(new ArrayList<BodegaSucursal>());
						bodegasucursalLogic.getBodegaSucursals().addAll(bodegasucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursals=new ArrayList<BodegaSucursal>();
							bodegasucursals.addAll(bodegasucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bodegasucursalLogic.getBodegaSucursalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bodegasucursalLogic.getBodegaSucursals()==null||bodegasucursalLogic.getBodegaSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bodegasucursals==null|| bodegasucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalsAux=new ArrayList<BodegaSucursal>();
						bodegasucursalsAux.addAll(bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursalsAux=new ArrayList<BodegaSucursal>();
							bodegasucursalsAux.addAll(bodegasucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bodegasucursalLogic.getBodegaSucursalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBodegaSucursals("FK_IdEmpresa",bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBodegaSucursals("FK_IdEmpresa",bodegasucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.setBodegaSucursals(new ArrayList<BodegaSucursal>());
						bodegasucursalLogic.getBodegaSucursals().addAll(bodegasucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursals=new ArrayList<BodegaSucursal>();
							bodegasucursals.addAll(bodegasucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bodegasucursalLogic.getBodegaSucursalsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bodegasucursalLogic.getBodegaSucursals()==null||bodegasucursalLogic.getBodegaSucursals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bodegasucursals==null|| bodegasucursals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalsAux=new ArrayList<BodegaSucursal>();
						bodegasucursalsAux.addAll(bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursalsAux=new ArrayList<BodegaSucursal>();
							bodegasucursalsAux.addAll(bodegasucursals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bodegasucursalLogic.getBodegaSucursalsFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BodegaSucursalConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBodegaSucursals("FK_IdSucursal",bodegasucursalLogic.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBodegaSucursals("FK_IdSucursal",bodegasucursals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalLogic.setBodegaSucursals(new ArrayList<BodegaSucursal>());
						bodegasucursalLogic.getBodegaSucursals().addAll(bodegasucursalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursals=new ArrayList<BodegaSucursal>();
							bodegasucursals.addAll(bodegasucursalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBodegaSucursal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBodegaSucursal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bodegasucursalLogic.getBodegaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bodegasucursals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bodegasucursalLogic.getBodegaSucursals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bodegasucursals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BodegaSucursal bodegasucursal) {
		Boolean permite=true;
		
		if(this.bodegasucursal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BodegaSucursalConstantesFunciones.getOrderByListaBodegaSucursal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BodegaSucursalConstantesFunciones.getOrderByListaBodegaSucursal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BodegaSucursal bodegasucursal:bodegasucursalLogic.getBodegaSucursals()) {
				if(bodegasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					bodegasucursalTotales=bodegasucursal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BodegaSucursal bodegasucursal:this.bodegasucursals) {
				if(bodegasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					bodegasucursalTotales=bodegasucursal;
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
			this.bodegasucursalAux=new BodegaSucursal();
			this.bodegasucursalAux.setsType(Constantes2.S_TOTALES);
			this.bodegasucursalAux.setIsNew(false);
			this.bodegasucursalAux.setIsChanged(false);
			this.bodegasucursalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BodegaSucursalConstantesFunciones.TotalizarValoresFilaBodegaSucursal(this.bodegasucursalLogic.getBodegaSucursals(),this.bodegasucursalAux);
				
				this.bodegasucursalLogic.getBodegaSucursals().add(this.bodegasucursalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BodegaSucursalConstantesFunciones.TotalizarValoresFilaBodegaSucursal(this.bodegasucursals,this.bodegasucursalAux);
				
				this.bodegasucursals.add(this.bodegasucursalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bodegasucursalTotales=new BodegaSucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bodegasucursalLogic.getBodegaSucursals().remove(bodegasucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bodegasucursals.remove(bodegasucursalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bodegasucursalTotales=new BodegaSucursal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BodegaSucursal bodegasucursal:bodegasucursalLogic.getBodegaSucursals()) {
				if(bodegasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					bodegasucursalTotales=bodegasucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BodegaSucursalConstantesFunciones.TotalizarValoresFilaBodegaSucursal(this.bodegasucursalLogic.getBodegaSucursals(),bodegasucursalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BodegaSucursal bodegasucursal:this.bodegasucursals) {
				if(bodegasucursal.getsType().equals(Constantes2.S_TOTALES)) {
					bodegasucursalTotales=bodegasucursal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BodegaSucursalConstantesFunciones.TotalizarValoresFilaBodegaSucursal(this.bodegasucursals,bodegasucursalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBodegaSucursalsFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBodegaSucursalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBodegaSucursalsFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBodegaSucursalPorIdEmpresaPorIdSucursalPorIdBodega()throws Exception {
		try {
			sAccionBusqueda="PorIdEmpresaPorIdSucursalPorIdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getBodegaSucursalsFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLogic.getBodegaSucursalsFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBodegaSucursalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLogic.getBodegaSucursalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBodegaSucursalsFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLogic.getBodegaSucursalsFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBodegaSucursalPorIdEmpresaPorIdSucursalPorIdBodega(Long id_empresa,Long id_sucursal,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLogic.getBodegaSucursalPorIdEmpresaPorIdSucursalPorIdBodega(id_empresa,id_sucursal,id_bodega);
				
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
	
	public void inicializarPermisosBodegaSucursal() {
		this.isPermisoTodoBodegaSucursal=false;
		this.isPermisoNuevoBodegaSucursal=false;
		this.isPermisoActualizarBodegaSucursal=false;
		this.isPermisoActualizarOriginalBodegaSucursal=false;
		this.isPermisoEliminarBodegaSucursal=false;
		this.isPermisoGuardarCambiosBodegaSucursal=false;
		this.isPermisoConsultaBodegaSucursal=false;
		this.isPermisoBusquedaBodegaSucursal=false;
		this.isPermisoReporteBodegaSucursal=false;		
		this.isPermisoOrdenBodegaSucursal=false;		
		this.isPermisoPaginacionMedioBodegaSucursal=false;		
		this.isPermisoPaginacionAltoBodegaSucursal=false;
		this.isPermisoPaginacionTodoBodegaSucursal=false;
		this.isPermisoCopiarBodegaSucursal=false;		
		this.isPermisoVerFormBodegaSucursal=false;		
		this.isPermisoDuplicarBodegaSucursal=false;		
		this.isPermisoOrdenBodegaSucursal=false;		
	}
	
	public void setPermisosUsuarioBodegaSucursal(Boolean isPermiso) {
		this.isPermisoTodoBodegaSucursal=isPermiso;
		this.isPermisoNuevoBodegaSucursal=isPermiso;
		this.isPermisoActualizarBodegaSucursal=isPermiso;
		this.isPermisoActualizarOriginalBodegaSucursal=isPermiso;
		this.isPermisoEliminarBodegaSucursal=isPermiso;
		this.isPermisoGuardarCambiosBodegaSucursal=isPermiso;
		this.isPermisoConsultaBodegaSucursal=isPermiso;
		this.isPermisoBusquedaBodegaSucursal=isPermiso;
		this.isPermisoReporteBodegaSucursal=isPermiso;
		this.isPermisoOrdenBodegaSucursal=isPermiso;		
		this.isPermisoPaginacionMedioBodegaSucursal=isPermiso;		
		this.isPermisoPaginacionAltoBodegaSucursal=isPermiso;		
		this.isPermisoPaginacionTodoBodegaSucursal=isPermiso;		
		this.isPermisoCopiarBodegaSucursal=isPermiso;		
		this.isPermisoVerFormBodegaSucursal=isPermiso;		
		this.isPermisoDuplicarBodegaSucursal=isPermiso;
		this.isPermisoOrdenBodegaSucursal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBodegaSucursal(Boolean isPermiso) {
		//this.isPermisoTodoBodegaSucursal=isPermiso;
		this.isPermisoNuevoBodegaSucursal=isPermiso;
		this.isPermisoActualizarBodegaSucursal=isPermiso;
		this.isPermisoActualizarOriginalBodegaSucursal=isPermiso;
		this.isPermisoEliminarBodegaSucursal=isPermiso;
		this.isPermisoGuardarCambiosBodegaSucursal=isPermiso;
		//this.isPermisoConsultaBodegaSucursal=isPermiso;
		//this.isPermisoBusquedaBodegaSucursal=isPermiso;
		//this.isPermisoReporteBodegaSucursal=isPermiso;
		//this.isPermisoOrdenBodegaSucursal=isPermiso;		
		//this.isPermisoPaginacionMedioBodegaSucursal=isPermiso;		
		//this.isPermisoPaginacionAltoBodegaSucursal=isPermiso;		
		//this.isPermisoPaginacionTodoBodegaSucursal=isPermiso;		
		//this.isPermisoCopiarBodegaSucursal=isPermiso;		
		//this.isPermisoDuplicarBodegaSucursal=isPermiso;
		//this.isPermisoOrdenBodegaSucursal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBodegaSucursalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BodegaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBodegaSucursal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBodegaSucursalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBodegaSucursalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBodegaSucursalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBodegaSucursalClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBodegaSucursal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BodegaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BodegaSucursalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBodegaSucursal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBodegaSucursal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBodegaSucursal=this.isPermisoActualizarBodegaSucursal;
			this.isPermisoEliminarBodegaSucursal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBodegaSucursal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBodegaSucursal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBodegaSucursal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBodegaSucursal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBodegaSucursal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBodegaSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBodegaSucursal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBodegaSucursal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBodegaSucursal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBodegaSucursal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBodegaSucursal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBodegaSucursal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBodegaSucursal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBodegaSucursal.setToolTipText(this.jTableDatosBodegaSucursal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBodegaSucursal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBodegaSucursal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BodegaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BodegaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBodegaSucursal() throws Exception {
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
	public void inicializarCombosForeignKeyBodegaSucursalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBodegaSucursalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BodegaSucursalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBodegaSucursalListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyBodegaSucursalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BodegaSucursalParameterReturnGeneral bodegasucursalReturnGeneral=new BodegaSucursalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bodegasucursalConstantesFunciones.cargarid_empresaBodegaSucursal)
					 || (this.esRecargarFks && this.bodegasucursalConstantesFunciones.cargarid_empresaBodegaSucursal)) {

					if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bodegasucursalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.bodegasucursalConstantesFunciones.cargarid_sucursalBodegaSucursal)
					 || (this.esRecargarFks && this.bodegasucursalConstantesFunciones.cargarid_sucursalBodegaSucursal)) {

					if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+bodegasucursalSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.bodegasucursalConstantesFunciones.cargarid_bodegaBodegaSucursal)
					 || (this.esRecargarFks && this.bodegasucursalConstantesFunciones.cargarid_bodegaBodegaSucursal)) {

					if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+bodegasucursalSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bodegasucursalReturnGeneral=bodegasucursalLogic.cargarCombosLoteForeignKeyBodegaSucursal(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bodegasucursalReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=bodegasucursalReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=bodegasucursalReturnGeneral.getbodegasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBodegaSucursal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bodegasucursalSessionBean==null) {
				this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
			}

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.bodegasucursalSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
				Bodega bodega=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodega,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodega.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegasForeignKey,bodega,true)) {

					this.bodegasForeignKey.add(0,bodega);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyBodegaSucursal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBodegaSucursal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBodegaSucursal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBodegaSucursal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBodegaSucursal(BodegaSucursal bodegasucursal)throws Exception {	
		try {
			
			this.setActualSucursalForeignKey(bodegasucursal.getid_sucursal(),false,"Formulario");
			this.setActualBodegaForeignKey(bodegasucursal.getid_bodega(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBodegaSucursal(BodegaSucursal bodegasucursal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBodegaSucursal()throws Exception {	
		try {
			
			this.setActualSucursalForeignKey(this.bodegasucursalConstantesFunciones.getid_sucursal(),false,"Formulario");
			this.setActualBodegaForeignKey(this.bodegasucursalConstantesFunciones.getid_bodega(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBodegaSucursal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBodegaSucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBodegaSucursal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBodegaSucursal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBodegaSucursal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBodegaSucursal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBodegaSucursal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.getItemCount()>0) {
				this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public BodegaSucursalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BodegaSucursalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BodegaSucursalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bodegasucursalSessionBean=new BodegaSucursalSessionBean(); 
		this.bodegasucursalConstantesFunciones=new BodegaSucursalConstantesFunciones(); 
		this.bodegasucursalBean=new BodegaSucursal();//(this.bodegasucursalConstantesFunciones); 		
		this.bodegasucursalReturnGeneral=new BodegaSucursalParameterReturnGeneral(); 
		
		this.bodegasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bodegasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BodegaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BodegaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BodegaSucursalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBodegaSucursal(true);
			
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
			
			this.bodegasucursalConstantesFunciones=new BodegaSucursalConstantesFunciones(); 
			this.bodegasucursalBean=new BodegaSucursal();//this.bodegasucursalConstantesFunciones); 			
			this.bodegasucursalReturnGeneral=new BodegaSucursalParameterReturnGeneral(); 
		
			BodegaSucursalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bodega Sucursal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.bodegasucursal=new BodegaSucursal();
			this.bodegasucursals = new ArrayList<BodegaSucursal>();
			this.bodegasucursalsAux = new ArrayList<BodegaSucursal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic=new BodegaSucursalLogic();
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.bodegasucursalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bodegasucursalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBodegaSucursal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBodegaSucursal);	
					}
					
					if(this.jInternalFrameImportacionBodegaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBodegaSucursal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBodegaSucursal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBodegaSucursal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBodegaSucursal);
				this.jInternalFrameDetalleFormBodegaSucursal.setVisible(false);
				this.jInternalFrameDetalleFormBodegaSucursal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBodegaSucursal);
					this.jInternalFrameReporteDinamicoBodegaSucursal.setVisible(false);
					this.jInternalFrameReporteDinamicoBodegaSucursal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBodegaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBodegaSucursal);
					this.jInternalFrameImportacionBodegaSucursal.setVisible(false);
					this.jInternalFrameImportacionBodegaSucursal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBodegaSucursal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBodegaSucursal);
					this.jInternalFrameOrderByBodegaSucursal.setVisible(false);
					this.jInternalFrameOrderByBodegaSucursal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBodegaSucursalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BodegaSucursalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bodegasucursalReturnGeneral=new BodegaSucursalParameterReturnGeneral();
			
			this.bodegasucursalParameterGeneral=new BodegaSucursalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bodegasucursalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BodegaSucursalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BodegaSucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bodegasucursalSessionBean.getEsGuardarRelacionado(),this.bodegasucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BodegaSucursalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bodegasucursalSessionBean.getEsGuardarRelacionado(),this.bodegasucursalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaDuplicarBodegaSucursal=true;
			this.isVisibilidadCeldaCopiarBodegaSucursal=true;
			this.isVisibilidadCeldaVerFormBodegaSucursal=true;
			this.isVisibilidadCeldaOrdenBodegaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBodegaSucursal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBodegaSucursal(false);
			
			this.setPermisosUsuarioBodegaSucursal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado() 
				|| (this.bodegasucursalSessionBean.getEsGuardarRelacionado() && this.bodegasucursalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBodegaSucursalClasesRelacionadas();
			}
			
			if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBodegaSucursalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBodegaSucursal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBodegaSucursal();
			}
			
			if(!this.isPermisoBusquedaBodegaSucursal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBodegaSucursal,this.isPermisoPaginacionMedioBodegaSucursal,this.isPermisoPaginacionTodoBodegaSucursal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BodegaSucursalConstantesFunciones.getTiposSeleccionarBodegaSucursal());
				
				this.tiposColumnasSelect=BodegaSucursalConstantesFunciones.getTiposSeleccionarBodegaSucursal(true);
				
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
			//if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBodegaSucursal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioBodegaSucursal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioBodegaSucursal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBodegaSucursal() ;
			
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
			this.bodegaLogic=new BodegaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				bodegasucursalImplementable= (BodegaSucursalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BodegaSucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bodegasucursalImplementableHome= (BodegaSucursalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BodegaSucursalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bodegasucursals= new ArrayList<BodegaSucursal>();
			this.bodegasucursalsEliminados= new ArrayList<BodegaSucursal>();
						
			this.isEsNuevoBodegaSucursal=false;
			this.esParaAccionDesdeFormularioBodegaSucursal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBodegaSucursal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBodegaSucursal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BodegaSucursalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BodegaSucursalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBodegaSucursal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBodegaSucursal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBodegaSucursal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBodegaSucursal();
			}
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBodegaSucursal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBodegaSucursal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBodegaSucursal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBodegaSucursal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BodegaSucursal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBodegaSucursal() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBodegaSucursal")) {
				iIndex=this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBodegaSucursal();	
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
	
	public void cargarCombosForeignKeyBodegaSucursal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBodegaSucursal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBodegaSucursal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBodegaSucursalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBodegaSucursal();
		
		this.cargarCombosFrameForeignKeyBodegaSucursal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBodegaSucursal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBodegaSucursal();
		}
	}
	
	

	public void cargarCombosForeignKeySucursal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaSucursal(this.sucursalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyBodega(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodega(this.bodegasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoBodegaSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			
			if(jTableDatosBodegaSucursal.getRowCount()>=1) {
				jTableDatosBodegaSucursal.removeRowSelectionInterval(0, jTableDatosBodegaSucursal.getRowCount()-1);						
			}
			
			this.isEsNuevoBodegaSucursal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBodegaSucursal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBodegaSucursal(true);			
			//this.bodegasucursal=new BodegaSucursal();
			//this.bodegasucursal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBodegaSucursal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBodegaSucursal() ;
			
			if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBodegaSucursal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bodegasucursal);	
			this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);				
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BodegaSucursal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBodegaSucursalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBodegaSucursal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBodegaSucursal.getSelectedRows().length;			
			}
			
			bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBodegaSucursal--;			
				//BodegaSucursal bodegasucursalAux= new BodegaSucursal();			
				//bodegasucursalAux.setId(this.iIdNuevoBodegaSucursal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BodegaSucursal bodegasucursalOrigen=new BodegaSucursal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BodegaSucursal bodegasucursalOrigen : bodegasucursalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bodegasucursalOrigen =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bodegasucursalOrigen =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBodegaSucursal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bodegasucursal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBodegaSucursal(bodegasucursalOrigen,this.bodegasucursal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bodegasucursalLogic.getBodegaSucursals().add(this.bodegasucursalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bodegasucursals.add(this.bodegasucursalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
				
				this.jTableDatosBodegaSucursal.setRowSelectionInterval(this.getIndiceNuevoBodegaSucursal(), this.getIndiceNuevoBodegaSucursal());
				
				int iLastRow =  this.jTableDatosBodegaSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBodegaSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBodegaSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBodegaSucursal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();									
		
			BodegaSucursal bodegasucursalOrigen=new BodegaSucursal();
			BodegaSucursal bodegasucursalDestino=new BodegaSucursal();
				
			bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBodegaSucursal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bodegasucursalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBodegaSucursal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalOrigen =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bodegasucursalOrigen =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bodegasucursalDestino =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bodegasucursalDestino =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bodegasucursalOrigen =bodegasucursalsSeleccionados.get(0);
				bodegasucursalDestino =bodegasucursalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBodegaSucursal(bodegasucursalOrigen,bodegasucursalDestino,true,false);
				
				bodegasucursalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bodegasucursalDestino,bodegasucursalLogic.getBodegaSucursals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bodegasucursalDestino,bodegasucursals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
				
				//this.jTableDatosBodegaSucursal.setRowSelectionInterval(this.getIndiceNuevoBodegaSucursal(), this.getIndiceNuevoBodegaSucursal());
				
				int iLastRow =  this.jTableDatosBodegaSucursal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBodegaSucursal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBodegaSucursal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBodegaSucursal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBodegaSucursal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBodegaSucursal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBodegaSucursal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBodegaSucursal.setVisible(!isVisible);
			this.jPanelPaginacionBodegaSucursal.setVisible(!isVisible);
			this.jPanelAccionesBodegaSucursal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBodegaSucursal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBodegaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBodegaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBodegaSucursal();
			
			this.abrirFrameOrderByBodegaSucursal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBodegaSucursal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBodegaSucursal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBodegaSucursal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBodegaSucursal.isMaximum()) {
					this.jInternalFrameDetalleFormBodegaSucursal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBodegaSucursal.setSize(this.jInternalFrameDetalleFormBodegaSucursal.iWidthFormulario,this.jInternalFrameDetalleFormBodegaSucursal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBodegaSucursal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBodegaSucursal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBodegaSucursal.isMaximum()) {
						this.jInternalFrameDetalleFormBodegaSucursal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBodegaSucursal.jContentPaneDetalleBodegaSucursal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBodegaSucursal.jContentPaneDetalleBodegaSucursal.getWidth(),BodegaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBodegaSucursal.jContentPaneDetalleBodegaSucursal.getWidth(),BodegaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBodegaSucursal.jContentPaneDetalleBodegaSucursal.getWidth(),BodegaSucursalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBodegaSucursal.setVisible(true);
	        this.jInternalFrameDetalleFormBodegaSucursal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBodegaSucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBodegaSucursal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBodegaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaSucursal,false,this);
				} else {
					this.jInternalFrameOrderByBodegaSucursal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBodegaSucursal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBodegaSucursal);
				this.jInternalFrameOrderByBodegaSucursal.setVisible(false);
				this.jInternalFrameOrderByBodegaSucursal.setSelected(false);
				
				this.jInternalFrameOrderByBodegaSucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBodegaSucursal"));
				
				this.inicializarActualizarBindingTablaOrderByBodegaSucursal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBodegaSucursal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBodegaSucursal==null) {
				
				this.jInternalFrameImportacionBodegaSucursal=new ImportacionJInternalFrame(BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBodegaSucursal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBodegaSucursal);
				this.jInternalFrameImportacionBodegaSucursal.setVisible(false);
				this.jInternalFrameImportacionBodegaSucursal.setSelected(false);


				this.jInternalFrameImportacionBodegaSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBodegaSucursal"));
				this.jInternalFrameImportacionBodegaSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBodegaSucursal"));
				this.jInternalFrameImportacionBodegaSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBodegaSucursal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBodegaSucursal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBodegaSucursal==null) {
				this.jInternalFrameReporteDinamicoBodegaSucursal=new ReporteDinamicoJInternalFrame(BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBodegaSucursal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBodegaSucursal);
				this.jInternalFrameReporteDinamicoBodegaSucursal.setVisible(false);
				this.jInternalFrameReporteDinamicoBodegaSucursal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBodegaSucursal"));
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBodegaSucursal"));
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBodegaSucursal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBodegaSucursal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBodegaSucursal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBodegaSucursal);
			
	       	this.jInternalFrameDetalleFormBodegaSucursal.setVisible(false);
	        this.jInternalFrameDetalleFormBodegaSucursal.setSelected(false);
			
			//this.jInternalFrameDetalleFormBodegaSucursal.dispose();
			//this.jInternalFrameDetalleFormBodegaSucursal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBodegaSucursal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBodegaSucursal.setVisible(true);
	        this.jInternalFrameReporteDinamicoBodegaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBodegaSucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBodegaSucursal.setVisible(true);
	        this.jInternalFrameImportacionBodegaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBodegaSucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBodegaSucursal.setVisible(true);
	        this.jInternalFrameOrderByBodegaSucursal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBodegaSucursal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBodegaSucursal.setVisible(false);
	        this.jInternalFrameOrderByBodegaSucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBodegaSucursal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBodegaSucursal.setVisible(false);
	        this.jInternalFrameReporteDinamicoBodegaSucursal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBodegaSucursal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBodegaSucursal.setVisible(false);
	        this.jInternalFrameImportacionBodegaSucursal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBodegaSucursal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBodegaSucursal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBodegaSucursal(true);
			//this.isEsNuevoBodegaSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBodegaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBodegaSucursal(false) ;
			
			if(bodegasucursalSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBodegaSucursal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBodegaSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBodegaSucursalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBodegaSucursal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBodegaSucursal(true);
			//this.isEsNuevoBodegaSucursal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bodegasucursal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBodegaSucursal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBodegaSucursal(false) ;
			
			if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBodegaSucursal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBodegaSucursal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaSucursal(List<Sucursal> sucursalsForeignKey)throws Exception{
		TableColumn tableColumnSucursal=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL));
		TableCellEditor tableCellEditorSucursal =tableColumnSucursal.getCellEditor();

		SucursalTableCell sucursalTableCellFk=(SucursalTableCell)tableCellEditorSucursal;

		if(sucursalTableCellFk!=null) {
			sucursalTableCellFk.setsucursalsForeignKey(sucursalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBodegaSucursal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//sucursalTableCellFk.setRowActual(intSelectedRow);
			//sucursalTableCellFk.setsucursalsForeignKeyActual(sucursalsForeignKey);
		//}


		if(sucursalTableCellFk!=null) {
			sucursalTableCellFk.RecargarSucursalsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosBodegaSucursal.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBodegaSucursal(false);
			
			//if(!this.isEsNuevoBodegaSucursal) {								
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				
			}
			
			if(this.permiteMantenimiento(this.bodegasucursal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBodegaSucursal=true;
					this.inicializarActualizarBindingTablaBodegaSucursal(false);
					this.isEsNuevoBodegaSucursal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBodegaSucursal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBodegaSucursal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBodegaSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBodegaSucursal(false);
				
				this.habilitarDeshabilitarControlesBodegaSucursal(false);
			
												
				
				if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBodegaSucursal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBodegaSucursalActionPerformed(evt,bodegasucursalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBodegaSucursal(this.bodegasucursal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBodegaSucursal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bodegasucursalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bodegasucursal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				this.bodegasucursal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				this.bodegasucursal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bodegasucursal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BodegaSucursalModel) this.jTableDatosBodegaSucursal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBodegaSucursal=true;
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
				this.isEsNuevoBodegaSucursal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBodegaSucursal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBodegaSucursal(false);
				
				this.habilitarDeshabilitarControlesBodegaSucursal(false);
				
				
				
				if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBodegaSucursal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBodegaSucursal.getRowCount()>=1) {
				jTableDatosBodegaSucursal.removeRowSelectionInterval(0, jTableDatosBodegaSucursal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBodegaSucursal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBodegaSucursal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBodegaSucursal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBodegaSucursal(false) ;
			
			this.isEsNuevoBodegaSucursal=false;
			
			if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBodegaSucursal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBodegaSucursal(false);
				
				//SI ES MANUAL
				if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBodegaSucursal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBodegaSucursal--;			
			//BodegaSucursal bodegasucursalAux= new BodegaSucursal();			
			//bodegasucursalAux.setId(this.iIdNuevoBodegaSucursal);
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBodegaSucursal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
			
			this.bodegasucursal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bodegasucursalLogic.getBodegaSucursals().add(this.bodegasucursalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bodegasucursals.add(this.bodegasucursalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBodegaSucursal(false);
			
			this.jTableDatosBodegaSucursal.setRowSelectionInterval(this.getIndiceNuevoBodegaSucursal(), this.getIndiceNuevoBodegaSucursal());
			
			int iLastRow =  this.jTableDatosBodegaSucursal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBodegaSucursal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBodegaSucursal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBodegaSucursal(false);
			
			//SI ES MANUAL
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBodegaSucursal();
			}
			
			//this.abrirFrameTreeBodegaSucursal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Bodega SucursalES ?", "MANTENIMIENTO DE Bodega Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBodegaSucursal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBodegaSucursal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bodegasucursalReturnGeneral=bodegasucursalLogic.procesarImportacionBodegaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bodegasucursalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBodegaSucursalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBodegaSucursal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBodegaSucursal.setFileImportacion(this.jInternalFrameImportacionBodegaSucursal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBodegaSucursal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBodegaSucursal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBodegaSucursal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBodegaSucursal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		

		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BodegaSucursalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BodegaSucursalBaseDesign.jrxml";
			
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
			
			this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BodegaSucursalConstantesFunciones.LABEL_SECUENCIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BodegaSucursalConstantesFunciones.LABEL_TAMANIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_manio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_manio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_manio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_manio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoBodegaSucursal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_SECUENCIA:
					sNombreCampoCategoria="secuencia";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_TAMANIO:
					sNombreCampoCategoria="tamanio";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_SECUENCIA:
					sNombreCampoCategoriaValor="secuencia";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_TAMANIO:
					sNombreCampoCategoriaValor="tamanio";
					break;

				case BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case BodegaSucursalConstantesFunciones.LABEL_SECUENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencia");
					break;

				case BodegaSucursalConstantesFunciones.LABEL_TAMANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tamanio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tamanio");
					break;

				case BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BodegaSucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BodegaSucursalConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BodegaSucursalConstantesFunciones.LABEL_SECUENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.getsecuencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BodegaSucursalConstantesFunciones.LABEL_TAMANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_TAMANIO);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.gettamanio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(BodegaSucursal bodegasucursal:bodegasucursalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bodegasucursal.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelBodegaSucursal(row);				
			//	iRow++;
			//}				
			
			//for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBodegaSucursal(bodegasucursalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
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
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBodegaSucursal(false);
			
			//SI ES MANUAL
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBodegaSucursal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBodegaSucursal(false);
			
			//SI ES MANUAL
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBodegaSucursal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBodegaSucursal(false);
			
			//SI ES MANUAL
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBodegaSucursal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBodegaSucursal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBodegaSucursal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBodegaSucursal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBodegaSucursal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBodegaSucursal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBodegaSucursal.setMinimumSize(dimensionMinimum);
		this.jTableDatosBodegaSucursal.setMaximumSize(dimensionMaximum);
		this.jTableDatosBodegaSucursal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBodegaSucursal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBodegaSucursal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBodegaSucursal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBodegaSucursal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBodegaSucursal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBodegaSucursal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBodegaSucursal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBodegaSucursal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBodegaSucursal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBodegaSucursal();
		
		this.inicializarActualizarBindingBotonesManualBodegaSucursal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBodegaSucursal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBodegaSucursal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBodegaSucursal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBodegaSucursal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBodegaSucursal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBodegaSucursal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBodegaSucursal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionNuevoBodegaSucursal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionSinCerrarBodegaSucursal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionSinMensajeBodegaSucursal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBodegaSucursal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBodegaSucursal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBodegaSucursal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
				this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionNuevoBodegaSucursal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionSinCerrarBodegaSucursal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBodegaSucursal.jCheckBoxPostAccionSinMensajeBodegaSucursal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBodegaSucursal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBodegaSucursal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBodegaSucursal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBodegaSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBodegaSucursal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBodegaSucursal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBodegaSucursal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBodegaSucursal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBodegaSucursal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBodegaSucursal(Boolean esInicializar) throws Exception {
		try	{	
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBodegaSucursal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBodegaSucursal() throws Exception {
		try	{
			if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBodegaSucursal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBodegaSucursal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBodegaSucursal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBodegaSucursal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBodegaSucursal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBodegaSucursal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBodegaSucursal.addItem(reporte);
			}
			
			
			if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBodegaSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBodegaSucursal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBodegaSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBodegaSucursal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBodegaSucursal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBodegaSucursal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBodegaSucursal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBodegaSucursal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBodegaSucursal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
				
				if(this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBodegaSucursal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBodegaSucursal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBodegaSucursal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaBodegaSucursal.getSelectedItem()).getId();}
		if(this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.getSelectedItem()!=null){this.id_sucursalFK_IdSucursal=((Sucursal)this.jComboBoxid_sucursalFK_IdSucursalBodegaSucursal.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBodegaSucursal(Boolean esInicializar) throws Exception {				
		if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBodegaSucursal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBodegaSucursal() throws Exception {
		this.inicializarActualizarBindingTablaBodegaSucursal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBodegaSucursal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBodegaSucursalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBodegaSucursal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bodegasucursalLogic.getBodegaSucursals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bodegasucursals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBodegaSucursal.setModel(new BodegaSucursalModel(this.bodegasucursalLogic.getBodegaSucursals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBodegaSucursal.setModel(new BodegaSucursalModel(this.bodegasucursals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBodegaSucursal!=null && this.jInternalFrameOrderByBodegaSucursal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBodegaSucursal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,bodegasucursalConstantesFunciones.resaltarSeleccionarBodegaSucursal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BodegaSucursalConstantesFunciones.SCLASSWEBTITULO,bodegasucursalConstantesFunciones.resaltarSeleccionarBodegaSucursal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_ID));

		if(this.bodegasucursalConstantesFunciones.mostraridBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bodegasucursalConstantesFunciones.resaltaridBodegaSucursal,this.bodegasucursalConstantesFunciones.activaridBodegaSucursal,this,true,"idBodegaSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bodegasucursalConstantesFunciones.resaltaridBodegaSucursal,this.bodegasucursalConstantesFunciones.activaridBodegaSucursal,this,true,"idBodegaSucursal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bodegasucursalConstantesFunciones.mostrarid_empresaBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_empresaBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_empresaBodegaSucursal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_empresaBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_empresaBodegaSucursal,false,"id_empresaBodegaSucursal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.bodegasucursalConstantesFunciones.mostrarid_sucursalBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_sucursalBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_sucursalBodegaSucursal));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_sucursalBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_sucursalBodegaSucursal,true,"id_sucursalBodegaSucursal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_IDBODEGA));

		if(this.bodegasucursalConstantesFunciones.mostrarid_bodegaBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_bodegaBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_bodegaBodegaSucursal));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.bodegasucursalConstantesFunciones.resaltarid_bodegaBodegaSucursal,this,this.bodegasucursalConstantesFunciones.activarid_bodegaBodegaSucursal,true,"id_bodegaBodegaSucursal","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_SECUENCIA));

		if(this.bodegasucursalConstantesFunciones.mostrarsecuenciaBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_SECUENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bodegasucursalConstantesFunciones.resaltarsecuenciaBodegaSucursal,this.bodegasucursalConstantesFunciones.activarsecuenciaBodegaSucursal,this,true,"secuenciaBodegaSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bodegasucursalConstantesFunciones.resaltarsecuenciaBodegaSucursal,this.bodegasucursalConstantesFunciones.activarsecuenciaBodegaSucursal,this,true,"secuenciaBodegaSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_TAMANIO));

		if(this.bodegasucursalConstantesFunciones.mostrartamanioBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_TAMANIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bodegasucursalConstantesFunciones.resaltartamanioBodegaSucursal,this.bodegasucursalConstantesFunciones.activartamanioBodegaSucursal,this,true,"tamanioBodegaSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bodegasucursalConstantesFunciones.resaltartamanioBodegaSucursal,this.bodegasucursalConstantesFunciones.activartamanioBodegaSucursal,this,true,"tamanioBodegaSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION));

		if(this.bodegasucursalConstantesFunciones.mostrardescripcionBodegaSucursal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bodegasucursalConstantesFunciones.resaltardescripcionBodegaSucursal,this.bodegasucursalConstantesFunciones.activardescripcionBodegaSucursal,this,true,"descripcionBodegaSucursal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bodegasucursalConstantesFunciones.resaltardescripcionBodegaSucursal,this.bodegasucursalConstantesFunciones.activardescripcionBodegaSucursal,this,true,"descripcionBodegaSucursal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BodegaSucursalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBodegaSucursal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBodegaSucursal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bodegasucursalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBodegaSucursal.addColumn(tableColumn);
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
			
			this.jTableDatosBodegaSucursal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBodegaSucursal.moveColumn(this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBodegaSucursal.moveColumn(this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBodegaSucursal.moveColumn(this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBodegaSucursal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBodegaSucursal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBodegaSucursal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBodegaSucursal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBodegaSucursal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBodegaSucursal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBodegaSucursal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBodegaSucursal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=bodegasucursalLogic.getBodegaSucursals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bodegasucursals.size()-1;
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
		//this.jTableDatosBodegaSucursal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBodegaSucursal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBodegaSucursal();
			
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
				
				//this.isEsNuevoBodegaSucursal=false;
					
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
				if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBodegaSucursal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBodegaSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBodegaSucursal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bodegasucursal.getsType().equals("DUPLICADO")
				   || this.bodegasucursal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBodegaSucursal=true;
				
				} else {
					this.isEsNuevoBodegaSucursal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					if(this.bodegasucursal.getId()>=0 && !this.bodegasucursal.getIsNew()) {						
						this.isEsNuevoBodegaSucursal=false;
						
					} else {
						this.isEsNuevoBodegaSucursal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBodegaSucursal(esRelaciones);						
				
				this.seleccionarBodegaSucursal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bodegasucursal.getId()<0) {
					this.isEsNuevoBodegaSucursal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBodegaSucursal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBodegaSucursal(evt,rowIndex);
				}	
				
				if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BodegaSucursal: " + this.dDif); 
					}
				}								
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBodegaSucursal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bodegasucursal)) {
					if(this.bodegasucursal.getId()>0) {
						this.bodegasucursal.setIsDeleted(true);
						
						this.bodegasucursalsEliminados.add(this.bodegasucursal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bodegasucursalLogic.getBodegaSucursals().remove(this.bodegasucursal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bodegasucursals.remove(this.bodegasucursal);				
					}
					
					
					((BodegaSucursalModel) this.jTableDatosBodegaSucursal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBodegaSucursal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBodegaSucursal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBodegaSucursal) {
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBodegaSucursal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBodegaSucursal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBodegaSucursal(this.bodegasucursal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bodegasucursalConstantesFunciones.cargarid_empresaBodegaSucursal || this.bodegasucursalConstantesFunciones.event_dependid_empresaBodegaSucursal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.bodegasucursal.getid_empresa());
									//this.inicializarActualizarBindingBodegaSucursal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(bodegasucursal.getEmpresa()!=null) {
							this.empresasForeignKey.add(bodegasucursal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.bodegasucursal.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.bodegasucursalConstantesFunciones.cargarid_sucursalBodegaSucursal || this.bodegasucursalConstantesFunciones.event_dependid_sucursalBodegaSucursal) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.bodegasucursal.getid_sucursal());
									//this.inicializarActualizarBindingBodegaSucursal(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(bodegasucursal.getSucursal()!=null) {
							this.sucursalsForeignKey.add(bodegasucursal.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.bodegasucursal.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.bodegasucursalConstantesFunciones.cargarid_bodegaBodegaSucursal || this.bodegasucursalConstantesFunciones.event_dependid_bodegaBodegaSucursal) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.bodegasucursal.getid_bodega());
									//this.inicializarActualizarBindingBodegaSucursal(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(bodegasucursal.getBodega()!=null) {
							this.bodegasForeignKey.add(bodegasucursal.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.bodegasucursal.getid_bodega(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBodegaSucursal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBodegaSucursal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBodegaSucursal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBodegaSucursal(BodegaSucursal bodegasucursal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBodegaSucursal(bodegasucursal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBodegaSucursal(BodegaSucursal bodegasucursal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBodegaSucursal(bodegasucursal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBodegaSucursal(bodegasucursal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBodegaSucursal(bodegasucursal);
	}
	
	public void setVariablesObjetoActualToFormularioBodegaSucursal(BodegaSucursal bodegasucursal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setText(bodegasucursal.getId().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setText(bodegasucursal.getsecuencia().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setText(bodegasucursal.gettamanio().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setText(bodegasucursal.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BodegaSucursal bodegasucursalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bodegasucursalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BodegaSucursal bodegasucursalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bodegasucursalLocal=this.bodegasucursal;
			} else {
				bodegasucursalLocal=this.bodegasucursalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bodegasucursalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBodegaSucursal(bodegasucursalLocal,true);
					
					if(bodegasucursalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bodegasucursalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bodegasucursalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBodegaSucursal(BodegaSucursal bodegasucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBodegaSucursal(bodegasucursal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(bodegasucursal);
	}
	
	public void setVariablesFormularioToObjetoActualBodegaSucursal(BodegaSucursal bodegasucursal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBodegaSucursal(bodegasucursal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBodegaSucursal(BodegaSucursal bodegasucursal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.getText()==null || this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.getText()=="" || this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.getText()=="Id") {
				this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setText("0");
			}

			if(conColumnasBase) {bodegasucursal.setId(Long.parseLong(this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BodegaSucursalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelIdBodegaSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bodegasucursal.setsecuencia(Integer.parseInt(this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BodegaSucursalConstantesFunciones.LABEL_SECUENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabelsecuenciaBodegaSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bodegasucursal.settamanio(Integer.parseInt(this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BodegaSucursalConstantesFunciones.LABEL_TAMANIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabeltamanioBodegaSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bodegasucursal.setdescripcion(this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBodegaSucursal.jLabeldescripcionBodegaSucursal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBodegaSucursal(BodegaSucursal bodegasucursalBean,BodegaSucursal bodegasucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && bodegasucursalBean.getid_sucursal()!=null && !bodegasucursalBean.getid_sucursal().equals(-1L))) {bodegasucursal.setid_sucursal(bodegasucursalBean.getid_sucursal());}
			if(conDefault || (!conDefault && bodegasucursalBean.getid_bodega()!=null && !bodegasucursalBean.getid_bodega().equals(-1L))) {bodegasucursal.setid_bodega(bodegasucursalBean.getid_bodega());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBodegaSucursal(BodegaSucursal bodegasucursalOrigen,BodegaSucursal bodegasucursal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bodegasucursalOrigen.getId()!=null && !bodegasucursalOrigen.getId().equals(0L))) {bodegasucursal.setId(bodegasucursalOrigen.getId());}}
			if(conDefault || (!conDefault && bodegasucursalOrigen.getid_sucursal()!=null && !bodegasucursalOrigen.getid_sucursal().equals(-1L))) {bodegasucursal.setid_sucursal(bodegasucursalOrigen.getid_sucursal());}
			if(conDefault || (!conDefault && bodegasucursalOrigen.getid_bodega()!=null && !bodegasucursalOrigen.getid_bodega().equals(-1L))) {bodegasucursal.setid_bodega(bodegasucursalOrigen.getid_bodega());}
			if(conDefault || (!conDefault && bodegasucursalOrigen.getsecuencia()!=null && !bodegasucursalOrigen.getsecuencia().equals(0))) {bodegasucursal.setsecuencia(bodegasucursalOrigen.getsecuencia());}
			if(conDefault || (!conDefault && bodegasucursalOrigen.gettamanio()!=null && !bodegasucursalOrigen.gettamanio().equals(0))) {bodegasucursal.settamanio(bodegasucursalOrigen.gettamanio());}
			if(conDefault || (!conDefault && bodegasucursalOrigen.getdescripcion()!=null && !bodegasucursalOrigen.getdescripcion().equals(""))) {bodegasucursal.setdescripcion(bodegasucursalOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBodegaSucursal(BodegaSucursal bodegasucursal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setText(bodegasucursal.getId().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setText(bodegasucursal.getsecuencia().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setText(bodegasucursal.gettamanio().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setText(bodegasucursal.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBodegaSucursal(BodegaSucursalBean bodegasucursalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setText(bodegasucursalBean.getId().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setText(bodegasucursalBean.getsecuencia().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setText(bodegasucursalBean.gettamanio().toString());
			this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setText(bodegasucursalBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBodegaSucursal(BodegaSucursalParameterReturnGeneral bodegasucursalReturnGeneral,BodegaSucursalBean bodegasucursalBean,Boolean conDefault) throws Exception { 
		try {
			BodegaSucursal bodegasucursalLocal=new BodegaSucursal();
			
			bodegasucursalLocal=bodegasucursalReturnGeneral.getBodegaSucursal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bodegasucursalLocal.getId()!=null && !bodegasucursalLocal.getId().equals(0L))) {bodegasucursalBean.setId(bodegasucursalLocal.getId());}}
			if(conDefault || (!conDefault && bodegasucursalLocal.getid_sucursal()!=null && !bodegasucursalLocal.getid_sucursal().equals(-1L))) {bodegasucursalBean.setid_sucursal(bodegasucursalLocal.getid_sucursal());}
			if(conDefault || (!conDefault && bodegasucursalLocal.getid_bodega()!=null && !bodegasucursalLocal.getid_bodega().equals(-1L))) {bodegasucursalBean.setid_bodega(bodegasucursalLocal.getid_bodega());}
			if(conDefault || (!conDefault && bodegasucursalLocal.getsecuencia()!=null && !bodegasucursalLocal.getsecuencia().equals(0))) {bodegasucursalBean.setsecuencia(bodegasucursalLocal.getsecuencia());}
			if(conDefault || (!conDefault && bodegasucursalLocal.gettamanio()!=null && !bodegasucursalLocal.gettamanio().equals(0))) {bodegasucursalBean.settamanio(bodegasucursalLocal.gettamanio());}
			if(conDefault || (!conDefault && bodegasucursalLocal.getdescripcion()!=null && !bodegasucursalLocal.getdescripcion().equals(""))) {bodegasucursalBean.setdescripcion(bodegasucursalLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBodegaSucursalGenerico(Long idBodegaSucursalSeleccionado,JComboBox jComboBoxBodegaSucursal,List<BodegaSucursal> bodegasucursalsLocal)throws Exception {
		try {
			BodegaSucursal  bodegasucursalTemp=null;

			for(BodegaSucursal bodegasucursalAux:bodegasucursalsLocal) {
				if(bodegasucursalAux.getId()!=null && bodegasucursalAux.getId().equals(idBodegaSucursalSeleccionado)) {
					bodegasucursalTemp=bodegasucursalAux;
					break;
				}
			}

			jComboBoxBodegaSucursal.setSelectedItem(bodegasucursalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBodegaSucursalGenerico(JComboBox jComboBoxBodegaSucursal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBodegaSucursal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBodegaSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBodegaSucursal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBodegaSucursal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBodegaSucursal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBodegaSucursal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bodegasucursal=(BodegaSucursal) bodegasucursalLogic.getBodegaSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bodegasucursal =(BodegaSucursal) bodegasucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bodegasucursal.getIsNew() && !bodegasucursal.getIsChanged() && !bodegasucursal.getIsDeleted()) {
				sDescripcion=bodegasucursal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bodegasucursal.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!bodegasucursal.getIsNew() && !bodegasucursal.getIsChanged() && !bodegasucursal.getIsDeleted()) {
				sDescripcion=bodegasucursal.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=bodegasucursal.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!bodegasucursal.getIsNew() && !bodegasucursal.getIsChanged() && !bodegasucursal.getIsDeleted()) {
				sDescripcion=bodegasucursal.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=bodegasucursal.getbodega_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BodegaSucursal bodegasucursalRow=new BodegaSucursal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bodegasucursalRow=(BodegaSucursal) bodegasucursalLogic.getBodegaSucursals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bodegasucursalRow=(BodegaSucursal) bodegasucursals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBodegaSucursal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal));			
			this.jButtonDuplicarBodegaSucursal.setVisible((this.isVisibilidadCeldaDuplicarBodegaSucursal && this.isPermisoDuplicarBodegaSucursal));			
			this.jButtonCopiarBodegaSucursal.setVisible((this.isVisibilidadCeldaCopiarBodegaSucursal && this.isPermisoCopiarBodegaSucursal));
			this.jButtonVerFormBodegaSucursal.setVisible((this.isVisibilidadCeldaVerFormBodegaSucursal && this.isPermisoVerFormBodegaSucursal));
			
			this.jButtonAbrirOrderByBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));			
			
			this.jButtonNuevoRelacionesBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal && this.isPermisoNuevoBodegaSucursal));			
			this.jButtonNuevoGuardarCambiosBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarBodegaSucursal.setVisible((this.isVisibilidadCeldaModificarBodegaSucursal && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.setVisible((this.isVisibilidadCeldaActualizarBodegaSucursal && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.setVisible((this.isVisibilidadCeldaEliminarBodegaSucursal && this.isPermisoEliminarBodegaSucursal));
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.setVisible(this.isVisibilidadCeldaCancelarBodegaSucursal);							
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));			
			
			}
						
			this.jButtonGuardarCambiosTablaBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal));						
			this.jButtonDuplicarToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaDuplicarBodegaSucursal && this.isPermisoDuplicarBodegaSucursal));						
			this.jButtonCopiarToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaCopiarBodegaSucursal && this.isPermisoCopiarBodegaSucursal));			
			this.jButtonVerFormToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaVerFormBodegaSucursal && this.isPermisoVerFormBodegaSucursal));			
			this.jButtonAbrirOrderByToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));
			this.jButtonNuevoRelacionesToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal && this.isPermisoNuevoBodegaSucursal));			
			this.jButtonNuevoGuardarCambiosToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));			
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaModificarBodegaSucursal && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaActualizarBodegaSucursal  && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaEliminarBodegaSucursal && this.isPermisoEliminarBodegaSucursal));
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarToolBarBodegaSucursal.setVisible(this.isVisibilidadCeldaCancelarBodegaSucursal);				
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal));			
			this.jMenuItemDuplicarBodegaSucursal.setVisible((this.isVisibilidadCeldaDuplicarBodegaSucursal && this.isPermisoDuplicarBodegaSucursal));			
			this.jMenuItemCopiarBodegaSucursal.setVisible((this.isVisibilidadCeldaCopiarBodegaSucursal && this.isPermisoCopiarBodegaSucursal));			
			this.jMenuItemVerFormBodegaSucursal.setVisible((this.isVisibilidadCeldaVerFormBodegaSucursal && this.isPermisoVerFormBodegaSucursal));			
			this.jMenuItemAbrirOrderByBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));			
			//this.jMenuItemMostrarOcultarBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));
			this.jMenuItemDetalleAbrirOrderByBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));			
			//this.jMenuItemDetalleMostrarOcultarBodegaSucursal.setVisible((this.isVisibilidadCeldaOrdenBodegaSucursal && this.isPermisoOrdenBodegaSucursal));			
			this.jMenuItemNuevoRelacionesBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal && this.isPermisoNuevoBodegaSucursal));			
			this.jMenuItemNuevoGuardarCambiosBodegaSucursal.setVisible((this.isVisibilidadCeldaNuevoBodegaSucursal && this.isPermisoNuevoBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));									
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemModificarBodegaSucursal.setVisible((this.isVisibilidadCeldaModificarBodegaSucursal && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemActualizarBodegaSucursal.setVisible((this.isVisibilidadCeldaActualizarBodegaSucursal && this.isPermisoActualizarBodegaSucursal));	
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemEliminarBodegaSucursal.setVisible((this.isVisibilidadCeldaEliminarBodegaSucursal && this.isPermisoEliminarBodegaSucursal));
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemCancelarBodegaSucursal.setVisible(this.isVisibilidadCeldaCancelarBodegaSucursal);				
			}
			
			this.jMenuItemGuardarCambiosBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));						
			this.jMenuItemGuardarCambiosTablaBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarCambiosBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBodegaSucursal=this.jButtonNuevoBodegaSucursal.isVisible();
			this.isVisibilidadCeldaDuplicarBodegaSucursal=this.jButtonDuplicarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaCopiarBodegaSucursal=this.jButtonCopiarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaVerFormBodegaSucursal=this.jButtonVerFormBodegaSucursal.isVisible();
			
			this.isVisibilidadCeldaOrdenBodegaSucursal=this.jButtonAbrirOrderByBodegaSucursal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=this.jButtonNuevoRelacionesBodegaSucursal.isVisible();
			this.isVisibilidadCeldaModificarBodegaSucursal=this.jButtonModificarBodegaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.isVisibilidadCeldaActualizarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=this.jButtonGuardarCambiosTablaBodegaSucursal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBodegaSucursal=this.jButtonNuevoToolBarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=this.jButtonNuevoRelacionesToolBarBodegaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.isVisibilidadCeldaModificarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarToolBarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaActualizarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarToolBarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarToolBarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarToolBarBodegaSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBodegaSucursal=this.jButtonGuardarCambiosToolBarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=this.jButtonGuardarCambiosTablaToolBarBodegaSucursal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBodegaSucursal=this.jMenuItemNuevoBodegaSucursal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=this.jMenuItemNuevoRelacionesBodegaSucursal.isVisible();
			
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.isVisibilidadCeldaModificarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemModificarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaActualizarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemActualizarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaEliminarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemEliminarBodegaSucursal.isVisible();
			this.isVisibilidadCeldaCancelarBodegaSucursal=this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemCancelarBodegaSucursal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBodegaSucursal=this.jMenuItemGuardarCambiosBodegaSucursal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=this.jMenuItemGuardarCambiosTablaBodegaSucursal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBodegaSucursal(Boolean esInicializar) {
		if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
				//if(this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBodegaSucursal();
			}
			
			this.inicializarActualizarBindingBotonesManualBodegaSucursal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBodegaSucursal() {
		this.jButtonNuevoBodegaSucursal.setVisible(this.isPermisoNuevoBodegaSucursal);			
		this.jButtonDuplicarBodegaSucursal.setVisible(this.isPermisoDuplicarBodegaSucursal);			
		this.jButtonCopiarBodegaSucursal.setVisible(this.isPermisoCopiarBodegaSucursal);			
		this.jButtonVerFormBodegaSucursal.setVisible(this.isPermisoVerFormBodegaSucursal);			
		
		this.jButtonAbrirOrderByBodegaSucursal.setVisible(this.isPermisoOrdenBodegaSucursal);					
		
		this.jButtonNuevoRelacionesBodegaSucursal.setVisible(this.isPermisoNuevoBodegaSucursal);			
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarBodegaSucursal.setVisible(this.isPermisoActualizarBodegaSucursal);	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.setVisible(this.isPermisoActualizarBodegaSucursal);	
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.setVisible(this.isPermisoEliminarBodegaSucursal);
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.setVisible(this.isVisibilidadCeldaCancelarBodegaSucursal);						
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.setVisible(this.isPermisoGuardarCambiosBodegaSucursal);							
		}
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.setVisible(this.isPermisoActualizarBodegaSucursal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBodegaSucursal() {
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarBodegaSucursal.setVisible(this.isPermisoActualizarBodegaSucursal);	
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.setVisible(this.isPermisoActualizarBodegaSucursal);	
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.setVisible(this.isPermisoEliminarBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.setVisible(this.isVisibilidadCeldaCancelarBodegaSucursal);							
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.setVisible((this.isVisibilidadCeldaGuardarBodegaSucursal && this.isPermisoGuardarCambiosBodegaSucursal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBodegaSucursal() {
		if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBodegaSucursal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBodegaSucursal() {
	}
	
	public void jTableDatosBodegaSucursalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBodegaSucursal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bodegasucursal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBodegaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBodegaSucursal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBodegaSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBodegaSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bodegasucursalLogic.getConnexion());

				if(this.bodegasucursal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bodegasucursal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBodegaSucursal=(TitledBorder)this.jScrollPanelDatosBodegaSucursal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBodegaSucursal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bodegasucursal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalBodegaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebBodegaSucursal(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBodegaSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBodegaSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.bodegasucursalLogic.getConnexion());

				if(this.bodegasucursal.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.bodegasucursal.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBodegaSucursal=(TitledBorder)this.jScrollPanelDatosBodegaSucursal.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderBodegaSucursal.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.bodegasucursal.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaBodegaSucursalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebBodegaSucursal(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBodegaSucursal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBodegaSucursal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.bodegasucursalLogic.getConnexion());

				if(this.bodegasucursal.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.bodegasucursal.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBodegaSucursal=(TitledBorder)this.jScrollPanelDatosBodegaSucursal.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderBodegaSucursal.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.bodegasucursal.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuenciaBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getsecuencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencia = "+this.bodegasucursal.getsecuencia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontamanioBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.gettamanio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tamanio = "+this.bodegasucursal.gettamanio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionBodegaSucursalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.getbodegasucursal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bodegasucursal==null) {
						this.bodegasucursal = new BodegaSucursal();
					}

					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);
				}

				if(this.bodegasucursal.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.bodegasucursal.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBodegaSucursal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBodegaSucursal(false,false);

			this.getBodegaSucursalsFK_IdBodega();

			this.inicializarActualizarBindingBodegaSucursal(false);

			//if(BodegaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBodegaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBodegaSucursal(false,false);

			this.getBodegaSucursalsFK_IdEmpresa();

			this.inicializarActualizarBindingBodegaSucursal(false);

			//if(BodegaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBodegaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalBodegaSucursalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBodegaSucursal(false,false);

			this.getBodegaSucursalsFK_IdSucursal();

			this.inicializarActualizarBindingBodegaSucursal(false);

			//if(BodegaSucursalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBodegaSucursal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bodegasucursalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBodegaSucursal() {
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
			this.jInternalFrameDetalleFormBodegaSucursal.setVisible(false);	    			
			this.jInternalFrameDetalleFormBodegaSucursal.dispose();
			this.jInternalFrameDetalleFormBodegaSucursal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
			this.jInternalFrameReporteDinamicoBodegaSucursal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBodegaSucursal.dispose();
			this.jInternalFrameReporteDinamicoBodegaSucursal=null;
		}
		
		if(this.jInternalFrameImportacionBodegaSucursal!=null) {
			this.jInternalFrameImportacionBodegaSucursal.setVisible(false);	    			
			this.jInternalFrameImportacionBodegaSucursal.dispose();
			this.jInternalFrameImportacionBodegaSucursal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBodegaSucursal();
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			
			if(sTipo.equals("NuevoBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBodegaSucursal")) {
				jButtonDuplicarBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBodegaSucursal")) {
				jButtonCopiarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormBodegaSucursal")) {
				jButtonVerFormBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBodegaSucursal")) {
				jButtonDuplicarBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBodegaSucursal")) {
				jButtonDuplicarBodegaSucursalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBodegaSucursal")) {
				jButtonModificarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBodegaSucursal")) {
				jButtonModificarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBodegaSucursal")) {
				jButtonModificarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBodegaSucursal")) {
				jButtonActualizarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBodegaSucursal")) {
				jButtonActualizarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBodegaSucursal")) {
				jButtonActualizarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarBodegaSucursal")) {
				jButtonEliminarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBodegaSucursal")) {
				jButtonEliminarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBodegaSucursal")) {
				jButtonEliminarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarBodegaSucursal")) {
				jButtonCancelarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBodegaSucursal")) {
				jButtonCancelarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBodegaSucursal")) {
				jButtonCancelarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarBodegaSucursal")) {
				jButtonCerrarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBodegaSucursal")) {
				jButtonCerrarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBodegaSucursal")) {
				jButtonCerrarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBodegaSucursal")) {
				jButtonMostrarOcultarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBodegaSucursal")) {
				jButtonCancelarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBodegaSucursal")) {
				jButtonCopiarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBodegaSucursal")) {
				jButtonVerFormBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBodegaSucursal")) {
				jButtonCopiarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBodegaSucursal")) {
				jButtonVerFormBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBodegaSucursal")) {
				jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBodegaSucursal")) {
				jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBodegaSucursal")) {
				jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBodegaSucursal")) {
				jButtonAnterioresBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBodegaSucursal")) {
				jButtonAnterioresBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBodegaSucursal")) {
				jButtonAnterioresBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBodegaSucursal")) {
				jButtonSiguientesBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBodegaSucursal")) {
				jButtonSiguientesBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBodegaSucursal")) {
				jButtonSiguientesBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBodegaSucursal") || sTipo.equals("MenuItemDetalleAbrirOrderByBodegaSucursal")) {
				jButtonAbrirOrderByBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBodegaSucursal") || sTipo.equals("MenuItemDetalleMostrarOcultarBodegaSucursal")) {
				jButtonMostrarOcultarBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBodegaSucursal")) {
				jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBodegaSucursal")) {
				jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBodegaSucursal")) {
				jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBodegaSucursal")) {
				jButtonCerrarReporteDinamicoBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBodegaSucursal")) {
				jButtonGenerarReporteDinamicoBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBodegaSucursal")) {
				
				jButtonGenerarExcelReporteDinamicoBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBodegaSucursal")) {
				jButtonCerrarImportacionBodegaSucursalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBodegaSucursal")) {
				
				jButtonGenerarImportacionBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBodegaSucursal")) {
				
				jButtonAbrirImportacionBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBodegaSucursal")) {
				jComboBoxTiposAccionesBodegaSucursalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBodegaSucursal")) {
				jComboBoxTiposRelacionesBodegaSucursalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBodegaSucursal")) {
				jComboBoxTiposAccionesBodegaSucursalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBodegaSucursal")) {
				
				jComboBoxTiposSeleccionarBodegaSucursalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBodegaSucursal")) {
				jTextFieldValorCampoGeneralBodegaSucursalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBodegaSucursal")) {
				jButtonAbrirOrderByBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBodegaSucursal")) {
				jButtonAbrirOrderByBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBodegaSucursal")) {
				jButtonCerrarOrderByBodegaSucursalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBodegaSucursalBusqueda")) {
				this.jButtonidBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBodegaSucursalUpdate")) {
				this.jButtonid_empresaBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBodegaSucursalBusqueda")) {
				this.jButtonid_empresaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBodegaSucursalUpdate")) {
				this.jButtonid_sucursalBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBodegaSucursalBusqueda")) {
				this.jButtonid_sucursalBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaBodegaSucursalUpdate")) {
				this.jButtonid_bodegaBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaBodegaSucursalBusqueda")) {
				this.jButtonid_bodegaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuenciaBodegaSucursalBusqueda")) {
				this.jButtonsecuenciaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tamanioBodegaSucursalBusqueda")) {
				this.jButtontamanioBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionBodegaSucursalBusqueda")) {
				this.jButtondescripcionBodegaSucursalBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaBodegaSucursal")) {
				this.jButtonFK_IdBodegaBodegaSucursalActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdSucursalBodegaSucursal")) {
				this.jButtonFK_IdSucursalBodegaSucursalActionPerformed(evt);
			}
			
			;
			
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBodegaSucursal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BodegaSucursal bodegasucursalLocal=null;
			
			if(!this.getEsControlTabla()) {
				bodegasucursalLocal=this.bodegasucursal;
			} else {
				bodegasucursalLocal=this.bodegasucursalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
							
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
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
			
			


			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
								
						
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
								
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
							
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
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
			
			


			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
								
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBodegaSucursal")) {
					jCheckBoxSeleccionarTodosBodegaSucursalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBodegaSucursal")) {
					jCheckBoxSeleccionadosBodegaSucursalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBodegaSucursal")) {
					
				}
				
				


				
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
												
				
				


				
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
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
			
			


			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBodegaSucursalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bodegasucursal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bodegasucursal);
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
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
				
				


				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BodegaSucursal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BodegaSucursal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBodegaSucursalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bodegasucursalAnterior =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBodegaSucursal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBodegaSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBodegaSucursal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bodegasucursal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bodegasucursal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bodegasucursal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBodegaSucursal")) {
				
				}
				
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBodegaSucursal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBodegaSucursal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBodegaSucursal")) {
			
			}
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBodegaSucursal();
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			if(sTipo.equals("NuevoBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBodegaSucursal")) {
				jButtonDuplicarBodegaSucursalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBodegaSucursal")) {
				jButtonCopiarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBodegaSucursal")) {
				jButtonVerFormBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBodegaSucursal")) {
				jButtonNuevoBodegaSucursalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBodegaSucursal")) {
				jButtonModificarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBodegaSucursal")) {
				jButtonActualizarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBodegaSucursal")) {
				jButtonEliminarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBodegaSucursal")) {
				jButtonCancelarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBodegaSucursal")) {
				jButtonCerrarBodegaSucursalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBodegaSucursal")) {
				jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBodegaSucursal")) {
				jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBodegaSucursal")) {
				jButtonAbrirOrderByBodegaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBodegaSucursal")) {
				jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBodegaSucursal")) {
				jButtonAnterioresBodegaSucursalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBodegaSucursal")) {
				jButtonSiguientesBodegaSucursalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBodegaSucursalBusqueda")) {
				this.jButtonidBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBodegaSucursalUpdate")) {
				this.jButtonid_empresaBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBodegaSucursalBusqueda")) {
				this.jButtonid_empresaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalBodegaSucursalUpdate")) {
				this.jButtonid_sucursalBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalBodegaSucursalBusqueda")) {
				this.jButtonid_sucursalBodegaSucursalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaBodegaSucursalUpdate")) {
				this.jButtonid_bodegaBodegaSucursalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaBodegaSucursalBusqueda")) {
				this.jButtonid_bodegaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuenciaBodegaSucursalBusqueda")) {
				this.jButtonsecuenciaBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tamanioBodegaSucursalBusqueda")) {
				this.jButtontamanioBodegaSucursalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionBodegaSucursalBusqueda")) {
				this.jButtondescripcionBodegaSucursalBusquedaActionPerformed(evt);
			}
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBodegaSucursal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBodegaSucursal")) {
				closingInternalFrameBodegaSucursal();
				
			} else if(sTipo.equals("jButtonCancelarBodegaSucursal")) {
				JInternalFrameBase jInternalFrameDetalleFormBodegaSucursal = (JInternalFrameBase)evt.getSource();
	            	
	            BodegaSucursalBeanSwingJInternalFrame jInternalFrameParent=(BodegaSucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormBodegaSucursal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBodegaSucursalActionPerformed(null);
			}
			
			BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bodegasucursal,new Object(),this.bodegasucursalParameterGeneral,this.bodegasucursalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBodegaSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBodegaSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBodegaSucursal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bodegasucursal)) {
			if(!esControlTabla) {
				if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);			
				}
				
				if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBodegaSucursal(this.bodegasucursal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bodegasucursalReturnGeneral=bodegasucursalLogic.procesarEventosBodegaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bodegasucursalLogic.getBodegaSucursals(),this.bodegasucursal,this.bodegasucursalParameterGeneral,this.isEsNuevoBodegaSucursal,classes);//this.bodegasucursalLogic.getBodegaSucursal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBodegaSucursal(this.bodegasucursalReturnGeneral,this.bodegasucursalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBodegaSucursal(classes,this.bodegasucursalReturnGeneral,this.bodegasucursalBean,false);
					}
						
					if(this.bodegasucursalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal());	
					}
						
					if(this.bodegasucursalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal(),classes);//this.bodegasucursalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBodegaSucursal(this.bodegasucursal,classes);//this.bodegasucursalBean);									
				}
			
				if(BodegaSucursalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBodegaSucursal(this.bodegasucursal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBodegaSucursal(this.bodegasucursal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bodegasucursalAnterior!=null) {
						this.bodegasucursal=this.bodegasucursalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bodegasucursalReturnGeneral=bodegasucursalLogic.procesarEventosBodegaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bodegasucursalLogic.getBodegaSucursals(),this.bodegasucursal,this.bodegasucursalParameterGeneral,this.isEsNuevoBodegaSucursal,classes);//this.bodegasucursalLogic.getBodegaSucursal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bodegasucursalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bodegasucursalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bodegasucursalReturnGeneral.getBodegaSucursal(),bodegasucursalLogic.getBodegaSucursals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bodegasucursalReturnGeneral.getBodegaSucursal(),this.bodegasucursals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBodegaSucursal.repaint();
				
				//((AbstractTableModel) this.jTableDatosBodegaSucursal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBodegaSucursal();
			}
		}
	}
	
	public void actualizarVisualTableDatosBodegaSucursal() throws Exception {
		
		BodegaSucursalModel bodegasucursalModel=(BodegaSucursalModel)this.jTableDatosBodegaSucursal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bodegasucursalModel.bodegasucursals=this.bodegasucursalLogic.getBodegaSucursals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bodegasucursalModel.bodegasucursals=this.bodegasucursals;
		}
		
		
		((BodegaSucursalModel) this.jTableDatosBodegaSucursal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBodegaSucursal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbodegasucursalAnterior(),this.bodegasucursalLogic.getBodegaSucursals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbodegasucursalAnterior(),this.bodegasucursals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBodegaSucursal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBodegaSucursal(BodegaSucursal bodegasucursal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
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
										
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bodegasucursal,new Object(),generalEntityParameterGeneral,this.bodegasucursalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bodegasucursalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BodegaSucursalConstantesFunciones.getClassesRelationshipsOfBodegaSucursal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BodegaSucursalConstantesFunciones.getClassesRelationshipsFromStringsOfBodegaSucursal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBodegaSucursal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BodegaSucursalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bodegasucursal,new Object(),generalEntityParameterGeneral,this.bodegasucursalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBodegaSucursal(BodegaSucursalBean bodegasucursalBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBodegaSucursal(ArrayList<Classe> classes,BodegaSucursalReturnGeneral bodegasucursalReturnGeneral,BodegaSucursalBean bodegasucursalBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBodegaSucursal(BodegaSucursal bodegasucursal,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bodegasucursal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBodegaSucursal = new BodegaSucursalDetalleFormJInternalFrame(jDesktopPane,this.bodegasucursalSessionBean.getConGuardarRelaciones(),this.bodegasucursalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.setVisible(false);
		this.jInternalFrameDetalleFormBodegaSucursal.setSelected(false);						
		
		this.jInternalFrameDetalleFormBodegaSucursal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBodegaSucursal.bodegasucursalLogic=this.bodegasucursalLogic;
		
		this.cargarCombosFrameForeignKeyBodegaSucursal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBodegaSucursal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBodegaSucursal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBodegaSucursal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBodegaSucursal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBodegaSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBodegaSucursal"));
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ModificarBodegaSucursal"));

		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarBodegaSucursal"));
					
		this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemModificarBodegaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarBodegaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.addActionListener (new ButtonActionListener(this,"ActualizarBodegaSucursal"));
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBodegaSucursal"));
						
		this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemActualizarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBodegaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.addActionListener (new ButtonActionListener(this,"EliminarBodegaSucursal"));
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarBodegaSucursal"));
								
		this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemEliminarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBodegaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CancelarBodegaSucursal"));
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarBodegaSucursal"));
					
		this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemCancelarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBodegaSucursal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemDetalleCerrarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBodegaSucursal"));		
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBodegaSucursal"));
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBodegaSucursal"));
		
		
		
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBodegaSucursal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonidBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonsecuenciaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"secuenciaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtontamanioBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"tamanioBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtondescripcionBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBodegaSucursalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBodegaSucursal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBodegaSucursal"));
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBodegaSucursal"));
		}
		
		this.jTableDatosBodegaSucursal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBodegaSucursal"));
		
		this.jTableDatosBodegaSucursal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBodegaSucursal"));
		
		this.jButtonNuevoBodegaSucursal.addActionListener(new ButtonActionListener(this,"NuevoBodegaSucursal"));
		
		this.jButtonDuplicarBodegaSucursal.addActionListener(new ButtonActionListener(this,"DuplicarBodegaSucursal"));
		
		this.jButtonCopiarBodegaSucursal.addActionListener(new ButtonActionListener(this,"CopiarBodegaSucursal"));
		
		this.jButtonVerFormBodegaSucursal.addActionListener(new ButtonActionListener(this,"VerFormBodegaSucursal"));
		
		
		this.jButtonNuevoToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"NuevoToolBarBodegaSucursal"));
			
		this.jButtonDuplicarToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBodegaSucursal"));
			
		this.jMenuItemNuevoBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBodegaSucursal"));
			
		this.jMenuItemDuplicarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBodegaSucursal"));		
		
		
		this.jButtonNuevoRelacionesBodegaSucursal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBodegaSucursal"));
		
		
		this.jButtonNuevoRelacionesToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBodegaSucursal"));
			
		this.jMenuItemNuevoRelacionesBodegaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBodegaSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ModificarBodegaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonModificarToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ModificarToolBarBodegaSucursal"));
			
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemModificarBodegaSucursal.addActionListener(new ButtonActionListener(this,"MenuItemModificarBodegaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarBodegaSucursal.addActionListener (new ButtonActionListener(this,"ActualizarBodegaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonActualizarToolBarBodegaSucursal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBodegaSucursal"));
				
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemActualizarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBodegaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarBodegaSucursal.addActionListener (new ButtonActionListener(this,"EliminarBodegaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonEliminarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"EliminarToolBarBodegaSucursal"));
						
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemEliminarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBodegaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CancelarBodegaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonCancelarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CancelarToolBarBodegaSucursal"));
			
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemCancelarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBodegaSucursal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBodegaSucursal"));		
		
		
		this.jButtonCerrarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CerrarBodegaSucursal"));
		
		
		this.jButtonCerrarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CerrarToolBarBodegaSucursal"));
			
		this.jMenuItemCerrarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBodegaSucursal"));
			
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jMenuItemDetalleCerrarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBodegaSucursal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosBodegaSucursal"));
		}
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBodegaSucursal"));
		}
		
		this.jButtonCopiarToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"CopiarToolBarBodegaSucursal"));
			
		this.jButtonVerFormToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"VerFormToolBarBodegaSucursal"));
		
		this.jMenuItemGuardarCambiosBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBodegaSucursal"));
			
		this.jMenuItemCopiarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBodegaSucursal"));		
		
		this.jMenuItemVerFormBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBodegaSucursal"));		
		
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBodegaSucursal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBodegaSucursal"));
			
		this.jMenuItemGuardarCambiosTablaBodegaSucursal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBodegaSucursal"));		
		
		
		
		this.jButtonRecargarInformacionBodegaSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionBodegaSucursal"));
					
		this.jButtonRecargarInformacionToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBodegaSucursal"));
		
		this.jMenuItemRecargarInformacionBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBodegaSucursal"));		
		
		
		
		this.jButtonAnterioresBodegaSucursal.addActionListener (new ButtonActionListener(this,"AnterioresBodegaSucursal"));
		
		
		this.jButtonAnterioresToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBodegaSucursal"));
		
		this.jMenuItemAnterioresBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBodegaSucursal"));		
		
		
		this.jButtonSiguientesBodegaSucursal.addActionListener (new ButtonActionListener(this,"SiguientesBodegaSucursal"));
		
		
		this.jButtonSiguientesToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBodegaSucursal"));
			
		this.jMenuItemSiguientesBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBodegaSucursal"));
			
		this.jMenuItemAbrirOrderByBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBodegaSucursal"));
			
		this.jMenuItemMostrarOcultarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBodegaSucursal"));
			
		this.jMenuItemDetalleAbrirOrderByBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBodegaSucursal"));
			
		this.jMenuItemDetalleMostarOcultarBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBodegaSucursal"));		
		
		
		this.jButtonNuevoGuardarCambiosBodegaSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBodegaSucursal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBodegaSucursal"));
			
		this.jMenuItemNuevoGuardarCambiosBodegaSucursal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBodegaSucursal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBodegaSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBodegaSucursal"));

		this.jCheckBoxSeleccionadosBodegaSucursal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBodegaSucursal"));
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBodegaSucursal"));
		}
		
		
		this.jComboBoxTiposRelacionesBodegaSucursal.addActionListener (new ButtonActionListener(this,"TiposRelacionesBodegaSucursal"));
			
		this.jComboBoxTiposAccionesBodegaSucursal.addActionListener (new ButtonActionListener(this,"TiposAccionesBodegaSucursal"));
					
		this.jComboBoxTiposSeleccionarBodegaSucursal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBodegaSucursal"));
			
		this.jTextFieldValorCampoGeneralBodegaSucursal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBodegaSucursal"));		
		
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonidBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonsecuenciaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"secuenciaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtontamanioBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"tamanioBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtondescripcionBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBodegaSucursalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaBodegaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdBodegaBodegaSucursal"));

			this.jButtonFK_IdSucursalBodegaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdSucursalBodegaSucursal"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBodegaSucursal!=null) {
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBodegaSucursal"));
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBodegaSucursal"));
				this.jInternalFrameReporteDinamicoBodegaSucursal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBodegaSucursal"));
			}
			
			//this.jButtonCerrarReporteDinamicoBodegaSucursal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBodegaSucursal"));				
			//this.jButtonGenerarReporteDinamicoBodegaSucursal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBodegaSucursal"));
			//this.jButtonGenerarExcelReporteDinamicoBodegaSucursal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBodegaSucursal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBodegaSucursal!=null) {
				this.jInternalFrameImportacionBodegaSucursal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBodegaSucursal"));
				this.jInternalFrameImportacionBodegaSucursal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBodegaSucursal"));
				this.jInternalFrameImportacionBodegaSucursal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBodegaSucursal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBodegaSucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderByBodegaSucursal"));
			
			this.jButtonAbrirOrderByToolBarBodegaSucursal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBodegaSucursal"));			
			
			if(this.jInternalFrameOrderByBodegaSucursal!=null) {
				this.jInternalFrameOrderByBodegaSucursal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBodegaSucursal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBodegaSucursal.jTabbedPaneRelacionesBodegaSucursal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBodegaSucursal"));
		
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
            		closingInternalFrameBodegaSucursal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBodegaSucursal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBodegaSucursal = (JInternalFrameBase)event.getSource();
	            	
	            BodegaSucursalBeanSwingJInternalFrame jInternalFrameParent=(BodegaSucursalBeanSwingJInternalFrame)jInternalFrameDetalleFormBodegaSucursal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBodegaSucursalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBodegaSucursal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBodegaSucursalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBodegaSucursal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBodegaSucursal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBodegaSucursal";
		inputMap = this.jButtonNuevoBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBodegaSucursalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBodegaSucursalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBodegaSucursal";
		inputMap = this.jButtonNuevoRelacionesBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBodegaSucursalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBodegaSucursal";
		inputMap = this.jButtonModificarBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBodegaSucursal";
		inputMap = this.jButtonActualizarBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBodegaSucursal";
		inputMap = this.jButtonEliminarBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBodegaSucursal";
		inputMap = this.jButtonCancelarBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBodegaSucursal";
		inputMap = this.jButtonCerrarBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBodegaSucursal";
		inputMap = this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonGuardarCambiosBodegaSucursal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBodegaSucursalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBodegaSucursal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBodegaSucursalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBodegaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBodegaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBodegaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBodegaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBodegaSucursal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBodegaSucursalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonidBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"idBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_empresaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_sucursalBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalBodegaSucursalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonid_bodegaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtonsecuenciaBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"secuenciaBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtontamanioBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"tamanioBodegaSucursalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBodegaSucursal.jButtondescripcionBodegaSucursalBusqueda.addActionListener(new ButtonActionListener(this,"descripcionBodegaSucursalBusqueda"));
		
		
		this.jButtonFK_IdBodegaBodegaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdBodegaBodegaSucursal"));

		this.jButtonFK_IdSucursalBodegaSucursal.addActionListener(new ButtonActionListener(this,"FK_IdSucursalBodegaSucursal"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBodegaSucursal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBodegaSucursalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBodegaSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBodegaSucursal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBodegaSucursal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
					bodegasucursalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BodegaSucursal bodegasucursalAux:bodegasucursals) {
					bodegasucursalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBodegaSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
						bodegasucursalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BodegaSucursal bodegasucursalAux:bodegasucursals) {
						bodegasucursalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BodegaSucursal bodegasucursalAux:bodegasucursals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBodegaSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBodegaSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBodegaSucursalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBodegaSucursal.getSelectedRows();
			
			BodegaSucursal bodegasucursalLocal=new BodegaSucursal();
			
			//this.seleccionarTodosBodegaSucursal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegasucursalLocal =(BodegaSucursal) this.bodegasucursalLogic.getBodegaSucursals().toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bodegasucursalLocal =(BodegaSucursal) this.bodegasucursals.toArray()[this.jTableDatosBodegaSucursal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bodegasucursalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
						bodegasucursalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BodegaSucursal bodegasucursalAux:bodegasucursals) {
						bodegasucursalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBodegaSucursal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBodegaSucursal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBodegaSucursal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBodegaSucursalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBodegaSucursalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBodegaSucursalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBodegaSucursal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BodegaSucursal bodegasucursalAux:this.bodegasucursalLogic.getBodegaSucursals()) {
				
						if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA)) {
							existe=true;
							bodegasucursalAux.setsecuencia(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_TAMANIO)) {
							existe=true;
							bodegasucursalAux.settamanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							bodegasucursalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BodegaSucursal bodegasucursalAux:bodegasucursals) {
					
						if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA)) {
							existe=true;
							bodegasucursalAux.setsecuencia(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_TAMANIO)) {
							existe=true;
							bodegasucursalAux.settamanio(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							bodegasucursalAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBodegaSucursal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBodegaSucursalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBodegaSucursal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBodegaSucursal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBodegaSucursal) {				
					conSplash=true;//false;										
					
					//this.startProcessBodegaSucursal(conSplash);
				
					this.generarReporteBodegaSucursalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBodegaSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBodegaSucursalsSeleccionados(false);
				//this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBodegaSucursalsSeleccionados(true);
				//this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBodegaSucursal();
				
				this.exportarBodegaSucursalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBodegaSucursals();
				//this.importarBodegaSucursals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBodegaSucursal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBodegaSucursalsSeleccionados();
				//this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Bodega Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBodegaSucursal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBodegaSucursal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBodegaSucursal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
				}	
			} 			
			else if(BodegaSucursalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBodegaSucursal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBodegaSucursal(conSplash);
					
						//this.actualizarParametrosGeneralBodegaSucursal();
						
						this.generarReporteProcesoAccionBodegaSucursalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BodegaSucursalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Bodega SucursalES SELECCIONADOS?", "MANTENIMIENTO DE Bodega Sucursal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBodegaSucursal();
				
						this.actualizarParametrosGeneralBodegaSucursal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bodegasucursalReturnGeneral=bodegasucursalLogic.procesarAccionBodegaSucursalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bodegasucursalLogic.getBodegaSucursals(),this.bodegasucursalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBodegaSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBodegaSucursal();
					
					BodegaSucursalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBodegaSucursalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBodegaSucursal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxTiposAccionesFormularioBodegaSucursal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBodegaSucursal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBodegaSucursalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBodegaSucursal();
			
			if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
			BodegaSucursal bodegasucursal=new BodegaSucursal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBodegaSucursal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBodegaSucursal.getSelectedItem();
			
			
			
			
			bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(bodegasucursalsSeleccionados.size()==1) {
				for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
					bodegasucursal=bodegasucursalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBodegaSucursal();
			
      		//this.finishProcessBodegaSucursal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBodegaSucursalReturnGeneral() throws Exception {
		if(this.bodegasucursalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bodegasucursalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bodegasucursalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bodegasucursalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bodegasucursalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bodegasucursalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBodegaSucursal(false);
		}
		
		if(this.bodegasucursalReturnGeneral.getConRetornoLista() || this.bodegasucursalReturnGeneral.getConRetornoObjeto()) {
			if(this.bodegasucursalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bodegasucursalLogic.setBodegaSucursals(this.bodegasucursalReturnGeneral.getBodegaSucursals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bodegasucursalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bodegasucursalLogic.setBodegaSucursal(this.bodegasucursalReturnGeneral.getBodegaSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBodegaSucursal(false);
		}
	}
	
	public void actualizarParametrosGeneralBodegaSucursal() throws Exception {
		
		
	}
	
	public ArrayList<BodegaSucursal> getBodegaSucursalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBodegaSucursal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BodegaSucursal bodegasucursalAux:bodegasucursalLogic.getBodegaSucursals()) {
					if(bodegasucursalAux.getIsSelected()) {
						bodegasucursalsSeleccionados.add(bodegasucursalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BodegaSucursal bodegasucursalAux:this.bodegasucursals) {
					if(bodegasucursalAux.getIsSelected()) {
						bodegasucursalsSeleccionados.add(bodegasucursalAux);				
					}
				}
			}
			
			if(bodegasucursalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bodegasucursalsSeleccionados.addAll(this.bodegasucursalLogic.getBodegaSucursals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bodegasucursalsSeleccionados.addAll(this.bodegasucursals);				
					}
				}
			}
		} else {
			bodegasucursalsSeleccionados.add(this.bodegasucursal);
		}
		
		return bodegasucursalsSeleccionados;
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
	
	public void generarReporteBodegaSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBodegaSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBodegaSucursalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBodegaSucursalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBodegaSucursalsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Bodega Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados);
		
	}	
	
	public void generarReporteNormalBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBodegaSucursalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBodegaSucursal();
		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBodegaSucursal();
		
		
		//this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados ,bodegasucursalImplementable,bodegasucursalImplementableHome);
	}
	
	public void mostrarImportacionBodegaSucursals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBodegaSucursal();
		
		this.abrirFrameImportacionBodegaSucursal();		
		
			
		//this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados ,bodegasucursalImplementable,bodegasucursalImplementableHome);
	}
	
	public void importarBodegaSucursals() throws Exception {		
	
	}
	
	public void exportarBodegaSucursalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBodegaSucursalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBodegaSucursalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBodegaSucursalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Bodega Sucursal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBodegaSucursal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBodegaSucursal(bodegasucursalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bodegasucursalAux.setsDetalleGeneralEntityReporte(bodegasucursalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBodegaSucursal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_SECUENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_TAMANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBodegaSucursal(BodegaSucursal bodegasucursal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bodegasucursal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getsecuencia().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.gettamanio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bodegasucursal.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BodegaSucursals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBodegaSucursal(row);				
				iRow++;
			}				
			
			for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBodegaSucursal(bodegasucursalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBodegaSucursalsSeleccionados() throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();		
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bodegasucursal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bodegasucursals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bodegasucursal");
			//elementRoot.appendChild(element);
		
			for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
				element = document.createElement("bodegasucursal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBodegaSucursal(bodegasucursalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bodega Sucursal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBodegaSucursal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_TAMANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBodegaSucursal(BodegaSucursal bodegasucursal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getsecuencia());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.gettamanio());
		cell = row.createCell(iColumn++);cell.setCellValue(bodegasucursal.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlBodegaSucursal(BodegaSucursal bodegasucursal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BodegaSucursalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bodegasucursal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BodegaSucursalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bodegasucursal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BodegaSucursalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bodegasucursal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(BodegaSucursalConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(bodegasucursal.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(BodegaSucursalConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(bodegasucursal.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementsecuencia = document.createElement(BodegaSucursalConstantesFunciones.SECUENCIA);
		elementsecuencia.appendChild(document.createTextNode(bodegasucursal.getsecuencia().toString().trim()));
		element.appendChild(elementsecuencia);

		Element elementtamanio = document.createElement(BodegaSucursalConstantesFunciones.TAMANIO);
		elementtamanio.appendChild(document.createTextNode(bodegasucursal.gettamanio().toString().trim()));
		element.appendChild(elementtamanio);

		Element elementdescripcion = document.createElement(BodegaSucursalConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(bodegasucursal.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoBodegaSucursalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BodegaSucursal> bodegasucursalsSeleccionados=new ArrayList<BodegaSucursal>();
		
		bodegasucursalsSeleccionados=this.getBodegaSucursalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBodegaSucursal(bodegasucursalsSeleccionados);
		
		this.generarReporteBodegaSucursals("Todos",bodegasucursalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBodegaSucursal(ArrayList<BodegaSucursal> bodegasucursalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BodegaSucursal bodegasucursalAux:bodegasucursalsSeleccionados) {
				bodegasucursalAux.setsDetalleGeneralEntityReporte(bodegasucursalAux.toString());
			
				if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_SECUENCIA)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.getsecuencia().toString());
				}
				 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_TAMANIO)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.gettamanio().toString());
				}
				 else if(sTipoSeleccionar.equals(BodegaSucursalConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					bodegasucursalAux.setsDescripcionGeneralEntityReporte1(bodegasucursalAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BodegaSucursalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBodegaSucursal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBodegaSucursal=true;
				this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=true;
				this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=true;
			}
			
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=true;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=true;
			this.isVisibilidadCeldaEliminarBodegaSucursal=true;
			this.isVisibilidadCeldaCancelarBodegaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=true;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=true;
			this.isVisibilidadCeldaModificarBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=true;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
			this.isVisibilidadCeldaModificarBodegaSucursal=true;
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
			this.isVisibilidadCeldaCancelarBodegaSucursal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				} else {
					this.isVisibilidadCeldaGuardarBodegaSucursal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BodegaSucursalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBodegaSucursal=true;
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=true;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=true;
		} else {
			this.actualizarEstadoPanelsBodegaSucursal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBodegaSucursal=false;
			//this.isVisibilidadCeldaVerFormBodegaSucursal=false;
			this.isVisibilidadCeldaDuplicarBodegaSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bodegasucursalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
		} else {
			this.isVisibilidadCeldaNuevoBodegaSucursal=false;
			this.isVisibilidadCeldaGuardarCambiosBodegaSucursal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			if(!bodegasucursalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;												
			}
			
			this.jButtonCerrarBodegaSucursal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBodegaSucursal=false;
		}
		
		if(!this.permiteMantenimiento(this.bodegasucursal)) {
			this.isVisibilidadCeldaActualizarBodegaSucursal=false;
			this.isVisibilidadCeldaEliminarBodegaSucursal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBodegaSucursal() {
	}
	
	public void actualizarEstadoPanelsBodegaSucursal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBodegaSucursal!=null) {
				this.jScrollPanelDatosEdicionBodegaSucursal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBodegaSucursal!=null) {
				this.jScrollPanelDatosBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelPaginacionBodegaSucursal!=null) {
				this.jPanelPaginacionBodegaSucursal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
					this.jTabbedPaneBusquedasBodegaSucursal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bodegasucursalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBodegaSucursal!=null) {
				this.jTabbedPaneBusquedasBodegaSucursal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBodegaSucursal!=null) {
				this.jPanelParametrosReportesBodegaSucursal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdBodegaBodegaSucursal);}

			this.isVisibilidadFK_IdSucursal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdSucursal) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdSucursalBodegaSucursal);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdBodegaBodegaSucursal);}

			this.isVisibilidadFK_IdSucursal=isParaSucursal;
			if(!this.isVisibilidadFK_IdSucursal) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdSucursalBodegaSucursal);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdBodegaBodegaSucursal);}

			this.isVisibilidadFK_IdSucursal=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdSucursal) {this.jTabbedPaneBusquedasBodegaSucursal.remove(jPanelFK_IdSucursalBodegaSucursal);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//BodegaSucursalSessionBean bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		
		if(this.bodegasucursalSessionBean==null) {
			this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		}
		
		this.bodegasucursalSessionBean.setsUltimaBusquedaBodegaSucursal(this.getsAccionBusqueda());
		this.bodegasucursalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bodegasucursalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			bodegasucursalSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bodegasucursalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			bodegasucursalSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BodegaSucursalSessionBean bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		
		if(this.bodegasucursalSessionBean==null) {
			this.bodegasucursalSessionBean=new BodegaSucursalSessionBean();
		}
		
		if(this.bodegasucursalSessionBean.getsUltimaBusquedaBodegaSucursal()!=null&&!this.bodegasucursalSessionBean.getsUltimaBusquedaBodegaSucursal().equals("")) {
			this.setsAccionBusqueda(bodegasucursalSessionBean.getsUltimaBusquedaBodegaSucursal());
			this.setiNumeroPaginacion(bodegasucursalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bodegasucursalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(bodegasucursalSessionBean.getid_bodega());
				bodegasucursalSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bodegasucursalSessionBean.getid_empresa());
				bodegasucursalSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(bodegasucursalSessionBean.getid_sucursal());
				bodegasucursalSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.bodegasucursalSessionBean.setsUltimaBusquedaBodegaSucursal("");
		this.bodegasucursalSessionBean.setiNumeroPaginacion(BodegaSucursalConstantesFunciones.INUMEROPAGINACION);
		this.bodegasucursalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBodegaSucursal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBodegaSucursal() {
		this.updateBorderResaltarBusquedasFormularioBodegaSucursal();
		this.updateVisibilidadBusquedasFormularioBodegaSucursal();
		this.updateHabilitarBusquedasFormularioBodegaSucursal();
	}
	
	public void updateBorderResaltarBusquedasFormularioBodegaSucursal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBodegaSucursal.getComponents().length>0) {
	

		if(this.bodegasucursalConstantesFunciones.resaltarFK_IdBodegaBodegaSucursal!=null) {
			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdBodegaBodegaSucursal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
				jPanel.setBorder(this.bodegasucursalConstantesFunciones.resaltarFK_IdBodegaBodegaSucursal);
			}
		}

		if(this.bodegasucursalConstantesFunciones.resaltarFK_IdSucursalBodegaSucursal!=null) {
			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdSucursalBodegaSucursal);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
				jPanel.setBorder(this.bodegasucursalConstantesFunciones.resaltarFK_IdSucursalBodegaSucursal);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBodegaSucursal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBodegaSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdBodegaBodegaSucursal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bodegasucursalConstantesFunciones.mostrarFK_IdBodegaBodegaSucursal);
			if(!this.bodegasucursalConstantesFunciones.mostrarFK_IdBodegaBodegaSucursal && index>-1) {
				this.jTabbedPaneBusquedasBodegaSucursal.remove(index);
			}

			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdSucursalBodegaSucursal);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bodegasucursalConstantesFunciones.mostrarFK_IdSucursalBodegaSucursal);
			if(!this.bodegasucursalConstantesFunciones.mostrarFK_IdSucursalBodegaSucursal && index>-1) {
				this.jTabbedPaneBusquedasBodegaSucursal.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBodegaSucursal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBodegaSucursal.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdBodegaBodegaSucursal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bodegasucursalConstantesFunciones.activarFK_IdBodegaBodegaSucursal);
				this.jTabbedPaneBusquedasBodegaSucursal.setEnabledAt(index,this.bodegasucursalConstantesFunciones.activarFK_IdBodegaBodegaSucursal);
			}

			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdSucursalBodegaSucursal);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bodegasucursalConstantesFunciones.activarFK_IdSucursalBodegaSucursal);
				this.jTabbedPaneBusquedasBodegaSucursal.setEnabledAt(index,this.bodegasucursalConstantesFunciones.activarFK_IdSucursalBodegaSucursal);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBodegaSucursal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdBodegaBodegaSucursal);

			this.jTabbedPaneBusquedasBodegaSucursal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);

			this.bodegasucursalConstantesFunciones.setResaltarFK_IdBodegaBodegaSucursal(resaltar);

			jPanel.setBorder(this.bodegasucursalConstantesFunciones.resaltarFK_IdBodegaBodegaSucursal);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdSucursal")) {
			index= this.jTabbedPaneBusquedasBodegaSucursal.indexOfComponent(this.jPanelFK_IdSucursalBodegaSucursal);

			this.jTabbedPaneBusquedasBodegaSucursal.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBodegaSucursal.getComponent(index);

			this.bodegasucursalConstantesFunciones.setResaltarFK_IdSucursalBodegaSucursal(resaltar);

			jPanel.setBorder(this.bodegasucursalConstantesFunciones.resaltarFK_IdSucursalBodegaSucursal);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBodegaSucursal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBodegaSucursal() throws Exception {

		if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBodegaSucursal();
		this.updateVisibilidadResaltarControlesFormularioBodegaSucursal();
		this.updateHabilitarResaltarControlesFormularioBodegaSucursal();
		
	}
	
	public void updateBorderResaltarControlesFormularioBodegaSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bodegasucursalConstantesFunciones.resaltaridBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltaridBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltarid_empresaBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltarid_empresaBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltarid_sucursalBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltarid_sucursalBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltarid_bodegaBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltarid_bodegaBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltarsecuenciaBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltarsecuenciaBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltartamanioBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltartamanioBodegaSucursal);}
		if(this.bodegasucursalConstantesFunciones.resaltardescripcionBodegaSucursal!=null && this.jInternalFrameDetalleFormBodegaSucursal!=null) {this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setBorder(this.bodegasucursalConstantesFunciones.resaltardescripcionBodegaSucursal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBodegaSucursal() throws Exception {		
		if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
	
		//this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostraridBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPanelidBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostraridBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_empresaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPanelid_empresaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_empresaBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_sucursalBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPanelid_sucursalBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_sucursalBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_bodegaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPanelid_bodegaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarid_bodegaBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarsecuenciaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPanelsecuenciaBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrarsecuenciaBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrartamanioBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPaneltamanioBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrartamanioBodegaSucursal);
		//this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrardescripcionBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jPaneldescripcionBodegaSucursal.setVisible(this.bodegasucursalConstantesFunciones.mostrardescripcionBodegaSucursal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBodegaSucursal() throws Exception {
		if(this.jInternalFrameDetalleFormBodegaSucursal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBodegaSucursal!=null) {
	
		this.jInternalFrameDetalleFormBodegaSucursal.jLabelidBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activaridBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_empresaBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activarid_empresaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_sucursalBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activarid_sucursalBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jComboBoxid_bodegaBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activarid_bodegaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldsecuenciaBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activarsecuenciaBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jTextFieldtamanioBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activartamanioBodegaSucursal);
		this.jInternalFrameDetalleFormBodegaSucursal.jTextAreadescripcionBodegaSucursal.setEnabled(this.bodegasucursalConstantesFunciones.activardescripcionBodegaSucursal);
		}
	}
	
		
}