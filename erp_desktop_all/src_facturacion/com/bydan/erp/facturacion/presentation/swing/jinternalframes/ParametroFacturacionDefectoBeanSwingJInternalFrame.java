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

import com.bydan.erp.facturacion.util.ParametroFacturacionDefectoConstantesFunciones;
import com.bydan.erp.facturacion.util.ParametroFacturacionDefectoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.ParametroFacturacionDefectoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.ParametroFacturacionDefectoBean;
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
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroFacturacionDefectoBeanSwingJInternalFrame extends ParametroFacturacionDefectoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroFacturacionDefectoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroFacturacionDefecto> parametrofacturaciondefectoValidator = new ClassValidator<ParametroFacturacionDefecto>(ParametroFacturacionDefecto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroFacturacionDefecto parametrofacturaciondefecto;	
	public ParametroFacturacionDefecto parametrofacturaciondefectoAux;
	public ParametroFacturacionDefecto parametrofacturaciondefectoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroFacturacionDefecto parametrofacturaciondefectoTotales;
	public Long idParametroFacturacionDefectoActual;
	public Long iIdNuevoParametroFacturacionDefecto=0L;
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

	public String sFinalQueryComboTipoViaTransporte="";

	public List<TipoViaTransporte> tipoviatransportesForeignKey;

	public List<TipoViaTransporte> gettipoviatransportesForeignKey() {
		return tipoviatransportesForeignKey;
	}

	public void settipoviatransportesForeignKey(List<TipoViaTransporte> tipoviatransportesForeignKey) {
		this.tipoviatransportesForeignKey = tipoviatransportesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoViaTransporte tipoviatransporteForeignKey;

	public TipoViaTransporte gettipoviatransporteForeignKey() {
		return tipoviatransporteForeignKey;
	}

	public void settipoviatransporteForeignKey(TipoViaTransporte tipoviatransporteForeignKey) {
		this.tipoviatransporteForeignKey = tipoviatransporteForeignKey;
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
	
	public Boolean isPermisoTodoParametroFacturacionDefecto;
	public Boolean isPermisoNuevoParametroFacturacionDefecto;
	public Boolean isPermisoActualizarParametroFacturacionDefecto;
	public Boolean isPermisoActualizarOriginalParametroFacturacionDefecto;
	public Boolean isPermisoEliminarParametroFacturacionDefecto;
	public Boolean isPermisoGuardarCambiosParametroFacturacionDefecto;
	public Boolean isPermisoConsultaParametroFacturacionDefecto;
	public Boolean isPermisoBusquedaParametroFacturacionDefecto;
	public Boolean isPermisoReporteParametroFacturacionDefecto;
	public Boolean isPermisoPaginacionMedioParametroFacturacionDefecto;
	public Boolean isPermisoPaginacionAltoParametroFacturacionDefecto;
	public Boolean isPermisoPaginacionTodoParametroFacturacionDefecto;
	public Boolean isPermisoCopiarParametroFacturacionDefecto;
	public Boolean isPermisoVerFormParametroFacturacionDefecto;
	public Boolean isPermisoDuplicarParametroFacturacionDefecto;
	public Boolean isPermisoOrdenParametroFacturacionDefecto;
	
	
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
	
	public ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoReturnGeneral;
	public ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroFacturacionDefecto=false;
	public Boolean esParaAccionDesdeFormularioParametroFacturacionDefecto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroFacturacionDefectoSessionBeanAdditional parametrofacturaciondefectoSessionBeanAdditional=null;
	
	public ParametroFacturacionDefectoSessionBeanAdditional getParametroFacturacionDefectoSessionBeanAdditional() {
		return this.parametrofacturaciondefectoSessionBeanAdditional;
	}
	
	public void setParametroFacturacionDefectoSessionBeanAdditional(ParametroFacturacionDefectoSessionBeanAdditional parametrofacturaciondefectoSessionBeanAdditional) {
		try {
			this.parametrofacturaciondefectoSessionBeanAdditional=parametrofacturaciondefectoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional parametrofacturaciondefectoBeanSwingJInternalFrameAdditional=null;
	//public class ParametroFacturacionDefectoBeanSwingJInternalFrame
	
	public ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional getParametroFacturacionDefectoBeanSwingJInternalFrameAdditional() {
		return this.parametrofacturaciondefectoBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroFacturacionDefectoBeanSwingJInternalFrameAdditional(ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional parametrofacturaciondefectoBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrofacturaciondefectoBeanSwingJInternalFrameAdditional=parametrofacturaciondefectoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroFacturacionDefectoLogic parametrofacturaciondefectoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroFacturacionDefecto parametrofacturaciondefectoBean;
	public ParametroFacturacionDefectoConstantesFunciones parametrofacturaciondefectoConstantesFunciones;
	//public ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoViaTransporteLogic tipoviatransporteLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroFacturacionDefecto> parametrofacturaciondefectos;	
	//public List<ParametroFacturacionDefecto> parametrofacturaciondefectosEliminados;
	//public List<ParametroFacturacionDefecto> parametrofacturaciondefectosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaDuplicarParametroFacturacionDefecto=true;
	public Boolean isVisibilidadCeldaCopiarParametroFacturacionDefecto=true;
	public Boolean isVisibilidadCeldaVerFormParametroFacturacionDefecto=true;
	public Boolean isVisibilidadCeldaOrdenParametroFacturacionDefecto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaCancelarParametroFacturacionDefecto=false;
	public Boolean isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoViaTransporte=false;
	
	public Long getiIdNuevoParametroFacturacionDefecto() {
		return this.iIdNuevoParametroFacturacionDefecto;
	}

	public void setiIdNuevoParametroFacturacionDefecto(Long iIdNuevoParametroFacturacionDefecto) {
		this.iIdNuevoParametroFacturacionDefecto = iIdNuevoParametroFacturacionDefecto;
	}
	
	public Long getidParametroFacturacionDefectoActual() {
		return this.idParametroFacturacionDefectoActual;
	}

	public void setidParametroFacturacionDefectoActual(Long idParametroFacturacionDefectoActual) {
		this.idParametroFacturacionDefectoActual = idParametroFacturacionDefectoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroFacturacionDefecto getparametrofacturaciondefecto() {
		return this.parametrofacturaciondefecto;
	}

	public void setparametrofacturaciondefecto(ParametroFacturacionDefecto parametrofacturaciondefecto) {
		this.parametrofacturaciondefecto = parametrofacturaciondefecto;
	}
	
	public ParametroFacturacionDefecto getparametrofacturaciondefectoAux() {
		return this.parametrofacturaciondefectoAux;
	}

	public void setparametrofacturaciondefectoAux(ParametroFacturacionDefecto parametrofacturaciondefectoAux) {
		this.parametrofacturaciondefectoAux = parametrofacturaciondefectoAux;
	}				
	
	public ParametroFacturacionDefecto getparametrofacturaciondefectoAnterior() {
		return this.parametrofacturaciondefectoAnterior;
	}

	public void setparametrofacturaciondefectoAnterior(ParametroFacturacionDefecto parametrofacturaciondefectoAnterior) {
		this.parametrofacturaciondefectoAnterior = parametrofacturaciondefectoAnterior;
	}	
	
	public ParametroFacturacionDefecto getparametrofacturaciondefectoTotales() {
		return this.parametrofacturaciondefectoTotales;
	}

	public void setparametrofacturaciondefectoTotales(ParametroFacturacionDefecto parametrofacturaciondefectoTotales) {
		this.parametrofacturaciondefectoTotales = parametrofacturaciondefectoTotales;
	}	
	
	public ParametroFacturacionDefecto getparametrofacturaciondefectoBean() {
		return this.parametrofacturaciondefectoBean;
	}

	public void setparametrofacturaciondefectoBean(ParametroFacturacionDefecto parametrofacturaciondefectoBean) {
		this.parametrofacturaciondefectoBean = parametrofacturaciondefectoBean;
	}	
	
	public ParametroFacturacionDefectoParameterReturnGeneral getparametrofacturaciondefectoReturnGeneral() {
		return this.parametrofacturaciondefectoReturnGeneral;
	}

	public void setparametrofacturaciondefectoReturnGeneral(ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoReturnGeneral) {
		this.parametrofacturaciondefectoReturnGeneral = parametrofacturaciondefectoReturnGeneral;
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

	public Long id_tipo_via_transporteFK_IdTipoViaTransporte=-1L;

	public Long getid_tipo_via_transporteFK_IdTipoViaTransporte() {
		return this.id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

	public void setid_tipo_via_transporteFK_IdTipoViaTransporte(Long id_tipo_via_transporteFK_IdTipoViaTransporte) {
		this.id_tipo_via_transporteFK_IdTipoViaTransporte = id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroFacturacionDefectoLogic getParametroFacturacionDefectoLogic()	{		
		return parametrofacturaciondefectoLogic;
	}

	public void setParametroFacturacionDefectoLogic(ParametroFacturacionDefectoLogic parametrofacturaciondefectoLogic) {
		this.parametrofacturaciondefectoLogic = parametrofacturaciondefectoLogic;
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
	
	public Boolean getIsEsNuevoParametroFacturacionDefecto() {
		return isEsNuevoParametroFacturacionDefecto;
	}

	public void setIsEsNuevoParametroFacturacionDefecto(Boolean isEsNuevoParametroFacturacionDefecto) {
		this.isEsNuevoParametroFacturacionDefecto = isEsNuevoParametroFacturacionDefecto;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroFacturacionDefecto() {
		return esParaAccionDesdeFormularioParametroFacturacionDefecto;
	}
	
	public void setEsParaAccionDesdeFormularioParametroFacturacionDefecto(Boolean esParaAccionDesdeFormularioParametroFacturacionDefecto) {
		this.esParaAccionDesdeFormularioParametroFacturacionDefecto = esParaAccionDesdeFormularioParametroFacturacionDefecto;
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

			if(this.parametrofacturaciondefectoSessionBean==null) {
				this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
			}

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrofacturaciondefectoSessionBean.getlidEmpresaActual());
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

			if(this.parametrofacturaciondefectoSessionBean==null) {
				this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
			}

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parametrofacturaciondefectoSessionBean.getlidSucursalActual());
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

	public void cargarCombosTipoViaTransportesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoViaTransporteLogic tipoviatransporteLogic=new TipoViaTransporteLogic();

			//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

			if(this.parametrofacturaciondefectoSessionBean==null) {
				this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
			}

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

					tipoviatransporteLogic.getTodosTipoViaTransportesWithConnection(sFinalQuery,new Pagination());

					this.tipoviatransportesForeignKey=tipoviatransporteLogic.getTipoViaTransportes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoViaTransporte(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLogic.getEntityWithConnection(parametrofacturaciondefectoSessionBean.getlidTipoViaTransporteActual());
					this.tipoviatransportesForeignKey.add(tipoviatransporteLogic.getTipoViaTransporte());
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

					if(this.parametrofacturaciondefecto!=null) {
						this.parametrofacturaciondefecto.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroFacturacionDefecto.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroFacturacionDefectoGenerico)throws Exception
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
				jComboBoxid_empresaParametroFacturacionDefectoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroFacturacionDefectoGenerico!=null && jComboBoxid_empresaParametroFacturacionDefectoGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroFacturacionDefectoGenerico.setSelectedIndex(0);
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

					if(this.parametrofacturaciondefecto!=null) {
						this.parametrofacturaciondefecto.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroFacturacionDefectoGenerico)throws Exception
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
				jComboBoxid_sucursalParametroFacturacionDefectoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroFacturacionDefectoGenerico!=null && jComboBoxid_sucursalParametroFacturacionDefectoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroFacturacionDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoViaTransporteForeignKey(Long idTipoViaTransporteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoviatransporteTemp!=null) {

					if(this.parametrofacturaciondefecto!=null) {
						this.parametrofacturaciondefecto.setTipoViaTransporte(tipoviatransporteTemp);
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporteTemp);
					}
				} else {
					//jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporteTemp);
					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoviatransporteTemp!=null && jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto!=null) {
						jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporteTemp);
					} else {
						if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto!=null) {
							//jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporteTemp);
							if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.getItemCount()>0) {
								jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setSelectedIndex(0);
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

	public String getActualTipoViaTransporteForeignKeyDescripcion(Long idTipoViaTransporteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}


			sDescripcion=TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoViaTransporteForeignKeyGenerico(Long idTipoViaTransporteSeleccionado,JComboBox jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(tipoviatransporteTemp!=null) {
				jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico.setSelectedItem(tipoviatransporteTemp);
			} else {
				if(jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico!=null && jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico.getItemCount()>0) {
					jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroFacturacionDefecto parametrofacturaciondefecto,JComboBox jComboBoxid_empresaParametroFacturacionDefectoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroFacturacionDefectoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroFacturacionDefectoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrofacturaciondefecto.setid_empresa(empresaAux.getId());
				parametrofacturaciondefecto.setempresa_descripcion(ParametroFacturacionDefectoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrofacturaciondefecto.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroFacturacionDefecto parametrofacturaciondefecto,JComboBox jComboBoxid_sucursalParametroFacturacionDefectoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroFacturacionDefectoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroFacturacionDefectoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametrofacturaciondefecto.setid_sucursal(sucursalAux.getId());
				parametrofacturaciondefecto.setsucursal_descripcion(ParametroFacturacionDefectoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametrofacturaciondefecto.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoViaTransporteForeignKey(ParametroFacturacionDefecto parametrofacturaciondefecto,JComboBox jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteAux=new TipoViaTransporte();

			if(jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico==null) {
				tipoviatransporteAux=(TipoViaTransporte)this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getSelectedItem();
			} else {
				tipoviatransporteAux=(TipoViaTransporte)jComboBoxid_tipo_via_transporteParametroFacturacionDefectoGenerico.getSelectedItem();
			}

			if(tipoviatransporteAux!=null && tipoviatransporteAux.getId()!=null) {
				parametrofacturaciondefecto.setid_tipo_via_transporte(tipoviatransporteAux.getId());
				parametrofacturaciondefecto.settipoviatransporte_descripcion(ParametroFacturacionDefectoConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteAux));
				parametrofacturaciondefecto.setTipoViaTransporte(tipoviatransporteAux);			}
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

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
					}

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
					}

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoViaTransportesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoViaTransporte=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.addItem(tipoviatransporte);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { 
					}

					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.addItem(tipoviatransporte);
							}
						}

						if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoViaTransporteForeignKey(TipoViaTransporte tipoviatransporte,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporte);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setSelectedItem(tipoviatransporte);
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroFacturacionDefecto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroFacturacionDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroFacturacionDefecto(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroFacturacionDefectoConstantesFunciones.refrescarForeignKeysDescripcionesParametroFacturacionDefecto(this.parametrofacturaciondefectos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoViaTransporte.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(this.parametrofacturaciondefectos);
			parametrofacturaciondefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroFacturacionDefectoParameterReturnGeneral getParametroFacturacionDefectoParameterGeneral() {
		return this.parametrofacturaciondefectoParameterGeneral;
	}
	
	public void setParametroFacturacionDefectoParameterGeneral(ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoParameterGeneral) {
		this.parametrofacturaciondefectoParameterGeneral = parametrofacturaciondefectoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroFacturacionDefecto() {
		return isPermisoTodoParametroFacturacionDefecto;
	}

	public void setIsPermisoTodoParametroFacturacionDefecto(Boolean isPermisoTodoParametroFacturacionDefecto) {
		this.isPermisoTodoParametroFacturacionDefecto = isPermisoTodoParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoNuevoParametroFacturacionDefecto() {
		return isPermisoNuevoParametroFacturacionDefecto;
	}

	public void setIsPermisoNuevoParametroFacturacionDefecto(Boolean isPermisoNuevoParametroFacturacionDefecto) {
		this.isPermisoNuevoParametroFacturacionDefecto = isPermisoNuevoParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoActualizarParametroFacturacionDefecto() {
		return isPermisoActualizarParametroFacturacionDefecto;
	}

	public void setIsPermisoActualizarParametroFacturacionDefecto(Boolean isPermisoActualizarParametroFacturacionDefecto) {
		this.isPermisoActualizarParametroFacturacionDefecto = isPermisoActualizarParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoEliminarParametroFacturacionDefecto() {
		return isPermisoEliminarParametroFacturacionDefecto;
	}

	public void setIsPermisoEliminarParametroFacturacionDefecto(Boolean isPermisoEliminarParametroFacturacionDefecto) {
		this.isPermisoEliminarParametroFacturacionDefecto = isPermisoEliminarParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoGuardarCambiosParametroFacturacionDefecto() {
		return isPermisoGuardarCambiosParametroFacturacionDefecto;
	}

	public void setIsPermisoGuardarCambiosParametroFacturacionDefecto(Boolean isPermisoGuardarCambiosParametroFacturacionDefecto) {
		this.isPermisoGuardarCambiosParametroFacturacionDefecto = isPermisoGuardarCambiosParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoConsultaParametroFacturacionDefecto() {
		return isPermisoConsultaParametroFacturacionDefecto;
	}

	public void setIsPermisoConsultaParametroFacturacionDefecto(Boolean isPermisoConsultaParametroFacturacionDefecto) {
		this.isPermisoConsultaParametroFacturacionDefecto = isPermisoConsultaParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoBusquedaParametroFacturacionDefecto() {
		return isPermisoBusquedaParametroFacturacionDefecto;
	}

	public void setIsPermisoBusquedaParametroFacturacionDefecto(Boolean isPermisoBusquedaParametroFacturacionDefecto) {
		this.isPermisoBusquedaParametroFacturacionDefecto = isPermisoBusquedaParametroFacturacionDefecto;
	}

	public Boolean getIsPermisoReporteParametroFacturacionDefecto() {
		return isPermisoReporteParametroFacturacionDefecto;
	}

	public void setIsPermisoReporteParametroFacturacionDefecto(Boolean isPermisoReporteParametroFacturacionDefecto) {
		this.isPermisoReporteParametroFacturacionDefecto = isPermisoReporteParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroFacturacionDefecto() {
		return isPermisoPaginacionMedioParametroFacturacionDefecto;
	}

	public void setIsPermisoPaginacionMedioParametroFacturacionDefecto(Boolean isPermisoPaginacionMedioParametroFacturacionDefecto) {
		this.isPermisoPaginacionMedioParametroFacturacionDefecto = isPermisoPaginacionMedioParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroFacturacionDefecto() {
		return isPermisoPaginacionTodoParametroFacturacionDefecto;
	}

	public void setIsPermisoPaginacionTodoParametroFacturacionDefecto(Boolean isPermisoPaginacionTodoParametroFacturacionDefecto) {
		this.isPermisoPaginacionTodoParametroFacturacionDefecto = isPermisoPaginacionTodoParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroFacturacionDefecto() {
		return isPermisoPaginacionAltoParametroFacturacionDefecto;
	}

	public void setIsPermisoPaginacionAltoParametroFacturacionDefecto(Boolean isPermisoPaginacionAltoParametroFacturacionDefecto) {
		this.isPermisoPaginacionAltoParametroFacturacionDefecto = isPermisoPaginacionAltoParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoCopiarParametroFacturacionDefecto() {
		return isPermisoCopiarParametroFacturacionDefecto;
	}

	public void setIsPermisoCopiarParametroFacturacionDefecto(Boolean isPermisoCopiarParametroFacturacionDefecto) {
		this.isPermisoCopiarParametroFacturacionDefecto = isPermisoCopiarParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoVerFormParametroFacturacionDefecto() {
		return isPermisoVerFormParametroFacturacionDefecto;
	}

	public void setIsPermisoVerFormParametroFacturacionDefecto(Boolean isPermisoVerFormParametroFacturacionDefecto) {
		this.isPermisoVerFormParametroFacturacionDefecto = isPermisoVerFormParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoDuplicarParametroFacturacionDefecto() {
		return isPermisoDuplicarParametroFacturacionDefecto;
	}

	public void setIsPermisoDuplicarParametroFacturacionDefecto(Boolean isPermisoDuplicarParametroFacturacionDefecto) {
		this.isPermisoDuplicarParametroFacturacionDefecto = isPermisoDuplicarParametroFacturacionDefecto;
	}
	
	public Boolean getIsPermisoOrdenParametroFacturacionDefecto() {
		return isPermisoOrdenParametroFacturacionDefecto;
	}

	public void setIsPermisoOrdenParametroFacturacionDefecto(Boolean isPermisoOrdenParametroFacturacionDefecto) {
		this.isPermisoOrdenParametroFacturacionDefecto = isPermisoOrdenParametroFacturacionDefecto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroFacturacionDefecto() {
		return isVisibilidadCeldaNuevoParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaNuevoParametroFacturacionDefecto(Boolean isVisibilidadCeldaNuevoParametroFacturacionDefecto) {
		this.isVisibilidadCeldaNuevoParametroFacturacionDefecto = isVisibilidadCeldaNuevoParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroFacturacionDefecto() {
		return isVisibilidadCeldaDuplicarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaDuplicarParametroFacturacionDefecto(Boolean isVisibilidadCeldaDuplicarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto = isVisibilidadCeldaDuplicarParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroFacturacionDefecto() {
		return isVisibilidadCeldaCopiarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaCopiarParametroFacturacionDefecto(Boolean isVisibilidadCeldaCopiarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaCopiarParametroFacturacionDefecto = isVisibilidadCeldaCopiarParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroFacturacionDefecto() {
		return isVisibilidadCeldaVerFormParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaVerFormParametroFacturacionDefecto(Boolean isVisibilidadCeldaVerFormParametroFacturacionDefecto) {
		this.isVisibilidadCeldaVerFormParametroFacturacionDefecto = isVisibilidadCeldaVerFormParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroFacturacionDefecto() {
		return isVisibilidadCeldaOrdenParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaOrdenParametroFacturacionDefecto(Boolean isVisibilidadCeldaOrdenParametroFacturacionDefecto) {
		this.isVisibilidadCeldaOrdenParametroFacturacionDefecto = isVisibilidadCeldaOrdenParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto() {
		return isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto(Boolean isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto) {
		this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto = isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroFacturacionDefecto() {
		return isVisibilidadCeldaModificarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaModificarParametroFacturacionDefecto(Boolean isVisibilidadCeldaModificarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaModificarParametroFacturacionDefecto = isVisibilidadCeldaModificarParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroFacturacionDefecto() {
		return isVisibilidadCeldaActualizarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaActualizarParametroFacturacionDefecto(Boolean isVisibilidadCeldaActualizarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaActualizarParametroFacturacionDefecto = isVisibilidadCeldaActualizarParametroFacturacionDefecto;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroFacturacionDefecto() {
		return isVisibilidadCeldaEliminarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaEliminarParametroFacturacionDefecto(Boolean isVisibilidadCeldaEliminarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaEliminarParametroFacturacionDefecto = isVisibilidadCeldaEliminarParametroFacturacionDefecto;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroFacturacionDefecto() {
		return isVisibilidadCeldaCancelarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaCancelarParametroFacturacionDefecto(Boolean isVisibilidadCeldaCancelarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaCancelarParametroFacturacionDefecto = isVisibilidadCeldaCancelarParametroFacturacionDefecto;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroFacturacionDefecto() {
		return isVisibilidadCeldaGuardarParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaGuardarParametroFacturacionDefecto(Boolean isVisibilidadCeldaGuardarParametroFacturacionDefecto) {
		this.isVisibilidadCeldaGuardarParametroFacturacionDefecto = isVisibilidadCeldaGuardarParametroFacturacionDefecto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto() {
		return isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto(Boolean isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto) {
		this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto = isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto;
	}
		
	public ParametroFacturacionDefectoSessionBean getparametrofacturaciondefectoSessionBean() {
		return this.parametrofacturaciondefectoSessionBean;
	}
	
	public void setparametrofacturaciondefectoSessionBean(ParametroFacturacionDefectoSessionBean parametrofacturaciondefectoSessionBean) {
		this.parametrofacturaciondefectoSessionBean=parametrofacturaciondefectoSessionBean;
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

	public Boolean getisVisibilidadFK_IdTipoViaTransporte() {
		return this.isVisibilidadFK_IdTipoViaTransporte;
	}

	public void setisVisibilidadFK_IdTipoViaTransporte(Boolean isVisibilidadFK_IdTipoViaTransporte) {
		this.isVisibilidadFK_IdTipoViaTransporte=isVisibilidadFK_IdTipoViaTransporte;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrofacturaciondefecto,null);
				this.setActualParaGuardarSucursalForeignKey(parametrofacturaciondefecto,null);
				this.setActualParaGuardarTipoViaTransporteForeignKey(parametrofacturaciondefecto,null);
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
	
	public void bugActualizarReferenciaActual(ParametroFacturacionDefecto parametrofacturaciondefecto,ParametroFacturacionDefecto parametrofacturaciondefectoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroFacturacionDefecto(parametrofacturaciondefecto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrofacturaciondefectoAux.setId(parametrofacturaciondefecto.getId());
		parametrofacturaciondefectoAux.setVersionRow(parametrofacturaciondefecto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroFacturacionDefecto();
		
			int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrofacturaciondefectoValidator.getInvalidValues(this.parametrofacturaciondefecto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrofacturaciondefectoLogic.setDatosCliente(datosCliente);
			parametrofacturaciondefectoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrofacturaciondefectoAux=new  ParametroFacturacionDefecto();
				
				parametrofacturaciondefectoAux.setIsNew(true);
				parametrofacturaciondefectoAux.setIsChanged(true);
				
				parametrofacturaciondefectoAux.setParametroFacturacionDefectoOriginal(this.parametrofacturaciondefecto);
				
				parametrofacturaciondefectoAux.setId(this.parametrofacturaciondefecto.getId());	
				parametrofacturaciondefectoAux.setVersionRow(this.parametrofacturaciondefecto.getVersionRow());	
				parametrofacturaciondefectoAux.setid_empresa(this.parametrofacturaciondefecto.getid_empresa());	
				parametrofacturaciondefectoAux.setid_sucursal(this.parametrofacturaciondefecto.getid_sucursal());	
				parametrofacturaciondefectoAux.setid_tipo_via_transporte(this.parametrofacturaciondefecto.getid_tipo_via_transporte());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.saveParametroFacturacionDefectos();//WithConnection
						//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroFacturacionDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofacturaciondefectoLogic.saveParametroFacturacionDefectoRelaciones(parametrofacturaciondefectoAux);//WithConnection
								//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrofacturaciondefectoAux=new  ParametroFacturacionDefecto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() && this.parametrofacturaciondefecto.getId()>=0)) {
						
					parametrofacturaciondefectoAux.setIsNew(false);
				}
				
				parametrofacturaciondefectoAux.setIsDeleted(false);
			
				parametrofacturaciondefectoAux.setId(this.parametrofacturaciondefecto.getId());	
				parametrofacturaciondefectoAux.setVersionRow(this.parametrofacturaciondefecto.getVersionRow());	
				parametrofacturaciondefectoAux.setid_empresa(this.parametrofacturaciondefecto.getid_empresa());	
				parametrofacturaciondefectoAux.setid_sucursal(this.parametrofacturaciondefecto.getid_sucursal());	
				parametrofacturaciondefectoAux.setid_tipo_via_transporte(this.parametrofacturaciondefecto.getid_tipo_via_transporte());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.saveParametroFacturacionDefectos();//WithConnection
						//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);
					
					this.refrescarForeignKeysDescripcionesParametroFacturacionDefecto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofacturaciondefectoLogic.saveParametroFacturacionDefectoRelaciones(parametrofacturaciondefectoAux);//WithConnection
								//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrofacturaciondefecto,parametrofacturaciondefectoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrofacturaciondefectoAux=new  ParametroFacturacionDefecto();
				
				parametrofacturaciondefectoAux.setIsNew(false);
				parametrofacturaciondefectoAux.setIsChanged(false);
				
				parametrofacturaciondefectoAux.setIsDeleted(true);
				
				parametrofacturaciondefectoAux.setId(this.parametrofacturaciondefecto.getId());	
				parametrofacturaciondefectoAux.setVersionRow(this.parametrofacturaciondefecto.getVersionRow());	
				parametrofacturaciondefectoAux.setid_empresa(this.parametrofacturaciondefecto.getid_empresa());	
				parametrofacturaciondefectoAux.setid_sucursal(this.parametrofacturaciondefecto.getid_sucursal());	
				parametrofacturaciondefectoAux.setid_tipo_via_transporte(this.parametrofacturaciondefecto.getid_tipo_via_transporte());	
				
				if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrofacturaciondefectoAux.getId()>=0) {	
						this.parametrofacturaciondefectosEliminados.add(parametrofacturaciondefectoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.saveParametroFacturacionDefectos();//WithConnection
						//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrofacturaciondefectoLogic.saveParametroFacturacionDefectoRelaciones(parametrofacturaciondefectoAux);//WithConnection
								//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
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
							if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrofacturaciondefectoAux,parametrofacturaciondefectos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().addAll(this.parametrofacturaciondefectosEliminados);
					
					parametrofacturaciondefectoLogic.saveParametroFacturacionDefectos();//WithConnection
					//parametrofacturaciondefectoLogic.getSetVersionRowParametroFacturacionDefectos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroFacturacionDefecto();
				
				this.parametrofacturaciondefectosEliminados= new ArrayList<ParametroFacturacionDefecto>();		
			}
			
			if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Facturacion Defecto GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrofacturaciondefecto=parametrofacturaciondefectoAux;
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
      		//this.finishProcessParametroFacturacionDefecto();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroFacturacionDefecto parametrofacturaciondefectoLocal) throws Exception {
		
		if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroFacturacionDefecto parametrofacturaciondefectoLocal) throws Exception {	
		if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrofacturaciondefectoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametrofacturaciondefectoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoViaTransporteDetalleFormJInternalFrame.class)) {
				TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrameLocal=(TipoViaTransporteBeanSwingJInternalFrame) ((TipoViaTransporteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoviatransporteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.gettipoviatransporte(),true);
				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarLista(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte,this.tipoviatransportesForeignKey);

				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				parametrofacturaciondefectoLocal.setTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey("Formulario");
				this.setActualTipoViaTransporteForeignKey(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroFacturacionDefectoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrofacturaciondefectoValidator.getInvalidValues(this.parametrofacturaciondefecto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroFacturacionDefecto parametrofacturaciondefecto,List<ParametroFacturacionDefecto> parametrofacturaciondefectos) throws Exception {
		try	{		
			ParametroFacturacionDefectoConstantesFunciones.actualizarLista(parametrofacturaciondefecto,parametrofacturaciondefectos,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroFacturacionDefecto parametrofacturaciondefecto,List<ParametroFacturacionDefecto> parametrofacturaciondefectos) throws Exception {
		try	{			
			ParametroFacturacionDefectoConstantesFunciones.actualizarSelectedLista(parametrofacturaciondefecto,parametrofacturaciondefectos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroFacturacionDefecto> parametrofacturaciondefectosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrofacturaciondefectosLocal=this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrofacturaciondefectosLocal=this.parametrofacturaciondefectos;
			}
			//ARCHITECTURE
		
			for(ParametroFacturacionDefecto parametrofacturaciondefectoLocal:parametrofacturaciondefectosLocal) {
				if(this.permiteMantenimiento(parametrofacturaciondefectoLocal) && parametrofacturaciondefectoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroFacturacionDefectoConstantesFunciones.getParametroFacturacionDefectoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroFacturacionDefectoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_empresaParametroFacturacionDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroFacturacionDefectoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_sucursalParametroFacturacionDefecto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroFacturacionDefectoConstantesFunciones.IDTIPOVIATRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_tipo_via_transporteParametroFacturacionDefecto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_empresaParametroFacturacionDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_sucursalParametroFacturacionDefecto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelid_tipo_via_transporteParametroFacturacionDefecto,"");
		
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
		this.iIdNuevoParametroFacturacionDefecto--;	
		
		
		this.parametrofacturaciondefectoAux=new ParametroFacturacionDefecto();
		
		this.parametrofacturaciondefectoAux.setId(this.iIdNuevoParametroFacturacionDefecto);
		this.parametrofacturaciondefectoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().add(this.parametrofacturaciondefectoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrofacturaciondefectos.add(this.parametrofacturaciondefectoAux);
		}
		//ARCHITECTURE
		
		this.parametrofacturaciondefecto=this.parametrofacturaciondefectoAux;
		
		if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefecto);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroFacturacionDefecto(this.parametrofacturaciondefecto);
		}
				
		//this.setDefaultControlesParametroFacturacionDefecto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroFacturacionDefecto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroFacturacionDefecto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFacturacionDefecto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefectoBean,this.parametrofacturaciondefecto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
			classes=ParametroFacturacionDefectoConstantesFunciones.getClassesRelationshipsOfParametroFacturacionDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.procesarEventosParametroFacturacionDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this.parametrofacturaciondefecto,this.parametrofacturaciondefectoParameterGeneral,this.isEsNuevoParametroFacturacionDefecto,classes);//this.parametrofacturaciondefectoLogic.getParametroFacturacionDefecto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral,this.parametrofacturaciondefectoBean,false);
		
		if(this.parametrofacturaciondefectoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto());
		}
		
		if(this.parametrofacturaciondefectoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto(),classes);//this.parametrofacturaciondefectoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroFacturacionDefecto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroFacturacionDefecto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.RecargarFormParametroFacturacionDefecto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
						
			if(parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFacturacionDefecto();
			}
			
			this.actualizarVisualTableDatosParametroFacturacionDefecto();
			
			this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroFacturacionDefecto(), this.getIndiceNuevoParametroFacturacionDefecto());
			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
						
			this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroFacturacionDefecto(Boolean isHabilitar) throws Exception {
			
		//
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setEnabled(isHabilitar && this.parametrofacturaciondefectoConstantesFunciones.activarid_empresaParametroFacturacionDefecto);//
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setEnabled(isHabilitar && this.parametrofacturaciondefectoConstantesFunciones.activarid_sucursalParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setEnabled(isHabilitar && this.parametrofacturaciondefectoConstantesFunciones.activarid_tipo_via_transporteParametroFacturacionDefecto);
	};
	
	public void setDefaultControlesParametroFacturacionDefecto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroFacturacionDefecto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(true);			
			this.parametrofacturaciondefectoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.setVisible(true);
			
					
		} else {
			//this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(false);			
			this.parametrofacturaciondefectoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroFacturacionDefecto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				if(parametrofacturaciondefectoAux.getId().equals(this.iIdNuevoParametroFacturacionDefecto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectos) {
				if(parametrofacturaciondefectoAux.getId().equals(this.iIdNuevoParametroFacturacionDefecto)) {
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
	
	public int getIndiceActualParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				if(parametrofacturaciondefectoAux.getId().equals(parametrofacturaciondefecto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectos) {
				if(parametrofacturaciondefectoAux.getId().equals(parametrofacturaciondefecto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefectoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				if(parametrofacturaciondefectoAux.getParametroFacturacionDefectoOriginal().getId().equals(parametrofacturaciondefectoOriginal.getId())) {
					existe=true;
					parametrofacturaciondefectoOriginal.setId(parametrofacturaciondefectoAux.getId());
					parametrofacturaciondefectoOriginal.setVersionRow(parametrofacturaciondefectoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectos) {
				if(parametrofacturaciondefectoAux.getParametroFacturacionDefectoOriginal().getId().equals(parametrofacturaciondefectoOriginal.getId())) {
					existe=true;
					parametrofacturaciondefectoOriginal.setId(parametrofacturaciondefectoAux.getId());
					parametrofacturaciondefectoOriginal.setVersionRow(parametrofacturaciondefectoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroFacturacionDefecto(Boolean esParaCancelar) throws Exception {
		parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
		parametrofacturaciondefectoAux=new ParametroFacturacionDefecto();
		
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
					if(parametrofacturaciondefectoAux.getId()<0) {
						parametrofacturaciondefectosAux.add(parametrofacturaciondefectoAux);
					}		
				}
				this.iIdNuevoParametroFacturacionDefecto=0L;
				this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().removeAll(parametrofacturaciondefectosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectos) {
					if(parametrofacturaciondefectoAux.getId()<0) {
						parametrofacturaciondefectosAux.add(parametrofacturaciondefectoAux);
					}		
				}
				this.iIdNuevoParametroFacturacionDefecto=0L;
				this.parametrofacturaciondefectos.removeAll(parametrofacturaciondefectosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroFacturacionDefecto 
					&& this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()>0
					) {
					parametrofacturaciondefectoAux=this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().get(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size() - 1);
				
					if(parametrofacturaciondefectoAux.getId()<0) {
						this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().remove(parametrofacturaciondefectoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroFacturacionDefecto && this.parametrofacturaciondefectos.size()>0) {
					parametrofacturaciondefectoAux=this.parametrofacturaciondefectos.get(this.parametrofacturaciondefectos.size() - 1);
				
					if(parametrofacturaciondefectoAux.getId()<0) {
						this.parametrofacturaciondefectos.remove(parametrofacturaciondefectoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroFacturacionDefecto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrofacturaciondefecto.getId()<0) {
				this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().remove(this.parametrofacturaciondefecto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrofacturaciondefecto.getId()<0) {
				this.parametrofacturaciondefectos.remove(this.parametrofacturaciondefecto);
			}
		}			
	}
	
	public void setEstadosInicialesParametroFacturacionDefecto(List<ParametroFacturacionDefecto> parametrofacturaciondefectosAux) throws Exception {
		ParametroFacturacionDefectoConstantesFunciones.setEstadosInicialesParametroFacturacionDefecto(parametrofacturaciondefectosAux);
	}
	
	public void setEstadosInicialesParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefectoAux) throws Exception {
		ParametroFacturacionDefectoConstantesFunciones.setEstadosInicialesParametroFacturacionDefecto(parametrofacturaciondefectoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroFacturacionDefectoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroFacturacionDefectoActual()) {
				if(!this.isEsNuevoParametroFacturacionDefecto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroFacturacionDefecto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroFacturacionDefectoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Facturacion Defecto ?", "MANTENIMIENTO DE Parametro Facturacion Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroFacturacionDefecto parametrofacturaciondefecto) throws Exception {
		ParametroFacturacionDefectoConstantesFunciones.seleccionarAsignar(this.parametrofacturaciondefecto,parametrofacturaciondefecto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroFacturacionDefecto=this.isPermisoActualizarOriginalParametroFacturacionDefecto;
			
			
			this.seleccionarAsignar(parametrofacturaciondefecto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroFacturacionDefectoConstantesFunciones.quitarEspaciosParametroFacturacionDefecto(this.parametrofacturaciondefecto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrofacturaciondefectoSessionBean.setsFuncionBusquedaRapida(this.parametrofacturaciondefectoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroFacturacionDefecto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroFacturacionDefecto(esParaCancelar);				
				this.cancelarNuevoParametroFacturacionDefecto(esParaCancelar);								
			}
			
			this.parametrofacturaciondefecto=new ParametroFacturacionDefecto();
			
			this.inicializarParametroFacturacionDefecto();
			
			this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroFacturacionDefecto() throws Exception {
		try {
			ParametroFacturacionDefectoConstantesFunciones.inicializarParametroFacturacionDefecto(this.parametrofacturaciondefecto);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroFacturacionDefectos(String sAccionBusqueda,List<ParametroFacturacionDefecto> parametrofacturaciondefectosParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroFacturacionDefecto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroFacturacionDefectoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroFacturacionDefectoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroFacturacionDefecto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Facturacion Defectos");		
		parameters.put("busquedapor", ParametroFacturacionDefectoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroFacturacionDefecto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroFacturacionDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroFacturacionDefectoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroFacturacionDefecto=new JRBeanArrayDataSource(ParametroFacturacionDefectoJInternalFrame.TraerParametroFacturacionDefectoBeans(parametrofacturaciondefectosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroFacturacionDefecto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroFacturacionDefectoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroFacturacionDefectoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroFacturacionDefectoBean.TraerParametroFacturacionDefectoBeans(parametrofacturaciondefectosParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefectoActionPerformed(null);
					//this.generarExcelReporteParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroFacturacionDefectos(sAccionBusqueda,sTipoArchivoReporte,parametrofacturaciondefectosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroFacturacionDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFacturacionDefecto> parametrofacturaciondefectosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFacturacionDefectos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroFacturacionDefecto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroFacturacionDefecto parametrofacturaciondefecto : parametrofacturaciondefectosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroFacturacionDefectoConstantesFunciones.generarExcelReporteDataParametroFacturacionDefecto("NORMAL",row,workbook,parametrofacturaciondefecto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroFacturacionDefecto(String sTipo,Row row,Workbook workbook) {
		
		ParametroFacturacionDefectoConstantesFunciones.generarExcelReporteHeaderParametroFacturacionDefecto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroFacturacionDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFacturacionDefecto> parametrofacturaciondefectosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFacturacionDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroFacturacionDefecto parametrofacturaciondefecto : parametrofacturaciondefectosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.getParametroFacturacionDefectoDescripcion(parametrofacturaciondefecto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrofacturaciondefecto.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrofacturaciondefecto.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrofacturaciondefecto.gettipoviatransporte_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroFacturacionDefectos(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroFacturacionDefecto> parametrofacturaciondefectosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroFacturacionDefecto> parametrofacturaciondefectosRespaldo=null;
		
		classes=ParametroFacturacionDefectoConstantesFunciones.getClassesRelationshipsOfParametroFacturacionDefecto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrofacturaciondefectoLogic.setDatosCliente(this.datosCliente);
		this.parametrofacturaciondefectoLogic.setDatosDeep(this.datosDeep);
		this.parametrofacturaciondefectoLogic.setIsConDeep(true);
		
		parametrofacturaciondefectosRespaldo=this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos();
		
		this.parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(parametrofacturaciondefectosParaReportes);	
		this.parametrofacturaciondefectoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrofacturaciondefectosParaReportes=this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos();
		this.parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(parametrofacturaciondefectosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroFacturacionDefectos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroFacturacionDefecto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroFacturacionDefecto parametrofacturaciondefecto : parametrofacturaciondefectosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroFacturacionDefecto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroFacturacionDefectoConstantesFunciones.generarExcelReporteDataParametroFacturacionDefecto("NORMAL",row,workbook,parametrofacturaciondefecto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.getParametroFacturacionDefectoDescripcion(parametrofacturaciondefecto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroFacturacionDefecto() throws Exception {		
		this.startProcessParametroFacturacionDefecto(true);
	}
	
	public void startProcessParametroFacturacionDefecto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroFacturacionDefecto ,this.jPanelParametrosReportesParametroFacturacionDefecto, this.jScrollPanelDatosParametroFacturacionDefecto,this.jPanelPaginacionParametroFacturacionDefecto, this.jScrollPanelDatosEdicionParametroFacturacionDefecto, this.jPanelAccionesParametroFacturacionDefecto,this.jPanelAccionesFormularioParametroFacturacionDefecto,this.jmenuBarParametroFacturacionDefecto,this.jmenuBarDetalleParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroFacturacionDefecto=this.jTabbedPaneBusquedasParametroFacturacionDefecto; 
		
		final JPanel jPanelParametrosReportesParametroFacturacionDefecto=this.jPanelParametrosReportesParametroFacturacionDefecto;
		//final JScrollPane jScrollPanelDatosParametroFacturacionDefecto=this.jScrollPanelDatosParametroFacturacionDefecto;
		final JTable jTableDatosParametroFacturacionDefecto=this.jTableDatosParametroFacturacionDefecto;		
		final JPanel jPanelPaginacionParametroFacturacionDefecto=this.jPanelPaginacionParametroFacturacionDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroFacturacionDefecto=this.jScrollPanelDatosEdicionParametroFacturacionDefecto;
		final JPanel jPanelAccionesParametroFacturacionDefecto=this.jPanelAccionesParametroFacturacionDefecto;
		
		JPanel jPanelCamposAuxiliarParametroFacturacionDefecto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			jPanelCamposAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelCamposParametroFacturacionDefecto;
			jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelAccionesFormularioParametroFacturacionDefecto;
		}
		
		final JPanel jPanelCamposParametroFacturacionDefecto=jPanelCamposAuxiliarParametroFacturacionDefecto;
		final JPanel jPanelAccionesFormularioParametroFacturacionDefecto=jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto;
		
		
		final JMenuBar jmenuBarParametroFacturacionDefecto=this.jmenuBarParametroFacturacionDefecto;
		final JToolBar jTtoolBarParametroFacturacionDefecto=this.jTtoolBarParametroFacturacionDefecto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroFacturacionDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroFacturacionDefecto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jmenuBarDetalleParametroFacturacionDefecto;
			jTtoolBarDetalleAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTtoolBarDetalleParametroFacturacionDefecto;
		}
		
		final JMenuBar jmenuBarDetalleParametroFacturacionDefecto=jmenuBarDetalleAuxiliarParametroFacturacionDefecto;
		final JToolBar jTtoolBarDetalleParametroFacturacionDefecto=jTtoolBarDetalleAuxiliarParametroFacturacionDefecto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroFacturacionDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroFacturacionDefecto;
			processRunnable.jTableDatos=jTableDatosParametroFacturacionDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroFacturacionDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroFacturacionDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroFacturacionDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroFacturacionDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroFacturacionDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroFacturacionDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroFacturacionDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroFacturacionDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroFacturacionDefecto ,jPanelParametrosReportesParametroFacturacionDefecto,jTableDatosParametroFacturacionDefecto, /*jScrollPanelDatosParametroFacturacionDefecto,*/jPanelCamposParametroFacturacionDefecto,jPanelPaginacionParametroFacturacionDefecto, /*jScrollPanelDatosEdicionParametroFacturacionDefecto,*/ jPanelAccionesParametroFacturacionDefecto,jPanelAccionesFormularioParametroFacturacionDefecto,jmenuBarParametroFacturacionDefecto,jmenuBarDetalleParametroFacturacionDefecto,jTtoolBarParametroFacturacionDefecto,jTtoolBarDetalleParametroFacturacionDefecto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroFacturacionDefecto ,jPanelParametrosReportesParametroFacturacionDefecto, jScrollPanelDatosParametroFacturacionDefecto,jPanelPaginacionParametroFacturacionDefecto, jScrollPanelDatosEdicionParametroFacturacionDefecto, jPanelAccionesParametroFacturacionDefecto,jPanelAccionesFormularioParametroFacturacionDefecto,jmenuBarParametroFacturacionDefecto,jmenuBarDetalleParametroFacturacionDefecto,jTtoolBarParametroFacturacionDefecto,jTtoolBarDetalleParametroFacturacionDefecto);
						
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
	
	public void finishProcessParametroFacturacionDefecto() {// throws Exception 
		this.finishProcessParametroFacturacionDefecto(true);
	}
	
	public void finishProcessParametroFacturacionDefecto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroFacturacionDefecto ,this.jPanelParametrosReportesParametroFacturacionDefecto, this.jScrollPanelDatosParametroFacturacionDefecto,this.jPanelPaginacionParametroFacturacionDefecto, this.jScrollPanelDatosEdicionParametroFacturacionDefecto, this.jPanelAccionesParametroFacturacionDefecto,this.jPanelAccionesFormularioParametroFacturacionDefecto,this.jmenuBarParametroFacturacionDefecto,this.jmenuBarDetalleParametroFacturacionDefecto,this.jTtoolBarParametroFacturacionDefecto,this.jTtoolBarDetalleParametroFacturacionDefecto);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroFacturacionDefecto=this.jTabbedPaneBusquedasParametroFacturacionDefecto; 
		
		final JPanel jPanelParametrosReportesParametroFacturacionDefecto=this.jPanelParametrosReportesParametroFacturacionDefecto;
		//final JScrollPane jScrollPanelDatosParametroFacturacionDefecto=this.jScrollPanelDatosParametroFacturacionDefecto;
		final JTable jTableDatosParametroFacturacionDefecto=this.jTableDatosParametroFacturacionDefecto;		
		final JPanel jPanelPaginacionParametroFacturacionDefecto=this.jPanelPaginacionParametroFacturacionDefecto;
		//final JScrollPane jScrollPanelDatosEdicionParametroFacturacionDefecto=this.jScrollPanelDatosEdicionParametroFacturacionDefecto;
		final JPanel jPanelAccionesParametroFacturacionDefecto=this.jPanelAccionesParametroFacturacionDefecto;
		
		JPanel jPanelCamposAuxiliarParametroFacturacionDefecto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			jPanelCamposAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelCamposParametroFacturacionDefecto;
			jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelAccionesFormularioParametroFacturacionDefecto;
		}
		
		final JPanel jPanelCamposParametroFacturacionDefecto=jPanelCamposAuxiliarParametroFacturacionDefecto;
		final JPanel jPanelAccionesFormularioParametroFacturacionDefecto=jPanelAccionesFormularioAuxiliarParametroFacturacionDefecto;
		
		
		final JMenuBar jmenuBarParametroFacturacionDefecto=this.jmenuBarParametroFacturacionDefecto;		
		final JToolBar jTtoolBarParametroFacturacionDefecto=this.jTtoolBarParametroFacturacionDefecto;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroFacturacionDefecto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroFacturacionDefecto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			jmenuBarDetalleAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jmenuBarDetalleParametroFacturacionDefecto;
			jTtoolBarDetalleAuxiliarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTtoolBarDetalleParametroFacturacionDefecto;		
		}
		
		final JMenuBar jmenuBarDetalleParametroFacturacionDefecto=jmenuBarDetalleAuxiliarParametroFacturacionDefecto;
		final JToolBar jTtoolBarDetalleParametroFacturacionDefecto=jTtoolBarDetalleAuxiliarParametroFacturacionDefecto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroFacturacionDefecto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroFacturacionDefecto;
			processRunnable.jTableDatos=jTableDatosParametroFacturacionDefecto;
			processRunnable.jPanelCampos=jPanelCamposParametroFacturacionDefecto;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroFacturacionDefecto;
			processRunnable.jPanelAcciones=jPanelAccionesParametroFacturacionDefecto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroFacturacionDefecto;
			
			
			processRunnable.jmenuBar=jmenuBarParametroFacturacionDefecto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroFacturacionDefecto;
			processRunnable.jTtoolBar=jTtoolBarParametroFacturacionDefecto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroFacturacionDefecto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroFacturacionDefecto ,jPanelParametrosReportesParametroFacturacionDefecto, jTableDatosParametroFacturacionDefecto,/*jScrollPanelDatosParametroFacturacionDefecto,*/jPanelCamposParametroFacturacionDefecto,jPanelPaginacionParametroFacturacionDefecto, /*jScrollPanelDatosEdicionParametroFacturacionDefecto,*/ jPanelAccionesParametroFacturacionDefecto,jPanelAccionesFormularioParametroFacturacionDefecto,jmenuBarParametroFacturacionDefecto,jmenuBarDetalleParametroFacturacionDefecto,jTtoolBarParametroFacturacionDefecto,jTtoolBarDetalleParametroFacturacionDefecto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroFacturacionDefecto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroFacturacionDefecto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroFacturacionDefecto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroFacturacionDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroFacturacionDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroFacturacionDefecto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroFacturacionDefecto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroFacturacionDefecto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroFacturacionDefecto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrofacturaciondefectoConstantesFunciones.getsFinalQueryParametroFacturacionDefecto();
		String  finalQueryPaginacionTodos=this.parametrofacturaciondefectoConstantesFunciones.getsFinalQueryParametroFacturacionDefecto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroFacturacionDefectoConstantesFunciones.getArrayColumnasGlobalesNoParametroFacturacionDefecto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroFacturacionDefectoConstantesFunciones.getArrayColumnasGlobalesParametroFacturacionDefecto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroFacturacionDefectoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrofacturaciondefectosEliminados= new ArrayList<ParametroFacturacionDefecto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroFacturacionDefecto();
		
				///*ParametroFacturacionDefectoSessionBean*/this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
			
			if(this.parametrofacturaciondefectoSessionBean==null) {
				this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
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
					this.iNumeroPaginacion=ParametroFacturacionDefectoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroFacturacionDefectoConstantesFunciones.getClassesForeignKeysOfParametroFacturacionDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrofacturaciondefecto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrofacturaciondefectosAux= new ArrayList<ParametroFacturacionDefecto>();
			
				
			parametrofacturaciondefectoLogic.setDatosCliente(this.datosCliente);
			parametrofacturaciondefectoLogic.setDatosDeep(this.datosDeep);
			parametrofacturaciondefectoLogic.setIsConDeep(true);
			
			
			parametrofacturaciondefectoLogic.getParametroFacturacionDefectoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrofacturaciondefectoLogic.getTodosParametroFacturacionDefectos(finalQueryGlobal,pagination);
					
					//parametrofacturaciondefectoLogic.getTodosParametroFacturacionDefectosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()==null|| parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofacturaciondefectosAux= new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectosAux= new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofacturaciondefectoLogic.getTodosParametroFacturacionDefectos(finalQueryGlobal+"",this.pagination);												
							
							//parametrofacturaciondefectoLogic.getTodosParametroFacturacionDefectosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectoLogic.getParametroFacturacionDefectos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(new ArrayList<ParametroFacturacionDefecto>());					
							parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().addAll(parametrofacturaciondefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectos.addAll(parametrofacturaciondefectosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroFacturacionDefecto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroFacturacionDefecto=this.idActual;
				
				} else if(this.idParametroFacturacionDefectoActual!=null && this.idParametroFacturacionDefectoActual!=0L) {
					idParametroFacturacionDefecto=idParametroFacturacionDefectoActual;
				}
				
					
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndicePorId(idParametroFacturacionDefecto);
				
				this.parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrofacturaciondefectoLogic.getEntity(idParametroFacturacionDefecto);
					
					//parametrofacturaciondefectoLogic.getEntityWithConnection(idParametroFacturacionDefecto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(new ArrayList<ParametroFacturacionDefecto>());
					parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().add(parametrofacturaciondefectoLogic.getParametroFacturacionDefecto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
					this.parametrofacturaciondefectos.add(parametrofacturaciondefecto);
				}
				
				if(parametrofacturaciondefectoLogic.getParametroFacturacionDefecto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()==null||parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrofacturaciondefectos==null|| parametrofacturaciondefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
						parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroFacturacionDefectos("FK_IdEmpresa",parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroFacturacionDefectos("FK_IdEmpresa",parametrofacturaciondefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(new ArrayList<ParametroFacturacionDefecto>());
						parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().addAll(parametrofacturaciondefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectos.addAll(parametrofacturaciondefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()==null||parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrofacturaciondefectos==null|| parametrofacturaciondefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
						parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroFacturacionDefectos("FK_IdSucursal",parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroFacturacionDefectos("FK_IdSucursal",parametrofacturaciondefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(new ArrayList<ParametroFacturacionDefecto>());
						parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().addAll(parametrofacturaciondefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectos.addAll(parametrofacturaciondefectosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoViaTransporte")) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()==null||parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrofacturaciondefectos==null|| parametrofacturaciondefectos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
						parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectosAux=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectosAux.addAll(parametrofacturaciondefectos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroFacturacionDefectoConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroFacturacionDefectos("FK_IdTipoViaTransporte",parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroFacturacionDefectos("FK_IdTipoViaTransporte",parametrofacturaciondefectos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(new ArrayList<ParametroFacturacionDefecto>());
						parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().addAll(parametrofacturaciondefectosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectos=new ArrayList<ParametroFacturacionDefecto>();
							parametrofacturaciondefectos.addAll(parametrofacturaciondefectosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroFacturacionDefecto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroFacturacionDefecto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofacturaciondefectos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrofacturaciondefectos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroFacturacionDefecto parametrofacturaciondefecto) {
		Boolean permite=true;
		
		if(this.parametrofacturaciondefecto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroFacturacionDefectoConstantesFunciones.getOrderByListaParametroFacturacionDefecto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroFacturacionDefectoConstantesFunciones.getOrderByListaParametroFacturacionDefecto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				if(parametrofacturaciondefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofacturaciondefectoTotales=parametrofacturaciondefecto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFacturacionDefecto parametrofacturaciondefecto:this.parametrofacturaciondefectos) {
				if(parametrofacturaciondefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofacturaciondefectoTotales=parametrofacturaciondefecto;
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
			this.parametrofacturaciondefectoAux=new ParametroFacturacionDefecto();
			this.parametrofacturaciondefectoAux.setsType(Constantes2.S_TOTALES);
			this.parametrofacturaciondefectoAux.setIsNew(false);
			this.parametrofacturaciondefectoAux.setIsChanged(false);
			this.parametrofacturaciondefectoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroFacturacionDefectoConstantesFunciones.TotalizarValoresFilaParametroFacturacionDefecto(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this.parametrofacturaciondefectoAux);
				
				this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().add(this.parametrofacturaciondefectoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroFacturacionDefectoConstantesFunciones.TotalizarValoresFilaParametroFacturacionDefecto(this.parametrofacturaciondefectos,this.parametrofacturaciondefectoAux);
				
				this.parametrofacturaciondefectos.add(this.parametrofacturaciondefectoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrofacturaciondefectoTotales=new ParametroFacturacionDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().remove(parametrofacturaciondefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrofacturaciondefectos.remove(parametrofacturaciondefectoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrofacturaciondefectoTotales=new ParametroFacturacionDefecto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				if(parametrofacturaciondefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofacturaciondefectoTotales=parametrofacturaciondefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroFacturacionDefectoConstantesFunciones.TotalizarValoresFilaParametroFacturacionDefecto(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),parametrofacturaciondefectoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroFacturacionDefecto parametrofacturaciondefecto:this.parametrofacturaciondefectos) {
				if(parametrofacturaciondefecto.getsType().equals(Constantes2.S_TOTALES)) {
					parametrofacturaciondefectoTotales=parametrofacturaciondefecto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroFacturacionDefectoConstantesFunciones.TotalizarValoresFilaParametroFacturacionDefecto(this.parametrofacturaciondefectos,parametrofacturaciondefectoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroFacturacionDefectosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroFacturacionDefectosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroFacturacionDefectosFK_IdTipoViaTransporte()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoViaTransporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroFacturacionDefectosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroFacturacionDefectosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroFacturacionDefectosFK_IdTipoViaTransporte(String sFinalQuery,Long id_tipo_via_transporte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofacturaciondefectoLogic.getParametroFacturacionDefectosFK_IdTipoViaTransporte(sFinalQuery,this.pagination,id_tipo_via_transporte);
				
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
	
	public void inicializarPermisosParametroFacturacionDefecto() {
		this.isPermisoTodoParametroFacturacionDefecto=false;
		this.isPermisoNuevoParametroFacturacionDefecto=false;
		this.isPermisoActualizarParametroFacturacionDefecto=false;
		this.isPermisoActualizarOriginalParametroFacturacionDefecto=false;
		this.isPermisoEliminarParametroFacturacionDefecto=false;
		this.isPermisoGuardarCambiosParametroFacturacionDefecto=false;
		this.isPermisoConsultaParametroFacturacionDefecto=false;
		this.isPermisoBusquedaParametroFacturacionDefecto=false;
		this.isPermisoReporteParametroFacturacionDefecto=false;		
		this.isPermisoOrdenParametroFacturacionDefecto=false;		
		this.isPermisoPaginacionMedioParametroFacturacionDefecto=false;		
		this.isPermisoPaginacionAltoParametroFacturacionDefecto=false;
		this.isPermisoPaginacionTodoParametroFacturacionDefecto=false;
		this.isPermisoCopiarParametroFacturacionDefecto=false;		
		this.isPermisoVerFormParametroFacturacionDefecto=false;		
		this.isPermisoDuplicarParametroFacturacionDefecto=false;		
		this.isPermisoOrdenParametroFacturacionDefecto=false;		
	}
	
	public void setPermisosUsuarioParametroFacturacionDefecto(Boolean isPermiso) {
		this.isPermisoTodoParametroFacturacionDefecto=isPermiso;
		this.isPermisoNuevoParametroFacturacionDefecto=isPermiso;
		this.isPermisoActualizarParametroFacturacionDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroFacturacionDefecto=isPermiso;
		this.isPermisoEliminarParametroFacturacionDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroFacturacionDefecto=isPermiso;
		this.isPermisoConsultaParametroFacturacionDefecto=isPermiso;
		this.isPermisoBusquedaParametroFacturacionDefecto=isPermiso;
		this.isPermisoReporteParametroFacturacionDefecto=isPermiso;
		this.isPermisoOrdenParametroFacturacionDefecto=isPermiso;		
		this.isPermisoPaginacionMedioParametroFacturacionDefecto=isPermiso;		
		this.isPermisoPaginacionAltoParametroFacturacionDefecto=isPermiso;		
		this.isPermisoPaginacionTodoParametroFacturacionDefecto=isPermiso;		
		this.isPermisoCopiarParametroFacturacionDefecto=isPermiso;		
		this.isPermisoVerFormParametroFacturacionDefecto=isPermiso;		
		this.isPermisoDuplicarParametroFacturacionDefecto=isPermiso;
		this.isPermisoOrdenParametroFacturacionDefecto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroFacturacionDefecto(Boolean isPermiso) {
		//this.isPermisoTodoParametroFacturacionDefecto=isPermiso;
		this.isPermisoNuevoParametroFacturacionDefecto=isPermiso;
		this.isPermisoActualizarParametroFacturacionDefecto=isPermiso;
		this.isPermisoActualizarOriginalParametroFacturacionDefecto=isPermiso;
		this.isPermisoEliminarParametroFacturacionDefecto=isPermiso;
		this.isPermisoGuardarCambiosParametroFacturacionDefecto=isPermiso;
		//this.isPermisoConsultaParametroFacturacionDefecto=isPermiso;
		//this.isPermisoBusquedaParametroFacturacionDefecto=isPermiso;
		//this.isPermisoReporteParametroFacturacionDefecto=isPermiso;
		//this.isPermisoOrdenParametroFacturacionDefecto=isPermiso;		
		//this.isPermisoPaginacionMedioParametroFacturacionDefecto=isPermiso;		
		//this.isPermisoPaginacionAltoParametroFacturacionDefecto=isPermiso;		
		//this.isPermisoPaginacionTodoParametroFacturacionDefecto=isPermiso;		
		//this.isPermisoCopiarParametroFacturacionDefecto=isPermiso;		
		//this.isPermisoDuplicarParametroFacturacionDefecto=isPermiso;
		//this.isPermisoOrdenParametroFacturacionDefecto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroFacturacionDefectoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroFacturacionDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroFacturacionDefecto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroFacturacionDefectoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroFacturacionDefectoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroFacturacionDefectoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroFacturacionDefectoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroFacturacionDefecto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroFacturacionDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroFacturacionDefectoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroFacturacionDefecto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroFacturacionDefecto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroFacturacionDefecto=this.isPermisoActualizarParametroFacturacionDefecto;
			this.isPermisoEliminarParametroFacturacionDefecto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroFacturacionDefecto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroFacturacionDefecto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroFacturacionDefecto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroFacturacionDefecto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroFacturacionDefecto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroFacturacionDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroFacturacionDefecto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroFacturacionDefecto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroFacturacionDefecto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroFacturacionDefecto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroFacturacionDefecto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroFacturacionDefecto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroFacturacionDefecto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroFacturacionDefecto.setToolTipText(this.jTableDatosParametroFacturacionDefecto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroFacturacionDefecto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroFacturacionDefecto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroFacturacionDefecto() throws Exception {
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
	public void inicializarCombosForeignKeyParametroFacturacionDefectoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipoviatransportesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroFacturacionDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroFacturacionDefectoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroFacturacionDefectoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoViaTransporteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroFacturacionDefectoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoReturnGeneral=new ParametroFacturacionDefectoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrofacturaciondefectoConstantesFunciones.cargarid_empresaParametroFacturacionDefecto)
					 || (this.esRecargarFks && this.parametrofacturaciondefectoConstantesFunciones.cargarid_empresaParametroFacturacionDefecto)) {

					if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrofacturaciondefectoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametrofacturaciondefectoConstantesFunciones.cargarid_sucursalParametroFacturacionDefecto)
					 || (this.esRecargarFks && this.parametrofacturaciondefectoConstantesFunciones.cargarid_sucursalParametroFacturacionDefecto)) {

					if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametrofacturaciondefectoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoViaTransporte="";

				if(((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0) && this.parametrofacturaciondefectoConstantesFunciones.cargarid_tipo_via_transporteParametroFacturacionDefecto)
					 || (this.esRecargarFks && this.parametrofacturaciondefectoConstantesFunciones.cargarid_tipo_via_transporteParametroFacturacionDefecto)) {

					if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoViaTransporte=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoViaTransporte=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoViaTransporte, "");
						finalQueryGlobalTipoViaTransporte+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoViaTransporte=" WHERE " + ConstantesSql.ID + "="+parametrofacturaciondefectoSessionBean.getlidTipoViaTransporteActual();
					}
				} else {
					finalQueryGlobalTipoViaTransporte="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.cargarCombosLoteForeignKeyParametroFacturacionDefecto(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoViaTransporte);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrofacturaciondefectoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametrofacturaciondefectoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoViaTransporte.equals("NONE")) {
				this.tipoviatransportesForeignKey=parametrofacturaciondefectoReturnGeneral.gettipoviatransportesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroFacturacionDefecto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoViaTransporte();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrofacturaciondefectoSessionBean==null) {
				this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
			}

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTipoViaTransporte()throws Exception {
		try {

			if(!this.parametrofacturaciondefectoSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				TipoViaTransporte tipoviatransporte=new TipoViaTransporte();
				TipoViaTransporteConstantesFunciones.setTipoViaTransporteDescripcion(tipoviatransporte,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoviatransporte.setId(null);

				if(!TipoViaTransporteConstantesFunciones.ExisteEnLista(this.tipoviatransportesForeignKey,tipoviatransporte,true)) {

					this.tipoviatransportesForeignKey.add(0,tipoviatransporte);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroFacturacionDefecto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroFacturacionDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroFacturacionDefecto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFacturacionDefecto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto)throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(parametrofacturaciondefecto.getid_tipo_via_transporte(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroFacturacionDefecto()throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(this.parametrofacturaciondefectoConstantesFunciones.getid_tipo_via_transporte(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroFacturacionDefecto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroFacturacionDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroFacturacionDefecto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroFacturacionDefecto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroFacturacionDefecto()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroFacturacionDefecto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroFacturacionDefecto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public ParametroFacturacionDefectoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroFacturacionDefectoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroFacturacionDefectoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean(); 
		this.parametrofacturaciondefectoConstantesFunciones=new ParametroFacturacionDefectoConstantesFunciones(); 
		this.parametrofacturaciondefectoBean=new ParametroFacturacionDefecto();//(this.parametrofacturaciondefectoConstantesFunciones); 		
		this.parametrofacturaciondefectoReturnGeneral=new ParametroFacturacionDefectoParameterReturnGeneral(); 
		
		this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrofacturaciondefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroFacturacionDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroFacturacionDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroFacturacionDefectoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroFacturacionDefecto(true);
			
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
			
			this.parametrofacturaciondefectoConstantesFunciones=new ParametroFacturacionDefectoConstantesFunciones(); 
			this.parametrofacturaciondefectoBean=new ParametroFacturacionDefecto();//this.parametrofacturaciondefectoConstantesFunciones); 			
			this.parametrofacturaciondefectoReturnGeneral=new ParametroFacturacionDefectoParameterReturnGeneral(); 
		
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Facturacion Defecto Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametrofacturaciondefecto=new ParametroFacturacionDefecto();
			this.parametrofacturaciondefectos = new ArrayList<ParametroFacturacionDefecto>();
			this.parametrofacturaciondefectosAux = new ArrayList<ParametroFacturacionDefecto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic=new ParametroFacturacionDefectoLogic();
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrofacturaciondefectoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrofacturaciondefectoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroFacturacionDefecto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroFacturacionDefecto);	
					}
					
					if(this.jInternalFrameImportacionParametroFacturacionDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroFacturacionDefecto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroFacturacionDefecto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroFacturacionDefecto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroFacturacionDefecto);
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.setVisible(false);
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto);
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroFacturacionDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroFacturacionDefecto);
					this.jInternalFrameImportacionParametroFacturacionDefecto.setVisible(false);
					this.jInternalFrameImportacionParametroFacturacionDefecto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroFacturacionDefecto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroFacturacionDefecto);
					this.jInternalFrameOrderByParametroFacturacionDefecto.setVisible(false);
					this.jInternalFrameOrderByParametroFacturacionDefecto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroFacturacionDefectoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroFacturacionDefectoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrofacturaciondefectoReturnGeneral=new ParametroFacturacionDefectoParameterReturnGeneral();
			
			this.parametrofacturaciondefectoParameterGeneral=new ParametroFacturacionDefectoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrofacturaciondefectoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroFacturacionDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado(),this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroFacturacionDefectoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado(),this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaCopiarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaVerFormParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaOrdenParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoViaTransporte=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroFacturacionDefecto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroFacturacionDefecto(false);
			
			this.setPermisosUsuarioParametroFacturacionDefecto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado() && this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroFacturacionDefectoClasesRelacionadas();
			}
			
			if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroFacturacionDefectoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroFacturacionDefecto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroFacturacionDefecto();
			}
			
			if(!this.isPermisoBusquedaParametroFacturacionDefecto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroFacturacionDefecto,this.isPermisoPaginacionMedioParametroFacturacionDefecto,this.isPermisoPaginacionTodoParametroFacturacionDefecto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroFacturacionDefectoConstantesFunciones.getTiposSeleccionarParametroFacturacionDefecto());
				
				this.tiposColumnasSelect=ParametroFacturacionDefectoConstantesFunciones.getTiposSeleccionarParametroFacturacionDefecto(true);
				
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
			//if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroFacturacionDefecto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroFacturacionDefecto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroFacturacionDefecto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFacturacionDefecto() ;
			
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
			this.tipoviatransporteLogic=new TipoViaTransporteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrofacturaciondefectoImplementable= (ParametroFacturacionDefectoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroFacturacionDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrofacturaciondefectoImplementableHome= (ParametroFacturacionDefectoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroFacturacionDefectoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrofacturaciondefectos= new ArrayList<ParametroFacturacionDefecto>();
			this.parametrofacturaciondefectosEliminados= new ArrayList<ParametroFacturacionDefecto>();
						
			this.isEsNuevoParametroFacturacionDefecto=false;
			this.esParaAccionDesdeFormularioParametroFacturacionDefecto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroFacturacionDefecto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroFacturacionDefecto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroFacturacionDefectoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroFacturacionDefecto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroFacturacionDefecto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroFacturacionDefecto();
			}
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroFacturacionDefecto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroFacturacionDefecto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroFacturacionDefecto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroFacturacionDefecto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroFacturacionDefecto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroFacturacionDefecto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroFacturacionDefecto")) {
				iIndex=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroFacturacionDefecto();	
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
	
	public void cargarCombosForeignKeyParametroFacturacionDefecto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroFacturacionDefecto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroFacturacionDefecto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroFacturacionDefectoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroFacturacionDefecto();
		
		this.cargarCombosFrameForeignKeyParametroFacturacionDefecto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroFacturacionDefecto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroFacturacionDefecto();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoViaTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoViaTransporte(this.tipoviatransportesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroFacturacionDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			
			if(jTableDatosParametroFacturacionDefecto.getRowCount()>=1) {
				jTableDatosParametroFacturacionDefecto.removeRowSelectionInterval(0, jTableDatosParametroFacturacionDefecto.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroFacturacionDefecto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroFacturacionDefecto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroFacturacionDefecto(true);			
			//this.parametrofacturaciondefecto=new ParametroFacturacionDefecto();
			//this.parametrofacturaciondefecto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto() ;
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFacturacionDefecto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrofacturaciondefecto);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);				
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroFacturacionDefecto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroFacturacionDefectoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroFacturacionDefecto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroFacturacionDefecto.getSelectedRows().length;			
			}
			
			parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroFacturacionDefecto--;			
				//ParametroFacturacionDefecto parametrofacturaciondefectoAux= new ParametroFacturacionDefecto();			
				//parametrofacturaciondefectoAux.setId(this.iIdNuevoParametroFacturacionDefecto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroFacturacionDefecto parametrofacturaciondefectoOrigen=new ParametroFacturacionDefecto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroFacturacionDefecto parametrofacturaciondefectoOrigen : parametrofacturaciondefectosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrofacturaciondefectoOrigen =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrofacturaciondefectoOrigen =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroFacturacionDefecto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrofacturaciondefecto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroFacturacionDefecto(parametrofacturaciondefectoOrigen,this.parametrofacturaciondefecto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().add(this.parametrofacturaciondefectoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefectos.add(this.parametrofacturaciondefectoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
				
				this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroFacturacionDefecto(), this.getIndiceNuevoParametroFacturacionDefecto());
				
				int iLastRow =  this.jTableDatosParametroFacturacionDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroFacturacionDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroFacturacionDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();									
		
			ParametroFacturacionDefecto parametrofacturaciondefectoOrigen=new ParametroFacturacionDefecto();
			ParametroFacturacionDefecto parametrofacturaciondefectoDestino=new ParametroFacturacionDefecto();
				
			parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroFacturacionDefecto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrofacturaciondefectosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroFacturacionDefecto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoOrigen =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrofacturaciondefectoOrigen =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrofacturaciondefectoDestino =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrofacturaciondefectoDestino =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrofacturaciondefectoOrigen =parametrofacturaciondefectosSeleccionados.get(0);
				parametrofacturaciondefectoDestino =parametrofacturaciondefectosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroFacturacionDefecto(parametrofacturaciondefectoOrigen,parametrofacturaciondefectoDestino,true,false);
				
				parametrofacturaciondefectoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrofacturaciondefectoDestino,parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrofacturaciondefectoDestino,parametrofacturaciondefectos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
				
				//this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroFacturacionDefecto(), this.getIndiceNuevoParametroFacturacionDefecto());
				
				int iLastRow =  this.jTableDatosParametroFacturacionDefecto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroFacturacionDefecto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroFacturacionDefecto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroFacturacionDefecto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(!isVisible);
			this.jPanelPaginacionParametroFacturacionDefecto.setVisible(!isVisible);
			this.jPanelAccionesParametroFacturacionDefecto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroFacturacionDefecto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroFacturacionDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroFacturacionDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroFacturacionDefecto();
			
			this.abrirFrameOrderByParametroFacturacionDefecto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroFacturacionDefecto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroFacturacionDefecto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroFacturacionDefecto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.isMaximum()) {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSize(this.jInternalFrameDetalleFormParametroFacturacionDefecto.iWidthFormulario,this.jInternalFrameDetalleFormParametroFacturacionDefecto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroFacturacionDefecto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroFacturacionDefecto.isMaximum()) {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jContentPaneDetalleParametroFacturacionDefecto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jContentPaneDetalleParametroFacturacionDefecto.getWidth(),ParametroFacturacionDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jContentPaneDetalleParametroFacturacionDefecto.getWidth(),ParametroFacturacionDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jContentPaneDetalleParametroFacturacionDefecto.getWidth(),ParametroFacturacionDefectoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroFacturacionDefecto.setVisible(true);
	        this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroFacturacionDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroFacturacionDefecto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroFacturacionDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFacturacionDefecto,false,this);
				} else {
					this.jInternalFrameOrderByParametroFacturacionDefecto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroFacturacionDefecto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroFacturacionDefecto);
				this.jInternalFrameOrderByParametroFacturacionDefecto.setVisible(false);
				this.jInternalFrameOrderByParametroFacturacionDefecto.setSelected(false);
				
				this.jInternalFrameOrderByParametroFacturacionDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroFacturacionDefecto"));
				
				this.inicializarActualizarBindingTablaOrderByParametroFacturacionDefecto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroFacturacionDefecto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroFacturacionDefecto==null) {
				
				this.jInternalFrameImportacionParametroFacturacionDefecto=new ImportacionJInternalFrame(ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroFacturacionDefecto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroFacturacionDefecto);
				this.jInternalFrameImportacionParametroFacturacionDefecto.setVisible(false);
				this.jInternalFrameImportacionParametroFacturacionDefecto.setSelected(false);


				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroFacturacionDefecto"));
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroFacturacionDefecto"));
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroFacturacionDefecto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroFacturacionDefecto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto==null) {
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto=new ReporteDinamicoJInternalFrame(ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroFacturacionDefecto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto);
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFacturacionDefecto"));
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFacturacionDefecto"));
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFacturacionDefecto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFacturacionDefecto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroFacturacionDefecto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroFacturacionDefecto);
			
	       	this.jInternalFrameDetalleFormParametroFacturacionDefecto.setVisible(false);
	        this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroFacturacionDefecto.dispose();
			//this.jInternalFrameDetalleFormParametroFacturacionDefecto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroFacturacionDefecto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroFacturacionDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroFacturacionDefecto.setVisible(true);
	        this.jInternalFrameImportacionParametroFacturacionDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroFacturacionDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroFacturacionDefecto.setVisible(true);
	        this.jInternalFrameOrderByParametroFacturacionDefecto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroFacturacionDefecto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroFacturacionDefecto.setVisible(false);
	        this.jInternalFrameOrderByParametroFacturacionDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroFacturacionDefecto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroFacturacionDefecto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroFacturacionDefecto.setVisible(false);
	        this.jInternalFrameImportacionParametroFacturacionDefecto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroFacturacionDefecto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroFacturacionDefecto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroFacturacionDefecto(true);
			//this.isEsNuevoParametroFacturacionDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false) ;
			
			if(parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFacturacionDefecto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroFacturacionDefectoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroFacturacionDefecto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroFacturacionDefecto(true);
			//this.isEsNuevoParametroFacturacionDefecto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrofacturaciondefecto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false) ;
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroFacturacionDefecto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoViaTransporte(List<TipoViaTransporte> tipoviatransportesForeignKey)throws Exception{
		TableColumn tableColumnTipoViaTransporte=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));
		TableCellEditor tableCellEditorTipoViaTransporte =tableColumnTipoViaTransporte.getCellEditor();

		TipoViaTransporteTableCell tipoviatransporteTableCellFk=(TipoViaTransporteTableCell)tableCellEditorTipoViaTransporte;

		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.settipoviatransportesForeignKey(tipoviatransportesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoviatransporteTableCellFk.setRowActual(intSelectedRow);
			//tipoviatransporteTableCellFk.settipoviatransportesForeignKeyActual(tipoviatransportesForeignKey);
		//}


		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.RecargarTipoViaTransportesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroFacturacionDefecto(false);
			
			//if(!this.isEsNuevoParametroFacturacionDefecto) {								
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				
			}
			
			if(this.permiteMantenimiento(this.parametrofacturaciondefecto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroFacturacionDefecto=true;
					this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
					this.isEsNuevoParametroFacturacionDefecto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroFacturacionDefecto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroFacturacionDefecto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroFacturacionDefecto(false);
			
												
				
				if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroFacturacionDefecto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,parametrofacturaciondefectoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrofacturaciondefectoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrofacturaciondefecto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrofacturaciondefecto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				this.parametrofacturaciondefecto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrofacturaciondefecto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroFacturacionDefectoModel) this.jTableDatosParametroFacturacionDefecto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroFacturacionDefecto=true;
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
				this.isEsNuevoParametroFacturacionDefecto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(false);
				
				this.habilitarDeshabilitarControlesParametroFacturacionDefecto(false);
				
				
				
				if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroFacturacionDefecto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroFacturacionDefecto.getRowCount()>=1) {
				jTableDatosParametroFacturacionDefecto.removeRowSelectionInterval(0, jTableDatosParametroFacturacionDefecto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroFacturacionDefecto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(false) ;
			
			this.isEsNuevoParametroFacturacionDefecto=false;
			
			if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroFacturacionDefecto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroFacturacionDefecto(false);
				
				//SI ES MANUAL
				if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroFacturacionDefecto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroFacturacionDefecto--;			
			//ParametroFacturacionDefecto parametrofacturaciondefectoAux= new ParametroFacturacionDefecto();			
			//parametrofacturaciondefectoAux.setId(this.iIdNuevoParametroFacturacionDefecto);
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroFacturacionDefecto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
			
			this.parametrofacturaciondefecto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().add(this.parametrofacturaciondefectoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrofacturaciondefectos.add(this.parametrofacturaciondefectoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			
			this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(this.getIndiceNuevoParametroFacturacionDefecto(), this.getIndiceNuevoParametroFacturacionDefecto());
			
			int iLastRow =  this.jTableDatosParametroFacturacionDefecto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroFacturacionDefecto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroFacturacionDefecto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
			
			//SI ES MANUAL
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFacturacionDefecto();
			}
			
			//this.abrirFrameTreeParametroFacturacionDefecto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro Facturacion DefectoS ?", "MANTENIMIENTO DE Parametro Facturacion Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroFacturacionDefecto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroFacturacionDefecto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.procesarImportacionParametroFacturacionDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrofacturaciondefectoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroFacturacionDefectoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroFacturacionDefecto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroFacturacionDefecto.setFileImportacion(this.jInternalFrameImportacionParametroFacturacionDefecto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroFacturacionDefecto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroFacturacionDefecto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		

		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroFacturacionDefectoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroFacturacionDefectoBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoViaTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoViaTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoViaTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoViaTransporte_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoria="id_tipo_via_transporte";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoriaValor="id_tipo_via_transporte";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"T. Via Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_via_transporte");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroFacturacionDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofacturaciondefecto.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofacturaciondefecto.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
					iRow++;

					for(ParametroFacturacionDefecto parametrofacturaciondefecto:parametrofacturaciondefectosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrofacturaciondefecto.gettipoviatransporte_descripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroFacturacionDefecto(row);				
			//	iRow++;
			//}				
			
			//for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroFacturacionDefecto(parametrofacturaciondefectoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
			
			//SI ES MANUAL
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroFacturacionDefecto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
			
			//SI ES MANUAL
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroFacturacionDefecto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
			
			//SI ES MANUAL
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroFacturacionDefecto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroFacturacionDefecto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroFacturacionDefecto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroFacturacionDefecto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroFacturacionDefecto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroFacturacionDefecto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroFacturacionDefecto.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroFacturacionDefecto.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroFacturacionDefecto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroFacturacionDefecto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroFacturacionDefecto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroFacturacionDefecto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroFacturacionDefecto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroFacturacionDefecto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFacturacionDefecto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroFacturacionDefecto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroFacturacionDefecto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroFacturacionDefecto();
		
		this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroFacturacionDefecto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroFacturacionDefecto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFacturacionDefecto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFacturacionDefecto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroFacturacionDefecto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionNuevoParametroFacturacionDefecto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroFacturacionDefecto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroFacturacionDefecto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionNuevoParametroFacturacionDefecto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionSinCerrarParametroFacturacionDefecto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jCheckBoxPostAccionSinMensajeParametroFacturacionDefecto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroFacturacionDefecto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroFacturacionDefecto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroFacturacionDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroFacturacionDefecto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroFacturacionDefecto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroFacturacionDefecto(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroFacturacionDefecto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroFacturacionDefecto() throws Exception {
		try	{
			if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroFacturacionDefecto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroFacturacionDefecto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroFacturacionDefecto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroFacturacionDefecto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroFacturacionDefecto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroFacturacionDefecto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroFacturacionDefecto.addItem(reporte);
			}
			
			
			if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroFacturacionDefecto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroFacturacionDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroFacturacionDefecto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFacturacionDefecto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroFacturacionDefecto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroFacturacionDefecto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.getSelectedItem()!=null){this.id_tipo_via_transporteFK_IdTipoViaTransporte=((TipoViaTransporte)this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteParametroFacturacionDefecto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroFacturacionDefecto(Boolean esInicializar) throws Exception {				
		if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroFacturacionDefecto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroFacturacionDefecto() throws Exception {
		this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroFacturacionDefecto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroFacturacionDefectoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefectoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroFacturacionDefecto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrofacturaciondefectos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroFacturacionDefecto.setModel(new ParametroFacturacionDefectoModel(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroFacturacionDefecto.setModel(new ParametroFacturacionDefectoModel(this.parametrofacturaciondefectos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroFacturacionDefecto!=null && this.jInternalFrameOrderByParametroFacturacionDefecto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroFacturacionDefecto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,parametrofacturaciondefectoConstantesFunciones.resaltarSeleccionarParametroFacturacionDefecto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroFacturacionDefectoConstantesFunciones.SCLASSWEBTITULO,parametrofacturaciondefectoConstantesFunciones.resaltarSeleccionarParametroFacturacionDefecto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,ParametroFacturacionDefectoConstantesFunciones.LABEL_ID));

		if(this.parametrofacturaciondefectoConstantesFunciones.mostraridParametroFacturacionDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFacturacionDefectoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrofacturaciondefectoConstantesFunciones.resaltaridParametroFacturacionDefecto,this.parametrofacturaciondefectoConstantesFunciones.activaridParametroFacturacionDefecto,this,true,"idParametroFacturacionDefecto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrofacturaciondefectoConstantesFunciones.resaltaridParametroFacturacionDefecto,this.parametrofacturaciondefectoConstantesFunciones.activaridParametroFacturacionDefecto,this,true,"idParametroFacturacionDefecto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_empresaParametroFacturacionDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_empresaParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_empresaParametroFacturacionDefecto));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_empresaParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_empresaParametroFacturacionDefecto,false,"id_empresaParametroFacturacionDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_sucursalParametroFacturacionDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_sucursalParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_sucursalParametroFacturacionDefecto));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_sucursalParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_sucursalParametroFacturacionDefecto,false,"id_sucursalParametroFacturacionDefecto","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));

		if(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_tipo_via_transporteParametroFacturacionDefecto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_tipo_via_transporteParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_tipo_via_transporteParametroFacturacionDefecto));
			tableColumn.setCellEditor(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.parametrofacturaciondefectoConstantesFunciones.resaltarid_tipo_via_transporteParametroFacturacionDefecto,this,this.parametrofacturaciondefectoConstantesFunciones.activarid_tipo_via_transporteParametroFacturacionDefecto,true,"id_tipo_via_transporteParametroFacturacionDefecto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroFacturacionDefectoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroFacturacionDefecto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroFacturacionDefecto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroFacturacionDefecto.addColumn(tableColumn);
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
			
			this.jTableDatosParametroFacturacionDefecto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroFacturacionDefecto.moveColumn(this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroFacturacionDefecto.moveColumn(this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroFacturacionDefecto.moveColumn(this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroFacturacionDefecto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroFacturacionDefecto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroFacturacionDefecto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroFacturacionDefecto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroFacturacionDefecto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroFacturacionDefecto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrofacturaciondefectos.size()-1;
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
		//this.jTableDatosParametroFacturacionDefecto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroFacturacionDefecto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroFacturacionDefecto();
			
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
				
				//this.isEsNuevoParametroFacturacionDefecto=false;
					
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
				if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroFacturacionDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrofacturaciondefecto.getsType().equals("DUPLICADO")
				   || this.parametrofacturaciondefecto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroFacturacionDefecto=true;
				
				} else {
					this.isEsNuevoParametroFacturacionDefecto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrofacturaciondefecto.getId()>=0 && !this.parametrofacturaciondefecto.getIsNew()) {						
						this.isEsNuevoParametroFacturacionDefecto=false;
						
					} else {
						this.isEsNuevoParametroFacturacionDefecto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroFacturacionDefecto(esRelaciones);						
				
				this.seleccionarParametroFacturacionDefecto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrofacturaciondefecto.getId()<0) {
					this.isEsNuevoParametroFacturacionDefecto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroFacturacionDefecto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroFacturacionDefecto(evt,rowIndex);
				}	
				
				if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroFacturacionDefecto: " + this.dDif); 
					}
				}								
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroFacturacionDefecto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrofacturaciondefecto)) {
					if(this.parametrofacturaciondefecto.getId()>0) {
						this.parametrofacturaciondefecto.setIsDeleted(true);
						
						this.parametrofacturaciondefectosEliminados.add(this.parametrofacturaciondefecto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().remove(this.parametrofacturaciondefecto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefectos.remove(this.parametrofacturaciondefecto);				
					}
					
					
					((ParametroFacturacionDefectoModel) this.jTableDatosParametroFacturacionDefecto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroFacturacionDefecto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroFacturacionDefecto) {
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroFacturacionDefecto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroFacturacionDefecto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrofacturaciondefectoConstantesFunciones.cargarid_empresaParametroFacturacionDefecto || this.parametrofacturaciondefectoConstantesFunciones.event_dependid_empresaParametroFacturacionDefecto) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrofacturaciondefecto.getid_empresa());
									//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrofacturaciondefecto.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrofacturaciondefecto.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrofacturaciondefecto.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametrofacturaciondefectoConstantesFunciones.cargarid_sucursalParametroFacturacionDefecto || this.parametrofacturaciondefectoConstantesFunciones.event_dependid_sucursalParametroFacturacionDefecto) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametrofacturaciondefecto.getid_sucursal());
									//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametrofacturaciondefecto.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametrofacturaciondefecto.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametrofacturaciondefecto.getid_sucursal(),false,"Formulario");

					//TipoViaTransporte
					if(!this.parametrofacturaciondefectoConstantesFunciones.cargarid_tipo_via_transporteParametroFacturacionDefecto || this.parametrofacturaciondefectoConstantesFunciones.event_dependid_tipo_via_transporteParametroFacturacionDefecto) {
						//this.cargarCombosTipoViaTransportesForeignKeyLista(" where id="+this.parametrofacturaciondefecto.getid_tipo_via_transporte());
									//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
						this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

						if(parametrofacturaciondefecto.getTipoViaTransporte()!=null) {
							this.tipoviatransportesForeignKey.add(parametrofacturaciondefecto.getTipoViaTransporte());
						}

						this.addItemDefectoCombosForeignKeyTipoViaTransporte();
						this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
					}
					this.setActualTipoViaTransporteForeignKey(this.parametrofacturaciondefecto.getid_tipo_via_transporte(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroFacturacionDefecto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroFacturacionDefecto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroFacturacionDefecto(parametrofacturaciondefecto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroFacturacionDefecto(parametrofacturaciondefecto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroFacturacionDefecto(parametrofacturaciondefecto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroFacturacionDefecto(parametrofacturaciondefecto);
	}
	
	public void setVariablesObjetoActualToFormularioParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setText(parametrofacturaciondefecto.getId().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroFacturacionDefecto parametrofacturaciondefectoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrofacturaciondefectoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroFacturacionDefecto parametrofacturaciondefectoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrofacturaciondefectoLocal=this.parametrofacturaciondefecto;
			} else {
				parametrofacturaciondefectoLocal=this.parametrofacturaciondefectoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrofacturaciondefectoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroFacturacionDefecto(parametrofacturaciondefectoLocal,true);
					
					if(parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrofacturaciondefectoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrofacturaciondefectoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(parametrofacturaciondefecto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(parametrofacturaciondefecto);
	}
	
	public void setVariablesFormularioToObjetoActualParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(parametrofacturaciondefecto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.getText()==null || this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.getText()=="" || this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setText("0");
			}

			if(conColumnasBase) {parametrofacturaciondefecto.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroFacturacionDefectoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelIdParametroFacturacionDefecto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefectoBean,ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrofacturaciondefectoBean.getid_tipo_via_transporte()!=null && !parametrofacturaciondefectoBean.getid_tipo_via_transporte().equals(-1L))) {parametrofacturaciondefecto.setid_tipo_via_transporte(parametrofacturaciondefectoBean.getid_tipo_via_transporte());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefectoOrigen,ParametroFacturacionDefecto parametrofacturaciondefecto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrofacturaciondefectoOrigen.getId()!=null && !parametrofacturaciondefectoOrigen.getId().equals(0L))) {parametrofacturaciondefecto.setId(parametrofacturaciondefectoOrigen.getId());}}
			if(conDefault || (!conDefault && parametrofacturaciondefectoOrigen.getid_tipo_via_transporte()!=null && !parametrofacturaciondefectoOrigen.getid_tipo_via_transporte().equals(-1L))) {parametrofacturaciondefecto.setid_tipo_via_transporte(parametrofacturaciondefectoOrigen.getid_tipo_via_transporte());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setText(parametrofacturaciondefecto.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroFacturacionDefecto(ParametroFacturacionDefectoBean parametrofacturaciondefectoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setText(parametrofacturaciondefectoBean.getId().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroFacturacionDefecto(ParametroFacturacionDefectoParameterReturnGeneral parametrofacturaciondefectoReturnGeneral,ParametroFacturacionDefectoBean parametrofacturaciondefectoBean,Boolean conDefault) throws Exception { 
		try {
			ParametroFacturacionDefecto parametrofacturaciondefectoLocal=new ParametroFacturacionDefecto();
			
			parametrofacturaciondefectoLocal=parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrofacturaciondefectoLocal.getId()!=null && !parametrofacturaciondefectoLocal.getId().equals(0L))) {parametrofacturaciondefectoBean.setId(parametrofacturaciondefectoLocal.getId());}}
			if(conDefault || (!conDefault && parametrofacturaciondefectoLocal.getid_tipo_via_transporte()!=null && !parametrofacturaciondefectoLocal.getid_tipo_via_transporte().equals(-1L))) {parametrofacturaciondefectoBean.setid_tipo_via_transporte(parametrofacturaciondefectoLocal.getid_tipo_via_transporte());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroFacturacionDefectoGenerico(Long idParametroFacturacionDefectoSeleccionado,JComboBox jComboBoxParametroFacturacionDefecto,List<ParametroFacturacionDefecto> parametrofacturaciondefectosLocal)throws Exception {
		try {
			ParametroFacturacionDefecto  parametrofacturaciondefectoTemp=null;

			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosLocal) {
				if(parametrofacturaciondefectoAux.getId()!=null && parametrofacturaciondefectoAux.getId().equals(idParametroFacturacionDefectoSeleccionado)) {
					parametrofacturaciondefectoTemp=parametrofacturaciondefectoAux;
					break;
				}
			}

			jComboBoxParametroFacturacionDefecto.setSelectedItem(parametrofacturaciondefectoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroFacturacionDefectoGenerico(JComboBox jComboBoxParametroFacturacionDefecto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroFacturacionDefecto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroFacturacionDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroFacturacionDefecto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroFacturacionDefecto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroFacturacionDefecto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroFacturacionDefecto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofacturaciondefecto=(ParametroFacturacionDefecto) parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrofacturaciondefecto =(ParametroFacturacionDefecto) parametrofacturaciondefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrofacturaciondefecto.getIsNew() && !parametrofacturaciondefecto.getIsChanged() && !parametrofacturaciondefecto.getIsDeleted()) {
				sDescripcion=parametrofacturaciondefecto.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrofacturaciondefecto.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametrofacturaciondefecto.getIsNew() && !parametrofacturaciondefecto.getIsChanged() && !parametrofacturaciondefecto.getIsDeleted()) {
				sDescripcion=parametrofacturaciondefecto.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrofacturaciondefecto.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoViaTransporte")) {
			//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
			if(!parametrofacturaciondefecto.getIsNew() && !parametrofacturaciondefecto.getIsChanged() && !parametrofacturaciondefecto.getIsDeleted()) {
				sDescripcion=parametrofacturaciondefecto.gettipoviatransporte_descripcion();
			} else {
				//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
				sDescripcion=parametrofacturaciondefecto.gettipoviatransporte_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroFacturacionDefecto parametrofacturaciondefectoRow=new ParametroFacturacionDefecto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofacturaciondefectoRow=(ParametroFacturacionDefecto) parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrofacturaciondefectoRow=(ParametroFacturacionDefecto) parametrofacturaciondefectos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));			
			this.jButtonDuplicarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto && this.isPermisoDuplicarParametroFacturacionDefecto));			
			this.jButtonCopiarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroFacturacionDefecto && this.isPermisoCopiarParametroFacturacionDefecto));
			this.jButtonVerFormParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroFacturacionDefecto && this.isPermisoVerFormParametroFacturacionDefecto));
			
			this.jButtonAbrirOrderByParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));			
			
			this.jButtonNuevoRelacionesParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));			
			this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaModificarParametroFacturacionDefecto && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroFacturacionDefecto && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroFacturacionDefecto && this.isPermisoEliminarParametroFacturacionDefecto));
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroFacturacionDefecto);							
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));						
			this.jButtonDuplicarToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto && this.isPermisoDuplicarParametroFacturacionDefecto));						
			this.jButtonCopiarToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroFacturacionDefecto && this.isPermisoCopiarParametroFacturacionDefecto));			
			this.jButtonVerFormToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroFacturacionDefecto && this.isPermisoVerFormParametroFacturacionDefecto));			
			this.jButtonAbrirOrderByToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));
			this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));			
			this.jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));			
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaModificarParametroFacturacionDefecto && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroFacturacionDefecto  && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroFacturacionDefecto && this.isPermisoEliminarParametroFacturacionDefecto));
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarToolBarParametroFacturacionDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroFacturacionDefecto);				
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));			
			this.jMenuItemDuplicarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto && this.isPermisoDuplicarParametroFacturacionDefecto));			
			this.jMenuItemCopiarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaCopiarParametroFacturacionDefecto && this.isPermisoCopiarParametroFacturacionDefecto));			
			this.jMenuItemVerFormParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaVerFormParametroFacturacionDefecto && this.isPermisoVerFormParametroFacturacionDefecto));			
			this.jMenuItemAbrirOrderByParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));			
			//this.jMenuItemMostrarOcultarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));
			this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));			
			//this.jMenuItemDetalleMostrarOcultarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaOrdenParametroFacturacionDefecto && this.isPermisoOrdenParametroFacturacionDefecto));			
			this.jMenuItemNuevoRelacionesParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto));			
			this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaNuevoParametroFacturacionDefecto && this.isPermisoNuevoParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));									
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemModificarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaModificarParametroFacturacionDefecto && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemActualizarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaActualizarParametroFacturacionDefecto && this.isPermisoActualizarParametroFacturacionDefecto));	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemEliminarParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaEliminarParametroFacturacionDefecto && this.isPermisoEliminarParametroFacturacionDefecto));
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemCancelarParametroFacturacionDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroFacturacionDefecto);				
			}
			
			this.jMenuItemGuardarCambiosParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));						
			this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=this.jButtonNuevoParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto=this.jButtonDuplicarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaCopiarParametroFacturacionDefecto=this.jButtonCopiarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaVerFormParametroFacturacionDefecto=this.jButtonVerFormParametroFacturacionDefecto.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroFacturacionDefecto=this.jButtonAbrirOrderByParametroFacturacionDefecto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=this.jButtonNuevoRelacionesParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=this.jButtonModificarParametroFacturacionDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=this.jButtonNuevoToolBarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarToolBarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarToolBarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarToolBarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarToolBarParametroFacturacionDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=this.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=this.jMenuItemNuevoParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=this.jMenuItemNuevoRelacionesParametroFacturacionDefecto.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemModificarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemActualizarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemEliminarParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemCancelarParametroFacturacionDefecto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=this.jMenuItemGuardarCambiosParametroFacturacionDefecto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroFacturacionDefecto(Boolean esInicializar) {
		if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroFacturacionDefecto();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroFacturacionDefecto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroFacturacionDefecto() {
		this.jButtonNuevoParametroFacturacionDefecto.setVisible(this.isPermisoNuevoParametroFacturacionDefecto);			
		this.jButtonDuplicarParametroFacturacionDefecto.setVisible(this.isPermisoDuplicarParametroFacturacionDefecto);			
		this.jButtonCopiarParametroFacturacionDefecto.setVisible(this.isPermisoCopiarParametroFacturacionDefecto);			
		this.jButtonVerFormParametroFacturacionDefecto.setVisible(this.isPermisoVerFormParametroFacturacionDefecto);			
		
		this.jButtonAbrirOrderByParametroFacturacionDefecto.setVisible(this.isPermisoOrdenParametroFacturacionDefecto);					
		
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.setVisible(this.isPermisoNuevoParametroFacturacionDefecto);			
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarParametroFacturacionDefecto.setVisible(this.isPermisoActualizarParametroFacturacionDefecto);	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.setVisible(this.isPermisoActualizarParametroFacturacionDefecto);	
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.setVisible(this.isPermisoEliminarParametroFacturacionDefecto);
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroFacturacionDefecto);						
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.setVisible(this.isPermisoGuardarCambiosParametroFacturacionDefecto);							
		}
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.setVisible(this.isPermisoActualizarParametroFacturacionDefecto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroFacturacionDefecto() {
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarParametroFacturacionDefecto.setVisible(this.isPermisoActualizarParametroFacturacionDefecto);	
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.setVisible(this.isPermisoActualizarParametroFacturacionDefecto);	
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.setVisible(this.isPermisoEliminarParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.setVisible(this.isVisibilidadCeldaCancelarParametroFacturacionDefecto);							
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.setVisible((this.isVisibilidadCeldaGuardarParametroFacturacionDefecto && this.isPermisoGuardarCambiosParametroFacturacionDefecto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroFacturacionDefecto() {
		if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroFacturacionDefecto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroFacturacionDefecto() {
	}
	
	public void jTableDatosParametroFacturacionDefectoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroFacturacionDefecto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroFacturacionDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofacturaciondefecto==null) {
						this.parametrofacturaciondefecto = new ParametroFacturacionDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				}

				if(this.parametrofacturaciondefecto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrofacturaciondefecto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFacturacionDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroFacturacionDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroFacturacionDefecto(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroFacturacionDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrofacturaciondefectoLogic.getConnexion());

				if(this.parametrofacturaciondefecto.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrofacturaciondefecto.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroFacturacionDefecto=(TitledBorder)this.jScrollPanelDatosParametroFacturacionDefecto.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroFacturacionDefecto.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroFacturacionDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofacturaciondefecto==null) {
						this.parametrofacturaciondefecto = new ParametroFacturacionDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				}

				if(this.parametrofacturaciondefecto.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrofacturaciondefecto.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFacturacionDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroFacturacionDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroFacturacionDefecto(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroFacturacionDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametrofacturaciondefectoLogic.getConnexion());

				if(this.parametrofacturaciondefecto.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametrofacturaciondefecto.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroFacturacionDefecto=(TitledBorder)this.jScrollPanelDatosParametroFacturacionDefecto.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroFacturacionDefecto.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroFacturacionDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofacturaciondefecto==null) {
						this.parametrofacturaciondefecto = new ParametroFacturacionDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				}

				if(this.parametrofacturaciondefecto.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametrofacturaciondefecto.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFacturacionDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoviatransporte=true;

			idTienePermisotipoviatransporte=this.tienePermisosUsuarioEnPaginaWebParametroFacturacionDefecto(TipoViaTransporteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoviatransporte) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroFacturacionDefecto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroFacturacionDefecto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);

				this.tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoviatransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoviatransporteBeanSwingJInternalFrame.getTipoViaTransporteLogic().setConnexion(this.parametrofacturaciondefectoLogic.getConnexion());

				if(this.parametrofacturaciondefecto.getid_tipo_via_transporte()!=null) {
					this.tipoviatransporteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoviatransporteBeanSwingJInternalFrame.setIdActual(this.parametrofacturaciondefecto.getid_tipo_via_transporte());
					this.tipoviatransporteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoViaTransporte();
				}

				JInternalFrameBase jinternalFrame =this.tipoviatransporteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroFacturacionDefecto=(TitledBorder)this.jScrollPanelDatosParametroFacturacionDefecto.getBorder();
				TitledBorder titledBordertipoviatransporte=(TitledBorder)this.tipoviatransporteBeanSwingJInternalFrame.jScrollPanelDatosTipoViaTransporte.getBorder();

				titledBordertipoviatransporte.setTitle(titledBorderParametroFacturacionDefecto.getTitle() + " -> Tipo Via Transporte");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_via_transporteParametroFacturacionDefectoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.getparametrofacturaciondefecto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrofacturaciondefecto==null) {
						this.parametrofacturaciondefecto = new ParametroFacturacionDefecto();
					}

					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);
				}

				if(this.parametrofacturaciondefecto.getid_tipo_via_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_via_transporte = "+this.parametrofacturaciondefecto.getid_tipo_via_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroFacturacionDefecto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);

			this.getParametroFacturacionDefectosFK_IdEmpresa();

			this.inicializarActualizarBindingParametroFacturacionDefecto(false);

			//if(ParametroFacturacionDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);

			this.getParametroFacturacionDefectosFK_IdSucursal();

			this.inicializarActualizarBindingParametroFacturacionDefecto(false);

			//if(ParametroFacturacionDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoViaTransporteParametroFacturacionDefectoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);

			this.getParametroFacturacionDefectosFK_IdTipoViaTransporte();

			this.inicializarActualizarBindingParametroFacturacionDefecto(false);

			//if(ParametroFacturacionDefectoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrofacturaciondefectoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroFacturacionDefecto() {
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.dispose();
			this.jInternalFrameDetalleFormParametroFacturacionDefecto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
			this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.dispose();
			this.jInternalFrameReporteDinamicoParametroFacturacionDefecto=null;
		}
		
		if(this.jInternalFrameImportacionParametroFacturacionDefecto!=null) {
			this.jInternalFrameImportacionParametroFacturacionDefecto.setVisible(false);	    			
			this.jInternalFrameImportacionParametroFacturacionDefecto.dispose();
			this.jInternalFrameImportacionParametroFacturacionDefecto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroFacturacionDefecto();
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroFacturacionDefecto")) {
				jButtonDuplicarParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroFacturacionDefecto")) {
				jButtonCopiarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroFacturacionDefecto")) {
				jButtonVerFormParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroFacturacionDefecto")) {
				jButtonDuplicarParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroFacturacionDefecto")) {
				jButtonDuplicarParametroFacturacionDefectoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroFacturacionDefecto")) {
				jButtonModificarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroFacturacionDefecto")) {
				jButtonModificarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroFacturacionDefecto")) {
				jButtonModificarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroFacturacionDefecto")) {
				jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroFacturacionDefecto")) {
				jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroFacturacionDefecto")) {
				jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroFacturacionDefecto")) {
				jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroFacturacionDefecto")) {
				jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroFacturacionDefecto")) {
				jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroFacturacionDefecto")) {
				jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroFacturacionDefecto")) {
				jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroFacturacionDefecto")) {
				jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroFacturacionDefecto")) {
				jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroFacturacionDefecto")) {
				jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroFacturacionDefecto")) {
				jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroFacturacionDefecto")) {
				jButtonMostrarOcultarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroFacturacionDefecto")) {
				jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroFacturacionDefecto")) {
				jButtonCopiarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroFacturacionDefecto")) {
				jButtonVerFormParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroFacturacionDefecto")) {
				jButtonCopiarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroFacturacionDefecto")) {
				jButtonVerFormParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroFacturacionDefecto")) {
				jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroFacturacionDefecto")) {
				jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroFacturacionDefecto")) {
				jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroFacturacionDefecto")) {
				jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroFacturacionDefecto")) {
				jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroFacturacionDefecto")) {
				jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroFacturacionDefecto")) {
				jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroFacturacionDefecto")) {
				jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroFacturacionDefecto")) {
				jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroFacturacionDefecto") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroFacturacionDefecto")) {
				jButtonAbrirOrderByParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroFacturacionDefecto") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroFacturacionDefecto")) {
				jButtonMostrarOcultarParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroFacturacionDefecto")) {
				jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroFacturacionDefecto")) {
				jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroFacturacionDefecto")) {
				jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroFacturacionDefecto")) {
				jButtonCerrarReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroFacturacionDefecto")) {
				jButtonGenerarReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroFacturacionDefecto")) {
				
				jButtonGenerarExcelReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroFacturacionDefecto")) {
				jButtonCerrarImportacionParametroFacturacionDefectoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroFacturacionDefecto")) {
				
				jButtonGenerarImportacionParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroFacturacionDefecto")) {
				
				jButtonAbrirImportacionParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroFacturacionDefecto")) {
				jComboBoxTiposAccionesParametroFacturacionDefectoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroFacturacionDefecto")) {
				jComboBoxTiposRelacionesParametroFacturacionDefectoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroFacturacionDefecto")) {
				jComboBoxTiposAccionesParametroFacturacionDefectoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroFacturacionDefecto")) {
				
				jComboBoxTiposSeleccionarParametroFacturacionDefectoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroFacturacionDefecto")) {
				jTextFieldValorCampoGeneralParametroFacturacionDefectoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroFacturacionDefecto")) {
				jButtonAbrirOrderByParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroFacturacionDefecto")) {
				jButtonAbrirOrderByParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroFacturacionDefecto")) {
				jButtonCerrarOrderByParametroFacturacionDefectoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroFacturacionDefectoBusqueda")) {
				this.jButtonidParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroFacturacionDefectoUpdate")) {
				this.jButtonid_empresaParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_empresaParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroFacturacionDefectoUpdate")) {
				this.jButtonid_sucursalParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_sucursalParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteParametroFacturacionDefectoUpdate")) {
				this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoViaTransporteParametroFacturacionDefecto")) {
				this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefectoActionPerformed(evt);
			}
			
			;
			
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroFacturacionDefecto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroFacturacionDefecto parametrofacturaciondefectoLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrofacturaciondefectoLocal=this.parametrofacturaciondefecto;
			} else {
				parametrofacturaciondefectoLocal=this.parametrofacturaciondefectoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
							
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
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
			
			


			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
								
						
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
								
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
							
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
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
			
			


			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
								
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroFacturacionDefecto")) {
					jCheckBoxSeleccionarTodosParametroFacturacionDefectoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroFacturacionDefecto")) {
					jCheckBoxSeleccionadosParametroFacturacionDefectoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroFacturacionDefecto")) {
					
				}
				
				


				
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
												
				
				


				
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
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
			
			


			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrofacturaciondefecto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrofacturaciondefecto);
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
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
				
				


				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroFacturacionDefecto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroFacturacionDefecto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroFacturacionDefectoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrofacturaciondefectoAnterior =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroFacturacionDefecto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroFacturacionDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroFacturacionDefecto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrofacturaciondefecto =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrofacturaciondefecto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroFacturacionDefecto")) {
				
				}
				
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroFacturacionDefecto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroFacturacionDefecto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroFacturacionDefecto")) {
			
			}
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroFacturacionDefecto();
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			if(sTipo.equals("NuevoParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroFacturacionDefecto")) {
				jButtonDuplicarParametroFacturacionDefectoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroFacturacionDefecto")) {
				jButtonCopiarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroFacturacionDefecto")) {
				jButtonVerFormParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroFacturacionDefecto")) {
				jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroFacturacionDefecto")) {
				jButtonModificarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroFacturacionDefecto")) {
				jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroFacturacionDefecto")) {
				jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroFacturacionDefecto")) {
				jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroFacturacionDefecto")) {
				jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroFacturacionDefecto")) {
				jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroFacturacionDefecto")) {
				jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroFacturacionDefecto")) {
				jButtonAbrirOrderByParametroFacturacionDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroFacturacionDefecto")) {
				jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroFacturacionDefecto")) {
				jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroFacturacionDefecto")) {
				jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroFacturacionDefectoBusqueda")) {
				this.jButtonidParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroFacturacionDefectoUpdate")) {
				this.jButtonid_empresaParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_empresaParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroFacturacionDefectoUpdate")) {
				this.jButtonid_sucursalParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_sucursalParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteParametroFacturacionDefectoUpdate")) {
				this.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteParametroFacturacionDefectoBusqueda")) {
				this.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusquedaActionPerformed(evt);
			}
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroFacturacionDefecto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroFacturacionDefecto")) {
				closingInternalFrameParametroFacturacionDefecto();
				
			} else if(sTipo.equals("jButtonCancelarParametroFacturacionDefecto")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroFacturacionDefecto = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroFacturacionDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroFacturacionDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroFacturacionDefecto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroFacturacionDefectoActionPerformed(null);
			}
			
			ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrofacturaciondefecto,new Object(),this.parametrofacturaciondefectoParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroFacturacionDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroFacturacionDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroFacturacionDefecto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrofacturaciondefecto)) {
			if(!esControlTabla) {
				if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);			
				}
				
				if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.procesarEventosParametroFacturacionDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this.parametrofacturaciondefecto,this.parametrofacturaciondefectoParameterGeneral,this.isEsNuevoParametroFacturacionDefecto,classes);//this.parametrofacturaciondefectoLogic.getParametroFacturacionDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral,this.parametrofacturaciondefectoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroFacturacionDefecto(classes,this.parametrofacturaciondefectoReturnGeneral,this.parametrofacturaciondefectoBean,false);
					}
						
					if(this.parametrofacturaciondefectoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto());	
					}
						
					if(this.parametrofacturaciondefectoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto(),classes);//this.parametrofacturaciondefectoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroFacturacionDefecto(this.parametrofacturaciondefecto,classes);//this.parametrofacturaciondefectoBean);									
				}
			
				if(ParametroFacturacionDefectoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroFacturacionDefecto(this.parametrofacturaciondefecto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroFacturacionDefecto(this.parametrofacturaciondefecto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrofacturaciondefectoAnterior!=null) {
						this.parametrofacturaciondefecto=this.parametrofacturaciondefectoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.procesarEventosParametroFacturacionDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this.parametrofacturaciondefecto,this.parametrofacturaciondefectoParameterGeneral,this.isEsNuevoParametroFacturacionDefecto,classes);//this.parametrofacturaciondefectoLogic.getParametroFacturacionDefecto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrofacturaciondefectoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto(),parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto(),this.parametrofacturaciondefectos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroFacturacionDefecto.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroFacturacionDefecto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroFacturacionDefecto();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroFacturacionDefecto() throws Exception {
		
		ParametroFacturacionDefectoModel parametrofacturaciondefectoModel=(ParametroFacturacionDefectoModel)this.jTableDatosParametroFacturacionDefecto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrofacturaciondefectoModel.parametrofacturaciondefectos=this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrofacturaciondefectoModel.parametrofacturaciondefectos=this.parametrofacturaciondefectos;
		}
		
		
		((ParametroFacturacionDefectoModel) this.jTableDatosParametroFacturacionDefecto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroFacturacionDefecto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrofacturaciondefectoAnterior(),this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrofacturaciondefectoAnterior(),this.parametrofacturaciondefectos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroFacturacionDefecto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
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
										
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofacturaciondefecto,new Object(),generalEntityParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroFacturacionDefectoConstantesFunciones.getClassesRelationshipsOfParametroFacturacionDefecto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroFacturacionDefectoConstantesFunciones.getClassesRelationshipsFromStringsOfParametroFacturacionDefecto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroFacturacionDefecto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrofacturaciondefecto,new Object(),generalEntityParameterGeneral,this.parametrofacturaciondefectoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroFacturacionDefecto(ParametroFacturacionDefectoBean parametrofacturaciondefectoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroFacturacionDefecto(ArrayList<Classe> classes,ParametroFacturacionDefectoReturnGeneral parametrofacturaciondefectoReturnGeneral,ParametroFacturacionDefectoBean parametrofacturaciondefectoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrofacturaciondefecto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto = new ParametroFacturacionDefectoDetalleFormJInternalFrame(jDesktopPane,this.parametrofacturaciondefectoSessionBean.getConGuardarRelaciones(),this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.setVisible(false);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.parametrofacturaciondefectoLogic=this.parametrofacturaciondefectoLogic;
		
		this.cargarCombosFrameForeignKeyParametroFacturacionDefecto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroFacturacionDefecto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroFacturacionDefecto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroFacturacionDefecto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroFacturacionDefecto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroFacturacionDefecto"));
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroFacturacionDefecto"));

		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroFacturacionDefecto"));
					
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemModificarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroFacturacionDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroFacturacionDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroFacturacionDefecto"));
						
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemActualizarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroFacturacionDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroFacturacionDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroFacturacionDefecto"));
								
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemEliminarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroFacturacionDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroFacturacionDefecto"));
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroFacturacionDefecto"));
					
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemCancelarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroFacturacionDefecto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemDetalleCerrarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroFacturacionDefecto"));		
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFacturacionDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFacturacionDefecto"));
		
		
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroFacturacionDefecto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonidParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroFacturacionDefecto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroFacturacionDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroFacturacionDefecto"));
		}
		
		this.jTableDatosParametroFacturacionDefecto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroFacturacionDefecto"));
		
		this.jTableDatosParametroFacturacionDefecto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroFacturacionDefecto"));
		
		this.jButtonNuevoParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"NuevoParametroFacturacionDefecto"));
		
		this.jButtonDuplicarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"DuplicarParametroFacturacionDefecto"));
		
		this.jButtonCopiarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"CopiarParametroFacturacionDefecto"));
		
		this.jButtonVerFormParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"VerFormParametroFacturacionDefecto"));
		
		
		this.jButtonNuevoToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroFacturacionDefecto"));
			
		this.jButtonDuplicarToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemNuevoParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroFacturacionDefecto"));
			
		this.jMenuItemDuplicarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroFacturacionDefecto"));		
		
		
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroFacturacionDefecto"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemNuevoRelacionesParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroFacturacionDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ModificarParametroFacturacionDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonModificarToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroFacturacionDefecto"));
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemModificarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroFacturacionDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"ActualizarParametroFacturacionDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonActualizarToolBarParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroFacturacionDefecto"));
				
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemActualizarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroFacturacionDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"EliminarParametroFacturacionDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonEliminarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroFacturacionDefecto"));
						
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemEliminarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroFacturacionDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CancelarParametroFacturacionDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonCancelarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroFacturacionDefecto"));
			
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemCancelarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroFacturacionDefecto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroFacturacionDefecto"));		
		
		
		this.jButtonCerrarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CerrarParametroFacturacionDefecto"));
		
		
		this.jButtonCerrarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemCerrarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroFacturacionDefecto"));
			
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jMenuItemDetalleCerrarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroFacturacionDefecto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroFacturacionDefecto"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroFacturacionDefecto"));
		}
		
		this.jButtonCopiarToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroFacturacionDefecto"));
			
		this.jButtonVerFormToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroFacturacionDefecto"));
		
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroFacturacionDefecto"));
			
		this.jMenuItemCopiarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroFacturacionDefecto"));		
		
		this.jMenuItemVerFormParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroFacturacionDefecto"));		
		
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroFacturacionDefecto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroFacturacionDefecto"));		
		
		
		
		this.jButtonRecargarInformacionParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroFacturacionDefecto"));
					
		this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroFacturacionDefecto"));
		
		this.jMenuItemRecargarInformacionParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroFacturacionDefecto"));		
		
		
		
		this.jButtonAnterioresParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"AnterioresParametroFacturacionDefecto"));
		
		
		this.jButtonAnterioresToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroFacturacionDefecto"));
		
		this.jMenuItemAnterioresParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroFacturacionDefecto"));		
		
		
		this.jButtonSiguientesParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"SiguientesParametroFacturacionDefecto"));
		
		
		this.jButtonSiguientesToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemSiguientesParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroFacturacionDefecto"));
			
		this.jMenuItemAbrirOrderByParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroFacturacionDefecto"));
			
		this.jMenuItemMostrarOcultarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroFacturacionDefecto"));
			
		this.jMenuItemDetalleAbrirOrderByParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroFacturacionDefecto"));
			
		this.jMenuItemDetalleMostarOcultarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroFacturacionDefecto"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroFacturacionDefecto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroFacturacionDefecto"));
			
		this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroFacturacionDefecto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroFacturacionDefecto"));

		this.jCheckBoxSeleccionadosParametroFacturacionDefecto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroFacturacionDefecto"));
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroFacturacionDefecto"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroFacturacionDefecto"));
			
		this.jComboBoxTiposAccionesParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroFacturacionDefecto"));
					
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroFacturacionDefecto"));
			
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroFacturacionDefecto"));		
		
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonidParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteParametroFacturacionDefecto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroFacturacionDefecto!=null) {
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFacturacionDefecto"));
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFacturacionDefecto"));
				this.jInternalFrameReporteDinamicoParametroFacturacionDefecto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFacturacionDefecto"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroFacturacionDefecto"));				
			//this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroFacturacionDefecto"));
			//this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroFacturacionDefecto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroFacturacionDefecto!=null) {
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroFacturacionDefecto"));
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroFacturacionDefecto"));
				this.jInternalFrameImportacionParametroFacturacionDefecto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroFacturacionDefecto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroFacturacionDefecto"));
			
			this.jButtonAbrirOrderByToolBarParametroFacturacionDefecto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroFacturacionDefecto"));			
			
			if(this.jInternalFrameOrderByParametroFacturacionDefecto!=null) {
				this.jInternalFrameOrderByParametroFacturacionDefecto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroFacturacionDefecto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroFacturacionDefecto.jTabbedPaneRelacionesParametroFacturacionDefecto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroFacturacionDefecto"));
		
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
            		closingInternalFrameParametroFacturacionDefecto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroFacturacionDefecto = (JInternalFrameBase)event.getSource();
	            	
	            ParametroFacturacionDefectoBeanSwingJInternalFrame jInternalFrameParent=(ParametroFacturacionDefectoBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroFacturacionDefecto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroFacturacionDefectoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroFacturacionDefecto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroFacturacionDefectoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroFacturacionDefecto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroFacturacionDefecto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroFacturacionDefecto";
		inputMap = this.jButtonNuevoRelacionesParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroFacturacionDefectoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroFacturacionDefecto";
		inputMap = this.jButtonModificarParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroFacturacionDefecto";
		inputMap = this.jButtonActualizarParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroFacturacionDefecto";
		inputMap = this.jButtonEliminarParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroFacturacionDefecto";
		inputMap = this.jButtonCancelarParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroFacturacionDefecto";
		inputMap = this.jButtonCerrarParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroFacturacionDefecto";
		inputMap = this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonGuardarCambiosParametroFacturacionDefecto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroFacturacionDefecto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroFacturacionDefectoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroFacturacionDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroFacturacionDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroFacturacionDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroFacturacionDefectoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonidParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"idParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_empresaParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_sucursalParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroFacturacionDefectoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jButtonid_tipo_via_transporteParametroFacturacionDefectoBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteParametroFacturacionDefectoBusqueda"));
		
		
		this.jButtonFK_IdTipoViaTransporteParametroFacturacionDefecto.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteParametroFacturacionDefecto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroFacturacionDefecto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroFacturacionDefectoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroFacturacionDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroFacturacionDefecto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroFacturacionDefecto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
					parametrofacturaciondefectoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectos) {
					parametrofacturaciondefectoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroFacturacionDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
						parametrofacturaciondefectoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectos) {
						parametrofacturaciondefectoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroFacturacionDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroFacturacionDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroFacturacionDefectoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroFacturacionDefecto.getSelectedRows();
			
			ParametroFacturacionDefecto parametrofacturaciondefectoLocal=new ParametroFacturacionDefecto();
			
			//this.seleccionarTodosParametroFacturacionDefecto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrofacturaciondefectoLocal =(ParametroFacturacionDefecto) this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos().toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrofacturaciondefectoLocal =(ParametroFacturacionDefecto) this.parametrofacturaciondefectos.toArray()[this.jTableDatosParametroFacturacionDefecto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrofacturaciondefectoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
						parametrofacturaciondefectoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectos) {
						parametrofacturaciondefectoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroFacturacionDefecto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroFacturacionDefecto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroFacturacionDefecto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroFacturacionDefectoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroFacturacionDefectoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroFacturacionDefectoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroFacturacionDefecto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
				
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectos) {
					
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroFacturacionDefectoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroFacturacionDefecto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroFacturacionDefecto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroFacturacionDefecto) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroFacturacionDefecto(conSplash);
				
					this.generarReporteParametroFacturacionDefectosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroFacturacionDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroFacturacionDefectosSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroFacturacionDefectosSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroFacturacionDefecto();
				
				this.exportarParametroFacturacionDefectosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroFacturacionDefectos();
				//this.importarParametroFacturacionDefectos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroFacturacionDefecto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroFacturacionDefectosSeleccionados();
				//this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Facturacion Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroFacturacionDefecto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroFacturacionDefecto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroFacturacionDefecto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroFacturacionDefectoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroFacturacionDefecto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroFacturacionDefecto(conSplash);
					
						//this.actualizarParametrosGeneralParametroFacturacionDefecto();
						
						this.generarReporteProcesoAccionParametroFacturacionDefectosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro Facturacion DefectoS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Facturacion Defecto", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroFacturacionDefecto();
				
						this.actualizarParametrosGeneralParametroFacturacionDefecto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrofacturaciondefectoReturnGeneral=parametrofacturaciondefectoLogic.procesarAccionParametroFacturacionDefectosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos(),this.parametrofacturaciondefectoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroFacturacionDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroFacturacionDefecto();
					
					ParametroFacturacionDefectoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroFacturacionDefectoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroFacturacionDefecto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxTiposAccionesFormularioParametroFacturacionDefecto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroFacturacionDefecto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroFacturacionDefectoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroFacturacionDefecto();
			
			if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
			ParametroFacturacionDefecto parametrofacturaciondefecto=new ParametroFacturacionDefecto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroFacturacionDefecto.getSelectedItem();
			
			
			
			
			parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrofacturaciondefectosSeleccionados.size()==1) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
					parametrofacturaciondefecto=parametrofacturaciondefectoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroFacturacionDefecto();
			
      		//this.finishProcessParametroFacturacionDefecto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroFacturacionDefectoReturnGeneral() throws Exception {
		if(this.parametrofacturaciondefectoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrofacturaciondefectoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrofacturaciondefectoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrofacturaciondefectoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrofacturaciondefectoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrofacturaciondefectoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
		}
		
		if(this.parametrofacturaciondefectoReturnGeneral.getConRetornoLista() || this.parametrofacturaciondefectoReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrofacturaciondefectoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrofacturaciondefectoLogic.setParametroFacturacionDefectos(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefectos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrofacturaciondefectoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrofacturaciondefectoLogic.setParametroFacturacionDefecto(this.parametrofacturaciondefectoReturnGeneral.getParametroFacturacionDefecto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroFacturacionDefecto(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroFacturacionDefecto() throws Exception {
		
		
	}
	
	public ArrayList<ParametroFacturacionDefecto> getParametroFacturacionDefectosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroFacturacionDefecto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectoLogic.getParametroFacturacionDefectos()) {
					if(parametrofacturaciondefectoAux.getIsSelected()) {
						parametrofacturaciondefectosSeleccionados.add(parametrofacturaciondefectoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:this.parametrofacturaciondefectos) {
					if(parametrofacturaciondefectoAux.getIsSelected()) {
						parametrofacturaciondefectosSeleccionados.add(parametrofacturaciondefectoAux);				
					}
				}
			}
			
			if(parametrofacturaciondefectosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrofacturaciondefectosSeleccionados.addAll(this.parametrofacturaciondefectoLogic.getParametroFacturacionDefectos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrofacturaciondefectosSeleccionados.addAll(this.parametrofacturaciondefectos);				
					}
				}
			}
		} else {
			parametrofacturaciondefectosSeleccionados.add(this.parametrofacturaciondefecto);
		}
		
		return parametrofacturaciondefectosSeleccionados;
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
	
	public void generarReporteParametroFacturacionDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroFacturacionDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroFacturacionDefectosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroFacturacionDefectosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroFacturacionDefectosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Facturacion Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroFacturacionDefectosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroFacturacionDefecto();
		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroFacturacionDefecto();
		
		
		//this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados ,parametrofacturaciondefectoImplementable,parametrofacturaciondefectoImplementableHome);
	}
	
	public void mostrarImportacionParametroFacturacionDefectos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroFacturacionDefecto();
		
		this.abrirFrameImportacionParametroFacturacionDefecto();		
		
			
		//this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados ,parametrofacturaciondefectoImplementable,parametrofacturaciondefectoImplementableHome);
	}
	
	public void importarParametroFacturacionDefectos() throws Exception {		
	
	}
	
	public void exportarParametroFacturacionDefectosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroFacturacionDefectosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroFacturacionDefectosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroFacturacionDefectosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Facturacion Defecto",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroFacturacionDefecto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroFacturacionDefecto(parametrofacturaciondefectoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrofacturaciondefectoAux.setsDetalleGeneralEntityReporte(parametrofacturaciondefectoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroFacturacionDefecto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroFacturacionDefectoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFacturacionDefectoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrofacturaciondefecto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofacturaciondefecto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofacturaciondefecto.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofacturaciondefecto.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrofacturaciondefecto.gettipoviatransporte_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroFacturacionDefectos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroFacturacionDefecto(row);				
				iRow++;
			}				
			
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroFacturacionDefecto(parametrofacturaciondefectoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroFacturacionDefectosSeleccionados() throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();		
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrofacturaciondefecto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrofacturaciondefectos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrofacturaciondefecto");
			//elementRoot.appendChild(element);
		
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
				element = document.createElement("parametrofacturaciondefecto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroFacturacionDefecto(parametrofacturaciondefectoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Facturacion Defecto",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroFacturacionDefecto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofacturaciondefecto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofacturaciondefecto.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofacturaciondefecto.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrofacturaciondefecto.gettipoviatransporte_descripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroFacturacionDefecto(ParametroFacturacionDefecto parametrofacturaciondefecto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroFacturacionDefectoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrofacturaciondefecto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroFacturacionDefectoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrofacturaciondefecto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroFacturacionDefectoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrofacturaciondefecto.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroFacturacionDefectoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametrofacturaciondefecto.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipoviatransporte_descripcion = document.createElement(ParametroFacturacionDefectoConstantesFunciones.IDTIPOVIATRANSPORTE);
		elementtipoviatransporte_descripcion.appendChild(document.createTextNode(parametrofacturaciondefecto.gettipoviatransporte_descripcion()));
		element.appendChild(elementtipoviatransporte_descripcion);
	}
	
	public void generarReporteGroupGenericoParametroFacturacionDefectosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados=new ArrayList<ParametroFacturacionDefecto>();
		
		parametrofacturaciondefectosSeleccionados=this.getParametroFacturacionDefectosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroFacturacionDefecto(parametrofacturaciondefectosSeleccionados);
		
		this.generarReporteParametroFacturacionDefectos("Todos",parametrofacturaciondefectosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroFacturacionDefecto(ArrayList<ParametroFacturacionDefecto> parametrofacturaciondefectosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroFacturacionDefecto parametrofacturaciondefectoAux:parametrofacturaciondefectosSeleccionados) {
				parametrofacturaciondefectoAux.setsDetalleGeneralEntityReporte(parametrofacturaciondefectoAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrofacturaciondefectoAux.setsDescripcionGeneralEntityReporte1(parametrofacturaciondefectoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametrofacturaciondefectoAux.setsDescripcionGeneralEntityReporte1(parametrofacturaciondefectoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroFacturacionDefectoConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE)) {
					existe=true;
					parametrofacturaciondefectoAux.setsDescripcionGeneralEntityReporte1(parametrofacturaciondefectoAux.gettipoviatransporte_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroFacturacionDefectoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroFacturacionDefecto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=true;
				this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=true;
			}
			
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaModificarParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaCancelarParametroFacturacionDefecto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroFacturacionDefecto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroFacturacionDefectoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=true;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=true;
		} else {
			this.actualizarEstadoPanelsParametroFacturacionDefecto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroFacturacionDefecto=false;
			//this.isVisibilidadCeldaVerFormParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaDuplicarParametroFacturacionDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaGuardarCambiosParametroFacturacionDefecto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			if(!parametrofacturaciondefectoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;												
			}
			
			this.jButtonCerrarParametroFacturacionDefecto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroFacturacionDefecto=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrofacturaciondefecto)) {
			this.isVisibilidadCeldaActualizarParametroFacturacionDefecto=false;
			this.isVisibilidadCeldaEliminarParametroFacturacionDefecto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroFacturacionDefecto() {
	}
	
	public void actualizarEstadoPanelsParametroFacturacionDefecto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosEdicionParametroFacturacionDefecto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroFacturacionDefecto!=null) {
				this.jScrollPanelDatosParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroFacturacionDefecto!=null) {
				this.jPanelPaginacionParametroFacturacionDefecto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
					this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrofacturaciondefectoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroFacturacionDefecto!=null) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroFacturacionDefecto!=null) {
				this.jPanelParametrosReportesParametroFacturacionDefecto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoViaTransporte=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasParametroFacturacionDefecto.remove(jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTipoViaTransporte=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasParametroFacturacionDefecto.remove(jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoViaTransporte(Boolean isParaTipoViaTransporte){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoViaTransporteNegation=!isParaTipoViaTransporte;

			this.isVisibilidadFK_IdTipoViaTransporte=isParaTipoViaTransporte;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasParametroFacturacionDefecto.remove(jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroFacturacionDefectoSessionBean parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		
		if(this.parametrofacturaciondefectoSessionBean==null) {
			this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		}
		
		this.parametrofacturaciondefectoSessionBean.setsUltimaBusquedaParametroFacturacionDefecto(this.getsAccionBusqueda());
		this.parametrofacturaciondefectoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrofacturaciondefectoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrofacturaciondefectoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametrofacturaciondefectoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
			parametrofacturaciondefectoSessionBean.setid_tipo_via_transporte(this.getid_tipo_via_transporteFK_IdTipoViaTransporte());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroFacturacionDefectoSessionBean parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		
		if(this.parametrofacturaciondefectoSessionBean==null) {
			this.parametrofacturaciondefectoSessionBean=new ParametroFacturacionDefectoSessionBean();
		}
		
		if(this.parametrofacturaciondefectoSessionBean.getsUltimaBusquedaParametroFacturacionDefecto()!=null&&!this.parametrofacturaciondefectoSessionBean.getsUltimaBusquedaParametroFacturacionDefecto().equals("")) {
			this.setsAccionBusqueda(parametrofacturaciondefectoSessionBean.getsUltimaBusquedaParametroFacturacionDefecto());
			this.setiNumeroPaginacion(parametrofacturaciondefectoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrofacturaciondefectoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrofacturaciondefectoSessionBean.getid_empresa());
				parametrofacturaciondefectoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametrofacturaciondefectoSessionBean.getid_sucursal());
				parametrofacturaciondefectoSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
				this.setid_tipo_via_transporteFK_IdTipoViaTransporte(parametrofacturaciondefectoSessionBean.getid_tipo_via_transporte());
				parametrofacturaciondefectoSessionBean.setid_tipo_via_transporte(-1L);
			}
		}
		
		this.parametrofacturaciondefectoSessionBean.setsUltimaBusquedaParametroFacturacionDefecto("");
		this.parametrofacturaciondefectoSessionBean.setiNumeroPaginacion(ParametroFacturacionDefectoConstantesFunciones.INUMEROPAGINACION);
		this.parametrofacturaciondefectoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroFacturacionDefecto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroFacturacionDefecto() {
		this.updateBorderResaltarBusquedasFormularioParametroFacturacionDefecto();
		this.updateVisibilidadBusquedasFormularioParametroFacturacionDefecto();
		this.updateHabilitarBusquedasFormularioParametroFacturacionDefecto();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroFacturacionDefecto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponents().length>0) {
	

		if(this.parametrofacturaciondefectoConstantesFunciones.resaltarFK_IdTipoViaTransporteParametroFacturacionDefecto!=null) {
			index= this.jTabbedPaneBusquedasParametroFacturacionDefecto.indexOfComponent(this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponent(index);
				jPanel.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltarFK_IdTipoViaTransporteParametroFacturacionDefecto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroFacturacionDefecto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroFacturacionDefecto.indexOfComponent(this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarFK_IdTipoViaTransporteParametroFacturacionDefecto);
			if(!this.parametrofacturaciondefectoConstantesFunciones.mostrarFK_IdTipoViaTransporteParametroFacturacionDefecto && index>-1) {
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroFacturacionDefecto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroFacturacionDefecto.indexOfComponent(this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrofacturaciondefectoConstantesFunciones.activarFK_IdTipoViaTransporteParametroFacturacionDefecto);
				this.jTabbedPaneBusquedasParametroFacturacionDefecto.setEnabledAt(index,this.parametrofacturaciondefectoConstantesFunciones.activarFK_IdTipoViaTransporteParametroFacturacionDefecto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroFacturacionDefecto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoViaTransporte")) {
			index= this.jTabbedPaneBusquedasParametroFacturacionDefecto.indexOfComponent(this.jPanelFK_IdTipoViaTransporteParametroFacturacionDefecto);

			this.jTabbedPaneBusquedasParametroFacturacionDefecto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroFacturacionDefecto.getComponent(index);

			this.parametrofacturaciondefectoConstantesFunciones.setResaltarFK_IdTipoViaTransporteParametroFacturacionDefecto(resaltar);

			jPanel.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltarFK_IdTipoViaTransporteParametroFacturacionDefecto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroFacturacionDefecto.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroFacturacionDefecto() throws Exception {

		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroFacturacionDefecto();
		this.updateVisibilidadResaltarControlesFormularioParametroFacturacionDefecto();
		this.updateHabilitarResaltarControlesFormularioParametroFacturacionDefecto();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroFacturacionDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrofacturaciondefectoConstantesFunciones.resaltaridParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltaridParametroFacturacionDefecto);}
		if(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_empresaParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_empresaParametroFacturacionDefecto);}
		if(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_sucursalParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_sucursalParametroFacturacionDefecto);}
		if(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_tipo_via_transporteParametroFacturacionDefecto!=null && this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setBorder(this.parametrofacturaciondefectoConstantesFunciones.resaltarid_tipo_via_transporteParametroFacturacionDefecto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroFacturacionDefecto() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
	
		//this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostraridParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelidParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostraridParametroFacturacionDefecto);
		//this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_empresaParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelid_empresaParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_empresaParametroFacturacionDefecto);
		//this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_sucursalParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelid_sucursalParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_sucursalParametroFacturacionDefecto);
		//this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_tipo_via_transporteParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jPanelid_tipo_via_transporteParametroFacturacionDefecto.setVisible(this.parametrofacturaciondefectoConstantesFunciones.mostrarid_tipo_via_transporteParametroFacturacionDefecto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroFacturacionDefecto() throws Exception {
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroFacturacionDefecto!=null) {
	
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jLabelidParametroFacturacionDefecto.setEnabled(this.parametrofacturaciondefectoConstantesFunciones.activaridParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_empresaParametroFacturacionDefecto.setEnabled(this.parametrofacturaciondefectoConstantesFunciones.activarid_empresaParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_sucursalParametroFacturacionDefecto.setEnabled(this.parametrofacturaciondefectoConstantesFunciones.activarid_sucursalParametroFacturacionDefecto);
		this.jInternalFrameDetalleFormParametroFacturacionDefecto.jComboBoxid_tipo_via_transporteParametroFacturacionDefecto.setEnabled(this.parametrofacturaciondefectoConstantesFunciones.activarid_tipo_via_transporteParametroFacturacionDefecto);
		}
	}
	
		
}