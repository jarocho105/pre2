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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.ParametroCarteraConstantesFunciones;
import com.bydan.erp.cartera.util.ParametroCarteraParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ParametroCarteraParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ParametroCarteraBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ParametroCarteraBeanSwingJInternalFrame extends ParametroCarteraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroCarteraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroCartera> parametrocarteraValidator = new ClassValidator<ParametroCartera>(ParametroCartera.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroCartera parametrocartera;	
	public ParametroCartera parametrocarteraAux;
	public ParametroCartera parametrocarteraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroCartera parametrocarteraTotales;
	public Long idParametroCarteraActual;
	public Long iIdNuevoParametroCartera=0L;
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

	public String sFinalQueryComboTransaccionFactura="";

	public List<Transaccion> transaccionfacturasForeignKey;

	public List<Transaccion> gettransaccionfacturasForeignKey() {
		return transaccionfacturasForeignKey;
	}

	public void settransaccionfacturasForeignKey(List<Transaccion> transaccionfacturasForeignKey) {
		this.transaccionfacturasForeignKey = transaccionfacturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionfacturaForeignKey;

	public Transaccion gettransaccionfacturaForeignKey() {
		return transaccionfacturaForeignKey;
	}

	public void settransaccionfacturaForeignKey(Transaccion transaccionfacturaForeignKey) {
		this.transaccionfacturaForeignKey = transaccionfacturaForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboTransaccionDeshabilita="";

	public List<Transaccion> transacciondeshabilitasForeignKey;

	public List<Transaccion> gettransacciondeshabilitasForeignKey() {
		return transacciondeshabilitasForeignKey;
	}

	public void settransacciondeshabilitasForeignKey(List<Transaccion> transacciondeshabilitasForeignKey) {
		this.transacciondeshabilitasForeignKey = transacciondeshabilitasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transacciondeshabilitaForeignKey;

	public Transaccion gettransacciondeshabilitaForeignKey() {
		return transacciondeshabilitaForeignKey;
	}

	public void settransacciondeshabilitaForeignKey(Transaccion transacciondeshabilitaForeignKey) {
		this.transacciondeshabilitaForeignKey = transacciondeshabilitaForeignKey;
	}

	public String sFinalQueryComboTransaccionHabilita="";

	public List<Transaccion> transaccionhabilitasForeignKey;

	public List<Transaccion> gettransaccionhabilitasForeignKey() {
		return transaccionhabilitasForeignKey;
	}

	public void settransaccionhabilitasForeignKey(List<Transaccion> transaccionhabilitasForeignKey) {
		this.transaccionhabilitasForeignKey = transaccionhabilitasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Transaccion transaccionhabilitaForeignKey;

	public Transaccion gettransaccionhabilitaForeignKey() {
		return transaccionhabilitaForeignKey;
	}

	public void settransaccionhabilitaForeignKey(Transaccion transaccionhabilitaForeignKey) {
		this.transaccionhabilitaForeignKey = transaccionhabilitaForeignKey;
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

	public String sFinalQueryComboTipoFactura="";

	public List<TipoFactura> tipofacturasForeignKey;

	public List<TipoFactura> gettipofacturasForeignKey() {
		return tipofacturasForeignKey;
	}

	public void settipofacturasForeignKey(List<TipoFactura> tipofacturasForeignKey) {
		this.tipofacturasForeignKey = tipofacturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoFactura tipofacturaForeignKey;

	public TipoFactura gettipofacturaForeignKey() {
		return tipofacturaForeignKey;
	}

	public void settipofacturaForeignKey(TipoFactura tipofacturaForeignKey) {
		this.tipofacturaForeignKey = tipofacturaForeignKey;
	}

	public String sFinalQueryComboTipoAutoPago="";

	public List<TipoAutoPago> tipoautopagosForeignKey;

	public List<TipoAutoPago> gettipoautopagosForeignKey() {
		return tipoautopagosForeignKey;
	}

	public void settipoautopagosForeignKey(List<TipoAutoPago> tipoautopagosForeignKey) {
		this.tipoautopagosForeignKey = tipoautopagosForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoAutoPago tipoautopagoForeignKey;

	public TipoAutoPago gettipoautopagoForeignKey() {
		return tipoautopagoForeignKey;
	}

	public void settipoautopagoForeignKey(TipoAutoPago tipoautopagoForeignKey) {
		this.tipoautopagoForeignKey = tipoautopagoForeignKey;
	}

	public String sFinalQueryComboCuentaContableCreditoFiscal="";

	public List<CuentaContable> cuentacontablecreditofiscalsForeignKey;

	public List<CuentaContable> getcuentacontablecreditofiscalsForeignKey() {
		return cuentacontablecreditofiscalsForeignKey;
	}

	public void setcuentacontablecreditofiscalsForeignKey(List<CuentaContable> cuentacontablecreditofiscalsForeignKey) {
		this.cuentacontablecreditofiscalsForeignKey = cuentacontablecreditofiscalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public CuentaContable cuentacontablecreditofiscalForeignKey;

	public CuentaContable getcuentacontablecreditofiscalForeignKey() {
		return cuentacontablecreditofiscalForeignKey;
	}

	public void setcuentacontablecreditofiscalForeignKey(CuentaContable cuentacontablecreditofiscalForeignKey) {
		this.cuentacontablecreditofiscalForeignKey = cuentacontablecreditofiscalForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idCuentaContableCreditoFiscalActual=0L;

	public Long getidCuentaContableCreditoFiscalActual() {
		return idCuentaContableCreditoFiscalActual;
	}

	public void setidCuentaContableCreditoFiscalActual(Long idCuentaContableCreditoFiscalActual) {
		this.idCuentaContableCreditoFiscalActual= idCuentaContableCreditoFiscalActual;
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
	
	public Boolean isPermisoTodoParametroCartera;
	public Boolean isPermisoNuevoParametroCartera;
	public Boolean isPermisoActualizarParametroCartera;
	public Boolean isPermisoActualizarOriginalParametroCartera;
	public Boolean isPermisoEliminarParametroCartera;
	public Boolean isPermisoGuardarCambiosParametroCartera;
	public Boolean isPermisoConsultaParametroCartera;
	public Boolean isPermisoBusquedaParametroCartera;
	public Boolean isPermisoReporteParametroCartera;
	public Boolean isPermisoPaginacionMedioParametroCartera;
	public Boolean isPermisoPaginacionAltoParametroCartera;
	public Boolean isPermisoPaginacionTodoParametroCartera;
	public Boolean isPermisoCopiarParametroCartera;
	public Boolean isPermisoVerFormParametroCartera;
	public Boolean isPermisoDuplicarParametroCartera;
	public Boolean isPermisoOrdenParametroCartera;
	
	
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
	
	public ParametroCarteraParameterReturnGeneral parametrocarteraReturnGeneral;
	public ParametroCarteraParameterReturnGeneral parametrocarteraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroCartera=false;
	public Boolean esParaAccionDesdeFormularioParametroCartera=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroCarteraSessionBeanAdditional parametrocarteraSessionBeanAdditional=null;
	
	public ParametroCarteraSessionBeanAdditional getParametroCarteraSessionBeanAdditional() {
		return this.parametrocarteraSessionBeanAdditional;
	}
	
	public void setParametroCarteraSessionBeanAdditional(ParametroCarteraSessionBeanAdditional parametrocarteraSessionBeanAdditional) {
		try {
			this.parametrocarteraSessionBeanAdditional=parametrocarteraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroCarteraBeanSwingJInternalFrameAdditional parametrocarteraBeanSwingJInternalFrameAdditional=null;
	//public class ParametroCarteraBeanSwingJInternalFrame
	
	public ParametroCarteraBeanSwingJInternalFrameAdditional getParametroCarteraBeanSwingJInternalFrameAdditional() {
		return this.parametrocarteraBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroCarteraBeanSwingJInternalFrameAdditional(ParametroCarteraBeanSwingJInternalFrameAdditional parametrocarteraBeanSwingJInternalFrameAdditional) {
		try {
			this.parametrocarteraBeanSwingJInternalFrameAdditional=parametrocarteraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroCarteraLogic parametrocarteraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroCartera parametrocarteraBean;
	public ParametroCarteraConstantesFunciones parametrocarteraConstantesFunciones;
	//public ParametroCarteraParameterReturnGeneral parametrocarteraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TransaccionLogic transaccionfacturaLogic;
	public EmpleadoLogic empleadoLogic;
	public TransaccionLogic transacciondeshabilitaLogic;
	public TransaccionLogic transaccionhabilitaLogic;
	public BodegaLogic bodegaLogic;
	public TipoFacturaLogic tipofacturaLogic;
	public TipoAutoPagoLogic tipoautopagoLogic;
	public CuentaContableLogic cuentacontablecreditofiscalLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroCartera> parametrocarteras;	
	//public List<ParametroCartera> parametrocarterasEliminados;
	//public List<ParametroCartera> parametrocarterasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroCartera=false;
	public Boolean isVisibilidadCeldaDuplicarParametroCartera=true;
	public Boolean isVisibilidadCeldaCopiarParametroCartera=true;
	public Boolean isVisibilidadCeldaVerFormParametroCartera=true;
	public Boolean isVisibilidadCeldaOrdenParametroCartera=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
	public Boolean isVisibilidadCeldaModificarParametroCartera=false;
	public Boolean isVisibilidadCeldaActualizarParametroCartera=false;
	public Boolean isVisibilidadCeldaEliminarParametroCartera=false;
	public Boolean isVisibilidadCeldaCancelarParametroCartera=false;
	public Boolean isVisibilidadCeldaGuardarParametroCartera=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroCartera=false;	
	
	
	public Boolean isVisibilidadFK_IdBodega=false;
	public Boolean isVisibilidadFK_IdCuentaContableCreditoFiscal=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoAutoPago=false;
	public Boolean isVisibilidadFK_IdTipoFactura=false;
	public Boolean isVisibilidadFK_IdTransaccionDeshabilita=false;
	public Boolean isVisibilidadFK_IdTransaccionFactura=false;
	public Boolean isVisibilidadFK_IdTransaccionHabilita=false;
	
	public Long getiIdNuevoParametroCartera() {
		return this.iIdNuevoParametroCartera;
	}

	public void setiIdNuevoParametroCartera(Long iIdNuevoParametroCartera) {
		this.iIdNuevoParametroCartera = iIdNuevoParametroCartera;
	}
	
	public Long getidParametroCarteraActual() {
		return this.idParametroCarteraActual;
	}

	public void setidParametroCarteraActual(Long idParametroCarteraActual) {
		this.idParametroCarteraActual = idParametroCarteraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroCartera getparametrocartera() {
		return this.parametrocartera;
	}

	public void setparametrocartera(ParametroCartera parametrocartera) {
		this.parametrocartera = parametrocartera;
	}
	
	public ParametroCartera getparametrocarteraAux() {
		return this.parametrocarteraAux;
	}

	public void setparametrocarteraAux(ParametroCartera parametrocarteraAux) {
		this.parametrocarteraAux = parametrocarteraAux;
	}				
	
	public ParametroCartera getparametrocarteraAnterior() {
		return this.parametrocarteraAnterior;
	}

	public void setparametrocarteraAnterior(ParametroCartera parametrocarteraAnterior) {
		this.parametrocarteraAnterior = parametrocarteraAnterior;
	}	
	
	public ParametroCartera getparametrocarteraTotales() {
		return this.parametrocarteraTotales;
	}

	public void setparametrocarteraTotales(ParametroCartera parametrocarteraTotales) {
		this.parametrocarteraTotales = parametrocarteraTotales;
	}	
	
	public ParametroCartera getparametrocarteraBean() {
		return this.parametrocarteraBean;
	}

	public void setparametrocarteraBean(ParametroCartera parametrocarteraBean) {
		this.parametrocarteraBean = parametrocarteraBean;
	}	
	
	public ParametroCarteraParameterReturnGeneral getparametrocarteraReturnGeneral() {
		return this.parametrocarteraReturnGeneral;
	}

	public void setparametrocarteraReturnGeneral(ParametroCarteraParameterReturnGeneral parametrocarteraReturnGeneral) {
		this.parametrocarteraReturnGeneral = parametrocarteraReturnGeneral;
	}	
	
	
	public Long id_bodegaFK_IdBodega=-1L;

	public Long getid_bodegaFK_IdBodega() {
		return this.id_bodegaFK_IdBodega;
	}

	public void setid_bodegaFK_IdBodega(Long id_bodegaFK_IdBodega) {
		this.id_bodegaFK_IdBodega = id_bodegaFK_IdBodega;
	}

	public Long id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal=null;

	public Long getid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal() {
		return this.id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal;
	}

	public void setid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal(Long id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal) {
		this.id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal = id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal;
	}

	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_tipo_auto_pagoFK_IdTipoAutoPago=-1L;

	public Long getid_tipo_auto_pagoFK_IdTipoAutoPago() {
		return this.id_tipo_auto_pagoFK_IdTipoAutoPago;
	}

	public void setid_tipo_auto_pagoFK_IdTipoAutoPago(Long id_tipo_auto_pagoFK_IdTipoAutoPago) {
		this.id_tipo_auto_pagoFK_IdTipoAutoPago = id_tipo_auto_pagoFK_IdTipoAutoPago;
	}

	public Long id_tipo_facturaFK_IdTipoFactura=-1L;

	public Long getid_tipo_facturaFK_IdTipoFactura() {
		return this.id_tipo_facturaFK_IdTipoFactura;
	}

	public void setid_tipo_facturaFK_IdTipoFactura(Long id_tipo_facturaFK_IdTipoFactura) {
		this.id_tipo_facturaFK_IdTipoFactura = id_tipo_facturaFK_IdTipoFactura;
	}

	public Long id_transaccion_deshabilitaFK_IdTransaccionDeshabilita=-1L;

	public Long getid_transaccion_deshabilitaFK_IdTransaccionDeshabilita() {
		return this.id_transaccion_deshabilitaFK_IdTransaccionDeshabilita;
	}

	public void setid_transaccion_deshabilitaFK_IdTransaccionDeshabilita(Long id_transaccion_deshabilitaFK_IdTransaccionDeshabilita) {
		this.id_transaccion_deshabilitaFK_IdTransaccionDeshabilita = id_transaccion_deshabilitaFK_IdTransaccionDeshabilita;
	}

	public Long id_transaccion_facturaFK_IdTransaccionFactura=-1L;

	public Long getid_transaccion_facturaFK_IdTransaccionFactura() {
		return this.id_transaccion_facturaFK_IdTransaccionFactura;
	}

	public void setid_transaccion_facturaFK_IdTransaccionFactura(Long id_transaccion_facturaFK_IdTransaccionFactura) {
		this.id_transaccion_facturaFK_IdTransaccionFactura = id_transaccion_facturaFK_IdTransaccionFactura;
	}

	public Long id_transaccion_habilitaFK_IdTransaccionHabilita=-1L;

	public Long getid_transaccion_habilitaFK_IdTransaccionHabilita() {
		return this.id_transaccion_habilitaFK_IdTransaccionHabilita;
	}

	public void setid_transaccion_habilitaFK_IdTransaccionHabilita(Long id_transaccion_habilitaFK_IdTransaccionHabilita) {
		this.id_transaccion_habilitaFK_IdTransaccionHabilita = id_transaccion_habilitaFK_IdTransaccionHabilita;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroCarteraLogic getParametroCarteraLogic()	{		
		return parametrocarteraLogic;
	}

	public void setParametroCarteraLogic(ParametroCarteraLogic parametrocarteraLogic) {
		this.parametrocarteraLogic = parametrocarteraLogic;
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
	
	public Boolean getIsEsNuevoParametroCartera() {
		return isEsNuevoParametroCartera;
	}

	public void setIsEsNuevoParametroCartera(Boolean isEsNuevoParametroCartera) {
		this.isEsNuevoParametroCartera = isEsNuevoParametroCartera;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroCartera() {
		return esParaAccionDesdeFormularioParametroCartera;
	}
	
	public void setEsParaAccionDesdeFormularioParametroCartera(Boolean esParaAccionDesdeFormularioParametroCartera) {
		this.esParaAccionDesdeFormularioParametroCartera = esParaAccionDesdeFormularioParametroCartera;
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

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTransaccionFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionfacturasForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionfacturaLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionfacturasForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidTransaccionFacturaActual());
					this.transaccionfacturasForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosTransaccionDeshabilitasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transacciondeshabilitasForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionDeshabilita()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transacciondeshabilitaLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transacciondeshabilitasForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionDeshabilita(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidTransaccionDeshabilitaActual());
					this.transacciondeshabilitasForeignKey.add(transaccionLogic.getTransaccion());
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

	public void cargarCombosTransaccionHabilitasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.transaccionhabilitasForeignKey=new ArrayList<Transaccion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TransaccionLogic transaccionLogic=new TransaccionLogic();

			//transaccionLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionHabilita()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//transaccionhabilitaLogic.getTransaccionDataAccess().setIsForForeingKeyData(true);

					transaccionLogic.getTodosTransaccionsWithConnection(sFinalQuery,new Pagination());

					this.transaccionhabilitasForeignKey=transaccionLogic.getTransaccions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTransaccionHabilita(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					transaccionLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidTransaccionHabilitaActual());
					this.transaccionhabilitasForeignKey.add(transaccionLogic.getTransaccion());
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

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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
					bodegaLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidBodegaActual());
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

	public void cargarCombosTipoFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipofacturasForeignKey=new ArrayList<TipoFactura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoFacturaLogic tipofacturaLogic=new TipoFacturaLogic();

			//tipofacturaLogic.getTipoFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipofacturaLogic.getTipoFacturaDataAccess().setIsForForeingKeyData(true);

					tipofacturaLogic.getTodosTipoFacturasWithConnection(sFinalQuery,new Pagination());

					this.tipofacturasForeignKey=tipofacturaLogic.getTipoFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturaLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidTipoFacturaActual());
					this.tipofacturasForeignKey.add(tipofacturaLogic.getTipoFactura());
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

	public void cargarCombosTipoAutoPagosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoautopagosForeignKey=new ArrayList<TipoAutoPago>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoAutoPagoLogic tipoautopagoLogic=new TipoAutoPagoLogic();

			//tipoautopagoLogic.getTipoAutoPagoDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoPago()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoautopagoLogic.getTipoAutoPagoDataAccess().setIsForForeingKeyData(true);

					tipoautopagoLogic.getTodosTipoAutoPagosWithConnection(sFinalQuery,new Pagination());

					this.tipoautopagosForeignKey=tipoautopagoLogic.getTipoAutoPagos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoAutoPago(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoautopagoLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidTipoAutoPagoActual());
					this.tipoautopagosForeignKey.add(tipoautopagoLogic.getTipoAutoPago());
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

	public void cargarCombosCuentaContableCreditoFiscalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cuentacontablecreditofiscalsForeignKey=new ArrayList<CuentaContable>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CuentaContableLogic cuentacontableLogic=new CuentaContableLogic();

			//cuentacontableLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cuentacontablecreditofiscalLogic.getCuentaContableDataAccess().setIsForForeingKeyData(true);

					cuentacontableLogic.getTodosCuentaContablesWithConnection(sFinalQuery,new Pagination());

					this.cuentacontablecreditofiscalsForeignKey=cuentacontableLogic.getCuentaContables();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCuentaContableCreditoFiscal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontableLogic.getEntityWithConnection(parametrocarteraSessionBean.getlidCuentaContableCreditoFiscalActual());
					this.cuentacontablecreditofiscalsForeignKey.add(cuentacontableLogic.getCuentaContable());
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

					if(this.parametrocartera!=null) {
						this.parametrocartera.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroCartera.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroCarteraGenerico)throws Exception
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
				jComboBoxid_empresaParametroCarteraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroCarteraGenerico!=null && jComboBoxid_empresaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionFacturaForeignKey(Long idTransaccionFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionfacturaTemp=null;

			for(Transaccion transaccionfacturaAux:transaccionfacturasForeignKey) {
				if(transaccionfacturaAux.getId()!=null && transaccionfacturaAux.getId().equals(idTransaccionFacturaSeleccionado)) {
					transaccionfacturaTemp=transaccionfacturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionfacturaTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setTransaccionFactura(transaccionfacturaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setSelectedItem(transaccionfacturaTemp);
					}
				} else {
					//jComboBoxid_transaccion_facturaParametroCartera.setSelectedItem(transaccionfacturaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionfacturaTemp!=null && jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera!=null) {
						jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setSelectedItem(transaccionfacturaTemp);
					} else {
						if(jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera!=null) {
							//jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setSelectedItem(transaccionfacturaTemp);
							if(jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.getItemCount()>0) {
								jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setSelectedIndex(0);
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

	public String getActualTransaccionFacturaForeignKeyDescripcion(Long idTransaccionFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionfacturaTemp=null;

			for(Transaccion transaccionfacturaAux:transaccionfacturasForeignKey) {
				if(transaccionfacturaAux.getId()!=null && transaccionfacturaAux.getId().equals(idTransaccionFacturaSeleccionado)) {
					transaccionfacturaTemp=transaccionfacturaAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionfacturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionFacturaForeignKeyGenerico(Long idTransaccionFacturaSeleccionado,JComboBox jComboBoxid_transaccion_facturaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionfacturaTemp=null;

			for(Transaccion transaccionfacturaAux:transaccionfacturasForeignKey) {
				if(transaccionfacturaAux.getId()!=null && transaccionfacturaAux.getId().equals(idTransaccionFacturaSeleccionado)) {
					transaccionfacturaTemp=transaccionfacturaAux;
					break;
				}
			}

			if(transaccionfacturaTemp!=null) {
				jComboBoxid_transaccion_facturaParametroCarteraGenerico.setSelectedItem(transaccionfacturaTemp);
			} else {
				if(jComboBoxid_transaccion_facturaParametroCarteraGenerico!=null && jComboBoxid_transaccion_facturaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_facturaParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoParametroCartera.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoParametroCartera!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoParametroCartera!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoParametroCarteraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoParametroCarteraGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoParametroCarteraGenerico!=null && jComboBoxid_empleadoParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_empleadoParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionDeshabilitaForeignKey(Long idTransaccionDeshabilitaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transacciondeshabilitaTemp=null;

			for(Transaccion transacciondeshabilitaAux:transacciondeshabilitasForeignKey) {
				if(transacciondeshabilitaAux.getId()!=null && transacciondeshabilitaAux.getId().equals(idTransaccionDeshabilitaSeleccionado)) {
					transacciondeshabilitaTemp=transacciondeshabilitaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transacciondeshabilitaTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setTransaccionDeshabilita(transacciondeshabilitaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedItem(transacciondeshabilitaTemp);
					}
				} else {
					//jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedItem(transacciondeshabilitaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionDeshabilita") || sFormularioTipoBusqueda.equals("Todos")){
					if(transacciondeshabilitaTemp!=null && jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera!=null) {
						jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setSelectedItem(transacciondeshabilitaTemp);
					} else {
						if(jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera!=null) {
							//jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setSelectedItem(transacciondeshabilitaTemp);
							if(jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.getItemCount()>0) {
								jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setSelectedIndex(0);
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

	public String getActualTransaccionDeshabilitaForeignKeyDescripcion(Long idTransaccionDeshabilitaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transacciondeshabilitaTemp=null;

			for(Transaccion transacciondeshabilitaAux:transacciondeshabilitasForeignKey) {
				if(transacciondeshabilitaAux.getId()!=null && transacciondeshabilitaAux.getId().equals(idTransaccionDeshabilitaSeleccionado)) {
					transacciondeshabilitaTemp=transacciondeshabilitaAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transacciondeshabilitaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionDeshabilitaForeignKeyGenerico(Long idTransaccionDeshabilitaSeleccionado,JComboBox jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transacciondeshabilitaTemp=null;

			for(Transaccion transacciondeshabilitaAux:transacciondeshabilitasForeignKey) {
				if(transacciondeshabilitaAux.getId()!=null && transacciondeshabilitaAux.getId().equals(idTransaccionDeshabilitaSeleccionado)) {
					transacciondeshabilitaTemp=transacciondeshabilitaAux;
					break;
				}
			}

			if(transacciondeshabilitaTemp!=null) {
				jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico.setSelectedItem(transacciondeshabilitaTemp);
			} else {
				if(jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico!=null && jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTransaccionHabilitaForeignKey(Long idTransaccionHabilitaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Transaccion  transaccionhabilitaTemp=null;

			for(Transaccion transaccionhabilitaAux:transaccionhabilitasForeignKey) {
				if(transaccionhabilitaAux.getId()!=null && transaccionhabilitaAux.getId().equals(idTransaccionHabilitaSeleccionado)) {
					transaccionhabilitaTemp=transaccionhabilitaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(transaccionhabilitaTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setTransaccionHabilita(transaccionhabilitaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setSelectedItem(transaccionhabilitaTemp);
					}
				} else {
					//jComboBoxid_transaccion_habilitaParametroCartera.setSelectedItem(transaccionhabilitaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTransaccionHabilita") || sFormularioTipoBusqueda.equals("Todos")){
					if(transaccionhabilitaTemp!=null && jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera!=null) {
						jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setSelectedItem(transaccionhabilitaTemp);
					} else {
						if(jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera!=null) {
							//jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setSelectedItem(transaccionhabilitaTemp);
							if(jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.getItemCount()>0) {
								jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setSelectedIndex(0);
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

	public String getActualTransaccionHabilitaForeignKeyDescripcion(Long idTransaccionHabilitaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Transaccion  transaccionhabilitaTemp=null;

			for(Transaccion transaccionhabilitaAux:transaccionhabilitasForeignKey) {
				if(transaccionhabilitaAux.getId()!=null && transaccionhabilitaAux.getId().equals(idTransaccionHabilitaSeleccionado)) {
					transaccionhabilitaTemp=transaccionhabilitaAux;
					break;
				}
			}


			sDescripcion=TransaccionConstantesFunciones.getTransaccionDescripcion(transaccionhabilitaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTransaccionHabilitaForeignKeyGenerico(Long idTransaccionHabilitaSeleccionado,JComboBox jComboBoxid_transaccion_habilitaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionhabilitaTemp=null;

			for(Transaccion transaccionhabilitaAux:transaccionhabilitasForeignKey) {
				if(transaccionhabilitaAux.getId()!=null && transaccionhabilitaAux.getId().equals(idTransaccionHabilitaSeleccionado)) {
					transaccionhabilitaTemp=transaccionhabilitaAux;
					break;
				}
			}

			if(transaccionhabilitaTemp!=null) {
				jComboBoxid_transaccion_habilitaParametroCarteraGenerico.setSelectedItem(transaccionhabilitaTemp);
			} else {
				if(jComboBoxid_transaccion_habilitaParametroCarteraGenerico!=null && jComboBoxid_transaccion_habilitaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_transaccion_habilitaParametroCarteraGenerico.setSelectedIndex(0);
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

					if(this.parametrocartera!=null) {
						this.parametrocartera.setBodega(bodegaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setSelectedItem(bodegaTemp);
					}
				} else {
					//jComboBoxid_bodegaParametroCartera.setSelectedItem(bodegaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){
					if(bodegaTemp!=null && jComboBoxid_bodegaFK_IdBodegaParametroCartera!=null) {
						jComboBoxid_bodegaFK_IdBodegaParametroCartera.setSelectedItem(bodegaTemp);
					} else {
						if(jComboBoxid_bodegaFK_IdBodegaParametroCartera!=null) {
							//jComboBoxid_bodegaFK_IdBodegaParametroCartera.setSelectedItem(bodegaTemp);
							if(jComboBoxid_bodegaFK_IdBodegaParametroCartera.getItemCount()>0) {
								jComboBoxid_bodegaFK_IdBodegaParametroCartera.setSelectedIndex(0);
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
	public void setActualBodegaForeignKeyGenerico(Long idBodegaSeleccionado,JComboBox jComboBoxid_bodegaParametroCarteraGenerico)throws Exception
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
				jComboBoxid_bodegaParametroCarteraGenerico.setSelectedItem(bodegaTemp);
			} else {
				if(jComboBoxid_bodegaParametroCarteraGenerico!=null && jComboBoxid_bodegaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_bodegaParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoFacturaForeignKey(Long idTipoFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipofacturaTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setTipoFactura(tipofacturaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setSelectedItem(tipofacturaTemp);
					}
				} else {
					//jComboBoxid_tipo_facturaParametroCartera.setSelectedItem(tipofacturaTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipofacturaTemp!=null && jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera!=null) {
						jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setSelectedItem(tipofacturaTemp);
					} else {
						if(jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera!=null) {
							//jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setSelectedItem(tipofacturaTemp);
							if(jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.getItemCount()>0) {
								jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setSelectedIndex(0);
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

	public String getActualTipoFacturaForeignKeyDescripcion(Long idTipoFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}


			sDescripcion=TipoFacturaConstantesFunciones.getTipoFacturaDescripcion(tipofacturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoFacturaForeignKeyGenerico(Long idTipoFacturaSeleccionado,JComboBox jComboBoxid_tipo_facturaParametroCarteraGenerico)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasForeignKey) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}

			if(tipofacturaTemp!=null) {
				jComboBoxid_tipo_facturaParametroCarteraGenerico.setSelectedItem(tipofacturaTemp);
			} else {
				if(jComboBoxid_tipo_facturaParametroCarteraGenerico!=null && jComboBoxid_tipo_facturaParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_tipo_facturaParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoAutoPagoForeignKey(Long idTipoAutoPagoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoAutoPago  tipoautopagoTemp=null;

			for(TipoAutoPago tipoautopagoAux:tipoautopagosForeignKey) {
				if(tipoautopagoAux.getId()!=null && tipoautopagoAux.getId().equals(idTipoAutoPagoSeleccionado)) {
					tipoautopagoTemp=tipoautopagoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoautopagoTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setTipoAutoPago(tipoautopagoTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedItem(tipoautopagoTemp);
					}
				} else {
					//jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedItem(tipoautopagoTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoAutoPago") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoautopagoTemp!=null && jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera!=null) {
						jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setSelectedItem(tipoautopagoTemp);
					} else {
						if(jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera!=null) {
							//jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setSelectedItem(tipoautopagoTemp);
							if(jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.getItemCount()>0) {
								jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setSelectedIndex(0);
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

	public String getActualTipoAutoPagoForeignKeyDescripcion(Long idTipoAutoPagoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoAutoPago  tipoautopagoTemp=null;

			for(TipoAutoPago tipoautopagoAux:tipoautopagosForeignKey) {
				if(tipoautopagoAux.getId()!=null && tipoautopagoAux.getId().equals(idTipoAutoPagoSeleccionado)) {
					tipoautopagoTemp=tipoautopagoAux;
					break;
				}
			}


			sDescripcion=TipoAutoPagoConstantesFunciones.getTipoAutoPagoDescripcion(tipoautopagoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoAutoPagoForeignKeyGenerico(Long idTipoAutoPagoSeleccionado,JComboBox jComboBoxid_tipo_auto_pagoParametroCarteraGenerico)throws Exception
	{
		try
		{
			TipoAutoPago  tipoautopagoTemp=null;

			for(TipoAutoPago tipoautopagoAux:tipoautopagosForeignKey) {
				if(tipoautopagoAux.getId()!=null && tipoautopagoAux.getId().equals(idTipoAutoPagoSeleccionado)) {
					tipoautopagoTemp=tipoautopagoAux;
					break;
				}
			}

			if(tipoautopagoTemp!=null) {
				jComboBoxid_tipo_auto_pagoParametroCarteraGenerico.setSelectedItem(tipoautopagoTemp);
			} else {
				if(jComboBoxid_tipo_auto_pagoParametroCarteraGenerico!=null && jComboBoxid_tipo_auto_pagoParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_tipo_auto_pagoParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCuentaContableCreditoFiscalForeignKey(Long idCuentaContableCreditoFiscalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditofiscalTemp=null;

			for(CuentaContable cuentacontablecreditofiscalAux:cuentacontablecreditofiscalsForeignKey) {
				if(cuentacontablecreditofiscalAux.getId()!=null && cuentacontablecreditofiscalAux.getId().equals(idCuentaContableCreditoFiscalSeleccionado)) {
					cuentacontablecreditofiscalTemp=cuentacontablecreditofiscalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cuentacontablecreditofiscalTemp!=null) {

					if(this.parametrocartera!=null) {
						this.parametrocartera.setCuentaContableCreditoFiscal(cuentacontablecreditofiscalTemp);
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscalTemp);
					}
				} else {
					//jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscalTemp);
					if(this.jInternalFrameDetalleFormParametroCartera!=null) {
						if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCreditoFiscal") || sFormularioTipoBusqueda.equals("Todos")){
					if(cuentacontablecreditofiscalTemp!=null && jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera!=null) {
						jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscalTemp);
					} else {
						if(jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera!=null) {
							//jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscalTemp);
							if(jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.getItemCount()>0) {
								jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setSelectedIndex(0);
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

	public String getActualCuentaContableCreditoFiscalForeignKeyDescripcion(Long idCuentaContableCreditoFiscalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CuentaContable  cuentacontablecreditofiscalTemp=null;

			for(CuentaContable cuentacontablecreditofiscalAux:cuentacontablecreditofiscalsForeignKey) {
				if(cuentacontablecreditofiscalAux.getId()!=null && cuentacontablecreditofiscalAux.getId().equals(idCuentaContableCreditoFiscalSeleccionado)) {
					cuentacontablecreditofiscalTemp=cuentacontablecreditofiscalAux;
					break;
				}
			}


			sDescripcion=CuentaContableConstantesFunciones.getCuentaContableDescripcion(cuentacontablecreditofiscalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCuentaContableCreditoFiscalForeignKeyGenerico(Long idCuentaContableCreditoFiscalSeleccionado,JComboBox jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontablecreditofiscalTemp=null;

			for(CuentaContable cuentacontablecreditofiscalAux:cuentacontablecreditofiscalsForeignKey) {
				if(cuentacontablecreditofiscalAux.getId()!=null && cuentacontablecreditofiscalAux.getId().equals(idCuentaContableCreditoFiscalSeleccionado)) {
					cuentacontablecreditofiscalTemp=cuentacontablecreditofiscalAux;
					break;
				}
			}

			if(cuentacontablecreditofiscalTemp!=null) {
				jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico.setSelectedItem(cuentacontablecreditofiscalTemp);
			} else {
				if(jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico!=null && jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico.getItemCount()>0) {
					jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_empresaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroCarteraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroCarteraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametrocartera.setid_empresa(empresaAux.getId());
				parametrocartera.setempresa_descripcion(ParametroCarteraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametrocartera.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionFacturaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_transaccion_facturaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_facturaParametroCarteraGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_facturaParametroCarteraGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrocartera.setid_transaccion_factura(transaccionAux.getId());
				parametrocartera.settransaccionfactura_descripcion(ParametroCarteraConstantesFunciones.getTransaccionFacturaDescripcion(transaccionAux));
				parametrocartera.setTransaccionFactura(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_empleadoParametroCarteraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoParametroCarteraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoParametroCarteraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				parametrocartera.setid_empleado(empleadoAux.getId());
				parametrocartera.setempleado_descripcion(ParametroCarteraConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				parametrocartera.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionDeshabilitaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_deshabilitaParametroCarteraGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrocartera.setid_transaccion_deshabilita(transaccionAux.getId());
				parametrocartera.settransacciondeshabilita_descripcion(ParametroCarteraConstantesFunciones.getTransaccionDeshabilitaDescripcion(transaccionAux));
				parametrocartera.setTransaccionDeshabilita(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTransaccionHabilitaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_transaccion_habilitaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Transaccion  transaccionAux=new Transaccion();

			if(jComboBoxid_transaccion_habilitaParametroCarteraGenerico==null) {
				transaccionAux=(Transaccion)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.getSelectedItem();
			} else {
				transaccionAux=(Transaccion)jComboBoxid_transaccion_habilitaParametroCarteraGenerico.getSelectedItem();
			}

			if(transaccionAux!=null && transaccionAux.getId()!=null) {
				parametrocartera.setid_transaccion_habilita(transaccionAux.getId());
				parametrocartera.settransaccionhabilita_descripcion(ParametroCarteraConstantesFunciones.getTransaccionHabilitaDescripcion(transaccionAux));
				parametrocartera.setTransaccionHabilita(transaccionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarBodegaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_bodegaParametroCarteraGenerico)throws Exception
	{
		try
		{
			Bodega  bodegaAux=new Bodega();

			if(jComboBoxid_bodegaParametroCarteraGenerico==null) {
				bodegaAux=(Bodega)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.getSelectedItem();
			} else {
				bodegaAux=(Bodega)jComboBoxid_bodegaParametroCarteraGenerico.getSelectedItem();
			}

			if(bodegaAux!=null && bodegaAux.getId()!=null) {
				parametrocartera.setid_bodega(bodegaAux.getId());
				parametrocartera.setbodega_descripcion(ParametroCarteraConstantesFunciones.getBodegaDescripcion(bodegaAux));
				parametrocartera.setBodega(bodegaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoFacturaForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_tipo_facturaParametroCarteraGenerico)throws Exception
	{
		try
		{
			TipoFactura  tipofacturaAux=new TipoFactura();

			if(jComboBoxid_tipo_facturaParametroCarteraGenerico==null) {
				tipofacturaAux=(TipoFactura)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.getSelectedItem();
			} else {
				tipofacturaAux=(TipoFactura)jComboBoxid_tipo_facturaParametroCarteraGenerico.getSelectedItem();
			}

			if(tipofacturaAux!=null && tipofacturaAux.getId()!=null) {
				parametrocartera.setid_tipo_factura(tipofacturaAux.getId());
				parametrocartera.settipofactura_descripcion(ParametroCarteraConstantesFunciones.getTipoFacturaDescripcion(tipofacturaAux));
				parametrocartera.setTipoFactura(tipofacturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoAutoPagoForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_tipo_auto_pagoParametroCarteraGenerico)throws Exception
	{
		try
		{
			TipoAutoPago  tipoautopagoAux=new TipoAutoPago();

			if(jComboBoxid_tipo_auto_pagoParametroCarteraGenerico==null) {
				tipoautopagoAux=(TipoAutoPago)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.getSelectedItem();
			} else {
				tipoautopagoAux=(TipoAutoPago)jComboBoxid_tipo_auto_pagoParametroCarteraGenerico.getSelectedItem();
			}

			if(tipoautopagoAux!=null && tipoautopagoAux.getId()!=null) {
				parametrocartera.setid_tipo_auto_pago(tipoautopagoAux.getId());
				parametrocartera.settipoautopago_descripcion(ParametroCarteraConstantesFunciones.getTipoAutoPagoDescripcion(tipoautopagoAux));
				parametrocartera.setTipoAutoPago(tipoautopagoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCuentaContableCreditoFiscalForeignKey(ParametroCartera parametrocartera,JComboBox jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico)throws Exception
	{
		try
		{
			CuentaContable  cuentacontableAux=new CuentaContable();

			if(jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico==null) {
				cuentacontableAux=(CuentaContable)this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getSelectedItem();
			} else {
				cuentacontableAux=(CuentaContable)jComboBoxid_cuenta_contable_credito_fiscalParametroCarteraGenerico.getSelectedItem();
			}

			if(cuentacontableAux!=null) {
				parametrocartera.setid_cuenta_contable_credito_fiscal(cuentacontableAux.getId());
				parametrocartera.setcuentacontablecreditofiscal_descripcion(ParametroCarteraConstantesFunciones.getCuentaContableCreditoFiscalDescripcion(cuentacontableAux));
				parametrocartera.setCuentaContableCreditoFiscal(cuentacontableAux);			}
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

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.removeAllItems();

							for(Transaccion transaccionfactura:this.transaccionfacturasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.addItem(transaccionfactura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.removeAllItems();

							for(Transaccion transaccionfactura:this.transaccionfacturasForeignKey) {
								this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.addItem(transaccionfactura);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.addItem(empleado);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionDeshabilitasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.removeAllItems();

							for(Transaccion transacciondeshabilita:this.transacciondeshabilitasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.addItem(transacciondeshabilita);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionDeshabilita") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.removeAllItems();

							for(Transaccion transacciondeshabilita:this.transacciondeshabilitasForeignKey) {
								this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.addItem(transacciondeshabilita);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTransaccionHabilitasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTransaccion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.removeAllItems();

							for(Transaccion transaccionhabilita:this.transaccionhabilitasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.addItem(transaccionhabilita);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTransaccionHabilita") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.removeAllItems();

							for(Transaccion transaccionhabilita:this.transaccionhabilitasForeignKey) {
								this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.addItem(transaccionhabilita);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.addItem(bodega);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdBodega") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.removeAllItems();

							for(Bodega bodega:this.bodegasForeignKey) {
								this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.addItem(bodega);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.removeAllItems();

							for(TipoFactura tipofactura:this.tipofacturasForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.addItem(tipofactura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.removeAllItems();

							for(TipoFactura tipofactura:this.tipofacturasForeignKey) {
								this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.addItem(tipofactura);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoAutoPagosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoAutoPago=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.removeAllItems();

							for(TipoAutoPago tipoautopago:this.tipoautopagosForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.addItem(tipoautopago);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoAutoPago") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.removeAllItems();

							for(TipoAutoPago tipoautopago:this.tipoautopagosForeignKey) {
								this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.addItem(tipoautopago);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCuentaContableCreditoFiscalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCuentaContable=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.removeAllItems();

							for(CuentaContable cuentacontablecreditofiscal:this.cuentacontablecreditofiscalsForeignKey) {
								this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.addItem(cuentacontablecreditofiscal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroCartera!=null) { 
					}

					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCuentaContableCreditoFiscal") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.removeAllItems();

							for(CuentaContable cuentacontablecreditofiscal:this.cuentacontablecreditofiscalsForeignKey) {
								this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.addItem(cuentacontablecreditofiscal);
							}
						}

						if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTransaccionFacturaForeignKey(Transaccion transaccionfactura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setSelectedItem(transaccionfactura);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setSelectedItem(transaccionfactura);
						} else {
							this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionDeshabilitaForeignKey(Transaccion transacciondeshabilita,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedItem(transacciondeshabilita);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setSelectedItem(transacciondeshabilita);
						} else {
							this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTransaccionHabilitaForeignKey(Transaccion transaccionhabilita,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setSelectedItem(transaccionhabilita);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setSelectedItem(transaccionhabilita);
						} else {
							this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setSelectedItem(bodega);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.setSelectedItem(bodega);
						} else {
							this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoFacturaForeignKey(TipoFactura tipofactura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setSelectedItem(tipofactura);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setSelectedItem(tipofactura);
						} else {
							this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoAutoPagoForeignKey(TipoAutoPago tipoautopago,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedItem(tipoautopago);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setSelectedItem(tipoautopago);
						} else {
							this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCuentaContableCreditoFiscalForeignKey(CuentaContable cuentacontablecreditofiscal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscal);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroCartera!=null) {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setSelectedItem(cuentacontablecreditofiscal);
						} else {
							this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesParametroCartera() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroCarteraConstantesFunciones.refrescarForeignKeysDescripcionesParametroCartera(this.parametrocarteraLogic.getParametroCarteras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroCarteraConstantesFunciones.refrescarForeignKeysDescripcionesParametroCartera(this.parametrocarteras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Transaccion.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Bodega.class));
		classes.add(new Classe(TipoFactura.class));
		classes.add(new Classe(TipoAutoPago.class));
		classes.add(new Classe(CuentaContable.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametrocarteraLogic.setParametroCarteras(this.parametrocarteras);
			parametrocarteraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroCarteraParameterReturnGeneral getParametroCarteraParameterGeneral() {
		return this.parametrocarteraParameterGeneral;
	}
	
	public void setParametroCarteraParameterGeneral(ParametroCarteraParameterReturnGeneral parametrocarteraParameterGeneral) {
		this.parametrocarteraParameterGeneral = parametrocarteraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroCartera() {
		return isPermisoTodoParametroCartera;
	}

	public void setIsPermisoTodoParametroCartera(Boolean isPermisoTodoParametroCartera) {
		this.isPermisoTodoParametroCartera = isPermisoTodoParametroCartera;
	}

	public Boolean getIsPermisoNuevoParametroCartera() {
		return isPermisoNuevoParametroCartera;
	}

	public void setIsPermisoNuevoParametroCartera(Boolean isPermisoNuevoParametroCartera) {
		this.isPermisoNuevoParametroCartera = isPermisoNuevoParametroCartera;
	}

	public Boolean getIsPermisoActualizarParametroCartera() {
		return isPermisoActualizarParametroCartera;
	}

	public void setIsPermisoActualizarParametroCartera(Boolean isPermisoActualizarParametroCartera) {
		this.isPermisoActualizarParametroCartera = isPermisoActualizarParametroCartera;
	}

	public Boolean getIsPermisoEliminarParametroCartera() {
		return isPermisoEliminarParametroCartera;
	}

	public void setIsPermisoEliminarParametroCartera(Boolean isPermisoEliminarParametroCartera) {
		this.isPermisoEliminarParametroCartera = isPermisoEliminarParametroCartera;
	}

	public Boolean getIsPermisoGuardarCambiosParametroCartera() {
		return isPermisoGuardarCambiosParametroCartera;
	}

	public void setIsPermisoGuardarCambiosParametroCartera(Boolean isPermisoGuardarCambiosParametroCartera) {
		this.isPermisoGuardarCambiosParametroCartera = isPermisoGuardarCambiosParametroCartera;
	}
	
	public Boolean getIsPermisoConsultaParametroCartera() {
		return isPermisoConsultaParametroCartera;
	}

	public void setIsPermisoConsultaParametroCartera(Boolean isPermisoConsultaParametroCartera) {
		this.isPermisoConsultaParametroCartera = isPermisoConsultaParametroCartera;
	}

	public Boolean getIsPermisoBusquedaParametroCartera() {
		return isPermisoBusquedaParametroCartera;
	}

	public void setIsPermisoBusquedaParametroCartera(Boolean isPermisoBusquedaParametroCartera) {
		this.isPermisoBusquedaParametroCartera = isPermisoBusquedaParametroCartera;
	}

	public Boolean getIsPermisoReporteParametroCartera() {
		return isPermisoReporteParametroCartera;
	}

	public void setIsPermisoReporteParametroCartera(Boolean isPermisoReporteParametroCartera) {
		this.isPermisoReporteParametroCartera = isPermisoReporteParametroCartera;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroCartera() {
		return isPermisoPaginacionMedioParametroCartera;
	}

	public void setIsPermisoPaginacionMedioParametroCartera(Boolean isPermisoPaginacionMedioParametroCartera) {
		this.isPermisoPaginacionMedioParametroCartera = isPermisoPaginacionMedioParametroCartera;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroCartera() {
		return isPermisoPaginacionTodoParametroCartera;
	}

	public void setIsPermisoPaginacionTodoParametroCartera(Boolean isPermisoPaginacionTodoParametroCartera) {
		this.isPermisoPaginacionTodoParametroCartera = isPermisoPaginacionTodoParametroCartera;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroCartera() {
		return isPermisoPaginacionAltoParametroCartera;
	}

	public void setIsPermisoPaginacionAltoParametroCartera(Boolean isPermisoPaginacionAltoParametroCartera) {
		this.isPermisoPaginacionAltoParametroCartera = isPermisoPaginacionAltoParametroCartera;
	}
	
	public Boolean getIsPermisoCopiarParametroCartera() {
		return isPermisoCopiarParametroCartera;
	}

	public void setIsPermisoCopiarParametroCartera(Boolean isPermisoCopiarParametroCartera) {
		this.isPermisoCopiarParametroCartera = isPermisoCopiarParametroCartera;
	}
	
	public Boolean getIsPermisoVerFormParametroCartera() {
		return isPermisoVerFormParametroCartera;
	}

	public void setIsPermisoVerFormParametroCartera(Boolean isPermisoVerFormParametroCartera) {
		this.isPermisoVerFormParametroCartera = isPermisoVerFormParametroCartera;
	}
	
	public Boolean getIsPermisoDuplicarParametroCartera() {
		return isPermisoDuplicarParametroCartera;
	}

	public void setIsPermisoDuplicarParametroCartera(Boolean isPermisoDuplicarParametroCartera) {
		this.isPermisoDuplicarParametroCartera = isPermisoDuplicarParametroCartera;
	}
	
	public Boolean getIsPermisoOrdenParametroCartera() {
		return isPermisoOrdenParametroCartera;
	}

	public void setIsPermisoOrdenParametroCartera(Boolean isPermisoOrdenParametroCartera) {
		this.isPermisoOrdenParametroCartera = isPermisoOrdenParametroCartera;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroCartera() {
		return isVisibilidadCeldaNuevoParametroCartera;
	}

	public void setIsVisibilidadCeldaNuevoParametroCartera(Boolean isVisibilidadCeldaNuevoParametroCartera) {
		this.isVisibilidadCeldaNuevoParametroCartera = isVisibilidadCeldaNuevoParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroCartera() {
		return isVisibilidadCeldaDuplicarParametroCartera;
	}

	public void setIsVisibilidadCeldaDuplicarParametroCartera(Boolean isVisibilidadCeldaDuplicarParametroCartera) {
		this.isVisibilidadCeldaDuplicarParametroCartera = isVisibilidadCeldaDuplicarParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroCartera() {
		return isVisibilidadCeldaCopiarParametroCartera;
	}

	public void setIsVisibilidadCeldaCopiarParametroCartera(Boolean isVisibilidadCeldaCopiarParametroCartera) {
		this.isVisibilidadCeldaCopiarParametroCartera = isVisibilidadCeldaCopiarParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroCartera() {
		return isVisibilidadCeldaVerFormParametroCartera;
	}

	public void setIsVisibilidadCeldaVerFormParametroCartera(Boolean isVisibilidadCeldaVerFormParametroCartera) {
		this.isVisibilidadCeldaVerFormParametroCartera = isVisibilidadCeldaVerFormParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroCartera() {
		return isVisibilidadCeldaOrdenParametroCartera;
	}

	public void setIsVisibilidadCeldaOrdenParametroCartera(Boolean isVisibilidadCeldaOrdenParametroCartera) {
		this.isVisibilidadCeldaOrdenParametroCartera = isVisibilidadCeldaOrdenParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroCartera() {
		return isVisibilidadCeldaNuevoRelacionesParametroCartera;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroCartera(Boolean isVisibilidadCeldaNuevoRelacionesParametroCartera) {
		this.isVisibilidadCeldaNuevoRelacionesParametroCartera = isVisibilidadCeldaNuevoRelacionesParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroCartera() {
		return isVisibilidadCeldaModificarParametroCartera;
	}

	public void setIsVisibilidadCeldaModificarParametroCartera(Boolean isVisibilidadCeldaModificarParametroCartera) {
		this.isVisibilidadCeldaModificarParametroCartera = isVisibilidadCeldaModificarParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroCartera() {
		return isVisibilidadCeldaActualizarParametroCartera;
	}

	public void setIsVisibilidadCeldaActualizarParametroCartera(Boolean isVisibilidadCeldaActualizarParametroCartera) {
		this.isVisibilidadCeldaActualizarParametroCartera = isVisibilidadCeldaActualizarParametroCartera;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroCartera() {
		return isVisibilidadCeldaEliminarParametroCartera;
	}

	public void setIsVisibilidadCeldaEliminarParametroCartera(Boolean isVisibilidadCeldaEliminarParametroCartera) {
		this.isVisibilidadCeldaEliminarParametroCartera = isVisibilidadCeldaEliminarParametroCartera;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroCartera() {
		return isVisibilidadCeldaCancelarParametroCartera;
	}

	public void setIsVisibilidadCeldaCancelarParametroCartera(Boolean isVisibilidadCeldaCancelarParametroCartera) {
		this.isVisibilidadCeldaCancelarParametroCartera = isVisibilidadCeldaCancelarParametroCartera;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroCartera() {
		return isVisibilidadCeldaGuardarParametroCartera;
	}

	public void setIsVisibilidadCeldaGuardarParametroCartera(Boolean isVisibilidadCeldaGuardarParametroCartera) {
		this.isVisibilidadCeldaGuardarParametroCartera = isVisibilidadCeldaGuardarParametroCartera;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroCartera() {
		return isVisibilidadCeldaGuardarCambiosParametroCartera;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroCartera(Boolean isVisibilidadCeldaGuardarCambiosParametroCartera) {
		this.isVisibilidadCeldaGuardarCambiosParametroCartera = isVisibilidadCeldaGuardarCambiosParametroCartera;
	}
		
	public ParametroCarteraSessionBean getparametrocarteraSessionBean() {
		return this.parametrocarteraSessionBean;
	}
	
	public void setparametrocarteraSessionBean(ParametroCarteraSessionBean parametrocarteraSessionBean) {
		this.parametrocarteraSessionBean=parametrocarteraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdBodega() {
		return this.isVisibilidadFK_IdBodega;
	}

	public void setisVisibilidadFK_IdBodega(Boolean isVisibilidadFK_IdBodega) {
		this.isVisibilidadFK_IdBodega=isVisibilidadFK_IdBodega;
	}

	public Boolean getisVisibilidadFK_IdCuentaContableCreditoFiscal() {
		return this.isVisibilidadFK_IdCuentaContableCreditoFiscal;
	}

	public void setisVisibilidadFK_IdCuentaContableCreditoFiscal(Boolean isVisibilidadFK_IdCuentaContableCreditoFiscal) {
		this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isVisibilidadFK_IdCuentaContableCreditoFiscal;
	}

	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdTipoAutoPago() {
		return this.isVisibilidadFK_IdTipoAutoPago;
	}

	public void setisVisibilidadFK_IdTipoAutoPago(Boolean isVisibilidadFK_IdTipoAutoPago) {
		this.isVisibilidadFK_IdTipoAutoPago=isVisibilidadFK_IdTipoAutoPago;
	}

	public Boolean getisVisibilidadFK_IdTipoFactura() {
		return this.isVisibilidadFK_IdTipoFactura;
	}

	public void setisVisibilidadFK_IdTipoFactura(Boolean isVisibilidadFK_IdTipoFactura) {
		this.isVisibilidadFK_IdTipoFactura=isVisibilidadFK_IdTipoFactura;
	}

	public Boolean getisVisibilidadFK_IdTransaccionDeshabilita() {
		return this.isVisibilidadFK_IdTransaccionDeshabilita;
	}

	public void setisVisibilidadFK_IdTransaccionDeshabilita(Boolean isVisibilidadFK_IdTransaccionDeshabilita) {
		this.isVisibilidadFK_IdTransaccionDeshabilita=isVisibilidadFK_IdTransaccionDeshabilita;
	}

	public Boolean getisVisibilidadFK_IdTransaccionFactura() {
		return this.isVisibilidadFK_IdTransaccionFactura;
	}

	public void setisVisibilidadFK_IdTransaccionFactura(Boolean isVisibilidadFK_IdTransaccionFactura) {
		this.isVisibilidadFK_IdTransaccionFactura=isVisibilidadFK_IdTransaccionFactura;
	}

	public Boolean getisVisibilidadFK_IdTransaccionHabilita() {
		return this.isVisibilidadFK_IdTransaccionHabilita;
	}

	public void setisVisibilidadFK_IdTransaccionHabilita(Boolean isVisibilidadFK_IdTransaccionHabilita) {
		this.isVisibilidadFK_IdTransaccionHabilita=isVisibilidadFK_IdTransaccionHabilita;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroCartera(ParametroCartera parametrocartera)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametrocartera,null);
				this.setActualParaGuardarTransaccionFacturaForeignKey(parametrocartera,null);
				this.setActualParaGuardarEmpleadoForeignKey(parametrocartera,null);
				this.setActualParaGuardarTransaccionDeshabilitaForeignKey(parametrocartera,null);
				this.setActualParaGuardarTransaccionHabilitaForeignKey(parametrocartera,null);
				this.setActualParaGuardarBodegaForeignKey(parametrocartera,null);
				this.setActualParaGuardarTipoFacturaForeignKey(parametrocartera,null);
				this.setActualParaGuardarTipoAutoPagoForeignKey(parametrocartera,null);
				this.setActualParaGuardarCuentaContableCreditoFiscalForeignKey(parametrocartera,null);
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
	
	public void bugActualizarReferenciaActual(ParametroCartera parametrocartera,ParametroCartera parametrocarteraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroCartera(parametrocartera);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametrocarteraAux.setId(parametrocartera.getId());
		parametrocarteraAux.setVersionRow(parametrocartera.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroCartera();
		
			int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametrocarteraValidator.getInvalidValues(this.parametrocartera);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametrocarteraLogic.setDatosCliente(datosCliente);
			parametrocarteraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametrocarteraAux=new  ParametroCartera();
				
				parametrocarteraAux.setIsNew(true);
				parametrocarteraAux.setIsChanged(true);
				
				parametrocarteraAux.setParametroCarteraOriginal(this.parametrocartera);
				
				parametrocarteraAux.setId(this.parametrocartera.getId());	
				parametrocarteraAux.setVersionRow(this.parametrocartera.getVersionRow());	
				parametrocarteraAux.setid_empresa(this.parametrocartera.getid_empresa());	
				parametrocarteraAux.setid_transaccion_factura(this.parametrocartera.getid_transaccion_factura());	
				parametrocarteraAux.setnumero_digitos_factura(this.parametrocartera.getnumero_digitos_factura());	
				parametrocarteraAux.setpor_lotes(this.parametrocartera.getpor_lotes());	
				parametrocarteraAux.setid_empleado(this.parametrocartera.getid_empleado());	
				parametrocarteraAux.setid_transaccion_deshabilita(this.parametrocartera.getid_transaccion_deshabilita());	
				parametrocarteraAux.setid_transaccion_habilita(this.parametrocartera.getid_transaccion_habilita());	
				parametrocarteraAux.setid_bodega(this.parametrocartera.getid_bodega());	
				parametrocarteraAux.setid_tipo_factura(this.parametrocartera.getid_tipo_factura());	
				parametrocarteraAux.setid_tipo_auto_pago(this.parametrocartera.getid_tipo_auto_pago());	
				parametrocarteraAux.setnumero_orden_pago(this.parametrocartera.getnumero_orden_pago());	
				parametrocarteraAux.setid_cuenta_contable_credito_fiscal(this.parametrocartera.getid_cuenta_contable_credito_fiscal());	
				parametrocarteraAux.setdescripcion(this.parametrocartera.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocarteraAux,parametrocarteras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.saveParametroCarteras();//WithConnection
						//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);
					
					this.refrescarForeignKeysDescripcionesParametroCartera();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocarteraLogic.saveParametroCarteraRelaciones(parametrocarteraAux);//WithConnection
								//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocarteraAux,parametrocarteras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametrocarteraAux=new  ParametroCartera();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado() 
					|| (this.parametrocarteraSessionBean.getEsGuardarRelacionado() && this.parametrocartera.getId()>=0)) {
						
					parametrocarteraAux.setIsNew(false);
				}
				
				parametrocarteraAux.setIsDeleted(false);
			
				parametrocarteraAux.setId(this.parametrocartera.getId());	
				parametrocarteraAux.setVersionRow(this.parametrocartera.getVersionRow());	
				parametrocarteraAux.setid_empresa(this.parametrocartera.getid_empresa());	
				parametrocarteraAux.setid_transaccion_factura(this.parametrocartera.getid_transaccion_factura());	
				parametrocarteraAux.setnumero_digitos_factura(this.parametrocartera.getnumero_digitos_factura());	
				parametrocarteraAux.setpor_lotes(this.parametrocartera.getpor_lotes());	
				parametrocarteraAux.setid_empleado(this.parametrocartera.getid_empleado());	
				parametrocarteraAux.setid_transaccion_deshabilita(this.parametrocartera.getid_transaccion_deshabilita());	
				parametrocarteraAux.setid_transaccion_habilita(this.parametrocartera.getid_transaccion_habilita());	
				parametrocarteraAux.setid_bodega(this.parametrocartera.getid_bodega());	
				parametrocarteraAux.setid_tipo_factura(this.parametrocartera.getid_tipo_factura());	
				parametrocarteraAux.setid_tipo_auto_pago(this.parametrocartera.getid_tipo_auto_pago());	
				parametrocarteraAux.setnumero_orden_pago(this.parametrocartera.getnumero_orden_pago());	
				parametrocarteraAux.setid_cuenta_contable_credito_fiscal(this.parametrocartera.getid_cuenta_contable_credito_fiscal());	
				parametrocarteraAux.setdescripcion(this.parametrocartera.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocarteraAux,parametrocarteras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.saveParametroCarteras();//WithConnection
						//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);
					
					this.refrescarForeignKeysDescripcionesParametroCartera();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocarteraLogic.saveParametroCarteraRelaciones(parametrocarteraAux);//WithConnection
								//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametrocarteraAux,parametrocarteras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametrocartera,parametrocarteraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametrocarteraAux=new  ParametroCartera();
				
				parametrocarteraAux.setIsNew(false);
				parametrocarteraAux.setIsChanged(false);
				
				parametrocarteraAux.setIsDeleted(true);
				
				parametrocarteraAux.setId(this.parametrocartera.getId());	
				parametrocarteraAux.setVersionRow(this.parametrocartera.getVersionRow());	
				parametrocarteraAux.setid_empresa(this.parametrocartera.getid_empresa());	
				parametrocarteraAux.setid_transaccion_factura(this.parametrocartera.getid_transaccion_factura());	
				parametrocarteraAux.setnumero_digitos_factura(this.parametrocartera.getnumero_digitos_factura());	
				parametrocarteraAux.setpor_lotes(this.parametrocartera.getpor_lotes());	
				parametrocarteraAux.setid_empleado(this.parametrocartera.getid_empleado());	
				parametrocarteraAux.setid_transaccion_deshabilita(this.parametrocartera.getid_transaccion_deshabilita());	
				parametrocarteraAux.setid_transaccion_habilita(this.parametrocartera.getid_transaccion_habilita());	
				parametrocarteraAux.setid_bodega(this.parametrocartera.getid_bodega());	
				parametrocarteraAux.setid_tipo_factura(this.parametrocartera.getid_tipo_factura());	
				parametrocarteraAux.setid_tipo_auto_pago(this.parametrocartera.getid_tipo_auto_pago());	
				parametrocarteraAux.setnumero_orden_pago(this.parametrocartera.getnumero_orden_pago());	
				parametrocarteraAux.setid_cuenta_contable_credito_fiscal(this.parametrocartera.getid_cuenta_contable_credito_fiscal());	
				parametrocarteraAux.setdescripcion(this.parametrocartera.getdescripcion());	
				
				if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametrocarteraAux.getId()>=0) {	
						this.parametrocarterasEliminados.add(parametrocarteraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocarteraAux,parametrocarteras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.saveParametroCarteras();//WithConnection
						//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametrocarteraLogic.saveParametroCarteraRelaciones(parametrocarteraAux);//WithConnection
								//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
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
							if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametrocarteraAux,parametrocarteraLogic.getParametroCarteras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametrocarteraAux,parametrocarteras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getParametroCarteras().addAll(this.parametrocarterasEliminados);
					
					parametrocarteraLogic.saveParametroCarteras();//WithConnection
					//parametrocarteraLogic.getSetVersionRowParametroCarteras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroCartera();
				
				this.parametrocarterasEliminados= new ArrayList<ParametroCartera>();		
			}
			
			if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Cartera GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametrocartera=parametrocarteraAux;
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
      		//this.finishProcessParametroCartera();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroCartera parametrocarteraLocal) throws Exception {
		
		if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroCartera parametrocarteraLocal) throws Exception {	
		if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametrocarteraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionfacturaBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionfacturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionfacturaBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionfacturaBeanSwingJInternalFrameLocal.actualizarLista(transaccionfacturaBeanSwingJInternalFrameLocal.transaccion,this.transaccionfacturasForeignKey);

				transaccionfacturaBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionfacturaBeanSwingJInternalFrameLocal.transaccion);

				parametrocarteraLocal.setTransaccionFactura(transaccionfacturaBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionFactura();
				this.cargarCombosFrameTransaccionFacturasForeignKey("Formulario");
				this.setActualTransaccionFacturaForeignKey(transaccionfacturaBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				parametrocarteraLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transacciondeshabilitaBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transacciondeshabilitaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transacciondeshabilitaBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transacciondeshabilitaBeanSwingJInternalFrameLocal.actualizarLista(transacciondeshabilitaBeanSwingJInternalFrameLocal.transaccion,this.transacciondeshabilitasForeignKey);

				transacciondeshabilitaBeanSwingJInternalFrameLocal.actualizarRelaciones(transacciondeshabilitaBeanSwingJInternalFrameLocal.transaccion);

				parametrocarteraLocal.setTransaccionDeshabilita(transacciondeshabilitaBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionDeshabilita();
				this.cargarCombosFrameTransaccionDeshabilitasForeignKey("Formulario");
				this.setActualTransaccionDeshabilitaForeignKey(transacciondeshabilitaBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TransaccionDetalleFormJInternalFrame.class)) {
				TransaccionBeanSwingJInternalFrame transaccionhabilitaBeanSwingJInternalFrameLocal=(TransaccionBeanSwingJInternalFrame) ((TransaccionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				transaccionhabilitaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTransaccion(transaccionhabilitaBeanSwingJInternalFrameLocal.gettransaccion(),true);
				transaccionhabilitaBeanSwingJInternalFrameLocal.actualizarLista(transaccionhabilitaBeanSwingJInternalFrameLocal.transaccion,this.transaccionhabilitasForeignKey);

				transaccionhabilitaBeanSwingJInternalFrameLocal.actualizarRelaciones(transaccionhabilitaBeanSwingJInternalFrameLocal.transaccion);

				parametrocarteraLocal.setTransaccionHabilita(transaccionhabilitaBeanSwingJInternalFrameLocal.transaccion);

				this.addItemDefectoCombosForeignKeyTransaccionHabilita();
				this.cargarCombosFrameTransaccionHabilitasForeignKey("Formulario");
				this.setActualTransaccionHabilitaForeignKey(transaccionhabilitaBeanSwingJInternalFrameLocal.transaccion.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(BodegaDetalleFormJInternalFrame.class)) {
				BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrameLocal=(BodegaBeanSwingJInternalFrame) ((BodegaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				bodegaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoBodega(bodegaBeanSwingJInternalFrameLocal.getbodega(),true);
				bodegaBeanSwingJInternalFrameLocal.actualizarLista(bodegaBeanSwingJInternalFrameLocal.bodega,this.bodegasForeignKey);

				bodegaBeanSwingJInternalFrameLocal.actualizarRelaciones(bodegaBeanSwingJInternalFrameLocal.bodega);

				parametrocarteraLocal.setBodega(bodegaBeanSwingJInternalFrameLocal.bodega);

				this.addItemDefectoCombosForeignKeyBodega();
				this.cargarCombosFrameBodegasForeignKey("Formulario");
				this.setActualBodegaForeignKey(bodegaBeanSwingJInternalFrameLocal.bodega.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoFacturaDetalleFormJInternalFrame.class)) {
				TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrameLocal=(TipoFacturaBeanSwingJInternalFrame) ((TipoFacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipofacturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoFactura(tipofacturaBeanSwingJInternalFrameLocal.gettipofactura(),true);
				tipofacturaBeanSwingJInternalFrameLocal.actualizarLista(tipofacturaBeanSwingJInternalFrameLocal.tipofactura,this.tipofacturasForeignKey);

				tipofacturaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipofacturaBeanSwingJInternalFrameLocal.tipofactura);

				parametrocarteraLocal.setTipoFactura(tipofacturaBeanSwingJInternalFrameLocal.tipofactura);

				this.addItemDefectoCombosForeignKeyTipoFactura();
				this.cargarCombosFrameTipoFacturasForeignKey("Formulario");
				this.setActualTipoFacturaForeignKey(tipofacturaBeanSwingJInternalFrameLocal.tipofactura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoAutoPagoDetalleFormJInternalFrame.class)) {
				TipoAutoPagoBeanSwingJInternalFrame tipoautopagoBeanSwingJInternalFrameLocal=(TipoAutoPagoBeanSwingJInternalFrame) ((TipoAutoPagoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoautopagoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoAutoPago(tipoautopagoBeanSwingJInternalFrameLocal.gettipoautopago(),true);
				tipoautopagoBeanSwingJInternalFrameLocal.actualizarLista(tipoautopagoBeanSwingJInternalFrameLocal.tipoautopago,this.tipoautopagosForeignKey);

				tipoautopagoBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoautopagoBeanSwingJInternalFrameLocal.tipoautopago);

				parametrocarteraLocal.setTipoAutoPago(tipoautopagoBeanSwingJInternalFrameLocal.tipoautopago);

				this.addItemDefectoCombosForeignKeyTipoAutoPago();
				this.cargarCombosFrameTipoAutoPagosForeignKey("Formulario");
				this.setActualTipoAutoPagoForeignKey(tipoautopagoBeanSwingJInternalFrameLocal.tipoautopago.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CuentaContableDetalleFormJInternalFrame.class)) {
				CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalBeanSwingJInternalFrameLocal=(CuentaContableBeanSwingJInternalFrame) ((CuentaContableDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCuentaContable(cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.getcuentacontable(),true);
				cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.actualizarLista(cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.cuentacontable,this.cuentacontablecreditofiscalsForeignKey);

				cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.actualizarRelaciones(cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.cuentacontable);

				parametrocarteraLocal.setCuentaContableCreditoFiscal(cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.cuentacontable);

				this.addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal();
				this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey("Formulario");
				this.setActualCuentaContableCreditoFiscalForeignKey(cuentacontablecreditofiscalBeanSwingJInternalFrameLocal.cuentacontable.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroCarteraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametrocarteraValidator.getInvalidValues(this.parametrocartera);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroCartera parametrocartera,List<ParametroCartera> parametrocarteras) throws Exception {
		try	{		
			ParametroCarteraConstantesFunciones.actualizarLista(parametrocartera,parametrocarteras,this.parametrocarteraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroCartera parametrocartera,List<ParametroCartera> parametrocarteras) throws Exception {
		try	{			
			ParametroCarteraConstantesFunciones.actualizarSelectedLista(parametrocartera,parametrocarteras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroCartera> parametrocarterasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametrocarterasLocal=this.parametrocarteraLogic.getParametroCarteras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametrocarterasLocal=this.parametrocarteras;
			}
			//ARCHITECTURE
		
			for(ParametroCartera parametrocarteraLocal:parametrocarterasLocal) {
				if(this.permiteMantenimiento(parametrocarteraLocal) && parametrocarteraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroCarteraConstantesFunciones.getParametroCarteraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_empresaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDTRANSACCIONFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_facturaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.NUMERODIGITOSFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_digitos_facturaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.PORLOTES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelpor_lotesParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_empleadoParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDTRANSACCIONDESHABILITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_deshabilitaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDTRANSACCIONHABILITA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_habilitaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDBODEGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_bodegaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDTIPOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_tipo_facturaParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDTIPOAUTOPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_tipo_auto_pagoParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.NUMEROORDENPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_orden_pagoParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.IDCUENTACONTABLECREDITOFISCAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelid_cuenta_contable_credito_fiscalParametroCartera,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroCarteraConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabeldescripcionParametroCartera,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_empresaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_facturaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_digitos_facturaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelpor_lotesParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_empleadoParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_deshabilitaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_transaccion_habilitaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_bodegaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_tipo_facturaParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_tipo_auto_pagoParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_orden_pagoParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabelid_cuenta_contable_credito_fiscalParametroCartera,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroCartera.jLabeldescripcionParametroCartera,"");
		
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
		this.iIdNuevoParametroCartera--;	
		
		
		this.parametrocarteraAux=new ParametroCartera();
		
		this.parametrocarteraAux.setId(this.iIdNuevoParametroCartera);
		this.parametrocarteraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametrocarteraLogic.getParametroCarteras().add(this.parametrocarteraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametrocarteras.add(this.parametrocarteraAux);
		}
		//ARCHITECTURE
		
		this.parametrocartera=this.parametrocarteraAux;
		
		if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroCartera(this.parametrocartera);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroCartera(this.parametrocartera);
		}
				
		//this.setDefaultControlesParametroCartera();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroCartera();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroCartera();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroCartera();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroCartera(this.parametrocarteraBean,this.parametrocartera,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroCarteraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
			classes=ParametroCarteraConstantesFunciones.getClassesRelationshipsOfParametroCartera(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametrocarteraReturnGeneral=parametrocarteraLogic.procesarEventosParametroCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocarteraLogic.getParametroCarteras(),this.parametrocartera,this.parametrocarteraParameterGeneral,this.isEsNuevoParametroCartera,classes);//this.parametrocarteraLogic.getParametroCartera()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroCartera(this.parametrocarteraReturnGeneral,this.parametrocarteraBean,false);
		
		if(this.parametrocarteraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera());
		}
		
		if(this.parametrocarteraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera(),classes);//this.parametrocarteraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroCartera();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroCartera();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.RecargarFormParametroCartera(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroCartera(false);
						
			if(parametrocarteraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroCartera();
			}
			
			this.actualizarVisualTableDatosParametroCartera();
			
			this.jTableDatosParametroCartera.setRowSelectionInterval(this.getIndiceNuevoParametroCartera(), this.getIndiceNuevoParametroCartera());
			
			this.seleccionarFilaTablaParametroCarteraActual();
						
			this.actualizarEstadoCeldasBotonesParametroCartera("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroCartera(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarnumero_digitos_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarpor_lotesParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarnumero_orden_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activardescripcionParametroCartera);	
		//
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_empresaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_transaccion_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_empleadoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_transaccion_deshabilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_transaccion_habilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_bodegaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_tipo_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_tipo_auto_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setEnabled(isHabilitar && this.parametrocarteraConstantesFunciones.activarid_cuenta_contable_credito_fiscalParametroCartera);
	};
	
	public void setDefaultControlesParametroCartera() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroCartera(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametrocarteraSessionBean.setConGuardarRelaciones(true);			
			this.parametrocarteraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.setVisible(true);
			
					
		} else {
			//this.parametrocarteraSessionBean.setConGuardarRelaciones(false);			
			this.parametrocarteraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroCartera() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
				if(parametrocarteraAux.getId().equals(this.iIdNuevoParametroCartera)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteras) {
				if(parametrocarteraAux.getId().equals(this.iIdNuevoParametroCartera)) {
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
	
	public int getIndiceActualParametroCartera(ParametroCartera parametrocartera,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
				if(parametrocarteraAux.getId().equals(parametrocartera.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteras) {
				if(parametrocarteraAux.getId().equals(parametrocartera.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroCartera(ParametroCartera parametrocarteraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
				if(parametrocarteraAux.getParametroCarteraOriginal().getId().equals(parametrocarteraOriginal.getId())) {
					existe=true;
					parametrocarteraOriginal.setId(parametrocarteraAux.getId());
					parametrocarteraOriginal.setVersionRow(parametrocarteraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroCartera parametrocarteraAux:this.parametrocarteras) {
				if(parametrocarteraAux.getParametroCarteraOriginal().getId().equals(parametrocarteraOriginal.getId())) {
					existe=true;
					parametrocarteraOriginal.setId(parametrocarteraAux.getId());
					parametrocarteraOriginal.setVersionRow(parametrocarteraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroCartera(Boolean esParaCancelar) throws Exception {
		parametrocarterasAux=new ArrayList<ParametroCartera>();
		parametrocarteraAux=new ParametroCartera();
		
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
					if(parametrocarteraAux.getId()<0) {
						parametrocarterasAux.add(parametrocarteraAux);
					}		
				}
				this.iIdNuevoParametroCartera=0L;
				this.parametrocarteraLogic.getParametroCarteras().removeAll(parametrocarterasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroCartera parametrocarteraAux:this.parametrocarteras) {
					if(parametrocarteraAux.getId()<0) {
						parametrocarterasAux.add(parametrocarteraAux);
					}		
				}
				this.iIdNuevoParametroCartera=0L;
				this.parametrocarteras.removeAll(parametrocarterasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroCartera 
					&& this.parametrocarteraLogic.getParametroCarteras().size()>0
					) {
					parametrocarteraAux=this.parametrocarteraLogic.getParametroCarteras().get(this.parametrocarteraLogic.getParametroCarteras().size() - 1);
				
					if(parametrocarteraAux.getId()<0) {
						this.parametrocarteraLogic.getParametroCarteras().remove(parametrocarteraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroCartera && this.parametrocarteras.size()>0) {
					parametrocarteraAux=this.parametrocarteras.get(this.parametrocarteras.size() - 1);
				
					if(parametrocarteraAux.getId()<0) {
						this.parametrocarteras.remove(parametrocarteraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroCartera(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametrocartera.getId()<0) {
				this.parametrocarteraLogic.getParametroCarteras().remove(this.parametrocartera);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametrocartera.getId()<0) {
				this.parametrocarteras.remove(this.parametrocartera);
			}
		}			
	}
	
	public void setEstadosInicialesParametroCartera(List<ParametroCartera> parametrocarterasAux) throws Exception {
		ParametroCarteraConstantesFunciones.setEstadosInicialesParametroCartera(parametrocarterasAux);
	}
	
	public void setEstadosInicialesParametroCartera(ParametroCartera parametrocarteraAux) throws Exception {
		ParametroCarteraConstantesFunciones.setEstadosInicialesParametroCartera(parametrocarteraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroCarteraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroCarteraActual()) {
				if(!this.isEsNuevoParametroCartera) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroCartera=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroCarteraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Cartera ?", "MANTENIMIENTO DE Parametro Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroCartera parametrocartera) throws Exception {
		ParametroCarteraConstantesFunciones.seleccionarAsignar(this.parametrocartera,parametrocartera);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroCartera=this.isPermisoActualizarOriginalParametroCartera;
			
			
			this.seleccionarAsignar(parametrocartera);
			
			

			idCuentaContableCreditoFiscalActual=parametrocartera.getid_cuenta_contable_credito_fiscal();
			this.seleccionarCuentaContableCreditoFiscalActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroCarteraConstantesFunciones.quitarEspaciosParametroCartera(this.parametrocartera,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametrocarteraSessionBean.setsFuncionBusquedaRapida(this.parametrocarteraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarCuentaContableCreditoFiscalActual() throws Exception {
		try	{
			CuentaContable cuentacontablecreditofiscalAux=new CuentaContable();

			if(this.idCuentaContableCreditoFiscalActual != null && this.idCuentaContableCreditoFiscalActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cuentacontablecreditofiscalLogic.getEntityWithConnection(this.idCuentaContableCreditoFiscalActual);
					cuentacontablecreditofiscalAux= cuentacontablecreditofiscalLogic.getCuentaContable();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				cuentacontablecreditofiscalsForeignKey=new ArrayList<CuentaContable>();
				cuentacontablecreditofiscalsForeignKey.add(cuentacontablecreditofiscalAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroCartera) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroCartera(esParaCancelar);				
				this.cancelarNuevoParametroCartera(esParaCancelar);								
			}
			
			this.parametrocartera=new ParametroCartera();
			
			this.inicializarParametroCartera();
			
			this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroCartera() throws Exception {
		try {
			ParametroCarteraConstantesFunciones.inicializarParametroCartera(this.parametrocartera);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametrocarteraLogic.getParametroCarteras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroCarteras(String sAccionBusqueda,List<ParametroCartera> parametrocarterasParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroCartera"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroCarteraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroCarteraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroCartera"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Carteras");		
		parameters.put("busquedapor", ParametroCarteraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroCartera=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroCarteraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroCarteraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroCartera=new JRBeanArrayDataSource(ParametroCarteraJInternalFrame.TraerParametroCarteraBeans(parametrocarterasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroCartera);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroCarteraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroCarteraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroCarteraBean.TraerParametroCarteraBeans(parametrocarterasParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroCarteraActionPerformed(null);
					//this.generarExcelReporteParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroCarteras(sAccionBusqueda,sTipoArchivoReporte,parametrocarterasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroCartera> parametrocarterasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroCarteras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroCartera("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroCartera parametrocartera : parametrocarterasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroCarteraConstantesFunciones.generarExcelReporteDataParametroCartera("NORMAL",row,workbook,parametrocartera,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroCartera(String sTipo,Row row,Workbook workbook) {
		
		ParametroCarteraConstantesFunciones.generarExcelReporteHeaderParametroCartera(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroCartera> parametrocarterasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroCarteras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroCartera parametrocartera : parametrocarterasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroCarteraConstantesFunciones.getParametroCarteraDescripcion(parametrocartera));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.gettransaccionfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getnumero_digitos_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_PORLOTES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_PORLOTES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(parametrocartera.getpor_lotes()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.gettransacciondeshabilita_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.gettransaccionhabilita_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getbodega_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.gettipofactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.gettipoautopago_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getnumero_orden_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getcuentacontablecreditofiscal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametrocartera.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroCarteras(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroCartera> parametrocarterasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroCartera> parametrocarterasRespaldo=null;
		
		classes=ParametroCarteraConstantesFunciones.getClassesRelationshipsOfParametroCartera(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametrocarteraLogic.setDatosCliente(this.datosCliente);
		this.parametrocarteraLogic.setDatosDeep(this.datosDeep);
		this.parametrocarteraLogic.setIsConDeep(true);
		
		parametrocarterasRespaldo=this.parametrocarteraLogic.getParametroCarteras();
		
		this.parametrocarteraLogic.setParametroCarteras(parametrocarterasParaReportes);	
		this.parametrocarteraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametrocarterasParaReportes=this.parametrocarteraLogic.getParametroCarteras();
		this.parametrocarteraLogic.setParametroCarteras(parametrocarterasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroCarteras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroCartera("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroCartera parametrocartera : parametrocarterasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroCartera("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroCarteraConstantesFunciones.generarExcelReporteDataParametroCartera("NORMAL",row,workbook,parametrocartera,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroCarteraConstantesFunciones.getParametroCarteraDescripcion(parametrocartera));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroCartera.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroCartera() throws Exception {		
		this.startProcessParametroCartera(true);
	}
	
	public void startProcessParametroCartera(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroCartera ,this.jPanelParametrosReportesParametroCartera, this.jScrollPanelDatosParametroCartera,this.jPanelPaginacionParametroCartera, this.jScrollPanelDatosEdicionParametroCartera, this.jPanelAccionesParametroCartera,this.jPanelAccionesFormularioParametroCartera,this.jmenuBarParametroCartera,this.jmenuBarDetalleParametroCartera,this.jTtoolBarParametroCartera,this.jTtoolBarDetalleParametroCartera);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroCartera=this.jTabbedPaneBusquedasParametroCartera; 
		
		final JPanel jPanelParametrosReportesParametroCartera=this.jPanelParametrosReportesParametroCartera;
		//final JScrollPane jScrollPanelDatosParametroCartera=this.jScrollPanelDatosParametroCartera;
		final JTable jTableDatosParametroCartera=this.jTableDatosParametroCartera;		
		final JPanel jPanelPaginacionParametroCartera=this.jPanelPaginacionParametroCartera;
		//final JScrollPane jScrollPanelDatosEdicionParametroCartera=this.jScrollPanelDatosEdicionParametroCartera;
		final JPanel jPanelAccionesParametroCartera=this.jPanelAccionesParametroCartera;
		
		JPanel jPanelCamposAuxiliarParametroCartera=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroCartera=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			jPanelCamposAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jPanelCamposParametroCartera;
			jPanelAccionesFormularioAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jPanelAccionesFormularioParametroCartera;
		}
		
		final JPanel jPanelCamposParametroCartera=jPanelCamposAuxiliarParametroCartera;
		final JPanel jPanelAccionesFormularioParametroCartera=jPanelAccionesFormularioAuxiliarParametroCartera;
		
		
		final JMenuBar jmenuBarParametroCartera=this.jmenuBarParametroCartera;
		final JToolBar jTtoolBarParametroCartera=this.jTtoolBarParametroCartera;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroCartera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroCartera=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			jmenuBarDetalleAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jmenuBarDetalleParametroCartera;
			jTtoolBarDetalleAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jTtoolBarDetalleParametroCartera;
		}
		
		final JMenuBar jmenuBarDetalleParametroCartera=jmenuBarDetalleAuxiliarParametroCartera;
		final JToolBar jTtoolBarDetalleParametroCartera=jTtoolBarDetalleAuxiliarParametroCartera;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroCartera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroCartera;
			processRunnable.jTableDatos=jTableDatosParametroCartera;
			processRunnable.jPanelCampos=jPanelCamposParametroCartera;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroCartera;
			processRunnable.jPanelAcciones=jPanelAccionesParametroCartera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroCartera;
			
			
			processRunnable.jmenuBar=jmenuBarParametroCartera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroCartera;
			processRunnable.jTtoolBar=jTtoolBarParametroCartera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroCartera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroCartera ,jPanelParametrosReportesParametroCartera,jTableDatosParametroCartera, /*jScrollPanelDatosParametroCartera,*/jPanelCamposParametroCartera,jPanelPaginacionParametroCartera, /*jScrollPanelDatosEdicionParametroCartera,*/ jPanelAccionesParametroCartera,jPanelAccionesFormularioParametroCartera,jmenuBarParametroCartera,jmenuBarDetalleParametroCartera,jTtoolBarParametroCartera,jTtoolBarDetalleParametroCartera);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroCartera ,jPanelParametrosReportesParametroCartera, jScrollPanelDatosParametroCartera,jPanelPaginacionParametroCartera, jScrollPanelDatosEdicionParametroCartera, jPanelAccionesParametroCartera,jPanelAccionesFormularioParametroCartera,jmenuBarParametroCartera,jmenuBarDetalleParametroCartera,jTtoolBarParametroCartera,jTtoolBarDetalleParametroCartera);
						
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
	
	public void finishProcessParametroCartera() {// throws Exception 
		this.finishProcessParametroCartera(true);
	}
	
	public void finishProcessParametroCartera(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroCartera ,this.jPanelParametrosReportesParametroCartera, this.jScrollPanelDatosParametroCartera,this.jPanelPaginacionParametroCartera, this.jScrollPanelDatosEdicionParametroCartera, this.jPanelAccionesParametroCartera,this.jPanelAccionesFormularioParametroCartera,this.jmenuBarParametroCartera,this.jmenuBarDetalleParametroCartera,this.jTtoolBarParametroCartera,this.jTtoolBarDetalleParametroCartera);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroCartera=this.jTabbedPaneBusquedasParametroCartera; 
		
		final JPanel jPanelParametrosReportesParametroCartera=this.jPanelParametrosReportesParametroCartera;
		//final JScrollPane jScrollPanelDatosParametroCartera=this.jScrollPanelDatosParametroCartera;
		final JTable jTableDatosParametroCartera=this.jTableDatosParametroCartera;		
		final JPanel jPanelPaginacionParametroCartera=this.jPanelPaginacionParametroCartera;
		//final JScrollPane jScrollPanelDatosEdicionParametroCartera=this.jScrollPanelDatosEdicionParametroCartera;
		final JPanel jPanelAccionesParametroCartera=this.jPanelAccionesParametroCartera;
		
		JPanel jPanelCamposAuxiliarParametroCartera=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroCartera=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			jPanelCamposAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jPanelCamposParametroCartera;
			jPanelAccionesFormularioAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jPanelAccionesFormularioParametroCartera;
		}
		
		final JPanel jPanelCamposParametroCartera=jPanelCamposAuxiliarParametroCartera;
		final JPanel jPanelAccionesFormularioParametroCartera=jPanelAccionesFormularioAuxiliarParametroCartera;
		
		
		final JMenuBar jmenuBarParametroCartera=this.jmenuBarParametroCartera;		
		final JToolBar jTtoolBarParametroCartera=this.jTtoolBarParametroCartera;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroCartera=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroCartera=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			jmenuBarDetalleAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jmenuBarDetalleParametroCartera;
			jTtoolBarDetalleAuxiliarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jTtoolBarDetalleParametroCartera;		
		}
		
		final JMenuBar jmenuBarDetalleParametroCartera=jmenuBarDetalleAuxiliarParametroCartera;
		final JToolBar jTtoolBarDetalleParametroCartera=jTtoolBarDetalleAuxiliarParametroCartera;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroCartera;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroCartera;
			processRunnable.jTableDatos=jTableDatosParametroCartera;
			processRunnable.jPanelCampos=jPanelCamposParametroCartera;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroCartera;
			processRunnable.jPanelAcciones=jPanelAccionesParametroCartera;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroCartera;
			
			
			processRunnable.jmenuBar=jmenuBarParametroCartera;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroCartera;
			processRunnable.jTtoolBar=jTtoolBarParametroCartera;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroCartera;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroCartera ,jPanelParametrosReportesParametroCartera, jTableDatosParametroCartera,/*jScrollPanelDatosParametroCartera,*/jPanelCamposParametroCartera,jPanelPaginacionParametroCartera, /*jScrollPanelDatosEdicionParametroCartera,*/ jPanelAccionesParametroCartera,jPanelAccionesFormularioParametroCartera,jmenuBarParametroCartera,jmenuBarDetalleParametroCartera,jTtoolBarParametroCartera,jTtoolBarDetalleParametroCartera));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroCartera(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroCartera(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroCartera(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroCartera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroCartera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroCartera,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroCartera(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroCartera,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroCartera,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametrocarteraConstantesFunciones.getsFinalQueryParametroCartera();
		String  finalQueryPaginacionTodos=this.parametrocarteraConstantesFunciones.getsFinalQueryParametroCartera();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroCarteraConstantesFunciones.getArrayColumnasGlobalesNoParametroCartera(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroCarteraConstantesFunciones.getArrayColumnasGlobalesParametroCartera(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroCarteraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametrocarterasEliminados= new ArrayList<ParametroCartera>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroCartera();
		
				///*ParametroCarteraSessionBean*/this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			
			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
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
					this.iNumeroPaginacion=ParametroCarteraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroCarteraConstantesFunciones.getClassesForeignKeysOfParametroCartera(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametrocartera."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametrocarterasAux= new ArrayList<ParametroCartera>();
			
				
			parametrocarteraLogic.setDatosCliente(this.datosCliente);
			parametrocarteraLogic.setDatosDeep(this.datosDeep);
			parametrocarteraLogic.setIsConDeep(true);
			
			
			parametrocarteraLogic.getParametroCarteraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametrocarteraLogic.getTodosParametroCarteras(finalQueryGlobal,pagination);
					
					//parametrocarteraLogic.getTodosParametroCarterasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametrocarteraLogic.getParametroCarteras()==null|| parametrocarteraLogic.getParametroCarteras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocarterasAux= new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux= new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocarteraLogic.getTodosParametroCarteras(finalQueryGlobal+"",this.pagination);												
							
							//parametrocarteraLogic.getTodosParametroCarterasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroCarteras("Todos",parametrocarteraLogic.getParametroCarteras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());					
							parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroCartera=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroCartera=this.idActual;
				
				} else if(this.idParametroCarteraActual!=null && this.idParametroCarteraActual!=0L) {
					idParametroCartera=idParametroCarteraActual;
				}
				
					
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndicePorId(idParametroCartera);
				
				this.parametrocarteras=new ArrayList<ParametroCartera>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametrocarteraLogic.getEntity(idParametroCartera);
					
					//parametrocarteraLogic.getEntityWithConnection(idParametroCartera);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
					parametrocarteraLogic.getParametroCarteras().add(parametrocarteraLogic.getParametroCartera());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocarteras=new ArrayList<ParametroCartera>();
					this.parametrocarteras.add(parametrocartera);
				}
				
				if(parametrocarteraLogic.getParametroCartera()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdBodega")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdBodega(finalQueryGlobal,pagination,id_bodegaFK_IdBodega);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdBodega(id_bodegaFK_IdBodega);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdBodega",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdBodega",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCuentaContableCreditoFiscal")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCreditoFiscal(id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdCuentaContableCreditoFiscal(finalQueryGlobal,pagination,id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCreditoFiscal(id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCreditoFiscal(id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdCuentaContableCreditoFiscal(finalQueryGlobal,pagination,id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCreditoFiscal(id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdCuentaContableCreditoFiscal(id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdCuentaContableCreditoFiscal",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdCuentaContableCreditoFiscal",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdEmpleado",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdEmpleado",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdEmpresa",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdEmpresa",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoAutoPago")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoAutoPago(id_tipo_auto_pagoFK_IdTipoAutoPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdTipoAutoPago(finalQueryGlobal,pagination,id_tipo_auto_pagoFK_IdTipoAutoPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoAutoPago(id_tipo_auto_pagoFK_IdTipoAutoPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoAutoPago(id_tipo_auto_pagoFK_IdTipoAutoPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdTipoAutoPago(finalQueryGlobal,pagination,id_tipo_auto_pagoFK_IdTipoAutoPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoAutoPago(id_tipo_auto_pagoFK_IdTipoAutoPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoAutoPago(id_tipo_auto_pagoFK_IdTipoAutoPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdTipoAutoPago",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdTipoAutoPago",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoFactura")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoFactura(id_tipo_facturaFK_IdTipoFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdTipoFactura(finalQueryGlobal,pagination,id_tipo_facturaFK_IdTipoFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoFactura(id_tipo_facturaFK_IdTipoFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoFactura(id_tipo_facturaFK_IdTipoFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdTipoFactura(finalQueryGlobal,pagination,id_tipo_facturaFK_IdTipoFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoFactura(id_tipo_facturaFK_IdTipoFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTipoFactura(id_tipo_facturaFK_IdTipoFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdTipoFactura",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdTipoFactura",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionDeshabilita")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionDeshabilita(id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionDeshabilita(finalQueryGlobal,pagination,id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionDeshabilita(id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionDeshabilita(id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdTransaccionDeshabilita(finalQueryGlobal,pagination,id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionDeshabilita(id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionDeshabilita(id_transaccion_deshabilitaFK_IdTransaccionDeshabilita);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdTransaccionDeshabilita",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdTransaccionDeshabilita",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionFactura")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionFactura(id_transaccion_facturaFK_IdTransaccionFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionFactura(finalQueryGlobal,pagination,id_transaccion_facturaFK_IdTransaccionFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionFactura(id_transaccion_facturaFK_IdTransaccionFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionFactura(id_transaccion_facturaFK_IdTransaccionFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdTransaccionFactura(finalQueryGlobal,pagination,id_transaccion_facturaFK_IdTransaccionFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionFactura(id_transaccion_facturaFK_IdTransaccionFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionFactura(id_transaccion_facturaFK_IdTransaccionFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdTransaccionFactura",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdTransaccionFactura",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTransaccionHabilita")) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionHabilita(id_transaccion_habilitaFK_IdTransaccionHabilita);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionHabilita(finalQueryGlobal,pagination,id_transaccion_habilitaFK_IdTransaccionHabilita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionHabilita(id_transaccion_habilitaFK_IdTransaccionHabilita);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionHabilita(id_transaccion_habilitaFK_IdTransaccionHabilita);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametrocarteraLogic.getParametroCarteras()==null||parametrocarteraLogic.getParametroCarteras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametrocarteras==null|| parametrocarteras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarterasAux=new ArrayList<ParametroCartera>();
						parametrocarterasAux.addAll(parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarterasAux=new ArrayList<ParametroCartera>();
							parametrocarterasAux.addAll(parametrocarteras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametrocarteraLogic.getParametroCarterasFK_IdTransaccionHabilita(finalQueryGlobal,pagination,id_transaccion_habilitaFK_IdTransaccionHabilita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionHabilita(id_transaccion_habilitaFK_IdTransaccionHabilita);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroCarteraConstantesFunciones.getDetalleIndiceFK_IdTransaccionHabilita(id_transaccion_habilitaFK_IdTransaccionHabilita);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroCarteras("FK_IdTransaccionHabilita",parametrocarteraLogic.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroCarteras("FK_IdTransaccionHabilita",parametrocarteras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraLogic.setParametroCarteras(new ArrayList<ParametroCartera>());
						parametrocarteraLogic.getParametroCarteras().addAll(parametrocarterasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteras=new ArrayList<ParametroCartera>();
							parametrocarteras.addAll(parametrocarterasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroCartera();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroCartera();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocarteraLogic.getParametroCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocarteras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametrocarteraLogic.getParametroCarteras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametrocarteras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroCartera parametrocartera) {
		Boolean permite=true;
		
		if(this.parametrocartera.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroCarteraConstantesFunciones.getOrderByListaParametroCartera();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroCarteraConstantesFunciones.getOrderByListaParametroCartera();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroCartera parametrocartera:parametrocarteraLogic.getParametroCarteras()) {
				if(parametrocartera.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocarteraTotales=parametrocartera;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroCartera parametrocartera:this.parametrocarteras) {
				if(parametrocartera.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocarteraTotales=parametrocartera;
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
			this.parametrocarteraAux=new ParametroCartera();
			this.parametrocarteraAux.setsType(Constantes2.S_TOTALES);
			this.parametrocarteraAux.setIsNew(false);
			this.parametrocarteraAux.setIsChanged(false);
			this.parametrocarteraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroCarteraConstantesFunciones.TotalizarValoresFilaParametroCartera(this.parametrocarteraLogic.getParametroCarteras(),this.parametrocarteraAux);
				
				this.parametrocarteraLogic.getParametroCarteras().add(this.parametrocarteraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroCarteraConstantesFunciones.TotalizarValoresFilaParametroCartera(this.parametrocarteras,this.parametrocarteraAux);
				
				this.parametrocarteras.add(this.parametrocarteraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametrocarteraTotales=new ParametroCartera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocarteraLogic.getParametroCarteras().remove(parametrocarteraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametrocarteras.remove(parametrocarteraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametrocarteraTotales=new ParametroCartera();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroCartera parametrocartera:parametrocarteraLogic.getParametroCarteras()) {
				if(parametrocartera.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocarteraTotales=parametrocartera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroCarteraConstantesFunciones.TotalizarValoresFilaParametroCartera(this.parametrocarteraLogic.getParametroCarteras(),parametrocarteraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroCartera parametrocartera:this.parametrocarteras) {
				if(parametrocartera.getsType().equals(Constantes2.S_TOTALES)) {
					parametrocarteraTotales=parametrocartera;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroCarteraConstantesFunciones.TotalizarValoresFilaParametroCartera(this.parametrocarteras,parametrocarteraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroCarterasFK_IdBodega()throws Exception {
		try {
			sAccionBusqueda="FK_IdBodega";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdCuentaContableCreditoFiscal()throws Exception {
		try {
			sAccionBusqueda="FK_IdCuentaContableCreditoFiscal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdTipoAutoPago()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoAutoPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdTipoFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdTransaccionDeshabilita()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionDeshabilita";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdTransaccionFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getParametroCarterasFK_IdTransaccionHabilita()throws Exception {
		try {
			sAccionBusqueda="FK_IdTransaccionHabilita";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroCarterasFK_IdBodega(String sFinalQuery,Long id_bodega)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdBodega(sFinalQuery,this.pagination,id_bodega);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdCuentaContableCreditoFiscal(String sFinalQuery,Long id_cuenta_contable_credito_fiscal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdCuentaContableCreditoFiscal(sFinalQuery,this.pagination,id_cuenta_contable_credito_fiscal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdTipoAutoPago(String sFinalQuery,Long id_tipo_auto_pago)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdTipoAutoPago(sFinalQuery,this.pagination,id_tipo_auto_pago);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdTipoFactura(String sFinalQuery,Long id_tipo_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdTipoFactura(sFinalQuery,this.pagination,id_tipo_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdTransaccionDeshabilita(String sFinalQuery,Long id_transaccion_deshabilita)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionDeshabilita(sFinalQuery,this.pagination,id_transaccion_deshabilita);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdTransaccionFactura(String sFinalQuery,Long id_transaccion_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionFactura(sFinalQuery,this.pagination,id_transaccion_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getParametroCarterasFK_IdTransaccionHabilita(String sFinalQuery,Long id_transaccion_habilita)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLogic.getParametroCarterasFK_IdTransaccionHabilita(sFinalQuery,this.pagination,id_transaccion_habilita);
				
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
	
	public void inicializarPermisosParametroCartera() {
		this.isPermisoTodoParametroCartera=false;
		this.isPermisoNuevoParametroCartera=false;
		this.isPermisoActualizarParametroCartera=false;
		this.isPermisoActualizarOriginalParametroCartera=false;
		this.isPermisoEliminarParametroCartera=false;
		this.isPermisoGuardarCambiosParametroCartera=false;
		this.isPermisoConsultaParametroCartera=false;
		this.isPermisoBusquedaParametroCartera=false;
		this.isPermisoReporteParametroCartera=false;		
		this.isPermisoOrdenParametroCartera=false;		
		this.isPermisoPaginacionMedioParametroCartera=false;		
		this.isPermisoPaginacionAltoParametroCartera=false;
		this.isPermisoPaginacionTodoParametroCartera=false;
		this.isPermisoCopiarParametroCartera=false;		
		this.isPermisoVerFormParametroCartera=false;		
		this.isPermisoDuplicarParametroCartera=false;		
		this.isPermisoOrdenParametroCartera=false;		
	}
	
	public void setPermisosUsuarioParametroCartera(Boolean isPermiso) {
		this.isPermisoTodoParametroCartera=isPermiso;
		this.isPermisoNuevoParametroCartera=isPermiso;
		this.isPermisoActualizarParametroCartera=isPermiso;
		this.isPermisoActualizarOriginalParametroCartera=isPermiso;
		this.isPermisoEliminarParametroCartera=isPermiso;
		this.isPermisoGuardarCambiosParametroCartera=isPermiso;
		this.isPermisoConsultaParametroCartera=isPermiso;
		this.isPermisoBusquedaParametroCartera=isPermiso;
		this.isPermisoReporteParametroCartera=isPermiso;
		this.isPermisoOrdenParametroCartera=isPermiso;		
		this.isPermisoPaginacionMedioParametroCartera=isPermiso;		
		this.isPermisoPaginacionAltoParametroCartera=isPermiso;		
		this.isPermisoPaginacionTodoParametroCartera=isPermiso;		
		this.isPermisoCopiarParametroCartera=isPermiso;		
		this.isPermisoVerFormParametroCartera=isPermiso;		
		this.isPermisoDuplicarParametroCartera=isPermiso;
		this.isPermisoOrdenParametroCartera=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroCartera(Boolean isPermiso) {
		//this.isPermisoTodoParametroCartera=isPermiso;
		this.isPermisoNuevoParametroCartera=isPermiso;
		this.isPermisoActualizarParametroCartera=isPermiso;
		this.isPermisoActualizarOriginalParametroCartera=isPermiso;
		this.isPermisoEliminarParametroCartera=isPermiso;
		this.isPermisoGuardarCambiosParametroCartera=isPermiso;
		//this.isPermisoConsultaParametroCartera=isPermiso;
		//this.isPermisoBusquedaParametroCartera=isPermiso;
		//this.isPermisoReporteParametroCartera=isPermiso;
		//this.isPermisoOrdenParametroCartera=isPermiso;		
		//this.isPermisoPaginacionMedioParametroCartera=isPermiso;		
		//this.isPermisoPaginacionAltoParametroCartera=isPermiso;		
		//this.isPermisoPaginacionTodoParametroCartera=isPermiso;		
		//this.isPermisoCopiarParametroCartera=isPermiso;		
		//this.isPermisoDuplicarParametroCartera=isPermiso;
		//this.isPermisoOrdenParametroCartera=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroCarteraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroCarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroCartera(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroCarteraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroCarteraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroCarteraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroCarteraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroCartera() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroCarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroCarteraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroCartera=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroCartera=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroCartera=this.isPermisoActualizarParametroCartera;
			this.isPermisoEliminarParametroCartera=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroCartera=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroCartera=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroCartera=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroCartera=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroCartera=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroCartera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroCartera=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroCartera=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroCartera=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroCartera=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroCartera=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroCartera=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroCartera=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroCartera.setToolTipText(this.jTableDatosParametroCartera.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroCartera(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroCartera(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroCarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroCarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroCartera() throws Exception {
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
	public void inicializarCombosForeignKeyParametroCarteraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.transaccionfacturasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.transacciondeshabilitasForeignKey=new ArrayList();
				this.transaccionhabilitasForeignKey=new ArrayList();
				this.bodegasForeignKey=new ArrayList();
				this.tipofacturasForeignKey=new ArrayList();
				this.tipoautopagosForeignKey=new ArrayList();
				this.cuentacontablecreditofiscalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroCarteraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroCarteraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroCarteraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionDeshabilitaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTransaccionHabilitaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyBodegaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoAutoPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCuentaContableCreditoFiscalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTransaccionFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionfacturasForeignKey==null||this.transaccionfacturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionDeshabilitaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transacciondeshabilitasForeignKey==null||this.transacciondeshabilitasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionDeshabilitasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionHabilitaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.transaccionhabilitasForeignKey==null||this.transaccionhabilitasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TransaccionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTransaccionHabilitasForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyTipoFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipofacturasForeignKey==null||this.tipofacturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoFacturaConstantesFunciones.getArrayColumnasGlobalesTipoFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoFacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAutoPagoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoautopagosForeignKey==null||this.tipoautopagosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoAutoPagoConstantesFunciones.getArrayColumnasGlobalesTipoAutoPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAutoPagoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoAutoPagoConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoAutoPagosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoFiscalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cuentacontablecreditofiscalsForeignKey==null||this.cuentacontablecreditofiscalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CuentaContableConstantesFunciones.SFINALQUERY;

				this.cargarCombosCuentaContableCreditoFiscalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyParametroCarteraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroCarteraParameterReturnGeneral parametrocarteraReturnGeneral=new ParametroCarteraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_empresaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_empresaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTransaccionFactura="";

				if(((this.transaccionfacturasForeignKey==null||this.transaccionfacturasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_transaccion_facturaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_transaccion_facturaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccionFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionFactura, "");
						finalQueryGlobalTransaccionFactura+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionFactura=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidTransaccionFacturaActual();
					}
				} else {
					finalQueryGlobalTransaccionFactura="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_empleadoParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_empleadoParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalTransaccionDeshabilita="";

				if(((this.transacciondeshabilitasForeignKey==null||this.transacciondeshabilitasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_transaccion_deshabilitaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_transaccion_deshabilitaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionDeshabilita()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccionDeshabilita=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionDeshabilita=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionDeshabilita, "");
						finalQueryGlobalTransaccionDeshabilita+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionDeshabilitasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionDeshabilita=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidTransaccionDeshabilitaActual();
					}
				} else {
					finalQueryGlobalTransaccionDeshabilita="NONE";
				}


				String finalQueryGlobalTransaccionHabilita="";

				if(((this.transaccionhabilitasForeignKey==null||this.transaccionhabilitasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_transaccion_habilitaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_transaccion_habilitaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionHabilita()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TransaccionConstantesFunciones.getArrayColumnasGlobalesTransaccion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTransaccionHabilita=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TransaccionConstantesFunciones.TABLENAME);

						finalQueryGlobalTransaccionHabilita=Funciones.GetFinalQueryAppend(finalQueryGlobalTransaccionHabilita, "");
						finalQueryGlobalTransaccionHabilita+=TransaccionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTransaccionHabilitasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTransaccionHabilita=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidTransaccionHabilitaActual();
					}
				} else {
					finalQueryGlobalTransaccionHabilita="NONE";
				}


				String finalQueryGlobalBodega="";

				if(((this.bodegasForeignKey==null||this.bodegasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_bodegaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_bodegaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=BodegaConstantesFunciones.getArrayColumnasGlobalesBodega(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalBodega=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,BodegaConstantesFunciones.TABLENAME);

						finalQueryGlobalBodega=Funciones.GetFinalQueryAppend(finalQueryGlobalBodega, "");
						finalQueryGlobalBodega+=BodegaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosBodegasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalBodega=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidBodegaActual();
					}
				} else {
					finalQueryGlobalBodega="NONE";
				}


				String finalQueryGlobalTipoFactura="";

				if(((this.tipofacturasForeignKey==null||this.tipofacturasForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_tipo_facturaParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_tipo_facturaParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoFacturaConstantesFunciones.getArrayColumnasGlobalesTipoFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoFacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoFactura, "");
						finalQueryGlobalTipoFactura+=TipoFacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoFactura=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidTipoFacturaActual();
					}
				} else {
					finalQueryGlobalTipoFactura="NONE";
				}


				String finalQueryGlobalTipoAutoPago="";

				if(((this.tipoautopagosForeignKey==null||this.tipoautopagosForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_tipo_auto_pagoParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_tipo_auto_pagoParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoPago()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoAutoPagoConstantesFunciones.getArrayColumnasGlobalesTipoAutoPago(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoAutoPago=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoAutoPagoConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoAutoPago=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoAutoPago, "");
						finalQueryGlobalTipoAutoPago+=TipoAutoPagoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoAutoPagosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoAutoPago=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidTipoAutoPagoActual();
					}
				} else {
					finalQueryGlobalTipoAutoPago="NONE";
				}


				String finalQueryGlobalCuentaContableCreditoFiscal="";

				if(((this.cuentacontablecreditofiscalsForeignKey==null||this.cuentacontablecreditofiscalsForeignKey.size()<=0) && this.parametrocarteraConstantesFunciones.cargarid_cuenta_contable_credito_fiscalParametroCartera)
					 || (this.esRecargarFks && this.parametrocarteraConstantesFunciones.cargarid_cuenta_contable_credito_fiscalParametroCartera)) {

					if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();

						this.arrDatoGeneralNo.add("id_modulo");

						arrColumnasGlobales=CuentaContableConstantesFunciones.getArrayColumnasGlobalesCuentaContable(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCuentaContableCreditoFiscal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CuentaContableConstantesFunciones.TABLENAME);

						finalQueryGlobalCuentaContableCreditoFiscal=Funciones.GetFinalQueryAppend(finalQueryGlobalCuentaContableCreditoFiscal, "");
						finalQueryGlobalCuentaContableCreditoFiscal+=CuentaContableConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCuentaContableCreditoFiscalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCuentaContableCreditoFiscal=" WHERE " + ConstantesSql.ID + "="+parametrocarteraSessionBean.getlidCuentaContableCreditoFiscalActual();
					}
				} else {
					finalQueryGlobalCuentaContableCreditoFiscal="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametrocarteraReturnGeneral=parametrocarteraLogic.cargarCombosLoteForeignKeyParametroCartera(finalQueryGlobalEmpresa,finalQueryGlobalTransaccionFactura,finalQueryGlobalEmpleado,finalQueryGlobalTransaccionDeshabilita,finalQueryGlobalTransaccionHabilita,finalQueryGlobalBodega,finalQueryGlobalTipoFactura,finalQueryGlobalTipoAutoPago,finalQueryGlobalCuentaContableCreditoFiscal);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametrocarteraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTransaccionFactura.equals("NONE")) {
				this.transaccionfacturasForeignKey=parametrocarteraReturnGeneral.gettransaccionfacturasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=parametrocarteraReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalTransaccionDeshabilita.equals("NONE")) {
				this.transacciondeshabilitasForeignKey=parametrocarteraReturnGeneral.gettransacciondeshabilitasForeignKey();
			}

			if(!finalQueryGlobalTransaccionHabilita.equals("NONE")) {
				this.transaccionhabilitasForeignKey=parametrocarteraReturnGeneral.gettransaccionhabilitasForeignKey();
			}

			if(!finalQueryGlobalBodega.equals("NONE")) {
				this.bodegasForeignKey=parametrocarteraReturnGeneral.getbodegasForeignKey();
			}

			if(!finalQueryGlobalTipoFactura.equals("NONE")) {
				this.tipofacturasForeignKey=parametrocarteraReturnGeneral.gettipofacturasForeignKey();
			}

			if(!finalQueryGlobalTipoAutoPago.equals("NONE")) {
				this.tipoautopagosForeignKey=parametrocarteraReturnGeneral.gettipoautopagosForeignKey();
			}

			if(!finalQueryGlobalCuentaContableCreditoFiscal.equals("NONE")) {
				this.cuentacontablecreditofiscalsForeignKey=parametrocarteraReturnGeneral.getcuentacontablecreditofiscalsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroCartera()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTransaccionFactura();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyTransaccionDeshabilita();
			this.addItemDefectoCombosForeignKeyTransaccionHabilita();
			this.addItemDefectoCombosForeignKeyBodega();
			this.addItemDefectoCombosForeignKeyTipoFactura();
			this.addItemDefectoCombosForeignKeyTipoAutoPago();
			this.addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametrocarteraSessionBean==null) {
				this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTransaccionFactura()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionFactura()) {
				Transaccion transaccionfactura=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionfactura,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionfactura.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionfacturasForeignKey,transaccionfactura,true)) {

					this.transaccionfacturasForeignKey.add(0,transaccionfactura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionDeshabilita()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionDeshabilita()) {
				Transaccion transacciondeshabilita=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transacciondeshabilita,Constantes.SMENSAJE_ESCOJA_OPCION);
				transacciondeshabilita.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transacciondeshabilitasForeignKey,transacciondeshabilita,true)) {

					this.transacciondeshabilitasForeignKey.add(0,transacciondeshabilita);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTransaccionHabilita()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTransaccionHabilita()) {
				Transaccion transaccionhabilita=new Transaccion();
				TransaccionConstantesFunciones.setTransaccionDescripcion(transaccionhabilita,Constantes.SMENSAJE_ESCOJA_OPCION);
				transaccionhabilita.setId(null);

				if(!TransaccionConstantesFunciones.ExisteEnLista(this.transaccionhabilitasForeignKey,transaccionhabilita,true)) {

					this.transaccionhabilitasForeignKey.add(0,transaccionhabilita);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyBodega()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionBodega()) {
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

	public void addItemDefectoCombosForeignKeyTipoFactura()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoFactura()) {
				TipoFactura tipofactura=new TipoFactura();
				TipoFacturaConstantesFunciones.setTipoFacturaDescripcion(tipofactura,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipofactura.setId(null);

				if(!TipoFacturaConstantesFunciones.ExisteEnLista(this.tipofacturasForeignKey,tipofactura,true)) {

					this.tipofacturasForeignKey.add(0,tipofactura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoAutoPago()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionTipoAutoPago()) {
				TipoAutoPago tipoautopago=new TipoAutoPago();
				TipoAutoPagoConstantesFunciones.setTipoAutoPagoDescripcion(tipoautopago,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoautopago.setId(null);

				if(!TipoAutoPagoConstantesFunciones.ExisteEnLista(this.tipoautopagosForeignKey,tipoautopago,true)) {

					this.tipoautopagosForeignKey.add(0,tipoautopago);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal()throws Exception {
		try {

			if(!this.parametrocarteraSessionBean.getisBusquedaDesdeForeignKeySesionCuentaContableCreditoFiscal()) {
				CuentaContable cuentacontablecreditofiscal=new CuentaContable();
				CuentaContableConstantesFunciones.setCuentaContableDescripcion(cuentacontablecreditofiscal,Constantes.SMENSAJE_ESCOJA_OPCION);
				cuentacontablecreditofiscal.setId(null);

				if(!CuentaContableConstantesFunciones.ExisteEnLista(this.cuentacontablecreditofiscalsForeignKey,cuentacontablecreditofiscal,true)) {

					this.cuentacontablecreditofiscalsForeignKey.add(0,cuentacontablecreditofiscal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyParametroCartera()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroCartera(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroCartera()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroCartera();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroCartera(ParametroCartera parametrocartera)throws Exception {	
		try {
			
			this.setActualTransaccionFacturaForeignKey(parametrocartera.getid_transaccion_factura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(parametrocartera.getid_empleado(),false,"Formulario");
			this.setActualTransaccionDeshabilitaForeignKey(parametrocartera.getid_transaccion_deshabilita(),false,"Formulario");
			this.setActualTransaccionHabilitaForeignKey(parametrocartera.getid_transaccion_habilita(),false,"Formulario");
			this.setActualBodegaForeignKey(parametrocartera.getid_bodega(),false,"Formulario");
			this.setActualTipoFacturaForeignKey(parametrocartera.getid_tipo_factura(),false,"Formulario");
			this.setActualTipoAutoPagoForeignKey(parametrocartera.getid_tipo_auto_pago(),false,"Formulario");
			this.setActualCuentaContableCreditoFiscalForeignKey(parametrocartera.getid_cuenta_contable_credito_fiscal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroCartera(ParametroCartera parametrocartera,String sTipoEvento)throws Exception {	
		try {
			
			

				if(parametrocartera.getCuentaContableCreditoFiscal()!=null && !sTipoEvento.equals("id_cuenta_contable_credito_fiscalParametroCartera")) { //sTipoEvento Evita Bucle Infinito

					this.cuentacontablecreditofiscalsForeignKey=new ArrayList<CuentaContable>();
					this.cuentacontablecreditofiscalsForeignKey.add(parametrocartera.getCuentaContableCreditoFiscal());

					this.addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal();
					this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroCartera()throws Exception {	
		try {
			
			this.setActualTransaccionFacturaForeignKey(this.parametrocarteraConstantesFunciones.getid_transaccion_factura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.parametrocarteraConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualTransaccionDeshabilitaForeignKey(this.parametrocarteraConstantesFunciones.getid_transaccion_deshabilita(),false,"Formulario");
			this.setActualTransaccionHabilitaForeignKey(this.parametrocarteraConstantesFunciones.getid_transaccion_habilita(),false,"Formulario");
			this.setActualBodegaForeignKey(this.parametrocarteraConstantesFunciones.getid_bodega(),false,"Formulario");
			this.setActualTipoFacturaForeignKey(this.parametrocarteraConstantesFunciones.getid_tipo_factura(),false,"Formulario");
			this.setActualTipoAutoPagoForeignKey(this.parametrocarteraConstantesFunciones.getid_tipo_auto_pago(),false,"Formulario");
			this.setActualCuentaContableCreditoFiscalForeignKey(this.parametrocarteraConstantesFunciones.getid_cuenta_contable_credito_fiscal(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroCartera()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroCartera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroCartera()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroCartera()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroCartera()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTransaccionFacturasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameTransaccionDeshabilitasForeignKey("Todos");
			this.cargarCombosFrameTransaccionHabilitasForeignKey("Todos");
			this.cargarCombosFrameBodegasForeignKey("Todos");
			this.cargarCombosFrameTipoFacturasForeignKey("Todos");
			this.cargarCombosFrameTipoAutoPagosForeignKey("Todos");
			this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroCartera(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionDeshabilitasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTransaccionHabilitasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameBodegasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoFacturasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoAutoPagosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroCartera()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public ParametroCarteraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroCarteraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroCarteraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametrocarteraSessionBean=new ParametroCarteraSessionBean(); 
		this.parametrocarteraConstantesFunciones=new ParametroCarteraConstantesFunciones(); 
		this.parametrocarteraBean=new ParametroCartera();//(this.parametrocarteraConstantesFunciones); 		
		this.parametrocarteraReturnGeneral=new ParametroCarteraParameterReturnGeneral(); 
		
		this.parametrocarteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrocarteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroCarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroCarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroCarteraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroCartera(true);
			
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
			
			this.parametrocarteraConstantesFunciones=new ParametroCarteraConstantesFunciones(); 
			this.parametrocarteraBean=new ParametroCartera();//this.parametrocarteraConstantesFunciones); 			
			this.parametrocarteraReturnGeneral=new ParametroCarteraParameterReturnGeneral(); 
		
			ParametroCarteraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Cartera Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.parametrocartera=new ParametroCartera();
			this.parametrocarteras = new ArrayList<ParametroCartera>();
			this.parametrocarterasAux = new ArrayList<ParametroCartera>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic=new ParametroCarteraLogic();
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			//this.parametrocarteraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametrocarteraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroCartera);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroCartera);	
					}
					
					if(this.jInternalFrameImportacionParametroCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroCartera);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroCartera!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroCartera);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroCartera!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroCartera);
				this.jInternalFrameDetalleFormParametroCartera.setVisible(false);
				this.jInternalFrameDetalleFormParametroCartera.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroCartera);
					this.jInternalFrameReporteDinamicoParametroCartera.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroCartera.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroCartera);
					this.jInternalFrameImportacionParametroCartera.setVisible(false);
					this.jInternalFrameImportacionParametroCartera.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroCartera!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroCartera);
					this.jInternalFrameOrderByParametroCartera.setVisible(false);
					this.jInternalFrameOrderByParametroCartera.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroCarteraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroCarteraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametrocarteraReturnGeneral=new ParametroCarteraParameterReturnGeneral();
			
			this.parametrocarteraParameterGeneral=new ParametroCarteraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametrocarteraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroCarteraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroCarteraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocarteraSessionBean.getEsGuardarRelacionado(),this.parametrocarteraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroCarteraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametrocarteraSessionBean.getEsGuardarRelacionado(),this.parametrocarteraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaDuplicarParametroCartera=true;
			this.isVisibilidadCeldaCopiarParametroCartera=true;
			this.isVisibilidadCeldaVerFormParametroCartera=true;
			this.isVisibilidadCeldaOrdenParametroCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=false;
			this.isVisibilidadCeldaGuardarParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			
			
			this.isVisibilidadFK_IdBodega=true;
			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoAutoPago=true;
			this.isVisibilidadFK_IdTipoFactura=true;
			this.isVisibilidadFK_IdTransaccionDeshabilita=true;
			this.isVisibilidadFK_IdTransaccionFactura=true;
			this.isVisibilidadFK_IdTransaccionHabilita=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroCartera();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroCartera(false);
			
			this.setPermisosUsuarioParametroCartera();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado() 
				|| (this.parametrocarteraSessionBean.getEsGuardarRelacionado() && this.parametrocarteraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroCarteraClasesRelacionadas();
			}
			
			if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroCarteraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroCartera();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroCartera();
			}
			
			if(!this.isPermisoBusquedaParametroCartera) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroCartera.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroCartera,this.isPermisoPaginacionMedioParametroCartera,this.isPermisoPaginacionTodoParametroCartera);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroCarteraConstantesFunciones.getTiposSeleccionarParametroCartera());
				
				this.tiposColumnasSelect=ParametroCarteraConstantesFunciones.getTiposSeleccionarParametroCartera(true);
				
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
			//if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroCartera();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroCartera(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroCartera(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroCartera() ;
			
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
			this.transaccionfacturaLogic=new TransaccionLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.transacciondeshabilitaLogic=new TransaccionLogic();
			this.transaccionhabilitaLogic=new TransaccionLogic();
			this.bodegaLogic=new BodegaLogic();
			this.tipofacturaLogic=new TipoFacturaLogic();
			this.tipoautopagoLogic=new TipoAutoPagoLogic();
			this.cuentacontablecreditofiscalLogic=new CuentaContableLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametrocarteraImplementable= (ParametroCarteraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroCarteraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametrocarteraImplementableHome= (ParametroCarteraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroCarteraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametrocarteras= new ArrayList<ParametroCartera>();
			this.parametrocarterasEliminados= new ArrayList<ParametroCartera>();
						
			this.isEsNuevoParametroCartera=false;
			this.esParaAccionDesdeFormularioParametroCartera=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idCuentaContableCreditoFiscalActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.transaccionfacturasForeignKey=new ArrayList<Transaccion>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.transacciondeshabilitasForeignKey=new ArrayList<Transaccion>() ;
			this.transaccionhabilitasForeignKey=new ArrayList<Transaccion>() ;
			this.bodegasForeignKey=new ArrayList<Bodega>() ;
			this.tipofacturasForeignKey=new ArrayList<TipoFactura>() ;
			this.tipoautopagosForeignKey=new ArrayList<TipoAutoPago>() ;
			this.cuentacontablecreditofiscalsForeignKey=new ArrayList<CuentaContable>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroCartera(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroCartera();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroCarteraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroCarteraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroCartera("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroCartera(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroCartera();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroCartera();
			}
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroCartera.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroCartera(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroCartera: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroCartera() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroCartera")) {
				iIndex=this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroCartera();	
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
	
	public void cargarCombosForeignKeyParametroCartera(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroCartera(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroCartera(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroCarteraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroCartera();
		
		this.cargarCombosFrameForeignKeyParametroCartera();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroCartera();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroCartera();
		}
	}
	
	

	public void cargarCombosForeignKeyTransaccionFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionFactura();
				this.cargarCombosFrameTransaccionFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionFactura(this.transaccionfacturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionDeshabilita(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionDeshabilitaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionDeshabilita();
				this.cargarCombosFrameTransaccionDeshabilitasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionDeshabilita(this.transacciondeshabilitasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTransaccionHabilita(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTransaccionHabilitaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTransaccionHabilita();
				this.cargarCombosFrameTransaccionHabilitasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTransaccionHabilita(this.transaccionhabilitasForeignKey);

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

	public void cargarCombosForeignKeyTipoFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoFactura();
				this.cargarCombosFrameTipoFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoFactura(this.tipofacturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoAutoPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoAutoPagoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoAutoPago();
				this.cargarCombosFrameTipoAutoPagosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoAutoPago(this.tipoautopagosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCuentaContableCreditoFiscal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCuentaContableCreditoFiscalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal();
				this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCuentaContableCreditoFiscal(this.cuentacontablecreditofiscalsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoParametroCarteraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			
			if(jTableDatosParametroCartera.getRowCount()>=1) {
				jTableDatosParametroCartera.removeRowSelectionInterval(0, jTableDatosParametroCartera.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroCartera=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroCartera(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroCartera(true);			
			//this.parametrocartera=new ParametroCartera();
			//this.parametrocartera.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroCartera(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroCartera() ;
			
			if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroCartera(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametrocartera);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);				
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroCartera: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroCarteraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroCartera.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroCartera.getSelectedRows().length;			
			}
			
			parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroCartera--;			
				//ParametroCartera parametrocarteraAux= new ParametroCartera();			
				//parametrocarteraAux.setId(this.iIdNuevoParametroCartera);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroCartera parametrocarteraOrigen=new ParametroCartera();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroCartera parametrocarteraOrigen : parametrocarterasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametrocarteraOrigen =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametrocarteraOrigen =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroCartera();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametrocartera.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroCartera(parametrocarteraOrigen,this.parametrocartera,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocarteraLogic.getParametroCarteras().add(this.parametrocarteraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocarteras.add(this.parametrocarteraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroCartera(false);
				
				this.jTableDatosParametroCartera.setRowSelectionInterval(this.getIndiceNuevoParametroCartera(), this.getIndiceNuevoParametroCartera());
				
				int iLastRow =  this.jTableDatosParametroCartera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroCartera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroCartera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroCartera(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();									
		
			ParametroCartera parametrocarteraOrigen=new ParametroCartera();
			ParametroCartera parametrocarteraDestino=new ParametroCartera();
				
			parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroCartera.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametrocarterasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroCartera.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraOrigen =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocarteraOrigen =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametrocarteraDestino =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametrocarteraDestino =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametrocarteraOrigen =parametrocarterasSeleccionados.get(0);
				parametrocarteraDestino =parametrocarterasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroCartera(parametrocarteraOrigen,parametrocarteraDestino,true,false);
				
				parametrocarteraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametrocarteraDestino,parametrocarteraLogic.getParametroCarteras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametrocarteraDestino,parametrocarteras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroCartera(false);
				
				//this.jTableDatosParametroCartera.setRowSelectionInterval(this.getIndiceNuevoParametroCartera(), this.getIndiceNuevoParametroCartera());
				
				int iLastRow =  this.jTableDatosParametroCartera.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroCartera.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroCartera.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroCartera(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroCartera.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroCartera.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroCartera.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroCartera.setVisible(!isVisible);
			this.jPanelPaginacionParametroCartera.setVisible(!isVisible);
			this.jPanelAccionesParametroCartera.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroCartera();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroCartera();
			
			this.abrirFrameOrderByParametroCartera();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroCartera();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroCartera(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroCartera);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroCartera.isMaximum()) {
					this.jInternalFrameDetalleFormParametroCartera.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroCartera.setSize(this.jInternalFrameDetalleFormParametroCartera.iWidthFormulario,this.jInternalFrameDetalleFormParametroCartera.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroCartera.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroCartera.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroCartera.isMaximum()) {
						this.jInternalFrameDetalleFormParametroCartera.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroCartera.jContentPaneDetalleParametroCartera.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroCartera.jContentPaneDetalleParametroCartera.getWidth(),ParametroCarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroCartera.jContentPaneDetalleParametroCartera.getWidth(),ParametroCarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroCartera.jContentPaneDetalleParametroCartera.getWidth(),ParametroCarteraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroCartera.setVisible(true);
	        this.jInternalFrameDetalleFormParametroCartera.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroCartera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroCartera==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCartera,false,this);
				} else {
					this.jInternalFrameOrderByParametroCartera=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroCartera,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroCartera);
				this.jInternalFrameOrderByParametroCartera.setVisible(false);
				this.jInternalFrameOrderByParametroCartera.setSelected(false);
				
				this.jInternalFrameOrderByParametroCartera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroCartera"));
				
				this.inicializarActualizarBindingTablaOrderByParametroCartera();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroCartera() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroCartera==null) {
				
				this.jInternalFrameImportacionParametroCartera=new ImportacionJInternalFrame(ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroCartera);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroCartera);
				this.jInternalFrameImportacionParametroCartera.setVisible(false);
				this.jInternalFrameImportacionParametroCartera.setSelected(false);


				this.jInternalFrameImportacionParametroCartera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroCartera"));
				this.jInternalFrameImportacionParametroCartera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroCartera"));
				this.jInternalFrameImportacionParametroCartera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroCartera"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroCartera() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroCartera==null) {
				this.jInternalFrameReporteDinamicoParametroCartera=new ReporteDinamicoJInternalFrame(ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroCartera);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroCartera);
				this.jInternalFrameReporteDinamicoParametroCartera.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroCartera.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroCartera"));
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroCartera"));
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroCartera"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroCartera();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroCartera() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroCartera);
			
	       	this.jInternalFrameDetalleFormParametroCartera.setVisible(false);
	        this.jInternalFrameDetalleFormParametroCartera.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroCartera.dispose();
			//this.jInternalFrameDetalleFormParametroCartera=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroCartera() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroCartera.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroCartera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroCartera.setVisible(true);
	        this.jInternalFrameImportacionParametroCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroCartera() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroCartera.setVisible(true);
	        this.jInternalFrameOrderByParametroCartera.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroCartera() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroCartera.setVisible(false);
	        this.jInternalFrameOrderByParametroCartera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroCartera() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroCartera.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroCartera.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroCartera() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroCartera.setVisible(false);
	        this.jInternalFrameImportacionParametroCartera.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeCuentaContableCreditoFiscal(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCuentaContable);
						CuentaContableBeanSwingJInternalFrame cuentacontableBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						cuentacontableBeanSwingJInternalFrame.setJInternalFrameParent(this);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.sTipoBusqueda="CuentaContableCreditoFiscal";
						}

						cuentacontableBeanSwingJInternalFrame.getTodosCuentaContableArbol();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setCuentaContables(cuentacontableBeanSwingJInternalFrame.cuentacontablesArbol);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.CargarTreeCuentaContable();
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setVisible(true);
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						cuentacontableBeanSwingJInternalFrame.jInternalFrameTreeCuentaContable.jInternalFrameParent=this;
						TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
						TitledBorder titledBorderCuentaContableCreditoFiscal=(TitledBorder)cuentacontableBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

						titledBorderCuentaContableCreditoFiscal.setTitle(titledBorderParametroCartera.getTitle() + " -> Cuenta Contable");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,cuentacontableBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(cuentacontableBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCuentaContableCreditoFiscal(CuentaContableBeanSwingJInternalFrame jInternalFrameTreeCuentaContable) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCuentaContable);
						jInternalFrameTreeCuentaContable.setVisible(false);
						jInternalFrameTreeCuentaContable.setSelected(false);
						//jInternalFrameTreeCuentaContable.dispose();
						//jInternalFrameTreeCuentaContable=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroCartera(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroCartera(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroCartera(true);
			//this.isEsNuevoParametroCartera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroCartera(false) ;
			
			if(parametrocarteraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroCartera(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroCartera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroCarteraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroCartera(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroCartera(true);
			//this.isEsNuevoParametroCartera=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametrocartera.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroCartera("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroCartera(false) ;
			
			if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroCartera(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroCartera(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("CuentaContableCreditoFiscal")) {
				if(!this.parametrocarteraConstantesFunciones.cargarid_cuenta_contable_credito_fiscalParametroCartera) {
					this.cargarCombosCuentaContableCreditoFiscalsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingParametroCartera(false,false);
					this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito_fiscal (id);

				this.recargarComboTablaCuentaContableCreditoFiscal(this.cuentacontablecreditofiscalsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTransaccionFactura(List<Transaccion> transaccionfacturasForeignKey)throws Exception{
		TableColumn tableColumnTransaccionFactura=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA));
		TableCellEditor tableCellEditorTransaccionFactura =tableColumnTransaccionFactura.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionFactura;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionfacturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionfacturasForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionDeshabilita(List<Transaccion> transacciondeshabilitasForeignKey)throws Exception{
		TableColumn tableColumnTransaccionDeshabilita=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA));
		TableCellEditor tableCellEditorTransaccionDeshabilita =tableColumnTransaccionDeshabilita.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionDeshabilita;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transacciondeshabilitasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transacciondeshabilitasForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTransaccionHabilita(List<Transaccion> transaccionhabilitasForeignKey)throws Exception{
		TableColumn tableColumnTransaccionHabilita=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA));
		TableCellEditor tableCellEditorTransaccionHabilita =tableColumnTransaccionHabilita.getCellEditor();

		TransaccionTableCell transaccionTableCellFk=(TransaccionTableCell)tableCellEditorTransaccionHabilita;

		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.settransaccionsForeignKey(transaccionhabilitasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//transaccionTableCellFk.setRowActual(intSelectedRow);
			//transaccionTableCellFk.settransaccionsForeignKeyActual(transaccionhabilitasForeignKey);
		//}


		if(transaccionTableCellFk!=null) {
			transaccionTableCellFk.RecargarTransaccionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaBodega(List<Bodega> bodegasForeignKey)throws Exception{
		TableColumn tableColumnBodega=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDBODEGA));
		TableCellEditor tableCellEditorBodega =tableColumnBodega.getCellEditor();

		BodegaTableCell bodegaTableCellFk=(BodegaTableCell)tableCellEditorBodega;

		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.setbodegasForeignKey(bodegasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//bodegaTableCellFk.setRowActual(intSelectedRow);
			//bodegaTableCellFk.setbodegasForeignKeyActual(bodegasForeignKey);
		//}


		if(bodegaTableCellFk!=null) {
			bodegaTableCellFk.RecargarBodegasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoFactura(List<TipoFactura> tipofacturasForeignKey)throws Exception{
		TableColumn tableColumnTipoFactura=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA));
		TableCellEditor tableCellEditorTipoFactura =tableColumnTipoFactura.getCellEditor();

		TipoFacturaTableCell tipofacturaTableCellFk=(TipoFacturaTableCell)tableCellEditorTipoFactura;

		if(tipofacturaTableCellFk!=null) {
			tipofacturaTableCellFk.settipofacturasForeignKey(tipofacturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipofacturaTableCellFk.setRowActual(intSelectedRow);
			//tipofacturaTableCellFk.settipofacturasForeignKeyActual(tipofacturasForeignKey);
		//}


		if(tipofacturaTableCellFk!=null) {
			tipofacturaTableCellFk.RecargarTipoFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoAutoPago(List<TipoAutoPago> tipoautopagosForeignKey)throws Exception{
		TableColumn tableColumnTipoAutoPago=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO));
		TableCellEditor tableCellEditorTipoAutoPago =tableColumnTipoAutoPago.getCellEditor();

		TipoAutoPagoTableCell tipoautopagoTableCellFk=(TipoAutoPagoTableCell)tableCellEditorTipoAutoPago;

		if(tipoautopagoTableCellFk!=null) {
			tipoautopagoTableCellFk.settipoautopagosForeignKey(tipoautopagosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoautopagoTableCellFk.setRowActual(intSelectedRow);
			//tipoautopagoTableCellFk.settipoautopagosForeignKeyActual(tipoautopagosForeignKey);
		//}


		if(tipoautopagoTableCellFk!=null) {
			tipoautopagoTableCellFk.RecargarTipoAutoPagosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCuentaContableCreditoFiscal(List<CuentaContable> cuentacontablecreditofiscalsForeignKey)throws Exception{
		TableColumn tableColumnCuentaContableCreditoFiscal=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL));
		TableCellEditor tableCellEditorCuentaContableCreditoFiscal =tableColumnCuentaContableCreditoFiscal.getCellEditor();

		CuentaContableTableCell cuentacontableTableCellFk=(CuentaContableTableCell)tableCellEditorCuentaContableCreditoFiscal;

		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.setcuentacontablesForeignKey(cuentacontablecreditofiscalsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cuentacontableTableCellFk.setRowActual(intSelectedRow);
			//cuentacontableTableCellFk.setcuentacontablesForeignKeyActual(cuentacontablecreditofiscalsForeignKey);
		//}


		if(cuentacontableTableCellFk!=null) {
			cuentacontableTableCellFk.RecargarCuentaContablesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cuenta_contable_credito_fiscal (Long id) throws Exception {
		this.setActualCuentaContableCreditoFiscalForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroCartera(false);
			
			//if(!this.isEsNuevoParametroCartera) {								
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				
			}
			
			if(this.permiteMantenimiento(this.parametrocartera)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroCartera=true;
					this.inicializarActualizarBindingTablaParametroCartera(false);
					this.isEsNuevoParametroCartera=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroCartera=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroCartera=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroCartera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroCartera(false);
				
				this.habilitarDeshabilitarControlesParametroCartera(false);
			
												
				
				if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroCartera();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroCarteraActionPerformed(evt,parametrocarteraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroCartera(this.parametrocartera,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametrocarteraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametrocartera.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				this.parametrocartera.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				this.parametrocartera.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametrocartera)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroCarteraModel) this.jTableDatosParametroCartera.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroCartera=true;
				this.inicializarActualizarBindingTablaParametroCartera(false);
				this.isEsNuevoParametroCartera=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroCartera(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroCartera(false);
				
				this.habilitarDeshabilitarControlesParametroCartera(false);
				
				
				
				if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroCartera();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroCarteraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroCartera.getRowCount()>=1) {
				jTableDatosParametroCartera.removeRowSelectionInterval(0, jTableDatosParametroCartera.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroCartera(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroCartera(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroCartera(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroCartera(false) ;
			
			this.isEsNuevoParametroCartera=false;
			
			if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroCartera();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroCartera(false);
				
				//SI ES MANUAL
				if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroCartera();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroCartera--;			
			//ParametroCartera parametrocarteraAux= new ParametroCartera();			
			//parametrocarteraAux.setId(this.iIdNuevoParametroCartera);
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroCartera();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
			
			this.parametrocartera.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametrocarteraLogic.getParametroCarteras().add(this.parametrocarteraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametrocarteras.add(this.parametrocarteraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroCartera(false);
			
			this.jTableDatosParametroCartera.setRowSelectionInterval(this.getIndiceNuevoParametroCartera(), this.getIndiceNuevoParametroCartera());
			
			int iLastRow =  this.jTableDatosParametroCartera.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroCartera.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroCartera.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroCartera(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroCartera(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroCartera(false);
			
			//SI ES MANUAL
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroCartera();
			}
			
			//this.abrirFrameTreeParametroCartera();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro CarteraS ?", "MANTENIMIENTO DE Parametro Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroCartera.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroCartera();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametrocarteraReturnGeneral=parametrocarteraLogic.procesarImportacionParametroCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametrocarteraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroCarteraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroCartera.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroCartera.setFileImportacion(this.jInternalFrameImportacionParametroCartera.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroCartera.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroCartera.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroCartera.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroCartera.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		

		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroCarteraBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDigitosFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDigitosFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDigitosFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDigitosFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_PORLOTES:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rLotes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rLotes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rLotes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rLotes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionDeshabilita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionDeshabilita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionDeshabilita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionDeshabilita_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TransaccionHabilita_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TransaccionHabilita_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TransaccionHabilita_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TransaccionHabilita_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDBODEGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Bodega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Bodega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Bodega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Bodega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoAutoPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoAutoPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoAutoPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoAutoPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroOrdenPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroOrdenPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroOrdenPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroOrdenPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CuentaContableCreditoFiscal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CuentaContableCreditoFiscal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CuentaContableCreditoFiscal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CuentaContableCreditoFiscal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoParametroCartera.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA:
					sNombreCampoCategoria="id_transaccion_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA:
					sNombreCampoCategoria="numero_digitos_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_PORLOTES:
					sNombreCampoCategoria="por_lotes";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA:
					sNombreCampoCategoria="id_transaccion_deshabilita";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA:
					sNombreCampoCategoria="id_transaccion_habilita";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoria="id_bodega";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA:
					sNombreCampoCategoria="id_tipo_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO:
					sNombreCampoCategoria="id_tipo_auto_pago";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO:
					sNombreCampoCategoria="numero_orden_pago";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL:
					sNombreCampoCategoria="id_cuenta_contable_credito_fiscal";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA:
					sNombreCampoCategoriaValor="id_transaccion_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA:
					sNombreCampoCategoriaValor="numero_digitos_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_PORLOTES:
					sNombreCampoCategoriaValor="por_lotes";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA:
					sNombreCampoCategoriaValor="id_transaccion_deshabilita";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA:
					sNombreCampoCategoriaValor="id_transaccion_habilita";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDBODEGA:
					sNombreCampoCategoriaValor="id_bodega";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA:
					sNombreCampoCategoriaValor="id_tipo_factura";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO:
					sNombreCampoCategoriaValor="id_tipo_auto_pago";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO:
					sNombreCampoCategoriaValor="numero_orden_pago";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL:
					sNombreCampoCategoriaValor="id_cuenta_contable_credito_fiscal";
					break;

				case ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_factura");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Digitos Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_digitos_factura");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_PORLOTES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Por Lotes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"por_lotes");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tesorero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Deshabilita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_deshabilita");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Transaccion Habilita",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_transaccion_habilita");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDBODEGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Bodega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_bodega");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_factura");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Auto Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_auto_pago");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"No Orden Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_orden_pago");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cuenta Contable Credito Fiscal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cuenta_contable_credito_fiscal");
					break;

				case ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroCarteraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroCarteras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.gettransaccionfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getnumero_digitos_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_PORLOTES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_PORLOTES);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getpor_lotes());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.gettransacciondeshabilita_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.gettransaccionhabilita_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDBODEGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getbodega_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.gettipofactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.gettipoautopago_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getnumero_orden_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getcuentacontablecreditofiscal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ParametroCartera parametrocartera:parametrocarterasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametrocartera.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroCartera(row);				
			//	iRow++;
			//}				
			
			//for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroCartera(parametrocarteraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroCartera(false);
			
			//SI ES MANUAL
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroCartera();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroCartera(false);
			
			//SI ES MANUAL
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroCartera();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroCarteraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroCartera(false);
			
			//SI ES MANUAL
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroCartera();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroCartera() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroCartera.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroCartera.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroCartera.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroCartera.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroCartera.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroCartera.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroCartera.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroCartera(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroCartera(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroCartera(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroCartera(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroCartera(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroCartera(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroCartera(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroCartera(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroCartera() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroCartera();
		
		this.inicializarActualizarBindingBotonesManualParametroCartera(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroCartera();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroCartera() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroCartera(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroCartera(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroCartera.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroCartera.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroCartera.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroCartera!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionNuevoParametroCartera.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionSinCerrarParametroCartera.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionSinMensajeParametroCartera.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroCartera.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroCartera.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroCartera.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroCartera!=null) {
				this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionNuevoParametroCartera.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionSinCerrarParametroCartera.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroCartera.jCheckBoxPostAccionSinMensajeParametroCartera.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroCartera.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroCartera.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroCartera.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroCartera.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroCartera.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroCartera.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroCartera.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroCartera.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroCartera.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroCartera(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroCartera(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroCartera() throws Exception {
		try	{
			if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroCartera();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroCartera() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroCartera() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroCartera.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroCartera.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroCartera.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroCartera.addItem(reporte);
			}
			
			
			if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroCartera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroCartera.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroCartera.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroCartera.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroCartera.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroCartera.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroCartera.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroCartera();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroCartera() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
				this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
				this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroCartera.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroCartera.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroCartera.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroCartera.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroCartera.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroCartera()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.getSelectedItem()!=null){this.id_bodegaFK_IdBodega=((Bodega)this.jComboBoxid_bodegaFK_IdBodegaParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.getSelectedItem()!=null){this.id_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal=((CuentaContable)this.jComboBoxid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscalParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.getSelectedItem()!=null){this.id_tipo_auto_pagoFK_IdTipoAutoPago=((TipoAutoPago)this.jComboBoxid_tipo_auto_pagoFK_IdTipoAutoPagoParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.getSelectedItem()!=null){this.id_tipo_facturaFK_IdTipoFactura=((TipoFactura)this.jComboBoxid_tipo_facturaFK_IdTipoFacturaParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.getSelectedItem()!=null){this.id_transaccion_deshabilitaFK_IdTransaccionDeshabilita=((Transaccion)this.jComboBoxid_transaccion_deshabilitaFK_IdTransaccionDeshabilitaParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.getSelectedItem()!=null){this.id_transaccion_facturaFK_IdTransaccionFactura=((Transaccion)this.jComboBoxid_transaccion_facturaFK_IdTransaccionFacturaParametroCartera.getSelectedItem()).getId();}
		if(this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.getSelectedItem()!=null){this.id_transaccion_habilitaFK_IdTransaccionHabilita=((Transaccion)this.jComboBoxid_transaccion_habilitaFK_IdTransaccionHabilitaParametroCartera.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroCartera(Boolean esInicializar) throws Exception {				
		if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroCartera();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroCartera() throws Exception {
		this.inicializarActualizarBindingTablaParametroCartera(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroCartera() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroCarteraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCarteraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroCartera(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametrocarteraLogic.getParametroCarteras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametrocarteras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroCartera.setModel(new ParametroCarteraModel(this.parametrocarteraLogic.getParametroCarteras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroCartera.setModel(new ParametroCarteraModel(this.parametrocarteras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroCartera!=null && this.jInternalFrameOrderByParametroCartera.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroCartera();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,parametrocarteraConstantesFunciones.resaltarSeleccionarParametroCartera,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroCarteraConstantesFunciones.SCLASSWEBTITULO,parametrocarteraConstantesFunciones.resaltarSeleccionarParametroCartera,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_ID));

		if(this.parametrocarteraConstantesFunciones.mostraridParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrocarteraConstantesFunciones.resaltaridParametroCartera,this.parametrocarteraConstantesFunciones.activaridParametroCartera,this,true,"idParametroCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocarteraConstantesFunciones.resaltaridParametroCartera,this.parametrocarteraConstantesFunciones.activaridParametroCartera,this,true,"idParametroCartera","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_empresaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_empresaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_empresaParametroCartera));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_empresaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_empresaParametroCartera,false,"id_empresaParametroCartera","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_facturaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionfacturasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_facturaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_facturaParametroCartera));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionfacturasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_facturaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_facturaParametroCartera,true,"id_transaccion_facturaParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA));

		if(this.parametrocarteraConstantesFunciones.mostrarnumero_digitos_facturaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametrocarteraConstantesFunciones.resaltarnumero_digitos_facturaParametroCartera,this.parametrocarteraConstantesFunciones.activarnumero_digitos_facturaParametroCartera,this,true,"numero_digitos_facturaParametroCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocarteraConstantesFunciones.resaltarnumero_digitos_facturaParametroCartera,this.parametrocarteraConstantesFunciones.activarnumero_digitos_facturaParametroCartera,this,true,"numero_digitos_facturaParametroCartera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_PORLOTES));

		if(this.parametrocarteraConstantesFunciones.mostrarpor_lotesParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_PORLOTES,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.parametrocarteraConstantesFunciones.resaltarpor_lotesParametroCartera,this.parametrocarteraConstantesFunciones.activarpor_lotesParametroCartera));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.parametrocarteraConstantesFunciones.resaltarpor_lotesParametroCartera,this.parametrocarteraConstantesFunciones.activarpor_lotesParametroCartera,this,true,"por_lotesParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.parametrocarteraConstantesFunciones.mostrarid_empleadoParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_empleadoParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_empleadoParametroCartera));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_empleadoParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_empleadoParametroCartera,true,"id_empleadoParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_deshabilitaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transacciondeshabilitasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_deshabilitaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_deshabilitaParametroCartera));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transacciondeshabilitasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_deshabilitaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_deshabilitaParametroCartera,true,"id_transaccion_deshabilitaParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_habilitaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TransaccionTableCell(this.transaccionhabilitasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_habilitaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_habilitaParametroCartera));
			tableColumn.setCellEditor(new TransaccionTableCell(this.transaccionhabilitasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_transaccion_habilitaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_transaccion_habilitaParametroCartera,true,"id_transaccion_habilitaParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDBODEGA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_bodegaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDBODEGA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new BodegaTableCell(this.bodegasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_bodegaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_bodegaParametroCartera));
			tableColumn.setCellEditor(new BodegaTableCell(this.bodegasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_bodegaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_bodegaParametroCartera,true,"id_bodegaParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA));

		if(this.parametrocarteraConstantesFunciones.mostrarid_tipo_facturaParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoFacturaTableCell(this.tipofacturasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_tipo_facturaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_tipo_facturaParametroCartera));
			tableColumn.setCellEditor(new TipoFacturaTableCell(this.tipofacturasForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_tipo_facturaParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_tipo_facturaParametroCartera,true,"id_tipo_facturaParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO));

		if(this.parametrocarteraConstantesFunciones.mostrarid_tipo_auto_pagoParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoAutoPagoTableCell(this.tipoautopagosForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_tipo_auto_pagoParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_tipo_auto_pagoParametroCartera));
			tableColumn.setCellEditor(new TipoAutoPagoTableCell(this.tipoautopagosForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_tipo_auto_pagoParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_tipo_auto_pagoParametroCartera,true,"id_tipo_auto_pagoParametroCartera","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO));

		if(this.parametrocarteraConstantesFunciones.mostrarnumero_orden_pagoParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrocarteraConstantesFunciones.resaltarnumero_orden_pagoParametroCartera,this.parametrocarteraConstantesFunciones.activarnumero_orden_pagoParametroCartera,this,true,"numero_orden_pagoParametroCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocarteraConstantesFunciones.resaltarnumero_orden_pagoParametroCartera,this.parametrocarteraConstantesFunciones.activarnumero_orden_pagoParametroCartera,this,true,"numero_orden_pagoParametroCartera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL));

		if(this.parametrocarteraConstantesFunciones.mostrarid_cuenta_contable_credito_fiscalParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CuentaContableTableCell(this.cuentacontablecreditofiscalsForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_cuenta_contable_credito_fiscalParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_cuenta_contable_credito_fiscalParametroCartera));
			tableColumn.setCellEditor(new CuentaContableTableCell(this.cuentacontablecreditofiscalsForeignKey,this.parametrocarteraConstantesFunciones.resaltarid_cuenta_contable_credito_fiscalParametroCartera,this,this.parametrocarteraConstantesFunciones.activarid_cuenta_contable_credito_fiscalParametroCartera,true,"id_cuenta_contable_credito_fiscalParametroCartera","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION));

		if(this.parametrocarteraConstantesFunciones.mostrardescripcionParametroCartera && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametrocarteraConstantesFunciones.resaltardescripcionParametroCartera,this.parametrocarteraConstantesFunciones.activardescripcionParametroCartera,this,true,"descripcionParametroCartera","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametrocarteraConstantesFunciones.resaltardescripcionParametroCartera,this.parametrocarteraConstantesFunciones.activardescripcionParametroCartera,this,true,"descripcionParametroCartera","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroCarteraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroCartera.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroCartera.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroCartera && this.isPermisoGuardarCambiosParametroCartera) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametrocarteraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroCartera.addColumn(tableColumn);
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
			
			this.jTableDatosParametroCartera.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroCartera && this.isPermisoGuardarCambiosParametroCartera) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroCartera && this.isPermisoGuardarCambiosParametroCartera) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroCartera.moveColumn(this.jTableDatosParametroCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroCartera.moveColumn(this.jTableDatosParametroCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroCartera.moveColumn(this.jTableDatosParametroCartera.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroCartera.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroCartera.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroCartera,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroCartera.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroCartera.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroCartera.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroCartera.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroCartera.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametrocarteraLogic.getParametroCarteras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametrocarteras.size()-1;
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
		//this.jTableDatosParametroCartera.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroCartera.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroCartera();
			
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
				
				//this.isEsNuevoParametroCartera=false;
					
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
				if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroCartera==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroCartera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametrocartera.getsType().equals("DUPLICADO")
				   || this.parametrocartera.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroCartera=true;
				
				} else {
					this.isEsNuevoParametroCartera=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					if(this.parametrocartera.getId()>=0 && !this.parametrocartera.getIsNew()) {						
						this.isEsNuevoParametroCartera=false;
						
					} else {
						this.isEsNuevoParametroCartera=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroCartera(esRelaciones);						
				
				this.seleccionarParametroCartera(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametrocartera.getId()<0) {
					this.isEsNuevoParametroCartera=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroCartera(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroCartera(evt,rowIndex);
				}	
				
				if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroCartera: " + this.dDif); 
					}
				}								
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroCartera(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametrocartera)) {
					if(this.parametrocartera.getId()>0) {
						this.parametrocartera.setIsDeleted(true);
						
						this.parametrocarterasEliminados.add(this.parametrocartera);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametrocarteraLogic.getParametroCarteras().remove(this.parametrocartera);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametrocarteras.remove(this.parametrocartera);				
					}
					
					
					((ParametroCarteraModel) this.jTableDatosParametroCartera.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroCartera(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroCartera(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroCartera) {
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroCartera.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroCartera.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroCartera(this.parametrocartera);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametrocarteraConstantesFunciones.cargarid_empresaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_empresaParametroCartera) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametrocartera.getid_empresa());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametrocartera.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametrocartera.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametrocartera.getid_empresa(),false,"Formulario");

					//TransaccionFactura
					if(!this.parametrocarteraConstantesFunciones.cargarid_transaccion_facturaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_transaccion_facturaParametroCartera) {
						//this.cargarCombosTransaccionFacturasForeignKeyLista(" where id="+this.parametrocartera.getid_transaccion_factura());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.transaccionfacturasForeignKey=new ArrayList<Transaccion>();

						if(parametrocartera.getTransaccionFactura()!=null) {
							this.transaccionfacturasForeignKey.add(parametrocartera.getTransaccionFactura());
						}

						this.addItemDefectoCombosForeignKeyTransaccionFactura();
						this.cargarCombosFrameTransaccionFacturasForeignKey("Todos");
					}
					this.setActualTransaccionFacturaForeignKey(this.parametrocartera.getid_transaccion_factura(),false,"Formulario");

					//Empleado
					if(!this.parametrocarteraConstantesFunciones.cargarid_empleadoParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_empleadoParametroCartera) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.parametrocartera.getid_empleado());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(parametrocartera.getEmpleado()!=null) {
							this.empleadosForeignKey.add(parametrocartera.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.parametrocartera.getid_empleado(),false,"Formulario");

					//TransaccionDeshabilita
					if(!this.parametrocarteraConstantesFunciones.cargarid_transaccion_deshabilitaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_transaccion_deshabilitaParametroCartera) {
						//this.cargarCombosTransaccionDeshabilitasForeignKeyLista(" where id="+this.parametrocartera.getid_transaccion_deshabilita());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.transacciondeshabilitasForeignKey=new ArrayList<Transaccion>();

						if(parametrocartera.getTransaccionDeshabilita()!=null) {
							this.transacciondeshabilitasForeignKey.add(parametrocartera.getTransaccionDeshabilita());
						}

						this.addItemDefectoCombosForeignKeyTransaccionDeshabilita();
						this.cargarCombosFrameTransaccionDeshabilitasForeignKey("Todos");
					}
					this.setActualTransaccionDeshabilitaForeignKey(this.parametrocartera.getid_transaccion_deshabilita(),false,"Formulario");

					//TransaccionHabilita
					if(!this.parametrocarteraConstantesFunciones.cargarid_transaccion_habilitaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_transaccion_habilitaParametroCartera) {
						//this.cargarCombosTransaccionHabilitasForeignKeyLista(" where id="+this.parametrocartera.getid_transaccion_habilita());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.transaccionhabilitasForeignKey=new ArrayList<Transaccion>();

						if(parametrocartera.getTransaccionHabilita()!=null) {
							this.transaccionhabilitasForeignKey.add(parametrocartera.getTransaccionHabilita());
						}

						this.addItemDefectoCombosForeignKeyTransaccionHabilita();
						this.cargarCombosFrameTransaccionHabilitasForeignKey("Todos");
					}
					this.setActualTransaccionHabilitaForeignKey(this.parametrocartera.getid_transaccion_habilita(),false,"Formulario");

					//Bodega
					if(!this.parametrocarteraConstantesFunciones.cargarid_bodegaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_bodegaParametroCartera) {
						//this.cargarCombosBodegasForeignKeyLista(" where id="+this.parametrocartera.getid_bodega());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.bodegasForeignKey=new ArrayList<Bodega>();

						if(parametrocartera.getBodega()!=null) {
							this.bodegasForeignKey.add(parametrocartera.getBodega());
						}

						this.addItemDefectoCombosForeignKeyBodega();
						this.cargarCombosFrameBodegasForeignKey("Todos");
					}
					this.setActualBodegaForeignKey(this.parametrocartera.getid_bodega(),false,"Formulario");

					//TipoFactura
					if(!this.parametrocarteraConstantesFunciones.cargarid_tipo_facturaParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_tipo_facturaParametroCartera) {
						//this.cargarCombosTipoFacturasForeignKeyLista(" where id="+this.parametrocartera.getid_tipo_factura());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.tipofacturasForeignKey=new ArrayList<TipoFactura>();

						if(parametrocartera.getTipoFactura()!=null) {
							this.tipofacturasForeignKey.add(parametrocartera.getTipoFactura());
						}

						this.addItemDefectoCombosForeignKeyTipoFactura();
						this.cargarCombosFrameTipoFacturasForeignKey("Todos");
					}
					this.setActualTipoFacturaForeignKey(this.parametrocartera.getid_tipo_factura(),false,"Formulario");

					//TipoAutoPago
					if(!this.parametrocarteraConstantesFunciones.cargarid_tipo_auto_pagoParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_tipo_auto_pagoParametroCartera) {
						//this.cargarCombosTipoAutoPagosForeignKeyLista(" where id="+this.parametrocartera.getid_tipo_auto_pago());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.tipoautopagosForeignKey=new ArrayList<TipoAutoPago>();

						if(parametrocartera.getTipoAutoPago()!=null) {
							this.tipoautopagosForeignKey.add(parametrocartera.getTipoAutoPago());
						}

						this.addItemDefectoCombosForeignKeyTipoAutoPago();
						this.cargarCombosFrameTipoAutoPagosForeignKey("Todos");
					}
					this.setActualTipoAutoPagoForeignKey(this.parametrocartera.getid_tipo_auto_pago(),false,"Formulario");

					//CuentaContableCreditoFiscal
					if(!this.parametrocarteraConstantesFunciones.cargarid_cuenta_contable_credito_fiscalParametroCartera || this.parametrocarteraConstantesFunciones.event_dependid_cuenta_contable_credito_fiscalParametroCartera) {
						//this.cargarCombosCuentaContableCreditoFiscalsForeignKeyLista(" where id="+this.parametrocartera.getid_cuenta_contable_credito_fiscal());
									//this.inicializarActualizarBindingParametroCartera(false,false);
						this.cuentacontablecreditofiscalsForeignKey=new ArrayList<CuentaContable>();

						if(parametrocartera.getCuentaContableCreditoFiscal()!=null) {
							this.cuentacontablecreditofiscalsForeignKey.add(parametrocartera.getCuentaContableCreditoFiscal());
						}

						this.addItemDefectoCombosForeignKeyCuentaContableCreditoFiscal();
						this.cargarCombosFrameCuentaContableCreditoFiscalsForeignKey("Todos");
					}
					this.setActualCuentaContableCreditoFiscalForeignKey(this.parametrocartera.getid_cuenta_contable_credito_fiscal(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroCartera("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroCartera(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroCartera() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroCartera(ParametroCartera parametrocartera) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroCartera(parametrocartera,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroCartera(ParametroCartera parametrocartera,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroCartera(parametrocartera);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroCartera(parametrocartera,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroCartera(parametrocartera);
	}
	
	public void setVariablesObjetoActualToFormularioParametroCartera(ParametroCartera parametrocartera) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setText(parametrocartera.getId().toString());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setText(parametrocartera.getnumero_digitos_factura().toString());
			this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setSelected(parametrocartera.getpor_lotes());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setText(parametrocartera.getnumero_orden_pago());
			this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setText(parametrocartera.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroCartera parametrocarteraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametrocarteraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroCartera parametrocarteraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametrocarteraLocal=this.parametrocartera;
			} else {
				parametrocarteraLocal=this.parametrocarteraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametrocarteraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroCartera(parametrocarteraLocal,true);
					
					if(parametrocarteraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametrocarteraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametrocarteraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroCartera(ParametroCartera parametrocartera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroCartera(parametrocartera,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(parametrocartera);
	}
	
	public void setVariablesFormularioToObjetoActualParametroCartera(ParametroCartera parametrocartera,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroCartera(parametrocartera,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroCartera(ParametroCartera parametrocartera,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.getText()==null || this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.getText()=="" || this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setText("0");
			}

			if(conColumnasBase) {parametrocartera.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroCarteraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelIdParametroCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrocartera.setnumero_digitos_factura(Integer.parseInt(this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_digitos_facturaParametroCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrocartera.setpor_lotes(this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroCarteraConstantesFunciones.LABEL_PORLOTES+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelpor_lotesParametroCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrocartera.setnumero_orden_pago(this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabelnumero_orden_pagoParametroCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametrocartera.setdescripcion(this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroCartera.jLabeldescripcionParametroCartera,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroCartera(ParametroCartera parametrocarteraBean,ParametroCartera parametrocartera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && parametrocarteraBean.getid_transaccion_factura()!=null && !parametrocarteraBean.getid_transaccion_factura().equals(-1L))) {parametrocartera.setid_transaccion_factura(parametrocarteraBean.getid_transaccion_factura());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_empleado()!=null && !parametrocarteraBean.getid_empleado().equals(-1L))) {parametrocartera.setid_empleado(parametrocarteraBean.getid_empleado());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_transaccion_deshabilita()!=null && !parametrocarteraBean.getid_transaccion_deshabilita().equals(-1L))) {parametrocartera.setid_transaccion_deshabilita(parametrocarteraBean.getid_transaccion_deshabilita());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_transaccion_habilita()!=null && !parametrocarteraBean.getid_transaccion_habilita().equals(-1L))) {parametrocartera.setid_transaccion_habilita(parametrocarteraBean.getid_transaccion_habilita());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_bodega()!=null && !parametrocarteraBean.getid_bodega().equals(-1L))) {parametrocartera.setid_bodega(parametrocarteraBean.getid_bodega());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_tipo_factura()!=null && !parametrocarteraBean.getid_tipo_factura().equals(-1L))) {parametrocartera.setid_tipo_factura(parametrocarteraBean.getid_tipo_factura());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_tipo_auto_pago()!=null && !parametrocarteraBean.getid_tipo_auto_pago().equals(-1L))) {parametrocartera.setid_tipo_auto_pago(parametrocarteraBean.getid_tipo_auto_pago());}
			if(conDefault || (!conDefault && parametrocarteraBean.getid_cuenta_contable_credito_fiscal()!=null && !parametrocarteraBean.getid_cuenta_contable_credito_fiscal().equals(null))) {parametrocartera.setid_cuenta_contable_credito_fiscal(parametrocarteraBean.getid_cuenta_contable_credito_fiscal());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroCartera(ParametroCartera parametrocarteraOrigen,ParametroCartera parametrocartera,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocarteraOrigen.getId()!=null && !parametrocarteraOrigen.getId().equals(0L))) {parametrocartera.setId(parametrocarteraOrigen.getId());}}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_transaccion_factura()!=null && !parametrocarteraOrigen.getid_transaccion_factura().equals(-1L))) {parametrocartera.setid_transaccion_factura(parametrocarteraOrigen.getid_transaccion_factura());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getnumero_digitos_factura()!=null && !parametrocarteraOrigen.getnumero_digitos_factura().equals(0))) {parametrocartera.setnumero_digitos_factura(parametrocarteraOrigen.getnumero_digitos_factura());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getpor_lotes()!=null && !parametrocarteraOrigen.getpor_lotes().equals(false))) {parametrocartera.setpor_lotes(parametrocarteraOrigen.getpor_lotes());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_empleado()!=null && !parametrocarteraOrigen.getid_empleado().equals(-1L))) {parametrocartera.setid_empleado(parametrocarteraOrigen.getid_empleado());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_transaccion_deshabilita()!=null && !parametrocarteraOrigen.getid_transaccion_deshabilita().equals(-1L))) {parametrocartera.setid_transaccion_deshabilita(parametrocarteraOrigen.getid_transaccion_deshabilita());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_transaccion_habilita()!=null && !parametrocarteraOrigen.getid_transaccion_habilita().equals(-1L))) {parametrocartera.setid_transaccion_habilita(parametrocarteraOrigen.getid_transaccion_habilita());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_bodega()!=null && !parametrocarteraOrigen.getid_bodega().equals(-1L))) {parametrocartera.setid_bodega(parametrocarteraOrigen.getid_bodega());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_tipo_factura()!=null && !parametrocarteraOrigen.getid_tipo_factura().equals(-1L))) {parametrocartera.setid_tipo_factura(parametrocarteraOrigen.getid_tipo_factura());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_tipo_auto_pago()!=null && !parametrocarteraOrigen.getid_tipo_auto_pago().equals(-1L))) {parametrocartera.setid_tipo_auto_pago(parametrocarteraOrigen.getid_tipo_auto_pago());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getnumero_orden_pago()!=null && !parametrocarteraOrigen.getnumero_orden_pago().equals(""))) {parametrocartera.setnumero_orden_pago(parametrocarteraOrigen.getnumero_orden_pago());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getid_cuenta_contable_credito_fiscal()!=null && !parametrocarteraOrigen.getid_cuenta_contable_credito_fiscal().equals(null))) {parametrocartera.setid_cuenta_contable_credito_fiscal(parametrocarteraOrigen.getid_cuenta_contable_credito_fiscal());}
			if(conDefault || (!conDefault && parametrocarteraOrigen.getdescripcion()!=null && !parametrocarteraOrigen.getdescripcion().equals(""))) {parametrocartera.setdescripcion(parametrocarteraOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroCartera(ParametroCartera parametrocartera) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setText(parametrocartera.getId().toString());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setText(parametrocartera.getnumero_digitos_factura().toString());
			this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setSelected(parametrocartera.getpor_lotes());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setText(parametrocartera.getnumero_orden_pago());
			this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setText(parametrocartera.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroCartera(ParametroCarteraBean parametrocarteraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setText(parametrocarteraBean.getId().toString());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setText(parametrocarteraBean.getnumero_digitos_factura().toString());
			this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setSelected(parametrocarteraBean.getpor_lotes());
			this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setText(parametrocarteraBean.getnumero_orden_pago());
			this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setText(parametrocarteraBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroCartera(ParametroCarteraParameterReturnGeneral parametrocarteraReturnGeneral,ParametroCarteraBean parametrocarteraBean,Boolean conDefault) throws Exception { 
		try {
			ParametroCartera parametrocarteraLocal=new ParametroCartera();
			
			parametrocarteraLocal=parametrocarteraReturnGeneral.getParametroCartera();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametrocarteraLocal.getId()!=null && !parametrocarteraLocal.getId().equals(0L))) {parametrocarteraBean.setId(parametrocarteraLocal.getId());}}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_transaccion_factura()!=null && !parametrocarteraLocal.getid_transaccion_factura().equals(-1L))) {parametrocarteraBean.setid_transaccion_factura(parametrocarteraLocal.getid_transaccion_factura());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getnumero_digitos_factura()!=null && !parametrocarteraLocal.getnumero_digitos_factura().equals(0))) {parametrocarteraBean.setnumero_digitos_factura(parametrocarteraLocal.getnumero_digitos_factura());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getpor_lotes()!=null && !parametrocarteraLocal.getpor_lotes().equals(false))) {parametrocarteraBean.setpor_lotes(parametrocarteraLocal.getpor_lotes());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_empleado()!=null && !parametrocarteraLocal.getid_empleado().equals(-1L))) {parametrocarteraBean.setid_empleado(parametrocarteraLocal.getid_empleado());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_transaccion_deshabilita()!=null && !parametrocarteraLocal.getid_transaccion_deshabilita().equals(-1L))) {parametrocarteraBean.setid_transaccion_deshabilita(parametrocarteraLocal.getid_transaccion_deshabilita());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_transaccion_habilita()!=null && !parametrocarteraLocal.getid_transaccion_habilita().equals(-1L))) {parametrocarteraBean.setid_transaccion_habilita(parametrocarteraLocal.getid_transaccion_habilita());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_bodega()!=null && !parametrocarteraLocal.getid_bodega().equals(-1L))) {parametrocarteraBean.setid_bodega(parametrocarteraLocal.getid_bodega());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_tipo_factura()!=null && !parametrocarteraLocal.getid_tipo_factura().equals(-1L))) {parametrocarteraBean.setid_tipo_factura(parametrocarteraLocal.getid_tipo_factura());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_tipo_auto_pago()!=null && !parametrocarteraLocal.getid_tipo_auto_pago().equals(-1L))) {parametrocarteraBean.setid_tipo_auto_pago(parametrocarteraLocal.getid_tipo_auto_pago());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getnumero_orden_pago()!=null && !parametrocarteraLocal.getnumero_orden_pago().equals(""))) {parametrocarteraBean.setnumero_orden_pago(parametrocarteraLocal.getnumero_orden_pago());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getid_cuenta_contable_credito_fiscal()!=null && !parametrocarteraLocal.getid_cuenta_contable_credito_fiscal().equals(null))) {parametrocarteraBean.setid_cuenta_contable_credito_fiscal(parametrocarteraLocal.getid_cuenta_contable_credito_fiscal());}
			if(conDefault || (!conDefault && parametrocarteraLocal.getdescripcion()!=null && !parametrocarteraLocal.getdescripcion().equals(""))) {parametrocarteraBean.setdescripcion(parametrocarteraLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroCarteraGenerico(Long idParametroCarteraSeleccionado,JComboBox jComboBoxParametroCartera,List<ParametroCartera> parametrocarterasLocal)throws Exception {
		try {
			ParametroCartera  parametrocarteraTemp=null;

			for(ParametroCartera parametrocarteraAux:parametrocarterasLocal) {
				if(parametrocarteraAux.getId()!=null && parametrocarteraAux.getId().equals(idParametroCarteraSeleccionado)) {
					parametrocarteraTemp=parametrocarteraAux;
					break;
				}
			}

			jComboBoxParametroCartera.setSelectedItem(parametrocarteraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroCarteraGenerico(JComboBox jComboBoxParametroCartera,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroCartera.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroCartera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroCartera.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroCartera.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroCartera.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroCartera.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocartera=(ParametroCartera) parametrocarteraLogic.getParametroCarteras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocartera =(ParametroCartera) parametrocarteras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TransaccionFactura")) {
			//sDescripcion=this.getActualTransaccionFacturaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.gettransaccionfactura_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.gettransaccionfactura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.getempleado_descripcion();
			}
		}

		if(sTipo.equals("TransaccionDeshabilita")) {
			//sDescripcion=this.getActualTransaccionDeshabilitaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.gettransacciondeshabilita_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionDeshabilitaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.gettransacciondeshabilita_descripcion();
			}
		}

		if(sTipo.equals("TransaccionHabilita")) {
			//sDescripcion=this.getActualTransaccionHabilitaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.gettransaccionhabilita_descripcion();
			} else {
				//sDescripcion=this.getActualTransaccionHabilitaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.gettransaccionhabilita_descripcion();
			}
		}

		if(sTipo.equals("Bodega")) {
			//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.getbodega_descripcion();
			} else {
				//sDescripcion=this.getActualBodegaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.getbodega_descripcion();
			}
		}

		if(sTipo.equals("TipoFactura")) {
			//sDescripcion=this.getActualTipoFacturaForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.gettipofactura_descripcion();
			} else {
				//sDescripcion=this.getActualTipoFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.gettipofactura_descripcion();
			}
		}

		if(sTipo.equals("TipoAutoPago")) {
			//sDescripcion=this.getActualTipoAutoPagoForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.gettipoautopago_descripcion();
			} else {
				//sDescripcion=this.getActualTipoAutoPagoForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.gettipoautopago_descripcion();
			}
		}

		if(sTipo.equals("CuentaContableCreditoFiscal")) {
			//sDescripcion=this.getActualCuentaContableCreditoFiscalForeignKeyDescripcion((Long)value);
			if(!parametrocartera.getIsNew() && !parametrocartera.getIsChanged() && !parametrocartera.getIsDeleted()) {
				sDescripcion=parametrocartera.getcuentacontablecreditofiscal_descripcion();
			} else {
				//sDescripcion=this.getActualCuentaContableCreditoFiscalForeignKeyDescripcion((Long)value);
				sDescripcion=parametrocartera.getcuentacontablecreditofiscal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroCartera parametrocarteraRow=new ParametroCartera();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocarteraRow=(ParametroCartera) parametrocarteraLogic.getParametroCarteras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametrocarteraRow=(ParametroCartera) parametrocarteras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroCartera(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera));			
			this.jButtonDuplicarParametroCartera.setVisible((this.isVisibilidadCeldaDuplicarParametroCartera && this.isPermisoDuplicarParametroCartera));			
			this.jButtonCopiarParametroCartera.setVisible((this.isVisibilidadCeldaCopiarParametroCartera && this.isPermisoCopiarParametroCartera));
			this.jButtonVerFormParametroCartera.setVisible((this.isVisibilidadCeldaVerFormParametroCartera && this.isPermisoVerFormParametroCartera));
			
			this.jButtonAbrirOrderByParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));			
			
			this.jButtonNuevoRelacionesParametroCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroCartera && this.isPermisoNuevoParametroCartera));			
			this.jButtonNuevoGuardarCambiosParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera && this.isPermisoGuardarCambiosParametroCartera));
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonModificarParametroCartera.setVisible((this.isVisibilidadCeldaModificarParametroCartera && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.setVisible((this.isVisibilidadCeldaActualizarParametroCartera && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.setVisible((this.isVisibilidadCeldaEliminarParametroCartera && this.isPermisoEliminarParametroCartera));
			this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.setVisible(this.isVisibilidadCeldaCancelarParametroCartera);							
			this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.setVisible((this.isVisibilidadCeldaGuardarParametroCartera && this.isPermisoGuardarCambiosParametroCartera));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroCartera && this.isPermisoGuardarCambiosParametroCartera));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera));						
			this.jButtonDuplicarToolBarParametroCartera.setVisible((this.isVisibilidadCeldaDuplicarParametroCartera && this.isPermisoDuplicarParametroCartera));						
			this.jButtonCopiarToolBarParametroCartera.setVisible((this.isVisibilidadCeldaCopiarParametroCartera && this.isPermisoCopiarParametroCartera));			
			this.jButtonVerFormToolBarParametroCartera.setVisible((this.isVisibilidadCeldaVerFormParametroCartera && this.isPermisoVerFormParametroCartera));			
			this.jButtonAbrirOrderByToolBarParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));
			this.jButtonNuevoRelacionesToolBarParametroCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroCartera && this.isPermisoNuevoParametroCartera));			
			this.jButtonNuevoGuardarCambiosToolBarParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera && this.isPermisoGuardarCambiosParametroCartera));			
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonModificarToolBarParametroCartera.setVisible((this.isVisibilidadCeldaModificarParametroCartera && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarToolBarParametroCartera.setVisible((this.isVisibilidadCeldaActualizarParametroCartera  && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarToolBarParametroCartera.setVisible((this.isVisibilidadCeldaEliminarParametroCartera && this.isPermisoEliminarParametroCartera));
			this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarToolBarParametroCartera.setVisible(this.isVisibilidadCeldaCancelarParametroCartera);				
			this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosToolBarParametroCartera.setVisible((this.isVisibilidadCeldaGuardarParametroCartera && this.isPermisoGuardarCambiosParametroCartera));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroCartera && this.isPermisoGuardarCambiosParametroCartera));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera));			
			this.jMenuItemDuplicarParametroCartera.setVisible((this.isVisibilidadCeldaDuplicarParametroCartera && this.isPermisoDuplicarParametroCartera));			
			this.jMenuItemCopiarParametroCartera.setVisible((this.isVisibilidadCeldaCopiarParametroCartera && this.isPermisoCopiarParametroCartera));			
			this.jMenuItemVerFormParametroCartera.setVisible((this.isVisibilidadCeldaVerFormParametroCartera && this.isPermisoVerFormParametroCartera));			
			this.jMenuItemAbrirOrderByParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));			
			//this.jMenuItemMostrarOcultarParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));
			this.jMenuItemDetalleAbrirOrderByParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));			
			//this.jMenuItemDetalleMostrarOcultarParametroCartera.setVisible((this.isVisibilidadCeldaOrdenParametroCartera && this.isPermisoOrdenParametroCartera));			
			this.jMenuItemNuevoRelacionesParametroCartera.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroCartera && this.isPermisoNuevoParametroCartera));			
			this.jMenuItemNuevoGuardarCambiosParametroCartera.setVisible((this.isVisibilidadCeldaNuevoParametroCartera && this.isPermisoNuevoParametroCartera && this.isPermisoGuardarCambiosParametroCartera));									
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemModificarParametroCartera.setVisible((this.isVisibilidadCeldaModificarParametroCartera && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemActualizarParametroCartera.setVisible((this.isVisibilidadCeldaActualizarParametroCartera && this.isPermisoActualizarParametroCartera));	
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemEliminarParametroCartera.setVisible((this.isVisibilidadCeldaEliminarParametroCartera && this.isPermisoEliminarParametroCartera));
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemCancelarParametroCartera.setVisible(this.isVisibilidadCeldaCancelarParametroCartera);				
			}
			
			this.jMenuItemGuardarCambiosParametroCartera.setVisible((this.isVisibilidadCeldaGuardarParametroCartera && this.isPermisoGuardarCambiosParametroCartera));						
			this.jMenuItemGuardarCambiosTablaParametroCartera.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroCartera && this.isPermisoGuardarCambiosParametroCartera));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroCartera=this.jButtonNuevoParametroCartera.isVisible();
			this.isVisibilidadCeldaDuplicarParametroCartera=this.jButtonDuplicarParametroCartera.isVisible();
			this.isVisibilidadCeldaCopiarParametroCartera=this.jButtonCopiarParametroCartera.isVisible();
			this.isVisibilidadCeldaVerFormParametroCartera=this.jButtonVerFormParametroCartera.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroCartera=this.jButtonAbrirOrderByParametroCartera.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=this.jButtonNuevoRelacionesParametroCartera.isVisible();
			this.isVisibilidadCeldaModificarParametroCartera=this.jButtonModificarParametroCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.isVisibilidadCeldaActualizarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.isVisible();
			this.isVisibilidadCeldaEliminarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.isVisible();
			this.isVisibilidadCeldaCancelarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.isVisible();
			this.isVisibilidadCeldaGuardarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=this.jButtonGuardarCambiosTablaParametroCartera.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroCartera=this.jButtonNuevoToolBarParametroCartera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=this.jButtonNuevoRelacionesToolBarParametroCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.isVisibilidadCeldaModificarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonModificarToolBarParametroCartera.isVisible();
			this.isVisibilidadCeldaActualizarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarToolBarParametroCartera.isVisible();
			this.isVisibilidadCeldaEliminarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarToolBarParametroCartera.isVisible();
			this.isVisibilidadCeldaCancelarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarToolBarParametroCartera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroCartera=this.jButtonGuardarCambiosToolBarParametroCartera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=this.jButtonGuardarCambiosTablaToolBarParametroCartera.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroCartera=this.jMenuItemNuevoParametroCartera.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=this.jMenuItemNuevoRelacionesParametroCartera.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.isVisibilidadCeldaModificarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jMenuItemModificarParametroCartera.isVisible();
			this.isVisibilidadCeldaActualizarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jMenuItemActualizarParametroCartera.isVisible();
			this.isVisibilidadCeldaEliminarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jMenuItemEliminarParametroCartera.isVisible();
			this.isVisibilidadCeldaCancelarParametroCartera=this.jInternalFrameDetalleFormParametroCartera.jMenuItemCancelarParametroCartera.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroCartera=this.jMenuItemGuardarCambiosParametroCartera.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=this.jMenuItemGuardarCambiosTablaParametroCartera.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroCartera(Boolean esInicializar) {
		if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
				//if(this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroCartera();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroCartera(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroCartera() {
		this.jButtonNuevoParametroCartera.setVisible(this.isPermisoNuevoParametroCartera);			
		this.jButtonDuplicarParametroCartera.setVisible(this.isPermisoDuplicarParametroCartera);			
		this.jButtonCopiarParametroCartera.setVisible(this.isPermisoCopiarParametroCartera);			
		this.jButtonVerFormParametroCartera.setVisible(this.isPermisoVerFormParametroCartera);			
		
		this.jButtonAbrirOrderByParametroCartera.setVisible(this.isPermisoOrdenParametroCartera);					
		
		this.jButtonNuevoRelacionesParametroCartera.setVisible(this.isPermisoNuevoParametroCartera);			
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonModificarParametroCartera.setVisible(this.isPermisoActualizarParametroCartera);	
			this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.setVisible(this.isPermisoActualizarParametroCartera);	
			this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.setVisible(this.isPermisoEliminarParametroCartera);
			this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.setVisible(this.isVisibilidadCeldaCancelarParametroCartera);						
			this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.setVisible(this.isPermisoGuardarCambiosParametroCartera);							
		}
		
		this.jButtonGuardarCambiosTablaParametroCartera.setVisible(this.isPermisoActualizarParametroCartera);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroCartera() {
		this.jInternalFrameDetalleFormParametroCartera.jButtonModificarParametroCartera.setVisible(this.isPermisoActualizarParametroCartera);	
		this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.setVisible(this.isPermisoActualizarParametroCartera);	
		this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.setVisible(this.isPermisoEliminarParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.setVisible(this.isVisibilidadCeldaCancelarParametroCartera);							
		this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.setVisible((this.isVisibilidadCeldaGuardarParametroCartera && this.isPermisoGuardarCambiosParametroCartera));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroCartera() {
		if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroCartera();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroCartera() {
	}
	
	public void jTableDatosParametroCarteraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroCartera(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametrocartera.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroCartera(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroCartera.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametrocartera.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_facturaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionfactura=true;

			idTienePermisotransaccionfactura=this.tienePermisosUsuarioEnPaginaWebParametroCartera(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionfactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.transaccionfacturaBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionfacturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionfacturaBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_transaccion_factura()!=null) {
					this.transaccionfacturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionfacturaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_transaccion_factura());
					this.transaccionfacturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionfacturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionfacturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionfacturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordertransaccionfactura=(TitledBorder)this.transaccionfacturaBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionfactura.setTitle(titledBorderParametroCartera.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_facturaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_transaccion_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_factura = "+this.parametrocartera.getid_transaccion_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_digitos_facturaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getnumero_digitos_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_digitos_factura = "+this.parametrocartera.getnumero_digitos_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonpor_lotesParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getpor_lotes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where por_lotes = "+this.parametrocartera.getpor_lotes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebParametroCartera(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderParametroCartera.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.parametrocartera.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_deshabilitaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransacciondeshabilita=true;

			idTienePermisotransacciondeshabilita=this.tienePermisosUsuarioEnPaginaWebParametroCartera(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransacciondeshabilita) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.transacciondeshabilitaBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transacciondeshabilitaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transacciondeshabilitaBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_transaccion_deshabilita()!=null) {
					this.transacciondeshabilitaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transacciondeshabilitaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_transaccion_deshabilita());
					this.transacciondeshabilitaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transacciondeshabilitaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transacciondeshabilitaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transacciondeshabilitaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordertransacciondeshabilita=(TitledBorder)this.transacciondeshabilitaBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransacciondeshabilita.setTitle(titledBorderParametroCartera.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_deshabilitaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_transaccion_deshabilita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_deshabilita = "+this.parametrocartera.getid_transaccion_deshabilita().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_transaccion_habilitaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotransaccionhabilita=true;

			idTienePermisotransaccionhabilita=this.tienePermisosUsuarioEnPaginaWebParametroCartera(TransaccionConstantesFunciones.CLASSNAME);

			if(idTienePermisotransaccionhabilita) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.transaccionhabilitaBeanSwingJInternalFrame=new TransaccionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.transaccionhabilitaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.transaccionhabilitaBeanSwingJInternalFrame.getTransaccionLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_transaccion_habilita()!=null) {
					this.transaccionhabilitaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.transaccionhabilitaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_transaccion_habilita());
					this.transaccionhabilitaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.transaccionhabilitaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.transaccionhabilitaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccion();
				}

				JInternalFrameBase jinternalFrame =this.transaccionhabilitaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordertransaccionhabilita=(TitledBorder)this.transaccionhabilitaBeanSwingJInternalFrame.jScrollPanelDatosTransaccion.getBorder();

				titledBordertransaccionhabilita.setTitle(titledBorderParametroCartera.getTitle() + " -> Transaccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_transaccion_habilitaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_transaccion_habilita()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_transaccion_habilita = "+this.parametrocartera.getid_transaccion_habilita().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_bodegaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisobodega=true;

			idTienePermisobodega=this.tienePermisosUsuarioEnPaginaWebParametroCartera(BodegaConstantesFunciones.CLASSNAME);

			if(idTienePermisobodega) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.bodegaBeanSwingJInternalFrame=new BodegaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.bodegaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.bodegaBeanSwingJInternalFrame.getBodegaLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_bodega()!=null) {
					this.bodegaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.bodegaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_bodega());
					this.bodegaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.bodegaBeanSwingJInternalFrame.inicializarActualizarBindingTablaBodega();
				}

				JInternalFrameBase jinternalFrame =this.bodegaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBorderbodega=(TitledBorder)this.bodegaBeanSwingJInternalFrame.jScrollPanelDatosBodega.getBorder();

				titledBorderbodega.setTitle(titledBorderParametroCartera.getTitle() + " -> Bodega");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_bodegaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_bodega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_bodega = "+this.parametrocartera.getid_bodega().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_facturaParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipofactura=true;

			idTienePermisotipofactura=this.tienePermisosUsuarioEnPaginaWebParametroCartera(TipoFacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.tipofacturaBeanSwingJInternalFrame=new TipoFacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipofacturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipofacturaBeanSwingJInternalFrame.getTipoFacturaLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_tipo_factura()!=null) {
					this.tipofacturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipofacturaBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_tipo_factura());
					this.tipofacturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipofacturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipofacturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFactura();
				}

				JInternalFrameBase jinternalFrame =this.tipofacturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordertipofactura=(TitledBorder)this.tipofacturaBeanSwingJInternalFrame.jScrollPanelDatosTipoFactura.getBorder();

				titledBordertipofactura.setTitle(titledBorderParametroCartera.getTitle() + " -> Tipo Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_facturaParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_factura = "+this.parametrocartera.getid_tipo_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_auto_pagoParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoautopago=true;

			idTienePermisotipoautopago=this.tienePermisosUsuarioEnPaginaWebParametroCartera(TipoAutoPagoConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoautopago) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.tipoautopagoBeanSwingJInternalFrame=new TipoAutoPagoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoautopagoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoautopagoBeanSwingJInternalFrame.getTipoAutoPagoLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_tipo_auto_pago()!=null) {
					this.tipoautopagoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoautopagoBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_tipo_auto_pago());
					this.tipoautopagoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoautopagoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoautopagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAutoPago();
				}

				JInternalFrameBase jinternalFrame =this.tipoautopagoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordertipoautopago=(TitledBorder)this.tipoautopagoBeanSwingJInternalFrame.jScrollPanelDatosTipoAutoPago.getBorder();

				titledBordertipoautopago.setTitle(titledBorderParametroCartera.getTitle() + " -> Tipo Auto Pago");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_auto_pagoParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_tipo_auto_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_auto_pago = "+this.parametrocartera.getid_tipo_auto_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_orden_pagoParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getnumero_orden_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_orden_pago like '%"+this.parametrocartera.getnumero_orden_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.cuentacontablecreditofiscalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.cuentacontablecreditofiscalBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.cuentacontablecreditofiscalBeanSwingJInternalFrame.sTipoBusqueda="CuentaContableCreditoFiscal";

			if(!this.sFinalQueryGeneral_cuentacontablecreditofiscal.equals("")) {
				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cuentacontablecreditofiscal);
				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.procesarBusqueda(this.cuentacontablecreditofiscalBeanSwingJInternalFrame.sAccionBusqueda);
				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.inicializarActualizarBindingCuentaContable(false);
			}

			if(!this.sFinalQueryComboCuentaContableCreditoFiscal.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.cuentacontablecreditofiscalBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderParametroCartera=null;
			TitledBorder titledBordercuentacontablecreditofiscal=null;

			if(!this.jScrollPanelDatosParametroCartera.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				titledBordercuentacontablecreditofiscal=(TitledBorder)this.cuentacontablecreditofiscalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecreditofiscal.setTitle(titledBorderParametroCartera.getTitle() + " -> Cuenta Contable");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocuentacontablecreditofiscal=true;

			idTienePermisocuentacontablecreditofiscal=this.tienePermisosUsuarioEnPaginaWebParametroCartera(CuentaContableConstantesFunciones.CLASSNAME);

			if(idTienePermisocuentacontablecreditofiscal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroCartera.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroCartera.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);

				this.cuentacontablecreditofiscalBeanSwingJInternalFrame=new CuentaContableBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cuentacontablecreditofiscalBeanSwingJInternalFrame.getCuentaContableLogic().setConnexion(this.parametrocarteraLogic.getConnexion());

				if(this.parametrocartera.getid_cuenta_contable_credito_fiscal()!=null) {
					this.cuentacontablecreditofiscalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cuentacontablecreditofiscalBeanSwingJInternalFrame.setIdActual(this.parametrocartera.getid_cuenta_contable_credito_fiscal());
					this.cuentacontablecreditofiscalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cuentacontablecreditofiscalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cuentacontablecreditofiscalBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContable();
				}

				JInternalFrameBase jinternalFrame =this.cuentacontablecreditofiscalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroCartera=(TitledBorder)this.jScrollPanelDatosParametroCartera.getBorder();
				TitledBorder titledBordercuentacontablecreditofiscal=(TitledBorder)this.cuentacontablecreditofiscalBeanSwingJInternalFrame.jScrollPanelDatosCuentaContable.getBorder();

				titledBordercuentacontablecreditofiscal.setTitle(titledBorderParametroCartera.getTitle() + " -> Cuenta Contable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getid_cuenta_contable_credito_fiscal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cuenta_contable_credito_fiscal = "+this.parametrocartera.getid_cuenta_contable_credito_fiscal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionParametroCarteraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.getparametrocartera(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametrocartera==null) {
						this.parametrocartera = new ParametroCartera();
					}

					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);
				}

				if(this.parametrocartera.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.parametrocartera.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroCartera(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdBodegaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdBodega();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCuentaContableCreditoFiscalParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdCuentaContableCreditoFiscal();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdEmpleado();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdEmpresa();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoAutoPagoParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdTipoAutoPago();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoFacturaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdTipoFactura();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionDeshabilitaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdTransaccionDeshabilita();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionFacturaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdTransaccionFactura();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTransaccionHabilitaParametroCarteraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroCartera(false,false);

			this.getParametroCarterasFK_IdTransaccionHabilita();

			this.inicializarActualizarBindingParametroCartera(false);

			//if(ParametroCarteraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroCartera(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametrocarteraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroCartera() {
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
			this.jInternalFrameDetalleFormParametroCartera.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroCartera.dispose();
			this.jInternalFrameDetalleFormParametroCartera=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
			this.jInternalFrameReporteDinamicoParametroCartera.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroCartera.dispose();
			this.jInternalFrameReporteDinamicoParametroCartera=null;
		}
		
		if(this.jInternalFrameImportacionParametroCartera!=null) {
			this.jInternalFrameImportacionParametroCartera.setVisible(false);	    			
			this.jInternalFrameImportacionParametroCartera.dispose();
			this.jInternalFrameImportacionParametroCartera=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroCartera();
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroCartera")) {
				jButtonDuplicarParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroCartera")) {
				jButtonCopiarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroCartera")) {
				jButtonVerFormParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroCartera")) {
				jButtonDuplicarParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroCartera")) {
				jButtonDuplicarParametroCarteraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroCartera")) {
				jButtonModificarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroCartera")) {
				jButtonModificarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroCartera")) {
				jButtonModificarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroCartera")) {
				jButtonActualizarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroCartera")) {
				jButtonActualizarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroCartera")) {
				jButtonActualizarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroCartera")) {
				jButtonEliminarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroCartera")) {
				jButtonEliminarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroCartera")) {
				jButtonEliminarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroCartera")) {
				jButtonCancelarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroCartera")) {
				jButtonCancelarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroCartera")) {
				jButtonCancelarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroCartera")) {
				jButtonCerrarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroCartera")) {
				jButtonCerrarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroCartera")) {
				jButtonCerrarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroCartera")) {
				jButtonMostrarOcultarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroCartera")) {
				jButtonCancelarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroCartera")) {
				jButtonCopiarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroCartera")) {
				jButtonVerFormParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroCartera")) {
				jButtonCopiarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroCartera")) {
				jButtonVerFormParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroCartera")) {
				jButtonRecargarInformacionParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroCartera")) {
				jButtonRecargarInformacionParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroCartera")) {
				jButtonRecargarInformacionParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroCartera")) {
				jButtonAnterioresParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroCartera")) {
				jButtonAnterioresParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroCartera")) {
				jButtonAnterioresParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroCartera")) {
				jButtonSiguientesParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroCartera")) {
				jButtonSiguientesParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroCartera")) {
				jButtonSiguientesParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroCartera") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroCartera")) {
				jButtonAbrirOrderByParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroCartera") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroCartera")) {
				jButtonMostrarOcultarParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroCartera")) {
				jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroCartera")) {
				jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroCartera")) {
				jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroCartera")) {
				jButtonCerrarReporteDinamicoParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroCartera")) {
				jButtonGenerarReporteDinamicoParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroCartera")) {
				
				jButtonGenerarExcelReporteDinamicoParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroCartera")) {
				jButtonCerrarImportacionParametroCarteraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroCartera")) {
				
				jButtonGenerarImportacionParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroCartera")) {
				
				jButtonAbrirImportacionParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroCartera")) {
				jComboBoxTiposAccionesParametroCarteraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroCartera")) {
				jComboBoxTiposRelacionesParametroCarteraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroCartera")) {
				jComboBoxTiposAccionesParametroCarteraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroCartera")) {
				
				jComboBoxTiposSeleccionarParametroCarteraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroCartera")) {
				jTextFieldValorCampoGeneralParametroCarteraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroCartera")) {
				jButtonAbrirOrderByParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroCartera")) {
				jButtonAbrirOrderByParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroCartera")) {
				jButtonCerrarOrderByParametroCarteraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroCarteraBusqueda")) {
				this.jButtonidParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroCarteraUpdate")) {
				this.jButtonid_empresaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroCarteraBusqueda")) {
				this.jButtonid_empresaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_facturaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_facturaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_facturaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitos_facturaParametroCarteraBusqueda")) {
				this.jButtonnumero_digitos_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("por_lotesParametroCarteraBusqueda")) {
				this.jButtonpor_lotesParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoParametroCarteraUpdate")) {
				this.jButtonid_empleadoParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoParametroCarteraBusqueda")) {
				this.jButtonid_empleadoParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_deshabilitaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_deshabilitaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_deshabilitaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_deshabilitaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_habilitaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_habilitaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_habilitaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_habilitaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroCarteraUpdate")) {
				this.jButtonid_bodegaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroCarteraBusqueda")) {
				this.jButtonid_bodegaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_facturaParametroCarteraUpdate")) {
				this.jButtonid_tipo_facturaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_facturaParametroCarteraBusqueda")) {
				this.jButtonid_tipo_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_auto_pagoParametroCarteraUpdate")) {
				this.jButtonid_tipo_auto_pagoParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_auto_pagoParametroCarteraBusqueda")) {
				this.jButtonid_tipo_auto_pagoParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_orden_pagoParametroCarteraBusqueda")) {
				this.jButtonnumero_orden_pagoParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCartera")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraArbol")) {
				this.abrirFrameTreeCuentaContableCreditoFiscal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraUpdate")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraBusqueda")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroCarteraBusqueda")) {
				this.jButtondescripcionParametroCarteraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCartera")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdBodegaParametroCartera")) {
				this.jButtonFK_IdBodegaParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdCuentaContableCreditoFiscalParametroCartera")) {
				this.jButtonFK_IdCuentaContableCreditoFiscalParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoParametroCartera")) {
				this.jButtonFK_IdEmpleadoParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoAutoPagoParametroCartera")) {
				this.jButtonFK_IdTipoAutoPagoParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoFacturaParametroCartera")) {
				this.jButtonFK_IdTipoFacturaParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionDeshabilitaParametroCartera")) {
				this.jButtonFK_IdTransaccionDeshabilitaParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionFacturaParametroCartera")) {
				this.jButtonFK_IdTransaccionFacturaParametroCarteraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTransaccionHabilitaParametroCartera")) {
				this.jButtonFK_IdTransaccionHabilitaParametroCarteraActionPerformed(evt);
			}
			
			;
			
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroCartera();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroCartera parametrocarteraLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametrocarteraLocal=this.parametrocartera;
			} else {
				parametrocarteraLocal=this.parametrocarteraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
							
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
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
			
			


			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
								
						
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
								
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
							
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
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
			
			


			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
								
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroCartera")) {
					jCheckBoxSeleccionarTodosParametroCarteraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroCartera")) {
					jCheckBoxSeleccionadosParametroCarteraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroCartera")) {
					
				}
				
				


				
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
												
				
				


				
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
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
			
			


			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroCarteraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametrocartera);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametrocartera);
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
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
				
				


				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroCartera.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroCartera.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroCarteraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametrocarteraAnterior =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroCartera")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroCarteraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroCartera.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametrocartera =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametrocartera =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametrocartera);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroCartera")) {
				
				}
				
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroCartera")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroCartera.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroCartera")) {
			
			}
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroCartera();
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			if(sTipo.equals("NuevoParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroCartera")) {
				jButtonDuplicarParametroCarteraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroCartera")) {
				jButtonCopiarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroCartera")) {
				jButtonVerFormParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroCartera")) {
				jButtonNuevoParametroCarteraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroCartera")) {
				jButtonModificarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroCartera")) {
				jButtonActualizarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroCartera")) {
				jButtonEliminarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroCartera")) {
				jButtonCancelarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroCartera")) {
				jButtonCerrarParametroCarteraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroCartera")) {
				jButtonGuardarCambiosParametroCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroCartera")) {
				jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroCartera")) {
				jButtonAbrirOrderByParametroCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroCartera")) {
				jButtonRecargarInformacionParametroCarteraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroCartera")) {
				jButtonAnterioresParametroCarteraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroCartera")) {
				jButtonSiguientesParametroCarteraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroCarteraBusqueda")) {
				this.jButtonidParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroCarteraUpdate")) {
				this.jButtonid_empresaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroCarteraBusqueda")) {
				this.jButtonid_empresaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_facturaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_facturaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_facturaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_digitos_facturaParametroCarteraBusqueda")) {
				this.jButtonnumero_digitos_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("por_lotesParametroCarteraBusqueda")) {
				this.jButtonpor_lotesParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoParametroCarteraUpdate")) {
				this.jButtonid_empleadoParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoParametroCarteraBusqueda")) {
				this.jButtonid_empleadoParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_deshabilitaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_deshabilitaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_deshabilitaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_deshabilitaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_transaccion_habilitaParametroCarteraUpdate")) {
				this.jButtonid_transaccion_habilitaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_transaccion_habilitaParametroCarteraBusqueda")) {
				this.jButtonid_transaccion_habilitaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_bodegaParametroCarteraUpdate")) {
				this.jButtonid_bodegaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_bodegaParametroCarteraBusqueda")) {
				this.jButtonid_bodegaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_facturaParametroCarteraUpdate")) {
				this.jButtonid_tipo_facturaParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_facturaParametroCarteraBusqueda")) {
				this.jButtonid_tipo_facturaParametroCarteraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_auto_pagoParametroCarteraUpdate")) {
				this.jButtonid_tipo_auto_pagoParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_auto_pagoParametroCarteraBusqueda")) {
				this.jButtonid_tipo_auto_pagoParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_orden_pagoParametroCarteraBusqueda")) {
				this.jButtonnumero_orden_pagoParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCartera")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraArbol")) {
				this.abrirFrameTreeCuentaContableCreditoFiscal("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraUpdate")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cuenta_contable_credito_fiscalParametroCarteraBusqueda")) {
				this.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroCarteraBusqueda")) {
				this.jButtondescripcionParametroCarteraBusquedaActionPerformed(evt);
			}
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroCartera();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroCartera")) {
				closingInternalFrameParametroCartera();
				
			} else if(sTipo.equals("jButtonCancelarParametroCartera")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroCartera = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroCarteraBeanSwingJInternalFrame jInternalFrameParent=(ParametroCarteraBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroCartera.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroCarteraActionPerformed(null);
			}
			
			ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametrocartera,new Object(),this.parametrocarteraParameterGeneral,this.parametrocarteraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroCartera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroCartera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroCartera(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametrocartera)) {
			if(!esControlTabla) {
				if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);			
				}
				
				if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroCartera(this.parametrocartera,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocarteraReturnGeneral=parametrocarteraLogic.procesarEventosParametroCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocarteraLogic.getParametroCarteras(),this.parametrocartera,this.parametrocarteraParameterGeneral,this.isEsNuevoParametroCartera,classes);//this.parametrocarteraLogic.getParametroCartera()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroCartera(this.parametrocarteraReturnGeneral,this.parametrocarteraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroCartera(classes,this.parametrocarteraReturnGeneral,this.parametrocarteraBean,false);
					}
						
					if(this.parametrocarteraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera());	
					}
						
					if(this.parametrocarteraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera(),classes);//this.parametrocarteraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroCartera(this.parametrocartera,classes);//this.parametrocarteraBean);									
				}
			
				if(ParametroCarteraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroCartera(this.parametrocartera,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroCartera(this.parametrocartera);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametrocarteraAnterior!=null) {
						this.parametrocartera=this.parametrocarteraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametrocarteraReturnGeneral=parametrocarteraLogic.procesarEventosParametroCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocarteraLogic.getParametroCarteras(),this.parametrocartera,this.parametrocarteraParameterGeneral,this.isEsNuevoParametroCartera,classes);//this.parametrocarteraLogic.getParametroCartera()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametrocarteraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametrocarteraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametrocarteraReturnGeneral.getParametroCartera(),parametrocarteraLogic.getParametroCarteras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametrocarteraReturnGeneral.getParametroCartera(),this.parametrocarteras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroCartera.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroCartera.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroCartera();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroCartera() throws Exception {
		
		ParametroCarteraModel parametrocarteraModel=(ParametroCarteraModel)this.jTableDatosParametroCartera.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametrocarteraModel.parametrocarteras=this.parametrocarteraLogic.getParametroCarteras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametrocarteraModel.parametrocarteras=this.parametrocarteras;
		}
		
		
		((ParametroCarteraModel) this.jTableDatosParametroCartera.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroCartera() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametrocarteraAnterior(),this.parametrocarteraLogic.getParametroCarteras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametrocarteraAnterior(),this.parametrocarteras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroCartera();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroCartera(ParametroCartera parametrocartera,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
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
										
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocartera,new Object(),generalEntityParameterGeneral,this.parametrocarteraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametrocarteraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroCarteraConstantesFunciones.getClassesRelationshipsOfParametroCartera(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroCarteraConstantesFunciones.getClassesRelationshipsFromStringsOfParametroCartera(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroCartera(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroCarteraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametrocartera,new Object(),generalEntityParameterGeneral,this.parametrocarteraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroCartera(ParametroCarteraBean parametrocarteraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroCartera(ArrayList<Classe> classes,ParametroCarteraReturnGeneral parametrocarteraReturnGeneral,ParametroCarteraBean parametrocarteraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroCartera(ParametroCartera parametrocartera,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametrocartera)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroCartera = new ParametroCarteraDetalleFormJInternalFrame(jDesktopPane,this.parametrocarteraSessionBean.getConGuardarRelaciones(),this.parametrocarteraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.setVisible(false);
		this.jInternalFrameDetalleFormParametroCartera.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroCartera.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroCartera.parametrocarteraLogic=this.parametrocarteraLogic;
		
		this.cargarCombosFrameForeignKeyParametroCartera("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroCartera();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroCartera();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroCartera("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroCartera();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroCartera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroCartera"));
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonModificarParametroCartera.addActionListener(new ButtonActionListener(this,"ModificarParametroCartera"));

		
		this.jInternalFrameDetalleFormParametroCartera.jButtonModificarToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroCartera"));
					
		this.jInternalFrameDetalleFormParametroCartera.jMenuItemModificarParametroCartera.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroCartera"));		
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.addActionListener (new ButtonActionListener(this,"ActualizarParametroCartera"));
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroCartera"));
						
		this.jInternalFrameDetalleFormParametroCartera.jMenuItemActualizarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroCartera"));		
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.addActionListener (new ButtonActionListener(this,"EliminarParametroCartera"));
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroCartera"));
								
		this.jInternalFrameDetalleFormParametroCartera.jMenuItemEliminarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroCartera"));		
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.addActionListener (new ButtonActionListener(this,"CancelarParametroCartera"));
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroCartera"));
					
		this.jInternalFrameDetalleFormParametroCartera.jMenuItemCancelarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroCartera"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jMenuItemDetalleCerrarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroCartera"));		
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroCartera"));
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroCartera"));
		
		
		
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroCartera"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonidParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_digitos_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitos_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonpor_lotesParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_orden_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_orden_pagoParametroCarteraBusqueda"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCartera"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCreditoFiscal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtondescripcionParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroCarteraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroCartera"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroCartera"));
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroCartera"));
		}
		
		this.jTableDatosParametroCartera.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroCartera"));
		
		this.jTableDatosParametroCartera.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroCartera"));
		
		this.jButtonNuevoParametroCartera.addActionListener(new ButtonActionListener(this,"NuevoParametroCartera"));
		
		this.jButtonDuplicarParametroCartera.addActionListener(new ButtonActionListener(this,"DuplicarParametroCartera"));
		
		this.jButtonCopiarParametroCartera.addActionListener(new ButtonActionListener(this,"CopiarParametroCartera"));
		
		this.jButtonVerFormParametroCartera.addActionListener(new ButtonActionListener(this,"VerFormParametroCartera"));
		
		
		this.jButtonNuevoToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroCartera"));
			
		this.jButtonDuplicarToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroCartera"));
			
		this.jMenuItemNuevoParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroCartera"));
			
		this.jMenuItemDuplicarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroCartera"));		
		
		
		this.jButtonNuevoRelacionesParametroCartera.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroCartera"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroCartera"));
			
		this.jMenuItemNuevoRelacionesParametroCartera.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroCartera"));		
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonModificarParametroCartera.addActionListener(new ButtonActionListener(this,"ModificarParametroCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonModificarToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroCartera"));
			
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemModificarParametroCartera.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarParametroCartera.addActionListener (new ButtonActionListener(this,"ActualizarParametroCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonActualizarToolBarParametroCartera.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroCartera"));
				
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemActualizarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarParametroCartera.addActionListener (new ButtonActionListener(this,"EliminarParametroCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonEliminarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroCartera"));
						
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemEliminarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarParametroCartera.addActionListener (new ButtonActionListener(this,"CancelarParametroCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonCancelarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroCartera"));
			
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemCancelarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroCartera"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroCartera"));		
		
		
		this.jButtonCerrarParametroCartera.addActionListener (new ButtonActionListener(this,"CerrarParametroCartera"));
		
		
		this.jButtonCerrarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroCartera"));
			
		this.jMenuItemCerrarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroCartera"));
			
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jMenuItemDetalleCerrarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroCartera"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroCartera"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroCartera"));
		}
		
		this.jButtonCopiarToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroCartera"));
			
		this.jButtonVerFormToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroCartera"));
		
		this.jMenuItemGuardarCambiosParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroCartera"));
			
		this.jMenuItemCopiarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroCartera"));		
		
		this.jMenuItemVerFormParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroCartera"));		
		
		
		this.jButtonGuardarCambiosTablaParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroCartera"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroCartera"));
			
		this.jMenuItemGuardarCambiosTablaParametroCartera.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroCartera"));		
		
		
		
		this.jButtonRecargarInformacionParametroCartera.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroCartera"));
					
		this.jButtonRecargarInformacionToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroCartera"));
		
		this.jMenuItemRecargarInformacionParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroCartera"));		
		
		
		
		this.jButtonAnterioresParametroCartera.addActionListener (new ButtonActionListener(this,"AnterioresParametroCartera"));
		
		
		this.jButtonAnterioresToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroCartera"));
		
		this.jMenuItemAnterioresParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroCartera"));		
		
		
		this.jButtonSiguientesParametroCartera.addActionListener (new ButtonActionListener(this,"SiguientesParametroCartera"));
		
		
		this.jButtonSiguientesToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroCartera"));
			
		this.jMenuItemSiguientesParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroCartera"));
			
		this.jMenuItemAbrirOrderByParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroCartera"));
			
		this.jMenuItemMostrarOcultarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroCartera"));
			
		this.jMenuItemDetalleAbrirOrderByParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroCartera"));
			
		this.jMenuItemDetalleMostarOcultarParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroCartera"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroCartera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroCartera"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroCartera"));
			
		this.jMenuItemNuevoGuardarCambiosParametroCartera.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroCartera"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroCartera.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroCartera"));

		this.jCheckBoxSeleccionadosParametroCartera.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroCartera"));
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroCartera"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroCartera.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroCartera"));
			
		this.jComboBoxTiposAccionesParametroCartera.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroCartera"));
					
		this.jComboBoxTiposSeleccionarParametroCartera.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroCartera"));
			
		this.jTextFieldValorCampoGeneralParametroCartera.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroCartera"));		
		
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonidParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_digitos_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitos_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonpor_lotesParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_orden_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_orden_pagoParametroCarteraBusqueda"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCartera"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCreditoFiscal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtondescripcionParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroCarteraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdBodegaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroCartera"));

			this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoFiscalParametroCartera"));

			this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCartera"));

			this.jButtonFK_IdEmpleadoParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoParametroCartera"));

			this.jButtonFK_IdTipoAutoPagoParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTipoAutoPagoParametroCartera"));

			this.jButtonFK_IdTipoFacturaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTipoFacturaParametroCartera"));

			this.jButtonFK_IdTransaccionDeshabilitaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionDeshabilitaParametroCartera"));

			this.jButtonFK_IdTransaccionFacturaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionFacturaParametroCartera"));

			this.jButtonFK_IdTransaccionHabilitaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionHabilitaParametroCartera"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroCartera!=null) {
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroCartera"));
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroCartera"));
				this.jInternalFrameReporteDinamicoParametroCartera.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroCartera"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroCartera.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroCartera"));				
			//this.jButtonGenerarReporteDinamicoParametroCartera.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroCartera"));
			//this.jButtonGenerarExcelReporteDinamicoParametroCartera.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroCartera"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroCartera!=null) {
				this.jInternalFrameImportacionParametroCartera.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroCartera"));
				this.jInternalFrameImportacionParametroCartera.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroCartera"));
				this.jInternalFrameImportacionParametroCartera.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroCartera"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroCartera.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroCartera"));
			
			this.jButtonAbrirOrderByToolBarParametroCartera.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroCartera"));			
			
			if(this.jInternalFrameOrderByParametroCartera!=null) {
				this.jInternalFrameOrderByParametroCartera.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroCartera"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroCartera!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroCartera.jTabbedPaneRelacionesParametroCartera.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroCartera"));
		
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
            		closingInternalFrameParametroCartera();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroCartera.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroCartera = (JInternalFrameBase)event.getSource();
	            	
	            ParametroCarteraBeanSwingJInternalFrame jInternalFrameParent=(ParametroCarteraBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroCartera.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroCarteraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroCartera.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroCarteraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroCartera.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroCartera.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroCartera";
		inputMap = this.jButtonNuevoParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroCarteraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroCarteraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroCartera";
		inputMap = this.jButtonNuevoRelacionesParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroCarteraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroCartera";
		inputMap = this.jButtonModificarParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroCartera";
		inputMap = this.jButtonActualizarParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroCartera";
		inputMap = this.jButtonEliminarParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroCartera";
		inputMap = this.jButtonCancelarParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroCartera";
		inputMap = this.jButtonCerrarParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroCartera";
		inputMap = this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroCartera.jButtonGuardarCambiosParametroCartera.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroCarteraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroCartera.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroCarteraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroCartera.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroCarteraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonidParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"idParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empresaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_digitos_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_digitos_facturaParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonpor_lotesParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"por_lotesParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_empleadoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_deshabilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_deshabilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_transaccion_habilitaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_transaccion_habilitaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_bodegaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_bodegaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_facturaParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_facturaParametroCarteraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_tipo_auto_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_auto_pagoParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonnumero_orden_pagoParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"numero_orden_pagoParametroCarteraBusqueda"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_cuenta_contable_credito_fiscalParametroCarteraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCartera.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCartera"));
		//jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeCuentaContableCreditoFiscal("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraArbol.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraUpdate.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCarteraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroCartera.jButtondescripcionParametroCarteraBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroCarteraBusqueda"));
		
		
		this.jButtonFK_IdBodegaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdBodegaParametroCartera"));

		this.jButtonFK_IdCuentaContableCreditoFiscalParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdCuentaContableCreditoFiscalParametroCartera"));

		this.jButtonBuscarFK_IdCuentaContableCreditoFiscalid_cuenta_contable_credito_fiscalParametroCartera.addActionListener(new ButtonActionListener(this,"id_cuenta_contable_credito_fiscalParametroCartera"));

		this.jButtonFK_IdEmpleadoParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoParametroCartera"));

		this.jButtonFK_IdTipoAutoPagoParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTipoAutoPagoParametroCartera"));

		this.jButtonFK_IdTipoFacturaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTipoFacturaParametroCartera"));

		this.jButtonFK_IdTransaccionDeshabilitaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionDeshabilitaParametroCartera"));

		this.jButtonFK_IdTransaccionFacturaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionFacturaParametroCartera"));

		this.jButtonFK_IdTransaccionHabilitaParametroCartera.addActionListener(new ButtonActionListener(this,"FK_IdTransaccionHabilitaParametroCartera"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroCartera.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroCarteraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroCarteraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroCartera.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroCartera(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
					parametrocarteraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroCartera parametrocarteraAux:parametrocarteras) {
					parametrocarteraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroCarteraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroCartera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
						parametrocarteraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroCartera parametrocarteraAux:parametrocarteras) {
						parametrocarteraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
					
						if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_PORLOTES)) {
							existe=true;
							parametrocarteraAux.setpor_lotes(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroCartera parametrocarteraAux:parametrocarteras) {
						
						if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_PORLOTES)) {
							existe=true;
							parametrocarteraAux.setpor_lotes(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroCartera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroCartera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroCartera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroCarteraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroCartera(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroCartera.getSelectedRows();
			
			ParametroCartera parametrocarteraLocal=new ParametroCartera();
			
			//this.seleccionarTodosParametroCartera(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametrocarteraLocal =(ParametroCartera) this.parametrocarteraLogic.getParametroCarteras().toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametrocarteraLocal =(ParametroCartera) this.parametrocarteras.toArray()[this.jTableDatosParametroCartera.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametrocarteraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
						parametrocarteraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroCartera parametrocarteraAux:parametrocarteras) {
						parametrocarteraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroCartera(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroCartera.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroCartera.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroCartera,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroCarteraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroCarteraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroCarteraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroCartera(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroCartera.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroCartera parametrocarteraAux:this.parametrocarteraLogic.getParametroCarteras()) {
				
						if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA)) {
							existe=true;
							parametrocarteraAux.setnumero_digitos_factura(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO)) {
							existe=true;
							parametrocarteraAux.setnumero_orden_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametrocarteraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroCartera parametrocarteraAux:parametrocarteras) {
					
						if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA)) {
							existe=true;
							parametrocarteraAux.setnumero_digitos_factura(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO)) {
							existe=true;
							parametrocarteraAux.setnumero_orden_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametrocarteraAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroCartera(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroCarteraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroCartera(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroCartera=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroCartera.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroCartera) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroCartera(conSplash);
				
					this.generarReporteParametroCarterasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroCarterasSeleccionados();
				//this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroCarterasSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroCarterasSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroCartera();
				
				this.exportarParametroCarterasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroCarteras();
				//this.importarParametroCarteras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroCartera();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroCarterasSeleccionados();
				//this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroCartera();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroCartera)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroCartera(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroCarteraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroCartera) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroCartera(conSplash);
					
						//this.actualizarParametrosGeneralParametroCartera();
						
						this.generarReporteProcesoAccionParametroCarterasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroCarteraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro CarteraS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Cartera", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroCartera();
				
						this.actualizarParametrosGeneralParametroCartera();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametrocarteraReturnGeneral=parametrocarteraLogic.procesarAccionParametroCarterasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametrocarteraLogic.getParametroCarteras(),this.parametrocarteraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroCarteraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroCartera();
					
					ParametroCarteraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroCarteraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroCartera.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroCartera.jComboBoxTiposAccionesFormularioParametroCartera.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroCartera(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroCarteraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroCartera();
			
			if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
			ParametroCartera parametrocartera=new ParametroCartera();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroCartera(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroCartera.getSelectedItem();
			
			
			
			
			parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametrocarterasSeleccionados.size()==1) {
				for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
					parametrocartera=parametrocarteraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroCartera();
			
      		//this.finishProcessParametroCartera(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroCarteraReturnGeneral() throws Exception {
		if(this.parametrocarteraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametrocarteraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametrocarteraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametrocarteraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametrocarteraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametrocarteraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroCartera(false);
		}
		
		if(this.parametrocarteraReturnGeneral.getConRetornoLista() || this.parametrocarteraReturnGeneral.getConRetornoObjeto()) {
			if(this.parametrocarteraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocarteraLogic.setParametroCarteras(this.parametrocarteraReturnGeneral.getParametroCarteras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametrocarteraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametrocarteraLogic.setParametroCartera(this.parametrocarteraReturnGeneral.getParametroCartera());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroCartera(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroCartera() throws Exception {
		
		
	}
	
	public ArrayList<ParametroCartera> getParametroCarterasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroCartera) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroCartera parametrocarteraAux:parametrocarteraLogic.getParametroCarteras()) {
					if(parametrocarteraAux.getIsSelected()) {
						parametrocarterasSeleccionados.add(parametrocarteraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroCartera parametrocarteraAux:this.parametrocarteras) {
					if(parametrocarteraAux.getIsSelected()) {
						parametrocarterasSeleccionados.add(parametrocarteraAux);				
					}
				}
			}
			
			if(parametrocarterasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametrocarterasSeleccionados.addAll(this.parametrocarteraLogic.getParametroCarteras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametrocarterasSeleccionados.addAll(this.parametrocarteras);				
					}
				}
			}
		} else {
			parametrocarterasSeleccionados.add(this.parametrocartera);
		}
		
		return parametrocarterasSeleccionados;
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
	
	public void generarReporteParametroCarterasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroCarterasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroCarterasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroCarterasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroCarterasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Cartera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroCarterasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroCartera();
		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroCartera();
		
		
		//this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados ,parametrocarteraImplementable,parametrocarteraImplementableHome);
	}
	
	public void mostrarImportacionParametroCarteras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroCartera();
		
		this.abrirFrameImportacionParametroCartera();		
		
			
		//this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados ,parametrocarteraImplementable,parametrocarteraImplementableHome);
	}
	
	public void importarParametroCarteras() throws Exception {		
	
	}
	
	public void exportarParametroCarterasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroCarterasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroCarterasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroCarterasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Cartera",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroCartera(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroCartera(parametrocarteraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametrocarteraAux.setsDetalleGeneralEntityReporte(parametrocarteraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroCartera(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_PORLOTES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDBODEGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroCartera(ParametroCartera parametrocartera,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametrocartera.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.gettransaccionfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getnumero_digitos_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getpor_lotes().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.gettransacciondeshabilita_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.gettransaccionhabilita_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getbodega_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.gettipofactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.gettipoautopago_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getnumero_orden_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getcuentacontablecreditofiscal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametrocartera.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroCarteras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroCartera(row);				
				iRow++;
			}				
			
			for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroCartera(parametrocarteraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroCarterasSeleccionados() throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();		
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametrocartera.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametrocarteras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametrocartera");
			//elementRoot.appendChild(element);
		
			for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
				element = document.createElement("parametrocartera");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroCartera(parametrocarteraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Cartera",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroCartera(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_PORLOTES);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroCartera(ParametroCartera parametrocartera,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.gettransaccionfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getnumero_digitos_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getpor_lotes());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.gettransacciondeshabilita_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.gettransaccionhabilita_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getbodega_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.gettipofactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.gettipoautopago_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getnumero_orden_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getcuentacontablecreditofiscal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametrocartera.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroCartera(ParametroCartera parametrocartera,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroCarteraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametrocartera.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroCarteraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametrocartera.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametrocartera.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtransaccionfactura_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDTRANSACCIONFACTURA);
		elementtransaccionfactura_descripcion.appendChild(document.createTextNode(parametrocartera.gettransaccionfactura_descripcion()));
		element.appendChild(elementtransaccionfactura_descripcion);

		Element elementnumero_digitos_factura = document.createElement(ParametroCarteraConstantesFunciones.NUMERODIGITOSFACTURA);
		elementnumero_digitos_factura.appendChild(document.createTextNode(parametrocartera.getnumero_digitos_factura().toString().trim()));
		element.appendChild(elementnumero_digitos_factura);

		Element elementpor_lotes = document.createElement(ParametroCarteraConstantesFunciones.PORLOTES);
		elementpor_lotes.appendChild(document.createTextNode(parametrocartera.getpor_lotes().toString().trim()));
		element.appendChild(elementpor_lotes);

		Element elementempleado_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(parametrocartera.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementtransacciondeshabilita_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDTRANSACCIONDESHABILITA);
		elementtransacciondeshabilita_descripcion.appendChild(document.createTextNode(parametrocartera.gettransacciondeshabilita_descripcion()));
		element.appendChild(elementtransacciondeshabilita_descripcion);

		Element elementtransaccionhabilita_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDTRANSACCIONHABILITA);
		elementtransaccionhabilita_descripcion.appendChild(document.createTextNode(parametrocartera.gettransaccionhabilita_descripcion()));
		element.appendChild(elementtransaccionhabilita_descripcion);

		Element elementbodega_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDBODEGA);
		elementbodega_descripcion.appendChild(document.createTextNode(parametrocartera.getbodega_descripcion()));
		element.appendChild(elementbodega_descripcion);

		Element elementtipofactura_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDTIPOFACTURA);
		elementtipofactura_descripcion.appendChild(document.createTextNode(parametrocartera.gettipofactura_descripcion()));
		element.appendChild(elementtipofactura_descripcion);

		Element elementtipoautopago_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDTIPOAUTOPAGO);
		elementtipoautopago_descripcion.appendChild(document.createTextNode(parametrocartera.gettipoautopago_descripcion()));
		element.appendChild(elementtipoautopago_descripcion);

		Element elementnumero_orden_pago = document.createElement(ParametroCarteraConstantesFunciones.NUMEROORDENPAGO);
		elementnumero_orden_pago.appendChild(document.createTextNode(parametrocartera.getnumero_orden_pago().trim()));
		element.appendChild(elementnumero_orden_pago);

		Element elementcuentacontablecreditofiscal_descripcion = document.createElement(ParametroCarteraConstantesFunciones.IDCUENTACONTABLECREDITOFISCAL);
		elementcuentacontablecreditofiscal_descripcion.appendChild(document.createTextNode(parametrocartera.getcuentacontablecreditofiscal_descripcion()));
		element.appendChild(elementcuentacontablecreditofiscal_descripcion);

		Element elementdescripcion = document.createElement(ParametroCarteraConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(parametrocartera.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoParametroCarterasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroCartera> parametrocarterasSeleccionados=new ArrayList<ParametroCartera>();
		
		parametrocarterasSeleccionados=this.getParametroCarterasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroCartera(parametrocarterasSeleccionados);
		
		this.generarReporteParametroCarteras("Todos",parametrocarterasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroCartera(ArrayList<ParametroCartera> parametrocarterasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroCartera parametrocarteraAux:parametrocarterasSeleccionados) {
				parametrocarteraAux.setsDetalleGeneralEntityReporte(parametrocarteraAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONFACTURA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.gettransaccionfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMERODIGITOSFACTURA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getnumero_digitos_factura().toString());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_PORLOTES)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(parametrocarteraAux.getpor_lotes()));
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONDESHABILITA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.gettransacciondeshabilita_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDTRANSACCIONHABILITA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.gettransaccionhabilita_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDBODEGA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getbodega_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDTIPOFACTURA)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.gettipofactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDTIPOAUTOPAGO)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.gettipoautopago_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_NUMEROORDENPAGO)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getnumero_orden_pago());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCAL)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getcuentacontablecreditofiscal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroCarteraConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					parametrocarteraAux.setsDescripcionGeneralEntityReporte1(parametrocarteraAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroCarteraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroCartera(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroCartera=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroCartera=true;
				this.isVisibilidadCeldaGuardarCambiosParametroCartera=true;
			}
			
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=true;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=true;
			this.isVisibilidadCeldaEliminarParametroCartera=true;
			this.isVisibilidadCeldaCancelarParametroCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=true;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=true;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=true;
			this.isVisibilidadCeldaModificarParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
			this.isVisibilidadCeldaModificarParametroCartera=true;
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
			this.isVisibilidadCeldaCancelarParametroCartera=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroCartera=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroCarteraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroCartera=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=true;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=true;
		} else {
			this.actualizarEstadoPanelsParametroCartera(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroCartera=false;
			//this.isVisibilidadCeldaVerFormParametroCartera=false;
			this.isVisibilidadCeldaDuplicarParametroCartera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametrocarteraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroCartera=false;
			this.isVisibilidadCeldaGuardarCambiosParametroCartera=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			if(!parametrocarteraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;												
			}
			
			this.jButtonCerrarParametroCartera.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroCartera=false;
		}
		
		if(!this.permiteMantenimiento(this.parametrocartera)) {
			this.isVisibilidadCeldaActualizarParametroCartera=false;
			this.isVisibilidadCeldaEliminarParametroCartera=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroCartera() {
	}
	
	public void actualizarEstadoPanelsParametroCartera(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroCartera!=null) {
				this.jScrollPanelDatosEdicionParametroCartera.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroCartera!=null) {
				this.jScrollPanelDatosParametroCartera.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroCartera!=null) {
				this.jPanelPaginacionParametroCartera.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroCartera!=null) {
					this.jTabbedPaneBusquedasParametroCartera.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametrocarteraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroCartera!=null) {
				this.jTabbedPaneBusquedasParametroCartera.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroCartera!=null) {
				this.jPanelParametrosReportesParametroCartera.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdBodega=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionFactura(Boolean isParaTransaccionFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionFacturaNegation=!isParaTransaccionFactura;

			this.isVisibilidadFK_IdBodega=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaTransaccionFactura;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaTransaccionFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdBodega=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionDeshabilita(Boolean isParaTransaccionDeshabilita){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionDeshabilitaNegation=!isParaTransaccionDeshabilita;

			this.isVisibilidadFK_IdBodega=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaTransaccionDeshabilita;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaTransaccionDeshabilitaNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTransaccionHabilita(Boolean isParaTransaccionHabilita){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTransaccionHabilitaNegation=!isParaTransaccionHabilita;

			this.isVisibilidadFK_IdBodega=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaTransaccionHabilitaNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaTransaccionHabilita;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaBodega(Boolean isParaBodega){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaBodegaNegation=!isParaBodega;

			this.isVisibilidadFK_IdBodega=isParaBodega;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaBodegaNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoFactura(Boolean isParaTipoFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoFacturaNegation=!isParaTipoFactura;

			this.isVisibilidadFK_IdBodega=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaTipoFactura;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaTipoFacturaNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoAutoPago(Boolean isParaTipoAutoPago){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoAutoPagoNegation=!isParaTipoAutoPago;

			this.isVisibilidadFK_IdBodega=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaTipoAutoPago;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaTipoAutoPagoNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}

	public void setVisibilidadBusquedasParaCuentaContableCreditoFiscal(Boolean isParaCuentaContableCreditoFiscal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCuentaContableCreditoFiscalNegation=!isParaCuentaContableCreditoFiscal;

			this.isVisibilidadFK_IdBodega=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdBodega) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdBodegaParametroCartera);}

			this.isVisibilidadFK_IdCuentaContableCreditoFiscal=isParaCuentaContableCreditoFiscal;
			if(!this.isVisibilidadFK_IdCuentaContableCreditoFiscal) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);}

			this.isVisibilidadFK_IdEmpleado=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdEmpleadoParametroCartera);}

			this.isVisibilidadFK_IdTipoAutoPago=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdTipoAutoPago) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoAutoPagoParametroCartera);}

			this.isVisibilidadFK_IdTipoFactura=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdTipoFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTipoFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionDeshabilita=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdTransaccionDeshabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionDeshabilitaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionFactura=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdTransaccionFactura) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionFacturaParametroCartera);}

			this.isVisibilidadFK_IdTransaccionHabilita=isParaCuentaContableCreditoFiscalNegation;
			if(!this.isVisibilidadFK_IdTransaccionHabilita) {this.jTabbedPaneBusquedasParametroCartera.remove(jPanelFK_IdTransaccionHabilitaParametroCartera);}
		}
		
	}
	
	
	
	

	public String registrarSesionParametroCarteraParaBusquedaCuentaContableCreditoFiscals() throws Exception {
		Boolean isPaginaPopupCuentaContable=false;

		try {

			if(parametrocarteraSessionBean==null) {
				parametrocarteraSessionBean=new ParametroCarteraSessionBean();
			}

			if(cuentacontablecreditofiscalSessionBean==null) {
				cuentacontablecreditofiscalSessionBean=new CuentaContableSessionBean();
			}

			cuentacontablecreditofiscalSessionBean.setsPathNavegacionActual(parametrocarteraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CuentaContableConstantesFunciones.SCLASSWEBTITULO);
			cuentacontablecreditofiscalSessionBean.setisPermiteRecargarInformacion(false);
			cuentacontablecreditofiscalSessionBean.setisPaginaPopup(true);
			isPaginaPopupCuentaContable=cuentacontablecreditofiscalSessionBean.getisPaginaPopup();
			cuentacontablecreditofiscalSessionBean.setisPaginaPopup(false);
			cuentacontablecreditofiscalSessionBean.setEstaModoBusqueda(true);
			cuentacontablecreditofiscalSessionBean.setsFuncionBusquedaRapida("window.opener.parametrocarteraFuncionGeneral.setCombosCodigoDesdeBusquedaid_cuenta_contable_credito_fiscal(TO_REPLACE);");
			cuentacontablecreditofiscalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCuentaContable(true);
			cuentacontablecreditofiscalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCuentaContable(ParametroCarteraConstantesFunciones.SNOMBREOPCION);
			//cuentacontableSessionBean.setisBusquedaDesdeForeignKeySesionParametroCartera(true);
			//cuentacontableSessionBean.setlidParametroCarteraActual(this.idParametroCarteraActual);

			parametrocarteraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyParametroCartera(true);
			parametrocarteraSessionBean.setlIdParametroCarteraActualForeignKey(this.idParametroCarteraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroCarteraSessionBean parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		
		if(this.parametrocarteraSessionBean==null) {
			this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		}
		
		this.parametrocarteraSessionBean.setsUltimaBusquedaParametroCartera(this.getsAccionBusqueda());
		this.parametrocarteraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametrocarteraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
			parametrocarteraSessionBean.setid_bodega(this.getid_bodegaFK_IdBodega());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCreditoFiscal")) {
			parametrocarteraSessionBean.setid_cuenta_contable_credito_fiscal(this.getid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			parametrocarteraSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametrocarteraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoAutoPago")) {
			parametrocarteraSessionBean.setid_tipo_auto_pago(this.getid_tipo_auto_pagoFK_IdTipoAutoPago());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoFactura")) {
			parametrocarteraSessionBean.setid_tipo_factura(this.getid_tipo_facturaFK_IdTipoFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionDeshabilita")) {
			parametrocarteraSessionBean.setid_transaccion_deshabilita(this.getid_transaccion_deshabilitaFK_IdTransaccionDeshabilita());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionFactura")) {
			parametrocarteraSessionBean.setid_transaccion_factura(this.getid_transaccion_facturaFK_IdTransaccionFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTransaccionHabilita")) {
			parametrocarteraSessionBean.setid_transaccion_habilita(this.getid_transaccion_habilitaFK_IdTransaccionHabilita());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroCarteraSessionBean parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		
		if(this.parametrocarteraSessionBean==null) {
			this.parametrocarteraSessionBean=new ParametroCarteraSessionBean();
		}
		
		if(this.parametrocarteraSessionBean.getsUltimaBusquedaParametroCartera()!=null&&!this.parametrocarteraSessionBean.getsUltimaBusquedaParametroCartera().equals("")) {
			this.setsAccionBusqueda(parametrocarteraSessionBean.getsUltimaBusquedaParametroCartera());
			this.setiNumeroPaginacion(parametrocarteraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametrocarteraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdBodega")) {
				this.setid_bodegaFK_IdBodega(parametrocarteraSessionBean.getid_bodega());
				parametrocarteraSessionBean.setid_bodega(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCuentaContableCreditoFiscal")) {
				this.setid_cuenta_contable_credito_fiscalFK_IdCuentaContableCreditoFiscal(parametrocarteraSessionBean.getid_cuenta_contable_credito_fiscal());
				parametrocarteraSessionBean.setid_cuenta_contable_credito_fiscal(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(parametrocarteraSessionBean.getid_empleado());
				parametrocarteraSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametrocarteraSessionBean.getid_empresa());
				parametrocarteraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoAutoPago")) {
				this.setid_tipo_auto_pagoFK_IdTipoAutoPago(parametrocarteraSessionBean.getid_tipo_auto_pago());
				parametrocarteraSessionBean.setid_tipo_auto_pago(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoFactura")) {
				this.setid_tipo_facturaFK_IdTipoFactura(parametrocarteraSessionBean.getid_tipo_factura());
				parametrocarteraSessionBean.setid_tipo_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionDeshabilita")) {
				this.setid_transaccion_deshabilitaFK_IdTransaccionDeshabilita(parametrocarteraSessionBean.getid_transaccion_deshabilita());
				parametrocarteraSessionBean.setid_transaccion_deshabilita(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionFactura")) {
				this.setid_transaccion_facturaFK_IdTransaccionFactura(parametrocarteraSessionBean.getid_transaccion_factura());
				parametrocarteraSessionBean.setid_transaccion_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTransaccionHabilita")) {
				this.setid_transaccion_habilitaFK_IdTransaccionHabilita(parametrocarteraSessionBean.getid_transaccion_habilita());
				parametrocarteraSessionBean.setid_transaccion_habilita(-1L);
			}
		}
		
		this.parametrocarteraSessionBean.setsUltimaBusquedaParametroCartera("");
		this.parametrocarteraSessionBean.setiNumeroPaginacion(ParametroCarteraConstantesFunciones.INUMEROPAGINACION);
		this.parametrocarteraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroCartera(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroCartera() {
		this.updateBorderResaltarBusquedasFormularioParametroCartera();
		this.updateVisibilidadBusquedasFormularioParametroCartera();
		this.updateHabilitarBusquedasFormularioParametroCartera();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroCartera() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroCartera.getComponents().length>0) {
	

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdBodegaParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdBodegaParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdBodegaParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdCuentaContableCreditoFiscalParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdCuentaContableCreditoFiscalParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdEmpleadoParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdEmpleadoParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdEmpleadoParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoAutoPagoParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoAutoPagoParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoAutoPagoParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoFacturaParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoFacturaParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoFacturaParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionDeshabilitaParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionDeshabilitaParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionDeshabilitaParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionFacturaParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionFacturaParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionFacturaParametroCartera);
			}
		}

		if(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionHabilitaParametroCartera!=null) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionHabilitaParametroCartera);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionHabilitaParametroCartera);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroCartera() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroCartera.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdBodegaParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdBodegaParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdBodegaParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdCuentaContableCreditoFiscalParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdCuentaContableCreditoFiscalParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdEmpleadoParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdEmpleadoParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdEmpleadoParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoAutoPagoParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdTipoAutoPagoParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdTipoAutoPagoParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoFacturaParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdTipoFacturaParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdTipoFacturaParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionDeshabilitaParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionDeshabilitaParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionDeshabilitaParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionFacturaParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionFacturaParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionFacturaParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionHabilitaParametroCartera);
			jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionHabilitaParametroCartera);
			if(!this.parametrocarteraConstantesFunciones.mostrarFK_IdTransaccionHabilitaParametroCartera && index>-1) {
				this.jTabbedPaneBusquedasParametroCartera.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroCartera() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroCartera.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdBodegaParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdBodegaParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdBodegaParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdCuentaContableCreditoFiscalParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdCuentaContableCreditoFiscalParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdEmpleadoParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdEmpleadoParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdEmpleadoParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoAutoPagoParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdTipoAutoPagoParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdTipoAutoPagoParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoFacturaParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdTipoFacturaParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdTipoFacturaParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionDeshabilitaParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionDeshabilitaParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionDeshabilitaParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionFacturaParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionFacturaParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionFacturaParametroCartera);
			}

			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionHabilitaParametroCartera);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionHabilitaParametroCartera);
				this.jTabbedPaneBusquedasParametroCartera.setEnabledAt(index,this.parametrocarteraConstantesFunciones.activarFK_IdTransaccionHabilitaParametroCartera);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroCartera(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdBodega")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdBodegaParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdBodegaParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdBodegaParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCuentaContableCreditoFiscal")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdCuentaContableCreditoFiscalParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdCuentaContableCreditoFiscalParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdCuentaContableCreditoFiscalParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdEmpleadoParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdEmpleadoParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdEmpleadoParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoAutoPago")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoAutoPagoParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdTipoAutoPagoParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoAutoPagoParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoFactura")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTipoFacturaParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdTipoFacturaParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTipoFacturaParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionDeshabilita")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionDeshabilitaParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdTransaccionDeshabilitaParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionDeshabilitaParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionFactura")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionFacturaParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdTransaccionFacturaParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionFacturaParametroCartera);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTransaccionHabilita")) {
			index= this.jTabbedPaneBusquedasParametroCartera.indexOfComponent(this.jPanelFK_IdTransaccionHabilitaParametroCartera);

			this.jTabbedPaneBusquedasParametroCartera.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasParametroCartera.getComponent(index);

			this.parametrocarteraConstantesFunciones.setResaltarFK_IdTransaccionHabilitaParametroCartera(resaltar);

			jPanel.setBorder(this.parametrocarteraConstantesFunciones.resaltarFK_IdTransaccionHabilitaParametroCartera);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarParametroCartera.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroCartera() throws Exception {

		if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroCartera();
		this.updateVisibilidadResaltarControlesFormularioParametroCartera();
		this.updateHabilitarResaltarControlesFormularioParametroCartera();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroCartera() throws Exception {
		if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametrocarteraConstantesFunciones.resaltaridParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltaridParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_empresaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_empresaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_facturaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_facturaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarnumero_digitos_facturaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarnumero_digitos_facturaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarpor_lotesParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setBorderPainted(true);this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarpor_lotesParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_empleadoParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_empleadoParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_deshabilitaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_deshabilitaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_habilitaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_transaccion_habilitaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_bodegaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_bodegaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_tipo_facturaParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_tipo_facturaParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_tipo_auto_pagoParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_tipo_auto_pagoParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarnumero_orden_pagoParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarnumero_orden_pagoParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltarid_cuenta_contable_credito_fiscalParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltarid_cuenta_contable_credito_fiscalParametroCartera);}
		if(this.parametrocarteraConstantesFunciones.resaltardescripcionParametroCartera!=null && this.jInternalFrameDetalleFormParametroCartera!=null) {this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setBorder(this.parametrocarteraConstantesFunciones.resaltardescripcionParametroCartera);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroCartera() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
	
		//this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostraridParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelidParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostraridParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_empresaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_empresaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_empresaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_transaccion_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_facturaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarnumero_digitos_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelnumero_digitos_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarnumero_digitos_facturaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarpor_lotesParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelpor_lotesParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarpor_lotesParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_empleadoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_empleadoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_empleadoParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_deshabilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_transaccion_deshabilitaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_deshabilitaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_habilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_transaccion_habilitaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_transaccion_habilitaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_bodegaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_bodegaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_bodegaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_tipo_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_tipo_facturaParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_tipo_facturaParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_tipo_auto_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_tipo_auto_pagoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_tipo_auto_pagoParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarnumero_orden_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelnumero_orden_pagoParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarnumero_orden_pagoParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_cuenta_contable_credito_fiscalParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPanelid_cuenta_contable_credito_fiscalParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_cuenta_contable_credito_fiscalParametroCartera);
			this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrarid_cuenta_contable_credito_fiscalParametroCartera);
		//this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrardescripcionParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jPaneldescripcionParametroCartera.setVisible(this.parametrocarteraConstantesFunciones.mostrardescripcionParametroCartera);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroCartera() throws Exception {
		if(this.jInternalFrameDetalleFormParametroCartera==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroCartera!=null) {
	
		this.jInternalFrameDetalleFormParametroCartera.jLabelidParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activaridParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empresaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_empresaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_facturaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_transaccion_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_digitos_facturaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarnumero_digitos_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jCheckBoxpor_lotesParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarpor_lotesParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_empleadoParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_empleadoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_deshabilitaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_transaccion_deshabilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_transaccion_habilitaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_transaccion_habilitaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_bodegaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_bodegaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_facturaParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_tipo_facturaParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_tipo_auto_pagoParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_tipo_auto_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jTextFieldnumero_orden_pagoParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarnumero_orden_pagoParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jComboBoxid_cuenta_contable_credito_fiscalParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_cuenta_contable_credito_fiscalParametroCartera);
			this.jInternalFrameDetalleFormParametroCartera.jButtonid_cuenta_contable_credito_fiscalParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activarid_cuenta_contable_credito_fiscalParametroCartera);
		this.jInternalFrameDetalleFormParametroCartera.jTextAreadescripcionParametroCartera.setEnabled(this.parametrocarteraConstantesFunciones.activardescripcionParametroCartera);
		}
	}
	
		
}