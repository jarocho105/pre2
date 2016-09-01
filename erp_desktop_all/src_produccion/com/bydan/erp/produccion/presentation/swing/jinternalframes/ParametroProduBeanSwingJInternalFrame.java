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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.ParametroProduConstantesFunciones;
import com.bydan.erp.produccion.util.ParametroProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.ParametroProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.ParametroProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroProduBeanSwingJInternalFrame extends ParametroProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroProdu> parametroproduValidator = new ClassValidator<ParametroProdu>(ParametroProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroProdu parametroprodu;	
	public ParametroProdu parametroproduAux;
	public ParametroProdu parametroproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroProdu parametroproduTotales;
	public Long idParametroProduActual;
	public Long iIdNuevoParametroProdu=0L;
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

	public String sFinalQueryComboBodegaMateriaPrima="";

	public List<Bodega> bodegamateriaprimasForeignKey;

	public List<Bodega> getbodegamateriaprimasForeignKey() {
		return bodegamateriaprimasForeignKey;
	}

	public void setbodegamateriaprimasForeignKey(List<Bodega> bodegamateriaprimasForeignKey) {
		this.bodegamateriaprimasForeignKey = bodegamateriaprimasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Bodega bodegamateriaprimaForeignKey;

	public Bodega getbodegamateriaprimaForeignKey() {
		return bodegamateriaprimaForeignKey;
	}

	public void setbodegamateriaprimaForeignKey(Bodega bodegamateriaprimaForeignKey) {
		this.bodegamateriaprimaForeignKey = bodegamateriaprimaForeignKey;
	}

	public String sFinalQueryComboTransaccion="";

	public List<Transaccion> transaccionsForeignKey;

	public List<Transaccion> gettransaccionsForeignKey() {
		return transaccionsForeignKey;
	}

	public void settransaccionsForeignKey(List<Transaccion> transaccionsForeignKey) {
		this.transaccionsForeignKey = transaccionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionForeignKey;

	public Transaccion gettransaccionForeignKey() {
		return transaccionForeignKey;
	}

	public void settransaccionForeignKey(Transaccion transaccionForeignKey) {
		this.transaccionForeignKey = transaccionForeignKey;
	}

	public String sFinalQueryComboTransaccionEgreso="";

	public List<Transaccion> transaccionegresosForeignKey;

	public List<Transaccion> gettransaccionegresosForeignKey() {
		return transaccionegresosForeignKey;
	}

	public void settransaccionegresosForeignKey(List<Transaccion> transaccionegresosForeignKey) {
		this.transaccionegresosForeignKey = transaccionegresosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionegresoForeignKey;

	public Transaccion gettransaccionegresoForeignKey() {
		return transaccionegresoForeignKey;
	}

	public void settransaccionegresoForeignKey(Transaccion transaccionegresoForeignKey) {
		this.transaccionegresoForeignKey = transaccionegresoForeignKey;
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
	
	public Boolean isPermisoTodoParametroProdu;
	public Boolean isPermisoNuevoParametroProdu;
	public Boolean isPermisoActualizarParametroProdu;
	public Boolean isPermisoActualizarOriginalParametroProdu;
	public Boolean isPermisoEliminarParametroProdu;
	public Boolean isPermisoGuardarCambiosParametroProdu;
	public Boolean isPermisoConsultaParametroProdu;
	public Boolean isPermisoBusquedaParametroProdu;
	public Boolean isPermisoReporteParametroProdu;
	public Boolean isPermisoPaginacionMedioParametroProdu;
	public Boolean isPermisoPaginacionAltoParametroProdu;
	public Boolean isPermisoPaginacionTodoParametroProdu;
	public Boolean isPermisoCopiarParametroProdu;
	public Boolean isPermisoVerFormParametroProdu;
	public Boolean isPermisoDuplicarParametroProdu;
	public Boolean isPermisoOrdenParametroProdu;
	
	
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
	
	public ParametroProduParameterReturnGeneral parametroproduReturnGeneral;
	public ParametroProduParameterReturnGeneral parametroproduParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroProdu=false;
	public Boolean esParaAccionDesdeFormularioParametroProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroProduSessionBeanAdditional parametroproduSessionBeanAdditional=null;
	
	public ParametroProduSessionBeanAdditional getParametroProduSessionBeanAdditional() {
		return this.parametroproduSessionBeanAdditional;
	}
	
	public void setParametroProduSessionBeanAdditional(ParametroProduSessionBeanAdditional parametroproduSessionBeanAdditional) {
		try {
			this.parametroproduSessionBeanAdditional=parametroproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroProduBeanSwingJInternalFrameAdditional parametroproduBeanSwingJInternalFrameAdditional=null;
	//public class ParametroProduBeanSwingJInternalFrame
	
	public ParametroProduBeanSwingJInternalFrameAdditional getParametroProduBeanSwingJInternalFrameAdditional() {
		return this.parametroproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroProduBeanSwingJInternalFrameAdditional(ParametroProduBeanSwingJInternalFrameAdditional parametroproduBeanSwingJInternalFrameAdditional) {
		try {
			this.parametroproduBeanSwingJInternalFrameAdditional=parametroproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroProduLogic parametroproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroProdu parametroproduBean;
	public ParametroProduConstantesFunciones parametroproduConstantesFunciones;
	//public ParametroProduParameterReturnGeneral parametroproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public BodegaLogic bodegaLogic;
	public BodegaLogic bodegamateriaprimaLogic;
	public TransaccionLogic transaccionLogic;
	public TransaccionLogic transaccionegresoLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroProdu> parametroprodus;	
	//public List<ParametroProdu> parametroprodusEliminados;
	//public List<ParametroProdu> parametroprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroProdu=false;
	public Boolean isVisibilidadCeldaDuplicarParametroProdu=true;
	public Boolean isVisibilidadCeldaCopiarParametroProdu=true;
	public Boolean isVisibilidadCeldaVerFormParametroProdu=true;
	public Boolean isVisibilidadCeldaOrdenParametroProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
	public Boolean isVisibilidadCeldaModificarParametroProdu=false;
	public Boolean isVisibilidadCeldaActualizarParametroProdu=false;
	public Boolean isVisibilidadCeldaEliminarParametroProdu=false;
	public Boolean isVisibilidadCeldaCancelarParametroProdu=false;
	public Boolean isVisibilidadCeldaGuardarParametroProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdBodegaMateriaPrima=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTransaccion=false;
	public Boolean isVisibilidadFK_IdTransaccionEgreso=false;
	
	public Long getiIdNuevoParametroProdu() {
		return this.iIdNuevoParametroProdu;
	}

	public void setiIdNuevoParametroProdu(Long iIdNuevoParametroProdu) {
		this.iIdNuevoParametroProdu = iIdNuevoParametroProdu;
	}
	
	public Long getidParametroProduActual() {
		return this.idParametroProduActual;
	}

	public void setidParametroProduActual(Long idParametroProduActual) {
		this.idParametroProduActual = idParametroProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroProdu getparametroprodu() {
		return this.parametroprodu;
	}

	public void setparametroprodu(ParametroProdu parametroprodu) {
		this.parametroprodu = parametroprodu;
	}
	
	public ParametroProdu getparametroproduAux() {
		return this.parametroproduAux;
	}

	public void setparametroproduAux(ParametroProdu parametroproduAux) {
		this.parametroproduAux = parametroproduAux;
	}				
	
	public ParametroProdu getparametroproduAnterior() {
		return this.parametroproduAnterior;
	}

	public void setparametroproduAnterior(ParametroProdu parametroproduAnterior) {
		this.parametroproduAnterior = parametroproduAnterior;
	}	
	
	public ParametroProdu getparametroproduTotales() {
		return this.parametroproduTotales;
	}

	public void setparametroproduTotales(ParametroProdu parametroproduTotales) {
		this.parametroproduTotales = parametroproduTotales;
	}	
	
	public ParametroProdu getparametroproduBean() {
		return this.parametroproduBean;
	}

	public void setparametroproduBean(ParametroProdu parametroproduBean) {
		this.parametroproduBean = parametroproduBean;
	}	
	
	public ParametroProduParameterReturnGeneral getparametroproduReturnGeneral() {
		return this.parametroproduReturnGeneral;
	}

	public void setparametroproduReturnGeneral(ParametroProduParameterReturnGeneral parametroproduReturnGeneral) {
		this.parametroproduReturnGeneral = parametroproduReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_bodega_materia_primaFK_IdBodegaMateriaPrima=-1L;

	public Long getid_bodega_materia_primaFK_IdBodegaMateriaPrima() {
		return this.id_bodega_materia_primaFK_IdBodegaMateriaPrima;
	}

	public void setid_bodega_materia_primaFK_IdBodegaMateriaPrima(Long id_bodega_materia_primaFK_IdBodegaMateriaPrima) {
		this.id_bodega_materia_primaFK_IdBodegaMateriaPrima = id_bodega_materia_primaFK_IdBodegaMateriaPrima;
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

	public Long id_transaccionFK_IdTransaccion=-1L;

	public Long getid_transaccionFK_IdTransaccion() {
		return this.id_transaccionFK_IdTransaccion;
	}

	public void setid_transaccionFK_IdTransaccion(Long id_transaccionFK_IdTransaccion) {
		this.id_transaccionFK_IdTransaccion = id_transaccionFK_IdTransaccion;
	}

	public Long id_transaccion_egresoFK_IdTransaccionEgreso=-1L;

	public Long getid_transaccion_egresoFK_IdTransaccionEgreso() {
		return this.id_transaccion_egresoFK_IdTransaccionEgreso;
	}

	public void setid_transaccion_egresoFK_IdTransaccionEgreso(Long id_transaccion_egresoFK_IdTransaccionEgreso) {
		this.id_transaccion_egresoFK_IdTransaccionEgreso = id_transaccion_egresoFK_IdTransaccionEgreso;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroProduLogic getParametroProduLogic()	{		
		return parametroproduLogic;
	}

	public void setParametroProduLogic(ParametroProduLogic parametroproduLogic) {
		this.parametroproduLogic = parametroproduLogic;
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
	
	public Boolean getIsEsNuevoParametroProdu() {
		return isEsNuevoParametroProdu;
	}

	public void setIsEsNuevoParametroProdu(Boolean isEsNuevoParametroProdu) {
		this.isEsNuevoParametroProdu = isEsNuevoParametroProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroProdu() {
		return esParaAccionDesdeFormularioParametroProdu;
	}
	
	public void setEsParaAccionDesdeFormularioParametroProdu(Boolean esParaAccionDesdeFormularioParametroProdu) {
		this.esParaAccionDesdeFormularioParametroProdu = esParaAccionDesdeFormularioParametroProdu;
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

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametroproduSessionBean.getlidEmpresaActual());
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

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(parametroproduSessionBean.getlidSucursalActual());
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

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(parametroproduSessionBean.getlidBodegaActual());
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

	public void cargarCombosBodegaMateriaPrimasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.bodegamateriaprimasForeignKey=new ArrayList<Bodega>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			BodegaLogic bodegaLogic=new BodegaLogic();

			//bodegaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaMateriaPrima()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bodegamateriaprimaLogic.getBodegaDataAccess().setIsForForeingKeyData(true);

					bodegaLogic.getTodosBodegasWithConnection(sFinalQuery,new Pagination());

					this.bodegamateriaprimasForeignKey=bodegaLogic.getBodegas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaBodegaMateriaPrima(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					bodegaLogic.getEntityWithConnection(parametroproduSessionBean.getlidBodegaMateriaPrimaActual());
					this.bodegamateriaprimasForeignKey.add(bodegaLogic.getBodega());
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

	public void cargarCombosTransaccionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionsForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionsForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametroproduSessionBean.getlidTransaccionActual());
					this.transaccionsForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionEgresosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionegresosForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionEgreso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionegresoLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionegresosForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionEgreso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametroproduSessionBean.getlidTransaccionEgresoActual());
					this.transaccionegresosForeignKey.add(transaccionLogic.getTransaccion());
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

					if(this.parametroprodu!=null) {
						this.parametroprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroProduGenerico)throws Exception
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
				jComboBoxid_empresaParametroProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroProduGenerico!=null && jComboBoxid_empresaParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroProduGenerico.setSelectedIndex(0);
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

					if(this.parametroprodu!=null) {
						this.parametroprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalParametroProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalParametroProduGenerico)throws Exception
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
				jComboBoxid_sucursalParametroProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalParametroProduGenerico!=null && jComboBoxid_sucursalParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalParametroProduGenerico.setSelectedIndex(0);
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

					if(this.parametroprodu!=null) {
						this.parametroprodu.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaParametroProdu.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaParametroProdu!=null) {
						jComboBoxid_bodegaFK_IdBodegaParametroProdu.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaParametroProdu!=null) {
							//jComboBoxid_bodegaFK_IdBodegaParametroProdu.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaParametroProdu.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaParametroProdu.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaParametroProduGenerico)throws Exception
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
				jComboBoxid_bodegaParametroProduGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaParametroProduGenerico!=null && jComboBoxid_bodegaParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_bodegaParametroProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualBodegaMateriaPrimaForeignKey(Long idBodegaMateriaPrimaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Bodega  bodegamateriaprimaTemp=null;

			for(Bodega bodegamateriaprimaAux:bodegamateriaprimasForeignKey) {
				if(bodegamateriaprimaAux.getId()!=null && bodegamateriaprimaAux.getId().equals(idBodegaMateriaPrimaSeleccionado)) {
					bodegamateriaprimaTemp=bodegamateriaprimaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(bodegamateriaprimaTemp!=null) {

					if(this.parametroprodu!=null) {
						this.parametroprodu.setBodegaMateriaPrima(bodegamateriaprimaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setSelectedItem(bodegamateriaprimaTemp);
					}
				} else {
					//jComboBoxid_bodega_materia_primaParametroProdu.setSelectedItem(bodegamateriaprimaTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodegaMateriaPrima") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegamateriaprimaTemp!=null && jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu!=null) {
						jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setSelectedItem(bodegamateriaprimaTemp);
					} else {
						if(jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu!=null) {
							//jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setSelectedItem(bodegamateriaprimaTemp);
							if(jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.getItemCount()>0) {
								jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setSelectedIndex(0);
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

	public String getActualBodegaMateriaPrimaForeignKeyDescripcion(Long idBodegaMateriaPrimaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Bodega  bodegamateriaprimaTemp=null;

			for(Bodega bodegamateriaprimaAux:bodegamateriaprimasForeignKey) {
				if(bodegamateriaprimaAux.getId()!=null && bodegamateriaprimaAux.getId().equals(idBodegaMateriaPrimaSeleccionado)) {
					bodegamateriaprimaTemp=bodegamateriaprimaAux;
					break;
				}
			}


			sDescripcion=BodegaConstantesFunciones.getBodegaDescripcion(bodegamateriaprimaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualBodegaMateriaPrimaForeignKeyGenerico(Long idBodegaMateriaPrimaSeleccionado,JComboBox jComboBoxid_bodega_materia_primaParametroProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegamateriaprimaTemp=null;

			for(Bodega bodegamateriaprimaAux:bodegamateriaprimasForeignKey) {
				if(bodegamateriaprimaAux.getId()!=null && bodegamateriaprimaAux.getId().equals(idBodegaMateriaPrimaSeleccionado)) {
					bodegamateriaprimaTemp=bodegamateriaprimaAux;
					break;
				}
			}

			if(bodegamateriaprimaTemp!=null) {
				jComboBoxid_bodega_materia_primaParametroProduGenerico.setSelectedItem(bodegamateriaprimaTemp);
			} else {
				if(jComboBoxid_bodega_materia_primaParametroProduGenerico!=null && jComboBoxid_bodega_materia_primaParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_bodega_materia_primaParametroProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionForeignKey(Long idTransaccionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionTemp!=null) {

					if(this.parametroprodu!=null) {
						this.parametroprodu.setTransaccion(transaccionTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setSelectedItem(transaccionTemp);
					}
				} else {
					//jComboBoxid_transaccionParametroProdu.setSelectedItem(transaccionTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionTemp!=null && jComboBoxid_transaccionFK_IdTransaccionParametroProdu!=null) {
						jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setSelectedItem(transaccionTemp);
					} else {
						if(jComboBoxid_transaccionFK_IdTransaccionParametroProdu!=null) {
							//jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setSelectedItem(transaccionTemp);
							if(jComboBoxid_transaccionFK_IdTransaccionParametroProdu.getItemCount()>0) {
								jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setSelectedIndex(0);
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

	public String getActualTransaccionForeignKeyDescripcion(Long idTransaccionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionForeignKeyGenerico(Long idTransaccionSeleccionado,JComboBox jComboBoxid_transaccionParametroProduGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionTemp=null;

			for(Transaccion transaccionAux:transaccionsForeignKey) {
				if(transaccionAux.getId()!=null && transaccionAux.getId().equals(idTransaccionSeleccionado)) {
					transaccionTemp=transaccionAux;
					break;
				}
			}

			if(transaccionTemp!=null) {
				jComboBoxid_transaccionParametroProduGenerico.setSelectedItem(transaccionTemp);
			} else {
				if(jComboBoxid_transaccionParametroProduGenerico!=null && jComboBoxid_transaccionParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_transaccionParametroProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionEgresoForeignKey(Long idTransaccionEgresoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionegresoTemp=null;

			for(Transaccion transaccionegresoAux:transaccionegresosForeignKey) {
				if(transaccionegresoAux.getId()!=null && transaccionegresoAux.getId().equals(idTransaccionEgresoSeleccionado)) {
					transaccionegresoTemp=transaccionegresoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionegresoTemp!=null) {

					if(this.parametroprodu!=null) {
						this.parametroprodu.setTransaccionEgreso(transaccionegresoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setSelectedItem(transaccionegresoTemp);
					}
				} else {
					//jComboBoxid_transaccion_egresoParametroProdu.setSelectedItem(transaccionegresoTemp);
					if(this.jInternalFrameDetalleFormParametroProdu!=null) {
						if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionEgreso") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionegresoTemp!=null && jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu!=null) {
						jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setSelectedItem(transaccionegresoTemp);
					} else {
						if(jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu!=null) {
							//jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setSelectedItem(transaccionegresoTemp);
							if(jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.getItemCount()>0) {
								jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setSelectedIndex(0);
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

	public String getActualTransaccionEgresoForeignKeyDescripcion(Long idTransaccionEgresoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionegresoTemp=null;

			for(Transaccion transaccionegresoAux:transaccionegresosForeignKey) {
				if(transaccionegresoAux.getId()!=null && transaccionegresoAux.getId().equals(idTransaccionEgresoSeleccionado)) {
					transaccionegresoTemp=transaccionegresoAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionegresoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionEgresoForeignKeyGenerico(Long idTransaccionEgresoSeleccionado,JComboBox jComboBoxid_transaccion_egresoParametroProduGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionegresoTemp=null;

			for(Transaccion transaccionegresoAux:transaccionegresosForeignKey) {
				if(transaccionegresoAux.getId()!=null && transaccionegresoAux.getId().equals(idTransaccionEgresoSeleccionado)) {
					transaccionegresoTemp=transaccionegresoAux;
					break;
				}
			}

			if(transaccionegresoTemp!=null) {
				jComboBoxid_transaccion_egresoParametroProduGenerico.setSelectedItem(transaccionegresoTemp);
			} else {
				if(jComboBoxid_transaccion_egresoParametroProduGenerico!=null && jComboBoxid_transaccion_egresoParametroProduGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_egresoParametroProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_empresaParametroProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametroprodu.setid_empresa(empresaAux.getId());
				parametroprodu.setempresa_descripcion(ParametroProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametroprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_sucursalParametroProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalParametroProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalParametroProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				parametroprodu.setid_sucursal(sucursalAux.getId());
				parametroprodu.setsucursal_descripcion(ParametroProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				parametroprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_bodegaParametroProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaParametroProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaParametroProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				parametroprodu.setid_bodega(bodegaAux.getId());
				parametroprodu.setbodega_descripcion(ParametroProduConstantesFunciones.getBodegaDescripcion(bodegaAux));
				parametroprodu.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaMateriaPrimaForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_bodega_materia_primaParametroProduGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodega_materia_primaParametroProduGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodega_materia_primaParametroProduGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				parametroprodu.setid_bodega_materia_prima(bodegaAux.getId());
				parametroprodu.setbodegamateriaprima_descripcion(ParametroProduConstantesFunciones.getBodegaMateriaPrimaDescripcion(bodegaAux));
				parametroprodu.setBodegaMateriaPrima(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_transaccionParametroProduGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccionParametroProduGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccionParametroProduGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametroprodu.setid_transaccion(transaccionAux.getId());
				parametroprodu.settransaccion_descripcion(ParametroProduConstantesFunciones.getTransaccionDescripcion(transaccionAux));
				parametroprodu.setTransaccion(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionEgresoForeignKey(ParametroProdu parametroprodu,JComboBox jComboBoxid_transaccion_egresoParametroProduGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_egresoParametroProduGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_egresoParametroProduGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametroprodu.setid_transaccion_egreso(transaccionAux.getId());
				parametroprodu.settransaccionegreso_descripcion(ParametroProduConstantesFunciones.getTransaccionEgresoDescripcion(transaccionAux));
				parametroprodu.setTransaccionEgreso(transaccionAux);			}
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

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.addItem(bodega);
							}
						}

						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameBodegaMateriaPrimasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingBodega=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.removeAllItems();

							for(Bodega bodegamateriaprima:this.bodegamateriaprimasForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.addItem(bodegamateriaprima);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodegaMateriaPrima") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.removeAllItems();

							for(Bodega bodegamateriaprima:this.bodegamateriaprimasForeignKey) {
								this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.addItem(bodegamateriaprima);
							}
						}

						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.addItem(transaccion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.removeAllItems();

							for(Transaccion transaccion:this.transaccionsForeignKey) {
								this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.addItem(transaccion);
							}
						}

						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionEgresosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.removeAllItems();

							for(Transaccion transaccionegreso:this.transaccionegresosForeignKey) {
								this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.addItem(transaccionegreso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroProdu!=null) { 
					}

					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionEgreso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.removeAllItems();

							for(Transaccion transaccionegreso:this.transaccionegresosForeignKey) {
								this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.addItem(transaccionegreso);
							}
						}

						if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameBodegaForeignKey(Bodega bodega,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameBodegaMateriaPrimaForeignKey(Bodega bodegamateriaprima,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setSelectedItem(bodegamateriaprima);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setSelectedItem(bodegamateriaprima);
						} else {
							this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionForeignKey(Transaccion transaccion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setSelectedItem(transaccion);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setSelectedItem(transaccion);
						} else {
							this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionEgresoForeignKey(Transaccion transaccionegreso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setSelectedItem(transaccionegreso);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroProdu!=null) {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setSelectedItem(transaccionegreso);
						} else {
							this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroProduConstantesFunciones.refrescarForeignKeysDescripcionesParametroProdu(this.parametroproduLogic.getParametroProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroProduConstantesFunciones.refrescarForeignKeysDescripcionesParametroProdu(this.parametroprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(Transaccion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametroproduLogic.setParametroProdus(this.parametroprodus);
			parametroproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroProduParameterReturnGeneral getParametroProduParameterGeneral() {
		return this.parametroproduParameterGeneral;
	}
	
	public void setParametroProduParameterGeneral(ParametroProduParameterReturnGeneral parametroproduParameterGeneral) {
		this.parametroproduParameterGeneral = parametroproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroProdu() {
		return isPermisoTodoParametroProdu;
	}

	public void setIsPermisoTodoParametroProdu(Boolean isPermisoTodoParametroProdu) {
		this.isPermisoTodoParametroProdu = isPermisoTodoParametroProdu;
	}

	public Boolean getIsPermisoNuevoParametroProdu() {
		return isPermisoNuevoParametroProdu;
	}

	public void setIsPermisoNuevoParametroProdu(Boolean isPermisoNuevoParametroProdu) {
		this.isPermisoNuevoParametroProdu = isPermisoNuevoParametroProdu;
	}

	public Boolean getIsPermisoActualizarParametroProdu() {
		return isPermisoActualizarParametroProdu;
	}

	public void setIsPermisoActualizarParametroProdu(Boolean isPermisoActualizarParametroProdu) {
		this.isPermisoActualizarParametroProdu = isPermisoActualizarParametroProdu;
	}

	public Boolean getIsPermisoEliminarParametroProdu() {
		return isPermisoEliminarParametroProdu;
	}

	public void setIsPermisoEliminarParametroProdu(Boolean isPermisoEliminarParametroProdu) {
		this.isPermisoEliminarParametroProdu = isPermisoEliminarParametroProdu;
	}

	public Boolean getIsPermisoGuardarCambiosParametroProdu() {
		return isPermisoGuardarCambiosParametroProdu;
	}

	public void setIsPermisoGuardarCambiosParametroProdu(Boolean isPermisoGuardarCambiosParametroProdu) {
		this.isPermisoGuardarCambiosParametroProdu = isPermisoGuardarCambiosParametroProdu;
	}
	
	public Boolean getIsPermisoConsultaParametroProdu() {
		return isPermisoConsultaParametroProdu;
	}

	public void setIsPermisoConsultaParametroProdu(Boolean isPermisoConsultaParametroProdu) {
		this.isPermisoConsultaParametroProdu = isPermisoConsultaParametroProdu;
	}

	public Boolean getIsPermisoBusquedaParametroProdu() {
		return isPermisoBusquedaParametroProdu;
	}

	public void setIsPermisoBusquedaParametroProdu(Boolean isPermisoBusquedaParametroProdu) {
		this.isPermisoBusquedaParametroProdu = isPermisoBusquedaParametroProdu;
	}

	public Boolean getIsPermisoReporteParametroProdu() {
		return isPermisoReporteParametroProdu;
	}

	public void setIsPermisoReporteParametroProdu(Boolean isPermisoReporteParametroProdu) {
		this.isPermisoReporteParametroProdu = isPermisoReporteParametroProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroProdu() {
		return isPermisoPaginacionMedioParametroProdu;
	}

	public void setIsPermisoPaginacionMedioParametroProdu(Boolean isPermisoPaginacionMedioParametroProdu) {
		this.isPermisoPaginacionMedioParametroProdu = isPermisoPaginacionMedioParametroProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroProdu() {
		return isPermisoPaginacionTodoParametroProdu;
	}

	public void setIsPermisoPaginacionTodoParametroProdu(Boolean isPermisoPaginacionTodoParametroProdu) {
		this.isPermisoPaginacionTodoParametroProdu = isPermisoPaginacionTodoParametroProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroProdu() {
		return isPermisoPaginacionAltoParametroProdu;
	}

	public void setIsPermisoPaginacionAltoParametroProdu(Boolean isPermisoPaginacionAltoParametroProdu) {
		this.isPermisoPaginacionAltoParametroProdu = isPermisoPaginacionAltoParametroProdu;
	}
	
	public Boolean getIsPermisoCopiarParametroProdu() {
		return isPermisoCopiarParametroProdu;
	}

	public void setIsPermisoCopiarParametroProdu(Boolean isPermisoCopiarParametroProdu) {
		this.isPermisoCopiarParametroProdu = isPermisoCopiarParametroProdu;
	}
	
	public Boolean getIsPermisoVerFormParametroProdu() {
		return isPermisoVerFormParametroProdu;
	}

	public void setIsPermisoVerFormParametroProdu(Boolean isPermisoVerFormParametroProdu) {
		this.isPermisoVerFormParametroProdu = isPermisoVerFormParametroProdu;
	}
	
	public Boolean getIsPermisoDuplicarParametroProdu() {
		return isPermisoDuplicarParametroProdu;
	}

	public void setIsPermisoDuplicarParametroProdu(Boolean isPermisoDuplicarParametroProdu) {
		this.isPermisoDuplicarParametroProdu = isPermisoDuplicarParametroProdu;
	}
	
	public Boolean getIsPermisoOrdenParametroProdu() {
		return isPermisoOrdenParametroProdu;
	}

	public void setIsPermisoOrdenParametroProdu(Boolean isPermisoOrdenParametroProdu) {
		this.isPermisoOrdenParametroProdu = isPermisoOrdenParametroProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroProdu() {
		return isVisibilidadCeldaNuevoParametroProdu;
	}

	public void setIsVisibilidadCeldaNuevoParametroProdu(Boolean isVisibilidadCeldaNuevoParametroProdu) {
		this.isVisibilidadCeldaNuevoParametroProdu = isVisibilidadCeldaNuevoParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroProdu() {
		return isVisibilidadCeldaDuplicarParametroProdu;
	}

	public void setIsVisibilidadCeldaDuplicarParametroProdu(Boolean isVisibilidadCeldaDuplicarParametroProdu) {
		this.isVisibilidadCeldaDuplicarParametroProdu = isVisibilidadCeldaDuplicarParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroProdu() {
		return isVisibilidadCeldaCopiarParametroProdu;
	}

	public void setIsVisibilidadCeldaCopiarParametroProdu(Boolean isVisibilidadCeldaCopiarParametroProdu) {
		this.isVisibilidadCeldaCopiarParametroProdu = isVisibilidadCeldaCopiarParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroProdu() {
		return isVisibilidadCeldaVerFormParametroProdu;
	}

	public void setIsVisibilidadCeldaVerFormParametroProdu(Boolean isVisibilidadCeldaVerFormParametroProdu) {
		this.isVisibilidadCeldaVerFormParametroProdu = isVisibilidadCeldaVerFormParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroProdu() {
		return isVisibilidadCeldaOrdenParametroProdu;
	}

	public void setIsVisibilidadCeldaOrdenParametroProdu(Boolean isVisibilidadCeldaOrdenParametroProdu) {
		this.isVisibilidadCeldaOrdenParametroProdu = isVisibilidadCeldaOrdenParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroProdu() {
		return isVisibilidadCeldaNuevoRelacionesParametroProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroProdu(Boolean isVisibilidadCeldaNuevoRelacionesParametroProdu) {
		this.isVisibilidadCeldaNuevoRelacionesParametroProdu = isVisibilidadCeldaNuevoRelacionesParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroProdu() {
		return isVisibilidadCeldaModificarParametroProdu;
	}

	public void setIsVisibilidadCeldaModificarParametroProdu(Boolean isVisibilidadCeldaModificarParametroProdu) {
		this.isVisibilidadCeldaModificarParametroProdu = isVisibilidadCeldaModificarParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroProdu() {
		return isVisibilidadCeldaActualizarParametroProdu;
	}

	public void setIsVisibilidadCeldaActualizarParametroProdu(Boolean isVisibilidadCeldaActualizarParametroProdu) {
		this.isVisibilidadCeldaActualizarParametroProdu = isVisibilidadCeldaActualizarParametroProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroProdu() {
		return isVisibilidadCeldaEliminarParametroProdu;
	}

	public void setIsVisibilidadCeldaEliminarParametroProdu(Boolean isVisibilidadCeldaEliminarParametroProdu) {
		this.isVisibilidadCeldaEliminarParametroProdu = isVisibilidadCeldaEliminarParametroProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroProdu() {
		return isVisibilidadCeldaCancelarParametroProdu;
	}

	public void setIsVisibilidadCeldaCancelarParametroProdu(Boolean isVisibilidadCeldaCancelarParametroProdu) {
		this.isVisibilidadCeldaCancelarParametroProdu = isVisibilidadCeldaCancelarParametroProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroProdu() {
		return isVisibilidadCeldaGuardarParametroProdu;
	}

	public void setIsVisibilidadCeldaGuardarParametroProdu(Boolean isVisibilidadCeldaGuardarParametroProdu) {
		this.isVisibilidadCeldaGuardarParametroProdu = isVisibilidadCeldaGuardarParametroProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroProdu() {
		return isVisibilidadCeldaGuardarCambiosParametroProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroProdu(Boolean isVisibilidadCeldaGuardarCambiosParametroProdu) {
		this.isVisibilidadCeldaGuardarCambiosParametroProdu = isVisibilidadCeldaGuardarCambiosParametroProdu;
	}
		
	public ParametroProduSessionBean getparametroproduSessionBean() {
		return this.parametroproduSessionBean;
	}
	
	public void setparametroproduSessionBean(ParametroProduSessionBean parametroproduSessionBean) {
		this.parametroproduSessionBean=parametroproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdBodegaMateriaPrima() {
		return this.isVisibilidadFK_IdBodegaMateriaPrima;
	}

	public void setisVisibilidadFK_IdBodegaMateriaPrima(Boolean isVisibilidadFK_IdBodegaMateriaPrima) {
		this.isVisibilidadFK_IdBodegaMateriaPrima=isVisibilidadFK_IdBodegaMateriaPrima;
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

	public Boolean getisVisibilidadFK_IdTransaccion() {
		return this.isVisibilidadFK_IdTransaccion;
	}

	public void setisVisibilidadFK_IdTransaccion(Boolean isVisibilidadFK_IdTransaccion) {
		this.isVisibilidadFK_IdTransaccion=isVisibilidadFK_IdTransaccion;
	}

	public Boolean getisVisibilidadFK_IdTransaccionEgreso() {
		return this.isVisibilidadFK_IdTransaccionEgreso;
	}

	public void setisVisibilidadFK_IdTransaccionEgreso(Boolean isVisibilidadFK_IdTransaccionEgreso) {
		this.isVisibilidadFK_IdTransaccionEgreso=isVisibilidadFK_IdTransaccionEgreso;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroProdu(ParametroProdu parametroprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametroprodu,null);
				this.setActualParaGuardarSucursalForeignKey(parametroprodu,null);
				this.setActualParaGuardarBodegaForeignKey(parametroprodu,null);
				this.setActualParaGuardarBodegaMateriaPrimaForeignKey(parametroprodu,null);
				this.setActualParaGuardarTransaccionForeignKey(parametroprodu,null);
				this.setActualParaGuardarTransaccionEgresoForeignKey(parametroprodu,null);
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
	
	public void bugActualizarReferenciaActual(ParametroProdu parametroprodu,ParametroProdu parametroproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroProdu(parametroprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametroproduAux.setId(parametroprodu.getId());
		parametroproduAux.setVersionRow(parametroprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroProdu();
		
			int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametroproduValidator.getInvalidValues(this.parametroprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametroproduLogic.setDatosCliente(datosCliente);
			parametroproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametroproduAux=new  ParametroProdu();
				
				parametroproduAux.setIsNew(true);
				parametroproduAux.setIsChanged(true);
				
				parametroproduAux.setParametroProduOriginal(this.parametroprodu);
				
				parametroproduAux.setId(this.parametroprodu.getId());	
				parametroproduAux.setVersionRow(this.parametroprodu.getVersionRow());	
				parametroproduAux.setid_empresa(this.parametroprodu.getid_empresa());	
				parametroproduAux.setid_sucursal(this.parametroprodu.getid_sucursal());	
				parametroproduAux.setid_bodega(this.parametroprodu.getid_bodega());	
				parametroproduAux.setid_bodega_materia_prima(this.parametroprodu.getid_bodega_materia_prima());	
				parametroproduAux.setid_transaccion(this.parametroprodu.getid_transaccion());	
				parametroproduAux.setid_transaccion_egreso(this.parametroprodu.getid_transaccion_egreso());	
				parametroproduAux.setcon_relacion_porcentaje(this.parametroprodu.getcon_relacion_porcentaje());	
				parametroproduAux.setdescripcion(this.parametroprodu.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproduAux,parametroprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.saveParametroProdus();//WithConnection
						//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);
					
					this.refrescarForeignKeysDescripcionesParametroProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproduLogic.saveParametroProduRelaciones(parametroproduAux);//WithConnection
								//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroproduAux,parametroprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametroproduAux=new  ParametroProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametroproduSessionBean.getEsGuardarRelacionado() 
					|| (this.parametroproduSessionBean.getEsGuardarRelacionado() && this.parametroprodu.getId()>=0)) {
						
					parametroproduAux.setIsNew(false);
				}
				
				parametroproduAux.setIsDeleted(false);
			
				parametroproduAux.setId(this.parametroprodu.getId());	
				parametroproduAux.setVersionRow(this.parametroprodu.getVersionRow());	
				parametroproduAux.setid_empresa(this.parametroprodu.getid_empresa());	
				parametroproduAux.setid_sucursal(this.parametroprodu.getid_sucursal());	
				parametroproduAux.setid_bodega(this.parametroprodu.getid_bodega());	
				parametroproduAux.setid_bodega_materia_prima(this.parametroprodu.getid_bodega_materia_prima());	
				parametroproduAux.setid_transaccion(this.parametroprodu.getid_transaccion());	
				parametroproduAux.setid_transaccion_egreso(this.parametroprodu.getid_transaccion_egreso());	
				parametroproduAux.setcon_relacion_porcentaje(this.parametroprodu.getcon_relacion_porcentaje());	
				parametroproduAux.setdescripcion(this.parametroprodu.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproduAux,parametroprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.saveParametroProdus();//WithConnection
						//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);
					
					this.refrescarForeignKeysDescripcionesParametroProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproduLogic.saveParametroProduRelaciones(parametroproduAux);//WithConnection
								//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametroproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametroproduAux,parametroprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametroprodu,parametroproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametroproduAux=new  ParametroProdu();
				
				parametroproduAux.setIsNew(false);
				parametroproduAux.setIsChanged(false);
				
				parametroproduAux.setIsDeleted(true);
				
				parametroproduAux.setId(this.parametroprodu.getId());	
				parametroproduAux.setVersionRow(this.parametroprodu.getVersionRow());	
				parametroproduAux.setid_empresa(this.parametroprodu.getid_empresa());	
				parametroproduAux.setid_sucursal(this.parametroprodu.getid_sucursal());	
				parametroproduAux.setid_bodega(this.parametroprodu.getid_bodega());	
				parametroproduAux.setid_bodega_materia_prima(this.parametroprodu.getid_bodega_materia_prima());	
				parametroproduAux.setid_transaccion(this.parametroprodu.getid_transaccion());	
				parametroproduAux.setid_transaccion_egreso(this.parametroprodu.getid_transaccion_egreso());	
				parametroproduAux.setcon_relacion_porcentaje(this.parametroprodu.getcon_relacion_porcentaje());	
				parametroproduAux.setdescripcion(this.parametroprodu.getdescripcion());	
				
				if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametroproduAux.getId()>=0) {	
						this.parametroprodusEliminados.add(parametroproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproduAux,parametroprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametroproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.saveParametroProdus();//WithConnection
						//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametroproduLogic.saveParametroProduRelaciones(parametroproduAux);//WithConnection
								//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
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
							if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametroproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametroproduAux,parametroproduLogic.getParametroProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametroproduAux,parametroprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getParametroProdus().addAll(this.parametroprodusEliminados);
					
					parametroproduLogic.saveParametroProdus();//WithConnection
					//parametroproduLogic.getSetVersionRowParametroProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroProdu();
				
				this.parametroprodusEliminados= new ArrayList<ParametroProdu>();		
			}
			
			if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametroprodu=parametroproduAux;
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
      		//this.finishProcessParametroProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroProdu parametroproduLocal) throws Exception {
		
		if(this.parametroproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroProdu parametroproduLocal) throws Exception {	
		if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametroproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				parametroproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				parametroproduLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegamateriaprimaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegamateriaprimaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegamateriaprimaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegamateriaprimaBeanSwingJInternalFrameLocal.actualizarLista(bodegamateriaprimaBeanSwingJInternalFrameLocal.bodega,this.bodegamateriaprimasForeignKey);

				bodegamateriaprimaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegamateriaprimaBeanSwingJInternalFrameLocal.bodega);

				parametroproduLocal.setBodegaMateriaPrima(bodegamateriaprimaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodegaMateriaPrima();
				this.cargarCombosFrameBodegaMateriaPrimasForeignKey("Formulario");
				this.setActualBodegaMateriaPrimaForeignKey(bodegamateriaprimaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionBeanSwingJInternalFrameLocal.actualizarLista(transaccionBeanSwingJInternalFrameLocal.transaccion,this.transaccionsForeignKey);

				transaccionBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionBeanSwingJInternalFrameLocal.transaccion);

				parametroproduLocal.setTransaccion(transaccionBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey("Formulario");
				this.setActualTransaccionForeignKey(transaccionBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionegresoBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionegresoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionegresoBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionegresoBeanSwingJInternalFrameLocal.actualizarLista(transaccionegresoBeanSwingJInternalFrameLocal.transaccion,this.transaccionegresosForeignKey);

				transaccionegresoBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionegresoBeanSwingJInternalFrameLocal.transaccion);

				parametroproduLocal.setTransaccionEgreso(transaccionegresoBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionEgreso();
				this.cargarCombosFrameTransaccionEgresosForeignKey("Formulario");
				this.setActualTransaccionEgresoForeignKey(transaccionegresoBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametroproduValidator.getInvalidValues(this.parametroprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroProdu parametroprodu,List<ParametroProdu> parametroprodus) throws Exception {
		try	{		
			ParametroProduConstantesFunciones.actualizarLista(parametroprodu,parametroprodus,this.parametroproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroProdu parametroprodu,List<ParametroProdu> parametroprodus) throws Exception {
		try	{			
			ParametroProduConstantesFunciones.actualizarSelectedLista(parametroprodu,parametroprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroProdu> parametroprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametroprodusLocal=this.parametroproduLogic.getParametroProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametroprodusLocal=this.parametroprodus;
			}
			//ARCHITECTURE
		
			for(ParametroProdu parametroproduLocal:parametroprodusLocal) {
				if(this.permiteMantenimiento(parametroproduLocal) && parametroproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroProduConstantesFunciones.getParametroProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_empresaParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_sucursalParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_bodegaParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDBODEGAMATERIAPRIMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_bodega_materia_primaParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDTRANSACCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_transaccionParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.IDTRANSACCIONEGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelid_transaccion_egresoParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.CONRELACIONPORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelcon_relacion_porcentajeParametroProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabeldescripcionParametroProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_empresaParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_sucursalParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_bodegaParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_bodega_materia_primaParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_transaccionParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelid_transaccion_egresoParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabelcon_relacion_porcentajeParametroProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroProdu.jLabeldescripcionParametroProdu,"");
		
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
		this.iIdNuevoParametroProdu--;	
		
		
		this.parametroproduAux=new ParametroProdu();
		
		this.parametroproduAux.setId(this.iIdNuevoParametroProdu);
		this.parametroproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametroproduLogic.getParametroProdus().add(this.parametroproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametroprodus.add(this.parametroproduAux);
		}
		//ARCHITECTURE
		
		this.parametroprodu=this.parametroproduAux;
		
		if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroProdu(this.parametroprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroProdu(this.parametroprodu);
		}
				
		//this.setDefaultControlesParametroProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroProdu(this.parametroproduBean,this.parametroprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
			classes=ParametroProduConstantesFunciones.getClassesRelationshipsOfParametroProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametroproduReturnGeneral=parametroproduLogic.procesarEventosParametroProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroproduLogic.getParametroProdus(),this.parametroprodu,this.parametroproduParameterGeneral,this.isEsNuevoParametroProdu,classes);//this.parametroproduLogic.getParametroProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroProdu(this.parametroproduReturnGeneral,this.parametroproduBean,false);
		
		if(this.parametroproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroProdu(this.parametroproduReturnGeneral.getParametroProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroProdu(this.parametroproduReturnGeneral.getParametroProdu());
		}
		
		if(this.parametroproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroProdu(this.parametroproduReturnGeneral.getParametroProdu(),classes);//this.parametroproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroProduBeanSwingJInternalFrameAdditional.RecargarFormParametroProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroProdu(false);
						
			if(parametroproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProdu();
			}
			
			this.actualizarVisualTableDatosParametroProdu();
			
			this.jTableDatosParametroProdu.setRowSelectionInterval(this.getIndiceNuevoParametroProdu(), this.getIndiceNuevoParametroProdu());
			
			this.seleccionarFilaTablaParametroProduActual();
						
			this.actualizarEstadoCeldasBotonesParametroProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarcon_relacion_porcentajeParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activardescripcionParametroProdu);	
		//
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_empresaParametroProdu);//
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_sucursalParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_bodegaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_bodega_materia_primaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_transaccionParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setEnabled(isHabilitar && this.parametroproduConstantesFunciones.activarid_transaccion_egresoParametroProdu);
	};
	
	public void setDefaultControlesParametroProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametroproduSessionBean.setConGuardarRelaciones(true);			
			this.parametroproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.setVisible(true);
			
					
		} else {
			//this.parametroproduSessionBean.setConGuardarRelaciones(false);			
			this.parametroproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
				if(parametroproduAux.getId().equals(this.iIdNuevoParametroProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProdu parametroproduAux:this.parametroprodus) {
				if(parametroproduAux.getId().equals(this.iIdNuevoParametroProdu)) {
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
	
	public int getIndiceActualParametroProdu(ParametroProdu parametroprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
				if(parametroproduAux.getId().equals(parametroprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProdu parametroproduAux:this.parametroprodus) {
				if(parametroproduAux.getId().equals(parametroprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroProdu(ParametroProdu parametroproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
				if(parametroproduAux.getParametroProduOriginal().getId().equals(parametroproduOriginal.getId())) {
					existe=true;
					parametroproduOriginal.setId(parametroproduAux.getId());
					parametroproduOriginal.setVersionRow(parametroproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProdu parametroproduAux:this.parametroprodus) {
				if(parametroproduAux.getParametroProduOriginal().getId().equals(parametroproduOriginal.getId())) {
					existe=true;
					parametroproduOriginal.setId(parametroproduAux.getId());
					parametroproduOriginal.setVersionRow(parametroproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroProdu(Boolean esParaCancelar) throws Exception {
		parametroprodusAux=new ArrayList<ParametroProdu>();
		parametroproduAux=new ParametroProdu();
		
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
					if(parametroproduAux.getId()<0) {
						parametroprodusAux.add(parametroproduAux);
					}		
				}
				this.iIdNuevoParametroProdu=0L;
				this.parametroproduLogic.getParametroProdus().removeAll(parametroprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProdu parametroproduAux:this.parametroprodus) {
					if(parametroproduAux.getId()<0) {
						parametroprodusAux.add(parametroproduAux);
					}		
				}
				this.iIdNuevoParametroProdu=0L;
				this.parametroprodus.removeAll(parametroprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroProdu 
					&& this.parametroproduLogic.getParametroProdus().size()>0
					) {
					parametroproduAux=this.parametroproduLogic.getParametroProdus().get(this.parametroproduLogic.getParametroProdus().size() - 1);
				
					if(parametroproduAux.getId()<0) {
						this.parametroproduLogic.getParametroProdus().remove(parametroproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroProdu && this.parametroprodus.size()>0) {
					parametroproduAux=this.parametroprodus.get(this.parametroprodus.size() - 1);
				
					if(parametroproduAux.getId()<0) {
						this.parametroprodus.remove(parametroproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametroprodu.getId()<0) {
				this.parametroproduLogic.getParametroProdus().remove(this.parametroprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametroprodu.getId()<0) {
				this.parametroprodus.remove(this.parametroprodu);
			}
		}			
	}
	
	public void setEstadosInicialesParametroProdu(List<ParametroProdu> parametroprodusAux) throws Exception {
		ParametroProduConstantesFunciones.setEstadosInicialesParametroProdu(parametroprodusAux);
	}
	
	public void setEstadosInicialesParametroProdu(ParametroProdu parametroproduAux) throws Exception {
		ParametroProduConstantesFunciones.setEstadosInicialesParametroProdu(parametroproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroProduActual()) {
				if(!this.isEsNuevoParametroProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Produccion ?", "MANTENIMIENTO DE Parametro Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroProdu parametroprodu) throws Exception {
		ParametroProduConstantesFunciones.seleccionarAsignar(this.parametroprodu,parametroprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroProdu=this.isPermisoActualizarOriginalParametroProdu;
			
			
			this.seleccionarAsignar(parametroprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroProduConstantesFunciones.quitarEspaciosParametroProdu(this.parametroprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametroproduSessionBean.setsFuncionBusquedaRapida(this.parametroproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroProdu(esParaCancelar);				
				this.cancelarNuevoParametroProdu(esParaCancelar);								
			}
			
			this.parametroprodu=new ParametroProdu();
			
			this.inicializarParametroProdu();
			
			this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroProdu() throws Exception {
		try {
			ParametroProduConstantesFunciones.inicializarParametroProdu(this.parametroprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametroproduLogic.getParametroProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroProdus(String sAccionBusqueda,List<ParametroProdu> parametroprodusParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Producciones");		
		parameters.put("busquedapor", ParametroProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroProdu=new JRBeanArrayDataSource(ParametroProduJInternalFrame.TraerParametroProduBeans(parametroprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroProduBean.TraerParametroProduBeans(parametroprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroProduActionPerformed(null);
					//this.generarExcelReporteParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroProdus(sAccionBusqueda,sTipoArchivoReporte,parametroprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProdu> parametroprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroProdu parametroprodu : parametroprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroProduConstantesFunciones.generarExcelReporteDataParametroProdu("NORMAL",row,workbook,parametroprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroProdu(String sTipo,Row row,Workbook workbook) {
		
		ParametroProduConstantesFunciones.generarExcelReporteHeaderParametroProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProdu> parametroprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroProdu parametroprodu : parametroprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroProduConstantesFunciones.getParametroProduDescripcion(parametroprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getbodegamateriaprima_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.gettransaccion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.gettransaccionegreso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getcon_relacion_porcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametroprodu.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroProdu> parametroprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroProdu> parametroprodusRespaldo=null;
		
		classes=ParametroProduConstantesFunciones.getClassesRelationshipsOfParametroProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametroproduLogic.setDatosCliente(this.datosCliente);
		this.parametroproduLogic.setDatosDeep(this.datosDeep);
		this.parametroproduLogic.setIsConDeep(true);
		
		parametroprodusRespaldo=this.parametroproduLogic.getParametroProdus();
		
		this.parametroproduLogic.setParametroProdus(parametroprodusParaReportes);	
		this.parametroproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametroprodusParaReportes=this.parametroproduLogic.getParametroProdus();
		this.parametroproduLogic.setParametroProdus(parametroprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroProdu parametroprodu : parametroprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroProduConstantesFunciones.generarExcelReporteDataParametroProdu("NORMAL",row,workbook,parametroprodu,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroProduConstantesFunciones.getParametroProduDescripcion(parametroprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroProdu() throws Exception {		
		this.startProcessParametroProdu(true);
	}
	
	public void startProcessParametroProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroProdu ,this.jPanelParametrosReportesParametroProdu, this.jScrollPanelDatosParametroProdu,this.jPanelPaginacionParametroProdu, this.jScrollPanelDatosEdicionParametroProdu, this.jPanelAccionesParametroProdu,this.jPanelAccionesFormularioParametroProdu,this.jmenuBarParametroProdu,this.jmenuBarDetalleParametroProdu,this.jTtoolBarParametroProdu,this.jTtoolBarDetalleParametroProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroProdu=this.jTabbedPaneBusquedasParametroProdu; 
		
		final JPanel jPanelParametrosReportesParametroProdu=this.jPanelParametrosReportesParametroProdu;
		//final JScrollPane jScrollPanelDatosParametroProdu=this.jScrollPanelDatosParametroProdu;
		final JTable jTableDatosParametroProdu=this.jTableDatosParametroProdu;		
		final JPanel jPanelPaginacionParametroProdu=this.jPanelPaginacionParametroProdu;
		//final JScrollPane jScrollPanelDatosEdicionParametroProdu=this.jScrollPanelDatosEdicionParametroProdu;
		final JPanel jPanelAccionesParametroProdu=this.jPanelAccionesParametroProdu;
		
		JPanel jPanelCamposAuxiliarParametroProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			jPanelCamposAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jPanelCamposParametroProdu;
			jPanelAccionesFormularioAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jPanelAccionesFormularioParametroProdu;
		}
		
		final JPanel jPanelCamposParametroProdu=jPanelCamposAuxiliarParametroProdu;
		final JPanel jPanelAccionesFormularioParametroProdu=jPanelAccionesFormularioAuxiliarParametroProdu;
		
		
		final JMenuBar jmenuBarParametroProdu=this.jmenuBarParametroProdu;
		final JToolBar jTtoolBarParametroProdu=this.jTtoolBarParametroProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			jmenuBarDetalleAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jmenuBarDetalleParametroProdu;
			jTtoolBarDetalleAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jTtoolBarDetalleParametroProdu;
		}
		
		final JMenuBar jmenuBarDetalleParametroProdu=jmenuBarDetalleAuxiliarParametroProdu;
		final JToolBar jTtoolBarDetalleParametroProdu=jTtoolBarDetalleAuxiliarParametroProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroProdu;
			processRunnable.jTableDatos=jTableDatosParametroProdu;
			processRunnable.jPanelCampos=jPanelCamposParametroProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroProdu;
			processRunnable.jPanelAcciones=jPanelAccionesParametroProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroProdu;
			
			
			processRunnable.jmenuBar=jmenuBarParametroProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroProdu;
			processRunnable.jTtoolBar=jTtoolBarParametroProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroProdu ,jPanelParametrosReportesParametroProdu,jTableDatosParametroProdu, /*jScrollPanelDatosParametroProdu,*/jPanelCamposParametroProdu,jPanelPaginacionParametroProdu, /*jScrollPanelDatosEdicionParametroProdu,*/ jPanelAccionesParametroProdu,jPanelAccionesFormularioParametroProdu,jmenuBarParametroProdu,jmenuBarDetalleParametroProdu,jTtoolBarParametroProdu,jTtoolBarDetalleParametroProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroProdu ,jPanelParametrosReportesParametroProdu, jScrollPanelDatosParametroProdu,jPanelPaginacionParametroProdu, jScrollPanelDatosEdicionParametroProdu, jPanelAccionesParametroProdu,jPanelAccionesFormularioParametroProdu,jmenuBarParametroProdu,jmenuBarDetalleParametroProdu,jTtoolBarParametroProdu,jTtoolBarDetalleParametroProdu);
						
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
	
	public void finishProcessParametroProdu() {// throws Exception 
		this.finishProcessParametroProdu(true);
	}
	
	public void finishProcessParametroProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroProdu ,this.jPanelParametrosReportesParametroProdu, this.jScrollPanelDatosParametroProdu,this.jPanelPaginacionParametroProdu, this.jScrollPanelDatosEdicionParametroProdu, this.jPanelAccionesParametroProdu,this.jPanelAccionesFormularioParametroProdu,this.jmenuBarParametroProdu,this.jmenuBarDetalleParametroProdu,this.jTtoolBarParametroProdu,this.jTtoolBarDetalleParametroProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroProdu=this.jTabbedPaneBusquedasParametroProdu; 
		
		final JPanel jPanelParametrosReportesParametroProdu=this.jPanelParametrosReportesParametroProdu;
		//final JScrollPane jScrollPanelDatosParametroProdu=this.jScrollPanelDatosParametroProdu;
		final JTable jTableDatosParametroProdu=this.jTableDatosParametroProdu;		
		final JPanel jPanelPaginacionParametroProdu=this.jPanelPaginacionParametroProdu;
		//final JScrollPane jScrollPanelDatosEdicionParametroProdu=this.jScrollPanelDatosEdicionParametroProdu;
		final JPanel jPanelAccionesParametroProdu=this.jPanelAccionesParametroProdu;
		
		JPanel jPanelCamposAuxiliarParametroProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			jPanelCamposAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jPanelCamposParametroProdu;
			jPanelAccionesFormularioAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jPanelAccionesFormularioParametroProdu;
		}
		
		final JPanel jPanelCamposParametroProdu=jPanelCamposAuxiliarParametroProdu;
		final JPanel jPanelAccionesFormularioParametroProdu=jPanelAccionesFormularioAuxiliarParametroProdu;
		
		
		final JMenuBar jmenuBarParametroProdu=this.jmenuBarParametroProdu;		
		final JToolBar jTtoolBarParametroProdu=this.jTtoolBarParametroProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			jmenuBarDetalleAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jmenuBarDetalleParametroProdu;
			jTtoolBarDetalleAuxiliarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jTtoolBarDetalleParametroProdu;		
		}
		
		final JMenuBar jmenuBarDetalleParametroProdu=jmenuBarDetalleAuxiliarParametroProdu;
		final JToolBar jTtoolBarDetalleParametroProdu=jTtoolBarDetalleAuxiliarParametroProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroProdu;
			processRunnable.jTableDatos=jTableDatosParametroProdu;
			processRunnable.jPanelCampos=jPanelCamposParametroProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroProdu;
			processRunnable.jPanelAcciones=jPanelAccionesParametroProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroProdu;
			
			
			processRunnable.jmenuBar=jmenuBarParametroProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroProdu;
			processRunnable.jTtoolBar=jTtoolBarParametroProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroProdu ,jPanelParametrosReportesParametroProdu, jTableDatosParametroProdu,/*jScrollPanelDatosParametroProdu,*/jPanelCamposParametroProdu,jPanelPaginacionParametroProdu, /*jScrollPanelDatosEdicionParametroProdu,*/ jPanelAccionesParametroProdu,jPanelAccionesFormularioParametroProdu,jmenuBarParametroProdu,jmenuBarDetalleParametroProdu,jTtoolBarParametroProdu,jTtoolBarDetalleParametroProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametroproduConstantesFunciones.getsFinalQueryParametroProdu();
		String  finalQueryPaginacionTodos=this.parametroproduConstantesFunciones.getsFinalQueryParametroProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroProduConstantesFunciones.getArrayColumnasGlobalesNoParametroProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroProduConstantesFunciones.getArrayColumnasGlobalesParametroProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametroprodusEliminados= new ArrayList<ParametroProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroProdu();
		
				///*ParametroProduSessionBean*/this.parametroproduSessionBean=new ParametroProduSessionBean();
			
			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
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
					this.iNumeroPaginacion=ParametroProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroProduConstantesFunciones.getClassesForeignKeysOfParametroProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametroprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametroprodusAux= new ArrayList<ParametroProdu>();
			
				
			parametroproduLogic.setDatosCliente(this.datosCliente);
			parametroproduLogic.setDatosDeep(this.datosDeep);
			parametroproduLogic.setIsConDeep(true);
			
			
			parametroproduLogic.getParametroProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametroproduLogic.getTodosParametroProdus(finalQueryGlobal,pagination);
					
					//parametroproduLogic.getTodosParametroProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametroproduLogic.getParametroProdus()==null|| parametroproduLogic.getParametroProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroprodusAux= new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux= new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroproduLogic.getTodosParametroProdus(finalQueryGlobal+"",this.pagination);												
							
							//parametroproduLogic.getTodosParametroProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroProdus("Todos",parametroproduLogic.getParametroProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());					
							parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroProdu=this.idActual;
				
				} else if(this.idParametroProduActual!=null && this.idParametroProduActual!=0L) {
					idParametroProdu=idParametroProduActual;
				}
				
					
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndicePorId(idParametroProdu);
				
				this.parametroprodus=new ArrayList<ParametroProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametroproduLogic.getEntity(idParametroProdu);
					
					//parametroproduLogic.getEntityWithConnection(idParametroProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
					parametroproduLogic.getParametroProdus().add(parametroproduLogic.getParametroProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodus=new ArrayList<ParametroProdu>();
					this.parametroprodus.add(parametroprodu);
				}
				
				if(parametroproduLogic.getParametroProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdBodega",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdBodega",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdBodegaMateriaPrima")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodegaMateriaPrima(id_bodega_materia_primaFK_IdBodegaMateriaPrima);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdBodegaMateriaPrima(finalQueryGlobal,pagination,id_bodega_materia_primaFK_IdBodegaMateriaPrima);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodegaMateriaPrima(id_bodega_materia_primaFK_IdBodegaMateriaPrima);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodegaMateriaPrima(id_bodega_materia_primaFK_IdBodegaMateriaPrima);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdBodegaMateriaPrima(finalQueryGlobal,pagination,id_bodega_materia_primaFK_IdBodegaMateriaPrima);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodegaMateriaPrima(id_bodega_materia_primaFK_IdBodegaMateriaPrima);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdBodegaMateriaPrima(id_bodega_materia_primaFK_IdBodegaMateriaPrima);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdBodegaMateriaPrima",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdBodegaMateriaPrima",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdEmpresa",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdEmpresa",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdSucursal",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdSucursal",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccion")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdTransaccion(finalQueryGlobal,pagination,id_transaccionFK_IdTransaccion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccion(id_transaccionFK_IdTransaccion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdTransaccion",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdTransaccion",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionEgreso")) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccionEgreso(id_transaccion_egresoFK_IdTransaccionEgreso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametroproduLogic.getParametroProdusFK_IdTransaccionEgreso(finalQueryGlobal,pagination,id_transaccion_egresoFK_IdTransaccionEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccionEgreso(id_transaccion_egresoFK_IdTransaccionEgreso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccionEgreso(id_transaccion_egresoFK_IdTransaccionEgreso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametroproduLogic.getParametroProdus()==null||parametroproduLogic.getParametroProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametroprodus==null|| parametroprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroprodusAux=new ArrayList<ParametroProdu>();
						parametroprodusAux.addAll(parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodusAux=new ArrayList<ParametroProdu>();
							parametroprodusAux.addAll(parametroprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametroproduLogic.getParametroProdusFK_IdTransaccionEgreso(finalQueryGlobal,pagination,id_transaccion_egresoFK_IdTransaccionEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccionEgreso(id_transaccion_egresoFK_IdTransaccionEgreso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroProduConstantesFunciones.getDetalleIndiceFK_IdTransaccionEgreso(id_transaccion_egresoFK_IdTransaccionEgreso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroProdus("FK_IdTransaccionEgreso",parametroproduLogic.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroProdus("FK_IdTransaccionEgreso",parametroprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduLogic.setParametroProdus(new ArrayList<ParametroProdu>());
						parametroproduLogic.getParametroProdus().addAll(parametroprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroprodus=new ArrayList<ParametroProdu>();
							parametroprodus.addAll(parametroprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroproduLogic.getParametroProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametroproduLogic.getParametroProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametroprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroProdu parametroprodu) {
		Boolean permite=true;
		
		if(this.parametroprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroProduConstantesFunciones.getOrderByListaParametroProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroProduConstantesFunciones.getOrderByListaParametroProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProdu parametroprodu:parametroproduLogic.getParametroProdus()) {
				if(parametroprodu.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproduTotales=parametroprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProdu parametroprodu:this.parametroprodus) {
				if(parametroprodu.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproduTotales=parametroprodu;
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
			this.parametroproduAux=new ParametroProdu();
			this.parametroproduAux.setsType(Constantes2.S_TOTALES);
			this.parametroproduAux.setIsNew(false);
			this.parametroproduAux.setIsChanged(false);
			this.parametroproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroProduConstantesFunciones.TotalizarValoresFilaParametroProdu(this.parametroproduLogic.getParametroProdus(),this.parametroproduAux);
				
				this.parametroproduLogic.getParametroProdus().add(this.parametroproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroProduConstantesFunciones.TotalizarValoresFilaParametroProdu(this.parametroprodus,this.parametroproduAux);
				
				this.parametroprodus.add(this.parametroproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametroproduTotales=new ParametroProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroproduLogic.getParametroProdus().remove(parametroproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametroprodus.remove(parametroproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametroproduTotales=new ParametroProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroProdu parametroprodu:parametroproduLogic.getParametroProdus()) {
				if(parametroprodu.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproduTotales=parametroprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroProduConstantesFunciones.TotalizarValoresFilaParametroProdu(this.parametroproduLogic.getParametroProdus(),parametroproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroProdu parametroprodu:this.parametroprodus) {
				if(parametroprodu.getsType().equals(Constantes2.S_TOTALES)) {
					parametroproduTotales=parametroprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroProduConstantesFunciones.TotalizarValoresFilaParametroProdu(this.parametroprodus,parametroproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroProdusFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProdusFK_IdBodegaMateriaPrima()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodegaMateriaPrima";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProdusFK_IdTransaccion()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroProdusFK_IdTransaccionEgreso()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionEgreso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroProdusFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProdusFK_IdBodegaMateriaPrima(String sFinalQuery,Long id_bodega_materia_prima)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdBodegaMateriaPrima(sFinalQuery,this.pagination,id_bodega_materia_prima);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProdusFK_IdTransaccion(String sFinalQuery,Long id_transaccion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdTransaccion(sFinalQuery,this.pagination,id_transaccion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroProdusFK_IdTransaccionEgreso(String sFinalQuery,Long id_transaccion_egreso)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLogic.getParametroProdusFK_IdTransaccionEgreso(sFinalQuery,this.pagination,id_transaccion_egreso);
				
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
	
	public void inicializarPermisosParametroProdu() {
		this.isPermisoTodoParametroProdu=false;
		this.isPermisoNuevoParametroProdu=false;
		this.isPermisoActualizarParametroProdu=false;
		this.isPermisoActualizarOriginalParametroProdu=false;
		this.isPermisoEliminarParametroProdu=false;
		this.isPermisoGuardarCambiosParametroProdu=false;
		this.isPermisoConsultaParametroProdu=false;
		this.isPermisoBusquedaParametroProdu=false;
		this.isPermisoReporteParametroProdu=false;		
		this.isPermisoOrdenParametroProdu=false;		
		this.isPermisoPaginacionMedioParametroProdu=false;		
		this.isPermisoPaginacionAltoParametroProdu=false;
		this.isPermisoPaginacionTodoParametroProdu=false;
		this.isPermisoCopiarParametroProdu=false;		
		this.isPermisoVerFormParametroProdu=false;		
		this.isPermisoDuplicarParametroProdu=false;		
		this.isPermisoOrdenParametroProdu=false;		
	}
	
	public void setPermisosUsuarioParametroProdu(Boolean isPermiso) {
		this.isPermisoTodoParametroProdu=isPermiso;
		this.isPermisoNuevoParametroProdu=isPermiso;
		this.isPermisoActualizarParametroProdu=isPermiso;
		this.isPermisoActualizarOriginalParametroProdu=isPermiso;
		this.isPermisoEliminarParametroProdu=isPermiso;
		this.isPermisoGuardarCambiosParametroProdu=isPermiso;
		this.isPermisoConsultaParametroProdu=isPermiso;
		this.isPermisoBusquedaParametroProdu=isPermiso;
		this.isPermisoReporteParametroProdu=isPermiso;
		this.isPermisoOrdenParametroProdu=isPermiso;		
		this.isPermisoPaginacionMedioParametroProdu=isPermiso;		
		this.isPermisoPaginacionAltoParametroProdu=isPermiso;		
		this.isPermisoPaginacionTodoParametroProdu=isPermiso;		
		this.isPermisoCopiarParametroProdu=isPermiso;		
		this.isPermisoVerFormParametroProdu=isPermiso;		
		this.isPermisoDuplicarParametroProdu=isPermiso;
		this.isPermisoOrdenParametroProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroProdu(Boolean isPermiso) {
		//this.isPermisoTodoParametroProdu=isPermiso;
		this.isPermisoNuevoParametroProdu=isPermiso;
		this.isPermisoActualizarParametroProdu=isPermiso;
		this.isPermisoActualizarOriginalParametroProdu=isPermiso;
		this.isPermisoEliminarParametroProdu=isPermiso;
		this.isPermisoGuardarCambiosParametroProdu=isPermiso;
		//this.isPermisoConsultaParametroProdu=isPermiso;
		//this.isPermisoBusquedaParametroProdu=isPermiso;
		//this.isPermisoReporteParametroProdu=isPermiso;
		//this.isPermisoOrdenParametroProdu=isPermiso;		
		//this.isPermisoPaginacionMedioParametroProdu=isPermiso;		
		//this.isPermisoPaginacionAltoParametroProdu=isPermiso;		
		//this.isPermisoPaginacionTodoParametroProdu=isPermiso;		
		//this.isPermisoCopiarParametroProdu=isPermiso;		
		//this.isPermisoDuplicarParametroProdu=isPermiso;
		//this.isPermisoOrdenParametroProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroProduClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroProdu=this.isPermisoActualizarParametroProdu;
			this.isPermisoEliminarParametroProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroProdu.setToolTipText(this.jTableDatosParametroProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroProdu() throws Exception {
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
	public void inicializarCombosForeignKeyParametroProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.bodegamateriaprimasForeignKey=new ArrayList();
				this.transaccionsForeignKey=new ArrayList();
				this.transaccionegresosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaMateriaPrimaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionEgresoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyBodegaMateriaPrimaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.bodegamateriaprimasForeignKey==null||this.bodegamateriaprimasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=BodegaConstantesFunciones.SFINALQUERY;

				this.cargarCombosBodegaMateriaPrimasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionEgresoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionegresosForeignKey==null||this.transaccionegresosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionEgresosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroProduParameterReturnGeneral parametroproduReturnGeneral=new ParametroProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_empresaParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_empresaParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_sucursalParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_sucursalParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_bodegaParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_bodegaParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalBodegaMateriaPrima="";

				if(((this.bodegamateriaprimasForeignKey==null||this.bodegamateriaprimasForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_bodega_materia_primaParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_bodega_materia_primaParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaMateriaPrima()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodegaMateriaPrima=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodegaMateriaPrima=Funciones.GetFinalQueryAppend(finalQueryGlobalBodegaMateriaPrima, "");
						finalQueryGlobalBodegaMateriaPrima+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegaMateriaPrimasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodegaMateriaPrima=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidBodegaMateriaPrimaActual();
					}
				} else {
					finalQueryGlobalBodegaMateriaPrima="NONE";
				}


				String finalQueryGlobalTransaccion="";

				if(((this.transaccionsForeignKey==null||this.transaccionsForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_transaccionParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_transaccionParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccion=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccion, "");
						finalQueryGlobalTransaccion+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccion=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidTransaccionActual();
					}
				} else {
					finalQueryGlobalTransaccion="NONE";
				}


				String finalQueryGlobalTransaccionEgreso="";

				if(((this.transaccionegresosForeignKey==null||this.transaccionegresosForeignKey.size()<=0) && this.parametroproduConstantesFunciones.cargarid_transaccion_egresoParametroProdu)
					 || (this.esRecargarFks && this.parametroproduConstantesFunciones.cargarid_transaccion_egresoParametroProdu)) {

					if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionEgreso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccionEgreso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionEgreso=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionEgreso, "");
						finalQueryGlobalTransaccionEgreso+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionEgresosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionEgreso=" WHERE " + ConstantesSql.ID + "="+parametroproduSessionBean.getlidTransaccionEgresoActual();
					}
				} else {
					finalQueryGlobalTransaccionEgreso="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametroproduReturnGeneral=parametroproduLogic.cargarCombosLoteForeignKeyParametroProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalBodega,finalQueryGlobalBodegaMateriaPrima,finalQueryGlobalTransaccion,finalQueryGlobalTransaccionEgreso);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametroproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=parametroproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=parametroproduReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalBodegaMateriaPrima.equals("NONE")) {
				this.bodegamateriaprimasForeignKey=parametroproduReturnGeneral.getbodegamateriaprimasForeignKey();
			}

			if(!finalQueryGlobalTransaccion.equals("NONE")) {
				this.transaccionsForeignKey=parametroproduReturnGeneral.gettransaccionsForeignKey();
			}

			if(!finalQueryGlobalTransaccionEgreso.equals("NONE")) {
				this.transaccionegresosForeignKey=parametroproduReturnGeneral.gettransaccionegresosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyBodegaMateriaPrima();
			this.addItemDefectoCombosForeignKeyTransaccion();
			this.addItemDefectoCombosForeignKeyTransaccionEgreso();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametroproduSessionBean==null) {
				this.parametroproduSessionBean=new ParametroProduSessionBean();
			}

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyBodegaMateriaPrima()throws Exception {
		try {

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionBodegaMateriaPrima()) {
				Bodega bodegamateriaprima=new Bodega();
				BodegaConstantesFunciones.setBodegaDescripcion(bodegamateriaprima,Constantes.SMENSAJE_ESCOJA_OPCION);
				bodegamateriaprima.setId(null);

				if(!BodegaConstantesFunciones.ExisteEnLista(this.bodegamateriaprimasForeignKey,bodegamateriaprima,true)) {

					this.bodegamateriaprimasForeignKey.add(0,bodegamateriaprima);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccion()throws Exception {
		try {

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccion()) {
				Transaccion transaccion=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccion,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccion.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionsForeignKey,transaccion,true)) {

					this.transaccionsForeignKey.add(0,transaccion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionEgreso()throws Exception {
		try {

			if(!this.parametroproduSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionEgreso()) {
				Transaccion transaccionegreso=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionegreso,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionegreso.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionegresosForeignKey,transaccionegreso,true)) {

					this.transaccionegresosForeignKey.add(0,transaccionegreso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroProdu(ParametroProdu parametroprodu)throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(parametroprodu.getid_bodega(),false,"Formulario");
			this.setActualBodegaMateriaPrimaForeignKey(parametroprodu.getid_bodega_materia_prima(),false,"Formulario");
			this.setActualTransaccionForeignKey(parametroprodu.getid_transaccion(),false,"Formulario");
			this.setActualTransaccionEgresoForeignKey(parametroprodu.getid_transaccion_egreso(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroProdu(ParametroProdu parametroprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroProdu()throws Exception {	
		try {
			
			this.setActualBodegaForeignKey(this.parametroproduConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualBodegaMateriaPrimaForeignKey(this.parametroproduConstantesFunciones.getid_bodega_materia_prima(),false,"Formulario");
			this.setActualTransaccionForeignKey(this.parametroproduConstantesFunciones.getid_transaccion(),false,"Formulario");
			this.setActualTransaccionEgresoForeignKey(this.parametroproduConstantesFunciones.getid_transaccion_egreso(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameBodegaMateriaPrimasForeignKey("Todos");
			this.cargarCombosFrameTransaccionsForeignKey("Todos");
			this.cargarCombosFrameTransaccionEgresosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegaMateriaPrimasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionEgresosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public ParametroProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametroproduSessionBean=new ParametroProduSessionBean(); 
		this.parametroproduConstantesFunciones=new ParametroProduConstantesFunciones(); 
		this.parametroproduBean=new ParametroProdu();//(this.parametroproduConstantesFunciones); 		
		this.parametroproduReturnGeneral=new ParametroProduParameterReturnGeneral(); 
		
		this.parametroproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametroproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroProdu(true);
			
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
			
			this.parametroproduConstantesFunciones=new ParametroProduConstantesFunciones(); 
			this.parametroproduBean=new ParametroProdu();//this.parametroproduConstantesFunciones); 			
			this.parametroproduReturnGeneral=new ParametroProduParameterReturnGeneral(); 
		
			ParametroProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parametroprodu=new ParametroProdu();
			this.parametroprodus = new ArrayList<ParametroProdu>();
			this.parametroprodusAux = new ArrayList<ParametroProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic=new ParametroProduLogic();
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			//this.parametroproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametroproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroProdu);	
					}
					
					if(this.jInternalFrameImportacionParametroProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroProdu);
				this.jInternalFrameDetalleFormParametroProdu.setVisible(false);
				this.jInternalFrameDetalleFormParametroProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroProdu);
					this.jInternalFrameReporteDinamicoParametroProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroProdu);
					this.jInternalFrameImportacionParametroProdu.setVisible(false);
					this.jInternalFrameImportacionParametroProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroProdu);
					this.jInternalFrameOrderByParametroProdu.setVisible(false);
					this.jInternalFrameOrderByParametroProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametroproduReturnGeneral=new ParametroProduParameterReturnGeneral();
			
			this.parametroproduParameterGeneral=new ParametroProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametroproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroproduSessionBean.getEsGuardarRelacionado(),this.parametroproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametroproduSessionBean.getEsGuardarRelacionado(),this.parametroproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaDuplicarParametroProdu=true;
			this.isVisibilidadCeldaCopiarParametroProdu=true;
			this.isVisibilidadCeldaVerFormParametroProdu=true;
			this.isVisibilidadCeldaOrdenParametroProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=false;
			this.isVisibilidadCeldaGuardarParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdBodegaMateriaPrima=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTransaccion=true;
			this.isVisibilidadFK_IdTransaccionEgreso=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroProdu(false);
			
			this.setPermisosUsuarioParametroProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado() 
				|| (this.parametroproduSessionBean.getEsGuardarRelacionado() && this.parametroproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroProduClasesRelacionadas();
			}
			
			if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroProdu();
			}
			
			if(!this.isPermisoBusquedaParametroProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroProdu,this.isPermisoPaginacionMedioParametroProdu,this.isPermisoPaginacionTodoParametroProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroProduConstantesFunciones.getTiposSeleccionarParametroProdu());
				
				this.tiposColumnasSelect=ParametroProduConstantesFunciones.getTiposSeleccionarParametroProdu(true);
				
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
			//if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProdu() ;
			
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
			this.bodegamateriaprimaLogic=new BodegaLogic();
			this.transaccionLogic=new TransaccionLogic();
			this.transaccionegresoLogic=new TransaccionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametroproduImplementable= (ParametroProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametroproduImplementableHome= (ParametroProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametroprodus= new ArrayList<ParametroProdu>();
			this.parametroprodusEliminados= new ArrayList<ParametroProdu>();
						
			this.isEsNuevoParametroProdu=false;
			this.esParaAccionDesdeFormularioParametroProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.bodegamateriaprimasForeignKey=new ArrayList<Bodega>() ;
			this.transaccionsForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionegresosForeignKey=new ArrayList<Transaccion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroProdu();
			}
			
			ParametroProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroProdu() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroProdu")) {
				iIndex=this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroProdu();	
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
	
	public void cargarCombosForeignKeyParametroProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroProdu();
		
		this.cargarCombosFrameForeignKeyParametroProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroProdu();
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

	public void cargarCombosForeignKeyBodegaMateriaPrima(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyBodegaMateriaPrimaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyBodegaMateriaPrima();
				this.cargarCombosFrameBodegaMateriaPrimasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaBodegaMateriaPrima(this.bodegamateriaprimasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccion();
				this.cargarCombosFrameTransaccionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccion(this.transaccionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionEgreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionEgresoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionEgreso();
				this.cargarCombosFrameTransaccionEgresosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionEgreso(this.transaccionegresosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			
			if(jTableDatosParametroProdu.getRowCount()>=1) {
				jTableDatosParametroProdu.removeRowSelectionInterval(0, jTableDatosParametroProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroProdu(true);			
			//this.parametroprodu=new ParametroProdu();
			//this.parametroprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProdu() ;
			
			if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametroprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);				
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroProdu.getSelectedRows().length;			
			}
			
			parametroprodusSeleccionados=this.getParametroProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroProdu--;			
				//ParametroProdu parametroproduAux= new ParametroProdu();			
				//parametroproduAux.setId(this.iIdNuevoParametroProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroProdu parametroproduOrigen=new ParametroProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroProdu parametroproduOrigen : parametroprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametroproduOrigen =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametroproduOrigen =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametroprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroProdu(parametroproduOrigen,this.parametroprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroproduLogic.getParametroProdus().add(this.parametroproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroprodus.add(this.parametroproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroProdu(false);
				
				this.jTableDatosParametroProdu.setRowSelectionInterval(this.getIndiceNuevoParametroProdu(), this.getIndiceNuevoParametroProdu());
				
				int iLastRow =  this.jTableDatosParametroProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();									
		
			ParametroProdu parametroproduOrigen=new ParametroProdu();
			ParametroProdu parametroproduDestino=new ParametroProdu();
				
			parametroprodusSeleccionados=this.getParametroProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametroprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduOrigen =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroproduOrigen =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametroproduDestino =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametroproduDestino =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametroproduOrigen =parametroprodusSeleccionados.get(0);
				parametroproduDestino =parametroprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroProdu(parametroproduOrigen,parametroproduDestino,true,false);
				
				parametroproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametroproduDestino,parametroproduLogic.getParametroProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametroproduDestino,parametroprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroProdu(false);
				
				//this.jTableDatosParametroProdu.setRowSelectionInterval(this.getIndiceNuevoParametroProdu(), this.getIndiceNuevoParametroProdu());
				
				int iLastRow =  this.jTableDatosParametroProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroProdu.setVisible(!isVisible);
			this.jPanelPaginacionParametroProdu.setVisible(!isVisible);
			this.jPanelAccionesParametroProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroProdu();
			
			this.abrirFrameOrderByParametroProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroProdu.isMaximum()) {
					this.jInternalFrameDetalleFormParametroProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroProdu.setSize(this.jInternalFrameDetalleFormParametroProdu.iWidthFormulario,this.jInternalFrameDetalleFormParametroProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroProdu.isMaximum()) {
						this.jInternalFrameDetalleFormParametroProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroProdu.jContentPaneDetalleParametroProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroProdu.jContentPaneDetalleParametroProdu.getWidth(),ParametroProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroProdu.jContentPaneDetalleParametroProdu.getWidth(),ParametroProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroProdu.jContentPaneDetalleParametroProdu.getWidth(),ParametroProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroProdu.setVisible(true);
	        this.jInternalFrameDetalleFormParametroProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProdu,false,this);
				} else {
					this.jInternalFrameOrderByParametroProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroProdu);
				this.jInternalFrameOrderByParametroProdu.setVisible(false);
				this.jInternalFrameOrderByParametroProdu.setSelected(false);
				
				this.jInternalFrameOrderByParametroProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroProdu"));
				
				this.inicializarActualizarBindingTablaOrderByParametroProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroProdu==null) {
				
				this.jInternalFrameImportacionParametroProdu=new ImportacionJInternalFrame(ParametroProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroProdu);
				this.jInternalFrameImportacionParametroProdu.setVisible(false);
				this.jInternalFrameImportacionParametroProdu.setSelected(false);


				this.jInternalFrameImportacionParametroProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroProdu"));
				this.jInternalFrameImportacionParametroProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroProdu"));
				this.jInternalFrameImportacionParametroProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroProdu==null) {
				this.jInternalFrameReporteDinamicoParametroProdu=new ReporteDinamicoJInternalFrame(ParametroProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroProdu);
				this.jInternalFrameReporteDinamicoParametroProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProdu"));
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProdu"));
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroProdu);
			
	       	this.jInternalFrameDetalleFormParametroProdu.setVisible(false);
	        this.jInternalFrameDetalleFormParametroProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroProdu.dispose();
			//this.jInternalFrameDetalleFormParametroProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroProdu.setVisible(true);
	        this.jInternalFrameImportacionParametroProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroProdu.setVisible(true);
	        this.jInternalFrameOrderByParametroProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroProdu.setVisible(false);
	        this.jInternalFrameOrderByParametroProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroProdu.setVisible(false);
	        this.jInternalFrameImportacionParametroProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroProdu(true);
			//this.isEsNuevoParametroProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProdu(false) ;
			
			if(parametroproduSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroProdu(true);
			//this.isEsNuevoParametroProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametroprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroProdu(false) ;
			
			if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodegaMateriaPrima(List<Bodega> bodegamateriaprimasForeignKey)throws Exception{
		TableColumn tableColumnBodegaMateriaPrima=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA));
		TableCellEditor tableCellEditorBodegaMateriaPrima =tableColumnBodegaMateriaPrima.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodegaMateriaPrima;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegamateriaprimasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegamateriaprimasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccion(List<Transaccion> transaccionsForeignKey)throws Exception{
		TableColumn tableColumnTransaccion=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDTRANSACCION));
		TableCellEditor tableCellEditorTransaccion =tableColumnTransaccion.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccion;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionsForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionEgreso(List<Transaccion> transaccionegresosForeignKey)throws Exception{
		TableColumn tableColumnTransaccionEgreso=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO));
		TableCellEditor tableCellEditorTransaccionEgreso =tableColumnTransaccionEgreso.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionEgreso;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionegresosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionegresosForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroProdu(false);
			
			//if(!this.isEsNuevoParametroProdu) {								
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				
			}
			
			if(this.permiteMantenimiento(this.parametroprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroProdu=true;
					this.inicializarActualizarBindingTablaParametroProdu(false);
					this.isEsNuevoParametroProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProdu(false);
				
				this.habilitarDeshabilitarControlesParametroProdu(false);
			
												
				
				if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroProduActionPerformed(evt,parametroproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroProdu(this.parametroprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametroproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametroprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				this.parametroprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				this.parametroprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametroprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroProduModel) this.jTableDatosParametroProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroProdu=true;
				this.inicializarActualizarBindingTablaParametroProdu(false);
				this.isEsNuevoParametroProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProdu(false);
				
				this.habilitarDeshabilitarControlesParametroProdu(false);
				
				
				
				if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroProdu.getRowCount()>=1) {
				jTableDatosParametroProdu.removeRowSelectionInterval(0, jTableDatosParametroProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroProdu(false) ;
			
			this.isEsNuevoParametroProdu=false;
			
			if(ParametroProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroProdu(false);
				
				//SI ES MANUAL
				if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroProdu--;			
			//ParametroProdu parametroproduAux= new ParametroProdu();			
			//parametroproduAux.setId(this.iIdNuevoParametroProdu);
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
			
			this.parametroprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametroproduLogic.getParametroProdus().add(this.parametroproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametroprodus.add(this.parametroproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroProdu(false);
			
			this.jTableDatosParametroProdu.setRowSelectionInterval(this.getIndiceNuevoParametroProdu(), this.getIndiceNuevoParametroProdu());
			
			int iLastRow =  this.jTableDatosParametroProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProdu(false);
			
			//SI ES MANUAL
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProdu();
			}
			
			//this.abrirFrameTreeParametroProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro ProduccionES ?", "MANTENIMIENTO DE Parametro Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametroproduReturnGeneral=parametroproduLogic.procesarImportacionParametroProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametroproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroProdu.setFileImportacion(this.jInternalFrameImportacionParametroProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		

		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroProduBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_BodegaMateriaPrima_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_BodegaMateriaPrima_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_BodegaMateriaPrima_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_BodegaMateriaPrima_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Transaccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Transaccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Transaccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Transaccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionEgreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionEgreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionEgreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionEgreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nRelacionPorcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nRelacionPorcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nRelacionPorcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nRelacionPorcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroProduConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoParametroProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA:
					sNombreCampoCategoria="id_bodega_materia_prima";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoria="id_transaccion";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO:
					sNombreCampoCategoria="id_transaccion_egreso";
					break;

				case ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE:
					sNombreCampoCategoria="con_relacion_porcentaje";
					break;

				case ParametroProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA:
					sNombreCampoCategoriaValor="id_bodega_materia_prima";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCION:
					sNombreCampoCategoriaValor="id_transaccion";
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO:
					sNombreCampoCategoriaValor="id_transaccion_egreso";
					break;

				case ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE:
					sNombreCampoCategoriaValor="con_relacion_porcentaje";
					break;

				case ParametroProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega Materia Prima",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega_materia_prima");
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion");
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Egreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_egreso");
					break;

				case ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Con Relacion Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"con_relacion_porcentaje");
					break;

				case ParametroProduConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getbodegamateriaprima_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.gettransaccion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.gettransaccionegreso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getcon_relacion_porcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ParametroProdu parametroprodu:parametroprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametroprodu.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroProdu(row);				
			//	iRow++;
			//}				
			
			//for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroProdu(parametroproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProdu(false);
			
			//SI ES MANUAL
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProdu(false);
			
			//SI ES MANUAL
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroProdu(false);
			
			//SI ES MANUAL
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroProdu();
		
		this.inicializarActualizarBindingBotonesManualParametroProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionNuevoParametroProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionSinCerrarParametroProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionSinMensajeParametroProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroProdu!=null) {
				this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionNuevoParametroProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionSinCerrarParametroProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroProdu.jCheckBoxPostAccionSinMensajeParametroProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroProdu() throws Exception {
		try	{
			if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroProdu.addItem(reporte);
			}
			
			
			if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
				this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
				this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaParametroProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.getSelectedItem()!=null){this.id_bodega_materia_primaFK_IdBodegaMateriaPrima=((Bodega)this.jComboBoxid_bodega_materia_primaFK_IdBodegaMateriaPrimaParametroProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.getSelectedItem()!=null){this.id_transaccionFK_IdTransaccion=((Transaccion)this.jComboBoxid_transaccionFK_IdTransaccionParametroProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.getSelectedItem()!=null){this.id_transaccion_egresoFK_IdTransaccionEgreso=((Transaccion)this.jComboBoxid_transaccion_egresoFK_IdTransaccionEgresoParametroProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroProdu(Boolean esInicializar) throws Exception {				
		if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroProdu() throws Exception {
		this.inicializarActualizarBindingTablaParametroProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametroproduLogic.getParametroProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametroprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroProdu.setModel(new ParametroProduModel(this.parametroproduLogic.getParametroProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroProdu.setModel(new ParametroProduModel(this.parametroprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroProdu!=null && this.jInternalFrameOrderByParametroProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroProduConstantesFunciones.SCLASSWEBTITULO,parametroproduConstantesFunciones.resaltarSeleccionarParametroProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroProduConstantesFunciones.SCLASSWEBTITULO,parametroproduConstantesFunciones.resaltarSeleccionarParametroProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_ID));

		if(this.parametroproduConstantesFunciones.mostraridParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroproduConstantesFunciones.resaltaridParametroProdu,this.parametroproduConstantesFunciones.activaridParametroProdu,this,true,"idParametroProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroproduConstantesFunciones.resaltaridParametroProdu,this.parametroproduConstantesFunciones.activaridParametroProdu,this,true,"idParametroProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametroproduConstantesFunciones.mostrarid_empresaParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametroproduConstantesFunciones.resaltarid_empresaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_empresaParametroProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametroproduConstantesFunciones.resaltarid_empresaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_empresaParametroProdu,false,"id_empresaParametroProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.parametroproduConstantesFunciones.mostrarid_sucursalParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.parametroproduConstantesFunciones.resaltarid_sucursalParametroProdu,this,this.parametroproduConstantesFunciones.activarid_sucursalParametroProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.parametroproduConstantesFunciones.resaltarid_sucursalParametroProdu,this,this.parametroproduConstantesFunciones.activarid_sucursalParametroProdu,false,"id_sucursalParametroProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDBODEGA));

		if(this.parametroproduConstantesFunciones.mostrarid_bodegaParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.parametroproduConstantesFunciones.resaltarid_bodegaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_bodegaParametroProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.parametroproduConstantesFunciones.resaltarid_bodegaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_bodegaParametroProdu,true,"id_bodegaParametroProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA));

		if(this.parametroproduConstantesFunciones.mostrarid_bodega_materia_primaParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegamateriaprimasForeignKey,this.parametroproduConstantesFunciones.resaltarid_bodega_materia_primaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_bodega_materia_primaParametroProdu));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegamateriaprimasForeignKey,this.parametroproduConstantesFunciones.resaltarid_bodega_materia_primaParametroProdu,this,this.parametroproduConstantesFunciones.activarid_bodega_materia_primaParametroProdu,true,"id_bodega_materia_primaParametroProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDTRANSACCION));

		if(this.parametroproduConstantesFunciones.mostrarid_transaccionParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDTRANSACCION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionsForeignKey,this.parametroproduConstantesFunciones.resaltarid_transaccionParametroProdu,this,this.parametroproduConstantesFunciones.activarid_transaccionParametroProdu));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionsForeignKey,this.parametroproduConstantesFunciones.resaltarid_transaccionParametroProdu,this,this.parametroproduConstantesFunciones.activarid_transaccionParametroProdu,true,"id_transaccionParametroProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO));

		if(this.parametroproduConstantesFunciones.mostrarid_transaccion_egresoParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionegresosForeignKey,this.parametroproduConstantesFunciones.resaltarid_transaccion_egresoParametroProdu,this,this.parametroproduConstantesFunciones.activarid_transaccion_egresoParametroProdu));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionegresosForeignKey,this.parametroproduConstantesFunciones.resaltarid_transaccion_egresoParametroProdu,this,this.parametroproduConstantesFunciones.activarid_transaccion_egresoParametroProdu,true,"id_transaccion_egresoParametroProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE));

		if(this.parametroproduConstantesFunciones.mostrarcon_relacion_porcentajeParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametroproduConstantesFunciones.resaltarcon_relacion_porcentajeParametroProdu,this.parametroproduConstantesFunciones.activarcon_relacion_porcentajeParametroProdu,this,true,"con_relacion_porcentajeParametroProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroproduConstantesFunciones.resaltarcon_relacion_porcentajeParametroProdu,this.parametroproduConstantesFunciones.activarcon_relacion_porcentajeParametroProdu,this,true,"con_relacion_porcentajeParametroProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,ParametroProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.parametroproduConstantesFunciones.mostrardescripcionParametroProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametroproduConstantesFunciones.resaltardescripcionParametroProdu,this.parametroproduConstantesFunciones.activardescripcionParametroProdu,this,true,"descripcionParametroProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametroproduConstantesFunciones.resaltardescripcionParametroProdu,this.parametroproduConstantesFunciones.activardescripcionParametroProdu,this,true,"descripcionParametroProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametroproduSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametroproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametroproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroProdu && this.isPermisoGuardarCambiosParametroProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametroproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametroproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroProdu.addColumn(tableColumn);
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
			
			this.jTableDatosParametroProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroProdu && this.isPermisoGuardarCambiosParametroProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroProdu && this.isPermisoGuardarCambiosParametroProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroProdu.moveColumn(this.jTableDatosParametroProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroProdu.moveColumn(this.jTableDatosParametroProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroProdu.moveColumn(this.jTableDatosParametroProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametroproduLogic.getParametroProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametroprodus.size()-1;
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
		//this.jTableDatosParametroProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroProdu();
			
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
				
				//this.isEsNuevoParametroProdu=false;
					
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
				if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametroprodu.getsType().equals("DUPLICADO")
				   || this.parametroprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroProdu=true;
				
				} else {
					this.isEsNuevoParametroProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					if(this.parametroprodu.getId()>=0 && !this.parametroprodu.getIsNew()) {						
						this.isEsNuevoParametroProdu=false;
						
					} else {
						this.isEsNuevoParametroProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroProdu(esRelaciones);						
				
				this.seleccionarParametroProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametroprodu.getId()<0) {
					this.isEsNuevoParametroProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroProdu(evt,rowIndex);
				}	
				
				if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroProdu: " + this.dDif); 
					}
				}								
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametroprodu)) {
					if(this.parametroprodu.getId()>0) {
						this.parametroprodu.setIsDeleted(true);
						
						this.parametroprodusEliminados.add(this.parametroprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametroproduLogic.getParametroProdus().remove(this.parametroprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametroprodus.remove(this.parametroprodu);				
					}
					
					
					((ParametroProduModel) this.jTableDatosParametroProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroProdu) {
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroProdu(this.parametroprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametroproduConstantesFunciones.cargarid_empresaParametroProdu || this.parametroproduConstantesFunciones.event_dependid_empresaParametroProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametroprodu.getid_empresa());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametroprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametroprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametroprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.parametroproduConstantesFunciones.cargarid_sucursalParametroProdu || this.parametroproduConstantesFunciones.event_dependid_sucursalParametroProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.parametroprodu.getid_sucursal());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(parametroprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(parametroprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.parametroprodu.getid_sucursal(),false,"Formulario");

					//Bodega
					if(!this.parametroproduConstantesFunciones.cargarid_bodegaParametroProdu || this.parametroproduConstantesFunciones.event_dependid_bodegaParametroProdu) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.parametroprodu.getid_bodega());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(parametroprodu.getBodega()!=null) {
							this.bodegasForeignKey.add(parametroprodu.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.parametroprodu.getid_bodega(),false,"Formulario");

					//BodegaMateriaPrima
					if(!this.parametroproduConstantesFunciones.cargarid_bodega_materia_primaParametroProdu || this.parametroproduConstantesFunciones.event_dependid_bodega_materia_primaParametroProdu) {
						//this.cargarCombosBodegaMateriaPrimasForeignKeyLista(" where id="+this.parametroprodu.getid_bodega_materia_prima());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.bodegamateriaprimasForeignKey=new ArrayList<Bodega>();

						if(parametroprodu.getBodegaMateriaPrima()!=null) {
							this.bodegamateriaprimasForeignKey.add(parametroprodu.getBodegaMateriaPrima());
						}

						this.addItemDefectoCombosForeignKeyBodegaMateriaPrima();
						this.cargarCombosFrameBodegaMateriaPrimasForeignKey("Todos");
					}
					this.setActualBodegaMateriaPrimaForeignKey(this.parametroprodu.getid_bodega_materia_prima(),false,"Formulario");

					//Transaccion
					if(!this.parametroproduConstantesFunciones.cargarid_transaccionParametroProdu || this.parametroproduConstantesFunciones.event_dependid_transaccionParametroProdu) {
						//this.cargarCombosTransaccionsForeignKeyLista(" where id="+this.parametroprodu.getid_transaccion());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.transaccionsForeignKey=new ArrayList<Transaccion>();

						if(parametroprodu.getTransaccion()!=null) {
							this.transaccionsForeignKey.add(parametroprodu.getTransaccion());
						}

						this.addItemDefectoCombosForeignKeyTransaccion();
						this.cargarCombosFrameTransaccionsForeignKey("Todos");
					}
					this.setActualTransaccionForeignKey(this.parametroprodu.getid_transaccion(),false,"Formulario");

					//TransaccionEgreso
					if(!this.parametroproduConstantesFunciones.cargarid_transaccion_egresoParametroProdu || this.parametroproduConstantesFunciones.event_dependid_transaccion_egresoParametroProdu) {
						//this.cargarCombosTransaccionEgresosForeignKeyLista(" where id="+this.parametroprodu.getid_transaccion_egreso());
									//this.inicializarActualizarBindingParametroProdu(false,false);
						this.transaccionegresosForeignKey=new ArrayList<Transaccion>();

						if(parametroprodu.getTransaccionEgreso()!=null) {
							this.transaccionegresosForeignKey.add(parametroprodu.getTransaccionEgreso());
						}

						this.addItemDefectoCombosForeignKeyTransaccionEgreso();
						this.cargarCombosFrameTransaccionEgresosForeignKey("Todos");
					}
					this.setActualTransaccionEgresoForeignKey(this.parametroprodu.getid_transaccion_egreso(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroProdu(ParametroProdu parametroprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroProdu(parametroprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroProdu(ParametroProdu parametroprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroProdu(parametroprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroProdu(parametroprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroProdu(parametroprodu);
	}
	
	public void setVariablesObjetoActualToFormularioParametroProdu(ParametroProdu parametroprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setText(parametroprodu.getId().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setText(parametroprodu.getcon_relacion_porcentaje().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setText(parametroprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroProdu parametroproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametroproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroProdu parametroproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametroproduLocal=this.parametroprodu;
			} else {
				parametroproduLocal=this.parametroproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametroproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroProdu(parametroproduLocal,true);
					
					if(parametroproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametroproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametroproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroProdu(ParametroProdu parametroprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroProdu(parametroprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(parametroprodu);
	}
	
	public void setVariablesFormularioToObjetoActualParametroProdu(ParametroProdu parametroprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroProdu(parametroprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroProdu(ParametroProdu parametroprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.getText()==null || this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.getText()=="" || this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setText("0");
			}

			if(conColumnasBase) {parametroprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelIdParametroProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroprodu.setcon_relacion_porcentaje(Long.parseLong(this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabelcon_relacion_porcentajeParametroProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametroprodu.setdescripcion(this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroProdu.jLabeldescripcionParametroProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroProdu(ParametroProdu parametroproduBean,ParametroProdu parametroprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametroproduBean.getid_bodega()!=null && !parametroproduBean.getid_bodega().equals(-1L))) {parametroprodu.setid_bodega(parametroproduBean.getid_bodega());}
			if(conDefault || (!conDefault && parametroproduBean.getid_bodega_materia_prima()!=null && !parametroproduBean.getid_bodega_materia_prima().equals(-1L))) {parametroprodu.setid_bodega_materia_prima(parametroproduBean.getid_bodega_materia_prima());}
			if(conDefault || (!conDefault && parametroproduBean.getid_transaccion()!=null && !parametroproduBean.getid_transaccion().equals(-1L))) {parametroprodu.setid_transaccion(parametroproduBean.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproduBean.getid_transaccion_egreso()!=null && !parametroproduBean.getid_transaccion_egreso().equals(-1L))) {parametroprodu.setid_transaccion_egreso(parametroproduBean.getid_transaccion_egreso());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroProdu(ParametroProdu parametroproduOrigen,ParametroProdu parametroprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroproduOrigen.getId()!=null && !parametroproduOrigen.getId().equals(0L))) {parametroprodu.setId(parametroproduOrigen.getId());}}
			if(conDefault || (!conDefault && parametroproduOrigen.getid_bodega()!=null && !parametroproduOrigen.getid_bodega().equals(-1L))) {parametroprodu.setid_bodega(parametroproduOrigen.getid_bodega());}
			if(conDefault || (!conDefault && parametroproduOrigen.getid_bodega_materia_prima()!=null && !parametroproduOrigen.getid_bodega_materia_prima().equals(-1L))) {parametroprodu.setid_bodega_materia_prima(parametroproduOrigen.getid_bodega_materia_prima());}
			if(conDefault || (!conDefault && parametroproduOrigen.getid_transaccion()!=null && !parametroproduOrigen.getid_transaccion().equals(-1L))) {parametroprodu.setid_transaccion(parametroproduOrigen.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproduOrigen.getid_transaccion_egreso()!=null && !parametroproduOrigen.getid_transaccion_egreso().equals(-1L))) {parametroprodu.setid_transaccion_egreso(parametroproduOrigen.getid_transaccion_egreso());}
			if(conDefault || (!conDefault && parametroproduOrigen.getcon_relacion_porcentaje()!=null && !parametroproduOrigen.getcon_relacion_porcentaje().equals(0L))) {parametroprodu.setcon_relacion_porcentaje(parametroproduOrigen.getcon_relacion_porcentaje());}
			if(conDefault || (!conDefault && parametroproduOrigen.getdescripcion()!=null && !parametroproduOrigen.getdescripcion().equals(""))) {parametroprodu.setdescripcion(parametroproduOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroProdu(ParametroProdu parametroprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setText(parametroprodu.getId().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setText(parametroprodu.getcon_relacion_porcentaje().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setText(parametroprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroProdu(ParametroProduBean parametroproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setText(parametroproduBean.getId().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setText(parametroproduBean.getcon_relacion_porcentaje().toString());
			this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setText(parametroproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroProdu(ParametroProduParameterReturnGeneral parametroproduReturnGeneral,ParametroProduBean parametroproduBean,Boolean conDefault) throws Exception { 
		try {
			ParametroProdu parametroproduLocal=new ParametroProdu();
			
			parametroproduLocal=parametroproduReturnGeneral.getParametroProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametroproduLocal.getId()!=null && !parametroproduLocal.getId().equals(0L))) {parametroproduBean.setId(parametroproduLocal.getId());}}
			if(conDefault || (!conDefault && parametroproduLocal.getid_bodega()!=null && !parametroproduLocal.getid_bodega().equals(-1L))) {parametroproduBean.setid_bodega(parametroproduLocal.getid_bodega());}
			if(conDefault || (!conDefault && parametroproduLocal.getid_bodega_materia_prima()!=null && !parametroproduLocal.getid_bodega_materia_prima().equals(-1L))) {parametroproduBean.setid_bodega_materia_prima(parametroproduLocal.getid_bodega_materia_prima());}
			if(conDefault || (!conDefault && parametroproduLocal.getid_transaccion()!=null && !parametroproduLocal.getid_transaccion().equals(-1L))) {parametroproduBean.setid_transaccion(parametroproduLocal.getid_transaccion());}
			if(conDefault || (!conDefault && parametroproduLocal.getid_transaccion_egreso()!=null && !parametroproduLocal.getid_transaccion_egreso().equals(-1L))) {parametroproduBean.setid_transaccion_egreso(parametroproduLocal.getid_transaccion_egreso());}
			if(conDefault || (!conDefault && parametroproduLocal.getcon_relacion_porcentaje()!=null && !parametroproduLocal.getcon_relacion_porcentaje().equals(0L))) {parametroproduBean.setcon_relacion_porcentaje(parametroproduLocal.getcon_relacion_porcentaje());}
			if(conDefault || (!conDefault && parametroproduLocal.getdescripcion()!=null && !parametroproduLocal.getdescripcion().equals(""))) {parametroproduBean.setdescripcion(parametroproduLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroProduGenerico(Long idParametroProduSeleccionado,JComboBox jComboBoxParametroProdu,List<ParametroProdu> parametroprodusLocal)throws Exception {
		try {
			ParametroProdu  parametroproduTemp=null;

			for(ParametroProdu parametroproduAux:parametroprodusLocal) {
				if(parametroproduAux.getId()!=null && parametroproduAux.getId().equals(idParametroProduSeleccionado)) {
					parametroproduTemp=parametroproduAux;
					break;
				}
			}

			jComboBoxParametroProdu.setSelectedItem(parametroproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroProduGenerico(JComboBox jComboBoxParametroProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroprodu=(ParametroProdu) parametroproduLogic.getParametroProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroprodu =(ParametroProdu) parametroprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.getbodega_descripcion();
			}
		}

		if(sTipo.equals("BodegaMateriaPrima")) {
			//sDescripcion=this.getActualBodegaMateriaPrimaForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.getbodegamateriaprima_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaMateriaPrimaForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.getbodegamateriaprima_descripcion();
			}
		}

		if(sTipo.equals("Transaccion")) {
			//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.gettransaccion_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.gettransaccion_descripcion();
			}
		}

		if(sTipo.equals("TransaccionEgreso")) {
			//sDescripcion=this.getActualTransaccionEgresoForeignKeyDescripcion((Long)value);
			if(!parametroprodu.getIsNew() && !parametroprodu.getIsChanged() && !parametroprodu.getIsDeleted()) {
				sDescripcion=parametroprodu.gettransaccionegreso_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionEgresoForeignKeyDescripcion((Long)value);
				sDescripcion=parametroprodu.gettransaccionegreso_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroProdu parametroproduRow=new ParametroProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroproduRow=(ParametroProdu) parametroproduLogic.getParametroProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametroproduRow=(ParametroProdu) parametroprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu));			
			this.jButtonDuplicarParametroProdu.setVisible((this.isVisibilidadCeldaDuplicarParametroProdu && this.isPermisoDuplicarParametroProdu));			
			this.jButtonCopiarParametroProdu.setVisible((this.isVisibilidadCeldaCopiarParametroProdu && this.isPermisoCopiarParametroProdu));
			this.jButtonVerFormParametroProdu.setVisible((this.isVisibilidadCeldaVerFormParametroProdu && this.isPermisoVerFormParametroProdu));
			
			this.jButtonAbrirOrderByParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));			
			
			this.jButtonNuevoRelacionesParametroProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProdu && this.isPermisoNuevoParametroProdu));			
			this.jButtonNuevoGuardarCambiosParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu && this.isPermisoGuardarCambiosParametroProdu));
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonModificarParametroProdu.setVisible((this.isVisibilidadCeldaModificarParametroProdu && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.setVisible((this.isVisibilidadCeldaActualizarParametroProdu && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.setVisible((this.isVisibilidadCeldaEliminarParametroProdu && this.isPermisoEliminarParametroProdu));
			this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.setVisible(this.isVisibilidadCeldaCancelarParametroProdu);							
			this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.setVisible((this.isVisibilidadCeldaGuardarParametroProdu && this.isPermisoGuardarCambiosParametroProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProdu && this.isPermisoGuardarCambiosParametroProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu));						
			this.jButtonDuplicarToolBarParametroProdu.setVisible((this.isVisibilidadCeldaDuplicarParametroProdu && this.isPermisoDuplicarParametroProdu));						
			this.jButtonCopiarToolBarParametroProdu.setVisible((this.isVisibilidadCeldaCopiarParametroProdu && this.isPermisoCopiarParametroProdu));			
			this.jButtonVerFormToolBarParametroProdu.setVisible((this.isVisibilidadCeldaVerFormParametroProdu && this.isPermisoVerFormParametroProdu));			
			this.jButtonAbrirOrderByToolBarParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));
			this.jButtonNuevoRelacionesToolBarParametroProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProdu && this.isPermisoNuevoParametroProdu));			
			this.jButtonNuevoGuardarCambiosToolBarParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu && this.isPermisoGuardarCambiosParametroProdu));			
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonModificarToolBarParametroProdu.setVisible((this.isVisibilidadCeldaModificarParametroProdu && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarToolBarParametroProdu.setVisible((this.isVisibilidadCeldaActualizarParametroProdu  && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarToolBarParametroProdu.setVisible((this.isVisibilidadCeldaEliminarParametroProdu && this.isPermisoEliminarParametroProdu));
			this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarToolBarParametroProdu.setVisible(this.isVisibilidadCeldaCancelarParametroProdu);				
			this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosToolBarParametroProdu.setVisible((this.isVisibilidadCeldaGuardarParametroProdu && this.isPermisoGuardarCambiosParametroProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProdu && this.isPermisoGuardarCambiosParametroProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu));			
			this.jMenuItemDuplicarParametroProdu.setVisible((this.isVisibilidadCeldaDuplicarParametroProdu && this.isPermisoDuplicarParametroProdu));			
			this.jMenuItemCopiarParametroProdu.setVisible((this.isVisibilidadCeldaCopiarParametroProdu && this.isPermisoCopiarParametroProdu));			
			this.jMenuItemVerFormParametroProdu.setVisible((this.isVisibilidadCeldaVerFormParametroProdu && this.isPermisoVerFormParametroProdu));			
			this.jMenuItemAbrirOrderByParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));			
			//this.jMenuItemMostrarOcultarParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));
			this.jMenuItemDetalleAbrirOrderByParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));			
			//this.jMenuItemDetalleMostrarOcultarParametroProdu.setVisible((this.isVisibilidadCeldaOrdenParametroProdu && this.isPermisoOrdenParametroProdu));			
			this.jMenuItemNuevoRelacionesParametroProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroProdu && this.isPermisoNuevoParametroProdu));			
			this.jMenuItemNuevoGuardarCambiosParametroProdu.setVisible((this.isVisibilidadCeldaNuevoParametroProdu && this.isPermisoNuevoParametroProdu && this.isPermisoGuardarCambiosParametroProdu));									
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemModificarParametroProdu.setVisible((this.isVisibilidadCeldaModificarParametroProdu && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemActualizarParametroProdu.setVisible((this.isVisibilidadCeldaActualizarParametroProdu && this.isPermisoActualizarParametroProdu));	
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemEliminarParametroProdu.setVisible((this.isVisibilidadCeldaEliminarParametroProdu && this.isPermisoEliminarParametroProdu));
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemCancelarParametroProdu.setVisible(this.isVisibilidadCeldaCancelarParametroProdu);				
			}
			
			this.jMenuItemGuardarCambiosParametroProdu.setVisible((this.isVisibilidadCeldaGuardarParametroProdu && this.isPermisoGuardarCambiosParametroProdu));						
			this.jMenuItemGuardarCambiosTablaParametroProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroProdu && this.isPermisoGuardarCambiosParametroProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroProdu=this.jButtonNuevoParametroProdu.isVisible();
			this.isVisibilidadCeldaDuplicarParametroProdu=this.jButtonDuplicarParametroProdu.isVisible();
			this.isVisibilidadCeldaCopiarParametroProdu=this.jButtonCopiarParametroProdu.isVisible();
			this.isVisibilidadCeldaVerFormParametroProdu=this.jButtonVerFormParametroProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroProdu=this.jButtonAbrirOrderByParametroProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=this.jButtonNuevoRelacionesParametroProdu.isVisible();
			this.isVisibilidadCeldaModificarParametroProdu=this.jButtonModificarParametroProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.isVisibilidadCeldaActualizarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.isVisible();
			this.isVisibilidadCeldaEliminarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.isVisible();
			this.isVisibilidadCeldaCancelarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.isVisible();
			this.isVisibilidadCeldaGuardarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=this.jButtonGuardarCambiosTablaParametroProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroProdu=this.jButtonNuevoToolBarParametroProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=this.jButtonNuevoRelacionesToolBarParametroProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.isVisibilidadCeldaModificarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonModificarToolBarParametroProdu.isVisible();
			this.isVisibilidadCeldaActualizarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarToolBarParametroProdu.isVisible();
			this.isVisibilidadCeldaEliminarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarToolBarParametroProdu.isVisible();
			this.isVisibilidadCeldaCancelarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarToolBarParametroProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroProdu=this.jButtonGuardarCambiosToolBarParametroProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=this.jButtonGuardarCambiosTablaToolBarParametroProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroProdu=this.jMenuItemNuevoParametroProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=this.jMenuItemNuevoRelacionesParametroProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.isVisibilidadCeldaModificarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jMenuItemModificarParametroProdu.isVisible();
			this.isVisibilidadCeldaActualizarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jMenuItemActualizarParametroProdu.isVisible();
			this.isVisibilidadCeldaEliminarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jMenuItemEliminarParametroProdu.isVisible();
			this.isVisibilidadCeldaCancelarParametroProdu=this.jInternalFrameDetalleFormParametroProdu.jMenuItemCancelarParametroProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroProdu=this.jMenuItemGuardarCambiosParametroProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=this.jMenuItemGuardarCambiosTablaParametroProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroProdu(Boolean esInicializar) {
		if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
				//if(this.parametroproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroProdu() {
		this.jButtonNuevoParametroProdu.setVisible(this.isPermisoNuevoParametroProdu);			
		this.jButtonDuplicarParametroProdu.setVisible(this.isPermisoDuplicarParametroProdu);			
		this.jButtonCopiarParametroProdu.setVisible(this.isPermisoCopiarParametroProdu);			
		this.jButtonVerFormParametroProdu.setVisible(this.isPermisoVerFormParametroProdu);			
		
		this.jButtonAbrirOrderByParametroProdu.setVisible(this.isPermisoOrdenParametroProdu);					
		
		this.jButtonNuevoRelacionesParametroProdu.setVisible(this.isPermisoNuevoParametroProdu);			
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonModificarParametroProdu.setVisible(this.isPermisoActualizarParametroProdu);	
			this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.setVisible(this.isPermisoActualizarParametroProdu);	
			this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.setVisible(this.isPermisoEliminarParametroProdu);
			this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.setVisible(this.isVisibilidadCeldaCancelarParametroProdu);						
			this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.setVisible(this.isPermisoGuardarCambiosParametroProdu);							
		}
		
		this.jButtonGuardarCambiosTablaParametroProdu.setVisible(this.isPermisoActualizarParametroProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroProdu() {
		this.jInternalFrameDetalleFormParametroProdu.jButtonModificarParametroProdu.setVisible(this.isPermisoActualizarParametroProdu);	
		this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.setVisible(this.isPermisoActualizarParametroProdu);	
		this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.setVisible(this.isPermisoEliminarParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.setVisible(this.isVisibilidadCeldaCancelarParametroProdu);							
		this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.setVisible((this.isVisibilidadCeldaGuardarParametroProdu && this.isPermisoGuardarCambiosParametroProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroProdu() {
		if(ParametroProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroProdu() {
	}
	
	public void jTableDatosParametroProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametroprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametroprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebParametroProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderParametroProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.parametroprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebParametroProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderParametroProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.parametroprodu.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodega_materia_primaParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodegamateriaprima=true;

			idTienePermisobodegamateriaprima=this.tienePermisosUsuarioEnPaginaWebParametroProdu(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodegamateriaprima) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.bodegamateriaprimaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegamateriaprimaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegamateriaprimaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_bodega_materia_prima()!=null) {
					this.bodegamateriaprimaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegamateriaprimaBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_bodega_materia_prima());
					this.bodegamateriaprimaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegamateriaprimaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegamateriaprimaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegamateriaprimaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBorderbodegamateriaprima=(TitledBorder)this.bodegamateriaprimaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodegamateriaprima.setTitle(titledBorderParametroProdu.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodega_materia_primaParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_bodega_materia_prima()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega_materia_prima = "+this.parametroprodu.getid_bodega_materia_prima().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccionParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccion=true;

			idTienePermisotransaccion=this.tienePermisosUsuarioEnPaginaWebParametroProdu(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.transaccionBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_transaccion()!=null) {
					this.transaccionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_transaccion());
					this.transaccionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBordertransaccion=(TitledBorder)this.transaccionBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccion.setTitle(titledBorderParametroProdu.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccionParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_transaccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion = "+this.parametroprodu.getid_transaccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_egresoParametroProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionegreso=true;

			idTienePermisotransaccionegreso=this.tienePermisosUsuarioEnPaginaWebParametroProdu(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionegreso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);

				this.transaccionegresoBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionegresoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionegresoBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametroproduLogic.getConnexion());

				if(this.parametroprodu.getid_transaccion_egreso()!=null) {
					this.transaccionegresoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionegresoBeanSwingJInternalFrame.setIdActual(this.parametroprodu.getid_transaccion_egreso());
					this.transaccionegresoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionegresoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionegresoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroProdu=(TitledBorder)this.jScrollPanelDatosParametroProdu.getBorder();
				TitledBorder titledBordertransaccionegreso=(TitledBorder)this.transaccionegresoBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionegreso.setTitle(titledBorderParametroProdu.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_egresoParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getid_transaccion_egreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_egreso = "+this.parametroprodu.getid_transaccion_egreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncon_relacion_porcentajeParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getcon_relacion_porcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where con_relacion_porcentaje = "+this.parametroprodu.getcon_relacion_porcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionParametroProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.getparametroprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametroprodu==null) {
						this.parametroprodu = new ParametroProdu();
					}

					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);
				}

				if(this.parametroprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.parametroprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdBodega();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdBodegaMateriaPrimaParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdBodegaMateriaPrima();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdEmpresa();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdSucursal();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdTransaccion();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionEgresoParametroProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroProdu(false,false);

			this.getParametroProdusFK_IdTransaccionEgreso();

			this.inicializarActualizarBindingParametroProdu(false);

			//if(ParametroProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametroproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroProdu() {
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
			this.jInternalFrameDetalleFormParametroProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroProdu.dispose();
			this.jInternalFrameDetalleFormParametroProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
			this.jInternalFrameReporteDinamicoParametroProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroProdu.dispose();
			this.jInternalFrameReporteDinamicoParametroProdu=null;
		}
		
		if(this.jInternalFrameImportacionParametroProdu!=null) {
			this.jInternalFrameImportacionParametroProdu.setVisible(false);	    			
			this.jInternalFrameImportacionParametroProdu.dispose();
			this.jInternalFrameImportacionParametroProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroProdu();
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroProdu")) {
				jButtonDuplicarParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroProdu")) {
				jButtonCopiarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroProdu")) {
				jButtonVerFormParametroProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroProdu")) {
				jButtonDuplicarParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroProdu")) {
				jButtonDuplicarParametroProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroProdu")) {
				jButtonModificarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroProdu")) {
				jButtonModificarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroProdu")) {
				jButtonModificarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroProdu")) {
				jButtonActualizarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroProdu")) {
				jButtonActualizarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroProdu")) {
				jButtonActualizarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroProdu")) {
				jButtonEliminarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroProdu")) {
				jButtonEliminarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroProdu")) {
				jButtonEliminarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroProdu")) {
				jButtonCancelarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroProdu")) {
				jButtonCancelarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroProdu")) {
				jButtonCancelarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroProdu")) {
				jButtonCerrarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroProdu")) {
				jButtonCerrarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroProdu")) {
				jButtonCerrarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroProdu")) {
				jButtonMostrarOcultarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroProdu")) {
				jButtonCancelarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroProdu")) {
				jButtonCopiarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroProdu")) {
				jButtonVerFormParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroProdu")) {
				jButtonCopiarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroProdu")) {
				jButtonVerFormParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroProdu")) {
				jButtonRecargarInformacionParametroProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroProdu")) {
				jButtonRecargarInformacionParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroProdu")) {
				jButtonRecargarInformacionParametroProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroProdu")) {
				jButtonAnterioresParametroProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroProdu")) {
				jButtonAnterioresParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroProdu")) {
				jButtonAnterioresParametroProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroProdu")) {
				jButtonSiguientesParametroProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroProdu")) {
				jButtonSiguientesParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroProdu")) {
				jButtonSiguientesParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroProdu")) {
				jButtonAbrirOrderByParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroProdu")) {
				jButtonMostrarOcultarParametroProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroProdu")) {
				jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroProdu")) {
				jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroProdu")) {
				jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroProdu")) {
				jButtonCerrarReporteDinamicoParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroProdu")) {
				jButtonGenerarReporteDinamicoParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroProdu")) {
				
				jButtonGenerarExcelReporteDinamicoParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroProdu")) {
				jButtonCerrarImportacionParametroProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroProdu")) {
				
				jButtonGenerarImportacionParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroProdu")) {
				
				jButtonAbrirImportacionParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroProdu")) {
				jComboBoxTiposAccionesParametroProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroProdu")) {
				jComboBoxTiposRelacionesParametroProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroProdu")) {
				jComboBoxTiposAccionesParametroProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroProdu")) {
				
				jComboBoxTiposSeleccionarParametroProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroProdu")) {
				jTextFieldValorCampoGeneralParametroProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroProdu")) {
				jButtonAbrirOrderByParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroProdu")) {
				jButtonAbrirOrderByParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroProdu")) {
				jButtonCerrarOrderByParametroProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroProduBusqueda")) {
				this.jButtonidParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroProduUpdate")) {
				this.jButtonid_empresaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroProduBusqueda")) {
				this.jButtonid_empresaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroProduUpdate")) {
				this.jButtonid_sucursalParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroProduBusqueda")) {
				this.jButtonid_sucursalParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroProduUpdate")) {
				this.jButtonid_bodegaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroProduBusqueda")) {
				this.jButtonid_bodegaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_materia_primaParametroProduUpdate")) {
				this.jButtonid_bodega_materia_primaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_materia_primaParametroProduBusqueda")) {
				this.jButtonid_bodega_materia_primaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroProduUpdate")) {
				this.jButtonid_transaccionParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroProduBusqueda")) {
				this.jButtonid_transaccionParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_egresoParametroProduUpdate")) {
				this.jButtonid_transaccion_egresoParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_egresoParametroProduBusqueda")) {
				this.jButtonid_transaccion_egresoParametroProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_relacion_porcentajeParametroProduBusqueda")) {
				this.jButtoncon_relacion_porcentajeParametroProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroProduBusqueda")) {
				this.jButtondescripcionParametroProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdBodegaParametroProdu")) {
				this.jButtonFK_IdBodegaParametroProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdBodegaMateriaPrimaParametroProdu")) {
				this.jButtonFK_IdBodegaMateriaPrimaParametroProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionParametroProdu")) {
				this.jButtonFK_IdTransaccionParametroProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionEgresoParametroProdu")) {
				this.jButtonFK_IdTransaccionEgresoParametroProduActionPerformed(evt);
			}
			
			;
			
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroProdu parametroproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametroproduLocal=this.parametroprodu;
			} else {
				parametroproduLocal=this.parametroproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
							
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
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
			
			


			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
								
						
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
								
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
							
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
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
			
			


			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
								
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroProdu")) {
					jCheckBoxSeleccionarTodosParametroProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroProdu")) {
					jCheckBoxSeleccionadosParametroProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroProdu")) {
					
				}
				
				


				
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
												
				
				


				
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
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
			
			


			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametroprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametroprodu);
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
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
				
				


				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametroproduAnterior =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametroprodu =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametroprodu =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametroprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroProdu")) {
				
				}
				
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroProdu")) {
			
			}
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroProdu();
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			if(sTipo.equals("NuevoParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroProdu")) {
				jButtonDuplicarParametroProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroProdu")) {
				jButtonCopiarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroProdu")) {
				jButtonVerFormParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroProdu")) {
				jButtonNuevoParametroProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroProdu")) {
				jButtonModificarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroProdu")) {
				jButtonActualizarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroProdu")) {
				jButtonEliminarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroProdu")) {
				jButtonCancelarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroProdu")) {
				jButtonCerrarParametroProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroProdu")) {
				jButtonGuardarCambiosParametroProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroProdu")) {
				jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroProdu")) {
				jButtonAbrirOrderByParametroProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroProdu")) {
				jButtonRecargarInformacionParametroProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroProdu")) {
				jButtonAnterioresParametroProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroProdu")) {
				jButtonSiguientesParametroProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroProduBusqueda")) {
				this.jButtonidParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroProduUpdate")) {
				this.jButtonid_empresaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroProduBusqueda")) {
				this.jButtonid_empresaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalParametroProduUpdate")) {
				this.jButtonid_sucursalParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalParametroProduBusqueda")) {
				this.jButtonid_sucursalParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroProduUpdate")) {
				this.jButtonid_bodegaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroProduBusqueda")) {
				this.jButtonid_bodegaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodega_materia_primaParametroProduUpdate")) {
				this.jButtonid_bodega_materia_primaParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodega_materia_primaParametroProduBusqueda")) {
				this.jButtonid_bodega_materia_primaParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccionParametroProduUpdate")) {
				this.jButtonid_transaccionParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccionParametroProduBusqueda")) {
				this.jButtonid_transaccionParametroProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_egresoParametroProduUpdate")) {
				this.jButtonid_transaccion_egresoParametroProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_egresoParametroProduBusqueda")) {
				this.jButtonid_transaccion_egresoParametroProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("con_relacion_porcentajeParametroProduBusqueda")) {
				this.jButtoncon_relacion_porcentajeParametroProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroProduBusqueda")) {
				this.jButtondescripcionParametroProduBusquedaActionPerformed(evt);
			}
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroProdu")) {
				closingInternalFrameParametroProdu();
				
			} else if(sTipo.equals("jButtonCancelarParametroProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroProdu = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroProduBeanSwingJInternalFrame jInternalFrameParent=(ParametroProduBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroProduActionPerformed(null);
			}
			
			ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametroprodu,new Object(),this.parametroproduParameterGeneral,this.parametroproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametroprodu)) {
			if(!esControlTabla) {
				if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);			
				}
				
				if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroProdu(this.parametroprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroproduReturnGeneral=parametroproduLogic.procesarEventosParametroProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproduLogic.getParametroProdus(),this.parametroprodu,this.parametroproduParameterGeneral,this.isEsNuevoParametroProdu,classes);//this.parametroproduLogic.getParametroProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroProdu(this.parametroproduReturnGeneral,this.parametroproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroProdu(classes,this.parametroproduReturnGeneral,this.parametroproduBean,false);
					}
						
					if(this.parametroproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroProdu(this.parametroproduReturnGeneral.getParametroProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroProdu(this.parametroproduReturnGeneral.getParametroProdu());	
					}
						
					if(this.parametroproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroProdu(this.parametroproduReturnGeneral.getParametroProdu(),classes);//this.parametroproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroProdu(this.parametroprodu,classes);//this.parametroproduBean);									
				}
			
				if(ParametroProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroProdu(this.parametroprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroProdu(this.parametroprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametroproduAnterior!=null) {
						this.parametroprodu=this.parametroproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametroproduReturnGeneral=parametroproduLogic.procesarEventosParametroProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroproduLogic.getParametroProdus(),this.parametroprodu,this.parametroproduParameterGeneral,this.isEsNuevoParametroProdu,classes);//this.parametroproduLogic.getParametroProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametroproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametroproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametroproduReturnGeneral.getParametroProdu(),parametroproduLogic.getParametroProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametroproduReturnGeneral.getParametroProdu(),this.parametroprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroProdu() throws Exception {
		
		ParametroProduModel parametroproduModel=(ParametroProduModel)this.jTableDatosParametroProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametroproduModel.parametroprodus=this.parametroproduLogic.getParametroProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametroproduModel.parametroprodus=this.parametroprodus;
		}
		
		
		((ParametroProduModel) this.jTableDatosParametroProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametroproduAnterior(),this.parametroproduLogic.getParametroProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametroproduAnterior(),this.parametroprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroProdu(ParametroProdu parametroprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
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
										
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroprodu,new Object(),generalEntityParameterGeneral,this.parametroproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametroproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroProduConstantesFunciones.getClassesRelationshipsOfParametroProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroProduConstantesFunciones.getClassesRelationshipsFromStringsOfParametroProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametroprodu,new Object(),generalEntityParameterGeneral,this.parametroproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroProdu(ParametroProduBean parametroproduBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroProdu(ArrayList<Classe> classes,ParametroProduReturnGeneral parametroproduReturnGeneral,ParametroProduBean parametroproduBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroProdu(ParametroProdu parametroprodu,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametroprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroProdu = new ParametroProduDetalleFormJInternalFrame(jDesktopPane,this.parametroproduSessionBean.getConGuardarRelaciones(),this.parametroproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.setVisible(false);
		this.jInternalFrameDetalleFormParametroProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroProdu.parametroproduLogic=this.parametroproduLogic;
		
		this.cargarCombosFrameForeignKeyParametroProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroProdu"));
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonModificarParametroProdu.addActionListener(new ButtonActionListener(this,"ModificarParametroProdu"));

		
		this.jInternalFrameDetalleFormParametroProdu.jButtonModificarToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroProdu"));
					
		this.jInternalFrameDetalleFormParametroProdu.jMenuItemModificarParametroProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroProdu"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.addActionListener (new ButtonActionListener(this,"ActualizarParametroProdu"));
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroProdu"));
						
		this.jInternalFrameDetalleFormParametroProdu.jMenuItemActualizarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroProdu"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.addActionListener (new ButtonActionListener(this,"EliminarParametroProdu"));
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroProdu"));
								
		this.jInternalFrameDetalleFormParametroProdu.jMenuItemEliminarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroProdu"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.addActionListener (new ButtonActionListener(this,"CancelarParametroProdu"));
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroProdu"));
					
		this.jInternalFrameDetalleFormParametroProdu.jMenuItemCancelarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jMenuItemDetalleCerrarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroProdu"));		
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProdu"));
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProdu"));
		
		
		
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonidParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtoncon_relacion_porcentajeParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"con_relacion_porcentajeParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtondescripcionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroProdu"));
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroProdu"));
		}
		
		this.jTableDatosParametroProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroProdu"));
		
		this.jTableDatosParametroProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroProdu"));
		
		this.jButtonNuevoParametroProdu.addActionListener(new ButtonActionListener(this,"NuevoParametroProdu"));
		
		this.jButtonDuplicarParametroProdu.addActionListener(new ButtonActionListener(this,"DuplicarParametroProdu"));
		
		this.jButtonCopiarParametroProdu.addActionListener(new ButtonActionListener(this,"CopiarParametroProdu"));
		
		this.jButtonVerFormParametroProdu.addActionListener(new ButtonActionListener(this,"VerFormParametroProdu"));
		
		
		this.jButtonNuevoToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroProdu"));
			
		this.jButtonDuplicarToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroProdu"));
			
		this.jMenuItemNuevoParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroProdu"));
			
		this.jMenuItemDuplicarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroProdu"));		
		
		
		this.jButtonNuevoRelacionesParametroProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroProdu"));
			
		this.jMenuItemNuevoRelacionesParametroProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroProdu"));		
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonModificarParametroProdu.addActionListener(new ButtonActionListener(this,"ModificarParametroProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonModificarToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroProdu"));
			
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemModificarParametroProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarParametroProdu.addActionListener (new ButtonActionListener(this,"ActualizarParametroProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonActualizarToolBarParametroProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroProdu"));
				
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemActualizarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarParametroProdu.addActionListener (new ButtonActionListener(this,"EliminarParametroProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonEliminarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroProdu"));
						
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemEliminarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarParametroProdu.addActionListener (new ButtonActionListener(this,"CancelarParametroProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonCancelarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroProdu"));
			
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemCancelarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroProdu"));		
		
		
		this.jButtonCerrarParametroProdu.addActionListener (new ButtonActionListener(this,"CerrarParametroProdu"));
		
		
		this.jButtonCerrarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroProdu"));
			
		this.jMenuItemCerrarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroProdu"));
			
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jMenuItemDetalleCerrarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroProdu"));
		}
		
		this.jButtonCopiarToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroProdu"));
			
		this.jButtonVerFormToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroProdu"));
		
		this.jMenuItemGuardarCambiosParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroProdu"));
			
		this.jMenuItemCopiarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroProdu"));		
		
		this.jMenuItemVerFormParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroProdu"));		
		
		
		this.jButtonGuardarCambiosTablaParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroProdu"));
			
		this.jMenuItemGuardarCambiosTablaParametroProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroProdu"));		
		
		
		
		this.jButtonRecargarInformacionParametroProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroProdu"));
					
		this.jButtonRecargarInformacionToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroProdu"));
		
		this.jMenuItemRecargarInformacionParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroProdu"));		
		
		
		
		this.jButtonAnterioresParametroProdu.addActionListener (new ButtonActionListener(this,"AnterioresParametroProdu"));
		
		
		this.jButtonAnterioresToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroProdu"));
		
		this.jMenuItemAnterioresParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroProdu"));		
		
		
		this.jButtonSiguientesParametroProdu.addActionListener (new ButtonActionListener(this,"SiguientesParametroProdu"));
		
		
		this.jButtonSiguientesToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroProdu"));
			
		this.jMenuItemSiguientesParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroProdu"));
			
		this.jMenuItemAbrirOrderByParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroProdu"));
			
		this.jMenuItemMostrarOcultarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroProdu"));
			
		this.jMenuItemDetalleAbrirOrderByParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroProdu"));
			
		this.jMenuItemDetalleMostarOcultarParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroProdu"));
			
		this.jMenuItemNuevoGuardarCambiosParametroProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroProdu"));

		this.jCheckBoxSeleccionadosParametroProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroProdu"));
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroProdu"));
			
		this.jComboBoxTiposAccionesParametroProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroProdu"));
					
		this.jComboBoxTiposSeleccionarParametroProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroProdu"));
			
		this.jTextFieldValorCampoGeneralParametroProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroProdu"));		
		
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonidParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtoncon_relacion_porcentajeParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"con_relacion_porcentajeParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtondescripcionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroProdu"));

			this.jButtonFK_IdBodegaMateriaPrimaParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaMateriaPrimaParametroProdu"));

			this.jButtonFK_IdTransaccionParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionParametroProdu"));

			this.jButtonFK_IdTransaccionEgresoParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionEgresoParametroProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroProdu!=null) {
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProdu"));
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProdu"));
				this.jInternalFrameReporteDinamicoParametroProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroProdu"));				
			//this.jButtonGenerarReporteDinamicoParametroProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroProdu"));
			//this.jButtonGenerarExcelReporteDinamicoParametroProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroProdu!=null) {
				this.jInternalFrameImportacionParametroProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroProdu"));
				this.jInternalFrameImportacionParametroProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroProdu"));
				this.jInternalFrameImportacionParametroProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroProdu"));
			
			this.jButtonAbrirOrderByToolBarParametroProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroProdu"));			
			
			if(this.jInternalFrameOrderByParametroProdu!=null) {
				this.jInternalFrameOrderByParametroProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroProdu.jTabbedPaneRelacionesParametroProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroProdu"));
		
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
            		closingInternalFrameParametroProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroProdu = (JInternalFrameBase)event.getSource();
	            	
	            ParametroProduBeanSwingJInternalFrame jInternalFrameParent=(ParametroProduBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroProdu";
		inputMap = this.jButtonNuevoParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroProdu";
		inputMap = this.jButtonNuevoRelacionesParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroProdu";
		inputMap = this.jButtonModificarParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroProdu";
		inputMap = this.jButtonActualizarParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroProdu";
		inputMap = this.jButtonEliminarParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroProdu";
		inputMap = this.jButtonCancelarParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroProdu";
		inputMap = this.jButtonCerrarParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroProdu";
		inputMap = this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroProdu.jButtonGuardarCambiosParametroProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonidParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"idParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_empresaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_sucursalParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodegaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_bodega_materia_primaParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_bodega_materia_primaParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccionParametroProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtonid_transaccion_egresoParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_egresoParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtoncon_relacion_porcentajeParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"con_relacion_porcentajeParametroProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroProdu.jButtondescripcionParametroProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroProduBusqueda"));
		
		
		this.jButtonFK_IdBodegaParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroProdu"));

		this.jButtonFK_IdBodegaMateriaPrimaParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdBodegaMateriaPrimaParametroProdu"));

		this.jButtonFK_IdTransaccionParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionParametroProdu"));

		this.jButtonFK_IdTransaccionEgresoParametroProdu.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionEgresoParametroProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
					parametroproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProdu parametroproduAux:parametroprodus) {
					parametroproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
						parametroproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProdu parametroproduAux:parametroprodus) {
						parametroproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProdu parametroproduAux:parametroprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroProdu.getSelectedRows();
			
			ParametroProdu parametroproduLocal=new ParametroProdu();
			
			//this.seleccionarTodosParametroProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametroproduLocal =(ParametroProdu) this.parametroproduLogic.getParametroProdus().toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametroproduLocal =(ParametroProdu) this.parametroprodus.toArray()[this.jTableDatosParametroProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametroproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
						parametroproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroProdu parametroproduAux:parametroprodus) {
						parametroproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroProdu parametroproduAux:this.parametroproduLogic.getParametroProdus()) {
				
						if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE)) {
							existe=true;
							parametroproduAux.setcon_relacion_porcentaje(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametroproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProdu parametroproduAux:parametroprodus) {
					
						if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE)) {
							existe=true;
							parametroproduAux.setcon_relacion_porcentaje(Long.parseLong(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametroproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroProdu(conSplash);
				
					this.generarReporteParametroProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroProdusSeleccionados();
				//this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroProdu();
				
				this.exportarParametroProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroProdus();
				//this.importarParametroProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroProdusSeleccionados();
				//this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroProdu(conSplash);
					
						//this.actualizarParametrosGeneralParametroProdu();
						
						this.generarReporteProcesoAccionParametroProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Parametro Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroProdu();
				
						this.actualizarParametrosGeneralParametroProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametroproduReturnGeneral=parametroproduLogic.procesarAccionParametroProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametroproduLogic.getParametroProdus(),this.parametroproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroProdu();
					
					ParametroProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroProdu.jComboBoxTiposAccionesFormularioParametroProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroProdu();
			
			if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
			ParametroProdu parametroprodu=new ParametroProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroProdu.getSelectedItem();
			
			
			
			
			parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametroprodusSeleccionados.size()==1) {
				for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
					parametroprodu=parametroproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroProdu();
			
      		//this.finishProcessParametroProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroProduReturnGeneral() throws Exception {
		if(this.parametroproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametroproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametroproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametroproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametroproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametroproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroProdu(false);
		}
		
		if(this.parametroproduReturnGeneral.getConRetornoLista() || this.parametroproduReturnGeneral.getConRetornoObjeto()) {
			if(this.parametroproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroproduLogic.setParametroProdus(this.parametroproduReturnGeneral.getParametroProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametroproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametroproduLogic.setParametroProdu(this.parametroproduReturnGeneral.getParametroProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroProdu() throws Exception {
		
		
	}
	
	public ArrayList<ParametroProdu> getParametroProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroProdu parametroproduAux:parametroproduLogic.getParametroProdus()) {
					if(parametroproduAux.getIsSelected()) {
						parametroprodusSeleccionados.add(parametroproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroProdu parametroproduAux:this.parametroprodus) {
					if(parametroproduAux.getIsSelected()) {
						parametroprodusSeleccionados.add(parametroproduAux);				
					}
				}
			}
			
			if(parametroprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametroprodusSeleccionados.addAll(this.parametroproduLogic.getParametroProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametroprodusSeleccionados.addAll(this.parametroprodus);				
					}
				}
			}
		} else {
			parametroprodusSeleccionados.add(this.parametroprodu);
		}
		
		return parametroprodusSeleccionados;
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
	
	public void generarReporteParametroProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroProdusSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroProdu();
		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroProdu();
		
		
		//this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados ,parametroproduImplementable,parametroproduImplementableHome);
	}
	
	public void mostrarImportacionParametroProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroProdu();
		
		this.abrirFrameImportacionParametroProdu();		
		
			
		//this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados ,parametroproduImplementable,parametroproduImplementableHome);
	}
	
	public void importarParametroProdus() throws Exception {		
	
	}
	
	public void exportarParametroProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroProdu(parametroproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametroproduAux.setsDetalleGeneralEntityReporte(parametroproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDTRANSACCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroProduConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroProdu(ParametroProdu parametroprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametroprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getbodegamateriaprima_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.gettransaccion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.gettransaccionegreso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getcon_relacion_porcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametroprodu.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroProdu(row);				
				iRow++;
			}				
			
			for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroProdu(parametroproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroProdusSeleccionados() throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();		
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametroprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametroprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametroprodu");
			//elementRoot.appendChild(element);
		
			for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
				element = document.createElement("parametroprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroProdu(parametroproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroProduConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroProdu(ParametroProdu parametroprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getbodegamateriaprima_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.gettransaccion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.gettransaccionegreso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getcon_relacion_porcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(parametroprodu.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroProdu(ParametroProdu parametroprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametroprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametroprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametroprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ParametroProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(parametroprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementbodega_descripcion = document.createElement(ParametroProduConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(parametroprodu.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementbodegamateriaprima_descripcion = document.createElement(ParametroProduConstantesFunciones.IDBODEGAMATERIAPRIMA);
		elementbodegamateriaprima_descripcion.appendChild(document.createTextNode(parametroprodu.getbodegamateriaprima_descripcion()));
		element.appendChild(elementbodegamateriaprima_descripcion);

		Element elementtransaccion_descripcion = document.createElement(ParametroProduConstantesFunciones.IDTRANSACCION);
		elementtransaccion_descripcion.appendChild(document.createTextNode(parametroprodu.gettransaccion_descripcion()));
		element.appendChild(elementtransaccion_descripcion);

		Element elementtransaccionegreso_descripcion = document.createElement(ParametroProduConstantesFunciones.IDTRANSACCIONEGRESO);
		elementtransaccionegreso_descripcion.appendChild(document.createTextNode(parametroprodu.gettransaccionegreso_descripcion()));
		element.appendChild(elementtransaccionegreso_descripcion);

		Element elementcon_relacion_porcentaje = document.createElement(ParametroProduConstantesFunciones.CONRELACIONPORCENTAJE);
		elementcon_relacion_porcentaje.appendChild(document.createTextNode(parametroprodu.getcon_relacion_porcentaje().toString().trim()));
		element.appendChild(elementcon_relacion_porcentaje);

		Element elementdescripcion = document.createElement(ParametroProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(parametroprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoParametroProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroProdu> parametroprodusSeleccionados=new ArrayList<ParametroProdu>();
		
		parametroprodusSeleccionados=this.getParametroProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroProdu(parametroprodusSeleccionados);
		
		this.generarReporteParametroProdus("Todos",parametroprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroProdu(ArrayList<ParametroProdu> parametroprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroProdu parametroproduAux:parametroprodusSeleccionados) {
				parametroproduAux.setsDetalleGeneralEntityReporte(parametroproduAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDBODEGAMATERIAPRIMA)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getbodegamateriaprima_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDTRANSACCION)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.gettransaccion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_IDTRANSACCIONEGRESO)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.gettransaccionegreso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_CONRELACIONPORCENTAJE)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getcon_relacion_porcentaje().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					parametroproduAux.setsDescripcionGeneralEntityReporte1(parametroproduAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroProdu=true;
				this.isVisibilidadCeldaGuardarCambiosParametroProdu=true;
			}
			
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=true;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=true;
			this.isVisibilidadCeldaEliminarParametroProdu=true;
			this.isVisibilidadCeldaCancelarParametroProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=true;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=true;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=true;
			this.isVisibilidadCeldaModificarParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
			this.isVisibilidadCeldaModificarParametroProdu=true;
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
			this.isVisibilidadCeldaCancelarParametroProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=true;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=true;
		} else {
			this.actualizarEstadoPanelsParametroProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroProdu=false;
			//this.isVisibilidadCeldaVerFormParametroProdu=false;
			this.isVisibilidadCeldaDuplicarParametroProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametroproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroProdu=false;
			this.isVisibilidadCeldaGuardarCambiosParametroProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametroproduSessionBean.getEsGuardarRelacionado()) {
			if(!parametroproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;												
			}
			
			this.jButtonCerrarParametroProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.parametroprodu)) {
			this.isVisibilidadCeldaActualizarParametroProdu=false;
			this.isVisibilidadCeldaEliminarParametroProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroProdu() {
	}
	
	public void actualizarEstadoPanelsParametroProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroProdu!=null) {
				this.jScrollPanelDatosEdicionParametroProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroProdu!=null) {
				this.jScrollPanelDatosParametroProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroProdu!=null) {
				this.jPanelPaginacionParametroProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroProdu!=null) {
					this.jTabbedPaneBusquedasParametroProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametroproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroProdu!=null) {
				this.jTabbedPaneBusquedasParametroProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroProdu!=null) {
				this.jPanelParametrosReportesParametroProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdBodega=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodegaMateriaPrima(Boolean isParaBodegaMateriaPrima){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaMateriaPrimaNegation=!isParaBodegaMateriaPrima;

			this.isVisibilidadFK_IdBodega=isParaBodegaMateriaPrimaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaBodegaMateriaPrima;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaBodegaMateriaPrimaNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaBodegaMateriaPrimaNegation;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccion(Boolean isParaTransaccion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionNegation=!isParaTransaccion;

			this.isVisibilidadFK_IdBodega=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaTransaccion;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaTransaccionNegation;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionEgreso(Boolean isParaTransaccionEgreso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionEgresoNegation=!isParaTransaccionEgreso;

			this.isVisibilidadFK_IdBodega=isParaTransaccionEgresoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaParametroProdu);}

			this.isVisibilidadFK_IdBodegaMateriaPrima=isParaTransaccionEgresoNegation;
			if(!this.isVisibilidadFK_IdBodegaMateriaPrima) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdBodegaMateriaPrimaParametroProdu);}

			this.isVisibilidadFK_IdTransaccion=isParaTransaccionEgresoNegation;
			if(!this.isVisibilidadFK_IdTransaccion) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionParametroProdu);}

			this.isVisibilidadFK_IdTransaccionEgreso=isParaTransaccionEgreso;
			if(!this.isVisibilidadFK_IdTransaccionEgreso) {this.jTabbedPaneBusquedasParametroProdu.remove(jPanelFK_IdTransaccionEgresoParametroProdu);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroProduSessionBean parametroproduSessionBean=new ParametroProduSessionBean();
		
		if(this.parametroproduSessionBean==null) {
			this.parametroproduSessionBean=new ParametroProduSessionBean();
		}
		
		this.parametroproduSessionBean.setsUltimaBusquedaParametroProdu(this.getsAccionBusqueda());
		this.parametroproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametroproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			parametroproduSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdBodegaMateriaPrima")) {
			parametroproduSessionBean.setid_bodega_materia_prima(this.getid_bodega_materia_primaFK_IdBodegaMateriaPrima());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametroproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			parametroproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
			parametroproduSessionBean.setid_transaccion(this.getid_transaccionFK_IdTransaccion());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionEgreso")) {
			parametroproduSessionBean.setid_transaccion_egreso(this.getid_transaccion_egresoFK_IdTransaccionEgreso());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroProduSessionBean parametroproduSessionBean=new ParametroProduSessionBean();
		
		if(this.parametroproduSessionBean==null) {
			this.parametroproduSessionBean=new ParametroProduSessionBean();
		}
		
		if(this.parametroproduSessionBean.getsUltimaBusquedaParametroProdu()!=null&&!this.parametroproduSessionBean.getsUltimaBusquedaParametroProdu().equals("")) {
			this.setsAccionBusqueda(parametroproduSessionBean.getsUltimaBusquedaParametroProdu());
			this.setiNumeroPaginacion(parametroproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametroproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(parametroproduSessionBean.getid_bodega());
				parametroproduSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdBodegaMateriaPrima")) {
				this.setid_bodega_materia_primaFK_IdBodegaMateriaPrima(parametroproduSessionBean.getid_bodega_materia_prima());
				parametroproduSessionBean.setid_bodega_materia_prima(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametroproduSessionBean.getid_empresa());
				parametroproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(parametroproduSessionBean.getid_sucursal());
				parametroproduSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccion")) {
				this.setid_transaccionFK_IdTransaccion(parametroproduSessionBean.getid_transaccion());
				parametroproduSessionBean.setid_transaccion(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionEgreso")) {
				this.setid_transaccion_egresoFK_IdTransaccionEgreso(parametroproduSessionBean.getid_transaccion_egreso());
				parametroproduSessionBean.setid_transaccion_egreso(-1L);
			}
		}
		
		this.parametroproduSessionBean.setsUltimaBusquedaParametroProdu("");
		this.parametroproduSessionBean.setiNumeroPaginacion(ParametroProduConstantesFunciones.INUMEROPAGINACION);
		this.parametroproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroProdu() {
		this.updateBorderResaltarBusquedasFormularioParametroProdu();
		this.updateVisibilidadBusquedasFormularioParametroProdu();
		this.updateHabilitarBusquedasFormularioParametroProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroProdu.getComponents().length>0) {
	

		if(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaParametroProdu!=null) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaParametroProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaParametroProdu);
			}
		}

		if(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaMateriaPrimaParametroProdu!=null) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaMateriaPrimaParametroProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaMateriaPrimaParametroProdu);
			}
		}

		if(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionParametroProdu!=null) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionParametroProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionParametroProdu);
			}
		}

		if(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionEgresoParametroProdu!=null) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionEgresoParametroProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionEgresoParametroProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaParametroProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroproduConstantesFunciones.mostrarFK_IdBodegaParametroProdu);
			if(!this.parametroproduConstantesFunciones.mostrarFK_IdBodegaParametroProdu && index>-1) {
				this.jTabbedPaneBusquedasParametroProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaMateriaPrimaParametroProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroproduConstantesFunciones.mostrarFK_IdBodegaMateriaPrimaParametroProdu);
			if(!this.parametroproduConstantesFunciones.mostrarFK_IdBodegaMateriaPrimaParametroProdu && index>-1) {
				this.jTabbedPaneBusquedasParametroProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionParametroProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroproduConstantesFunciones.mostrarFK_IdTransaccionParametroProdu);
			if(!this.parametroproduConstantesFunciones.mostrarFK_IdTransaccionParametroProdu && index>-1) {
				this.jTabbedPaneBusquedasParametroProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionEgresoParametroProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametroproduConstantesFunciones.mostrarFK_IdTransaccionEgresoParametroProdu);
			if(!this.parametroproduConstantesFunciones.mostrarFK_IdTransaccionEgresoParametroProdu && index>-1) {
				this.jTabbedPaneBusquedasParametroProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaParametroProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroproduConstantesFunciones.activarFK_IdBodegaParametroProdu);
				this.jTabbedPaneBusquedasParametroProdu.setEnabledAt(index,this.parametroproduConstantesFunciones.activarFK_IdBodegaParametroProdu);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaMateriaPrimaParametroProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroproduConstantesFunciones.activarFK_IdBodegaMateriaPrimaParametroProdu);
				this.jTabbedPaneBusquedasParametroProdu.setEnabledAt(index,this.parametroproduConstantesFunciones.activarFK_IdBodegaMateriaPrimaParametroProdu);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionParametroProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroproduConstantesFunciones.activarFK_IdTransaccionParametroProdu);
				this.jTabbedPaneBusquedasParametroProdu.setEnabledAt(index,this.parametroproduConstantesFunciones.activarFK_IdTransaccionParametroProdu);
			}

			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionEgresoParametroProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametroproduConstantesFunciones.activarFK_IdTransaccionEgresoParametroProdu);
				this.jTabbedPaneBusquedasParametroProdu.setEnabledAt(index,this.parametroproduConstantesFunciones.activarFK_IdTransaccionEgresoParametroProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaParametroProdu);

			this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);

			this.parametroproduConstantesFunciones.setResaltarFK_IdBodegaParametroProdu(resaltar);

			jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaParametroProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdBodegaMateriaPrima")) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdBodegaMateriaPrimaParametroProdu);

			this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);

			this.parametroproduConstantesFunciones.setResaltarFK_IdBodegaMateriaPrimaParametroProdu(resaltar);

			jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdBodegaMateriaPrimaParametroProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccion")) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionParametroProdu);

			this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);

			this.parametroproduConstantesFunciones.setResaltarFK_IdTransaccionParametroProdu(resaltar);

			jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionParametroProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionEgreso")) {
			index= this.jTabbedPaneBusquedasParametroProdu.indexOfComponent(this.jPanelFK_IdTransaccionEgresoParametroProdu);

			this.jTabbedPaneBusquedasParametroProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroProdu.getComponent(index);

			this.parametroproduConstantesFunciones.setResaltarFK_IdTransaccionEgresoParametroProdu(resaltar);

			jPanel.setBorder(this.parametroproduConstantesFunciones.resaltarFK_IdTransaccionEgresoParametroProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroProdu() throws Exception {

		if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroProdu();
		this.updateVisibilidadResaltarControlesFormularioParametroProdu();
		this.updateHabilitarResaltarControlesFormularioParametroProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroProdu() throws Exception {
		if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametroproduConstantesFunciones.resaltaridParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltaridParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_empresaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_empresaParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_sucursalParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_sucursalParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_bodegaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_bodegaParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_bodega_materia_primaParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_bodega_materia_primaParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_transaccionParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_transaccionParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarid_transaccion_egresoParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarid_transaccion_egresoParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltarcon_relacion_porcentajeParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltarcon_relacion_porcentajeParametroProdu);}
		if(this.parametroproduConstantesFunciones.resaltardescripcionParametroProdu!=null && this.jInternalFrameDetalleFormParametroProdu!=null) {this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setBorder(this.parametroproduConstantesFunciones.resaltardescripcionParametroProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
	
		//this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostraridParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelidParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostraridParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_empresaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_empresaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_empresaParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_sucursalParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_sucursalParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_sucursalParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_bodegaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_bodegaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_bodegaParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_bodega_materia_primaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_bodega_materia_primaParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_bodega_materia_primaParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_transaccionParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_transaccionParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_transaccionParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_transaccion_egresoParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelid_transaccion_egresoParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarid_transaccion_egresoParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarcon_relacion_porcentajeParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPanelcon_relacion_porcentajeParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrarcon_relacion_porcentajeParametroProdu);
		//this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrardescripcionParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jPaneldescripcionParametroProdu.setVisible(this.parametroproduConstantesFunciones.mostrardescripcionParametroProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroProdu() throws Exception {
		if(this.jInternalFrameDetalleFormParametroProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroProdu!=null) {
	
		this.jInternalFrameDetalleFormParametroProdu.jLabelidParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activaridParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_empresaParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_empresaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_sucursalParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_sucursalParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodegaParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_bodegaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_bodega_materia_primaParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_bodega_materia_primaParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccionParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_transaccionParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jComboBoxid_transaccion_egresoParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarid_transaccion_egresoParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jTextFieldcon_relacion_porcentajeParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activarcon_relacion_porcentajeParametroProdu);
		this.jInternalFrameDetalleFormParametroProdu.jTextAreadescripcionParametroProdu.setEnabled(this.parametroproduConstantesFunciones.activardescripcionParametroProdu);
		}
	}
	
		
}